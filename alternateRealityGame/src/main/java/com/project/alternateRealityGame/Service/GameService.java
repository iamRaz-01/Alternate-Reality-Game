package com.project.alternateRealityGame.Service;
import com.project.alternateRealityGame.Entity.Game;
import com.project.alternateRealityGame.Repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public Game createGame(Game game) {

        return gameRepository.save(game);
    }

    public List<Game> getAllGames() {

        return gameRepository.findAll();
    }

    public Game getGameById(Long id) {

        return gameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found"));
    }

    public Game updateGame(Long id, Game updatedGame) {

        Game game = getGameById(id);

        game.setTitle(updatedGame.getTitle());
        game.setDescription(updatedGame.getDescription());
        game.setStatus(updatedGame.getStatus());
        game.setStartTime(updatedGame.getStartTime());
        game.setEndTime(updatedGame.getEndTime());

        return gameRepository.save(game);
    }

    public String deleteGame(Long id) {

        Game game = getGameById(id);

        gameRepository.delete(game);

        return "Game deleted successfully";
    }
}