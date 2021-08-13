/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastr;

/**
 *
 * @author anand bhai
 */
import java.util.*;
public class stack1<Item> {
    // Stack Using Linked List

    private class node
    {
        node point;
        Item value;
    }
    // node head = null; 
    // 
  node head=null; 
    void push(Item item)
    { 
        node x=new node();
        x.value=item; x.point=null;
        if(head==null){head=x;}
        else {x.point=head; head=x;} }

    Item pop()
    {   
       if(head!=null )
        {Item item=head.value;
        //a.point=null;
        head=head.point;
        return item;}
        else {System.out.println("Empty"); return null;}
    }
       void display()
       { node t=head;
           while(t!=null){
               System.out.println("value ="+t.value);
               t=t.point;
           }
       }
    
    public static void main(String[] args) throws Exception { 
       Scanner s = new Scanner(System.in);
       String t = new String();
       stack1<String> c = new stack1<String>();
       
       int u=1;
       /* sarvesh patel 1861042 push pop display exit cat zat mat */
       while(u!=0)
      { System.out.println("1 push 2 pop 3 display 4 exit");
       int v = s.nextInt();
          switch (v){
       case 1:  System.out.println("Enter the value to push");
                  t =s.next();
                 c.push(t); break;
        case 2:          
                     t=c.pop();
                     System.out.println("pop="+t); break;
        case 3:   System.out.println("display"); 
                    c.display(); break;        
        case 4:   u=0;break;                
    }}}
}

