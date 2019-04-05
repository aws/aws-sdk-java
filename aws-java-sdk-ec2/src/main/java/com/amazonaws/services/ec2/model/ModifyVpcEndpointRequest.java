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
import com.amazonaws.services.ec2.model.transform.ModifyVpcEndpointRequestMarshaller;

/**
 * <p>
 * Contains the parameters for ModifyVpcEndpoint.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifyVpcEndpointRequest> {

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     */
    private String vpcEndpointId;
    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The default
     * policy allows full access to the service.
     * </p>
     */
    private Boolean resetPolicy;
    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
     * If this parameter is not specified, we attach a default policy that allows full access to the service.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addRouteTableIds;
    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeRouteTableIds;
    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addSubnetIds;
    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeSubnetIds;
    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addSecurityGroupIds;
    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeSecurityGroupIds;
    /**
     * <p>
     * (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     * </p>
     */
    private Boolean privateDnsEnabled;

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the endpoint.
     */

    public void setVpcEndpointId(String vpcEndpointId) {
        this.vpcEndpointId = vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @return The ID of the endpoint.
     */

    public String getVpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param vpcEndpointId
     *        The ID of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withVpcEndpointId(String vpcEndpointId) {
        setVpcEndpointId(vpcEndpointId);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The default
     * policy allows full access to the service.
     * </p>
     * 
     * @param resetPolicy
     *        (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The
     *        default policy allows full access to the service.
     */

    public void setResetPolicy(Boolean resetPolicy) {
        this.resetPolicy = resetPolicy;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The default
     * policy allows full access to the service.
     * </p>
     * 
     * @return (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The
     *         default policy allows full access to the service.
     */

    public Boolean getResetPolicy() {
        return this.resetPolicy;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The default
     * policy allows full access to the service.
     * </p>
     * 
     * @param resetPolicy
     *        (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The
     *        default policy allows full access to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withResetPolicy(Boolean resetPolicy) {
        setResetPolicy(resetPolicy);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The default
     * policy allows full access to the service.
     * </p>
     * 
     * @return (Gateway endpoint) Specify <code>true</code> to reset the policy document to the default policy. The
     *         default policy allows full access to the service.
     */

    public Boolean isResetPolicy() {
        return this.resetPolicy;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
     * If this parameter is not specified, we attach a default policy that allows full access to the service.
     * </p>
     * 
     * @param policyDocument
     *        A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON
     *        format. If this parameter is not specified, we attach a default policy that allows full access to the
     *        service.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
     * If this parameter is not specified, we attach a default policy that allows full access to the service.
     * </p>
     * 
     * @return A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON
     *         format. If this parameter is not specified, we attach a default policy that allows full access to the
     *         service.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
     * If this parameter is not specified, we attach a default policy that allows full access to the service.
     * </p>
     * 
     * @param policyDocument
     *        A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON
     *        format. If this parameter is not specified, we attach a default policy that allows full access to the
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     * </p>
     * 
     * @return (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     */

    public java.util.List<String> getAddRouteTableIds() {
        if (addRouteTableIds == null) {
            addRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addRouteTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     * </p>
     * 
     * @param addRouteTableIds
     *        (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     */

    public void setAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        if (addRouteTableIds == null) {
            this.addRouteTableIds = null;
            return;
        }

        this.addRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>(addRouteTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddRouteTableIds(java.util.Collection)} or {@link #withAddRouteTableIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param addRouteTableIds
     *        (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddRouteTableIds(String... addRouteTableIds) {
        if (this.addRouteTableIds == null) {
            setAddRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(addRouteTableIds.length));
        }
        for (String ele : addRouteTableIds) {
            this.addRouteTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     * </p>
     * 
     * @param addRouteTableIds
     *        (Gateway endpoint) One or more route tables IDs to associate with the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        setAddRouteTableIds(addRouteTableIds);
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     * </p>
     * 
     * @return (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     */

    public java.util.List<String> getRemoveRouteTableIds() {
        if (removeRouteTableIds == null) {
            removeRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeRouteTableIds;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     * </p>
     * 
     * @param removeRouteTableIds
     *        (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     */

    public void setRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        if (removeRouteTableIds == null) {
            this.removeRouteTableIds = null;
            return;
        }

        this.removeRouteTableIds = new com.amazonaws.internal.SdkInternalList<String>(removeRouteTableIds);
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveRouteTableIds(java.util.Collection)} or {@link #withRemoveRouteTableIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param removeRouteTableIds
     *        (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveRouteTableIds(String... removeRouteTableIds) {
        if (this.removeRouteTableIds == null) {
            setRemoveRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(removeRouteTableIds.length));
        }
        for (String ele : removeRouteTableIds) {
            this.removeRouteTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     * </p>
     * 
     * @param removeRouteTableIds
     *        (Gateway endpoint) One or more route table IDs to disassociate from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        setRemoveRouteTableIds(removeRouteTableIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     * </p>
     * 
     * @return (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     */

    public java.util.List<String> getAddSubnetIds() {
        if (addSubnetIds == null) {
            addSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addSubnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     * </p>
     * 
     * @param addSubnetIds
     *        (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     */

    public void setAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        if (addSubnetIds == null) {
            this.addSubnetIds = null;
            return;
        }

        this.addSubnetIds = new com.amazonaws.internal.SdkInternalList<String>(addSubnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddSubnetIds(java.util.Collection)} or {@link #withAddSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addSubnetIds
     *        (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddSubnetIds(String... addSubnetIds) {
        if (this.addSubnetIds == null) {
            setAddSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(addSubnetIds.length));
        }
        for (String ele : addSubnetIds) {
            this.addSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     * </p>
     * 
     * @param addSubnetIds
     *        (Interface endpoint) One or more subnet IDs in which to serve the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        setAddSubnetIds(addSubnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     * </p>
     * 
     * @return (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     */

    public java.util.List<String> getRemoveSubnetIds() {
        if (removeSubnetIds == null) {
            removeSubnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeSubnetIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     * </p>
     * 
     * @param removeSubnetIds
     *        (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     */

    public void setRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        if (removeSubnetIds == null) {
            this.removeSubnetIds = null;
            return;
        }

        this.removeSubnetIds = new com.amazonaws.internal.SdkInternalList<String>(removeSubnetIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveSubnetIds(java.util.Collection)} or {@link #withRemoveSubnetIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removeSubnetIds
     *        (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveSubnetIds(String... removeSubnetIds) {
        if (this.removeSubnetIds == null) {
            setRemoveSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(removeSubnetIds.length));
        }
        for (String ele : removeSubnetIds) {
            this.removeSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     * </p>
     * 
     * @param removeSubnetIds
     *        (Interface endpoint) One or more subnets IDs in which to remove the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        setRemoveSubnetIds(removeSubnetIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the network interface.
     * </p>
     * 
     * @return (Interface endpoint) One or more security group IDs to associate with the network interface.
     */

    public java.util.List<String> getAddSecurityGroupIds() {
        if (addSecurityGroupIds == null) {
            addSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addSecurityGroupIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the network interface.
     * </p>
     * 
     * @param addSecurityGroupIds
     *        (Interface endpoint) One or more security group IDs to associate with the network interface.
     */

    public void setAddSecurityGroupIds(java.util.Collection<String> addSecurityGroupIds) {
        if (addSecurityGroupIds == null) {
            this.addSecurityGroupIds = null;
            return;
        }

        this.addSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(addSecurityGroupIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddSecurityGroupIds(java.util.Collection)} or {@link #withAddSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param addSecurityGroupIds
     *        (Interface endpoint) One or more security group IDs to associate with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddSecurityGroupIds(String... addSecurityGroupIds) {
        if (this.addSecurityGroupIds == null) {
            setAddSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(addSecurityGroupIds.length));
        }
        for (String ele : addSecurityGroupIds) {
            this.addSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to associate with the network interface.
     * </p>
     * 
     * @param addSecurityGroupIds
     *        (Interface endpoint) One or more security group IDs to associate with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withAddSecurityGroupIds(java.util.Collection<String> addSecurityGroupIds) {
        setAddSecurityGroupIds(addSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     * </p>
     * 
     * @return (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     */

    public java.util.List<String> getRemoveSecurityGroupIds() {
        if (removeSecurityGroupIds == null) {
            removeSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeSecurityGroupIds;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     * </p>
     * 
     * @param removeSecurityGroupIds
     *        (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     */

    public void setRemoveSecurityGroupIds(java.util.Collection<String> removeSecurityGroupIds) {
        if (removeSecurityGroupIds == null) {
            this.removeSecurityGroupIds = null;
            return;
        }

        this.removeSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(removeSecurityGroupIds);
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveSecurityGroupIds(java.util.Collection)} or
     * {@link #withRemoveSecurityGroupIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeSecurityGroupIds
     *        (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveSecurityGroupIds(String... removeSecurityGroupIds) {
        if (this.removeSecurityGroupIds == null) {
            setRemoveSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(removeSecurityGroupIds.length));
        }
        for (String ele : removeSecurityGroupIds) {
            this.removeSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     * </p>
     * 
     * @param removeSecurityGroupIds
     *        (Interface endpoint) One or more security group IDs to disassociate from the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withRemoveSecurityGroupIds(java.util.Collection<String> removeSecurityGroupIds) {
        setRemoveSecurityGroupIds(removeSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     * </p>
     * 
     * @param privateDnsEnabled
     *        (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     */

    public void setPrivateDnsEnabled(Boolean privateDnsEnabled) {
        this.privateDnsEnabled = privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     * </p>
     * 
     * @return (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     */

    public Boolean getPrivateDnsEnabled() {
        return this.privateDnsEnabled;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     * </p>
     * 
     * @param privateDnsEnabled
     *        (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointRequest withPrivateDnsEnabled(Boolean privateDnsEnabled) {
        setPrivateDnsEnabled(privateDnsEnabled);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     * </p>
     * 
     * @return (Interface endpoint) Indicate whether a private hosted zone is associated with the VPC.
     */

    public Boolean isPrivateDnsEnabled() {
        return this.privateDnsEnabled;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcEndpointRequest> getDryRunRequest() {
        Request<ModifyVpcEndpointRequest> request = new ModifyVpcEndpointRequestMarshaller().marshall(this);
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
        if (getVpcEndpointId() != null)
            sb.append("VpcEndpointId: ").append(getVpcEndpointId()).append(",");
        if (getResetPolicy() != null)
            sb.append("ResetPolicy: ").append(getResetPolicy()).append(",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: ").append(getPolicyDocument()).append(",");
        if (getAddRouteTableIds() != null)
            sb.append("AddRouteTableIds: ").append(getAddRouteTableIds()).append(",");
        if (getRemoveRouteTableIds() != null)
            sb.append("RemoveRouteTableIds: ").append(getRemoveRouteTableIds()).append(",");
        if (getAddSubnetIds() != null)
            sb.append("AddSubnetIds: ").append(getAddSubnetIds()).append(",");
        if (getRemoveSubnetIds() != null)
            sb.append("RemoveSubnetIds: ").append(getRemoveSubnetIds()).append(",");
        if (getAddSecurityGroupIds() != null)
            sb.append("AddSecurityGroupIds: ").append(getAddSecurityGroupIds()).append(",");
        if (getRemoveSecurityGroupIds() != null)
            sb.append("RemoveSecurityGroupIds: ").append(getRemoveSecurityGroupIds()).append(",");
        if (getPrivateDnsEnabled() != null)
            sb.append("PrivateDnsEnabled: ").append(getPrivateDnsEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointRequest == false)
            return false;
        ModifyVpcEndpointRequest other = (ModifyVpcEndpointRequest) obj;
        if (other.getVpcEndpointId() == null ^ this.getVpcEndpointId() == null)
            return false;
        if (other.getVpcEndpointId() != null && other.getVpcEndpointId().equals(this.getVpcEndpointId()) == false)
            return false;
        if (other.getResetPolicy() == null ^ this.getResetPolicy() == null)
            return false;
        if (other.getResetPolicy() != null && other.getResetPolicy().equals(this.getResetPolicy()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getAddRouteTableIds() == null ^ this.getAddRouteTableIds() == null)
            return false;
        if (other.getAddRouteTableIds() != null && other.getAddRouteTableIds().equals(this.getAddRouteTableIds()) == false)
            return false;
        if (other.getRemoveRouteTableIds() == null ^ this.getRemoveRouteTableIds() == null)
            return false;
        if (other.getRemoveRouteTableIds() != null && other.getRemoveRouteTableIds().equals(this.getRemoveRouteTableIds()) == false)
            return false;
        if (other.getAddSubnetIds() == null ^ this.getAddSubnetIds() == null)
            return false;
        if (other.getAddSubnetIds() != null && other.getAddSubnetIds().equals(this.getAddSubnetIds()) == false)
            return false;
        if (other.getRemoveSubnetIds() == null ^ this.getRemoveSubnetIds() == null)
            return false;
        if (other.getRemoveSubnetIds() != null && other.getRemoveSubnetIds().equals(this.getRemoveSubnetIds()) == false)
            return false;
        if (other.getAddSecurityGroupIds() == null ^ this.getAddSecurityGroupIds() == null)
            return false;
        if (other.getAddSecurityGroupIds() != null && other.getAddSecurityGroupIds().equals(this.getAddSecurityGroupIds()) == false)
            return false;
        if (other.getRemoveSecurityGroupIds() == null ^ this.getRemoveSecurityGroupIds() == null)
            return false;
        if (other.getRemoveSecurityGroupIds() != null && other.getRemoveSecurityGroupIds().equals(this.getRemoveSecurityGroupIds()) == false)
            return false;
        if (other.getPrivateDnsEnabled() == null ^ this.getPrivateDnsEnabled() == null)
            return false;
        if (other.getPrivateDnsEnabled() != null && other.getPrivateDnsEnabled().equals(this.getPrivateDnsEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcEndpointId() == null) ? 0 : getVpcEndpointId().hashCode());
        hashCode = prime * hashCode + ((getResetPolicy() == null) ? 0 : getResetPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode + ((getAddRouteTableIds() == null) ? 0 : getAddRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getRemoveRouteTableIds() == null) ? 0 : getRemoveRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getAddSubnetIds() == null) ? 0 : getAddSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getRemoveSubnetIds() == null) ? 0 : getRemoveSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getAddSecurityGroupIds() == null) ? 0 : getAddSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getRemoveSecurityGroupIds() == null) ? 0 : getRemoveSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsEnabled() == null) ? 0 : getPrivateDnsEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointRequest clone() {
        return (ModifyVpcEndpointRequest) super.clone();
    }
}
