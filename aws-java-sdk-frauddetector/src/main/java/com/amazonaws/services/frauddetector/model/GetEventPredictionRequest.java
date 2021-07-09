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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetEventPrediction" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventPredictionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The event type associated with the detector specified for the prediction.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * The entity type (associated with the detector's event type) and specific entity ID representing who performed the
     * event. If an entity id is not available, use "UNKNOWN."
     * </p>
     */
    private java.util.List<Entity> entities;
    /**
     * <p>
     * Timestamp that defines when the event under evaluation occurred.
     * </p>
     */
    private String eventTimestamp;
    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You must provide at least one eventVariable
     * </p>
     * </li>
     * <li>
     * <p>
     * If detectorVersion is associated with a modelVersion, you must provide at least one associated eventVariable
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * To ensure highest possible fraud prediction and to simplify your data preparation, Amazon Fraud Detector will
     * replace all missing variables or values as follows:
     * </p>
     * <p>
     * <b>For Amazon Fraud Detector trained models:</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable or if a variable is missing, model will replace the null
     * value or the missing variable (no variable name in the eventVariables map) with calculated default mean/medians
     * for numeric variables and with special values for categorical variables.
     * </p>
     * <p>
     * <b>For External models ( for example, imported SageMaker):</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable, the model and rules will use “null” as the value. If a
     * variable is not provided (no variable name in the eventVariables map), model and rules will use the default value
     * that is provided for the variable.
     * </p>
     */
    private java.util.Map<String, String> eventVariables;
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

    public GetEventPredictionRequest withDetectorId(String detectorId) {
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

    public GetEventPredictionRequest withDetectorVersionId(String detectorVersionId) {
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

    public GetEventPredictionRequest withEventId(String eventId) {
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

    public GetEventPredictionRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * The entity type (associated with the detector's event type) and specific entity ID representing who performed the
     * event. If an entity id is not available, use "UNKNOWN."
     * </p>
     * 
     * @return The entity type (associated with the detector's event type) and specific entity ID representing who
     *         performed the event. If an entity id is not available, use "UNKNOWN."
     */

    public java.util.List<Entity> getEntities() {
        return entities;
    }

    /**
     * <p>
     * The entity type (associated with the detector's event type) and specific entity ID representing who performed the
     * event. If an entity id is not available, use "UNKNOWN."
     * </p>
     * 
     * @param entities
     *        The entity type (associated with the detector's event type) and specific entity ID representing who
     *        performed the event. If an entity id is not available, use "UNKNOWN."
     */

    public void setEntities(java.util.Collection<Entity> entities) {
        if (entities == null) {
            this.entities = null;
            return;
        }

        this.entities = new java.util.ArrayList<Entity>(entities);
    }

    /**
     * <p>
     * The entity type (associated with the detector's event type) and specific entity ID representing who performed the
     * event. If an entity id is not available, use "UNKNOWN."
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntities(java.util.Collection)} or {@link #withEntities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entities
     *        The entity type (associated with the detector's event type) and specific entity ID representing who
     *        performed the event. If an entity id is not available, use "UNKNOWN."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionRequest withEntities(Entity... entities) {
        if (this.entities == null) {
            setEntities(new java.util.ArrayList<Entity>(entities.length));
        }
        for (Entity ele : entities) {
            this.entities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The entity type (associated with the detector's event type) and specific entity ID representing who performed the
     * event. If an entity id is not available, use "UNKNOWN."
     * </p>
     * 
     * @param entities
     *        The entity type (associated with the detector's event type) and specific entity ID representing who
     *        performed the event. If an entity id is not available, use "UNKNOWN."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionRequest withEntities(java.util.Collection<Entity> entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * Timestamp that defines when the event under evaluation occurred.
     * </p>
     * 
     * @param eventTimestamp
     *        Timestamp that defines when the event under evaluation occurred.
     */

    public void setEventTimestamp(String eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * Timestamp that defines when the event under evaluation occurred.
     * </p>
     * 
     * @return Timestamp that defines when the event under evaluation occurred.
     */

    public String getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * Timestamp that defines when the event under evaluation occurred.
     * </p>
     * 
     * @param eventTimestamp
     *        Timestamp that defines when the event under evaluation occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionRequest withEventTimestamp(String eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You must provide at least one eventVariable
     * </p>
     * </li>
     * <li>
     * <p>
     * If detectorVersion is associated with a modelVersion, you must provide at least one associated eventVariable
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * To ensure highest possible fraud prediction and to simplify your data preparation, Amazon Fraud Detector will
     * replace all missing variables or values as follows:
     * </p>
     * <p>
     * <b>For Amazon Fraud Detector trained models:</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable or if a variable is missing, model will replace the null
     * value or the missing variable (no variable name in the eventVariables map) with calculated default mean/medians
     * for numeric variables and with special values for categorical variables.
     * </p>
     * <p>
     * <b>For External models ( for example, imported SageMaker):</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable, the model and rules will use “null” as the value. If a
     * variable is not provided (no variable name in the eventVariables map), model and rules will use the default value
     * that is provided for the variable.
     * </p>
     * 
     * @return Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and
     *         their corresponding values for the event you are sending for evaluation.</p> <important>
     *         <ul>
     *         <li>
     *         <p>
     *         You must provide at least one eventVariable
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If detectorVersion is associated with a modelVersion, you must provide at least one associated
     *         eventVariable
     *         </p>
     *         </li>
     *         </ul>
     *         </important>
     *         <p>
     *         To ensure highest possible fraud prediction and to simplify your data preparation, Amazon Fraud Detector
     *         will replace all missing variables or values as follows:
     *         </p>
     *         <p>
     *         <b>For Amazon Fraud Detector trained models:</b>
     *         </p>
     *         <p>
     *         If a null value is provided explicitly for a variable or if a variable is missing, model will replace the
     *         null value or the missing variable (no variable name in the eventVariables map) with calculated default
     *         mean/medians for numeric variables and with special values for categorical variables.
     *         </p>
     *         <p>
     *         <b>For External models ( for example, imported SageMaker):</b>
     *         </p>
     *         <p>
     *         If a null value is provided explicitly for a variable, the model and rules will use “null” as the value.
     *         If a variable is not provided (no variable name in the eventVariables map), model and rules will use the
     *         default value that is provided for the variable.
     */

    public java.util.Map<String, String> getEventVariables() {
        return eventVariables;
    }

    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You must provide at least one eventVariable
     * </p>
     * </li>
     * <li>
     * <p>
     * If detectorVersion is associated with a modelVersion, you must provide at least one associated eventVariable
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * To ensure highest possible fraud prediction and to simplify your data preparation, Amazon Fraud Detector will
     * replace all missing variables or values as follows:
     * </p>
     * <p>
     * <b>For Amazon Fraud Detector trained models:</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable or if a variable is missing, model will replace the null
     * value or the missing variable (no variable name in the eventVariables map) with calculated default mean/medians
     * for numeric variables and with special values for categorical variables.
     * </p>
     * <p>
     * <b>For External models ( for example, imported SageMaker):</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable, the model and rules will use “null” as the value. If a
     * variable is not provided (no variable name in the eventVariables map), model and rules will use the default value
     * that is provided for the variable.
     * </p>
     * 
     * @param eventVariables
     *        Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and
     *        their corresponding values for the event you are sending for evaluation.</p> <important>
     *        <ul>
     *        <li>
     *        <p>
     *        You must provide at least one eventVariable
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If detectorVersion is associated with a modelVersion, you must provide at least one associated
     *        eventVariable
     *        </p>
     *        </li>
     *        </ul>
     *        </important>
     *        <p>
     *        To ensure highest possible fraud prediction and to simplify your data preparation, Amazon Fraud Detector
     *        will replace all missing variables or values as follows:
     *        </p>
     *        <p>
     *        <b>For Amazon Fraud Detector trained models:</b>
     *        </p>
     *        <p>
     *        If a null value is provided explicitly for a variable or if a variable is missing, model will replace the
     *        null value or the missing variable (no variable name in the eventVariables map) with calculated default
     *        mean/medians for numeric variables and with special values for categorical variables.
     *        </p>
     *        <p>
     *        <b>For External models ( for example, imported SageMaker):</b>
     *        </p>
     *        <p>
     *        If a null value is provided explicitly for a variable, the model and rules will use “null” as the value.
     *        If a variable is not provided (no variable name in the eventVariables map), model and rules will use the
     *        default value that is provided for the variable.
     */

    public void setEventVariables(java.util.Map<String, String> eventVariables) {
        this.eventVariables = eventVariables;
    }

    /**
     * <p>
     * Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and their
     * corresponding values for the event you are sending for evaluation.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * You must provide at least one eventVariable
     * </p>
     * </li>
     * <li>
     * <p>
     * If detectorVersion is associated with a modelVersion, you must provide at least one associated eventVariable
     * </p>
     * </li>
     * </ul>
     * </important>
     * <p>
     * To ensure highest possible fraud prediction and to simplify your data preparation, Amazon Fraud Detector will
     * replace all missing variables or values as follows:
     * </p>
     * <p>
     * <b>For Amazon Fraud Detector trained models:</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable or if a variable is missing, model will replace the null
     * value or the missing variable (no variable name in the eventVariables map) with calculated default mean/medians
     * for numeric variables and with special values for categorical variables.
     * </p>
     * <p>
     * <b>For External models ( for example, imported SageMaker):</b>
     * </p>
     * <p>
     * If a null value is provided explicitly for a variable, the model and rules will use “null” as the value. If a
     * variable is not provided (no variable name in the eventVariables map), model and rules will use the default value
     * that is provided for the variable.
     * </p>
     * 
     * @param eventVariables
     *        Names of the event type's variables you defined in Amazon Fraud Detector to represent data elements and
     *        their corresponding values for the event you are sending for evaluation.</p> <important>
     *        <ul>
     *        <li>
     *        <p>
     *        You must provide at least one eventVariable
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If detectorVersion is associated with a modelVersion, you must provide at least one associated
     *        eventVariable
     *        </p>
     *        </li>
     *        </ul>
     *        </important>
     *        <p>
     *        To ensure highest possible fraud prediction and to simplify your data preparation, Amazon Fraud Detector
     *        will replace all missing variables or values as follows:
     *        </p>
     *        <p>
     *        <b>For Amazon Fraud Detector trained models:</b>
     *        </p>
     *        <p>
     *        If a null value is provided explicitly for a variable or if a variable is missing, model will replace the
     *        null value or the missing variable (no variable name in the eventVariables map) with calculated default
     *        mean/medians for numeric variables and with special values for categorical variables.
     *        </p>
     *        <p>
     *        <b>For External models ( for example, imported SageMaker):</b>
     *        </p>
     *        <p>
     *        If a null value is provided explicitly for a variable, the model and rules will use “null” as the value.
     *        If a variable is not provided (no variable name in the eventVariables map), model and rules will use the
     *        default value that is provided for the variable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionRequest withEventVariables(java.util.Map<String, String> eventVariables) {
        setEventVariables(eventVariables);
        return this;
    }

    /**
     * Add a single EventVariables entry
     *
     * @see GetEventPredictionRequest#withEventVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionRequest addEventVariablesEntry(String key, String value) {
        if (null == this.eventVariables) {
            this.eventVariables = new java.util.HashMap<String, String>();
        }
        if (this.eventVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.eventVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EventVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionRequest clearEventVariablesEntries() {
        this.eventVariables = null;
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

    public GetEventPredictionRequest withExternalModelEndpointDataBlobs(java.util.Map<String, ModelEndpointDataBlob> externalModelEndpointDataBlobs) {
        setExternalModelEndpointDataBlobs(externalModelEndpointDataBlobs);
        return this;
    }

    /**
     * Add a single ExternalModelEndpointDataBlobs entry
     *
     * @see GetEventPredictionRequest#withExternalModelEndpointDataBlobs
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEventPredictionRequest addExternalModelEndpointDataBlobsEntry(String key, ModelEndpointDataBlob value) {
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

    public GetEventPredictionRequest clearExternalModelEndpointDataBlobsEntries() {
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
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities()).append(",");
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getEventVariables() != null)
            sb.append("EventVariables: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GetEventPredictionRequest == false)
            return false;
        GetEventPredictionRequest other = (GetEventPredictionRequest) obj;
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
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getEventVariables() == null ^ this.getEventVariables() == null)
            return false;
        if (other.getEventVariables() != null && other.getEventVariables().equals(this.getEventVariables()) == false)
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
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEventVariables() == null) ? 0 : getEventVariables().hashCode());
        hashCode = prime * hashCode + ((getExternalModelEndpointDataBlobs() == null) ? 0 : getExternalModelEndpointDataBlobs().hashCode());
        return hashCode;
    }

    @Override
    public GetEventPredictionRequest clone() {
        return (GetEventPredictionRequest) super.clone();
    }

}
