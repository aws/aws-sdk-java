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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPredictionMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventPredictionMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The event ID.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The event type associated with the detector specified for the prediction.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The detector ID.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The detector version ID.
     * </p>
     */
    private String detectorVersionId;
    /**
     * <p>
     * The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO 8601
     * standard in UTC.
     * </p>
     * <p>
     * We recommend calling <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_ListEventPredictions.html">
     * ListEventPredictions</a> first, and using the <code>predictionTimestamp</code> value in the response to provide
     * an accurate prediction timestamp value.
     * </p>
     */
    private String predictionTimestamp;

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @param eventId
     *        The event ID.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The event ID.
     * </p>
     * 
     * @return The event ID.
     */

    public String getEventId() {
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

    public GetEventPredictionMetadataRequest withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type associated with the detector specified for the prediction.
     * </p>
     * 
     * @param eventTypeName
     *        The event type associated with the detector specified for the prediction.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The event type associated with the detector specified for the prediction.
     * </p>
     * 
     * @return The event type associated with the detector specified for the prediction.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The event type associated with the detector specified for the prediction.
     * </p>
     * 
     * @param eventTypeName
     *        The event type associated with the detector specified for the prediction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
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

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The detector ID.
     * </p>
     * 
     * @return The detector ID.
     */

    public String getDetectorId() {
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

    public GetEventPredictionMetadataRequest withDetectorId(String detectorId) {
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

    public void setDetectorVersionId(String detectorVersionId) {
        this.detectorVersionId = detectorVersionId;
    }

    /**
     * <p>
     * The detector version ID.
     * </p>
     * 
     * @return The detector version ID.
     */

    public String getDetectorVersionId() {
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

    public GetEventPredictionMetadataRequest withDetectorVersionId(String detectorVersionId) {
        setDetectorVersionId(detectorVersionId);
        return this;
    }

    /**
     * <p>
     * The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO 8601
     * standard in UTC.
     * </p>
     * <p>
     * We recommend calling <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_ListEventPredictions.html">
     * ListEventPredictions</a> first, and using the <code>predictionTimestamp</code> value in the response to provide
     * an accurate prediction timestamp value.
     * </p>
     * 
     * @param predictionTimestamp
     *        The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO
     *        8601 standard in UTC.</p>
     *        <p>
     *        We recommend calling <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/api/API_ListEventPredictions.html"
     *        >ListEventPredictions</a> first, and using the <code>predictionTimestamp</code> value in the response to
     *        provide an accurate prediction timestamp value.
     */

    public void setPredictionTimestamp(String predictionTimestamp) {
        this.predictionTimestamp = predictionTimestamp;
    }

    /**
     * <p>
     * The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO 8601
     * standard in UTC.
     * </p>
     * <p>
     * We recommend calling <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_ListEventPredictions.html">
     * ListEventPredictions</a> first, and using the <code>predictionTimestamp</code> value in the response to provide
     * an accurate prediction timestamp value.
     * </p>
     * 
     * @return The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO
     *         8601 standard in UTC.</p>
     *         <p>
     *         We recommend calling <a
     *         href="https://docs.aws.amazon.com/frauddetector/latest/api/API_ListEventPredictions.html"
     *         >ListEventPredictions</a> first, and using the <code>predictionTimestamp</code> value in the response to
     *         provide an accurate prediction timestamp value.
     */

    public String getPredictionTimestamp() {
        return this.predictionTimestamp;
    }

    /**
     * <p>
     * The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO 8601
     * standard in UTC.
     * </p>
     * <p>
     * We recommend calling <a
     * href="https://docs.aws.amazon.com/frauddetector/latest/api/API_ListEventPredictions.html">
     * ListEventPredictions</a> first, and using the <code>predictionTimestamp</code> value in the response to provide
     * an accurate prediction timestamp value.
     * </p>
     * 
     * @param predictionTimestamp
     *        The timestamp that defines when the prediction was generated. The timestamp must be specified using ISO
     *        8601 standard in UTC.</p>
     *        <p>
     *        We recommend calling <a
     *        href="https://docs.aws.amazon.com/frauddetector/latest/api/API_ListEventPredictions.html"
     *        >ListEventPredictions</a> first, and using the <code>predictionTimestamp</code> value in the response to
     *        provide an accurate prediction timestamp value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionMetadataRequest withPredictionTimestamp(String predictionTimestamp) {
        setPredictionTimestamp(predictionTimestamp);
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
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorVersionId() != null)
            sb.append("DetectorVersionId: ").append(getDetectorVersionId()).append(",");
        if (getPredictionTimestamp() != null)
            sb.append("PredictionTimestamp: ").append(getPredictionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEventPredictionMetadataRequest == false)
            return false;
        GetEventPredictionMetadataRequest other = (GetEventPredictionMetadataRequest) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getPredictionTimestamp() == null ^ this.getPredictionTimestamp() == null)
            return false;
        if (other.getPredictionTimestamp() != null && other.getPredictionTimestamp().equals(this.getPredictionTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimestamp() == null) ? 0 : getPredictionTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetEventPredictionMetadataRequest clone() {
        return (GetEventPredictionMetadataRequest) super.clone();
    }

}
