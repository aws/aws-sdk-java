/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#removeTags(RemoveTagsRequest) RemoveTags operation}.
 * <p>
 * Removes tags from an Amazon EMR resource. Tags make it easier to
 * associate clusters in various ways, such as grouping clusters to track
 * your Amazon EMR resource allocation costs. For more information, see
 * <a href="http://docs.aws.amazon.com/ElasticMapReduce/latest/DeveloperGuide/emr-plan-tags.html"> Tagging Amazon EMR Resources </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.elasticmapreduce.AmazonElasticMapReduce#removeTags(RemoveTagsRequest)
 */
public class RemoveTagsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon EMR resource identifier from which tags will be removed.
     * This value must be a cluster identifier.
     */
    private String resourceId;

    /**
     * A list of tag keys to remove from a resource.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeys;

    /**
     * Default constructor for a new RemoveTagsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RemoveTagsRequest() {}
    
    /**
     * Constructs a new RemoveTagsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resourceId The Amazon EMR resource identifier from which tags
     * will be removed. This value must be a cluster identifier.
     */
    public RemoveTagsRequest(String resourceId) {
        setResourceId(resourceId);
    }

    /**
     * Constructs a new RemoveTagsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resourceId The Amazon EMR resource identifier from which tags
     * will be removed. This value must be a cluster identifier.
     * @param tagKeys A list of tag keys to remove from a resource.
     */
    public RemoveTagsRequest(String resourceId, java.util.List<String> tagKeys) {
        setResourceId(resourceId);
        setTagKeys(tagKeys);
    }

    /**
     * The Amazon EMR resource identifier from which tags will be removed.
     * This value must be a cluster identifier.
     *
     * @return The Amazon EMR resource identifier from which tags will be removed.
     *         This value must be a cluster identifier.
     */
    public String getResourceId() {
        return resourceId;
    }
    
    /**
     * The Amazon EMR resource identifier from which tags will be removed.
     * This value must be a cluster identifier.
     *
     * @param resourceId The Amazon EMR resource identifier from which tags will be removed.
     *         This value must be a cluster identifier.
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    
    /**
     * The Amazon EMR resource identifier from which tags will be removed.
     * This value must be a cluster identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceId The Amazon EMR resource identifier from which tags will be removed.
     *         This value must be a cluster identifier.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveTagsRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * A list of tag keys to remove from a resource.
     *
     * @return A list of tag keys to remove from a resource.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
              tagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagKeys.setAutoConstruct(true);
        }
        return tagKeys;
    }
    
    /**
     * A list of tag keys to remove from a resource.
     *
     * @param tagKeys A list of tag keys to remove from a resource.
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
     * A list of tag keys to remove from a resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A list of tag keys to remove from a resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveTagsRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        for (String value : tagKeys) {
            getTagKeys().add(value);
        }
        return this;
    }
    
    /**
     * A list of tag keys to remove from a resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A list of tag keys to remove from a resource.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RemoveTagsRequest withTagKeys(java.util.Collection<String> tagKeys) {
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
        if (getResourceId() != null) sb.append("ResourceId: " + getResourceId() + ",");
        if (getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveTagsRequest == false) return false;
        RemoveTagsRequest other = (RemoveTagsRequest)obj;
        
        if (other.getResourceId() == null ^ this.getResourceId() == null) return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false) return false; 
        if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false; 
        return true;
    }
    
}
    