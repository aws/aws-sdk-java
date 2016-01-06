/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a security group rule.
 * </p>
 */
public class IpPermission implements Serializable, Cloneable {

    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). <p>[EC2-VPC only] When you authorize or revoke security
     * group rules, you can use <code>-1</code> to specify all.
     */
    private String ipProtocol;

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     */
    private Integer fromPort;

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * A value of <code>-1</code> indicates all ICMP codes for the specified
     * ICMP type.
     */
    private Integer toPort;

    /**
     * One or more security group and AWS account ID pairs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair> userIdGroupPairs;

    /**
     * One or more IP ranges.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ipRanges;

    /**
     * (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     * <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     * only) One or more prefix list IDs for an AWS service. In an
     * <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     * that you want to access through a VPC endpoint from instances
     * associated with the security group.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<PrefixListId> prefixListIds;

    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). <p>[EC2-VPC only] When you authorize or revoke security
     * group rules, you can use <code>-1</code> to specify all.
     *
     * @return The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). <p>[EC2-VPC only] When you authorize or revoke security
     *         group rules, you can use <code>-1</code> to specify all.
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). <p>[EC2-VPC only] When you authorize or revoke security
     * group rules, you can use <code>-1</code> to specify all.
     *
     * @param ipProtocol The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). <p>[EC2-VPC only] When you authorize or revoke security
     *         group rules, you can use <code>-1</code> to specify all.
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     * <code>icmp</code>) or number (see <a
     * href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     * Numbers</a>). <p>[EC2-VPC only] When you authorize or revoke security
     * group rules, you can use <code>-1</code> to specify all.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol The IP protocol name (for <code>tcp</code>, <code>udp</code>, and
     *         <code>icmp</code>) or number (see <a
     *         href="http://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol
     *         Numbers</a>). <p>[EC2-VPC only] When you authorize or revoke security
     *         group rules, you can use <code>-1</code> to specify all.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @return The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. A value of <code>-1</code> indicates all ICMP types.
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. A value of <code>-1</code> indicates all ICMP types.
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * The start of port range for the TCP and UDP protocols, or an ICMP type
     * number. A value of <code>-1</code> indicates all ICMP types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort The start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. A value of <code>-1</code> indicates all ICMP types.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * A value of <code>-1</code> indicates all ICMP codes for the specified
     * ICMP type.
     *
     * @return The end of port range for the TCP and UDP protocols, or an ICMP code.
     *         A value of <code>-1</code> indicates all ICMP codes for the specified
     *         ICMP type.
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * A value of <code>-1</code> indicates all ICMP codes for the specified
     * ICMP type.
     *
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP code.
     *         A value of <code>-1</code> indicates all ICMP codes for the specified
     *         ICMP type.
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * The end of port range for the TCP and UDP protocols, or an ICMP code.
     * A value of <code>-1</code> indicates all ICMP codes for the specified
     * ICMP type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort The end of port range for the TCP and UDP protocols, or an ICMP code.
     *         A value of <code>-1</code> indicates all ICMP codes for the specified
     *         ICMP type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * One or more security group and AWS account ID pairs.
     *
     * @return One or more security group and AWS account ID pairs.
     */
    public java.util.List<UserIdGroupPair> getUserIdGroupPairs() {
        if (userIdGroupPairs == null) {
              userIdGroupPairs = new com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair>();
              userIdGroupPairs.setAutoConstruct(true);
        }
        return userIdGroupPairs;
    }
    
    /**
     * One or more security group and AWS account ID pairs.
     *
     * @param userIdGroupPairs One or more security group and AWS account ID pairs.
     */
    public void setUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair> userIdGroupPairsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair>(userIdGroupPairs.size());
        userIdGroupPairsCopy.addAll(userIdGroupPairs);
        this.userIdGroupPairs = userIdGroupPairsCopy;
    }
    
    /**
     * One or more security group and AWS account ID pairs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUserIdGroupPairs(java.util.Collection)} or {@link
     * #withUserIdGroupPairs(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIdGroupPairs One or more security group and AWS account ID pairs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withUserIdGroupPairs(UserIdGroupPair... userIdGroupPairs) {
        if (getUserIdGroupPairs() == null) setUserIdGroupPairs(new java.util.ArrayList<UserIdGroupPair>(userIdGroupPairs.length));
        for (UserIdGroupPair value : userIdGroupPairs) {
            getUserIdGroupPairs().add(value);
        }
        return this;
    }
    
    /**
     * One or more security group and AWS account ID pairs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIdGroupPairs One or more security group and AWS account ID pairs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        if (userIdGroupPairs == null) {
            this.userIdGroupPairs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair> userIdGroupPairsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair>(userIdGroupPairs.size());
            userIdGroupPairsCopy.addAll(userIdGroupPairs);
            this.userIdGroupPairs = userIdGroupPairsCopy;
        }

        return this;
    }

    /**
     * One or more IP ranges.
     *
     * @return One or more IP ranges.
     */
    public java.util.List<String> getIpRanges() {
        if (ipRanges == null) {
              ipRanges = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ipRanges.setAutoConstruct(true);
        }
        return ipRanges;
    }
    
    /**
     * One or more IP ranges.
     *
     * @param ipRanges One or more IP ranges.
     */
    public void setIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ipRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ipRanges.size());
        ipRangesCopy.addAll(ipRanges);
        this.ipRanges = ipRangesCopy;
    }
    
    /**
     * One or more IP ranges.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setIpRanges(java.util.Collection)} or {@link
     * #withIpRanges(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipRanges One or more IP ranges.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withIpRanges(String... ipRanges) {
        if (getIpRanges() == null) setIpRanges(new java.util.ArrayList<String>(ipRanges.length));
        for (String value : ipRanges) {
            getIpRanges().add(value);
        }
        return this;
    }
    
    /**
     * One or more IP ranges.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipRanges One or more IP ranges.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withIpRanges(java.util.Collection<String> ipRanges) {
        if (ipRanges == null) {
            this.ipRanges = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ipRangesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ipRanges.size());
            ipRangesCopy.addAll(ipRanges);
            this.ipRanges = ipRangesCopy;
        }

        return this;
    }

    /**
     * (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     * <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     * only) One or more prefix list IDs for an AWS service. In an
     * <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     * that you want to access through a VPC endpoint from instances
     * associated with the security group.
     *
     * @return (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     *         <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     *         only) One or more prefix list IDs for an AWS service. In an
     *         <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     *         that you want to access through a VPC endpoint from instances
     *         associated with the security group.
     */
    public java.util.List<PrefixListId> getPrefixListIds() {
        if (prefixListIds == null) {
              prefixListIds = new com.amazonaws.internal.ListWithAutoConstructFlag<PrefixListId>();
              prefixListIds.setAutoConstruct(true);
        }
        return prefixListIds;
    }
    
    /**
     * (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     * <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     * only) One or more prefix list IDs for an AWS service. In an
     * <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     * that you want to access through a VPC endpoint from instances
     * associated with the security group.
     *
     * @param prefixListIds (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     *         <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     *         only) One or more prefix list IDs for an AWS service. In an
     *         <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     *         that you want to access through a VPC endpoint from instances
     *         associated with the security group.
     */
    public void setPrefixListIds(java.util.Collection<PrefixListId> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PrefixListId> prefixListIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PrefixListId>(prefixListIds.size());
        prefixListIdsCopy.addAll(prefixListIds);
        this.prefixListIds = prefixListIdsCopy;
    }
    
    /**
     * (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     * <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     * only) One or more prefix list IDs for an AWS service. In an
     * <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     * that you want to access through a VPC endpoint from instances
     * associated with the security group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPrefixListIds(java.util.Collection)} or {@link
     * #withPrefixListIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListIds (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     *         <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     *         only) One or more prefix list IDs for an AWS service. In an
     *         <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     *         that you want to access through a VPC endpoint from instances
     *         associated with the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withPrefixListIds(PrefixListId... prefixListIds) {
        if (getPrefixListIds() == null) setPrefixListIds(new java.util.ArrayList<PrefixListId>(prefixListIds.length));
        for (PrefixListId value : prefixListIds) {
            getPrefixListIds().add(value);
        }
        return this;
    }
    
    /**
     * (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     * <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     * only) One or more prefix list IDs for an AWS service. In an
     * <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     * that you want to access through a VPC endpoint from instances
     * associated with the security group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListIds (Valid for <a>AuthorizeSecurityGroupEgress</a>,
     *         <a>RevokeSecurityGroupEgress</a> and <a>DescribeSecurityGroups</a>
     *         only) One or more prefix list IDs for an AWS service. In an
     *         <a>AuthorizeSecurityGroupEgress</a> request, this is the AWS service
     *         that you want to access through a VPC endpoint from instances
     *         associated with the security group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public IpPermission withPrefixListIds(java.util.Collection<PrefixListId> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PrefixListId> prefixListIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PrefixListId>(prefixListIds.size());
            prefixListIdsCopy.addAll(prefixListIds);
            this.prefixListIds = prefixListIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIpProtocol() != null) sb.append("IpProtocol: " + getIpProtocol() + ",");
        if (getFromPort() != null) sb.append("FromPort: " + getFromPort() + ",");
        if (getToPort() != null) sb.append("ToPort: " + getToPort() + ",");
        if (getUserIdGroupPairs() != null) sb.append("UserIdGroupPairs: " + getUserIdGroupPairs() + ",");
        if (getIpRanges() != null) sb.append("IpRanges: " + getIpRanges() + ",");
        if (getPrefixListIds() != null) sb.append("PrefixListIds: " + getPrefixListIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIpProtocol() == null) ? 0 : getIpProtocol().hashCode()); 
        hashCode = prime * hashCode + ((getFromPort() == null) ? 0 : getFromPort().hashCode()); 
        hashCode = prime * hashCode + ((getToPort() == null) ? 0 : getToPort().hashCode()); 
        hashCode = prime * hashCode + ((getUserIdGroupPairs() == null) ? 0 : getUserIdGroupPairs().hashCode()); 
        hashCode = prime * hashCode + ((getIpRanges() == null) ? 0 : getIpRanges().hashCode()); 
        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof IpPermission == false) return false;
        IpPermission other = (IpPermission)obj;
        
        if (other.getIpProtocol() == null ^ this.getIpProtocol() == null) return false;
        if (other.getIpProtocol() != null && other.getIpProtocol().equals(this.getIpProtocol()) == false) return false; 
        if (other.getFromPort() == null ^ this.getFromPort() == null) return false;
        if (other.getFromPort() != null && other.getFromPort().equals(this.getFromPort()) == false) return false; 
        if (other.getToPort() == null ^ this.getToPort() == null) return false;
        if (other.getToPort() != null && other.getToPort().equals(this.getToPort()) == false) return false; 
        if (other.getUserIdGroupPairs() == null ^ this.getUserIdGroupPairs() == null) return false;
        if (other.getUserIdGroupPairs() != null && other.getUserIdGroupPairs().equals(this.getUserIdGroupPairs()) == false) return false; 
        if (other.getIpRanges() == null ^ this.getIpRanges() == null) return false;
        if (other.getIpRanges() != null && other.getIpRanges().equals(this.getIpRanges()) == false) return false; 
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null) return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false) return false; 
        return true;
    }
    
    @Override
    public IpPermission clone() {
        try {
            return (IpPermission) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    