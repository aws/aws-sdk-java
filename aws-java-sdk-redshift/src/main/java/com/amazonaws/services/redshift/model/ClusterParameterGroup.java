/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes a parameter group.
 * </p>
 */
public class ClusterParameterGroup implements Serializable, Cloneable {

    /**
     * The name of the cluster parameter group.
     */
    private String parameterGroupName;

    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     */
    private String parameterGroupFamily;

    /**
     * The description of the parameter group.
     */
    private String description;

    /**
     * The list of tags for the cluster parameter group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The name of the cluster parameter group.
     *
     * @return The name of the cluster parameter group.
     */
    public String getParameterGroupName() {
        return parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group.
     *
     * @param parameterGroupName The name of the cluster parameter group.
     */
    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }
    
    /**
     * The name of the cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupName The name of the cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterGroup withParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
        return this;
    }

    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     *
     * @return The name of the cluster parameter group family that this cluster
     *         parameter group is compatible with.
     */
    public String getParameterGroupFamily() {
        return parameterGroupFamily;
    }
    
    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     *
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     *         parameter group is compatible with.
     */
    public void setParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
    }
    
    /**
     * The name of the cluster parameter group family that this cluster
     * parameter group is compatible with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     *         parameter group is compatible with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterGroup withParameterGroupFamily(String parameterGroupFamily) {
        this.parameterGroupFamily = parameterGroupFamily;
        return this;
    }

    /**
     * The description of the parameter group.
     *
     * @return The description of the parameter group.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the parameter group.
     *
     * @param description The description of the parameter group.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The list of tags for the cluster parameter group.
     *
     * @return The list of tags for the cluster parameter group.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The list of tags for the cluster parameter group.
     *
     * @param tags The list of tags for the cluster parameter group.
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
     * The list of tags for the cluster parameter group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterGroup withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags for the cluster parameter group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The list of tags for the cluster parameter group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ClusterParameterGroup withTags(java.util.Collection<Tag> tags) {
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
        if (getParameterGroupName() != null) sb.append("ParameterGroupName: " + getParameterGroupName() + ",");
        if (getParameterGroupFamily() != null) sb.append("ParameterGroupFamily: " + getParameterGroupFamily() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getParameterGroupFamily() == null) ? 0 : getParameterGroupFamily().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ClusterParameterGroup == false) return false;
        ClusterParameterGroup other = (ClusterParameterGroup)obj;
        
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null) return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false) return false; 
        if (other.getParameterGroupFamily() == null ^ this.getParameterGroupFamily() == null) return false;
        if (other.getParameterGroupFamily() != null && other.getParameterGroupFamily().equals(this.getParameterGroupFamily()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public ClusterParameterGroup clone() {
        try {
            return (ClusterParameterGroup) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    