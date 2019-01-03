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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information about a Greengrass core's connectivity.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/ConnectivityInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectivityInfo implements Serializable, Cloneable, StructuredPojo {

    /** The endpoint for the Greengrass core. Can be an IP address or DNS. */
    private String hostAddress;
    /** The ID of the connectivity information. */
    private String id;
    /** Metadata for this endpoint. */
    private String metadata;
    /** The port of the Greengrass core. Usually 8883. */
    private Integer portNumber;

    /**
     * The endpoint for the Greengrass core. Can be an IP address or DNS.
     * 
     * @param hostAddress
     *        The endpoint for the Greengrass core. Can be an IP address or DNS.
     */

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    /**
     * The endpoint for the Greengrass core. Can be an IP address or DNS.
     * 
     * @return The endpoint for the Greengrass core. Can be an IP address or DNS.
     */

    public String getHostAddress() {
        return this.hostAddress;
    }

    /**
     * The endpoint for the Greengrass core. Can be an IP address or DNS.
     * 
     * @param hostAddress
     *        The endpoint for the Greengrass core. Can be an IP address or DNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withHostAddress(String hostAddress) {
        setHostAddress(hostAddress);
        return this;
    }

    /**
     * The ID of the connectivity information.
     * 
     * @param id
     *        The ID of the connectivity information.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The ID of the connectivity information.
     * 
     * @return The ID of the connectivity information.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The ID of the connectivity information.
     * 
     * @param id
     *        The ID of the connectivity information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Metadata for this endpoint.
     * 
     * @param metadata
     *        Metadata for this endpoint.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * Metadata for this endpoint.
     * 
     * @return Metadata for this endpoint.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Metadata for this endpoint.
     * 
     * @param metadata
     *        Metadata for this endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withMetadata(String metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * The port of the Greengrass core. Usually 8883.
     * 
     * @param portNumber
     *        The port of the Greengrass core. Usually 8883.
     */

    public void setPortNumber(Integer portNumber) {
        this.portNumber = portNumber;
    }

    /**
     * The port of the Greengrass core. Usually 8883.
     * 
     * @return The port of the Greengrass core. Usually 8883.
     */

    public Integer getPortNumber() {
        return this.portNumber;
    }

    /**
     * The port of the Greengrass core. Usually 8883.
     * 
     * @param portNumber
     *        The port of the Greengrass core. Usually 8883.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectivityInfo withPortNumber(Integer portNumber) {
        setPortNumber(portNumber);
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
        if (getHostAddress() != null)
            sb.append("HostAddress: ").append(getHostAddress()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getPortNumber() != null)
            sb.append("PortNumber: ").append(getPortNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectivityInfo == false)
            return false;
        ConnectivityInfo other = (ConnectivityInfo) obj;
        if (other.getHostAddress() == null ^ this.getHostAddress() == null)
            return false;
        if (other.getHostAddress() != null && other.getHostAddress().equals(this.getHostAddress()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getPortNumber() == null ^ this.getPortNumber() == null)
            return false;
        if (other.getPortNumber() != null && other.getPortNumber().equals(this.getPortNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostAddress() == null) ? 0 : getHostAddress().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getPortNumber() == null) ? 0 : getPortNumber().hashCode());
        return hashCode;
    }

    @Override
    public ConnectivityInfo clone() {
        try {
            return (ConnectivityInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.ConnectivityInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
