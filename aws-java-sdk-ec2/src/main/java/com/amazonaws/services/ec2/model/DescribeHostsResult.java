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

/**
 * 
 */
public class DescribeHostsResult implements Serializable, Cloneable {

    /**
     * Information about the Dedicated hosts.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Host> hosts;

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * Information about the Dedicated hosts.
     *
     * @return Information about the Dedicated hosts.
     */
    public java.util.List<Host> getHosts() {
        if (hosts == null) {
              hosts = new com.amazonaws.internal.ListWithAutoConstructFlag<Host>();
              hosts.setAutoConstruct(true);
        }
        return hosts;
    }
    
    /**
     * Information about the Dedicated hosts.
     *
     * @param hosts Information about the Dedicated hosts.
     */
    public void setHosts(java.util.Collection<Host> hosts) {
        if (hosts == null) {
            this.hosts = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Host> hostsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Host>(hosts.size());
        hostsCopy.addAll(hosts);
        this.hosts = hostsCopy;
    }
    
    /**
     * Information about the Dedicated hosts.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHosts(java.util.Collection)} or {@link
     * #withHosts(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hosts Information about the Dedicated hosts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsResult withHosts(Host... hosts) {
        if (getHosts() == null) setHosts(new java.util.ArrayList<Host>(hosts.length));
        for (Host value : hosts) {
            getHosts().add(value);
        }
        return this;
    }
    
    /**
     * Information about the Dedicated hosts.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hosts Information about the Dedicated hosts.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsResult withHosts(java.util.Collection<Host> hosts) {
        if (hosts == null) {
            this.hosts = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Host> hostsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Host>(hosts.size());
            hostsCopy.addAll(hosts);
            this.hosts = hostsCopy;
        }

        return this;
    }

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsResult withNextToken(String nextToken) {
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
        if (getHosts() != null) sb.append("Hosts: " + getHosts() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHosts() == null) ? 0 : getHosts().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHostsResult == false) return false;
        DescribeHostsResult other = (DescribeHostsResult)obj;
        
        if (other.getHosts() == null ^ this.getHosts() == null) return false;
        if (other.getHosts() != null && other.getHosts().equals(this.getHosts()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeHostsResult clone() {
        try {
            return (DescribeHostsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    