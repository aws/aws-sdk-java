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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the properties of the certificate-based authentication you want to use with your WorkSpaces.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CertificateBasedAuthProperties"
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
     * The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
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
     * @see CertificateBasedAuthStatusEnum
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
     * @see CertificateBasedAuthStatusEnum
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
     * @see CertificateBasedAuthStatusEnum
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
     * @see CertificateBasedAuthStatusEnum
     */

    public CertificateBasedAuthProperties withStatus(CertificateBasedAuthStatusEnum status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the Amazon Web Services Certificate Manager Private CA resource.
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
        com.amazonaws.services.workspaces.model.transform.CertificateBasedAuthPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
