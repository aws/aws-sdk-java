/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeMetricAttribution"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetricAttributionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the metric attribution.
     * </p>
     */
    private MetricAttribution metricAttribution;

    /**
     * <p>
     * The details of the metric attribution.
     * </p>
     * 
     * @param metricAttribution
     *        The details of the metric attribution.
     */

    public void setMetricAttribution(MetricAttribution metricAttribution) {
        this.metricAttribution = metricAttribution;
    }

    /**
     * <p>
     * The details of the metric attribution.
     * </p>
     * 
     * @return The details of the metric attribution.
     */

    public MetricAttribution getMetricAttribution() {
        return this.metricAttribution;
    }

    /**
     * <p>
     * The details of the metric attribution.
     * </p>
     * 
     * @param metricAttribution
     *        The details of the metric attribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricAttributionResult withMetricAttribution(MetricAttribution metricAttribution) {
        setMetricAttribution(metricAttribution);
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
        if (getMetricAttribution() != null)
            sb.append("MetricAttribution: ").append(getMetricAttribution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMetricAttributionResult == false)
            return false;
        DescribeMetricAttributionResult other = (DescribeMetricAttributionResult) obj;
        if (other.getMetricAttribution() == null ^ this.getMetricAttribution() == null)
            return false;
        if (other.getMetricAttribution() != null && other.getMetricAttribution().equals(this.getMetricAttribution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricAttribution() == null) ? 0 : getMetricAttribution().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMetricAttributionResult clone() {
        try {
            return (DescribeMetricAttributionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
