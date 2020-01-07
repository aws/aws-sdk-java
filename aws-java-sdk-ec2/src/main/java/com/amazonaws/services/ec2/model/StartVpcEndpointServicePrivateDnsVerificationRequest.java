/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.StartVpcEndpointServicePrivateDnsVerificationRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartVpcEndpointServicePrivateDnsVerificationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<StartVpcEndpointServicePrivateDnsVerificationRequest> {

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     */
    private String serviceId;

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @return The ID of the endpoint service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the endpoint service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the endpoint service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartVpcEndpointServicePrivateDnsVerificationRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<StartVpcEndpointServicePrivateDnsVerificationRequest> getDryRunRequest() {
        Request<StartVpcEndpointServicePrivateDnsVerificationRequest> request = new StartVpcEndpointServicePrivateDnsVerificationRequestMarshaller()
                .marshall(this);
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
            sb.append("ServiceId: ").append(getServiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartVpcEndpointServicePrivateDnsVerificationRequest == false)
            return false;
        StartVpcEndpointServicePrivateDnsVerificationRequest other = (StartVpcEndpointServicePrivateDnsVerificationRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        return hashCode;
    }

    @Override
    public StartVpcEndpointServicePrivateDnsVerificationRequest clone() {
        return (StartVpcEndpointServicePrivateDnsVerificationRequest) super.clone();
    }
}
