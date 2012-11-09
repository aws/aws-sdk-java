/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#removeTagsFromResource(RemoveTagsFromResourceRequest) RemoveTagsFromResource operation}.
 * <p>
 * Removes metadata tags from a DB Instance.
 * </p>
 * <p>
 * For an overview on tagging DB Instances, see <a href="http://docs.amazonwebservices.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> DB Instance
 * Tags. </a>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#removeTagsFromResource(RemoveTagsFromResourceRequest)
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance the tags will be removed from.
     */
    private String resourceName;

    /**
     * The tag key (name) of the tag to be removed.
     */
    private java.util.List<String> tagKeys;

    /**
     * The DB Instance the tags will be removed from.
     *
     * @return The DB Instance the tags will be removed from.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The DB Instance the tags will be removed from.
     *
     * @param resourceName The DB Instance the tags will be removed from.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The DB Instance the tags will be removed from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The DB Instance the tags will be removed from.
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
            tagKeys = new java.util.ArrayList<String>();
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

        java.util.List<String> tagKeysCopy = new java.util.ArrayList<String>(tagKeys.size());
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
            java.util.List<String> tagKeysCopy = new java.util.ArrayList<String>(tagKeys.size());
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
        if (resourceName != null) sb.append("ResourceName: " + resourceName + ", ");
        if (tagKeys != null) sb.append("TagKeys: " + tagKeys + ", ");
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
    