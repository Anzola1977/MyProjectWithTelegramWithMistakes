package myProjects.MyProjectWithTelegram.entity;

import lombok.Data;

import javax.persistence.*;

@Data  //чтобы не писать геттеры/сеттеры
@Entity // Данный класс является JPA сущностью
@Table(name = "ACTIVE_CHAT") //И хранится в таблице ACTIVE_CHAT
public class ActiveChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Уникальный идентификатор в системе нашего бота

    @Column(name = "CHAT_ID")
    private Long chatId; //Уникальный идентификатор в системе Telegram
}