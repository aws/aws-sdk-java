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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a firewall policy. A firewall policy defines the behavior of a network firewall.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsNetworkFirewallFirewallPolicyDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsNetworkFirewallFirewallPolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The firewall policy configuration.
     * </p>
     */
    private FirewallPolicyDetails firewallPolicy;
    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     */
    private String firewallPolicyArn;
    /**
     * <p>
     * The identifier of the firewall policy.
     * </p>
     */
    private String firewallPolicyId;
    /**
     * <p>
     * The name of the firewall policy.
     * </p>
     */
    private String firewallPolicyName;
    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The firewall policy configuration.
     * </p>
     * 
     * @param firewallPolicy
     *        The firewall policy configuration.
     */

    public void setFirewallPolicy(FirewallPolicyDetails firewallPolicy) {
        this.firewallPolicy = firewallPolicy;
    }

    /**
     * <p>
     * The firewall policy configuration.
     * </p>
     * 
     * @return The firewall policy configuration.
     */

    public FirewallPolicyDetails getFirewallPolicy() {
        return this.firewallPolicy;
    }

    /**
     * <p>
     * The firewall policy configuration.
     * </p>
     * 
     * @param firewallPolicy
     *        The firewall policy configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallPolicyDetails withFirewallPolicy(FirewallPolicyDetails firewallPolicy) {
        setFirewallPolicy(firewallPolicy);
        return this;
    }

    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The ARN of the firewall policy.
     */

    public void setFirewallPolicyArn(String firewallPolicyArn) {
        this.firewallPolicyArn = firewallPolicyArn;
    }

    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     * 
     * @return The ARN of the firewall policy.
     */

    public String getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    /**
     * <p>
     * The ARN of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyArn
     *        The ARN of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallPolicyDetails withFirewallPolicyArn(String firewallPolicyArn) {
        setFirewallPolicyArn(firewallPolicyArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyId
     *        The identifier of the firewall policy.
     */

    public void setFirewallPolicyId(String firewallPolicyId) {
        this.firewallPolicyId = firewallPolicyId;
    }

    /**
     * <p>
     * The identifier of the firewall policy.
     * </p>
     * 
     * @return The identifier of the firewall policy.
     */

    public String getFirewallPolicyId() {
        return this.firewallPolicyId;
    }

    /**
     * <p>
     * The identifier of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyId
     *        The identifier of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallPolicyDetails withFirewallPolicyId(String firewallPolicyId) {
        setFirewallPolicyId(firewallPolicyId);
        return this;
    }

    /**
     * <p>
     * The name of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyName
     *        The name of the firewall policy.
     */

    public void setFirewallPolicyName(String firewallPolicyName) {
        this.firewallPolicyName = firewallPolicyName;
    }

    /**
     * <p>
     * The name of the firewall policy.
     * </p>
     * 
     * @return The name of the firewall policy.
     */

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * <p>
     * The name of the firewall policy.
     * </p>
     * 
     * @param firewallPolicyName
     *        The name of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallPolicyDetails withFirewallPolicyName(String firewallPolicyName) {
        setFirewallPolicyName(firewallPolicyName);
        return this;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @return A description of the firewall policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsNetworkFirewallFirewallPolicyDetails withDescription(String description) {
        setDescription(description);
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
        if (getFirewallPolicy() != null)
            sb.append("FirewallPolicy: ").append(getFirewallPolicy()).append(",");
        if (getFirewallPolicyArn() != null)
            sb.append("FirewallPolicyArn: ").append(getFirewallPolicyArn()).append(",");
        if (getFirewallPolicyId() != null)
            sb.append("FirewallPolicyId: ").append(getFirewallPolicyId()).append(",");
        if (getFirewallPolicyName() != null)
            sb.append("FirewallPolicyName: ").append(getFirewallPolicyName()).append(",");
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

        if (obj instanceof AwsNetworkFirewallFirewallPolicyDetails == false)
            return false;
        AwsNetworkFirewallFirewallPolicyDetails other = (AwsNetworkFirewallFirewallPolicyDetails) obj;
        if (other.getFirewallPolicy() == null ^ this.getFirewallPolicy() == null)
            return false;
        if (other.getFirewallPolicy() != null && other.getFirewallPolicy().equals(this.getFirewallPolicy()) == false)
            return false;
        if (other.getFirewallPolicyArn() == null ^ this.getFirewallPolicyArn() == null)
            return false;
        if (other.getFirewallPolicyArn() != null && other.getFirewallPolicyArn().equals(this.getFirewallPolicyArn()) == false)
            return false;
        if (other.getFirewallPolicyId() == null ^ this.getFirewallPolicyId() == null)
            return false;
        if (other.getFirewallPolicyId() != null && other.getFirewallPolicyId().equals(this.getFirewallPolicyId()) == false)
            return false;
        if (other.getFirewallPolicyName() == null ^ this.getFirewallPolicyName() == null)
            return false;
        if (other.getFirewallPolicyName() != null && other.getFirewallPolicyName().equals(this.getFirewallPolicyName()) == false)
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

        hashCode = prime * hashCode + ((getFirewallPolicy() == null) ? 0 : getFirewallPolicy().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyArn() == null) ? 0 : getFirewallPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyId() == null) ? 0 : getFirewallPolicyId().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyName() == null) ? 0 : getFirewallPolicyName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public AwsNetworkFirewallFirewallPolicyDetails clone() {
        try {
            return (AwsNetworkFirewallFirewallPolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsNetworkFirewallFirewallPolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
