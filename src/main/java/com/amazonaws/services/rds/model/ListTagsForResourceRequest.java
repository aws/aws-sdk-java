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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#listTagsForResource(ListTagsForResourceRequest) ListTagsForResource operation}.
 * <p>
 * Lists all tags on a DB Instance.
 * </p>
 * <p>
 * For an overview on tagging DB Instances, see <a href="http://docs.amazonwebservices.com/AmazonRDS/latest/UserGuide/Overview.Tagging.html"> DB Instance
 * Tags. </a>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#listTagsForResource(ListTagsForResourceRequest)
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest {

    /**
     * The DB Instance with tags to be listed.
     */
    private String resourceName;

    /**
     * The DB Instance with tags to be listed.
     *
     * @return The DB Instance with tags to be listed.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The DB Instance with tags to be listed.
     *
     * @param resourceName The DB Instance with tags to be listed.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The DB Instance with tags to be listed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The DB Instance with tags to be listed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListTagsForResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
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
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListTagsForResourceRequest == false) return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        return true;
    }
    
}
    