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
 * Describes a stale rule in a security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StaleIpPermission" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaleIpPermission implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     */
    private Integer fromPort;
    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers)</a>.
     * </p>
     */
    private String ipProtocol;
    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ipRanges;
    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> prefixListIds;
    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     */
    private Integer toPort;
    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the
     * VPC peering connection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UserIdGroupPair> userIdGroupPairs;

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     * 
     * @param fromPort
     *        The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of
     *        <code>-1</code> indicates all ICMP types.
     */

    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     * 
     * @return The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of
     *         <code>-1</code> indicates all ICMP types.
     */

    public Integer getFromPort() {
        return this.fromPort;
    }

    /**
     * <p>
     * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     * 
     * @param fromPort
     *        The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of
     *        <code>-1</code> indicates all ICMP types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withFromPort(Integer fromPort) {
        setFromPort(fromPort);
        return this;
    }

    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers)</a>.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (for <code>tcp</code>, <code>udp</code>, and <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers)</a>.
     */

    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers)</a>.
     * </p>
     * 
     * @return The IP protocol name (for <code>tcp</code>, <code>udp</code>, and <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers)</a>.
     */

    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * <p>
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers)</a>.
     * </p>
     * 
     * @param ipProtocol
     *        The IP protocol name (for <code>tcp</code>, <code>udp</code>, and <code>icmp</code>) or number (see <a
     *        href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol Numbers)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withIpProtocol(String ipProtocol) {
        setIpProtocol(ipProtocol);
        return this;
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     * 
     * @return The IP ranges. Not applicable for stale security group rules.
     */

    public java.util.List<String> getIpRanges() {
        if (ipRanges == null) {
            ipRanges = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ipRanges;
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     * 
     * @param ipRanges
     *        The IP ranges. Not applicable for stale security group rules.
     */

    public void setIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }

        this.ipRanges = new com.amazonaws.internal.SdkInternalList<String>(ipRanges);
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpRanges(java.util.Collection)} or {@link #withIpRanges(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ipRanges
     *        The IP ranges. Not applicable for stale security group rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withIpRanges(String... ipRanges) {
        if (this.ipRanges == null) {
            setIpRanges(new com.amazonaws.internal.SdkInternalList<String>(ipRanges.length));
        }
        for (String ele : ipRanges) {
            this.ipRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP ranges. Not applicable for stale security group rules.
     * </p>
     * 
     * @param ipRanges
     *        The IP ranges. Not applicable for stale security group rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withIpRanges(java.util.Collection<String> ipRanges) {
        setIpRanges(ipRanges);
        return this;
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     * </p>
     * 
     * @return The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     */

    public java.util.List<String> getPrefixListIds() {
        if (prefixListIds == null) {
            prefixListIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return prefixListIds;
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     * </p>
     * 
     * @param prefixListIds
     *        The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     */

    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new com.amazonaws.internal.SdkInternalList<String>(prefixListIds);
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrefixListIds(java.util.Collection)} or {@link #withPrefixListIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param prefixListIds
     *        The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withPrefixListIds(String... prefixListIds) {
        if (this.prefixListIds == null) {
            setPrefixListIds(new com.amazonaws.internal.SdkInternalList<String>(prefixListIds.length));
        }
        for (String ele : prefixListIds) {
            this.prefixListIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     * </p>
     * 
     * @param prefixListIds
     *        The prefix list IDs for an AWS service. Not applicable for stale security group rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withPrefixListIds(java.util.Collection<String> prefixListIds) {
        setPrefixListIds(prefixListIds);
        return this;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     * 
     * @param toPort
     *        The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of
     *        <code>-1</code> indicates all ICMP types.
     */

    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     * 
     * @return The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of
     *         <code>-1</code> indicates all ICMP types.
     */

    public Integer getToPort() {
        return this.toPort;
    }

    /**
     * <p>
     * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of <code>-1</code>
     * indicates all ICMP types.
     * </p>
     * 
     * @param toPort
     *        The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of
     *        <code>-1</code> indicates all ICMP types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withToPort(Integer toPort) {
        setToPort(toPort);
        return this;
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the
     * VPC peering connection.
     * </p>
     * 
     * @return The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status
     *         of the VPC peering connection.
     */

    public java.util.List<UserIdGroupPair> getUserIdGroupPairs() {
        if (userIdGroupPairs == null) {
            userIdGroupPairs = new com.amazonaws.internal.SdkInternalList<UserIdGroupPair>();
        }
        return userIdGroupPairs;
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the
     * VPC peering connection.
     * </p>
     * 
     * @param userIdGroupPairs
     *        The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status
     *        of the VPC peering connection.
     */

    public void setUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
            return;
        }

        this.userIdGroupPairs = new com.amazonaws.internal.SdkInternalList<UserIdGroupPair>(userIdGroupPairs);
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the
     * VPC peering connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserIdGroupPairs(java.util.Collection)} or {@link #withUserIdGroupPairs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param userIdGroupPairs
     *        The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status
     *        of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withUserIdGroupPairs(UserIdGroupPair... userIdGroupPairs) {
        if (this.userIdGroupPairs == null) {
            setUserIdGroupPairs(new com.amazonaws.internal.SdkInternalList<UserIdGroupPair>(userIdGroupPairs.length));
        }
        for (UserIdGroupPair ele : userIdGroupPairs) {
            this.userIdGroupPairs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the
     * VPC peering connection.
     * </p>
     * 
     * @param userIdGroupPairs
     *        The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status
     *        of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleIpPermission withUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        setUserIdGroupPairs(userIdGroupPairs);
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
        if (getFromPort() != null)
            sb.append("FromPort: ").append(getFromPort()).append(",");
        if (getIpProtocol() != null)
            sb.append("IpProtocol: ").append(getIpProtocol()).append(",");
        if (getIpRanges() != null)
            sb.append("IpRanges: ").append(getIpRanges()).append(",");
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: ").append(getPrefixListIds()).append(",");
        if (getToPort() != null)
            sb.append("ToPort: ").append(getToPort()).append(",");
        if (getUserIdGroupPairs() != null)
            sb.append("UserIdGroupPairs: ").append(getUserIdGroupPairs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaleIpPermission == false)
            return false;
        StaleIpPermission other = (StaleIpPermission) obj;
        if (other.getFromPort() == null ^ this.getFromPort() == null)
            return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false)
            return false;
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null)
            return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false)
            return false;
        if (other.getIpRanges() == null ^ this.getIpRanges() == null)
            return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false)
            return false;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        if (other.getToPort() == null ^ this.getToPort() == null)
            return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false)
            return false;
        if (other.getUserIdGroupPairs() == null ^ this.getUserIdGroupPairs() == null)
            return false;
        if (other.getUserIdGroupPairs() != null && other.getUserIdGroupPairs().equals(this.getUserIdGroupPairs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode());
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode());
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode());
        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode());
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode());
        hashCode = prime * hashCode + ((getUserIdGroupPairs() == null) ? 0 : getUserIdGroupPairs().hashCode());
        return hashCode;
    }

    @Override
    public StaleIpPermission clone() {
        try {
            return (StaleIpPermission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
