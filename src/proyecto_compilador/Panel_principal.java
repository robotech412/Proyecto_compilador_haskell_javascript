/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_compilador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dennis
 */
public class Panel_principal extends javax.swing.JFrame {

    String nombreM = "suma";
    String var1 = "var1";
    String var2 = "var2";
    int valorA = 2; //ejemplo arreglo[2]
    int valorB = 3;
    String print = "";
    String parA = "(";
    String parB = ")";
    String corcheteA = "{";
    String corcheteB = "}";
    String msj = "El resultado es: +";
    String arreglo[];

    /**
     * Creates new form Panel_principal
     */
    public Panel_principal() {
        initComponents();
        //setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea_mostrar_codigo_hs = new javax.swing.JTextArea();
        titulo_ubicacion_haskell = new javax.swing.JLabel();
        btn_abrir_haskell = new javax.swing.JButton();
        btn_conversion = new javax.swing.JButton();
        titulo_textarea_haskell = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea_mostrar_codigo_js = new javax.swing.JTextArea();
        titulo_textarea_js = new javax.swing.JLabel();
        titulo_ubicacion_haskell1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 750));
        setMinimumSize(new java.awt.Dimension(700, 750));
        setPreferredSize(new java.awt.Dimension(700, 750));

        textArea_mostrar_codigo_hs.setEditable(false);
        textArea_mostrar_codigo_hs.setColumns(20);
        textArea_mostrar_codigo_hs.setRows(5);
        jScrollPane1.setViewportView(textArea_mostrar_codigo_hs);

        titulo_ubicacion_haskell.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_ubicacion_haskell.setText("CONVERTIDOR DE OPERACIONES DE LENGUAJE HASKELL A JAVASCRIPT");

        btn_abrir_haskell.setText("Abrir");
        btn_abrir_haskell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrir_haskellActionPerformed(evt);
            }
        });

        btn_conversion.setText("Ejecutar Compilacion");
        btn_conversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conversionActionPerformed(evt);
            }
        });

        titulo_textarea_haskell.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_textarea_haskell.setText("Visualizacion archivo haskell");

        textArea_mostrar_codigo_js.setEditable(false);
        textArea_mostrar_codigo_js.setColumns(20);
        textArea_mostrar_codigo_js.setRows(5);
        jScrollPane2.setViewportView(textArea_mostrar_codigo_js);

        titulo_textarea_js.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_textarea_js.setText("Visualizacion archivo javascript");

        titulo_ubicacion_haskell1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titulo_ubicacion_haskell1.setText("Ubicación archivo haskell");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo_ubicacion_haskell)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo_textarea_haskell, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(titulo_textarea_js)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_conversion))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(titulo_ubicacion_haskell1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_abrir_haskell, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(121, 121, 121))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_ubicacion_haskell, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_abrir_haskell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo_ubicacion_haskell1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titulo_textarea_haskell)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_conversion)
                    .addComponent(titulo_textarea_js))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_abrir_haskellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrir_haskellActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";
            while (((linea = br.readLine()) != null)) {
                texto += linea + "\n";
                arreglo = texto.split(" ");
            }
            textArea_mostrar_codigo_hs.setText(texto);
            JOptionPane.showMessageDialog(null, "Archivo leido correctamente");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Panel_principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_abrir_haskellActionPerformed

    public void escribirFichero() {
        String sFichero = "operacion.js";
        File fichero = new File(sFichero);
        if (fichero.exists()) {
            System.out.println("El fichero " + sFichero + " existe");
        } else {
            System.out.println("El fichero no existe");
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(sFichero));
                bw.write("function " + arreglo[0] + "()" + corcheteA + "\n");
                bw.write("var " + arreglo[4] + "=" + arreglo[6] + ";" + "\n");
                bw.write("var " + arreglo[8] + "=" + arreglo[10] + ";" + "\n");
                bw.write(arreglo[0] + " = " + arreglo[4] + " " + arreglo[17] + " " + arreglo[8] + ";" + "\n");
                bw.write("alert" + parA + "" + msj + " " + arreglo[0] + parB + "\n");
                bw.write(corcheteB);
                bw.flush();
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(Panel_principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void obtenertxt_conversion(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";
            while (((linea = br.readLine()) != null)) {
                texto += linea + "\n";
            }
            textArea_mostrar_codigo_js.setText(texto);
            //JOptionPane.showMessageDialog(null, "Archivo convertido correctamente");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Panel_principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Panel_principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_conversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conversionActionPerformed
        escribirFichero();
        obtenertxt_conversion("operacion.js");
    }//GEN-LAST:event_btn_conversionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_principal().setVisible(true);
            }
        });
    }

    void setLocationRelativeTo(GroupLayout.Alignment alignment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir_haskell;
    private javax.swing.JButton btn_conversion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textArea_mostrar_codigo_hs;
    private javax.swing.JTextArea textArea_mostrar_codigo_js;
    private javax.swing.JLabel titulo_textarea_haskell;
    private javax.swing.JLabel titulo_textarea_js;
    private javax.swing.JLabel titulo_ubicacion_haskell;
    private javax.swing.JLabel titulo_ubicacion_haskell1;
    // End of variables declaration//GEN-END:variables
}
