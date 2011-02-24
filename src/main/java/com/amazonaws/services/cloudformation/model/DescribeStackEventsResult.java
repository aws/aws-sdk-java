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
 * The output for a DescribeStackEvents action.
 * </p>
 */
public class DescribeStackEventsResult {

    /**
     * A list of <code>StackEvents</code> structures.
     */
    private java.util.List<StackEvent> stackEvents;

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
            stackEvents = new java.util.ArrayList<StackEvent>();
        }
        return stackEvents;
    }
    
    /**
     * A list of <code>StackEvents</code> structures.
     *
     * @param stackEvents A list of <code>StackEvents</code> structures.
     */
    public void setStackEvents(java.util.Collection<StackEvent> stackEvents) {
        java.util.List<StackEvent> stackEventsCopy = new java.util.ArrayList<StackEvent>();
        if (stackEvents != null) {
            stackEventsCopy.addAll(stackEvents);
        }
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
        java.util.List<StackEvent> stackEventsCopy = new java.util.ArrayList<StackEvent>();
        if (stackEvents != null) {
            stackEventsCopy.addAll(stackEvents);
        }
        this.stackEvents = stackEventsCopy;

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
        sb.append("StackEvents: " + stackEvents + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    