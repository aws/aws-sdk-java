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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ImportClientVpnClientCertificateRevocationListRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportClientVpnClientCertificateRevocationListRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ImportClientVpnClientCertificateRevocationListRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client certificate revocation list applies.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     */
    private String certificateRevocationList;

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client certificate revocation list applies.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to which the client certificate revocation list applies.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client certificate revocation list applies.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint to which the client certificate revocation list applies.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to which the client certificate revocation list applies.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to which the client certificate revocation list applies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientVpnClientCertificateRevocationListRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     * 
     * @param certificateRevocationList
     *        The client certificate revocation list file. For more information, see <a href=
     *        "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     *        >Generate a Client Certificate Revocation List</a> in the <i>AWS Client VPN Administrator Guide</i>.
     */

    public void setCertificateRevocationList(String certificateRevocationList) {
        this.certificateRevocationList = certificateRevocationList;
    }

    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     * 
     * @return The client certificate revocation list file. For more information, see <a href=
     *         "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     *         >Generate a Client Certificate Revocation List</a> in the <i>AWS Client VPN Administrator Guide</i>.
     */

    public String getCertificateRevocationList() {
        return this.certificateRevocationList;
    }

    /**
     * <p>
     * The client certificate revocation list file. For more information, see <a href=
     * "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     * >Generate a Client Certificate Revocation List</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * </p>
     * 
     * @param certificateRevocationList
     *        The client certificate revocation list file. For more information, see <a href=
     *        "https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/cvpn-working-certificates.html#cvpn-working-certificates-generate"
     *        >Generate a Client Certificate Revocation List</a> in the <i>AWS Client VPN Administrator Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportClientVpnClientCertificateRevocationListRequest withCertificateRevocationList(String certificateRevocationList) {
        setCertificateRevocationList(certificateRevocationList);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ImportClientVpnClientCertificateRevocationListRequest> getDryRunRequest() {
        Request<ImportClientVpnClientCertificateRevocationListRequest> request = new ImportClientVpnClientCertificateRevocationListRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getCertificateRevocationList() != null)
            sb.append("CertificateRevocationList: ").append(getCertificateRevocationList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportClientVpnClientCertificateRevocationListRequest == false)
            return false;
        ImportClientVpnClientCertificateRevocationListRequest other = (ImportClientVpnClientCertificateRevocationListRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getCertificateRevocationList() == null ^ this.getCertificateRevocationList() == null)
            return false;
        if (other.getCertificateRevocationList() != null && other.getCertificateRevocationList().equals(this.getCertificateRevocationList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getCertificateRevocationList() == null) ? 0 : getCertificateRevocationList().hashCode());
        return hashCode;
    }

    @Override
    public ImportClientVpnClientCertificateRevocationListRequest clone() {
        return (ImportClientVpnClientCertificateRevocationListRequest) super.clone();
    }
}
