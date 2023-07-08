package dsajava.leetcodejava.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Leetcode {
    public static void main(String[] args) {
    }

    // ! 88
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    // for (int i = m, j = 0; i < m + n; i++, j++) {
    // nums1[i] = nums2[j];
    // }

    // // now sort array using insertion sort
    // for (int i = 0; i < nums1.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (nums1[j] < nums1[j - 1]) {
    // int temp = nums1[j];
    // nums1[j] = nums1[j - 1];
    // nums1[j - 1] = temp;
    // }

    // }
    // }

    // }
    // ! 189 (rotate array)
    // public void rotate(int[] nums, int k) {
    // // we will reverse the entire array first
    // // then reverse the first k elements
    // // then reverse the remaining elements
    // k = k % nums.length;
    // reverse(nums, 0,nums.length - 1);
    // reverse(nums, 0, k - 1 );
    // reverse(nums, k , nums.length - 1 );

    // }

    // static void reverse(int[] nums, int startIndex, int endIndex){
    // while(startIndex < endIndex){
    // int temp = nums[startIndex];
    // nums[startIndex] = nums[endIndex];
    // nums[endIndex] = temp;
    // startIndex++;
    // endIndex--;
    // }
    // }

    // ! 387 (First unique charecter )
    // public int firstUniqChar(String s) {
    // Map<Character, Integer> map = new LinkedHashMap<>();

    // for(int i = 0; i < s.length(); i++){
    // char c = s.charAt(i);

    // if(map.containsKey(c)){
    // map.replace(c, map.get(c) + 1);
    // }
    // else {
    // map.put(c , 1);
    // }

    // }

    // for(Map.Entry<Character, Integer> entry: map.entrySet()) {
    // if(entry.getValue() == 1) {

    // return s.indexOf(entry.getKey());
    // }
    // }
    // return -1;
    // }

    // ! 350. Intersection of Two Arrays II
    // public int[] intersect(int[] nums1, int[] nums2) {
    // List<Integer> result = new ArrayList<Integer>();
    // Arrays.sort(nums1);
    // Arrays.sort(nums2);
    // int i = 0, j = 0;

    // while(i < nums1.length && j < nums2.length){
    // if(nums1[i] < nums2[j]){
    // i++;
    // } else if(nums1[i] > nums2[j]){
    // j++;
    // }else{
    // result.add(nums1[i]);
    // i++;
    // j++;
    // }
    // }
    // // converting List to array of integers
    // int[] r = new int[result.size()];
    // for (int k = 0; k < result.size(); k++) {
    // r[k] = result.get(k);
    // }
    // return r;
    // }

    // ! 206. Reverse Linked List
    // public ListNode reverseList(ListNode head) {
    // if(head == null) return null;

    // ListNode curr = head;
    // ListNode prev = null;
    // while(curr != null){
    // // next node tracking
    // ListNode nextNode = curr.next;

    // // aaba aile ko current bhaneko head ho ani reverse huda head le null point
    // cause and prev is null for first iteration
    // curr.next = prev;

    // // aaba prev bhaneko current hunxa
    // prev = curr;

    // // current node bhaneko aile ko next node
    // curr = nextNode;
    // }
    // return prev;
    // }
    // ! 234. Palindrome Linked List
    // public boolean isPalindrome(ListNode head) {
    // ListNode curr = head;
    // List<Integer> res = new ArrayList<Integer>();
    // // sabai vals lai list ma haldim
    // while(curr != null){
    // res.add(curr.val);
    // curr = curr.next;
    // }

    // // two pointers to check palindrome
    // int i = 0;
    // int j = res.size() - 1;

    // while(i < j){
    // if(res.get(i) != res.get(j)){
    // return false;
    // } else{
    // i++;
    // j--;
    // }
    // }
    // return true;
    // }

    // ! 141. Linked List Cycle
    // public boolean hasCycle(ListNode head) {
    // // fast and slow pointer method
    // ListNode fast = head, slow = head;

    // while(fast != null && fast.next != null){
    // fast = fast.next.next;
    // slow = slow.next;
    // if(fast == slow) {
    // return true;
    // }
    // }
    // return false;
    // }

    // ! 142. Linked List Cycle II
    // public ListNode detectCycle(ListNode head) {
    // // fast and slow pointers
    // // find cycle first

    // ListNode fast = head, slow = head;

    // while (fast != null && fast.next != null) {
    // fast = fast.next.next;
    // slow = slow.next;

    // if (fast == slow) {
    // // now we have found circle
    // // now change one of the pointers to head and traverse one by one
    // // when they meet that is the index where pointer begins
    // fast = head;

    // while (fast != slow) {
    // fast = fast.next;
    // slow = slow.next;
    // }
    // return fast;

    // }
    // }
    // return null;
    // }

    // !202. Happy Number

    // public boolean isHappy(int n) {
    // // fast and slow pointers
    // int slow = n;
    // int fast = n;

    // do{
    // slow = findSq(slow);
    // fast = findSq(findSq(fast));
    // } while( slow != fast);

    // if(slow == 1){
    // return true;
    // } else {
    // return false;
    // }
    // }

    // static int findSq(int n){

    // int ans = 0;
    // while(n > 0){
    // int remainder = n % 10;
    // ans+= remainder * remainder;
    // n /= 10;
    // }
    // return ans;
    // }

    // ! 876 middle of linked list
    // public ListNode middleNode(ListNode head) {
    // // slow and fast pointers

    // // imagine a race going on
    // // the speed of one person is twice the other
    // // so when the faster person reaches the end the slower person will be at
    // middle(since fast person is 2x faster)

    // ListNode fast = head, slow = head;

    // while(fast != null && fast.next != null){
    // fast = fast.next.next;
    // slow = slow.next;
    // }
    // return slow;
    // }

    // public boolean isPalindrome(ListNode head) {
    // // fast and slow pointers

    // // jaba fast ko node last ma pugxa taba slow middle ma pugxa, cause slow is
    // half
    // // the speed of the fast

    // ListNode fast = head, mid = head;

    // while (fast != null && fast.next != null) {
    // fast = fast.next.next;
    // mid = mid.next;
    // }

    // // now reverse the nodes from mid
    // ListNode curr = mid, next = mid, prev = null;
    // while (curr != null) {
    // next = curr.next;
    // curr.next = prev;
    // prev = curr;
    // curr = next;
    // mid = prev; // this is done to preserve mid as it is the first node of our
    // reversed list
    // }

    // // now we have two part one starts from head another from mid, compare
    // elements
    // // traverse from head and comapre value to mid
    // curr = head;

    // while (mid != null) {
    // if (curr.val != mid.val) {
    // return false;
    // }
    // curr = curr.next;
    // mid = mid.next;
    // }
    // return true;
    // }
}
