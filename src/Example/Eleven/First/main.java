package Example.Eleven.First;

public class main {
    public static class    InsertionSort {
        public static void sortByIDNumber(Student[] students) {
            int n = students.length;
            for (int i = 1; i < n; ++i) {
                Student key = students[i];
                int j = i - 1;

                // Move elements of students[0..i-1], that are greater than key.getIDNumber(),
                // to one position ahead of their current position
                while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                    students[j + 1] = students[j];
                    j = j - 1;
                }
                students[j + 1] = key;
            }
        }
    }

    public static class InsertionSortTest {
        public static void main(String[] args) {
            Student[] students = {
                    new Student(103, "Саша"),
                    new Student(101, "Петя"),
                    new Student(105, "Галя"),
                    new Student(102, "Лена"),
                    new Student(104, "Лёша")
            };

            System.out.println("Не отсортированный список студентов:");
            printStudents(students);

            InsertionSort.sortByIDNumber(students);

            System.out.println("\nОтсортированный список студентов по номеру студенческого:");
            printStudents(students);
        }

        private static void printStudents(Student[] students) {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static class Student {
        private int iDNumber;
        private String name;

        public Student(int iDNumber, String name) {
            this.iDNumber = iDNumber;
            this.name = name;
        }

        public int getIDNumber() {
            return iDNumber;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Example.Eleven.First.main.Student{" +
                    "iDNumber=" + iDNumber +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
