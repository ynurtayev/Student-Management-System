package net.spring.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.spring.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
