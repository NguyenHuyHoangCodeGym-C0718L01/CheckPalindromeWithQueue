package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedListQueue queue = new MyLinkedListQueue();
        MyStack stack = new MyStack();

        String str = "able was i ere i saw elba";
        char[] charArray = str.toCharArray();

        for(int i = 0; i < charArray.length; i++){
            queue.enqueue(String.valueOf(charArray[i]));
            stack.push(String.valueOf(charArray[i]));
        }

        if(check(queue, stack)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }

    public static boolean check(MyLinkedListQueue queue, MyStack stack){
        if(queue.getHead()!=null && stack.isEmpty()==false) {
            if (queue.dequeue().getKey().equals(stack.pop())) {
                check(queue, stack);
            } else {
                return false;
            }
        }
        return true;
    }
}
