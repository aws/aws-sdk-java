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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The model.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/Model" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Model implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The model ID.
     * </p>
     */
    private String modelId;
    /**
     * <p>
     * The model type.
     * </p>
     */
    private String modelType;
    /**
     * <p>
     * The model description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the event type.
     * </p>
     */
    private String eventTypeName;
    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     */
    private String lastUpdatedTime;
    /**
     * <p>
     * The ARN of the model.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @param modelId
     *        The model ID.
     */

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @return The model ID.
     */

    public String getModelId() {
        return this.modelId;
    }

    /**
     * <p>
     * The model ID.
     * </p>
     * 
     * @param modelId
     *        The model ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withModelId(String modelId) {
        setModelId(modelId);
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @see ModelTypeEnum
     */

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @return The model type.
     * @see ModelTypeEnum
     */

    public String getModelType() {
        return this.modelType;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public Model withModelType(String modelType) {
        setModelType(modelType);
        return this;
    }

    /**
     * <p>
     * The model type.
     * </p>
     * 
     * @param modelType
     *        The model type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelTypeEnum
     */

    public Model withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * 
     * @param description
     *        The model description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * 
     * @return The model description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The model description.
     * </p>
     * 
     * @param description
     *        The model description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     */

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @return The name of the event type.
     */

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    /**
     * <p>
     * The name of the event type.
     * </p>
     * 
     * @param eventTypeName
     *        The name of the event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the model was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     * 
     * @return Timestamp of when the model was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * Timestamp of when the model was created.
     * </p>
     * 
     * @param createdTime
     *        Timestamp of when the model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of last time the model was updated.
     */

    public void setLastUpdatedTime(String lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     * 
     * @return Timestamp of last time the model was updated.
     */

    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * Timestamp of last time the model was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        Timestamp of last time the model was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withLastUpdatedTime(String lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the model.
     * </p>
     * 
     * @param arn
     *        The ARN of the model.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the model.
     * </p>
     * 
     * @return The ARN of the model.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the model.
     * </p>
     * 
     * @param arn
     *        The ARN of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Model withArn(String arn) {
        setArn(arn);
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
        if (getModelId() != null)
            sb.append("ModelId: ").append(getModelId()).append(",");
        if (getModelType() != null)
            sb.append("ModelType: ").append(getModelType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventTypeName() != null)
            sb.append("EventTypeName: ").append(getEventTypeName()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Model == false)
            return false;
        Model other = (Model) obj;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventTypeName() == null ^ this.getEventTypeName() == null)
            return false;
        if (other.getEventTypeName() != null && other.getEventTypeName().equals(this.getEventTypeName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelId() == null) ? 0 : getModelId().hashCode());
        hashCode = prime * hashCode + ((getModelType() == null) ? 0 : getModelType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventTypeName() == null) ? 0 : getEventTypeName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public Model clone() {
        try {
            return (Model) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.frauddetector.model.transform.ModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
