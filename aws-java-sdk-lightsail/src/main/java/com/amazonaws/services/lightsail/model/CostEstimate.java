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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the estimated cost for resources in your Lightsail for Research account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CostEstimate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostEstimate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The types of usage that are included in the estimate, such as costs, usage, or data transfer.
     * </p>
     */
    private String usageType;
    /**
     * <p>
     * The cost estimate result that's associated with a time period.
     * </p>
     */
    private java.util.List<EstimateByTime> resultsByTime;

    /**
     * <p>
     * The types of usage that are included in the estimate, such as costs, usage, or data transfer.
     * </p>
     * 
     * @param usageType
     *        The types of usage that are included in the estimate, such as costs, usage, or data transfer.
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The types of usage that are included in the estimate, such as costs, usage, or data transfer.
     * </p>
     * 
     * @return The types of usage that are included in the estimate, such as costs, usage, or data transfer.
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The types of usage that are included in the estimate, such as costs, usage, or data transfer.
     * </p>
     * 
     * @param usageType
     *        The types of usage that are included in the estimate, such as costs, usage, or data transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostEstimate withUsageType(String usageType) {
        setUsageType(usageType);
        return this;
    }

    /**
     * <p>
     * The cost estimate result that's associated with a time period.
     * </p>
     * 
     * @return The cost estimate result that's associated with a time period.
     */

    public java.util.List<EstimateByTime> getResultsByTime() {
        return resultsByTime;
    }

    /**
     * <p>
     * The cost estimate result that's associated with a time period.
     * </p>
     * 
     * @param resultsByTime
     *        The cost estimate result that's associated with a time period.
     */

    public void setResultsByTime(java.util.Collection<EstimateByTime> resultsByTime) {
        if (resultsByTime == null) {
            this.resultsByTime = null;
            return;
        }

        this.resultsByTime = new java.util.ArrayList<EstimateByTime>(resultsByTime);
    }

    /**
     * <p>
     * The cost estimate result that's associated with a time period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResultsByTime(java.util.Collection)} or {@link #withResultsByTime(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resultsByTime
     *        The cost estimate result that's associated with a time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostEstimate withResultsByTime(EstimateByTime... resultsByTime) {
        if (this.resultsByTime == null) {
            setResultsByTime(new java.util.ArrayList<EstimateByTime>(resultsByTime.length));
        }
        for (EstimateByTime ele : resultsByTime) {
            this.resultsByTime.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cost estimate result that's associated with a time period.
     * </p>
     * 
     * @param resultsByTime
     *        The cost estimate result that's associated with a time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostEstimate withResultsByTime(java.util.Collection<EstimateByTime> resultsByTime) {
        setResultsByTime(resultsByTime);
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
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType()).append(",");
        if (getResultsByTime() != null)
            sb.append("ResultsByTime: ").append(getResultsByTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostEstimate == false)
            return false;
        CostEstimate other = (CostEstimate) obj;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        if (other.getResultsByTime() == null ^ this.getResultsByTime() == null)
            return false;
        if (other.getResultsByTime() != null && other.getResultsByTime().equals(this.getResultsByTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        hashCode = prime * hashCode + ((getResultsByTime() == null) ? 0 : getResultsByTime().hashCode());
        return hashCode;
    }

    @Override
    public CostEstimate clone() {
        try {
            return (CostEstimate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.CostEstimateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
