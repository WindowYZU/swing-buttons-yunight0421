/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.buttonsamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lendle
 */
public class SampleActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked!");
    }

    }
    //1. override ActionListener
    //2. 裡面寫 System.out.println("clicked!");

