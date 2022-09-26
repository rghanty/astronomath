package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz {
    private int finalScore;
    private Map<Integer, ArrayList<String>> feedbacks;
    private Map<Integer, List<Question>> questions;


    public Quiz() {
        questions = new HashMap<>();
        feedbacks = new HashMap<>();
        for (int i = 1; i <=5; i++) {
            feedbacks.put(i, new ArrayList<>());
            questions.put(i, new ArrayList<>());
        }
        this.finalScore = 0;
    }

    public ArrayList<String> getFeedBack(int level) {
        ArrayList<String> retArray = new ArrayList<>();
        for (int i : feedbacks.keySet()) {
            if (i == level) {
                retArray = feedbacks.get(i);
            }
        }
        return retArray;
    }


    public void addQuestion(Question question) {
        switch (question.getLevel()) {
            case 1: questions.get(1).add(question);
                break;
            case 2: questions.get(2).add(question);
                break;
            case 3: questions.get(3).add(question);
                break;
            case 4: questions.get(4).add(question);
                break;
            case 5: questions.get(5).add(question);
                break;
        }
    }

    public Map<Integer, List<Question>> getQuestions() {
        return questions;
    }

    public Map<Integer, ArrayList<String>> getFeedback() {return feedbacks;}


    public int getFinalScore() {
        return finalScore;
    }

    public void incrementScore(int score) {
        finalScore += score;
    }
}


