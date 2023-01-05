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
 * Contains the Network Firewall firewall policy options to configure the policy's deployment model and third-party
 * firewall policy settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PolicyOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy.
     * </p>
     */
    private NetworkFirewallPolicy networkFirewallPolicy;
    /**
     * <p>
     * Defines the policy options for a third-party firewall policy.
     * </p>
     */
    private ThirdPartyFirewallPolicy thirdPartyFirewallPolicy;

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy.
     * </p>
     * 
     * @param networkFirewallPolicy
     *        Defines the deployment model to use for the firewall policy.
     */

    public void setNetworkFirewallPolicy(NetworkFirewallPolicy networkFirewallPolicy) {
        this.networkFirewallPolicy = networkFirewallPolicy;
    }

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy.
     * </p>
     * 
     * @return Defines the deployment model to use for the firewall policy.
     */

    public NetworkFirewallPolicy getNetworkFirewallPolicy() {
        return this.networkFirewallPolicy;
    }

    /**
     * <p>
     * Defines the deployment model to use for the firewall policy.
     * </p>
     * 
     * @param networkFirewallPolicy
     *        Defines the deployment model to use for the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyOption withNetworkFirewallPolicy(NetworkFirewallPolicy networkFirewallPolicy) {
        setNetworkFirewallPolicy(networkFirewallPolicy);
        return this;
    }

    /**
     * <p>
     * Defines the policy options for a third-party firewall policy.
     * </p>
     * 
     * @param thirdPartyFirewallPolicy
     *        Defines the policy options for a third-party firewall policy.
     */

    public void setThirdPartyFirewallPolicy(ThirdPartyFirewallPolicy thirdPartyFirewallPolicy) {
        this.thirdPartyFirewallPolicy = thirdPartyFirewallPolicy;
    }

    /**
     * <p>
     * Defines the policy options for a third-party firewall policy.
     * </p>
     * 
     * @return Defines the policy options for a third-party firewall policy.
     */

    public ThirdPartyFirewallPolicy getThirdPartyFirewallPolicy() {
        return this.thirdPartyFirewallPolicy;
    }

    /**
     * <p>
     * Defines the policy options for a third-party firewall policy.
     * </p>
     * 
     * @param thirdPartyFirewallPolicy
     *        Defines the policy options for a third-party firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyOption withThirdPartyFirewallPolicy(ThirdPartyFirewallPolicy thirdPartyFirewallPolicy) {
        setThirdPartyFirewallPolicy(thirdPartyFirewallPolicy);
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
        if (getNetworkFirewallPolicy() != null)
            sb.append("NetworkFirewallPolicy: ").append(getNetworkFirewallPolicy()).append(",");
        if (getThirdPartyFirewallPolicy() != null)
            sb.append("ThirdPartyFirewallPolicy: ").append(getThirdPartyFirewallPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyOption == false)
            return false;
        PolicyOption other = (PolicyOption) obj;
        if (other.getNetworkFirewallPolicy() == null ^ this.getNetworkFirewallPolicy() == null)
            return false;
        if (other.getNetworkFirewallPolicy() != null && other.getNetworkFirewallPolicy().equals(this.getNetworkFirewallPolicy()) == false)
            return false;
        if (other.getThirdPartyFirewallPolicy() == null ^ this.getThirdPartyFirewallPolicy() == null)
            return false;
        if (other.getThirdPartyFirewallPolicy() != null && other.getThirdPartyFirewallPolicy().equals(this.getThirdPartyFirewallPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkFirewallPolicy() == null) ? 0 : getNetworkFirewallPolicy().hashCode());
        hashCode = prime * hashCode + ((getThirdPartyFirewallPolicy() == null) ? 0 : getThirdPartyFirewallPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PolicyOption clone() {
        try {
            return (PolicyOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.PolicyOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
