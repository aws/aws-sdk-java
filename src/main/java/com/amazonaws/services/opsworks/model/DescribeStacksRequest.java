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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeStacks(DescribeStacksRequest) DescribeStacks operation}.
 * <p>
 * Requests a description of one or more stacks.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeStacks(DescribeStacksRequest)
 */
public class DescribeStacksRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * An array of stack IDs that specify the stacks to be described. If you
     * omit this parameter, <code>DescribeStacks</code> returns a description
     * of every stack.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> stackIds;

    /**
     * An array of stack IDs that specify the stacks to be described. If you
     * omit this parameter, <code>DescribeStacks</code> returns a description
     * of every stack.
     *
     * @return An array of stack IDs that specify the stacks to be described. If you
     *         omit this parameter, <code>DescribeStacks</code> returns a description
     *         of every stack.
     */
    public java.util.List<String> getStackIds() {
        if (stackIds == null) {
              stackIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              stackIds.setAutoConstruct(true);
        }
        return stackIds;
    }
    
    /**
     * An array of stack IDs that specify the stacks to be described. If you
     * omit this parameter, <code>DescribeStacks</code> returns a description
     * of every stack.
     *
     * @param stackIds An array of stack IDs that specify the stacks to be described. If you
     *         omit this parameter, <code>DescribeStacks</code> returns a description
     *         of every stack.
     */
    public void setStackIds(java.util.Collection<String> stackIds) {
        if (stackIds == null) {
            this.stackIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> stackIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stackIds.size());
        stackIdsCopy.addAll(stackIds);
        this.stackIds = stackIdsCopy;
    }
    
    /**
     * An array of stack IDs that specify the stacks to be described. If you
     * omit this parameter, <code>DescribeStacks</code> returns a description
     * of every stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackIds An array of stack IDs that specify the stacks to be described. If you
     *         omit this parameter, <code>DescribeStacks</code> returns a description
     *         of every stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStacksRequest withStackIds(String... stackIds) {
        if (getStackIds() == null) setStackIds(new java.util.ArrayList<String>(stackIds.length));
        for (String value : stackIds) {
            getStackIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of stack IDs that specify the stacks to be described. If you
     * omit this parameter, <code>DescribeStacks</code> returns a description
     * of every stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackIds An array of stack IDs that specify the stacks to be described. If you
     *         omit this parameter, <code>DescribeStacks</code> returns a description
     *         of every stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStacksRequest withStackIds(java.util.Collection<String> stackIds) {
        if (stackIds == null) {
            this.stackIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> stackIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stackIds.size());
            stackIdsCopy.addAll(stackIds);
            this.stackIds = stackIdsCopy;
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
        if (getStackIds() != null) sb.append("StackIds: " + getStackIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackIds() == null) ? 0 : getStackIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStacksRequest == false) return false;
        DescribeStacksRequest other = (DescribeStacksRequest)obj;
        
        if (other.getStackIds() == null ^ this.getStackIds() == null) return false;
        if (other.getStackIds() != null && other.getStackIds().equals(this.getStackIds()) == false) return false; 
        return true;
    }
    
}
    