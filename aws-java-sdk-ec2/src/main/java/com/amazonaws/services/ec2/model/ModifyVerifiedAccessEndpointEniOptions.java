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
 * Options for a network-interface type Verified Access endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ModifyVerifiedAccessEndpointEniOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessEndpointEniOptions implements Serializable, Cloneable {

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

    public ModifyVerifiedAccessEndpointEniOptions withProtocol(String protocol) {
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

    public ModifyVerifiedAccessEndpointEniOptions withProtocol(VerifiedAccessEndpointProtocol protocol) {
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

    public ModifyVerifiedAccessEndpointEniOptions withPort(Integer port) {
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

        if (obj instanceof ModifyVerifiedAccessEndpointEniOptions == false)
            return false;
        ModifyVerifiedAccessEndpointEniOptions other = (ModifyVerifiedAccessEndpointEniOptions) obj;
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

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessEndpointEniOptions clone() {
        try {
            return (ModifyVerifiedAccessEndpointEniOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
