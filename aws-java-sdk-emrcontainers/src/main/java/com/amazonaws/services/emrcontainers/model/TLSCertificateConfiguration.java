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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configurations related to the TLS certificate for the security configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/TLSCertificateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TLSCertificateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * </p>
     */
    private String certificateProviderType;
    /**
     * <p>
     * Secrets Manager ARN that contains the public TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     */
    private String publicCertificateSecretArn;
    /**
     * <p>
     * Secrets Manager ARN that contains the private TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     */
    private String privateCertificateSecretArn;

    /**
     * <p>
     * The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * </p>
     * 
     * @param certificateProviderType
     *        The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * @see CertificateProviderType
     */

    public void setCertificateProviderType(String certificateProviderType) {
        this.certificateProviderType = certificateProviderType;
    }

    /**
     * <p>
     * The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * </p>
     * 
     * @return The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * @see CertificateProviderType
     */

    public String getCertificateProviderType() {
        return this.certificateProviderType;
    }

    /**
     * <p>
     * The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * </p>
     * 
     * @param certificateProviderType
     *        The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateProviderType
     */

    public TLSCertificateConfiguration withCertificateProviderType(String certificateProviderType) {
        setCertificateProviderType(certificateProviderType);
        return this;
    }

    /**
     * <p>
     * The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * </p>
     * 
     * @param certificateProviderType
     *        The TLS certificate type. Acceptable values: <code>PEM</code> or <code>Custom</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateProviderType
     */

    public TLSCertificateConfiguration withCertificateProviderType(CertificateProviderType certificateProviderType) {
        this.certificateProviderType = certificateProviderType.toString();
        return this;
    }

    /**
     * <p>
     * Secrets Manager ARN that contains the public TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     * 
     * @param publicCertificateSecretArn
     *        Secrets Manager ARN that contains the public TLS certificate contents, used for communication between the
     *        user job and the system job.
     */

    public void setPublicCertificateSecretArn(String publicCertificateSecretArn) {
        this.publicCertificateSecretArn = publicCertificateSecretArn;
    }

    /**
     * <p>
     * Secrets Manager ARN that contains the public TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     * 
     * @return Secrets Manager ARN that contains the public TLS certificate contents, used for communication between the
     *         user job and the system job.
     */

    public String getPublicCertificateSecretArn() {
        return this.publicCertificateSecretArn;
    }

    /**
     * <p>
     * Secrets Manager ARN that contains the public TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     * 
     * @param publicCertificateSecretArn
     *        Secrets Manager ARN that contains the public TLS certificate contents, used for communication between the
     *        user job and the system job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSCertificateConfiguration withPublicCertificateSecretArn(String publicCertificateSecretArn) {
        setPublicCertificateSecretArn(publicCertificateSecretArn);
        return this;
    }

    /**
     * <p>
     * Secrets Manager ARN that contains the private TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     * 
     * @param privateCertificateSecretArn
     *        Secrets Manager ARN that contains the private TLS certificate contents, used for communication between the
     *        user job and the system job.
     */

    public void setPrivateCertificateSecretArn(String privateCertificateSecretArn) {
        this.privateCertificateSecretArn = privateCertificateSecretArn;
    }

    /**
     * <p>
     * Secrets Manager ARN that contains the private TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     * 
     * @return Secrets Manager ARN that contains the private TLS certificate contents, used for communication between
     *         the user job and the system job.
     */

    public String getPrivateCertificateSecretArn() {
        return this.privateCertificateSecretArn;
    }

    /**
     * <p>
     * Secrets Manager ARN that contains the private TLS certificate contents, used for communication between the user
     * job and the system job.
     * </p>
     * 
     * @param privateCertificateSecretArn
     *        Secrets Manager ARN that contains the private TLS certificate contents, used for communication between the
     *        user job and the system job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSCertificateConfiguration withPrivateCertificateSecretArn(String privateCertificateSecretArn) {
        setPrivateCertificateSecretArn(privateCertificateSecretArn);
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
        if (getCertificateProviderType() != null)
            sb.append("CertificateProviderType: ").append(getCertificateProviderType()).append(",");
        if (getPublicCertificateSecretArn() != null)
            sb.append("PublicCertificateSecretArn: ").append(getPublicCertificateSecretArn()).append(",");
        if (getPrivateCertificateSecretArn() != null)
            sb.append("PrivateCertificateSecretArn: ").append(getPrivateCertificateSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TLSCertificateConfiguration == false)
            return false;
        TLSCertificateConfiguration other = (TLSCertificateConfiguration) obj;
        if (other.getCertificateProviderType() == null ^ this.getCertificateProviderType() == null)
            return false;
        if (other.getCertificateProviderType() != null && other.getCertificateProviderType().equals(this.getCertificateProviderType()) == false)
            return false;
        if (other.getPublicCertificateSecretArn() == null ^ this.getPublicCertificateSecretArn() == null)
            return false;
        if (other.getPublicCertificateSecretArn() != null && other.getPublicCertificateSecretArn().equals(this.getPublicCertificateSecretArn()) == false)
            return false;
        if (other.getPrivateCertificateSecretArn() == null ^ this.getPrivateCertificateSecretArn() == null)
            return false;
        if (other.getPrivateCertificateSecretArn() != null && other.getPrivateCertificateSecretArn().equals(this.getPrivateCertificateSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateProviderType() == null) ? 0 : getCertificateProviderType().hashCode());
        hashCode = prime * hashCode + ((getPublicCertificateSecretArn() == null) ? 0 : getPublicCertificateSecretArn().hashCode());
        hashCode = prime * hashCode + ((getPrivateCertificateSecretArn() == null) ? 0 : getPrivateCertificateSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public TLSCertificateConfiguration clone() {
        try {
            return (TLSCertificateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.TLSCertificateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
