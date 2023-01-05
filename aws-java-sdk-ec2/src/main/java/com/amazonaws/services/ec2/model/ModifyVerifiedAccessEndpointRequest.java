/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.ModifyVerifiedAccessEndpointRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVerifiedAccessEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVerifiedAccessEndpointRequest> {

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private String verifiedAccessEndpointId;
    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     */
    private String verifiedAccessGroupId;
    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     */
    private ModifyVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions;
    /**
     * <p>
     * The network interface options.
     * </p>
     */
    private ModifyVerifiedAccessEndpointEniOptions networkInterfaceOptions;
    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     */

    public void setVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        this.verifiedAccessEndpointId = verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access endpoint.
     */

    public String getVerifiedAccessEndpointId() {
        return this.verifiedAccessEndpointId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param verifiedAccessEndpointId
     *        The ID of the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointRequest withVerifiedAccessEndpointId(String verifiedAccessEndpointId) {
        setVerifiedAccessEndpointId(verifiedAccessEndpointId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Amazon Web Services Verified Access group.
     */

    public void setVerifiedAccessGroupId(String verifiedAccessGroupId) {
        this.verifiedAccessGroupId = verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Verified Access group.
     */

    public String getVerifiedAccessGroupId() {
        return this.verifiedAccessGroupId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Verified Access group.
     * </p>
     * 
     * @param verifiedAccessGroupId
     *        The ID of the Amazon Web Services Verified Access group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointRequest withVerifiedAccessGroupId(String verifiedAccessGroupId) {
        setVerifiedAccessGroupId(verifiedAccessGroupId);
        return this;
    }

    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     * 
     * @param loadBalancerOptions
     *        The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     *        <code>load-balancer</code>type.
     */

    public void setLoadBalancerOptions(ModifyVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions) {
        this.loadBalancerOptions = loadBalancerOptions;
    }

    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     * 
     * @return The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     *         <code>load-balancer</code>type.
     */

    public ModifyVerifiedAccessEndpointLoadBalancerOptions getLoadBalancerOptions() {
        return this.loadBalancerOptions;
    }

    /**
     * <p>
     * The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     * <code>load-balancer</code>type.
     * </p>
     * 
     * @param loadBalancerOptions
     *        The load balancer details if creating the Amazon Web Services Verified Access endpoint as
     *        <code>load-balancer</code>type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointRequest withLoadBalancerOptions(ModifyVerifiedAccessEndpointLoadBalancerOptions loadBalancerOptions) {
        setLoadBalancerOptions(loadBalancerOptions);
        return this;
    }

    /**
     * <p>
     * The network interface options.
     * </p>
     * 
     * @param networkInterfaceOptions
     *        The network interface options.
     */

    public void setNetworkInterfaceOptions(ModifyVerifiedAccessEndpointEniOptions networkInterfaceOptions) {
        this.networkInterfaceOptions = networkInterfaceOptions;
    }

    /**
     * <p>
     * The network interface options.
     * </p>
     * 
     * @return The network interface options.
     */

    public ModifyVerifiedAccessEndpointEniOptions getNetworkInterfaceOptions() {
        return this.networkInterfaceOptions;
    }

    /**
     * <p>
     * The network interface options.
     * </p>
     * 
     * @param networkInterfaceOptions
     *        The network interface options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointRequest withNetworkInterfaceOptions(ModifyVerifiedAccessEndpointEniOptions networkInterfaceOptions) {
        setNetworkInterfaceOptions(networkInterfaceOptions);
        return this;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @return A description for the Amazon Web Services Verified Access endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the Amazon Web Services Verified Access endpoint.
     * </p>
     * 
     * @param description
     *        A description for the Amazon Web Services Verified Access endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @return A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *         Idempotency</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     *        Idempotency</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVerifiedAccessEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVerifiedAccessEndpointRequest> getDryRunRequest() {
        Request<ModifyVerifiedAccessEndpointRequest> request = new ModifyVerifiedAccessEndpointRequestMarshaller().marshall(this);
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
        if (getVerifiedAccessEndpointId() != null)
            sb.append("VerifiedAccessEndpointId: ").append(getVerifiedAccessEndpointId()).append(",");
        if (getVerifiedAccessGroupId() != null)
            sb.append("VerifiedAccessGroupId: ").append(getVerifiedAccessGroupId()).append(",");
        if (getLoadBalancerOptions() != null)
            sb.append("LoadBalancerOptions: ").append(getLoadBalancerOptions()).append(",");
        if (getNetworkInterfaceOptions() != null)
            sb.append("NetworkInterfaceOptions: ").append(getNetworkInterfaceOptions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof ModifyVerifiedAccessEndpointRequest == false)
            return false;
        ModifyVerifiedAccessEndpointRequest other = (ModifyVerifiedAccessEndpointRequest) obj;
        if (other.getVerifiedAccessEndpointId() == null ^ this.getVerifiedAccessEndpointId() == null)
            return false;
        if (other.getVerifiedAccessEndpointId() != null && other.getVerifiedAccessEndpointId().equals(this.getVerifiedAccessEndpointId()) == false)
            return false;
        if (other.getVerifiedAccessGroupId() == null ^ this.getVerifiedAccessGroupId() == null)
            return false;
        if (other.getVerifiedAccessGroupId() != null && other.getVerifiedAccessGroupId().equals(this.getVerifiedAccessGroupId()) == false)
            return false;
        if (other.getLoadBalancerOptions() == null ^ this.getLoadBalancerOptions() == null)
            return false;
        if (other.getLoadBalancerOptions() != null && other.getLoadBalancerOptions().equals(this.getLoadBalancerOptions()) == false)
            return false;
        if (other.getNetworkInterfaceOptions() == null ^ this.getNetworkInterfaceOptions() == null)
            return false;
        if (other.getNetworkInterfaceOptions() != null && other.getNetworkInterfaceOptions().equals(this.getNetworkInterfaceOptions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getVerifiedAccessEndpointId() == null) ? 0 : getVerifiedAccessEndpointId().hashCode());
        hashCode = prime * hashCode + ((getVerifiedAccessGroupId() == null) ? 0 : getVerifiedAccessGroupId().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerOptions() == null) ? 0 : getLoadBalancerOptions().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceOptions() == null) ? 0 : getNetworkInterfaceOptions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVerifiedAccessEndpointRequest clone() {
        return (ModifyVerifiedAccessEndpointRequest) super.clone();
    }
}
