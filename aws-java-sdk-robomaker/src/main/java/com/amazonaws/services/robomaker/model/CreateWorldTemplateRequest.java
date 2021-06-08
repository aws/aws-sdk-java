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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateWorldTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorldTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * The name of the world template.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The world template body.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The location of the world template.
     * </p>
     */
    private TemplateLocation templateLocation;
    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world template.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientRequestToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldTemplateRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The name of the world template.
     * </p>
     * 
     * @param name
     *        The name of the world template.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the world template.
     * </p>
     * 
     * @return The name of the world template.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the world template.
     * </p>
     * 
     * @param name
     *        The name of the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldTemplateRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @param templateBody
     *        The world template body.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @return The world template body.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The world template body.
     * </p>
     * 
     * @param templateBody
     *        The world template body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldTemplateRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The location of the world template.
     * </p>
     * 
     * @param templateLocation
     *        The location of the world template.
     */

    public void setTemplateLocation(TemplateLocation templateLocation) {
        this.templateLocation = templateLocation;
    }

    /**
     * <p>
     * The location of the world template.
     * </p>
     * 
     * @return The location of the world template.
     */

    public TemplateLocation getTemplateLocation() {
        return this.templateLocation;
    }

    /**
     * <p>
     * The location of the world template.
     * </p>
     * 
     * @param templateLocation
     *        The location of the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldTemplateRequest withTemplateLocation(TemplateLocation templateLocation) {
        setTemplateLocation(templateLocation);
        return this;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world template.
     * </p>
     * 
     * @return A map that contains tag keys and tag values that are attached to the world template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world template.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A map that contains tag keys and tag values that are attached to the world template.
     * </p>
     * 
     * @param tags
     *        A map that contains tag keys and tag values that are attached to the world template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldTemplateRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorldTemplateRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorldTemplateRequest addTagsEntry(String key, String value) {
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

    public CreateWorldTemplateRequest clearTagsEntries() {
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getTemplateLocation() != null)
            sb.append("TemplateLocation: ").append(getTemplateLocation()).append(",");
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

        if (obj instanceof CreateWorldTemplateRequest == false)
            return false;
        CreateWorldTemplateRequest other = (CreateWorldTemplateRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getTemplateLocation() == null ^ this.getTemplateLocation() == null)
            return false;
        if (other.getTemplateLocation() != null && other.getTemplateLocation().equals(this.getTemplateLocation()) == false)
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

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getTemplateLocation() == null) ? 0 : getTemplateLocation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorldTemplateRequest clone() {
        return (CreateWorldTemplateRequest) super.clone();
    }

}
