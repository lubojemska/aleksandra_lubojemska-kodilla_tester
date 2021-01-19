 public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
   }

    public String add(int value) {
        if (this.size == 10) {
           return "";
        }
        if (value>6 || value <1) {
            return "Bad number, 1-6 req";
        }
        this.grades[this.size] = value;
        this.size++;
        return "ok";
    }

    public int recentGrades() {
        if(this.size == 0) {
            return 0;
        }
        return this.grades[this.size-1];
    }

    public double averageGrades() {
        if(this.size == 0 ) {
            return 0;
        }
        double sum = 0.0;
        for (int i=0; i<this.size; i++) {
            System.out.println("i=" +i + " grades["+i+"]="+grades[i]);

            sum += grades[i];
            System.out.println("sum = " +sum);
        }

        return sum/this.size;
    }
    public int maxGrade() {
        int max = 0;
        for (int i=0; i<this.size; i++) {
            System.out.println("max = " +max + " grades[" + i +"]= " +grades[i]);
            if(grades[i] > max) {
                max=grades[i];

            }
            System.out.println("max " +max);
        }
        return max;
    }
    public int minGrade() {
        int min = 6;
        for (int i=0; i<this.size; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
            System.out.println("min" +min);


        }
        return min;
    }
}
