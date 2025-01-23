import org.jetbrains.annotations.NotNull;
import java.util.concurrent.atomic.AtomicInteger;

import javax.management.remote.rmi.RMIConnectionImpl_Stub;
import java.util.*;

// 1. Класс "Человек"
class People {
    private String _name;
    private int _age;
    private final char _gender;

    public People(String name, int age, char gender) {
        _name = name;
        _age = age;
        _gender = gender;
    }

    public void Print() {
        System.out.printf("имя: " + _name + "\nвозраст: %d\nпол: " + _gender + "\n", _age);
    }

    public void Growth(int value) {
        _age += value;
    }

    public void Rename(String newName) {
        _name = newName;
    }
}

// 4. Абстрактный класс "Транспорт"
abstract class Transport {
    public Transport() {}
    abstract public void Move();
}

class Car extends Transport {
    public void Move() {
        System.out.println("Машина едет");
    }
}

class Bike extends Transport {
    public void Move() {
        System.out.println("велосипед едет");
    }
}

// 7. Счетчик объектов
class Counter {
    static private int _counter = 0;

    public Counter() {
        _counter++;
    }

    public void Print() {
        System.out.println(_counter);
    }
}

// 10. Работа с коллекциями: Университет

class Student implements Comparable {
    private final String _name;
    private final String _group;
    private final List<Integer> _grade;

    public Student(String name, String group, List<Integer> grade) {
        _name = name;
        _group = group;
        _grade = grade;
    }

    public String GetName() {
        return _name;
    }

    public String GetGroup() {
        return _group;
    }

    public double GetAg() {
        return _grade.stream().mapToDouble(x -> x).sum() / _grade.size();
    }

    @Override
    public int compareTo(@NotNull Object o) {
        Student student = (Student) o;
        return GetName().compareTo(student.GetName());
    }
}

class University {

    private List<Student> _students;

    public University(List<Student> students) {
        _students = students;
    }

    public void AddStudent(Student student) {
        _students.add(student);
    }

    public void SortForName() {
        Collections.sort(_students);

        for (Student i : _students) {
            System.out.println(i.GetName() + " " + i.GetGroup());
        }
    }

    public void filtterForGrades() {
        Scanner in = new Scanner(System.in);

        double filter = in.nextDouble();

        for (Student i : _students) {
            if (i.GetAg() == filter) {
                System.out.println(i.GetName() + " " + i.GetGroup() + " ср. оценка: " + i.GetAg());
            }
        }
    }
}

// 13. Генерация уникальных идентификаторов

class UniqueID {

    static AtomicInteger nextId = new AtomicInteger();

    private final int _id;

    public UniqueID() {
        _id = SetId();
    }

    public int SetId() {
        return nextId.incrementAndGet();
    }

    public int GetId() {
        return _id;
    }
}

// 16. Перегрузка операторов: Матрица
class Matrix {
    private int _rows;
    private int _cols;
    private double[][] _data;

    public Matrix(int rows, int cols) {
        this._rows = rows;
        this._cols = cols;
        this._data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this._rows = data.length;
        this._cols = data[0].length;
        this._data = new double[_rows][_cols];

        for (int i = 0; i < _rows; i++) {
            System.arraycopy(data[i], 0, this._data[i], 0, _cols);
        }
    }

    public Matrix Add(Matrix other) {
        if (this._rows != other._rows || this._cols != other._cols) {
            throw new IllegalArgumentException("Размеры матриц должны совпадать для сложения.");
        }

        Matrix result = new Matrix(_rows, _cols);
        for (int i = 0; i < _rows; i++) {
            for (int j = 0; j < _cols; j++) {
                result._data[i][j] = this._data[i][j] + other._data[i][j];
            }
        }
        return result;
    }

    public Matrix Multiply(Matrix other) {
        if (this._cols != other._rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно совпадать с количеством строк второй матрицы.");
        }

        Matrix result = new Matrix(this._rows, other._cols);
        for (int i = 0; i < this._rows; i++) {
            for (int j = 0; j < other._cols; j++) {
                for (int k = 0; k < this._cols; k++) {
                    result._data[i][j] += this._data[i][k] * other._data[k][j];
                }
            }
        }
        return result;
    }

    public void Print() {
        for (double[] row : _data) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

// 19. Наследование: Электроника
class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void TurnOn() {
        System.out.println(brand + " is now ON.");
    }

    public void TurnOff() {
        System.out.println(brand + " is now OFF.");
    }
}

class Smartphone extends Device {

    public Smartphone(String brand) {
        super(brand);
    }

    public void TakePhoto() {
        System.out.println(brand + " is taking a photo.");
    }
}

class Laptop extends Device {

    public Laptop(String brand) {
        super(brand);
    }

    public void CompileCode() {
        System.out.println(brand + " is compiling code.");
    }
}