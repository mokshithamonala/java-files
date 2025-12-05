import random
import time

def insertionSort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        
        # Move elements greater than key
        while j >= 0 and key < arr[j]:
            arr[j+1] = arr[j]
            j -= 1
        
        arr[j+1] = key

# Driver
if __name__ == "__main__":
    arr = [random.randint(1, 50) for _ in range(20)]
    print("Original:", arr)

    start = time.time()
    insertionSort(arr)
    end = time.time()

    print("Sorted:", arr)
    print("Time:", end - start, "seconds")
