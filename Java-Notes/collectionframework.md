### **Java Collection Framework & Hierarchy**

The **Java Collection Framework (JCF)** provides a set of interfaces and classes to **store, manipulate, and process data efficiently**. It includes **Lists, Sets, Queues, Maps, and more**.

---

## **🔹 Collection Framework Hierarchy**

The collection framework is divided into **two main parts**:

1. **Collection Interface (extends Iterable (i))** → Includes **List (i), Set (i), Queue (i), Deque (i)**
2. **Map Interface (i) (Separate from Collection)** → Stores key-value pairs

Below is the hierarchy:

```
                 Iterable (i)
                     │
               Collection (i)
      ┌─────────┼──────────┐
      │         │          │
     List (i)  Set (i)   Queue (i)
      │         │          │
  ┌───┼───┐   ┌─┼──┐     ┌─┴─┐
  │   │   │   │   │     │   │
ArrayList (c) LinkedList (c)  HashSet (c) PriorityQueue (c)
Vector (c)    Stack (c)       TreeSet (c)  ArrayDeque (c)
    │
  Stack (c) (extends Vector (c))

            ┌────────── Map (i) (Not Collection) ──────────┐
            │                                             │
        HashMap (c)                                  SortedMap (i)
        LinkedHashMap (c)                            TreeMap (c)
```

---

## **🔹 Collection Interface**

The **`Collection` (i)** interface is the root interface of the collection framework and extends `Iterable` (i), meaning collections can be iterated using **enhanced for-loops**.

### **💡 Important Subinterfaces**

1. **List (i)** → Ordered, allows duplicates.
2. **Set (i)** → Unordered, no duplicates.
3. **Queue (i)** → Follows FIFO, used for scheduling.
4. **Deque (i)** → Double-ended queue (both FIFO & LIFO).

---

### **Methods in the `Collection` Interface in Java**
The **`Collection`** interface in Java is the root interface of the **Collection Framework** and extends `Iterable<T>`. It provides several methods for managing groups of objects.

---

## **🔹 List of Methods in the `Collection<T>` Interface**
The `Collection<T>` interface provides **15 main methods**, categorized as follows:

### **1️⃣ Basic Operations**
| Method | Description |
|--------|------------|
| `boolean add(E e)` | Adds an element to the collection. |
| `boolean remove(Object o)` | Removes a specified element from the collection. |
| `int size()` | Returns the number of elements in the collection. |
| `boolean isEmpty()` | Returns `true` if the collection is empty. |
| `void clear()` | Removes all elements from the collection. |

### **2️⃣ Checking Elements**
| Method | Description |
|--------|------------|
| `boolean contains(Object o)` | Checks if an element exists in the collection. |
| `boolean containsAll(Collection<?> c)` | Checks if the collection contains all elements of another collection. |

### **3️⃣ Bulk Operations**
| Method | Description |
|--------|------------|
| `boolean addAll(Collection<? extends E> c)` | Adds all elements from another collection. |
| `boolean removeAll(Collection<?> c)` | Removes all elements from another collection. |
| `boolean retainAll(Collection<?> c)` | Retains only elements that are present in another collection. |

### **4️⃣ Iteration**
| Method | Description |
|--------|------------|
| `Iterator<E> iterator()` | Returns an iterator to traverse elements. |
| `Spliterator<E> spliterator()` | Returns a spliterator for parallel processing (Java 8+). |

### **5️⃣ Converting to Array**
| Method | Description |
|--------|------------|
| `Object[] toArray()` | Converts the collection into an `Object` array. |
| `<T> T[] toArray(T[] a)` | Converts the collection into an array of a specific type. |

---

## **🔹 Example of Using Collection Methods**
```java
import java.util.*;

public class CollectionMethodsExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        
        // 1️⃣ Adding Elements
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        // 2️⃣ Checking Elements
        System.out.println("Contains Banana? " + collection.contains("Banana")); // true
        System.out.println("Size: " + collection.size()); // 3

        // 3️⃣ Iteration
        for (String fruit : collection) {
            System.out.println(fruit);
        }

        // 4️⃣ Converting to Array
        Object[] array = collection.toArray();
        System.out.println("First Element: " + array[0]);

        // 5️⃣ Removing an Element
        collection.remove("Banana");
        System.out.println("Contains Banana after removal? " + collection.contains("Banana")); // false
    }
}
```
---
### **Extra Methods in the `List` Interface (Java Collection Framework)**

The `List` interface extends `Collection` and provides additional methods to handle elements **by index** since it maintains an **ordered sequence**.

---

### **🔹 Methods Exclusive to `List` Interface**
Apart from the methods inherited from `Collection`, the `List` interface provides **index-based operations, search methods, and list iteration**.

#### **1️⃣ Index-Based Operations**
These methods allow **direct access** and **modification** of elements using an index.

| **Method** | **Description** |
|------------|---------------|
| `void add(int index, E element)` | Inserts the element at a **specific index** |
| `E get(int index)` | Retrieves the element at the given **index** |
| `E set(int index, E element)` | Updates the element at the **specified index** |
| `E remove(int index)` | Removes and returns the element from the **given index** |

🔹 **Example:**
```java
import java.util.*;

public class ListIndexMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));

        list.add(1, "X"); // Inserting at index 1
        System.out.println(list); // [A, X, B, C]

        list.set(2, "Y"); // Updating index 2
        System.out.println(list); // [A, X, Y, C]

        list.remove(3); // Removing element at index 3
        System.out.println(list); // [A, X, Y]
    }
}
```

---

#### **2️⃣ Searching Elements**
These methods help in **searching elements** within a `List`.

| **Method** | **Description** |
|------------|---------------|
| `int indexOf(Object o)` | Returns the **first occurrence index** of the element (`-1` if not found) |
| `int lastIndexOf(Object o)` | Returns the **last occurrence index** of the element (`-1` if not found) |

🔹 **Example:**
```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "B"));
System.out.println(list.indexOf("B")); // Output: 1
System.out.println(list.lastIndexOf("B")); // Output: 3
```

---

#### **3️⃣ List Iteration (ListIterator)**
Unlike a normal `Iterator`, the `ListIterator` can traverse both **forward and backward**.

| **Method** | **Description** |
|------------|---------------|
| `ListIterator<E> listIterator()` | Returns a **ListIterator** for forward/backward traversal |
| `ListIterator<E> listIterator(int index)` | Returns a **ListIterator starting at a specific index** |

🔹 **Example:**
```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
ListIterator<String> it = list.listIterator();

while (it.hasNext()) {
    System.out.print(it.next() + " "); // A B C
}
```

---

#### **4️⃣ Sublist Extraction**
| **Method** | **Description** |
|------------|---------------|
| `List<E> subList(int fromIndex, int toIndex)` | Returns a **sublist view** (changes reflect in the original list) |

🔹 **Example:**
```java
List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
List<String> sublist = list.subList(1, 3);
System.out.println(sublist); // Output: [B, C]
```

---

### **📌 Summary of Extra Methods in `List`**
| **Category** | **Method(s)** |
|-------------|-------------|
| **Index Operations** | `add(index, E)`, `get(index)`, `set(index, E)`, `remove(index)` |
| **Searching** | `indexOf(Object)`, `lastIndexOf(Object)` |
| **Iteration** | `listIterator()`, `listIterator(int index)` |
| **Sublist** | `subList(fromIndex, toIndex)` |

### **🔄 Java ListIterator Example with Bidirectional Traversal**

The `ListIterator` in Java provides **bidirectional traversal**, unlike a regular `Iterator`, which only supports **forward traversal**. It also allows **modifications** while iterating.

---

### **📌 Explanation of Key ListIterator Methods**
| **Method**       | **Description** |
|------------------|----------------|
| `hasNext()`      | Checks if there's a **next** element |
| `next()`         | Returns the **next** element |
| `hasPrevious()`  | Checks if there's a **previous** element |
| `previous()`     | Returns the **previous** element |
| `add(E e)`       | Inserts element **at the iterator's position** |
| `set(E e)`       | Updates **last returned element** |
| `nextIndex()`    | Returns index of **next element** |
| `previousIndex()`| Returns index of **previous element** |

---

---

### **📌 Example: Using ListIterator for Forward & Backward Traversal**
```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));

        // Obtaining a ListIterator starting from index 0
        ListIterator<String> listIterator = names.listIterator();

        // 🔹 Forward Traversal
        System.out.println("🔹 Forward Traversal:");
        while (listIterator.hasNext()) {
            System.out.println("Index: " + listIterator.nextIndex() + " → " + listIterator.next());
        }

        // 🔹 Backward Traversal
        System.out.println("\n🔹 Backward Traversal:");
        while (listIterator.hasPrevious()) {
            System.out.println("Index: " + listIterator.previousIndex() + " → " + listIterator.previous());
        }

        // 🔹 Modifying List using ListIterator
        System.out.println("\n🔹 Modifying the List:");
        listIterator = names.listIterator(); // Reset iterator

        while (listIterator.hasNext()) {
            String name = listIterator.next();
            if (name.equals("Bob")) {
                listIterator.set("Bobby"); // Replace "Bob" with "Bobby"
            } else if (name.equals("Charlie")) {
                listIterator.add("Carlos"); // Add "Carlos" after "Charlie"
            }
        }

        System.out.println("Modified List: " + names);
    }
}
```

---

### **🖥️ Output**
```
🔹 Forward Traversal:
Index: 0 → Alice
Index: 1 → Bob
Index: 2 → Charlie
Index: 3 → David

🔹 Backward Traversal:
Index: 3 → David
Index: 2 → Charlie
Index: 1 → Bob
Index: 0 → Alice

🔹 Modifying the List:
Modified List: [Alice, Bobby, Charlie, Carlos, David]
```
---

# **Java `LinkedList` - A Complete Guide**

A **`LinkedList`** in Java is a **dynamic** data structure that implements the **List, Queue, and Deque** interfaces. Unlike **`ArrayList`**, which uses a **resizable array**, `LinkedList` is based on a **doubly linked list**, making it more efficient for insertions and deletions.

---

## **1️⃣ LinkedList Hierarchy**

`LinkedList` is a part of the **Java Collections Framework** and follows this hierarchy:

```
java.lang.Object  
  ├── java.util.AbstractCollection<E>  
  │     ├── java.util.AbstractList<E>  
  │     │     ├── java.util.LinkedList<E>  
  ├── java.util.List<E>  
  ├── java.util.Queue<E>  
  ├── java.util.Deque<E>  
```

Since `LinkedList` implements **both `List` and `Queue`**, it can function as **both a list and a queue/deque**, supporting **efficient operations at both ends**.

---

## **2️⃣ When to Use `LinkedList`?**

### ✅ **Advantages**
✔ **Fast Insertions & Deletions**: Adding/removing elements at the **start or end** takes `O(1)` time.  
✔ **No Memory Waste**: Does not require **contiguous memory** like `ArrayList`.  
✔ **Efficient in Real-Time Applications**: Useful when **frequent insertions and deletions** are needed.

### ❌ **Disadvantages**
❌ **Slow Random Access**: Retrieving elements takes `O(n)` time.  
❌ **Higher Memory Overhead**: Each node stores **extra pointers** (`prev` & `next`).  
❌ **Not Cache-Friendly**: `LinkedList` elements **are not stored in contiguous memory**, causing **cache misses**.

---

## **3️⃣ Example: Creating and Using `LinkedList`**

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);

        // Printing the LinkedList
        System.out.println(list);  // Output: [10, 20, 30]
    }
}
```

---

## **4️⃣ Internal Working of `LinkedList`**

A `LinkedList` is **implemented as a doubly linked list**. Each node contains:
- **Data** (Value of the element)
- **Pointer to the Next Node (`next`)**
- **Pointer to the Previous Node (`prev`)**

```java
class Node {
    int data;
    Node next;
    Node prev;
}
```

Unlike an **ArrayList**, `LinkedList` **does not require resizing** when adding elements.

---

## **5️⃣ Methods Common to Both `LinkedList` and `ArrayList`**

| **Method** | **Description** | **Time Complexity** |
|------------|---------------|---------------------|
| `add(E e)` | Appends element to the end | `O(1)` |
| `add(int index, E element)` | Inserts element at a specific position | `O(n)` |
| `contains(Object o)` | Checks if element exists | `O(n)` |
| `remove(int index)` | Removes element at a specific index | `O(n)` |
| `remove(Object o)` | Removes first occurrence of an element | `O(n)` |
| `get(int index)` | Retrieves element at a specific index | `O(n)` |
| `set(int index, E element)` | Replaces an element at a specific index | `O(n)` |
| `indexOf(Object o)` | Finds first occurrence of element | `O(n)` |
| `lastIndexOf(Object o)` | Finds last occurrence of element | `O(n)` |
| `isEmpty()` | Checks if the list is empty | `O(1)` |

📌 **Note**:
- Insertions & deletions at the **beginning or end** take **O(1)**.
- Searching for an element takes **O(n)**.
- Unlike an `ArrayList`, accessing an element in `LinkedList` takes **O(n) (linear time)**.

---

## **6️⃣ Methods Implementing the `Queue` Interface**

| **Method** | **Description** | **Unsuccessful Response** |
|------------|---------------|--------------------------|
| `add(E e)` | Adds element to the end | **Throws Exception** |
| `remove()` | Removes and returns the first element | **Throws Exception** |
| `element()` | Retrieves but does not remove the first element | **Throws Exception** |
| `offer(E e)` | Adds element to the end | **Returns `null`** |
| `poll()` | Removes and returns the first element | **Returns `null` if empty** |
| `peek()` | Retrieves but does not remove the first element | **Returns `null` if empty** |

---

## **7️⃣ Methods Implementing the `Deque` Interface**

| **Method** | **Description** | **Unsuccessful Response** |
|------------|---------------|--------------------------|
| `addFirst(E e)` | Inserts element at the beginning | **Throws Exception** |
| `addLast(E e)` | Adds element to the end | **Throws Exception** |
| `removeFirst()` | Removes and returns first element | **Throws Exception** |
| `removeLast()` | Removes and returns last element | **Throws Exception** |
| `getFirst()` | Returns first element | **Throws Exception** |
| `getLast()` | Returns last element | **Throws Exception** |
| `offerFirst(E e)` | Adds element at the front | **Returns `null` if unsuccessful** |
| `offerLast(E e)` | Adds element at the end | **Returns `null` if unsuccessful** |
| `pollFirst()` | Removes and returns first element | **Returns `null` if empty** |
| `pollLast()` | Removes and returns last element | **Returns `null` if empty** |
| `peekFirst()` | Retrieves first element without removing | **Returns `null` if empty** |
| `peekLast()` | Retrieves last element without removing | **Returns `null` if empty** |

📌 **Note**: These methods allow `LinkedList` to function as **both a FIFO queue and a double-ended queue (Deque).**

---

## **8️⃣ Example: Using `LinkedList` as a Queue and Deque**

### **🟢 Using `Queue` methods**
```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        System.out.println(queue.poll());  // Removes & prints 10
        System.out.println(queue.peek());  // Retrieves 20 without removing
    }
}
```

### **🔵 Using `Deque` methods**
```java
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);

        System.out.println(deque.pollFirst()); // 5
        System.out.println(deque.pollLast());  // 20
    }
}
```

---

## **9️⃣ Conclusion**
✅ **`LinkedList` is great for frequent insertions/deletions but has slow random access**.  
✅ **Best for applications requiring dynamic memory allocation and fast modifications**.  
✅ **Implements `List`, `Queue`, and `Deque`, making it highly flexible**.

---

---

# **📌 `ArrayList` vs. `LinkedList` - A Detailed Comparison**

| **Feature** | **ArrayList** | **LinkedList** |
|------------|-------------|---------------|
| **Implementation** | Uses a **dynamic array** | Uses a **doubly linked list** |
| **Memory Usage** | Less memory overhead as it stores only data | More memory overhead due to storing **pointers (next & prev)** |
| **Access Time (Random Access)** | **O(1)** (Direct access via index) | **O(n)** (Must traverse nodes sequentially) |
| **Insertion (At End)** | **O(1) (Amortized)**, but `O(n)` in case of resizing | **O(1)** (Constant time) |
| **Insertion (At Start)** | **O(n)** (Shifting required) | **O(1)** (Direct insertion at head) |
| **Insertion (At Middle)** | **O(n)** (Shifting elements) | **O(n)** (Traversing to middle, then inserting) |
| **Deletion (From End)** | **O(1)** | **O(1)** |
| **Deletion (From Start)** | **O(n)** (Shifting elements) | **O(1)** |
| **Deletion (From Middle)** | **O(n)** (Shifting elements) | **O(n)** (Traversing to middle, then deleting) |
| **Search (Contains, indexOf, lastIndexOf)** | **O(n)** (Sequential search) | **O(n)** (Sequential search) |
| **Iteration Speed** | Faster (better cache locality) | Slower (due to scattered memory locations) |
| **Performance in Large Datasets** | Better for **frequent reads & random access** | Better for **frequent insertions & deletions** |
| **When to Use?** | When **random access & fast retrieval** are needed | When **frequent modifications** (insertions/deletions) are required |

---

## **✅ When to Use `ArrayList`?**
✔ When you need **fast random access (`get()` method)**.  
✔ When you have a **large number of read operations** and fewer modifications.  
✔ When memory is a concern (no extra pointers).  
✔ Example: **Reading a large dataset**, **storing static lists (e.g., menu items, student records)**.

### **Example - Using `ArrayList`**
```java
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(1));  // Fast random access (O(1))
    }
}
```

---

## **✅ When to Use `LinkedList`?**
✔ When you need **frequent insertions and deletions**.  
✔ When you need a **queue or deque (FIFO, LIFO operations)**.  
✔ When you need **constant-time insertions/removals at the start or end**.  
✔ Example: **Implementing queues, managing history (undo/redo operations), maintaining a playlist**.

### **Example - Using `LinkedList`**
```java
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(5);  // O(1)
        list.addLast(20);  // O(1)
        list.removeFirst(); // O(1)
    }
}
```

Here’s a well-structured and formatted documentation for **Java's Stack Class**, including details about **ArrayDeque** as a better alternative. 🚀

---

# **📌 Java Stack (`Stack` vs `ArrayDeque`) - A Comprehensive Guide**

## **1️⃣ Introduction**
Java's Collection Framework provides a `Stack` class that models and implements a **stack data structure**. A stack follows the **Last-In-First-Out (LIFO)** principle, meaning the **last element inserted** is the **first one to be removed**.

However, **`Stack` is a legacy class** (inheriting from `Vector`) and is **synchronized**, which makes it thread-safe but incurs performance overhead.  
For better efficiency in single-threaded applications, **`ArrayDeque`** is recommended as a **faster alternative**.

---

## **2️⃣ Stack Class (`java.util.Stack`)**
### **✔ Key Methods**
| **Method** | **Description** | **Time Complexity** |
|------------|---------------|--------------------|
| `push(E e)` | Adds an element to the **top** of the stack | **O(1)** |
| `pop()` | Removes and returns the **top** element | **O(1)** |
| `peek()` | Returns the **top** element **without** removing it | **O(1)** |
| `empty()` | Checks if the stack is **empty** | **O(1)** |
| `search(Object o)` | Returns the **position** of an element from the **top** | **O(n)** |
| `size()` | Returns the **number of elements** in the stack | **O(1)** |

---

## **3️⃣ Example: Basic Stack Operations Using `ArrayDeque` (Recommended ✅)**
```java
import java.util.ArrayDeque;  // Import ArrayDeque class

public class StackExample {
    public static void main(String[] args) {
        // Using ArrayDeque as a Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Pushing elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek()); // Output: 30

        // Popping elements
        System.out.println("Popped: " + stack.pop()); // Output: 30
        System.out.println("Top element after pop: " + stack.peek()); // Output: 20
    }
}
```
### **🔹 Output**
```
Top element: 30
Popped: 30
Top element after pop: 20
```

---

## **4️⃣ Example: Additional Stack Operations Using `ArrayDeque`**
```java
import java.util.ArrayDeque;

public class StackOperations {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Check size and emptiness
        System.out.println("Stack size: " + stack.size());  // Output: 3
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
```
### **🔹 Output**
```
Stack size: 3
Is stack empty? false
```

---

## **5️⃣ Why Use `ArrayDeque` Instead of `Stack`?**
| **Feature** | **`Stack` (Legacy)** | **`ArrayDeque` (Recommended ✅)** |
|------------|-----------------|---------------------|
| **Performance** | Slower (Synchronized, inherits from `Vector`) | Faster (Better memory & execution) |
| **Thread-Safety** | Thread-safe (but overhead) | Not thread-safe (use `Collections.synchronizedDeque()` for safety) |
| **Implementation** | Extends `Vector` (Inefficient) | Uses **resizable array** (Efficient) |
| **Recommended For** | **Multi-threaded environments** (Rare use case) | **General-purpose stack usage** |

### **⚡ Verdict:**
💡 **Use `ArrayDeque` instead of `Stack`** for better **performance** unless you specifically need a synchronized stack.

---
# Java Queue Interface - A Comprehensive Guide

## 1. Introduction
The **Queue** interface in Java, present in the `java.util` package and extending the `Collection` interface, is used to manage elements in a **First In First Out (FIFO)** order. Elements are **inserted at the end** of the queue and **removed from the front**, maintaining an ordered list of objects.

## 2. Common Implementations of Queue
1. **LinkedList**: Provides a **doubly linked list** structure.
2. **ArrayDeque**: Offers **faster execution** and **cache-friendly behavior** compared to `LinkedList`.

> **Note**: Both `LinkedList` and `ArrayDeque` are **not thread-safe**. If a thread-safe implementation is required, `PriorityBlockingQueue` can be used.

## 3. Queue Declaration
Since `Queue` is an **interface**, objects cannot be directly instantiated from it. Instead, concrete classes such as `ArrayDeque` and `LinkedList` are used.

**Example Declaration:**
```java
Queue<Integer> queue = new ArrayDeque<>();
```

## 4. Characteristics of a Queue
- Elements are **inserted at the end** and **removed from the beginning** (**FIFO**).
- Supports all methods from the `Collection` interface.
- Common implementations include `LinkedList`, `ArrayBlockingQueue`, and `PriorityQueue`.
- **Null operations on BlockingQueues throw `NullPointerException`.**
- Queues in `java.util` package are **unbounded**, while those in `java.util.concurrent` are **bounded**.
- `Deque` (Double-Ended Queue) supports **insertion and removal from both ends**.

---

## 5. Example 1: Basic Queue Operations
This example demonstrates **adding and checking elements** in a queue.

```java
import java.util.*;

public class QueueExample {
    public static void main (String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        
        q.offer(10);
        q.offer(20);
        q.offer(30);
        
        System.out.println("Size: " + q.size());  // Output: 3
        System.out.println("Is Empty? " + q.isEmpty()); // Output: false
        System.out.println(q); // Output: [10, 20, 30]
    }
}
```
### Output:
```
Size: 3
Is Empty? false
[10, 20, 30]
```

---

## 6. Example 2: Peek, Poll, and Queue Operations

```java
import java.util.*;

public class QueueOperations {
    public static void main (String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        
        q.offer(10);
        q.offer(20);
        q.offer(30);
        
        System.out.println("Peek: " + q.peek()); // Output: 10
        System.out.println("Poll: " + q.poll()); // Output: 10
        System.out.println("Peek after poll: " + q.peek()); // Output: 20
    }
}
```
### Output:
```
Peek: 10
Poll: 10
Peek after poll: 20
```

---

## 7. Methods of Queue Interface
The **Queue interface** inherits all methods present in the `Collection` interface while implementing the following additional methods:

| **Method**         | **Description** |
|---------------------|----------------|
| `peek()`           | Views the **head** without removing it. Returns `null` if the queue is empty. |
| `offer(E element)` | Inserts an element into the queue. Returns `false` instead of throwing an exception if full. |
| `poll()`           | Removes and returns the **head** of the queue. Returns `null` if empty. |
| `element()`        | Similar to `peek()`, but throws `NoSuchElementException` if the queue is empty. |
| `add(E element)`   | Adds elements at the queue's tail, throwing an exception if the queue is full. |
| `remove()`         | Removes and returns the **head**, throwing `NoSuchElementException` if empty. |

---

## 8. Applications of Queue
Queues are widely used in real-world applications, including:

1. **Resource Sharing**
    - CPU scheduling, Disk Scheduling (First-Come-First-Serve scheduling)
    - Web Server Request Handling
    - Router Packet Processing

2. **Buffering Mechanisms**
    - Buffer queue synchronizing fast and slow devices
    - IO Buffers, Pipes, File IO, etc.

3. **Asynchronous Data Transfer**
    - Message Queues in Distributed Systems
    - Job Scheduling in Task Managers

---

# ArrayDeque in Java

## Overview
ArrayDeque (Array Double-Ended Queue) in Java is a resizable array implementation that supports the **Deque**, **Queue**, and **Collection** interfaces. It allows efficient addition and removal of elements from both ends.

## Features of ArrayDeque
- **No Capacity Restrictions**: It dynamically grows as needed.
- **Not Thread-Safe**: External synchronization is required for concurrent access.
- **Does Not Allow Null Values**: Unlike some collections, `ArrayDeque` prohibits null elements.
- **Efficient as a Stack**: Often faster than `Stack` when used in stack operations.
- **Efficient as a Queue**: Typically outperforms `LinkedList` when used as a queue.
- **Limited Implementation**: Unlike `LinkedList`, `ArrayDeque` does not implement the `List` interface.

## Declaration
```java
public class ArrayDeque<E> extends AbstractCollection<E>
    implements Deque<E>, Cloneable, Serializable
```
`E` refers to the type of elements stored in the `ArrayDeque`.

---

## Implementation Examples

### Basic Usage
```java
import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println(ad);
    }
}
```
**Output:**
```
[10, 20, 30]
```

### ArrayDeque as a Stack
| Method | Description |
|--------|-------------|
| `push(E e)` | Pushes an element onto the stack (front). |
| `pop()` | Removes and returns the top element. Throws `NoSuchElementException` if empty. |
| `peek()` | Returns the top element without removing it. |

#### Example:
```java
ArrayDeque<Integer> stack = new ArrayDeque<>();
stack.push(10);
stack.push(20);
System.out.println(stack.peek()); // 20
System.out.println(stack.pop());  // 20
System.out.println(stack.peek()); // 10
```

---

### ArrayDeque as a Queue
| Method | Description |
|--------|-------------|
| `offer(E e)` | Adds an element to the end. Returns `false` instead of throwing an exception if full. |
| `poll()` | Removes and returns the first element. Returns `null` if empty. |
| `peek()` | Retrieves, but does not remove, the first element. Returns `null` if empty. |

#### Example:
```java
ArrayDeque<Integer> queue = new ArrayDeque<>();
queue.offer(10);
queue.offer(20);
System.out.println(queue.peek()); // 10
System.out.println(queue.poll()); // 10
System.out.println(queue.peek()); // 20
```

---

### ArrayDeque as a Deque
| Method | Description |
|--------|-------------|
| `offerFirst(E e)` | Adds an element at the front. |
| `offerLast(E e)` | Adds an element at the end. |
| `pollFirst()` | Removes and returns the first element. Returns `null` if empty. |
| `pollLast()` | Removes and returns the last element. Returns `null` if empty. |
| `peekFirst()` | Retrieves the first element without removing it. Returns `null` if empty. |
| `peekLast()` | Retrieves the last element without removing it. Returns `null` if empty. |

#### Example:
```java
ArrayDeque<Integer> deque = new ArrayDeque<>();
deque.offerFirst(10);
deque.offerLast(20);
deque.offerFirst(30);
System.out.println(deque.peekFirst()); // 30
System.out.println(deque.peekLast());  // 20
System.out.println(deque.pollFirst()); // 30
```

---

## Exception-Throwing vs Non-Throwing Methods
| Exception-Throwing Methods | Equivalent Non-Throwing Methods |
|----------------------------|--------------------------------|
| `addFirst(E e)` | `offerFirst(E e)` |
| `addLast(E e)` | `offerLast(E e)` |
| `removeFirst()` | `pollFirst()` |
| `removeLast()` | `pollLast()` |
| `getFirst()` | `peekFirst()` |
| `getLast()` | `peekLast()` |

## Redundant Methods Mapping
| Stack Method | Equivalent Deque Method |
|-------------|-----------------------|
| `push(E e)` | `addFirst(E e)` |
| `pop()` | `removeFirst()` |
| `peek()` | `peekFirst()` |
| `offer(E e)` | `offerLast(E e)` |
| `element()` | `getFirst()` |

## Time Complexity Analysis
ArrayDeque provides **O(1) time complexity** for most operations because it utilizes a resizable circular array internally.

| Operation | Time Complexity |
|-----------|----------------|
| `addFirst()` / `addLast()` | O(1) |
| `removeFirst()` / `removeLast()` | O(1) |
| `peekFirst()` / `peekLast()` | O(1) |
| `push()` / `pop()` | O(1) |
| `offer()` / `poll()` | O(1) |


## **PriorityQueue in Java**
The **PriorityQueue** class in Java is a part of `java.util` package and implements the `Queue` interface. It is used to **process elements based on priority rather than insertion order**.

### **Key Features of PriorityQueue**
✅ **Elements are ordered based on priority** (natural order or custom `Comparator`).  
✅ **Implements Min-Heap by default** (smallest element has the highest priority).  
✅ **Duplicates are allowed** but ordering is maintained.  
✅ **Does not allow `null` elements** (throws `NullPointerException`).  
✅ **Not thread-safe** (Use `PriorityBlockingQueue` for multi-threaded scenarios).

---

## **Declaration of PriorityQueue**
```java
PriorityQueue<E> pq = new PriorityQueue<>();
```
- `E` is the type of elements (e.g., Integer, String, etc.).
- By default, it follows **natural ordering** (`Comparable`).
- You can define custom priority using a **Comparator**.

---

## **Example 1: Basic Operations with Default Priority (Min-Heap)**
```java
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Retrieving top priority element
        System.out.println(pq.peek()); // Output: 10 (smallest element)

        // Removing elements (in priority order)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
```
**Output:**
```
10
20
30
```
🔹 **Min-Heap Property**: Smallest number has the highest priority.

---

## **Example 2: Custom Comparator (Max-Heap)**
By default, `PriorityQueue` works as a **Min-Heap** (smallest element first).  
To create a **Max-Heap** (largest element first), we use a **Comparator**.

```java
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.peek()); // Output: 30 (largest element)

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
```
**Output:**
```
30
20
10
```
🔹 **Max-Heap Property**: Largest number has the highest priority.

---

## **Example 3: PriorityQueue with Custom Objects**
You can use a **custom Comparator** to prioritize elements based on any criteria.

```java
import java.util.PriorityQueue;
import java.util.Comparator;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Sorting students based on marks (Higher marks = Higher priority)
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparingInt(s -> -s.marks));

        pq.add(new Student("Alice", 85));
        pq.add(new Student("Bob", 75));
        pq.add(new Student("Charlie", 95));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
```
**Output:**
```
Charlie (95)
Alice (85)
Bob (75)
```
🔹 **Highest marks have the highest priority**.

---

## **PriorityQueue Methods**
| Method | Description |
|--------|------------|
| `add(E e)` | Adds an element to the queue (throws exception if full). |
| `offer(E e)` | Adds an element to the queue (returns false if full). |
| `peek()` | Retrieves but does not remove the highest priority element. |
| `poll()` | Retrieves and removes the highest priority element. |
| `remove(E e)` | Removes a specific element. |
| `size()` | Returns the number of elements in the queue. |

---

## **Time Complexity of PriorityQueue Operations**
| Operation | Time Complexity |
|-----------|---------------|
| **Insertion (`add()` or `offer()`)** | **O(log N)** |
| **Retrieving Top Element (`peek()`)** | **O(1)** |
| **Removing Top Element (`poll()`)** | **O(log N)** |

---
## **Set Interface in Java**
The **Set interface** in Java is part of the `java.util` package and extends the `Collection` interface. It represents a collection of **unique** elements, meaning **duplicate values are not allowed**.

### **Key Features of Set Interface**
✅ **No duplicates** – A `Set` does not allow duplicate elements.  
✅ **No specific order** – The order of elements depends on the implementation (e.g., `HashSet`, `LinkedHashSet`, `TreeSet`).  
✅ **Allows null** – Some implementations (e.g., `HashSet`, `LinkedHashSet`) allow **one** `null` value, while `TreeSet` does not allow `null`.  
✅ **Efficient operations** – Performance varies based on the implementation (e.g., `HashSet` offers O(1) operations, while `TreeSet` offers O(log N) operations).

---

## **Implemented Classes of Set**
Java provides three commonly used implementations of `Set`:
1. **`HashSet`** (Uses Hash Table, Fastest, Unordered)
2. **`LinkedHashSet`** (Maintains Insertion Order)
3. **`TreeSet`** (Sorted Set using Red-Black Tree)

### **1. HashSet (Fastest, No Order)**
- Implements `Set` using a **hash table** (internally uses `HashMap`).
- **Unordered**: Does **not maintain insertion order**.
- **Allows one `null` value**.
- **Best for quick insert/search/delete operations** (O(1) time complexity).

#### **Example**
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, will not be added
        
        System.out.println(set); // Output: [20, 10, 30] (unordered)
    }
}
```
✅ **Best When**: You need a high-performance unordered collection.

---

### **2. LinkedHashSet (Maintains Insertion Order)**
- Extends `HashSet` and **maintains insertion order**.
- Internally uses a **Linked List + Hash Table**.
- **Allows one `null` value**.
- Slightly **slower than `HashSet`** due to maintaining order.

#### **Example**
```java
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, will not be added
        
        System.out.println(set); // Output: [10, 20, 30] (insertion order)
    }
}
```
✅ **Best When**: You need a **Set** that maintains **insertion order**.

---

### **3. TreeSet (Sorted Set, Logarithmic Time Complexity)**
- Implements `Set` using a **Red-Black Tree**.
- Stores **elements in sorted order** (natural ordering or using `Comparator`).
- **Does NOT allow `null` values** (throws `NullPointerException`).
- **Operations take O(log N) time** due to tree balancing.

#### **Example**
```java
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(30);
        set.add(10);
        set.add(20);
        
        System.out.println(set); // Output: [10, 20, 30] (sorted order)
    }
}
```
✅ **Best When**: You need **sorted elements**.

---

## **Comparison of Set Implementations**
| Feature | `HashSet` | `LinkedHashSet` | `TreeSet` |
|---------|----------|---------------|----------|
| **Order** | Unordered | Insertion Order | Sorted |
| **Duplicates** | ❌ No | ❌ No | ❌ No |
| **Allows `null`** | ✅ Yes (1 `null`) | ✅ Yes (1 `null`) | ❌ No |
| **Performance** | **O(1)** (Fastest) | O(1) (Slightly Slower) | **O(log N)** (Slower) |
| **Internal Implementation** | Hash Table | Hash Table + Linked List | Red-Black Tree |

---









