// 1. Add integer values of an array
public class SumArray 
{
public static void main(String[] args) 
{
int[] arr = {1, 2, 3, 4, 5}; 
int sum = 0; 
for (int num : arr) sum += num; 
System.out.println("Sum: " + sum); 
} 
}

OUTPUT:
Sum: 15

// 2. Calculate average value of an array 
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {2, 4, 6, 8}; 
int sum = 0; 
for (int num : arr) sum += num; 
double avg = (double) sum / arr.length; 
System.out.println("Average: " + avg); 
} 
}

OUTPUT:
Average: 5.0

// 3. Find index of an array element 
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {10, 20, 30, 40}; 
int target = 30; 
int index = -1; 
for (int i = 0; i < arr.length; i++) 
{ 
if (arr[i] == target) 
{ 
index = i; 
break; 
} 
} 
System.out.println("Index: " + index); 
} 
}

OUTPUT:
Index: 2

// 4. Check if array contains a specific value 
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {5, 10, 15}; 
int value = 10; 
boolean found = false; 
for (int num : arr) 
{ 
if (num == value) 
{ 
found = true; 
break; 
} 
} 
System.out.println("Contains: " + found); 
} 
}

OUTPUT:
Contains: true

// 5. Remove specific element from an array 
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {1, 2, 3, 4}; 
int remove = 3; 
int[] newArr = new int[arr.length - 1]; 
int j = 0; for (int i = 0; 
i < arr.length; i++) 
{ 
if (arr[i] != remove) 
{ 
newArr[j++] = arr[i]; 
} 
} 
for (int num : newArr) System.out.print(num + " "); 
} 
}

OUTPUT:
1 2 4

// 6. Copy an array to another array
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] original = {1, 2, 3}; 
int[] copy = new int[original.length]; 
System.arraycopy(original, 0, copy, 0, original.length); 
for (int num : copy) 
System.out.print(num + " "); 
} 
}

OUTPUT:
1 2 3


// 7. Insert an element at a specific position in the array
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {1, 2, 4}; 
int pos = 2, value = 3; 
int[] newArr = new int[arr.length + 1]; 
for (int i = 0, j = 0; 
i < newArr.length; i++) 
{ 
if (i == pos) newArr[i] = value; 
else newArr[i] = arr[j++]; 
} 
for (int num : newArr) System.out.print(num + " "); 
} 
}

OUTPUT:
1 2 3 4


// 8. Find minimum and maximum value in an array 
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {2, 5, 1, 9}; 
int min = arr[0], max = arr[0]; 
for (int num : arr) 
{ 
if (num < min) min = num; 
if (num > max) max = num; 
} 
System.out.println("Min: " + min + ", Max: " + max); 
} 
}

OUTPUT:
Min: 1, Max: 9

// 9. Reverse an array 
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {1, 2, 3}; 
for (int i = arr.length - 1; i >= 0; i--) 
System.out.print(arr[i] + " "); 
} 
}

OUTPUT:
3 2 1


// 10. Find duplicate values in an array 
import java.util.*; 
public class Array 
{ 
public static void main(String[] args) 
{ 
int[] arr = {1, 2, 3, 2, 4, 1}; 
Set<Integer> seen = new HashSet<>(); 
Set<Integer> dup = new HashSet<>(); 
for (int num : arr) 
{ 
if (!seen.add(num)) dup.add(num); 
} 
System.out.println("Duplicates: " + dup); 
} 
}


OUTPUT:
Duplicates: [1, 2]
