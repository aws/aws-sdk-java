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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The certificate-based authentication properties used to authenticate SAML 2.0 Identity Provider (IdP) user identities
 * to Active Directory domain-joined streaming instances. Fallback is turned on by default when certificate-based
 * authentication is <b>Enabled</b> . Fallback allows users to log in using their AD domain password if
 * certificate-based authentication is unsuccessful, or to unlock a desktop lock screen.
 * <b>Enabled_no_directory_login_fallback</b> enables certificate-based authentication, but does not allow users to log
 * in using their AD domain password. Users will be disconnected to re-authenticate using certificates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CertificateBasedAuthProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateBasedAuthProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the certificate-based authentication properties.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ARN of the AWS Certificate Manager Private CA resource.
     * </p>
     */
    private String certificateAuthorityArn;

    /**
     * <p>
     * The status of the certificate-based authentication properties.
     * </p>
     * 
     * @param status
     *        The status of the certificate-based authentication properties.
     * @see CertificateBasedAuthStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the certificate-based authentication properties.
     * </p>
     * 
     * @return The status of the certificate-based authentication properties.
     * @see CertificateBasedAuthStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the certificate-based authentication properties.
     * </p>
     * 
     * @param status
     *        The status of the certificate-based authentication properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateBasedAuthStatus
     */

    public CertificateBasedAuthProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the certificate-based authentication properties.
     * </p>
     * 
     * @param status
     *        The status of the certificate-based authentication properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateBasedAuthStatus
     */

    public CertificateBasedAuthProperties withStatus(CertificateBasedAuthStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Certificate Manager Private CA resource.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The ARN of the AWS Certificate Manager Private CA resource.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the AWS Certificate Manager Private CA resource.
     * </p>
     * 
     * @return The ARN of the AWS Certificate Manager Private CA resource.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the AWS Certificate Manager Private CA resource.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The ARN of the AWS Certificate Manager Private CA resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateBasedAuthProperties withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateBasedAuthProperties == false)
            return false;
        CertificateBasedAuthProperties other = (CertificateBasedAuthProperties) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        return hashCode;
    }

    @Override
    public CertificateBasedAuthProperties clone() {
        try {
            return (CertificateBasedAuthProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.CertificateBasedAuthPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
