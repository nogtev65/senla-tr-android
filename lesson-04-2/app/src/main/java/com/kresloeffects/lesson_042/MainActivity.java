package com.kresloeffects.lesson_042;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stringArrayOne();
        stringArrayTwo();
    }
    void stringArrayTwo(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("Страбоскоп");
        words.add("эксэнтриситет");
        words.add("дебаланс");
        words.add("шарнир");
        words.add("ротор");
        words.add("мотор");
        words.add("тахометор");
        words.add("каста");
        words.add("бердыш");
        words.add("телефон");
        words.add("стекло");
        words.add("отвЕртка");
        words.add("колориМетр");
        words.add("ФриЗа");
        words.add("ТоПоР");
        words.add("ГрадусЫ");
        words.add("шуФля");
        words.add("Мусор");
        words.add("Кегля");

        StringBuilder str = new StringBuilder();

        for(String word: words){
            String firstPart;
            String secondPart;
            firstPart = word.substring(0,1);
            secondPart = word.substring(1);
            firstPart.toUpperCase();
            secondPart.toLowerCase();
            word = firstPart+secondPart;
            str.append(word);
        }
        android.util.Log.e("",str.toString());
    }


    void stringArrayOne() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Страбоскоп");
        words.add("эксэнтриситет");
        words.add("дебаланс");
        words.add("шарнир");
        words.add("ротор");
        words.add("мотор");
        words.add("тахометор");
        words.add("каста");
        words.add("бердыш");
        words.add("телефон");
        words.add("стекло");
        words.add("отвЕртка");
        words.add("колориМетр");
        words.add("ФриЗа");
        words.add("ТоПоР");
        words.add("ГрадусЫ");
        words.add("шуФля");
        words.add("Мусор");
        words.add("Кегля");

        int n = 3;

        for(int i = 0; i<words.size(); i+=n){
            android.util.Log.e("Word",words.get(i));
        }
    }

    void main(){
        ArrayList<String> words = new ArrayList<String>();
        words.add("Hrodna");
        words.add("Minsk");
        words.add("Hrodna");
        words.add("Hrodna");
        words.add("Brest");
        words.add("Minsk");
        words.add("Vitebsk");
        words.add("Hrodna");
        words.add("Brest");
        words.add("Minsk");
        words.add("Vitebsk");
        words.add("Brest");
        words.add("Minsk");
        words.add("Vitebsk");
        words.add("Hrodna");
        words.add("Brest");
        HashMap<String, Integer> uniqueWords = new HashMap<String, Integer>();

        for (String word: words) {
            if (uniqueWords.containsKey(word)) {
                Integer wordCount = uniqueWords.get(word);
                uniqueWords.put(word, ++wordCount);
            } else {
                uniqueWords.put(word, 1);
            }
        }

        ArrayList<Entry<String,Integer>> wordEntries = new ArrayList<Entry<String,Integer>>(uniqueWords.entrySet());
        for(int i=0; i < wordEntries.size() - 1; i++) {
            for(int j=i; j < wordEntries.size(); j++) {
                Entry<String, Integer> firstEntry = wordEntries.get(i);
                Entry<String, Integer> secondEntry = wordEntries.get(j);
                if(firstEntry.getValue() >= secondEntry.getValue()) {
                    Entry<String, Integer> tempEntry = firstEntry;
                    wordEntries.set(i,secondEntry);
                    wordEntries.set(j, tempEntry);
                }
            }
        }

        for (Entry wordEntry:wordEntries) {
            android.util.Log.e("tag","word: " + wordEntry.getKey().toString() + " count :" + wordEntry.getValue().toString());
        }
    }
}
