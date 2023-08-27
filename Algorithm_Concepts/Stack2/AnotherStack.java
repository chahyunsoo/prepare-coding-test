package Stack2;

public class AnotherStack implements Stack {
    private int top; //스택 포인터
    private int stackSize; //스택 사이즈
    private char stackArr[]; //배열

    public AnotherStack(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stackArr = new char[this.stackSize];
    }

    //스택이 비어있는지 확인
    @Override
    public boolean isEmpty() {
        // 스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true 아닌 경우 false를 return
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == this.stackSize-1);
    }

    @Override
    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            stackArr[++top] = item;
            System.out.println("Inserted Item: " + item);
        }
    }

    //스택의 최상위(마지막) 데이터 추출 후 삭제
    @Override
    public char pop() {
        if (isEmpty()) {
            System.out.println("Deleting fail! Stack is Empty");
            return 0;
        } else {
            System.out.println("Deleted Item: " + stackArr[top]);
            return stackArr[top--];
        }
    }

    //스택의 최상위 데이터 추출
    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Stack is full");
            return 0;
        } else {
            System.out.println("Peeked Item: "+ stackArr[top]);
            return stackArr[top];
        }
    }

    //스택 초기화
    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("Stack is already empty");
        } else {
            top=-1;
            stackArr = new char[this.stackSize]; //새로운 스택 배열 생성
            System.out.println("Stack is clear");
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements :");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArr[i]);
            }
            System.out.println();
        }
    }
}
