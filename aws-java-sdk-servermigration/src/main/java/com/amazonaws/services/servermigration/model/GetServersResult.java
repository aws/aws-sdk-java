/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 */
public class GetServersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.Date lastModifiedOn;

    private String serverCatalogStatus;

    private java.util.List<Server> serverList;

    private String nextToken;

    /**
     * @param lastModifiedOn
     */

    public void setLastModifiedOn(java.util.Date lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * @return
     */

    public java.util.Date getLastModifiedOn() {
        return this.lastModifiedOn;
    }

    /**
     * @param lastModifiedOn
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersResult withLastModifiedOn(java.util.Date lastModifiedOn) {
        setLastModifiedOn(lastModifiedOn);
        return this;
    }

    /**
     * @param serverCatalogStatus
     * @see ServerCatalogStatus
     */

    public void setServerCatalogStatus(String serverCatalogStatus) {
        this.serverCatalogStatus = serverCatalogStatus;
    }

    /**
     * @return
     * @see ServerCatalogStatus
     */

    public String getServerCatalogStatus() {
        return this.serverCatalogStatus;
    }

    /**
     * @param serverCatalogStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCatalogStatus
     */

    public GetServersResult withServerCatalogStatus(String serverCatalogStatus) {
        setServerCatalogStatus(serverCatalogStatus);
        return this;
    }

    /**
     * @param serverCatalogStatus
     * @see ServerCatalogStatus
     */

    public void setServerCatalogStatus(ServerCatalogStatus serverCatalogStatus) {
        this.serverCatalogStatus = serverCatalogStatus.toString();
    }

    /**
     * @param serverCatalogStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServerCatalogStatus
     */

    public GetServersResult withServerCatalogStatus(ServerCatalogStatus serverCatalogStatus) {
        setServerCatalogStatus(serverCatalogStatus);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Server> getServerList() {
        return serverList;
    }

    /**
     * @param serverList
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerList(java.util.Collection)} or {@link #withServerList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serverList
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
     * @param serverList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersResult withServerList(java.util.Collection<Server> serverList) {
        setServerList(serverList);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServersResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("LastModifiedOn: " + getLastModifiedOn() + ",");
        if (getServerCatalogStatus() != null)
            sb.append("ServerCatalogStatus: " + getServerCatalogStatus() + ",");
        if (getServerList() != null)
            sb.append("ServerList: " + getServerList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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
