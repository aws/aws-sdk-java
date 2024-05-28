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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the performance metrics to use for the server that is used for recommendations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageMetricBasis implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A utilization metric that is used by the recommendations.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the percentage of the specified utilization metric that is used by the recommendations.
     * </p>
     */
    private Double percentageAdjust;

    /**
     * <p>
     * A utilization metric that is used by the recommendations.
     * </p>
     * 
     * @param name
     *        A utilization metric that is used by the recommendations.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A utilization metric that is used by the recommendations.
     * </p>
     * 
     * @return A utilization metric that is used by the recommendations.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A utilization metric that is used by the recommendations.
     * </p>
     * 
     * @param name
     *        A utilization metric that is used by the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageMetricBasis withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the percentage of the specified utilization metric that is used by the recommendations.
     * </p>
     * 
     * @param percentageAdjust
     *        Specifies the percentage of the specified utilization metric that is used by the recommendations.
     */

    public void setPercentageAdjust(Double percentageAdjust) {
        this.percentageAdjust = percentageAdjust;
    }

    /**
     * <p>
     * Specifies the percentage of the specified utilization metric that is used by the recommendations.
     * </p>
     * 
     * @return Specifies the percentage of the specified utilization metric that is used by the recommendations.
     */

    public Double getPercentageAdjust() {
        return this.percentageAdjust;
    }

    /**
     * <p>
     * Specifies the percentage of the specified utilization metric that is used by the recommendations.
     * </p>
     * 
     * @param percentageAdjust
     *        Specifies the percentage of the specified utilization metric that is used by the recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageMetricBasis withPercentageAdjust(Double percentageAdjust) {
        setPercentageAdjust(percentageAdjust);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPercentageAdjust() != null)
            sb.append("PercentageAdjust: ").append(getPercentageAdjust());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageMetricBasis == false)
            return false;
        UsageMetricBasis other = (UsageMetricBasis) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPercentageAdjust() == null ^ this.getPercentageAdjust() == null)
            return false;
        if (other.getPercentageAdjust() != null && other.getPercentageAdjust().equals(this.getPercentageAdjust()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPercentageAdjust() == null) ? 0 : getPercentageAdjust().hashCode());
        return hashCode;
    }

    @Override
    public UsageMetricBasis clone() {
        try {
            return (UsageMetricBasis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.UsageMetricBasisMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
