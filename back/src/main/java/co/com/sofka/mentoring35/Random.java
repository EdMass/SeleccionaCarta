package co.com.sofka.mentoring35;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Random {
    private Date date;
    @Id
    private String id;

    private String carta;

    private String randomList;

    public String getRandomList() {
        return randomList;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setIde(String id) {
        this.id = id;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }
    
}
