/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#associateAddress(AssociateAddressRequest) AssociateAddress operation}.
 * <p>
 * The AssociateAddress operation associates an elastic IP address with
 * an instance.
 * </p>
 * <p>
 * If the IP address is currently assigned to another instance, the IP
 * address is assigned to the new instance. This is an idempotent
 * operation. If you enter it more than once, Amazon EC2 does not return
 * an error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#associateAddress(AssociateAddressRequest)
 */
public class AssociateAddressRequest extends AmazonWebServiceRequest {

    /**
     * The instance to associate with the IP address.
     */
    private String instanceId;

    /**
     * IP address that you are assigning to the instance.
     */
    private String publicIp;

    /**
     * The allocation ID that AWS returned when you allocated the elastic IP
     * address for use with Amazon VPC.
     */
    private String allocationId;

    private String networkInterfaceId;

    /**
     * Default constructor for a new AssociateAddressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public AssociateAddressRequest() {}
    
    /**
     * Constructs a new AssociateAddressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceId The instance to associate with the IP address.
     * @param publicIp IP address that you are assigning to the instance.
     */
    public AssociateAddressRequest(String instanceId, String publicIp) {
        this.instanceId = instanceId;
        this.publicIp = publicIp;
    }

    
    
    /**
     * The instance to associate with the IP address.
     *
     * @return The instance to associate with the IP address.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance to associate with the IP address.
     *
     * @param instanceId The instance to associate with the IP address.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance to associate with the IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance to associate with the IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateAddressRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * IP address that you are assigning to the instance.
     *
     * @return IP address that you are assigning to the instance.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * IP address that you are assigning to the instance.
     *
     * @param publicIp IP address that you are assigning to the instance.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * IP address that you are assigning to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp IP address that you are assigning to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    
    
    /**
     * The allocation ID that AWS returned when you allocated the elastic IP
     * address for use with Amazon VPC.
     *
     * @return The allocation ID that AWS returned when you allocated the elastic IP
     *         address for use with Amazon VPC.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * The allocation ID that AWS returned when you allocated the elastic IP
     * address for use with Amazon VPC.
     *
     * @param allocationId The allocation ID that AWS returned when you allocated the elastic IP
     *         address for use with Amazon VPC.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * The allocation ID that AWS returned when you allocated the elastic IP
     * address for use with Amazon VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId The allocation ID that AWS returned when you allocated the elastic IP
     *         address for use with Amazon VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateAddressRequest withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    
    
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
    public AssociateAddressRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
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
        if (instanceId != null) sb.append("InstanceId: " + instanceId + ", ");
        if (publicIp != null) sb.append("PublicIp: " + publicIp + ", ");
        if (allocationId != null) sb.append("AllocationId: " + allocationId + ", ");
        if (networkInterfaceId != null) sb.append("NetworkInterfaceId: " + networkInterfaceId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode()); 
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof AssociateAddressRequest == false) return false;
        AssociateAddressRequest other = (AssociateAddressRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        if (other.getAllocationId() == null ^ this.getAllocationId() == null) return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false) return false; 
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null) return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false) return false; 
        return true;
    }
    
}
    