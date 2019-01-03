/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This input identifies a cluster and a list of tags to remove.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/RemoveTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A list of tag keys to remove from a resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;

    /**
     * Default constructor for RemoveTagsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public RemoveTagsRequest() {
    }

    /**
     * Constructs a new RemoveTagsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster
     *        identifier.
     */
    public RemoveTagsRequest(String resourceId) {
        setResourceId(resourceId);
    }

    /**
     * Constructs a new RemoveTagsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster
     *        identifier.
     * @param tagKeys
     *        A list of tag keys to remove from a resource.
     */
    public RemoveTagsRequest(String resourceId, java.util.List<String> tagKeys) {
        setResourceId(resourceId);
        setTagKeys(tagKeys);
    }

    /**
     * <p>
     * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
     * </p>
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster
     *        identifier.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
     * </p>
     * 
     * @return The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster
     *         identifier.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster identifier.
     * </p>
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier from which tags will be removed. This value must be a cluster
     *        identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A list of tag keys to remove from a resource.
     * </p>
     * 
     * @return A list of tag keys to remove from a resource.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * A list of tag keys to remove from a resource.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag keys to remove from a resource.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of tag keys to remove from a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag keys to remove from a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tag keys to remove from a resource.
     * </p>
     * 
     * @param tagKeys
     *        A list of tag keys to remove from a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsRequest == false)
            return false;
        RemoveTagsRequest other = (RemoveTagsRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsRequest clone() {
        return (RemoveTagsRequest) super.clone();
    }

}
