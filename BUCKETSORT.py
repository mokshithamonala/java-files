import random
import time

def bucketSort(arr):
    buckets = [[] for _ in range(51)]  # 0 to 50

    for num in arr:
        buckets[num].append(num)

    sorted_arr = []
    for bucket in buckets:
        for value in bucket:
            sorted_arr.append(value)

    return sorted_arr

# Driver
if __name__ == "__main__":
    arr = [random.randint(1, 50) for _ in range(20)]
    print("Original:", arr)

    start = time.time()
    arr = bucketSort(arr)
    end = time.time()

    print("Sorted:", arr)
    print("Time:", end - start, "seconds")
