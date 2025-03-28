package com.practice.problems;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Swap2Pairs {
    public ListNode swapPairs(ListNode head) {
        // Base case: if the list has less than two nodes, no swap is needed
        if (head == null || head.next == null) {
            return head;
        }
        
        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // `prev` is the node before the current pair to be swapped
        ListNode prev = dummy;

        // Traverse the list in pairs
        while (prev.next != null && prev.next.next != null) {
            // Initialize the two nodes to be swapped
            ListNode first = prev.next;
            ListNode second = first.next;

            // Perform the swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move `prev` two nodes ahead
            prev = first;
        }

        // Return the new head, which is dummy.next
        return dummy.next;
    }

    // Helper method to print the list for visualization
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper method to create a linked list from an array
    public ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Swap2Pairs solution = new Swap2Pairs();

        // Create the list from the array [1, 2, 3, 4]
        int[] inputArray = {1, 2, 3, 4};
        ListNode head = solution.createList(inputArray);

        // Print the original list
        System.out.println("Original list:");
        solution.printList(head);

        // Swap pairs
        ListNode swappedHead = solution.swapPairs(head);

        // Print the modified list
        System.out.println("List after swapping pairs:");
        solution.printList(swappedHead);
    }
}
