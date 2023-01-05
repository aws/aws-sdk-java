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
import com.amazonaws.services.ec2.model.transform.ModifyVpcEndpointServicePayerResponsibilityRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyVpcEndpointServicePayerResponsibilityRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyVpcEndpointServicePayerResponsibilityRequest> {

    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer
     * responsibility to the service owner, you cannot set it back to the endpoint owner.
     * </p>
     */
    private String payerResponsibility;

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

    public ModifyVpcEndpointServicePayerResponsibilityRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer
     * responsibility to the service owner, you cannot set it back to the endpoint owner.
     * </p>
     * 
     * @param payerResponsibility
     *        The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the
     *        payer responsibility to the service owner, you cannot set it back to the endpoint owner.
     * @see PayerResponsibility
     */

    public void setPayerResponsibility(String payerResponsibility) {
        this.payerResponsibility = payerResponsibility;
    }

    /**
     * <p>
     * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer
     * responsibility to the service owner, you cannot set it back to the endpoint owner.
     * </p>
     * 
     * @return The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the
     *         payer responsibility to the service owner, you cannot set it back to the endpoint owner.
     * @see PayerResponsibility
     */

    public String getPayerResponsibility() {
        return this.payerResponsibility;
    }

    /**
     * <p>
     * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer
     * responsibility to the service owner, you cannot set it back to the endpoint owner.
     * </p>
     * 
     * @param payerResponsibility
     *        The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the
     *        payer responsibility to the service owner, you cannot set it back to the endpoint owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayerResponsibility
     */

    public ModifyVpcEndpointServicePayerResponsibilityRequest withPayerResponsibility(String payerResponsibility) {
        setPayerResponsibility(payerResponsibility);
        return this;
    }

    /**
     * <p>
     * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer
     * responsibility to the service owner, you cannot set it back to the endpoint owner.
     * </p>
     * 
     * @param payerResponsibility
     *        The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the
     *        payer responsibility to the service owner, you cannot set it back to the endpoint owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PayerResponsibility
     */

    public ModifyVpcEndpointServicePayerResponsibilityRequest withPayerResponsibility(PayerResponsibility payerResponsibility) {
        this.payerResponsibility = payerResponsibility.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyVpcEndpointServicePayerResponsibilityRequest> getDryRunRequest() {
        Request<ModifyVpcEndpointServicePayerResponsibilityRequest> request = new ModifyVpcEndpointServicePayerResponsibilityRequestMarshaller().marshall(this);
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
        if (getPayerResponsibility() != null)
            sb.append("PayerResponsibility: ").append(getPayerResponsibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyVpcEndpointServicePayerResponsibilityRequest == false)
            return false;
        ModifyVpcEndpointServicePayerResponsibilityRequest other = (ModifyVpcEndpointServicePayerResponsibilityRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getPayerResponsibility() == null ^ this.getPayerResponsibility() == null)
            return false;
        if (other.getPayerResponsibility() != null && other.getPayerResponsibility().equals(this.getPayerResponsibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getPayerResponsibility() == null) ? 0 : getPayerResponsibility().hashCode());
        return hashCode;
    }

    @Override
    public ModifyVpcEndpointServicePayerResponsibilityRequest clone() {
        return (ModifyVpcEndpointServicePayerResponsibilityRequest) super.clone();
    }
}
