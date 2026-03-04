# Day 12 – Prefix Sum (Arrays)

## Topics Covered

* Prefix Sum concept
* Building a prefix array
* Range sum queries
* Counting subarrays
* Subarrays divisible by **K**

Prefix Sum helps reduce repeated sum calculations from **O(n)** to **O(1)** after preprocessing.

---

# What is Prefix Sum?

Prefix sum stores the **cumulative sum of elements** up to each index.

Example array

```
[2, 4, 6, 8, 10]
```

Prefix array

```
[2, 6, 12, 20, 30]
```

Meaning

```
prefix[i] = sum of elements from index 0 to i
```

Formula

```
prefix[i] = prefix[i-1] + arr[i]
```

---

# Range Sum Using Prefix Sum

To find the sum of elements from **L to R**

If `L == 0`

```
sum = prefix[R]
```

Else

```
sum = prefix[R] - prefix[L-1]
```

Time complexity per query becomes **O(1)**.

---

# Practice Problems Implemented

## 1. Prefix Array Build

Build and print the prefix sum array from the given array.

Concept used

```
prefix[i] = prefix[i-1] + arr[i]
```

Time Complexity

```
O(n)
```

---

## 2. Range Sum Queries

Given an array and several queries `(L, R)`, print the sum of elements from index **L to R**.

Uses prefix sum to answer queries efficiently.

Time Complexity

```
Prefix build → O(n)
Each query → O(1)
```

---

## 3. Subarray Equal to Total Array Sum

Given queries `(L, R)`, count how many queried subarrays have sum equal to the **total array sum**.

Total sum

```
prefix[n-1]
```

Concept used

```
sum(L,R) = prefix[R] - prefix[L-1]
```

---

## 4. Subarrays Divisible by K

Count how many subarrays have sum divisible by **K**.

Approach used here

```
Brute force + Prefix Sum
```

Steps

```
1. Fix starting index i
2. Extend ending index j
3. Compute sum using prefix array
4. Check if sum % K == 0
```

Time Complexity

```
O(n²)
```

Later this problem can be optimized to **O(n)** using **HashMap**.

---

# Key Learnings

* Prefix Sum allows fast range sum queries.
* Preprocessing the array once can reduce repeated work.
* Prefix arrays help solve many subarray problems.
* Several advanced interview problems combine **Prefix Sum + HashMap**.

---

# Time Complexity Summary

| Operation            | Complexity |
| -------------------- | ---------- |
| Build prefix array   | O(n)       |
| Range sum query      | O(1)       |
| Subarray brute force | O(n²)      |

---

# Next Topic

**Day 13 – Kadane's Algorithm**

Find the **maximum subarray sum** efficiently in **O(n)** time.

---

If you want, I can also show you how your **GitHub repo should look visually (like a clean professional DSA repo)** so recruiters can easily browse your work.
