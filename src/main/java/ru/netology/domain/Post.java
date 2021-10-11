package ru.netology.domain;

public class Post {
    private int id;
    private int publicationDate;
    private String titlePictureImageUrl;
    private String menuUrl;
    private String mainText;
    private String imageInTextUrl;
    private int cunterLike;
    private int cunterView;
    private String buttonShare;
    private String commentsInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitlePictureImageUrl() {
        return titlePictureImageUrl;
    }

    public void setTitlePictureImageUrl(String titlePictureImageUrl) {
        this.titlePictureImageUrl = titlePictureImageUrl;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getImageInTextUrl() {
        return imageInTextUrl;
    }

    public void setImageInTextUrl(String imageInTextUrl) {
        this.imageInTextUrl = imageInTextUrl;
    }

    public int getCunterLike() {
        return cunterLike;
    }

    public void setCunterLike(int cunterLike) {
        this.cunterLike = cunterLike;
    }

    public int getCunterView() {
        return cunterView;
    }

    public void setCunterView(int cunterView) {
        this.cunterView = cunterView;
    }

    public String getButtonShare() {
        return buttonShare;
    }

    public void setButtonShare(String buttonShare) {
        this.buttonShare = buttonShare;
    }

    public String getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(String commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
