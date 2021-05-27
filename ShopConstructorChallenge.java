class Product
{
	private int item_num; 
	String name; 
	private double cost;
	int qty;
	
	int getItem() {
		return item_num;
	}
	
	void setItem(int i) {
		this.item_num = i;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String n) {
		this.name=n;
	}
	
	double getCost() {
		return cost;
	}
	
	
	int getQty() {
		return qty;
	}
	
	void setQty(int q) {
		this.qty = q;
	}
	
	public double sell() {
		return this.cost=item_num*qty;
	}
	
	public Product(int item,int quantity) {
		
		this.item_num = item;
		this.qty = quantity;
		sell();
	}
}

class Customer{
	
	int customerid;
	String name;
	String address;
	private int phone;

	int getId(){
		return customerid;
	}
	
	void setId(int id) {
		this.customerid = id;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String n) {
		this.name = n;
	}
	
	String getAdd() {
		return address;
	}
	
	void setAdd(String add) {
		this.address = add;
	}
	
	int getPh() {
		return phone;
	}
	
	void setPh(int p) {
		this.phone = p;
	}
	
	public void deliver() {
		System.out.println("Item delivered to the Customer");
	}
	
	public Customer(int i,String n,String a) {
		this.setId(i);
		this.setName(n);
		this.setAdd(a);
		deliver();
	}	
}
public class ShopConstructorChallenge {

	public static void main(String[] args) {
	Product p = new Product(5,10);
	Customer c = new Customer(1,"Rahul","Khanda Colony");
	System.out.println("Customer Name: "+c.getName());
	System.out.println("Customer Address: "+c.getAdd());
	System.out.println("Total cost: "+p.sell());
	}

}
