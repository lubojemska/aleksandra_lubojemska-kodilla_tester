package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DictionaryTestSuite {

    @Test
    public void testAddWord() {
        // given
        Dictionary dictionary = new Dictionary();
        String polishword = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        //when
        dictionary.addword(polishword, englishWord);
        //then
        assertEquals(1, dictionary.size());
    }
    @Test
    public void testFindEnglishWords() {
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addword("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addword("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addword("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addword("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        // when
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        // then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFingEnglishWords_withPartOfSpeech() {
        // given
        Dictionary dictionary = new Dictionary();
        dictionary.addword("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addword("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addword("brać", new EnglishWord(PartOfSpeech.VERB, "take"));
        dictionary.addword("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        // when
        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);
        // then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        assertEquals(expectedList, result);

    }


}