class StackArray:
    def __init__(self):
        self.stack = []
    def push(self, value):
        self.stack.append(value)
        print(value,"pushed in the stack")
        print()
    def pop(self):
        if not self.is_empty():
            popped_value = self.stack.pop()
            print(popped_value,"popped from the stack")
        else:
            print("Stack Underflow")
            return None
        print()
    def peek(self):
        if not self.is_empty():
            print(f"Top element: {self.stack[-1]}")
            return self.stack[-1]
        else:
            print("Stack is empty")
            return None
        print()
    def is_empty(self):
            return len(self.stack)==0
    def display(self):
            if self.is_empty():
                print("Stack is empty")
            else:
                print("Stack (top to bottom):")
                for item in reversed(self.stack):
                    print(item)
                    
            print()

s1 =StackArray()
s1.push(28)
s1.push(19)
s1.push(10)
s1.display()
s1.pop()
s1.peek()
s1.display()
    