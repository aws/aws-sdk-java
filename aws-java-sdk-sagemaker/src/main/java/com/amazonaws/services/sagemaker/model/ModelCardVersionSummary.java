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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of a specific version of the model card.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelCardVersionSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelCardVersionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model card.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     */
    private String modelCardArn;
    /**
     * <p>
     * The approval status of the model card version within your organization. Different organizations might have
     * different criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     */
    private String modelCardStatus;
    /**
     * <p>
     * A version of the model card.
     * </p>
     */
    private Integer modelCardVersion;
    /**
     * <p>
     * The date and time that the model card version was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time date and time that the model card version was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the model card.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * The name of the model card.
     * </p>
     * 
     * @return The name of the model card.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * The name of the model card.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardVersionSummary withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     * 
     * @param modelCardArn
     *        The Amazon Resource Name (ARN) of the model card.
     */

    public void setModelCardArn(String modelCardArn) {
        this.modelCardArn = modelCardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model card.
     */

    public String getModelCardArn() {
        return this.modelCardArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card.
     * </p>
     * 
     * @param modelCardArn
     *        The Amazon Resource Name (ARN) of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardVersionSummary withModelCardArn(String modelCardArn) {
        setModelCardArn(modelCardArn);
        return this;
    }

    /**
     * <p>
     * The approval status of the model card version within your organization. Different organizations might have
     * different criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardStatus
     *        The approval status of the model card version within your organization. Different organizations might have
     *        different criteria for model card review and approval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Draft</code>: The model card is a work in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingReview</code>: The model card is pending review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approved</code>: The model card is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *        it can still be exported.
     *        </p>
     *        </li>
     * @see ModelCardStatus
     */

    public void setModelCardStatus(String modelCardStatus) {
        this.modelCardStatus = modelCardStatus;
    }

    /**
     * <p>
     * The approval status of the model card version within your organization. Different organizations might have
     * different criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The approval status of the model card version within your organization. Different organizations might
     *         have different criteria for model card review and approval.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Draft</code>: The model card is a work in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PendingReview</code>: The model card is pending review.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Approved</code>: The model card is approved.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *         it can still be exported.
     *         </p>
     *         </li>
     * @see ModelCardStatus
     */

    public String getModelCardStatus() {
        return this.modelCardStatus;
    }

    /**
     * <p>
     * The approval status of the model card version within your organization. Different organizations might have
     * different criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardStatus
     *        The approval status of the model card version within your organization. Different organizations might have
     *        different criteria for model card review and approval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Draft</code>: The model card is a work in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingReview</code>: The model card is pending review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approved</code>: The model card is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *        it can still be exported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public ModelCardVersionSummary withModelCardStatus(String modelCardStatus) {
        setModelCardStatus(modelCardStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of the model card version within your organization. Different organizations might have
     * different criteria for model card review and approval.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Draft</code>: The model card is a work in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PendingReview</code>: The model card is pending review.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Approved</code>: The model card is approved.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but it can
     * still be exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelCardStatus
     *        The approval status of the model card version within your organization. Different organizations might have
     *        different criteria for model card review and approval.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Draft</code>: The model card is a work in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PendingReview</code>: The model card is pending review.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Approved</code>: The model card is approved.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Archived</code>: The model card is archived. No more updates should be made to the model card, but
     *        it can still be exported.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardStatus
     */

    public ModelCardVersionSummary withModelCardStatus(ModelCardStatus modelCardStatus) {
        this.modelCardStatus = modelCardStatus.toString();
        return this;
    }

    /**
     * <p>
     * A version of the model card.
     * </p>
     * 
     * @param modelCardVersion
     *        A version of the model card.
     */

    public void setModelCardVersion(Integer modelCardVersion) {
        this.modelCardVersion = modelCardVersion;
    }

    /**
     * <p>
     * A version of the model card.
     * </p>
     * 
     * @return A version of the model card.
     */

    public Integer getModelCardVersion() {
        return this.modelCardVersion;
    }

    /**
     * <p>
     * A version of the model card.
     * </p>
     * 
     * @param modelCardVersion
     *        A version of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardVersionSummary withModelCardVersion(Integer modelCardVersion) {
        setModelCardVersion(modelCardVersion);
        return this;
    }

    /**
     * <p>
     * The date and time that the model card version was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the model card version was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the model card version was created.
     * </p>
     * 
     * @return The date and time that the model card version was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the model card version was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the model card version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardVersionSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time date and time that the model card version was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time date and time that the model card version was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time date and time that the model card version was last modified.
     * </p>
     * 
     * @return The time date and time that the model card version was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time date and time that the model card version was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time date and time that the model card version was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelCardVersionSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getModelCardName() != null)
            sb.append("ModelCardName: ").append(getModelCardName()).append(",");
        if (getModelCardArn() != null)
            sb.append("ModelCardArn: ").append(getModelCardArn()).append(",");
        if (getModelCardStatus() != null)
            sb.append("ModelCardStatus: ").append(getModelCardStatus()).append(",");
        if (getModelCardVersion() != null)
            sb.append("ModelCardVersion: ").append(getModelCardVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelCardVersionSummary == false)
            return false;
        ModelCardVersionSummary other = (ModelCardVersionSummary) obj;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getModelCardArn() == null ^ this.getModelCardArn() == null)
            return false;
        if (other.getModelCardArn() != null && other.getModelCardArn().equals(this.getModelCardArn()) == false)
            return false;
        if (other.getModelCardStatus() == null ^ this.getModelCardStatus() == null)
            return false;
        if (other.getModelCardStatus() != null && other.getModelCardStatus().equals(this.getModelCardStatus()) == false)
            return false;
        if (other.getModelCardVersion() == null ^ this.getModelCardVersion() == null)
            return false;
        if (other.getModelCardVersion() != null && other.getModelCardVersion().equals(this.getModelCardVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getModelCardArn() == null) ? 0 : getModelCardArn().hashCode());
        hashCode = prime * hashCode + ((getModelCardStatus() == null) ? 0 : getModelCardStatus().hashCode());
        hashCode = prime * hashCode + ((getModelCardVersion() == null) ? 0 : getModelCardVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public ModelCardVersionSummary clone() {
        try {
            return (ModelCardVersionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelCardVersionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
