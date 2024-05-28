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
 * Assigns Athena workgroups (and hence their queries) to capacity reservations. A capacity reservation can have only
 * one capacity assignment configuration, but the capacity assignment configuration can be made up of multiple
 * individual assignments. Each assignment specifies how Athena queries can consume capacity from the capacity
 * reservation that their workgroup is mapped to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/CapacityAssignmentConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityAssignmentConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the reservation that the capacity assignment configuration is for.
     * </p>
     */
    private String capacityReservationName;
    /**
     * <p>
     * The list of assignments that make up the capacity assignment configuration.
     * </p>
     */
    private java.util.List<CapacityAssignment> capacityAssignments;

    /**
     * <p>
     * The name of the reservation that the capacity assignment configuration is for.
     * </p>
     * 
     * @param capacityReservationName
     *        The name of the reservation that the capacity assignment configuration is for.
     */

    public void setCapacityReservationName(String capacityReservationName) {
        this.capacityReservationName = capacityReservationName;
    }

    /**
     * <p>
     * The name of the reservation that the capacity assignment configuration is for.
     * </p>
     * 
     * @return The name of the reservation that the capacity assignment configuration is for.
     */

    public String getCapacityReservationName() {
        return this.capacityReservationName;
    }

    /**
     * <p>
     * The name of the reservation that the capacity assignment configuration is for.
     * </p>
     * 
     * @param capacityReservationName
     *        The name of the reservation that the capacity assignment configuration is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAssignmentConfiguration withCapacityReservationName(String capacityReservationName) {
        setCapacityReservationName(capacityReservationName);
        return this;
    }

    /**
     * <p>
     * The list of assignments that make up the capacity assignment configuration.
     * </p>
     * 
     * @return The list of assignments that make up the capacity assignment configuration.
     */

    public java.util.List<CapacityAssignment> getCapacityAssignments() {
        return capacityAssignments;
    }

    /**
     * <p>
     * The list of assignments that make up the capacity assignment configuration.
     * </p>
     * 
     * @param capacityAssignments
     *        The list of assignments that make up the capacity assignment configuration.
     */

    public void setCapacityAssignments(java.util.Collection<CapacityAssignment> capacityAssignments) {
        if (capacityAssignments == null) {
            this.capacityAssignments = null;
            return;
        }

        this.capacityAssignments = new java.util.ArrayList<CapacityAssignment>(capacityAssignments);
    }

    /**
     * <p>
     * The list of assignments that make up the capacity assignment configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityAssignments(java.util.Collection)} or {@link #withCapacityAssignments(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param capacityAssignments
     *        The list of assignments that make up the capacity assignment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAssignmentConfiguration withCapacityAssignments(CapacityAssignment... capacityAssignments) {
        if (this.capacityAssignments == null) {
            setCapacityAssignments(new java.util.ArrayList<CapacityAssignment>(capacityAssignments.length));
        }
        for (CapacityAssignment ele : capacityAssignments) {
            this.capacityAssignments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of assignments that make up the capacity assignment configuration.
     * </p>
     * 
     * @param capacityAssignments
     *        The list of assignments that make up the capacity assignment configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityAssignmentConfiguration withCapacityAssignments(java.util.Collection<CapacityAssignment> capacityAssignments) {
        setCapacityAssignments(capacityAssignments);
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
        if (getCapacityReservationName() != null)
            sb.append("CapacityReservationName: ").append(getCapacityReservationName()).append(",");
        if (getCapacityAssignments() != null)
            sb.append("CapacityAssignments: ").append(getCapacityAssignments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityAssignmentConfiguration == false)
            return false;
        CapacityAssignmentConfiguration other = (CapacityAssignmentConfiguration) obj;
        if (other.getCapacityReservationName() == null ^ this.getCapacityReservationName() == null)
            return false;
        if (other.getCapacityReservationName() != null && other.getCapacityReservationName().equals(this.getCapacityReservationName()) == false)
            return false;
        if (other.getCapacityAssignments() == null ^ this.getCapacityAssignments() == null)
            return false;
        if (other.getCapacityAssignments() != null && other.getCapacityAssignments().equals(this.getCapacityAssignments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationName() == null) ? 0 : getCapacityReservationName().hashCode());
        hashCode = prime * hashCode + ((getCapacityAssignments() == null) ? 0 : getCapacityAssignments().hashCode());
        return hashCode;
    }

    @Override
    public CapacityAssignmentConfiguration clone() {
        try {
            return (CapacityAssignmentConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.athena.model.transform.CapacityAssignmentConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
