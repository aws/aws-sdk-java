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
package com.amazonaws.services.managedblockchain.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Attributes of an Ethereum node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/managedblockchain-2018-09-24/NodeEthereumAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeEthereumAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over HTTP connections from a
     * client. Use this endpoint in client code for smart contracts when using an HTTP connection. Connections to this
     * endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     */
    private String httpEndpoint;
    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSockets connections from
     * a client. Use this endpoint in client code for smart contracts when using a WebSockets connection. Connections to
     * this endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     */
    private String webSocketEndpoint;

    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over HTTP connections from a
     * client. Use this endpoint in client code for smart contracts when using an HTTP connection. Connections to this
     * endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * 
     * @param httpEndpoint
     *        The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over HTTP connections
     *        from a client. Use this endpoint in client code for smart contracts when using an HTTP connection.
     *        Connections to this endpoint are authenticated using <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     */

    public void setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
    }

    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over HTTP connections from a
     * client. Use this endpoint in client code for smart contracts when using an HTTP connection. Connections to this
     * endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * 
     * @return The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over HTTP connections
     *         from a client. Use this endpoint in client code for smart contracts when using an HTTP connection.
     *         Connections to this endpoint are authenticated using <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     */

    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over HTTP connections from a
     * client. Use this endpoint in client code for smart contracts when using an HTTP connection. Connections to this
     * endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * 
     * @param httpEndpoint
     *        The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over HTTP connections
     *        from a client. Use this endpoint in client code for smart contracts when using an HTTP connection.
     *        Connections to this endpoint are authenticated using <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeEthereumAttributes withHttpEndpoint(String httpEndpoint) {
        setHttpEndpoint(httpEndpoint);
        return this;
    }

    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSockets connections from
     * a client. Use this endpoint in client code for smart contracts when using a WebSockets connection. Connections to
     * this endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * 
     * @param webSocketEndpoint
     *        The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSockets
     *        connections from a client. Use this endpoint in client code for smart contracts when using a WebSockets
     *        connection. Connections to this endpoint are authenticated using <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     */

    public void setWebSocketEndpoint(String webSocketEndpoint) {
        this.webSocketEndpoint = webSocketEndpoint;
    }

    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSockets connections from
     * a client. Use this endpoint in client code for smart contracts when using a WebSockets connection. Connections to
     * this endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * 
     * @return The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSockets
     *         connections from a client. Use this endpoint in client code for smart contracts when using a WebSockets
     *         connection. Connections to this endpoint are authenticated using <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     */

    public String getWebSocketEndpoint() {
        return this.webSocketEndpoint;
    }

    /**
     * <p>
     * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSockets connections from
     * a client. Use this endpoint in client code for smart contracts when using a WebSockets connection. Connections to
     * this endpoint are authenticated using <a
     * href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * </p>
     * 
     * @param webSocketEndpoint
     *        The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSockets
     *        connections from a client. Use this endpoint in client code for smart contracts when using a WebSockets
     *        connection. Connections to this endpoint are authenticated using <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">Signature Version 4</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeEthereumAttributes withWebSocketEndpoint(String webSocketEndpoint) {
        setWebSocketEndpoint(webSocketEndpoint);
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
        if (getHttpEndpoint() != null)
            sb.append("HttpEndpoint: ").append(getHttpEndpoint()).append(",");
        if (getWebSocketEndpoint() != null)
            sb.append("WebSocketEndpoint: ").append(getWebSocketEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeEthereumAttributes == false)
            return false;
        NodeEthereumAttributes other = (NodeEthereumAttributes) obj;
        if (other.getHttpEndpoint() == null ^ this.getHttpEndpoint() == null)
            return false;
        if (other.getHttpEndpoint() != null && other.getHttpEndpoint().equals(this.getHttpEndpoint()) == false)
            return false;
        if (other.getWebSocketEndpoint() == null ^ this.getWebSocketEndpoint() == null)
            return false;
        if (other.getWebSocketEndpoint() != null && other.getWebSocketEndpoint().equals(this.getWebSocketEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHttpEndpoint() == null) ? 0 : getHttpEndpoint().hashCode());
        hashCode = prime * hashCode + ((getWebSocketEndpoint() == null) ? 0 : getWebSocketEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public NodeEthereumAttributes clone() {
        try {
            return (NodeEthereumAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedblockchain.model.transform.NodeEthereumAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
