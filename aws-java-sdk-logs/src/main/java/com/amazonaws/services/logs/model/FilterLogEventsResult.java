/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/FilterLogEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterLogEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The matched events.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FilteredLogEvent> events;
    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been searched completely.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SearchedLogStream> searchedLogStreams;
    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The matched events.
     * </p>
     * 
     * @return The matched events.
     */

    public java.util.List<FilteredLogEvent> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<FilteredLogEvent>();
        }
        return events;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * 
     * @param events
     *        The matched events.
     */

    public void setEvents(java.util.Collection<FilteredLogEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<FilteredLogEvent>(events);
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The matched events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsResult withEvents(FilteredLogEvent... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<FilteredLogEvent>(events.length));
        }
        for (FilteredLogEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The matched events.
     * </p>
     * 
     * @param events
     *        The matched events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsResult withEvents(java.util.Collection<FilteredLogEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been searched completely.
     * </p>
     * 
     * @return Indicates which log streams have been searched and whether each has been searched completely.
     */

    public java.util.List<SearchedLogStream> getSearchedLogStreams() {
        if (searchedLogStreams == null) {
            searchedLogStreams = new com.amazonaws.internal.SdkInternalList<SearchedLogStream>();
        }
        return searchedLogStreams;
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been searched completely.
     * </p>
     * 
     * @param searchedLogStreams
     *        Indicates which log streams have been searched and whether each has been searched completely.
     */

    public void setSearchedLogStreams(java.util.Collection<SearchedLogStream> searchedLogStreams) {
        if (searchedLogStreams == null) {
            this.searchedLogStreams = null;
            return;
        }

        this.searchedLogStreams = new com.amazonaws.internal.SdkInternalList<SearchedLogStream>(searchedLogStreams);
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been searched completely.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSearchedLogStreams(java.util.Collection)} or {@link #withSearchedLogStreams(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param searchedLogStreams
     *        Indicates which log streams have been searched and whether each has been searched completely.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsResult withSearchedLogStreams(SearchedLogStream... searchedLogStreams) {
        if (this.searchedLogStreams == null) {
            setSearchedLogStreams(new com.amazonaws.internal.SdkInternalList<SearchedLogStream>(searchedLogStreams.length));
        }
        for (SearchedLogStream ele : searchedLogStreams) {
            this.searchedLogStreams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates which log streams have been searched and whether each has been searched completely.
     * </p>
     * 
     * @param searchedLogStreams
     *        Indicates which log streams have been searched and whether each has been searched completely.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsResult withSearchedLogStreams(java.util.Collection<SearchedLogStream> searchedLogStreams) {
        setSearchedLogStreams(searchedLogStreams);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. The token expires after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires after 24 hours.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. The token expires after 24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. The token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. The token expires after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getSearchedLogStreams() != null)
            sb.append("SearchedLogStreams: ").append(getSearchedLogStreams()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterLogEventsResult == false)
            return false;
        FilterLogEventsResult other = (FilterLogEventsResult) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getSearchedLogStreams() == null ^ this.getSearchedLogStreams() == null)
            return false;
        if (other.getSearchedLogStreams() != null && other.getSearchedLogStreams().equals(this.getSearchedLogStreams()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
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
    public FilterLogEventsResult clone() {
        try {
            return (FilterLogEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
