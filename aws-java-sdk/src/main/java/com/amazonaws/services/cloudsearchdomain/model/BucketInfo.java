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
package com.amazonaws.services.cloudsearchdomain.model;

import java.io.Serializable;

/**
 * <p>
 * A container for the calculated facet values and counts.
 * </p>
 */
public class BucketInfo implements Serializable {

    /**
     * A list of the calculated facet values and counts.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Bucket> buckets;

    /**
     * A list of the calculated facet values and counts.
     *
     * @return A list of the calculated facet values and counts.
     */
    public java.util.List<Bucket> getBuckets() {
        if (buckets == null) {
              buckets = new com.amazonaws.internal.ListWithAutoConstructFlag<Bucket>();
              buckets.setAutoConstruct(true);
        }
        return buckets;
    }
    
    /**
     * A list of the calculated facet values and counts.
     *
     * @param buckets A list of the calculated facet values and counts.
     */
    public void setBuckets(java.util.Collection<Bucket> buckets) {
        if (buckets == null) {
            this.buckets = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Bucket> bucketsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Bucket>(buckets.size());
        bucketsCopy.addAll(buckets);
        this.buckets = bucketsCopy;
    }
    
    /**
     * A list of the calculated facet values and counts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param buckets A list of the calculated facet values and counts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BucketInfo withBuckets(Bucket... buckets) {
        if (getBuckets() == null) setBuckets(new java.util.ArrayList<Bucket>(buckets.length));
        for (Bucket value : buckets) {
            getBuckets().add(value);
        }
        return this;
    }
    
    /**
     * A list of the calculated facet values and counts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param buckets A list of the calculated facet values and counts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BucketInfo withBuckets(java.util.Collection<Bucket> buckets) {
        if (buckets == null) {
            this.buckets = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Bucket> bucketsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Bucket>(buckets.size());
            bucketsCopy.addAll(buckets);
            this.buckets = bucketsCopy;
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
        if (getBuckets() != null) sb.append("Buckets: " + getBuckets() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getBuckets() == null) ? 0 : getBuckets().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BucketInfo == false) return false;
        BucketInfo other = (BucketInfo)obj;
        
        if (other.getBuckets() == null ^ this.getBuckets() == null) return false;
        if (other.getBuckets() != null && other.getBuckets().equals(this.getBuckets()) == false) return false; 
        return true;
    }
    
}
    