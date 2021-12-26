package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    private int add(int a, int b){
        return a+b;
    }

    private int muliti(int a, int b){
        return a*b;
    }

    private void hello(String name){
        System.out.println("hello:"+name);
    }

    private double random(){
        return Math.random();
    }

    private int sbu(int a, int b){
        return a-b;
    }
}
