/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Setting for HDR10+ metadata insertion
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Hdr10Plus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Hdr10Plus implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual peak
     * luminance of the mastering display, as defined by ST 2094-40.
     */
    private Integer masteringMonitorNits;
    /**
     * Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance of the
     * target display as defined by ST 2094-40.
     */
    private Integer targetMonitorNits;

    /**
     * Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual peak
     * luminance of the mastering display, as defined by ST 2094-40.
     * 
     * @param masteringMonitorNits
     *        Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual
     *        peak luminance of the mastering display, as defined by ST 2094-40.
     */

    public void setMasteringMonitorNits(Integer masteringMonitorNits) {
        this.masteringMonitorNits = masteringMonitorNits;
    }

    /**
     * Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual peak
     * luminance of the mastering display, as defined by ST 2094-40.
     * 
     * @return Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual
     *         peak luminance of the mastering display, as defined by ST 2094-40.
     */

    public Integer getMasteringMonitorNits() {
        return this.masteringMonitorNits;
    }

    /**
     * Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual peak
     * luminance of the mastering display, as defined by ST 2094-40.
     * 
     * @param masteringMonitorNits
     *        Specify the HDR10+ mastering display normalized peak luminance, in nits. This is the normalized actual
     *        peak luminance of the mastering display, as defined by ST 2094-40.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Plus withMasteringMonitorNits(Integer masteringMonitorNits) {
        setMasteringMonitorNits(masteringMonitorNits);
        return this;
    }

    /**
     * Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance of the
     * target display as defined by ST 2094-40.
     * 
     * @param targetMonitorNits
     *        Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance
     *        of the target display as defined by ST 2094-40.
     */

    public void setTargetMonitorNits(Integer targetMonitorNits) {
        this.targetMonitorNits = targetMonitorNits;
    }

    /**
     * Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance of the
     * target display as defined by ST 2094-40.
     * 
     * @return Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance
     *         of the target display as defined by ST 2094-40.
     */

    public Integer getTargetMonitorNits() {
        return this.targetMonitorNits;
    }

    /**
     * Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance of the
     * target display as defined by ST 2094-40.
     * 
     * @param targetMonitorNits
     *        Specify the HDR10+ target display nominal peak luminance, in nits. This is the nominal maximum luminance
     *        of the target display as defined by ST 2094-40.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Hdr10Plus withTargetMonitorNits(Integer targetMonitorNits) {
        setTargetMonitorNits(targetMonitorNits);
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
        if (getMasteringMonitorNits() != null)
            sb.append("MasteringMonitorNits: ").append(getMasteringMonitorNits()).append(",");
        if (getTargetMonitorNits() != null)
            sb.append("TargetMonitorNits: ").append(getTargetMonitorNits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hdr10Plus == false)
            return false;
        Hdr10Plus other = (Hdr10Plus) obj;
        if (other.getMasteringMonitorNits() == null ^ this.getMasteringMonitorNits() == null)
            return false;
        if (other.getMasteringMonitorNits() != null && other.getMasteringMonitorNits().equals(this.getMasteringMonitorNits()) == false)
            return false;
        if (other.getTargetMonitorNits() == null ^ this.getTargetMonitorNits() == null)
            return false;
        if (other.getTargetMonitorNits() != null && other.getTargetMonitorNits().equals(this.getTargetMonitorNits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMasteringMonitorNits() == null) ? 0 : getMasteringMonitorNits().hashCode());
        hashCode = prime * hashCode + ((getTargetMonitorNits() == null) ? 0 : getTargetMonitorNits().hashCode());
        return hashCode;
    }

    @Override
    public Hdr10Plus clone() {
        try {
            return (Hdr10Plus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Hdr10PlusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
