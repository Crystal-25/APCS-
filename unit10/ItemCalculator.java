import java.util.*;
public class ItemCalculator{
  public static void printAllItems(ArrayList<Item> aList){ //method
    for(int i = 0; i < aList.size(); i++){
      Item it = aList.get(i); //.get returns the value of the variable name
      String n = it.getName();
      //contains the obj name
      float p = it.getPrice();
      //contain obj price
      System.out.println(n + " " + p);
    }
  }
  public static void main(String[] args){ //testing purposes
      /*ArrayList<Item> itemList = new ArrayList<Item>();
      Item i1 = new Item("milk", 3.50f); //item 1
      Item i2 = new Item("eggs", 7.75f); //item 2
      //adds item to the arraylist to make sure they are stored in it
      itemList.add(i1);
      itemList.add(i2);
      ItemCalculator itemC = new ItemCalculator(); //allows us to access methods
      itemC.printAllItems(itemList);
      float ave = itemC.averagePriceItems(itemList);
      System.out.println(ave);
      String eItem = itemC.nameExpensiveItem(itemList);
      System.out.println(eItem); */

      ArrayList<Item> items = new ArrayList<Item>();
      Item i1 = new Item("apple", (float)3.50);
      items.add(i1);
      Item i2 = new Item("grape", 5);
      items.add(i2);
      Item i3 = new Item("milk", 10);
      items.add(i3);

      System.out.println("items: ");
        printAllItems(items);
      System.out.println();
      System.out.println("avg Price: " + averagePriceItems(items));
      System.out.println("most expensive: " + nameExpensiveItem(items));

  }
  public static float averagePriceItems(ArrayList<Item> aList){
    float sum = 0;

    for(int i = 0; i<aList.size(); i++){

      Item it = aList.get(i);
      float p = it.getPrice();

      sum += p;
    }
    float average = sum / aList.size();

    return average;
    }
    public static String nameExpensiveItem(ArrayList<Item> aList){

      Item first = aList.get(0);

      float maxPrice = first.getPrice();
      String maxName = first.getName();

      for(int i = 1; i<aList.size(); i++){
        Item it = aList.get(i);

        String n = it.getName();

        float p = it.getPrice();

        if(p>maxPrice){
          maxPrice = p;
          maxName = n;

        }
      }
      return maxName;
    }
  }
  //for([object name] [name that you want to call the item] : [arraylist name])
