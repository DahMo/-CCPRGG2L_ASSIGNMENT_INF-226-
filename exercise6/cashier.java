public class cashier {


    int price;


    public void checkout(groceryitem item){
        System.out.println("dinampot mo:  " + item.name);
    }

    public void showItemPrice(groceryitem item){
        System.out.println("ginastos mo: " + item.price);
    }

    public void showitemprice(groceryitem item){
        System.out.println("total price: " +  item.price);
    }
}
