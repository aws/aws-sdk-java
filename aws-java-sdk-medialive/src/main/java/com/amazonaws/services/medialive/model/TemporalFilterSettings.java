/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Temporal Filter Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/TemporalFilterSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemporalFilterSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial when using
     * a noisy or compressed input source and low output bitrates.
     */
    private String postFilterSharpening;
    /** Filter strength. A higher value produces stronger filtering. */
    private String strength;

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial when using
     * a noisy or compressed input source and low output bitrates.
     * 
     * @param postFilterSharpening
     *        If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial
     *        when using a noisy or compressed input source and low output bitrates.
     * @see TemporalFilterPostFilterSharpening
     */

    public void setPostFilterSharpening(String postFilterSharpening) {
        this.postFilterSharpening = postFilterSharpening;
    }

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial when using
     * a noisy or compressed input source and low output bitrates.
     * 
     * @return If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial
     *         when using a noisy or compressed input source and low output bitrates.
     * @see TemporalFilterPostFilterSharpening
     */

    public String getPostFilterSharpening() {
        return this.postFilterSharpening;
    }

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial when using
     * a noisy or compressed input source and low output bitrates.
     * 
     * @param postFilterSharpening
     *        If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial
     *        when using a noisy or compressed input source and low output bitrates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemporalFilterPostFilterSharpening
     */

    public TemporalFilterSettings withPostFilterSharpening(String postFilterSharpening) {
        setPostFilterSharpening(postFilterSharpening);
        return this;
    }

    /**
     * If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial when using
     * a noisy or compressed input source and low output bitrates.
     * 
     * @param postFilterSharpening
     *        If set to "ENABLED," applies post-filter sharpening to improve visual quality. This is most beneficial
     *        when using a noisy or compressed input source and low output bitrates.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemporalFilterPostFilterSharpening
     */

    public TemporalFilterSettings withPostFilterSharpening(TemporalFilterPostFilterSharpening postFilterSharpening) {
        this.postFilterSharpening = postFilterSharpening.toString();
        return this;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * 
     * @param strength
     *        Filter strength. A higher value produces stronger filtering.
     * @see TemporalFilterStrength
     */

    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * 
     * @return Filter strength. A higher value produces stronger filtering.
     * @see TemporalFilterStrength
     */

    public String getStrength() {
        return this.strength;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * 
     * @param strength
     *        Filter strength. A higher value produces stronger filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemporalFilterStrength
     */

    public TemporalFilterSettings withStrength(String strength) {
        setStrength(strength);
        return this;
    }

    /**
     * Filter strength. A higher value produces stronger filtering.
     * 
     * @param strength
     *        Filter strength. A higher value produces stronger filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TemporalFilterStrength
     */

    public TemporalFilterSettings withStrength(TemporalFilterStrength strength) {
        this.strength = strength.toString();
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
        if (getPostFilterSharpening() != null)
            sb.append("PostFilterSharpening: ").append(getPostFilterSharpening()).append(",");
        if (getStrength() != null)
            sb.append("Strength: ").append(getStrength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemporalFilterSettings == false)
            return false;
        TemporalFilterSettings other = (TemporalFilterSettings) obj;
        if (other.getPostFilterSharpening() == null ^ this.getPostFilterSharpening() == null)
            return false;
        if (other.getPostFilterSharpening() != null && other.getPostFilterSharpening().equals(this.getPostFilterSharpening()) == false)
            return false;
        if (other.getStrength() == null ^ this.getStrength() == null)
            return false;
        if (other.getStrength() != null && other.getStrength().equals(this.getStrength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPostFilterSharpening() == null) ? 0 : getPostFilterSharpening().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public TemporalFilterSettings clone() {
        try {
            return (TemporalFilterSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.TemporalFilterSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
