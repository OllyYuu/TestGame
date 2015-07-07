package com.company;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

/**
 * Created by OllyYuu on 21.06.2015.
 */
public class imageManadger extends JPanel {

    HashMap <String, BufferedImage> cache = new HashMap <String, BufferedImage>();

    public imageManadger() {

    }

    public BufferedImage loadImage(String url){
        if (cache.containsKey(url)) {
            return cache.get(url);
        }
        BufferedImage image = null;
        URL resource = getClass().getResource(url);
        try {
            image = ImageIO.read(resource);
            cache.put(url, image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

}

