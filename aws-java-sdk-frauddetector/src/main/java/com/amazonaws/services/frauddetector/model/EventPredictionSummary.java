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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the summary of an event prediction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/EventPredictionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventPredictionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event ID.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The event type.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The timestamp of the event.
     * </p>
     */
    private String eventTimestamp;
    /**
     * <p>
     * The timestamp when the prediction was generated.
     * </p>
     */
    private String predictionTimestamp;
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

    public EventPredictionSummary withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventTypeName
     *        The event type.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @return The event type.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The event type.
     * </p>
     * 
     * @param eventTypeName
     *        The event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventPredictionSummary withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp of the event.
     */

    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @return The timestamp of the event.
     */

    public String getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param eventTimestamp
     *        The timestamp of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventPredictionSummary withEventTimestamp(String eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp when the prediction was generated.
     * </p>
     * 
     * @param predictionTimestamp
     *        The timestamp when the prediction was generated.
     */

    public void setPredictionTimestamp(String predictionTimestamp) {
        this.predictionTimestamp = predictionTimestamp;
    }

    /**
     * <p>
     * The timestamp when the prediction was generated.
     * </p>
     * 
     * @return The timestamp when the prediction was generated.
     */

    public String getPredictionTimestamp() {
        return this.predictionTimestamp;
    }

    /**
     * <p>
     * The timestamp when the prediction was generated.
     * </p>
     * 
     * @param predictionTimestamp
     *        The timestamp when the prediction was generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventPredictionSummary withPredictionTimestamp(String predictionTimestamp) {
        setPredictionTimestamp(predictionTimestamp);
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

    public EventPredictionSummary withDetectorId(String detectorId) {
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

    public EventPredictionSummary withDetectorVersionId(String detectorVersionId) {
        setDetectorVersionId(detectorVersionId);
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
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getPredictionTimestamp() != null)
            sb.append("PredictionTimestamp: ").append(getPredictionTimestamp()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorVersionId() != null)
            sb.append("DetectorVersionId: ").append(getDetectorVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventPredictionSummary == false)
            return false;
        EventPredictionSummary other = (EventPredictionSummary) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getPredictionTimestamp() == null ^ this.getPredictionTimestamp() == null)
            return false;
        if (other.getPredictionTimestamp() != null && other.getPredictionTimestamp().equals(this.getPredictionTimestamp()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getPredictionTimestamp() == null) ? 0 : getPredictionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        return hashCode;
    }

    @Override
    public EventPredictionSummary clone() {
        try {
            return (EventPredictionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.EventPredictionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
