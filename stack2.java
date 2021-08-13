/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastr;

import java.util.Scanner;

/**
 *
 * @author anand bhai
 */
// STACK USING ARRAYS(resizing)
public class stack2<Item> {
   Item[] arr;
int top=-1;
    public stack2(int n) {
        arr = (Item[]) new String[n];
    }
    void push(Item s)
    { if(top==arr.length-1)
       { resize(2*arr.length);
       }
      arr[++top]=s;
    }
    Item pop()
    { if(top==-1) {System.out.println("Empty"); return null;}
        if(top==(arr.length/4))
      { resize(arr.length/2);
      } int b =top;
        Item x=arr[top--];
        arr[b]=null;
        return x;
      
    }
    void resize(int a)
    { Item[] ar=(Item[])new String[a];
      if(a>arr.length)
      { 
          for(int i=0;i<arr.length;i++)
         {ar[i]=arr[i];} }  
     else if(a<arr.length)
      {for(int i=0;i<a;i++)
         {ar[i]=arr[i];} } 
      
      arr=ar;
    }
    void display()
    { for(int i=arr.length-1;i>-1;i--)
     { System.out.println(i+"="+arr[i]);
     }            
    }
    public static void main(String[] args) throws Exception
    { Scanner s  = new Scanner(System.in);
    System.out.println("Eneter the size of array");
    int y = s.nextInt(); int u=1;
    stack2<String> v  = new stack2<String>(y);
    String t;
      while(u!=0)
      { System.out.println("1 push 2 pop 3 display 4 exit");
       int m = s.nextInt();
          switch (m){
       case 1:  System.out.println("Enter the value to push");
                  t =s.next();
                 v.push(t); break;
        case 2:          
                     t=v.pop();
                     System.out.println("pop="+t); break;
        case 3:   System.out.println("display"); 
                    v.display(); break;        
        case 4:   u=0;break;                
    }}
    }
    
}
