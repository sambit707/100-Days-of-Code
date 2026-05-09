/* package Automation;
class student{
    int rollno;
    String name;
    int marks;

    student(int r, String n, int m){
        rollno = r;
        name =n;
        marks=m;
    }
}

public class Arrofobj {

    public static void main(String[] args) {

student students[] =new student[100];

for(int i = 0 ; i< students.length; i++){

    int r = i+1;
    String n = "Student" + (i+1);
    int m = (int)(Math.random()*100);

    students[i] = new student(r, n, m);
}

for(int i =0; i<5; i++){
    System.out.println(students[i].name + " : " + students[i].rollno);
}

      /* student s1 = new student();

        s1.name = "Sambit";
        s1.marks = 99;
        s1.rollno = 36;

    
        student s2 = new student();
        s2.name = "Rohan";
        s2.marks = 33;
        s2.rollno = 30;
    
        student s3 = new student();
        s3.name = "Suber";
        s3.marks = 10;
        s3.rollno = 32;

        student students[] = new student[3]; // here we are not creating object here we are creating an array which will hold student obj
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;

        for(int i = 0 ; i<students.length; i++){
               System.out.println(students[i].name + " : " + students[i].marks);
        }
     

      /*  int nums[] = new int[6];
        nums[0] = 4;
        nums[1] = 4;
        nums[2] = 4;
        nums[3] = 4;

        for(int i = 0 ; i<nums.length; i++){
            System.out.println(nums[i]);
        } 
    }
} */

package Automation;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class student {
    int rollno;
    String name;
    int marks;

    student(int r, String n, int m) {
        rollno = r;
        name = n;
        marks = m;
    }
}

public class Arrofobj {
    public static void main(String[] args) {
        // 1. Array banaya 100 students ke liye
        student students[] = new student[100];
        int i = 0;

        try {
            // 2. File read karne ka process
            File myFile = new File("names.txt"); 
            Scanner reader = new Scanner(myFile);

            // Jab tak file mein names hain aur array full nahi hua
            while (reader.hasNextLine() && i < students.length) {
                String n = reader.nextLine(); // File se name read kiya
                int r = i + 1;                // Roll number generate kiya
                int m = (int)(Math.random() * 100); // Random marks

                // 3. Object banaya aur array mein dala
                students[i] = new student(r, n, m);
                i++;
            }
            reader.close();

            // 4. Print karke check karo (jitne read huye utne hi print honge)
            System.out.println("--- Students Data from File ---");
            for (int j = 0; j < i; j++) {
                System.out.println("Roll No: " + students[j].rollno + "| Name: " + students[j].name + " | Marks: " + students[j].marks);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: 'names.txt' file nahi mili! Check karo folder.");
            // e.printStackTrace(); // Debugging ke liye ise use kar sakte ho
        }
    }
}