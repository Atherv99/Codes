//WAP to single link list using java;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinklist;

/**
 *
 * @author Ashwani Kumar
 */
class Node
{
    int data;
    Node link;
    
    Node(int data,Node link)
    {
        this.data=data;
        this.link=link;
    }
    
}
public class SingleLinkList {

    /**
     * @param args the command line arguments
     */
    static Node root=null;
    static java.util. Scanner sc = new java.util. Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
       // java.util. Scanner sc = new java.util. Scanner(System.in);
        int ch;
  
        while(true)
        {
            System.out.println("1.Append");
            System.out.println("2.Display");
            System.out.println("3.Count");
            System.out.println("4.Delete");
            System.out.println("5.Addatbegin");
            System.out.println("6.Addatend");
            System.out.println("7.Addafter");
            System.out.println("8.Addbefore");
            System.out.println("9.Search");
            System.out.println("10.Reverse");
            System.out.println("11.Quit");
            
            System.out.println("Enter your choice :");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1: append();
                        break;
                case 2: display();
                        break;
                case 3: count();
                        break;
                case 4: delete();
                        break;
                case 5: addatbegin();
                        break;
                case 6: addatend();
                        break;
                case 7: addafter();
                        break;
                case 8: addbefore();
                        break;
                case 9: search();
                        break;
                case 10:reverse();
                        break;
                case 11: System.exit(1);
                default :
                    System.out.println("Invalid choice");
            }
            
        }
    }
    static void append()
    {
       Node temp;
       int ele;
       System.out.println("Enter the element of Single Link List");
       ele=sc.nextInt();
      temp= new Node(ele,null);
       if(root==null)
       {
           root=temp;
       }
       else
       {
           Node p;
           p=root;
           while(p.link!=null)
           {
               p=p.link;
           }
           p.link=temp;
       }
    }
    static void display()
    {
        Node temp;
        temp=root;
        if(root==null)
        {
            System.out.println("Link list is empty");
        }
        else
        {
        System.out.println("Input element which is append in single link list");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.link;
        }
        }
    }
    static void count()
    {
        Node temp;
        temp=root;
        int c=0;
        if(root==null)
        {
            System.out.println("It is empty");
        }
        else
        {
            while(temp!=null)
            {
                c++;
                temp=temp.link;
            }
            System.out.println("Number of element in single Link list ="+c);
        }
    }
    static void delete()
    {
        System.out.println("Enter element to be delete");
        int k=sc.nextInt();
        Node temp,p;
        if(root==null)
        {
            System.out.println("It is empty");
        }
         if(root.data==k)
         {
                    root=root.link;
                    return;
          }
        p=root;
        temp=root;
        while(p!=null)
        {
            if(p.data==k)
            {
               temp.link=p.link;
            }
            temp=p;
            p=p.link;
        }
        
       System.out.println("Element is deleted successfully");
      
       }
    static void addatbegin()
    {
        Node temp;
        System.out.println("Enter the element to be inserted at begin");
        int k=sc.nextInt();
        temp=new Node(k,null);
        if(root==null)
        {
            root=temp;
        }
        else
        {
            temp.link=root;
            root=temp;

        }
         System.out.println("Element is inserted successfully");
        }
    static void addatend()
    {
        Node temp,prev;
        System.out.println("Enter the element to be inserted at the end");
        int k=sc.nextInt();
        temp=new Node(k,null);
        if(root==null)
        {
            root=temp;
        }
        else
        {
            prev=root;
            while(prev.link!=null)
            {
                prev=prev.link;
            }
            prev.link=temp;
            
        }
        System.out.println("Element is inserted successfully");
    }
    static void addafter()
    {
        Node temp,prev;
        System.out.println("Enter the element to be insert");
        int k=sc.nextInt();
        temp=new Node(k,null);
        System.out.println("Enter the element to be insert at after");
        int p=sc.nextInt();
        if(root==null)
        {
            System.out.println("Link list is empty");
        }
        else
        {
            prev=root;
            while(prev!=null)
            {
                if(prev.data==p)
                {
                   temp.link=prev.link;
                   prev.link=temp;
                }
                prev=prev.link;
            }
        }
        
    }
    static void addbefore()
    {
        Node temp,prev,c;
        System.out.println("Enter the element to be insert ");
        int k=sc.nextInt();
        temp=new Node(k,null);
        System.out.println("Enter the element to be insert at before ");
        int p=sc.nextInt();
        if(root==null)
        {
            System.out.println("Link list is empty");
        }
        else
        {
            prev=root;
            c=prev.link;
            while(prev.link!=null)
            {
                if(prev.data==p)
                {
                    temp.link=prev;
                    c.link=temp;
                }
                prev=prev.link;
            }
        }
    }
    static void search()
    {
        Node temp;
        int c=0;
        System.out.println("Enter the element to be search");
        int k=sc.nextInt();
        temp=root;
        {
            while(temp.link!=null)
            {
              if(temp.data==k)
              {
                  System.out.println("Element "+k+ "found at position "+c);
              }
              c++;
              temp=temp.link;
            }
        }
    }
    static void reverse()
    {
        Node ptr,prev,next;
        prev=null;
        ptr=root;
        if(root==null)
        {
            System.out.println("Link list is empty");
        }
        else
        {
            while(ptr!=null)
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
