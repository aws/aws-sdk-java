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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Any Certificate Manager (ACM) Secure Sockets Layer/Transport Layer Security (SSL/TLS) server certificate that's
 * associated with a <a>ServerCertificateConfiguration</a>. Used in a <a>TLSInspectionConfiguration</a> for inspection
 * of inbound traffic to your firewall. You must request or import a SSL/TLS certificate into ACM for each domain
 * Network Firewall needs to decrypt and inspect. Network Firewall uses the SSL/TLS certificates to decrypt specified
 * inbound SSL/TLS traffic going to your firewall. For information about working with certificates in Certificate
 * Manager, see <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html">Request a public
 * certificate </a> or <a href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing
 * certificates</a> in the <i>Certificate Manager User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ServerCertificate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate that's used for inbound
     * SSL/TLS inspection.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate that's used for inbound
     * SSL/TLS inspection.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate that's used for
     *        inbound SSL/TLS inspection.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate that's used for inbound
     * SSL/TLS inspection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate that's used for
     *         inbound SSL/TLS inspection.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate that's used for inbound
     * SSL/TLS inspection.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the Certificate Manager SSL/TLS server certificate that's used for
     *        inbound SSL/TLS inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificate withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificate == false)
            return false;
        ServerCertificate other = (ServerCertificate) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public ServerCertificate clone() {
        try {
            return (ServerCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.ServerCertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
