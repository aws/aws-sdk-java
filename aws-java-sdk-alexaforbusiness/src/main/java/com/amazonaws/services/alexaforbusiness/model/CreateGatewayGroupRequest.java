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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/CreateGatewayGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGatewayGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the gateway group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the gateway group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the gateway group.
     * </p>
     * 
     * @param name
     *        The name of the gateway group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the gateway group.
     * </p>
     * 
     * @return The name of the gateway group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the gateway group.
     * </p>
     * 
     * @param name
     *        The name of the gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the gateway group.
     * </p>
     * 
     * @param description
     *        The description of the gateway group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the gateway group.
     * </p>
     * 
     * @return The description of the gateway group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the gateway group.
     * </p>
     * 
     * @param description
     *        The description of the gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for the request that ensures idempotency.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     * 
     * @return A unique, user-specified identifier for the request that ensures idempotency.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, user-specified identifier for the request that ensures idempotency.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, user-specified identifier for the request that ensures idempotency.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayGroupRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * 
     * @return The tags to be added to the specified resource. Do not provide system tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * 
     * @param tags
     *        The tags to be added to the specified resource. Do not provide system tags.
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
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be added to the specified resource. Do not provide system tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayGroupRequest withTags(Tag... tags) {
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
     * The tags to be added to the specified resource. Do not provide system tags.
     * </p>
     * 
     * @param tags
     *        The tags to be added to the specified resource. Do not provide system tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
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

        if (obj instanceof CreateGatewayGroupRequest == false)
            return false;
        CreateGatewayGroupRequest other = (CreateGatewayGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateGatewayGroupRequest clone() {
        return (CreateGatewayGroupRequest) super.clone();
    }

}
