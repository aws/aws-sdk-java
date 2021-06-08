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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/DeleteFirewall" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Firewall firewall;

    private FirewallStatus firewallStatus;

    /**
     * @param firewall
     */

    public void setFirewall(Firewall firewall) {
        this.firewall = firewall;
    }

    /**
     * @return
     */

    public Firewall getFirewall() {
        return this.firewall;
    }

    /**
     * @param firewall
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallResult withFirewall(Firewall firewall) {
        setFirewall(firewall);
        return this;
    }

    /**
     * @param firewallStatus
     */

    public void setFirewallStatus(FirewallStatus firewallStatus) {
        this.firewallStatus = firewallStatus;
    }

    /**
     * @return
     */

    public FirewallStatus getFirewallStatus() {
        return this.firewallStatus;
    }

    /**
     * @param firewallStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFirewallResult withFirewallStatus(FirewallStatus firewallStatus) {
        setFirewallStatus(firewallStatus);
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
        if (getFirewall() != null)
            sb.append("Firewall: ").append(getFirewall()).append(",");
        if (getFirewallStatus() != null)
            sb.append("FirewallStatus: ").append(getFirewallStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFirewallResult == false)
            return false;
        DeleteFirewallResult other = (DeleteFirewallResult) obj;
        if (other.getFirewall() == null ^ this.getFirewall() == null)
            return false;
        if (other.getFirewall() != null && other.getFirewall().equals(this.getFirewall()) == false)
            return false;
        if (other.getFirewallStatus() == null ^ this.getFirewallStatus() == null)
            return false;
        if (other.getFirewallStatus() != null && other.getFirewallStatus().equals(this.getFirewallStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewall() == null) ? 0 : getFirewall().hashCode());
        hashCode = prime * hashCode + ((getFirewallStatus() == null) ? 0 : getFirewallStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFirewallResult clone() {
        try {
            return (DeleteFirewallResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
