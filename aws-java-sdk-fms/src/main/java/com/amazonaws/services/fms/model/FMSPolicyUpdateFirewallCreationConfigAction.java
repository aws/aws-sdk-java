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
 * Contains information about the actions that you can take to remediate scope violations caused by your policy's
 * <code>FirewallCreationConfig</code>. <code>FirewallCreationConfig</code> is an optional configuration that you can
 * use to choose which Availability Zones Firewall Manager creates Network Firewall endpoints in.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/FMSPolicyUpdateFirewallCreationConfigAction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FMSPolicyUpdateFirewallCreationConfigAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the remedial action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A <code>FirewallCreationConfig</code> that you can copy into your current policy's <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html"
     * >SecurityServiceData</a> in order to remedy scope violations.
     * </p>
     */
    private String firewallCreationConfig;

    /**
     * <p>
     * Describes the remedial action.
     * </p>
     * 
     * @param description
     *        Describes the remedial action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes the remedial action.
     * </p>
     * 
     * @return Describes the remedial action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes the remedial action.
     * </p>
     * 
     * @param description
     *        Describes the remedial action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FMSPolicyUpdateFirewallCreationConfigAction withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A <code>FirewallCreationConfig</code> that you can copy into your current policy's <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html"
     * >SecurityServiceData</a> in order to remedy scope violations.
     * </p>
     * 
     * @param firewallCreationConfig
     *        A <code>FirewallCreationConfig</code> that you can copy into your current policy's <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html"
     *        >SecurityServiceData</a> in order to remedy scope violations.
     */

    public void setFirewallCreationConfig(String firewallCreationConfig) {
        this.firewallCreationConfig = firewallCreationConfig;
    }

    /**
     * <p>
     * A <code>FirewallCreationConfig</code> that you can copy into your current policy's <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html"
     * >SecurityServiceData</a> in order to remedy scope violations.
     * </p>
     * 
     * @return A <code>FirewallCreationConfig</code> that you can copy into your current policy's <a
     *         href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html"
     *         >SecurityServiceData</a> in order to remedy scope violations.
     */

    public String getFirewallCreationConfig() {
        return this.firewallCreationConfig;
    }

    /**
     * <p>
     * A <code>FirewallCreationConfig</code> that you can copy into your current policy's <a
     * href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html"
     * >SecurityServiceData</a> in order to remedy scope violations.
     * </p>
     * 
     * @param firewallCreationConfig
     *        A <code>FirewallCreationConfig</code> that you can copy into your current policy's <a
     *        href="https://docs.aws.amazon.com/fms/2018-01-01/APIReference/API_SecurityServicePolicyData.html"
     *        >SecurityServiceData</a> in order to remedy scope violations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FMSPolicyUpdateFirewallCreationConfigAction withFirewallCreationConfig(String firewallCreationConfig) {
        setFirewallCreationConfig(firewallCreationConfig);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFirewallCreationConfig() != null)
            sb.append("FirewallCreationConfig: ").append(getFirewallCreationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FMSPolicyUpdateFirewallCreationConfigAction == false)
            return false;
        FMSPolicyUpdateFirewallCreationConfigAction other = (FMSPolicyUpdateFirewallCreationConfigAction) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFirewallCreationConfig() == null ^ this.getFirewallCreationConfig() == null)
            return false;
        if (other.getFirewallCreationConfig() != null && other.getFirewallCreationConfig().equals(this.getFirewallCreationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFirewallCreationConfig() == null) ? 0 : getFirewallCreationConfig().hashCode());
        return hashCode;
    }

    @Override
    public FMSPolicyUpdateFirewallCreationConfigAction clone() {
        try {
            return (FMSPolicyUpdateFirewallCreationConfigAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fms.model.transform.FMSPolicyUpdateFirewallCreationConfigActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
