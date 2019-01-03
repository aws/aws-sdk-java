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
 * The result that is associated with a time period.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/ResultByTime" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResultByTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time period that the result covers.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     */
    private java.util.Map<String, MetricValue> total;
    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     */
    private java.util.List<Group> groups;
    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     */
    private Boolean estimated;

    /**
     * <p>
     * The time period that the result covers.
     * </p>
     * 
     * @param timePeriod
     *        The time period that the result covers.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The time period that the result covers.
     * </p>
     * 
     * @return The time period that the result covers.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The time period that the result covers.
     * </p>
     * 
     * @param timePeriod
     *        The time period that the result covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultByTime withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     * 
     * @return The total amount of cost or usage accrued during the time period.
     */

    public java.util.Map<String, MetricValue> getTotal() {
        return total;
    }

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     * 
     * @param total
     *        The total amount of cost or usage accrued during the time period.
     */

    public void setTotal(java.util.Map<String, MetricValue> total) {
        this.total = total;
    }

    /**
     * <p>
     * The total amount of cost or usage accrued during the time period.
     * </p>
     * 
     * @param total
     *        The total amount of cost or usage accrued during the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultByTime withTotal(java.util.Map<String, MetricValue> total) {
        setTotal(total);
        return this;
    }

    public ResultByTime addTotalEntry(String key, MetricValue value) {
        if (null == this.total) {
            this.total = new java.util.HashMap<String, MetricValue>();
        }
        if (this.total.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.total.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Total.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultByTime clearTotalEntries() {
        this.total = null;
        return this;
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     * 
     * @return The groups that this time period includes.
     */

    public java.util.List<Group> getGroups() {
        return groups;
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     * 
     * @param groups
     *        The groups that this time period includes.
     */

    public void setGroups(java.util.Collection<Group> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new java.util.ArrayList<Group>(groups);
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        The groups that this time period includes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultByTime withGroups(Group... groups) {
        if (this.groups == null) {
            setGroups(new java.util.ArrayList<Group>(groups.length));
        }
        for (Group ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The groups that this time period includes.
     * </p>
     * 
     * @param groups
     *        The groups that this time period includes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultByTime withGroups(java.util.Collection<Group> groups) {
        setGroups(groups);
        return this;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     * 
     * @param estimated
     *        Whether the result is estimated.
     */

    public void setEstimated(Boolean estimated) {
        this.estimated = estimated;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     * 
     * @return Whether the result is estimated.
     */

    public Boolean getEstimated() {
        return this.estimated;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     * 
     * @param estimated
     *        Whether the result is estimated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResultByTime withEstimated(Boolean estimated) {
        setEstimated(estimated);
        return this;
    }

    /**
     * <p>
     * Whether the result is estimated.
     * </p>
     * 
     * @return Whether the result is estimated.
     */

    public Boolean isEstimated() {
        return this.estimated;
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
        if (getTotal() != null)
            sb.append("Total: ").append(getTotal()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups()).append(",");
        if (getEstimated() != null)
            sb.append("Estimated: ").append(getEstimated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResultByTime == false)
            return false;
        ResultByTime other = (ResultByTime) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getTotal() == null ^ this.getTotal() == null)
            return false;
        if (other.getTotal() != null && other.getTotal().equals(this.getTotal()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        if (other.getEstimated() == null ^ this.getEstimated() == null)
            return false;
        if (other.getEstimated() != null && other.getEstimated().equals(this.getEstimated()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getTotal() == null) ? 0 : getTotal().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        hashCode = prime * hashCode + ((getEstimated() == null) ? 0 : getEstimated().hashCode());
        return hashCode;
    }

    @Override
    public ResultByTime clone() {
        try {
            return (ResultByTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.ResultByTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
