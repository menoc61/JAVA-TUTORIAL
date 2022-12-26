package importantJava.java_tutorial;

public class Invoice {
    String number;
    String description;
    int qty_item;
    private double price;
    Invoice(String number, String description,int qty_item,double price ){
        this.number = number;
        this.description = description;
        this.qty_item = qty_item;
        this.price = price;
    }
    //Create the getters methods.
    public String getNumber() {
        return number;
    }
    public String getDescription() {
        return description;
    }
    public int getQty_item() {
        return qty_item;
    }
    public double getPrice() {
        return price;
    }
    //Create the setters methods.
    public void setNumber(String number) {
        this.number = number;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setQty_item(int qty_item) {
        this.qty_item = qty_item;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Double InvoiceAmount() {
        if (qty_item<0)  qty_item = 0;
    double invoiceAmount = qty_item*price;
    return invoiceAmount;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("0", "Item", 0, 0);
        invoice.setNumber("1");
        invoice.setDescription("Item #1");
        invoice.setQty_item(3);
        invoice.setPrice(9000);
        System.out.println("Invoice item number : "+invoice.getNumber());
        System.out.println("Invoice item description : "+invoice.getDescription());
        System.out.println("Invoice item quatity : "+invoice.getQty_item());
        System.out.println("Invoice item price: "+invoice.getPrice());
        System.out.println("The total amount per item : "+invoice.InvoiceAmount());
    }

}
