package StackUsingLinkedList;

import StackUsingLinkedList.StackUsingLL;

public class LLmain {
    public static void main(String[] args) {
        StackUsingLL st = new StackUsingLL();
        st.push(3);
        st.push(2);
        st.push(1);
        st.display();
        st.peek();
        st.pop();
        st.display();
        st.size();


    }
}
