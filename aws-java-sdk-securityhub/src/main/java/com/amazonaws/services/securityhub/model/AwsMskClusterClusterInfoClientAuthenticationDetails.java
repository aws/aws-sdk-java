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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about different modes of client authentication.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsMskClusterClusterInfoClientAuthenticationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsMskClusterClusterInfoClientAuthenticationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides details for client authentication using SASL.
     * </p>
     */
    private AwsMskClusterClusterInfoClientAuthenticationSaslDetails sasl;
    /**
     * <p>
     * Provides details for allowing no client authentication.
     * </p>
     */
    private AwsMskClusterClusterInfoClientAuthenticationUnauthenticatedDetails unauthenticated;
    /**
     * <p>
     * Provides details for client authentication using TLS.
     * </p>
     */
    private AwsMskClusterClusterInfoClientAuthenticationTlsDetails tls;

    /**
     * <p>
     * Provides details for client authentication using SASL.
     * </p>
     * 
     * @param sasl
     *        Provides details for client authentication using SASL.
     */

    public void setSasl(AwsMskClusterClusterInfoClientAuthenticationSaslDetails sasl) {
        this.sasl = sasl;
    }

    /**
     * <p>
     * Provides details for client authentication using SASL.
     * </p>
     * 
     * @return Provides details for client authentication using SASL.
     */

    public AwsMskClusterClusterInfoClientAuthenticationSaslDetails getSasl() {
        return this.sasl;
    }

    /**
     * <p>
     * Provides details for client authentication using SASL.
     * </p>
     * 
     * @param sasl
     *        Provides details for client authentication using SASL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoClientAuthenticationDetails withSasl(AwsMskClusterClusterInfoClientAuthenticationSaslDetails sasl) {
        setSasl(sasl);
        return this;
    }

    /**
     * <p>
     * Provides details for allowing no client authentication.
     * </p>
     * 
     * @param unauthenticated
     *        Provides details for allowing no client authentication.
     */

    public void setUnauthenticated(AwsMskClusterClusterInfoClientAuthenticationUnauthenticatedDetails unauthenticated) {
        this.unauthenticated = unauthenticated;
    }

    /**
     * <p>
     * Provides details for allowing no client authentication.
     * </p>
     * 
     * @return Provides details for allowing no client authentication.
     */

    public AwsMskClusterClusterInfoClientAuthenticationUnauthenticatedDetails getUnauthenticated() {
        return this.unauthenticated;
    }

    /**
     * <p>
     * Provides details for allowing no client authentication.
     * </p>
     * 
     * @param unauthenticated
     *        Provides details for allowing no client authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoClientAuthenticationDetails withUnauthenticated(
            AwsMskClusterClusterInfoClientAuthenticationUnauthenticatedDetails unauthenticated) {
        setUnauthenticated(unauthenticated);
        return this;
    }

    /**
     * <p>
     * Provides details for client authentication using TLS.
     * </p>
     * 
     * @param tls
     *        Provides details for client authentication using TLS.
     */

    public void setTls(AwsMskClusterClusterInfoClientAuthenticationTlsDetails tls) {
        this.tls = tls;
    }

    /**
     * <p>
     * Provides details for client authentication using TLS.
     * </p>
     * 
     * @return Provides details for client authentication using TLS.
     */

    public AwsMskClusterClusterInfoClientAuthenticationTlsDetails getTls() {
        return this.tls;
    }

    /**
     * <p>
     * Provides details for client authentication using TLS.
     * </p>
     * 
     * @param tls
     *        Provides details for client authentication using TLS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsMskClusterClusterInfoClientAuthenticationDetails withTls(AwsMskClusterClusterInfoClientAuthenticationTlsDetails tls) {
        setTls(tls);
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
        if (getSasl() != null)
            sb.append("Sasl: ").append(getSasl()).append(",");
        if (getUnauthenticated() != null)
            sb.append("Unauthenticated: ").append(getUnauthenticated()).append(",");
        if (getTls() != null)
            sb.append("Tls: ").append(getTls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsMskClusterClusterInfoClientAuthenticationDetails == false)
            return false;
        AwsMskClusterClusterInfoClientAuthenticationDetails other = (AwsMskClusterClusterInfoClientAuthenticationDetails) obj;
        if (other.getSasl() == null ^ this.getSasl() == null)
            return false;
        if (other.getSasl() != null && other.getSasl().equals(this.getSasl()) == false)
            return false;
        if (other.getUnauthenticated() == null ^ this.getUnauthenticated() == null)
            return false;
        if (other.getUnauthenticated() != null && other.getUnauthenticated().equals(this.getUnauthenticated()) == false)
            return false;
        if (other.getTls() == null ^ this.getTls() == null)
            return false;
        if (other.getTls() != null && other.getTls().equals(this.getTls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSasl() == null) ? 0 : getSasl().hashCode());
        hashCode = prime * hashCode + ((getUnauthenticated() == null) ? 0 : getUnauthenticated().hashCode());
        hashCode = prime * hashCode + ((getTls() == null) ? 0 : getTls().hashCode());
        return hashCode;
    }

    @Override
    public AwsMskClusterClusterInfoClientAuthenticationDetails clone() {
        try {
            return (AwsMskClusterClusterInfoClientAuthenticationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsMskClusterClusterInfoClientAuthenticationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
