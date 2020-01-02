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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListMeetings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMeetingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     */
    private java.util.List<Meeting> meetings;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * 
     * @return The Amazon Chime SDK meeting information.
     */

    public java.util.List<Meeting> getMeetings() {
        return meetings;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * 
     * @param meetings
     *        The Amazon Chime SDK meeting information.
     */

    public void setMeetings(java.util.Collection<Meeting> meetings) {
        if (meetings == null) {
            this.meetings = null;
            return;
        }

        this.meetings = new java.util.ArrayList<Meeting>(meetings);
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMeetings(java.util.Collection)} or {@link #withMeetings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param meetings
     *        The Amazon Chime SDK meeting information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeetingsResult withMeetings(Meeting... meetings) {
        if (this.meetings == null) {
            setMeetings(new java.util.ArrayList<Meeting>(meetings.length));
        }
        for (Meeting ele : meetings) {
            this.meetings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting information.
     * </p>
     * 
     * @param meetings
     *        The Amazon Chime SDK meeting information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMeetingsResult withMeetings(java.util.Collection<Meeting> meetings) {
        setMeetings(meetings);
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

    public ListMeetingsResult withNextToken(String nextToken) {
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
        if (getMeetings() != null)
            sb.append("Meetings: ").append(getMeetings()).append(",");
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

        if (obj instanceof ListMeetingsResult == false)
            return false;
        ListMeetingsResult other = (ListMeetingsResult) obj;
        if (other.getMeetings() == null ^ this.getMeetings() == null)
            return false;
        if (other.getMeetings() != null && other.getMeetings().equals(this.getMeetings()) == false)
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

        hashCode = prime * hashCode + ((getMeetings() == null) ? 0 : getMeetings().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMeetingsResult clone() {
        try {
            return (ListMeetingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
