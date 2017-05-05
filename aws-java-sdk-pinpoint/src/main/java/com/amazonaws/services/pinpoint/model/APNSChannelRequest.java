/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Apple Push Notification Service channel definition.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /** The distribution certificate from Apple. */
    private String certificate;
    /** The certificate private key. */
    private String privateKey;

    /**
     * The distribution certificate from Apple.
     * 
     * @param certificate
     *        The distribution certificate from Apple.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * The distribution certificate from Apple.
     * 
     * @return The distribution certificate from Apple.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * The distribution certificate from Apple.
     * 
     * @param certificate
     *        The distribution certificate from Apple.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelRequest withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * The certificate private key.
     * 
     * @param privateKey
     *        The certificate private key.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * The certificate private key.
     * 
     * @return The certificate private key.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * The certificate private key.
     * 
     * @param privateKey
     *        The certificate private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSChannelRequest withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append(getPrivateKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APNSChannelRequest == false)
            return false;
        APNSChannelRequest other = (APNSChannelRequest) obj;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        return hashCode;
    }

    @Override
    public APNSChannelRequest clone() {
        try {
            return (APNSChannelRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.APNSChannelRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
