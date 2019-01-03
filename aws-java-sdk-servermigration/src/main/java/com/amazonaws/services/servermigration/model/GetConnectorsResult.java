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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/GetConnectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the registered connectors.
     * </p>
     */
    private java.util.List<Connector> connectorList;
    /**
     * <p>
     * The token required to retrieve the next set of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the registered connectors.
     * </p>
     * 
     * @return Information about the registered connectors.
     */

    public java.util.List<Connector> getConnectorList() {
        return connectorList;
    }

    /**
     * <p>
     * Information about the registered connectors.
     * </p>
     * 
     * @param connectorList
     *        Information about the registered connectors.
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
     * Information about the registered connectors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectorList(java.util.Collection)} or {@link #withConnectorList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param connectorList
     *        Information about the registered connectors.
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
     * <p>
     * Information about the registered connectors.
     * </p>
     * 
     * @param connectorList
     *        Information about the registered connectors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectorsResult withConnectorList(java.util.Collection<Connector> connectorList) {
        setConnectorList(connectorList);
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

    public GetConnectorsResult withNextToken(String nextToken) {
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
        if (getConnectorList() != null)
            sb.append("ConnectorList: ").append(getConnectorList()).append(",");
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
