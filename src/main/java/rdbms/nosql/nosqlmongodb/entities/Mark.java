package rdbms.nosql.nosqlmongodb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Document("Mark")
public class Mark {
    @Id
    private UUID id;
    private String evaluation;
    private LocalDate passdate;
    @DocumentReference
    private Student student;
    @DocumentReference
    private Exam exam;

    public Mark(UUID id, String evaluation, LocalDate passdate, Student student, Exam exam) {
        this.id = id;
        this.evaluation = evaluation;
        this.passdate = passdate;
        this.student = student;
        this.exam = exam;
    }
}
