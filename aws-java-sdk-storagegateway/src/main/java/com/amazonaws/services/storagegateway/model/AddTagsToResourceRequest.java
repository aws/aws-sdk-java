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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#addTagsToResource(AddTagsToResourceRequest) AddTagsToResource operation}.
 * <p>
 * This operation adds one or more tags to the specified resource. You
 * use tags to add metadata to resources, which you can use to categorize
 * these resources. For example, you can categorize resources by purpose,
 * owner, environment, or team. Each tag consists of a key and a value,
 * which you define. You can add tags to the following AWS Storage
 * Gateway resources:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * Storage gateways of all types
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * <ul>
 * <li> <p>
 * Storage Volumes
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * <ul>
 * <li> <p>
 * Virtual Tapes
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * You can create a maximum of 10 tags for each resource. Virtual tapes
 * and storage volumes that are recovered to a new gateway maintain their
 * tags.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#addTagsToResource(AddTagsToResourceRequest)
 */
public class AddTagsToResourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the resource you want to add tags
     * to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String resourceARN;

    /**
     * The key-value pair that represents the tag you want to add to the
     * resource. The value can be an empty string. <note><p>Valid characters
     * for key and value are letters, spaces, and numbers representable in
     * UTF-8 format, and the following special characters: + - = . _ : /
     * @.</note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The Amazon Resource Name (ARN) of the resource you want to add tags
     * to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the resource you want to add tags
     *         to.
     */
    public String getResourceARN() {
        return resourceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource you want to add tags
     * to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param resourceARN The Amazon Resource Name (ARN) of the resource you want to add tags
     *         to.
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource you want to add tags
     * to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param resourceARN The Amazon Resource Name (ARN) of the resource you want to add tags
     *         to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToResourceRequest withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * The key-value pair that represents the tag you want to add to the
     * resource. The value can be an empty string. <note><p>Valid characters
     * for key and value are letters, spaces, and numbers representable in
     * UTF-8 format, and the following special characters: + - = . _ : /
     * @.</note>
     *
     * @return The key-value pair that represents the tag you want to add to the
     *         resource. The value can be an empty string. <note><p>Valid characters
     *         for key and value are letters, spaces, and numbers representable in
     *         UTF-8 format, and the following special characters: + - = . _ : /
     *         @.</note>
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The key-value pair that represents the tag you want to add to the
     * resource. The value can be an empty string. <note><p>Valid characters
     * for key and value are letters, spaces, and numbers representable in
     * UTF-8 format, and the following special characters: + - = . _ : /
     * @.</note>
     *
     * @param tags The key-value pair that represents the tag you want to add to the
     *         resource. The value can be an empty string. <note><p>Valid characters
     *         for key and value are letters, spaces, and numbers representable in
     *         UTF-8 format, and the following special characters: + - = . _ : /
     *         @.</note>
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
     * The key-value pair that represents the tag you want to add to the
     * resource. The value can be an empty string. <note><p>Valid characters
     * for key and value are letters, spaces, and numbers representable in
     * UTF-8 format, and the following special characters: + - = . _ : /
     * @.</note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The key-value pair that represents the tag you want to add to the
     *         resource. The value can be an empty string. <note><p>Valid characters
     *         for key and value are letters, spaces, and numbers representable in
     *         UTF-8 format, and the following special characters: + - = . _ : /
     *         @.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToResourceRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The key-value pair that represents the tag you want to add to the
     * resource. The value can be an empty string. <note><p>Valid characters
     * for key and value are letters, spaces, and numbers representable in
     * UTF-8 format, and the following special characters: + - = . _ : /
     * @.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The key-value pair that represents the tag you want to add to the
     *         resource. The value can be an empty string. <note><p>Valid characters
     *         for key and value are letters, spaces, and numbers representable in
     *         UTF-8 format, and the following special characters: + - = . _ : /
     *         @.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceARN() != null) sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddTagsToResourceRequest == false) return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest)obj;
        
        if (other.getResourceARN() == null ^ this.getResourceARN() == null) return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public AddTagsToResourceRequest clone() {
        
            return (AddTagsToResourceRequest) super.clone();
    }

}
    