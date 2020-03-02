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
 * One of the unique contributors found by a Contributor Insights rule. If the rule contains multiple keys, then a
 * unique contributor is a unique combination of values from all the keys in the rule.
 * </p>
 * <p>
 * If the rule contains a single key, then each unique contributor is each unique value for this key.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetInsightRuleReport.html"
 * >GetInsightRuleReport</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/InsightRuleContributor" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightRuleContributor implements Serializable, Cloneable {

    /**
     * <p>
     * One of the log entry field keywords that is used to define contributors for this rule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> keys;
    /**
     * <p>
     * An approximation of the aggregate value that comes from this contributor.
     * </p>
     */
    private Double approximateAggregateValue;
    /**
     * <p>
     * An array of the data points where this contributor is present. Only the data points when this contributor
     * appeared are included in the array.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InsightRuleContributorDatapoint> datapoints;

    /**
     * <p>
     * One of the log entry field keywords that is used to define contributors for this rule.
     * </p>
     * 
     * @return One of the log entry field keywords that is used to define contributors for this rule.
     */

    public java.util.List<String> getKeys() {
        if (keys == null) {
            keys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return keys;
    }

    /**
     * <p>
     * One of the log entry field keywords that is used to define contributors for this rule.
     * </p>
     * 
     * @param keys
     *        One of the log entry field keywords that is used to define contributors for this rule.
     */

    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new com.amazonaws.internal.SdkInternalList<String>(keys);
    }

    /**
     * <p>
     * One of the log entry field keywords that is used to define contributors for this rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        One of the log entry field keywords that is used to define contributors for this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleContributor withKeys(String... keys) {
        if (this.keys == null) {
            setKeys(new com.amazonaws.internal.SdkInternalList<String>(keys.length));
        }
        for (String ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One of the log entry field keywords that is used to define contributors for this rule.
     * </p>
     * 
     * @param keys
     *        One of the log entry field keywords that is used to define contributors for this rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleContributor withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * An approximation of the aggregate value that comes from this contributor.
     * </p>
     * 
     * @param approximateAggregateValue
     *        An approximation of the aggregate value that comes from this contributor.
     */

    public void setApproximateAggregateValue(Double approximateAggregateValue) {
        this.approximateAggregateValue = approximateAggregateValue;
    }

    /**
     * <p>
     * An approximation of the aggregate value that comes from this contributor.
     * </p>
     * 
     * @return An approximation of the aggregate value that comes from this contributor.
     */

    public Double getApproximateAggregateValue() {
        return this.approximateAggregateValue;
    }

    /**
     * <p>
     * An approximation of the aggregate value that comes from this contributor.
     * </p>
     * 
     * @param approximateAggregateValue
     *        An approximation of the aggregate value that comes from this contributor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleContributor withApproximateAggregateValue(Double approximateAggregateValue) {
        setApproximateAggregateValue(approximateAggregateValue);
        return this;
    }

    /**
     * <p>
     * An array of the data points where this contributor is present. Only the data points when this contributor
     * appeared are included in the array.
     * </p>
     * 
     * @return An array of the data points where this contributor is present. Only the data points when this contributor
     *         appeared are included in the array.
     */

    public java.util.List<InsightRuleContributorDatapoint> getDatapoints() {
        if (datapoints == null) {
            datapoints = new com.amazonaws.internal.SdkInternalList<InsightRuleContributorDatapoint>();
        }
        return datapoints;
    }

    /**
     * <p>
     * An array of the data points where this contributor is present. Only the data points when this contributor
     * appeared are included in the array.
     * </p>
     * 
     * @param datapoints
     *        An array of the data points where this contributor is present. Only the data points when this contributor
     *        appeared are included in the array.
     */

    public void setDatapoints(java.util.Collection<InsightRuleContributorDatapoint> datapoints) {
        if (datapoints == null) {
            this.datapoints = null;
            return;
        }

        this.datapoints = new com.amazonaws.internal.SdkInternalList<InsightRuleContributorDatapoint>(datapoints);
    }

    /**
     * <p>
     * An array of the data points where this contributor is present. Only the data points when this contributor
     * appeared are included in the array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatapoints(java.util.Collection)} or {@link #withDatapoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param datapoints
     *        An array of the data points where this contributor is present. Only the data points when this contributor
     *        appeared are included in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleContributor withDatapoints(InsightRuleContributorDatapoint... datapoints) {
        if (this.datapoints == null) {
            setDatapoints(new com.amazonaws.internal.SdkInternalList<InsightRuleContributorDatapoint>(datapoints.length));
        }
        for (InsightRuleContributorDatapoint ele : datapoints) {
            this.datapoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the data points where this contributor is present. Only the data points when this contributor
     * appeared are included in the array.
     * </p>
     * 
     * @param datapoints
     *        An array of the data points where this contributor is present. Only the data points when this contributor
     *        appeared are included in the array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleContributor withDatapoints(java.util.Collection<InsightRuleContributorDatapoint> datapoints) {
        setDatapoints(datapoints);
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
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getApproximateAggregateValue() != null)
            sb.append("ApproximateAggregateValue: ").append(getApproximateAggregateValue()).append(",");
        if (getDatapoints() != null)
            sb.append("Datapoints: ").append(getDatapoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightRuleContributor == false)
            return false;
        InsightRuleContributor other = (InsightRuleContributor) obj;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getApproximateAggregateValue() == null ^ this.getApproximateAggregateValue() == null)
            return false;
        if (other.getApproximateAggregateValue() != null && other.getApproximateAggregateValue().equals(this.getApproximateAggregateValue()) == false)
            return false;
        if (other.getDatapoints() == null ^ this.getDatapoints() == null)
            return false;
        if (other.getDatapoints() != null && other.getDatapoints().equals(this.getDatapoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getApproximateAggregateValue() == null) ? 0 : getApproximateAggregateValue().hashCode());
        hashCode = prime * hashCode + ((getDatapoints() == null) ? 0 : getDatapoints().hashCode());
        return hashCode;
    }

    @Override
    public InsightRuleContributor clone() {
        try {
            return (InsightRuleContributor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
