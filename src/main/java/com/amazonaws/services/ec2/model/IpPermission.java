/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An IP permission describing allowed incoming IP traffic to an Amazon
 * EC2 security group.
 * </p>
 */
public class IpPermission {

    /**
     * The IP protocol of this permission. <p> Valid protocol values: tpc,
     * upd, icmp
     */
    private String ipProtocol;

    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     */
    private Integer fromPort;

    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     */
    private Integer toPort;

    /**
     * The list of AWS user IDs and groups included in this permission.
     */
    private java.util.List<UserIdGroupPair> userIdGroupPairs;

    /**
     * The list of CIDR IP ranges included in this permission.
     */
    private java.util.List<String> ipRanges;

    /**
     * The IP protocol of this permission. <p> Valid protocol values: tpc,
     * upd, icmp
     *
     * @return The IP protocol of this permission. <p> Valid protocol values: tpc,
     *         upd, icmp
     */
    public String getIpProtocol() {
        return ipProtocol;
    }
    
    /**
     * The IP protocol of this permission. <p> Valid protocol values: tpc,
     * upd, icmp
     *
     * @param ipProtocol The IP protocol of this permission. <p> Valid protocol values: tpc,
     *         upd, icmp
     */
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }
    
    /**
     * The IP protocol of this permission. <p> Valid protocol values: tpc,
     * upd, icmp
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ipProtocol The IP protocol of this permission. <p> Valid protocol values: tpc,
     *         upd, icmp
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
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     *
     * @return Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     *         type number).
     */
    public Integer getFromPort() {
        return fromPort;
    }
    
    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     *
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     *         type number).
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }
    
    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type
     * number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     * type number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type
     *         number. An ICMP type number of -1 indicates a wildcard (i.e., any ICMP
     *         type number).
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
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     *
     * @return End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     */
    public Integer getToPort() {
        return toPort;
    }
    
    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     *
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }
    
    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code. An
     * ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code. An
     *         ICMP code of -1 indicates a wildcard (i.e., any ICMP code).
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
            userIdGroupPairs = new java.util.ArrayList<UserIdGroupPair>();
        }
        return userIdGroupPairs;
    }
    
    /**
     * The list of AWS user IDs and groups included in this permission.
     *
     * @param userIdGroupPairs The list of AWS user IDs and groups included in this permission.
     */
    public void setUserIdGroupPairs(java.util.Collection<UserIdGroupPair> userIdGroupPairs) {
        java.util.List<UserIdGroupPair> userIdGroupPairsCopy = new java.util.ArrayList<UserIdGroupPair>();
        if (userIdGroupPairs != null) {
            userIdGroupPairsCopy.addAll(userIdGroupPairs);
        }
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
        java.util.List<UserIdGroupPair> userIdGroupPairsCopy = new java.util.ArrayList<UserIdGroupPair>();
        if (userIdGroupPairs != null) {
            userIdGroupPairsCopy.addAll(userIdGroupPairs);
        }
        this.userIdGroupPairs = userIdGroupPairsCopy;

        return this;
    }
    
    /**
     * The list of CIDR IP ranges included in this permission.
     *
     * @return The list of CIDR IP ranges included in this permission.
     */
    public java.util.List<String> getIpRanges() {
        if (ipRanges == null) {
            ipRanges = new java.util.ArrayList<String>();
        }
        return ipRanges;
    }
    
    /**
     * The list of CIDR IP ranges included in this permission.
     *
     * @param ipRanges The list of CIDR IP ranges included in this permission.
     */
    public void setIpRanges(java.util.Collection<String> ipRanges) {
        java.util.List<String> ipRangesCopy = new java.util.ArrayList<String>();
        if (ipRanges != null) {
            ipRangesCopy.addAll(ipRanges);
        }
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
        java.util.List<String> ipRangesCopy = new java.util.ArrayList<String>();
        if (ipRanges != null) {
            ipRangesCopy.addAll(ipRanges);
        }
        this.ipRanges = ipRangesCopy;

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
        
        sb.append("IpProtocol: " + ipProtocol + ", ");
        sb.append("FromPort: " + fromPort + ", ");
        sb.append("ToPort: " + toPort + ", ");
        sb.append("UserIdGroupPairs: " + userIdGroupPairs + ", ");
        sb.append("IpRanges: " + ipRanges + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    