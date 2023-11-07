package com.iiex.lab07_6;

import com.iiex.lab07_6.entity.Student;
import com.iiex.lab07_6.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab07_6 implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;


    public static void main(String[] args) {
        SpringApplication.run(Lab07_6.class, args);
    }

    @Override
    public  void run(String... args) throws Exception {


        Student student1 = new Student("1", "Qui", 20, "thanhqui@gmail.com", 7.5);
        Student student2 = new Student("2", "Ana", 21, "ana@gmail.com", 5.0);
        Student student3 = new Student("3", "Jan", 19, "jan@gmail.com", 6.5);
        Student student4 = new Student("4", "Lux", 28, "lux@gmail.com", 8.5);
        Student student5 = new Student("5", "Wen", 32, "wen@gmail.com", 6.0);
        Student student6 = new Student("6", "Kai", 24, "kai@gmail.com", 7.0);
        Student student7 = new Student("7", "Han", 18, "han@gmail.com", 9.0);
        Student student8 = new Student("8", "Bob", 26, "bob@gmail.com", 7.0);

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);
        studentRepository.save(student5);
        studentRepository.save(student6);
        studentRepository.save(student7);
        studentRepository.save(student8);

        // Read the student list and print it to the console
        System.out.println("All students:");
        studentRepository.findAll().forEach(System.out::println);

        // Update any student's information and print out the results after updating
        Student studentToUpdate = studentRepository.findById(1L).orElseThrow();
        studentToUpdate.setName("John Smith");
        studentRepository.save(studentToUpdate);
        System.out.println("Updated student:");
        System.out.println(studentRepository.findById(1L).orElseThrow());

        // Delete a student from the database and print the result after deleting
        studentRepository.deleteById(2L);
        System.out.println("After deleting student:");
        studentRepository.findAll().forEach(System.out::println);

        System.out.println("Print student > 21t");
        studentRepository.findByAgeGreaterThanOrEqual(21).forEach(System.out::println);
        System.out.println("number of students whose ielts score is equal to 7.5:");
        System.out.println(studentRepository.countByIeltsScore(7.5));
        System.out.println("The list of students whose name contains the word: an");
        studentRepository.findByNameContaining("an").forEach(System.out::println);


    }
}
