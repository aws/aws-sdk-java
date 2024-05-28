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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CreateKxEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the kdb environment that you want to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of key-value pairs to label the kdb environment. You can add up to 50 tags to your kdb environment.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the kdb environment that you want to create.
     * </p>
     * 
     * @param name
     *        The name of the kdb environment that you want to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the kdb environment that you want to create.
     * </p>
     * 
     * @return The name of the kdb environment that you want to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the kdb environment that you want to create.
     * </p>
     * 
     * @param name
     *        The name of the kdb environment that you want to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     * 
     * @param description
     *        A description for the kdb environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     * 
     * @return A description for the kdb environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the kdb environment.
     * </p>
     * 
     * @param description
     *        A description for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key ID to encrypt your data in the FinSpace environment.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @return The KMS key ID to encrypt your data in the FinSpace environment.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key ID to encrypt your data in the FinSpace environment.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key ID to encrypt your data in the FinSpace environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs to label the kdb environment. You can add up to 50 tags to your kdb environment.
     * </p>
     * 
     * @return A list of key-value pairs to label the kdb environment. You can add up to 50 tags to your kdb
     *         environment.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the kdb environment. You can add up to 50 tags to your kdb environment.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the kdb environment. You can add up to 50 tags to your kdb environment.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs to label the kdb environment. You can add up to 50 tags to your kdb environment.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs to label the kdb environment. You can add up to 50 tags to your kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateKxEnvironmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentRequest addTagsEntry(String key, String value) {
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

    public CreateKxEnvironmentRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @return A token that ensures idempotency. This token expires in 10 minutes.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A token that ensures idempotency. This token expires in 10 minutes.
     * </p>
     * 
     * @param clientToken
     *        A token that ensures idempotency. This token expires in 10 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateKxEnvironmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateKxEnvironmentRequest == false)
            return false;
        CreateKxEnvironmentRequest other = (CreateKxEnvironmentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateKxEnvironmentRequest clone() {
        return (CreateKxEnvironmentRequest) super.clone();
    }

}
