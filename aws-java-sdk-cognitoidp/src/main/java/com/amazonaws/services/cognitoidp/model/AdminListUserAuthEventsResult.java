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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminListUserAuthEvents"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminListUserAuthEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>, <code>EventType</code>, <code>CreationDate</code>,
     * <code>EventRisk</code>, and <code>EventResponse</code>.
     * </p>
     */
    private java.util.List<AuthEventType> authEvents;
    /**
     * <p>
     * A pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>, <code>EventType</code>, <code>CreationDate</code>,
     * <code>EventRisk</code>, and <code>EventResponse</code>.
     * </p>
     * 
     * @return The response object. It includes the <code>EventID</code>, <code>EventType</code>,
     *         <code>CreationDate</code>, <code>EventRisk</code>, and <code>EventResponse</code>.
     */

    public java.util.List<AuthEventType> getAuthEvents() {
        return authEvents;
    }

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>, <code>EventType</code>, <code>CreationDate</code>,
     * <code>EventRisk</code>, and <code>EventResponse</code>.
     * </p>
     * 
     * @param authEvents
     *        The response object. It includes the <code>EventID</code>, <code>EventType</code>,
     *        <code>CreationDate</code>, <code>EventRisk</code>, and <code>EventResponse</code>.
     */

    public void setAuthEvents(java.util.Collection<AuthEventType> authEvents) {
        if (authEvents == null) {
            this.authEvents = null;
            return;
        }

        this.authEvents = new java.util.ArrayList<AuthEventType>(authEvents);
    }

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>, <code>EventType</code>, <code>CreationDate</code>,
     * <code>EventRisk</code>, and <code>EventResponse</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthEvents(java.util.Collection)} or {@link #withAuthEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param authEvents
     *        The response object. It includes the <code>EventID</code>, <code>EventType</code>,
     *        <code>CreationDate</code>, <code>EventRisk</code>, and <code>EventResponse</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListUserAuthEventsResult withAuthEvents(AuthEventType... authEvents) {
        if (this.authEvents == null) {
            setAuthEvents(new java.util.ArrayList<AuthEventType>(authEvents.length));
        }
        for (AuthEventType ele : authEvents) {
            this.authEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>, <code>EventType</code>, <code>CreationDate</code>,
     * <code>EventRisk</code>, and <code>EventResponse</code>.
     * </p>
     * 
     * @param authEvents
     *        The response object. It includes the <code>EventID</code>, <code>EventType</code>,
     *        <code>CreationDate</code>, <code>EventRisk</code>, and <code>EventResponse</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListUserAuthEventsResult withAuthEvents(java.util.Collection<AuthEventType> authEvents) {
        setAuthEvents(authEvents);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @return A pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * 
     * @param nextToken
     *        A pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminListUserAuthEventsResult withNextToken(String nextToken) {
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
        if (getAuthEvents() != null)
            sb.append("AuthEvents: ").append(getAuthEvents()).append(",");
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

        if (obj instanceof AdminListUserAuthEventsResult == false)
            return false;
        AdminListUserAuthEventsResult other = (AdminListUserAuthEventsResult) obj;
        if (other.getAuthEvents() == null ^ this.getAuthEvents() == null)
            return false;
        if (other.getAuthEvents() != null && other.getAuthEvents().equals(this.getAuthEvents()) == false)
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

        hashCode = prime * hashCode + ((getAuthEvents() == null) ? 0 : getAuthEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public AdminListUserAuthEventsResult clone() {
        try {
            return (AdminListUserAuthEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
