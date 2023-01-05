/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/ListSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSessionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the ID of the session.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * Returns the session object.
     * </p>
     */
    private java.util.List<Session> sessions;
    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns the ID of the session.
     * </p>
     * 
     * @return Returns the ID of the session.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * Returns the ID of the session.
     * </p>
     * 
     * @param ids
     *        Returns the ID of the session.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * Returns the ID of the session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        Returns the ID of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsResult withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the ID of the session.
     * </p>
     * 
     * @param ids
     *        Returns the ID of the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * Returns the session object.
     * </p>
     * 
     * @return Returns the session object.
     */

    public java.util.List<Session> getSessions() {
        return sessions;
    }

    /**
     * <p>
     * Returns the session object.
     * </p>
     * 
     * @param sessions
     *        Returns the session object.
     */

    public void setSessions(java.util.Collection<Session> sessions) {
        if (sessions == null) {
            this.sessions = null;
            return;
        }

        this.sessions = new java.util.ArrayList<Session>(sessions);
    }

    /**
     * <p>
     * Returns the session object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessions(java.util.Collection)} or {@link #withSessions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sessions
     *        Returns the session object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsResult withSessions(Session... sessions) {
        if (this.sessions == null) {
            setSessions(new java.util.ArrayList<Session>(sessions.length));
        }
        for (Session ele : sessions) {
            this.sessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns the session object.
     * </p>
     * 
     * @param sessions
     *        Returns the session object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsResult withSessions(java.util.Collection<Session> sessions) {
        setSessions(sessions);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more result.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no more result.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more result.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no more result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSessionsResult withNextToken(String nextToken) {
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getSessions() != null)
            sb.append("Sessions: ").append(getSessions()).append(",");
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

        if (obj instanceof ListSessionsResult == false)
            return false;
        ListSessionsResult other = (ListSessionsResult) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getSessions() == null ^ this.getSessions() == null)
            return false;
        if (other.getSessions() != null && other.getSessions().equals(this.getSessions()) == false)
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

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getSessions() == null) ? 0 : getSessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSessionsResult clone() {
        try {
            return (ListSessionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
