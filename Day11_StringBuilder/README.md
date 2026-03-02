
# Day 11 – StringBuilder & StringBuffer (Java)

## Topics Covered

* Why `String` is slow for modifications
* What is `StringBuilder`
* Difference between `String` and `StringBuilder`
* Using `append()` and `reverse()`
* When to use `Scanner` with `StringBuilder`
* Basic idea of `StringBuffer`

---

## Why Not Use String for Repeated Modifications?

* `String` in Java is **immutable**
* Every modification creates a **new object**
* Repeated changes inside loops are **slow and memory-heavy**

Example problem:

```java
str = str + "a";   // creates a new String object every time
```

---

## What is StringBuilder?

* `StringBuilder` is a **mutable** string
* Content can be modified **without creating new objects**
* Faster than `String` for frequent changes

Simple meaning:

> StringBuilder = string that can be changed

---

## Creating a StringBuilder

```java
StringBuilder sb = new StringBuilder();
```

or

```java
StringBuilder sb = new StringBuilder("hello");
```

---

## append() Method

* Adds content at the end
* Most used method in `StringBuilder`

```java
sb.append("Java");
```

---

## reverse() Method

* Reverses the entire content
* Efficient and interview-friendly

```java
sb.reverse();
```

---

## Using Scanner with StringBuilder

* `Scanner` is used for **manual input**
* `StringBuilder` is used for **processing the string**
* They work together, but serve different purposes

Flow:

```
Input (Scanner) → Processing (StringBuilder) → Output
```

---

## String vs StringBuilder

| Feature     | String                 | StringBuilder       |
| ----------- | ---------------------- | ------------------- |
| Mutable     | ❌ No                   | ✅ Yes               |
| Performance | Slow for changes       | Fast                |
| Thread-safe | ✅ Yes                  | ❌ No                |
| Use case    | Comparisons, constants | Heavy modifications |

---

## StringBuilder vs StringBuffer

* `StringBuilder` → Not thread-safe, **faster**
* `StringBuffer` → Thread-safe, **slower**

📌 Most interview problems prefer **StringBuilder**.

---

## Programs Implemented

### Append with Manual Input

* Takes input using `Scanner`
* Appends extra text using `StringBuilder`

**Time Complexity:** O(n)

---

### Reverse String Using StringBuilder

* Uses `reverse()` method
* Efficient approach

**Time Complexity:** O(n)

---

### Build Sentence Using StringBuilder

* Appends multiple words
* Demonstrates mutability advantage

**Time Complexity:** O(n)

---

## Common Mistakes

* Using `String` inside loops for concatenation
* Thinking `StringBuilder` can take input (it cannot)
* Forgetting that `Scanner` is only for input
* Confusing `StringBuilder` with `StringBuffer`

---

## Interview Takeaways

* Use `StringBuilder` when string changes frequently
* Use `String` when content is fixed
* Always separate **input** and **processing**
* Understand mutability clearly

---
