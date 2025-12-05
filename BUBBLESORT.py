import random
import time

# Optimized Bubble Sort
def bubbleSort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if swapped == False:
            break

# Driver code
if __name__ == "__main__":
    # Generate random list of numbers from 1 to 50
    arr = [random.randint(1, 50) for _ in range(20)]   # change 20 to any size you want
    
    print("Original array:")
    print(arr)

    start_time = time.time()      # Start time

    bubbleSort(arr)

    end_time = time.time()        # End time

    print("\nSorted array:")
    print(arr)

    print("\nTime taken by Bubble Sort: {:.6f} seconds".format(end_time - start_time))
