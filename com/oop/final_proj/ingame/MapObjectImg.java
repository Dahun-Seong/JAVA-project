package com.oop.final_proj.ingame;

import javax.swing.*;

public class MapObjectImg {
    // 배경 이미지
    ImageIcon backIc; // 제일 뒷 배경
    ImageIcon secondBackIc; // 2번째 배경

    // 젤리 이미지 아이콘들
    ImageIcon jelly1Ic, jelly2Ic, jelly3Ic, jellyHPIc;  //맨 마지막은 물약 젤리 (먹으면 체력 만땅)
    ImageIcon jellyEffectIc;

    // 발판 이미지 아이콘들
    ImageIcon field1Ic; // 발판
    ImageIcon field2Ic; // 공중발판

    // 장애물 이미지 아이콘들
    ImageIcon tacle10Ic, tacle20Ic, tacle30Ic, tacle40Ic;

    // 디폴트 생성자
    public MapObjectImg(){ }

    //생성자
    public MapObjectImg(ImageIcon bg1, ImageIcon bg2, ImageIcon j1, ImageIcon j2, ImageIcon j3,
                        ImageIcon hp, ImageIcon je, ImageIcon f1, ImageIcon f2, ImageIcon t1,
                        ImageIcon t2, ImageIcon t3, ImageIcon t4){
        this.backIc = bg1;
        this.secondBackIc = bg2;
        this.jelly1Ic = j1;
        this.jelly2Ic = j2;
        this.jelly3Ic = j3;
        this.jellyHPIc = hp;
        this.jellyEffectIc = je;
        this.field1Ic = f1;
        this.field2Ic = f2;
        this.tacle10Ic = t1;
        this.tacle20Ic = t2;
        this.tacle30Ic = t3;
        this.tacle40Ic = t4;
    }


    //각종 접근자들
    public ImageIcon getBackIc(){
        return backIc;
    }

    public ImageIcon getSecondBackIc(){
        return secondBackIc;
    }

    public ImageIcon getJelly1Ic(){
        return jelly1Ic;
    }

    public ImageIcon getJelly2Ic(){
        return jelly2Ic;
    }

    public ImageIcon getJelly3Ic(){
        return jelly3Ic;
    }

    public ImageIcon getJellyHPIc(){
        return jellyHPIc;
    }

    public ImageIcon getJellyEffectIc(){
        return jellyEffectIc;
    }

    public ImageIcon getField1Ic(){
        return field1Ic;
    }

    public ImageIcon getField2Ic(){
        return field2Ic;
    }

    public ImageIcon getTacle10Ic(){
        return tacle10Ic;
    }

    public ImageIcon getTacle20Ic(){
        return tacle20Ic;
    }

    public ImageIcon getTacle30Ic(){
        return tacle30Ic;
    }

    public ImageIcon getTacle40Ic(){
        return tacle40Ic;
    }
}
