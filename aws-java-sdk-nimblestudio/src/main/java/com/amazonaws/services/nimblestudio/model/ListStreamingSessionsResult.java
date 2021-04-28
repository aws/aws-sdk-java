/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/ListStreamingSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListStreamingSessionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A collection of streaming sessions.
     * </p>
     */
    private java.util.List<StreamingSession> sessions;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A collection of streaming sessions.
     * </p>
     * 
     * @return A collection of streaming sessions.
     */

    public java.util.List<StreamingSession> getSessions() {
        return sessions;
    }

    /**
     * <p>
     * A collection of streaming sessions.
     * </p>
     * 
     * @param sessions
     *        A collection of streaming sessions.
     */

    public void setSessions(java.util.Collection<StreamingSession> sessions) {
        if (sessions == null) {
            this.sessions = null;
            return;
        }

        this.sessions = new java.util.ArrayList<StreamingSession>(sessions);
    }

    /**
     * <p>
     * A collection of streaming sessions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessions(java.util.Collection)} or {@link #withSessions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sessions
     *        A collection of streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsResult withSessions(StreamingSession... sessions) {
        if (this.sessions == null) {
            setSessions(new java.util.ArrayList<StreamingSession>(sessions.length));
        }
        for (StreamingSession ele : sessions) {
            this.sessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of streaming sessions.
     * </p>
     * 
     * @param sessions
     *        A collection of streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListStreamingSessionsResult withSessions(java.util.Collection<StreamingSession> sessions) {
        setSessions(sessions);
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
        if (getSessions() != null)
            sb.append("Sessions: ").append(getSessions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamingSessionsResult == false)
            return false;
        ListStreamingSessionsResult other = (ListStreamingSessionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSessions() == null ^ this.getSessions() == null)
            return false;
        if (other.getSessions() != null && other.getSessions().equals(this.getSessions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSessions() == null) ? 0 : getSessions().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamingSessionsResult clone() {
        try {
            return (ListStreamingSessionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
