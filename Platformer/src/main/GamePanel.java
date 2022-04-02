package main;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import static main.Game.GAME_HEIGHT;
import static main.Game.GAME_WIDTH;

import static util.Constants.PlayerConstants.*;
import static util.Constants.Directions.*;


public class GamePanel extends JPanel {

    private MouseInputs mouseInput;
    private Game game;
    public GamePanel(Game game) {

        mouseInput = new MouseInputs(this);
        this.game = game;

        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInput);
        addMouseMotionListener(mouseInput);

    }



    private void setPanelSize() {
        Dimension size = new Dimension(GAME_WIDTH,GAME_HEIGHT);
        setPreferredSize(size);
        System.out.println("Size : " + GAME_WIDTH+  "+" + GAME_HEIGHT);
    }


    public void updateGame() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.render(g);

    }

    public Game getGame() {
        return game;
    }

}
