public class Store {
    private int product = 0;
    public synchronized void get(){
        while (product < 1){
            try{
                wait();
            } catch (InterruptedException e){
        }
    }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("На складе имеется " + product + " товаров");
        notify();
    }
    public synchronized void put(){
    while(product >= 8){
        try{
            wait();
        } catch (InterruptedException e){
        }
    }
    product++;
        System.out.println("Производитель поставил 1 товар");
        System.out.println("На складе имеется " + product + " товаров");
        notify();
    }
}
