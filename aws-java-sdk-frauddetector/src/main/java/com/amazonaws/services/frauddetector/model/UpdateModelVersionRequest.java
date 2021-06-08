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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/UpdateModelVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateModelVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The major version number.
     * </p>
     */
    private String majorVersionNumber;
    /**
     * <p>
     * The event details.
     * </p>
     */
    private ExternalEventsDetail externalEventsDetail;
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

    public UpdateModelVersionRequest withModelId(String modelId) {
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

    public UpdateModelVersionRequest withModelType(String modelType) {
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

    public UpdateModelVersionRequest withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType.toString();
        return this;
    }

    /**
     * <p>
     * The major version number.
     * </p>
     * 
     * @param majorVersionNumber
     *        The major version number.
     */

    public void setMajorVersionNumber(String majorVersionNumber) {
        this.majorVersionNumber = majorVersionNumber;
    }

    /**
     * <p>
     * The major version number.
     * </p>
     * 
     * @return The major version number.
     */

    public String getMajorVersionNumber() {
        return this.majorVersionNumber;
    }

    /**
     * <p>
     * The major version number.
     * </p>
     * 
     * @param majorVersionNumber
     *        The major version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelVersionRequest withMajorVersionNumber(String majorVersionNumber) {
        setMajorVersionNumber(majorVersionNumber);
        return this;
    }

    /**
     * <p>
     * The event details.
     * </p>
     * 
     * @param externalEventsDetail
     *        The event details.
     */

    public void setExternalEventsDetail(ExternalEventsDetail externalEventsDetail) {
        this.externalEventsDetail = externalEventsDetail;
    }

    /**
     * <p>
     * The event details.
     * </p>
     * 
     * @return The event details.
     */

    public ExternalEventsDetail getExternalEventsDetail() {
        return this.externalEventsDetail;
    }

    /**
     * <p>
     * The event details.
     * </p>
     * 
     * @param externalEventsDetail
     *        The event details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelVersionRequest withExternalEventsDetail(ExternalEventsDetail externalEventsDetail) {
        setExternalEventsDetail(externalEventsDetail);
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

    public UpdateModelVersionRequest withTags(Tag... tags) {
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

    public UpdateModelVersionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getMajorVersionNumber() != null)
            sb.append("MajorVersionNumber: ").append(getMajorVersionNumber()).append(",");
        if (getExternalEventsDetail() != null)
            sb.append("ExternalEventsDetail: ").append(getExternalEventsDetail()).append(",");
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

        if (obj instanceof UpdateModelVersionRequest == false)
            return false;
        UpdateModelVersionRequest other = (UpdateModelVersionRequest) obj;
        if (other.getModelId() == null ^ this.getModelId() == null)
            return false;
        if (other.getModelId() != null && other.getModelId().equals(this.getModelId()) == false)
            return false;
        if (other.getModelType() == null ^ this.getModelType() == null)
            return false;
        if (other.getModelType() != null && other.getModelType().equals(this.getModelType()) == false)
            return false;
        if (other.getMajorVersionNumber() == null ^ this.getMajorVersionNumber() == null)
            return false;
        if (other.getMajorVersionNumber() != null && other.getMajorVersionNumber().equals(this.getMajorVersionNumber()) == false)
            return false;
        if (other.getExternalEventsDetail() == null ^ this.getExternalEventsDetail() == null)
            return false;
        if (other.getExternalEventsDetail() != null && other.getExternalEventsDetail().equals(this.getExternalEventsDetail()) == false)
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
        hashCode = prime * hashCode + ((getMajorVersionNumber() == null) ? 0 : getMajorVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getExternalEventsDetail() == null) ? 0 : getExternalEventsDetail().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateModelVersionRequest clone() {
        return (UpdateModelVersionRequest) super.clone();
    }

}
