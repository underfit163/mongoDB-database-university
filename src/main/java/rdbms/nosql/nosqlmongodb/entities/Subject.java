package rdbms.nosql.nosqlmongodb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document("Subject")
public class Subject {
    @Id
    private UUID id;
    private String subjectname;

    public Subject(UUID id, String subjectname) {
        this.id = id;
        this.subjectname = subjectname;
    }
}
