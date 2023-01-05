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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/SearchSessions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSessionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Summary information about the sessions.
     * </p>
     */
    private java.util.List<SessionSummary> sessionSummaries;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSessionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Summary information about the sessions.
     * </p>
     * 
     * @return Summary information about the sessions.
     */

    public java.util.List<SessionSummary> getSessionSummaries() {
        return sessionSummaries;
    }

    /**
     * <p>
     * Summary information about the sessions.
     * </p>
     * 
     * @param sessionSummaries
     *        Summary information about the sessions.
     */

    public void setSessionSummaries(java.util.Collection<SessionSummary> sessionSummaries) {
        if (sessionSummaries == null) {
            this.sessionSummaries = null;
            return;
        }

        this.sessionSummaries = new java.util.ArrayList<SessionSummary>(sessionSummaries);
    }

    /**
     * <p>
     * Summary information about the sessions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessionSummaries(java.util.Collection)} or {@link #withSessionSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sessionSummaries
     *        Summary information about the sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSessionsResult withSessionSummaries(SessionSummary... sessionSummaries) {
        if (this.sessionSummaries == null) {
            setSessionSummaries(new java.util.ArrayList<SessionSummary>(sessionSummaries.length));
        }
        for (SessionSummary ele : sessionSummaries) {
            this.sessionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about the sessions.
     * </p>
     * 
     * @param sessionSummaries
     *        Summary information about the sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchSessionsResult withSessionSummaries(java.util.Collection<SessionSummary> sessionSummaries) {
        setSessionSummaries(sessionSummaries);
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
        if (getSessionSummaries() != null)
            sb.append("SessionSummaries: ").append(getSessionSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSessionsResult == false)
            return false;
        SearchSessionsResult other = (SearchSessionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSessionSummaries() == null ^ this.getSessionSummaries() == null)
            return false;
        if (other.getSessionSummaries() != null && other.getSessionSummaries().equals(this.getSessionSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSessionSummaries() == null) ? 0 : getSessionSummaries().hashCode());
        return hashCode;
    }

    @Override
    public SearchSessionsResult clone() {
        try {
            return (SearchSessionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
