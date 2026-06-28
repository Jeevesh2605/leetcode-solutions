/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    let fast = head, slow = head;

    while (fast !== null && fast.next !== null) {
        fast = fast.next.next;
        slow = slow.next;
    }

    if (fast !== null) {
        slow = slow.next;
    }

    slow = reverseList(slow);
    fast = head;

    while (slow !== null) {
        if (fast.val !== slow.val) {
            return false;
        }

        fast = fast.next;
        slow = slow.next;
    }

    return true;
};

function reverseList(head) {
    let prev = null;
    let curr = head;

    while (curr !== null) {
        let next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}