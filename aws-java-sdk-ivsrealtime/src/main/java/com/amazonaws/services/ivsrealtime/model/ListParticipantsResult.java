/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipants" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListParticipantsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more participants than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * List of the matching participants (summary information only).
     * </p>
     */
    private java.util.List<ParticipantSummary> participants;

    /**
     * <p>
     * If there are more participants than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more participants than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *        get the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more participants than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @return If there are more participants than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *         get the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more participants than <code>maxResults</code>, use <code>nextToken</code> in the request to get the
     * next set.
     * </p>
     * 
     * @param nextToken
     *        If there are more participants than <code>maxResults</code>, use <code>nextToken</code> in the request to
     *        get the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * List of the matching participants (summary information only).
     * </p>
     * 
     * @return List of the matching participants (summary information only).
     */

    public java.util.List<ParticipantSummary> getParticipants() {
        return participants;
    }

    /**
     * <p>
     * List of the matching participants (summary information only).
     * </p>
     * 
     * @param participants
     *        List of the matching participants (summary information only).
     */

    public void setParticipants(java.util.Collection<ParticipantSummary> participants) {
        if (participants == null) {
            this.participants = null;
            return;
        }

        this.participants = new java.util.ArrayList<ParticipantSummary>(participants);
    }

    /**
     * <p>
     * List of the matching participants (summary information only).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParticipants(java.util.Collection)} or {@link #withParticipants(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param participants
     *        List of the matching participants (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsResult withParticipants(ParticipantSummary... participants) {
        if (this.participants == null) {
            setParticipants(new java.util.ArrayList<ParticipantSummary>(participants.length));
        }
        for (ParticipantSummary ele : participants) {
            this.participants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching participants (summary information only).
     * </p>
     * 
     * @param participants
     *        List of the matching participants (summary information only).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantsResult withParticipants(java.util.Collection<ParticipantSummary> participants) {
        setParticipants(participants);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getParticipants() != null)
            sb.append("Participants: ").append(getParticipants());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListParticipantsResult == false)
            return false;
        ListParticipantsResult other = (ListParticipantsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getParticipants() == null ^ this.getParticipants() == null)
            return false;
        if (other.getParticipants() != null && other.getParticipants().equals(this.getParticipants()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getParticipants() == null) ? 0 : getParticipants().hashCode());
        return hashCode;
    }

    @Override
    public ListParticipantsResult clone() {
        try {
            return (ListParticipantsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
