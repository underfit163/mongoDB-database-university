package rdbms.nosql.nosqlmongodb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Document("Teacher")
public class Teacher {
    @Id
    private UUID id;
    private String fio;
    private LocalDate birthday;
    private String gender;
    private String title;
    private String teacherdegree;
    private String phone;

    public Teacher(UUID id, String fio, LocalDate birthday, String gender, String title, String teacherdegree, String phone) {
        this.id = id;
        this.fio = fio;
        this.birthday = birthday;
        this.gender = gender;
        this.title = title;
        this.teacherdegree = teacherdegree;
        this.phone = phone;
    }
}
