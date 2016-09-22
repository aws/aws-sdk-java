/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.CreateVpcEndpointRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CreateVpcEndpoint.
 * </p>
 */
public class CreateVpcEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CreateVpcEndpointRequest> {

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The AWS service name, in the form <code>com.amazonaws.<i>region</i>.<i>service</i> </code>. To get a list of
     * available services, use the <a>DescribeVpcEndpointServices</a> request.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * A policy to attach to the endpoint that controls access to the service. The policy must be in valid JSON format.
     * If this parameter is not specified, we attach a default policy that allows full access to the service.
     * </p>
     */
    private String policyDocument;
    /**
     * <p>
     * One or more route table IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> routeTableIds;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the endpoint will be used.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     * 
     * @return The ID of the VPC in which the endpoint will be used.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC in which the endpoint will be used.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC in which the endpoint will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The AWS service name, in the form <code>com.amazonaws.<i>region</i>.<i>service</i> </code>. To get a list of
     * available services, use the <a>DescribeVpcEndpointServices</a> request.
     * </p>
     * 
     * @param serviceName
     *        The AWS service name, in the form <code>com.amazonaws.<i>region</i>.<i>service</i> </code>. To get a list
     *        of available services, use the <a>DescribeVpcEndpointServices</a> request.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The AWS service name, in the form <code>com.amazonaws.<i>region</i>.<i>service</i> </code>. To get a list of
     * available services, use the <a>DescribeVpcEndpointServices</a> request.
     * </p>
     * 
     * @return The AWS service name, in the form <code>com.amazonaws.<i>region</i>.<i>service</i> </code>. To get a list
     *         of available services, use the <a>DescribeVpcEndpointServices</a> request.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The AWS service name, in the form <code>com.amazonaws.<i>region</i>.<i>service</i> </code>. To get a list of
     * available services, use the <a>DescribeVpcEndpointServices</a> request.
     * </p>
     * 
     * @param serviceName
     *        The AWS service name, in the form <code>com.amazonaws.<i>region</i>.<i>service</i> </code>. To get a list
     *        of available services, use the <a>DescribeVpcEndpointServices</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
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

    public CreateVpcEndpointRequest withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
        return this;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * 
     * @return One or more route table IDs.
     */

    public java.util.List<String> getRouteTableIds() {
        if (routeTableIds == null) {
            routeTableIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return routeTableIds;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route table IDs.
     */

    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new com.amazonaws.internal.SdkInternalList<String>(routeTableIds);
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route table IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withRouteTableIds(String... routeTableIds) {
        if (this.routeTableIds == null) {
            setRouteTableIds(new com.amazonaws.internal.SdkInternalList<String>(routeTableIds.length));
        }
        for (String ele : routeTableIds) {
            this.routeTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more route table IDs.
     * </p>
     * 
     * @param routeTableIds
     *        One or more route table IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpcEndpointRequest> getDryRunRequest() {
        Request<CreateVpcEndpointRequest> request = new CreateVpcEndpointRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getServiceName() != null)
            sb.append("ServiceName: " + getServiceName() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: " + getRouteTableIds() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcEndpointRequest == false)
            return false;
        CreateVpcEndpointRequest other = (CreateVpcEndpointRequest) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
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
    public CreateVpcEndpointRequest clone() {
        return (CreateVpcEndpointRequest) super.clone();
    }
}
