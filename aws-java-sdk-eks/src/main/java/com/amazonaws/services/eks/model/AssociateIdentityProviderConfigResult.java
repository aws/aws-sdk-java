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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/AssociateIdentityProviderConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateIdentityProviderConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private Update update;
    /**
     * <p>
     * The tags for the resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * @param update
     */

    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     * @return
     */

    public Update getUpdate() {
        return this.update;
    }

    /**
     * @param update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigResult withUpdate(Update update) {
        setUpdate(update);
        return this;
    }

    /**
     * <p>
     * The tags for the resource.
     * </p>
     * 
     * @return The tags for the resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the resource.
     * </p>
     * 
     * @param tags
     *        The tags for the resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the resource.
     * </p>
     * 
     * @param tags
     *        The tags for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AssociateIdentityProviderConfigResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AssociateIdentityProviderConfigResult addTagsEntry(String key, String value) {
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

    public AssociateIdentityProviderConfigResult clearTagsEntries() {
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
        if (getUpdate() != null)
            sb.append("Update: ").append(getUpdate()).append(",");
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

        if (obj instanceof AssociateIdentityProviderConfigResult == false)
            return false;
        AssociateIdentityProviderConfigResult other = (AssociateIdentityProviderConfigResult) obj;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
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

        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AssociateIdentityProviderConfigResult clone() {
        try {
            return (AssociateIdentityProviderConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
