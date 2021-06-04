package com.oop.final_proj.ingame;

import javax.swing.*;
import java.awt.*;

public class CookieImg {
    private ImageIcon cookieIc; // 기본모션
    private ImageIcon jumpIc; // 점프모션
    private ImageIcon doubleJumpIc; // 더블점프모션
    private ImageIcon fallIc; // 낙하모션(더블 점프 후)
    private ImageIcon slideIc; // 슬라이드 모션
    private ImageIcon hitIc; // 부딛히는 모션

    //디폴트 생성자
    public CookieImg(){ }

    //생성자
    public CookieImg(ImageIcon a, ImageIcon b, ImageIcon c, ImageIcon d, ImageIcon e, ImageIcon f){
        this.cookieIc = a;
        this.jumpIc = b;
        this.doubleJumpIc = c;
        this.fallIc = d;
        this.slideIc = e;
        this.hitIc = f;
    }

    //각종 접근자
    public ImageIcon getCookieIc(){
        return cookieIc;
    }

    public ImageIcon getJumpIc(){
        return jumpIc;
    }

    public ImageIcon getDoubleJumpIc(){
        return doubleJumpIc;
    }

    public ImageIcon getFallIc(){
        return fallIc;
    }

    public ImageIcon getSlideIc(){
        return slideIc;
    }

    public ImageIcon getHitIc(){
        return hitIc;
    }
}
