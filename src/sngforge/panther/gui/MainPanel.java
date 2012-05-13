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

import javax.swing.JScrollPane;
import sngforge.panther.Globals;

/**
 *
 * @author Guria
 */
public class MainPanel extends javax.swing.JPanel {

    /** Creates new form MainPanel */
    public MainPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moreMenu = new javax.swing.JPopupMenu();
        tagEdit = new javax.swing.JMenuItem();
        split = new javax.swing.JMenuItem();
        join = new javax.swing.JMenuItem();
        networkConvert = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        preferences = new javax.swing.JMenuItem();
        infoLabel = new javax.swing.JLabel();
        convertAudio = new javax.swing.JButton();
        convertVideo = new javax.swing.JButton();
        batchConversion = new javax.swing.JButton();
        help = new javax.swing.JButton();
        close = new javax.swing.JButton();
        about = new javax.swing.JButton();
        reduceSize = new javax.swing.JButton();
        moreBtn = new javax.swing.JButton();

        tagEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/document-properties.png"))); // NOI18N
        tagEdit.setText("Tag Editor");
        tagEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tagEditActionPerformed(evt);
            }
        });
        moreMenu.add(tagEdit);

        split.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/edit-cut.png"))); // NOI18N
        split.setText("Split Audio and Video files");
        split.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                splitActionPerformed(evt);
            }
        });
        moreMenu.add(split);

        join.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/edit-copy.png"))); // NOI18N
        join.setText("Join Audio and Video Files");
        join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinActionPerformed(evt);
            }
        });
        moreMenu.add(join);

        networkConvert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/preferences-system-network-proxy.png"))); // NOI18N
        networkConvert.setText("Convert from Network Stream");
        moreMenu.add(networkConvert);
        moreMenu.add(jSeparator1);

        preferences.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/applications-system.png"))); // NOI18N
        preferences.setText("Preferences");
        preferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preferencesActionPerformed(evt);
            }
        });
        moreMenu.add(preferences);

        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/go-jump.png"))); // NOI18N
        infoLabel.setText("<html>Panther is a media encoder that you can use to encode media files from one format to the other and reduce the size of music files.<br> It is fast simple and easy to use.<br><br> Please select the task that you want to perform from the following.");

        convertAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/audio-x-generic.png"))); // NOI18N
        convertAudio.setText("<html><b>Audio Files</b><br><br>Click here to convert an audio file to another format.");
        convertAudio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        convertAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertAudioActionPerformed(evt);
            }
        });

        convertVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/video-x-generic.png"))); // NOI18N
        convertVideo.setText("<html><b>Video Files</b><br><br>Click here to convert a video file to another format.");
        convertVideo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        convertVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertVideoActionPerformed(evt);
            }
        });

        batchConversion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/utilities-terminal.png"))); // NOI18N
        batchConversion.setText("<html><b>Batch Conversion</b><br><br>Click here to write scripts to customise the encoding process.");
        batchConversion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        batchConversion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchConversionActionPerformed(evt);
            }
        });

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/help-browser.png"))); // NOI18N
        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/process-stop.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/dialog-information.png"))); // NOI18N
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        reduceSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/system-file-manager.png"))); // NOI18N
        reduceSize.setText("<html><b>Reduce the size of Music Files</b><br><br>Click here to reduce the file size of music files without affecting its quality.");
        reduceSize.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reduceSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceSizeActionPerformed(evt);
            }
        });

        moreBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/preferences-desktop.png"))); // NOI18N
        moreBtn.setText("More...");
        moreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convertVideo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reduceSize, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(convertAudio)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(help)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(about)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moreBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close))
                    .addComponent(batchConversion))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(convertAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reduceSize, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convertVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(batchConversion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(moreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    /*
     * launches the help
     */
    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        //sngforge.jelp.Main.launch();
    }//GEN-LAST:event_helpActionPerformed

    /*
     * starts the about dialog
     */
    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        new AboutDialog(Globals.mainFrame,true).setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void reduceSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reduceSizeActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new ReduceSizePanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_reduceSizeActionPerformed

    private void convertAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertAudioActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new SimpleAudioPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_convertAudioActionPerformed

    private void convertVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertVideoActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new VideoPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_convertVideoActionPerformed

    private void batchConversionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchConversionActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        ScriptEditor editor=new ScriptEditor();
        editor.initSyntaxHighlighter();
        Globals.scrollPane=new JScrollPane(editor);
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_batchConversionActionPerformed

    private void preferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preferencesActionPerformed
        PreferencesDialog prefDlg=new PreferencesDialog(Globals.mainFrame,true);
        prefDlg.setVisible(true);
    }//GEN-LAST:event_preferencesActionPerformed

    private void moreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moreBtnMouseClicked
        moreMenu.show(moreBtn, evt.getX(), evt.getY());
    }//GEN-LAST:event_moreBtnMouseClicked

    private void tagEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tagEditActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        ID3Editor id3=new ID3Editor();
        Globals.scrollPane=new JScrollPane(id3);
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
        id3.initialize();
    }//GEN-LAST:event_tagEditActionPerformed

    private void splitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new SplitPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_splitActionPerformed

    private void joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinActionPerformed
        Globals.mainFrame.setVisible(false);
        Globals.mainFrame.remove(Globals.scrollPane);
        Globals.scrollPane=new JScrollPane(new JoinPanel());
        Globals.mainFrame.add(Globals.scrollPane);
        Globals.mainFrame.setVisible(true);
    }//GEN-LAST:event_joinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton batchConversion;
    private javax.swing.JButton close;
    private javax.swing.JButton convertAudio;
    private javax.swing.JButton convertVideo;
    private javax.swing.JButton help;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem join;
    private javax.swing.JButton moreBtn;
    private javax.swing.JPopupMenu moreMenu;
    private javax.swing.JMenuItem networkConvert;
    private javax.swing.JMenuItem preferences;
    private javax.swing.JButton reduceSize;
    private javax.swing.JMenuItem split;
    private javax.swing.JMenuItem tagEdit;
    // End of variables declaration//GEN-END:variables

}
