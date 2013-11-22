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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#removeTagsFromResource(RemoveTagsFromResourceRequest) RemoveTagsFromResource operation}.
 * <p>
 * Removes metadata tags from an Amazon RDS resource.
 * </p>
 * <p>
 * For an overview on tagging an Amazon RDS resource, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> Tagging
 * Amazon RDS Resources </a> .
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#removeTagsFromResource(RemoveTagsFromResourceRequest)
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon RDS resource the tags will be removed from. This value is
     * an Amazon Resource Name (ARN). For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    private String resourceName;

    /**
     * The tag key (name) of the tag to be removed.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeys;

    /**
     * The Amazon RDS resource the tags will be removed from. This value is
     * an Amazon Resource Name (ARN). For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return The Amazon RDS resource the tags will be removed from. This value is
     *         an Amazon Resource Name (ARN). For information about creating an ARN,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The Amazon RDS resource the tags will be removed from. This value is
     * an Amazon Resource Name (ARN). For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @param resourceName The Amazon RDS resource the tags will be removed from. This value is
     *         an Amazon Resource Name (ARN). For information about creating an ARN,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The Amazon RDS resource the tags will be removed from. This value is
     * an Amazon Resource Name (ARN). For information about creating an ARN,
     * see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     * Constructing an RDS Amazon Resource Name (ARN)</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon RDS resource the tags will be removed from. This value is
     *         an Amazon Resource Name (ARN). For information about creating an ARN,
     *         see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html#USER_Tagging.ARN">
     *         Constructing an RDS Amazon Resource Name (ARN)</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveTagsFromResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * The tag key (name) of the tag to be removed.
     *
     * @return The tag key (name) of the tag to be removed.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
              tagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagKeys.setAutoConstruct(true);
        }
        return tagKeys;
    }
    
    /**
     * The tag key (name) of the tag to be removed.
     *
     * @param tagKeys The tag key (name) of the tag to be removed.
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
        tagKeysCopy.addAll(tagKeys);
        this.tagKeys = tagKeysCopy;
    }
    
    /**
     * The tag key (name) of the tag to be removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys The tag key (name) of the tag to be removed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        for (String value : tagKeys) {
            getTagKeys().add(value);
        }
        return this;
    }
    
    /**
     * The tag key (name) of the tag to be removed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys The tag key (name) of the tag to be removed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
            tagKeysCopy.addAll(tagKeys);
            this.tagKeys = tagKeysCopy;
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
        if (getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false) return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false; 
        return true;
    }
    
}
    