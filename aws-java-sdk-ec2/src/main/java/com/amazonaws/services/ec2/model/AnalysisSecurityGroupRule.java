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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a security group rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AnalysisSecurityGroupRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisSecurityGroupRule implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     */
    private String cidr;
    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     */
    private String direction;
    /**
     * <p>
     * The security group ID.
     * </p>
     */
    private String securityGroupId;
    /**
     * <p>
     * The port range.
     * </p>
     */
    private PortRange portRange;
    /**
     * <p>
     * The prefix list ID.
     * </p>
     */
    private String prefixListId;
    /**
     * <p>
     * The protocol name.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The IPv4 address range, in CIDR notation.
     */

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation.
     */

    public String getCidr() {
        return this.cidr;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation.
     * </p>
     * 
     * @param cidr
     *        The IPv4 address range, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSecurityGroupRule withCidr(String cidr) {
        setCidr(cidr);
        return this;
    }

    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        The direction. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        egress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ingress
     *        </p>
     *        </li>
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     * 
     * @return The direction. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         egress
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ingress
     *         </p>
     *         </li>
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The direction. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * egress
     * </p>
     * </li>
     * <li>
     * <p>
     * ingress
     * </p>
     * </li>
     * </ul>
     * 
     * @param direction
     *        The direction. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        egress
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ingress
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSecurityGroupRule withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @param securityGroupId
     *        The security group ID.
     */

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @return The security group ID.
     */

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * <p>
     * The security group ID.
     * </p>
     * 
     * @param securityGroupId
     *        The security group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSecurityGroupRule withSecurityGroupId(String securityGroupId) {
        setSecurityGroupId(securityGroupId);
        return this;
    }

    /**
     * <p>
     * The port range.
     * </p>
     * 
     * @param portRange
     *        The port range.
     */

    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * The port range.
     * </p>
     * 
     * @return The port range.
     */

    public PortRange getPortRange() {
        return this.portRange;
    }

    /**
     * <p>
     * The port range.
     * </p>
     * 
     * @param portRange
     *        The port range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSecurityGroupRule withPortRange(PortRange portRange) {
        setPortRange(portRange);
        return this;
    }

    /**
     * <p>
     * The prefix list ID.
     * </p>
     * 
     * @param prefixListId
     *        The prefix list ID.
     */

    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The prefix list ID.
     * </p>
     * 
     * @return The prefix list ID.
     */

    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * <p>
     * The prefix list ID.
     * </p>
     * 
     * @param prefixListId
     *        The prefix list ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSecurityGroupRule withPrefixListId(String prefixListId) {
        setPrefixListId(prefixListId);
        return this;
    }

    /**
     * <p>
     * The protocol name.
     * </p>
     * 
     * @param protocol
     *        The protocol name.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol name.
     * </p>
     * 
     * @return The protocol name.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol name.
     * </p>
     * 
     * @param protocol
     *        The protocol name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalysisSecurityGroupRule withProtocol(String protocol) {
        setProtocol(protocol);
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
        if (getCidr() != null)
            sb.append("Cidr: ").append(getCidr()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getSecurityGroupId() != null)
            sb.append("SecurityGroupId: ").append(getSecurityGroupId()).append(",");
        if (getPortRange() != null)
            sb.append("PortRange: ").append(getPortRange()).append(",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: ").append(getPrefixListId()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalysisSecurityGroupRule == false)
            return false;
        AnalysisSecurityGroupRule other = (AnalysisSecurityGroupRule) obj;
        if (other.getCidr() == null ^ this.getCidr() == null)
            return false;
        if (other.getCidr() != null && other.getCidr().equals(this.getCidr()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null)
            return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidr() == null) ? 0 : getCidr().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        hashCode = prime * hashCode + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public AnalysisSecurityGroupRule clone() {
        try {
            return (AnalysisSecurityGroupRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
