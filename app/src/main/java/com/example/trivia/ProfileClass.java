package com.example.trivia;

public class ProfileClass {
    private String name;
    private int yearOfBirth;
    private int wins;
    private int fails;
    private int totalQuestionsAnsweredRight;
    private int totalQuestionsAnsweredWrong;

    //Constructor Declaration of variables;
    public ProfileClass(String name, int yearOfBirth, int wins,
                        int fails, int totalQuestionsAnsweredRight, int totalQuestionsAnsweredWrong){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.wins = wins;
        this.fails = fails;
        this.totalQuestionsAnsweredRight = totalQuestionsAnsweredRight;
        this.totalQuestionsAnsweredWrong = totalQuestionsAnsweredWrong;
    }

    //Get functions.
    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getWins() {
        return wins;
    }

    public int getFails() {
        return fails;
    }

    public int getTotalQuestionsAnsweredRight() {
        return totalQuestionsAnsweredRight;
    }

    public int getTotalQuestionsAnsweredWrong() {
        return totalQuestionsAnsweredWrong;
    }

    //Set functions.
    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setFails(int fails) {
        this.fails = fails;
    }

    public void setTotalQuestionsAnsweredRight(int totalQuestionsAnsweredRight) {
        this.totalQuestionsAnsweredRight = totalQuestionsAnsweredRight;
    }

    public void setTotalQuestionsAnsweredWrong(int totalQuestionsAnsweredWrong) {
        this.totalQuestionsAnsweredWrong = totalQuestionsAnsweredWrong;
    }

    //General functions.
    public void addGameResult(Boolean gameResult){
        if (gameResult){
            this.wins++;
        }

        else{
            this.fails++;
        }
    }
}
