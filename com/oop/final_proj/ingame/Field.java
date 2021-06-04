/* 발판 클래스 */

package com.oop.final_proj.ingame;

import java.awt.*;

public class Field {
    private Image image;  //발판 이미지

    private int x, y;  //발판 위치
    private int width, height;  //발판 크기

    //생성자
    public Field(Image image, int x, int y ,int w, int h){
        this.image = image;
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
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
