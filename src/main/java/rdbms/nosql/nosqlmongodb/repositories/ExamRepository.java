package rdbms.nosql.nosqlmongodb.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;
import rdbms.nosql.nosqlmongodb.entities.Exam;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ExamRepository extends MongoRepository<Exam, UUID> {

    Optional<List<Exam>> findExamBySubjectSubjectname(String subject);
}
