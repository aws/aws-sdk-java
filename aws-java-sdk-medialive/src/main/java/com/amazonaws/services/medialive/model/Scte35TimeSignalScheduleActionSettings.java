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
 * Settings for a SCTE-35 time_signal.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte35TimeSignalScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte35TimeSignalScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /** The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal. */
    private java.util.List<Scte35Descriptor> scte35Descriptors;

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * 
     * @return The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     */

    public java.util.List<Scte35Descriptor> getScte35Descriptors() {
        return scte35Descriptors;
    }

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * 
     * @param scte35Descriptors
     *        The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     */

    public void setScte35Descriptors(java.util.Collection<Scte35Descriptor> scte35Descriptors) {
        if (scte35Descriptors == null) {
            this.scte35Descriptors = null;
            return;
        }

        this.scte35Descriptors = new java.util.ArrayList<Scte35Descriptor>(scte35Descriptors);
    }

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScte35Descriptors(java.util.Collection)} or {@link #withScte35Descriptors(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param scte35Descriptors
     *        The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35TimeSignalScheduleActionSettings withScte35Descriptors(Scte35Descriptor... scte35Descriptors) {
        if (this.scte35Descriptors == null) {
            setScte35Descriptors(new java.util.ArrayList<Scte35Descriptor>(scte35Descriptors.length));
        }
        for (Scte35Descriptor ele : scte35Descriptors) {
            this.scte35Descriptors.add(ele);
        }
        return this;
    }

    /**
     * The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * 
     * @param scte35Descriptors
     *        The list of SCTE-35 descriptors accompanying the SCTE-35 time_signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte35TimeSignalScheduleActionSettings withScte35Descriptors(java.util.Collection<Scte35Descriptor> scte35Descriptors) {
        setScte35Descriptors(scte35Descriptors);
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
        if (getScte35Descriptors() != null)
            sb.append("Scte35Descriptors: ").append(getScte35Descriptors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35TimeSignalScheduleActionSettings == false)
            return false;
        Scte35TimeSignalScheduleActionSettings other = (Scte35TimeSignalScheduleActionSettings) obj;
        if (other.getScte35Descriptors() == null ^ this.getScte35Descriptors() == null)
            return false;
        if (other.getScte35Descriptors() != null && other.getScte35Descriptors().equals(this.getScte35Descriptors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScte35Descriptors() == null) ? 0 : getScte35Descriptors().hashCode());
        return hashCode;
    }

    @Override
    public Scte35TimeSignalScheduleActionSettings clone() {
        try {
            return (Scte35TimeSignalScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte35TimeSignalScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
