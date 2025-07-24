
def push(stack,size):
    if len(stack)==size:
        print("Overflow")
    else:
        element=int(input("Enter an element to push:"))
        stack.append(element)
        print(element,"is pushed in the stack")
        print(stack)
        top=len(stack)-1
        print("Top is at index:",top)
    print()

def pop(stack,size):
    if len(stack)==0:
        print("Underflow")
    else:
        element=stack.pop()
        print(element,"is poped from the stack")
        print(stack)
        top=len(stack)-1
        if top==-1:
            print("Stack is empty")
    print()

def peek(stack,size):
    if len(stack)==0:
        print("Stack is empty")
    else:
        top=len(stack)-1
        print("Top is at index:",top)
        print("Value at top:",stack[top])
    print()
print("Stack Operation using Arrays")
stack=[]
size=int(input("Enter the size of the stack:"))
while True:
    print("1.Push")
    print("2.Pop")
    print("3.Peek")
    print("4.Exit")
    ch=int(input("Enter your choice:"))
    if ch==1:
        push(stack,size)
    elif ch==2:
        pop(stack,size)
    elif ch==3:
        peek(stack,size)
    elif ch==4:
        break
    else:
        print("Invalid choice")
        print()


        
