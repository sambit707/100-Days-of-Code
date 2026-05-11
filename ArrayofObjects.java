class student{
    int rollno;
    String Name;
    int Marks ;
}

public class ArrayofObjects {

    public static void main(String[] args) {
      student s1 = new student();
      student s2 = new student();
      student s3 = new student();

      s1.rollno = 1;
      s1.Name = " sambit";
      s1.Marks = 43;

      s2.rollno = 2;
      s2.Name = " bit";
      s2.Marks = 53;

      s3.rollno = 3;
      s3.Name = " ambit";
      s3.Marks = 63;

      student students[] = new student[3];
      students[0] = s1;
      students[1] =s2;
      students[2] = s3;

    for(student s : students){
     
    }
     System.out.println(students[0].Name + " "+ students[0].Marks);

     /*  int nums[] = new int[4];
        nums[0] = 5;
        nums[1] = 6;
        nums[2] = 4;
        nums[3] = 8;

       for(int i = 0 ; i < nums.length; i++){
          System.out.println(nums[i]);
       } 
       int counter = 0;
      for(int n : nums)
      {
        if(counter == 2){
            System.out.println("index" + n);
        }
        counter++;
      } */

    }
}