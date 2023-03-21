public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.study();
        JavaStudent javaStudent = new JavaStudent();
        javaStudent.study();
    }
    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курс Java");
        }
    }

}
