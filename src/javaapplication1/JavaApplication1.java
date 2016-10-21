/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Konstantinos
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World\n");
        classA obj=new classA();
        obj.a=1;
        obj.b=12.3f;
        System.out.println(obj.a+"\n"+obj.b+"\n");
        obj.setA(2);
        obj.setB(15.23f);
        System.out.println(obj.getA()+"\n"+obj.getB()+"\n");
        
        
    }
    
}

 class classA{
    int a;
    float b;
    
     int getA(){
        return a;
    }
     float getB(){
        return b;
    }
     
     void setA(int x){
        a=x;
    }
     void setB(float x){
        b=x;
    }
}