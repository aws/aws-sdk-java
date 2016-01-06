/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * </p>
 */
public class DescribeEventSubscriptionsResult implements Serializable, Cloneable {

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     */
    private String marker;

    /**
     * A list of event subscriptions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EventSubscription> eventSubscriptionsList;

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @return A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEventSubscriptionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of event subscriptions.
     *
     * @return A list of event subscriptions.
     */
    public java.util.List<EventSubscription> getEventSubscriptionsList() {
        if (eventSubscriptionsList == null) {
              eventSubscriptionsList = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSubscription>();
              eventSubscriptionsList.setAutoConstruct(true);
        }
        return eventSubscriptionsList;
    }
    
    /**
     * A list of event subscriptions.
     *
     * @param eventSubscriptionsList A list of event subscriptions.
     */
    public void setEventSubscriptionsList(java.util.Collection<EventSubscription> eventSubscriptionsList) {
        if (eventSubscriptionsList == null) {
            this.eventSubscriptionsList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EventSubscription> eventSubscriptionsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSubscription>(eventSubscriptionsList.size());
        eventSubscriptionsListCopy.addAll(eventSubscriptionsList);
        this.eventSubscriptionsList = eventSubscriptionsListCopy;
    }
    
    /**
     * A list of event subscriptions.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEventSubscriptionsList(java.util.Collection)} or
     * {@link #withEventSubscriptionsList(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSubscriptionsList A list of event subscriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEventSubscriptionsResult withEventSubscriptionsList(EventSubscription... eventSubscriptionsList) {
        if (getEventSubscriptionsList() == null) setEventSubscriptionsList(new java.util.ArrayList<EventSubscription>(eventSubscriptionsList.length));
        for (EventSubscription value : eventSubscriptionsList) {
            getEventSubscriptionsList().add(value);
        }
        return this;
    }
    
    /**
     * A list of event subscriptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventSubscriptionsList A list of event subscriptions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeEventSubscriptionsResult withEventSubscriptionsList(java.util.Collection<EventSubscription> eventSubscriptionsList) {
        if (eventSubscriptionsList == null) {
            this.eventSubscriptionsList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EventSubscription> eventSubscriptionsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EventSubscription>(eventSubscriptionsList.size());
            eventSubscriptionsListCopy.addAll(eventSubscriptionsList);
            this.eventSubscriptionsList = eventSubscriptionsListCopy;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getEventSubscriptionsList() != null) sb.append("EventSubscriptionsList: " + getEventSubscriptionsList() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getEventSubscriptionsList() == null) ? 0 : getEventSubscriptionsList().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeEventSubscriptionsResult == false) return false;
        DescribeEventSubscriptionsResult other = (DescribeEventSubscriptionsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getEventSubscriptionsList() == null ^ this.getEventSubscriptionsList() == null) return false;
        if (other.getEventSubscriptionsList() != null && other.getEventSubscriptionsList().equals(this.getEventSubscriptionsList()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeEventSubscriptionsResult clone() {
        try {
            return (DescribeEventSubscriptionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    