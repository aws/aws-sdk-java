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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront.AmazonCloudFront#getInvalidation(GetInvalidationRequest) GetInvalidation operation}.
 * <p>
 * Get the information about an invalidation.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront.AmazonCloudFront#getInvalidation(GetInvalidationRequest)
 */
public class GetInvalidationRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The distribution's id.
     */
    private String distributionId;

    /**
     * The invalidation's id.
     */
    private String id;

    /**
     * Default constructor for a new GetInvalidationRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetInvalidationRequest() {}
    
    /**
     * Constructs a new GetInvalidationRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param distributionId The distribution's id.
     * @param id The invalidation's id.
     */
    public GetInvalidationRequest(String distributionId, String id) {
        setDistributionId(distributionId);
        setId(id);
    }

    /**
     * The distribution's id.
     *
     * @return The distribution's id.
     */
    public String getDistributionId() {
        return distributionId;
    }
    
    /**
     * The distribution's id.
     *
     * @param distributionId The distribution's id.
     */
    public void setDistributionId(String distributionId) {
        this.distributionId = distributionId;
    }
    
    /**
     * The distribution's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionId The distribution's id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetInvalidationRequest withDistributionId(String distributionId) {
        this.distributionId = distributionId;
        return this;
    }

    /**
     * The invalidation's id.
     *
     * @return The invalidation's id.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The invalidation's id.
     *
     * @param id The invalidation's id.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The invalidation's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The invalidation's id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetInvalidationRequest withId(String id) {
        this.id = id;
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
        if (getDistributionId() != null) sb.append("DistributionId: " + getDistributionId() + ",");
        if (getId() != null) sb.append("Id: " + getId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDistributionId() == null) ? 0 : getDistributionId().hashCode()); 
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetInvalidationRequest == false) return false;
        GetInvalidationRequest other = (GetInvalidationRequest)obj;
        
        if (other.getDistributionId() == null ^ this.getDistributionId() == null) return false;
        if (other.getDistributionId() != null && other.getDistributionId().equals(this.getDistributionId()) == false) return false; 
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    