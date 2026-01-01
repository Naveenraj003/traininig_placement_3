import threading
import time

buffer = []

def producer():
    for i in range(5):
        buffer.append(i)
        print("Produced:", i)
        time.sleep(1)

def consumer():
    for _ in range(5):
        while not buffer:
            pass
        print("Consumed:", buffer.pop(0))

t1 = threading.Thread(target=producer)
t2 = threading.Thread(target=consumer)

t1.start()
t2.start()
