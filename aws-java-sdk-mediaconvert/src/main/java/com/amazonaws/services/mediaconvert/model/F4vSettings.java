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
 * Settings for F4v container
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/F4vSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class F4vSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     */
    private String moovPlacement;

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @param moovPlacement
     *        If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     *        progressive downloading. Otherwise it is placed normally at the end.
     * @see F4vMoovPlacement
     */

    public void setMoovPlacement(String moovPlacement) {
        this.moovPlacement = moovPlacement;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @return If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required
     *         for progressive downloading. Otherwise it is placed normally at the end.
     * @see F4vMoovPlacement
     */

    public String getMoovPlacement() {
        return this.moovPlacement;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @param moovPlacement
     *        If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     *        progressive downloading. Otherwise it is placed normally at the end.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see F4vMoovPlacement
     */

    public F4vSettings withMoovPlacement(String moovPlacement) {
        setMoovPlacement(moovPlacement);
        return this;
    }

    /**
     * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     * progressive downloading. Otherwise it is placed normally at the end.
     * 
     * @param moovPlacement
     *        If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for
     *        progressive downloading. Otherwise it is placed normally at the end.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see F4vMoovPlacement
     */

    public F4vSettings withMoovPlacement(F4vMoovPlacement moovPlacement) {
        this.moovPlacement = moovPlacement.toString();
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
        if (getMoovPlacement() != null)
            sb.append("MoovPlacement: ").append(getMoovPlacement());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof F4vSettings == false)
            return false;
        F4vSettings other = (F4vSettings) obj;
        if (other.getMoovPlacement() == null ^ this.getMoovPlacement() == null)
            return false;
        if (other.getMoovPlacement() != null && other.getMoovPlacement().equals(this.getMoovPlacement()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMoovPlacement() == null) ? 0 : getMoovPlacement().hashCode());
        return hashCode;
    }

    @Override
    public F4vSettings clone() {
        try {
            return (F4vSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.F4vSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
