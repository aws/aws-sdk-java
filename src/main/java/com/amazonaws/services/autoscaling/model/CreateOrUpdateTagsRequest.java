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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#createOrUpdateTags(CreateOrUpdateTagsRequest) CreateOrUpdateTags operation}.
 * <p>
 * Creates new tags or updates existing tags for an Auto Scaling group.
 * </p>
 * <p>
 * <b>NOTE:</b> A tag's definition is composed of a resource ID, resource type, key and value, and the propagate flag. Value and the propagate flag are
 * optional parameters. See the Request Parameters for more information.
 * </p>
 * <p>
 * For information on creating tags for your Auto Scaling group, see <a
 * href="http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"> Tag Your Auto Scaling Groups and Amazon EC2 Instances </a> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#createOrUpdateTags(CreateOrUpdateTagsRequest)
 */
public class CreateOrUpdateTagsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. The
     * resource type and resource ID identify the type and name of resource
     * for which the tag is created. Currently,
     * <code>auto-scaling-group</code> is the only supported resource type.
     * The valid value for the resource ID is <i>groupname</i>. <p>The
     * <code>PropagateAtLaunch</code> flag defines whether the new tag will
     * be applied to instances launched by the Auto Scaling group. Valid
     * values are <code>true</code> or <code>false</code>. However, instances
     * that are already running will not get the new or updated tag.
     * Likewise, when you modify a tag, the updated version will be applied
     * only to new instances launched by the Auto Scaling group after the
     * change. Running instances that had the previous version of the tag
     * will continue to have the older tag. <p>When you create a tag and a
     * tag of the same name already exists, the operation overwrites the
     * previous tag definition, but you will not get an error message.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. The
     * resource type and resource ID identify the type and name of resource
     * for which the tag is created. Currently,
     * <code>auto-scaling-group</code> is the only supported resource type.
     * The valid value for the resource ID is <i>groupname</i>. <p>The
     * <code>PropagateAtLaunch</code> flag defines whether the new tag will
     * be applied to instances launched by the Auto Scaling group. Valid
     * values are <code>true</code> or <code>false</code>. However, instances
     * that are already running will not get the new or updated tag.
     * Likewise, when you modify a tag, the updated version will be applied
     * only to new instances launched by the Auto Scaling group after the
     * change. Running instances that had the previous version of the tag
     * will continue to have the older tag. <p>When you create a tag and a
     * tag of the same name already exists, the operation overwrites the
     * previous tag definition, but you will not get an error message.
     *
     * @return The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. The
     *         resource type and resource ID identify the type and name of resource
     *         for which the tag is created. Currently,
     *         <code>auto-scaling-group</code> is the only supported resource type.
     *         The valid value for the resource ID is <i>groupname</i>. <p>The
     *         <code>PropagateAtLaunch</code> flag defines whether the new tag will
     *         be applied to instances launched by the Auto Scaling group. Valid
     *         values are <code>true</code> or <code>false</code>. However, instances
     *         that are already running will not get the new or updated tag.
     *         Likewise, when you modify a tag, the updated version will be applied
     *         only to new instances launched by the Auto Scaling group after the
     *         change. Running instances that had the previous version of the tag
     *         will continue to have the older tag. <p>When you create a tag and a
     *         tag of the same name already exists, the operation overwrites the
     *         previous tag definition, but you will not get an error message.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. The
     * resource type and resource ID identify the type and name of resource
     * for which the tag is created. Currently,
     * <code>auto-scaling-group</code> is the only supported resource type.
     * The valid value for the resource ID is <i>groupname</i>. <p>The
     * <code>PropagateAtLaunch</code> flag defines whether the new tag will
     * be applied to instances launched by the Auto Scaling group. Valid
     * values are <code>true</code> or <code>false</code>. However, instances
     * that are already running will not get the new or updated tag.
     * Likewise, when you modify a tag, the updated version will be applied
     * only to new instances launched by the Auto Scaling group after the
     * change. Running instances that had the previous version of the tag
     * will continue to have the older tag. <p>When you create a tag and a
     * tag of the same name already exists, the operation overwrites the
     * previous tag definition, but you will not get an error message.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. The
     *         resource type and resource ID identify the type and name of resource
     *         for which the tag is created. Currently,
     *         <code>auto-scaling-group</code> is the only supported resource type.
     *         The valid value for the resource ID is <i>groupname</i>. <p>The
     *         <code>PropagateAtLaunch</code> flag defines whether the new tag will
     *         be applied to instances launched by the Auto Scaling group. Valid
     *         values are <code>true</code> or <code>false</code>. However, instances
     *         that are already running will not get the new or updated tag.
     *         Likewise, when you modify a tag, the updated version will be applied
     *         only to new instances launched by the Auto Scaling group after the
     *         change. Running instances that had the previous version of the tag
     *         will continue to have the older tag. <p>When you create a tag and a
     *         tag of the same name already exists, the operation overwrites the
     *         previous tag definition, but you will not get an error message.
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
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. The
     * resource type and resource ID identify the type and name of resource
     * for which the tag is created. Currently,
     * <code>auto-scaling-group</code> is the only supported resource type.
     * The valid value for the resource ID is <i>groupname</i>. <p>The
     * <code>PropagateAtLaunch</code> flag defines whether the new tag will
     * be applied to instances launched by the Auto Scaling group. Valid
     * values are <code>true</code> or <code>false</code>. However, instances
     * that are already running will not get the new or updated tag.
     * Likewise, when you modify a tag, the updated version will be applied
     * only to new instances launched by the Auto Scaling group after the
     * change. Running instances that had the previous version of the tag
     * will continue to have the older tag. <p>When you create a tag and a
     * tag of the same name already exists, the operation overwrites the
     * previous tag definition, but you will not get an error message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. The
     *         resource type and resource ID identify the type and name of resource
     *         for which the tag is created. Currently,
     *         <code>auto-scaling-group</code> is the only supported resource type.
     *         The valid value for the resource ID is <i>groupname</i>. <p>The
     *         <code>PropagateAtLaunch</code> flag defines whether the new tag will
     *         be applied to instances launched by the Auto Scaling group. Valid
     *         values are <code>true</code> or <code>false</code>. However, instances
     *         that are already running will not get the new or updated tag.
     *         Likewise, when you modify a tag, the updated version will be applied
     *         only to new instances launched by the Auto Scaling group after the
     *         change. Running instances that had the previous version of the tag
     *         will continue to have the older tag. <p>When you create a tag and a
     *         tag of the same name already exists, the operation overwrites the
     *         previous tag definition, but you will not get an error message.
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
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. The
     * resource type and resource ID identify the type and name of resource
     * for which the tag is created. Currently,
     * <code>auto-scaling-group</code> is the only supported resource type.
     * The valid value for the resource ID is <i>groupname</i>. <p>The
     * <code>PropagateAtLaunch</code> flag defines whether the new tag will
     * be applied to instances launched by the Auto Scaling group. Valid
     * values are <code>true</code> or <code>false</code>. However, instances
     * that are already running will not get the new or updated tag.
     * Likewise, when you modify a tag, the updated version will be applied
     * only to new instances launched by the Auto Scaling group after the
     * change. Running instances that had the previous version of the tag
     * will continue to have the older tag. <p>When you create a tag and a
     * tag of the same name already exists, the operation overwrites the
     * previous tag definition, but you will not get an error message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tag to be created or updated. Each tag should be defined by its
     *         resource type, resource ID, key, value, and a propagate flag. The
     *         resource type and resource ID identify the type and name of resource
     *         for which the tag is created. Currently,
     *         <code>auto-scaling-group</code> is the only supported resource type.
     *         The valid value for the resource ID is <i>groupname</i>. <p>The
     *         <code>PropagateAtLaunch</code> flag defines whether the new tag will
     *         be applied to instances launched by the Auto Scaling group. Valid
     *         values are <code>true</code> or <code>false</code>. However, instances
     *         that are already running will not get the new or updated tag.
     *         Likewise, when you modify a tag, the updated version will be applied
     *         only to new instances launched by the Auto Scaling group after the
     *         change. Running instances that had the previous version of the tag
     *         will continue to have the older tag. <p>When you create a tag and a
     *         tag of the same name already exists, the operation overwrites the
     *         previous tag definition, but you will not get an error message.
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
    
}
    