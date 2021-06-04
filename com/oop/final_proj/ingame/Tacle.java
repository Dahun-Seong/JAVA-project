package com.oop.final_proj.ingame;

import java.awt.*;

public class Tacle {
    private Image image;

    private int x,y;
    private int width, height;

    private int state;  //장애물 상태

    public Tacle(Image img, int x, int y, int w, int h, int s){
        this.image = img;
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.state = s;
    }

    //각종 접근자들
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Image getImage(){
        return image;
    }

    //각종 설정자들
    public void setX(int x){
        this.x = x;
    }
}
