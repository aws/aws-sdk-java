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
 * Configures the third-party firewall's firewall policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ThirdPartyFirewallFirewallPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThirdPartyFirewallFirewallPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the specified firewall policy.
     * </p>
     */
    private String firewallPolicyId;
    /**
     * <p>
     * The name of the specified firewall policy.
     * </p>
     */
    private String firewallPolicyName;

    /**
     * <p>
     * The ID of the specified firewall policy.
     * </p>
     * 
     * @param firewallPolicyId
     *        The ID of the specified firewall policy.
     */

    public void setFirewallPolicyId(String firewallPolicyId) {
        this.firewallPolicyId = firewallPolicyId;
    }

    /**
     * <p>
     * The ID of the specified firewall policy.
     * </p>
     * 
     * @return The ID of the specified firewall policy.
     */

    public String getFirewallPolicyId() {
        return this.firewallPolicyId;
    }

    /**
     * <p>
     * The ID of the specified firewall policy.
     * </p>
     * 
     * @param firewallPolicyId
     *        The ID of the specified firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyFirewallFirewallPolicy withFirewallPolicyId(String firewallPolicyId) {
        setFirewallPolicyId(firewallPolicyId);
        return this;
    }

    /**
     * <p>
     * The name of the specified firewall policy.
     * </p>
     * 
     * @param firewallPolicyName
     *        The name of the specified firewall policy.
     */

    public void setFirewallPolicyName(String firewallPolicyName) {
        this.firewallPolicyName = firewallPolicyName;
    }

    /**
     * <p>
     * The name of the specified firewall policy.
     * </p>
     * 
     * @return The name of the specified firewall policy.
     */

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * <p>
     * The name of the specified firewall policy.
     * </p>
     * 
     * @param firewallPolicyName
     *        The name of the specified firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThirdPartyFirewallFirewallPolicy withFirewallPolicyName(String firewallPolicyName) {
        setFirewallPolicyName(firewallPolicyName);
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
        if (getFirewallPolicyId() != null)
            sb.append("FirewallPolicyId: ").append(getFirewallPolicyId()).append(",");
        if (getFirewallPolicyName() != null)
            sb.append("FirewallPolicyName: ").append(getFirewallPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThirdPartyFirewallFirewallPolicy == false)
            return false;
        ThirdPartyFirewallFirewallPolicy other = (ThirdPartyFirewallFirewallPolicy) obj;
        if (other.getFirewallPolicyId() == null ^ this.getFirewallPolicyId() == null)
            return false;
        if (other.getFirewallPolicyId() != null && other.getFirewallPolicyId().equals(this.getFirewallPolicyId()) == false)
            return false;
        if (other.getFirewallPolicyName() == null ^ this.getFirewallPolicyName() == null)
            return false;
        if (other.getFirewallPolicyName() != null && other.getFirewallPolicyName().equals(this.getFirewallPolicyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallPolicyId() == null) ? 0 : getFirewallPolicyId().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyName() == null) ? 0 : getFirewallPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public ThirdPartyFirewallFirewallPolicy clone() {
        try {
            return (ThirdPartyFirewallFirewallPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.ThirdPartyFirewallFirewallPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
