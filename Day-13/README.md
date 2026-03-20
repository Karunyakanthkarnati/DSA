# 📅 Day 13 — Kadane’s Algorithm

## 📌 Topic

Maximum Subarray Sum (Kadane’s Algorithm)

---

## 🧠 Concept

Kadane’s Algorithm is used to find the **maximum sum of a contiguous subarray** in an array.

### 🔑 Key Idea:

* If the current sum becomes **negative**, discard it
* Continue with a new subarray
* Keep tracking the **maximum sum**

---

### 🗣 Telugu Explanation:

* Subarray sum calculate chesthu veltham
* Negative ayithe reset chestham (0 ki)
* Max value ni track chestham

👉 **Negative ni carry cheyyakudadhu**

---

## ⚙️ Approach

1. Initialize:

   * `currentSum = 0`
   * `maxSum = Integer.MIN_VALUE`

2. Traverse the array:

   * Add element to `currentSum`
   * Update `maxSum`
   * If `currentSum < 0`, reset to 0

---

## ⏱ Complexity

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n)       |
| Space | O(1)       |

---

## 📂 Problems Covered

### 🟢 Easy

**1. Maximum Subarray Sum**

* Basic Kadane’s Algorithm

---

### 🟡 Medium

**2. Max Subarray Sum + Length**

* Track subarray indices
* Calculate length

---

### 🔴 Hard

**3. Circular Subarray Sum**

* Use:

  * Normal Kadane
  * Total Sum - Minimum Subarray

---

## 🚀 Key Insights

* Do not carry negative sums forward
* Always handle **all-negative arrays**
* Kadane is a **greedy approach**

---

## ⚠️ Edge Cases

* All elements negative
* Single element array
* Large input values

---

## 🧪 Sample Input

```
9
-2 1 -3 4 -1 2 1 -5 4
```

## ✅ Output

```
6
```

---

## 📁 File Structure

```
Day-13-Kadanes-Algorithm/
│
├── README.md
├── 01_MaxSubarraySum_Easy.java
├── 02_MaxSubarrayWithLength_Medium.java
└── 03_CircularSubarraySum_Hard.java
```

---

## 🎯 Interview Tips

* Very commonly asked problem
* Focus on:

  * Logic clarity
  * Edge cases
  * Variations (circular, length)

---

## 🔥 Summary

Kadane’s Algorithm =
➡️ Drop negative prefix
➡️ Keep updating maximum
➡️ Solve in one pass

---

## 🚀 Next Step

➡️ Day 14 — Sliding Window (Fixed Window)
