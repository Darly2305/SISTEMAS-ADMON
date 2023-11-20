/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sistemas.admon;


/**
 *
 * @author jose_
 */
public final class RellenarMatriz extends javax.swing.JPanel {

    /**
     * Creates new form RellenarMatriz
     */
    
    int NumFilas,NumColumnas,DatoMatriz;
    String NombreColumnas;
    String NFilas;
    String TextoNumFilas,TextoNumColumnas,TextoDatoMatriz;
    int MAX=10;
    int matrizOriginal[][]=new int[MAX][MAX];
    int clic=1;
    
    
    public void desactivarJTextField(){
        jTFNumFilas.setEnabled(true);
        jTFNumColumnas.setEnabled(true);
        jTFDatoMatriz.setEnabled(false);
        jTFNombreFilas.setEnabled(false);
        jTFNombreColumnas.setEnabled(false);
        jTFNumDatosFaltantes.setEnabled(false);

    }
    
    
    
    public RellenarMatriz() {
        initComponents();
         
        //rsscalelabel.RSScaleLabel.setScaleLabel(jLPuntos,"src/imagen/PUNTOSMEDIPAC2.png");
        desactivarJTextField();
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
        jLPuntos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFNumFilas = new javax.swing.JTextField();
        jTFNumColumnas = new javax.swing.JTextField();
        jTFNombreFilas = new javax.swing.JTextField();
        jTFNombreColumnas = new javax.swing.JTextField();
        jTFNumDatosFaltantes = new javax.swing.JTextField();
        jTFDatoMatriz = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBCalcular = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/MEDIPACPEQUE.png"))); // NOI18N

        jLPuntos.setText("Logo");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Rellene cada recuadro");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Número de filas:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Número de columnas:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Nombre de la fila:");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Nombre de la columna:");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setText("Datos por ingresar");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Ingrese cada dato:");

        jTFNumFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumFilasActionPerformed(evt);
            }
        });

        jBAceptar.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jBAceptar.setText("Aceptar");
        jBAceptar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.lightGray));

        jBCalcular.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNumFilas)
                                    .addComponent(jTFNumColumnas)
                                    .addComponent(jTFNombreFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNombreColumnas)
                                    .addComponent(jTFNumDatosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFDatoMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jBCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(jLPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFNumFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(jTFNumColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNombreFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFNombreColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFNumDatosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFDatoMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void clic1(){
        jTFNumFilas.setEnabled(false);
        jTFNumColumnas.setEnabled(false);
        jTFDatoMatriz.setEnabled(false);
        jTFNombreFilas.setEnabled(true);
        jTFNombreColumnas.setEnabled(true);
        
        clic=2;
    }
    
    public void clic2(){
        jTFNombreFilas.setEnabled(true);
        jTFNombreColumnas.setEnabled(true);
        jTFNumFilas.setEnabled(false);
        jTFNumColumnas.setEnabled(false);
        jTFDatoMatriz.setEnabled(false);
        jTFNumDatosFaltantes.setEnabled(false);
        
        TextoNumFilas = jTFNumFilas.getText();
        NumFilas = Integer.parseInt(TextoNumFilas);

        TextoNumColumnas = jTFNumColumnas.getText();
        NumColumnas = Integer.parseInt(TextoNumColumnas);
        
        NFilas=jTFNombreFilas.getText();
        NombreColumnas = jTFNombreColumnas.getText();
        
        clic = 3;
    }
    
    public void clic3(){
        jTFNumFilas.setEnabled(false);
        jTFNumColumnas.setEnabled(false);
        jTFNombreFilas.setEnabled(false);
        jTFNombreColumnas.setEnabled(false);
        jTFDatoMatriz.setEnabled(true);
        jTFNumDatosFaltantes.setEnabled(false);

        
        TextoDatoMatriz = jTFDatoMatriz.getText();
        DatoMatriz = Integer.parseInt(TextoDatoMatriz);
        

        clic = 4;
    }
    
    public void pasarmatriz(){
       
        MatrizOriginal matriz_original=new MatrizOriginal(NombreColumnas,NumFilas,NumColumnas,matrizOriginal);
    }
    
    
    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        // TODO add your handling code here:
        /*
        String TextoNumFilas=jTFNumFilas.getText();
        int NumFilas=Integer.parseInt(TextoNumFilas);
        
        String TextoNumColumnas=jTFNumColumnas.getText();
        int NumColumnas=Integer.parseInt(TextoNumColumnas);*/
        
        /*String NombreFilas=jTFNombreFilas.getText();
        String NombreColumnas=jTFNombreColumnas.getText();*/
        
       /* String TextoDatoMatriz=jTFDatoMatriz.getText();
        int DatoMatriz=Integer.parseInt(TextoDatoMatriz);*/
        
        TextoNumFilas = jTFNumFilas.getText();
        NumFilas = Integer.parseInt(TextoNumFilas);

        TextoNumColumnas = jTFNumColumnas.getText();
        NumColumnas = Integer.parseInt(TextoNumColumnas);
       
        switch(clic){
            case 1:
                clic1();
                break;
            case 2:
                clic2();
                break;
            case 3:
                clic3();
                break;
            default:
                System.out.println("Noc");
        }
        
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jTFNumFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumFilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumFilasActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLPuntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTFDatoMatriz;
    private javax.swing.JTextField jTFNombreColumnas;
    private javax.swing.JTextField jTFNombreFilas;
    private javax.swing.JTextField jTFNumColumnas;
    private javax.swing.JTextField jTFNumDatosFaltantes;
    private javax.swing.JTextField jTFNumFilas;
    // End of variables declaration//GEN-END:variables
}
