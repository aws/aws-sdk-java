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
 * The output for a DescribeStackEvents action.
 * </p>
 */
public class DescribeStackEventsResult implements Serializable {

    /**
     * A list of <code>StackEvents</code> structures.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<StackEvent> stackEvents;

    /**
     * String that identifies the start of the next list of events, if there
     * is one.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * A list of <code>StackEvents</code> structures.
     *
     * @return A list of <code>StackEvents</code> structures.
     */
    public java.util.List<StackEvent> getStackEvents() {
        if (stackEvents == null) {
              stackEvents = new com.amazonaws.internal.ListWithAutoConstructFlag<StackEvent>();
              stackEvents.setAutoConstruct(true);
        }
        return stackEvents;
    }
    
    /**
     * A list of <code>StackEvents</code> structures.
     *
     * @param stackEvents A list of <code>StackEvents</code> structures.
     */
    public void setStackEvents(java.util.Collection<StackEvent> stackEvents) {
        if (stackEvents == null) {
            this.stackEvents = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<StackEvent> stackEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackEvent>(stackEvents.size());
        stackEventsCopy.addAll(stackEvents);
        this.stackEvents = stackEventsCopy;
    }
    
    /**
     * A list of <code>StackEvents</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackEvents A list of <code>StackEvents</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStackEventsResult withStackEvents(StackEvent... stackEvents) {
        if (getStackEvents() == null) setStackEvents(new java.util.ArrayList<StackEvent>(stackEvents.length));
        for (StackEvent value : stackEvents) {
            getStackEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>StackEvents</code> structures.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackEvents A list of <code>StackEvents</code> structures.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeStackEventsResult withStackEvents(java.util.Collection<StackEvent> stackEvents) {
        if (stackEvents == null) {
            this.stackEvents = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<StackEvent> stackEventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<StackEvent>(stackEvents.size());
            stackEventsCopy.addAll(stackEvents);
            this.stackEvents = stackEventsCopy;
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
    public DescribeStackEventsResult withNextToken(String nextToken) {
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
        if (getStackEvents() != null) sb.append("StackEvents: " + getStackEvents() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackEvents() == null) ? 0 : getStackEvents().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeStackEventsResult == false) return false;
        DescribeStackEventsResult other = (DescribeStackEventsResult)obj;
        
        if (other.getStackEvents() == null ^ this.getStackEvents() == null) return false;
        if (other.getStackEvents() != null && other.getStackEvents().equals(this.getStackEvents()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    