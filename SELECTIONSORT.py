import random
import time

def selectionSort(arr):
    n = len(arr)
    for i in range(n):
        min_idx = i
        
        for j in range(i+1, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

# Driver
if __name__ == "__main__":
    arr = [random.randint(1, 50) for _ in range(20)]
    print("Original:", arr)

    start = time.time()
    selectionSort(arr)
    end = time.time()

    print("Sorted:", arr)
    print("Time:", end - start, "seconds")
