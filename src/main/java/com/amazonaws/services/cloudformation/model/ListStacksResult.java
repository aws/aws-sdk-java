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
 * List Stacks Result
 */
public class ListStacksResult {

    private java.util.List<StackSummary> stackSummaries;

    private String nextToken;

    /**
     * Returns the value of the StackSummaries property for this object.
     *
     * @return The value of the StackSummaries property for this object.
     */
    public java.util.List<StackSummary> getStackSummaries() {
        if (stackSummaries == null) {
            stackSummaries = new java.util.ArrayList<StackSummary>();
        }
        return stackSummaries;
    }
    
    /**
     * Sets the value of the StackSummaries property for this object.
     *
     * @param stackSummaries The new value for the StackSummaries property for this object.
     */
    public void setStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        java.util.List<StackSummary> stackSummariesCopy = new java.util.ArrayList<StackSummary>();
        if (stackSummaries != null) {
            stackSummariesCopy.addAll(stackSummaries);
        }
        this.stackSummaries = stackSummariesCopy;
    }
    
    /**
     * Sets the value of the StackSummaries property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackSummaries The new value for the StackSummaries property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListStacksResult withStackSummaries(StackSummary... stackSummaries) {
        for (StackSummary value : stackSummaries) {
            getStackSummaries().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the StackSummaries property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackSummaries The new value for the StackSummaries property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListStacksResult withStackSummaries(java.util.Collection<StackSummary> stackSummaries) {
        java.util.List<StackSummary> stackSummariesCopy = new java.util.ArrayList<StackSummary>();
        if (stackSummaries != null) {
            stackSummariesCopy.addAll(stackSummaries);
        }
        this.stackSummaries = stackSummariesCopy;

        return this;
    }
    
    /**
     * Returns the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return The value of the NextToken property for this object.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * Sets the value of the NextToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken The new value for the NextToken property for this object.
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
        sb.append("StackSummaries: " + stackSummaries + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    