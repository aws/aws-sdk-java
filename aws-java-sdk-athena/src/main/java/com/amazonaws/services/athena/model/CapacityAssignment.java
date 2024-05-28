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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A mapping between one or more workgroups and a capacity reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CapacityAssignment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityAssignment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of workgroup names for the capacity assignment.
     * </p>
     */
    private java.util.List<String> workGroupNames;

    /**
     * <p>
     * The list of workgroup names for the capacity assignment.
     * </p>
     * 
     * @return The list of workgroup names for the capacity assignment.
     */

    public java.util.List<String> getWorkGroupNames() {
        return workGroupNames;
    }

    /**
     * <p>
     * The list of workgroup names for the capacity assignment.
     * </p>
     * 
     * @param workGroupNames
     *        The list of workgroup names for the capacity assignment.
     */

    public void setWorkGroupNames(java.util.Collection<String> workGroupNames) {
        if (workGroupNames == null) {
            this.workGroupNames = null;
            return;
        }

        this.workGroupNames = new java.util.ArrayList<String>(workGroupNames);
    }

    /**
     * <p>
     * The list of workgroup names for the capacity assignment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWorkGroupNames(java.util.Collection)} or {@link #withWorkGroupNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param workGroupNames
     *        The list of workgroup names for the capacity assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAssignment withWorkGroupNames(String... workGroupNames) {
        if (this.workGroupNames == null) {
            setWorkGroupNames(new java.util.ArrayList<String>(workGroupNames.length));
        }
        for (String ele : workGroupNames) {
            this.workGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of workgroup names for the capacity assignment.
     * </p>
     * 
     * @param workGroupNames
     *        The list of workgroup names for the capacity assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAssignment withWorkGroupNames(java.util.Collection<String> workGroupNames) {
        setWorkGroupNames(workGroupNames);
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
        if (getWorkGroupNames() != null)
            sb.append("WorkGroupNames: ").append(getWorkGroupNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityAssignment == false)
            return false;
        CapacityAssignment other = (CapacityAssignment) obj;
        if (other.getWorkGroupNames() == null ^ this.getWorkGroupNames() == null)
            return false;
        if (other.getWorkGroupNames() != null && other.getWorkGroupNames().equals(this.getWorkGroupNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkGroupNames() == null) ? 0 : getWorkGroupNames().hashCode());
        return hashCode;
    }

    @Override
    public CapacityAssignment clone() {
        try {
            return (CapacityAssignment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CapacityAssignmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
