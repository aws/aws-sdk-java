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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetPrediction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPredictionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The unique ID used to identify the event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent event data elements and their corresponding
     * values for the event you are sending for evaluation.
     * </p>
     */
    private java.util.Map<String, String> eventAttributes;
    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     */
    private java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs;

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

    public GetPredictionRequest withDetectorId(String detectorId) {
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

    public GetPredictionRequest withDetectorVersionId(String detectorVersionId) {
        setDetectorVersionId(detectorVersionId);
        return this;
    }

    /**
     * <p>
     * The unique ID used to identify the event.
     * </p>
     * 
     * @param eventId
     *        The unique ID used to identify the event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The unique ID used to identify the event.
     * </p>
     * 
     * @return The unique ID used to identify the event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The unique ID used to identify the event.
     * </p>
     * 
     * @param eventId
     *        The unique ID used to identify the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionRequest withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent event data elements and their corresponding
     * values for the event you are sending for evaluation.
     * </p>
     * 
     * @return Names of variables you defined in Amazon Fraud Detector to represent event data elements and their
     *         corresponding values for the event you are sending for evaluation.
     */

    public java.util.Map<String, String> getEventAttributes() {
        return eventAttributes;
    }

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent event data elements and their corresponding
     * values for the event you are sending for evaluation.
     * </p>
     * 
     * @param eventAttributes
     *        Names of variables you defined in Amazon Fraud Detector to represent event data elements and their
     *        corresponding values for the event you are sending for evaluation.
     */

    public void setEventAttributes(java.util.Map<String, String> eventAttributes) {
        this.eventAttributes = eventAttributes;
    }

    /**
     * <p>
     * Names of variables you defined in Amazon Fraud Detector to represent event data elements and their corresponding
     * values for the event you are sending for evaluation.
     * </p>
     * 
     * @param eventAttributes
     *        Names of variables you defined in Amazon Fraud Detector to represent event data elements and their
     *        corresponding values for the event you are sending for evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionRequest withEventAttributes(java.util.Map<String, String> eventAttributes) {
        setEventAttributes(eventAttributes);
        return this;
    }

    /**
     * Add a single EventAttributes entry
     *
     * @see GetPredictionRequest#withEventAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionRequest addEventAttributesEntry(String key, String value) {
        if (null == this.eventAttributes) {
            this.eventAttributes = new java.util.HashMap<String, String>();
        }
        if (this.eventAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eventAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EventAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionRequest clearEventAttributesEntries() {
        this.eventAttributes = null;
        return this;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     * 
     * @return The Amazon SageMaker model endpoint input data blobs.
     */

    public java.util.Map<String, ModelEndpointDataBlob> getExternalModelEndpointDataBlobs() {
        return externalModelEndpointDataBlobs;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     * 
     * @param externalModelEndpointDataBlobs
     *        The Amazon SageMaker model endpoint input data blobs.
     */

    public void setExternalModelEndpointDataBlobs(java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs) {
        this.externalModelEndpointDataBlobs = externalModelEndpointDataBlobs;
    }

    /**
     * <p>
     * The Amazon SageMaker model endpoint input data blobs.
     * </p>
     * 
     * @param externalModelEndpointDataBlobs
     *        The Amazon SageMaker model endpoint input data blobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionRequest withExternalModelEndpointDataBlobs(java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs) {
        setExternalModelEndpointDataBlobs(externalModelEndpointDataBlobs);
        return this;
    }

    /**
     * Add a single ExternalModelEndpointDataBlobs entry
     *
     * @see GetPredictionRequest#withExternalModelEndpointDataBlobs
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionRequest addExternalModelEndpointDataBlobsEntry(String key, ModelEndpointDataBlob value) {
        if (null == this.externalModelEndpointDataBlobs) {
            this.externalModelEndpointDataBlobs = new java.util.HashMap<String, ModelEndpointDataBlob>();
        }
        if (this.externalModelEndpointDataBlobs.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.externalModelEndpointDataBlobs.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExternalModelEndpointDataBlobs.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPredictionRequest clearExternalModelEndpointDataBlobsEntries() {
        this.externalModelEndpointDataBlobs = null;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getDetectorVersionId() != null)
            sb.append("DetectorVersionId: ").append(getDetectorVersionId()).append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventAttributes() != null)
            sb.append("EventAttributes: ").append("***Sensitive Data Redacted***").append(",");
        if (getExternalModelEndpointDataBlobs() != null)
            sb.append("ExternalModelEndpointDataBlobs: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPredictionRequest == false)
            return false;
        GetPredictionRequest other = (GetPredictionRequest) obj;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getDetectorVersionId() == null ^ this.getDetectorVersionId() == null)
            return false;
        if (other.getDetectorVersionId() != null && other.getDetectorVersionId().equals(this.getDetectorVersionId()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventAttributes() == null ^ this.getEventAttributes() == null)
            return false;
        if (other.getEventAttributes() != null && other.getEventAttributes().equals(this.getEventAttributes()) == false)
            return false;
        if (other.getExternalModelEndpointDataBlobs() == null ^ this.getExternalModelEndpointDataBlobs() == null)
            return false;
        if (other.getExternalModelEndpointDataBlobs() != null
                && other.getExternalModelEndpointDataBlobs().equals(this.getExternalModelEndpointDataBlobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getDetectorVersionId() == null) ? 0 : getDetectorVersionId().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventAttributes() == null) ? 0 : getEventAttributes().hashCode());
        hashCode = prime * hashCode + ((getExternalModelEndpointDataBlobs() == null) ? 0 : getExternalModelEndpointDataBlobs().hashCode());
        return hashCode;
    }

    @Override
    public GetPredictionRequest clone() {
        return (GetPredictionRequest) super.clone();
    }

}
