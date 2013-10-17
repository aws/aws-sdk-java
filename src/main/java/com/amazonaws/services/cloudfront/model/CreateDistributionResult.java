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


/**
 * <p>
 * The returned result of the corresponding request.
 * </p>
 */
public class CreateDistributionResult implements Serializable {

    /**
     * The distribution's information.
     */
    private Distribution distribution;

    /**
     * The fully qualified URI of the new distribution resource just created.
     * For example:
     * https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
     */
    private String location;

    /**
     * The current version of the distribution created.
     */
    private String eTag;

    /**
     * The distribution's information.
     *
     * @return The distribution's information.
     */
    public Distribution getDistribution() {
        return distribution;
    }
    
    /**
     * The distribution's information.
     *
     * @param distribution The distribution's information.
     */
    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }
    
    /**
     * The distribution's information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distribution The distribution's information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDistributionResult withDistribution(Distribution distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * The fully qualified URI of the new distribution resource just created.
     * For example:
     * https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
     *
     * @return The fully qualified URI of the new distribution resource just created.
     *         For example:
     *         https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The fully qualified URI of the new distribution resource just created.
     * For example:
     * https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
     *
     * @param location The fully qualified URI of the new distribution resource just created.
     *         For example:
     *         https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The fully qualified URI of the new distribution resource just created.
     * For example:
     * https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The fully qualified URI of the new distribution resource just created.
     *         For example:
     *         https://cloudfront.amazonaws.com/2010-11-01/distribution/EDFDVBD632BHDS5.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDistributionResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * The current version of the distribution created.
     *
     * @return The current version of the distribution created.
     */
    public String getETag() {
        return eTag;
    }
    
    /**
     * The current version of the distribution created.
     *
     * @param eTag The current version of the distribution created.
     */
    public void setETag(String eTag) {
        this.eTag = eTag;
    }
    
    /**
     * The current version of the distribution created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eTag The current version of the distribution created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDistributionResult withETag(String eTag) {
        this.eTag = eTag;
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
        if (getDistribution() != null) sb.append("Distribution: " + getDistribution() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getETag() != null) sb.append("ETag: " + getETag() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDistribution() == null) ? 0 : getDistribution().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getETag() == null) ? 0 : getETag().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDistributionResult == false) return false;
        CreateDistributionResult other = (CreateDistributionResult)obj;
        
        if (other.getDistribution() == null ^ this.getDistribution() == null) return false;
        if (other.getDistribution() != null && other.getDistribution().equals(this.getDistribution()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getETag() == null ^ this.getETag() == null) return false;
        if (other.getETag() != null && other.getETag().equals(this.getETag()) == false) return false; 
        return true;
    }
    
}
    