/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The detected properties of the input file. Elastic Transcoder
 * identifies these values from the input file.
 * </p>
 */
public class DetectedProperties implements Serializable, Cloneable {

    /**
     * The detected width of the input file, in pixels.
     */
    private Integer width;

    /**
     * The detected height of the input file, in pixels.
     */
    private Integer height;

    /**
     * The detected frame rate of the input file, in frames per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}(\.\d{0,5})?$<br/>
     */
    private String frameRate;

    /**
     * The detected file size of the input file, in bytes.
     */
    private Long fileSize;

    /**
     * The detected duration of the input file, in milliseconds.
     */
    private Long durationMillis;

    /**
     * The detected width of the input file, in pixels.
     *
     * @return The detected width of the input file, in pixels.
     */
    public Integer getWidth() {
        return width;
    }
    
    /**
     * The detected width of the input file, in pixels.
     *
     * @param width The detected width of the input file, in pixels.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }
    
    /**
     * The detected width of the input file, in pixels.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param width The detected width of the input file, in pixels.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetectedProperties withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * The detected height of the input file, in pixels.
     *
     * @return The detected height of the input file, in pixels.
     */
    public Integer getHeight() {
        return height;
    }
    
    /**
     * The detected height of the input file, in pixels.
     *
     * @param height The detected height of the input file, in pixels.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }
    
    /**
     * The detected height of the input file, in pixels.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param height The detected height of the input file, in pixels.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetectedProperties withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * The detected frame rate of the input file, in frames per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}(\.\d{0,5})?$<br/>
     *
     * @return The detected frame rate of the input file, in frames per second.
     */
    public String getFrameRate() {
        return frameRate;
    }
    
    /**
     * The detected frame rate of the input file, in frames per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}(\.\d{0,5})?$<br/>
     *
     * @param frameRate The detected frame rate of the input file, in frames per second.
     */
    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }
    
    /**
     * The detected frame rate of the input file, in frames per second.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{1,5}(\.\d{0,5})?$<br/>
     *
     * @param frameRate The detected frame rate of the input file, in frames per second.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetectedProperties withFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * The detected file size of the input file, in bytes.
     *
     * @return The detected file size of the input file, in bytes.
     */
    public Long getFileSize() {
        return fileSize;
    }
    
    /**
     * The detected file size of the input file, in bytes.
     *
     * @param fileSize The detected file size of the input file, in bytes.
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }
    
    /**
     * The detected file size of the input file, in bytes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fileSize The detected file size of the input file, in bytes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetectedProperties withFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * The detected duration of the input file, in milliseconds.
     *
     * @return The detected duration of the input file, in milliseconds.
     */
    public Long getDurationMillis() {
        return durationMillis;
    }
    
    /**
     * The detected duration of the input file, in milliseconds.
     *
     * @param durationMillis The detected duration of the input file, in milliseconds.
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }
    
    /**
     * The detected duration of the input file, in milliseconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param durationMillis The detected duration of the input file, in milliseconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetectedProperties withDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
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
        if (getWidth() != null) sb.append("Width: " + getWidth() + ",");
        if (getHeight() != null) sb.append("Height: " + getHeight() + ",");
        if (getFrameRate() != null) sb.append("FrameRate: " + getFrameRate() + ",");
        if (getFileSize() != null) sb.append("FileSize: " + getFileSize() + ",");
        if (getDurationMillis() != null) sb.append("DurationMillis: " + getDurationMillis() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode()); 
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode()); 
        hashCode = prime * hashCode + ((getFrameRate() == null) ? 0 : getFrameRate().hashCode()); 
        hashCode = prime * hashCode + ((getFileSize() == null) ? 0 : getFileSize().hashCode()); 
        hashCode = prime * hashCode + ((getDurationMillis() == null) ? 0 : getDurationMillis().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetectedProperties == false) return false;
        DetectedProperties other = (DetectedProperties)obj;
        
        if (other.getWidth() == null ^ this.getWidth() == null) return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false) return false; 
        if (other.getHeight() == null ^ this.getHeight() == null) return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false) return false; 
        if (other.getFrameRate() == null ^ this.getFrameRate() == null) return false;
        if (other.getFrameRate() != null && other.getFrameRate().equals(this.getFrameRate()) == false) return false; 
        if (other.getFileSize() == null ^ this.getFileSize() == null) return false;
        if (other.getFileSize() != null && other.getFileSize().equals(this.getFileSize()) == false) return false; 
        if (other.getDurationMillis() == null ^ this.getDurationMillis() == null) return false;
        if (other.getDurationMillis() != null && other.getDurationMillis().equals(this.getDurationMillis()) == false) return false; 
        return true;
    }
    
    @Override
    public DetectedProperties clone() {
        try {
            return (DetectedProperties) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    