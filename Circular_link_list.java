//WAP to circular link list
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circular_Link_List;
/**
 *
 * @author Ashwani Kumar
 */
class Node
{
   int data;
   Node link;
   Node (int data,Node link)
   {
       this.data=data;
       this.link=link;
   }
   
   
}
public class Circular_link_list {
    static Node root=null;
    static java.util.Scanner sc=new java.util.Scanner(System.in);
    public static void main(String []args)
    {
        int ch;
        while(true)
        {
            System.out.println("1.Append");
            System.out.println("2.Display");
            System.out.println("3.count");
            System.out.println("4.Delete");
            System.out.println("5.Addatbegin");
            System.out.println("6.Addatend");
            System.out.println("7.Addafter");
            System.out.println("8.Addbefore");
            System.out.println("9.Search");
            System.out.println("10.Reverse");
            System.out.println("11.Quit");
            
            
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            
            switch(ch)
             {
                case 1:
                    append();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    count();
                    break;
                case 4:
                     delete();
                      break;
                case 5:
                    addbegin();
                    break;
                case 6:
                    addend();
                    break;
                case 7:
                    addafter();
                    break;
                case 8:
                    addbefore();
                     break; 
                case 9:
                    search();
                    break;
                case 10:
                    reverse();
                    break;
                            
                    
                default:
                    System.out.println("Plz enter correct option");
                        
              }
            
        }
    }
       static void append()
        {
           Node temp;
           int ele;
           System.out.println("Enter the element to be circular link list");
           ele=sc.nextInt();
           temp=new Node(ele,null);
           if(root==null)
           {
               root=temp;
               temp.link=root;
           }
           else
           {
               Node p;
               p=root;
               while(p.link!=root)
               {
                   p=p.link;
               }
               p.link=temp;
               temp.link=root;
           }
        }
       static void display()
       {
           Node temp;
           temp=root;
           System.out.println("Inserted element in circular link list");
           if(root==null)
           {
               System.out.println("List is emepty");
           }
           else
           {
               do
               {
                 System.out.println(temp.data);
                temp=temp.link;  
               }
           while(temp!=root);
           {
               
           }
           }
       }
       static void count()
       {
           Node temp;
           int c=0;
           System.out.println("Number of element in circular link list");
           temp=root;
           if(root==null)
           {
               System.out.println("List is empty");
           }
           else
           {
               do
               {
                 c++;
                 temp=temp.link;
               }
               while(temp!=root);
               {
                  
               }
               System.out.println("count="+c);
           }
       }
       static void delete()
       {
           
         
          
          System.out.println("Enter the element to be delete");
          int k=sc.nextInt();
           Node temp,last,p;
          last=temp=root;
           if(root==null)
           {
               System.out.println("Circular link list is empty");
           }
            if(root.data==k)//delete first element of circular   single link list
           {
               root=root.link;
           
           
            while(last.link!=temp)
            {
               last=last.link;
            }
            last.link=root;
           }
            else
            {
            
            while(last.link!=root)//delete middle element of circular  single  limk list
            {
                
                if(last.data==k)
                {
                  temp.link=last.link; 
                  
                }
                temp=last;
                last=last.link;
            }
            }
            last=root;
            while(last.link!=root)//delete last element of circular single link list
            {
                temp=last;
                last=last.link;
            }
            temp.link=last.link;
       
          }
       static void addbegin()
       {
           System.out.println("Enter the element to be insert at begin");
           int ele;
           Node temp,last,prev;
           ele=sc.nextInt();
           temp=new Node(ele,null);
           if(root==null)
           {
               root=temp;
               temp.link=root;
           }
            
           else
           {
              prev= last=root;
               temp.link=root;
               
               
               while(last.link!=root)
               {
                   prev=last;
                   last=last.link;
               }
               root=temp;
               last.link=root;
           }
       }
       static void addend()
       {
           Node temp,last;
           System.out.println("Enter the element to be inserted at end");
           int ele=sc.nextInt();
           temp=new Node(ele,null);
           if(root==null)
           {
               root=temp;
               temp.link=root;
           }
           else
           {
               last=root;
               while(last.link!=root)
               {
                   last=last.link;
               }
               last.link=temp;
               temp.link=root;
               
           }
       }
    static void addafter()
    {
        Node temp,last,prev;
        prev=last=root;
        System.out.println("Enter the element after which to insert");
        int n=sc.nextInt();
        System.out.println("Enter the element to insert");
        int ele=sc.nextInt();
        temp=new Node(ele,null);
        if(root==null)
        {
            System.out.println("Circualr single link list is empty");
        } 
            last=root;
            while(last.link!=root) //add element at middle of circular link list
            {
                if (last.data == n) {

                    temp.link = last.link;
                    last.link = temp;

                }
               
                last=last.link;
            }
            last.link = temp; //add element at end of circular single link list
                    temp.link=root;
    }
    static void addbefore()
    {
        Node temp,prev,last;
        System.out.println("Enter the element to be inset before at which");
        int n=sc.nextInt();
        System.out.println("Enter the element to be isert");
        int ele=sc.nextInt();
        temp=new Node(ele,null);
        if(root==null)
        {
            System.out.println("Circualar single link list is empty");
        }
        prev=root;
        if(prev.data==n)
        {
            temp.link=root;
           
            while(prev.link!=root)
            {
                prev=prev.link;
            }
             
            prev.link=temp;
            root=temp;
        }
        last=prev=root;
        while(prev.link!=root)
        {
            if(prev.data==n)
            {
              temp.link=prev;
              last.link=temp;
            }
            last=prev;
            prev=prev.link;
        }
       
    }
    static void search()
    {
      Node temp,prev;
      int c=0;
      System.out.println("Enter the element to be search in circular single link list");
      int n=sc.nextInt();
      prev=root;
      if(root==null)
      {
          System.out.println("Circular single link list is empty");
      }
      while(prev.link!=root)
      {
          c++;
          if(prev.data==n)
          {
              System.out.println(prev.data+" found in position of "+c);
          }
          
          prev=prev.link;
      }
    }
     static void reverse()
    {
        Node ptr,prev,next,temp;
        prev=null;
        ptr=root;
        if(root==null)
        {
            System.out.println("Link list is empty");
        }
        else
        {
            while(ptr.link!=root)
            {
                next=ptr.link;
                ptr.link=prev;
                prev=ptr;
                ptr=next;
            }
            root=prev;
         
            System.out.println("Link list is reverse successfully");
        }
        
    }
}
        