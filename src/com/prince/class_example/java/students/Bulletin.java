package com.prince.class_example.java.students;

public class Bulletin {

    public static double calculateAverage(Notes[] notes) {

        double studentAvg = 0.0d;
        double total = 0.0d;
        double coeffTotal = 0.0d;

        for (int i = 0; i < notes.length; i++) {
            total += notes[i].getNote();
            coeffTotal += notes[i].getSubject().SubjectCoeff / 10;
        }

        studentAvg = total / coeffTotal;

        return studentAvg;
    }

    public static Subject[] addSubject() {

        Subject[] subject = new Subject[5];

        subject[0] = new Subject("Math-001", 100.0d);
        subject[1] = new Subject("Stat-001", 100.0d);
        subject[2] = new Subject("Prog-001", 100.0d);
        subject[3] = new Subject("System-001", 200.0d);
        subject[4] = new Subject("Networking-001", 200.0d);
        return subject;
    }

    public static Notes[] studentNotes() {

        Subject[] subjects = addSubject();
        double[] noteTab = {67.5d, 78.0d, 55.5d, 128.5d, 170.0d};

        Notes[] notes = new Notes[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            notes[i] = new Notes(subjects[i], noteTab[i]);

        }

        return notes;

    }

    public static void showNotes(Notes[] notes) {
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i].getSubject().getSubjectName() + " : " + notes[i].getNote() + " / " + notes[i].getSubject().getSubjectCoeff());
        }
    }

    public static void showBulletin() {
        Student student = new Student(1, "Prince", "Stanley");
        Notes[] studentNotes = studentNotes();
        double studentAvg = calculateAverage(studentNotes);

        System.out.println("Student Info : " + student.toString());
        System.out.println();

        showNotes(studentNotes);

        System.out.println();
        System.out.println("Student Average : " + studentAvg);

    }


    public static void main(String... args) {
        showBulletin();
    }
}
