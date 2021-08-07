// OOP MINI PRJECT
//JAMEE SHAHRIYAR (A18CS3012)


import java.util.Scanner;

// use of generic class

// & stands for implementation of interface

public class Lists<T   extends Func > {
    private T[] t;
    private int  num;

    @SuppressWarnings("unchecked")
    public Lists() {

        // this is used to generate an array of classes
        //The java.lang.reflect.Array.newInstance(Class<?> componentType, int... dimensions) method creates a new array with the specified component type and dimensions
        this.t =  (T[]) java.lang.reflect.Array.newInstance(Item.class, 50);
        num=0;
    }






    public void addPreExisting(T t) {
        this.t[num++] = t;
    }

    public void addNew(T newT) {

        t[num]  =newT;
        t[num].productReg();
        num++;
    }

    public void printList(String output,String output2) {

        System.out.println(output);

        for (int i = 0; i < num; i++) {
            System.out.println(output2 + (i+1));
            this.t[i].printOut();
        }
    }


    public T choice(String ch) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ch);


        int choice = 0;

        // Use of Exception
        boolean validfInput = false;
        int value3 = 0;
        do{

            try{
                value3 = Integer.parseInt(sc.nextLine());
                validfInput = true;

            }catch(IllegalArgumentException e){
                System.out.println("This field requires you to input a number. Thank you.Try again => ");
            }
        }while(!validfInput);

        choice=value3;



        return this.t[choice -1];
    }

}