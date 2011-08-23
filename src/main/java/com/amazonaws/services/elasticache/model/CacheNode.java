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
package com.amazonaws.services.elasticache.model;

/**
 * <p>
 * A Cache Cluster is made up of one or more Cache Nodes. Each Cache
 * Node is an separate endpoint servicing the memcached protocol.
 * </p>
 */
public class CacheNode {

    /**
     * Specifies a Cache Node identifier. This is the unique key that
     * identifies a Cache Node per Customer (AWS account).
     */
    private String cacheNodeId;

    /**
     * Specifies the current state of this Cache Node.
     */
    private String cacheNodeStatus;

    /**
     * Provides the date and time the Cache Node was created.
     */
    private java.util.Date cacheNodeCreateTime;

    /**
     * Specifies the endpoint details for a Cache Node.
     */
    private Endpoint endpoint;

    /**
     * Specified the status of teh parameter group applied to this Cache
     * Node.
     */
    private String parameterGroupStatus;

    /**
     * Default constructor for a new CacheNode object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CacheNode() {}
    
    /**
     * Specifies a Cache Node identifier. This is the unique key that
     * identifies a Cache Node per Customer (AWS account).
     *
     * @return Specifies a Cache Node identifier. This is the unique key that
     *         identifies a Cache Node per Customer (AWS account).
     */
    public String getCacheNodeId() {
        return cacheNodeId;
    }
    
    /**
     * Specifies a Cache Node identifier. This is the unique key that
     * identifies a Cache Node per Customer (AWS account).
     *
     * @param cacheNodeId Specifies a Cache Node identifier. This is the unique key that
     *         identifies a Cache Node per Customer (AWS account).
     */
    public void setCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
    }
    
    /**
     * Specifies a Cache Node identifier. This is the unique key that
     * identifies a Cache Node per Customer (AWS account).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeId Specifies a Cache Node identifier. This is the unique key that
     *         identifies a Cache Node per Customer (AWS account).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNode withCacheNodeId(String cacheNodeId) {
        this.cacheNodeId = cacheNodeId;
        return this;
    }
    
    
    /**
     * Specifies the current state of this Cache Node.
     *
     * @return Specifies the current state of this Cache Node.
     */
    public String getCacheNodeStatus() {
        return cacheNodeStatus;
    }
    
    /**
     * Specifies the current state of this Cache Node.
     *
     * @param cacheNodeStatus Specifies the current state of this Cache Node.
     */
    public void setCacheNodeStatus(String cacheNodeStatus) {
        this.cacheNodeStatus = cacheNodeStatus;
    }
    
    /**
     * Specifies the current state of this Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeStatus Specifies the current state of this Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNode withCacheNodeStatus(String cacheNodeStatus) {
        this.cacheNodeStatus = cacheNodeStatus;
        return this;
    }
    
    
    /**
     * Provides the date and time the Cache Node was created.
     *
     * @return Provides the date and time the Cache Node was created.
     */
    public java.util.Date getCacheNodeCreateTime() {
        return cacheNodeCreateTime;
    }
    
    /**
     * Provides the date and time the Cache Node was created.
     *
     * @param cacheNodeCreateTime Provides the date and time the Cache Node was created.
     */
    public void setCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
    }
    
    /**
     * Provides the date and time the Cache Node was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheNodeCreateTime Provides the date and time the Cache Node was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNode withCacheNodeCreateTime(java.util.Date cacheNodeCreateTime) {
        this.cacheNodeCreateTime = cacheNodeCreateTime;
        return this;
    }
    
    
    /**
     * Specifies the endpoint details for a Cache Node.
     *
     * @return Specifies the endpoint details for a Cache Node.
     */
    public Endpoint getEndpoint() {
        return endpoint;
    }
    
    /**
     * Specifies the endpoint details for a Cache Node.
     *
     * @param endpoint Specifies the endpoint details for a Cache Node.
     */
    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }
    
    /**
     * Specifies the endpoint details for a Cache Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endpoint Specifies the endpoint details for a Cache Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNode withEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    
    
    /**
     * Specified the status of teh parameter group applied to this Cache
     * Node.
     *
     * @return Specified the status of teh parameter group applied to this Cache
     *         Node.
     */
    public String getParameterGroupStatus() {
        return parameterGroupStatus;
    }
    
    /**
     * Specified the status of teh parameter group applied to this Cache
     * Node.
     *
     * @param parameterGroupStatus Specified the status of teh parameter group applied to this Cache
     *         Node.
     */
    public void setParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
    }
    
    /**
     * Specified the status of teh parameter group applied to this Cache
     * Node.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameterGroupStatus Specified the status of teh parameter group applied to this Cache
     *         Node.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CacheNode withParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
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
        sb.append("CacheNodeId: " + cacheNodeId + ", ");
        sb.append("CacheNodeStatus: " + cacheNodeStatus + ", ");
        sb.append("CacheNodeCreateTime: " + cacheNodeCreateTime + ", ");
        sb.append("Endpoint: " + endpoint + ", ");
        sb.append("ParameterGroupStatus: " + parameterGroupStatus + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    