/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class DescribeClassicLinkInstancesResult implements Serializable, Cloneable {

    /**
     * Information about one or more linked EC2-Classic instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ClassicLinkInstance> instances;

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * Information about one or more linked EC2-Classic instances.
     *
     * @return Information about one or more linked EC2-Classic instances.
     */
    public java.util.List<ClassicLinkInstance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<ClassicLinkInstance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * Information about one or more linked EC2-Classic instances.
     *
     * @param instances Information about one or more linked EC2-Classic instances.
     */
    public void setInstances(java.util.Collection<ClassicLinkInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ClassicLinkInstance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClassicLinkInstance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * Information about one or more linked EC2-Classic instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstances(java.util.Collection)} or {@link
     * #withInstances(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Information about one or more linked EC2-Classic instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClassicLinkInstancesResult withInstances(ClassicLinkInstance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<ClassicLinkInstance>(instances.length));
        for (ClassicLinkInstance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * Information about one or more linked EC2-Classic instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances Information about one or more linked EC2-Classic instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClassicLinkInstancesResult withInstances(java.util.Collection<ClassicLinkInstance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ClassicLinkInstance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ClassicLinkInstance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
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
    public DescribeClassicLinkInstancesResult withNextToken(String nextToken) {
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
        if (getInstances() != null) sb.append("Instances: " + getInstances() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClassicLinkInstancesResult == false) return false;
        DescribeClassicLinkInstancesResult other = (DescribeClassicLinkInstancesResult)obj;
        
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeClassicLinkInstancesResult clone() {
        try {
            return (DescribeClassicLinkInstancesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    