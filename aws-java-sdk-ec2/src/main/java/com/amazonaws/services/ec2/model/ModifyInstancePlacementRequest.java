/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#modifyInstancePlacement(ModifyInstancePlacementRequest) ModifyInstancePlacement operation}.
 * <p>
 * Set the instance affinity value for a specific stopped instance and
 * modify the instance tenancy setting.
 * </p>
 * <p>
 * Instance affinity is disabled by default. When instance affinity is
 * <code>host</code> and it is not associated with a specific Dedicated
 * host, the next time it is launched it will automatically be associated
 * with the host it lands on. This relationship will persist if the
 * instance is stopped/started, or rebooted.
 * </p>
 * <p>
 * You can modify the host ID associated with a stopped instance. If a
 * stopped instance has a new host ID association, the instance will
 * target that host when restarted.
 * </p>
 * <p>
 * You can modify the tenancy of a stopped instance with a tenancy of
 * <code>host</code> or <code>dedicated</code> .
 * </p>
 * <p>
 * Affinity, hostID, and tenancy are not required parameters, but at
 * least one of them must be specified in the request. Affinity and
 * tenancy can be modified in the same request, but tenancy can only be
 * modified on instances that are stopped.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#modifyInstancePlacement(ModifyInstancePlacementRequest)
 */
public class ModifyInstancePlacementRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the instance that you are modifying.
     */
    private String instanceId;

    /**
     * The tenancy of the instance that you are modifying.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     */
    private String tenancy;

    /**
     * The new affinity setting for the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     */
    private String affinity;

    /**
     * The ID of the Dedicated host that the instance will have affinity
     * with.
     */
    private String hostId;

    /**
     * The ID of the instance that you are modifying.
     *
     * @return The ID of the instance that you are modifying.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance that you are modifying.
     *
     * @param instanceId The ID of the instance that you are modifying.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance that you are modifying.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance that you are modifying.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyInstancePlacementRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The tenancy of the instance that you are modifying.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @return The tenancy of the instance that you are modifying.
     *
     * @see HostTenancy
     */
    public String getTenancy() {
        return tenancy;
    }
    
    /**
     * The tenancy of the instance that you are modifying.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy The tenancy of the instance that you are modifying.
     *
     * @see HostTenancy
     */
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }
    
    /**
     * The tenancy of the instance that you are modifying.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy The tenancy of the instance that you are modifying.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see HostTenancy
     */
    public ModifyInstancePlacementRequest withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * The tenancy of the instance that you are modifying.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy The tenancy of the instance that you are modifying.
     *
     * @see HostTenancy
     */
    public void setTenancy(HostTenancy tenancy) {
        this.tenancy = tenancy.toString();
    }
    
    /**
     * The tenancy of the instance that you are modifying.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>dedicated, host
     *
     * @param tenancy The tenancy of the instance that you are modifying.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see HostTenancy
     */
    public ModifyInstancePlacementRequest withTenancy(HostTenancy tenancy) {
        this.tenancy = tenancy.toString();
        return this;
    }

    /**
     * The new affinity setting for the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @return The new affinity setting for the instance.
     *
     * @see Affinity
     */
    public String getAffinity() {
        return affinity;
    }
    
    /**
     * The new affinity setting for the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity The new affinity setting for the instance.
     *
     * @see Affinity
     */
    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }
    
    /**
     * The new affinity setting for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity The new affinity setting for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Affinity
     */
    public ModifyInstancePlacementRequest withAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * The new affinity setting for the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity The new affinity setting for the instance.
     *
     * @see Affinity
     */
    public void setAffinity(Affinity affinity) {
        this.affinity = affinity.toString();
    }
    
    /**
     * The new affinity setting for the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>default, host
     *
     * @param affinity The new affinity setting for the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Affinity
     */
    public ModifyInstancePlacementRequest withAffinity(Affinity affinity) {
        this.affinity = affinity.toString();
        return this;
    }

    /**
     * The ID of the Dedicated host that the instance will have affinity
     * with.
     *
     * @return The ID of the Dedicated host that the instance will have affinity
     *         with.
     */
    public String getHostId() {
        return hostId;
    }
    
    /**
     * The ID of the Dedicated host that the instance will have affinity
     * with.
     *
     * @param hostId The ID of the Dedicated host that the instance will have affinity
     *         with.
     */
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    
    /**
     * The ID of the Dedicated host that the instance will have affinity
     * with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostId The ID of the Dedicated host that the instance will have affinity
     *         with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ModifyInstancePlacementRequest withHostId(String hostId) {
        this.hostId = hostId;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTenancy() != null) sb.append("Tenancy: " + getTenancy() + ",");
        if (getAffinity() != null) sb.append("Affinity: " + getAffinity() + ",");
        if (getHostId() != null) sb.append("HostId: " + getHostId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getTenancy() == null) ? 0 : getTenancy().hashCode()); 
        hashCode = prime * hashCode + ((getAffinity() == null) ? 0 : getAffinity().hashCode()); 
        hashCode = prime * hashCode + ((getHostId() == null) ? 0 : getHostId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyInstancePlacementRequest == false) return false;
        ModifyInstancePlacementRequest other = (ModifyInstancePlacementRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getTenancy() == null ^ this.getTenancy() == null) return false;
        if (other.getTenancy() != null && other.getTenancy().equals(this.getTenancy()) == false) return false; 
        if (other.getAffinity() == null ^ this.getAffinity() == null) return false;
        if (other.getAffinity() != null && other.getAffinity().equals(this.getAffinity()) == false) return false; 
        if (other.getHostId() == null ^ this.getHostId() == null) return false;
        if (other.getHostId() != null && other.getHostId().equals(this.getHostId()) == false) return false; 
        return true;
    }
    
    @Override
    public ModifyInstancePlacementRequest clone() {
        
            return (ModifyInstancePlacementRequest) super.clone();
    }

}
    