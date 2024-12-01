
package com.mycompany.calculator;
public class CalculatorFrame extends javax.swing.JFrame {
    // For the '=' operator in the calculator
    private double num1 = 0;
    private double num2 = 0;
    private String operator = "";
    //

    public CalculatorFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jButton21 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        displayField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Button7 = new javax.swing.JButton();
        plusbutton = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        minusbutton = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonZERo = new javax.swing.JButton();
        DivideButton = new javax.swing.JButton();
        MultiplyButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        EqualsButton = new javax.swing.JButton();

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 51, 204));
        jButton21.setText("jButton1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        displayField.setBackground(new java.awt.Color(255, 255, 255));
        displayField.setForeground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CALCULATOR");

        Button7.setBackground(new java.awt.Color(255, 255, 255));
        Button7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button7.setForeground(new java.awt.Color(0, 51, 204));
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        plusbutton.setBackground(new java.awt.Color(255, 255, 255));
        plusbutton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        plusbutton.setForeground(new java.awt.Color(0, 51, 204));
        plusbutton.setText("+");
        plusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusbuttonActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(255, 255, 255));
        Button8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button8.setForeground(new java.awt.Color(0, 51, 204));
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(255, 255, 255));
        Button9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button9.setForeground(new java.awt.Color(0, 51, 204));
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        minusbutton.setBackground(new java.awt.Color(255, 255, 255));
        minusbutton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        minusbutton.setForeground(new java.awt.Color(0, 51, 204));
        minusbutton.setText("-");
        minusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusbuttonActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(255, 255, 255));
        Button4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button4.setForeground(new java.awt.Color(0, 51, 204));
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(255, 255, 255));
        Button5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button5.setForeground(new java.awt.Color(0, 51, 204));
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(255, 255, 255));
        Button6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button6.setForeground(new java.awt.Color(0, 51, 204));
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button1.setForeground(new java.awt.Color(0, 51, 204));
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        Button2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button2.setForeground(new java.awt.Color(0, 51, 204));
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        Button3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Button3.setForeground(new java.awt.Color(0, 51, 204));
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        ButtonZERo.setBackground(new java.awt.Color(255, 255, 255));
        ButtonZERo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ButtonZERo.setForeground(new java.awt.Color(0, 51, 204));
        ButtonZERo.setText("0");
        ButtonZERo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZERoActionPerformed(evt);
            }
        });

        DivideButton.setBackground(new java.awt.Color(255, 255, 255));
        DivideButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DivideButton.setForeground(new java.awt.Color(0, 51, 204));
        DivideButton.setText("/");
        DivideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideButtonActionPerformed(evt);
            }
        });

        MultiplyButton.setBackground(new java.awt.Color(255, 255, 255));
        MultiplyButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MultiplyButton.setForeground(new java.awt.Color(0, 51, 204));
        MultiplyButton.setText("*");
        MultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(255, 255, 255));
        ClearButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(0, 51, 204));
        ClearButton.setText("CE");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        EqualsButton.setBackground(new java.awt.Color(255, 255, 255));
        EqualsButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        EqualsButton.setForeground(new java.awt.Color(0, 51, 204));
        EqualsButton.setText("=");
        EqualsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButtonZERo, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(MultiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(minusbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plusbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(DivideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(EqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(displayField, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plusbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(minusbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DivideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonZERo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pack();
    }

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {
        
         displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {
         displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {
     
         displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) 
    {
         displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) 
    {
         displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void ButtonZERoActionPerformed(java.awt.event.ActionEvent evt) 
    {
        displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void DivideButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
      
        num1 = Double.parseDouble(displayField.getText());  
        operator = evt.getActionCommand(); 
        displayField.setText("");  
    }

    private void MultiplyButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        num1 = Double.parseDouble(displayField.getText()); 
        operator = evt.getActionCommand();  
        displayField.setText("");  
    }

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        
        displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        
        displayField.setText(""); 
    }

    private void EqualsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsButtonActionPerformed

         num2 = Double.parseDouble(displayField.getText()); 
        double result = 0;

        switch (operator) 
        {
        case "+":
            result = num1 + num2;
            break;
        case "-":
            result = num1 - num2;
            break;
        case "*":
            result = num1 * num2;
            break;
        case "/":
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                displayField.setText("Error");
                return;
            }
            break;
    }

    displayField.setText(String.valueOf(result));
    }

    private void plusbuttonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        num1 = Double.parseDouble(displayField.getText());  
        operator = evt.getActionCommand(); 
        displayField.setText("");  
    }
    private void minusbuttonActionPerformed(java.awt.event.ActionEvent evt) 
    {
        num1 = Double.parseDouble(displayField.getText()); 
        operator = evt.getActionCommand();  
        displayField.setText(""); 
    }
    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) 
    {
       
        displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) 
    {
        displayField.setText(displayField.getText() + evt.getActionCommand());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonZERo;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DivideButton;
    private javax.swing.JButton EqualsButton;
    private javax.swing.JButton MultiplyButton;
    private javax.swing.JTextField displayField;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minusbutton;
    private javax.swing.JButton plusbutton;
    // End of variables declaration//GEN-END:variables
}
