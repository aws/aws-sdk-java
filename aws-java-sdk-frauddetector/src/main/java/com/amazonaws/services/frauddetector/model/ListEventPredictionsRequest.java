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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ListEventPredictions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventPredictionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The event ID.
     * </p>
     */
    private FilterCondition eventId;
    /**
     * <p>
     * The event type associated with the detector.
     * </p>
     */
    private FilterCondition eventType;
    /**
     * <p>
     * The detector ID.
     * </p>
     */
    private FilterCondition detectorId;
    /**
     * <p>
     * The detector version ID.
     * </p>
     */
    private FilterCondition detectorVersionId;
    /**
     * <p>
     * The time period for when the predictions were generated.
     * </p>
     */
    private PredictionTimeRange predictionTimeRange;
    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of predictions to return for the request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @param eventId
     *        The event ID.
     */

    public void setEventId(FilterCondition eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @return The event ID.
     */

    public FilterCondition getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @param eventId
     *        The event ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsRequest withEventId(FilterCondition eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type associated with the detector.
     * </p>
     * 
     * @param eventType
     *        The event type associated with the detector.
     */

    public void setEventType(FilterCondition eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type associated with the detector.
     * </p>
     * 
     * @return The event type associated with the detector.
     */

    public FilterCondition getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type associated with the detector.
     * </p>
     * 
     * @param eventType
     *        The event type associated with the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsRequest withEventType(FilterCondition eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     */

    public void setDetectorId(FilterCondition detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @return The detector ID.
     */

    public FilterCondition getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @param detectorId
     *        The detector ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsRequest withDetectorId(FilterCondition detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @param detectorVersionId
     *        The detector version ID.
     */

    public void setDetectorVersionId(FilterCondition detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @return The detector version ID.
     */

    public FilterCondition getDetectorVersionId() {
        return this.detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @param detectorVersionId
     *        The detector version ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsRequest withDetectorVersionId(FilterCondition detectorVersionId) {
        setDetectorVersionId(detectorVersionId);
        return this;
    }

    /**
     * <p>
     * The time period for when the predictions were generated.
     * </p>
     * 
     * @param predictionTimeRange
     *        The time period for when the predictions were generated.
     */

    public void setPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
        this.predictionTimeRange = predictionTimeRange;
    }

    /**
     * <p>
     * The time period for when the predictions were generated.
     * </p>
     * 
     * @return The time period for when the predictions were generated.
     */

    public PredictionTimeRange getPredictionTimeRange() {
        return this.predictionTimeRange;
    }

    /**
     * <p>
     * The time period for when the predictions were generated.
     * </p>
     * 
     * @param predictionTimeRange
     *        The time period for when the predictions were generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsRequest withPredictionTimeRange(PredictionTimeRange predictionTimeRange) {
        setPredictionTimeRange(predictionTimeRange);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return. Use the token to make the call again to retrieve the next
     *        page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @return Identifies the next page of results to return. Use the token to make the call again to retrieve the next
     *         page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return. Use the token to make the call again to retrieve the next
     *        page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of predictions to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of predictions to return for the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of predictions to return for the request.
     * </p>
     * 
     * @return The maximum number of predictions to return for the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of predictions to return for the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of predictions to return for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsRequest withMaxResults(Integer maxResults) {
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorVersionId() != null)
            sb.append("DetectorVersionId: ").append(getDetectorVersionId()).append(",");
        if (getPredictionTimeRange() != null)
            sb.append("PredictionTimeRange: ").append(getPredictionTimeRange()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListEventPredictionsRequest == false)
            return false;
        ListEventPredictionsRequest other = (ListEventPredictionsRequest) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getPredictionTimeRange() == null ^ this.getPredictionTimeRange() == null)
            return false;
        if (other.getPredictionTimeRange() != null && other.getPredictionTimeRange().equals(this.getPredictionTimeRange()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimeRange() == null) ? 0 : getPredictionTimeRange().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListEventPredictionsRequest clone() {
        return (ListEventPredictionsRequest) super.clone();
    }

}
