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
 * The <code>CreatePresetResponse</code> structure.
 * </p>
 */
public class CreatePresetResult implements Serializable {

    /**
     * A section of the response body that provides information about the
     * preset that is created.
     */
    private Preset preset;

    /**
     * If the preset settings don't comply with the standards for the video
     * codec but Elastic Transcoder created the preset, this message explains
     * the reason the preset settings don't meet the standard. Elastic
     * Transcoder created the preset because the settings might produce
     * acceptable output.
     */
    private String warning;

    /**
     * A section of the response body that provides information about the
     * preset that is created.
     *
     * @return A section of the response body that provides information about the
     *         preset that is created.
     */
    public Preset getPreset() {
        return preset;
    }
    
    /**
     * A section of the response body that provides information about the
     * preset that is created.
     *
     * @param preset A section of the response body that provides information about the
     *         preset that is created.
     */
    public void setPreset(Preset preset) {
        this.preset = preset;
    }
    
    /**
     * A section of the response body that provides information about the
     * preset that is created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preset A section of the response body that provides information about the
     *         preset that is created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetResult withPreset(Preset preset) {
        this.preset = preset;
        return this;
    }

    /**
     * If the preset settings don't comply with the standards for the video
     * codec but Elastic Transcoder created the preset, this message explains
     * the reason the preset settings don't meet the standard. Elastic
     * Transcoder created the preset because the settings might produce
     * acceptable output.
     *
     * @return If the preset settings don't comply with the standards for the video
     *         codec but Elastic Transcoder created the preset, this message explains
     *         the reason the preset settings don't meet the standard. Elastic
     *         Transcoder created the preset because the settings might produce
     *         acceptable output.
     */
    public String getWarning() {
        return warning;
    }
    
    /**
     * If the preset settings don't comply with the standards for the video
     * codec but Elastic Transcoder created the preset, this message explains
     * the reason the preset settings don't meet the standard. Elastic
     * Transcoder created the preset because the settings might produce
     * acceptable output.
     *
     * @param warning If the preset settings don't comply with the standards for the video
     *         codec but Elastic Transcoder created the preset, this message explains
     *         the reason the preset settings don't meet the standard. Elastic
     *         Transcoder created the preset because the settings might produce
     *         acceptable output.
     */
    public void setWarning(String warning) {
        this.warning = warning;
    }
    
    /**
     * If the preset settings don't comply with the standards for the video
     * codec but Elastic Transcoder created the preset, this message explains
     * the reason the preset settings don't meet the standard. Elastic
     * Transcoder created the preset because the settings might produce
     * acceptable output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param warning If the preset settings don't comply with the standards for the video
     *         codec but Elastic Transcoder created the preset, this message explains
     *         the reason the preset settings don't meet the standard. Elastic
     *         Transcoder created the preset because the settings might produce
     *         acceptable output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePresetResult withWarning(String warning) {
        this.warning = warning;
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
        if (getPreset() != null) sb.append("Preset: " + getPreset() + ",");
        if (getWarning() != null) sb.append("Warning: " + getWarning() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPreset() == null) ? 0 : getPreset().hashCode()); 
        hashCode = prime * hashCode + ((getWarning() == null) ? 0 : getWarning().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePresetResult == false) return false;
        CreatePresetResult other = (CreatePresetResult)obj;
        
        if (other.getPreset() == null ^ this.getPreset() == null) return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false) return false; 
        if (other.getWarning() == null ^ this.getWarning() == null) return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false) return false; 
        return true;
    }
    
}
    