
package igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import logica.Controladora;


public class Principal extends javax.swing.JFrame {
Controladora control= new Controladora();
    
    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        btnSUMA = new javax.swing.JButton();
        btnRESTA = new javax.swing.JButton();
        btnDIV = new javax.swing.JButton();
        btnMULTI = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CALCULADORA");

        jLabel2.setText("Ingrese el primer numero:");

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        jLabel3.setText("Ingrse el segundo numero: ");

        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        btnSUMA.setText("SUMA");
        btnSUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUMAActionPerformed(evt);
            }
        });

        btnRESTA.setText("RESTA");
        btnRESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRESTAActionPerformed(evt);
            }
        });

        btnDIV.setText("DIVISION");
        btnDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIVActionPerformed(evt);
            }
        });

        btnMULTI.setText("Multiplicacion");
        btnMULTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMULTIActionPerformed(evt);
            }
        });

        jLabel4.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSUMA)
                                .addGap(18, 18, 18)
                                .addComponent(btnRESTA)
                                .addGap(18, 18, 18)
                                .addComponent(btnDIV)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addComponent(btnMULTI))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSUMA)
                    .addComponent(btnRESTA)
                    .addComponent(btnDIV)
                    .addComponent(btnMULTI))
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        
    }//GEN-LAST:event_txt1ActionPerformed

    private void btnSUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUMAActionPerformed
        if(txt1.getText().equals("")||txt2.getText().equals("")){
          
            JOptionPane cartel= new JOptionPane("Algunos de los campos esta vacio");
            cartel.setMessageType(JOptionPane.ERROR_MESSAGE);
            
            JDialog dialogo= cartel.createDialog("ERROR");
            dialogo.setVisible(true);
            dialogo.setAlwaysOnTop(true);
        }
        else{
        double num1 =Double.parseDouble(txt1.getText());
        double num2= Double.parseDouble(txt2.getText());
        
        
        double resultado= control.sumar(num1,num2);
        
        txt3.setText(Double.toString(resultado));
        }
    }//GEN-LAST:event_btnSUMAActionPerformed

    private void btnRESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRESTAActionPerformed
          double num1 =Double.parseDouble(txt1.getText());
        double num2= Double.parseDouble(txt2.getText());
        
       
        double resultado= control.restar(num1,num2);
         txt3.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnRESTAActionPerformed

    private void btnDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVActionPerformed
      
          double num1 =Double.parseDouble(txt1.getText());
        double num2= Double.parseDouble(txt2.getText());
          
        double resultado= control.division(num1,num2);
         txt3.setText(Double.toString(resultado));
        
    }//GEN-LAST:event_btnDIVActionPerformed

    private void btnMULTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULTIActionPerformed
       double num1 =Double.parseDouble(txt1.getText());
        double num2= Double.parseDouble(txt2.getText());
          
        double resultado= control.multiplicar(num1,num2);
         txt3.setText(Double.toString(resultado));
    }//GEN-LAST:event_btnMULTIActionPerformed

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        
        char car= evt.getKeyChar();
        if((car < '0'|| car > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_txt1KeyTyped

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
       char car= evt.getKeyChar();
        if((car < '0'|| car > '9')){
            evt.consume();
        }
    }//GEN-LAST:event_txt2KeyTyped

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDIV;
    private javax.swing.JButton btnMULTI;
    private javax.swing.JButton btnRESTA;
    private javax.swing.JButton btnSUMA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
