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
 * The output for a DescribeStacks action.
 * </p>
 */
public class DescribeStacksResult implements Serializable {

    /**
     * A list of stack structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Stack> stacks;

    /**
     * String that identifies the start of the next list of stacks, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * A list of stack structures.
     *
     * @return A list of stack structures.
     */
    public java.util.List<Stack> getStacks() {
        if (stacks == null) {
              stacks = new com.amazonaws.internal.ListWithAutoConstructFlag<Stack>();
              stacks.setAutoConstruct(true);
        }
        return stacks;
    }
    
    /**
     * A list of stack structures.
     *
     * @param stacks A list of stack structures.
     */
    public void setStacks(java.util.Collection<Stack> stacks) {
        if (stacks == null) {
            this.stacks = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Stack> stacksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Stack>(stacks.size());
        stacksCopy.addAll(stacks);
        this.stacks = stacksCopy;
    }
    
    /**
     * A list of stack structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stacks A list of stack structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStacksResult withStacks(Stack... stacks) {
        if (getStacks() == null) setStacks(new java.util.ArrayList<Stack>(stacks.length));
        for (Stack value : stacks) {
            getStacks().add(value);
        }
        return this;
    }
    
    /**
     * A list of stack structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stacks A list of stack structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStacksResult withStacks(java.util.Collection<Stack> stacks) {
        if (stacks == null) {
            this.stacks = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Stack> stacksCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Stack>(stacks.size());
            stacksCopy.addAll(stacks);
            this.stacks = stacksCopy;
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
    public DescribeStacksResult withNextToken(String nextToken) {
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
        if (getStacks() != null) sb.append("Stacks: " + getStacks() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStacks() == null) ? 0 : getStacks().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStacksResult == false) return false;
        DescribeStacksResult other = (DescribeStacksResult)obj;
        
        if (other.getStacks() == null ^ this.getStacks() == null) return false;
        if (other.getStacks() != null && other.getStacks().equals(this.getStacks()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    