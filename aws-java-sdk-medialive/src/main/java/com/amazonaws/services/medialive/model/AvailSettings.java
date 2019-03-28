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
 * Avail Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AvailSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailSettings implements Serializable, Cloneable, StructuredPojo {

    private Scte35SpliceInsert scte35SpliceInsert;

    private Scte35TimeSignalApos scte35TimeSignalApos;

    /**
     * @param scte35SpliceInsert
     */

    public void setScte35SpliceInsert(Scte35SpliceInsert scte35SpliceInsert) {
        this.scte35SpliceInsert = scte35SpliceInsert;
    }

    /**
     * @return
     */

    public Scte35SpliceInsert getScte35SpliceInsert() {
        return this.scte35SpliceInsert;
    }

    /**
     * @param scte35SpliceInsert
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailSettings withScte35SpliceInsert(Scte35SpliceInsert scte35SpliceInsert) {
        setScte35SpliceInsert(scte35SpliceInsert);
        return this;
    }

    /**
     * @param scte35TimeSignalApos
     */

    public void setScte35TimeSignalApos(Scte35TimeSignalApos scte35TimeSignalApos) {
        this.scte35TimeSignalApos = scte35TimeSignalApos;
    }

    /**
     * @return
     */

    public Scte35TimeSignalApos getScte35TimeSignalApos() {
        return this.scte35TimeSignalApos;
    }

    /**
     * @param scte35TimeSignalApos
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailSettings withScte35TimeSignalApos(Scte35TimeSignalApos scte35TimeSignalApos) {
        setScte35TimeSignalApos(scte35TimeSignalApos);
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
        if (getScte35SpliceInsert() != null)
            sb.append("Scte35SpliceInsert: ").append(getScte35SpliceInsert()).append(",");
        if (getScte35TimeSignalApos() != null)
            sb.append("Scte35TimeSignalApos: ").append(getScte35TimeSignalApos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailSettings == false)
            return false;
        AvailSettings other = (AvailSettings) obj;
        if (other.getScte35SpliceInsert() == null ^ this.getScte35SpliceInsert() == null)
            return false;
        if (other.getScte35SpliceInsert() != null && other.getScte35SpliceInsert().equals(this.getScte35SpliceInsert()) == false)
            return false;
        if (other.getScte35TimeSignalApos() == null ^ this.getScte35TimeSignalApos() == null)
            return false;
        if (other.getScte35TimeSignalApos() != null && other.getScte35TimeSignalApos().equals(this.getScte35TimeSignalApos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScte35SpliceInsert() == null) ? 0 : getScte35SpliceInsert().hashCode());
        hashCode = prime * hashCode + ((getScte35TimeSignalApos() == null) ? 0 : getScte35TimeSignalApos().hashCode());
        return hashCode;
    }

    @Override
    public AvailSettings clone() {
        try {
            return (AvailSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AvailSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
