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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Noise reducer filter settings for spatial filter.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/NoiseReducerSpatialFilterSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NoiseReducerSpatialFilterSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at
     * maximum strength.
     */
    private Integer postFilterSharpenStrength;
    /** The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value. */
    private Integer speed;
    /** Relative strength of noise reducing filter. Higher values produce stronger filtering. */
    private Integer strength;

    /**
     * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at
     * maximum strength.
     * 
     * @param postFilterSharpenStrength
     *        Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it
     *        at maximum strength.
     */

    public void setPostFilterSharpenStrength(Integer postFilterSharpenStrength) {
        this.postFilterSharpenStrength = postFilterSharpenStrength;
    }

    /**
     * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at
     * maximum strength.
     * 
     * @return Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it
     *         at maximum strength.
     */

    public Integer getPostFilterSharpenStrength() {
        return this.postFilterSharpenStrength;
    }

    /**
     * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at
     * maximum strength.
     * 
     * @param postFilterSharpenStrength
     *        Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it
     *        at maximum strength.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducerSpatialFilterSettings withPostFilterSharpenStrength(Integer postFilterSharpenStrength) {
        setPostFilterSharpenStrength(postFilterSharpenStrength);
        return this;
    }

    /**
     * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
     * 
     * @param speed
     *        The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
     */

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
     * 
     * @return The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
     */

    public Integer getSpeed() {
        return this.speed;
    }

    /**
     * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
     * 
     * @param speed
     *        The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducerSpatialFilterSettings withSpeed(Integer speed) {
        setSpeed(speed);
        return this;
    }

    /**
     * Relative strength of noise reducing filter. Higher values produce stronger filtering.
     * 
     * @param strength
     *        Relative strength of noise reducing filter. Higher values produce stronger filtering.
     */

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    /**
     * Relative strength of noise reducing filter. Higher values produce stronger filtering.
     * 
     * @return Relative strength of noise reducing filter. Higher values produce stronger filtering.
     */

    public Integer getStrength() {
        return this.strength;
    }

    /**
     * Relative strength of noise reducing filter. Higher values produce stronger filtering.
     * 
     * @param strength
     *        Relative strength of noise reducing filter. Higher values produce stronger filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NoiseReducerSpatialFilterSettings withStrength(Integer strength) {
        setStrength(strength);
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
        if (getPostFilterSharpenStrength() != null)
            sb.append("PostFilterSharpenStrength: ").append(getPostFilterSharpenStrength()).append(",");
        if (getSpeed() != null)
            sb.append("Speed: ").append(getSpeed()).append(",");
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

        if (obj instanceof NoiseReducerSpatialFilterSettings == false)
            return false;
        NoiseReducerSpatialFilterSettings other = (NoiseReducerSpatialFilterSettings) obj;
        if (other.getPostFilterSharpenStrength() == null ^ this.getPostFilterSharpenStrength() == null)
            return false;
        if (other.getPostFilterSharpenStrength() != null && other.getPostFilterSharpenStrength().equals(this.getPostFilterSharpenStrength()) == false)
            return false;
        if (other.getSpeed() == null ^ this.getSpeed() == null)
            return false;
        if (other.getSpeed() != null && other.getSpeed().equals(this.getSpeed()) == false)
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

        hashCode = prime * hashCode + ((getPostFilterSharpenStrength() == null) ? 0 : getPostFilterSharpenStrength().hashCode());
        hashCode = prime * hashCode + ((getSpeed() == null) ? 0 : getSpeed().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public NoiseReducerSpatialFilterSettings clone() {
        try {
            return (NoiseReducerSpatialFilterSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.NoiseReducerSpatialFilterSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
