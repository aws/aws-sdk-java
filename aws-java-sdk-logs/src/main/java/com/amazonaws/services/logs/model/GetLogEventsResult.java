/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * Get Log Events Result
 */
public class GetLogEventsResult implements Serializable {

    private com.amazonaws.internal.ListWithAutoConstructFlag<OutputLogEvent> events;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     */
    private String nextForwardToken;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     */
    private String nextBackwardToken;

    /**
     * Returns the value of the Events property for this object.
     *
     * @return The value of the Events property for this object.
     */
    public java.util.List<OutputLogEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<OutputLogEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * Sets the value of the Events property for this object.
     *
     * @param events The new value for the Events property for this object.
     */
    public void setEvents(java.util.Collection<OutputLogEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OutputLogEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OutputLogEvent>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * Sets the value of the Events property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The new value for the Events property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsResult withEvents(OutputLogEvent... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<OutputLogEvent>(events.length));
        for (OutputLogEvent value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Events property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The new value for the Events property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsResult withEvents(java.util.Collection<OutputLogEvent> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OutputLogEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OutputLogEvent>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public String getNextForwardToken() {
        return nextForwardToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @param nextForwardToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public void setNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextForwardToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsResult withNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public String getNextBackwardToken() {
        return nextBackwardToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @param nextBackwardToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public void setNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextBackwardToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsResult withNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
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
        if (getNextForwardToken() != null) sb.append("NextForwardToken: " + getNextForwardToken() + ",");
        if (getNextBackwardToken() != null) sb.append("NextBackwardToken: " + getNextBackwardToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getNextForwardToken() == null) ? 0 : getNextForwardToken().hashCode()); 
        hashCode = prime * hashCode + ((getNextBackwardToken() == null) ? 0 : getNextBackwardToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetLogEventsResult == false) return false;
        GetLogEventsResult other = (GetLogEventsResult)obj;
        
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getNextForwardToken() == null ^ this.getNextForwardToken() == null) return false;
        if (other.getNextForwardToken() != null && other.getNextForwardToken().equals(this.getNextForwardToken()) == false) return false; 
        if (other.getNextBackwardToken() == null ^ this.getNextBackwardToken() == null) return false;
        if (other.getNextBackwardToken() != null && other.getNextBackwardToken().equals(this.getNextBackwardToken()) == false) return false; 
        return true;
    }
    
}
    