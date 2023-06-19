package maze;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * 
 * @author Amir
 * 
 */

public final class Map {
    private Scanner m, i1, i2, i3;
    private String Map[] = new String[25];
    private String Items1[] = new String[25];
    private String Items2[] = new String[25];
    private String Items3[] = new String[25];
    public String getMap[][] = new String[25][25];
    public String getItems1[][] = new String[25][25];
    public String getItems2[][] = new String[25][25];
    public String getItems3[][] = new String[25][25];
    public Image star, wall, status, hitPoints, energy, hitPointsC, energyC,
            ssmallArrow, sfireArrow, sbigArrow, sstoneBreaker, skey,
            ssmallHealthPotion, sbigHealthPotion, senergyPotion, sreviveScroll,
            shawk, sshovel, sbigBag, schest, senemy,
            smallArrow, fireArrow, bigArrow, stoneBreaker, key,
            smallHealthPotion, bigHealthPotion, energyPotion, reviveScroll,
            hawk, shovel, bigBag, chest, enemy, end, lose;

    public Map() {
        ImageIcon img = new ImageIcon(".//resources//Star.jpg");
        star = img.getImage();
        img = new ImageIcon(".//resources//Wall2.jpg");
        wall = img.getImage();

        img = new ImageIcon(".//resources//sSmallArrow.gif");
        ssmallArrow = img.getImage();
        img = new ImageIcon(".//resources//sFireArrow.gif");
        sfireArrow = img.getImage();
        img = new ImageIcon(".//resources//sBigArrow.gif");
        sbigArrow = img.getImage();
        img = new ImageIcon(".//resources//sStoneBreaker.gif");
        sstoneBreaker = img.getImage();
        img = new ImageIcon(".//resources//sKey.gif");
        skey = img.getImage();
        img = new ImageIcon(".//resources//sSmallHealthPotion.gif");
        ssmallHealthPotion = img.getImage();
        img = new ImageIcon(".//resources//sBigHealthPotion.gif");
        sbigHealthPotion = img.getImage();
        img = new ImageIcon(".//resources//sEnergyPotion.gif");
        senergyPotion = img.getImage();
        img = new ImageIcon(".//resources//sReviveScroll.gif");
        sreviveScroll = img.getImage();
        img = new ImageIcon(".//resources//sHawk.gif");
        shawk = img.getImage();
        img = new ImageIcon(".//resources//sShovel.gif");
        sshovel = img.getImage();
        img = new ImageIcon(".//resources//sBigBag.gif");
        sbigBag = img.getImage();
        img = new ImageIcon(".//resources//sChest.gif");
        schest = img.getImage();
        img = new ImageIcon(".//resources//sEnemy.gif");
        senemy = img.getImage();

        img = new ImageIcon(".//resources//SmallArrow.gif");
        smallArrow = img.getImage();
        img = new ImageIcon(".//resources//FireArrow.gif");
        fireArrow = img.getImage();
        img = new ImageIcon(".//resources//BigArrow.gif");
        bigArrow = img.getImage();
        img = new ImageIcon(".//resources//StoneBreaker.gif");
        stoneBreaker = img.getImage();
        img = new ImageIcon(".//resources//Key.gif");
        key = img.getImage();
        img = new ImageIcon(".//resources//SmallHealthPotion.gif");
        smallHealthPotion = img.getImage();
        img = new ImageIcon(".//resources//BigHealthPotion.gif");
        bigHealthPotion = img.getImage();
        img = new ImageIcon(".//resources//EnergyPotion.gif");
        energyPotion = img.getImage();
        img = new ImageIcon(".//resources//ReviveScroll.gif");
        reviveScroll = img.getImage();
        img = new ImageIcon(".//resources//Hawk.gif");
        hawk = img.getImage();
        img = new ImageIcon(".//resources//Shovel.gif");
        shovel = img.getImage();
        img = new ImageIcon(".//resources//BigBag.gif");
        bigBag = img.getImage();
        img = new ImageIcon(".//resources//Chest.gif");
        chest = img.getImage();
        img = new ImageIcon(".//resources//Enemy.gif");
        enemy = img.getImage();

        img = new ImageIcon(".//resources//Status.gif");
        status = img.getImage();
        img = new ImageIcon(".//resources//HitPoint.gif");
        hitPoints = img.getImage();
        img = new ImageIcon(".//resources//Energy.gif");
        energy = img.getImage();
        img = new ImageIcon(".//resources//HitPointsCount.gif");
        hitPointsC = img.getImage();
        img = new ImageIcon(".//resources//EnergyCount.jpg");
        energyC = img.getImage();

        img = new ImageIcon(".//resources//End.gif");
        end = img.getImage();

        openfile();
        readfile();
        closefile();
        setItem();
        setMap();
    }

    public void openfile() {
        try {
            m = new Scanner(new File(".//resources//Map.txt"));
            i1 = new Scanner(new File(".//resources//Items1.txt"));
            i2 = new Scanner(new File(".//resources//Items2.txt"));
            i3 = new Scanner(new File(".//resources//Items3.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error loading file.");
        }
    }

    public void readfile() {
        while (m.hasNext()) {
            for (int i = 0; i < 24; i++) {
                Map[i] = m.next();
            }
        }
        while (i1.hasNext()) {
            for (int i = 0; i < 24; i++) {
                Items1[i] = i1.next();
            }
        }
        while (i2.hasNext()) {
            for (int i = 0; i < 24; i++) {
                Items2[i] = i2.next();
            }
        }
        while (i3.hasNext()) {
            for (int i = 0; i < 24; i++) {
                Items3[i] = i3.next();
            }
        }
    }

    public void closefile() {
        m.close();
        i1.close();
        i2.close();
        i3.close();
    }

    public void setItem() {
        for (int j = 0; j < 24; j++) {
            for (int i = 0; i < 25; i++) {
                getItems1[i][j] = Items1[j].substring(i, i + 1);
                getItems2[i][j] = Items2[j].substring(i, i + 1);
                getItems3[i][j] = Items3[j].substring(i, i + 1);
            }
        }
    }

    public void setMap() {
        for (int j = 0; j < 24; j++) {
            for (int i = 0; i < 25; i++) {
                getMap[i][j] = Map[j].substring(i, i + 1);
            }
        }
    }
}
