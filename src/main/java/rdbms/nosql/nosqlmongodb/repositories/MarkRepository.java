package rdbms.nosql.nosqlmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import rdbms.nosql.nosqlmongodb.entities.Mark;
import rdbms.nosql.nosqlmongodb.entities.Subject;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MarkRepository extends MongoRepository<Mark, UUID> {
    Optional<List<Mark>> searchMarksByExamSubject(Subject subject);
    List<Mark> findAllMarkByStudentFio(String fio);

    List<Mark> findMarksByStudentId(UUID uuid);

}
