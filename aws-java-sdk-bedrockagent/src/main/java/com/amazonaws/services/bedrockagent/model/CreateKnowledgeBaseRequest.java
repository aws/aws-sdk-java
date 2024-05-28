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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/CreateKnowledgeBase" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKnowledgeBaseRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A description of the knowledge base.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Contains details about the embeddings model used for the knowledge base.
     * </p>
     */
    private KnowledgeBaseConfiguration knowledgeBaseConfiguration;
    /**
     * <p>
     * A name for the knowledge base.
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
     * Contains details about the configuration of the vector database used for the knowledge base.
     * </p>
     */
    private StorageConfiguration storageConfiguration;
    /**
     * <p>
     * Specify the key-value pairs for the tags that you want to attach to your knowledge base in this object.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *         this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If this token
     * matches a previous request, Amazon Bedrock ignores the request, but does not return an error. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier to ensure that the API request completes no more than one time. If
     *        this token matches a previous request, Amazon Bedrock ignores the request, but does not return an error.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A description of the knowledge base.
     * </p>
     * 
     * @param description
     *        A description of the knowledge base.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the knowledge base.
     * </p>
     * 
     * @return A description of the knowledge base.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the knowledge base.
     * </p>
     * 
     * @param description
     *        A description of the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Contains details about the embeddings model used for the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Contains details about the embeddings model used for the knowledge base.
     */

    public void setKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        this.knowledgeBaseConfiguration = knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the embeddings model used for the knowledge base.
     * </p>
     * 
     * @return Contains details about the embeddings model used for the knowledge base.
     */

    public KnowledgeBaseConfiguration getKnowledgeBaseConfiguration() {
        return this.knowledgeBaseConfiguration;
    }

    /**
     * <p>
     * Contains details about the embeddings model used for the knowledge base.
     * </p>
     * 
     * @param knowledgeBaseConfiguration
     *        Contains details about the embeddings model used for the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withKnowledgeBaseConfiguration(KnowledgeBaseConfiguration knowledgeBaseConfiguration) {
        setKnowledgeBaseConfiguration(knowledgeBaseConfiguration);
        return this;
    }

    /**
     * <p>
     * A name for the knowledge base.
     * </p>
     * 
     * @param name
     *        A name for the knowledge base.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the knowledge base.
     * </p>
     * 
     * @return A name for the knowledge base.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the knowledge base.
     * </p>
     * 
     * @param name
     *        A name for the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withName(String name) {
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

    public CreateKnowledgeBaseRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Contains details about the configuration of the vector database used for the knowledge base.
     * </p>
     * 
     * @param storageConfiguration
     *        Contains details about the configuration of the vector database used for the knowledge base.
     */

    public void setStorageConfiguration(StorageConfiguration storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the vector database used for the knowledge base.
     * </p>
     * 
     * @return Contains details about the configuration of the vector database used for the knowledge base.
     */

    public StorageConfiguration getStorageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * <p>
     * Contains details about the configuration of the vector database used for the knowledge base.
     * </p>
     * 
     * @param storageConfiguration
     *        Contains details about the configuration of the vector database used for the knowledge base.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withStorageConfiguration(StorageConfiguration storageConfiguration) {
        setStorageConfiguration(storageConfiguration);
        return this;
    }

    /**
     * <p>
     * Specify the key-value pairs for the tags that you want to attach to your knowledge base in this object.
     * </p>
     * 
     * @return Specify the key-value pairs for the tags that you want to attach to your knowledge base in this object.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specify the key-value pairs for the tags that you want to attach to your knowledge base in this object.
     * </p>
     * 
     * @param tags
     *        Specify the key-value pairs for the tags that you want to attach to your knowledge base in this object.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Specify the key-value pairs for the tags that you want to attach to your knowledge base in this object.
     * </p>
     * 
     * @param tags
     *        Specify the key-value pairs for the tags that you want to attach to your knowledge base in this object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateKnowledgeBaseRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKnowledgeBaseRequest clearTagsEntries() {
        this.tags = null;
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKnowledgeBaseConfiguration() != null)
            sb.append("KnowledgeBaseConfiguration: ").append(getKnowledgeBaseConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStorageConfiguration() != null)
            sb.append("StorageConfiguration: ").append(getStorageConfiguration()).append(",");
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

        if (obj instanceof CreateKnowledgeBaseRequest == false)
            return false;
        CreateKnowledgeBaseRequest other = (CreateKnowledgeBaseRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKnowledgeBaseConfiguration() == null ^ this.getKnowledgeBaseConfiguration() == null)
            return false;
        if (other.getKnowledgeBaseConfiguration() != null && other.getKnowledgeBaseConfiguration().equals(this.getKnowledgeBaseConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseConfiguration() == null) ? 0 : getKnowledgeBaseConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStorageConfiguration() == null) ? 0 : getStorageConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateKnowledgeBaseRequest clone() {
        return (CreateKnowledgeBaseRequest) super.clone();
    }

}
