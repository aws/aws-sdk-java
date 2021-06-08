/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/GetFirewallConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFirewallConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC.
     * </p>
     */
    private FirewallConfig firewallConfig;

    /**
     * <p>
     * Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC.
     * </p>
     * 
     * @param firewallConfig
     *        Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC.
     */

    public void setFirewallConfig(FirewallConfig firewallConfig) {
        this.firewallConfig = firewallConfig;
    }

    /**
     * <p>
     * Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC.
     * </p>
     * 
     * @return Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC.
     */

    public FirewallConfig getFirewallConfig() {
        return this.firewallConfig;
    }

    /**
     * <p>
     * Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC.
     * </p>
     * 
     * @param firewallConfig
     *        Configuration of the firewall behavior provided by DNS Firewall for a single VPC from AmazonVPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFirewallConfigResult withFirewallConfig(FirewallConfig firewallConfig) {
        setFirewallConfig(firewallConfig);
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
        if (getFirewallConfig() != null)
            sb.append("FirewallConfig: ").append(getFirewallConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFirewallConfigResult == false)
            return false;
        GetFirewallConfigResult other = (GetFirewallConfigResult) obj;
        if (other.getFirewallConfig() == null ^ this.getFirewallConfig() == null)
            return false;
        if (other.getFirewallConfig() != null && other.getFirewallConfig().equals(this.getFirewallConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallConfig() == null) ? 0 : getFirewallConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetFirewallConfigResult clone() {
        try {
            return (GetFirewallConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
