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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Paginated representation of a workflow history for a workflow execution. This is the up to date, complete and authoritative record of the events
 * related to all tasks and events in the life of the workflow execution.
 * </p>
 */
public class History implements Serializable {

    /**
     * The list of history events.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HistoryEvent> events;

    /**
     * The token for the next page. If set, the history consists of more than
     * one page and the next page can be retrieved by repeating the request
     * with this token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     */
    private String nextPageToken;

    /**
     * The list of history events.
     *
     * @return The list of history events.
     */
    public java.util.List<HistoryEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<HistoryEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * The list of history events.
     *
     * @param events The list of history events.
     */
    public void setEvents(java.util.Collection<HistoryEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HistoryEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HistoryEvent>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * The list of history events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The list of history events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public History withEvents(HistoryEvent... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<HistoryEvent>(events.length));
        for (HistoryEvent value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * The list of history events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The list of history events.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public History withEvents(java.util.Collection<HistoryEvent> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HistoryEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HistoryEvent>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * The token for the next page. If set, the history consists of more than
     * one page and the next page can be retrieved by repeating the request
     * with this token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @return The token for the next page. If set, the history consists of more than
     *         one page and the next page can be retrieved by repeating the request
     *         with this token and all other arguments unchanged.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * The token for the next page. If set, the history consists of more than
     * one page and the next page can be retrieved by repeating the request
     * with this token and all other arguments unchanged.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken The token for the next page. If set, the history consists of more than
     *         one page and the next page can be retrieved by repeating the request
     *         with this token and all other arguments unchanged.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * The token for the next page. If set, the history consists of more than
     * one page and the next page can be retrieved by repeating the request
     * with this token and all other arguments unchanged.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     *
     * @param nextPageToken The token for the next page. If set, the history consists of more than
     *         one page and the next page can be retrieved by repeating the request
     *         with this token and all other arguments unchanged.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public History withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof History == false) return false;
        History other = (History)obj;
        
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        return true;
    }
    
}
    