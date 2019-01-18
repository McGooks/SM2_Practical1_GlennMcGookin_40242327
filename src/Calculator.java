public class Calculator {
    private int memory;

    public int addNumbers(int num1, int num2){
        int calc = num1 + num2;
        return calc;
    }

    public int subtractNumbers(int num1, int num2){
        int calc = num1 + num2;
        return calc;
    }

    public int multiplyNumbers(int num1, int num2){
        int calc = num1 * num2;
        return calc;
    }

    public int divideNumbers(int num1, int num2){
        int calc = num1 / num2;
        return calc;
    }

    public double sqrRoot(int num1){
        double calc = Math.sqrt((double) num1);
        return calc;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    public int getMemory(){
        return memory;
    }

    public void clearMemory(){
        memory = 0;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addNumbers(1,2));
        System.out.println(calculator.subtractNumbers(10,5));
        System.out.println(calculator.multiplyNumbers(2,2));
        System.out.println(calculator.divideNumbers(4,2));
        System.out.printf("%.2f\n",calculator.sqrRoot(12));
        System.out.println(calculator.getMemory());
        calculator.setMemory(10009);
        System.out.println(calculator.getMemory());
        calculator.clearMemory();
        System.out.println(calculator.getMemory());
    }
}
