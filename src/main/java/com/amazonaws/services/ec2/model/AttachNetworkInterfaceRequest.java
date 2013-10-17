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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AttachNetworkInterfaceRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#attachNetworkInterface(AttachNetworkInterfaceRequest) AttachNetworkInterface operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#attachNetworkInterface(AttachNetworkInterfaceRequest)
 */
public class AttachNetworkInterfaceRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AttachNetworkInterfaceRequest> {

    private String networkInterfaceId;

    private String instanceId;

    private Integer deviceIndex;

    /**
     * Returns the value of the NetworkInterfaceId property for this object.
     *
     * @return The value of the NetworkInterfaceId property for this object.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * Sets the value of the NetworkInterfaceId property for this object.
     *
     * @param networkInterfaceId The new value for the NetworkInterfaceId property for this object.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * Sets the value of the NetworkInterfaceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId The new value for the NetworkInterfaceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachNetworkInterfaceRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * Returns the value of the InstanceId property for this object.
     *
     * @return The value of the InstanceId property for this object.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * Sets the value of the InstanceId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The new value for the InstanceId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachNetworkInterfaceRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Returns the value of the DeviceIndex property for this object.
     *
     * @return The value of the DeviceIndex property for this object.
     */
    public Integer getDeviceIndex() {
        return deviceIndex;
    }
    
    /**
     * Sets the value of the DeviceIndex property for this object.
     *
     * @param deviceIndex The new value for the DeviceIndex property for this object.
     */
    public void setDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
    }
    
    /**
     * Sets the value of the DeviceIndex property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deviceIndex The new value for the DeviceIndex property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AttachNetworkInterfaceRequest withDeviceIndex(Integer deviceIndex) {
        this.deviceIndex = deviceIndex;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AttachNetworkInterfaceRequest> getDryRunRequest() {
        Request<AttachNetworkInterfaceRequest> request = new AttachNetworkInterfaceRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDeviceIndex() != null) sb.append("DeviceIndex: " + getDeviceIndex() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getDeviceIndex() == null) ? 0 : getDeviceIndex().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AttachNetworkInterfaceRequest == false) return false;
        AttachNetworkInterfaceRequest other = (AttachNetworkInterfaceRequest)obj;
        
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getDeviceIndex() == null ^ this.getDeviceIndex() == null) return false;
        if (other.getDeviceIndex() != null && other.getDeviceIndex().equals(this.getDeviceIndex()) == false) return false; 
        return true;
    }
    
}
    