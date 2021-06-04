/* 과제 sprite 클래스 */
/*** Jelly를 Assignment로 변경할 예정 ***/

package com.oop.final_proj.ingame;

import java.awt.*;

public class Assignment {
    Image image;

    int x, y;
    int width, height;

    int alpha;  //젤리의 투명도

    int score;  //각 젤리를 먹게되면 얻게되는 점수

    //디폴트 생성자
    public Assignment(){ }

    //생성자
    public Assignment(Image img, int x, int y, int w, int h, int a, int s){
        this.image = img;
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.alpha = a;
        this.score = s;
    }

    //접근자
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

    public int getAlpha(){
        return alpha;
    }

    public Image getImage(){
        return image;
    }

    public int getScore(){
        return score;
    }

    //각종 설정자
    public void setX(int x){
        this.x = x;
    }

    public void setAlpha(int a){
        this.alpha = a;
    }

    public void setImage(Image i){
        this.image = i;
    }
}
