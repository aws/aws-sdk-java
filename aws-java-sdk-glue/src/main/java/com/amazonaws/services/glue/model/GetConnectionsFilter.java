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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Filters the connection definitions that are returned by the <code>GetConnections</code> API operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetConnectionsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetConnectionsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection definition for that connection
     * definition to be returned.
     * </p>
     */
    private java.util.List<String> matchCriteria;
    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     */
    private String connectionType;

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection definition for that connection
     * definition to be returned.
     * </p>
     * 
     * @return A criteria string that must match the criteria recorded in the connection definition for that connection
     *         definition to be returned.
     */

    public java.util.List<String> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection definition for that connection
     * definition to be returned.
     * </p>
     * 
     * @param matchCriteria
     *        A criteria string that must match the criteria recorded in the connection definition for that connection
     *        definition to be returned.
     */

    public void setMatchCriteria(java.util.Collection<String> matchCriteria) {
        if (matchCriteria == null) {
            this.matchCriteria = null;
            return;
        }

        this.matchCriteria = new java.util.ArrayList<String>(matchCriteria);
    }

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection definition for that connection
     * definition to be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchCriteria(java.util.Collection)} or {@link #withMatchCriteria(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param matchCriteria
     *        A criteria string that must match the criteria recorded in the connection definition for that connection
     *        definition to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsFilter withMatchCriteria(String... matchCriteria) {
        if (this.matchCriteria == null) {
            setMatchCriteria(new java.util.ArrayList<String>(matchCriteria.length));
        }
        for (String ele : matchCriteria) {
            this.matchCriteria.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A criteria string that must match the criteria recorded in the connection definition for that connection
     * definition to be returned.
     * </p>
     * 
     * @param matchCriteria
     *        A criteria string that must match the criteria recorded in the connection definition for that connection
     *        definition to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetConnectionsFilter withMatchCriteria(java.util.Collection<String> matchCriteria) {
        setMatchCriteria(matchCriteria);
        return this;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @param connectionType
     *        The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * @see ConnectionType
     */

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @return The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * @see ConnectionType
     */

    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @param connectionType
     *        The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public GetConnectionsFilter withConnectionType(String connectionType) {
        setConnectionType(connectionType);
        return this;
    }

    /**
     * <p>
     * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * </p>
     * 
     * @param connectionType
     *        The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectionType
     */

    public GetConnectionsFilter withConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType.toString();
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
        if (getMatchCriteria() != null)
            sb.append("MatchCriteria: ").append(getMatchCriteria()).append(",");
        if (getConnectionType() != null)
            sb.append("ConnectionType: ").append(getConnectionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConnectionsFilter == false)
            return false;
        GetConnectionsFilter other = (GetConnectionsFilter) obj;
        if (other.getMatchCriteria() == null ^ this.getMatchCriteria() == null)
            return false;
        if (other.getMatchCriteria() != null && other.getMatchCriteria().equals(this.getMatchCriteria()) == false)
            return false;
        if (other.getConnectionType() == null ^ this.getConnectionType() == null)
            return false;
        if (other.getConnectionType() != null && other.getConnectionType().equals(this.getConnectionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchCriteria() == null) ? 0 : getMatchCriteria().hashCode());
        hashCode = prime * hashCode + ((getConnectionType() == null) ? 0 : getConnectionType().hashCode());
        return hashCode;
    }

    @Override
    public GetConnectionsFilter clone() {
        try {
            return (GetConnectionsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.GetConnectionsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
