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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a knowledge base.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/KnowledgeBase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KnowledgeBase implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time at which the knowledge base was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of reasons that the API operation on the knowledge base failed.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     */
    private String knowledgeBaseArn;
    /**
     * <p>
     * Contains details about the embeddings configuration of the knowledge base.
     * </p>
     */
    private KnowledgeBaseConfiguration knowledgeBaseConfiguration;
    /**
     * <p>
     * The unique identifier of the knowledge base.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the knowledge base.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the knowledge base. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The knowledge base is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The knowledge base is ready to be queried.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The knowledge base is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The knowledge base is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The knowledge base API operation failed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base.
     * </p>
     */
    private StorageConfiguration storageConfiguration;
    /**
     * <p>
     * The time at which the knowledge base was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The time at which the knowledge base was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the knowledge base was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the knowledge base was created.
     * </p>
     * 
     * @return The time at which the knowledge base was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the knowledge base was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the knowledge base was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     * 
     * @param description
     *        The description of the knowledge base.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     * 
     * @return The description of the knowledge base.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the knowledge base.
     * </p>
     * 
     * @param description
     *        The description of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of reasons that the API operation on the knowledge base failed.
     * </p>
     * 
     * @return A list of reasons that the API operation on the knowledge base failed.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * A list of reasons that the API operation on the knowledge base failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the API operation on the knowledge base failed.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * A list of reasons that the API operation on the knowledge base failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the API operation on the knowledge base failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of reasons that the API operation on the knowledge base failed.
     * </p>
     * 
     * @param failureReasons
     *        A list of reasons that the API operation on the knowledge base failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     */

    public void setKnowledgeBaseArn(String knowledgeBaseArn) {
        this.knowledgeBaseArn = knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the knowledge base.
     */

    public String getKnowledgeBaseArn() {
        return this.knowledgeBaseArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseArn
     *        The Amazon Resource Name (ARN) of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withKnowledgeBaseArn(String knowledgeBaseArn) {
        setKnowledgeBaseArn(knowledgeBaseArn);
        return this;
    }

    /**
     * <p>
     * Contains details about the embeddings configuration of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Contains details about the embeddings configuration of the knowledge base.
     */

    public void setKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        this.knowledgeBaseConfiguration = knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the embeddings configuration of the knowledge base.
     * </p>
     * 
     * @return Contains details about the embeddings configuration of the knowledge base.
     */

    public KnowledgeBaseConfiguration getKnowledgeBaseConfiguration() {
        return this.knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the embeddings configuration of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Contains details about the embeddings configuration of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        setKnowledgeBaseConfiguration(knowledgeBaseConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base.
     * </p>
     * 
     * @return The unique identifier of the knowledge base.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     * 
     * @param name
     *        The name of the knowledge base.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     * 
     * @return The name of the knowledge base.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the knowledge base.
     * </p>
     * 
     * @param name
     *        The name of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the knowledge base.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the knowledge
     *        base.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the knowledge base.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the knowledge
     *         base.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the knowledge base.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the knowledge
     *        base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the knowledge base. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The knowledge base is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The knowledge base is ready to be queried.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The knowledge base is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The knowledge base is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The knowledge base API operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the knowledge base. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The knowledge base is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The knowledge base is ready to be queried.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The knowledge base is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The knowledge base is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The knowledge base API operation failed.
     *        </p>
     *        </li>
     * @see KnowledgeBaseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the knowledge base. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The knowledge base is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The knowledge base is ready to be queried.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The knowledge base is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The knowledge base is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The knowledge base API operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the knowledge base. The following statuses are possible:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATING – The knowledge base is being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE – The knowledge base is ready to be queried.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETING – The knowledge base is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UPDATING – The knowledge base is being updated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FAILED – The knowledge base API operation failed.
     *         </p>
     *         </li>
     * @see KnowledgeBaseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the knowledge base. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The knowledge base is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The knowledge base is ready to be queried.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The knowledge base is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The knowledge base is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The knowledge base API operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the knowledge base. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The knowledge base is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The knowledge base is ready to be queried.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The knowledge base is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The knowledge base is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The knowledge base API operation failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStatus
     */

    public KnowledgeBase withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the knowledge base. The following statuses are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATING – The knowledge base is being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE – The knowledge base is ready to be queried.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETING – The knowledge base is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * UPDATING – The knowledge base is being updated.
     * </p>
     * </li>
     * <li>
     * <p>
     * FAILED – The knowledge base API operation failed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the knowledge base. The following statuses are possible:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATING – The knowledge base is being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE – The knowledge base is ready to be queried.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETING – The knowledge base is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UPDATING – The knowledge base is being updated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FAILED – The knowledge base API operation failed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KnowledgeBaseStatus
     */

    public KnowledgeBase withStatus(KnowledgeBaseStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base.
     * </p>
     * 
     * @param storageConfiguration
     *        Contains details about the storage configuration of the knowledge base.
     */

    public void setStorageConfiguration(StorageConfiguration storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base.
     * </p>
     * 
     * @return Contains details about the storage configuration of the knowledge base.
     */

    public StorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * <p>
     * Contains details about the storage configuration of the knowledge base.
     * </p>
     * 
     * @param storageConfiguration
     *        Contains details about the storage configuration of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withStorageConfiguration(StorageConfiguration storageConfiguration) {
        setStorageConfiguration(storageConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the knowledge base was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the knowledge base was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The time at which the knowledge base was last updated.
     * </p>
     * 
     * @return The time at which the knowledge base was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The time at which the knowledge base was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The time at which the knowledge base was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KnowledgeBase withUpdatedAt(java.util.Date updatedAt) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getKnowledgeBaseArn() != null)
            sb.append("KnowledgeBaseArn: ").append(getKnowledgeBaseArn()).append(",");
        if (getKnowledgeBaseConfiguration() != null)
            sb.append("KnowledgeBaseConfiguration: ").append(getKnowledgeBaseConfiguration()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStorageConfiguration() != null)
            sb.append("StorageConfiguration: ").append(getStorageConfiguration()).append(",");
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

        if (obj instanceof KnowledgeBase == false)
            return false;
        KnowledgeBase other = (KnowledgeBase) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getKnowledgeBaseArn() == null ^ this.getKnowledgeBaseArn() == null)
            return false;
        if (other.getKnowledgeBaseArn() != null && other.getKnowledgeBaseArn().equals(this.getKnowledgeBaseArn()) == false)
            return false;
        if (other.getKnowledgeBaseConfiguration() == null ^ this.getKnowledgeBaseConfiguration() == null)
            return false;
        if (other.getKnowledgeBaseConfiguration() != null && other.getKnowledgeBaseConfiguration().equals(this.getKnowledgeBaseConfiguration()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStorageConfiguration() == null ^ this.getStorageConfiguration() == null)
            return false;
        if (other.getStorageConfiguration() != null && other.getStorageConfiguration().equals(this.getStorageConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseArn() == null) ? 0 : getKnowledgeBaseArn().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseConfiguration() == null) ? 0 : getKnowledgeBaseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStorageConfiguration() == null) ? 0 : getStorageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public KnowledgeBase clone() {
        try {
            return (KnowledgeBase) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagent.model.transform.KnowledgeBaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
