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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/DeliveryOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeliveryOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     */
    private String tlsPolicy;

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *        established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *        connection can't be established.
     * @see TlsPolicy
     */

    public void setTlsPolicy(String tlsPolicy) {
        this.tlsPolicy = tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @return Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *         (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *         established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *         connection can't be established.
     * @see TlsPolicy
     */

    public String getTlsPolicy() {
        return this.tlsPolicy;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *        established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *        connection can't be established.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsPolicy
     */

    public DeliveryOptions withTlsPolicy(String tlsPolicy) {
        setTlsPolicy(tlsPolicy);
        return this;
    }

    /**
     * <p>
     * Specifies whether messages that use the configuration set are required to use Transport Layer Security (TLS). If
     * the value is <code>Require</code>, messages are only delivered if a TLS connection can be established. If the
     * value is <code>Optional</code>, messages can be delivered in plain text if a TLS connection can't be established.
     * </p>
     * 
     * @param tlsPolicy
     *        Specifies whether messages that use the configuration set are required to use Transport Layer Security
     *        (TLS). If the value is <code>Require</code>, messages are only delivered if a TLS connection can be
     *        established. If the value is <code>Optional</code>, messages can be delivered in plain text if a TLS
     *        connection can't be established.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TlsPolicy
     */

    public DeliveryOptions withTlsPolicy(TlsPolicy tlsPolicy) {
        this.tlsPolicy = tlsPolicy.toString();
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
        if (getTlsPolicy() != null)
            sb.append("TlsPolicy: ").append(getTlsPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryOptions == false)
            return false;
        DeliveryOptions other = (DeliveryOptions) obj;
        if (other.getTlsPolicy() == null ^ this.getTlsPolicy() == null)
            return false;
        if (other.getTlsPolicy() != null && other.getTlsPolicy().equals(this.getTlsPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTlsPolicy() == null) ? 0 : getTlsPolicy().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryOptions clone() {
        try {
            return (DeliveryOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
