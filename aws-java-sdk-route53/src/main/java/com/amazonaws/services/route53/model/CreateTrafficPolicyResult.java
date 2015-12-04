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
 * <p>
 * A complex type that contains the response information for the
 * <code>CreateTrafficPolicy</code> request.
 * </p>
 */
public class CreateTrafficPolicyResult implements Serializable, Cloneable {

    /**
     * A complex type that contains settings for the new traffic policy.
     */
    private TrafficPolicy trafficPolicy;

    private String location;

    /**
     * A complex type that contains settings for the new traffic policy.
     *
     * @return A complex type that contains settings for the new traffic policy.
     */
    public TrafficPolicy getTrafficPolicy() {
        return trafficPolicy;
    }
    
    /**
     * A complex type that contains settings for the new traffic policy.
     *
     * @param trafficPolicy A complex type that contains settings for the new traffic policy.
     */
    public void setTrafficPolicy(TrafficPolicy trafficPolicy) {
        this.trafficPolicy = trafficPolicy;
    }
    
    /**
     * A complex type that contains settings for the new traffic policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param trafficPolicy A complex type that contains settings for the new traffic policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrafficPolicyResult withTrafficPolicy(TrafficPolicy trafficPolicy) {
        this.trafficPolicy = trafficPolicy;
        return this;
    }

    /**
     * Returns the value of the Location property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The value of the Location property for this object.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Sets the value of the Location property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param location The new value for the Location property for this object.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Sets the value of the Location property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param location The new value for the Location property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrafficPolicyResult withLocation(String location) {
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
        if (getTrafficPolicy() != null) sb.append("TrafficPolicy: " + getTrafficPolicy() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrafficPolicy() == null) ? 0 : getTrafficPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTrafficPolicyResult == false) return false;
        CreateTrafficPolicyResult other = (CreateTrafficPolicyResult)obj;
        
        if (other.getTrafficPolicy() == null ^ this.getTrafficPolicy() == null) return false;
        if (other.getTrafficPolicy() != null && other.getTrafficPolicy().equals(this.getTrafficPolicy()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateTrafficPolicyResult clone() {
        try {
            return (CreateTrafficPolicyResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    