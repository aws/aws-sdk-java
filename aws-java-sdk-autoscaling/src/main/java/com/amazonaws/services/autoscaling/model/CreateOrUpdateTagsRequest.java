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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createOrUpdateTags(CreateOrUpdateTagsRequest) CreateOrUpdateTags operation}.
 * <p>
 * Creates or updates tags for the specified Auto Scaling group.
 * </p>
 * <p>
 * A tag is defined by its resource ID, resource type, key, value, and
 * propagate flag. The value and the propagate flag are optional
 * parameters. The only supported resource type is
 * <code>auto-scaling-group</code> , and the resource ID must be the name
 * of the group. The <code>PropagateAtLaunch</code> flag determines
 * whether the tag is added to instances launched in the group. Valid
 * values are <code>true</code> or <code>false</code> .
 * </p>
 * <p>
 * When you specify a tag with a key that already exists, the operation
 * overwrites the previous tag definition, and you do not get an error
 * message.
 * </p>
 * <p>
 * For more information, see
 * <a href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"> Tagging Auto Scaling Groups and Instances </a>
 * in the <i>Auto Scaling Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createOrUpdateTags(CreateOrUpdateTagsRequest)
 */
public class CreateOrUpdateTagsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * One or more tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * One or more tags.
     *
     * @return One or more tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * One or more tags.
     *
     * @param tags One or more tags.
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
     * One or more tags.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags One or more tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateOrUpdateTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * One or more tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags One or more tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateOrUpdateTagsRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateOrUpdateTagsRequest == false) return false;
        CreateOrUpdateTagsRequest other = (CreateOrUpdateTagsRequest)obj;
        
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateOrUpdateTagsRequest clone() {
        
            return (CreateOrUpdateTagsRequest) super.clone();
    }

}
    