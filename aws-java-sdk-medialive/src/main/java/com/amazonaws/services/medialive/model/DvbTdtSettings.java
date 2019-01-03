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
 * DVB Time and Date Table (SDT)
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DvbTdtSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DvbTdtSettings implements Serializable, Cloneable, StructuredPojo {

    /** The number of milliseconds between instances of this table in the output transport stream. */
    private Integer repInterval;

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param repInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     */

    public void setRepInterval(Integer repInterval) {
        this.repInterval = repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @return The number of milliseconds between instances of this table in the output transport stream.
     */

    public Integer getRepInterval() {
        return this.repInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output transport stream.
     * 
     * @param repInterval
     *        The number of milliseconds between instances of this table in the output transport stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DvbTdtSettings withRepInterval(Integer repInterval) {
        setRepInterval(repInterval);
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
        if (getRepInterval() != null)
            sb.append("RepInterval: ").append(getRepInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DvbTdtSettings == false)
            return false;
        DvbTdtSettings other = (DvbTdtSettings) obj;
        if (other.getRepInterval() == null ^ this.getRepInterval() == null)
            return false;
        if (other.getRepInterval() != null && other.getRepInterval().equals(this.getRepInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepInterval() == null) ? 0 : getRepInterval().hashCode());
        return hashCode;
    }

    @Override
    public DvbTdtSettings clone() {
        try {
            return (DvbTdtSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.DvbTdtSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
