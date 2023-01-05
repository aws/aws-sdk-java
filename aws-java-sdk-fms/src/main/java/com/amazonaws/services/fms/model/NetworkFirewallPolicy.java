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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures the firewall policy deployment model of Network Firewall. For information about Network Firewall
 * deployment models, see <a
 * href="https://docs.aws.amazon.com/network-firewall/latest/developerguide/architectures.html">Network Firewall example
 * architectures with routing</a> in the <i>Network Firewall Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/NetworkFirewallPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkFirewallPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     */
    private String firewallDeploymentModel;

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * 
     * @param firewallDeploymentModel
     *        Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     * @see FirewallDeploymentModel
     */

    public void setFirewallDeploymentModel(String firewallDeploymentModel) {
        this.firewallDeploymentModel = firewallDeploymentModel;
    }

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * 
     * @return Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     *         href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *         <code>NULL</code>.
     * @see FirewallDeploymentModel
     */

    public String getFirewallDeploymentModel() {
        return this.firewallDeploymentModel;
    }

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * 
     * @param firewallDeploymentModel
     *        Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDeploymentModel
     */

    public NetworkFirewallPolicy withFirewallDeploymentModel(String firewallDeploymentModel) {
        setFirewallDeploymentModel(firewallDeploymentModel);
        return this;
    }

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     * <code>NULL</code>.
     * </p>
     * 
     * @param firewallDeploymentModel
     *        Defines the deployment model to use for the firewall policy. To use a distributed model, set <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_PolicyOption.html">PolicyOption</a> to
     *        <code>NULL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallDeploymentModel
     */

    public NetworkFirewallPolicy withFirewallDeploymentModel(FirewallDeploymentModel firewallDeploymentModel) {
        this.firewallDeploymentModel = firewallDeploymentModel.toString();
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
        if (getFirewallDeploymentModel() != null)
            sb.append("FirewallDeploymentModel: ").append(getFirewallDeploymentModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkFirewallPolicy == false)
            return false;
        NetworkFirewallPolicy other = (NetworkFirewallPolicy) obj;
        if (other.getFirewallDeploymentModel() == null ^ this.getFirewallDeploymentModel() == null)
            return false;
        if (other.getFirewallDeploymentModel() != null && other.getFirewallDeploymentModel().equals(this.getFirewallDeploymentModel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallDeploymentModel() == null) ? 0 : getFirewallDeploymentModel().hashCode());
        return hashCode;
    }

    @Override
    public NetworkFirewallPolicy clone() {
        try {
            return (NetworkFirewallPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.NetworkFirewallPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
