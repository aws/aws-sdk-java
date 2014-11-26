/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * The captions to be created, if any.
 * </p>
 */
public class Captions implements Serializable {

    /**
     * A policy that determines how Elastic Transcoder handles the existence
     * of multiple captions. <ul> <li><p><b>MergeOverride:</b> Elastic
     * Transcoder transcodes both embedded and sidecar captions into outputs.
     * If captions for a language are embedded in the input file and also
     * appear in a sidecar file, Elastic Transcoder uses the sidecar captions
     * and ignores the embedded captions for that language.</li>
     * <li><p><b>MergeRetain:</b> Elastic Transcoder transcodes both embedded
     * and sidecar captions into outputs. If captions for a language are
     * embedded in the input file and also appear in a sidecar file, Elastic
     * Transcoder uses the embedded captions and ignores the sidecar captions
     * for that language. If <code>CaptionSources</code> is empty, Elastic
     * Transcoder omits all sidecar captions from the output files.</li>
     * <li><p><b>Override:</b> Elastic Transcoder transcodes only the sidecar
     * captions that you specify in <code>CaptionSources</code>.</li> </ul>
     * <p><code>MergePolicy</code> cannot be null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^MergeOverride$)|(^MergeRetain$)|(^Override$)<br/>
     */
    private String mergePolicy;

    /**
     * Source files for the input sidecar captions used during the
     * transcoding process. To omit all sidecar captions, leave
     * <code>CaptionSources</code> blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CaptionSource> captionSources;

    /**
     * The array of file formats for the output captions. If you leave this
     * value blank, Elastic Transcoder returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<CaptionFormat> captionFormats;

    /**
     * A policy that determines how Elastic Transcoder handles the existence
     * of multiple captions. <ul> <li><p><b>MergeOverride:</b> Elastic
     * Transcoder transcodes both embedded and sidecar captions into outputs.
     * If captions for a language are embedded in the input file and also
     * appear in a sidecar file, Elastic Transcoder uses the sidecar captions
     * and ignores the embedded captions for that language.</li>
     * <li><p><b>MergeRetain:</b> Elastic Transcoder transcodes both embedded
     * and sidecar captions into outputs. If captions for a language are
     * embedded in the input file and also appear in a sidecar file, Elastic
     * Transcoder uses the embedded captions and ignores the sidecar captions
     * for that language. If <code>CaptionSources</code> is empty, Elastic
     * Transcoder omits all sidecar captions from the output files.</li>
     * <li><p><b>Override:</b> Elastic Transcoder transcodes only the sidecar
     * captions that you specify in <code>CaptionSources</code>.</li> </ul>
     * <p><code>MergePolicy</code> cannot be null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^MergeOverride$)|(^MergeRetain$)|(^Override$)<br/>
     *
     * @return A policy that determines how Elastic Transcoder handles the existence
     *         of multiple captions. <ul> <li><p><b>MergeOverride:</b> Elastic
     *         Transcoder transcodes both embedded and sidecar captions into outputs.
     *         If captions for a language are embedded in the input file and also
     *         appear in a sidecar file, Elastic Transcoder uses the sidecar captions
     *         and ignores the embedded captions for that language.</li>
     *         <li><p><b>MergeRetain:</b> Elastic Transcoder transcodes both embedded
     *         and sidecar captions into outputs. If captions for a language are
     *         embedded in the input file and also appear in a sidecar file, Elastic
     *         Transcoder uses the embedded captions and ignores the sidecar captions
     *         for that language. If <code>CaptionSources</code> is empty, Elastic
     *         Transcoder omits all sidecar captions from the output files.</li>
     *         <li><p><b>Override:</b> Elastic Transcoder transcodes only the sidecar
     *         captions that you specify in <code>CaptionSources</code>.</li> </ul>
     *         <p><code>MergePolicy</code> cannot be null.
     */
    public String getMergePolicy() {
        return mergePolicy;
    }
    
    /**
     * A policy that determines how Elastic Transcoder handles the existence
     * of multiple captions. <ul> <li><p><b>MergeOverride:</b> Elastic
     * Transcoder transcodes both embedded and sidecar captions into outputs.
     * If captions for a language are embedded in the input file and also
     * appear in a sidecar file, Elastic Transcoder uses the sidecar captions
     * and ignores the embedded captions for that language.</li>
     * <li><p><b>MergeRetain:</b> Elastic Transcoder transcodes both embedded
     * and sidecar captions into outputs. If captions for a language are
     * embedded in the input file and also appear in a sidecar file, Elastic
     * Transcoder uses the embedded captions and ignores the sidecar captions
     * for that language. If <code>CaptionSources</code> is empty, Elastic
     * Transcoder omits all sidecar captions from the output files.</li>
     * <li><p><b>Override:</b> Elastic Transcoder transcodes only the sidecar
     * captions that you specify in <code>CaptionSources</code>.</li> </ul>
     * <p><code>MergePolicy</code> cannot be null.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^MergeOverride$)|(^MergeRetain$)|(^Override$)<br/>
     *
     * @param mergePolicy A policy that determines how Elastic Transcoder handles the existence
     *         of multiple captions. <ul> <li><p><b>MergeOverride:</b> Elastic
     *         Transcoder transcodes both embedded and sidecar captions into outputs.
     *         If captions for a language are embedded in the input file and also
     *         appear in a sidecar file, Elastic Transcoder uses the sidecar captions
     *         and ignores the embedded captions for that language.</li>
     *         <li><p><b>MergeRetain:</b> Elastic Transcoder transcodes both embedded
     *         and sidecar captions into outputs. If captions for a language are
     *         embedded in the input file and also appear in a sidecar file, Elastic
     *         Transcoder uses the embedded captions and ignores the sidecar captions
     *         for that language. If <code>CaptionSources</code> is empty, Elastic
     *         Transcoder omits all sidecar captions from the output files.</li>
     *         <li><p><b>Override:</b> Elastic Transcoder transcodes only the sidecar
     *         captions that you specify in <code>CaptionSources</code>.</li> </ul>
     *         <p><code>MergePolicy</code> cannot be null.
     */
    public void setMergePolicy(String mergePolicy) {
        this.mergePolicy = mergePolicy;
    }
    
    /**
     * A policy that determines how Elastic Transcoder handles the existence
     * of multiple captions. <ul> <li><p><b>MergeOverride:</b> Elastic
     * Transcoder transcodes both embedded and sidecar captions into outputs.
     * If captions for a language are embedded in the input file and also
     * appear in a sidecar file, Elastic Transcoder uses the sidecar captions
     * and ignores the embedded captions for that language.</li>
     * <li><p><b>MergeRetain:</b> Elastic Transcoder transcodes both embedded
     * and sidecar captions into outputs. If captions for a language are
     * embedded in the input file and also appear in a sidecar file, Elastic
     * Transcoder uses the embedded captions and ignores the sidecar captions
     * for that language. If <code>CaptionSources</code> is empty, Elastic
     * Transcoder omits all sidecar captions from the output files.</li>
     * <li><p><b>Override:</b> Elastic Transcoder transcodes only the sidecar
     * captions that you specify in <code>CaptionSources</code>.</li> </ul>
     * <p><code>MergePolicy</code> cannot be null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^MergeOverride$)|(^MergeRetain$)|(^Override$)<br/>
     *
     * @param mergePolicy A policy that determines how Elastic Transcoder handles the existence
     *         of multiple captions. <ul> <li><p><b>MergeOverride:</b> Elastic
     *         Transcoder transcodes both embedded and sidecar captions into outputs.
     *         If captions for a language are embedded in the input file and also
     *         appear in a sidecar file, Elastic Transcoder uses the sidecar captions
     *         and ignores the embedded captions for that language.</li>
     *         <li><p><b>MergeRetain:</b> Elastic Transcoder transcodes both embedded
     *         and sidecar captions into outputs. If captions for a language are
     *         embedded in the input file and also appear in a sidecar file, Elastic
     *         Transcoder uses the embedded captions and ignores the sidecar captions
     *         for that language. If <code>CaptionSources</code> is empty, Elastic
     *         Transcoder omits all sidecar captions from the output files.</li>
     *         <li><p><b>Override:</b> Elastic Transcoder transcodes only the sidecar
     *         captions that you specify in <code>CaptionSources</code>.</li> </ul>
     *         <p><code>MergePolicy</code> cannot be null.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Captions withMergePolicy(String mergePolicy) {
        this.mergePolicy = mergePolicy;
        return this;
    }

    /**
     * Source files for the input sidecar captions used during the
     * transcoding process. To omit all sidecar captions, leave
     * <code>CaptionSources</code> blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20<br/>
     *
     * @return Source files for the input sidecar captions used during the
     *         transcoding process. To omit all sidecar captions, leave
     *         <code>CaptionSources</code> blank.
     */
    public java.util.List<CaptionSource> getCaptionSources() {
        if (captionSources == null) {
              captionSources = new com.amazonaws.internal.ListWithAutoConstructFlag<CaptionSource>();
              captionSources.setAutoConstruct(true);
        }
        return captionSources;
    }
    
    /**
     * Source files for the input sidecar captions used during the
     * transcoding process. To omit all sidecar captions, leave
     * <code>CaptionSources</code> blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20<br/>
     *
     * @param captionSources Source files for the input sidecar captions used during the
     *         transcoding process. To omit all sidecar captions, leave
     *         <code>CaptionSources</code> blank.
     */
    public void setCaptionSources(java.util.Collection<CaptionSource> captionSources) {
        if (captionSources == null) {
            this.captionSources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CaptionSource> captionSourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CaptionSource>(captionSources.size());
        captionSourcesCopy.addAll(captionSources);
        this.captionSources = captionSourcesCopy;
    }
    
    /**
     * Source files for the input sidecar captions used during the
     * transcoding process. To omit all sidecar captions, leave
     * <code>CaptionSources</code> blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20<br/>
     *
     * @param captionSources Source files for the input sidecar captions used during the
     *         transcoding process. To omit all sidecar captions, leave
     *         <code>CaptionSources</code> blank.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Captions withCaptionSources(CaptionSource... captionSources) {
        if (getCaptionSources() == null) setCaptionSources(new java.util.ArrayList<CaptionSource>(captionSources.length));
        for (CaptionSource value : captionSources) {
            getCaptionSources().add(value);
        }
        return this;
    }
    
    /**
     * Source files for the input sidecar captions used during the
     * transcoding process. To omit all sidecar captions, leave
     * <code>CaptionSources</code> blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 20<br/>
     *
     * @param captionSources Source files for the input sidecar captions used during the
     *         transcoding process. To omit all sidecar captions, leave
     *         <code>CaptionSources</code> blank.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Captions withCaptionSources(java.util.Collection<CaptionSource> captionSources) {
        if (captionSources == null) {
            this.captionSources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CaptionSource> captionSourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CaptionSource>(captionSources.size());
            captionSourcesCopy.addAll(captionSources);
            this.captionSources = captionSourcesCopy;
        }

        return this;
    }

    /**
     * The array of file formats for the output captions. If you leave this
     * value blank, Elastic Transcoder returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @return The array of file formats for the output captions. If you leave this
     *         value blank, Elastic Transcoder returns an error.
     */
    public java.util.List<CaptionFormat> getCaptionFormats() {
        if (captionFormats == null) {
              captionFormats = new com.amazonaws.internal.ListWithAutoConstructFlag<CaptionFormat>();
              captionFormats.setAutoConstruct(true);
        }
        return captionFormats;
    }
    
    /**
     * The array of file formats for the output captions. If you leave this
     * value blank, Elastic Transcoder returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @param captionFormats The array of file formats for the output captions. If you leave this
     *         value blank, Elastic Transcoder returns an error.
     */
    public void setCaptionFormats(java.util.Collection<CaptionFormat> captionFormats) {
        if (captionFormats == null) {
            this.captionFormats = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<CaptionFormat> captionFormatsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CaptionFormat>(captionFormats.size());
        captionFormatsCopy.addAll(captionFormats);
        this.captionFormats = captionFormatsCopy;
    }
    
    /**
     * The array of file formats for the output captions. If you leave this
     * value blank, Elastic Transcoder returns an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @param captionFormats The array of file formats for the output captions. If you leave this
     *         value blank, Elastic Transcoder returns an error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Captions withCaptionFormats(CaptionFormat... captionFormats) {
        if (getCaptionFormats() == null) setCaptionFormats(new java.util.ArrayList<CaptionFormat>(captionFormats.length));
        for (CaptionFormat value : captionFormats) {
            getCaptionFormats().add(value);
        }
        return this;
    }
    
    /**
     * The array of file formats for the output captions. If you leave this
     * value blank, Elastic Transcoder returns an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @param captionFormats The array of file formats for the output captions. If you leave this
     *         value blank, Elastic Transcoder returns an error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Captions withCaptionFormats(java.util.Collection<CaptionFormat> captionFormats) {
        if (captionFormats == null) {
            this.captionFormats = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<CaptionFormat> captionFormatsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<CaptionFormat>(captionFormats.size());
            captionFormatsCopy.addAll(captionFormats);
            this.captionFormats = captionFormatsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMergePolicy() != null) sb.append("MergePolicy: " + getMergePolicy() + ",");
        if (getCaptionSources() != null) sb.append("CaptionSources: " + getCaptionSources() + ",");
        if (getCaptionFormats() != null) sb.append("CaptionFormats: " + getCaptionFormats() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMergePolicy() == null) ? 0 : getMergePolicy().hashCode()); 
        hashCode = prime * hashCode + ((getCaptionSources() == null) ? 0 : getCaptionSources().hashCode()); 
        hashCode = prime * hashCode + ((getCaptionFormats() == null) ? 0 : getCaptionFormats().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Captions == false) return false;
        Captions other = (Captions)obj;
        
        if (other.getMergePolicy() == null ^ this.getMergePolicy() == null) return false;
        if (other.getMergePolicy() != null && other.getMergePolicy().equals(this.getMergePolicy()) == false) return false; 
        if (other.getCaptionSources() == null ^ this.getCaptionSources() == null) return false;
        if (other.getCaptionSources() != null && other.getCaptionSources().equals(this.getCaptionSources()) == false) return false; 
        if (other.getCaptionFormats() == null ^ this.getCaptionFormats() == null) return false;
        if (other.getCaptionFormats() != null && other.getCaptionFormats().equals(this.getCaptionFormats()) == false) return false; 
        return true;
    }
    
}
    