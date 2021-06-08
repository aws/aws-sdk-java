/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     * </p>
     */
    private Boolean removePrivateDnsName;
    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be accepted.
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
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> addGatewayLoadBalancerArns;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> removeGatewayLoadBalancerArns;

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
     * (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
     * </p>
     * 
     * @param privateDnsName
     *        (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
     * </p>
     * 
     * @return (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
     * </p>
     * 
     * @param privateDnsName
     *        (Interface endpoint configuration) The private DNS name to assign to the endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     * </p>
     * 
     * @param removePrivateDnsName
     *        (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     */

    public void setRemovePrivateDnsName(Boolean removePrivateDnsName) {
        this.removePrivateDnsName = removePrivateDnsName;
    }

    /**
     * <p>
     * (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     * </p>
     * 
     * @return (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     */

    public Boolean getRemovePrivateDnsName() {
        return this.removePrivateDnsName;
    }

    /**
     * <p>
     * (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     * </p>
     * 
     * @param removePrivateDnsName
     *        (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withRemovePrivateDnsName(Boolean removePrivateDnsName) {
        setRemovePrivateDnsName(removePrivateDnsName);
        return this;
    }

    /**
     * <p>
     * (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     * </p>
     * 
     * @return (Interface endpoint configuration) Removes the private DNS name of the endpoint service.
     */

    public Boolean isRemovePrivateDnsName() {
        return this.removePrivateDnsName;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicates whether requests to create an endpoint to your service must be accepted.
     */

    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @return Indicates whether requests to create an endpoint to your service must be accepted.
     */

    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @param acceptanceRequired
     *        Indicates whether requests to create an endpoint to your service must be accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withAcceptanceRequired(Boolean acceptanceRequired) {
        setAcceptanceRequired(acceptanceRequired);
        return this;
    }

    /**
     * <p>
     * Indicates whether requests to create an endpoint to your service must be accepted.
     * </p>
     * 
     * @return Indicates whether requests to create an endpoint to your service must be accepted.
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
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     */

    public java.util.List<String> getAddGatewayLoadBalancerArns() {
        if (addGatewayLoadBalancerArns == null) {
            addGatewayLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return addGatewayLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     * </p>
     * 
     * @param addGatewayLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     */

    public void setAddGatewayLoadBalancerArns(java.util.Collection<String> addGatewayLoadBalancerArns) {
        if (addGatewayLoadBalancerArns == null) {
            this.addGatewayLoadBalancerArns = null;
            return;
        }

        this.addGatewayLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>(addGatewayLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddGatewayLoadBalancerArns(java.util.Collection)} or
     * {@link #withAddGatewayLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param addGatewayLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withAddGatewayLoadBalancerArns(String... addGatewayLoadBalancerArns) {
        if (this.addGatewayLoadBalancerArns == null) {
            setAddGatewayLoadBalancerArns(new com.amazonaws.internal.SdkInternalList<String>(addGatewayLoadBalancerArns.length));
        }
        for (String ele : addGatewayLoadBalancerArns) {
            this.addGatewayLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     * </p>
     * 
     * @param addGatewayLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Gateway Load Balancers to add to your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withAddGatewayLoadBalancerArns(java.util.Collection<String> addGatewayLoadBalancerArns) {
        setAddGatewayLoadBalancerArns(addGatewayLoadBalancerArns);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     */

    public java.util.List<String> getRemoveGatewayLoadBalancerArns() {
        if (removeGatewayLoadBalancerArns == null) {
            removeGatewayLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return removeGatewayLoadBalancerArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     * </p>
     * 
     * @param removeGatewayLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     */

    public void setRemoveGatewayLoadBalancerArns(java.util.Collection<String> removeGatewayLoadBalancerArns) {
        if (removeGatewayLoadBalancerArns == null) {
            this.removeGatewayLoadBalancerArns = null;
            return;
        }

        this.removeGatewayLoadBalancerArns = new com.amazonaws.internal.SdkInternalList<String>(removeGatewayLoadBalancerArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveGatewayLoadBalancerArns(java.util.Collection)} or
     * {@link #withRemoveGatewayLoadBalancerArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeGatewayLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withRemoveGatewayLoadBalancerArns(String... removeGatewayLoadBalancerArns) {
        if (this.removeGatewayLoadBalancerArns == null) {
            setRemoveGatewayLoadBalancerArns(new com.amazonaws.internal.SdkInternalList<String>(removeGatewayLoadBalancerArns.length));
        }
        for (String ele : removeGatewayLoadBalancerArns) {
            this.removeGatewayLoadBalancerArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     * </p>
     * 
     * @param removeGatewayLoadBalancerArns
     *        The Amazon Resource Names (ARNs) of Gateway Load Balancers to remove from your service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyVpcEndpointServiceConfigurationRequest withRemoveGatewayLoadBalancerArns(java.util.Collection<String> removeGatewayLoadBalancerArns) {
        setRemoveGatewayLoadBalancerArns(removeGatewayLoadBalancerArns);
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
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName()).append(",");
        if (getRemovePrivateDnsName() != null)
            sb.append("RemovePrivateDnsName: ").append(getRemovePrivateDnsName()).append(",");
        if (getAcceptanceRequired() != null)
            sb.append("AcceptanceRequired: ").append(getAcceptanceRequired()).append(",");
        if (getAddNetworkLoadBalancerArns() != null)
            sb.append("AddNetworkLoadBalancerArns: ").append(getAddNetworkLoadBalancerArns()).append(",");
        if (getRemoveNetworkLoadBalancerArns() != null)
            sb.append("RemoveNetworkLoadBalancerArns: ").append(getRemoveNetworkLoadBalancerArns()).append(",");
        if (getAddGatewayLoadBalancerArns() != null)
            sb.append("AddGatewayLoadBalancerArns: ").append(getAddGatewayLoadBalancerArns()).append(",");
        if (getRemoveGatewayLoadBalancerArns() != null)
            sb.append("RemoveGatewayLoadBalancerArns: ").append(getRemoveGatewayLoadBalancerArns());
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
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getRemovePrivateDnsName() == null ^ this.getRemovePrivateDnsName() == null)
            return false;
        if (other.getRemovePrivateDnsName() != null && other.getRemovePrivateDnsName().equals(this.getRemovePrivateDnsName()) == false)
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
        if (other.getAddGatewayLoadBalancerArns() == null ^ this.getAddGatewayLoadBalancerArns() == null)
            return false;
        if (other.getAddGatewayLoadBalancerArns() != null && other.getAddGatewayLoadBalancerArns().equals(this.getAddGatewayLoadBalancerArns()) == false)
            return false;
        if (other.getRemoveGatewayLoadBalancerArns() == null ^ this.getRemoveGatewayLoadBalancerArns() == null)
            return false;
        if (other.getRemoveGatewayLoadBalancerArns() != null
                && other.getRemoveGatewayLoadBalancerArns().equals(this.getRemoveGatewayLoadBalancerArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getRemovePrivateDnsName() == null) ? 0 : getRemovePrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getAcceptanceRequired() == null) ? 0 : getAcceptanceRequired().hashCode());
        hashCode = prime * hashCode + ((getAddNetworkLoadBalancerArns() == null) ? 0 : getAddNetworkLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getRemoveNetworkLoadBalancerArns() == null) ? 0 : getRemoveNetworkLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getAddGatewayLoadBalancerArns() == null) ? 0 : getAddGatewayLoadBalancerArns().hashCode());
        hashCode = prime * hashCode + ((getRemoveGatewayLoadBalancerArns() == null) ? 0 : getRemoveGatewayLoadBalancerArns().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointServiceConfigurationRequest clone() {
        return (ModifyVpcEndpointServiceConfigurationRequest) super.clone();
    }
}
