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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When the certificate is valid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateValidity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     */
    private java.util.Date notBefore;
    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     */
    private java.util.Date notAfter;

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @param notBefore
     *        The certificate is not valid before this date.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @return The certificate is not valid before this date.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The certificate is not valid before this date.
     * </p>
     * 
     * @param notBefore
     *        The certificate is not valid before this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateValidity withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @param notAfter
     *        The certificate is not valid after this date.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @return The certificate is not valid after this date.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The certificate is not valid after this date.
     * </p>
     * 
     * @param notAfter
     *        The certificate is not valid after this date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateValidity withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
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
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateValidity == false)
            return false;
        CertificateValidity other = (CertificateValidity) obj;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        return hashCode;
    }

    @Override
    public CertificateValidity clone() {
        try {
            return (CertificateValidity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CertificateValidityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
