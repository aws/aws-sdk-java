/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the MQTT context to use for the test authorizer request
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MqttContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization request.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization request.
     * </p>
     */
    private java.nio.ByteBuffer password;
    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization request.
     * </p>
     */
    private String clientId;

    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization request.
     * </p>
     * 
     * @param username
     *        The value of the <code>username</code> key in an MQTT authorization request.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization request.
     * </p>
     * 
     * @return The value of the <code>username</code> key in an MQTT authorization request.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization request.
     * </p>
     * 
     * @param username
     *        The value of the <code>username</code> key in an MQTT authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MqttContext withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization request.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param password
     *        The value of the <code>password</code> key in an MQTT authorization request.
     */

    public void setPassword(java.nio.ByteBuffer password) {
        this.password = password;
    }

    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization request.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The value of the <code>password</code> key in an MQTT authorization request.
     */

    public java.nio.ByteBuffer getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization request.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param password
     *        The value of the <code>password</code> key in an MQTT authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MqttContext withPassword(java.nio.ByteBuffer password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization request.
     * </p>
     * 
     * @param clientId
     *        The value of the <code>clientId</code> key in an MQTT authorization request.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization request.
     * </p>
     * 
     * @return The value of the <code>clientId</code> key in an MQTT authorization request.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization request.
     * </p>
     * 
     * @param clientId
     *        The value of the <code>clientId</code> key in an MQTT authorization request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MqttContext withClientId(String clientId) {
        setClientId(clientId);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append(getPassword()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MqttContext == false)
            return false;
        MqttContext other = (MqttContext) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public MqttContext clone() {
        try {
            return (MqttContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MqttContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
