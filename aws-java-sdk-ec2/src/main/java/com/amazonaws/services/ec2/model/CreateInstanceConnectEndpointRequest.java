/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateInstanceConnectEndpointRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInstanceConnectEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateInstanceConnectEndpointRequest> {

    /**
     * <p>
     * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * One or more security groups to associate with the endpoint. If you don't specify a security group, the default
     * security group for your VPC will be associated with the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> securityGroupIds;
    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean preserveClientIp;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagSpecification> tagSpecifications;

    /**
     * <p>
     * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @return The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet in which to create the EC2 Instance Connect Endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * One or more security groups to associate with the endpoint. If you don't specify a security group, the default
     * security group for your VPC will be associated with the endpoint.
     * </p>
     * 
     * @return One or more security groups to associate with the endpoint. If you don't specify a security group, the
     *         default security group for your VPC will be associated with the endpoint.
     */

    public java.util.List<String> getSecurityGroupIds() {
        if (securityGroupIds == null) {
            securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return securityGroupIds;
    }

    /**
     * <p>
     * One or more security groups to associate with the endpoint. If you don't specify a security group, the default
     * security group for your VPC will be associated with the endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security groups to associate with the endpoint. If you don't specify a security group, the
     *        default security group for your VPC will be associated with the endpoint.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds);
    }

    /**
     * <p>
     * One or more security groups to associate with the endpoint. If you don't specify a security group, the default
     * security group for your VPC will be associated with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security groups to associate with the endpoint. If you don't specify a security group, the
     *        default security group for your VPC will be associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security groups to associate with the endpoint. If you don't specify a security group, the default
     * security group for your VPC will be associated with the endpoint.
     * </p>
     * 
     * @param securityGroupIds
     *        One or more security groups to associate with the endpoint. If you don't specify a security group, the
     *        default security group for your VPC will be associated with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param preserveClientIp
     *        Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *        <code>false</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>true</code>, your client's IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setPreserveClientIp(Boolean preserveClientIp) {
        this.preserveClientIp = preserveClientIp;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *         <code>false</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>true</code>, your client's IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getPreserveClientIp() {
        return this.preserveClientIp;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param preserveClientIp
     *        Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *        <code>false</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If <code>true</code>, your client's IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointRequest withPreserveClientIp(Boolean preserveClientIp) {
        setPreserveClientIp(preserveClientIp);
        return this;
    }

    /**
     * <p>
     * Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     * <code>false</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If <code>true</code>, your client's IP address is used when you connect to a resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates whether your client's IP address is preserved as the source. The value is <code>true</code> or
     *         <code>false</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If <code>true</code>, your client's IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If <code>false</code>, the elastic network interface IP address is used when you connect to a resource.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isPreserveClientIp() {
        return this.preserveClientIp;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     * </p>
     * 
     * @return The tags to apply to the EC2 Instance Connect Endpoint during creation.
     */

    public java.util.List<TagSpecification> getTagSpecifications() {
        if (tagSpecifications == null) {
            tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>();
        }
        return tagSpecifications;
    }

    /**
     * <p>
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the EC2 Instance Connect Endpoint during creation.
     */

    public void setTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        if (tagSpecifications == null) {
            this.tagSpecifications = null;
            return;
        }

        this.tagSpecifications = new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications);
    }

    /**
     * <p>
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagSpecifications(java.util.Collection)} or {@link #withTagSpecifications(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the EC2 Instance Connect Endpoint during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointRequest withTagSpecifications(TagSpecification... tagSpecifications) {
        if (this.tagSpecifications == null) {
            setTagSpecifications(new com.amazonaws.internal.SdkInternalList<TagSpecification>(tagSpecifications.length));
        }
        for (TagSpecification ele : tagSpecifications) {
            this.tagSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the EC2 Instance Connect Endpoint during creation.
     * </p>
     * 
     * @param tagSpecifications
     *        The tags to apply to the EC2 Instance Connect Endpoint during creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInstanceConnectEndpointRequest withTagSpecifications(java.util.Collection<TagSpecification> tagSpecifications) {
        setTagSpecifications(tagSpecifications);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateInstanceConnectEndpointRequest> getDryRunRequest() {
        Request<CreateInstanceConnectEndpointRequest> request = new CreateInstanceConnectEndpointRequestMarshaller().marshall(this);
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
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getPreserveClientIp() != null)
            sb.append("PreserveClientIp: ").append(getPreserveClientIp()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTagSpecifications() != null)
            sb.append("TagSpecifications: ").append(getTagSpecifications());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceConnectEndpointRequest == false)
            return false;
        CreateInstanceConnectEndpointRequest other = (CreateInstanceConnectEndpointRequest) obj;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getPreserveClientIp() == null ^ this.getPreserveClientIp() == null)
            return false;
        if (other.getPreserveClientIp() != null && other.getPreserveClientIp().equals(this.getPreserveClientIp()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTagSpecifications() == null ^ this.getTagSpecifications() == null)
            return false;
        if (other.getTagSpecifications() != null && other.getTagSpecifications().equals(this.getTagSpecifications()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPreserveClientIp() == null) ? 0 : getPreserveClientIp().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTagSpecifications() == null) ? 0 : getTagSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceConnectEndpointRequest clone() {
        return (CreateInstanceConnectEndpointRequest) super.clone();
    }
}
