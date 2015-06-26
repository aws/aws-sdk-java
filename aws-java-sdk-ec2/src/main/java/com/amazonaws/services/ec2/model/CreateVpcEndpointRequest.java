/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.CreateVpcEndpointRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createVpcEndpoint(CreateVpcEndpointRequest) CreateVpcEndpoint operation}.
 * <p>
 * Creates a VPC endpoint for a specified AWS service. An endpoint
 * enables you to create a private connection between your VPC and
 * another AWS service in your account. You can specify an endpoint
 * policy to attach to the endpoint that will control access to the
 * service from your VPC. You can also specify the VPC route tables that
 * use the endpoint.
 * </p>
 * <p>
 * Currently, only endpoints to Amazon S3 are supported.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createVpcEndpoint(CreateVpcEndpointRequest)
 */
public class CreateVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVpcEndpointRequest> {

    /**
     * The ID of the VPC in which the endpoint will be used.
     */
    private String vpcId;

    /**
     * The AWS service name, in the form com.amazonaws.<region>.<service>. To
     * get a list of available services, use the DescribeVpcEndpointServices
     * request.
     */
    private String serviceName;

    /**
     * A policy to attach to the endpoint that controls access to the
     * service. The policy must be in valid JSON format. If this parameter is
     * not specified, we attach a default policy that allows full access to
     * the service.
     */
    private String policyDocument;

    /**
     * One or more route table IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIds;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     */
    private String clientToken;

    /**
     * The ID of the VPC in which the endpoint will be used.
     *
     * @return The ID of the VPC in which the endpoint will be used.
     */
    public String getVpcId() {
        return vpcId;
    }
    
    /**
     * The ID of the VPC in which the endpoint will be used.
     *
     * @param vpcId The ID of the VPC in which the endpoint will be used.
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }
    
    /**
     * The ID of the VPC in which the endpoint will be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcId The ID of the VPC in which the endpoint will be used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * The AWS service name, in the form com.amazonaws.<region>.<service>. To
     * get a list of available services, use the DescribeVpcEndpointServices
     * request.
     *
     * @return The AWS service name, in the form com.amazonaws.<region>.<service>. To
     *         get a list of available services, use the DescribeVpcEndpointServices
     *         request.
     */
    public String getServiceName() {
        return serviceName;
    }
    
    /**
     * The AWS service name, in the form com.amazonaws.<region>.<service>. To
     * get a list of available services, use the DescribeVpcEndpointServices
     * request.
     *
     * @param serviceName The AWS service name, in the form com.amazonaws.<region>.<service>. To
     *         get a list of available services, use the DescribeVpcEndpointServices
     *         request.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    
    /**
     * The AWS service name, in the form com.amazonaws.<region>.<service>. To
     * get a list of available services, use the DescribeVpcEndpointServices
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceName The AWS service name, in the form com.amazonaws.<region>.<service>. To
     *         get a list of available services, use the DescribeVpcEndpointServices
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * A policy to attach to the endpoint that controls access to the
     * service. The policy must be in valid JSON format. If this parameter is
     * not specified, we attach a default policy that allows full access to
     * the service.
     *
     * @return A policy to attach to the endpoint that controls access to the
     *         service. The policy must be in valid JSON format. If this parameter is
     *         not specified, we attach a default policy that allows full access to
     *         the service.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * A policy to attach to the endpoint that controls access to the
     * service. The policy must be in valid JSON format. If this parameter is
     * not specified, we attach a default policy that allows full access to
     * the service.
     *
     * @param policyDocument A policy to attach to the endpoint that controls access to the
     *         service. The policy must be in valid JSON format. If this parameter is
     *         not specified, we attach a default policy that allows full access to
     *         the service.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * A policy to attach to the endpoint that controls access to the
     * service. The policy must be in valid JSON format. If this parameter is
     * not specified, we attach a default policy that allows full access to
     * the service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDocument A policy to attach to the endpoint that controls access to the
     *         service. The policy must be in valid JSON format. If this parameter is
     *         not specified, we attach a default policy that allows full access to
     *         the service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * One or more route table IDs.
     *
     * @return One or more route table IDs.
     */
    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
              routeTableIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              routeTableIds.setAutoConstruct(true);
        }
        return routeTableIds;
    }
    
    /**
     * One or more route table IDs.
     *
     * @param routeTableIds One or more route table IDs.
     */
    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(routeTableIds.size());
        routeTableIdsCopy.addAll(routeTableIds);
        this.routeTableIds = routeTableIdsCopy;
    }
    
    /**
     * One or more route table IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRouteTableIds(java.util.Collection)} or {@link
     * #withRouteTableIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route table IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointRequest withRouteTableIds(String... routeTableIds) {
        if (getRouteTableIds() == null) setRouteTableIds(new java.util.ArrayList<String>(routeTableIds.length));
        for (String value : routeTableIds) {
            getRouteTableIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more route table IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeTableIds One or more route table IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> routeTableIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(routeTableIds.size());
            routeTableIdsCopy.addAll(routeTableIds);
            this.routeTableIds = routeTableIdsCopy;
        }

        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     * to Ensure Idempotency</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How
     *         to Ensure Idempotency</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateVpcEndpointRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CreateVpcEndpointRequest> getDryRunRequest() {
        Request<CreateVpcEndpointRequest> request = new CreateVpcEndpointRequestMarshaller().marshall(this);
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
        if (getVpcId() != null) sb.append("VpcId: " + getVpcId() + ",");
        if (getServiceName() != null) sb.append("ServiceName: " + getServiceName() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getRouteTableIds() != null) sb.append("RouteTableIds: " + getRouteTableIds() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode()); 
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpcEndpointRequest == false) return false;
        CreateVpcEndpointRequest other = (CreateVpcEndpointRequest)obj;
        
        if (other.getVpcId() == null ^ this.getVpcId() == null) return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false) return false; 
        if (other.getServiceName() == null ^ this.getServiceName() == null) return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null) return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateVpcEndpointRequest clone() {
        
            return (CreateVpcEndpointRequest) super.clone();
    }

}
    