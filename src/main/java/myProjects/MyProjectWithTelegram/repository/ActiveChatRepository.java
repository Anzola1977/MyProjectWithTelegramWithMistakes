package myProjects.MyProjectWithTelegram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import myProjects.MyProjectWithTelegram.entity.ActiveChat;

import java.util.Optional;

@Repository
public interface ActiveChatRepository extends JpaRepository<ActiveChat, Long> {

    Optional<ActiveChat> findActiveChatByChatId(Long chatId);
}