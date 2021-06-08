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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code><a>CreateOutboundCrossClusterSearchConnection</a></code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOutboundCrossClusterSearchConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Specifies the connection alias that will be used by the customer for this connection.
     * </p>
     */
    private String connectionAlias;

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

    public CreateOutboundCrossClusterSearchConnectionRequest withSourceDomainInfo(DomainInformation sourceDomainInfo) {
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

    public CreateOutboundCrossClusterSearchConnectionRequest withDestinationDomainInfo(DomainInformation destinationDomainInfo) {
        setDestinationDomainInfo(destinationDomainInfo);
        return this;
    }

    /**
     * <p>
     * Specifies the connection alias that will be used by the customer for this connection.
     * </p>
     * 
     * @param connectionAlias
     *        Specifies the connection alias that will be used by the customer for this connection.
     */

    public void setConnectionAlias(String connectionAlias) {
        this.connectionAlias = connectionAlias;
    }

    /**
     * <p>
     * Specifies the connection alias that will be used by the customer for this connection.
     * </p>
     * 
     * @return Specifies the connection alias that will be used by the customer for this connection.
     */

    public String getConnectionAlias() {
        return this.connectionAlias;
    }

    /**
     * <p>
     * Specifies the connection alias that will be used by the customer for this connection.
     * </p>
     * 
     * @param connectionAlias
     *        Specifies the connection alias that will be used by the customer for this connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundCrossClusterSearchConnectionRequest withConnectionAlias(String connectionAlias) {
        setConnectionAlias(connectionAlias);
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
            sb.append("ConnectionAlias: ").append(getConnectionAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOutboundCrossClusterSearchConnectionRequest == false)
            return false;
        CreateOutboundCrossClusterSearchConnectionRequest other = (CreateOutboundCrossClusterSearchConnectionRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceDomainInfo() == null) ? 0 : getSourceDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getDestinationDomainInfo() == null) ? 0 : getDestinationDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getConnectionAlias() == null) ? 0 : getConnectionAlias().hashCode());
        return hashCode;
    }

    @Override
    public CreateOutboundCrossClusterSearchConnectionRequest clone() {
        return (CreateOutboundCrossClusterSearchConnectionRequest) super.clone();
    }

}
