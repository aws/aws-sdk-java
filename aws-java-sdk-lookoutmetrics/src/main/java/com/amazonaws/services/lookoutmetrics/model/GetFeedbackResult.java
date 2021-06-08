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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFeedbackResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Feedback for an anomalous metric.
     * </p>
     */
    private java.util.List<TimeSeriesFeedback> anomalyGroupTimeSeriesFeedback;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Feedback for an anomalous metric.
     * </p>
     * 
     * @return Feedback for an anomalous metric.
     */

    public java.util.List<TimeSeriesFeedback> getAnomalyGroupTimeSeriesFeedback() {
        return anomalyGroupTimeSeriesFeedback;
    }

    /**
     * <p>
     * Feedback for an anomalous metric.
     * </p>
     * 
     * @param anomalyGroupTimeSeriesFeedback
     *        Feedback for an anomalous metric.
     */

    public void setAnomalyGroupTimeSeriesFeedback(java.util.Collection<TimeSeriesFeedback> anomalyGroupTimeSeriesFeedback) {
        if (anomalyGroupTimeSeriesFeedback == null) {
            this.anomalyGroupTimeSeriesFeedback = null;
            return;
        }

        this.anomalyGroupTimeSeriesFeedback = new java.util.ArrayList<TimeSeriesFeedback>(anomalyGroupTimeSeriesFeedback);
    }

    /**
     * <p>
     * Feedback for an anomalous metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalyGroupTimeSeriesFeedback(java.util.Collection)} or
     * {@link #withAnomalyGroupTimeSeriesFeedback(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param anomalyGroupTimeSeriesFeedback
     *        Feedback for an anomalous metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFeedbackResult withAnomalyGroupTimeSeriesFeedback(TimeSeriesFeedback... anomalyGroupTimeSeriesFeedback) {
        if (this.anomalyGroupTimeSeriesFeedback == null) {
            setAnomalyGroupTimeSeriesFeedback(new java.util.ArrayList<TimeSeriesFeedback>(anomalyGroupTimeSeriesFeedback.length));
        }
        for (TimeSeriesFeedback ele : anomalyGroupTimeSeriesFeedback) {
            this.anomalyGroupTimeSeriesFeedback.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Feedback for an anomalous metric.
     * </p>
     * 
     * @param anomalyGroupTimeSeriesFeedback
     *        Feedback for an anomalous metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFeedbackResult withAnomalyGroupTimeSeriesFeedback(java.util.Collection<TimeSeriesFeedback> anomalyGroupTimeSeriesFeedback) {
        setAnomalyGroupTimeSeriesFeedback(anomalyGroupTimeSeriesFeedback);
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

    public GetFeedbackResult withNextToken(String nextToken) {
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
        if (getAnomalyGroupTimeSeriesFeedback() != null)
            sb.append("AnomalyGroupTimeSeriesFeedback: ").append(getAnomalyGroupTimeSeriesFeedback()).append(",");
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

        if (obj instanceof GetFeedbackResult == false)
            return false;
        GetFeedbackResult other = (GetFeedbackResult) obj;
        if (other.getAnomalyGroupTimeSeriesFeedback() == null ^ this.getAnomalyGroupTimeSeriesFeedback() == null)
            return false;
        if (other.getAnomalyGroupTimeSeriesFeedback() != null
                && other.getAnomalyGroupTimeSeriesFeedback().equals(this.getAnomalyGroupTimeSeriesFeedback()) == false)
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

        hashCode = prime * hashCode + ((getAnomalyGroupTimeSeriesFeedback() == null) ? 0 : getAnomalyGroupTimeSeriesFeedback().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFeedbackResult clone() {
        try {
            return (GetFeedbackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
