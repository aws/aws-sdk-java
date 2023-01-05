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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateModelCard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateModelCardRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model card to update.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * The updated model card content. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     * <p>
     * When updating model card content, be sure to include the full content and not just updated content.
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
     * The name of the model card to update.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card to update.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * The name of the model card to update.
     * </p>
     * 
     * @return The name of the model card to update.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * The name of the model card to update.
     * </p>
     * 
     * @param modelCardName
     *        The name of the model card to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelCardRequest withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * The updated model card content. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     * <p>
     * When updating model card content, be sure to include the full content and not just updated content.
     * </p>
     * 
     * @param content
     *        The updated model card content. Content must be in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     *        schema</a> and provided as a string.</p>
     *        <p>
     *        When updating model card content, be sure to include the full content and not just updated content.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The updated model card content. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     * <p>
     * When updating model card content, be sure to include the full content and not just updated content.
     * </p>
     * 
     * @return The updated model card content. Content must be in <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     *         schema</a> and provided as a string.</p>
     *         <p>
     *         When updating model card content, be sure to include the full content and not just updated content.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The updated model card content. Content must be in <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     * schema</a> and provided as a string.
     * </p>
     * <p>
     * When updating model card content, be sure to include the full content and not just updated content.
     * </p>
     * 
     * @param content
     *        The updated model card content. Content must be in <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-cards-api-json-schema.html">model card JSON
     *        schema</a> and provided as a string.</p>
     *        <p>
     *        When updating model card content, be sure to include the full content and not just updated content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateModelCardRequest withContent(String content) {
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

    public UpdateModelCardRequest withModelCardStatus(String modelCardStatus) {
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

    public UpdateModelCardRequest withModelCardStatus(ModelCardStatus modelCardStatus) {
        this.modelCardStatus = modelCardStatus.toString();
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
        if (getContent() != null)
            sb.append("Content: ").append("***Sensitive Data Redacted***").append(",");
        if (getModelCardStatus() != null)
            sb.append("ModelCardStatus: ").append(getModelCardStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateModelCardRequest == false)
            return false;
        UpdateModelCardRequest other = (UpdateModelCardRequest) obj;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getModelCardStatus() == null ^ this.getModelCardStatus() == null)
            return false;
        if (other.getModelCardStatus() != null && other.getModelCardStatus().equals(this.getModelCardStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getModelCardStatus() == null) ? 0 : getModelCardStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateModelCardRequest clone() {
        return (UpdateModelCardRequest) super.clone();
    }

}
