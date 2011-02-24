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
package com.amazonaws.services.cloudformation.model;

/**
 * <p>
 * The output for a DescribeStackResources action.
 * </p>
 */
public class DescribeStackResourcesResult {

    /**
     * A list of <code>StackResource</code> structures.
     */
    private java.util.List<StackResource> stackResources;

    /**
     * A list of <code>StackResource</code> structures.
     *
     * @return A list of <code>StackResource</code> structures.
     */
    public java.util.List<StackResource> getStackResources() {
        if (stackResources == null) {
            stackResources = new java.util.ArrayList<StackResource>();
        }
        return stackResources;
    }
    
    /**
     * A list of <code>StackResource</code> structures.
     *
     * @param stackResources A list of <code>StackResource</code> structures.
     */
    public void setStackResources(java.util.Collection<StackResource> stackResources) {
        java.util.List<StackResource> stackResourcesCopy = new java.util.ArrayList<StackResource>();
        if (stackResources != null) {
            stackResourcesCopy.addAll(stackResources);
        }
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
        java.util.List<StackResource> stackResourcesCopy = new java.util.ArrayList<StackResource>();
        if (stackResources != null) {
            stackResourcesCopy.addAll(stackResources);
        }
        this.stackResources = stackResourcesCopy;

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
        sb.append("StackResources: " + stackResources + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    