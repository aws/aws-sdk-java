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
 * The object that defines a TLS inspection configuration. This, along with <a>TLSInspectionConfigurationResponse</a>,
 * define the TLS inspection configuration. You can retrieve all objects for a TLS inspection configuration by calling
 * <a>DescribeTLSInspectionConfiguration</a>.
 * </p>
 * <p>
 * Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall re-encrypts the traffic
 * before sending it to its destination.
 * </p>
 * <p>
 * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then you apply the
 * firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and inspect the traffic traveling
 * through your firewalls. You can reference a TLS inspection configuration from more than one firewall policy, and you
 * can use a firewall policy in more than one firewall. For more information about using TLS inspection configurations,
 * see <a href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html">Inspecting
 * SSL/TLS traffic with TLS inspection configurations</a> in the <i>Network Firewall Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/TLSInspectionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TLSInspectionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Lists the server certificate configurations that are associated with the TLS configuration.
     * </p>
     */
    private java.util.List<ServerCertificateConfiguration> serverCertificateConfigurations;

    /**
     * <p>
     * Lists the server certificate configurations that are associated with the TLS configuration.
     * </p>
     * 
     * @return Lists the server certificate configurations that are associated with the TLS configuration.
     */

    public java.util.List<ServerCertificateConfiguration> getServerCertificateConfigurations() {
        return serverCertificateConfigurations;
    }

    /**
     * <p>
     * Lists the server certificate configurations that are associated with the TLS configuration.
     * </p>
     * 
     * @param serverCertificateConfigurations
     *        Lists the server certificate configurations that are associated with the TLS configuration.
     */

    public void setServerCertificateConfigurations(java.util.Collection<ServerCertificateConfiguration> serverCertificateConfigurations) {
        if (serverCertificateConfigurations == null) {
            this.serverCertificateConfigurations = null;
            return;
        }

        this.serverCertificateConfigurations = new java.util.ArrayList<ServerCertificateConfiguration>(serverCertificateConfigurations);
    }

    /**
     * <p>
     * Lists the server certificate configurations that are associated with the TLS configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerCertificateConfigurations(java.util.Collection)} or
     * {@link #withServerCertificateConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serverCertificateConfigurations
     *        Lists the server certificate configurations that are associated with the TLS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfiguration withServerCertificateConfigurations(ServerCertificateConfiguration... serverCertificateConfigurations) {
        if (this.serverCertificateConfigurations == null) {
            setServerCertificateConfigurations(new java.util.ArrayList<ServerCertificateConfiguration>(serverCertificateConfigurations.length));
        }
        for (ServerCertificateConfiguration ele : serverCertificateConfigurations) {
            this.serverCertificateConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the server certificate configurations that are associated with the TLS configuration.
     * </p>
     * 
     * @param serverCertificateConfigurations
     *        Lists the server certificate configurations that are associated with the TLS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TLSInspectionConfiguration withServerCertificateConfigurations(java.util.Collection<ServerCertificateConfiguration> serverCertificateConfigurations) {
        setServerCertificateConfigurations(serverCertificateConfigurations);
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
        if (getServerCertificateConfigurations() != null)
            sb.append("ServerCertificateConfigurations: ").append(getServerCertificateConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TLSInspectionConfiguration == false)
            return false;
        TLSInspectionConfiguration other = (TLSInspectionConfiguration) obj;
        if (other.getServerCertificateConfigurations() == null ^ this.getServerCertificateConfigurations() == null)
            return false;
        if (other.getServerCertificateConfigurations() != null
                && other.getServerCertificateConfigurations().equals(this.getServerCertificateConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerCertificateConfigurations() == null) ? 0 : getServerCertificateConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public TLSInspectionConfiguration clone() {
        try {
            return (TLSInspectionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.TLSInspectionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
