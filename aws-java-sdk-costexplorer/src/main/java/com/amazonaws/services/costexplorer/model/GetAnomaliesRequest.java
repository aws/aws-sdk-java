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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnomaliesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name (ARN).
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an
     * <code>AnomalyEndDate</code> in the specified time range.
     * </p>
     */
    private AnomalyDateInterval dateInterval;
    /**
     * <p>
     * Filters anomaly results by the feedback field on the anomaly object.
     * </p>
     */
    private String feedback;
    /**
     * <p>
     * Filters anomaly results by the total impact field on the anomaly object. For example, you can filter anomalies
     * <code>GREATER_THAN 200.00</code> to retrieve anomalies, with an estimated dollar impact greater than 200.
     * </p>
     */
    private TotalImpactFilter totalImpact;
    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name (ARN).
     * </p>
     * 
     * @param monitorArn
     *        Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name
     *        (ARN).
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name (ARN).
     * </p>
     * 
     * @return Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name
     *         (ARN).
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name (ARN).
     * </p>
     * 
     * @param monitorArn
     *        Retrieves all of the cost anomalies detected for a specific cost anomaly monitor Amazon Resource Name
     *        (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomaliesRequest withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an
     * <code>AnomalyEndDate</code> in the specified time range.
     * </p>
     * 
     * @param dateInterval
     *        Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an
     *        <code>AnomalyEndDate</code> in the specified time range.
     */

    public void setDateInterval(AnomalyDateInterval dateInterval) {
        this.dateInterval = dateInterval;
    }

    /**
     * <p>
     * Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an
     * <code>AnomalyEndDate</code> in the specified time range.
     * </p>
     * 
     * @return Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an
     *         <code>AnomalyEndDate</code> in the specified time range.
     */

    public AnomalyDateInterval getDateInterval() {
        return this.dateInterval;
    }

    /**
     * <p>
     * Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an
     * <code>AnomalyEndDate</code> in the specified time range.
     * </p>
     * 
     * @param dateInterval
     *        Assigns the start and end dates for retrieving cost anomalies. The returned anomaly object will have an
     *        <code>AnomalyEndDate</code> in the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomaliesRequest withDateInterval(AnomalyDateInterval dateInterval) {
        setDateInterval(dateInterval);
        return this;
    }

    /**
     * <p>
     * Filters anomaly results by the feedback field on the anomaly object.
     * </p>
     * 
     * @param feedback
     *        Filters anomaly results by the feedback field on the anomaly object.
     * @see AnomalyFeedbackType
     */

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * <p>
     * Filters anomaly results by the feedback field on the anomaly object.
     * </p>
     * 
     * @return Filters anomaly results by the feedback field on the anomaly object.
     * @see AnomalyFeedbackType
     */

    public String getFeedback() {
        return this.feedback;
    }

    /**
     * <p>
     * Filters anomaly results by the feedback field on the anomaly object.
     * </p>
     * 
     * @param feedback
     *        Filters anomaly results by the feedback field on the anomaly object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyFeedbackType
     */

    public GetAnomaliesRequest withFeedback(String feedback) {
        setFeedback(feedback);
        return this;
    }

    /**
     * <p>
     * Filters anomaly results by the feedback field on the anomaly object.
     * </p>
     * 
     * @param feedback
     *        Filters anomaly results by the feedback field on the anomaly object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyFeedbackType
     */

    public GetAnomaliesRequest withFeedback(AnomalyFeedbackType feedback) {
        this.feedback = feedback.toString();
        return this;
    }

    /**
     * <p>
     * Filters anomaly results by the total impact field on the anomaly object. For example, you can filter anomalies
     * <code>GREATER_THAN 200.00</code> to retrieve anomalies, with an estimated dollar impact greater than 200.
     * </p>
     * 
     * @param totalImpact
     *        Filters anomaly results by the total impact field on the anomaly object. For example, you can filter
     *        anomalies <code>GREATER_THAN 200.00</code> to retrieve anomalies, with an estimated dollar impact greater
     *        than 200.
     */

    public void setTotalImpact(TotalImpactFilter totalImpact) {
        this.totalImpact = totalImpact;
    }

    /**
     * <p>
     * Filters anomaly results by the total impact field on the anomaly object. For example, you can filter anomalies
     * <code>GREATER_THAN 200.00</code> to retrieve anomalies, with an estimated dollar impact greater than 200.
     * </p>
     * 
     * @return Filters anomaly results by the total impact field on the anomaly object. For example, you can filter
     *         anomalies <code>GREATER_THAN 200.00</code> to retrieve anomalies, with an estimated dollar impact greater
     *         than 200.
     */

    public TotalImpactFilter getTotalImpact() {
        return this.totalImpact;
    }

    /**
     * <p>
     * Filters anomaly results by the total impact field on the anomaly object. For example, you can filter anomalies
     * <code>GREATER_THAN 200.00</code> to retrieve anomalies, with an estimated dollar impact greater than 200.
     * </p>
     * 
     * @param totalImpact
     *        Filters anomaly results by the total impact field on the anomaly object. For example, you can filter
     *        anomalies <code>GREATER_THAN 200.00</code> to retrieve anomalies, with an estimated dollar impact greater
     *        than 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomaliesRequest withTotalImpact(TotalImpactFilter totalImpact) {
        setTotalImpact(totalImpact);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *         call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomaliesRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     * 
     * @param maxResults
     *        The number of entries a paginated response contains.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     * 
     * @return The number of entries a paginated response contains.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     * 
     * @param maxResults
     *        The number of entries a paginated response contains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomaliesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getDateInterval() != null)
            sb.append("DateInterval: ").append(getDateInterval()).append(",");
        if (getFeedback() != null)
            sb.append("Feedback: ").append(getFeedback()).append(",");
        if (getTotalImpact() != null)
            sb.append("TotalImpact: ").append(getTotalImpact()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnomaliesRequest == false)
            return false;
        GetAnomaliesRequest other = (GetAnomaliesRequest) obj;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getDateInterval() == null ^ this.getDateInterval() == null)
            return false;
        if (other.getDateInterval() != null && other.getDateInterval().equals(this.getDateInterval()) == false)
            return false;
        if (other.getFeedback() == null ^ this.getFeedback() == null)
            return false;
        if (other.getFeedback() != null && other.getFeedback().equals(this.getFeedback()) == false)
            return false;
        if (other.getTotalImpact() == null ^ this.getTotalImpact() == null)
            return false;
        if (other.getTotalImpact() != null && other.getTotalImpact().equals(this.getTotalImpact()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getDateInterval() == null) ? 0 : getDateInterval().hashCode());
        hashCode = prime * hashCode + ((getFeedback() == null) ? 0 : getFeedback().hashCode());
        hashCode = prime * hashCode + ((getTotalImpact() == null) ? 0 : getTotalImpact().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetAnomaliesRequest clone() {
        return (GetAnomaliesRequest) super.clone();
    }

}
