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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
 * Includes all client authentication information for VPC connectivity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/VpcConnectivityClientAuthentication"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcConnectivityClientAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * SASL authentication type details for VPC connectivity.
     * </p>
     */
    private VpcConnectivitySasl sasl;
    /**
     * <p>
     * TLS authentication type details for VPC connectivity.
     * </p>
     */
    private VpcConnectivityTls tls;

    /**
     * <p>
     * SASL authentication type details for VPC connectivity.
     * </p>
     * 
     * @param sasl
     *        <p>
     *        SASL authentication type details for VPC connectivity.
     *        </p>
     */

    public void setSasl(VpcConnectivitySasl sasl) {
        this.sasl = sasl;
    }

    /**
     * <p>
     * SASL authentication type details for VPC connectivity.
     * </p>
     * 
     * @return <p>
     *         SASL authentication type details for VPC connectivity.
     *         </p>
     */

    public VpcConnectivitySasl getSasl() {
        return this.sasl;
    }

    /**
     * <p>
     * SASL authentication type details for VPC connectivity.
     * </p>
     * 
     * @param sasl
     *        <p>
     *        SASL authentication type details for VPC connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectivityClientAuthentication withSasl(VpcConnectivitySasl sasl) {
        setSasl(sasl);
        return this;
    }

    /**
     * <p>
     * TLS authentication type details for VPC connectivity.
     * </p>
     * 
     * @param tls
     *        <p>
     *        TLS authentication type details for VPC connectivity.
     *        </p>
     */

    public void setTls(VpcConnectivityTls tls) {
        this.tls = tls;
    }

    /**
     * <p>
     * TLS authentication type details for VPC connectivity.
     * </p>
     * 
     * @return <p>
     *         TLS authentication type details for VPC connectivity.
     *         </p>
     */

    public VpcConnectivityTls getTls() {
        return this.tls;
    }

    /**
     * <p>
     * TLS authentication type details for VPC connectivity.
     * </p>
     * 
     * @param tls
     *        <p>
     *        TLS authentication type details for VPC connectivity.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcConnectivityClientAuthentication withTls(VpcConnectivityTls tls) {
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

        if (obj instanceof VpcConnectivityClientAuthentication == false)
            return false;
        VpcConnectivityClientAuthentication other = (VpcConnectivityClientAuthentication) obj;
        if (other.getSasl() == null ^ this.getSasl() == null)
            return false;
        if (other.getSasl() != null && other.getSasl().equals(this.getSasl()) == false)
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
        hashCode = prime * hashCode + ((getTls() == null) ? 0 : getTls().hashCode());
        return hashCode;
    }

    @Override
    public VpcConnectivityClientAuthentication clone() {
        try {
            return (VpcConnectivityClientAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.VpcConnectivityClientAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
