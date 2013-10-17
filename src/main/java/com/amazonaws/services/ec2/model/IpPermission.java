/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An IP permission describing allowed incoming IP traffic to an Amazon EC2 security group.
 * </p>
 */
public class IpPermission implements Serializable {

    /**
     * The IP protocol of this permission. <p> Valid protocol values:
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>
     */
    private String ipProtocol;

    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of <code>-1</code> indicates a wildcard
     * (i.e., any ICMP type number).
     */
    private Integer fromPort;

    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of <code>-1</code> indicates a wildcard (i.e., any ICMP
     * code).
     */
    private Integer toPort;

    /**
     * The list of AWS user IDs and groups included in this permission.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair> userIdGroupPairs;

    /**
     * The list of CIDR IP ranges included in this permission.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ipRanges;

    /**
     * The IP protocol of this permission. <p> Valid protocol values:
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>
     *
     * @return The IP protocol of this permission. <p> Valid protocol values:
     *         <code>tcp</code>, <code>udp</code>, <code>icmp</code>
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * The IP protocol of this permission. <p> Valid protocol values:
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>
     *
     * @param ipProtocol The IP protocol of this permission. <p> Valid protocol values:
     *         <code>tcp</code>, <code>udp</code>, <code>icmp</code>
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * The IP protocol of this permission. <p> Valid protocol values:
     * <code>tcp</code>, <code>udp</code>, <code>icmp</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol The IP protocol of this permission. <p> Valid protocol values:
     *         <code>tcp</code>, <code>udp</code>, <code>icmp</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IpPermission withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of <code>-1</code> indicates a wildcard
     * (i.e., any ICMP type number).
     *
     * @return Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of <code>-1</code> indicates a wildcard
     *         (i.e., any ICMP type number).
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of <code>-1</code> indicates a wildcard
     * (i.e., any ICMP type number).
     *
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of <code>-1</code> indicates a wildcard
     *         (i.e., any ICMP type number).
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of <code>-1</code> indicates a wildcard
     * (i.e., any ICMP type number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of <code>-1</code> indicates a wildcard
     *         (i.e., any ICMP type number).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IpPermission withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of <code>-1</code> indicates a wildcard (i.e., any ICMP
     * code).
     *
     * @return End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of <code>-1</code> indicates a wildcard (i.e., any ICMP
     *         code).
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of <code>-1</code> indicates a wildcard (i.e., any ICMP
     * code).
     *
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of <code>-1</code> indicates a wildcard (i.e., any ICMP
     *         code).
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of <code>-1</code> indicates a wildcard (i.e., any ICMP
     * code).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of <code>-1</code> indicates a wildcard (i.e., any ICMP
     *         code).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public IpPermission withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    /**
     * The list of AWS user IDs and groups included in this permission.
     *
     * @return The list of AWS user IDs and groups included in this permission.
     */
    public java.util.List<UserIdGroupPair> getUserIdGroupPairs() {
        if (userIdGroupPairs == null) {
              userIdGroupPairs = new com.amazonaws.internal.ListWithAutoConstructFlag<UserIdGroupPair>();
              userIdGroupPairs.setAutoConstruct(true);
        }
        return userIdGroupPairs;
    }
    
    /**
     * The list of AWS user IDs and groups included in this permission.
     *
     * @param userIdGroupPairs The list of AWS user IDs and groups included in this permission.
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
     * The list of AWS user IDs and groups included in this permission.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIdGroupPairs The list of AWS user IDs and groups included in this permission.
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
     * The list of AWS user IDs and groups included in this permission.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userIdGroupPairs The list of AWS user IDs and groups included in this permission.
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
     * The list of CIDR IP ranges included in this permission.
     *
     * @return The list of CIDR IP ranges included in this permission.
     */
    public java.util.List<String> getIpRanges() {
        if (ipRanges == null) {
              ipRanges = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ipRanges.setAutoConstruct(true);
        }
        return ipRanges;
    }
    
    /**
     * The list of CIDR IP ranges included in this permission.
     *
     * @param ipRanges The list of CIDR IP ranges included in this permission.
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
     * The list of CIDR IP ranges included in this permission.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipRanges The list of CIDR IP ranges included in this permission.
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
     * The list of CIDR IP ranges included in this permission.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipRanges The list of CIDR IP ranges included in this permission.
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
        if (getIpRanges() != null) sb.append("IpRanges: " + getIpRanges() );
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
        return true;
    }
    
}
    