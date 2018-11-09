package com.example.marryzhi.cutecat;

public class Images {
    private String imageUrl;
    private String name;


    public Images() {
        super();
    }


    public Images(String imageUrl, String name) {
        super();
        this.imageUrl = imageUrl;
        this.name = name;
    }


    public String getImageUrl() {
        return imageUrl;
    }


    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Images [imageUrl=" + imageUrl + ", name=" + name + "]";
    }


}
