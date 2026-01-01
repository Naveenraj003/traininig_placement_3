import time

def timer(func):
    def wrapper():
        start = time.time()
        func()
        end = time.time()
        print("Execution Time:", end - start)
    return wrapper

@timer
def demo():
    for i in range(1000000):
        pass

demo()
