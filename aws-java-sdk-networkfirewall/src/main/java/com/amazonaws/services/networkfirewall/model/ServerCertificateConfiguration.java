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
 * Configures the Certificate Manager certificates and scope that Network Firewall uses to decrypt and re-encrypt
 * traffic using a <a>TLSInspectionConfiguration</a>. You can configure <code>ServerCertificates</code> for inbound
 * SSL/TLS inspection, a <code>CertificateAuthorityArn</code> for outbound SSL/TLS inspection, or both. For information
 * about working with certificates for TLS inspection, see <a href=
 * "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html">
 * Using SSL/TLS server certficiates with TLS inspection configurations</a> in the <i>Network Firewall Developer
 * Guide</i>.
 * </p>
 * <note>
 * <p>
 * If a server certificate that's associated with your <a>TLSInspectionConfiguration</a> is revoked, deleted, or expired
 * it can result in client-side TLS errors.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/ServerCertificateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerCertificateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of server certificates to use for inbound SSL/TLS inspection.
     * </p>
     */
    private java.util.List<ServerCertificate> serverCertificates;
    /**
     * <p>
     * A list of scopes.
     * </p>
     */
    private java.util.List<ServerCertificateScope> scopes;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within Certificate Manager
     * (ACM) to use for outbound SSL/TLS inspection.
     * </p>
     * <p>
     * The following limitations apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use CA certificates that you imported into ACM, but you can't generate CA certificates with ACM.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't use certificates issued by Private Certificate Authority.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring certificates for outbound inspection, see <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html"
     * >Using SSL/TLS certificates with certificates with TLS inspection configurations</a> in the <i>Network Firewall
     * Developer Guide</i>.
     * </p>
     * <p>
     * For information about working with certificates in ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * When enabled, Network Firewall checks if the server certificate presented by the server in the SSL/TLS connection
     * has a revoked or unkown status. If the certificate has an unknown or revoked status, you must specify the actions
     * that Network Firewall takes on outbound traffic. To check the certificate revocation status, you must also
     * specify a <code>CertificateAuthorityArn</code> in <a>ServerCertificateConfiguration</a>.
     * </p>
     */
    private CheckCertificateRevocationStatusActions checkCertificateRevocationStatus;

    /**
     * <p>
     * The list of server certificates to use for inbound SSL/TLS inspection.
     * </p>
     * 
     * @return The list of server certificates to use for inbound SSL/TLS inspection.
     */

    public java.util.List<ServerCertificate> getServerCertificates() {
        return serverCertificates;
    }

    /**
     * <p>
     * The list of server certificates to use for inbound SSL/TLS inspection.
     * </p>
     * 
     * @param serverCertificates
     *        The list of server certificates to use for inbound SSL/TLS inspection.
     */

    public void setServerCertificates(java.util.Collection<ServerCertificate> serverCertificates) {
        if (serverCertificates == null) {
            this.serverCertificates = null;
            return;
        }

        this.serverCertificates = new java.util.ArrayList<ServerCertificate>(serverCertificates);
    }

    /**
     * <p>
     * The list of server certificates to use for inbound SSL/TLS inspection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerCertificates(java.util.Collection)} or {@link #withServerCertificates(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serverCertificates
     *        The list of server certificates to use for inbound SSL/TLS inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withServerCertificates(ServerCertificate... serverCertificates) {
        if (this.serverCertificates == null) {
            setServerCertificates(new java.util.ArrayList<ServerCertificate>(serverCertificates.length));
        }
        for (ServerCertificate ele : serverCertificates) {
            this.serverCertificates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of server certificates to use for inbound SSL/TLS inspection.
     * </p>
     * 
     * @param serverCertificates
     *        The list of server certificates to use for inbound SSL/TLS inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withServerCertificates(java.util.Collection<ServerCertificate> serverCertificates) {
        setServerCertificates(serverCertificates);
        return this;
    }

    /**
     * <p>
     * A list of scopes.
     * </p>
     * 
     * @return A list of scopes.
     */

    public java.util.List<ServerCertificateScope> getScopes() {
        return scopes;
    }

    /**
     * <p>
     * A list of scopes.
     * </p>
     * 
     * @param scopes
     *        A list of scopes.
     */

    public void setScopes(java.util.Collection<ServerCertificateScope> scopes) {
        if (scopes == null) {
            this.scopes = null;
            return;
        }

        this.scopes = new java.util.ArrayList<ServerCertificateScope>(scopes);
    }

    /**
     * <p>
     * A list of scopes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScopes(java.util.Collection)} or {@link #withScopes(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scopes
     *        A list of scopes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withScopes(ServerCertificateScope... scopes) {
        if (this.scopes == null) {
            setScopes(new java.util.ArrayList<ServerCertificateScope>(scopes.length));
        }
        for (ServerCertificateScope ele : scopes) {
            this.scopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of scopes.
     * </p>
     * 
     * @param scopes
     *        A list of scopes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withScopes(java.util.Collection<ServerCertificateScope> scopes) {
        setScopes(scopes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within Certificate Manager
     * (ACM) to use for outbound SSL/TLS inspection.
     * </p>
     * <p>
     * The following limitations apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use CA certificates that you imported into ACM, but you can't generate CA certificates with ACM.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't use certificates issued by Private Certificate Authority.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring certificates for outbound inspection, see <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html"
     * >Using SSL/TLS certificates with certificates with TLS inspection configurations</a> in the <i>Network Firewall
     * Developer Guide</i>.
     * </p>
     * <p>
     * For information about working with certificates in ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within Certificate
     *        Manager (ACM) to use for outbound SSL/TLS inspection.</p>
     *        <p>
     *        The following limitations apply:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can use CA certificates that you imported into ACM, but you can't generate CA certificates with ACM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't use certificates issued by Private Certificate Authority.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about configuring certificates for outbound inspection, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html"
     *        >Using SSL/TLS certificates with certificates with TLS inspection configurations</a> in the <i>Network
     *        Firewall Developer Guide</i>.
     *        </p>
     *        <p>
     *        For information about working with certificates in ACM, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates</a>
     *        in the <i>Certificate Manager User Guide</i>.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within Certificate Manager
     * (ACM) to use for outbound SSL/TLS inspection.
     * </p>
     * <p>
     * The following limitations apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use CA certificates that you imported into ACM, but you can't generate CA certificates with ACM.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't use certificates issued by Private Certificate Authority.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring certificates for outbound inspection, see <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html"
     * >Using SSL/TLS certificates with certificates with TLS inspection configurations</a> in the <i>Network Firewall
     * Developer Guide</i>.
     * </p>
     * <p>
     * For information about working with certificates in ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within Certificate
     *         Manager (ACM) to use for outbound SSL/TLS inspection.</p>
     *         <p>
     *         The following limitations apply:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can use CA certificates that you imported into ACM, but you can't generate CA certificates with ACM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't use certificates issued by Private Certificate Authority.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about configuring certificates for outbound inspection, see <a href=
     *         "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html"
     *         >Using SSL/TLS certificates with certificates with TLS inspection configurations</a> in the <i>Network
     *         Firewall Developer Guide</i>.
     *         </p>
     *         <p>
     *         For information about working with certificates in ACM, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing
     *         certificates</a> in the <i>Certificate Manager User Guide</i>.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within Certificate Manager
     * (ACM) to use for outbound SSL/TLS inspection.
     * </p>
     * <p>
     * The following limitations apply:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use CA certificates that you imported into ACM, but you can't generate CA certificates with ACM.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't use certificates issued by Private Certificate Authority.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about configuring certificates for outbound inspection, see <a href=
     * "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html"
     * >Using SSL/TLS certificates with certificates with TLS inspection configurations</a> in the <i>Network Firewall
     * Developer Guide</i>.
     * </p>
     * <p>
     * For information about working with certificates in ACM, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within Certificate
     *        Manager (ACM) to use for outbound SSL/TLS inspection.</p>
     *        <p>
     *        The following limitations apply:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can use CA certificates that you imported into ACM, but you can't generate CA certificates with ACM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't use certificates issued by Private Certificate Authority.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about configuring certificates for outbound inspection, see <a href=
     *        "https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html"
     *        >Using SSL/TLS certificates with certificates with TLS inspection configurations</a> in the <i>Network
     *        Firewall Developer Guide</i>.
     *        </p>
     *        <p>
     *        For information about working with certificates in ACM, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing certificates</a>
     *        in the <i>Certificate Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * When enabled, Network Firewall checks if the server certificate presented by the server in the SSL/TLS connection
     * has a revoked or unkown status. If the certificate has an unknown or revoked status, you must specify the actions
     * that Network Firewall takes on outbound traffic. To check the certificate revocation status, you must also
     * specify a <code>CertificateAuthorityArn</code> in <a>ServerCertificateConfiguration</a>.
     * </p>
     * 
     * @param checkCertificateRevocationStatus
     *        When enabled, Network Firewall checks if the server certificate presented by the server in the SSL/TLS
     *        connection has a revoked or unkown status. If the certificate has an unknown or revoked status, you must
     *        specify the actions that Network Firewall takes on outbound traffic. To check the certificate revocation
     *        status, you must also specify a <code>CertificateAuthorityArn</code> in
     *        <a>ServerCertificateConfiguration</a>.
     */

    public void setCheckCertificateRevocationStatus(CheckCertificateRevocationStatusActions checkCertificateRevocationStatus) {
        this.checkCertificateRevocationStatus = checkCertificateRevocationStatus;
    }

    /**
     * <p>
     * When enabled, Network Firewall checks if the server certificate presented by the server in the SSL/TLS connection
     * has a revoked or unkown status. If the certificate has an unknown or revoked status, you must specify the actions
     * that Network Firewall takes on outbound traffic. To check the certificate revocation status, you must also
     * specify a <code>CertificateAuthorityArn</code> in <a>ServerCertificateConfiguration</a>.
     * </p>
     * 
     * @return When enabled, Network Firewall checks if the server certificate presented by the server in the SSL/TLS
     *         connection has a revoked or unkown status. If the certificate has an unknown or revoked status, you must
     *         specify the actions that Network Firewall takes on outbound traffic. To check the certificate revocation
     *         status, you must also specify a <code>CertificateAuthorityArn</code> in
     *         <a>ServerCertificateConfiguration</a>.
     */

    public CheckCertificateRevocationStatusActions getCheckCertificateRevocationStatus() {
        return this.checkCertificateRevocationStatus;
    }

    /**
     * <p>
     * When enabled, Network Firewall checks if the server certificate presented by the server in the SSL/TLS connection
     * has a revoked or unkown status. If the certificate has an unknown or revoked status, you must specify the actions
     * that Network Firewall takes on outbound traffic. To check the certificate revocation status, you must also
     * specify a <code>CertificateAuthorityArn</code> in <a>ServerCertificateConfiguration</a>.
     * </p>
     * 
     * @param checkCertificateRevocationStatus
     *        When enabled, Network Firewall checks if the server certificate presented by the server in the SSL/TLS
     *        connection has a revoked or unkown status. If the certificate has an unknown or revoked status, you must
     *        specify the actions that Network Firewall takes on outbound traffic. To check the certificate revocation
     *        status, you must also specify a <code>CertificateAuthorityArn</code> in
     *        <a>ServerCertificateConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerCertificateConfiguration withCheckCertificateRevocationStatus(CheckCertificateRevocationStatusActions checkCertificateRevocationStatus) {
        setCheckCertificateRevocationStatus(checkCertificateRevocationStatus);
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
        if (getServerCertificates() != null)
            sb.append("ServerCertificates: ").append(getServerCertificates()).append(",");
        if (getScopes() != null)
            sb.append("Scopes: ").append(getScopes()).append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getCheckCertificateRevocationStatus() != null)
            sb.append("CheckCertificateRevocationStatus: ").append(getCheckCertificateRevocationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerCertificateConfiguration == false)
            return false;
        ServerCertificateConfiguration other = (ServerCertificateConfiguration) obj;
        if (other.getServerCertificates() == null ^ this.getServerCertificates() == null)
            return false;
        if (other.getServerCertificates() != null && other.getServerCertificates().equals(this.getServerCertificates()) == false)
            return false;
        if (other.getScopes() == null ^ this.getScopes() == null)
            return false;
        if (other.getScopes() != null && other.getScopes().equals(this.getScopes()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getCheckCertificateRevocationStatus() == null ^ this.getCheckCertificateRevocationStatus() == null)
            return false;
        if (other.getCheckCertificateRevocationStatus() != null
                && other.getCheckCertificateRevocationStatus().equals(this.getCheckCertificateRevocationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerCertificates() == null) ? 0 : getServerCertificates().hashCode());
        hashCode = prime * hashCode + ((getScopes() == null) ? 0 : getScopes().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getCheckCertificateRevocationStatus() == null) ? 0 : getCheckCertificateRevocationStatus().hashCode());
        return hashCode;
    }

    @Override
    public ServerCertificateConfiguration clone() {
        try {
            return (ServerCertificateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.ServerCertificateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
