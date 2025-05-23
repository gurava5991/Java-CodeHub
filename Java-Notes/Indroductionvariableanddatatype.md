## Java Variables and Data Types

Variables 
Datatypes
Type conversion

### Variables in Java

A variable is a name given to a memory location. It is the basic unit of storage in a program.

* The value stored in a variable can be changed during program execution.
* A variable is only a name given to a memory location; all operations done on the variable affect that memory location.
* In Java, all variables must be declared before use.

### How to Declare Variables

We can declare variables in Java as follows:

**Syntax:**

```Bash
DataType variableName;            // Declaration only
DataType variableName = value;    // Declaration and initialization
```

**Examples:**

```java
float simpleInterest;                    // Declaring float variable
        int time = 10, speed = 20;               // Declaring and initializing integers
char var = 'h';                          // Declaring and initializing a char
```

### Variable Naming

Java has specific rules and conventions for naming variables:

**Rules:**

* Can include letters (a-z, A-Z), numbers (0-9), underscore (\_), and dollar sign (\$).
* Cannot begin with a number.
* Cannot use reserved keywords (e.g., `else`, `for`, `while`).

**Valid Examples:**

```Bash
int age;
int _name;
double totalAmount;
String dollar$sign;
```

**Invalid Examples:**

```Bash
int 123abc;     // Starts with a number
int a#name;     // Contains a disallowed character
int else;       // Uses a reserved keyword
int total amount ; // Contains a space
```

### Data Types in Java

Data types specify the size and type of values that can be stored in a variable.

#### Java is:

* **Statically Typed**: Each variable type is known at compile time.
* **Strongly Typed**: All variables and expressions are bound to types.

### Java Data Types Categories

1. **Primitive Data Types**: boolean, char, byte, short, int, long, float, double
2. **Non-Primitive Data Types**: String, Array, etc.

### Primitive Data Types

#### 1. boolean

* **Syntax**: `boolean booleanVar;`
* **Size**: VM-dependent
* **Values**: `true`, `false`
* **Default**: `false`

**Example:**

```Bash
boolean a = false;
boolean b = true;
if (b) System.out.println("Hi Geek");
if (!a) System.out.println("Hello Geek");
```

#### 2. byte

* **Syntax**: `byte byteVar;`
* **Size**: 1 byte
* **Range**: -128 to 127
* **Default**: 0

**Example:**

```Bash
byte a = 126;
byte num = 130;
a++;  // 127
a++;  // -128 (overflow)
a++;  // -127
```

#### 3. short

* **Syntax**: `short shortVar;`
* **Size**: 2 bytes
* **Range**: -32,768 to 32,767
* **Default**: 0

#### 4. int

* **Syntax**: `int intVar;`
* **Size**: 4 bytes
* **Range**: -2,147,483,648 to 2,147,483,647
* **Default**: 0

#### 5. long

* **Syntax**: `long longVar;`
* **Size**: 8 bytes
* **Range**: -2^63 to 2^63 - 1
* **Default**: 0

#### 6. float

* **Syntax**: `float floatVar;`
* **Size**: 4 bytes
* **Precision**: \~7 decimal digits
* **Default**: 0.0f

**Example:**

```Bash
float value = 9.87f;
System.out.println(value);
```

#### 7. double

* **Syntax**: `double doubleVar;`
* **Size**: 8 bytes
* **Precision**: \~16 decimal digits
* **Default**: 0.0

#### 8. char

* **Syntax**: `char charVar;`
* **Size**: 2 bytes (16-bit Unicode)
* **Range**: '\u0000' (0) to '\uffff' (65535)
* **Default**: '\u0000'

**Example:**

```Bash
char a = 'G';
int i = 89;
byte b = 4;
short s = 56;
double d = 4.355453532;
float f = 4.7333434f;
long l = 12121;
System.out.println("char: " + a);
System.out.println("integer: " + i);
System.out.println("byte: " + b);
System.out.println("short: " + s);
System.out.println("float: " + f);
System.out.println("double: " + d);
System.out.println("long: " + l);
```

### Type Conversion in Java

Type conversion refers to converting a variable from one data type to another. There are two types:

#### 1. Implicit Type Conversion (Widening)

* Performed automatically when moving to a larger data type
* byte → short → int → long → float → double

**Example:**

```bash
int i = 100;
long l = i;        // int to long
float f = l;       // long to float
System.out.println("Int: " + i);
System.out.println("Long: " + l);
System.out.println("Float: " + f);
```

#### 2. Explicit Type Conversion (Narrowing)

* Requires casting syntax
* double → float → long → int → short → byte

**Example:**

```Bash
double d = 100.04;
long l = (long) d;      // double to long
int i = (int) l;        // long to int
System.out.println("Double: " + d);
System.out.println("Long: " + l);
System.out.println("Int: " + i);
```

---
