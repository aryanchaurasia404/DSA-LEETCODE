class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        
        // 1. Find the lengths of l1 and l2
        ListNode count = l1;
        int lenL1 = 0;
        while (count != null) {
            lenL1++;
            count = count.next;
        }
        
        count = l2;
        int lenL2 = 0;
        while (count != null) {
            lenL2++;
            count = count.next;
        }
        
        // 2. Ensure l1 is the longest
        if (lenL2 > lenL1) {
            return addTwoNumbers(l2, l1);
        }
        
        int carry = 0;
        
        // 3. Add the overlapping parts
        while (p != null && q != null) {
            int sum = p.val + q.val + carry;
            p.val = sum % 10;
            carry = sum / 10;
            p = p.next;
            q = q.next;
        }
        
        // 4. Process the remaining nodes
        while (p != null) {
            int sum = p.val + carry;
            p.val = sum % 10;
            carry = sum / 10;
            p = p.next;
        }
        
        // 5. Handle the final carry
        if (carry == 1) {
            ListNode tail = new ListNode();
            tail.val = 1;
            count = l1;
            
            // Traverse l1 one last time to find its tail node
            while (count.next != null) {
                count = count.next;
            }
            // Attach the brand new node
            count.next = tail;
        }
        
        // 6. Return the modified l1
        return l1;
    }
}