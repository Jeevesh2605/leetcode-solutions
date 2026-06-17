/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
var rotateRight = function(head, k) {
    if(!head || !head.next || k===0){
        return head;
    }
    let L = 1; //for head
    let tail = head;
    while(tail.next !== null){
        tail = tail.next;
        L++;
    }
    k = k%L;
    if(k===0){
        return head;
    }
    tail.next = head;
    //k-l
    let remain = L-k;
    let newTail = head;
    for(let c=1;c<remain;c++){
        newTail = newTail.next;
    }
    let newHead = newTail.next;
    newTail.next = null;
    return newHead;
};