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
 * The result of creating a new EBS volume.
 * </p>
 */
public class CreateVolumeResult implements Serializable {

    /**
     * The newly created EBS volume.
     */
    private Volume volume;

    /**
     * The newly created EBS volume.
     *
     * @return The newly created EBS volume.
     */
    public Volume getVolume() {
        return volume;
    }
    
    /**
     * The newly created EBS volume.
     *
     * @param volume The newly created EBS volume.
     */
    public void setVolume(Volume volume) {
        this.volume = volume;
    }
    
    /**
     * The newly created EBS volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volume The newly created EBS volume.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVolumeResult withVolume(Volume volume) {
        this.volume = volume;
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
        if (getVolume() != null) sb.append("Volume: " + getVolume() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolume() == null) ? 0 : getVolume().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVolumeResult == false) return false;
        CreateVolumeResult other = (CreateVolumeResult)obj;
        
        if (other.getVolume() == null ^ this.getVolume() == null) return false;
        if (other.getVolume() != null && other.getVolume().equals(this.getVolume()) == false) return false; 
        return true;
    }
    
}
    