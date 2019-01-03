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
 * The amount of utilization, in hours.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/UtilizationByTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtilizationByTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     */
    private java.util.List<ReservationUtilizationGroup> groups;
    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     */
    private ReservationAggregates total;

    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that this utilization was used for.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     * 
     * @return The period of time that this utilization was used for.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The period of time that this utilization was used for.
     * </p>
     * 
     * @param timePeriod
     *        The period of time that this utilization was used for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtilizationByTime withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     * 
     * @return The groups that this utilization result uses.
     */

    public java.util.List<ReservationUtilizationGroup> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     * 
     * @param groups
     *        The groups that this utilization result uses.
     */

    public void setGroups(java.util.Collection<ReservationUtilizationGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<ReservationUtilizationGroup>(groups);
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The groups that this utilization result uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtilizationByTime withGroups(ReservationUtilizationGroup... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<ReservationUtilizationGroup>(groups.length));
        }
        for (ReservationUtilizationGroup ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups that this utilization result uses.
     * </p>
     * 
     * @param groups
     *        The groups that this utilization result uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtilizationByTime withGroups(java.util.Collection<ReservationUtilizationGroup> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     * 
     * @param total
     *        The total number of reservation hours that were used.
     */

    public void setTotal(ReservationAggregates total) {
        this.total = total;
    }

    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     * 
     * @return The total number of reservation hours that were used.
     */

    public ReservationAggregates getTotal() {
        return this.total;
    }

    /**
     * <p>
     * The total number of reservation hours that were used.
     * </p>
     * 
     * @param total
     *        The total number of reservation hours that were used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtilizationByTime withTotal(ReservationAggregates total) {
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

        if (obj instanceof UtilizationByTime == false)
            return false;
        UtilizationByTime other = (UtilizationByTime) obj;
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
    public UtilizationByTime clone() {
        try {
            return (UtilizationByTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.UtilizationByTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
