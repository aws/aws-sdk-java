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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies details of an inbound connection.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InboundCrossClusterSearchConnection implements Serializable, Cloneable, StructuredPojo {

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
     * Specifies the connection id for the inbound cross-cluster search connection.
     * </p>
     */
    private String crossClusterSearchConnectionId;
    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the outbound connection.
     * </p>
     */
    private InboundCrossClusterSearchConnectionStatus connectionStatus;

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

    public InboundCrossClusterSearchConnection withSourceDomainInfo(DomainInformation sourceDomainInfo) {
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

    public InboundCrossClusterSearchConnection withDestinationDomainInfo(DomainInformation destinationDomainInfo) {
        setDestinationDomainInfo(destinationDomainInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the connection id for the inbound cross-cluster search connection.
     * </p>
     * 
     * @param crossClusterSearchConnectionId
     *        Specifies the connection id for the inbound cross-cluster search connection.
     */

    public void setCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        this.crossClusterSearchConnectionId = crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * Specifies the connection id for the inbound cross-cluster search connection.
     * </p>
     * 
     * @return Specifies the connection id for the inbound cross-cluster search connection.
     */

    public String getCrossClusterSearchConnectionId() {
        return this.crossClusterSearchConnectionId;
    }

    /**
     * <p>
     * Specifies the connection id for the inbound cross-cluster search connection.
     * </p>
     * 
     * @param crossClusterSearchConnectionId
     *        Specifies the connection id for the inbound cross-cluster search connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundCrossClusterSearchConnection withCrossClusterSearchConnectionId(String crossClusterSearchConnectionId) {
        setCrossClusterSearchConnectionId(crossClusterSearchConnectionId);
        return this;
    }

    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the outbound connection.
     * </p>
     * 
     * @param connectionStatus
     *        Specifies the <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the outbound connection.
     */

    public void setConnectionStatus(InboundCrossClusterSearchConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the outbound connection.
     * </p>
     * 
     * @return Specifies the <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the outbound connection.
     */

    public InboundCrossClusterSearchConnectionStatus getConnectionStatus() {
        return this.connectionStatus;
    }

    /**
     * <p>
     * Specifies the <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the outbound connection.
     * </p>
     * 
     * @param connectionStatus
     *        Specifies the <code><a>InboundCrossClusterSearchConnectionStatus</a></code> for the outbound connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InboundCrossClusterSearchConnection withConnectionStatus(InboundCrossClusterSearchConnectionStatus connectionStatus) {
        setConnectionStatus(connectionStatus);
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
        if (getCrossClusterSearchConnectionId() != null)
            sb.append("CrossClusterSearchConnectionId: ").append(getCrossClusterSearchConnectionId()).append(",");
        if (getConnectionStatus() != null)
            sb.append("ConnectionStatus: ").append(getConnectionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InboundCrossClusterSearchConnection == false)
            return false;
        InboundCrossClusterSearchConnection other = (InboundCrossClusterSearchConnection) obj;
        if (other.getSourceDomainInfo() == null ^ this.getSourceDomainInfo() == null)
            return false;
        if (other.getSourceDomainInfo() != null && other.getSourceDomainInfo().equals(this.getSourceDomainInfo()) == false)
            return false;
        if (other.getDestinationDomainInfo() == null ^ this.getDestinationDomainInfo() == null)
            return false;
        if (other.getDestinationDomainInfo() != null && other.getDestinationDomainInfo().equals(this.getDestinationDomainInfo()) == false)
            return false;
        if (other.getCrossClusterSearchConnectionId() == null ^ this.getCrossClusterSearchConnectionId() == null)
            return false;
        if (other.getCrossClusterSearchConnectionId() != null
                && other.getCrossClusterSearchConnectionId().equals(this.getCrossClusterSearchConnectionId()) == false)
            return false;
        if (other.getConnectionStatus() == null ^ this.getConnectionStatus() == null)
            return false;
        if (other.getConnectionStatus() != null && other.getConnectionStatus().equals(this.getConnectionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceDomainInfo() == null) ? 0 : getSourceDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getDestinationDomainInfo() == null) ? 0 : getDestinationDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getCrossClusterSearchConnectionId() == null) ? 0 : getCrossClusterSearchConnectionId().hashCode());
        hashCode = prime * hashCode + ((getConnectionStatus() == null) ? 0 : getConnectionStatus().hashCode());
        return hashCode;
    }

    @Override
    public InboundCrossClusterSearchConnection clone() {
        try {
            return (InboundCrossClusterSearchConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.InboundCrossClusterSearchConnectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
