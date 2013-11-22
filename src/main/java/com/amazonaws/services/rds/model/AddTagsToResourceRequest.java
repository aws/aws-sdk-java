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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#addTagsToResource(AddTagsToResourceRequest) AddTagsToResource operation}.
 * <p>
 * Adds metadata tags to an Amazon RDS resource. These tags can also be used with cost allocation reporting to track cost associated with Amazon RDS
 * resources, or used in Condition statement in IAM policy for Amazon RDS.
 * </p>
 * <p>
 * For an overview on tagging Amazon RDS resources, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> Tagging
 * Amazon RDS Resources </a> .
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#addTagsToResource(AddTagsToResourceRequest)
 */
public class AddTagsToResourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    private String resourceName;

    /**
     * The tags to be assigned to the Amazon RDS resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return The Amazon RDS resource the tags will be added to. This value is an
     *         Amazon Resource Name (ARN). For information about creating an ARN, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @param resourceName The Amazon RDS resource the tags will be added to. This value is an
     *         Amazon Resource Name (ARN). For information about creating an ARN, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The Amazon RDS resource the tags will be added to. This value is an
     * Amazon Resource Name (ARN). For information about creating an ARN, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon RDS resource the tags will be added to. This value is an
     *         Amazon Resource Name (ARN). For information about creating an ARN, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddTagsToResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * The tags to be assigned to the Amazon RDS resource.
     *
     * @return The tags to be assigned to the Amazon RDS resource.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tags to be assigned to the Amazon RDS resource.
     *
     * @param tags The tags to be assigned to the Amazon RDS resource.
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
     * The tags to be assigned to the Amazon RDS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to be assigned to the Amazon RDS resource.
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
     * The tags to be assigned to the Amazon RDS resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to be assigned to the Amazon RDS resource.
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

        if (obj instanceof AddTagsToResourceRequest == false) return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    