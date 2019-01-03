/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The tunnel options for a VPN connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpnTunnelOptionsSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpnTunnelOptionsSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     */
    private String tunnelInsideCidr;
    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters in length
     * and cannot start with zero (0).
     * </p>
     */
    private String preSharedKey;

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tunnelInsideCidr
     *        The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     *        connections that use the same virtual private gateway. </p>
     *        <p>
     *        Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks
     *        are reserved and cannot be used:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>169.254.0.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.1.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.2.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.3.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.4.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.5.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.169.252/30</code>
     *        </p>
     *        </li>
     */

    public void setTunnelInsideCidr(String tunnelInsideCidr) {
        this.tunnelInsideCidr = tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     *         connections that use the same virtual private gateway. </p>
     *         <p>
     *         Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks
     *         are reserved and cannot be used:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>169.254.0.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.1.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.2.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.3.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.4.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.5.0/30</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>169.254.169.252/30</code>
     *         </p>
     *         </li>
     */

    public String getTunnelInsideCidr() {
        return this.tunnelInsideCidr;
    }

    /**
     * <p>
     * The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     * connections that use the same virtual private gateway.
     * </p>
     * <p>
     * Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks are
     * reserved and cannot be used:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>169.254.0.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.1.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.2.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.3.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.4.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.5.0/30</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>169.254.169.252/30</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param tunnelInsideCidr
     *        The range of inside IP addresses for the tunnel. Any specified CIDR blocks must be unique across all VPN
     *        connections that use the same virtual private gateway. </p>
     *        <p>
     *        Constraints: A size /30 CIDR block from the <code>169.254.0.0/16</code> range. The following CIDR blocks
     *        are reserved and cannot be used:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>169.254.0.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.1.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.2.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.3.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.4.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.5.0/30</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>169.254.169.252/30</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnTunnelOptionsSpecification withTunnelInsideCidr(String tunnelInsideCidr) {
        setTunnelInsideCidr(tunnelInsideCidr);
        return this;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters in length
     * and cannot start with zero (0).
     * </p>
     * 
     * @param preSharedKey
     *        The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and
     *        customer gateway.</p>
     *        <p>
     *        Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters in
     *        length and cannot start with zero (0).
     */

    public void setPreSharedKey(String preSharedKey) {
        this.preSharedKey = preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters in length
     * and cannot start with zero (0).
     * </p>
     * 
     * @return The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and
     *         customer gateway.</p>
     *         <p>
     *         Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters
     *         in length and cannot start with zero (0).
     */

    public String getPreSharedKey() {
        return this.preSharedKey;
    }

    /**
     * <p>
     * The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and customer
     * gateway.
     * </p>
     * <p>
     * Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters in length
     * and cannot start with zero (0).
     * </p>
     * 
     * @param preSharedKey
     *        The pre-shared key (PSK) to establish initial authentication between the virtual private gateway and
     *        customer gateway.</p>
     *        <p>
     *        Constraints: Allowed characters are alphanumeric characters and ._. Must be between 8 and 64 characters in
     *        length and cannot start with zero (0).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpnTunnelOptionsSpecification withPreSharedKey(String preSharedKey) {
        setPreSharedKey(preSharedKey);
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
        if (getTunnelInsideCidr() != null)
            sb.append("TunnelInsideCidr: ").append(getTunnelInsideCidr()).append(",");
        if (getPreSharedKey() != null)
            sb.append("PreSharedKey: ").append(getPreSharedKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpnTunnelOptionsSpecification == false)
            return false;
        VpnTunnelOptionsSpecification other = (VpnTunnelOptionsSpecification) obj;
        if (other.getTunnelInsideCidr() == null ^ this.getTunnelInsideCidr() == null)
            return false;
        if (other.getTunnelInsideCidr() != null && other.getTunnelInsideCidr().equals(this.getTunnelInsideCidr()) == false)
            return false;
        if (other.getPreSharedKey() == null ^ this.getPreSharedKey() == null)
            return false;
        if (other.getPreSharedKey() != null && other.getPreSharedKey().equals(this.getPreSharedKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTunnelInsideCidr() == null) ? 0 : getTunnelInsideCidr().hashCode());
        hashCode = prime * hashCode + ((getPreSharedKey() == null) ? 0 : getPreSharedKey().hashCode());
        return hashCode;
    }

    @Override
    public VpnTunnelOptionsSpecification clone() {
        try {
            return (VpnTunnelOptionsSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
