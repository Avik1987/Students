import model.Students;
import service.Service;


public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        Students S1 = students.sl();
        Students S2 = students.sl();
        Students S3 = students.sl();
        Service s = new Service();
        Students[] array = {S1, S2, S3};

       // System.out.println("Max Age");
        //   s.maxAge(array);
       // System.out.println("max Mark");
        //  s.maxMark(array);
       // System.out.println("Quantity boys and girls");
        //  s.quantity(array);
       // System.out.println("Max mark of PHD");
       // s.maxMarkPhd(array);
       // System.out.println("Is there PHD");
      // s.phd(array);
        System.out.println("Sorting by marks");
        s.sortingByMarks(array);


    }
}








