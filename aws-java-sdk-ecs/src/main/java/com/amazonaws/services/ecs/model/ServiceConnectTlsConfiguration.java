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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the configuration for Service Connect TLS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceConnectTlsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConnectTlsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The signer certificate authority.
     * </p>
     */
    private ServiceConnectTlsCertificateAuthority issuerCertificateAuthority;
    /**
     * <p>
     * The Amazon Web Services Key Management Service key.
     * </p>
     */
    private String kmsKey;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect TLS.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The signer certificate authority.
     * </p>
     * 
     * @param issuerCertificateAuthority
     *        The signer certificate authority.
     */

    public void setIssuerCertificateAuthority(ServiceConnectTlsCertificateAuthority issuerCertificateAuthority) {
        this.issuerCertificateAuthority = issuerCertificateAuthority;
    }

    /**
     * <p>
     * The signer certificate authority.
     * </p>
     * 
     * @return The signer certificate authority.
     */

    public ServiceConnectTlsCertificateAuthority getIssuerCertificateAuthority() {
        return this.issuerCertificateAuthority;
    }

    /**
     * <p>
     * The signer certificate authority.
     * </p>
     * 
     * @param issuerCertificateAuthority
     *        The signer certificate authority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectTlsConfiguration withIssuerCertificateAuthority(ServiceConnectTlsCertificateAuthority issuerCertificateAuthority) {
        setIssuerCertificateAuthority(issuerCertificateAuthority);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service key.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service key.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectTlsConfiguration withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect TLS.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect TLS.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect TLS.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect TLS.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect TLS.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that's associated with the Service Connect TLS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectTlsConfiguration withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getIssuerCertificateAuthority() != null)
            sb.append("IssuerCertificateAuthority: ").append(getIssuerCertificateAuthority()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceConnectTlsConfiguration == false)
            return false;
        ServiceConnectTlsConfiguration other = (ServiceConnectTlsConfiguration) obj;
        if (other.getIssuerCertificateAuthority() == null ^ this.getIssuerCertificateAuthority() == null)
            return false;
        if (other.getIssuerCertificateAuthority() != null && other.getIssuerCertificateAuthority().equals(this.getIssuerCertificateAuthority()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuerCertificateAuthority() == null) ? 0 : getIssuerCertificateAuthority().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public ServiceConnectTlsConfiguration clone() {
        try {
            return (ServiceConnectTlsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceConnectTlsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
