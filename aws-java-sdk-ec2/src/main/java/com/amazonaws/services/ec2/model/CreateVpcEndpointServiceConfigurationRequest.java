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
import com.amazonaws.services.ec2.model.transform.CreateVpcEndpointServiceConfigurationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVpcEndpointServiceConfigurationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CreateVpcEndpointServiceConfigurationRequest> {

    /**
     * <p>
     * Indicate whether requests from service consumers to create an endpoint to your service must be accepted. To
     * accept a request, use <a>AcceptVpcEndpointConnections</a>.
     * </p>
     */
    private Boolean acceptanceRequired;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkLoadBalancerArns;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Indicate whether requests from service consumers to create an endpoint to your service must be accepted. To
     * accept a request, use <a>AcceptVpcEndpointConnections</a>.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicate whether requests from service consumers to create an endpoint to your service must be accepted.
     *        To accept a request, use <a>AcceptVpcEndpointConnections</a>.
     */

    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicate whether requests from service consumers to create an endpoint to your service must be accepted. To
     * accept a request, use <a>AcceptVpcEndpointConnections</a>.
     * </p>
     * 
     * @return Indicate whether requests from service consumers to create an endpoint to your service must be accepted.
     *         To accept a request, use <a>AcceptVpcEndpointConnections</a>.
     */

    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Indicate whether requests from service consumers to create an endpoint to your service must be accepted. To
     * accept a request, use <a>AcceptVpcEndpointConnections</a>.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicate whether requests from service consumers to create an endpoint to your service must be accepted.
     *        To accept a request, use <a>AcceptVpcEndpointConnections</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointServiceConfigurationRequest withAcceptanceRequired(Boolean acceptanceRequired) {
        setAcceptanceRequired(acceptanceRequired);
        return this;
    }

    /**
     * <p>
     * Indicate whether requests from service consumers to create an endpoint to your service must be accepted. To
     * accept a request, use <a>AcceptVpcEndpointConnections</a>.
     * </p>
     * 
     * @return Indicate whether requests from service consumers to create an endpoint to your service must be accepted.
     *         To accept a request, use <a>AcceptVpcEndpointConnections</a>.
     */

    public Boolean isAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     */

    public java.util.List<String> getNetworkLoadBalancerArns() {
        if (networkLoadBalancerArns == null) {
            networkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     */

    public void setNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        if (networkLoadBalancerArns == null) {
            this.networkLoadBalancerArns = null;
            return;
        }

        this.networkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>(networkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkLoadBalancerArns(java.util.Collection)} or
     * {@link #withNetworkLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointServiceConfigurationRequest withNetworkLoadBalancerArns(String... networkLoadBalancerArns) {
        if (this.networkLoadBalancerArns == null) {
            setNetworkLoadBalancerArns(new com.amazonaws.internal.SdkInternalList<String>(networkLoadBalancerArns.length));
        }
        for (String ele : networkLoadBalancerArns) {
            this.networkLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     * </p>
     * 
     * @param networkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of one or more Network Load Balancers for your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointServiceConfigurationRequest withNetworkLoadBalancerArns(java.util.Collection<String> networkLoadBalancerArns) {
        setNetworkLoadBalancerArns(networkLoadBalancerArns);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to Ensure
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVpcEndpointServiceConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CreateVpcEndpointServiceConfigurationRequest> getDryRunRequest() {
        Request<CreateVpcEndpointServiceConfigurationRequest> request = new CreateVpcEndpointServiceConfigurationRequestMarshaller().marshall(this);
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
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: ").append(getAcceptanceRequired()).append(",");
        if (getNetworkLoadBalancerArns() != null)
            sb.append("NetworkLoadBalancerArns: ").append(getNetworkLoadBalancerArns()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVpcEndpointServiceConfigurationRequest == false)
            return false;
        CreateVpcEndpointServiceConfigurationRequest other = (CreateVpcEndpointServiceConfigurationRequest) obj;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getNetworkLoadBalancerArns() == null ^ this.getNetworkLoadBalancerArns() == null)
            return false;
        if (other.getNetworkLoadBalancerArns() != null && other.getNetworkLoadBalancerArns().equals(this.getNetworkLoadBalancerArns()) == false)
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

        hashCode = prime * hashCode + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode + ((getNetworkLoadBalancerArns() == null) ? 0 : getNetworkLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateVpcEndpointServiceConfigurationRequest clone() {
        return (CreateVpcEndpointServiceConfigurationRequest) super.clone();
    }
}
