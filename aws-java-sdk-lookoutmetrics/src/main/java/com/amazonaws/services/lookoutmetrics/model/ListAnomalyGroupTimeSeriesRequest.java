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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupTimeSeries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomalyGroupTimeSeriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     */
    private String anomalyGroupId;
    /**
     * <p>
     * The name of the measure field.
     * </p>
     */
    private String metricName;
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

    public ListAnomalyGroupTimeSeriesRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     */

    public void setAnomalyGroupId(String anomalyGroupId) {
        this.anomalyGroupId = anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @return The ID of the anomaly group.
     */

    public String getAnomalyGroupId() {
        return this.anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesRequest withAnomalyGroupId(String anomalyGroupId) {
        setAnomalyGroupId(anomalyGroupId);
        return this;
    }

    /**
     * <p>
     * The name of the measure field.
     * </p>
     * 
     * @param metricName
     *        The name of the measure field.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the measure field.
     * </p>
     * 
     * @return The name of the measure field.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the measure field.
     * </p>
     * 
     * @param metricName
     *        The name of the measure field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesRequest withMetricName(String metricName) {
        setMetricName(metricName);
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

    public ListAnomalyGroupTimeSeriesRequest withMaxResults(Integer maxResults) {
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

    public ListAnomalyGroupTimeSeriesRequest withNextToken(String nextToken) {
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
        if (getAnomalyGroupId() != null)
            sb.append("AnomalyGroupId: ").append(getAnomalyGroupId()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
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

        if (obj instanceof ListAnomalyGroupTimeSeriesRequest == false)
            return false;
        ListAnomalyGroupTimeSeriesRequest other = (ListAnomalyGroupTimeSeriesRequest) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getAnomalyGroupId() == null ^ this.getAnomalyGroupId() == null)
            return false;
        if (other.getAnomalyGroupId() != null && other.getAnomalyGroupId().equals(this.getAnomalyGroupId()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
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
        hashCode = prime * hashCode + ((getAnomalyGroupId() == null) ? 0 : getAnomalyGroupId().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomalyGroupTimeSeriesRequest clone() {
        return (ListAnomalyGroupTimeSeriesRequest) super.clone();
    }

}
