/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupSummaries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomalyGroupSummariesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of anomaly group summaries.
     * </p>
     */
    private java.util.List<AnomalyGroupSummary> anomalyGroupSummaryList;
    /**
     * <p>
     * Aggregated details about the anomaly groups.
     * </p>
     */
    private AnomalyGroupStatistics anomalyGroupStatistics;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of anomaly group summaries.
     * </p>
     * 
     * @return A list of anomaly group summaries.
     */

    public java.util.List<AnomalyGroupSummary> getAnomalyGroupSummaryList() {
        return anomalyGroupSummaryList;
    }

    /**
     * <p>
     * A list of anomaly group summaries.
     * </p>
     * 
     * @param anomalyGroupSummaryList
     *        A list of anomaly group summaries.
     */

    public void setAnomalyGroupSummaryList(java.util.Collection<AnomalyGroupSummary> anomalyGroupSummaryList) {
        if (anomalyGroupSummaryList == null) {
            this.anomalyGroupSummaryList = null;
            return;
        }

        this.anomalyGroupSummaryList = new java.util.ArrayList<AnomalyGroupSummary>(anomalyGroupSummaryList);
    }

    /**
     * <p>
     * A list of anomaly group summaries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalyGroupSummaryList(java.util.Collection)} or
     * {@link #withAnomalyGroupSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param anomalyGroupSummaryList
     *        A list of anomaly group summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupSummariesResult withAnomalyGroupSummaryList(AnomalyGroupSummary... anomalyGroupSummaryList) {
        if (this.anomalyGroupSummaryList == null) {
            setAnomalyGroupSummaryList(new java.util.ArrayList<AnomalyGroupSummary>(anomalyGroupSummaryList.length));
        }
        for (AnomalyGroupSummary ele : anomalyGroupSummaryList) {
            this.anomalyGroupSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of anomaly group summaries.
     * </p>
     * 
     * @param anomalyGroupSummaryList
     *        A list of anomaly group summaries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupSummariesResult withAnomalyGroupSummaryList(java.util.Collection<AnomalyGroupSummary> anomalyGroupSummaryList) {
        setAnomalyGroupSummaryList(anomalyGroupSummaryList);
        return this;
    }

    /**
     * <p>
     * Aggregated details about the anomaly groups.
     * </p>
     * 
     * @param anomalyGroupStatistics
     *        Aggregated details about the anomaly groups.
     */

    public void setAnomalyGroupStatistics(AnomalyGroupStatistics anomalyGroupStatistics) {
        this.anomalyGroupStatistics = anomalyGroupStatistics;
    }

    /**
     * <p>
     * Aggregated details about the anomaly groups.
     * </p>
     * 
     * @return Aggregated details about the anomaly groups.
     */

    public AnomalyGroupStatistics getAnomalyGroupStatistics() {
        return this.anomalyGroupStatistics;
    }

    /**
     * <p>
     * Aggregated details about the anomaly groups.
     * </p>
     * 
     * @param anomalyGroupStatistics
     *        Aggregated details about the anomaly groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupSummariesResult withAnomalyGroupStatistics(AnomalyGroupStatistics anomalyGroupStatistics) {
        setAnomalyGroupStatistics(anomalyGroupStatistics);
        return this;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupSummariesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAnomalyGroupSummaryList() != null)
            sb.append("AnomalyGroupSummaryList: ").append(getAnomalyGroupSummaryList()).append(",");
        if (getAnomalyGroupStatistics() != null)
            sb.append("AnomalyGroupStatistics: ").append(getAnomalyGroupStatistics()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnomalyGroupSummariesResult == false)
            return false;
        ListAnomalyGroupSummariesResult other = (ListAnomalyGroupSummariesResult) obj;
        if (other.getAnomalyGroupSummaryList() == null ^ this.getAnomalyGroupSummaryList() == null)
            return false;
        if (other.getAnomalyGroupSummaryList() != null && other.getAnomalyGroupSummaryList().equals(this.getAnomalyGroupSummaryList()) == false)
            return false;
        if (other.getAnomalyGroupStatistics() == null ^ this.getAnomalyGroupStatistics() == null)
            return false;
        if (other.getAnomalyGroupStatistics() != null && other.getAnomalyGroupStatistics().equals(this.getAnomalyGroupStatistics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyGroupSummaryList() == null) ? 0 : getAnomalyGroupSummaryList().hashCode());
        hashCode = prime * hashCode + ((getAnomalyGroupStatistics() == null) ? 0 : getAnomalyGroupStatistics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomalyGroupSummariesResult clone() {
        try {
            return (ListAnomalyGroupSummariesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
