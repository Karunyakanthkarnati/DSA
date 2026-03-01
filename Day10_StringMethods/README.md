# Day 10 – String Methods (Java)

## Topics Covered

* Core String methods in Java
* Case-insensitive string comparison
* Palindrome check using Two Pointers
* Substring extraction
* Handling edge cases

---

## String Methods

### `length()`

* Returns the number of characters in a string
* It is a **method**, not a variable

**Example:**

```java
str.length();
```

---

### `charAt(index)`

* Returns the character at the given index
* Indexing is **0-based**

**Example:**

```java
str.charAt(0);                 // first character
str.charAt(str.length() - 1);  // last character
```

⚠️ Always check for an empty string before using `charAt()`.

---

### `equals()` vs `==`

* `==` compares **memory reference**
* `equals()` compares **string content**

✅ Always use `equals()` for comparing strings.

---

### `substring(start, end)`

* Extracts part of a string
* `start` → inclusive
* `end` → exclusive

**Example:**

```java
str.substring(0, 4);
```

**Rule:**

```
0 ≤ start < end ≤ length
```

---

### `toLowerCase()` / `toUpperCase()`

* Used for **case-insensitive comparisons**

**Example:**

```java
str = str.toLowerCase();
```

---

### `trim()`

* Removes **leading and trailing spaces**
* Does **NOT** remove spaces in the middle

**Example:**

```java
str = str.trim();
```

---

## Programs Implemented

### First & Last Character

* Prints the first and last character of a string
* Handles empty string safely

**Time Complexity:** `O(1)`

---

### Palindrome (Ignoring Case)

* Converts string to lowercase
* Uses **Two Pointer technique**
* Compares characters from both ends

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

### Print All Substrings

* Uses nested loops
* Prints all possible substrings of a string

**Example:**

```
Input: abc
Output:
a
ab
abc
b
bc
c
```

**Time Complexity:** `O(n²)`

---

## Common Mistakes

* Using `==` instead of `equals()`
* Accessing `charAt(0)` on an empty string
* Forgetting that `substring()` end index is exclusive
* Incorrect loop boundaries

---

## Edge Cases Handled

* Empty string
* Single character
* Mixed case strings
* Strings with leading and trailing spaces

---

## Interview Takeaways

* String methods look simple but hide common traps
* Two Pointers improve efficiency
* Boundary conditions are critical
* Always analyze time complexity

---
