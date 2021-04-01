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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration of the firewall behavior provided by DNS Firewall for a single Amazon virtual private cloud (VPC).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/FirewallConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Id of the firewall configuration.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the VPC that this firewall configuration applies to.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS Firewall
     * fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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
     * The Id of the firewall configuration.
     * </p>
     * 
     * @param id
     *        The Id of the firewall configuration.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The Id of the firewall configuration.
     * </p>
     * 
     * @return The Id of the firewall configuration.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The Id of the firewall configuration.
     * </p>
     * 
     * @param id
     *        The Id of the firewall configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallConfig withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC that this firewall configuration applies to.
     * </p>
     * 
     * @param resourceId
     *        The ID of the VPC that this firewall configuration applies to.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the VPC that this firewall configuration applies to.
     * </p>
     * 
     * @return The ID of the VPC that this firewall configuration applies to.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the VPC that this firewall configuration applies to.
     * </p>
     * 
     * @param resourceId
     *        The ID of the VPC that this firewall configuration applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallConfig withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     * </p>
     * 
     * @return The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the VPC that this firewall configuration applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallConfig withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS Firewall
     * fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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
     *        Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS
     *        Firewall fails to receive a reply. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *        over availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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
     * Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS Firewall
     * fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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
     * @return Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS
     *         Firewall fails to receive a reply. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *         over availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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
     * Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS Firewall
     * fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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
     *        Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS
     *        Firewall fails to receive a reply. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *        over availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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

    public FirewallConfig withFirewallFailOpen(String firewallFailOpen) {
        setFirewallFailOpen(firewallFailOpen);
        return this;
    }

    /**
     * <p>
     * Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS Firewall
     * fails to receive a reply.
     * </p>
     * <ul>
     * <li>
     * <p>
     * By default, fail open is disabled, which means the failure mode is closed. This approach favors security over
     * availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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
     *        Determines how DNS Firewall operates during failures, for example when all traffic that is sent to DNS
     *        Firewall fails to receive a reply. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        By default, fail open is disabled, which means the failure mode is closed. This approach favors security
     *        over availability. DNS Firewall returns a failure error when it is unable to properly evaluate a query.
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

    public FirewallConfig withFirewallFailOpen(FirewallFailOpenStatus firewallFailOpen) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
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

        if (obj instanceof FirewallConfig == false)
            return false;
        FirewallConfig other = (FirewallConfig) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getFirewallFailOpen() == null) ? 0 : getFirewallFailOpen().hashCode());
        return hashCode;
    }

    @Override
    public FirewallConfig clone() {
        try {
            return (FirewallConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53resolver.model.transform.FirewallConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
