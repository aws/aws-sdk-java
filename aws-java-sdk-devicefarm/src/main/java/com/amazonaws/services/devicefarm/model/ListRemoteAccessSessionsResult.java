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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the response from the server after AWS Device Farm makes a request to return information about the remote
 * access session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/ListRemoteAccessSessions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRemoteAccessSessionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A container representing the metadata from the service about each remote access session you are requesting.
     * </p>
     */
    private java.util.List<RemoteAccessSession> remoteAccessSessions;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A container representing the metadata from the service about each remote access session you are requesting.
     * </p>
     * 
     * @return A container representing the metadata from the service about each remote access session you are
     *         requesting.
     */

    public java.util.List<RemoteAccessSession> getRemoteAccessSessions() {
        return remoteAccessSessions;
    }

    /**
     * <p>
     * A container representing the metadata from the service about each remote access session you are requesting.
     * </p>
     * 
     * @param remoteAccessSessions
     *        A container representing the metadata from the service about each remote access session you are
     *        requesting.
     */

    public void setRemoteAccessSessions(java.util.Collection<RemoteAccessSession> remoteAccessSessions) {
        if (remoteAccessSessions == null) {
            this.remoteAccessSessions = null;
            return;
        }

        this.remoteAccessSessions = new java.util.ArrayList<RemoteAccessSession>(remoteAccessSessions);
    }

    /**
     * <p>
     * A container representing the metadata from the service about each remote access session you are requesting.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoteAccessSessions(java.util.Collection)} or {@link #withRemoteAccessSessions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param remoteAccessSessions
     *        A container representing the metadata from the service about each remote access session you are
     *        requesting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRemoteAccessSessionsResult withRemoteAccessSessions(RemoteAccessSession... remoteAccessSessions) {
        if (this.remoteAccessSessions == null) {
            setRemoteAccessSessions(new java.util.ArrayList<RemoteAccessSession>(remoteAccessSessions.length));
        }
        for (RemoteAccessSession ele : remoteAccessSessions) {
            this.remoteAccessSessions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container representing the metadata from the service about each remote access session you are requesting.
     * </p>
     * 
     * @param remoteAccessSessions
     *        A container representing the metadata from the service about each remote access session you are
     *        requesting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRemoteAccessSessionsResult withRemoteAccessSessions(java.util.Collection<RemoteAccessSession> remoteAccessSessions) {
        setRemoteAccessSessions(remoteAccessSessions);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRemoteAccessSessionsResult withNextToken(String nextToken) {
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
        if (getRemoteAccessSessions() != null)
            sb.append("RemoteAccessSessions: ").append(getRemoteAccessSessions()).append(",");
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

        if (obj instanceof ListRemoteAccessSessionsResult == false)
            return false;
        ListRemoteAccessSessionsResult other = (ListRemoteAccessSessionsResult) obj;
        if (other.getRemoteAccessSessions() == null ^ this.getRemoteAccessSessions() == null)
            return false;
        if (other.getRemoteAccessSessions() != null && other.getRemoteAccessSessions().equals(this.getRemoteAccessSessions()) == false)
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

        hashCode = prime * hashCode + ((getRemoteAccessSessions() == null) ? 0 : getRemoteAccessSessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRemoteAccessSessionsResult clone() {
        try {
            return (ListRemoteAccessSessionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
