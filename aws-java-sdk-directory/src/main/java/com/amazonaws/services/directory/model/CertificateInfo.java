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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains general information about a certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/CertificateInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the certificate.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The common name for the certificate.
     * </p>
     */
    private String commonName;
    /**
     * <p>
     * The state of the certificate.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time when the certificate will expire.
     * </p>
     */
    private java.util.Date expiryDateTime;

    /**
     * <p>
     * The identifier of the certificate.
     * </p>
     * 
     * @param certificateId
     *        The identifier of the certificate.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The identifier of the certificate.
     * </p>
     * 
     * @return The identifier of the certificate.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The identifier of the certificate.
     * </p>
     * 
     * @param certificateId
     *        The identifier of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateInfo withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The common name for the certificate.
     * </p>
     * 
     * @param commonName
     *        The common name for the certificate.
     */

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    /**
     * <p>
     * The common name for the certificate.
     * </p>
     * 
     * @return The common name for the certificate.
     */

    public String getCommonName() {
        return this.commonName;
    }

    /**
     * <p>
     * The common name for the certificate.
     * </p>
     * 
     * @param commonName
     *        The common name for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateInfo withCommonName(String commonName) {
        setCommonName(commonName);
        return this;
    }

    /**
     * <p>
     * The state of the certificate.
     * </p>
     * 
     * @param state
     *        The state of the certificate.
     * @see CertificateState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the certificate.
     * </p>
     * 
     * @return The state of the certificate.
     * @see CertificateState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the certificate.
     * </p>
     * 
     * @param state
     *        The state of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateState
     */

    public CertificateInfo withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the certificate.
     * </p>
     * 
     * @param state
     *        The state of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateState
     */

    public CertificateInfo withState(CertificateState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the certificate will expire.
     * </p>
     * 
     * @param expiryDateTime
     *        The date and time when the certificate will expire.
     */

    public void setExpiryDateTime(java.util.Date expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    /**
     * <p>
     * The date and time when the certificate will expire.
     * </p>
     * 
     * @return The date and time when the certificate will expire.
     */

    public java.util.Date getExpiryDateTime() {
        return this.expiryDateTime;
    }

    /**
     * <p>
     * The date and time when the certificate will expire.
     * </p>
     * 
     * @param expiryDateTime
     *        The date and time when the certificate will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateInfo withExpiryDateTime(java.util.Date expiryDateTime) {
        setExpiryDateTime(expiryDateTime);
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
        if (getCertificateId() != null)
            sb.append("CertificateId: ").append(getCertificateId()).append(",");
        if (getCommonName() != null)
            sb.append("CommonName: ").append(getCommonName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getExpiryDateTime() != null)
            sb.append("ExpiryDateTime: ").append(getExpiryDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateInfo == false)
            return false;
        CertificateInfo other = (CertificateInfo) obj;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getCommonName() == null ^ this.getCommonName() == null)
            return false;
        if (other.getCommonName() != null && other.getCommonName().equals(this.getCommonName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getExpiryDateTime() == null ^ this.getExpiryDateTime() == null)
            return false;
        if (other.getExpiryDateTime() != null && other.getExpiryDateTime().equals(this.getExpiryDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateId() == null) ? 0 : getCertificateId().hashCode());
        hashCode = prime * hashCode + ((getCommonName() == null) ? 0 : getCommonName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getExpiryDateTime() == null) ? 0 : getExpiryDateTime().hashCode());
        return hashCode;
    }

    @Override
    public CertificateInfo clone() {
        try {
            return (CertificateInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.CertificateInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
