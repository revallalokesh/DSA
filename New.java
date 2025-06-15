
import java.util.*;

 class B{

	public ListNode reverseBetween(ListNode head, int left, int right) {
		if(head==null || left==right){
			return head;
		}
		//skip the left-1 nodes
	}
	public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
			return head;
		}
		
		ListNode mid = getMid(head);
		ListNode left = sortList(head);
		ListNode right = sortList(mid);
		return merge(left,right); 
    }
	public ListNode merge(ListNode list1,ListNode list2){
		ListNode dummynode = new ListNode();
		ListNode list3 = dummynode;
		while(list1!=null && list2!=null){
			if(list1.val < list2.val){
				list3.next = list1;
				list1 = list1.next;
				list3 = list3.next; 
			}else{
				list3.next = list2;
				list2 = list2.next;
				list3 = list3.next; 
			}
		}
		while(list1!=null){
			list3.next = list1;
			list1 = list1.next;
		}
		while(list2!=null){
			list3.next = list2;
			list2 = list2.next;
		}
		return dummynode.next;
	}
   public ListNode getMid(ListNode head){
	if(head==null || head.next==null){
		return head;
	}
	ListNode f = head;
	ListNode s = head;

	while(f!=null && f.next!=null){
		f = f.next.next;
		s = s.next;
	}
	return s;
   }
   class ListNode{
	int val;
	ListNode next;
	public ListNode(){

	}
	public ListNode(int val) {
		this.val = val;
		}
		public ListNode(int val,ListNode next){
			this.val = val;
			this.next = next;
		}
   }
}

public class New
{
	public static void main(String[] args) {
		New list = new New();
	}
}