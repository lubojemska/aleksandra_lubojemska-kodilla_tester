package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addword(String polishword, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishword, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishword, englishWords);

    }

    public List<EnglishWord> findEnglishWords(String polishword) {
        return dictionary.getOrDefault(polishword, Collections.emptyList());
    }

    public List<EnglishWord> findEnglishWords(String polishword, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishword : dictionary.getOrDefault(polishword, Collections.emptyList())) {
            if (englishword.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishword);

        }
        return result;
    }

    public int size() {
        return dictionary.size();
    }
}
