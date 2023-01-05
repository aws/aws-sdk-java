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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelCard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelCardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the model card.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for regulated
     * workloads with highly sensitive data.
     * </p>
     */
    private ModelCardSecurityConfig securityConfig;
    /**
     * <p>
     * The content of the model card. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     */
    private String content;
    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
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
     * Key-value pairs used to manage metadata for model cards.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique name of the model card.
     * </p>
     * 
     * @param modelCardName
     *        The unique name of the model card.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * The unique name of the model card.
     * </p>
     * 
     * @return The unique name of the model card.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * The unique name of the model card.
     * </p>
     * 
     * @param modelCardName
     *        The unique name of the model card.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardRequest withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for regulated
     * workloads with highly sensitive data.
     * </p>
     * 
     * @param securityConfig
     *        An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for
     *        regulated workloads with highly sensitive data.
     */

    public void setSecurityConfig(ModelCardSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for regulated
     * workloads with highly sensitive data.
     * </p>
     * 
     * @return An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for
     *         regulated workloads with highly sensitive data.
     */

    public ModelCardSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for regulated
     * workloads with highly sensitive data.
     * </p>
     * 
     * @param securityConfig
     *        An optional Key Management Service key to encrypt, decrypt, and re-encrypt model card content for
     *        regulated workloads with highly sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardRequest withSecurityConfig(ModelCardSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
        return this;
    }

    /**
     * <p>
     * The content of the model card. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     * 
     * @param content
     *        The content of the model card. Content must be in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     *        schema</a> and provided as a string.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The content of the model card. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     * 
     * @return The content of the model card. Content must be in <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     *         schema</a> and provided as a string.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The content of the model card. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     * 
     * @param content
     *        The content of the model card. Content must be in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     *        schema</a> and provided as a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardRequest withContent(String content) {
        setContent(content);
        return this;
    }

    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
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
     *        The approval status of the model card within your organization. Different organizations might have
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
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
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
     * @return The approval status of the model card within your organization. Different organizations might have
     *         different criteria for model card review and approval.</p>
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
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
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
     *        The approval status of the model card within your organization. Different organizations might have
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

    public CreateModelCardRequest withModelCardStatus(String modelCardStatus) {
        setModelCardStatus(modelCardStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of the model card within your organization. Different organizations might have different
     * criteria for model card review and approval.
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
     *        The approval status of the model card within your organization. Different organizations might have
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

    public CreateModelCardRequest withModelCardStatus(ModelCardStatus modelCardStatus) {
        this.modelCardStatus = modelCardStatus.toString();
        return this;
    }

    /**
     * <p>
     * Key-value pairs used to manage metadata for model cards.
     * </p>
     * 
     * @return Key-value pairs used to manage metadata for model cards.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs used to manage metadata for model cards.
     * </p>
     * 
     * @param tags
     *        Key-value pairs used to manage metadata for model cards.
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
     * Key-value pairs used to manage metadata for model cards.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs used to manage metadata for model cards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardRequest withTags(Tag... tags) {
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
     * Key-value pairs used to manage metadata for model cards.
     * </p>
     * 
     * @param tags
     *        Key-value pairs used to manage metadata for model cards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getModelCardName() != null)
            sb.append("ModelCardName: ").append(getModelCardName()).append(",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getModelCardStatus() != null)
            sb.append("ModelCardStatus: ").append(getModelCardStatus()).append(",");
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

        if (obj instanceof CreateModelCardRequest == false)
            return false;
        CreateModelCardRequest other = (CreateModelCardRequest) obj;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getModelCardStatus() == null ^ this.getModelCardStatus() == null)
            return false;
        if (other.getModelCardStatus() != null && other.getModelCardStatus().equals(this.getModelCardStatus()) == false)
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

        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getModelCardStatus() == null) ? 0 : getModelCardStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelCardRequest clone() {
        return (CreateModelCardRequest) super.clone();
    }

}
