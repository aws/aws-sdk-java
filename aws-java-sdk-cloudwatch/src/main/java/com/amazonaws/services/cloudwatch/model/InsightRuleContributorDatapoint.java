/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * One data point related to one contributor.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetInsightRuleReport.html"
 * >GetInsightRuleReport</a> and <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_InsightRuleContributor.html"
 * >InsightRuleContributor</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/InsightRuleContributorDatapoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightRuleContributorDatapoint implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The approximate value that this contributor added during this timestamp.
     * </p>
     */
    private Double approximateValue;

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the data point.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     * 
     * @return The timestamp of the data point.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleContributorDatapoint withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The approximate value that this contributor added during this timestamp.
     * </p>
     * 
     * @param approximateValue
     *        The approximate value that this contributor added during this timestamp.
     */

    public void setApproximateValue(Double approximateValue) {
        this.approximateValue = approximateValue;
    }

    /**
     * <p>
     * The approximate value that this contributor added during this timestamp.
     * </p>
     * 
     * @return The approximate value that this contributor added during this timestamp.
     */

    public Double getApproximateValue() {
        return this.approximateValue;
    }

    /**
     * <p>
     * The approximate value that this contributor added during this timestamp.
     * </p>
     * 
     * @param approximateValue
     *        The approximate value that this contributor added during this timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleContributorDatapoint withApproximateValue(Double approximateValue) {
        setApproximateValue(approximateValue);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getApproximateValue() != null)
            sb.append("ApproximateValue: ").append(getApproximateValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightRuleContributorDatapoint == false)
            return false;
        InsightRuleContributorDatapoint other = (InsightRuleContributorDatapoint) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getApproximateValue() == null ^ this.getApproximateValue() == null)
            return false;
        if (other.getApproximateValue() != null && other.getApproximateValue().equals(this.getApproximateValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getApproximateValue() == null) ? 0 : getApproximateValue().hashCode());
        return hashCode;
    }

    @Override
    public InsightRuleContributorDatapoint clone() {
        try {
            return (InsightRuleContributorDatapoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
