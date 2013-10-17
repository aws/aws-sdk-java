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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;


/**
 * <p>
 * The output for a DescribeStackResources action.
 * </p>
 */
public class DescribeStackResourcesResult implements Serializable {

    /**
     * A list of <code>StackResource</code> structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StackResource> stackResources;

    /**
     * A list of <code>StackResource</code> structures.
     *
     * @return A list of <code>StackResource</code> structures.
     */
    public java.util.List<StackResource> getStackResources() {
        if (stackResources == null) {
              stackResources = new com.amazonaws.internal.ListWithAutoConstructFlag<StackResource>();
              stackResources.setAutoConstruct(true);
        }
        return stackResources;
    }
    
    /**
     * A list of <code>StackResource</code> structures.
     *
     * @param stackResources A list of <code>StackResource</code> structures.
     */
    public void setStackResources(java.util.Collection<StackResource> stackResources) {
        if (stackResources == null) {
            this.stackResources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StackResource> stackResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackResource>(stackResources.size());
        stackResourcesCopy.addAll(stackResources);
        this.stackResources = stackResourcesCopy;
    }
    
    /**
     * A list of <code>StackResource</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackResources A list of <code>StackResource</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStackResourcesResult withStackResources(StackResource... stackResources) {
        if (getStackResources() == null) setStackResources(new java.util.ArrayList<StackResource>(stackResources.length));
        for (StackResource value : stackResources) {
            getStackResources().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>StackResource</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackResources A list of <code>StackResource</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStackResourcesResult withStackResources(java.util.Collection<StackResource> stackResources) {
        if (stackResources == null) {
            this.stackResources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StackResource> stackResourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackResource>(stackResources.size());
            stackResourcesCopy.addAll(stackResources);
            this.stackResources = stackResourcesCopy;
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
        if (getStackResources() != null) sb.append("StackResources: " + getStackResources() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackResources() == null) ? 0 : getStackResources().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStackResourcesResult == false) return false;
        DescribeStackResourcesResult other = (DescribeStackResourcesResult)obj;
        
        if (other.getStackResources() == null ^ this.getStackResources() == null) return false;
        if (other.getStackResources() != null && other.getStackResources().equals(this.getStackResources()) == false) return false; 
        return true;
    }
    
}
    