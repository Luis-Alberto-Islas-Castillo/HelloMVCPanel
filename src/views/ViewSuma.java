/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Invitado
 */
public class ViewSuma extends javax.swing.JPanel {

    /**
     * Creates new form ViewSuma1
     */
    public ViewSuma() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_numero1 = new javax.swing.JLabel();
        jLabel_numero2 = new javax.swing.JLabel();
        jLabel_resultado = new javax.swing.JLabel();
        jTextField_numero1 = new javax.swing.JTextField();
        jTextField_numero2 = new javax.swing.JTextField();
        jTextField_resultado = new javax.swing.JTextField();
        jButton_suma = new javax.swing.JButton();
        jButton_resta = new javax.swing.JButton();
        jButton_multiplicacion = new javax.swing.JButton();
        jButton_divicion = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora");

        jLabel_numero1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_numero1.setText("Numero 1");

        jLabel_numero2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_numero2.setText("Numero 2");

        jLabel_resultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_resultado.setText("Resultado");

        jTextField_resultado.setForeground(new java.awt.Color(255, 0, 0));

        jButton_suma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_suma.setForeground(new java.awt.Color(0, 0, 102));
        jButton_suma.setText("+");

        jButton_resta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_resta.setForeground(new java.awt.Color(0, 0, 102));
        jButton_resta.setText("-");

        jButton_multiplicacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_multiplicacion.setForeground(new java.awt.Color(0, 0, 102));
        jButton_multiplicacion.setText("*");

        jButton_divicion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_divicion.setForeground(new java.awt.Color(0, 0, 102));
        jButton_divicion.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jTextField_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_resultado)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_resultado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_numero2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_suma)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_resta)
                        .addGap(36, 36, 36)
                        .addComponent(jButton_multiplicacion)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_divicion)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_numero2)
                    .addComponent(jTextField_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_resultado)
                    .addComponent(jTextField_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_suma)
                    .addComponent(jButton_resta)
                    .addComponent(jButton_multiplicacion)
                    .addComponent(jButton_divicion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton_divicion;
    public javax.swing.JButton jButton_multiplicacion;
    public javax.swing.JButton jButton_resta;
    public javax.swing.JButton jButton_suma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_numero1;
    private javax.swing.JLabel jLabel_numero2;
    private javax.swing.JLabel jLabel_resultado;
    public javax.swing.JTextField jTextField_numero1;
    public javax.swing.JTextField jTextField_numero2;
    public javax.swing.JTextField jTextField_resultado;
    // End of variables declaration//GEN-END:variables
}
