package com.oop.final_proj.main;

import java.awt.event.*;
import javax.swing.*;
import java.awt.CardLayout;

import com.oop.final_proj.panels.*;
import com.oop.final_proj.ingame.CookieImg;

import com.oop.final_proj.ingame.Audio;

/*** [EventQueue.invokeLater] 관련 설명
 * AWT에서 UI 스레드는 event dispatch(ing) thread 또는 EDT라 한다.
 * 일반적인 Swing 애플리케이션의 main()은 GUI를 구동하는 Runnable 객체를 생성하여, EDT에서 실행되도록 요청하는 코드가 된다.
 * 여기서 실행을 요청하는 방법은 SwingUtilities 클래스의 invokeLater 메소드와 invokeAndWait 메소드가 있다.
 ***/


//이벤트 리스너들의 추상클래스인 listenAdaptor를 상속받는다.
public class Main extends listenAdaptor {
	public Audio backgroundMusic;
	public Audio buttonClickSound;
	public JFrame frame;

    /* 각 게임 화면에 대한 판넬 */
    private IntroPanel introPanel; // 인트로
    private SelectPanel selectPanel; // 캐릭터 선택
    private GamePanel gamePanel; // 게임진행
    private EndPanel endPanel; // 게임결과

    private CardLayout cl; // 카드 레이이웃 오브젝트

    //private CookieImg ci; // 쿠키이미지 (써야 하나...? 이미지가 엄청 다양하던데....)

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public void setGamePanel(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public EndPanel getEndPanel() {
        return endPanel;
    }



    /* 생성자 */
    public Main() {
    	
    	// 성다훈 : 인트로 음악 추가
        backgroundMusic = new Audio("src/audio/intro.wav", false);
        backgroundMusic.start();
        
        //1. 프레임 기본 설정 (프레임을 CardLayout으로 설정)
        //*CardLayout : 특정 이벤트 발생 시 다른 판넬로 전환되는 방식의 레이아웃/
        frame = new JFrame("눈송이의 숙대 모험");
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null); // 창을 화면 중앙에 배치
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 엑스버튼을 누르면 종료
        cl = new CardLayout(0, 0); // 카드레이아웃 객체 생성
        frame.getContentPane().setLayout(cl); // 프레임을 카드레이아웃으로 변경

        //2. introPanel 객체 생성
        introPanel = new IntroPanel();
        introPanel.addMouseListener(this); // intro패널은 여기서 바로 넣는 방식으로 마우스리스너를 추가함.
        introPanel.setLayout(null);

        //3. selectPanel, gamePanel, endPanel 객체 생성
        selectPanel = new SelectPanel(this); // Main의 리스너를 넣기위한 this
        selectPanel.setLayout(null);
        gamePanel = new GamePanel(frame, cl, this); // Main의 프레임 및 카드레이아웃을 이용하고 리스너를 넣기위한 this
        gamePanel.setLayout(null);
        endPanel = new EndPanel(this); // Main의 리스너를 넣기위한 this
        endPanel.setLayout(null);

        //4. 프레임에 패널들을 추가한다.(카드 레이아웃을 위한 패널들)
        frame.getContentPane().add(introPanel, "intro");
        frame.getContentPane().add(selectPanel, "select");
        frame.getContentPane().add(gamePanel, "game");
        frame.getContentPane().add(endPanel, "end");
    }

    
    
    
    /* 각 panel에서 화면을 클릭했을 경우 처리 */
    @Override
    public void mouseClicked(MouseEvent e) { // mousePressed로 변경가능
        if (e.getComponent().toString().contains("IntroPanel")) { // 1. IntroPanel에서 화면을 클릭했다면
            try {
                Thread.sleep(300);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            cl.show(frame.getContentPane(), "select"); // SelectPanel을 최상단 판넬로 변경
            selectPanel.requestFocus(); // 리스너를 selectPanel에 강제로 줌

        } else if (e.getComponent().getName().equals("StartBtn")) { // 2. SelectPanel의 StartBtn 버튼을 눌렀다면
            /*if (selectPanel.getCi() == null) {  // 캐릭터를 안골랐을경우 팝업 (삭제하기)
                JOptionPane.showMessageDialog(null, "캐릭터를 골라주세요"); 
            } else {  //캐릭터를 골랐다면
                cl.show(frame.getContentPane(), "game"); // GamePanel을 최상단으로 변경
                gamePanel.gameSet(selectPanel.getCi()); // 선택한 캐릭터 쿠키이미지를 넘겨주고 게임패널 세팅
                gamePanel.gameStart(); // 게임시작
                gamePanel.requestFocus(); // 리스너를 gamePanel에 강제로 줌
            }*/
        	
        	buttonClickSound = new Audio("src/audio/buttonClick.wav", false);
        	buttonClickSound.start();
        	// 성다훈 : intro 음악 중단
            backgroundMusic.stop();
        	
            
            cl.show(frame.getContentPane(), "game"); // GamePanel을 최상단으로 변경
            gamePanel.gameSet(selectPanel.getCi()); // 선택한 캐릭터 쿠키이미지를 넘겨주고 게임패널 세팅
            gamePanel.gameStart(); // 게임시작
            gamePanel.requestFocus(); // 리스너를 gamePanel에 강제로 줌

        } else if (e.getComponent().getName().equals("endAccept")) { // 3. EndPanel의 endAccept 버튼을 눌렀다면
        	
        	//성다훈 : 버튼 클릭 효과음 추가
        	buttonClickSound = new Audio("src/audio/buttonClick.wav", false);
        	buttonClickSound.start();
        	
            frame.getContentPane().remove(gamePanel); //기존의 GamePanel을 프레임에서 삭제
            gamePanel = new GamePanel(frame, cl, this); // GamePanel을 새 패널로 교체
            gamePanel.setLayout(null);
            frame.getContentPane().add(gamePanel, "game"); // 프레임에 새 게임패널 추가 (카드레이아웃 하단)

            /*frame.getContentPane().remove(selectPanel); // 방금 선택했던 select패널을 삭제
            selectPanel = new SelectPanel(this); // select 패널을 새 패널로 교체
            selectPanel.setLayout(null);
            frame.getContentPane().add(selectPanel, "select"); // 프레임에 새 select패널 추가(카드레이아웃 하단)

            cl.show(frame.getContentPane(), "select"); // 새 select패널을 카드레이아웃 최상단으로 이동 (화면에 보임)
            selectPanel.requestFocus(); // 리스너를 select패널에 강제로 줌*/

            System.exit(0);  //프로그램 종료
        }
    }
}
