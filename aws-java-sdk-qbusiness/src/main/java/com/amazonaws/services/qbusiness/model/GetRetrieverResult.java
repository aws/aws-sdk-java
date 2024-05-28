/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetRetriever" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRetrieverResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the retriever.
     * </p>
     */
    private String retrieverId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
     * </p>
     */
    private String retrieverArn;
    /**
     * <p>
     * The type of the retriever.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status of the retriever.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the retriever.
     * </p>
     */
    private String displayName;

    private RetrieverConfiguration configuration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the retriever and required resources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Unix timestamp when the retriever was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the retriever was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application using the retriever.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application using the retriever.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application using the retriever.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application using the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the retriever.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever.
     */

    public void setRetrieverId(String retrieverId) {
        this.retrieverId = retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever.
     * </p>
     * 
     * @return The identifier of the retriever.
     */

    public String getRetrieverId() {
        return this.retrieverId;
    }

    /**
     * <p>
     * The identifier of the retriever.
     * </p>
     * 
     * @param retrieverId
     *        The identifier of the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withRetrieverId(String retrieverId) {
        setRetrieverId(retrieverId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
     * </p>
     * 
     * @param retrieverArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
     */

    public void setRetrieverArn(String retrieverArn) {
        this.retrieverArn = retrieverArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
     */

    public String getRetrieverArn() {
        return this.retrieverArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
     * </p>
     * 
     * @param retrieverArn
     *        The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withRetrieverArn(String retrieverArn) {
        setRetrieverArn(retrieverArn);
        return this;
    }

    /**
     * <p>
     * The type of the retriever.
     * </p>
     * 
     * @param type
     *        The type of the retriever.
     * @see RetrieverType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the retriever.
     * </p>
     * 
     * @return The type of the retriever.
     * @see RetrieverType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the retriever.
     * </p>
     * 
     * @param type
     *        The type of the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverType
     */

    public GetRetrieverResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the retriever.
     * </p>
     * 
     * @param type
     *        The type of the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverType
     */

    public GetRetrieverResult withType(RetrieverType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of the retriever.
     * </p>
     * 
     * @param status
     *        The status of the retriever.
     * @see RetrieverStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the retriever.
     * </p>
     * 
     * @return The status of the retriever.
     * @see RetrieverStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the retriever.
     * </p>
     * 
     * @param status
     *        The status of the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverStatus
     */

    public GetRetrieverResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the retriever.
     * </p>
     * 
     * @param status
     *        The status of the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrieverStatus
     */

    public GetRetrieverResult withStatus(RetrieverStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The name of the retriever.
     * </p>
     * 
     * @param displayName
     *        The name of the retriever.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the retriever.
     * </p>
     * 
     * @return The name of the retriever.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the retriever.
     * </p>
     * 
     * @param displayName
     *        The name of the retriever.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * @param configuration
     */

    public void setConfiguration(RetrieverConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * @return
     */

    public RetrieverConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @param configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withConfiguration(RetrieverConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the retriever and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with the permission to access the retriever and required
     *        resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the retriever and required resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role with the permission to access the retriever and required
     *         resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with the permission to access the retriever and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with the permission to access the retriever and required
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the retriever was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the retriever was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the retriever was created.
     * </p>
     * 
     * @return The Unix timestamp when the retriever was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the retriever was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the retriever was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the retriever was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the retriever was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the retriever was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the retriever was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the retriever was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the retriever was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRetrieverResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getRetrieverId() != null)
            sb.append("RetrieverId: ").append(getRetrieverId()).append(",");
        if (getRetrieverArn() != null)
            sb.append("RetrieverArn: ").append(getRetrieverArn()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRetrieverResult == false)
            return false;
        GetRetrieverResult other = (GetRetrieverResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRetrieverId() == null ^ this.getRetrieverId() == null)
            return false;
        if (other.getRetrieverId() != null && other.getRetrieverId().equals(this.getRetrieverId()) == false)
            return false;
        if (other.getRetrieverArn() == null ^ this.getRetrieverArn() == null)
            return false;
        if (other.getRetrieverArn() != null && other.getRetrieverArn().equals(this.getRetrieverArn()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRetrieverId() == null) ? 0 : getRetrieverId().hashCode());
        hashCode = prime * hashCode + ((getRetrieverArn() == null) ? 0 : getRetrieverArn().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetRetrieverResult clone() {
        try {
            return (GetRetrieverResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
