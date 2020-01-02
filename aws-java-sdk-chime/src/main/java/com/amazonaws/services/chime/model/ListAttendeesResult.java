/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListAttendees" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttendeesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     */
    private java.util.List<Attendee> attendees;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * 
     * @return The Amazon Chime SDK attendee information.
     */

    public java.util.List<Attendee> getAttendees() {
        return attendees;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * 
     * @param attendees
     *        The Amazon Chime SDK attendee information.
     */

    public void setAttendees(java.util.Collection<Attendee> attendees) {
        if (attendees == null) {
            this.attendees = null;
            return;
        }

        this.attendees = new java.util.ArrayList<Attendee>(attendees);
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttendees(java.util.Collection)} or {@link #withAttendees(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attendees
     *        The Amazon Chime SDK attendee information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttendeesResult withAttendees(Attendee... attendees) {
        if (this.attendees == null) {
            setAttendees(new java.util.ArrayList<Attendee>(attendees.length));
        }
        for (Attendee ele : attendees) {
            this.attendees.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee information.
     * </p>
     * 
     * @param attendees
     *        The Amazon Chime SDK attendee information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttendeesResult withAttendees(java.util.Collection<Attendee> attendees) {
        setAttendees(attendees);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttendeesResult withNextToken(String nextToken) {
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
        if (getAttendees() != null)
            sb.append("Attendees: ").append(getAttendees()).append(",");
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

        if (obj instanceof ListAttendeesResult == false)
            return false;
        ListAttendeesResult other = (ListAttendeesResult) obj;
        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null && other.getAttendees().equals(this.getAttendees()) == false)
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

        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAttendeesResult clone() {
        try {
            return (ListAttendeesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
