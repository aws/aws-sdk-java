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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * SCTE-35 Descriptor settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35DescriptorSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35DescriptorSettings implements Serializable, Cloneable, StructuredPojo {

    /** SCTE-35 Segmentation Descriptor. */
    private Scte35SegmentationDescriptor segmentationDescriptorScte35DescriptorSettings;

    /**
     * SCTE-35 Segmentation Descriptor.
     * 
     * @param segmentationDescriptorScte35DescriptorSettings
     *        SCTE-35 Segmentation Descriptor.
     */

    public void setSegmentationDescriptorScte35DescriptorSettings(Scte35SegmentationDescriptor segmentationDescriptorScte35DescriptorSettings) {
        this.segmentationDescriptorScte35DescriptorSettings = segmentationDescriptorScte35DescriptorSettings;
    }

    /**
     * SCTE-35 Segmentation Descriptor.
     * 
     * @return SCTE-35 Segmentation Descriptor.
     */

    public Scte35SegmentationDescriptor getSegmentationDescriptorScte35DescriptorSettings() {
        return this.segmentationDescriptorScte35DescriptorSettings;
    }

    /**
     * SCTE-35 Segmentation Descriptor.
     * 
     * @param segmentationDescriptorScte35DescriptorSettings
     *        SCTE-35 Segmentation Descriptor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35DescriptorSettings withSegmentationDescriptorScte35DescriptorSettings(
            Scte35SegmentationDescriptor segmentationDescriptorScte35DescriptorSettings) {
        setSegmentationDescriptorScte35DescriptorSettings(segmentationDescriptorScte35DescriptorSettings);
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
        if (getSegmentationDescriptorScte35DescriptorSettings() != null)
            sb.append("SegmentationDescriptorScte35DescriptorSettings: ").append(getSegmentationDescriptorScte35DescriptorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35DescriptorSettings == false)
            return false;
        Scte35DescriptorSettings other = (Scte35DescriptorSettings) obj;
        if (other.getSegmentationDescriptorScte35DescriptorSettings() == null ^ this.getSegmentationDescriptorScte35DescriptorSettings() == null)
            return false;
        if (other.getSegmentationDescriptorScte35DescriptorSettings() != null
                && other.getSegmentationDescriptorScte35DescriptorSettings().equals(this.getSegmentationDescriptorScte35DescriptorSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSegmentationDescriptorScte35DescriptorSettings() == null) ? 0 : getSegmentationDescriptorScte35DescriptorSettings().hashCode());
        return hashCode;
    }

    @Override
    public Scte35DescriptorSettings clone() {
        try {
            return (Scte35DescriptorSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35DescriptorSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
