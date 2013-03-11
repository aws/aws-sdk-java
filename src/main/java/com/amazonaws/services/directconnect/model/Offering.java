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

/**
 * <p>
 * An offer to create a new connection for a specific price and terms.
 * </p>
 */
public class Offering  implements Serializable  {

    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     */
    private String offeringId;

    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     */
    private String region;

    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     */
    private String location;

    /**
     * Name of the offering. <p>Example: "<i>1Gbps Cross Connect in us-east-1
     * via Equinix</i>" <p>Default: None
     */
    private String offeringName;

    /**
     * Description of the offering. <p>Example: "<i>1Gbps Cross Connect in
     * us-east-1 via Equinix</i>" <p>Default: None
     */
    private String description;

    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     */
    private String bandwidth;

    /**
     * A list of connection costs.
     */
    private java.util.List<ConnectionCost> connectionCosts;

    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     *
     * @return The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     *         None
     */
    public String getOfferingId() {
        return offeringId;
    }
    
    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     *
     * @param offeringId The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     *         None
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }
    
    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringId The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     *         None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }
    
    
    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     *
     * @return The AWS region where the offering is located. <p>Example: us-east-1
     *         <p>Default: None
     */
    public String getRegion() {
        return region;
    }
    
    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     *
     * @param region The AWS region where the offering is located. <p>Example: us-east-1
     *         <p>Default: None
     */
    public void setRegion(String region) {
        this.region = region;
    }
    
    /**
     * The AWS region where the offering is located. <p>Example: us-east-1
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param region The AWS region where the offering is located. <p>Example: us-east-1
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withRegion(String region) {
        this.region = region;
        return this;
    }
    
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     *
     * @return Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     *
     * @param location Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withLocation(String location) {
        this.location = location;
        return this;
    }
    
    
    /**
     * Name of the offering. <p>Example: "<i>1Gbps Cross Connect in us-east-1
     * via Equinix</i>" <p>Default: None
     *
     * @return Name of the offering. <p>Example: "<i>1Gbps Cross Connect in us-east-1
     *         via Equinix</i>" <p>Default: None
     */
    public String getOfferingName() {
        return offeringName;
    }
    
    /**
     * Name of the offering. <p>Example: "<i>1Gbps Cross Connect in us-east-1
     * via Equinix</i>" <p>Default: None
     *
     * @param offeringName Name of the offering. <p>Example: "<i>1Gbps Cross Connect in us-east-1
     *         via Equinix</i>" <p>Default: None
     */
    public void setOfferingName(String offeringName) {
        this.offeringName = offeringName;
    }
    
    /**
     * Name of the offering. <p>Example: "<i>1Gbps Cross Connect in us-east-1
     * via Equinix</i>" <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringName Name of the offering. <p>Example: "<i>1Gbps Cross Connect in us-east-1
     *         via Equinix</i>" <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withOfferingName(String offeringName) {
        this.offeringName = offeringName;
        return this;
    }
    
    
    /**
     * Description of the offering. <p>Example: "<i>1Gbps Cross Connect in
     * us-east-1 via Equinix</i>" <p>Default: None
     *
     * @return Description of the offering. <p>Example: "<i>1Gbps Cross Connect in
     *         us-east-1 via Equinix</i>" <p>Default: None
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Description of the offering. <p>Example: "<i>1Gbps Cross Connect in
     * us-east-1 via Equinix</i>" <p>Default: None
     *
     * @param description Description of the offering. <p>Example: "<i>1Gbps Cross Connect in
     *         us-east-1 via Equinix</i>" <p>Default: None
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Description of the offering. <p>Example: "<i>1Gbps Cross Connect in
     * us-east-1 via Equinix</i>" <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description Description of the offering. <p>Example: "<i>1Gbps Cross Connect in
     *         us-east-1 via Equinix</i>" <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     *
     * @return Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     */
    public String getBandwidth() {
        return bandwidth;
    }
    
    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     *
     * @param bandwidth Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     */
    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }
    
    /**
     * Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bandwidth Bandwidth of the connection. <p>Example: 1Gbps <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    
    
    /**
     * A list of connection costs.
     *
     * @return A list of connection costs.
     */
    public java.util.List<ConnectionCost> getConnectionCosts() {
        
        if (connectionCosts == null) {
            connectionCosts = new java.util.ArrayList<ConnectionCost>();
        }
        return connectionCosts;
    }
    
    /**
     * A list of connection costs.
     *
     * @param connectionCosts A list of connection costs.
     */
    public void setConnectionCosts(java.util.Collection<ConnectionCost> connectionCosts) {
        if (connectionCosts == null) {
            this.connectionCosts = null;
            return;
        }

        java.util.List<ConnectionCost> connectionCostsCopy = new java.util.ArrayList<ConnectionCost>(connectionCosts.size());
        connectionCostsCopy.addAll(connectionCosts);
        this.connectionCosts = connectionCostsCopy;
    }
    
    /**
     * A list of connection costs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionCosts A list of connection costs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withConnectionCosts(ConnectionCost... connectionCosts) {
        if (getConnectionCosts() == null) setConnectionCosts(new java.util.ArrayList<ConnectionCost>(connectionCosts.length));
        for (ConnectionCost value : connectionCosts) {
            getConnectionCosts().add(value);
        }
        return this;
    }
    
    /**
     * A list of connection costs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionCosts A list of connection costs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Offering withConnectionCosts(java.util.Collection<ConnectionCost> connectionCosts) {
        if (connectionCosts == null) {
            this.connectionCosts = null;
        } else {
            java.util.List<ConnectionCost> connectionCostsCopy = new java.util.ArrayList<ConnectionCost>(connectionCosts.size());
            connectionCostsCopy.addAll(connectionCosts);
            this.connectionCosts = connectionCostsCopy;
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
        if (getOfferingId() != null) sb.append("OfferingId: " + getOfferingId() + ", ");
        if (getRegion() != null) sb.append("Region: " + getRegion() + ", ");
        if (getLocation() != null) sb.append("Location: " + getLocation() + ", ");
        if (getOfferingName() != null) sb.append("OfferingName: " + getOfferingName() + ", ");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ", ");
        if (getBandwidth() != null) sb.append("Bandwidth: " + getBandwidth() + ", ");
        if (getConnectionCosts() != null) sb.append("ConnectionCosts: " + getConnectionCosts() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getOfferingName() == null) ? 0 : getOfferingName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionCosts() == null) ? 0 : getConnectionCosts().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Offering == false) return false;
        Offering other = (Offering)obj;
        
        if (other.getOfferingId() == null ^ this.getOfferingId() == null) return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false) return false; 
        if (other.getRegion() == null ^ this.getRegion() == null) return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getOfferingName() == null ^ this.getOfferingName() == null) return false;
        if (other.getOfferingName() != null && other.getOfferingName().equals(this.getOfferingName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getBandwidth() == null ^ this.getBandwidth() == null) return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false) return false; 
        if (other.getConnectionCosts() == null ^ this.getConnectionCosts() == null) return false;
        if (other.getConnectionCosts() != null && other.getConnectionCosts().equals(this.getConnectionCosts()) == false) return false; 
        return true;
    }
    
}
    