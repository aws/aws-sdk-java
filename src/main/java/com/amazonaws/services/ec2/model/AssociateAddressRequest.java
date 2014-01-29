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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AssociateAddressRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#associateAddress(AssociateAddressRequest) AssociateAddress operation}.
 * <p>
 * Associates an Elastic IP address with an instance or a network interface.
 * </p>
 * <p>
 * An Elastic IP address is for use in either the EC2-Classic platform or in a VPC. For more information, see <a
 * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html"> Elastic IP Addresses </a> in the <i>Amazon Elastic Compute
 * Cloud User Guide</i> .
 * </p>
 * <p>
 * [EC2-Classic, default VPC] If the Elastic IP address is already associated with a different instance, it is disassociated from that instance and
 * associated with the specified instance.
 * </p>
 * <p>
 * [EC2-VPC] If you don't specify a private IP address, the Elastic IP address is associated with the primary IP address. If the Elastic IP address is
 * already associated with a different instance or a network interface, you get an error unless you allow reassociation.
 * </p>
 * <p>
 * This is an idempotent operation. If you perform the operation more than once, Amazon EC2 doesn't return an error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#associateAddress(AssociateAddressRequest)
 */
public class AssociateAddressRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<AssociateAddressRequest> {

    /**
     * The ID of the instance. The operation fails if you specify an instance
     * ID unless exactly one network interface is attached.
     */
    private String instanceId;

    /**
     * The Elastic IP address.
     */
    private String publicIp;

    /**
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     */
    private String allocationId;

    /**
     * [EC2-VPC] The ID of the network interface. If the instance has more
     * than one network interface, you must specify a network interface ID.
     */
    private String networkInterfaceId;

    /**
     * [EC2-VPC] The primary or secondary private IP address to associate
     * with the Elastic IP address. If no private IP address is specified,
     * the Elastic IP address is associated with the primary private IP
     * address.
     */
    private String privateIpAddress;

    /**
     * [EC2-VPC] Allows an Elastic IP address that is already associated with
     * an instance or network interface to be re-associated with the
     * specified instance or network interface. Otherwise, the operation
     * fails. <p>Default: <code>false</code>
     */
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
     * @param instanceId The ID of the instance. The operation fails if you
     * specify an instance ID unless exactly one network interface is
     * attached.
     * @param publicIp The Elastic IP address.
     */
    public AssociateAddressRequest(String instanceId, String publicIp) {
        setInstanceId(instanceId);
        setPublicIp(publicIp);
    }

    /**
     * The ID of the instance. The operation fails if you specify an instance
     * ID unless exactly one network interface is attached.
     *
     * @return The ID of the instance. The operation fails if you specify an instance
     *         ID unless exactly one network interface is attached.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance. The operation fails if you specify an instance
     * ID unless exactly one network interface is attached.
     *
     * @param instanceId The ID of the instance. The operation fails if you specify an instance
     *         ID unless exactly one network interface is attached.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance. The operation fails if you specify an instance
     * ID unless exactly one network interface is attached.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance. The operation fails if you specify an instance
     *         ID unless exactly one network interface is attached.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The Elastic IP address.
     *
     * @return The Elastic IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The Elastic IP address.
     *
     * @param publicIp The Elastic IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     *
     * @return [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     */
    public String getAllocationId() {
        return allocationId;
    }
    
    /**
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     *
     * @param allocationId [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     */
    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }
    
    /**
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocationId [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }

    /**
     * [EC2-VPC] The ID of the network interface. If the instance has more
     * than one network interface, you must specify a network interface ID.
     *
     * @return [EC2-VPC] The ID of the network interface. If the instance has more
     *         than one network interface, you must specify a network interface ID.
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }
    
    /**
     * [EC2-VPC] The ID of the network interface. If the instance has more
     * than one network interface, you must specify a network interface ID.
     *
     * @param networkInterfaceId [EC2-VPC] The ID of the network interface. If the instance has more
     *         than one network interface, you must specify a network interface ID.
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }
    
    /**
     * [EC2-VPC] The ID of the network interface. If the instance has more
     * than one network interface, you must specify a network interface ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param networkInterfaceId [EC2-VPC] The ID of the network interface. If the instance has more
     *         than one network interface, you must specify a network interface ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * [EC2-VPC] The primary or secondary private IP address to associate
     * with the Elastic IP address. If no private IP address is specified,
     * the Elastic IP address is associated with the primary private IP
     * address.
     *
     * @return [EC2-VPC] The primary or secondary private IP address to associate
     *         with the Elastic IP address. If no private IP address is specified,
     *         the Elastic IP address is associated with the primary private IP
     *         address.
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    
    /**
     * [EC2-VPC] The primary or secondary private IP address to associate
     * with the Elastic IP address. If no private IP address is specified,
     * the Elastic IP address is associated with the primary private IP
     * address.
     *
     * @param privateIpAddress [EC2-VPC] The primary or secondary private IP address to associate
     *         with the Elastic IP address. If no private IP address is specified,
     *         the Elastic IP address is associated with the primary private IP
     *         address.
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    
    /**
     * [EC2-VPC] The primary or secondary private IP address to associate
     * with the Elastic IP address. If no private IP address is specified,
     * the Elastic IP address is associated with the primary private IP
     * address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param privateIpAddress [EC2-VPC] The primary or secondary private IP address to associate
     *         with the Elastic IP address. If no private IP address is specified,
     *         the Elastic IP address is associated with the primary private IP
     *         address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * [EC2-VPC] Allows an Elastic IP address that is already associated with
     * an instance or network interface to be re-associated with the
     * specified instance or network interface. Otherwise, the operation
     * fails. <p>Default: <code>false</code>
     *
     * @return [EC2-VPC] Allows an Elastic IP address that is already associated with
     *         an instance or network interface to be re-associated with the
     *         specified instance or network interface. Otherwise, the operation
     *         fails. <p>Default: <code>false</code>
     */
    public Boolean isAllowReassociation() {
        return allowReassociation;
    }
    
    /**
     * [EC2-VPC] Allows an Elastic IP address that is already associated with
     * an instance or network interface to be re-associated with the
     * specified instance or network interface. Otherwise, the operation
     * fails. <p>Default: <code>false</code>
     *
     * @param allowReassociation [EC2-VPC] Allows an Elastic IP address that is already associated with
     *         an instance or network interface to be re-associated with the
     *         specified instance or network interface. Otherwise, the operation
     *         fails. <p>Default: <code>false</code>
     */
    public void setAllowReassociation(Boolean allowReassociation) {
        this.allowReassociation = allowReassociation;
    }
    
    /**
     * [EC2-VPC] Allows an Elastic IP address that is already associated with
     * an instance or network interface to be re-associated with the
     * specified instance or network interface. Otherwise, the operation
     * fails. <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowReassociation [EC2-VPC] Allows an Elastic IP address that is already associated with
     *         an instance or network interface to be re-associated with the
     *         specified instance or network interface. Otherwise, the operation
     *         fails. <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AssociateAddressRequest withAllowReassociation(Boolean allowReassociation) {
        this.allowReassociation = allowReassociation;
        return this;
    }

    /**
     * [EC2-VPC] Allows an Elastic IP address that is already associated with
     * an instance or network interface to be re-associated with the
     * specified instance or network interface. Otherwise, the operation
     * fails. <p>Default: <code>false</code>
     *
     * @return [EC2-VPC] Allows an Elastic IP address that is already associated with
     *         an instance or network interface to be re-associated with the
     *         specified instance or network interface. Otherwise, the operation
     *         fails. <p>Default: <code>false</code>
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
    