# Java8 Features 
- [Functional Interfaces](#functional-interfaces)
<b>[Lambda Expressions](#lambda-expressions)</b>
Method References
Default Methods	Interfaces can have method implementations
Stream API	Efficient data processing
Optional	Avoids NullPointerException
Date & Time API	Improved date handling
Collectors	Process & collect stream results

# Functional Interfaces 

🔹 A Functional Interface contains exactly one abstract method.🔹 Examples: Runnable, Comparator, Supplier, Consumer.

📌 Example
```java
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello, Java 8!");
        g.sayHello();
    }
}
```

✅ Ensures only one method is present in functional interfaces.

# Lambda Expressions 
Lambda expressions were introduced in **Java 8** to provide a concise way to write **anonymous functions** (functions without a name). They enable **functional programming** by allowing methods to be passed as arguments.

---

## **🔹 Syntax of Lambda Expression**
```java
(parameters) -> { body }
```
- **`parameters`** → Input to the function.
- **`->`** → Lambda operator (arrow token).
- **`body`** → Function logic.

---

## **1️⃣ Lambda Expression with No Parameters**
A lambda expression **without parameters** must have empty parentheses.

### **💡 Example: No Parameters & Void Return**
```java
@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello, Lambda!");
        greet.sayHello();
    }
}
```
✅ **Output:**
```
Hello, Lambda!
```

---

## **2️⃣ Lambda Expression with a Single Parameter**
When there is **only one parameter**, parentheses are optional.

### **💡 Example: Single Parameter & Void Return**
```java
@FunctionalInterface
interface Printer {
    void print(String message);
}

public class Main {
    public static void main(String[] args) {
        Printer printer = message -> System.out.println("Message: " + message);
        printer.print("Hello, Java!");
    }
}
```
✅ **Output:**
```
Message: Hello, Java!
```

---

## **3️⃣ Lambda Expression with Multiple Parameters**
When there are **multiple parameters**, parentheses are required.

### **💡 Example: Multiple Parameters & Return Type**
```java
@FunctionalInterface
interface Adder {
    int add(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Adder sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(5, 10));
    }
}
```
✅ **Output:**
```
Sum: 15
```

---

## **4️⃣ Lambda Expression with a Block (Multiple Statements)**
If the **lambda body has multiple statements**, you must use `{}`.

### **💡 Example: Multiple Statements in Lambda**
```java
@FunctionalInterface
interface Calculator {
    int operate(int x, int y);
}

public class Main {
    public static void main(String[] args) {
        Calculator multiply = (x, y) -> {
            System.out.println("Multiplying " + x + " and " + y);
            return x * y;
        };
        System.out.println("Result: " + multiply.operate(4, 3));
    }
}
```
✅ **Output:**
```
Multiplying 4 and 3
Result: 12
```

---

## **5️⃣ Lambda Expression with Different Return Types**
### **💡 Example: Lambda Returning a String**
```java
@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class Main {
    public static void main(String[] args) {
        StringProcessor toUpperCase = str -> str.toUpperCase();
        System.out.println(toUpperCase.process("lambda"));
    }
}
```
✅ **Output:**
```
LAMBDA
```

---

## **🔥 Interview Questions on Lambda Expressions (Product-Based Companies)**
### **1. Amazon Interview Question**
**Q:** What is the advantage of using Lambda expressions in Java 8?  
**A:**
- Reduces **boilerplate code** for anonymous classes.
- Improves **readability** and **maintainability**.
- Enables **functional programming** with **Streams API**.

---

### **2. Google Interview Question**
**Q:** Can lambda expressions access variables from the enclosing scope?  
**A:** Yes, lambda expressions can access **effectively final** variables from the enclosing method.

```java
public class Test {
    public static void main(String[] args) {
        String prefix = "Hello, ";
        MyInterface greet = name -> prefix + name; // Uses prefix variable
        System.out.println(greet.greet("Google"));
    }
}

interface MyInterface {
    String greet(String name);
}
```
✅ **Output:**
```
Hello, Google
```
🔹 **Note:** `prefix` must be **effectively final** (unchanged after initialization).

---

### **3. Microsoft Interview Question**
**Q:** How are lambda expressions different from anonymous classes?  
**A:**
| Feature            | Lambda Expression | Anonymous Class |
|--------------------|------------------|----------------|
| **Boilerplate Code** | Minimal          | More verbose   |
| **Performance**     | Faster (less bytecode) | Slightly slower |
| **Use Case**        | Functional interfaces | Multiple methods |

---

### **4. Facebook Interview Question**
**Q:** Can a lambda expression implement multiple methods?  
**A:** No, **Lambda expressions work only with functional interfaces** (interfaces with **a single abstract method**).

---

### **5. Uber Interview Question**
**Q:** How do you handle exceptions inside a lambda expression?  
**A:** Use a **try-catch block** inside the lambda.

```java
@FunctionalInterface
interface SafeDivide {
    int divide(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        SafeDivide safeDivide = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero");
                return 0;
            }
        };

        System.out.println(safeDivide.divide(10, 2)); // 5
        System.out.println(safeDivide.divide(10, 0)); // Error: Division by zero
    }
}
```

## **🚀 Java 8 Streams - A Deep Dive with Examples**

### **📌 Introduction to Java Streams**
Java **Streams** were introduced in **Java 8** to provide a **functional programming approach** to working with collections.  
Instead of using **loops (external iteration)**, streams allow **internal iteration**, reducing boilerplate code and improving efficiency.

---

## **🔥 Why Use Streams?**
Before Java 8, collections were processed using loops, requiring **explicit iteration**. Streams **simplify** this by enabling:  
✔ **No storage** – Streams do **not** store data, they process elements **on the fly**.  
✔ **Pipelining** – Multiple operations (filter, map, sort) can be **chained** together.  
✔ **Lazy execution** – Operations **execute only when needed**.  
✔ **Parallel execution** – Can **run on multiple CPU cores** for better performance.  
✔ **Multiple data sources** – Supports **Lists, Arrays, Files, and Streams**.

---

## **🚀 Understanding Stream Components**
A **Java Stream** consists of **three main parts**:

### **1️⃣ Source**
Where the data comes from (**List, Array, File, etc.**).
### **2️⃣ Intermediate Operations (Transform Data)**
Functions like `filter()`, `map()`, `sorted()` modify the data and **return a stream**.  
👉 **These are lazy operations**, executed **only when a terminal operation is applied**.
### **3️⃣ Terminal Operation (Produces Output)**
Operations like `collect()`, `forEach()`, `count()` **end the stream pipeline**.  
👉 **After a terminal operation, the stream is closed**.

---

## **💡 Java Stream Example**
### **🎯 Example: Filtering Even Numbers from a List**
```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 20, 30, 8, 7);

        numbers.stream()
               .filter(x -> x % 2 == 0)  // ✅ Select even numbers
               .filter(x -> x > 10)      // ✅ Select numbers > 10
               .forEach(System.out::println); // ✅ Print result
    }
}
```
### **🖥️ Output:**
```
20
30
```
---

## **🔍 How Streams Work Internally?**
### **🔹 Step-by-Step Processing**
1️⃣ **Each element is processed one by one, step-by-step.**  
2️⃣ **Execution stops as soon as the terminal operation completes.**  
3️⃣ **Lazy Evaluation:** Operations **execute only when required**.

### **🎯 Example: Stopping Early with `findFirst()`**
```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 20, 30, 8, 7);

        int firstEven = numbers.stream()
                               .filter(x -> x % 2 == 0) // ✅ Select even numbers
                               .findFirst()             // ✅ Stop after first match
                               .orElse(-1);             // ✅ Default value if no match

        System.out.println(firstEven);
    }
}
```
### **🖥️ Output:**
```
10
```
👉 **`findFirst()` stops processing once it finds the first match, making it more efficient.**

---

## **⚡ Parallel Stream Processing**
Parallel processing **uses multiple CPU cores** for faster execution.

### **🎯 Example: Parallel Execution**
```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 20, 30, 8, 7);

        numbers.parallelStream()
               .filter(x -> x % 2 == 0)
               .filter(x -> x > 10)
               .forEach(System.out::println);
    }
}
```
💡 **Parallel processing is efficient for large datasets, but for small collections, regular streams are better.**

---

## **📌 Creating Streams from Different Sources**
Streams can be **created from multiple sources**, including:

| **Source**        | **Example** |
|------------------|------------|
| **Collections** | `list.stream()` |
| **Arrays** | `Arrays.stream(array)` |
| **File Lines** | `Files.lines(Paths.get("file.txt"))` |
| **Custom Generators** | `Stream.of(1, 2, 3, 4)` |

---

## **📌 Examples for Different Stream Sources**
### **1️⃣ Creating a Stream from a List**
```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
```
### **🖥️ Output:**
```
Alice
```

---

### **2️⃣ Creating a Stream from an Array**
```java
import java.util.Arrays;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};

        Stream<String> stream = Arrays.stream(fruits);
        
        stream.forEach(System.out::println);
    }
}
```
### **🖥️ Output:**
```
Apple
Banana
Mango
Orange
```

---

### **3️⃣ Creating a Stream from a File**
```java
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("sample.txt"));

        lines.forEach(System.out::println);

        lines.close(); // Close the stream after use
    }
}
```
### **🖥️ Output (Contents of sample.txt file):**
```
Hello World!
Java Streams are awesome!
```

---

### **4️⃣ Creating a Stream from `Stream.of()`**
```java
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Stream.of("One", "Two", "Three", "Four")
              .forEach(System.out::println);
    }
}
```
### **🖥️ Output:**
```
One
Two
Three
Four
```

---
## **🔥 Java Streams Hierarchy & Methods Explained with Examples**

Java **Streams API**, introduced in **Java 8**, provides a structured and efficient way to process **collections of data** using **functional programming concepts**.

### **1️⃣ Java Stream Hierarchy**
Streams are built on a **hierarchy of interfaces**, which provide methods for data manipulation.

#### **📌 BaseStream (Top-Level Interface)**
- **Parent interface** for all stream types.
- Provides **core methods** for stream control.

#### **📌 Four Subinterfaces of BaseStream**
| **Stream Type** | **Purpose** |
|---------------|------------|
| `IntStream` | Works with `int` values |
| `LongStream` | Works with `long` values |
| `DoubleStream` | Works with `double` values |
| `Stream<T>` | Generic stream for **objects** (most commonly used) |

---

## **2️⃣ Common Methods in Stream API**
The following methods are applicable to **all stream types** (`Stream<T>`, `IntStream`, `LongStream`, `DoubleStream`).

### **✅ `filter(Predicate<T>)` - Filtering Elements**
Filters elements based on a condition.

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "David");

        // Filter names starting with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);
    }
}
```
**🖥️ Output:**
```
Alice
Anna
```

---

### **✅ `forEach(Consumer<T>)` - Iterating Over Elements**
Performs an action on each element.

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        // Print each element
        numbers.stream()
               .forEach(System.out::println);
    }
}
```
**🖥️ Output:**
```
10
20
30
40
```

---

### **✅ `min(Comparator<T>) / max(Comparator<T>)` - Finding Min/Max**
Finds the minimum or maximum element.

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 10, 15, 2, 30);

        int min = numbers.stream().min(Integer::compare).get();
        int max = numbers.stream().max(Integer::compare).get();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
```
**🖥️ Output:**
```
Min: 2
Max: 30
```

---

### **✅ `skip(long n)` - Skipping First N Elements**
Skips the first **N** elements in the stream.

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
               .skip(2)
               .forEach(System.out::println);
    }
}
```
**🖥️ Output:**
```
3
4
5
6
```
👉 **First 2 elements (`1,2`) are skipped.**

---

### **✅ `findFirst()` - Getting the First Element**
Retrieves the **first element** in the stream.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Michael", "Sarah");

        String firstName = names.stream()
                                .findFirst()
                                .orElse("No Name");

        System.out.println(firstName);
    }
}
```
**🖥️ Output:**
```
John
```

---

### **✅ `count()` - Counting Elements**
Returns the number of elements.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Cherry");

        long count = names.stream().count();

        System.out.println("Total elements: " + count);
    }
}
```
**🖥️ Output:**
```
Total elements: 3
```

---

### **✅ `distinct()` - Removing Duplicates**
Removes duplicate elements.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 4, 5);

        numbers.stream()
               .distinct()
               .forEach(System.out::println);
    }
}
```
**🖥️ Output:**
```
1
2
3
4
5
```

---

### **✅ `sorted()` - Sorting Elements**
Sorts elements in ascending order.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 8, 2, 3);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}
```
**🖥️ Output:**
```
1
2
3
5
8
```

---

### **✅ `reduce(BinaryOperator<T>)` - Aggregating Elements**
Reduces the elements to **a single value**.

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                         .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);
    }
}
```
**🖥️ Output:**
```
Sum: 15
```

---

### **✅ `collect(Collector<T>)` - Collecting Elements into a List**
Converts elements into a **List, Set, or Map**.

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> nameList = names.stream()
                                     .collect(Collectors.toList());

        System.out.println(nameList);
    }
}
```
**🖥️ Output:**
```
[Alice, Bob, Charlie]
```

---

## **3️⃣ Intermediate vs Terminal Operations**
| **Operation Type** | **Returns Stream?** | **Examples** |
|-------------------|--------------------|-------------|
| **Intermediate** | ✅ Yes | `filter()`, `map()`, `sorted()` |
| **Terminal** | ❌ No | `collect()`, `forEach()`, `reduce()` |

---

## **4️⃣ Special Methods for Numeric Streams**
**`IntStream`, `LongStream`, `DoubleStream`** provide extra methods:

### **✅ `sum()` - Sum of Elements**
```java
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        int sum = IntStream.of(1, 2, 3, 4, 5).sum();
        System.out.println(sum);
    }
}
```
**🖥️ Output:**
```
15
```

---

### **✅ `average()` - Average Value**
```java
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        double avg = IntStream.of(1, 2, 3, 4, 5).average().getAsDouble();
        System.out.println(avg);
    }
}
```
**🖥️ Output:**
```
3.0
```

---

### **✅ `boxed()` - Convert Primitive Stream to Object Stream**
```java
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Stream<Integer> objStream = IntStream.of(1, 2, 3).boxed();
        objStream.forEach(System.out::println);
    }
}
```
**🖥️ Output:**
```
1
2
3
```

---

