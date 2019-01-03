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
 * Settings for ancillary captions source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/AncillarySourceSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AncillarySourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for
     * passthrough.
     */
    private Integer sourceAncillaryChannelNumber;

    /**
     * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for
     * passthrough.
     * 
     * @param sourceAncillaryChannelNumber
     *        Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for
     *        passthrough.
     */

    public void setSourceAncillaryChannelNumber(Integer sourceAncillaryChannelNumber) {
        this.sourceAncillaryChannelNumber = sourceAncillaryChannelNumber;
    }

    /**
     * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for
     * passthrough.
     * 
     * @return Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for
     *         passthrough.
     */

    public Integer getSourceAncillaryChannelNumber() {
        return this.sourceAncillaryChannelNumber;
    }

    /**
     * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for
     * passthrough.
     * 
     * @param sourceAncillaryChannelNumber
     *        Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for
     *        passthrough.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AncillarySourceSettings withSourceAncillaryChannelNumber(Integer sourceAncillaryChannelNumber) {
        setSourceAncillaryChannelNumber(sourceAncillaryChannelNumber);
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
        if (getSourceAncillaryChannelNumber() != null)
            sb.append("SourceAncillaryChannelNumber: ").append(getSourceAncillaryChannelNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AncillarySourceSettings == false)
            return false;
        AncillarySourceSettings other = (AncillarySourceSettings) obj;
        if (other.getSourceAncillaryChannelNumber() == null ^ this.getSourceAncillaryChannelNumber() == null)
            return false;
        if (other.getSourceAncillaryChannelNumber() != null && other.getSourceAncillaryChannelNumber().equals(this.getSourceAncillaryChannelNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceAncillaryChannelNumber() == null) ? 0 : getSourceAncillaryChannelNumber().hashCode());
        return hashCode;
    }

    @Override
    public AncillarySourceSettings clone() {
        try {
            return (AncillarySourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.AncillarySourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
