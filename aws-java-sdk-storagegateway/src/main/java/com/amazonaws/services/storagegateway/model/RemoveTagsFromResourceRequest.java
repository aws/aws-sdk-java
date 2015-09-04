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
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#removeTagsFromResource(RemoveTagsFromResourceRequest) RemoveTagsFromResource operation}.
 * <p>
 * This operation removes one or more tags from the specified resource.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#removeTagsFromResource(RemoveTagsFromResourceRequest)
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String resourceARN;

    /**
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key/value pair.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeys;

    /**
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the resource you want to remove the
     *         tags from.
     */
    public String getResourceARN() {
        return resourceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param resourceARN The Amazon Resource Name (ARN) of the resource you want to remove the
     *         tags from.
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource you want to remove the
     * tags from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param resourceARN The Amazon Resource Name (ARN) of the resource you want to remove the
     *         tags from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RemoveTagsFromResourceRequest withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key/value pair.
     *
     * @return The keys of the tags you want to remove from the specified resource. A
     *         tag is composed of a key/value pair.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
              tagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagKeys.setAutoConstruct(true);
        }
        return tagKeys;
    }
    
    /**
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key/value pair.
     *
     * @param tagKeys The keys of the tags you want to remove from the specified resource. A
     *         tag is composed of a key/value pair.
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
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key/value pair.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagKeys(java.util.Collection)} or {@link
     * #withTagKeys(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys The keys of the tags you want to remove from the specified resource. A
     *         tag is composed of a key/value pair.
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
     * The keys of the tags you want to remove from the specified resource. A
     * tag is composed of a key/value pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys The keys of the tags you want to remove from the specified resource. A
     *         tag is composed of a key/value pair.
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
        if (getResourceARN() != null) sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode()); 
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false) return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest)obj;
        
        if (other.getResourceARN() == null ^ this.getResourceARN() == null) return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false) return false; 
        if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false; 
        return true;
    }
    
    @Override
    public RemoveTagsFromResourceRequest clone() {
        
            return (RemoveTagsFromResourceRequest) super.clone();
    }

}
    