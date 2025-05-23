**Java Arrays Class**

The `Arrays` class in the `java.util` package is an essential utility class for array manipulation in Java. It provides static methods to perform various operations such as sorting, searching, comparing, and converting arrays. Unlike collections, this class works directly with native Java arrays. Since all methods are static, they can be invoked directly using the class name.

---

### Example: Demonstrating `equals()` and `toString()` Methods

```java
// Java program to demonstrate Arrays class
import java.util.Arrays;

class GfG {
    public static void main(String[] args) {
        // Declare and initialize arrays
        int[] a = { 10, 20, 30 };
        int[] b = { 10, 20, 30 };

        // Compare arrays
        System.out.println(Arrays.equals(a, b));  // Output: true

        // Convert array to string
        System.out.println(Arrays.toString(a));   // Output: [10, 20, 30]
    }
}
```

**Output:**

```
true
[10, 20, 30]
```

---

### Important Methods of Arrays Class

#### 1. `asList()`

Converts an array to a fixed-size list backed by the original array.

```java
String[] fruits = {"Apple", "Banana", "Mango"};
List<String> list = Arrays.asList(fruits);
```

#### 2. `binarySearch(array, key)`

Performs binary search on a sorted array to find the specified element.

```java
int[] arr = {10, 20, 30, 40, 50};
int index = Arrays.binarySearch(arr, 30);  // Output: 2
```

#### 3. `equals(array1, array2)`

Checks if two arrays are equal in length and content.

```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(Arrays.equals(a, b));  // Output: true
```

#### 4. `mismatch(array1, array2)`

Returns the index of the first differing element or -1 if identical.

```java
int[] a = {10, 20, 30, 40};
int[] b = {10, 20, 30};
int mismatchIndex = Arrays.mismatch(a, b);
System.out.println("Mismatch at index: " + mismatchIndex);  // Output: 3
```

#### 5. `compare(array1, array2)`

Lexicographically compares two arrays.

```java
int[] a = {10, 20, 40};
int[] b = {10, 20, 30};
System.out.println(Arrays.compare(a, b));  // Output: positive integer
```

#### 6. `fill(array, value)`

Fills all elements of the array with a specified value.

```java
int[] a = new int[5];
Arrays.fill(a, 7);  // All elements will be 7
```

#### 7. `sort(array)`

Sorts the array in ascending order.

```java
int[] arr = {5, 2, 8, 1};
Arrays.sort(arr);  // arr becomes [1, 2, 5, 8]
```

#### 8. `stream(array)`

Converts an array into a sequential stream for functional-style operations.

```java
int[] arr = {1, 2, 3};
Arrays.stream(arr).forEach(System.out::println);
```

#### 9. `toString(array)`

Returns a string representation of the array.

```java
int[] arr = {1, 2, 3};
System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3]
```

---


#### 1. Introduction

The `java.util.Arrays` class in Java provides a collection of static methods for manipulating arrays. These methods support operations such as searching, comparing, converting, and transforming arrays of both primitive and non-primitive types. This document covers the following key methods: `binarySearch`, `equals`, `mismatch`, `compare`, `toString`, `asList`, and `fill`. Each section includes method signatures, parameters, return values, important notes, and example code with outputs.

---

### ... (Sections 2 through 7 as extracted above) ...

---

### 8 Arrays.fill()

#### 8.1 Description

The `fill()` method is used to initialize or reset arrays with a specific value. It is available in both `Arrays` (for arrays) and `Collections` (for lists implementing `List` interface like `ArrayList`, `Vector`, etc.).

#### 8.2 Method Signatures

##### Arrays Class:

```java
static void fill(int[] a, int val)
static void fill(int[] a, int fromIndex, int toIndex, int val)
static void fill(Object[] a, Object val)
static void fill(Object[] a, int fromIndex, int toIndex, Object val)
```

##### Collections Class:

```java
static <T> void fill(List<? super T> list, T obj)
```

---

#### 8.3 Examples

**Example 1: Fill entire array**

```java
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        Arrays.fill(arr, -1);
        System.out.println(Arrays.toString(arr));
    }
}
```

**Output:**
`[-1, -1, -1, -1]`

---

**Example 2: Fill part of the array**

```java
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        Arrays.fill(arr, 1, 3, -1);
        System.out.println(Arrays.toString(arr));
    }
}
```

**Output:**
`[10, -1, -1, 40]`

---

**Example 3: Fill 2D array**

```java
import java.util.Arrays;

class GfG {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        for (int[] row : arr) {
            Arrays.fill(row, 1);
            System.out.print(Arrays.toString(row));
        }
    }
}
```

**Output:**
`[1, 1, 1, 1][1, 1, 1, 1][1, 1, 1, 1]`

---

**Example 4: Fill a List using Collections.fill()**

```java
import java.util.*;

class GfG {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        Collections.fill(list, -1);
        System.out.println(list);
    }
}
```

**Output:**
`[-1, -1, -1, -1]`

---

#### 8.4 Summary

The `fill()` method is a quick and efficient way to initialize or reset arrays and lists with a specific value, simplifying data manipulation in Java.

---




