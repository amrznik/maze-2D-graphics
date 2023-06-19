package maze;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;

/**
 * 
 * @author Amir
 * 
 */

public class Ground extends JPanel implements ActionListener {
    private Timer timer;
    private Map m;
    private Player p;
    // private Music a;
    private boolean win = false, lose = false;
    long startTime = 0;
    private static int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0, x6 = 0, x7 = 0, x8 = 0, x9 = 0, x10 = 0, x11 = 0, x12 = 0;
    private static int energyCount = 100, hitPointsCount = 10, inventoryCount = 0, inventoryCapacity = 50;
    private static int smallArrow[] = new int[50];
    private static int fireArrow[] = new int[40];
    private static int bigArrow[] = new int[30];
    private static int stoneBreaker[] = new int[20];
    private static int key[] = new int[20];
    private static int smallHealthPotion[] = new int[20];
    private static int bigHealthPotion[] = new int[20];
    private static int energyPotion[] = new int[20];
    private static int reviveScroll[] = new int[20];
    private static int hawk[] = new int[20];
    private static int shovel[] = new int[20];
    private static int bigBag[] = new int[20];
    // private static int chest[] = new int[20];
    // private static int enemy[] = new int[50];

    public Ground() throws IOException, LineUnavailableException {
        startTime = System.currentTimeMillis();
        m = new Map();
        p = new Player();
        // a = new Music();
        addKeyListener(new Ground.Al());
        setFocusable(true);

        ImageIcon img1 = new ImageIcon(".//resources//Pick2.gif");
        ImageIcon img2 = new ImageIcon(".//resources//Drop2.gif");
        ImageIcon img3 = new ImageIcon(".//resources//Use2.gif");
        ImageIcon img4 = new ImageIcon(".//resources//Inventory2.gif");
        ImageIcon img5 = new ImageIcon(".//resources//Status.gif");
        // ImageIcon img6 = new ImageIcon(".//resources//Background.jpg");

        setLayout(null);
        JLabel pick = new JLabel(img1);
        JLabel drop = new JLabel(img2);
        JLabel use = new JLabel(img3);
        JLabel inventory = new JLabel(img4);
        JLabel status = new JLabel(img5);
        // JLabel background = new JLabel(img6);

        add(pick);
        add(drop);
        add(use);
        add(inventory);
        add(status);
        // add(background);

        pick.setBounds(new Rectangle(new Point(1090, 15), pick.getPreferredSize()));
        drop.setBounds(new Rectangle(new Point(1180, 15), drop.getPreferredSize()));
        use.setBounds(new Rectangle(new Point(1270, 15), use.getPreferredSize()));
        inventory.setBounds(new Rectangle(new Point(850, 15), inventory.getPreferredSize()));
        status.setBounds(new Rectangle(new Point(800, 130), status.getPreferredSize()));
        // background.setBounds(new Rectangle(new Point(-700, -200), background.getPreferredSize()));

        MouseAdapter iconMA = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                super.mouseClicked(me);
                // if ( !("g".equals(m.getItems1[p.getTileX()][p.getTileY()]) &&
                // "g".equals(m.getItems2[p.getTileX()][p.getTileY()]) &&
                // "g".equals(m.getItems3[p.getTileX()][p.getTileY()])) )
                if ("1".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "1".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "1".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "2".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "2".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "2".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "3".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "3".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "3".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "4".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "4".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "4".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "5".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "5".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "5".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "6".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "6".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "6".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "7".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "7".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "7".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "8".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "8".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "8".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "9".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "9".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "9".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "h".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "h".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "h".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "s".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "s".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "s".equals(m.getItems3[p.getTileX()][p.getTileY()])
                        || "b".equals(m.getItems1[p.getTileX()][p.getTileY()])
                        || "b".equals(m.getItems2[p.getTileX()][p.getTileY()])
                        || "b".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                    if (inventoryCount < inventoryCapacity) {
                        PickClicked();
                    } else {
                        JOptionPane.showMessageDialog(null, "The capacity of inventory is full, cannot Pick Item");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No items to Pick!");
                }
            }
        };
        pick.addMouseListener(iconMA);

        MouseAdapter iconMA2 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me2) {
                super.mouseClicked(me2);
                if (x1 > 0 || x2 > 0 || x3 > 0 || x4 > 0 || x5 > 0 || x6 > 0 || x7 > 0 || x8 > 0 || x9 > 0 || x10 > 0
                        || x11 > 0 || x12 > 0) {
                    if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "g".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        DropClicked();
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop item on this tile, because the capacity of this tile is full!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No items to Drop!");
                }
            }
        };
        drop.addMouseListener(iconMA2);

        MouseAdapter iconMA3 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me3) {
                super.mouseClicked(me3);
                if (x1 > 0 || x2 > 0 || x3 > 0 || x4 > 0 || x5 > 0 || x6 > 0 || x7 > 0 || x8 > 0 || x9 > 0 || x10 > 0
                        || x11 > 0 || x12 > 0) {
                    UseClicked();
                } else {
                    JOptionPane.showMessageDialog(null, "No items to Use!");
                }
            }
        };
        use.addMouseListener(iconMA3);

        MouseAdapter iconMA4 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me4) {
                super.mouseClicked(me4);
                InventoryClicked();
            }
        };
        inventory.addMouseListener(iconMA4);

        MouseAdapter iconMA5 = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me5) {
                super.mouseClicked(me5);
                StatusClicked();
            }
        };
        status.addMouseListener(iconMA5);

        timer = new Timer(10, this);
        timer.start();
    }

    public void PickClicked() {
        JTextField textField = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Item: "));
        myPanel.add(textField);
        myPanel.add(Box.createHorizontalStrut(15));
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Enter your number for Pick", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if ("1".equals(textField.getText()) || "2".equals(textField.getText()) || "3".equals(textField.getText())
                    || "4".equals(textField.getText()) || "5".equals(textField.getText())
                    || "6".equals(textField.getText()) || "7".equals(textField.getText())
                    || "8".equals(textField.getText()) || "9".equals(textField.getText())
                    || "10".equals(textField.getText()) || "11".equals(textField.getText())
                    || "12".equals(textField.getText())) {
                if ("1".equals(textField.getText())) {
                    if ("1".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "1".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "1".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("1".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("1".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("1".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        smallArrow[x1] = 1;
                        x1++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick SmallArrow!");
                    }
                }
                if ("2".equals(textField.getText())) {
                    if ("2".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "2".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "2".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("2".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("2".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("2".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        fireArrow[x2] = 1;
                        x2++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick FireArrow!");
                    }
                }
                if ("3".equals(textField.getText())) {
                    if ("3".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "3".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "3".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("3".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("3".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("3".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        bigArrow[x3] = 1;
                        x3++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick BigArrow!");
                    }
                }
                if ("4".equals(textField.getText())) {
                    if ("4".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "4".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "4".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("4".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("4".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("4".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        stoneBreaker[x4] = 1;
                        x4++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick StoneBreaker!");
                    }
                }
                if ("5".equals(textField.getText())) {
                    if ("5".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "5".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "5".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("5".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("5".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("5".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        key[x5] = 1;
                        x5++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick key!");
                    }
                }
                if ("6".equals(textField.getText())) {
                    if ("6".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "6".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "6".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("6".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("6".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("6".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        smallHealthPotion[x6] = 1;
                        x6++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick SmallHealthPotion!");
                    }
                }
                if ("7".equals(textField.getText())) {
                    if ("7".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "7".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "7".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("7".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("7".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("7".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        bigHealthPotion[x7] = 1;
                        x7++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick BigHealthPotion!");
                    }
                }
                if ("8".equals(textField.getText())) {
                    if ("8".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "8".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "8".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("8".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("8".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("8".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        energyPotion[x8] = 1;
                        x8++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick EnergyPotion!");
                    }
                }
                if ("9".equals(textField.getText())) {
                    if ("9".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "9".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "9".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("9".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("9".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("9".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        reviveScroll[x9] = 1;
                        x9++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick ReviveScroll!");
                    }
                }
                if ("10".equals(textField.getText())) {
                    if ("h".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "h".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "h".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("h".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("h".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("h".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        hawk[x10] = 1;
                        x10++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick Hawk!");
                    }
                }
                if ("11".equals(textField.getText())) {
                    if ("s".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "s".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "s".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("s".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("s".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("s".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        shovel[x11] = 1;
                        x11++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick Shovel!");
                    }
                }
                if ("12".equals(textField.getText())) {
                    if ("b".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "b".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "b".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                        if ("b".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("b".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("b".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        bigBag[x12] = 1;
                        x12++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot pick BigBag!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter an integer number from 1 to 12", "Error", 0);
            }
        }
    }

    public void DropClicked() {
        JTextField textField = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Item: "));
        myPanel.add(textField);
        myPanel.add(Box.createHorizontalStrut(15));
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Enter your number to Drop", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if ("1".equals(textField.getText()) || "2".equals(textField.getText()) || "3".equals(textField.getText())
                    || "4".equals(textField.getText()) || "5".equals(textField.getText())
                    || "6".equals(textField.getText()) || "7".equals(textField.getText())
                    || "8".equals(textField.getText()) || "9".equals(textField.getText())
                    || "10".equals(textField.getText()) || "11".equals(textField.getText())
                    || "12".equals(textField.getText())) {
                if ("1".equals(textField.getText())) {
                    if (!("1".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "1".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "1".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x1 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "1";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "1";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "1";
                                    }
                                }
                            }
                            x1--;
                            smallArrow[x1] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any SmallArrow in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop SmallArrow on this tile, because there is a SmallArrow in this tile!");
                    }
                }
                if ("2".equals(textField.getText())) {
                    if (!("2".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "2".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "2".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x2 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "2";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "2";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "2";
                                    }
                                }
                            }
                            x2--;
                            fireArrow[x2] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any FireArrow in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop FireArrow on this tile, because there is a FireArrow in this tile!");
                    }
                }
                if ("3".equals(textField.getText())) {
                    if (!("3".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "3".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "3".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x3 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "3";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "3";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "3";
                                    }
                                }
                            }
                            x3--;
                            bigArrow[x3] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any BigArrow in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop BigArrow on this tile, because there is a BigArrow in this tile!");
                    }
                }
                if ("4".equals(textField.getText())) {
                    if (!("4".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "4".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "4".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x4 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "4";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "4";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "4";
                                    }
                                }
                            }
                            x4--;
                            stoneBreaker[x4] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any StoneBreaker in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop StoneBreaker on this tile, because there is a StoneBreaker in this tile!");
                    }
                }
                if ("5".equals(textField.getText())) {
                    if (!("5".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "5".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "5".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x5 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "5";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "5";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "5";
                                    }
                                }
                            }
                            x5--;
                            key[x5] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any Key in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop Key on this tile, because there is a Key in this tile!");
                    }
                }
                if ("6".equals(textField.getText())) {
                    if (!("6".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "6".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "6".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x6 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "6";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "6";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "6";
                                    }
                                }
                            }
                            x6--;
                            smallHealthPotion[x6] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "There isn't any SmallHealthPotion in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop SmallHealthPotion on this tile, because there is a SmallHealthPotion in this tile!");
                    }
                }
                if ("7".equals(textField.getText())) {
                    if (!("7".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "7".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "7".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x7 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "7";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "7";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "7";
                                    }
                                }
                            }
                            x7--;
                            bigHealthPotion[x7] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "There isn't any BigHealthPotion in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop BigHealthPotion on this tile, because there is a BigHealthPotion in this tile!");
                    }
                }
                if ("8".equals(textField.getText())) {
                    if (!("8".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "8".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "8".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x8 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "8";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "8";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "8";
                                    }
                                }
                            }
                            x8--;
                            energyPotion[x8] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any EnergyPotion in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop EnergyPotion on this tile, because there is a EnergyPotion in this tile!");
                    }
                }
                if ("9".equals(textField.getText())) {
                    if (!("9".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "9".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "9".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x9 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "9";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "9";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "9";
                                    }
                                }
                            }
                            x9--;
                            reviveScroll[x9] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any ReviveScroll in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop ReviveScroll on this tile, because there is a ReviveScroll in this tile!");
                    }
                }
                if ("h".equals(textField.getText())) {
                    if (!("h".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "h".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "h".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x10 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "h";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "h";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "h";
                                    }
                                }
                            }
                            x10--;
                            hawk[x10] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any Hawk in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop Hawk on this tile, because there is a Hawk in this tile!");
                    }
                }
                if ("s".equals(textField.getText())) {
                    if (!("s".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "s".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "s".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x11 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "s";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "s";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "s";
                                    }
                                }
                            }
                            x11--;
                            shovel[x11] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any Shovel in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop Shovel on this tile, because there is a Shovel in this tile!");
                    }
                }
                if ("b".equals(textField.getText())) {
                    if (!("b".equals(m.getItems1[p.getTileX()][p.getTileY()])
                            || "b".equals(m.getItems2[p.getTileX()][p.getTileY()])
                            || "b".equals(m.getItems3[p.getTileX()][p.getTileY()]))) {
                        if (x12 > 0) {
                            if ("g".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "b";
                            } else {
                                if ("g".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "b";
                                } else {
                                    if ("g".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                                        m.getItems3[p.getTileX()][p.getTileY()] = "b";
                                    }
                                }
                            }
                            x12--;
                            bigBag[x12] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any BigBag in inventory to Drop!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Cannot drop BigBag on this tile, because there is a BigBag in this tile!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter an integer number from 1 to 12", "Error", 0);
            }
        }
    }

    public void UseClicked() {
        JTextField textField = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Item: "));
        myPanel.add(textField);
        myPanel.add(Box.createHorizontalStrut(15));
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Enter your number to Use", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if ("1".equals(textField.getText()) || "2".equals(textField.getText()) || "3".equals(textField.getText())
                    || "4".equals(textField.getText()) || "5".equals(textField.getText())
                    || "6".equals(textField.getText()) || "7".equals(textField.getText())
                    || "8".equals(textField.getText()) || "9".equals(textField.getText())
                    || "10".equals(textField.getText()) || "11".equals(textField.getText())
                    || "12".equals(textField.getText())) {
                if ("1".equals(textField.getText())) {
                    if (x1 > 0) {
                        if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])
                                || "e".equals(m.getItems2[p.getTileX()][p.getTileY()])
                                || "e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "g";
                            } else {
                                if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "g";
                                } else {
                                    m.getItems3[p.getTileX()][p.getTileY()] = "g";
                                }
                            }
                        }
                        x1--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any SmallArrow in inventory to Use!");
                    }
                }
                if ("2".equals(textField.getText())) {
                    if (x2 > 0) {
                        if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])
                                || "e".equals(m.getItems2[p.getTileX()][p.getTileY()])
                                || "e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                m.getItems1[p.getTileX()][p.getTileY()] = "g";
                            } else {
                                if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "g";
                                } else {
                                    m.getItems3[p.getTileX()][p.getTileY()] = "g";
                                }
                            }
                        }
                        if (p.getTileX() > 0 && p.getTileY() > 0 && p.getTileX() < 24 && p.getTileY() < 23) {
                            m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                            m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                            m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                            m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                        } else {
                            if (p.getTileX() == 0 && p.getTileY() == 0) {
                                m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                            } else {
                                if (p.getTileX() == 0 && p.getTileY() == 23) {
                                    m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                    m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                } else {
                                    if (p.getTileX() == 24 && p.getTileY() == 0) {
                                        m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                        m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                    } else {
                                        if (p.getTileX() == 24 && p.getTileY() == 23) {
                                            m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                            m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                        } else {
                                            if (p.getTileX() == 0) {
                                                m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                                m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                                m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                            } else {
                                                if (p.getTileY() == 0) {
                                                    m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                                    m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                                    m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                                } else {
                                                    if (p.getTileX() == 24) {
                                                        m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                                        m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                                        m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                                    } else {
                                                        if (p.getTileY() == 23) {
                                                            m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                                            m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                                            m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        x2--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any FireArrow in inventory to Use!");
                    }
                }
                if ("3".equals(textField.getText())) {
                    if (x3 > 0) {
                        if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            m.getItems1[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            m.getItems2[p.getTileX()][p.getTileY()] = "g";
                        }
                        if ("e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            m.getItems3[p.getTileX()][p.getTileY()] = "g";
                        }
                        x3--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any BigArrow in inventory to Use!");
                    }
                }
                if ("4".equals(textField.getText())) {
                    if (x4 > 0) {
                        if (p.getTileX() > 0 && p.getTileY() > 0 && p.getTileX() < 24 && p.getTileY() < 23) {
                            m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                            m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                            m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                            m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                        } else {
                            if (p.getTileX() == 0 && p.getTileY() == 0) {
                                m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                            } else {
                                if (p.getTileX() == 0 && p.getTileY() == 23) {
                                    m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                    m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                } else {
                                    if (p.getTileX() == 24 && p.getTileY() == 0) {
                                        m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                        m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                    } else {
                                        if (p.getTileX() == 24 && p.getTileY() == 23) {
                                            m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                            m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                        } else {
                                            if (p.getTileX() == 0) {
                                                m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                                m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                                m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                            } else {
                                                if (p.getTileY() == 0) {
                                                    m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                                    m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                                    m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                                } else {
                                                    if (p.getTileX() == 24) {
                                                        m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                                        m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                                        m.getMap[p.getTileX()][p.getTileY() + 1] = "g";
                                                    } else {
                                                        if (p.getTileY() == 23) {
                                                            m.getMap[p.getTileX()][p.getTileY() - 1] = "g";
                                                            m.getMap[p.getTileX() + 1][p.getTileY()] = "g";
                                                            m.getMap[p.getTileX() - 1][p.getTileY()] = "g";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        x4--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any StoneBreaker in inventory to Use!");
                    }
                }
                if ("5".equals(textField.getText())) {
                    if (x5 > 0) {
                        if ("c".equals(m.getItems1[p.getTileX()][p.getTileY()])
                                || "c".equals(m.getItems2[p.getTileX()][p.getTileY()])
                                || "c".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            if ("c".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                                if (p.getTileY() == 1 || p.getTileY() == 5 || p.getTileY() == 16) {
                                    m.getItems1[p.getTileX()][p.getTileY()] = "6";
                                }
                                if (p.getTileY() == 2 || p.getTileY() == 9) {
                                    m.getItems1[p.getTileX()][p.getTileY()] = "1";
                                }
                                if (p.getTileY() == 6 || p.getTileY() == 22) {
                                    m.getItems1[p.getTileX()][p.getTileY()] = "s";
                                }
                                if (p.getTileY() == 3 || p.getTileY() == 7) {
                                    m.getItems1[p.getTileX()][p.getTileY()] = "2";
                                }
                                if (p.getTileY() > 9 && p.getTileY() != 16 && p.getTileY() != 22) {
                                    m.getItems1[p.getTileX()][p.getTileY()] = "7";
                                }
                            } else {
                                if ("c".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                                    m.getItems2[p.getTileX()][p.getTileY()] = "9";
                                } else {
                                    m.getItems3[p.getTileX()][p.getTileY()] = "4";
                                }
                            }
                            x5--;
                        } else {
                            JOptionPane.showMessageDialog(null, "There isn't any Chest in this tile for unlock",
                                    "Error", 0);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any Key in inventory to Use!");
                    }
                }
                if ("6".equals(textField.getText())) {
                    if (x6 > 0) {
                        if (hitPointsCount > 8) {
                            hitPointsCount = 10;
                        } else {
                            hitPointsCount += 2;
                        }
                        x6--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any SmallHealthPotion in inventory to Use!");
                    }
                }
                if ("7".equals(textField.getText())) {
                    if (x7 > 0) {
                        if (hitPointsCount > 5) {
                            hitPointsCount = 10;
                        } else {
                            hitPointsCount += 5;
                        }
                        x7--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any BigHealthPotion in inventory to Use!");
                    }
                }
                if ("8".equals(textField.getText())) {
                    if (x8 > 0) {
                        if (energyCount > 90) {
                            energyCount = 100;
                        } else {
                            energyCount += 10;
                        }
                        x8--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any EnergyPotion in inventory to Use!");
                    }
                }
                if ("9".equals(textField.getText())) {
                    if (x9 > 0) {
                        JOptionPane.showMessageDialog(null,
                                "Cannot use ReviveScroll, ReviveScroll automatically gives you 50 HitPoints or Energy when you are dying!");
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any ReviveScroll in inventory!");
                    }
                }
                if ("10".equals(textField.getText())) {
                    if (x10 > 0) {
                        /*
                         * if ( "w".equals(m.getMap[p.getTileX()][p.getTileY()-1]) ||
                         * "w".equals(m.getMap[p.getTileX()+1][p.getTileY()]) ||
                         * "w".equals(m.getMap[p.getTileX()][p.getTileY()+1]) ||
                         * "w".equals(m.getMap[p.getTileX()-1][p.getTileY()]))
                         * {
                         * if ( "w".equals(m.getMap[p.getTileX()][p.getTileY()-1]) )
                         * {
                         * JOptionPane.showMessageDialog(null,"North Tile: " + "Wall" + "\nEast Tile: "
                         * + m.getItems1[p.getTileX()+1][p.getTileY()] + ", "+
                         * m.getItems2[p.getTileX()+1][p.getTileY()] + ", " +
                         * m.getItems3[p.getTileX()+1][p.getTileY()] + "\nSouth Tile: " +
                         * m.getItems1[p.getTileX()][p.getTileY()+1] + ", "+
                         * m.getItems2[p.getTileX()][p.getTileY()+1] + ", " +
                         * m.getItems3[p.getTileX()][p.getTileY()+1] + "\nWest Tile: " +
                         * m.getItems1[p.getTileX()-1][p.getTileY()] + ", " +
                         * m.getItems2[p.getTileX()-1][p.getTileY()] + ", " +
                         * m.getItems3[p.getTileX()-1][p.getTileY()]);
                         * }
                         * if ( "w".equals(m.getMap[p.getTileX()+1][p.getTileY()]) )
                         * {
                         * 
                         * }
                         * if ( "w".equals(m.getMap[p.getTileX()][p.getTileY()+1]) )
                         * {
                         * 
                         * }
                         * if ( "w".equals(m.getMap[p.getTileX()-1][p.getTileY()]) )
                         * {
                         * 
                         * }
                         * }
                         * else
                         */
                        JOptionPane.showMessageDialog(null,
                                "North Tile: " + m.getItems1[p.getTileX()][p.getTileY() - 1] + ", "
                                        + m.getItems2[p.getTileX()][p.getTileY() - 1] + ", "
                                        + m.getItems3[p.getTileX()][p.getTileY() - 1] + "\nEast Tile: "
                                        + m.getItems1[p.getTileX() + 1][p.getTileY()] + ", "
                                        + m.getItems2[p.getTileX() + 1][p.getTileY()] + ", "
                                        + m.getItems3[p.getTileX() + 1][p.getTileY()] + "\nSouth Tile: "
                                        + m.getItems1[p.getTileX()][p.getTileY() + 1] + ", "
                                        + m.getItems2[p.getTileX()][p.getTileY() + 1] + ", "
                                        + m.getItems3[p.getTileX()][p.getTileY() + 1] + "\nWest Tile: "
                                        + m.getItems1[p.getTileX() - 1][p.getTileY()] + ", "
                                        + m.getItems2[p.getTileX() - 1][p.getTileY()] + ", "
                                        + m.getItems3[p.getTileX() - 1][p.getTileY()]);
                        x10--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any Hawk in inventory!");
                    }
                }
                if ("11".equals(textField.getText())) {
                    if (x11 > 0) {
                        JTextField xField = new JTextField(5);
                        JTextField yField = new JTextField(5);
                        JPanel myPanel2 = new JPanel();
                        myPanel2.add(new JLabel("dx: "));
                        myPanel2.add(xField);
                        myPanel2.add(Box.createHorizontalStrut(35));
                        myPanel2.add(new JLabel("dy: "));
                        myPanel2.add(yField);

                        int result2 = JOptionPane.showConfirmDialog(null, myPanel2,
                                "Enter dx and dy Values to dig a Shovel", JOptionPane.OK_CANCEL_OPTION);
                        if (result2 == JOptionPane.OK_OPTION) {
                            if ("0".equals(xField.getText()) || "0".equals(yField.getText())) {
                                int dx = Integer.parseInt(xField.getText());
                                int dy = Integer.parseInt(yField.getText());
                                if (p.getTileX() + dx >= 0 && p.getTileY() + dy >= 0 && dx <= 5 && dy <= 5
                                        && "g".equals(m.getMap[p.getTileX() + dx][p.getTileY() + dy])) {
                                    p.move(dx, dy);
                                    energyCount--;
                                    x11--;
                                } else {
                                    JOptionPane.showMessageDialog(null, "You dig a wrong Shovel!", "Error", 0);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Please enter 0 in dxField or dyField to denote a direction, Try again!",
                                        "Error", 0);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any Shovel in inventory to Use!");
                    }
                }
                if ("12".equals(textField.getText())) {
                    if (x12 > 0) {
                        inventoryCapacity += 10;
                        x12--;
                    } else {
                        JOptionPane.showMessageDialog(null, "There isn't any BigBag in inventory to Use!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter an integer number from 1 to 12", "Error", 0);
            }
        }
    }

    public void InventoryClicked() {
        inventoryCount = x1 + x2 + x3 + x4 + x5 + x6 + x7 + x8 + x9 + x10 + x11 + x12;
        JOptionPane.showMessageDialog(null,
                "SmallArrow: " + x1 + "\nFireArrow: " + x2 + "\nBigArrow: " + x3 + "\nStoneBreaker: " + x4 + "\nKey: "
                        + x5 + "\nSmallHealthPotion: " + x6 + "\nBigHealthPotion: " + x7 + "\nEnergyPotion: " + x8
                        + "\nReviveScroll: " + x9 + "\nHawk: " + x10 + "\nShovel: " + x11 + "\nBigBag: " + x12 + "\n"
                        + "\nTotal: " + inventoryCount,
                "Inventory", 1);
    }

    public void StatusClicked() {
        JOptionPane.showMessageDialog(null, "HitPoints: " + 10 * hitPointsCount + "\nEnergy: " + energyCount, "Status",
                1);
    }

    public void actionPerformed(ActionEvent e) {
        if ("v".equals(m.getMap[p.getTileX()][p.getTileY()])) {
            win = true;
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (!win && !lose) {
            for (int y = 0; y < 24; y++) {
                for (int x = 0; x < 25; x++) {
                    if ("v".equals(m.getMap[x][y])) {
                        g.drawImage(m.end, x * 31, y * 31, null);
                    }
                    if ("w".equals(m.getMap[x][y])) {
                        g.drawImage(m.wall, x * 31, y * 31, null);
                    }
                    if ("g".equals(m.getMap[x][y])) {
                        g.drawImage(m.star, x * 31, y * 31, null);
                    }
                }
            }
            g.drawImage(p.getPlayer(), p.getTileX() * 31, p.getTileY() * 31, null);

            g.drawImage(m.hitPoints, 905, 120, null);
            g.drawImage(m.energy, 907, 170, null);

            for (int i = 1; i <= hitPointsCount; i++) {
                g.drawImage(m.hitPointsC, 935 + 20 * i, 120, null);
            }
            for (int i = 1; i <= energyCount; i++) {
                g.drawImage(m.energyC, 955 + 2 * i, 170, null);
            }

            g.drawImage(m.ssmallArrow, 810, 590, null);
            g.drawImage(m.sfireArrow, 880, 590, null);
            g.drawImage(m.sbigArrow, 950, 590, null);
            g.drawImage(m.sstoneBreaker, 1020, 590, null);
            g.drawImage(m.skey, 1090, 590, null);
            g.drawImage(m.ssmallHealthPotion, 1160, 590, null);
            g.drawImage(m.sbigHealthPotion, 810, 670, null);
            g.drawImage(m.senergyPotion, 880, 670, null);
            g.drawImage(m.sreviveScroll, 950, 670, null);
            g.drawImage(m.shawk, 1020, 670, null);
            g.drawImage(m.sshovel, 1090, 670, null);
            g.drawImage(m.sbigBag, 1160, 670, null);
            g.drawImage(m.schest, 1050, 480, null);
            g.drawImage(m.senemy, 810, 480, null);
            g.drawImage(m.senemy, 880, 480, null);
            g.drawImage(m.senemy, 950, 480, null);

            if ("1".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "1".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "1".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.smallArrow, 810, 590, null);
            }
            if ("2".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "2".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "2".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.fireArrow, 880, 590, null);
            }
            if ("3".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "3".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "3".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.bigArrow, 950, 590, null);
            }
            if ("4".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "4".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "4".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.stoneBreaker, 1020, 590, null);
            }
            if ("5".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "5".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "5".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.key, 1090, 590, null);
            }
            if ("6".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "6".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "6".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.smallHealthPotion, 1160, 590, null);
            }
            if ("7".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "7".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "7".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.bigHealthPotion, 810, 670, null);
            }
            if ("8".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "8".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "8".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.energyPotion, 880, 670, null);
            }
            if ("9".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "9".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "9".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.reviveScroll, 950, 670, null);
            }
            if ("h".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "h".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "h".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.hawk, 1020, 670, null);
            }
            if ("s".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "s".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "s".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.shovel, 1090, 670, null);
            }
            if ("b".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "b".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "b".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.bigBag, 1160, 670, null);
            }
            if ("c".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "c".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "c".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                g.drawImage(m.chest, 1050, 480, null);
            }
            if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])
                    || "e".equals(m.getItems2[p.getTileX()][p.getTileY()])
                    || "e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                int enm = 0;
                if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                    g.drawImage(m.enemy, 810, 480, null);
                    enm = 1;
                }
                if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                    if (enm == 1) {
                        g.drawImage(m.enemy, 880, 480, null);
                        enm = 2;
                    } else {
                        g.drawImage(m.enemy, 810, 480, null);
                        enm = 1;
                    }
                }
                if ("e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                    if (enm == 0) {
                        g.drawImage(m.enemy, 810, 480, null);
                    }
                    if (enm == 1) {
                        g.drawImage(m.enemy, 880, 480, null);
                    }
                    if (enm == 2) {
                        g.drawImage(m.enemy, 950, 480, null);
                    }
                }
            }
            if (hitPointsCount <= 0 && energyCount <= 0) {
                if (x9 >= 2) {
                    hitPointsCount = 5;
                    energyCount = 50;
                    x9 -= 2;
                    JOptionPane.showMessageDialog(null,
                            "You are lucky! because you have at least 2 ReviveScroll and you survive!");
                } else {
                    lose = true;
                    JOptionPane.showMessageDialog(null,
                            "You are unlucky! because you do not have ReviveScroll and you die!");
                }
            } else {
                if (hitPointsCount <= 0 || energyCount <= 0) {
                    if (hitPointsCount <= 0) {
                        if (x9 > 0) {
                            hitPointsCount = 5;
                            x9--;
                            JOptionPane.showMessageDialog(null,
                                    "You are lucky! because you have ReviveScroll and you survive!");
                        } else {
                            lose = true;
                            hitPointsCount = 0;
                            JOptionPane.showMessageDialog(null,
                                    "You are unlucky! because you do not have ReviveScroll and you die!");
                        }
                    } else {
                        if (x9 > 0) {
                            energyCount = 50;
                            x9--;
                            JOptionPane.showMessageDialog(null,
                                    "You are lucky! because you have ReviveScroll and you survive!");
                        } else {
                            lose = true;
                            energyCount = 0;
                            JOptionPane.showMessageDialog(null,
                                    "You are unlucky! because you do not have ReviveScroll and you die!");
                        }
                    }
                }
            }
        } else if (win) {
            JOptionPane.showMessageDialog(null, "Congratulations! You win!");
        }
    }

    public class Al extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();

            if (keycode == KeyEvent.VK_UP) {
                if (p.getTileY() > 0) {
                    if (!"w".equals(m.getMap[p.getTileX()][p.getTileY() - 1])) {
                        p.move(0, -1);
                        if (inventoryCount < Math.floor(0.75 * inventoryCapacity)) {
                            energyCount--;
                        } else {
                            energyCount -= 2;
                        }
                        if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                    }
                }
            }
            if (keycode == KeyEvent.VK_DOWN) {
                if (p.getTileY() < 23) {
                    if (!"w".equals(m.getMap[p.getTileX()][p.getTileY() + 1])) {
                        p.move(0, 1);
                        if (inventoryCount < Math.floor(0.75 * inventoryCapacity)) {
                            energyCount--;
                        } else {
                            energyCount -= 2;
                        }
                        if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                    }
                }
            }
            if (keycode == KeyEvent.VK_LEFT) {
                if (p.getTileX() > 0) {
                    if (!"w".equals(m.getMap[p.getTileX() - 1][p.getTileY()])) {
                        p.move(-1, 0);
                        if (inventoryCount < Math.floor(0.75 * inventoryCapacity)) {
                            energyCount--;
                        } else {
                            energyCount -= 2;
                        }
                        if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                    }
                }
            }
            if (keycode == KeyEvent.VK_RIGHT) {
                if (p.getTileX() < 24) {
                    if (!"w".equals(m.getMap[p.getTileX() + 1][p.getTileY()])) {
                        p.move(1, 0);
                        if (inventoryCount < Math.floor(0.75 * inventoryCapacity)) {
                            energyCount--;
                        } else {
                            energyCount -= 2;
                        }
                        if ("e".equals(m.getItems1[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems2[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                        if ("e".equals(m.getItems3[p.getTileX()][p.getTileY()])) {
                            hitPointsCount--;
                        }
                    }
                }
            }
        }
    }
}
