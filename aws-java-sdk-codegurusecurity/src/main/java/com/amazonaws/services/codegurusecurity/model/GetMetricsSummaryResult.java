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
package com.amazonaws.services.codegurusecurity.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-security-2018-05-10/GetMetricsSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricsSummaryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summary metrics from the specified date.
     * </p>
     */
    private MetricsSummary metricsSummary;

    /**
     * <p>
     * The summary metrics from the specified date.
     * </p>
     * 
     * @param metricsSummary
     *        The summary metrics from the specified date.
     */

    public void setMetricsSummary(MetricsSummary metricsSummary) {
        this.metricsSummary = metricsSummary;
    }

    /**
     * <p>
     * The summary metrics from the specified date.
     * </p>
     * 
     * @return The summary metrics from the specified date.
     */

    public MetricsSummary getMetricsSummary() {
        return this.metricsSummary;
    }

    /**
     * <p>
     * The summary metrics from the specified date.
     * </p>
     * 
     * @param metricsSummary
     *        The summary metrics from the specified date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricsSummaryResult withMetricsSummary(MetricsSummary metricsSummary) {
        setMetricsSummary(metricsSummary);
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
        if (getMetricsSummary() != null)
            sb.append("MetricsSummary: ").append(getMetricsSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricsSummaryResult == false)
            return false;
        GetMetricsSummaryResult other = (GetMetricsSummaryResult) obj;
        if (other.getMetricsSummary() == null ^ this.getMetricsSummary() == null)
            return false;
        if (other.getMetricsSummary() != null && other.getMetricsSummary().equals(this.getMetricsSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricsSummary() == null) ? 0 : getMetricsSummary().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricsSummaryResult clone() {
        try {
            return (GetMetricsSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
