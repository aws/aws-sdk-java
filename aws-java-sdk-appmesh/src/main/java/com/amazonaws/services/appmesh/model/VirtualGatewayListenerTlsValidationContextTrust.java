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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a virtual gateway's listener's Transport Layer Security (TLS) validation context trust.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayListenerTlsValidationContextTrust"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayListenerTlsValidationContextTrust implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
     * </p>
     */
    private VirtualGatewayTlsValidationContextFileTrust file;
    /**
     * <p>
     * A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret
     * Discovery Service validation context trust.
     * </p>
     */
    private VirtualGatewayTlsValidationContextSdsTrust sds;

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
     * </p>
     * 
     * @param file
     *        An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
     */

    public void setFile(VirtualGatewayTlsValidationContextFileTrust file) {
        this.file = file;
    }

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
     * </p>
     * 
     * @return An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
     */

    public VirtualGatewayTlsValidationContextFileTrust getFile() {
        return this.file;
    }

    /**
     * <p>
     * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
     * </p>
     * 
     * @param file
     *        An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayListenerTlsValidationContextTrust withFile(VirtualGatewayTlsValidationContextFileTrust file) {
        setFile(file);
        return this;
    }

    /**
     * <p>
     * A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret
     * Discovery Service validation context trust.
     * </p>
     * 
     * @param sds
     *        A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS)
     *        Secret Discovery Service validation context trust.
     */

    public void setSds(VirtualGatewayTlsValidationContextSdsTrust sds) {
        this.sds = sds;
    }

    /**
     * <p>
     * A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret
     * Discovery Service validation context trust.
     * </p>
     * 
     * @return A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS)
     *         Secret Discovery Service validation context trust.
     */

    public VirtualGatewayTlsValidationContextSdsTrust getSds() {
        return this.sds;
    }

    /**
     * <p>
     * A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret
     * Discovery Service validation context trust.
     * </p>
     * 
     * @param sds
     *        A reference to an object that represents a virtual gateway's listener's Transport Layer Security (TLS)
     *        Secret Discovery Service validation context trust.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayListenerTlsValidationContextTrust withSds(VirtualGatewayTlsValidationContextSdsTrust sds) {
        setSds(sds);
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
        if (getFile() != null)
            sb.append("File: ").append(getFile()).append(",");
        if (getSds() != null)
            sb.append("Sds: ").append(getSds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewayListenerTlsValidationContextTrust == false)
            return false;
        VirtualGatewayListenerTlsValidationContextTrust other = (VirtualGatewayListenerTlsValidationContextTrust) obj;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        if (other.getSds() == null ^ this.getSds() == null)
            return false;
        if (other.getSds() != null && other.getSds().equals(this.getSds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
        hashCode = prime * hashCode + ((getSds() == null) ? 0 : getSds().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayListenerTlsValidationContextTrust clone() {
        try {
            return (VirtualGatewayListenerTlsValidationContextTrust) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayListenerTlsValidationContextTrustMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
