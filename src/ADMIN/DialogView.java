/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

/**
 *
 * @author fendi
 */
/*
 * Copyright (c) 2011, StripBandunk and/or its affiliates. All rights reserved.
 * STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.text.View;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public abstract class DialogView extends JDialog {

    private JFrame JFrame;

    public DialogView(JFrame JFrame) {
        super(JFrame, true);
    }
    
    public JFrame getJFrame() {
        return JFrame;
    }


    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
    }
}