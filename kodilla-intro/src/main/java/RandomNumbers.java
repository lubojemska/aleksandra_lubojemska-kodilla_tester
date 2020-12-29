public class RandomNumbers {
    long maxNumber = 0;
    long minNumber = 30;


    public long getRandomNumber() {
        long x = Math.round(Math.random()*30);
        checkMax(x);
        checkMin(x);
        return x;
    }

    public void checkMax(long input) {
        if (input > this.maxNumber) {
            maxNumber = input;
        }
    }

    public void checkMin(long input) {
        if (input < this.minNumber) {
            minNumber = input;
        }
    }

   public void sum() {
        long sum = 0;
        while (sum <= 5000) {
            sum += getRandomNumber();
            System.out.println(sum);
        }
       System.out.println("Maksymalna wartość: " +this.maxNumber +" Minimalna wartość: "+ this.minNumber);
   }
}
