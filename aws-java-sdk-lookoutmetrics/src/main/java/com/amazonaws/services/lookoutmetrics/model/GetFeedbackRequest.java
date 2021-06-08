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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetFeedback" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The anomalous metric and group ID.
     * </p>
     */
    private AnomalyGroupTimeSeries anomalyGroupTimeSeriesFeedback;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The Amazon Resource Name (ARN) of the anomaly detector.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the anomaly detector.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The Amazon Resource Name (ARN) of the anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFeedbackRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The anomalous metric and group ID.
     * </p>
     * 
     * @param anomalyGroupTimeSeriesFeedback
     *        The anomalous metric and group ID.
     */

    public void setAnomalyGroupTimeSeriesFeedback(AnomalyGroupTimeSeries anomalyGroupTimeSeriesFeedback) {
        this.anomalyGroupTimeSeriesFeedback = anomalyGroupTimeSeriesFeedback;
    }

    /**
     * <p>
     * The anomalous metric and group ID.
     * </p>
     * 
     * @return The anomalous metric and group ID.
     */

    public AnomalyGroupTimeSeries getAnomalyGroupTimeSeriesFeedback() {
        return this.anomalyGroupTimeSeriesFeedback;
    }

    /**
     * <p>
     * The anomalous metric and group ID.
     * </p>
     * 
     * @param anomalyGroupTimeSeriesFeedback
     *        The anomalous metric and group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFeedbackRequest withAnomalyGroupTimeSeriesFeedback(AnomalyGroupTimeSeries anomalyGroupTimeSeriesFeedback) {
        setAnomalyGroupTimeSeriesFeedback(anomalyGroupTimeSeriesFeedback);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFeedbackRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token that's returned by a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFeedbackRequest withNextToken(String nextToken) {
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
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getAnomalyGroupTimeSeriesFeedback() != null)
            sb.append("AnomalyGroupTimeSeriesFeedback: ").append(getAnomalyGroupTimeSeriesFeedback()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof GetFeedbackRequest == false)
            return false;
        GetFeedbackRequest other = (GetFeedbackRequest) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getAnomalyGroupTimeSeriesFeedback() == null ^ this.getAnomalyGroupTimeSeriesFeedback() == null)
            return false;
        if (other.getAnomalyGroupTimeSeriesFeedback() != null
                && other.getAnomalyGroupTimeSeriesFeedback().equals(this.getAnomalyGroupTimeSeriesFeedback()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getAnomalyGroupTimeSeriesFeedback() == null) ? 0 : getAnomalyGroupTimeSeriesFeedback().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetFeedbackRequest clone() {
        return (GetFeedbackRequest) super.clone();
    }

}
