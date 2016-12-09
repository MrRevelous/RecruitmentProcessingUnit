/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author BaZinGa
 */
public class CompanyPage extends javax.swing.JFrame {
    private String accountType;

    /**
     * Creates new form CompanyPage
     * @param companyName
     * @param accountStatus
     * @param accountType
     */
    public CompanyPage(String companyName,String accountStatus,String accountType) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //CompanyPage.loginPageFrame=loginPageFrame;
        this.companyName=companyName;
        this.accountType=accountType;
        this.panelArrayList=new ArrayList<>();
        this.viewButtonsActionPerformed(null);
        if(accountStatus!=null)
            JOptionPane.showMessageDialog(this, "Your Subscription has Expired!!!");
    }
    
    public CompanyPage(String companyName,String accountType) {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.companyName=companyName;
        this.accountType=accountType;
        this.panelArrayList=new ArrayList<>();
        this.viewButtonsActionPerformed(null);
    }

    
    public void hideOtherPanels(){
        Iterator<JPanel> itr=panelArrayList.iterator();
        while(itr.hasNext()){
            JPanel jPanel=itr.next();
            jPanel.setVisible(false);
            this.remove(jPanel);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        basePane = new javax.swing.JDesktopPane();
        panelForOthePanels = new javax.swing.JPanel();
        viewButtons = new javax.swing.JButton();
        accountButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basePane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelForOthePanelsLayout = new javax.swing.GroupLayout(panelForOthePanels);
        panelForOthePanels.setLayout(panelForOthePanelsLayout);
        panelForOthePanelsLayout.setHorizontalGroup(
            panelForOthePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );
        panelForOthePanelsLayout.setVerticalGroup(
            panelForOthePanelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout basePaneLayout = new javax.swing.GroupLayout(basePane);
        basePane.setLayout(basePaneLayout);
        basePaneLayout.setHorizontalGroup(
            basePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelForOthePanels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        basePaneLayout.setVerticalGroup(
            basePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelForOthePanels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        basePane.setLayer(panelForOthePanels, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewButtons.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewButtons.setText("VIEW");
        viewButtons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonsActionPerformed(evt);
            }
        });

        accountButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accountButton.setText("ACCOUNT");
        accountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountButtonActionPerformed(evt);
            }
        });

        logOutButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addComponent(basePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(viewButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(accountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(basePane)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonsActionPerformed
        // TODO add your handling code here:
        this.hideOtherPanels();
        this.panelForOthePanels.setVisible(true);
        CandidateSelector candidateSelector=new CandidateSelector(this.companyName,this.accountType);
        candidateSelector.setBounds(0, 0, this.panelForOthePanels.getWidth(), this.panelForOthePanels.getHeight());
        candidateSelector.setVisible(true);
        this.panelArrayList.add(candidateSelector);
        this.panelForOthePanels.add(candidateSelector);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_viewButtonsActionPerformed

    private void accountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountButtonActionPerformed
        // TODO add your handling code here:
        this.hideOtherPanels();
        AccountsPanel accountsPanel=new AccountsPanel(this,this.companyName,this.accountType);
        accountsPanel.setBounds(0, 0, this.panelForOthePanels.getWidth(), this.panelForOthePanels.getHeight());
        accountsPanel.setVisible(true);
        this.panelArrayList.add(accountsPanel);
        this.panelForOthePanels.add(accountsPanel);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_accountButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        LoginScreen loginScreen=new LoginScreen();
        loginScreen.setVisible(true);
        this.setVisible(false);
        this.dispose();  
    }//GEN-LAST:event_logOutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompanyPage().setVisible(true);
            }
        });
    }*/
    
    private static LoginScreen loginPageFrame;
    private String companyName;
    private ArrayList <JPanel> panelArrayList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountButton;
    private javax.swing.JDesktopPane basePane;
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton logOutButton;
    private javax.swing.JPanel panelForOthePanels;
    private javax.swing.JButton viewButtons;
    // End of variables declaration//GEN-END:variables
}