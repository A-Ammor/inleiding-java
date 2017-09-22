package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by aammo on 13-9-2017.
 */

public class Praktijkopdracht_h14 extends Applet {
    private Image smileyWin;
    private Image smileyLose;
    private Image aiLose;
    private Image playerLose;
    private URL pad;
    private AudioClip sound;
    private AudioClip reset;
    private AudioClip loseMusic;
    private AudioClip victory;
    //private AudioClip startSong;
    TextField tekstvak;
    int stenen = 23;
    int invoer;
    boolean beurten = false;
    int computerAantal = 0;
    boolean einde = false;
    boolean error;
    String resetTekst;
    int x = 275;

    public void init() {
        setSize(500, 430);
        pad = Praktijkopdracht_h14.class.getResource("/resources/");
        smileyWin = getImage(pad, "happy.png");
        smileyLose = getImage(pad, "neutral.png");
        aiLose = getImage(pad, "evrytiem.jpg");
        playerLose = getImage(pad, "win.jpg");
        sound = getAudioClip(pad, "laugh.wav");
        reset = getAudioClip(pad, "reset.wav");
        victory = getAudioClip(pad, "victory.wav");
        loseMusic = getAudioClip(pad, "loseMusic.wav");
        //startSong = getAudioClip(pad, "startSong.wav");
        textfield();

        Button resetButton = new Button("Reset");
        add(resetButton);
        resetButton.addActionListener(new ResetButtonActionListener());
    }

    public void start() {
        //startSong.play();
    }

    public void berekening() {
        invoer = (Integer.parseInt(tekstvak.getText()));
        if (invoer >= 1 && invoer <= 3) {
            beurten = true;
            stenen -= invoer;
        } else if (3 < invoer || invoer > 5 || invoer < 0) {
            error();
        }
    }

    public void computerAI() {
        if (stenen > 0) {
            computerAantal = 0;
            if (stenen % 4 == 3) {
                computerAantal += 2;
            }
            if (stenen % 4 == 2) {
                computerAantal += 1;
            }
            if (stenen % 4 == 1) {
                computerAantal = (int) (Math.random() * 3 + 1);
            }
            if (stenen % 4 == 0) {
                computerAantal += 3;
            }
            // hier is de uitwerking van de AI (ctrl + .)
            stenen = stenen - computerAantal;
            beurten = false;
        }
    }

    public void textfield() {
        tekstvak = new TextField(8);
        add(tekstvak);
        Listen aa = new Listen();
        tekstvak.addActionListener(aa);
    }

    public void paint(Graphics g) {
        g.drawString("Typ een cijfer van 1-3 in en druk op 'Enter'", 125, 50);

        if (stenen <= 0) {
            resetTekst = "";
            tekstvak.setText("");
        } else if (stenen >= 0) {
            resetTekst = "Aantal stenen: " + stenen;
        }

        if (stenen == 1) {
            resetTekst = "Laatste steen: " + stenen;
        }

        if (stenen >= 23) {
            g.drawString("Jij mag beginnen. Good luck!", x, 400);
        } else if (stenen <= 0) {
            g.drawString("Het spel is afgelopen!", x, 400);
        } else {
            g.drawString("De AI heeft " + computerAantal + " weggehaalt, " + "jouw beurt.", x, 400);
        }

        g.drawString("" + resetTekst, x, 350);

        if (stenen > 0) {
            int x = 50;
            int y = 75;

            for (int i = 1; i <= stenen; i++) {
                if (stenen == 1 || stenen == 5 || stenen == 9 || stenen == 13 || stenen == 17 || stenen == 21) {
                    g.drawImage(smileyWin, x, y, 50, 50, this);
                } else {
                    g.drawImage(smileyLose, x, y, 50, 50, this);
                }
                x += 75;
                if (i % 4 == 0) {
                    x = 50;
                    y += 50;
                }
            }
        }

        if (stenen <= 0) {
            winUitkomst();
            //startSong.stop();
            einde = true;
        }
        if (error == true) {
            error();
            error = false;
        }
    }


    public void error() {
        if (invoer > 3 || invoer < 1) {
            error = true;
            getGraphics().drawString("Voer een getal tussen 1-3 in aub", x, 375);
        }
    }

    public void winUitkomst() {
        if (beurten == false) {
            gewonnen();
            einde = true;
        } else {
            verloren();
            einde = true;
        }
    }

    public void gewonnen() {
        getGraphics().drawString("U heeft gewonnen", 300, 350);
        getGraphics().drawImage(aiLose, 150, 100, 200, 200, this);
        victory.play();
    }

    public void verloren() {
        getGraphics().drawString("U heeft verloren", 300, 350);
        getGraphics().drawImage(playerLose, 150, 100, 200, 200, this);
        sound.play();
        //loseMusic.play();
    }

    class Listen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (stenen >= 1) {
                berekening();
            }
            if (invoer >= 1 && invoer <= 3) {
                computerAI();
            }
            tekstvak.setText("");
            repaint();
        }
    }

    private class ResetButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            reset.play();
            victory.stop();
            sound.stop();
            computerAantal = 0;
            stenen = 23;
            tekstvak.requestFocus();
            //startSong.play();
            repaint();
        }
    }
}