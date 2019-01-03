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
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains a response to a LookupEvents action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/LookupEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LookupEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is
     * sorted by time. The most recent event is listed first.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Event> events;
    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is
     * sorted by time. The most recent event is listed first.
     * </p>
     * 
     * @return A list of events returned based on the lookup attributes specified and the CloudTrail event. The events
     *         list is sorted by time. The most recent event is listed first.
     */

    public java.util.List<Event> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<Event>();
        }
        return events;
    }

    /**
     * <p>
     * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is
     * sorted by time. The most recent event is listed first.
     * </p>
     * 
     * @param events
     *        A list of events returned based on the lookup attributes specified and the CloudTrail event. The events
     *        list is sorted by time. The most recent event is listed first.
     */

    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<Event>(events);
    }

    /**
     * <p>
     * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is
     * sorted by time. The most recent event is listed first.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        A list of events returned based on the lookup attributes specified and the CloudTrail event. The events
     *        list is sorted by time. The most recent event is listed first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsResult withEvents(Event... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<Event>(events.length));
        }
        for (Event ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of events returned based on the lookup attributes specified and the CloudTrail event. The events list is
     * sorted by time. The most recent event is listed first.
     * </p>
     * 
     * @param events
     *        A list of events returned based on the lookup attributes specified and the CloudTrail event. The events
     *        list is sorted by time. The most recent event is listed first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsResult withEvents(java.util.Collection<Event> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. If the token does not appear,
     *        there are no more results to return. The token must be passed in with the same parameters as the previous
     *        call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root',
     *        the call with NextToken should include those same parameters.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     * 
     * @return The token to use to get the next page of results after a previous API call. If the token does not appear,
     *         there are no more results to return. The token must be passed in with the same parameters as the previous
     *         call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root',
     *         the call with NextToken should include those same parameters.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next page of results after a previous API call. If the token does not appear, there
     * are no more results to return. The token must be passed in with the same parameters as the previous call. For
     * example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with
     * NextToken should include those same parameters.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next page of results after a previous API call. If the token does not appear,
     *        there are no more results to return. The token must be passed in with the same parameters as the previous
     *        call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root',
     *        the call with NextToken should include those same parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LookupEventsResult withNextToken(String nextToken) {
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

        if (obj instanceof LookupEventsResult == false)
            return false;
        LookupEventsResult other = (LookupEventsResult) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
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
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public LookupEventsResult clone() {
        try {
            return (LookupEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
