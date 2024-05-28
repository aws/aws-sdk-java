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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of queries to retrieve the summary metrics.
     * </p>
     */
    private java.util.List<SummaryMetricQuery> summaryMetricQueries;

    /**
     * <p>
     * The list of queries to retrieve the summary metrics.
     * </p>
     * 
     * @return The list of queries to retrieve the summary metrics.
     */

    public java.util.List<SummaryMetricQuery> getSummaryMetricQueries() {
        return summaryMetricQueries;
    }

    /**
     * <p>
     * The list of queries to retrieve the summary metrics.
     * </p>
     * 
     * @param summaryMetricQueries
     *        The list of queries to retrieve the summary metrics.
     */

    public void setSummaryMetricQueries(java.util.Collection<SummaryMetricQuery> summaryMetricQueries) {
        if (summaryMetricQueries == null) {
            this.summaryMetricQueries = null;
            return;
        }

        this.summaryMetricQueries = new java.util.ArrayList<SummaryMetricQuery>(summaryMetricQueries);
    }

    /**
     * <p>
     * The list of queries to retrieve the summary metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaryMetricQueries(java.util.Collection)} or {@link #withSummaryMetricQueries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param summaryMetricQueries
     *        The list of queries to retrieve the summary metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricsRequest withSummaryMetricQueries(SummaryMetricQuery... summaryMetricQueries) {
        if (this.summaryMetricQueries == null) {
            setSummaryMetricQueries(new java.util.ArrayList<SummaryMetricQuery>(summaryMetricQueries.length));
        }
        for (SummaryMetricQuery ele : summaryMetricQueries) {
            this.summaryMetricQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of queries to retrieve the summary metrics.
     * </p>
     * 
     * @param summaryMetricQueries
     *        The list of queries to retrieve the summary metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricsRequest withSummaryMetricQueries(java.util.Collection<SummaryMetricQuery> summaryMetricQueries) {
        setSummaryMetricQueries(summaryMetricQueries);
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
        if (getSummaryMetricQueries() != null)
            sb.append("SummaryMetricQueries: ").append(getSummaryMetricQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricsRequest == false)
            return false;
        GetMetricsRequest other = (GetMetricsRequest) obj;
        if (other.getSummaryMetricQueries() == null ^ this.getSummaryMetricQueries() == null)
            return false;
        if (other.getSummaryMetricQueries() != null && other.getSummaryMetricQueries().equals(this.getSummaryMetricQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaryMetricQueries() == null) ? 0 : getSummaryMetricQueries().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricsRequest clone() {
        return (GetMetricsRequest) super.clone();
    }

}
