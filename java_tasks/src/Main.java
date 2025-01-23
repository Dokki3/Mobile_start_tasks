import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Car car = new Car();
        car.Move();

        Counter[] counters = new Counter[100];
        for (int i = 0; i != 100; ++i) {
            counters[i] = new Counter();
        }

        counters[0].Print();

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("1", "1", Arrays.asList(5, 4, 5, 5, 4, 3, 2)));
        students.add(new Student("2", "1", Arrays.asList(3, 3, 3, 3, 3, 3, 3)));
        students.add(new Student("3", "1", Arrays.asList(5, 5, 5, 5, 5, 5, 5)));
        students.add(new Student("1", "2", Arrays.asList(5, 4, 5, 5, 4, 5, 5)));
        students.add(new Student("2", "2", Arrays.asList(3, 3, 4, 3, 4, 3, 4)));


        University u = new University(students);
        u.AddStudent(new Student("3", "2", Arrays.asList(5, 2, 5, 2, 2, 5, 5)));
        u.SortForName();
        u.filtterForGrades();

        UniqueID o1 = new UniqueID();
        UniqueID o2 = new UniqueID();
        UniqueID o3 = new UniqueID();

        System.out.println(o1.GetId());
        System.out.println(o2.GetId());
        System.out.println(o3.GetId());

        o2.SetId();

        System.out.println(o2.GetId());

        double[][] data1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        double[][] data2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Matrix 1:");
        matrix1.Print();

        System.out.println("Matrix 2:");
        matrix2.Print();


        System.out.println("Matrix 1 * Matrix 2:");
        Matrix result = matrix1.Multiply(matrix2);
        result.Print();


        double[][] data3 = {
                {1, 2},
                {3, 4}
        };

        Matrix matrix3 = new Matrix(data3);
        Matrix matrix4 = new Matrix(data3);

        System.out.println("Matrix 3 + Matrix 4:");
        Matrix sumResult = matrix3.Add(matrix4);
        sumResult.Print(); */

        Smartphone phone = new Smartphone("Samsung");
        phone.TurnOn();
        phone.TakePhoto();
        phone.TurnOff();

        Laptop laptop = new Laptop("Dell");
        laptop.TurnOn();
        laptop.CompileCode();
        laptop.TurnOff();

    }
}