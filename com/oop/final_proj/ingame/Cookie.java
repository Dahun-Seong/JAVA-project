/* 눈송이 클래스 */

package com.oop.final_proj.ingame;

import java.awt.*;

public class Cookie {

    private Image image;  //송이 이미지

    private int x = 160, y = 0;  //송이 위치
    private int width = 80, height = 120;  //송이 크기

    private int alpha = 255;  //송이 투명도 (완전 불투명) → 피격 시 약간 투명하게 만들기 위해 넣은 변수

    private int health = 1000;  //송이 생명

    private int big = 0;  //거대화 남은 시간 (미구현?)
    private int fast = 0;  //가속화 남은 시간 (미구현?)
    private int countJump = 0;  //점프 횟수
    private boolean invincible = false;  //무적 여부
    private boolean fall = false;  //낙하 여부
    private boolean jump = false;  //점프 여부


    //생성자
    public Cookie(Image image){
        this.image = image;
    }

    //각종 접근자
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

    public int getCountJump(){
        return countJump;
    }

    public Image getImage(){
        return image;
    }

    public boolean isFall(){
        return fall;
    }

    public boolean isJump(){
        return jump;
    }

    public boolean isInvincible(){
        return invincible;
    }

    public int getHealth(){
        return health;
    }

    public int getAlpha(){
        return alpha;
    }

    //각종 설정자
    public void setImage(Image img){
        this.image = img;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setInvincible(boolean i){
        this.invincible = i;
    }

    public void setAlpha(int a){
        this.alpha = a;
    }

    public void setFall(boolean f){
        this.fall = f;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setCountJump(int c){
        this.countJump = c;
    }

    public void setJump(boolean j){
        this.jump = j;
    }


}
