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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Protocol used in Amazon Security Lake that dictates how notifications are posted at the endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/ProtocolAndNotificationEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtocolAndNotificationEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account that is subscribed to receive exception notifications.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The protocol to which notification messages are posted.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The account that is subscribed to receive exception notifications.
     * </p>
     * 
     * @param endpoint
     *        The account that is subscribed to receive exception notifications.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The account that is subscribed to receive exception notifications.
     * </p>
     * 
     * @return The account that is subscribed to receive exception notifications.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The account that is subscribed to receive exception notifications.
     * </p>
     * 
     * @param endpoint
     *        The account that is subscribed to receive exception notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolAndNotificationEndpoint withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The protocol to which notification messages are posted.
     * </p>
     * 
     * @param protocol
     *        The protocol to which notification messages are posted.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to which notification messages are posted.
     * </p>
     * 
     * @return The protocol to which notification messages are posted.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol to which notification messages are posted.
     * </p>
     * 
     * @param protocol
     *        The protocol to which notification messages are posted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtocolAndNotificationEndpoint withProtocol(String protocol) {
        setProtocol(protocol);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtocolAndNotificationEndpoint == false)
            return false;
        ProtocolAndNotificationEndpoint other = (ProtocolAndNotificationEndpoint) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public ProtocolAndNotificationEndpoint clone() {
        try {
            return (ProtocolAndNotificationEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.ProtocolAndNotificationEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
