// class to represent a grocery item
public class GroceryItem {
  
  public GroceryItem(String name, int quantity, double PricePerUnit) { 
    //Create an array of the item's name, quantity, and price per unit.
    int[] itemorderarray;
    itemorderarray = new int[3];
    
    public GroceryItem = new GroceryItem[3];
    public String name;
    public int quantity;
    public double PricePerUnit;
    
    public double getCost() {
      //Find the cost of the grocery item at its quantity and price per unit
      double totalcost = quantity*PricePerUnit;
      return totalcost;
    }
    
    public void setQuantity(int quantity) {
      //Set the quantity for some reason?????
    }
    
    public String toString() {
      String sgroceryitem = (quantity + " " + name + "s @ $" + PricePerUnit + " = $" + totalcost);
      return sgroceryitem;
    }
  }
}
