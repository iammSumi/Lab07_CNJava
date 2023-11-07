package com.lab07.lab07.repository;

import com.lab07.lab07.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface StudentRepository extends CrudRepository<Student, Integer>, PagingAndSortingRepository<Student, Integer> {
    List<Student> findAllByAgeGreaterThanEqual(int age);
//    count all student by ielts score equal ieletsScore param
    int countAllByIeltsScoreEquals(double ieltsScore);
//    sorted in descending order by age. If there are more than one
//student of the same age, sort them in ascending order according to their ielts scores
    Page<Student> findAllByOrderByAgeDescIeltsScoreAsc(Pageable pageable);


    @Query("select s from Student s where s.age >= :age")
    List<Student> getAllStudentByAgeGreaterThan(int age);

//    count all student by ielts score equal
    @Query("select count(s) from Student s where s.ieltsScore = :ieltsScore")
    int countAllStudentByIeltsScoreEquals(double ieltsScore);

}
