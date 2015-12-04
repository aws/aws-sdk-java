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
 * Traffic Policy Summary
 */
public class TrafficPolicySummary implements Serializable, Cloneable {

    private String id;

    private String name;

    private String type;

    private Integer latestVersion;

    private Integer trafficPolicyCount;

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
    public TrafficPolicySummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
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
     * <b>Length: </b>0 - 512<br/>
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
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicySummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return The value of the Type property for this object.
     *
     * @see RRType
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public TrafficPolicySummary withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Sets the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public TrafficPolicySummary withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Returns the value of the LatestVersion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The value of the LatestVersion property for this object.
     */
    public Integer getLatestVersion() {
        return latestVersion;
    }
    
    /**
     * Sets the value of the LatestVersion property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param latestVersion The new value for the LatestVersion property for this object.
     */
    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }
    
    /**
     * Sets the value of the LatestVersion property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param latestVersion The new value for the LatestVersion property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicySummary withLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * Returns the value of the TrafficPolicyCount property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The value of the TrafficPolicyCount property for this object.
     */
    public Integer getTrafficPolicyCount() {
        return trafficPolicyCount;
    }
    
    /**
     * Sets the value of the TrafficPolicyCount property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyCount The new value for the TrafficPolicyCount property for this object.
     */
    public void setTrafficPolicyCount(Integer trafficPolicyCount) {
        this.trafficPolicyCount = trafficPolicyCount;
    }
    
    /**
     * Sets the value of the TrafficPolicyCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param trafficPolicyCount The new value for the TrafficPolicyCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicySummary withTrafficPolicyCount(Integer trafficPolicyCount) {
        this.trafficPolicyCount = trafficPolicyCount;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getLatestVersion() != null) sb.append("LatestVersion: " + getLatestVersion() + ",");
        if (getTrafficPolicyCount() != null) sb.append("TrafficPolicyCount: " + getTrafficPolicyCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getLatestVersion() == null) ? 0 : getLatestVersion().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyCount() == null) ? 0 : getTrafficPolicyCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrafficPolicySummary == false) return false;
        TrafficPolicySummary other = (TrafficPolicySummary)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getLatestVersion() == null ^ this.getLatestVersion() == null) return false;
        if (other.getLatestVersion() != null && other.getLatestVersion().equals(this.getLatestVersion()) == false) return false; 
        if (other.getTrafficPolicyCount() == null ^ this.getTrafficPolicyCount() == null) return false;
        if (other.getTrafficPolicyCount() != null && other.getTrafficPolicyCount().equals(this.getTrafficPolicyCount()) == false) return false; 
        return true;
    }
    
    @Override
    public TrafficPolicySummary clone() {
        try {
            return (TrafficPolicySummary) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    