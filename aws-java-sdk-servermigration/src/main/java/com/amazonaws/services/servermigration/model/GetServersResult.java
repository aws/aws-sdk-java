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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetServers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time when the server was last modified.
     * </p>
     */
    private java.util.Date lastModifiedOn;
    /**
     * <p>
     * The status of the server catalog.
     * </p>
     */
    private String serverCatalogStatus;
    /**
     * <p>
     * Information about the servers.
     * </p>
     */
    private java.util.List<Server> serverList;
    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The time when the server was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The time when the server was last modified.
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * <p>
     * The time when the server was last modified.
     * </p>
     * 
     * @return The time when the server was last modified.
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * <p>
     * The time when the server was last modified.
     * </p>
     * 
     * @param lastModifiedOn
     *        The time when the server was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersResult withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * <p>
     * The status of the server catalog.
     * </p>
     * 
     * @param serverCatalogStatus
     *        The status of the server catalog.
     * @see ServerCatalogStatus
     */

    public void setServerCatalogStatus(String serverCatalogStatus) {
        this.serverCatalogStatus = serverCatalogStatus;
    }

    /**
     * <p>
     * The status of the server catalog.
     * </p>
     * 
     * @return The status of the server catalog.
     * @see ServerCatalogStatus
     */

    public String getServerCatalogStatus() {
        return this.serverCatalogStatus;
    }

    /**
     * <p>
     * The status of the server catalog.
     * </p>
     * 
     * @param serverCatalogStatus
     *        The status of the server catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCatalogStatus
     */

    public GetServersResult withServerCatalogStatus(String serverCatalogStatus) {
        setServerCatalogStatus(serverCatalogStatus);
        return this;
    }

    /**
     * <p>
     * The status of the server catalog.
     * </p>
     * 
     * @param serverCatalogStatus
     *        The status of the server catalog.
     * @see ServerCatalogStatus
     */

    public void setServerCatalogStatus(ServerCatalogStatus serverCatalogStatus) {
        withServerCatalogStatus(serverCatalogStatus);
    }

    /**
     * <p>
     * The status of the server catalog.
     * </p>
     * 
     * @param serverCatalogStatus
     *        The status of the server catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCatalogStatus
     */

    public GetServersResult withServerCatalogStatus(ServerCatalogStatus serverCatalogStatus) {
        this.serverCatalogStatus = serverCatalogStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about the servers.
     * </p>
     * 
     * @return Information about the servers.
     */

    public java.util.List<Server> getServerList() {
        return serverList;
    }

    /**
     * <p>
     * Information about the servers.
     * </p>
     * 
     * @param serverList
     *        Information about the servers.
     */

    public void setServerList(java.util.Collection<Server> serverList) {
        if (serverList == null) {
            this.serverList = null;
            return;
        }

        this.serverList = new java.util.ArrayList<Server>(serverList);
    }

    /**
     * <p>
     * Information about the servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerList(java.util.Collection)} or {@link #withServerList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serverList
     *        Information about the servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersResult withServerList(Server... serverList) {
        if (this.serverList == null) {
            setServerList(new java.util.ArrayList<Server>(serverList.length));
        }
        for (Server ele : serverList) {
            this.serverList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the servers.
     * </p>
     * 
     * @param serverList
     *        Information about the servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersResult withServerList(java.util.Collection<Server> serverList) {
        setServerList(serverList);
        return this;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token required to retrieve the next set of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersResult withNextToken(String nextToken) {
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
        if (getLastModifiedOn() != null)
            sb.append("LastModifiedOn: ").append(getLastModifiedOn()).append(",");
        if (getServerCatalogStatus() != null)
            sb.append("ServerCatalogStatus: ").append(getServerCatalogStatus()).append(",");
        if (getServerList() != null)
            sb.append("ServerList: ").append(getServerList()).append(",");
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

        if (obj instanceof GetServersResult == false)
            return false;
        GetServersResult other = (GetServersResult) obj;
        if (other.getLastModifiedOn() == null ^ this.getLastModifiedOn() == null)
            return false;
        if (other.getLastModifiedOn() != null && other.getLastModifiedOn().equals(this.getLastModifiedOn()) == false)
            return false;
        if (other.getServerCatalogStatus() == null ^ this.getServerCatalogStatus() == null)
            return false;
        if (other.getServerCatalogStatus() != null && other.getServerCatalogStatus().equals(this.getServerCatalogStatus()) == false)
            return false;
        if (other.getServerList() == null ^ this.getServerList() == null)
            return false;
        if (other.getServerList() != null && other.getServerList().equals(this.getServerList()) == false)
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

        hashCode = prime * hashCode + ((getLastModifiedOn() == null) ? 0 : getLastModifiedOn().hashCode());
        hashCode = prime * hashCode + ((getServerCatalogStatus() == null) ? 0 : getServerCatalogStatus().hashCode());
        hashCode = prime * hashCode + ((getServerList() == null) ? 0 : getServerList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetServersResult clone() {
        try {
            return (GetServersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
