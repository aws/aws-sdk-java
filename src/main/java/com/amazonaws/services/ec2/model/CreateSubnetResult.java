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
 * 
 * </p>
 */
public class CreateSubnetResult implements Serializable {

    /**
     * 
     */
    private Subnet subnet;

    /**
     * 
     *
     * @return 
     */
    public Subnet getSubnet() {
        return subnet;
    }
    
    /**
     * 
     *
     * @param subnet 
     */
    public void setSubnet(Subnet subnet) {
        this.subnet = subnet;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subnet 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateSubnetResult withSubnet(Subnet subnet) {
        this.subnet = subnet;
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
        if (getSubnet() != null) sb.append("Subnet: " + getSubnet() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubnet() == null) ? 0 : getSubnet().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateSubnetResult == false) return false;
        CreateSubnetResult other = (CreateSubnetResult)obj;
        
        if (other.getSubnet() == null ^ this.getSubnet() == null) return false;
        if (other.getSubnet() != null && other.getSubnet().equals(this.getSubnet()) == false) return false; 
        return true;
    }
    
}
    