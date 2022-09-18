package rdbms.nosql.nosqlmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import rdbms.nosql.nosqlmongodb.entities.Student;

import java.util.UUID;

public interface StudentRepository extends MongoRepository<Student, UUID> {
    @Query("{ 'fio' : ?0 }")
    Student findStudentByFio(String fio);
}
