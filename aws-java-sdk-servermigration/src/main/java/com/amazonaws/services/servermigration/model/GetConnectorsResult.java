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
public class GetConnectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<Connector> connectorList;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<Connector> getConnectorList() {
        return connectorList;
    }

    /**
     * @param connectorList
     */

    public void setConnectorList(java.util.Collection<Connector> connectorList) {
        if (connectorList == null) {
            this.connectorList = null;
            return;
        }

        this.connectorList = new java.util.ArrayList<Connector>(connectorList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorList(java.util.Collection)} or {@link #withConnectorList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param connectorList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectorsResult withConnectorList(Connector... connectorList) {
        if (this.connectorList == null) {
            setConnectorList(new java.util.ArrayList<Connector>(connectorList.length));
        }
        for (Connector ele : connectorList) {
            this.connectorList.add(ele);
        }
        return this;
    }

    /**
     * @param connectorList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectorsResult withConnectorList(java.util.Collection<Connector> connectorList) {
        setConnectorList(connectorList);
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

    public GetConnectorsResult withNextToken(String nextToken) {
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
        if (getConnectorList() != null)
            sb.append("ConnectorList: " + getConnectorList() + ",");
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

        if (obj instanceof GetConnectorsResult == false)
            return false;
        GetConnectorsResult other = (GetConnectorsResult) obj;
        if (other.getConnectorList() == null ^ this.getConnectorList() == null)
            return false;
        if (other.getConnectorList() != null && other.getConnectorList().equals(this.getConnectorList()) == false)
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

        hashCode = prime * hashCode + ((getConnectorList() == null) ? 0 : getConnectorList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectorsResult clone() {
        try {
            return (GetConnectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
