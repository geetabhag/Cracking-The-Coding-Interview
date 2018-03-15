import java.util.HashSet;

//DeleteDuplicate nodes using HashSET
//Singly Linked list
class LinkedListNode
	{
	    public int data;
	    public LinkedListNode next;
	   // public LinkedListNode head;
//constructor
	    public LinkedListNode() {
	    	
	    }
	    public LinkedListNode(int data) {
	    this.data = data;
	    }
	    void printList(LinkedListNode node) {
	    	while(node!=null) {
	    		System.out.print(node.data + " ");
	    		node=node.next;
	    	}
	    }
	}
//code to delete duplicate using Hashset
public class Sum21_A{
	public static void DeleteDuplicate(LinkedListNode list) {
		HashSet<Integer> set= new HashSet<Integer>();
		LinkedListNode previous =null;
		while(list != null) {
			if (set.contains(list.data)) {
				
				previous.next=list.next;
			}
			else {
				set.add(list.data);
				previous=list;
			}
			list=list.next;
			
		}
		
		
		
	}
	
	public static void main (String[] args) {
		LinkedListNode link=new LinkedListNode(9);
		link.next=new LinkedListNode(10);
		link.next.next=new LinkedListNode(12);
		link.next.next.next=new LinkedListNode(11);
		link.next.next.next.next=new LinkedListNode(12);
		link.next.next.next.next.next=new LinkedListNode(13);
		link.printList(link);
		System.out.println("\nAfter deleting suplicate values:");
		DeleteDuplicate(link);
		link.printList(link);
		
		
		
	}
}