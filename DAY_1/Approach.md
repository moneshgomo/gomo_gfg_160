## Second Largest Element

![alt text](image.png)

--- 

 Approach

1. Sorting
   
   ```Brute Force```

   ![alt text](image-1.png)

   ![alt text](image-2.png)

---


Complexity Analysis :

- T.C : O(n log n) 
- S.C : O(1)

---
2. In two iterations

   ![alt text](image-3.png)

   ![alt text](image-4.png)

Complexity Analysis 

T.C : O(2n)
S.C : O(1) 

---

3. In single iteration 

   ![alt text](image-5.png)

   ![alt text](image-6.png)

   ![alt text](image-7.png)

Complexity Analysis :

- T.C : O(n)
- S.C : O(1)

## Solution 

``` bash
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
```

![alt text](image-8.png)


``` bash

arr[] = [12, 35, 1, 10, 34, 1]

n < 2 ( false )

first = 0;
second = 0;


i1
	second = 0;
	first = 12;
i2
	second = 12;
	first = 35;
i3 
	elseif 
		( 1 can be ignored ) 
i4
	elseif 
		( 1 can be ignored ) 
i5 
	elseif
		34 > 12 ( yes ) and 34 != 35
		second = 34 

```
