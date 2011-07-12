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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#listStacks(ListStacksRequest) ListStacks operation}.
 * <p>
 * Returns the summary information for stacks whose status matches the
 * specified StackStatusFilter. Summary information for stacks that have
 * been deleted is kept for 90 days after the stack is deleted. If no
 * StackStatusFilter is specified, summary information for all stacks is
 * returned (including existing stacks and stacks that have been
 * deleted).
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#listStacks(ListStacksRequest)
 */
public class ListStacksRequest extends AmazonWebServiceRequest {

    private String nextToken;

    private java.util.List<String> stackStatusFilters;

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
    public ListStacksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    
    
    /**
     * Returns the value of the StackStatusFilters property for this object.
     *
     * @return The value of the StackStatusFilters property for this object.
     */
    public java.util.List<String> getStackStatusFilters() {
        if (stackStatusFilters == null) {
            stackStatusFilters = new java.util.ArrayList<String>();
        }
        return stackStatusFilters;
    }
    
    /**
     * Sets the value of the StackStatusFilters property for this object.
     *
     * @param stackStatusFilters The new value for the StackStatusFilters property for this object.
     */
    public void setStackStatusFilters(java.util.Collection<String> stackStatusFilters) {
        java.util.List<String> stackStatusFiltersCopy = new java.util.ArrayList<String>();
        if (stackStatusFilters != null) {
            stackStatusFiltersCopy.addAll(stackStatusFilters);
        }
        this.stackStatusFilters = stackStatusFiltersCopy;
    }
    
    /**
     * Sets the value of the StackStatusFilters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackStatusFilters The new value for the StackStatusFilters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListStacksRequest withStackStatusFilters(String... stackStatusFilters) {
        for (String value : stackStatusFilters) {
            getStackStatusFilters().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the StackStatusFilters property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackStatusFilters The new value for the StackStatusFilters property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListStacksRequest withStackStatusFilters(java.util.Collection<String> stackStatusFilters) {
        java.util.List<String> stackStatusFiltersCopy = new java.util.ArrayList<String>();
        if (stackStatusFilters != null) {
            stackStatusFiltersCopy.addAll(stackStatusFilters);
        }
        this.stackStatusFilters = stackStatusFiltersCopy;

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
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("StackStatusFilters: " + stackStatusFilters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    