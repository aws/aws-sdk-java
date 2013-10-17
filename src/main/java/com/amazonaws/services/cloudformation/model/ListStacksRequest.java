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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#listStacks(ListStacksRequest) ListStacks operation}.
 * <p>
 * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary information for stacks that have been deleted
 * is kept for 90 days after the stack is deleted. If no StackStatusFilter is specified, summary information for all stacks is returned (including
 * existing stacks and stacks that have been deleted).
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#listStacks(ListStacksRequest)
 */
public class ListStacksRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * String that identifies the start of the next list of stacks, if there
     * is one. <p>Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * Stack status to use as a filter. Specify one or more stack status
     * codes to list only stacks with the specified status codes. For a
     * complete list of stack status codes, see the <code>StackStatus</code>
     * parameter of the <a>Stack</a> data type.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> stackStatusFilters;

    /**
     * String that identifies the start of the next list of stacks, if there
     * is one. <p>Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return String that identifies the start of the next list of stacks, if there
     *         is one. <p>Default: There is no default value.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * String that identifies the start of the next list of stacks, if there
     * is one. <p>Default: There is no default value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of stacks, if there
     *         is one. <p>Default: There is no default value.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * String that identifies the start of the next list of stacks, if there
     * is one. <p>Default: There is no default value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken String that identifies the start of the next list of stacks, if there
     *         is one. <p>Default: There is no default value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStacksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Stack status to use as a filter. Specify one or more stack status
     * codes to list only stacks with the specified status codes. For a
     * complete list of stack status codes, see the <code>StackStatus</code>
     * parameter of the <a>Stack</a> data type.
     *
     * @return Stack status to use as a filter. Specify one or more stack status
     *         codes to list only stacks with the specified status codes. For a
     *         complete list of stack status codes, see the <code>StackStatus</code>
     *         parameter of the <a>Stack</a> data type.
     */
    public java.util.List<String> getStackStatusFilters() {
        if (stackStatusFilters == null) {
              stackStatusFilters = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              stackStatusFilters.setAutoConstruct(true);
        }
        return stackStatusFilters;
    }
    
    /**
     * Stack status to use as a filter. Specify one or more stack status
     * codes to list only stacks with the specified status codes. For a
     * complete list of stack status codes, see the <code>StackStatus</code>
     * parameter of the <a>Stack</a> data type.
     *
     * @param stackStatusFilters Stack status to use as a filter. Specify one or more stack status
     *         codes to list only stacks with the specified status codes. For a
     *         complete list of stack status codes, see the <code>StackStatus</code>
     *         parameter of the <a>Stack</a> data type.
     */
    public void setStackStatusFilters(java.util.Collection<String> stackStatusFilters) {
        if (stackStatusFilters == null) {
            this.stackStatusFilters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> stackStatusFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stackStatusFilters.size());
        stackStatusFiltersCopy.addAll(stackStatusFilters);
        this.stackStatusFilters = stackStatusFiltersCopy;
    }
    
    /**
     * Stack status to use as a filter. Specify one or more stack status
     * codes to list only stacks with the specified status codes. For a
     * complete list of stack status codes, see the <code>StackStatus</code>
     * parameter of the <a>Stack</a> data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackStatusFilters Stack status to use as a filter. Specify one or more stack status
     *         codes to list only stacks with the specified status codes. For a
     *         complete list of stack status codes, see the <code>StackStatus</code>
     *         parameter of the <a>Stack</a> data type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStacksRequest withStackStatusFilters(String... stackStatusFilters) {
        if (getStackStatusFilters() == null) setStackStatusFilters(new java.util.ArrayList<String>(stackStatusFilters.length));
        for (String value : stackStatusFilters) {
            getStackStatusFilters().add(value);
        }
        return this;
    }
    
    /**
     * Stack status to use as a filter. Specify one or more stack status
     * codes to list only stacks with the specified status codes. For a
     * complete list of stack status codes, see the <code>StackStatus</code>
     * parameter of the <a>Stack</a> data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackStatusFilters Stack status to use as a filter. Specify one or more stack status
     *         codes to list only stacks with the specified status codes. For a
     *         complete list of stack status codes, see the <code>StackStatus</code>
     *         parameter of the <a>Stack</a> data type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStacksRequest withStackStatusFilters(java.util.Collection<String> stackStatusFilters) {
        if (stackStatusFilters == null) {
            this.stackStatusFilters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> stackStatusFiltersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(stackStatusFilters.size());
            stackStatusFiltersCopy.addAll(stackStatusFilters);
            this.stackStatusFilters = stackStatusFiltersCopy;
        }

        return this;
    }

    /**
     * Stack status to use as a filter. Specify one or more stack status
     * codes to list only stacks with the specified status codes. For a
     * complete list of stack status codes, see the <code>StackStatus</code>
     * parameter of the <a>Stack</a> data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackStatusFilters Stack status to use as a filter. Specify one or more stack status
     *         codes to list only stacks with the specified status codes. For a
     *         complete list of stack status codes, see the <code>StackStatus</code>
     *         parameter of the <a>Stack</a> data type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListStacksRequest withStackStatusFilters(StackStatus... stackStatusFilters) {
        java.util.ArrayList<String> stackStatusFiltersCopy = new java.util.ArrayList<String>(stackStatusFilters.length);
        for (StackStatus member : stackStatusFilters) {
            stackStatusFiltersCopy.add(member.toString());
        }
        if (getStackStatusFilters() == null) {
            setStackStatusFilters(stackStatusFiltersCopy);
        } else {
            getStackStatusFilters().addAll(stackStatusFiltersCopy);
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getStackStatusFilters() != null) sb.append("StackStatusFilters: " + getStackStatusFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getStackStatusFilters() == null) ? 0 : getStackStatusFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListStacksRequest == false) return false;
        ListStacksRequest other = (ListStacksRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getStackStatusFilters() == null ^ this.getStackStatusFilters() == null) return false;
        if (other.getStackStatusFilters() != null && other.getStackStatusFilters().equals(this.getStackStatusFilters()) == false) return false; 
        return true;
    }
    
}
    