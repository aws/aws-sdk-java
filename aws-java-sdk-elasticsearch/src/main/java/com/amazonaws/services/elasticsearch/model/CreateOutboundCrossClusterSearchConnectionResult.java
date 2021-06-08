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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code><a>CreateOutboundCrossClusterSearchConnection</a></code> request. Contains the details of the
 * newly created cross-cluster search connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOutboundCrossClusterSearchConnectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source Elasticsearch domain.
     * </p>
     */
    private DomainInformation sourceDomainInfo;
    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination Elasticsearch domain.
     * </p>
     */
    private DomainInformation destinationDomainInfo;
    /**
     * <p>
     * Specifies the connection alias provided during the create connection request.
     * </p>
     */
    private String connectionAlias;
    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnectionStatus</a></code> for the newly created connection.
     * </p>
     */
    private OutboundCrossClusterSearchConnectionStatus connectionStatus;
    /**
     * <p>
     * Unique id for the created outbound connection, which is used for subsequent operations on connection.
     * </p>
     */
    private String crossClusterSearchConnectionId;

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source Elasticsearch domain.
     * </p>
     * 
     * @param sourceDomainInfo
     *        Specifies the <code><a>DomainInformation</a></code> for the source Elasticsearch domain.
     */

    public void setSourceDomainInfo(DomainInformation sourceDomainInfo) {
        this.sourceDomainInfo = sourceDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the <code><a>DomainInformation</a></code> for the source Elasticsearch domain.
     */

    public DomainInformation getSourceDomainInfo() {
        return this.sourceDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the source Elasticsearch domain.
     * </p>
     * 
     * @param sourceDomainInfo
     *        Specifies the <code><a>DomainInformation</a></code> for the source Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundCrossClusterSearchConnectionResult withSourceDomainInfo(DomainInformation sourceDomainInfo) {
        setSourceDomainInfo(sourceDomainInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination Elasticsearch domain.
     * </p>
     * 
     * @param destinationDomainInfo
     *        Specifies the <code><a>DomainInformation</a></code> for the destination Elasticsearch domain.
     */

    public void setDestinationDomainInfo(DomainInformation destinationDomainInfo) {
        this.destinationDomainInfo = destinationDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the <code><a>DomainInformation</a></code> for the destination Elasticsearch domain.
     */

    public DomainInformation getDestinationDomainInfo() {
        return this.destinationDomainInfo;
    }

    /**
     * <p>
     * Specifies the <code><a>DomainInformation</a></code> for the destination Elasticsearch domain.
     * </p>
     * 
     * @param destinationDomainInfo
     *        Specifies the <code><a>DomainInformation</a></code> for the destination Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundCrossClusterSearchConnectionResult withDestinationDomainInfo(DomainInformation destinationDomainInfo) {
        setDestinationDomainInfo(destinationDomainInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the connection alias provided during the create connection request.
     * </p>
     * 
     * @param connectionAlias
     *        Specifies the connection alias provided during the create connection request.
     */

    public void setConnectionAlias(String connectionAlias) {
        this.connectionAlias = connectionAlias;
    }

    /**
     * <p>
     * Specifies the connection alias provided during the create connection request.
     * </p>
     * 
     * @return Specifies the connection alias provided during the create connection request.
     */

    public String getConnectionAlias() {
        return this.connectionAlias;
    }

    /**
     * <p>
     * Specifies the connection alias provided during the create connection request.
     * </p>
     * 
     * @param connectionAlias
     *        Specifies the connection alias provided during the create connection request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundCrossClusterSearchConnectionResult withConnectionAlias(String connectionAlias) {
        setConnectionAlias(connectionAlias);
        return this;
    }

    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnectionStatus</a></code> for the newly created connection.
     * </p>
     * 
     * @param connectionStatus
     *        Specifies the <code><a>OutboundCrossClusterSearchConnectionStatus</a></code> for the newly created
     *        connection.
     */

    public void setConnectionStatus(OutboundCrossClusterSearchConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnectionStatus</a></code> for the newly created connection.
     * </p>
     * 
     * @return Specifies the <code><a>OutboundCrossClusterSearchConnectionStatus</a></code> for the newly created
     *         connection.
     */

    public OutboundCrossClusterSearchConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * Specifies the <code><a>OutboundCrossClusterSearchConnectionStatus</a></code> for the newly created connection.
     * </p>
     * 
     * @param connectionStatus
     *        Specifies the <code><a>OutboundCrossClusterSearchConnectionStatus</a></code> for the newly created
     *        connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundCrossClusterSearchConnectionResult withConnectionStatus(OutboundCrossClusterSearchConnectionStatus connectionStatus) {
        setConnectionStatus(connectionStatus);
        return this;
    }

    /**
     * <p>
     * Unique id for the created outbound connection, which is used for subsequent operations on connection.
     * </p>
     * 
     * @param crossClusterSearchConnectionId
     *        Unique id for the created outbound connection, which is used for subsequent operations on connection.
     */

    public void setCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * Unique id for the created outbound connection, which is used for subsequent operations on connection.
     * </p>
     * 
     * @return Unique id for the created outbound connection, which is used for subsequent operations on connection.
     */

    public String getCrossClusterSearchConnectionId() {
        return this.crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * Unique id for the created outbound connection, which is used for subsequent operations on connection.
     * </p>
     * 
     * @param crossClusterSearchConnectionId
     *        Unique id for the created outbound connection, which is used for subsequent operations on connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundCrossClusterSearchConnectionResult withCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        setCrossClusterSearchConnectionId(crossClusterSearchConnectionId);
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
        if (getSourceDomainInfo() != null)
            sb.append("SourceDomainInfo: ").append(getSourceDomainInfo()).append(",");
        if (getDestinationDomainInfo() != null)
            sb.append("DestinationDomainInfo: ").append(getDestinationDomainInfo()).append(",");
        if (getConnectionAlias() != null)
            sb.append("ConnectionAlias: ").append(getConnectionAlias()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus()).append(",");
        if (getCrossClusterSearchConnectionId() != null)
            sb.append("CrossClusterSearchConnectionId: ").append(getCrossClusterSearchConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOutboundCrossClusterSearchConnectionResult == false)
            return false;
        CreateOutboundCrossClusterSearchConnectionResult other = (CreateOutboundCrossClusterSearchConnectionResult) obj;
        if (other.getSourceDomainInfo() == null ^ this.getSourceDomainInfo() == null)
            return false;
        if (other.getSourceDomainInfo() != null && other.getSourceDomainInfo().equals(this.getSourceDomainInfo()) == false)
            return false;
        if (other.getDestinationDomainInfo() == null ^ this.getDestinationDomainInfo() == null)
            return false;
        if (other.getDestinationDomainInfo() != null && other.getDestinationDomainInfo().equals(this.getDestinationDomainInfo()) == false)
            return false;
        if (other.getConnectionAlias() == null ^ this.getConnectionAlias() == null)
            return false;
        if (other.getConnectionAlias() != null && other.getConnectionAlias().equals(this.getConnectionAlias()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        if (other.getCrossClusterSearchConnectionId() == null ^ this.getCrossClusterSearchConnectionId() == null)
            return false;
        if (other.getCrossClusterSearchConnectionId() != null
                && other.getCrossClusterSearchConnectionId().equals(this.getCrossClusterSearchConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceDomainInfo() == null) ? 0 : getSourceDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getDestinationDomainInfo() == null) ? 0 : getDestinationDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getConnectionAlias() == null) ? 0 : getConnectionAlias().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        hashCode = prime * hashCode + ((getCrossClusterSearchConnectionId() == null) ? 0 : getCrossClusterSearchConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateOutboundCrossClusterSearchConnectionResult clone() {
        try {
            return (CreateOutboundCrossClusterSearchConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
