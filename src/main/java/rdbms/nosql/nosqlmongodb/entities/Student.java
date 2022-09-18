package rdbms.nosql.nosqlmongodb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Document("Student")
public class Student {
    @Id
    private UUID id;
    private String fio;
    private LocalDate birthday;
    private String gender;
    private String phone;



    public Student(UUID id, String fio, LocalDate birthday, String gender, String phone) {
        this.id = id;
        this.fio = fio;
        this.birthday = birthday;
        this.gender = gender;
        this.phone = phone;
    }
}
