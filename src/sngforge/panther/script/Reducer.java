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
package sngforge.panther.script;

import it.sauronsoftware.jave.*;
import java.io.File;
import sngforge.panther.modules.ID3TagCopier;

/**
 * Reducer class for use with Javascript
 * @author Sankha
 */
public class Reducer {
    
    File in,out;
    AudioAttributes aa;
    EncodingAttributes ea;
    
    /*
     * instantiates the object with the input file and the output file
     * @param in the input file
     * @param out the output file
     */
    public Reducer(File in, File out){
        this.in=in;
        this.out=out;
        aa=new AudioAttributes();
        ea=new EncodingAttributes();
    }
    
    /*
     * begins the encoding process
     * @param copyID3 true if the ID3 tags are to be copied, false otherwise
     */
    public void encode(boolean copyID3){
        Utilities u=new Utilities();
        u.println("Encoding file: "+in.getAbsolutePath());
        Encoder e=new Encoder();
        ea.setAudioAttributes(aa);
        setFormat("mp3");
        try{
            e.encode(in , out, ea, new ProgressListener());
            if(copyID3)
                ID3TagCopier.copyTags(in,out);
        } catch(Exception ex){
            System.err.println(ex);
            u.println("Error: "+ex);
        }
    }
    
    /*
     * gets the bitrate of the input file
     * @return the bitrate of the input file in kbps
     */
    public int getBitrate(){
        Utilities u=new Utilities();
        AudioInfo ai=null;
        try{
            Encoder e=new Encoder();
            MultimediaInfo mi=e.getInfo(in);
            ai=mi.getAudio();
        }catch(Exception e){
            System.err.println(e);
            u.println("Error: "+e);
        }
        return ai.getBitRate();
    }
    
    /*
     * the bitrate of the output file
     * @param bitrate the bitrate in bps
     */
    public void setBitrate(int bitrate){
        aa.setBitRate(bitrate);
    }
    
    
    /*
     * sets the format of the output file
     * @param format the format of the output file
     */
    private void setFormat(String format){
        ea.setFormat(format);
    }
}
