/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object that specifies the TLS configuration for a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TlsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The security policy for a domain configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table">Security
     * policies </a> in the <i>Amazon Web Services IoT Core developer guide</i>.
     * </p>
     */
    private String securityPolicy;

    /**
     * <p>
     * The security policy for a domain configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table">Security
     * policies </a> in the <i>Amazon Web Services IoT Core developer guide</i>.
     * </p>
     * 
     * @param securityPolicy
     *        The security policy for a domain configuration. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     *        >Security policies </a> in the <i>Amazon Web Services IoT Core developer guide</i>.
     */

    public void setSecurityPolicy(String securityPolicy) {
        this.securityPolicy = securityPolicy;
    }

    /**
     * <p>
     * The security policy for a domain configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table">Security
     * policies </a> in the <i>Amazon Web Services IoT Core developer guide</i>.
     * </p>
     * 
     * @return The security policy for a domain configuration. For more information, see <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     *         >Security policies </a> in the <i>Amazon Web Services IoT Core developer guide</i>.
     */

    public String getSecurityPolicy() {
        return this.securityPolicy;
    }

    /**
     * <p>
     * The security policy for a domain configuration. For more information, see <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table">Security
     * policies </a> in the <i>Amazon Web Services IoT Core developer guide</i>.
     * </p>
     * 
     * @param securityPolicy
     *        The security policy for a domain configuration. For more information, see <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/transport-security.html#tls-policy-table"
     *        >Security policies </a> in the <i>Amazon Web Services IoT Core developer guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TlsConfig withSecurityPolicy(String securityPolicy) {
        setSecurityPolicy(securityPolicy);
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
        if (getSecurityPolicy() != null)
            sb.append("SecurityPolicy: ").append(getSecurityPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TlsConfig == false)
            return false;
        TlsConfig other = (TlsConfig) obj;
        if (other.getSecurityPolicy() == null ^ this.getSecurityPolicy() == null)
            return false;
        if (other.getSecurityPolicy() != null && other.getSecurityPolicy().equals(this.getSecurityPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecurityPolicy() == null) ? 0 : getSecurityPolicy().hashCode());
        return hashCode;
    }

    @Override
    public TlsConfig clone() {
        try {
            return (TlsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.TlsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
