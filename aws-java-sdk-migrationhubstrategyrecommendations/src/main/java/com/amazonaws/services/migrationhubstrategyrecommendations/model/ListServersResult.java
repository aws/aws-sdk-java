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
package com.amazonaws.services.migrationhubstrategyrecommendations.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhubstrategy-2020-02-19/ListServers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The list of servers with detailed information about each server.
     * </p>
     */
    private java.util.List<ServerDetail> serverInfos;

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @return The token you use to retrieve the next set of results, or null if there are no more results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token you use to retrieve the next set of results, or null if there are no more results.
     * </p>
     * 
     * @param nextToken
     *        The token you use to retrieve the next set of results, or null if there are no more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The list of servers with detailed information about each server.
     * </p>
     * 
     * @return The list of servers with detailed information about each server.
     */

    public java.util.List<ServerDetail> getServerInfos() {
        return serverInfos;
    }

    /**
     * <p>
     * The list of servers with detailed information about each server.
     * </p>
     * 
     * @param serverInfos
     *        The list of servers with detailed information about each server.
     */

    public void setServerInfos(java.util.Collection<ServerDetail> serverInfos) {
        if (serverInfos == null) {
            this.serverInfos = null;
            return;
        }

        this.serverInfos = new java.util.ArrayList<ServerDetail>(serverInfos);
    }

    /**
     * <p>
     * The list of servers with detailed information about each server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerInfos(java.util.Collection)} or {@link #withServerInfos(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serverInfos
     *        The list of servers with detailed information about each server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersResult withServerInfos(ServerDetail... serverInfos) {
        if (this.serverInfos == null) {
            setServerInfos(new java.util.ArrayList<ServerDetail>(serverInfos.length));
        }
        for (ServerDetail ele : serverInfos) {
            this.serverInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of servers with detailed information about each server.
     * </p>
     * 
     * @param serverInfos
     *        The list of servers with detailed information about each server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServersResult withServerInfos(java.util.Collection<ServerDetail> serverInfos) {
        setServerInfos(serverInfos);
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
        if (getServerInfos() != null)
            sb.append("ServerInfos: ").append(getServerInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListServersResult == false)
            return false;
        ListServersResult other = (ListServersResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerInfos() == null ^ this.getServerInfos() == null)
            return false;
        if (other.getServerInfos() != null && other.getServerInfos().equals(this.getServerInfos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerInfos() == null) ? 0 : getServerInfos().hashCode());
        return hashCode;
    }

    @Override
    public ListServersResult clone() {
        try {
            return (ListServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
