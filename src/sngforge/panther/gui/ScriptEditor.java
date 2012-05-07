/*
 *  Panther is a program to encode your media files from one format to the other.
 *  Copyright (C) 2012  Sankha Narayan Guria
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package sngforge.panther.gui;

import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import jsyntaxpane.DefaultSyntaxKit;
import sngforge.panther.Globals;

/**
 * the script editor panel
 * @author Sankha
 */
public class ScriptEditor extends javax.swing.JPanel {

    File curr;
    
    /**
     * Creates new form ScriptEditor
     */
    public ScriptEditor() {
        initComponents();
    }
    
    public void initSyntaxHighlighter(){
        DefaultSyntaxKit.initKit();
        script.setContentType("text/javascript");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        openBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        saveAsBtn = new javax.swing.JButton();
        runBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        script = new javax.swing.JEditorPane();

        jToolBar1.setRollover(true);

        openBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/document-open.png"))); // NOI18N
        openBtn.setText("Open");
        openBtn.setFocusable(false);
        openBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(openBtn);

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/document-save.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setFocusable(false);
        saveBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(saveBtn);

        saveAsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/document-save-as.png"))); // NOI18N
        saveAsBtn.setText("Save As");
        saveAsBtn.setFocusable(false);
        saveAsBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveAsBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveAsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(saveAsBtn);

        runBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/edit-redo.png"))); // NOI18N
        runBtn.setText("Run");
        runBtn.setFocusable(false);
        runBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(runBtn);

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/process-stop.png"))); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.setFocusable(false);
        cancelBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(cancelBtn);

        jScrollPane1.setViewportView(script);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void openBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBtnActionPerformed
        JFileChooser jfc=new JFileChooser();
        FileFilter filter;
        filter = createFileFilter("Javascript Files",true, "js");
        jfc.setFileFilter(filter);
        jfc.showOpenDialog(this);
        File f=jfc.getSelectedFile();
        if(f!=null){
            curr=f;
            try{
                BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                script.read(br, null);
                Globals.mainFrame.setTitle("Panther - "+curr.getName());
                br.close();
            } catch(Exception e){
                System.err.println(e);
                JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_openBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        if(curr!=null){
            try{
                BufferedWriter bw=new BufferedWriter(new FileWriter(curr));
                bw.write(script.getText());
                bw.close();
            } catch(Exception e){
                System.err.println(e);
                JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
            }
        } else
            saveAsBtnActionPerformed(evt);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void saveAsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsBtnActionPerformed
        JFileChooser jfc=new JFileChooser();
        FileFilter filter;
        filter = createFileFilter("Javascript Files",true, "js");
        jfc.setFileFilter(filter);
        jfc.showSaveDialog(this);
        File f=new File(jfc.getSelectedFile().getAbsolutePath()+".js");
        if(f!=null){
            curr=f;
            try{
                BufferedWriter bw=new BufferedWriter(new FileWriter(curr));
                bw.write(script.getText());
                Globals.mainFrame.setTitle("Panther - "+curr.getName());
                bw.close();
            } catch(Exception e){
                System.err.println(e);
                JOptionPane.showMessageDialog(null, e, "Panther - Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveAsBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new MainPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setTitle("Panther");
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void runBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBtnActionPerformed
        if(curr!=null){
            Globals.mainFrame.setVisible(false);
            Globals.mainFrame.remove(Globals.scrollPane);
            final OutputPanel output=new OutputPanel();
            Globals.scrollPane=new JScrollPane(output);
            Globals.mainFrame.add(Globals.scrollPane);
            Globals.mainFrame.setVisible(true);
            //output.runScript(curr);
            SwingWorker sw=new SwingWorker(){
                protected Object doInBackground(){
                    output.runScript(curr);
                    return null;
                }
            };
            sw.execute();
        }else
            JOptionPane.showMessageDialog(null, "Please save the script before you can run it!", "Panther - Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_runBtnActionPerformed

    private FileFilter createFileFilter(String description,boolean showExtensionInDescription, String...extensions)
    {
        if (showExtensionInDescription)
        description = createFileNameFilterDescriptionFromExtensions(description, extensions);
        return new FileNameExtensionFilter(description, extensions);
    }
    private String createFileNameFilterDescriptionFromExtensions(String description, String[] extensions)
    {
        String fullDescription = (description == null) ? "(" : description + " (";
        fullDescription += "." + extensions[0];
        for (int i = 1; i < extensions.length; i++) {
            fullDescription += ", .";
            fullDescription += extensions[i];
        }
        fullDescription += ")";
        return fullDescription;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton openBtn;
    private javax.swing.JButton runBtn;
    private javax.swing.JButton saveAsBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JEditorPane script;
    // End of variables declaration//GEN-END:variables
}
