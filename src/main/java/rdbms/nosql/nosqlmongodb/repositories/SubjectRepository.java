package rdbms.nosql.nosqlmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import rdbms.nosql.nosqlmongodb.entities.Subject;

import java.util.UUID;

public interface SubjectRepository extends MongoRepository<Subject, UUID> {
}
