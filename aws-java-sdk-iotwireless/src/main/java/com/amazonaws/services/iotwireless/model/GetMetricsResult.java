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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of summary metrics that were retrieved.
     * </p>
     */
    private java.util.List<SummaryMetricQueryResult> summaryMetricQueryResults;

    /**
     * <p>
     * The list of summary metrics that were retrieved.
     * </p>
     * 
     * @return The list of summary metrics that were retrieved.
     */

    public java.util.List<SummaryMetricQueryResult> getSummaryMetricQueryResults() {
        return summaryMetricQueryResults;
    }

    /**
     * <p>
     * The list of summary metrics that were retrieved.
     * </p>
     * 
     * @param summaryMetricQueryResults
     *        The list of summary metrics that were retrieved.
     */

    public void setSummaryMetricQueryResults(java.util.Collection<SummaryMetricQueryResult> summaryMetricQueryResults) {
        if (summaryMetricQueryResults == null) {
            this.summaryMetricQueryResults = null;
            return;
        }

        this.summaryMetricQueryResults = new java.util.ArrayList<SummaryMetricQueryResult>(summaryMetricQueryResults);
    }

    /**
     * <p>
     * The list of summary metrics that were retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSummaryMetricQueryResults(java.util.Collection)} or
     * {@link #withSummaryMetricQueryResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param summaryMetricQueryResults
     *        The list of summary metrics that were retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricsResult withSummaryMetricQueryResults(SummaryMetricQueryResult... summaryMetricQueryResults) {
        if (this.summaryMetricQueryResults == null) {
            setSummaryMetricQueryResults(new java.util.ArrayList<SummaryMetricQueryResult>(summaryMetricQueryResults.length));
        }
        for (SummaryMetricQueryResult ele : summaryMetricQueryResults) {
            this.summaryMetricQueryResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of summary metrics that were retrieved.
     * </p>
     * 
     * @param summaryMetricQueryResults
     *        The list of summary metrics that were retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricsResult withSummaryMetricQueryResults(java.util.Collection<SummaryMetricQueryResult> summaryMetricQueryResults) {
        setSummaryMetricQueryResults(summaryMetricQueryResults);
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
        if (getSummaryMetricQueryResults() != null)
            sb.append("SummaryMetricQueryResults: ").append(getSummaryMetricQueryResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricsResult == false)
            return false;
        GetMetricsResult other = (GetMetricsResult) obj;
        if (other.getSummaryMetricQueryResults() == null ^ this.getSummaryMetricQueryResults() == null)
            return false;
        if (other.getSummaryMetricQueryResults() != null && other.getSummaryMetricQueryResults().equals(this.getSummaryMetricQueryResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaryMetricQueryResults() == null) ? 0 : getSummaryMetricQueryResults().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricsResult clone() {
        try {
            return (GetMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
