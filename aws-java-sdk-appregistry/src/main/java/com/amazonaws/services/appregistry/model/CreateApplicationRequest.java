/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appregistry.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWS242AppRegistry-2020-06-24/CreateApplication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the application.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Key-value pairs you can use to associate with the application.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * the retry fails.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     * 
     * @param name
     *        The name of the application. The name must be unique in the region in which you are creating the
     *        application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     * 
     * @return The name of the application. The name must be unique in the region in which you are creating the
     *         application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the application. The name must be unique in the region in which you are creating the application.
     * </p>
     * 
     * @param name
     *        The name of the application. The name must be unique in the region in which you are creating the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @return The description of the application.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the application.
     * </p>
     * 
     * @param description
     *        The description of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Key-value pairs you can use to associate with the application.
     * </p>
     * 
     * @return Key-value pairs you can use to associate with the application.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs you can use to associate with the application.
     * </p>
     * 
     * @param tags
     *        Key-value pairs you can use to associate with the application.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Key-value pairs you can use to associate with the application.
     * </p>
     * 
     * @param tags
     *        Key-value pairs you can use to associate with the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateApplicationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest addTagsEntry(String key, String value) {
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

    public CreateApplicationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you provide to ensure idempotency. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * the retry fails.
     * </p>
     * 
     * @return A unique identifier that you provide to ensure idempotency. If you retry a request that completed
     *         successfully using the same client token and the same parameters, the retry succeeds without performing
     *         any further actions. If you retry a successful request using the same client token, but one or more of
     *         the parameters are different, the retry fails.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique identifier that you provide to ensure idempotency. If you retry a request that completed successfully
     * using the same client token and the same parameters, the retry succeeds without performing any further actions.
     * If you retry a successful request using the same client token, but one or more of the parameters are different,
     * the retry fails.
     * </p>
     * 
     * @param clientToken
     *        A unique identifier that you provide to ensure idempotency. If you retry a request that completed
     *        successfully using the same client token and the same parameters, the retry succeeds without performing
     *        any further actions. If you retry a successful request using the same client token, but one or more of the
     *        parameters are different, the retry fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApplicationRequest withClientToken(String clientToken) {
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

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }

}
