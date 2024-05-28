/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The metadata of the transport stream in the current flow's source.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/TransportMediaInfo" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransportMediaInfo implements Serializable, Cloneable, StructuredPojo {

    /** The list of transport stream programs in the current flow's source. */
    private java.util.List<TransportStreamProgram> programs;

    /**
     * The list of transport stream programs in the current flow's source.
     * 
     * @return The list of transport stream programs in the current flow's source.
     */

    public java.util.List<TransportStreamProgram> getPrograms() {
        return programs;
    }

    /**
     * The list of transport stream programs in the current flow's source.
     * 
     * @param programs
     *        The list of transport stream programs in the current flow's source.
     */

    public void setPrograms(java.util.Collection<TransportStreamProgram> programs) {
        if (programs == null) {
            this.programs = null;
            return;
        }

        this.programs = new java.util.ArrayList<TransportStreamProgram>(programs);
    }

    /**
     * The list of transport stream programs in the current flow's source.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrograms(java.util.Collection)} or {@link #withPrograms(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param programs
     *        The list of transport stream programs in the current flow's source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportMediaInfo withPrograms(TransportStreamProgram... programs) {
        if (this.programs == null) {
            setPrograms(new java.util.ArrayList<TransportStreamProgram>(programs.length));
        }
        for (TransportStreamProgram ele : programs) {
            this.programs.add(ele);
        }
        return this;
    }

    /**
     * The list of transport stream programs in the current flow's source.
     * 
     * @param programs
     *        The list of transport stream programs in the current flow's source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportMediaInfo withPrograms(java.util.Collection<TransportStreamProgram> programs) {
        setPrograms(programs);
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
        if (getPrograms() != null)
            sb.append("Programs: ").append(getPrograms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransportMediaInfo == false)
            return false;
        TransportMediaInfo other = (TransportMediaInfo) obj;
        if (other.getPrograms() == null ^ this.getPrograms() == null)
            return false;
        if (other.getPrograms() != null && other.getPrograms().equals(this.getPrograms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrograms() == null) ? 0 : getPrograms().hashCode());
        return hashCode;
    }

    @Override
    public TransportMediaInfo clone() {
        try {
            return (TransportMediaInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.TransportMediaInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
