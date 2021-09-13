package prob5;

public class MyStack{

   private int top;
    private int stackSize;
    private String stackArr[];
    
   public MyStack(int stackSize) {
      top = -1;                         // 스택 포인터
        this.stackSize = stackSize;             // 스택 사이즈
        stackArr = new String[this.stackSize];  // 스택 배열
   }
   
    public boolean isFull() {
        // 포인터가 최대사이즈-1에 도달여부
        return (top == this.stackSize-1);
    }
   
   public void push(String item) {
      if(isFull()) {

        } else {             
            stackArr[++top] = item;    // 다음 스택 포인터가 가리키는 인덱스에 데이터 추가
        }
   }

   public boolean isEmpty() {
      return (top == -1);
   }

   public String pop() throws MyStackException {
        if(isEmpty()) {
         throw new MyStackException();
        } else { 
            return stackArr[top--];
        }  
   }
}