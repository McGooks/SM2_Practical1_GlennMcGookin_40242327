public class Calculator {
    private int memory;

    public void addNumbers(int num1, int num2){
        System.out.println(num1+num2);
    }

    public void subtractNumbers(int num1, int num2){
        System.out.println(num1-num2);
    }

    public void multiplyNumbers(int num1, int num2){
        System.out.println(num1*num2);
    }

    public void divideNumbers(int num1, int num2){
        System.out.println(num1/num2);
    }

    public void sqrRoot(int num1){
        System.out.printf("%.2f",(double) Math.sqrt(num1));
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public int getMemory(){
        return memory;
    }

    public void clearMemory(){

    }



    public static void main(String[] args) {
         Calculator calculator = new Calculator();
         calculator.addNumbers(1,2);
         calculator.subtractNumbers(10,5);
         calculator.multiplyNumbers(2,2);
         calculator.divideNumbers(4,2);
         calculator.sqrRoot(12);
    }
}
