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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>CreateOutboundConnection</code> request. Contains details about the newly created cross-cluster
 * connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOutboundConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the source (local) domain.
     * </p>
     */
    private DomainInformationContainer localDomainInfo;
    /**
     * <p>
     * Information about the destination (remote) domain.
     * </p>
     */
    private DomainInformationContainer remoteDomainInfo;
    /**
     * <p>
     * Name of the connection.
     * </p>
     */
    private String connectionAlias;
    /**
     * <p>
     * The status of the connection.
     * </p>
     */
    private OutboundConnectionStatus connectionStatus;
    /**
     * <p>
     * The unique identifier for the created outbound connection, which is used for subsequent operations on the
     * connection.
     * </p>
     */
    private String connectionId;

    /**
     * <p>
     * Information about the source (local) domain.
     * </p>
     * 
     * @param localDomainInfo
     *        Information about the source (local) domain.
     */

    public void setLocalDomainInfo(DomainInformationContainer localDomainInfo) {
        this.localDomainInfo = localDomainInfo;
    }

    /**
     * <p>
     * Information about the source (local) domain.
     * </p>
     * 
     * @return Information about the source (local) domain.
     */

    public DomainInformationContainer getLocalDomainInfo() {
        return this.localDomainInfo;
    }

    /**
     * <p>
     * Information about the source (local) domain.
     * </p>
     * 
     * @param localDomainInfo
     *        Information about the source (local) domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundConnectionResult withLocalDomainInfo(DomainInformationContainer localDomainInfo) {
        setLocalDomainInfo(localDomainInfo);
        return this;
    }

    /**
     * <p>
     * Information about the destination (remote) domain.
     * </p>
     * 
     * @param remoteDomainInfo
     *        Information about the destination (remote) domain.
     */

    public void setRemoteDomainInfo(DomainInformationContainer remoteDomainInfo) {
        this.remoteDomainInfo = remoteDomainInfo;
    }

    /**
     * <p>
     * Information about the destination (remote) domain.
     * </p>
     * 
     * @return Information about the destination (remote) domain.
     */

    public DomainInformationContainer getRemoteDomainInfo() {
        return this.remoteDomainInfo;
    }

    /**
     * <p>
     * Information about the destination (remote) domain.
     * </p>
     * 
     * @param remoteDomainInfo
     *        Information about the destination (remote) domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundConnectionResult withRemoteDomainInfo(DomainInformationContainer remoteDomainInfo) {
        setRemoteDomainInfo(remoteDomainInfo);
        return this;
    }

    /**
     * <p>
     * Name of the connection.
     * </p>
     * 
     * @param connectionAlias
     *        Name of the connection.
     */

    public void setConnectionAlias(String connectionAlias) {
        this.connectionAlias = connectionAlias;
    }

    /**
     * <p>
     * Name of the connection.
     * </p>
     * 
     * @return Name of the connection.
     */

    public String getConnectionAlias() {
        return this.connectionAlias;
    }

    /**
     * <p>
     * Name of the connection.
     * </p>
     * 
     * @param connectionAlias
     *        Name of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundConnectionResult withConnectionAlias(String connectionAlias) {
        setConnectionAlias(connectionAlias);
        return this;
    }

    /**
     * <p>
     * The status of the connection.
     * </p>
     * 
     * @param connectionStatus
     *        The status of the connection.
     */

    public void setConnectionStatus(OutboundConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * The status of the connection.
     * </p>
     * 
     * @return The status of the connection.
     */

    public OutboundConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * The status of the connection.
     * </p>
     * 
     * @param connectionStatus
     *        The status of the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundConnectionResult withConnectionStatus(OutboundConnectionStatus connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the created outbound connection, which is used for subsequent operations on the
     * connection.
     * </p>
     * 
     * @param connectionId
     *        The unique identifier for the created outbound connection, which is used for subsequent operations on the
     *        connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The unique identifier for the created outbound connection, which is used for subsequent operations on the
     * connection.
     * </p>
     * 
     * @return The unique identifier for the created outbound connection, which is used for subsequent operations on the
     *         connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The unique identifier for the created outbound connection, which is used for subsequent operations on the
     * connection.
     * </p>
     * 
     * @param connectionId
     *        The unique identifier for the created outbound connection, which is used for subsequent operations on the
     *        connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundConnectionResult withConnectionId(String connectionId) {
        setConnectionId(connectionId);
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
        if (getLocalDomainInfo() != null)
            sb.append("LocalDomainInfo: ").append(getLocalDomainInfo()).append(",");
        if (getRemoteDomainInfo() != null)
            sb.append("RemoteDomainInfo: ").append(getRemoteDomainInfo()).append(",");
        if (getConnectionAlias() != null)
            sb.append("ConnectionAlias: ").append(getConnectionAlias()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus()).append(",");
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOutboundConnectionResult == false)
            return false;
        CreateOutboundConnectionResult other = (CreateOutboundConnectionResult) obj;
        if (other.getLocalDomainInfo() == null ^ this.getLocalDomainInfo() == null)
            return false;
        if (other.getLocalDomainInfo() != null && other.getLocalDomainInfo().equals(this.getLocalDomainInfo()) == false)
            return false;
        if (other.getRemoteDomainInfo() == null ^ this.getRemoteDomainInfo() == null)
            return false;
        if (other.getRemoteDomainInfo() != null && other.getRemoteDomainInfo().equals(this.getRemoteDomainInfo()) == false)
            return false;
        if (other.getConnectionAlias() == null ^ this.getConnectionAlias() == null)
            return false;
        if (other.getConnectionAlias() != null && other.getConnectionAlias().equals(this.getConnectionAlias()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalDomainInfo() == null) ? 0 : getLocalDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainInfo() == null) ? 0 : getRemoteDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getConnectionAlias() == null) ? 0 : getConnectionAlias().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateOutboundConnectionResult clone() {
        try {
            return (CreateOutboundConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
