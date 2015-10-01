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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Returns the objects or data listed below if successful. Otherwise,
 * returns an error.
 * </p>
 */
public class ListTagsResult implements Serializable, Cloneable {

    /**
     * A list of resource tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTag> resourceTagList;

    /**
     * Reserved for future use.
     */
    private String nextToken;

    /**
     * A list of resource tags.
     *
     * @return A list of resource tags.
     */
    public java.util.List<ResourceTag> getResourceTagList() {
        if (resourceTagList == null) {
              resourceTagList = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTag>();
              resourceTagList.setAutoConstruct(true);
        }
        return resourceTagList;
    }
    
    /**
     * A list of resource tags.
     *
     * @param resourceTagList A list of resource tags.
     */
    public void setResourceTagList(java.util.Collection<ResourceTag> resourceTagList) {
        if (resourceTagList == null) {
            this.resourceTagList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTag> resourceTagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTag>(resourceTagList.size());
        resourceTagListCopy.addAll(resourceTagList);
        this.resourceTagList = resourceTagListCopy;
    }
    
    /**
     * A list of resource tags.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceTagList(java.util.Collection)} or {@link
     * #withResourceTagList(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTagList A list of resource tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsResult withResourceTagList(ResourceTag... resourceTagList) {
        if (getResourceTagList() == null) setResourceTagList(new java.util.ArrayList<ResourceTag>(resourceTagList.length));
        for (ResourceTag value : resourceTagList) {
            getResourceTagList().add(value);
        }
        return this;
    }
    
    /**
     * A list of resource tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceTagList A list of resource tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsResult withResourceTagList(java.util.Collection<ResourceTag> resourceTagList) {
        if (resourceTagList == null) {
            this.resourceTagList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTag> resourceTagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ResourceTag>(resourceTagList.size());
            resourceTagListCopy.addAll(resourceTagList);
            this.resourceTagList = resourceTagListCopy;
        }

        return this;
    }

    /**
     * Reserved for future use.
     *
     * @return Reserved for future use.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Reserved for future use.
     *
     * @param nextToken Reserved for future use.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken Reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTagsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getResourceTagList() != null) sb.append("ResourceTagList: " + getResourceTagList() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceTagList() == null) ? 0 : getResourceTagList().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsResult == false) return false;
        ListTagsResult other = (ListTagsResult)obj;
        
        if (other.getResourceTagList() == null ^ this.getResourceTagList() == null) return false;
        if (other.getResourceTagList() != null && other.getResourceTagList().equals(this.getResourceTagList()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTagsResult clone() {
        try {
            return (ListTagsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    