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
package com.amazonaws.services.migrationhubrefactorspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migration-hub-refactor-spaces-2021-10-26/CreateEnvironment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     */
    private String networkFabricType;
    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @return The description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @param networkFabricType
     *        The network fabric type of the environment.
     * @see NetworkFabricType
     */

    public void setNetworkFabricType(String networkFabricType) {
        this.networkFabricType = networkFabricType;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @return The network fabric type of the environment.
     * @see NetworkFabricType
     */

    public String getNetworkFabricType() {
        return this.networkFabricType;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @param networkFabricType
     *        The network fabric type of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkFabricType
     */

    public CreateEnvironmentRequest withNetworkFabricType(String networkFabricType) {
        setNetworkFabricType(networkFabricType);
        return this;
    }

    /**
     * <p>
     * The network fabric type of the environment.
     * </p>
     * 
     * @param networkFabricType
     *        The network fabric type of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkFabricType
     */

    public CreateEnvironmentRequest withNetworkFabricType(NetworkFabricType networkFabricType) {
        this.networkFabricType = networkFabricType.toString();
        return this;
    }

    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @return The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services
     *         resource. Each tag consists of a key-value pair.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services resource. Each
     * tag consists of a key-value pair.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the environment. A tag is a label that you assign to an Amazon Web Services
     *        resource. Each tag consists of a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateEnvironmentRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest addTagsEntry(String key, String value) {
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

    public CreateEnvironmentRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkFabricType() != null)
            sb.append("NetworkFabricType: ").append(getNetworkFabricType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkFabricType() == null ^ this.getNetworkFabricType() == null)
            return false;
        if (other.getNetworkFabricType() != null && other.getNetworkFabricType().equals(this.getNetworkFabricType()) == false)
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkFabricType() == null) ? 0 : getNetworkFabricType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
