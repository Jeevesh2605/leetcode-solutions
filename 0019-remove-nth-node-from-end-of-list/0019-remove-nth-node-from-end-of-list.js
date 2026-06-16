/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} n
 * @return {ListNode}
 */
var removeNthFromEnd = function(head, n) {
    const dummy = new ListNode(-1);
    dummy.next = head;
    let firstPtr = dummy;
    let secondPtr = dummy;
    for(let i=0;i<=n;i++){
        secondPtr = secondPtr.next;
    }
    while(secondPtr!==null){
        firstPtr = firstPtr.next;
        secondPtr = secondPtr.next;
    }
    firstPtr.next = firstPtr.next.next;
    return dummy.next;
};


