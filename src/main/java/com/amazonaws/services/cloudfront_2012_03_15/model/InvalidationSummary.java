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
 * Summary of an invalidation request.
 * </p>
 */
public class InvalidationSummary {

    /**
     * The unique ID for an invalidation request.
     */
    private String id;

    /**
     * The status of an invalidation request.
     */
    private String status;

    /**
     * Default constructor for a new InvalidationSummary object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InvalidationSummary() {}
    
    /**
     * The unique ID for an invalidation request.
     *
     * @return The unique ID for an invalidation request.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The unique ID for an invalidation request.
     *
     * @param id The unique ID for an invalidation request.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The unique ID for an invalidation request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The unique ID for an invalidation request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InvalidationSummary withId(String id) {
        this.id = id;
        return this;
    }
    
    
    /**
     * The status of an invalidation request.
     *
     * @return The status of an invalidation request.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of an invalidation request.
     *
     * @param status The status of an invalidation request.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of an invalidation request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of an invalidation request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public InvalidationSummary withStatus(String status) {
        this.status = status;
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
        if (id != null) sb.append("Id: " + id + ", ");
        if (status != null) sb.append("Status: " + status + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof InvalidationSummary == false) return false;
        InvalidationSummary other = (InvalidationSummary)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    
