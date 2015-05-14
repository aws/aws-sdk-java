/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Filter Log Events Result
 */
public class FilterLogEventsResult implements Serializable, Cloneable {

    /**
     * A list of <code class="code">FilteredLogEvent</code> objects
     * representing the matched events from the request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<FilteredLogEvent> events;

    /**
     * A list of <code class="code">SearchedLogStream</code> objects
     * indicating which log streams have been searched in this request and
     * whether each has been searched completely or still has more to be
     * paginated.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SearchedLogStream> searchedLogStreams;

    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * A list of <code class="code">FilteredLogEvent</code> objects
     * representing the matched events from the request.
     *
     * @return A list of <code class="code">FilteredLogEvent</code> objects
     *         representing the matched events from the request.
     */
    public java.util.List<FilteredLogEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<FilteredLogEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * A list of <code class="code">FilteredLogEvent</code> objects
     * representing the matched events from the request.
     *
     * @param events A list of <code class="code">FilteredLogEvent</code> objects
     *         representing the matched events from the request.
     */
    public void setEvents(java.util.Collection<FilteredLogEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<FilteredLogEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FilteredLogEvent>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * A list of <code class="code">FilteredLogEvent</code> objects
     * representing the matched events from the request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEvents(java.util.Collection)} or {@link
     * #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of <code class="code">FilteredLogEvent</code> objects
     *         representing the matched events from the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsResult withEvents(FilteredLogEvent... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<FilteredLogEvent>(events.length));
        for (FilteredLogEvent value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code class="code">FilteredLogEvent</code> objects
     * representing the matched events from the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events A list of <code class="code">FilteredLogEvent</code> objects
     *         representing the matched events from the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsResult withEvents(java.util.Collection<FilteredLogEvent> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<FilteredLogEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<FilteredLogEvent>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
        }

        return this;
    }

    /**
     * A list of <code class="code">SearchedLogStream</code> objects
     * indicating which log streams have been searched in this request and
     * whether each has been searched completely or still has more to be
     * paginated.
     *
     * @return A list of <code class="code">SearchedLogStream</code> objects
     *         indicating which log streams have been searched in this request and
     *         whether each has been searched completely or still has more to be
     *         paginated.
     */
    public java.util.List<SearchedLogStream> getSearchedLogStreams() {
        if (searchedLogStreams == null) {
              searchedLogStreams = new com.amazonaws.internal.ListWithAutoConstructFlag<SearchedLogStream>();
              searchedLogStreams.setAutoConstruct(true);
        }
        return searchedLogStreams;
    }
    
    /**
     * A list of <code class="code">SearchedLogStream</code> objects
     * indicating which log streams have been searched in this request and
     * whether each has been searched completely or still has more to be
     * paginated.
     *
     * @param searchedLogStreams A list of <code class="code">SearchedLogStream</code> objects
     *         indicating which log streams have been searched in this request and
     *         whether each has been searched completely or still has more to be
     *         paginated.
     */
    public void setSearchedLogStreams(java.util.Collection<SearchedLogStream> searchedLogStreams) {
        if (searchedLogStreams == null) {
            this.searchedLogStreams = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SearchedLogStream> searchedLogStreamsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SearchedLogStream>(searchedLogStreams.size());
        searchedLogStreamsCopy.addAll(searchedLogStreams);
        this.searchedLogStreams = searchedLogStreamsCopy;
    }
    
    /**
     * A list of <code class="code">SearchedLogStream</code> objects
     * indicating which log streams have been searched in this request and
     * whether each has been searched completely or still has more to be
     * paginated.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSearchedLogStreams(java.util.Collection)} or
     * {@link #withSearchedLogStreams(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param searchedLogStreams A list of <code class="code">SearchedLogStream</code> objects
     *         indicating which log streams have been searched in this request and
     *         whether each has been searched completely or still has more to be
     *         paginated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsResult withSearchedLogStreams(SearchedLogStream... searchedLogStreams) {
        if (getSearchedLogStreams() == null) setSearchedLogStreams(new java.util.ArrayList<SearchedLogStream>(searchedLogStreams.length));
        for (SearchedLogStream value : searchedLogStreams) {
            getSearchedLogStreams().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code class="code">SearchedLogStream</code> objects
     * indicating which log streams have been searched in this request and
     * whether each has been searched completely or still has more to be
     * paginated.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param searchedLogStreams A list of <code class="code">SearchedLogStream</code> objects
     *         indicating which log streams have been searched in this request and
     *         whether each has been searched completely or still has more to be
     *         paginated.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsResult withSearchedLogStreams(java.util.Collection<SearchedLogStream> searchedLogStreams) {
        if (searchedLogStreams == null) {
            this.searchedLogStreams = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SearchedLogStream> searchedLogStreamsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SearchedLogStream>(searchedLogStreams.size());
            searchedLogStreamsCopy.addAll(searchedLogStreams);
            this.searchedLogStreams = searchedLogStreamsCopy;
        }

        return this;
    }

    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A pagination token obtained from a <code
     *         class="code">FilterLogEvents</code> response to continue paginating
     *         the FilterLogEvents results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A pagination token obtained from a <code
     *         class="code">FilterLogEvents</code> response to continue paginating
     *         the FilterLogEvents results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A pagination token obtained from a <code
     *         class="code">FilterLogEvents</code> response to continue paginating
     *         the FilterLogEvents results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsResult withNextToken(String nextToken) {
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
        if (getSearchedLogStreams() != null) sb.append("SearchedLogStreams: " + getSearchedLogStreams() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        hashCode = prime * hashCode + ((getSearchedLogStreams() == null) ? 0 : getSearchedLogStreams().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FilterLogEventsResult == false) return false;
        FilterLogEventsResult other = (FilterLogEventsResult)obj;
        
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        if (other.getSearchedLogStreams() == null ^ this.getSearchedLogStreams() == null) return false;
        if (other.getSearchedLogStreams() != null && other.getSearchedLogStreams().equals(this.getSearchedLogStreams()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public FilterLogEventsResult clone() {
        try {
            return (FilterLogEventsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    