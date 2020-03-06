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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents an AWS Certicate Manager (ACM) certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/ListenerTlsAcmCertificate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListenerTlsAcmCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must
     * have proxy authorization enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     */
    private String certificateArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must
     * have proxy authorization enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and
     *        you must have proxy authorization enabled. For more information, see <a href=
     *        "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
     *        >Transport Layer Security (TLS)</a>.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must
     * have proxy authorization enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and
     *         you must have proxy authorization enabled. For more information, see <a href=
     *         "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
     *         >Transport Layer Security (TLS)</a>.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and you must
     * have proxy authorization enabled. For more information, see <a href=
     * "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
     * >Transport Layer Security (TLS)</a>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) for the certificate. The certificate must meet specific requirements and
     *        you must have proxy authorization enabled. For more information, see <a href=
     *        "https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual-node-tls.html#virtual-node-tls-prerequisites"
     *        >Transport Layer Security (TLS)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerTlsAcmCertificate withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerTlsAcmCertificate == false)
            return false;
        ListenerTlsAcmCertificate other = (ListenerTlsAcmCertificate) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public ListenerTlsAcmCertificate clone() {
        try {
            return (ListenerTlsAcmCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.ListenerTlsAcmCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
