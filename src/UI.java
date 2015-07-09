
import java.awt.event.ActionEvent;
import static java.lang.Math.log;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidetumminello&&giovanniguerrieri
 */
public class UI extends javax.swing.JFrame {
    
    float risultati[][] = new float[15][2];
    double risultati1[] = new double[5];
    
    public UI() {
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

        buttonGroupFunction = new javax.swing.ButtonGroup();
        linear_fun = new javax.swing.JRadioButton();
        exp_fun = new javax.swing.JRadioButton();
        log_fun = new javax.swing.JRadioButton();
        expLog_fun = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldA = new javax.swing.JTextField();
        jTextFieldB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HoM_result = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SM_result = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        confidence_interval = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        TextField_NSM = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroupFunction.add(linear_fun);
        linear_fun.setLabel("y = x");

        buttonGroupFunction.add(exp_fun);
        exp_fun.setText("y = x^2");

        buttonGroupFunction.add(log_fun);
        log_fun.setText("y = log(x)");

        buttonGroupFunction.add(expLog_fun);
        expLog_fun.setText("y = log^2(x)");

        jLabel1.setText("A");

        jLabel2.setText("B");

        jLabel3.setText("Hit or Miss: ");

        jLabel5.setText("Sample Mean:");

        jButton1.setText("Calcola");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Intervallo di Confidenza Hit Or miss");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "0.01", "0.05", "0.1" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        confidence_interval.setViewportView(jList1);

        jLabel6.setText("n (Sample Mean)");

        TextField_NSM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NSMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(expLog_fun)
                    .addComponent(log_fun)
                    .addComponent(linear_fun)
                    .addComponent(exp_fun)
                    .addComponent(jLabel4)
                    .addComponent(confidence_interval, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField_NSM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HoM_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SM_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(linear_fun)
                .addGap(15, 15, 15)
                .addComponent(exp_fun)
                .addGap(18, 18, 18)
                .addComponent(log_fun)
                .addGap(26, 26, 26)
                .addComponent(expLog_fun)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(confidence_interval, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextField_NSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HoM_result, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SM_result, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int a = Integer.parseInt(jTextFieldA.getText());
        int b = Integer.parseInt(jTextFieldB.getText());
        int perc = jList1.getSelectedIndex();
        System.out.println(perc);
        int n = Integer.parseInt(TextField_NSM.getText());
        frameGraphHitOrMiss();
        frameGraphSampleMean();
        HitOrMiss hom = new HitOrMiss(a, b, perc);
        SampleMean sm = new SampleMean(a,b);
        AnthiteticVariable av = new AnthiteticVariable();
        if(linear_fun.isSelected()){
            //HoM_result.setText(hom.hitOrMissLinear()+"");
            risultati = hom.hitOrMissLinear();
            risultati1 = sm.genera(3);
            HitOrMissDialog homDialog = new HitOrMissDialog();
            FrameGraphHitOrMiss HOMGraph = new FrameGraphHitOrMiss();
            homDialog.setRisultati(risultati);
            sm.setRisultati1(risultati1);
            av.setRisultati(risultati);
            av.setRisultati1(risultati1);
            av.stampa();
            av.getCov();
            av.getVarSM();
            homDialog.setVisible(true);
            HOMGraph.setVisible(true);
            SM_result.setText(sm.linear()+"");
        }
        if(exp_fun.isSelected()){
            //HoM_result.setText(hom.hitOrMissExp()+"");
            risultati = hom.hitOrMissExp();
            risultati1 = sm.genera(2);
            HitOrMissDialog homDialog = new HitOrMissDialog();
            FrameGraphHitOrMiss HOMGraph = new FrameGraphHitOrMiss();
            frameGraphHitOrMiss();
            homDialog.setVisible(true);
            homDialog.setRisultati(risultati);
            sm.setRisultati1(risultati1);
            av.setRisultati(risultati);
            av.setRisultati1(risultati1);
            av.stampa();
            av.getCov();
            av.getVarSM();
            HOMGraph.setVisible(true);
            SM_result.setText(sm.exponential()+"");
        }
        if(log_fun.isSelected()){
            //HoM_result.setText(hom.hitOrMissLog()+"");
            risultati = hom.hitOrMissLog();
            risultati1 = sm.genera(1);
            HitOrMissDialog homDialog = new HitOrMissDialog();
            FrameGraphHitOrMiss HOMGraph = new FrameGraphHitOrMiss();
            frameGraphHitOrMiss();
            homDialog.setVisible(true);
            homDialog.setRisultati(risultati);
            sm.setRisultati1(risultati1);
            av.setRisultati(risultati);
            av.setRisultati1(risultati1);
            av.stampa();
            av.getCov();
            av.getVarSM();
            HOMGraph.setVisible(true);
            SM_result.setText(sm.logarithmic()+"");
        }
        if(expLog_fun.isSelected()){
            //HoM_result.setText(hom.hitOrMissExpLog()+"");
            risultati = hom.hitOrMissExpLog();
            risultati1 = sm.genera(0);
            HitOrMissDialog homDialog = new HitOrMissDialog();
            FrameGraphHitOrMiss HOMGraph = new FrameGraphHitOrMiss();
            frameGraphHitOrMiss();
            homDialog.setVisible(true);
            homDialog.setRisultati(risultati);
            sm.setRisultati1(risultati1);
            av.setRisultati(risultati);
            av.setRisultati1(risultati1);
            av.stampa();
            av.getCov();
            av.getVarSM();
            HOMGraph.setVisible(true);
            SM_result.setText(sm.expLog()+"");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TextField_NSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NSMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NSMActionPerformed

    public void frameGraphHitOrMiss(){
        FrameGraphHitOrMiss HOMGraph = new FrameGraphHitOrMiss();
    }
    public void frameGraphSampleMean(){
        //FrameGraphHitOrMiss HOMGraph = new FrameGraphHitOrMiss();
    }
    
    public float[][] getRisultati(){
        for(int i=0;i<5;i++)
            System.out.println("in method: "+risultati[i][0]);
        return risultati;
    }
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HoM_result;
    private javax.swing.JLabel SM_result;
    private javax.swing.JTextField TextField_NSM;
    private javax.swing.ButtonGroup buttonGroupFunction;
    private javax.swing.JScrollPane confidence_interval;
    private javax.swing.JRadioButton expLog_fun;
    private javax.swing.JRadioButton exp_fun;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JTextField jTextFieldA;
    private javax.swing.JTextField jTextFieldB;
    private javax.swing.JRadioButton linear_fun;
    private javax.swing.JRadioButton log_fun;
    // End of variables declaration//GEN-END:variables
}
