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
import com.amazonaws.services.ec2.model.transform.ModifyClientVpnEndpointRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyClientVpnEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyClientVpnEndpointRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     */
    private String serverCertificateArn;
    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     */
    private ConnectionLogOptions connectionLogOptions;
    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     */
    private DnsServersOptionsModifyStructure dnsServers;
    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to modify.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint to modify.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint to modify.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate to be used. The server certificate must be provisioned in AWS
     *        Certificate Manager (ACM).
     */

    public void setServerCertificateArn(String serverCertificateArn) {
        this.serverCertificateArn = serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     * 
     * @return The ARN of the server certificate to be used. The server certificate must be provisioned in AWS
     *         Certificate Manager (ACM).
     */

    public String getServerCertificateArn() {
        return this.serverCertificateArn;
    }

    /**
     * <p>
     * The ARN of the server certificate to be used. The server certificate must be provisioned in AWS Certificate
     * Manager (ACM).
     * </p>
     * 
     * @param serverCertificateArn
     *        The ARN of the server certificate to be used. The server certificate must be provisioned in AWS
     *        Certificate Manager (ACM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withServerCertificateArn(String serverCertificateArn) {
        setServerCertificateArn(serverCertificateArn);
        return this;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionLogOptions
     *        Information about the client connection logging options.</p>
     *        <p>
     *        If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log
     *        stream. The following information is logged:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection results (successful and unsuccessful)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Reasons for unsuccessful client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection termination time
     *        </p>
     *        </li>
     */

    public void setConnectionLogOptions(ConnectionLogOptions connectionLogOptions) {
        this.connectionLogOptions = connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about the client connection logging options.</p>
     *         <p>
     *         If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log
     *         stream. The following information is logged:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Client connection requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Client connection results (successful and unsuccessful)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Reasons for unsuccessful client connection requests
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Client connection termination time
     *         </p>
     *         </li>
     */

    public ConnectionLogOptions getConnectionLogOptions() {
        return this.connectionLogOptions;
    }

    /**
     * <p>
     * Information about the client connection logging options.
     * </p>
     * <p>
     * If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream.
     * The following information is logged:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection results (successful and unsuccessful)
     * </p>
     * </li>
     * <li>
     * <p>
     * Reasons for unsuccessful client connection requests
     * </p>
     * </li>
     * <li>
     * <p>
     * Client connection termination time
     * </p>
     * </li>
     * </ul>
     * 
     * @param connectionLogOptions
     *        Information about the client connection logging options.</p>
     *        <p>
     *        If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log
     *        stream. The following information is logged:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection results (successful and unsuccessful)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Reasons for unsuccessful client connection requests
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Client connection termination time
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withConnectionLogOptions(ConnectionLogOptions connectionLogOptions) {
        setConnectionLogOptions(connectionLogOptions);
        return this;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up
     *        to two DNS servers.
     */

    public void setDnsServers(DnsServersOptionsModifyStructure dnsServers) {
        this.dnsServers = dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     * 
     * @return Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up
     *         to two DNS servers.
     */

    public DnsServersOptionsModifyStructure getDnsServers() {
        return this.dnsServers;
    }

    /**
     * <p>
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two
     * DNS servers.
     * </p>
     * 
     * @param dnsServers
     *        Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up
     *        to two DNS servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withDnsServers(DnsServersOptionsModifyStructure dnsServers) {
        setDnsServers(dnsServers);
        return this;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     * 
     * @param description
     *        A brief description of the Client VPN endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     * 
     * @return A brief description of the Client VPN endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A brief description of the Client VPN endpoint.
     * </p>
     * 
     * @param description
     *        A brief description of the Client VPN endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyClientVpnEndpointRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyClientVpnEndpointRequest> getDryRunRequest() {
        Request<ModifyClientVpnEndpointRequest> request = new ModifyClientVpnEndpointRequestMarshaller().marshall(this);
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
        if (getServerCertificateArn() != null)
            sb.append("ServerCertificateArn: ").append(getServerCertificateArn()).append(",");
        if (getConnectionLogOptions() != null)
            sb.append("ConnectionLogOptions: ").append(getConnectionLogOptions()).append(",");
        if (getDnsServers() != null)
            sb.append("DnsServers: ").append(getDnsServers()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClientVpnEndpointRequest == false)
            return false;
        ModifyClientVpnEndpointRequest other = (ModifyClientVpnEndpointRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getServerCertificateArn() == null ^ this.getServerCertificateArn() == null)
            return false;
        if (other.getServerCertificateArn() != null && other.getServerCertificateArn().equals(this.getServerCertificateArn()) == false)
            return false;
        if (other.getConnectionLogOptions() == null ^ this.getConnectionLogOptions() == null)
            return false;
        if (other.getConnectionLogOptions() != null && other.getConnectionLogOptions().equals(this.getConnectionLogOptions()) == false)
            return false;
        if (other.getDnsServers() == null ^ this.getDnsServers() == null)
            return false;
        if (other.getDnsServers() != null && other.getDnsServers().equals(this.getDnsServers()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getServerCertificateArn() == null) ? 0 : getServerCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getConnectionLogOptions() == null) ? 0 : getConnectionLogOptions().hashCode());
        hashCode = prime * hashCode + ((getDnsServers() == null) ? 0 : getDnsServers().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public ModifyClientVpnEndpointRequest clone() {
        return (ModifyClientVpnEndpointRequest) super.clone();
    }
}
