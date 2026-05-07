package com.project.alternateRealityGame.Controller;
import com.project.alternateRealityGame.Entity.Game;
import com.project.alternateRealityGame.Service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/games")
@RequiredArgsConstructor
@CrossOrigin("*")
public class GameController {

    private final GameService gameService;
    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return gameService.createGame(game);
    }

    @GetMapping
    public List<Game> getAllGames() {

        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Long id) {

        return gameService.getGameById(id);
    }

    @PutMapping("/{id}")
    public Game updateGame(@PathVariable Long id,
                           @RequestBody Game game) {

        return gameService.updateGame(id, game);
    }

    @DeleteMapping("/{id}")
    public String deleteGame(@PathVariable Long id) {

        return gameService.deleteGame(id);
    }
}