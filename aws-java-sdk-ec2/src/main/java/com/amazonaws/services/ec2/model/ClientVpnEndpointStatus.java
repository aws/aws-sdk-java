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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the state of a Client VPN endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ClientVpnEndpointStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientVpnEndpointStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the Client VPN endpoint. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     * associated. The Client VPN endpoint cannot accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The Client VPN endpoint has been created and a target network has been associated. The
     * Client VPN endpoint can accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * A message about the status of the Client VPN endpoint.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The state of the Client VPN endpoint. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     * associated. The Client VPN endpoint cannot accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The Client VPN endpoint has been created and a target network has been associated. The
     * Client VPN endpoint can accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state of the Client VPN endpoint. Possible states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     *        associated. The Client VPN endpoint cannot accept connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code> - The Client VPN endpoint has been created and a target network has been
     *        associated. The Client VPN endpoint can accept connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     *        connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     *        connections.
     *        </p>
     *        </li>
     * @see ClientVpnEndpointStatusCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state of the Client VPN endpoint. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     * associated. The Client VPN endpoint cannot accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The Client VPN endpoint has been created and a target network has been associated. The
     * Client VPN endpoint can accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the Client VPN endpoint. Possible states include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have
     *         been associated. The Client VPN endpoint cannot accept connections.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code> - The Client VPN endpoint has been created and a target network has been
     *         associated. The Client VPN endpoint can accept connections.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     *         connections.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     *         connections.
     *         </p>
     *         </li>
     * @see ClientVpnEndpointStatusCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The state of the Client VPN endpoint. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     * associated. The Client VPN endpoint cannot accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The Client VPN endpoint has been created and a target network has been associated. The
     * Client VPN endpoint can accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state of the Client VPN endpoint. Possible states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     *        associated. The Client VPN endpoint cannot accept connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code> - The Client VPN endpoint has been created and a target network has been
     *        associated. The Client VPN endpoint can accept connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     *        connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     *        connections.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientVpnEndpointStatusCode
     */

    public ClientVpnEndpointStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The state of the Client VPN endpoint. Possible states include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     * associated. The Client VPN endpoint cannot accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code> - The Client VPN endpoint has been created and a target network has been associated. The
     * Client VPN endpoint can accept connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     * connections.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The state of the Client VPN endpoint. Possible states include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>pending-associate</code> - The Client VPN endpoint has been created but no target networks have been
     *        associated. The Client VPN endpoint cannot accept connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code> - The Client VPN endpoint has been created and a target network has been
     *        associated. The Client VPN endpoint can accept connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code> - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     *        connections.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code> - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     *        connections.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClientVpnEndpointStatusCode
     */

    public ClientVpnEndpointStatus withCode(ClientVpnEndpointStatusCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * A message about the status of the Client VPN endpoint.
     * </p>
     * 
     * @param message
     *        A message about the status of the Client VPN endpoint.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message about the status of the Client VPN endpoint.
     * </p>
     * 
     * @return A message about the status of the Client VPN endpoint.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message about the status of the Client VPN endpoint.
     * </p>
     * 
     * @param message
     *        A message about the status of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientVpnEndpointStatus withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClientVpnEndpointStatus == false)
            return false;
        ClientVpnEndpointStatus other = (ClientVpnEndpointStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public ClientVpnEndpointStatus clone() {
        try {
            return (ClientVpnEndpointStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
