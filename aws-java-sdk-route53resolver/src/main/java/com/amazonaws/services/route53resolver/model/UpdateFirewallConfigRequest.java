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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/UpdateFirewallConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFirewallConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the VPC that the configuration is for.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to
     * DNS Firewall fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     * Firewall allows queries to proceed if it is unable to properly evaluate them.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * </p>
     */
    private String firewallFailOpen;

    /**
     * <p>
     * The ID of the VPC that the configuration is for.
     * </p>
     * 
     * @param resourceId
     *        The ID of the VPC that the configuration is for.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the VPC that the configuration is for.
     * </p>
     * 
     * @return The ID of the VPC that the configuration is for.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the VPC that the configuration is for.
     * </p>
     * 
     * @param resourceId
     *        The ID of the VPC that the configuration is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFirewallConfigRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to
     * DNS Firewall fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     * Firewall allows queries to proceed if it is unable to properly evaluate them.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * </p>
     * 
     * @param firewallFailOpen
     *        Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is
     *        sent to DNS Firewall fails to receive a reply. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *        over availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     *        Firewall allows queries to proceed if it is unable to properly evaluate them.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * @see FirewallFailOpenStatus
     */

    public void setFirewallFailOpen(String firewallFailOpen) {
        this.firewallFailOpen = firewallFailOpen;
    }

    /**
     * <p>
     * Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to
     * DNS Firewall fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     * Firewall allows queries to proceed if it is unable to properly evaluate them.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * </p>
     * 
     * @return Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is
     *         sent to DNS Firewall fails to receive a reply. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *         over availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     *         Firewall allows queries to proceed if it is unable to properly evaluate them.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * @see FirewallFailOpenStatus
     */

    public String getFirewallFailOpen() {
        return this.firewallFailOpen;
    }

    /**
     * <p>
     * Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to
     * DNS Firewall fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     * Firewall allows queries to proceed if it is unable to properly evaluate them.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * </p>
     * 
     * @param firewallFailOpen
     *        Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is
     *        sent to DNS Firewall fails to receive a reply. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *        over availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     *        Firewall allows queries to proceed if it is unable to properly evaluate them.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallFailOpenStatus
     */

    public UpdateFirewallConfigRequest withFirewallFailOpen(String firewallFailOpen) {
        setFirewallFailOpen(firewallFailOpen);
        return this;
    }

    /**
     * <p>
     * Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is sent to
     * DNS Firewall fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     * Firewall allows queries to proceed if it is unable to properly evaluate them.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * </p>
     * 
     * @param firewallFailOpen
     *        Determines how Route 53 Resolver handles queries during failures, for example when all traffic that is
     *        sent to DNS Firewall fails to receive a reply. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *        over availability. DNS Firewall blocks queries that it is unable to evaluate properly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you enable this option, the failure mode is open. This approach favors availability over security. DNS
     *        Firewall allows queries to proceed if it is unable to properly evaluate them.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        This behavior is only enforced for VPCs that have at least one DNS Firewall rule group association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallFailOpenStatus
     */

    public UpdateFirewallConfigRequest withFirewallFailOpen(FirewallFailOpenStatus firewallFailOpen) {
        this.firewallFailOpen = firewallFailOpen.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getFirewallFailOpen() != null)
            sb.append("FirewallFailOpen: ").append(getFirewallFailOpen());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFirewallConfigRequest == false)
            return false;
        UpdateFirewallConfigRequest other = (UpdateFirewallConfigRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getFirewallFailOpen() == null ^ this.getFirewallFailOpen() == null)
            return false;
        if (other.getFirewallFailOpen() != null && other.getFirewallFailOpen().equals(this.getFirewallFailOpen()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getFirewallFailOpen() == null) ? 0 : getFirewallFailOpen().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFirewallConfigRequest clone() {
        return (UpdateFirewallConfigRequest) super.clone();
    }

}
