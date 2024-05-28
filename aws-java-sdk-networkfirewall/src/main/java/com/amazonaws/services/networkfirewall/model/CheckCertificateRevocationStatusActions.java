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
 * Defines the actions to take on the SSL/TLS connection if the certificate presented by the server in the connection
 * has a revoked or unknown status.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CheckCertificateRevocationStatusActions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckCertificateRevocationStatusActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has a revoked status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     */
    private String revokedStatusAction;
    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any other reason,
     * including when the service is unable to connect to the OCSP and CRL endpoints for the certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     */
    private String unknownStatusAction;

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has a revoked status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param revokedStatusAction
     *        Configures how Network Firewall processes traffic when it determines that the certificate presented by the
     *        server in the SSL/TLS connection has a revoked status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *        inspection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *        connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP
     *        traffic.
     *        </p>
     *        </li>
     * @see RevocationCheckAction
     */

    public void setRevokedStatusAction(String revokedStatusAction) {
        this.revokedStatusAction = revokedStatusAction;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has a revoked status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Configures how Network Firewall processes traffic when it determines that the certificate presented by
     *         the server in the SSL/TLS connection has a revoked status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *         inspection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *         connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for
     *         TCP traffic.
     *         </p>
     *         </li>
     * @see RevocationCheckAction
     */

    public String getRevokedStatusAction() {
        return this.revokedStatusAction;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has a revoked status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param revokedStatusAction
     *        Configures how Network Firewall processes traffic when it determines that the certificate presented by the
     *        server in the SSL/TLS connection has a revoked status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *        inspection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *        connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP
     *        traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationCheckAction
     */

    public CheckCertificateRevocationStatusActions withRevokedStatusAction(String revokedStatusAction) {
        setRevokedStatusAction(revokedStatusAction);
        return this;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has a revoked status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param revokedStatusAction
     *        Configures how Network Firewall processes traffic when it determines that the certificate presented by the
     *        server in the SSL/TLS connection has a revoked status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *        inspection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *        connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP
     *        traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationCheckAction
     */

    public CheckCertificateRevocationStatusActions withRevokedStatusAction(RevocationCheckAction revokedStatusAction) {
        this.revokedStatusAction = revokedStatusAction.toString();
        return this;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any other reason,
     * including when the service is unable to connect to the OCSP and CRL endpoints for the certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param unknownStatusAction
     *        Configures how Network Firewall processes traffic when it determines that the certificate presented by the
     *        server in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any
     *        other reason, including when the service is unable to connect to the OCSP and CRL endpoints for the
     *        certificate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *        inspection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *        connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP
     *        traffic.
     *        </p>
     *        </li>
     * @see RevocationCheckAction
     */

    public void setUnknownStatusAction(String unknownStatusAction) {
        this.unknownStatusAction = unknownStatusAction;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any other reason,
     * including when the service is unable to connect to the OCSP and CRL endpoints for the certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Configures how Network Firewall processes traffic when it determines that the certificate presented by
     *         the server in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any
     *         other reason, including when the service is unable to connect to the OCSP and CRL endpoints for the
     *         certificate.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *         inspection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *         connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for
     *         TCP traffic.
     *         </p>
     *         </li>
     * @see RevocationCheckAction
     */

    public String getUnknownStatusAction() {
        return this.unknownStatusAction;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any other reason,
     * including when the service is unable to connect to the OCSP and CRL endpoints for the certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param unknownStatusAction
     *        Configures how Network Firewall processes traffic when it determines that the certificate presented by the
     *        server in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any
     *        other reason, including when the service is unable to connect to the OCSP and CRL endpoints for the
     *        certificate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *        inspection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *        connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP
     *        traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationCheckAction
     */

    public CheckCertificateRevocationStatusActions withUnknownStatusAction(String unknownStatusAction) {
        setUnknownStatusAction(unknownStatusAction);
        return this;
    }

    /**
     * <p>
     * Configures how Network Firewall processes traffic when it determines that the certificate presented by the server
     * in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any other reason,
     * including when the service is unable to connect to the OCSP and CRL endpoints for the certificate.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     * inspection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the connection
     * and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP traffic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param unknownStatusAction
     *        Configures how Network Firewall processes traffic when it determines that the certificate presented by the
     *        server in the SSL/TLS connection has an unknown status, or a status that cannot be determined for any
     *        other reason, including when the service is unable to connect to the OCSP and CRL endpoints for the
     *        certificate.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PASS</b> - Allow the connection to continue, and pass subsequent packets to the stateful engine for
     *        inspection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DROP</b> - Network Firewall closes the connection and drops subsequent packets for that connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>REJECT</b> - Network Firewall sends a TCP reject packet back to your client. The service closes the
     *        connection and drops subsequent packets for that connection. <code>REJECT</code> is available only for TCP
     *        traffic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationCheckAction
     */

    public CheckCertificateRevocationStatusActions withUnknownStatusAction(RevocationCheckAction unknownStatusAction) {
        this.unknownStatusAction = unknownStatusAction.toString();
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
        if (getRevokedStatusAction() != null)
            sb.append("RevokedStatusAction: ").append(getRevokedStatusAction()).append(",");
        if (getUnknownStatusAction() != null)
            sb.append("UnknownStatusAction: ").append(getUnknownStatusAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CheckCertificateRevocationStatusActions == false)
            return false;
        CheckCertificateRevocationStatusActions other = (CheckCertificateRevocationStatusActions) obj;
        if (other.getRevokedStatusAction() == null ^ this.getRevokedStatusAction() == null)
            return false;
        if (other.getRevokedStatusAction() != null && other.getRevokedStatusAction().equals(this.getRevokedStatusAction()) == false)
            return false;
        if (other.getUnknownStatusAction() == null ^ this.getUnknownStatusAction() == null)
            return false;
        if (other.getUnknownStatusAction() != null && other.getUnknownStatusAction().equals(this.getUnknownStatusAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevokedStatusAction() == null) ? 0 : getRevokedStatusAction().hashCode());
        hashCode = prime * hashCode + ((getUnknownStatusAction() == null) ? 0 : getUnknownStatusAction().hashCode());
        return hashCode;
    }

    @Override
    public CheckCertificateRevocationStatusActions clone() {
        try {
            return (CheckCertificateRevocationStatusActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.CheckCertificateRevocationStatusActionsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
