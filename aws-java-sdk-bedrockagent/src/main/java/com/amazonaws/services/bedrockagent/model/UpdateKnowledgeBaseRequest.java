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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/UpdateKnowledgeBase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateKnowledgeBaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a new description for the knowledge base.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the configuration for the embeddings model used for the knowledge base. You must use the same
     * configuration as when the knowledge base was created.
     * </p>
     */
    private KnowledgeBaseConfiguration knowledgeBaseConfiguration;
    /**
     * <p>
     * The unique identifier of the knowledge base to update.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * Specifies a new name for the knowledge base.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies a different Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
     * knowledge base.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Specifies the configuration for the vector store used for the knowledge base. You must use the same configuration
     * as when the knowledge base was created.
     * </p>
     */
    private StorageConfiguration storageConfiguration;

    /**
     * <p>
     * Specifies a new description for the knowledge base.
     * </p>
     * 
     * @param description
     *        Specifies a new description for the knowledge base.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Specifies a new description for the knowledge base.
     * </p>
     * 
     * @return Specifies a new description for the knowledge base.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Specifies a new description for the knowledge base.
     * </p>
     * 
     * @param description
     *        Specifies a new description for the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for the embeddings model used for the knowledge base. You must use the same
     * configuration as when the knowledge base was created.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Specifies the configuration for the embeddings model used for the knowledge base. You must use the same
     *        configuration as when the knowledge base was created.
     */

    public void setKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        this.knowledgeBaseConfiguration = knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Specifies the configuration for the embeddings model used for the knowledge base. You must use the same
     * configuration as when the knowledge base was created.
     * </p>
     * 
     * @return Specifies the configuration for the embeddings model used for the knowledge base. You must use the same
     *         configuration as when the knowledge base was created.
     */

    public KnowledgeBaseConfiguration getKnowledgeBaseConfiguration() {
        return this.knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Specifies the configuration for the embeddings model used for the knowledge base. You must use the same
     * configuration as when the knowledge base was created.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Specifies the configuration for the embeddings model used for the knowledge base. You must use the same
     *        configuration as when the knowledge base was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseRequest withKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        setKnowledgeBaseConfiguration(knowledgeBaseConfiguration);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to update.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to update.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to update.
     * </p>
     * 
     * @return The unique identifier of the knowledge base to update.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base to update.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * Specifies a new name for the knowledge base.
     * </p>
     * 
     * @param name
     *        Specifies a new name for the knowledge base.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies a new name for the knowledge base.
     * </p>
     * 
     * @return Specifies a new name for the knowledge base.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies a new name for the knowledge base.
     * </p>
     * 
     * @param name
     *        Specifies a new name for the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies a different Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
     * knowledge base.
     * </p>
     * 
     * @param roleArn
     *        Specifies a different Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations
     *        on the knowledge base.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * Specifies a different Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
     * knowledge base.
     * </p>
     * 
     * @return Specifies a different Amazon Resource Name (ARN) of the IAM role with permissions to invoke API
     *         operations on the knowledge base.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * Specifies a different Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations on the
     * knowledge base.
     * </p>
     * 
     * @param roleArn
     *        Specifies a different Amazon Resource Name (ARN) of the IAM role with permissions to invoke API operations
     *        on the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for the vector store used for the knowledge base. You must use the same configuration
     * as when the knowledge base was created.
     * </p>
     * 
     * @param storageConfiguration
     *        Specifies the configuration for the vector store used for the knowledge base. You must use the same
     *        configuration as when the knowledge base was created.
     */

    public void setStorageConfiguration(StorageConfiguration storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
    }

    /**
     * <p>
     * Specifies the configuration for the vector store used for the knowledge base. You must use the same configuration
     * as when the knowledge base was created.
     * </p>
     * 
     * @return Specifies the configuration for the vector store used for the knowledge base. You must use the same
     *         configuration as when the knowledge base was created.
     */

    public StorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * <p>
     * Specifies the configuration for the vector store used for the knowledge base. You must use the same configuration
     * as when the knowledge base was created.
     * </p>
     * 
     * @param storageConfiguration
     *        Specifies the configuration for the vector store used for the knowledge base. You must use the same
     *        configuration as when the knowledge base was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateKnowledgeBaseRequest withStorageConfiguration(StorageConfiguration storageConfiguration) {
        setStorageConfiguration(storageConfiguration);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKnowledgeBaseConfiguration() != null)
            sb.append("KnowledgeBaseConfiguration: ").append(getKnowledgeBaseConfiguration()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStorageConfiguration() != null)
            sb.append("StorageConfiguration: ").append(getStorageConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateKnowledgeBaseRequest == false)
            return false;
        UpdateKnowledgeBaseRequest other = (UpdateKnowledgeBaseRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getStorageConfiguration() == null ^ this.getStorageConfiguration() == null)
            return false;
        if (other.getStorageConfiguration() != null && other.getStorageConfiguration().equals(this.getStorageConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseConfiguration() == null) ? 0 : getKnowledgeBaseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStorageConfiguration() == null) ? 0 : getStorageConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateKnowledgeBaseRequest clone() {
        return (UpdateKnowledgeBaseRequest) super.clone();
    }

}
