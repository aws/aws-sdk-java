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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateServiceNetwork" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceNetworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     */
    private String authType;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the service network. The name must be unique to the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The tags for the service network.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of IAM policy.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an
     *         auth policy is required.
     *         </p>
     *         </li>
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateServiceNetworkRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateServiceNetworkRequest withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *         retry a request that completed successfully using the same client token and parameters, the retry
     *         succeeds without performing any actions. If the parameters aren't identical, the retry fails.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a
     * request that completed successfully using the same client token and parameters, the retry succeeds without
     * performing any actions. If the parameters aren't identical, the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you
     *        retry a request that completed successfully using the same client token and parameters, the retry succeeds
     *        without performing any actions. If the parameters aren't identical, the retry fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the service network. The name must be unique to the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the service network. The name must be unique to the account. The valid characters are a-z,
     *        0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service network. The name must be unique to the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @return The name of the service network. The name must be unique to the account. The valid characters are a-z,
     *         0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *         hyphen.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service network. The name must be unique to the account. The valid characters are a-z, 0-9, and
     * hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     * </p>
     * 
     * @param name
     *        The name of the service network. The name must be unique to the account. The valid characters are a-z,
     *        0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another
     *        hyphen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The tags for the service network.
     * </p>
     * 
     * @return The tags for the service network.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the service network.
     * </p>
     * 
     * @param tags
     *        The tags for the service network.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the service network.
     * </p>
     * 
     * @param tags
     *        The tags for the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateServiceNetworkRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceNetworkRequest addTagsEntry(String key, String value) {
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

    public CreateServiceNetworkRequest clearTagsEntries() {
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
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateServiceNetworkRequest == false)
            return false;
        CreateServiceNetworkRequest other = (CreateServiceNetworkRequest) obj;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceNetworkRequest clone() {
        return (CreateServiceNetworkRequest) super.clone();
    }

}
