package co.com.sofka.mentoring35.controller;

import java.util.Date;

import co.com.sofka.mentoring35.repository.Random;
import co.com.sofka.mentoring35.repository.RandomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/r")
public class RandomController {

    private RandomRepository randomRepository;

    @Autowired
    public RandomController(RandomRepository randomRepository) {
        this.randomRepository = randomRepository;
    }


    @PostMapping("")
    public Mono<Random> post(){
        String valorCarta = String.valueOf(new java.util.Random().nextInt(13));
        switch (valorCarta){
            case "0":
                valorCarta = "As";
                break;
            case "1":
                valorCarta = "J";
                break;
            case "11":
                valorCarta = "Q";
                break;
            case "12":
                valorCarta = "K";
                break;
        }
        String valorPinta = String.valueOf(new java.util.Random().nextInt(4));
        switch (valorPinta){
            case "0":
                valorPinta = "Diamantes ♦";
                break;
            case "1":
                valorPinta = "Picas ♠";
                break;
            case "2":
                valorPinta = "Treboles ♣";
                break;
            case "3":
                valorPinta = "Corazones ♥";
                break;
        }
        String finalValorCarta = valorCarta;
        String finalValorPinta = valorPinta;
        return Mono.just(new Random()).map((entity) -> {
            entity.setDate(new Date());
            entity.setCarta(finalValorCarta + " de " + finalValorPinta);
            return entity;
        }).flatMap(randomRepository::save);
    }


    @GetMapping("")
    public Flux<Random> get() {
        return randomRepository.findAll();
    }
}
