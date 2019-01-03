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
 * Holds one set of SCTE-35 Descriptor Settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35Descriptor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35Descriptor implements Serializable, Cloneable, StructuredPojo {

    /** SCTE-35 Descriptor Settings. */
    private Scte35DescriptorSettings scte35DescriptorSettings;

    /**
     * SCTE-35 Descriptor Settings.
     * 
     * @param scte35DescriptorSettings
     *        SCTE-35 Descriptor Settings.
     */

    public void setScte35DescriptorSettings(Scte35DescriptorSettings scte35DescriptorSettings) {
        this.scte35DescriptorSettings = scte35DescriptorSettings;
    }

    /**
     * SCTE-35 Descriptor Settings.
     * 
     * @return SCTE-35 Descriptor Settings.
     */

    public Scte35DescriptorSettings getScte35DescriptorSettings() {
        return this.scte35DescriptorSettings;
    }

    /**
     * SCTE-35 Descriptor Settings.
     * 
     * @param scte35DescriptorSettings
     *        SCTE-35 Descriptor Settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35Descriptor withScte35DescriptorSettings(Scte35DescriptorSettings scte35DescriptorSettings) {
        setScte35DescriptorSettings(scte35DescriptorSettings);
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
        if (getScte35DescriptorSettings() != null)
            sb.append("Scte35DescriptorSettings: ").append(getScte35DescriptorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35Descriptor == false)
            return false;
        Scte35Descriptor other = (Scte35Descriptor) obj;
        if (other.getScte35DescriptorSettings() == null ^ this.getScte35DescriptorSettings() == null)
            return false;
        if (other.getScte35DescriptorSettings() != null && other.getScte35DescriptorSettings().equals(this.getScte35DescriptorSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScte35DescriptorSettings() == null) ? 0 : getScte35DescriptorSettings().hashCode());
        return hashCode;
    }

    @Override
    public Scte35Descriptor clone() {
        try {
            return (Scte35Descriptor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35DescriptorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
