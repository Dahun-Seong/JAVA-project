/* 배경 클래스 */

package com.oop.final_proj.ingame;

import java.awt.*;

public class Back {
    private Image image;
    private int x, y;
    private int width, height;

    //생성자
    public Back(Image image, int x, int y, int w, int h){
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    //각종 접근자
    public Image getImage(){
        return image;
    }

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

    //각종 설정자
    public void setX(int x){
        this.x = x;
    }
}
