package com.lab07.lab07;

import com.lab07.lab07.entity.Student;
import com.lab07.lab07.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Lab07Application {
    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Lab07Application.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return args -> {
            Student student1 = Student.builder()
                    .id(1)
                    .name("Nguyen Thanh Qui")
                    .age(20)
                    .email("thanhqui@gmail.com")
                    .ieltsScore(6.5)
                    .build();
            Student student2 = Student.builder()
                    .id(2)
                    .name("Sun")
                    .age(21)
                    .email("sun@gmail.com")
                    .ieltsScore(6.0)
                    .build();
            Student student3 = Student.builder()
                    .id(3)
                    .name("Cyd")
                    .age(22)
                    .email("cyd@gmail.com")
                    .ieltsScore(5.5)
                    .build();
            Student student4 = Student.builder()
                    .id(4)
                    .name("Bob")
                    .age(20)
                    .email("bob@gmail.com")
                    .ieltsScore(8.5)
                    .build();
            Student student5 = Student.builder()
                    .id(5)
                    .name("Ana")
                    .age(29)
                    .email("ana@gmail.com")
                    .ieltsScore(5.0)
                    .build();

            studentRepository.save(student1);
            studentRepository.save(student2);
            studentRepository.save(student3);
            studentRepository.save(student4);
            studentRepository.save(student5);

            System.out.println("Find Student by age > 20: ");
            studentRepository.findAllByAgeGreaterThanEqual(20).forEach(System.out::println);

            System.out.println("Number of student have ielts score = 6.5: ");
            System.out.println(studentRepository.countAllByIeltsScoreEquals(6.5));

            System.out.println("Using query");
            System.out.println("Find Student by age > 20: ");
            studentRepository.getAllStudentByAgeGreaterThan(20).forEach(System.out::println);

            System.out.println("Number of student have ielts score = 6.5: ");
            System.out.println(studentRepository.countAllStudentByIeltsScoreEquals(6.5));
        };
    }

}
