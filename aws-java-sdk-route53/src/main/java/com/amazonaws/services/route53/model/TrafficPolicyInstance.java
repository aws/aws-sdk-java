/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * Traffic Policy Instance
 */
public class TrafficPolicyInstance implements Serializable, Cloneable {

    private String id;

    private String hostedZoneId;

    private String name;

    private Long tTL;

    private String state;

    private String message;

    private String trafficPolicyId;

    private Integer trafficPolicyVersion;

    private String trafficPolicyType;

    /**
     * Returns the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The value of the Id property for this object.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The new value for the Id property for this object.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The new value for the Id property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns the value of the HostedZoneId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The value of the HostedZoneId property for this object.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * Sets the value of the HostedZoneId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The new value for the HostedZoneId property for this object.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * Sets the value of the HostedZoneId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The new value for the HostedZoneId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * Returns the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the value of the TTL property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return The value of the TTL property for this object.
     */
    public Long getTTL() {
        return tTL;
    }
    
    /**
     * Sets the value of the TTL property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL The new value for the TTL property for this object.
     */
    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }
    
    /**
     * Sets the value of the TTL property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param tTL The new value for the TTL property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withTTL(Long tTL) {
        this.tTL = tTL;
        return this;
    }

    /**
     * Returns the value of the State property for this object.
     *
     * @return The value of the State property for this object.
     */
    public String getState() {
        return state;
    }
    
    /**
     * Sets the value of the State property for this object.
     *
     * @param state The new value for the State property for this object.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Sets the value of the State property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The new value for the State property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Returns the value of the Message property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The value of the Message property for this object.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Sets the value of the Message property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param message The new value for the Message property for this object.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Sets the value of the Message property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param message The new value for the Message property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Returns the value of the TrafficPolicyId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The value of the TrafficPolicyId property for this object.
     */
    public String getTrafficPolicyId() {
        return trafficPolicyId;
    }
    
    /**
     * Sets the value of the TrafficPolicyId property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyId The new value for the TrafficPolicyId property for this object.
     */
    public void setTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
    }
    
    /**
     * Sets the value of the TrafficPolicyId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyId The new value for the TrafficPolicyId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withTrafficPolicyId(String trafficPolicyId) {
        this.trafficPolicyId = trafficPolicyId;
        return this;
    }

    /**
     * Returns the value of the TrafficPolicyVersion property for this
     * object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The value of the TrafficPolicyVersion property for this object.
     */
    public Integer getTrafficPolicyVersion() {
        return trafficPolicyVersion;
    }
    
    /**
     * Sets the value of the TrafficPolicyVersion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion The new value for the TrafficPolicyVersion property for this object.
     */
    public void setTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
    }
    
    /**
     * Sets the value of the TrafficPolicyVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyVersion The new value for the TrafficPolicyVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicyInstance withTrafficPolicyVersion(Integer trafficPolicyVersion) {
        this.trafficPolicyVersion = trafficPolicyVersion;
        return this;
    }

    /**
     * Returns the value of the TrafficPolicyType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return The value of the TrafficPolicyType property for this object.
     *
     * @see RRType
     */
    public String getTrafficPolicyType() {
        return trafficPolicyType;
    }
    
    /**
     * Sets the value of the TrafficPolicyType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyType The new value for the TrafficPolicyType property for this object.
     *
     * @see RRType
     */
    public void setTrafficPolicyType(String trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType;
    }
    
    /**
     * Sets the value of the TrafficPolicyType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyType The new value for the TrafficPolicyType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public TrafficPolicyInstance withTrafficPolicyType(String trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType;
        return this;
    }

    /**
     * Sets the value of the TrafficPolicyType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyType The new value for the TrafficPolicyType property for this object.
     *
     * @see RRType
     */
    public void setTrafficPolicyType(RRType trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType.toString();
    }
    
    /**
     * Sets the value of the TrafficPolicyType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyType The new value for the TrafficPolicyType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public TrafficPolicyInstance withTrafficPolicyType(RRType trafficPolicyType) {
        this.trafficPolicyType = trafficPolicyType.toString();
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getTTL() != null) sb.append("TTL: " + getTTL() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getTrafficPolicyId() != null) sb.append("TrafficPolicyId: " + getTrafficPolicyId() + ",");
        if (getTrafficPolicyVersion() != null) sb.append("TrafficPolicyVersion: " + getTrafficPolicyVersion() + ",");
        if (getTrafficPolicyType() != null) sb.append("TrafficPolicyType: " + getTrafficPolicyType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyId() == null) ? 0 : getTrafficPolicyId().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyVersion() == null) ? 0 : getTrafficPolicyVersion().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyType() == null) ? 0 : getTrafficPolicyType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrafficPolicyInstance == false) return false;
        TrafficPolicyInstance other = (TrafficPolicyInstance)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getTTL() == null ^ this.getTTL() == null) return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getTrafficPolicyId() == null ^ this.getTrafficPolicyId() == null) return false;
        if (other.getTrafficPolicyId() != null && other.getTrafficPolicyId().equals(this.getTrafficPolicyId()) == false) return false; 
        if (other.getTrafficPolicyVersion() == null ^ this.getTrafficPolicyVersion() == null) return false;
        if (other.getTrafficPolicyVersion() != null && other.getTrafficPolicyVersion().equals(this.getTrafficPolicyVersion()) == false) return false; 
        if (other.getTrafficPolicyType() == null ^ this.getTrafficPolicyType() == null) return false;
        if (other.getTrafficPolicyType() != null && other.getTrafficPolicyType().equals(this.getTrafficPolicyType()) == false) return false; 
        return true;
    }
    
    @Override
    public TrafficPolicyInstance clone() {
        try {
            return (TrafficPolicyInstance) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    