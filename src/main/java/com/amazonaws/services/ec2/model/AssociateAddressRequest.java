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
import com.amazonaws.services.ec2.model.transform.AssociateAddressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#associateAddress(AssociateAddressRequest) AssociateAddress operation}.
 * <p>
 * The AssociateAddress operation associates an elastic IP address with an instance.
 * </p>
 * <p>
 * If the IP address is currently assigned to another instance, the IP address is assigned to the new instance. This is an idempotent operation. If you
 * enter it more than once, Amazon EC2 does not return an error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#associateAddress(AssociateAddressRequest)
 */
public class AssociateAddressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AssociateAddressRequest> {

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

    private String privateIpAddress;

    private Boolean allowReassociation;

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
        setInstanceId(instanceId);
        setPublicIp(publicIp);
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
     * Returns the value of the PrivateIpAddress property for this object.
     *
     * @return The value of the PrivateIpAddress property for this object.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * Sets the value of the PrivateIpAddress property for this object.
     *
     * @param privateIpAddress The new value for the PrivateIpAddress property for this object.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * Sets the value of the PrivateIpAddress property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress The new value for the PrivateIpAddress property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Returns the value of the AllowReassociation property for this object.
     *
     * @return The value of the AllowReassociation property for this object.
     */
    public Boolean isAllowReassociation() {
        return allowReassociation;
    }
    
    /**
     * Sets the value of the AllowReassociation property for this object.
     *
     * @param allowReassociation The new value for the AllowReassociation property for this object.
     */
    public void setAllowReassociation(Boolean allowReassociation) {
        this.allowReassociation = allowReassociation;
    }
    
    /**
     * Sets the value of the AllowReassociation property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowReassociation The new value for the AllowReassociation property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withAllowReassociation(Boolean allowReassociation) {
        this.allowReassociation = allowReassociation;
        return this;
    }

    /**
     * Returns the value of the AllowReassociation property for this object.
     *
     * @return The value of the AllowReassociation property for this object.
     */
    public Boolean getAllowReassociation() {
        return allowReassociation;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<AssociateAddressRequest> getDryRunRequest() {
        Request<AssociateAddressRequest> request = new AssociateAddressRequestMarshaller().marshall(this);
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() + ",");
        if (getAllocationId() != null) sb.append("AllocationId: " + getAllocationId() + ",");
        if (getNetworkInterfaceId() != null) sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getPrivateIpAddress() != null) sb.append("PrivateIpAddress: " + getPrivateIpAddress() + ",");
        if (isAllowReassociation() != null) sb.append("AllowReassociation: " + isAllowReassociation() );
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
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode()); 
        hashCode = prime * hashCode + ((isAllowReassociation() == null) ? 0 : isAllowReassociation().hashCode()); 
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
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null) return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false) return false; 
        if (other.isAllowReassociation() == null ^ this.isAllowReassociation() == null) return false;
        if (other.isAllowReassociation() != null && other.isAllowReassociation().equals(this.isAllowReassociation()) == false) return false; 
        return true;
    }
    
}
    