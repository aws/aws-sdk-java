/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The <code>CreatePresetResponse</code> structure.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePresetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A section of the response body that provides information about the preset that is created.
     * </p>
     */
    private Preset preset;
    /**
     * <p>
     * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the
     * preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created
     * the preset because the settings might produce acceptable output.
     * </p>
     */
    private String warning;

    /**
     * <p>
     * A section of the response body that provides information about the preset that is created.
     * </p>
     * 
     * @param preset
     *        A section of the response body that provides information about the preset that is created.
     */

    public void setPreset(Preset preset) {
        this.preset = preset;
    }

    /**
     * <p>
     * A section of the response body that provides information about the preset that is created.
     * </p>
     * 
     * @return A section of the response body that provides information about the preset that is created.
     */

    public Preset getPreset() {
        return this.preset;
    }

    /**
     * <p>
     * A section of the response body that provides information about the preset that is created.
     * </p>
     * 
     * @param preset
     *        A section of the response body that provides information about the preset that is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetResult withPreset(Preset preset) {
        setPreset(preset);
        return this;
    }

    /**
     * <p>
     * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the
     * preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created
     * the preset because the settings might produce acceptable output.
     * </p>
     * 
     * @param warning
     *        If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created
     *        the preset, this message explains the reason the preset settings don't meet the standard. Elastic
     *        Transcoder created the preset because the settings might produce acceptable output.
     */

    public void setWarning(String warning) {
        this.warning = warning;
    }

    /**
     * <p>
     * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the
     * preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created
     * the preset because the settings might produce acceptable output.
     * </p>
     * 
     * @return If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created
     *         the preset, this message explains the reason the preset settings don't meet the standard. Elastic
     *         Transcoder created the preset because the settings might produce acceptable output.
     */

    public String getWarning() {
        return this.warning;
    }

    /**
     * <p>
     * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the
     * preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created
     * the preset because the settings might produce acceptable output.
     * </p>
     * 
     * @param warning
     *        If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created
     *        the preset, this message explains the reason the preset settings don't meet the standard. Elastic
     *        Transcoder created the preset because the settings might produce acceptable output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePresetResult withWarning(String warning) {
        setWarning(warning);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPreset() != null)
            sb.append("Preset: ").append(getPreset()).append(",");
        if (getWarning() != null)
            sb.append("Warning: ").append(getWarning());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePresetResult == false)
            return false;
        CreatePresetResult other = (CreatePresetResult) obj;
        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false)
            return false;
        if (other.getWarning() == null ^ this.getWarning() == null)
            return false;
        if (other.getWarning() != null && other.getWarning().equals(this.getWarning()) == false)
            return false;
        return true;
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
    public CreatePresetResult clone() {
        try {
            return (CreatePresetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
