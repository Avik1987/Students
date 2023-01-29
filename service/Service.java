package service;

import model.Students;

public class Service {
    public Students maxAge(Students[] quantity) {
        Students max = null;
        for (Students students : quantity) {
            if (max == null) {
                if (students.getMail() == 'f') {
                    max = students;
                }
            } else if (students.getMail() == 'f' && students.getAge() > max.getAge()) {
                max = students;

            }
            if (max != null) {
                max.print();
            } else System.out.println("There is no girls");
        }

        return max;
    }

    public Students maxMark(Students[] b) {
        Students maxMark = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i].getMark() > maxMark.getMark()) {
                maxMark = b[i];
            }

        }
        maxMark.print();
        return maxMark;
    }

    public void quantity(Students[] a) {
        int quantityBoys = 0;
        int quantityGirls = 0;
        for (Students q : a) {
            if (q.getMail() == 'm') {
                quantityBoys++;
            } else {
                quantityGirls++;
            }

        }
        System.out.println("Quantity of boys: " + quantityBoys + " " + "Quantity of girls: " + quantityGirls);
    }

    public void maxMarkPhd(Students[] c) {
        Students maxMarkPhd = null;
        for (int i = 0; i < c.length - 1; i++) {
            if (maxMarkPhd == null) {
                if (c[i].isPHD()) {
                    maxMarkPhd = c[i];

                }
            } else if (c[i].isPHD() & c[i].getMark() > maxMarkPhd.getMark()) {
                maxMarkPhd = c[i];
            }
        }
        if (maxMarkPhd != null) {
            maxMarkPhd.print();
        } else System.out.println("there is no PHD");


    }

    public void phd(Students[] n) {
        int q = 0;
        for (int i = 0; i < n.length - 1; i++) {
            if (n[i].isPHD()) {
                q++;
            }
        }
        if (q > 0) {
            System.out.println("There is PHD students");
        } else System.out.println("There is no PHD students");
    }

}




