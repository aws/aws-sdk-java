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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Options for a network interface-type endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CreateVerifiedAccessEndpointEniOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVerifiedAccessEndpointEniOptions implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The IP protocol.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The IP port number.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointEniOptions withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The IP protocol.
     * </p>
     * 
     * @param protocol
     *        The IP protocol.
     * @see VerifiedAccessEndpointProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The IP protocol.
     * </p>
     * 
     * @return The IP protocol.
     * @see VerifiedAccessEndpointProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The IP protocol.
     * </p>
     * 
     * @param protocol
     *        The IP protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointProtocol
     */

    public CreateVerifiedAccessEndpointEniOptions withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The IP protocol.
     * </p>
     * 
     * @param protocol
     *        The IP protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifiedAccessEndpointProtocol
     */

    public CreateVerifiedAccessEndpointEniOptions withProtocol(VerifiedAccessEndpointProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The IP port number.
     * </p>
     * 
     * @param port
     *        The IP port number.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The IP port number.
     * </p>
     * 
     * @return The IP port number.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The IP port number.
     * </p>
     * 
     * @param port
     *        The IP port number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVerifiedAccessEndpointEniOptions withPort(Integer port) {
        setPort(port);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVerifiedAccessEndpointEniOptions == false)
            return false;
        CreateVerifiedAccessEndpointEniOptions other = (CreateVerifiedAccessEndpointEniOptions) obj;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public CreateVerifiedAccessEndpointEniOptions clone() {
        try {
            return (CreateVerifiedAccessEndpointEniOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
