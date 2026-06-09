import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import com.mongodb.client.*;
import org.bson.Document;
import java.util.ArrayList;

public class Main {

    static MongoClient client = MongoClients.create("mongodb://localhost:27017");
    static MongoDatabase db = client.getDatabase("EcommerceDB");

    static MongoCollection<Document> customers = db.getCollection("customers");
    static MongoCollection<Document> products = db.getCollection("products");
    static MongoCollection<Document> cart = db.getCollection("cart");
    static MongoCollection<Document> orders = db.getCollection("orders");

    public static void main(String[] args) {
        showLogin();
    }

    // ================= LOGIN =================
    static void showLogin() {

        JFrame login = new JFrame("E-Commerce Login");
        login.setSize(320, 200);
        login.setLayout(new GridLayout(2, 1));
        login.getContentPane().setBackground(new Color(245, 245, 245));
        login.setLocationRelativeTo(null);

        JButton admin = new JButton("Admin Login");
        JButton customer = new JButton("Customer Login");

        styleButton(admin, new Color(173, 216, 230));
        styleButton(customer, new Color(198, 239, 206));

        login.add(admin);
        login.add(customer);

        admin.addActionListener(e -> {
            login.dispose();
            showAdminPanel();
        });

        customer.addActionListener(e -> {
            login.dispose();
            showCustomerPanel();
        });

        login.setVisible(true);
    }

    // ================= ADMIN PANEL =================
    static void showAdminPanel() {

        JFrame admin = new JFrame("Admin Panel");
        admin.setSize(420, 420);
        admin.setLayout(new GridLayout(4, 1));
        admin.getContentPane().setBackground(new Color(245, 245, 245));
        admin.setLocationRelativeTo(null);

        JButton addProduct = new JButton("Add Product");
        JButton viewOrders = new JButton("View Orders");
        JButton searchProduct = new JButton("Search Product");
        JButton logout = new JButton("Logout");

        styleButton(addProduct, new Color(173, 216, 230));
        styleButton(viewOrders, new Color(198, 239, 206));
        styleButton(searchProduct, new Color(224, 224, 224));
        styleButton(logout, new Color(255, 205, 210));

        admin.add(addProduct);
        admin.add(viewOrders);
        admin.add(searchProduct);
        admin.add(logout);

        // ADD PRODUCT
        addProduct.addActionListener(e -> {

            String name = JOptionPane.showInputDialog("Product Name:");
            String category = JOptionPane.showInputDialog("Category:");
            int price = Integer.parseInt(JOptionPane.showInputDialog("Price:"));
            int stock = Integer.parseInt(JOptionPane.showInputDialog("Stock:"));

            products.insertOne(new Document("name", name)
                    .append("category", category)
                    .append("price", price)
                    .append("stock", stock));

            JOptionPane.showMessageDialog(admin, "Product Added!");
        });

        // VIEW ORDERS (FIXED SAFE VERSION)
        viewOrders.addActionListener(e -> {

            JFrame f = new JFrame("Orders");
            f.setSize(750, 320);
            f.setLocationRelativeTo(null);

            String[] cols = {"Customer", "Product", "Qty", "Total", "Status"};
            DefaultTableModel model = new DefaultTableModel(cols, 0);

            for (Document d : orders.find()) {

                String customer = safeString(d, "customerName");
                String product = safeString(d, "productName");
                int qty = safeInt(d, "quantity");
                int total = safeInt(d, "total");
                String status = safeString(d, "status");

                model.addRow(new Object[]{
                        customer,
                        product,
                        qty,
                        total,
                        status
                });
            }

            JTable table = new JTable(model);
            styleTable(table);

            f.add(new JScrollPane(table));
            f.setVisible(true);
        });

        // SEARCH PRODUCT
        searchProduct.addActionListener(e -> {

            String name = JOptionPane.showInputDialog("Enter Product Name:");
            Document p = products.find(new Document("name", name)).first();

            if (p != null)
                JOptionPane.showMessageDialog(admin, p.toJson());
            else
                JOptionPane.showMessageDialog(admin, "Product Not Found!");
        });

        logout.addActionListener(e -> {
            admin.dispose();
            showLogin();
        });

        admin.setVisible(true);
    }

    // ================= CUSTOMER PANEL =================
    static void showCustomerPanel() {

        JFrame c = new JFrame("Customer Panel");
        c.setSize(500, 450);
        c.setLayout(new GridLayout(6, 1));
        c.getContentPane().setBackground(new Color(245, 245, 245));
        c.setLocationRelativeTo(null);

        JButton addCustomer = new JButton("Add Customer");
        JButton viewProducts = new JButton("View Products");
        JButton addCart = new JButton("Add to Cart");
        JButton viewCart = new JButton("View Cart");
        JButton placeOrder = new JButton("Place Order");
        JButton logout = new JButton("Logout");

        styleButton(addCustomer, new Color(173, 216, 230));
        styleButton(viewProducts, new Color(198, 239, 206));
        styleButton(addCart, new Color(255, 249, 196));
        styleButton(viewCart, new Color(224, 224, 224));
        styleButton(placeOrder, new Color(255, 205, 210));
        styleButton(logout, new Color(224, 224, 224));

        c.add(addCustomer);
        c.add(viewProducts);
        c.add(addCart);
        c.add(viewCart);
        c.add(placeOrder);
        c.add(logout);

        // ADD CUSTOMER
        addCustomer.addActionListener(e -> {

            String name = JOptionPane.showInputDialog("Name:");
            String email = JOptionPane.showInputDialog("Email:");

            customers.insertOne(new Document("name", name)
                    .append("email", email));

            JOptionPane.showMessageDialog(c, "Customer Added!");
        });

        // VIEW PRODUCTS
        viewProducts.addActionListener(e -> {

            JFrame f = new JFrame("Products");
            f.setSize(600, 300);
            f.setLocationRelativeTo(null);

            String[] cols = {"Name", "Category", "Price", "Stock"};
            DefaultTableModel model = new DefaultTableModel(cols, 0);

            for (Document d : products.find()) {
                model.addRow(new Object[]{
                        safeString(d, "name"),
                        safeString(d, "category"),
                        safeInt(d, "price"),
                        safeInt(d, "stock")
                });
            }

            JTable table = new JTable(model);
            styleTable(table);

            f.add(new JScrollPane(table));
            f.setVisible(true);
        });

        // ADD TO CART
        addCart.addActionListener(e -> {

            String customerName = JOptionPane.showInputDialog("Customer Name:");

            ArrayList<String> list = new ArrayList<>();
            for (Document d : products.find()) {
                list.add(d.getString("name"));
            }

            String product = (String) JOptionPane.showInputDialog(
                    c,
                    "Select Product:",
                    "Products",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    list.toArray(),
                    list.get(0)
            );

            int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));

            Document p = products.find(new Document("name", product)).first();

            int price = safeInt(p, "price");
            int total = price * qty;

            cart.insertOne(new Document("customerName", customerName)
                    .append("productName", product)
                    .append("quantity", qty)
                    .append("total", total));

            JOptionPane.showMessageDialog(c, "Added to Cart! Total: " + total);
        });

        // VIEW CART
        viewCart.addActionListener(e -> {

            JFrame f = new JFrame("Cart");
            f.setSize(600, 300);
            f.setLocationRelativeTo(null);

            String[] cols = {"Customer", "Product", "Qty", "Total"};
            DefaultTableModel model = new DefaultTableModel(cols, 0);

            for (Document d : cart.find()) {
                model.addRow(new Object[]{
                        safeString(d, "customerName"),
                        safeString(d, "productName"),
                        safeInt(d, "quantity"),
                        safeInt(d, "total")
                });
            }

            JTable table = new JTable(model);
            styleTable(table);

            f.add(new JScrollPane(table));
            f.setVisible(true);
        });

        // PLACE ORDER
        placeOrder.addActionListener(e -> {

            String customerName = JOptionPane.showInputDialog("Customer Name:");

            ArrayList<String> list = new ArrayList<>();
            for (Document d : products.find()) {
                list.add(d.getString("name"));
            }

            String product = (String) JOptionPane.showInputDialog(
                    c,
                    "Select Product:",
                    "Products",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    list.toArray(),
                    list.get(0)
            );

            int qty = Integer.parseInt(JOptionPane.showInputDialog("Quantity:"));

            Document p = products.find(new Document("name", product)).first();

            int price = safeInt(p, "price");
            int stock = safeInt(p, "stock");
            int total = price * qty;

            products.updateOne(
                    new Document("name", product),
                    new Document("$set", new Document("stock", stock - qty))
            );

            orders.insertOne(new Document("customerName", customerName)
                    .append("productName", product)
                    .append("quantity", qty)
                    .append("total", total)
                    .append("status", "Confirmed"));

            JOptionPane.showMessageDialog(c,
                    "===== RECEIPT =====\n" +
                            "Customer: " + customerName + "\n" +
                            "Product: " + product + "\n" +
                            "Qty: " + qty + "\n" +
                            "Total: " + total + "\n" +
                            "Status: Confirmed");
        });

        logout.addActionListener(e -> {
            c.dispose();
            showLogin();
        });

        c.setVisible(true);
    }

    // ================= HELPERS =================
    static void styleButton(JButton btn, Color color) {
        btn.setBackground(color);
        btn.setForeground(Color.BLACK);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.PLAIN, 14));
    }

    static void styleTable(JTable table) {
        table.setRowHeight(22);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        table.setGridColor(Color.LIGHT_GRAY);
    }

    static String safeString(Document d, String key) {
        Object val = d.get(key);
        return val == null ? "" : val.toString();
    }

    static int safeInt(Document d, String key) {
        Object val = d.get(key);
        if (val == null) return 0;
        try {
            return Integer.parseInt(val.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}