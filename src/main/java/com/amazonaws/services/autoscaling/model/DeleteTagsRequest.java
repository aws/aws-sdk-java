/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteTags(DeleteTagsRequest) DeleteTags operation}.
 * <p>
 * Removes the specified tags or a set of tags from a set of resources.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#deleteTags(DeleteTagsRequest)
 */
public class DeleteTagsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Each tag should be defined by its resource type, resource ID, key,
     * value, and a propagate flag. Valid values are: Resource type =
     * <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     * key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Each tag should be defined by its resource type, resource ID, key,
     * value, and a propagate flag. Valid values are: Resource type =
     * <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     * key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>.
     *
     * @return Each tag should be defined by its resource type, resource ID, key,
     *         value, and a propagate flag. Valid values are: Resource type =
     *         <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     *         key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Each tag should be defined by its resource type, resource ID, key,
     * value, and a propagate flag. Valid values are: Resource type =
     * <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     * key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>.
     *
     * @param tags Each tag should be defined by its resource type, resource ID, key,
     *         value, and a propagate flag. Valid values are: Resource type =
     *         <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     *         key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>.
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
     * Each tag should be defined by its resource type, resource ID, key,
     * value, and a propagate flag. Valid values are: Resource type =
     * <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     * key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Each tag should be defined by its resource type, resource ID, key,
     *         value, and a propagate flag. Valid values are: Resource type =
     *         <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     *         key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTagsRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Each tag should be defined by its resource type, resource ID, key,
     * value, and a propagate flag. Valid values are: Resource type =
     * <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     * key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Each tag should be defined by its resource type, resource ID, key,
     *         value, and a propagate flag. Valid values are: Resource type =
     *         <i>auto-scaling-group</i>, Resource ID = <i>AutoScalingGroupName</i>,
     *         key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     *         <i>false</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteTagsRequest withTags(java.util.Collection<Tag> tags) {
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

        if (obj instanceof DeleteTagsRequest == false) return false;
        DeleteTagsRequest other = (DeleteTagsRequest)obj;
        
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    