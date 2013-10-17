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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Result message wrapping a list of event descriptions.
 * </p>
 */
public class DescribeEventsResult implements Serializable {

    /**
     * A list of <a>EventDescription</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EventDescription> events;

    /**
     * If returned, this indicates that there are more results to obtain. Use
     * this token in the next <a>DescribeEvents</a> call to get the next
     * batch of events.
     */
    private String nextToken;

    /**
     * A list of <a>EventDescription</a>.
     *
     * @return A list of <a>EventDescription</a>.
     */
    public java.util.List<EventDescription> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<EventDescription>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * A list of <a>EventDescription</a>.
     *
     * @param events A list of <a>EventDescription</a>.
     */
    public void setEvents(java.util.Collection<EventDescription> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EventDescription> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventDescription>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * A list of <a>EventDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of <a>EventDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsResult withEvents(EventDescription... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<EventDescription>(events.length));
        for (EventDescription value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>EventDescription</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of <a>EventDescription</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsResult withEvents(java.util.Collection<EventDescription> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EventDescription> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventDescription>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * If returned, this indicates that there are more results to obtain. Use
     * this token in the next <a>DescribeEvents</a> call to get the next
     * batch of events.
     *
     * @return If returned, this indicates that there are more results to obtain. Use
     *         this token in the next <a>DescribeEvents</a> call to get the next
     *         batch of events.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * If returned, this indicates that there are more results to obtain. Use
     * this token in the next <a>DescribeEvents</a> call to get the next
     * batch of events.
     *
     * @param nextToken If returned, this indicates that there are more results to obtain. Use
     *         this token in the next <a>DescribeEvents</a> call to get the next
     *         batch of events.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * If returned, this indicates that there are more results to obtain. Use
     * this token in the next <a>DescribeEvents</a> call to get the next
     * batch of events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken If returned, this indicates that there are more results to obtain. Use
     *         this token in the next <a>DescribeEvents</a> call to get the next
     *         batch of events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeEventsResult withNextToken(String nextToken) {
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
        if (getEvents() != null) sb.append("Events: " + getEvents() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEventsResult == false) return false;
        DescribeEventsResult other = (DescribeEventsResult)obj;
        
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    