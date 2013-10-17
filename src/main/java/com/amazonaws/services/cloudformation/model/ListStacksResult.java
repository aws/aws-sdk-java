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
 * The output for ListStacks action.
 * </p>
 */
public class ListStacksResult implements Serializable {

    /**
     * A list of <code>StackSummary</code> structures containing information
     * about the specified stacks.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StackSummary> stackSummaries;

    /**
     * String that identifies the start of the next list of stacks, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * A list of <code>StackSummary</code> structures containing information
     * about the specified stacks.
     *
     * @return A list of <code>StackSummary</code> structures containing information
     *         about the specified stacks.
     */
    public java.util.List<StackSummary> getStackSummaries() {
        if (stackSummaries == null) {
              stackSummaries = new com.amazonaws.internal.ListWithAutoConstructFlag<StackSummary>();
              stackSummaries.setAutoConstruct(true);
        }
        return stackSummaries;
    }
    
    /**
     * A list of <code>StackSummary</code> structures containing information
     * about the specified stacks.
     *
     * @param stackSummaries A list of <code>StackSummary</code> structures containing information
     *         about the specified stacks.
     */
    public void setStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        if (stackSummaries == null) {
            this.stackSummaries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StackSummary> stackSummariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackSummary>(stackSummaries.size());
        stackSummariesCopy.addAll(stackSummaries);
        this.stackSummaries = stackSummariesCopy;
    }
    
    /**
     * A list of <code>StackSummary</code> structures containing information
     * about the specified stacks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackSummaries A list of <code>StackSummary</code> structures containing information
     *         about the specified stacks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStacksResult withStackSummaries(StackSummary... stackSummaries) {
        if (getStackSummaries() == null) setStackSummaries(new java.util.ArrayList<StackSummary>(stackSummaries.length));
        for (StackSummary value : stackSummaries) {
            getStackSummaries().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>StackSummary</code> structures containing information
     * about the specified stacks.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackSummaries A list of <code>StackSummary</code> structures containing information
     *         about the specified stacks.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStacksResult withStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        if (stackSummaries == null) {
            this.stackSummaries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StackSummary> stackSummariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackSummary>(stackSummaries.size());
            stackSummariesCopy.addAll(stackSummaries);
            this.stackSummaries = stackSummariesCopy;
        }

        return this;
    }

    /**
     * String that identifies the start of the next list of stacks, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return String that identifies the start of the next list of stacks, if there
     *         is one.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * String that identifies the start of the next list of stacks, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of stacks, if there
     *         is one.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * String that identifies the start of the next list of stacks, if there
     * is one.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of stacks, if there
     *         is one.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStacksResult withNextToken(String nextToken) {
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
        if (getStackSummaries() != null) sb.append("StackSummaries: " + getStackSummaries() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackSummaries() == null) ? 0 : getStackSummaries().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStacksResult == false) return false;
        ListStacksResult other = (ListStacksResult)obj;
        
        if (other.getStackSummaries() == null ^ this.getStackSummaries() == null) return false;
        if (other.getStackSummaries() != null && other.getStackSummaries().equals(this.getStackSummaries()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    