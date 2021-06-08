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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/CreateModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * A collection of key and value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

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

    public CreateModelRequest withModelId(String modelId) {
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

    public CreateModelRequest withModelType(String modelType) {
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

    public CreateModelRequest withModelType(ModelTypeEnum modelType) {
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

    public CreateModelRequest withDescription(String description) {
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

    public CreateModelRequest withEventTypeName(String eventTypeName) {
        setEventTypeName(eventTypeName);
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @return A collection of key and value pairs.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of key and value pairs.
     * </p>
     * 
     * @param tags
     *        A collection of key and value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelRequest == false)
            return false;
        CreateModelRequest other = (CreateModelRequest) obj;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelRequest clone() {
        return (CreateModelRequest) super.clone();
    }

}
