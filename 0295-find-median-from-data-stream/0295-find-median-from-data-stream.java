class MedianFinder {
    PriorityQueue<Integer> leftMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();

    public MedianFinder() {
        
    } 
    public void addNum(int num) {
        if(leftMaxHeap.isEmpty() || num < leftMaxHeap.peek()){
            leftMaxHeap.add(num);
        } else{
            rightMinHeap.add(num);
        }
        // always maintain leftMaxHeap size 1 gretaer than rightMinHeap size
        // ya fir dono ka size equal ho
        if(Math.abs(leftMaxHeap.size() - rightMinHeap.size())>1){
            rightMinHeap.add(leftMaxHeap.peek());
            leftMaxHeap.poll();
        } else if(leftMaxHeap.size()<rightMinHeap.size()){
            leftMaxHeap.add(rightMinHeap.peek());
            rightMinHeap.poll();
        }
    }
    
    public double findMedian() {
        if(leftMaxHeap.size() == rightMinHeap.size()){
            double mean = (leftMaxHeap.peek()+rightMinHeap.peek())/2.0;
            return mean;
        }
        return leftMaxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */