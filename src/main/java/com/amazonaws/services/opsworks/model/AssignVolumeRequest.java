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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#assignVolume(AssignVolumeRequest) AssignVolume operation}.
 * <p>
 * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling
 * RegisterVolume. For more information, see <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/resources.html"> </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#assignVolume(AssignVolumeRequest)
 */
public class AssignVolumeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The volume ID.
     */
    private String volumeId;

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * The volume ID.
     *
     * @return The volume ID.
     */
    public String getVolumeId() {
        return volumeId;
    }
    
    /**
     * The volume ID.
     *
     * @param volumeId The volume ID.
     */
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    
    /**
     * The volume ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeId The volume ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssignVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssignVolumeRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
        if (getVolumeId() != null) sb.append("VolumeId: " + getVolumeId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssignVolumeRequest == false) return false;
        AssignVolumeRequest other = (AssignVolumeRequest)obj;
        
        if (other.getVolumeId() == null ^ this.getVolumeId() == null) return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        return true;
    }
    
}
    