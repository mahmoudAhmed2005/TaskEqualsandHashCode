package TaskEqualsAndHash;


import Obiect.Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
        //level 1
        // without equals

//        Students student1 =new Students(1,"ahmed");
//        Students student2 =new Students(2,"mahmoud");
//        Students student3 =new Students(1,"ahmed");
//
//
//       System.out.println(student1.equals(student2));
//        System.out.println(student2.equals(student3));
//        System.out.println(student3.equals( student1));


      // output
        // false
        //false
        //false








        //level 1
        // with override equals

//        Students student1 =new Student(1,"ahmed");
//        Students student2 =new Student(2,"mahmoud");
//        Students student3 =new Student(1,"ahmed");
//





//        System.out.println(student1.equals(student2));
//        System.out.println(student2.equals(student3));
//        System.out.println(student3.equals( student1));
//

        // output
        // false
        //false
        //true


        //the code run with olso equals

//------------------------------------------------------------------------------------------------


        //level 2
        // without equals  and hashCode

//        Set<Students> students =new HashSet<>();
//        students.add(new Students(1,"ahmed"));
//        students.add(new Students(2,"mahmoud"));
//        students.add(new Students(2,"mahmoud"));
//
//
//        System.out.println(students.size());

         // out put
        //3



       // with override equals and hashCode
        //out put //2




//------------------------------------------------------------------------------------------------






        //level 3
        // without equals  and hashCode






        Map<Students,Integer> student = new HashMap<>();
        student.put(new Students(1,"ahmed") ,1);
        student.put(new Students(2,"Mahmoud") ,2);
        student.put(new Students(1,"ahmed") ,3);

        System.out.println(student.get(student));


        // out put
        //3



        // with override equals and hashCode
        //out put //2









    }
}