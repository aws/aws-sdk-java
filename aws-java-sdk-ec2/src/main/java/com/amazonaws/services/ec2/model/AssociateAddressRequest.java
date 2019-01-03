/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.AssociateAddressRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateAddressRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<AssociateAddressRequest> {

    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     */
    private String allocationId;
    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance ID or
     * the network interface ID, but not both. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The Elastic IP address. This is required for EC2-Classic.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already
     * associated with an instance or network interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic,
     * therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated
     * with another resource.
     * </p>
     */
    private Boolean allowReassociation;
    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must specify
     * a network interface ID.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no private IP
     * address is specified, the Elastic IP address is associated with the primary private IP address.
     * </p>
     */
    private String privateIpAddress;

    /**
     * Default constructor for AssociateAddressRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public AssociateAddressRequest() {
    }

    /**
     * Constructs a new AssociateAddressRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param instanceId
     *        The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance
     *        ID or the network interface ID, but not both. The operation fails if you specify an instance ID unless
     *        exactly one network interface is attached.
     * @param publicIp
     *        The Elastic IP address. This is required for EC2-Classic.
     */
    public AssociateAddressRequest(String instanceId, String publicIp) {
        setInstanceId(instanceId);
        setPublicIp(publicIp);
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     */

    public void setAllocationId(String allocationId) {
        this.allocationId = allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     * 
     * @return [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     */

    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * <p>
     * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * </p>
     * 
     * @param allocationId
     *        [EC2-VPC] The allocation ID. This is required for EC2-VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAddressRequest withAllocationId(String allocationId) {
        setAllocationId(allocationId);
        return this;
    }

    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance ID or
     * the network interface ID, but not both. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance
     *        ID or the network interface ID, but not both. The operation fails if you specify an instance ID unless
     *        exactly one network interface is attached.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance ID or
     * the network interface ID, but not both. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @return The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the
     *         instance ID or the network interface ID, but not both. The operation fails if you specify an instance ID
     *         unless exactly one network interface is attached.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance ID or
     * the network interface ID, but not both. The operation fails if you specify an instance ID unless exactly one
     * network interface is attached.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance
     *        ID or the network interface ID, but not both. The operation fails if you specify an instance ID unless
     *        exactly one network interface is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAddressRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The Elastic IP address. This is required for EC2-Classic.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address. This is required for EC2-Classic.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address. This is required for EC2-Classic.
     * </p>
     * 
     * @return The Elastic IP address. This is required for EC2-Classic.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The Elastic IP address. This is required for EC2-Classic.
     * </p>
     * 
     * @param publicIp
     *        The Elastic IP address. This is required for EC2-Classic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAddressRequest withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already
     * associated with an instance or network interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic,
     * therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated
     * with another resource.
     * </p>
     * 
     * @param allowReassociation
     *        [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already
     *        associated with an instance or network interface to be reassociated with the specified instance or network
     *        interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is
     *        automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is
     *        already associated with another resource.
     */

    public void setAllowReassociation(Boolean allowReassociation) {
        this.allowReassociation = allowReassociation;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already
     * associated with an instance or network interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic,
     * therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated
     * with another resource.
     * </p>
     * 
     * @return [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is
     *         already associated with an instance or network interface to be reassociated with the specified instance
     *         or network interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation
     *         is automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is
     *         already associated with another resource.
     */

    public Boolean getAllowReassociation() {
        return this.allowReassociation;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already
     * associated with an instance or network interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic,
     * therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated
     * with another resource.
     * </p>
     * 
     * @param allowReassociation
     *        [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already
     *        associated with an instance or network interface to be reassociated with the specified instance or network
     *        interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is
     *        automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is
     *        already associated with another resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAddressRequest withAllowReassociation(Boolean allowReassociation) {
        setAllowReassociation(allowReassociation);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already
     * associated with an instance or network interface to be reassociated with the specified instance or network
     * interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic,
     * therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated
     * with another resource.
     * </p>
     * 
     * @return [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is
     *         already associated with an instance or network interface to be reassociated with the specified instance
     *         or network interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation
     *         is automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is
     *         already associated with another resource.
     */

    public Boolean isAllowReassociation() {
        return this.allowReassociation;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must specify
     * a network interface ID.
     * </p>
     * 
     * @param networkInterfaceId
     *        [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must
     *        specify a network interface ID.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must specify
     * a network interface ID.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must
     *         specify a network interface ID.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must specify
     * a network interface ID.
     * </p>
     * 
     * @param networkInterfaceId
     *        [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must
     *        specify a network interface ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAddressRequest withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no private IP
     * address is specified, the Elastic IP address is associated with the primary private IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no
     *        private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no private IP
     * address is specified, the Elastic IP address is associated with the primary private IP address.
     * </p>
     * 
     * @return [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no
     *         private IP address is specified, the Elastic IP address is associated with the primary private IP
     *         address.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no private IP
     * address is specified, the Elastic IP address is associated with the primary private IP address.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no
     *        private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateAddressRequest withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<AssociateAddressRequest> getDryRunRequest() {
        Request<AssociateAddressRequest> request = new AssociateAddressRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAllocationId() != null)
            sb.append("AllocationId: ").append(getAllocationId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getAllowReassociation() != null)
            sb.append("AllowReassociation: ").append(getAllowReassociation()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateAddressRequest == false)
            return false;
        AssociateAddressRequest other = (AssociateAddressRequest) obj;
        if (other.getAllocationId() == null ^ this.getAllocationId() == null)
            return false;
        if (other.getAllocationId() != null && other.getAllocationId().equals(this.getAllocationId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getAllowReassociation() == null ^ this.getAllowReassociation() == null)
            return false;
        if (other.getAllowReassociation() != null && other.getAllowReassociation().equals(this.getAllowReassociation()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocationId() == null) ? 0 : getAllocationId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getAllowReassociation() == null) ? 0 : getAllowReassociation().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public AssociateAddressRequest clone() {
        return (AssociateAddressRequest) super.clone();
    }
}
