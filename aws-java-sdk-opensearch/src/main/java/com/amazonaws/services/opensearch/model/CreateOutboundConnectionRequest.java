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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for the parameters to the <code>CreateOutboundConnection</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateOutboundConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name and Region of the source (local) domain.
     * </p>
     */
    private DomainInformationContainer localDomainInfo;
    /**
     * <p>
     * Name and Region of the destination (remote) domain.
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
     * Name and Region of the source (local) domain.
     * </p>
     * 
     * @param localDomainInfo
     *        Name and Region of the source (local) domain.
     */

    public void setLocalDomainInfo(DomainInformationContainer localDomainInfo) {
        this.localDomainInfo = localDomainInfo;
    }

    /**
     * <p>
     * Name and Region of the source (local) domain.
     * </p>
     * 
     * @return Name and Region of the source (local) domain.
     */

    public DomainInformationContainer getLocalDomainInfo() {
        return this.localDomainInfo;
    }

    /**
     * <p>
     * Name and Region of the source (local) domain.
     * </p>
     * 
     * @param localDomainInfo
     *        Name and Region of the source (local) domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundConnectionRequest withLocalDomainInfo(DomainInformationContainer localDomainInfo) {
        setLocalDomainInfo(localDomainInfo);
        return this;
    }

    /**
     * <p>
     * Name and Region of the destination (remote) domain.
     * </p>
     * 
     * @param remoteDomainInfo
     *        Name and Region of the destination (remote) domain.
     */

    public void setRemoteDomainInfo(DomainInformationContainer remoteDomainInfo) {
        this.remoteDomainInfo = remoteDomainInfo;
    }

    /**
     * <p>
     * Name and Region of the destination (remote) domain.
     * </p>
     * 
     * @return Name and Region of the destination (remote) domain.
     */

    public DomainInformationContainer getRemoteDomainInfo() {
        return this.remoteDomainInfo;
    }

    /**
     * <p>
     * Name and Region of the destination (remote) domain.
     * </p>
     * 
     * @param remoteDomainInfo
     *        Name and Region of the destination (remote) domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateOutboundConnectionRequest withRemoteDomainInfo(DomainInformationContainer remoteDomainInfo) {
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

    public CreateOutboundConnectionRequest withConnectionAlias(String connectionAlias) {
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
        if (getLocalDomainInfo() != null)
            sb.append("LocalDomainInfo: ").append(getLocalDomainInfo()).append(",");
        if (getRemoteDomainInfo() != null)
            sb.append("RemoteDomainInfo: ").append(getRemoteDomainInfo()).append(",");
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

        if (obj instanceof CreateOutboundConnectionRequest == false)
            return false;
        CreateOutboundConnectionRequest other = (CreateOutboundConnectionRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocalDomainInfo() == null) ? 0 : getLocalDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainInfo() == null) ? 0 : getRemoteDomainInfo().hashCode());
        hashCode = prime * hashCode + ((getConnectionAlias() == null) ? 0 : getConnectionAlias().hashCode());
        return hashCode;
    }

    @Override
    public CreateOutboundConnectionRequest clone() {
        return (CreateOutboundConnectionRequest) super.clone();
    }

}
