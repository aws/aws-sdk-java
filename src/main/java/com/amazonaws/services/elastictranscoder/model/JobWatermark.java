/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png format, which supports
 * transparency.
 * </p>
 */
public class JobWatermark implements Serializable {

    /**
     * The ID of the watermark settings that Elastic Transcoder uses to add
     * watermarks to the video during transcoding. The settings are in the
     * preset specified by Preset for the current output. In that preset, the
     * value of Watermarks Id tells Elastic Transcoder which settings to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     */
    private String presetWatermarkId;

    /**
     * The name of the .png or .jpg file that you want to use for the
     * watermark. To determine which Amazon S3 bucket contains the specified
     * file, Elastic Transcoder checks the pipeline specified by
     * <code>Pipeline</code>; the <code>Input Bucket</code> object in that
     * pipeline identifies the bucket. <p> If the file name includes a
     * prefix, for example, <b>logos/128x64.png</b>, include the prefix in
     * the key. If the file isn't in the specified bucket, Elastic Transcoder
     * returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     */
    private String inputKey;

    /**
     * The ID of the watermark settings that Elastic Transcoder uses to add
     * watermarks to the video during transcoding. The settings are in the
     * preset specified by Preset for the current output. In that preset, the
     * value of Watermarks Id tells Elastic Transcoder which settings to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @return The ID of the watermark settings that Elastic Transcoder uses to add
     *         watermarks to the video during transcoding. The settings are in the
     *         preset specified by Preset for the current output. In that preset, the
     *         value of Watermarks Id tells Elastic Transcoder which settings to use.
     */
    public String getPresetWatermarkId() {
        return presetWatermarkId;
    }
    
    /**
     * The ID of the watermark settings that Elastic Transcoder uses to add
     * watermarks to the video during transcoding. The settings are in the
     * preset specified by Preset for the current output. In that preset, the
     * value of Watermarks Id tells Elastic Transcoder which settings to use.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param presetWatermarkId The ID of the watermark settings that Elastic Transcoder uses to add
     *         watermarks to the video during transcoding. The settings are in the
     *         preset specified by Preset for the current output. In that preset, the
     *         value of Watermarks Id tells Elastic Transcoder which settings to use.
     */
    public void setPresetWatermarkId(String presetWatermarkId) {
        this.presetWatermarkId = presetWatermarkId;
    }
    
    /**
     * The ID of the watermark settings that Elastic Transcoder uses to add
     * watermarks to the video during transcoding. The settings are in the
     * preset specified by Preset for the current output. In that preset, the
     * value of Watermarks Id tells Elastic Transcoder which settings to use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     *
     * @param presetWatermarkId The ID of the watermark settings that Elastic Transcoder uses to add
     *         watermarks to the video during transcoding. The settings are in the
     *         preset specified by Preset for the current output. In that preset, the
     *         value of Watermarks Id tells Elastic Transcoder which settings to use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobWatermark withPresetWatermarkId(String presetWatermarkId) {
        this.presetWatermarkId = presetWatermarkId;
        return this;
    }

    /**
     * The name of the .png or .jpg file that you want to use for the
     * watermark. To determine which Amazon S3 bucket contains the specified
     * file, Elastic Transcoder checks the pipeline specified by
     * <code>Pipeline</code>; the <code>Input Bucket</code> object in that
     * pipeline identifies the bucket. <p> If the file name includes a
     * prefix, for example, <b>logos/128x64.png</b>, include the prefix in
     * the key. If the file isn't in the specified bucket, Elastic Transcoder
     * returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     *
     * @return The name of the .png or .jpg file that you want to use for the
     *         watermark. To determine which Amazon S3 bucket contains the specified
     *         file, Elastic Transcoder checks the pipeline specified by
     *         <code>Pipeline</code>; the <code>Input Bucket</code> object in that
     *         pipeline identifies the bucket. <p> If the file name includes a
     *         prefix, for example, <b>logos/128x64.png</b>, include the prefix in
     *         the key. If the file isn't in the specified bucket, Elastic Transcoder
     *         returns an error.
     */
    public String getInputKey() {
        return inputKey;
    }
    
    /**
     * The name of the .png or .jpg file that you want to use for the
     * watermark. To determine which Amazon S3 bucket contains the specified
     * file, Elastic Transcoder checks the pipeline specified by
     * <code>Pipeline</code>; the <code>Input Bucket</code> object in that
     * pipeline identifies the bucket. <p> If the file name includes a
     * prefix, for example, <b>logos/128x64.png</b>, include the prefix in
     * the key. If the file isn't in the specified bucket, Elastic Transcoder
     * returns an error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     *
     * @param inputKey The name of the .png or .jpg file that you want to use for the
     *         watermark. To determine which Amazon S3 bucket contains the specified
     *         file, Elastic Transcoder checks the pipeline specified by
     *         <code>Pipeline</code>; the <code>Input Bucket</code> object in that
     *         pipeline identifies the bucket. <p> If the file name includes a
     *         prefix, for example, <b>logos/128x64.png</b>, include the prefix in
     *         the key. If the file isn't in the specified bucket, Elastic Transcoder
     *         returns an error.
     */
    public void setInputKey(String inputKey) {
        this.inputKey = inputKey;
    }
    
    /**
     * The name of the .png or .jpg file that you want to use for the
     * watermark. To determine which Amazon S3 bucket contains the specified
     * file, Elastic Transcoder checks the pipeline specified by
     * <code>Pipeline</code>; the <code>Input Bucket</code> object in that
     * pipeline identifies the bucket. <p> If the file name includes a
     * prefix, for example, <b>logos/128x64.png</b>, include the prefix in
     * the key. If the file isn't in the specified bucket, Elastic Transcoder
     * returns an error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>(^.{1,}.jpg$)|(^.{1,}.jpeg$)|(^.{1,}.png$)<br/>
     *
     * @param inputKey The name of the .png or .jpg file that you want to use for the
     *         watermark. To determine which Amazon S3 bucket contains the specified
     *         file, Elastic Transcoder checks the pipeline specified by
     *         <code>Pipeline</code>; the <code>Input Bucket</code> object in that
     *         pipeline identifies the bucket. <p> If the file name includes a
     *         prefix, for example, <b>logos/128x64.png</b>, include the prefix in
     *         the key. If the file isn't in the specified bucket, Elastic Transcoder
     *         returns an error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobWatermark withInputKey(String inputKey) {
        this.inputKey = inputKey;
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
        if (getPresetWatermarkId() != null) sb.append("PresetWatermarkId: " + getPresetWatermarkId() + ",");
        if (getInputKey() != null) sb.append("InputKey: " + getInputKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPresetWatermarkId() == null) ? 0 : getPresetWatermarkId().hashCode()); 
        hashCode = prime * hashCode + ((getInputKey() == null) ? 0 : getInputKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobWatermark == false) return false;
        JobWatermark other = (JobWatermark)obj;
        
        if (other.getPresetWatermarkId() == null ^ this.getPresetWatermarkId() == null) return false;
        if (other.getPresetWatermarkId() != null && other.getPresetWatermarkId().equals(this.getPresetWatermarkId()) == false) return false; 
        if (other.getInputKey() == null ^ this.getInputKey() == null) return false;
        if (other.getInputKey() != null && other.getInputKey().equals(this.getInputKey()) == false) return false; 
        return true;
    }
    
}
    