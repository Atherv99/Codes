class Node
{
    int data;
    Node next;
    Node prev;
    
    Node(int data,Node next,Node prev)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }

  
}
public class Double_link_list
{
    static Node root=null;
    static java.util.Scanner sc=new java.util.Scanner(System.in);
   
    public static void main(String []args)
    {
        int ch,k,item;
        while(true)
        {
         System.out.println("1.Insert");
         System.out.println("2.Display");
         System.out.println("3.Count");
         System.out.println("4.Add_at_Begin");
         System.out.println("5.Add-at-End");
         System.out.println("6.Add-at-After");
         System.out.println("7.Add-at-Before");
         System.out.println("8.Delete");
         System.out.println("9.Search");
         System.out.println("10.Quit");
         
         System.out.println("Enter your choice");
         ch=sc.nextInt();
         
         switch(ch)
         {
             case 1: append();
                     break;
             case 2: display();
                     break;
             case 3: count(); 
                     break;
             case 4: System.out.println("Enter the element of double link list");
                     k=sc.nextInt();
                     addatbegin(k);
                     break;
             case 5: System.out.println("Enter the element of double link list");
                     k=sc.nextInt();
                     addatend(k);
                     break;
             case 6: System.out.println("Enter the element to be insert in double link list");
                     k=sc.nextInt();
                     System.out.println("Enter the element to be insert at after which element");
                     item=sc.nextInt();
                     addafter(item,k);
                     break;
             case 7: System.out.println("Enter the element to be insert in double link list");
                     k=sc.nextInt();
                     System.out.println("Enter the element to be insert at before which element");
                     item=sc.nextInt();
                     addbefore(item,k);
                     break;
             case 8: System.out.println("Enter element to be delete in double link list");
                     item=sc.nextInt();
                     delete(item);
                     break;
             case 9: System.out.println("Enter element to be search in double link list");        
                     item=sc.nextInt();
                     search(item);
                     break;
             case 10: System.exit(1);
                    
             default : System.out.println("Invalid input");         
                     
         }
        }
       
    }
    static void append()
    {
        Node temp;
        int ele,i;
        System.out.println("Enter the element of the double link list");
        ele=sc.nextInt();
        temp=new Node(ele,null,null);
        if(root==null)
        {
            root=temp;
        }
        else
        {
            Node p;
            p=root;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
            temp.prev=p;
            
        }
    
    }
    static void display()
    {
        Node temp;
        temp=root;
        if(root==null)
        {
            System.out.println("Double link list is empty");
        }
        System.out.println("Input element");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static void count()
    {
        Node temp;
        temp=root;
        int c=0;
        if(root==null)
        {
            System.out.println("Double-Link-list is empty");
        }
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        System.out.println("Count: "+c);
    }
    static void addatbegin(int k)
    {
        Node temp;
        temp=new Node(k,null,null);
        if(root==null)
        {
            System.out.println("Double link list is empty");
        }
        temp.next=root;
        root=temp;
        }
    static void addatend(int k)
    {
        Node temp,ptr;
        temp=new Node(k,null,null);
        if(root==null)
        {
            System.out.println("Double link list is empty");
        }
        ptr=root;
        while(ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=temp;
    }
    static void addafter(int item,int k)
    {
        Node temp,ptr;
        temp=new Node(k,null,null);
        if(root==null)
        {
            System.out.println("Double link list is empty");
        }
        ptr=root;
        while(ptr.next!=null)
        {
            if(ptr.data==item)
            {
                temp.next=ptr.next;
                ptr.next=temp;
                temp.prev=ptr;
            }
            ptr=ptr.next;
        }
        ptr.next=temp;
        temp.prev=ptr;
    }
     static void addbefore(int item,int k)
        {
          Node temp,ptr,left;
          temp=new Node(k,null,null);
          if(root==null)
          {
          System.out.println("Double link list is empty");    
          }
          if(root.data==item)
          {
              temp.next=root;
              root.prev=temp; 
              root=temp;
              return;
          }
          left=null;
          ptr=root;
          while(ptr.next!=null)
          {
              if(ptr.data==item)
              {
                  temp.next=ptr;
                  temp.prev=ptr.prev;
                  left.next=temp;
                  return;
                  
              }
              left=ptr;
              ptr=ptr.next;
          }
        }

      static void delete(int item)
      {
         Node temp,ptr,left;
         if(root==null)
         {
             System.out.println("Double link list is emepty");
         }
         
         if(root.data==item)
         {
             root=root.next;
         }
         ptr=root;
         while(ptr.next!=null)
         {
             if(ptr.next.data==item)
             {
               temp=ptr.next;
               ptr.next=temp.next;
               temp.next.prev=ptr;
               return;
             }
             ptr=ptr.next;
             
         }
         
         
     }
      static void search(int item)
      {
        Node temp;
        int c=1;
        temp=root;
        while(temp!=null)
        {
            if(temp.data==item)
            {
                System.out.println(item+" Found in double link list at position "+c);
                return;
            }c++;
            temp=temp.next;
           
        }
        System.out.println(item+" Not found in double link list");
      }
      
    
}