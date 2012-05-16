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
package com.amazonaws.services.cloudfront_2012_03_15.model;

/**
 * <p>
 * Specifies options that affects caching behavior, such as minimum TTL
 * values.
 * </p>
 */
public class CachingBehavior {

    /**
     * Specifies the minimum TTL in seconds for objects in the CloudFront
     * cache.
     */
    private Long minTTL;

    /**
     * Specifies the minimum TTL in seconds for objects in the CloudFront
     * cache.
     *
     * @return Specifies the minimum TTL in seconds for objects in the CloudFront
     *         cache.
     */
    public Long getMinTTL() {
        return minTTL;
    }
    
    /**
     * Specifies the minimum TTL in seconds for objects in the CloudFront
     * cache.
     *
     * @param minTTL Specifies the minimum TTL in seconds for objects in the CloudFront
     *         cache.
     */
    public void setMinTTL(Long minTTL) {
        this.minTTL = minTTL;
    }
    
    /**
     * Specifies the minimum TTL in seconds for objects in the CloudFront
     * cache.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minTTL Specifies the minimum TTL in seconds for objects in the CloudFront
     *         cache.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CachingBehavior withMinTTL(Long minTTL) {
        this.minTTL = minTTL;
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
        if (minTTL != null) sb.append("MinTTL: " + minTTL + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMinTTL() == null) ? 0 : getMinTTL().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof CachingBehavior == false) return false;
        CachingBehavior other = (CachingBehavior)obj;
        
        if (other.getMinTTL() == null ^ this.getMinTTL() == null) return false;
        if (other.getMinTTL() != null && other.getMinTTL().equals(this.getMinTTL()) == false) return false; 
        return true;
    }
    
}
    
