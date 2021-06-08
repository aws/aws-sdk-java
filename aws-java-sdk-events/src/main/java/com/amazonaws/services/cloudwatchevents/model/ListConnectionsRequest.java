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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListConnections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConnectionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name prefix to filter results returned. Only connections with a name that starts with the prefix are returned.
     * </p>
     */
    private String namePrefix;
    /**
     * <p>
     * The state of the connection.
     * </p>
     */
    private String connectionState;
    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of connections to return.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * A name prefix to filter results returned. Only connections with a name that starts with the prefix are returned.
     * </p>
     * 
     * @param namePrefix
     *        A name prefix to filter results returned. Only connections with a name that starts with the prefix are
     *        returned.
     */

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    /**
     * <p>
     * A name prefix to filter results returned. Only connections with a name that starts with the prefix are returned.
     * </p>
     * 
     * @return A name prefix to filter results returned. Only connections with a name that starts with the prefix are
     *         returned.
     */

    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * <p>
     * A name prefix to filter results returned. Only connections with a name that starts with the prefix are returned.
     * </p>
     * 
     * @param namePrefix
     *        A name prefix to filter results returned. Only connections with a name that starts with the prefix are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsRequest withNamePrefix(String namePrefix) {
        setNamePrefix(namePrefix);
        return this;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @param connectionState
     *        The state of the connection.
     * @see ConnectionState
     */

    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @return The state of the connection.
     * @see ConnectionState
     */

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @param connectionState
     *        The state of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public ListConnectionsRequest withConnectionState(String connectionState) {
        setConnectionState(connectionState);
        return this;
    }

    /**
     * <p>
     * The state of the connection.
     * </p>
     * 
     * @param connectionState
     *        The state of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionState
     */

    public ListConnectionsRequest withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @return The token returned by a previous call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of connections to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of connections to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of connections to return.
     * </p>
     * 
     * @return The maximum number of connections to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of connections to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of connections to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConnectionsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getNamePrefix() != null)
            sb.append("NamePrefix: ").append(getNamePrefix()).append(",");
        if (getConnectionState() != null)
            sb.append("ConnectionState: ").append(getConnectionState()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListConnectionsRequest == false)
            return false;
        ListConnectionsRequest other = (ListConnectionsRequest) obj;
        if (other.getNamePrefix() == null ^ this.getNamePrefix() == null)
            return false;
        if (other.getNamePrefix() != null && other.getNamePrefix().equals(this.getNamePrefix()) == false)
            return false;
        if (other.getConnectionState() == null ^ this.getConnectionState() == null)
            return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamePrefix() == null) ? 0 : getNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListConnectionsRequest clone() {
        return (ListConnectionsRequest) super.clone();
    }

}
