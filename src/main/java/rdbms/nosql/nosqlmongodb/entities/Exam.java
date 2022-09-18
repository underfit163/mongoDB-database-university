package rdbms.nosql.nosqlmongodb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.UUID;

@Data
@Document("Exam")
public class Exam {
    @Id
    private UUID id;
    private String passtype;
    private Integer totalhours;
    private Integer semester;
    @DocumentReference
    private Subject subject;
    @DocumentReference
    private Teacher teacher;

    public Exam(UUID id, String passtype, Integer totalhours, Integer semester, Subject subject, Teacher teacher) {
        this.id = id;
        this.passtype = passtype;
        this.totalhours = totalhours;
        this.semester = semester;
        this.subject = subject;
        this.teacher = teacher;
    }
}
