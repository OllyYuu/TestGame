package com.company;

import java.awt.*;

/**
 * Created by OllyYuu on 21.06.2015.
 */
public class GameView extends Component {

    public final static int CELL_SIZE = 64;
    int size = 10;

    int k = 0;
    int l = 0;

    private Field field;
    public imageManadger iMag;

    public GameView(Field field) {
        this.field = field;
        iMag = new imageManadger();
    }

    public void setCell(int key){
        switch (key) {
            case 38:
                if (l>0) l--;
                break;
            case 39: if (k<20) k++;
                break;
            case 40: if (l<20) l++;
                break;
            case 37: if (k>0) k--;
                break;
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());



        for (int i = k; i < size+k; i++) {
            for (int j = l; j < size+l; j++) {
                if (field.area[i][j]>9) {
                    g.drawImage(iMag.loadImage("graph/"+field.area[i][j] + ".gif"), (i-k)* CELL_SIZE, (j-l) * CELL_SIZE, this);
                } else g.drawImage(iMag.loadImage("graph/0"+field.area[i][j] + ".gif"), (i-k)* CELL_SIZE, (j-l) * CELL_SIZE, this);


              /*
                if (field.area[i][j] < 0.5) {
                    g.drawImage(iMag.loadImage("graph/01.gif"), (i-k)* CELL_SIZE, (j-l) * CELL_SIZE, this);
                } else g.drawImage(iMag.loadImage("graph/02.gif"), (i-k)* CELL_SIZE, (j-l) * CELL_SIZE, this);
               */


            }
        }
    }
}
