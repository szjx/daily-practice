package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * description: 双端队列
 *
 * 1、双端队列{@link Deque}是一个接口，继承{@link java.util.Queue}<br>
 * 2、双端底层功能:<br>
 *   * 双端队列的头部和尾部都是可访问的。<br>
 * 3、双端队列底层实现:<br>
 *    3.1、Deque本身是一个接口，接口声明的对象本质上指向LinkedList类，由LinkedList实现具体的方法。<br>
 *    3.2、{@link LinkedList} {@link java.util.ArrayDeque} <br>
 * 4、双端队列方法实现:<br>
 *    4.1、add vs offer: offer有返回值
 *    4.2、remove vs poll: poll有返回值, 返回remove值; remove返回true
 *    4.3、添加元素: add, addFirst, addLast, offer, offerFirst, offerLast
 *    4.4、删除元素: remove, removeFirst, removeLast, poll, pollFirst, pollLast
 *
 * @author lihui
 * @create 2022-06-13 11:38
 **/
public class PDeque {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        //[a] add = addLast
        deque.add("a");
        //[a,b]
        deque.add("b");
        //[a,b,c]
        deque.addLast("c");
        //[d,a,b,c]
        deque.addFirst("d");

        //[d,a,b,c]
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.remove());
        //[a,b]
        System.out.println(deque);
        // 元素个数
        System.out.println(deque.size());
    }

}
