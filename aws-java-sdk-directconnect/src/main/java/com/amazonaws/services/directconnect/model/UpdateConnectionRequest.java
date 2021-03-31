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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the dedicated connection.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the connection ID.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The name of the connection.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The connection MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     */
    private String encryptionMode;

    /**
     * <p>
     * The ID of the dedicated connection.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the connection ID.
     * </p>
     * 
     * @param connectionId
     *        The ID of the dedicated connection.</p>
     *        <p>
     *        You can use <a>DescribeConnections</a> to retrieve the connection ID.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the dedicated connection.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the connection ID.
     * </p>
     * 
     * @return The ID of the dedicated connection.</p>
     *         <p>
     *         You can use <a>DescribeConnections</a> to retrieve the connection ID.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the dedicated connection.
     * </p>
     * <p>
     * You can use <a>DescribeConnections</a> to retrieve the connection ID.
     * </p>
     * 
     * @param connectionId
     *        The ID of the dedicated connection.</p>
     *        <p>
     *        You can use <a>DescribeConnections</a> to retrieve the connection ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @return The name of the connection.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionRequest withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The connection MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @param encryptionMode
     *        The connection MAC Security (MACsec) encryption mode.</p>
     *        <p>
     *        The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     */

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The connection MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @return The connection MAC Security (MACsec) encryption mode.</p>
     *         <p>
     *         The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     */

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    /**
     * <p>
     * The connection MAC Security (MACsec) encryption mode.
     * </p>
     * <p>
     * The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * </p>
     * 
     * @param encryptionMode
     *        The connection MAC Security (MACsec) encryption mode.</p>
     *        <p>
     *        The valid values are <code>no_encrypt</code>, <code>should_encrypt</code>, and <code>must_encrypt</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConnectionRequest withEncryptionMode(String encryptionMode) {
        setEncryptionMode(encryptionMode);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConnectionRequest == false)
            return false;
        UpdateConnectionRequest other = (UpdateConnectionRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConnectionRequest clone() {
        return (UpdateConnectionRequest) super.clone();
    }

}
