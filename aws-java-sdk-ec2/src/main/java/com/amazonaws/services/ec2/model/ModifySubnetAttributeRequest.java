/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifySubnetAttribute(ModifySubnetAttributeRequest) ModifySubnetAttribute operation}.
 * <p>
 * Modifies a subnet attribute.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifySubnetAttribute(ModifySubnetAttributeRequest)
 */
public class ModifySubnetAttributeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the subnet.
     */
    private String subnetId;

    /**
     * The value to use when a resource attribute accepts a Boolean value.
     */
    private Boolean mapPublicIpOnLaunch;

    /**
     * The ID of the subnet.
     *
     * @return The ID of the subnet.
     */
    public String getSubnetId() {
        return subnetId;
    }
    
    /**
     * The ID of the subnet.
     *
     * @param subnetId The ID of the subnet.
     */
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    
    /**
     * The ID of the subnet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnetId The ID of the subnet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifySubnetAttributeRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The value to use when a resource attribute accepts a Boolean value.
     *
     * @return The value to use when a resource attribute accepts a Boolean value.
     */
    public Boolean isMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
    }
    
    /**
     * The value to use when a resource attribute accepts a Boolean value.
     *
     * @param mapPublicIpOnLaunch The value to use when a resource attribute accepts a Boolean value.
     */
    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }
    
    /**
     * The value to use when a resource attribute accepts a Boolean value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mapPublicIpOnLaunch The value to use when a resource attribute accepts a Boolean value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifySubnetAttributeRequest withMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        return this;
    }

    /**
     * The value to use when a resource attribute accepts a Boolean value.
     *
     * @return The value to use when a resource attribute accepts a Boolean value.
     */
    public Boolean getMapPublicIpOnLaunch() {
        return mapPublicIpOnLaunch;
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
        if (getSubnetId() != null) sb.append("SubnetId: " + getSubnetId() + ",");
        if (isMapPublicIpOnLaunch() != null) sb.append("MapPublicIpOnLaunch: " + isMapPublicIpOnLaunch() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode()); 
        hashCode = prime * hashCode + ((isMapPublicIpOnLaunch() == null) ? 0 : isMapPublicIpOnLaunch().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifySubnetAttributeRequest == false) return false;
        ModifySubnetAttributeRequest other = (ModifySubnetAttributeRequest)obj;
        
        if (other.getSubnetId() == null ^ this.getSubnetId() == null) return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false) return false; 
        if (other.isMapPublicIpOnLaunch() == null ^ this.isMapPublicIpOnLaunch() == null) return false;
        if (other.isMapPublicIpOnLaunch() != null && other.isMapPublicIpOnLaunch().equals(this.isMapPublicIpOnLaunch()) == false) return false; 
        return true;
    }
    
}
    