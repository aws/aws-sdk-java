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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#createInterconnect(CreateInterconnectRequest) CreateInterconnect operation}.
 * <p>
 * Creates a new interconnect between a AWS Direct Connect partner's network and a specific AWS Direct Connect location.
 * </p>
 * <p>
 * An interconnect is a connection which is capable of hosting other connections. The AWS Direct Connect partner can use an interconnect to provide
 * sub-1Gbps AWS Direct Connect service to tier 2 customers who do not have their own connections. Like a standard connection, an interconnect links the
 * AWS Direct Connect partner's network to an AWS Direct Connect location over a standard 1 Gbps or 10 Gbps Ethernet fiber-optic cable. One end is
 * connected to the partner's router, the other to an AWS Direct Connect router.
 * </p>
 * <p>
 * For each end customer, the AWS Direct Connect partner provisions a connection on their interconnect by calling AllocateConnectionOnInterconnect. The
 * end customer can then connect to AWS resources by creating a virtual interface on their connection, using the VLAN assigned to them by the AWS Direct
 * Connect partner.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#createInterconnect(CreateInterconnectRequest)
 */
public class CreateInterconnectRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>" <p>Default: None
     */
    private String interconnectName;

    /**
     * The port bandwidth <p>Example: 1Gbps <p>Default: None <p>Available
     * values: 1Gbps,10Gbps
     */
    private String bandwidth;

    /**
     * Where the interconnect is located <p>Example: EqSV5 <p>Default: None
     */
    private String location;

    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>" <p>Default: None
     *
     * @return The name of the interconnect. <p>Example: "<i>1G Interconnect to
     *         AWS</i>" <p>Default: None
     */
    public String getInterconnectName() {
        return interconnectName;
    }
    
    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>" <p>Default: None
     *
     * @param interconnectName The name of the interconnect. <p>Example: "<i>1G Interconnect to
     *         AWS</i>" <p>Default: None
     */
    public void setInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
    }
    
    /**
     * The name of the interconnect. <p>Example: "<i>1G Interconnect to
     * AWS</i>" <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interconnectName The name of the interconnect. <p>Example: "<i>1G Interconnect to
     *         AWS</i>" <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInterconnectRequest withInterconnectName(String interconnectName) {
        this.interconnectName = interconnectName;
        return this;
    }

    /**
     * The port bandwidth <p>Example: 1Gbps <p>Default: None <p>Available
     * values: 1Gbps,10Gbps
     *
     * @return The port bandwidth <p>Example: 1Gbps <p>Default: None <p>Available
     *         values: 1Gbps,10Gbps
     */
    public String getBandwidth() {
        return bandwidth;
    }
    
    /**
     * The port bandwidth <p>Example: 1Gbps <p>Default: None <p>Available
     * values: 1Gbps,10Gbps
     *
     * @param bandwidth The port bandwidth <p>Example: 1Gbps <p>Default: None <p>Available
     *         values: 1Gbps,10Gbps
     */
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }
    
    /**
     * The port bandwidth <p>Example: 1Gbps <p>Default: None <p>Available
     * values: 1Gbps,10Gbps
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bandwidth The port bandwidth <p>Example: 1Gbps <p>Default: None <p>Available
     *         values: 1Gbps,10Gbps
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInterconnectRequest withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * Where the interconnect is located <p>Example: EqSV5 <p>Default: None
     *
     * @return Where the interconnect is located <p>Example: EqSV5 <p>Default: None
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Where the interconnect is located <p>Example: EqSV5 <p>Default: None
     *
     * @param location Where the interconnect is located <p>Example: EqSV5 <p>Default: None
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Where the interconnect is located <p>Example: EqSV5 <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location Where the interconnect is located <p>Example: EqSV5 <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateInterconnectRequest withLocation(String location) {
        this.location = location;
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
        if (getInterconnectName() != null) sb.append("InterconnectName: " + getInterconnectName() + ",");
        if (getBandwidth() != null) sb.append("Bandwidth: " + getBandwidth() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInterconnectName() == null) ? 0 : getInterconnectName().hashCode()); 
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateInterconnectRequest == false) return false;
        CreateInterconnectRequest other = (CreateInterconnectRequest)obj;
        
        if (other.getInterconnectName() == null ^ this.getInterconnectName() == null) return false;
        if (other.getInterconnectName() != null && other.getInterconnectName().equals(this.getInterconnectName()) == false) return false; 
        if (other.getBandwidth() == null ^ this.getBandwidth() == null) return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        return true;
    }
    
}
    