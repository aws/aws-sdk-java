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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyIdFormat(ModifyIdFormatRequest) ModifyIdFormat operation}.
 * <p>
 * Modifies the ID format for the specified resource on a per-region
 * basis. You can specify that resources should receive longer IDs
 * (17-character IDs) when they are created. The following resource types
 * support longer IDs: <code>instance</code> |
 * 
 * <code>reservation</code> .
 * </p>
 * <p>
 * This setting applies to the IAM user who makes the request; it does
 * not apply to the entire AWS account. By default, an IAM user defaults
 * to the same settings as the root user, unless they explicitly override
 * the settings by running this request. Resources created with longer
 * IDs are visible to all IAM users, regardless of these settings and
 * provided that they have permission to use the relevant
 * <code>Describe</code> command for the resource type.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyIdFormat(ModifyIdFormatRequest)
 */
public class ModifyIdFormatRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The type of resource.
     */
    private String resource;

    /**
     * Indicate whether the resource should use longer IDs (17-character
     * IDs).
     */
    private Boolean useLongIds;

    /**
     * The type of resource.
     *
     * @return The type of resource.
     */
    public String getResource() {
        return resource;
    }
    
    /**
     * The type of resource.
     *
     * @param resource The type of resource.
     */
    public void setResource(String resource) {
        this.resource = resource;
    }
    
    /**
     * The type of resource.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resource The type of resource.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyIdFormatRequest withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Indicate whether the resource should use longer IDs (17-character
     * IDs).
     *
     * @return Indicate whether the resource should use longer IDs (17-character
     *         IDs).
     */
    public Boolean isUseLongIds() {
        return useLongIds;
    }
    
    /**
     * Indicate whether the resource should use longer IDs (17-character
     * IDs).
     *
     * @param useLongIds Indicate whether the resource should use longer IDs (17-character
     *         IDs).
     */
    public void setUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
    }
    
    /**
     * Indicate whether the resource should use longer IDs (17-character
     * IDs).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useLongIds Indicate whether the resource should use longer IDs (17-character
     *         IDs).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyIdFormatRequest withUseLongIds(Boolean useLongIds) {
        this.useLongIds = useLongIds;
        return this;
    }

    /**
     * Indicate whether the resource should use longer IDs (17-character
     * IDs).
     *
     * @return Indicate whether the resource should use longer IDs (17-character
     *         IDs).
     */
    public Boolean getUseLongIds() {
        return useLongIds;
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
        if (getResource() != null) sb.append("Resource: " + getResource() + ",");
        if (isUseLongIds() != null) sb.append("UseLongIds: " + isUseLongIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode()); 
        hashCode = prime * hashCode + ((isUseLongIds() == null) ? 0 : isUseLongIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyIdFormatRequest == false) return false;
        ModifyIdFormatRequest other = (ModifyIdFormatRequest)obj;
        
        if (other.getResource() == null ^ this.getResource() == null) return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false) return false; 
        if (other.isUseLongIds() == null ^ this.isUseLongIds() == null) return false;
        if (other.isUseLongIds() != null && other.isUseLongIds().equals(this.isUseLongIds()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyIdFormatRequest clone() {
        
            return (ModifyIdFormatRequest) super.clone();
    }

}
    