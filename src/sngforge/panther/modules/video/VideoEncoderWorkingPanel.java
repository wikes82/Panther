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

package sngforge.panther.modules.video;

import it.sauronsoftware.jave.*;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;
import sngforge.panther.Globals;
import sngforge.panther.gui.ReportPanel;
import sngforge.panther.modules.EncoderListener;

public class VideoEncoderWorkingPanel extends sngforge.panther.modules.WorkingPanel{

    VideoEncoderWorkingPanel vewp=(VideoEncoderWorkingPanel)Globals.wp;
    SwingWorker sw;
    /** Creates new form AudioEncoderWorkingPanel */
    public VideoEncoderWorkingPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        currProgress = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        overallProgress = new javax.swing.JProgressBar();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        currFile = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/applications-system.png"))); // NOI18N
        jLabel1.setText("Please wait while Panther encodes the selected files to the desired format. This may take several minutes.");

        jLabel2.setText("Current Progress");

        jLabel3.setText("Overall Progress");

        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sngforge/panther/resources/process-stop.png"))); // NOI18N
        cancel.setText("Cancel");
        cancel.setEnabled(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel4.setText("Encoding file:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
                    .addComponent(overallProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE))
                    .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(currFile)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(currProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overallProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(currFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(cancel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        int choice=JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel?", "Panther", JOptionPane.YES_NO_OPTION);
                if(choice==JOptionPane.YES_OPTION){
                    jLabel2.setText("Cancelling...");
                    currProgress.setIndeterminate(true);
                    cancel.setEnabled(false);
                    sw.cancel(true);
                    Globals.cancelled=true;
                }
    }//GEN-LAST:event_cancelActionPerformed

    /*
     * updates the progress bar on screen
     */
    public void setProgress(int val){
        currProgress.setValue(val);
    }

    /*
     * starts the encoding process with the settings stored
     */
    public void process(){
        vewp=this;
        Globals.cancelled=false;
        Globals.errorList=new java.util.ArrayList();
        Globals.report="The following tasks were completed successfully:\n\n\n";
        Globals.rp=new ReportPanel();
        Globals.tmp=new JScrollPane(Globals.rp);
                sw=new SwingWorker(){
                protected Object doInBackground(){
                    VideoEntry ee=(VideoEntry)Globals.ee;
                        File f=new File(ee.fin);
                        File fout=new File(ee.fout);
                        Encoder e=new Encoder();
                        AudioAttributes aa=new AudioAttributes();
                        aa.setBitRate(ee.aBitrate);
                        aa.setChannels(ee.aChannels);
                        aa.setSamplingRate(ee.aSamplingRate);
                        aa.setVolume(ee.aVolume);
                        aa.setCodec(ee.aCodec);
                        EncodingAttributes ae=new EncodingAttributes();
                        ae.setFormat(ee.format);
                        VideoAttributes va=new VideoAttributes();
                        va.setBitRate(ee.vBitrate);
                        va.setCodec(ee.vCodec);
                        va.setFrameRate(ee.fps);
                        va.setSize(new VideoSize(ee.width,ee.height));
                        ae.setVideoAttributes(va);
                        if(ee.duration!=-1)
                            ae.setDuration(ee.duration);
                        if(ee.offset!=-1)
                            ae.setOffset(ee.offset);
                        ae.setAudioAttributes(aa);
                        EncoderListener ael=new EncoderListener();
                        ael.setParent(vewp);
                        try{
                            currFile.setText(f.getName());
                            e.encode(f, fout, ae, ael);
                            Globals.report=Globals.report+"Input:"+f.getAbsolutePath()+"\nOutput:"+fout.getAbsolutePath()+"\nEncoded Successfully!\n\n";
                        }catch(Exception ex){
                            System.err.println(ex);
                            Globals.errorList.add(ex);
                        }
                    Globals.report=Globals.report+"\nErrors:\n\n\n";
                    if(!Globals.errorList.isEmpty()){
                        for(int i=0;i<Globals.errorList.size();i++)
                        Globals.report=Globals.report+(Exception)Globals.errorList.get(i);
                    }
                    Globals.mainFrame.setVisible(false);
                    Globals.mainFrame.remove(Globals.scrollPane);
                    Globals.rp.populateReport();
                    Globals.mainFrame.add(Globals.tmp);
                    Globals.mainFrame.setVisible(true);
                    return null;
                }
            };
            sw.execute();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel currFile;
    private javax.swing.JProgressBar currProgress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JProgressBar overallProgress;
    // End of variables declaration//GEN-END:variables

}
