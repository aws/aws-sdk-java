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

/**
 * 
 */
public class Thumbnails {

    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^png$)<br/>
     */
    private String format;

    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     */
    private String interval;

    /**
     * The width and height of thumbnail files in pixels. Specify a value in
     * the format <code><i>width</i></code> x <code><i>height</i></code>
     * where both values are even integers. The values cannot exceed the
     * width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+x\d+$<br/>
     */
    private String resolution;

    /**
     * The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     */
    private String aspectRatio;

    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^png$)<br/>
     *
     * @return The format of thumbnails, if any. Valid values are <code>jpg</code>
     *         and <code>png</code>. <p>You specify whether you want Elastic
     *         Transcoder to create thumbnails when you create a job.
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^png$)<br/>
     *
     * @param format The format of thumbnails, if any. Valid values are <code>jpg</code>
     *         and <code>png</code>. <p>You specify whether you want Elastic
     *         Transcoder to create thumbnails when you create a job.
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * The format of thumbnails, if any. Valid values are <code>jpg</code>
     * and <code>png</code>. <p>You specify whether you want Elastic
     * Transcoder to create thumbnails when you create a job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^png$)<br/>
     *
     * @param format The format of thumbnails, if any. Valid values are <code>jpg</code>
     *         and <code>png</code>. <p>You specify whether you want Elastic
     *         Transcoder to create thumbnails when you create a job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Thumbnails withFormat(String format) {
        this.format = format;
        return this;
    }
    
    
    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     *
     * @return The number of seconds between thumbnails. Specify an integer value.
     */
    public String getInterval() {
        return interval;
    }
    
    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     *
     * @param interval The number of seconds between thumbnails. Specify an integer value.
     */
    public void setInterval(String interval) {
        this.interval = interval;
    }
    
    /**
     * The number of seconds between thumbnails. Specify an integer value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+$<br/>
     *
     * @param interval The number of seconds between thumbnails. Specify an integer value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Thumbnails withInterval(String interval) {
        this.interval = interval;
        return this;
    }
    
    
    /**
     * The width and height of thumbnail files in pixels. Specify a value in
     * the format <code><i>width</i></code> x <code><i>height</i></code>
     * where both values are even integers. The values cannot exceed the
     * width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+x\d+$<br/>
     *
     * @return The width and height of thumbnail files in pixels. Specify a value in
     *         the format <code><i>width</i></code> x <code><i>height</i></code>
     *         where both values are even integers. The values cannot exceed the
     *         width and height that you specified in the
     *         <code>Video:Resolution</code> object.
     */
    public String getResolution() {
        return resolution;
    }
    
    /**
     * The width and height of thumbnail files in pixels. Specify a value in
     * the format <code><i>width</i></code> x <code><i>height</i></code>
     * where both values are even integers. The values cannot exceed the
     * width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+x\d+$<br/>
     *
     * @param resolution The width and height of thumbnail files in pixels. Specify a value in
     *         the format <code><i>width</i></code> x <code><i>height</i></code>
     *         where both values are even integers. The values cannot exceed the
     *         width and height that you specified in the
     *         <code>Video:Resolution</code> object.
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    /**
     * The width and height of thumbnail files in pixels. Specify a value in
     * the format <code><i>width</i></code> x <code><i>height</i></code>
     * where both values are even integers. The values cannot exceed the
     * width and height that you specified in the
     * <code>Video:Resolution</code> object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d+x\d+$<br/>
     *
     * @param resolution The width and height of thumbnail files in pixels. Specify a value in
     *         the format <code><i>width</i></code> x <code><i>height</i></code>
     *         where both values are even integers. The values cannot exceed the
     *         width and height that you specified in the
     *         <code>Video:Resolution</code> object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Thumbnails withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    
    
    /**
     * The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @return The aspect ratio of thumbnails. Valid values include:
     *         <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     *         <code>3:2</code>, <code>16:9</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     *         ratio of the video in the output file.
     */
    public String getAspectRatio() {
        return aspectRatio;
    }
    
    /**
     * The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio The aspect ratio of thumbnails. Valid values include:
     *         <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     *         <code>3:2</code>, <code>16:9</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     *         ratio of the video in the output file.
     */
    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
    
    /**
     * The aspect ratio of thumbnails. Valid values include:
     * <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     * <code>3:2</code>, <code>16:9</code> <p>If you specify
     * <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     * ratio of the video in the output file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>(^auto$)|(^1:1$)|(^4:3$)|(^3:2$)|(^16:9$)<br/>
     *
     * @param aspectRatio The aspect ratio of thumbnails. Valid values include:
     *         <p><code>auto</code>, <code>1:1</code>, <code>4:3</code>,
     *         <code>3:2</code>, <code>16:9</code> <p>If you specify
     *         <code>auto</code>, Elastic Transcoder tries to preserve the aspect
     *         ratio of the video in the output file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Thumbnails withAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
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
        if (getFormat() != null) sb.append("Format: " + getFormat() + ", ");
        if (getInterval() != null) sb.append("Interval: " + getInterval() + ", ");
        if (getResolution() != null) sb.append("Resolution: " + getResolution() + ", ");
        if (getAspectRatio() != null) sb.append("AspectRatio: " + getAspectRatio() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode()); 
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode()); 
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode()); 
        hashCode = prime * hashCode + ((getAspectRatio() == null) ? 0 : getAspectRatio().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Thumbnails == false) return false;
        Thumbnails other = (Thumbnails)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getInterval() == null ^ this.getInterval() == null) return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false) return false; 
        if (other.getResolution() == null ^ this.getResolution() == null) return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false) return false; 
        if (other.getAspectRatio() == null ^ this.getAspectRatio() == null) return false;
        if (other.getAspectRatio() != null && other.getAspectRatio().equals(this.getAspectRatio()) == false) return false; 
        return true;
    }
    
}
    