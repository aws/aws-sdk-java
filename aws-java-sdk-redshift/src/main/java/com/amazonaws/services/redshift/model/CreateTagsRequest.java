/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#createTags(CreateTagsRequest) CreateTags operation}.
 * <p>
 * Adds one or more tags to a specified resource.
 * </p>
 * <p>
 * A resource can have up to 10 tags. If you try to create more than 10
 * tags for a resource, you will receive an error and the attempt will
 * fail.
 * </p>
 * <p>
 * If you specify a key that already exists for the resource, the value
 * for that key will be updated with the new value.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#createTags(CreateTagsRequest)
 */
public class CreateTagsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) to which you want to add the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    private String resourceName;

    /**
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>tag-key</code> and
     * the corresponding value is passed in with the parameter
     * <code>tag-value</code>. The <code>tag-key</code> and
     * <code>tag-value</code> parameters are separated by a colon (:).
     * Separate multiple tags with a space. For example, <code>--tags
     * "tag-key"="owner":"tag-value"="admin"
     * "tag-key"="environment":"tag-value"="test"
     * "tag-key"="version":"tag-value"="1.0"</code>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The Amazon Resource Name (ARN) to which you want to add the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @return The Amazon Resource Name (ARN) to which you want to add the tag or
     *         tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) to which you want to add the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @param resourceName The Amazon Resource Name (ARN) to which you want to add the tag or
     *         tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) to which you want to add the tag or
     * tags. For example,
     * <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon Resource Name (ARN) to which you want to add the tag or
     *         tags. For example,
     *         <code>arn:aws:redshift:us-east-1:123456789:cluster:t1</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTagsRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>tag-key</code> and
     * the corresponding value is passed in with the parameter
     * <code>tag-value</code>. The <code>tag-key</code> and
     * <code>tag-value</code> parameters are separated by a colon (:).
     * Separate multiple tags with a space. For example, <code>--tags
     * "tag-key"="owner":"tag-value"="admin"
     * "tag-key"="environment":"tag-value"="test"
     * "tag-key"="version":"tag-value"="1.0"</code>.
     *
     * @return One or more name/value pairs to add as tags to the specified resource.
     *         Each tag name is passed in with the parameter <code>tag-key</code> and
     *         the corresponding value is passed in with the parameter
     *         <code>tag-value</code>. The <code>tag-key</code> and
     *         <code>tag-value</code> parameters are separated by a colon (:).
     *         Separate multiple tags with a space. For example, <code>--tags
     *         "tag-key"="owner":"tag-value"="admin"
     *         "tag-key"="environment":"tag-value"="test"
     *         "tag-key"="version":"tag-value"="1.0"</code>.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>tag-key</code> and
     * the corresponding value is passed in with the parameter
     * <code>tag-value</code>. The <code>tag-key</code> and
     * <code>tag-value</code> parameters are separated by a colon (:).
     * Separate multiple tags with a space. For example, <code>--tags
     * "tag-key"="owner":"tag-value"="admin"
     * "tag-key"="environment":"tag-value"="test"
     * "tag-key"="version":"tag-value"="1.0"</code>.
     *
     * @param tags One or more name/value pairs to add as tags to the specified resource.
     *         Each tag name is passed in with the parameter <code>tag-key</code> and
     *         the corresponding value is passed in with the parameter
     *         <code>tag-value</code>. The <code>tag-key</code> and
     *         <code>tag-value</code> parameters are separated by a colon (:).
     *         Separate multiple tags with a space. For example, <code>--tags
     *         "tag-key"="owner":"tag-value"="admin"
     *         "tag-key"="environment":"tag-value"="test"
     *         "tag-key"="version":"tag-value"="1.0"</code>.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>tag-key</code> and
     * the corresponding value is passed in with the parameter
     * <code>tag-value</code>. The <code>tag-key</code> and
     * <code>tag-value</code> parameters are separated by a colon (:).
     * Separate multiple tags with a space. For example, <code>--tags
     * "tag-key"="owner":"tag-value"="admin"
     * "tag-key"="environment":"tag-value"="test"
     * "tag-key"="version":"tag-value"="1.0"</code>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags One or more name/value pairs to add as tags to the specified resource.
     *         Each tag name is passed in with the parameter <code>tag-key</code> and
     *         the corresponding value is passed in with the parameter
     *         <code>tag-value</code>. The <code>tag-key</code> and
     *         <code>tag-value</code> parameters are separated by a colon (:).
     *         Separate multiple tags with a space. For example, <code>--tags
     *         "tag-key"="owner":"tag-value"="admin"
     *         "tag-key"="environment":"tag-value"="test"
     *         "tag-key"="version":"tag-value"="1.0"</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * One or more name/value pairs to add as tags to the specified resource.
     * Each tag name is passed in with the parameter <code>tag-key</code> and
     * the corresponding value is passed in with the parameter
     * <code>tag-value</code>. The <code>tag-key</code> and
     * <code>tag-value</code> parameters are separated by a colon (:).
     * Separate multiple tags with a space. For example, <code>--tags
     * "tag-key"="owner":"tag-value"="admin"
     * "tag-key"="environment":"tag-value"="test"
     * "tag-key"="version":"tag-value"="1.0"</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags One or more name/value pairs to add as tags to the specified resource.
     *         Each tag name is passed in with the parameter <code>tag-key</code> and
     *         the corresponding value is passed in with the parameter
     *         <code>tag-value</code>. The <code>tag-key</code> and
     *         <code>tag-value</code> parameters are separated by a colon (:).
     *         Separate multiple tags with a space. For example, <code>--tags
     *         "tag-key"="owner":"tag-value"="admin"
     *         "tag-key"="environment":"tag-value"="test"
     *         "tag-key"="version":"tag-value"="1.0"</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTagsRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTagsRequest == false) return false;
        CreateTagsRequest other = (CreateTagsRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateTagsRequest clone() {
        
            return (CreateTagsRequest) super.clone();
    }

}
    