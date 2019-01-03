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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reservation coverage for a specified period, in hours.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CoverageByTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageByTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     */
    private java.util.List<ReservationCoverageGroup> groups;
    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     */
    private Coverage total;

    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     * 
     * @param timePeriod
     *        The period that this coverage was used over.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     * 
     * @return The period that this coverage was used over.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The period that this coverage was used over.
     * </p>
     * 
     * @param timePeriod
     *        The period that this coverage was used over.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageByTime withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     * 
     * @return The groups of instances that the reservation covered.
     */

    public java.util.List<ReservationCoverageGroup> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     * 
     * @param groups
     *        The groups of instances that the reservation covered.
     */

    public void setGroups(java.util.Collection<ReservationCoverageGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<ReservationCoverageGroup>(groups);
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The groups of instances that the reservation covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageByTime withGroups(ReservationCoverageGroup... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<ReservationCoverageGroup>(groups.length));
        }
        for (ReservationCoverageGroup ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups of instances that the reservation covered.
     * </p>
     * 
     * @param groups
     *        The groups of instances that the reservation covered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageByTime withGroups(java.util.Collection<ReservationCoverageGroup> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     * 
     * @param total
     *        The total reservation coverage, in hours.
     */

    public void setTotal(Coverage total) {
        this.total = total;
    }

    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     * 
     * @return The total reservation coverage, in hours.
     */

    public Coverage getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total reservation coverage, in hours.
     * </p>
     * 
     * @param total
     *        The total reservation coverage, in hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageByTime withTotal(Coverage total) {
        setTotal(total);
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
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageByTime == false)
            return false;
        CoverageByTime other = (CoverageByTime) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        return hashCode;
    }

    @Override
    public CoverageByTime clone() {
        try {
            return (CoverageByTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CoverageByTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
