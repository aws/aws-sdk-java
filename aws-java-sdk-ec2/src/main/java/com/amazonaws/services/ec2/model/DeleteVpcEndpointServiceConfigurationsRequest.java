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
import com.amazonaws.services.ec2.model.transform.DeleteVpcEndpointServiceConfigurationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVpcEndpointServiceConfigurationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteVpcEndpointServiceConfigurationsRequest> {

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceIds;

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * 
     * @return The IDs of one or more services.
     */

    public java.util.List<String> getServiceIds() {
        if (serviceIds == null) {
            serviceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceIds;
    }

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * 
     * @param serviceIds
     *        The IDs of one or more services.
     */

    public void setServiceIds(java.util.Collection<String> serviceIds) {
        if (serviceIds == null) {
            this.serviceIds = null;
            return;
        }

        this.serviceIds = new com.amazonaws.internal.SdkInternalList<String>(serviceIds);
    }

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceIds(java.util.Collection)} or {@link #withServiceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceIds
     *        The IDs of one or more services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointServiceConfigurationsRequest withServiceIds(String... serviceIds) {
        if (this.serviceIds == null) {
            setServiceIds(new com.amazonaws.internal.SdkInternalList<String>(serviceIds.length));
        }
        for (String ele : serviceIds) {
            this.serviceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * 
     * @param serviceIds
     *        The IDs of one or more services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVpcEndpointServiceConfigurationsRequest withServiceIds(java.util.Collection<String> serviceIds) {
        setServiceIds(serviceIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteVpcEndpointServiceConfigurationsRequest> getDryRunRequest() {
        Request<DeleteVpcEndpointServiceConfigurationsRequest> request = new DeleteVpcEndpointServiceConfigurationsRequestMarshaller().marshall(this);
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
        if (getServiceIds() != null)
            sb.append("ServiceIds: ").append(getServiceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteVpcEndpointServiceConfigurationsRequest == false)
            return false;
        DeleteVpcEndpointServiceConfigurationsRequest other = (DeleteVpcEndpointServiceConfigurationsRequest) obj;
        if (other.getServiceIds() == null ^ this.getServiceIds() == null)
            return false;
        if (other.getServiceIds() != null && other.getServiceIds().equals(this.getServiceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceIds() == null) ? 0 : getServiceIds().hashCode());
        return hashCode;
    }

    @Override
    public DeleteVpcEndpointServiceConfigurationsRequest clone() {
        return (DeleteVpcEndpointServiceConfigurationsRequest) super.clone();
    }
}
