package rdbms.nosql.nosqlmongodb.repositories;



import org.springframework.data.mongodb.repository.MongoRepository;
import rdbms.nosql.nosqlmongodb.entities.Teacher;

import java.util.UUID;

public interface TeacherRepository extends MongoRepository<Teacher, UUID> {
}
