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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnections" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     */
    private java.util.List<Connection> connectionList;
    /**
     * <p>
     * A continuation token, if the list of connections returned does not include the last of the filtered connections.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     * 
     * @return A list of requested connection definitions.
     */

    public java.util.List<Connection> getConnectionList() {
        return connectionList;
    }

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     * 
     * @param connectionList
     *        A list of requested connection definitions.
     */

    public void setConnectionList(java.util.Collection<Connection> connectionList) {
        if (connectionList == null) {
            this.connectionList = null;
            return;
        }

        this.connectionList = new java.util.ArrayList<Connection>(connectionList);
    }

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConnectionList(java.util.Collection)} or {@link #withConnectionList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param connectionList
     *        A list of requested connection definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsResult withConnectionList(Connection... connectionList) {
        if (this.connectionList == null) {
            setConnectionList(new java.util.ArrayList<Connection>(connectionList.length));
        }
        for (Connection ele : connectionList) {
            this.connectionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of requested connection definitions.
     * </p>
     * 
     * @param connectionList
     *        A list of requested connection definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsResult withConnectionList(java.util.Collection<Connection> connectionList) {
        setConnectionList(connectionList);
        return this;
    }

    /**
     * <p>
     * A continuation token, if the list of connections returned does not include the last of the filtered connections.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the list of connections returned does not include the last of the filtered
     *        connections.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of connections returned does not include the last of the filtered connections.
     * </p>
     * 
     * @return A continuation token, if the list of connections returned does not include the last of the filtered
     *         connections.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if the list of connections returned does not include the last of the filtered connections.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if the list of connections returned does not include the last of the filtered
     *        connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsResult withNextToken(String nextToken) {
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
        if (getConnectionList() != null)
            sb.append("ConnectionList: ").append(getConnectionList()).append(",");
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

        if (obj instanceof GetConnectionsResult == false)
            return false;
        GetConnectionsResult other = (GetConnectionsResult) obj;
        if (other.getConnectionList() == null ^ this.getConnectionList() == null)
            return false;
        if (other.getConnectionList() != null && other.getConnectionList().equals(this.getConnectionList()) == false)
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

        hashCode = prime * hashCode + ((getConnectionList() == null) ? 0 : getConnectionList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectionsResult clone() {
        try {
            return (GetConnectionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
