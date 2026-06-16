class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev    = null;
        ListNode current = slow;
        while (current != null) {
            ListNode next = current.next;
            current.next  = prev;
            prev          = current;
            current       = next;
        }
        ListNode left  = head;
        ListNode right = prev;
        while (right != null) {
            if (left.val != right.val) {
                return false; 
            }
            left  = left.next;
            right = right.next;
        }
        return true;
    }
}
