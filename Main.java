import model.Students;


public class Main {
    public static void main(String[] args) {
        Students S1 = new Students();
        Students S2 = new Students();
        Students S3 = new Students();
        Students S4 = new Students();
        Students S5 = new Students();
        S1.sl();
        S2.sl();
        S3.sl();

        Students[] array = {S1, S2, S3};
        for (int i = 0; i < array.length - 1; i++) {
            int max = 0;
            if ((array[i].getAge() > array[i + 1].getAge()) && (array[i].getMail() == 'f') && (array[i + 1].getMail() == 'f')) {
                max = i;

            }
            array[max].print();
        }
        System.out.println();
        S1.print();

    }
}








