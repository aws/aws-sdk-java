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
import com.amazonaws.services.ec2.model.transform.ModifyVpcEndpointServiceConfigurationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointServiceConfigurationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVpcEndpointServiceConfigurationRequest> {

    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * Indicate whether requests to create an endpoint to your service must be accepted.
     * </p>
     */
    private Boolean acceptanceRequired;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addNetworkLoadBalancerArns;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeNetworkLoadBalancerArns;

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * Indicate whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicate whether requests to create an endpoint to your service must be accepted.
     */

    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicate whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @return Indicate whether requests to create an endpoint to your service must be accepted.
     */

    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Indicate whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicate whether requests to create an endpoint to your service must be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withAcceptanceRequired(Boolean acceptanceRequired) {
        setAcceptanceRequired(acceptanceRequired);
        return this;
    }

    /**
     * <p>
     * Indicate whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @return Indicate whether requests to create an endpoint to your service must be accepted.
     */

    public Boolean isAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     */

    public java.util.List<String> getAddNetworkLoadBalancerArns() {
        if (addNetworkLoadBalancerArns == null) {
            addNetworkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addNetworkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     * </p>
     * 
     * @param addNetworkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     */

    public void setAddNetworkLoadBalancerArns(java.util.Collection<String> addNetworkLoadBalancerArns) {
        if (addNetworkLoadBalancerArns == null) {
            this.addNetworkLoadBalancerArns = null;
            return;
        }

        this.addNetworkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>(addNetworkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddNetworkLoadBalancerArns(java.util.Collection)} or
     * {@link #withAddNetworkLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param addNetworkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withAddNetworkLoadBalancerArns(String... addNetworkLoadBalancerArns) {
        if (this.addNetworkLoadBalancerArns == null) {
            setAddNetworkLoadBalancerArns(new com.amazonaws.internal.SdkInternalList<String>(addNetworkLoadBalancerArns.length));
        }
        for (String ele : addNetworkLoadBalancerArns) {
            this.addNetworkLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     * </p>
     * 
     * @param addNetworkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Network Load Balancers to add to your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withAddNetworkLoadBalancerArns(java.util.Collection<String> addNetworkLoadBalancerArns) {
        setAddNetworkLoadBalancerArns(addNetworkLoadBalancerArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     */

    public java.util.List<String> getRemoveNetworkLoadBalancerArns() {
        if (removeNetworkLoadBalancerArns == null) {
            removeNetworkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeNetworkLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     * </p>
     * 
     * @param removeNetworkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     */

    public void setRemoveNetworkLoadBalancerArns(java.util.Collection<String> removeNetworkLoadBalancerArns) {
        if (removeNetworkLoadBalancerArns == null) {
            this.removeNetworkLoadBalancerArns = null;
            return;
        }

        this.removeNetworkLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>(removeNetworkLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveNetworkLoadBalancerArns(java.util.Collection)} or
     * {@link #withRemoveNetworkLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeNetworkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withRemoveNetworkLoadBalancerArns(String... removeNetworkLoadBalancerArns) {
        if (this.removeNetworkLoadBalancerArns == null) {
            setRemoveNetworkLoadBalancerArns(new com.amazonaws.internal.SdkInternalList<String>(removeNetworkLoadBalancerArns.length));
        }
        for (String ele : removeNetworkLoadBalancerArns) {
            this.removeNetworkLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     * </p>
     * 
     * @param removeNetworkLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Network Load Balancers to remove from your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withRemoveNetworkLoadBalancerArns(java.util.Collection<String> removeNetworkLoadBalancerArns) {
        setRemoveNetworkLoadBalancerArns(removeNetworkLoadBalancerArns);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcEndpointServiceConfigurationRequest> getDryRunRequest() {
        Request<ModifyVpcEndpointServiceConfigurationRequest> request = new ModifyVpcEndpointServiceConfigurationRequestMarshaller().marshall(this);
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: ").append(getAcceptanceRequired()).append(",");
        if (getAddNetworkLoadBalancerArns() != null)
            sb.append("AddNetworkLoadBalancerArns: ").append(getAddNetworkLoadBalancerArns()).append(",");
        if (getRemoveNetworkLoadBalancerArns() != null)
            sb.append("RemoveNetworkLoadBalancerArns: ").append(getRemoveNetworkLoadBalancerArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointServiceConfigurationRequest == false)
            return false;
        ModifyVpcEndpointServiceConfigurationRequest other = (ModifyVpcEndpointServiceConfigurationRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getAcceptanceRequired() == null ^ this.getAcceptanceRequired() == null)
            return false;
        if (other.getAcceptanceRequired() != null && other.getAcceptanceRequired().equals(this.getAcceptanceRequired()) == false)
            return false;
        if (other.getAddNetworkLoadBalancerArns() == null ^ this.getAddNetworkLoadBalancerArns() == null)
            return false;
        if (other.getAddNetworkLoadBalancerArns() != null && other.getAddNetworkLoadBalancerArns().equals(this.getAddNetworkLoadBalancerArns()) == false)
            return false;
        if (other.getRemoveNetworkLoadBalancerArns() == null ^ this.getRemoveNetworkLoadBalancerArns() == null)
            return false;
        if (other.getRemoveNetworkLoadBalancerArns() != null
                && other.getRemoveNetworkLoadBalancerArns().equals(this.getRemoveNetworkLoadBalancerArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode + ((getAddNetworkLoadBalancerArns() == null) ? 0 : getAddNetworkLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getRemoveNetworkLoadBalancerArns() == null) ? 0 : getRemoveNetworkLoadBalancerArns().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointServiceConfigurationRequest clone() {
        return (ModifyVpcEndpointServiceConfigurationRequest) super.clone();
    }
}
