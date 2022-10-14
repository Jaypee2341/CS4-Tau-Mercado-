import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList<>();

  public Store(String name){
    this.name = name;
    earnings = 0;
    itemList = new ArrayList<>();
    storeList.add(this);
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    if (index < itemList.size()){
      earnings += itemList.get(index).getCost();
      System.out.printf("\n%s sold %s and gained %.2f.", this.name, itemList.get(index).getName(), itemList.get(index).getCost());
    }
    else{
      System.out.printf("\nThere are only %d items in %s.", itemList.size(), this.name);
    }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(String name){
    boolean foundItem = false;
    int index = 0;
    for (int a = 0; a < itemList.size(); a++){
      if (itemList.get(a).getName().equals(name)){
        foundItem = true;
        index = a;
        break;
      }
    }
    if (foundItem == true){
      System.out.printf("\n%s sold %s and gained %.2f.", this.name, itemList.get(index).getName(), itemList.get(index).getCost());
      earnings += itemList.get(index).getCost();
    }
    else {
      System.out.printf("\n%s doesn't sell %s.",this.name, name);
    }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
    int index = 0;
    if (itemList.contains(i)){
      index = itemList.indexOf(i);
      earnings += itemList.get(index).getCost();
      System.out.printf("\n%s sold %s and gained %.2f.", this.name, itemList.get(index).getName(), itemList.get(index).getCost());
    }
    else{
      System.out.printf("\n%s doesn't sell %s.",this.name, i.getName());
    }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void addItem(Item i){
    itemList.add(i);
    // add Item i to store's itemList
  }
  public void filterType(String type){
    System.out.printf("\nThe %s-type items are: ", type);
    for(Item i : itemList){
      if(i.getType().equals(type)){
        System.out.print(i.getName() + ", ");
      }
    }
    // loop over itemList and print all items with the specified type
  }
  public void filterCheap(double maxCost){
    System.out.println("\nThe cheap items are: ");
    for(Item i : itemList){
      if(i.getCost()<= maxCost){
        System.out.print(i.getName() + ", ");
      }
    }
    // loop over itemList and print all items with a cost lower than or equal to the specified value
  }
  public void filterExpensive(double minCost){
    System.out.println("\nThe expensive items are: ");
    for(Item i : itemList){
      if(i.getCost() >= minCost){
        System.out.print(i.getName() + ", ");
      }
    }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    for(Store i : storeList){
      System.out.printf("\n%s earnings: %.2f", i.getName(), i.getEarnings());
    }
    // loop over storeList and print the name and the earnings'Store.java'

  }
}
