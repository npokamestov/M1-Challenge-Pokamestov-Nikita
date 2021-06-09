package com.randomFunService.randomFunService.controller;

import com.randomFunService.randomFunService.model.Answer;
import com.randomFunService.randomFunService.model.Quote;
import com.randomFunService.randomFunService.model.Word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class RandomFunServiceController {

    private static List<Quote> quoteList = new ArrayList<>(Arrays.asList(
            new Quote(1,"Anatole France","Never lend books - nobody ever returns them; the only books I have in my library are those which people have lent me."),
            new Quote(2,"J.B. Priestly","I have always been delighted at the prospect of a new day, a fresh try, one more start, with perhaps a bit of magic waiting somewhere behind the morning."),
            new Quote(3,"Virginia Woolf","Those comfortably padded lunatic asylums which are known, euphemistically, as the stately homes of England."),
            new Quote(4,"Dave Barry","Flying from the U.S. to Tokyo takes approximately as long as law school."),
            new Quote(5,"Martin Luther","All who call on God in true faith, earnestly from the heart, will certainly be heard, and will receive what they have asked and desired."),
            new Quote(6,"William E. Holler","You can do what you want to do, accomplish what you want to accomplish, attain any reasonable objective ... if you want it, if you will to do it, if you work to do it, over a sufficiently long period of time."),
            new Quote(7,"Paul Goodman","I have learned to have very modest goals for society and myself, things like clean air, green grass, children with bright eyes, not being pushed around, useful work that suits one's abilities, plain tasty food, and occasional satisfying nookie."),
            new Quote(8,"John Morley","He who hates vice hates men."),
            new Quote(9,"Kajetan von Schlaggenberg","Maturity consists of no longer being taken in by oneself."),
            new Quote(10,"William Penn","The jealous are troublesome to others, but torment to themselves.")
    ));

    private static List<Word> wordList = new ArrayList<>(Arrays.asList(
            new Word(1, "grenadine", "thin syrup made from pomegranate juice; used in mixed drinks"),
            new Word(2, "hefty", "of considerable weight and size"),
            new Word(3, "gladiolus", "any of numerous plants of the genus Gladiolus native chiefly to tropical and South Africa having sword-shaped leaves and one-sided spikes of brightly colored funnel-shaped flowers; widely cultivated"),
            new Word(4, "pelter", "a thrower of missiles"),
            new Word(5, "concretize", "make something concrete"),
            new Word(6, "lubberly", "clumsy and unskilled"),
            new Word(7, "jocular", "characterized by jokes and good humor"),
            new Word(8, "tamp", "press down tightly"),
            new Word(9, "subnormality", "the state of being less than normal"),
            new Word(10, "obbligato", "a part of the score that must be performed without change or omission")
    ));

    private static List<Answer> answerList = new ArrayList<>();
    private static int answerIdCounter = 1;

    private static List<String> answerStrings = new ArrayList<>(Arrays.asList(
            "It is Certain.",
            "It is decidedly so.",
            "Without a doubt.",
            "Yes definitely.",
            "You may rely on it.",
            "As I see it, yes",
            "Most likely.",
            "Outlook good.",
            "Yes.",
            "Signs point to yes.",
            "Reply hazy, try again.",
            "Ask again later.",
            "Better not tell you now.",
            "Cannot predict now.",
            "Concentrate and ask again.",
            "Don't count on it.",
            "My reply is no.",
            "My sources say no.",
            "Outlook not so good.",
            "Very doubtful."
    ));

    Random random = new Random();

    @GetMapping("/quote")
    @ResponseStatus(HttpStatus.OK)
    public Quote getRandomQuote() {
        int randomQuote = random.nextInt(quoteList.size());
        return quoteList.get(randomQuote);
    }

    @GetMapping("/word")
    @ResponseStatus(HttpStatus.OK)
    public Word getRandomWord() {
        int randomWord = random.nextInt(wordList.size());
        return wordList.get(randomWord);
    }

    @PostMapping("/magic")
    @ResponseStatus(HttpStatus.CREATED)
    public Answer setRandomMagic(@RequestBody Answer answer) {
        int randomChoice = random.nextInt(answerStrings.size());
        String randomAnswer = answerStrings.get(randomChoice);

        answer.setId(answerIdCounter++);
        answer.setAnswer(randomAnswer);
        answerList.add(answer);

        return answer;
    }
}
