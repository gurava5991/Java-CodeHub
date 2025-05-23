# **Strings in Java**

## **Introduction**
A **String** in Java is a sequence of characters stored using **UTF-16 encoding**, where each character occupies **16 bits**. Java **Strings are immutable**, meaning that once a string is created, its content **cannot be changed**. Any modification creates a new string object.

---

## **Ways to Create Strings in Java**
There are **four** ways to create a string in Java:

### **1. Using a Character Array**
Strings can be created by initializing a **character array**.
```java
char[] arr = {'g', 'e', 'e', 'k', 's'};
String str = new String(arr); // Converts char array to String
System.out.println(str); // Output: geeks
```
Here, each character is stored in an array format.

### **2. Using the String Class**
Java provides a built-in `String` class to create strings.

#### **(a) Using String Literals**
```java
String s = "GeeksforGeeks";
```
- String literals are **stored in the String Pool**.
- If a string with the same value already exists, it is **not duplicated** (memory optimization).

#### **(b) Using the `new` Keyword**
```java
String s = new String("GeeksforGeeks");
```
- Creates a new **string object in heap memory**.
- Even if the same content exists in the **String Pool**, a new object is created.

### **3. Using `StringBuffer` Class**
The `StringBuffer` class **creates mutable strings** and is **thread-safe**.
```java
StringBuffer s = new StringBuffer("GeeksforGeeks");
s.append(" is awesome");
System.out.println(s); // Output: GeeksforGeeks is awesome
```
Use `StringBuffer` when **multiple threads** access the same string.

### **4. Using `StringBuilder` Class**
`StringBuilder` is similar to `StringBuffer` but **not thread-safe** (faster for single-threaded applications).
```java
StringBuilder s = new StringBuilder("GeeksforGeeks");
s.append(" is fast");
System.out.println(s); // Output: GeeksforGeeks is fast
```

---

## **Key String Methods in Java**
The `String` class provides several useful methods.

### **1. `length()` - Returns the String Length**
```java
String str = "Geeks";
System.out.println(str.length()); // Output: 5
```

### **2. `charAt(index)` - Returns Character at Index**
```java
System.out.println(str.charAt(3)); // Output: k
```

### **3. `substring(start)` and `substring(start, end)`**
- Extracts part of the string.
```java
System.out.println(str.substring(2));   // Output: eks
System.out.println(str.substring(2, 4)); // Output: ek
```

---

## **Memory Optimization in String Pool**
### **String Literals vs `new` Keyword**
When strings are created using literals, Java optimizes memory usage by storing them in the **String Pool**.
```java
String s1 = "geek";
String s2 = "geek";
System.out.println(s1 == s2); // Output: true (same reference in String Pool)

String s3 = new String("geek");
System.out.println(s1 == s3); // Output: false (different objects)
```

---

## **More String Methods**

### **4. `contains()` - Checks if String Contains a Substring**
```java
String s1 = "geeksforgeeks";
System.out.println(s1.contains("geeks")); // Output: true
```

### **5. `equals()` - Compares Two Strings (Case-Sensitive)**
```java
String s1 = "GeeksforGeeks";
String s2 = "GeeksforGeeks";
System.out.println(s1.equals(s2)); // Output: true
```

### **6. `compareTo()` - Lexicographical Comparison**
```java
String s1 = "geeksforgeeks";
String s2 = "for";
int res = s1.compareTo(s2);
System.out.println(res > 0 ? "s1 Greater" : res < 0 ? "s1 Smaller" : "Same"); // Output: s1 Greater
```

### **7. `indexOf()` - Returns First Occurrence Index**
```java
String s1 = "geeksforgeeks";
System.out.println(s1.indexOf("geek")); // Output: 0
```

---

## **String Concatenation**
Concatenating two strings can be done in multiple ways:

### **8. Using `+` Operator**
```java
String s1 = "geeks";
s1 = s1 + "forgeeks";
System.out.println(s1); // Output: geeksforgeeks
```

### **9. Using `concat()` Method**
```java
String s1 = "geeks";
s1 = s1.concat("forgeeks");
System.out.println(s1); // Output: geeksforgeeks
```

### **10. Using `StringBuilder` (Efficient for Concatenation in Loops)**
```java
StringBuilder sb = new StringBuilder("geeks");
sb.append("forgeeks");
System.out.println(sb); // Output: geeksforgeeks
```

---

# Java String Methods with Explanations and Examples

## 1. `length()`
**Returns**: The number of characters in the string.

```java
String str = "GeeksforGeeks";
System.out.println(str.length()); // Output: 13
```

## 2. `charAt(int index)`
**Returns**: The character at the specified index.

```java
String str = "GeeksforGeeks";
System.out.println(str.charAt(3)); // Output: k
```

## 3. `substring(int index)`
**Returns**: A substring starting from the specified index.

```java
String str = "GeeksforGeeks";
System.out.println(str.substring(3)); // Output: ksforGeeks
```

## 4. `substring(int start, int end)`
**Returns**: A substring from the `start` index to `end - 1`.

```java
String str = "GeeksforGeeks";
System.out.println(str.substring(2, 5)); // Output: eks
```

## 5. `concat(String str)`
**Returns**: A new string that appends `str` to the end of the existing string.

```java
String s1 = "Geeks";
String s2 = "forGeeks";
String output = s1.concat(s2);
System.out.println(output); // Output: GeeksforGeeks
```

## 6. `indexOf(String str)`
**Returns**: The index of the first occurrence of the specified substring.

```java
String s = "Learn Share Learn";
System.out.println(s.indexOf("Share")); // Output: 6
```

## 7. `indexOf(String str, int fromIndex)`
**Returns**: The index of the first occurrence of `str`, starting from `fromIndex`.

```java
String s = "Learn Share Learn";
System.out.println(s.indexOf("ea", 3)); // Output: 13
```

## 8. `lastIndexOf(String str)`
**Returns**: The index of the last occurrence of the specified substring.

```java
String s = "Learn Share Learn";
System.out.println(s.lastIndexOf("a")); // Output: 14
```

## 9. `equals(Object anotherObject)`
**Returns**: `true` if both strings are equal, `false` otherwise.

```java
System.out.println("Geeks".equals("Geeks")); // Output: true
System.out.println("Geeks".equals("geeks")); // Output: false
```

## 10. `equalsIgnoreCase(String anotherString)`
**Returns**: `true` if both strings are equal, ignoring case differences.

```java
System.out.println("Geeks".equalsIgnoreCase("Geeks")); // Output: true
System.out.println("Geeks".equalsIgnoreCase("geeks")); // Output: true
```

## 11. `compareTo(String anotherString)`
**Returns**: A value indicating lexicographical comparison:
- `< 0` if this string comes before anotherString.
- `= 0` if they are equal.
- `> 0` if this string comes after anotherString.

```java
String s1 = "apple";
String s2 = "banana";
System.out.println(s1.compareTo(s2)); // Output: -1 (because apple < banana lexicographically)
```

## 12. `compareToIgnoreCase(String anotherString)`
**Returns**: Similar to `compareTo()`, but case is ignored.

```java
String s1 = "Apple";
String s2 = "apple";
System.out.println(s1.compareToIgnoreCase(s2)); // Output: 0
```

## 13. `toLowerCase()`
**Returns**: A new string with all characters converted to lowercase.

```java
String word = "HeLLo";
System.out.println(word.toLowerCase()); // Output: hello
```

## 14. `toUpperCase()`
**Returns**: A new string with all characters converted to uppercase.

```java
String word = "HeLLo";
System.out.println(word.toUpperCase()); // Output: HELLO
```

## 15. `trim()`
**Returns**: A copy of the string with leading and trailing whitespaces removed.

```java
String word = "  Learn Share Learn  ";
System.out.println(word.trim()); // Output: Learn Share Learn
```

## 16. `replace(char oldChar, char newChar)`
**Returns**: A new string replacing all occurrences of `oldChar` with `newChar`.

```java
String s1 = "feeksforfeeks";
System.out.println(s1.replace('f', 'g')); // Output: geeksgorgeeks
```

---
**Java String, StringBuilder, and StringBuffer**

## **1. String Class**
The **String** class in Java represents an **immutable** sequence of characters.
Every modification creates a new String object instead of modifying the existing one.

### **Common Methods in String Class:**

1. **length()** - Returns the number of characters in the string.
   ```java
   String str = "GeeksforGeeks";
   System.out.println(str.length()); // Output: 13
   ```

2. **charAt(int index)** - Returns the character at the specified index.
   ```java
   System.out.println(str.charAt(3)); // Output: 'k'
   ```

3. **substring(int start)** - Returns the substring from the specified index to the end.
   ```java
   System.out.println(str.substring(3)); // Output: "ksforGeeks"
   ```

4. **substring(int start, int end)** - Returns substring from `start` to `end-1` index.
   ```java
   System.out.println(str.substring(2, 5)); // Output: "eks"
   ```

5. **concat(String str)** - Concatenates the given string.
   ```java
   String s1 = "Geeks";
   String s2 = "forGeeks";
   System.out.println(s1.concat(s2)); // Output: "GeeksforGeeks"
   ```

6. **indexOf(String str)** - Returns the index of the first occurrence of the specified substring.
   ```java
   String s = "Learn Share Learn";
   System.out.println(s.indexOf("Share")); // Output: 6
   ```

7. **lastIndexOf(String str)** - Returns the index of the last occurrence of the specified substring.
   ```java
   System.out.println(s.lastIndexOf("a")); // Output: 14
   ```

8. **equals(Object obj)** - Compares this string to the specified object.
   ```java
   System.out.println("Geeks".equals("Geeks")); // Output: true
   ```

9. **equalsIgnoreCase(String anotherString)** - Compares two strings ignoring case differences.
   ```java
   System.out.println("Geeks".equalsIgnoreCase("geeks")); // Output: true
   ```

10. **toLowerCase()** - Converts all characters to lowercase.
    ```java
    System.out.println("HeLLo".toLowerCase()); // Output: "hello"
    ```

11. **toUpperCase()** - Converts all characters to uppercase.
    ```java
    System.out.println("HeLLo".toUpperCase()); // Output: "HELLO"
    ```

12. **trim()** - Removes whitespaces from both ends.
    ```java
    System.out.println("  Learn Share Learn  ".trim()); // Output: "Learn Share Learn"
    ```

---
## **2. StringBuilder Class**
The **StringBuilder** class is a **mutable** sequence of characters. It is faster than **StringBuffer**, but **not thread-safe**.

### **Common Methods in StringBuilder Class:**

1. **append(String str)** - Adds a string at the end.
   ```java
   StringBuilder sb = new StringBuilder("Hello");
   sb.append(" World");
   System.out.println(sb); // Output: "Hello World"
   ```

2. **insert(int offset, String str)** - Inserts a string at a specified position.
   ```java
   sb.insert(5, " Java");
   System.out.println(sb); // Output: "Hello Java World"
   ```

3. **setCharAt(int index, char ch)** - Modifies the character at the specified index.
   ```java
   sb.setCharAt(6, 'J');
   System.out.println(sb); // Output: "Hello Jaba World"
   ```

4. **delete(int start, int end)** - Removes characters between `start` and `end-1`.
   ```java
   sb.delete(6, 10);
   System.out.println(sb); // Output: "Hello World"
   ```

5. **reverse()** - Reverses the sequence.
   ```java
   sb.reverse();
   System.out.println(sb); // Output: "dlroW olleH"
   ```

6. **capacity()** - Returns the current capacity of the StringBuilder object.
   ```java
   System.out.println(sb.capacity()); // Default: 16 + initial length
   ```

---
## **3. StringBuffer Class**
The **StringBuffer** class is similar to **StringBuilder**, but it is **thread-safe** as it is synchronized.

### **Example:**
```java
StringBuffer sbf = new StringBuffer("Geeks");
sbf.append("ForGeeks");
System.out.println(sbf); // Output: "GeeksForGeeks"
```

### **Comparison of String, StringBuilder, and StringBuffer**

| Feature          | String        | StringBuilder  | StringBuffer   |
|-----------------|--------------|---------------|---------------|
| Mutability      | Immutable    | Mutable       | Mutable       |
| Thread Safety   | Yes          | No            | Yes           |
| Performance     | Slow         | Fast          | Slower (due to synchronization) |
| Synchronization | Not needed   | Not provided  | Provided      |

---
## **Example Program:**
```java
class GFG {
    public static void main (String[] args) {
        StringBuilder sb = new StringBuilder("dcba");

        // Reverse the StringBuilder
        sb.reverse();
        System.out.println(sb); // Output: "abcd"

        // Append a string
        sb.append("efg");
        System.out.println(sb); // Output: "abcdefg"

        // Replace character at index 1
        sb.setCharAt(1, 'h');
        System.out.println(sb); // Output: "ahcdefg"

        // Delete characters from index 0 to 1
        sb.delete(0, 2);
        System.out.println(sb); // Output: "cdefg"

        // Insert string at index 1
        sb.insert(1, "efg");
        System.out.println(sb); // Output: "cefgdefg"
    }
}
```

### **Output:**
```
abcd
abcdefg
ahcdefg
cdefg
cefgdefg
```

---


