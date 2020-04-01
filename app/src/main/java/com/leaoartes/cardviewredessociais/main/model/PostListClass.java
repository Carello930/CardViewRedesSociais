package com.leaoartes.cardviewredessociais.main.model;

public class PostListClass {

    private String textViewPostTitle, textViewDescription;
    private int imagePostView;

    public PostListClass() {
    }

    public PostListClass(String textViewPostTitle, String textViewDescription, int imagePostView) {
        this.textViewPostTitle = textViewPostTitle;
        this.textViewDescription = textViewDescription;
        this.imagePostView = imagePostView;
    }

    public String getTextViewPostTitle() {
        return textViewPostTitle;
    }

    public void setTextViewPostTitle(String textViewPostTitle) {
        this.textViewPostTitle = textViewPostTitle;
    }

    public String getTextViewDescription() {
        return textViewDescription;
    }

    public void setTextViewDescription(String textViewDescription) {
        this.textViewDescription = textViewDescription;
    }

    public int getImagePostView() {
        return imagePostView;
    }

    public void setImagePostView(int imagePostView) {
        this.imagePostView = imagePostView;
    }
}
