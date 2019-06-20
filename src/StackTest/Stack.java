package StackTest;

public class Stack {
    int quantity;
    Node inicio;

    public Stack() {}

    public void push(String data){
        Node newData = new Node(data, null);
        if (isEmpty()){
            inicio = newData;
        } else {
            newData.setNext(inicio);
            inicio = newData;
        }
        quantity++;
    }

    public void pop(){
        Node route = inicio;
        if (isEmpty()){
            System.out.println("It is empty");
        }else if(inicio.getNext() == null){
            inicio = null;
        }else {
            inicio = inicio.getNext();
            route.setNext(null);
        }
        quantity--;
    }

    public void printStack(){
        Node route = inicio;
        while (route  != null){
            System.out.println(route.getData());
            route = route.getNext();
        }
    }

    public boolean isEmpty(){
        return (inicio == null);
    }

    public int getQuantity() {
        return quantity;
    }
}
