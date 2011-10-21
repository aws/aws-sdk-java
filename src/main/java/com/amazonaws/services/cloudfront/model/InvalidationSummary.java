/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
        sb.append("Id: " + id + ", ");
        sb.append("Status: " + status + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    