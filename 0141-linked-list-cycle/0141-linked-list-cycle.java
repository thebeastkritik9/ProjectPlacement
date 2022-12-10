/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        
//         ListNode slow = head, fast = head;
        
//         while(fast != null || fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
            
//             if(slow == fast){
//                 return true;
//             }
//         }
//         return false;
        
        HashSet<ListNode> set = new HashSet<>();
        
        ListNode temp = head;
        while(temp != null){
            if(set.contains(temp))
                return true;
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
}