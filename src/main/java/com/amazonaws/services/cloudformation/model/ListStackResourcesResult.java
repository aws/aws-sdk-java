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
 * The output for a ListStackResources action.
 * </p>
 */
public class ListStackResourcesResult implements Serializable {

    /**
     * A list of <code>StackResourceSummary</code> structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StackResourceSummary> stackResourceSummaries;

    /**
     * String that identifies the start of the next list of events, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * A list of <code>StackResourceSummary</code> structures.
     *
     * @return A list of <code>StackResourceSummary</code> structures.
     */
    public java.util.List<StackResourceSummary> getStackResourceSummaries() {
        if (stackResourceSummaries == null) {
              stackResourceSummaries = new com.amazonaws.internal.ListWithAutoConstructFlag<StackResourceSummary>();
              stackResourceSummaries.setAutoConstruct(true);
        }
        return stackResourceSummaries;
    }
    
    /**
     * A list of <code>StackResourceSummary</code> structures.
     *
     * @param stackResourceSummaries A list of <code>StackResourceSummary</code> structures.
     */
    public void setStackResourceSummaries(java.util.Collection<StackResourceSummary> stackResourceSummaries) {
        if (stackResourceSummaries == null) {
            this.stackResourceSummaries = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StackResourceSummary> stackResourceSummariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackResourceSummary>(stackResourceSummaries.size());
        stackResourceSummariesCopy.addAll(stackResourceSummaries);
        this.stackResourceSummaries = stackResourceSummariesCopy;
    }
    
    /**
     * A list of <code>StackResourceSummary</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackResourceSummaries A list of <code>StackResourceSummary</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStackResourcesResult withStackResourceSummaries(StackResourceSummary... stackResourceSummaries) {
        if (getStackResourceSummaries() == null) setStackResourceSummaries(new java.util.ArrayList<StackResourceSummary>(stackResourceSummaries.length));
        for (StackResourceSummary value : stackResourceSummaries) {
            getStackResourceSummaries().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>StackResourceSummary</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackResourceSummaries A list of <code>StackResourceSummary</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStackResourcesResult withStackResourceSummaries(java.util.Collection<StackResourceSummary> stackResourceSummaries) {
        if (stackResourceSummaries == null) {
            this.stackResourceSummaries = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StackResourceSummary> stackResourceSummariesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackResourceSummary>(stackResourceSummaries.size());
            stackResourceSummariesCopy.addAll(stackResourceSummaries);
            this.stackResourceSummaries = stackResourceSummariesCopy;
        }

        return this;
    }

    /**
     * String that identifies the start of the next list of events, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return String that identifies the start of the next list of events, if there
     *         is one.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * String that identifies the start of the next list of events, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of events, if there
     *         is one.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * String that identifies the start of the next list of events, if there
     * is one.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of events, if there
     *         is one.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStackResourcesResult withNextToken(String nextToken) {
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
        if (getStackResourceSummaries() != null) sb.append("StackResourceSummaries: " + getStackResourceSummaries() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackResourceSummaries() == null) ? 0 : getStackResourceSummaries().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStackResourcesResult == false) return false;
        ListStackResourcesResult other = (ListStackResourcesResult)obj;
        
        if (other.getStackResourceSummaries() == null ^ this.getStackResourceSummaries() == null) return false;
        if (other.getStackResourceSummaries() != null && other.getStackResourceSummaries().equals(this.getStackResourceSummaries()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    