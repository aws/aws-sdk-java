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
import com.amazonaws.services.ec2.model.transform.RejectVpcEndpointConnectionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectVpcEndpointConnectionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<RejectVpcEndpointConnectionsRequest> {

    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The IDs of one or more VPC endpoints.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcEndpointIds;

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

    public RejectVpcEndpointConnectionsRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The IDs of one or more VPC endpoints.
     * </p>
     * 
     * @return The IDs of one or more VPC endpoints.
     */

    public java.util.List<String> getVpcEndpointIds() {
        if (vpcEndpointIds == null) {
            vpcEndpointIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcEndpointIds;
    }

    /**
     * <p>
     * The IDs of one or more VPC endpoints.
     * </p>
     * 
     * @param vpcEndpointIds
     *        The IDs of one or more VPC endpoints.
     */

    public void setVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
            return;
        }

        this.vpcEndpointIds = new com.amazonaws.internal.SdkInternalList<String>(vpcEndpointIds);
    }

    /**
     * <p>
     * The IDs of one or more VPC endpoints.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcEndpointIds(java.util.Collection)} or {@link #withVpcEndpointIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param vpcEndpointIds
     *        The IDs of one or more VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectVpcEndpointConnectionsRequest withVpcEndpointIds(String... vpcEndpointIds) {
        if (this.vpcEndpointIds == null) {
            setVpcEndpointIds(new com.amazonaws.internal.SdkInternalList<String>(vpcEndpointIds.length));
        }
        for (String ele : vpcEndpointIds) {
            this.vpcEndpointIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more VPC endpoints.
     * </p>
     * 
     * @param vpcEndpointIds
     *        The IDs of one or more VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectVpcEndpointConnectionsRequest withVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        setVpcEndpointIds(vpcEndpointIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<RejectVpcEndpointConnectionsRequest> getDryRunRequest() {
        Request<RejectVpcEndpointConnectionsRequest> request = new RejectVpcEndpointConnectionsRequestMarshaller().marshall(this);
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
        if (getVpcEndpointIds() != null)
            sb.append("VpcEndpointIds: ").append(getVpcEndpointIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectVpcEndpointConnectionsRequest == false)
            return false;
        RejectVpcEndpointConnectionsRequest other = (RejectVpcEndpointConnectionsRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getVpcEndpointIds() == null ^ this.getVpcEndpointIds() == null)
            return false;
        if (other.getVpcEndpointIds() != null && other.getVpcEndpointIds().equals(this.getVpcEndpointIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getVpcEndpointIds() == null) ? 0 : getVpcEndpointIds().hashCode());
        return hashCode;
    }

    @Override
    public RejectVpcEndpointConnectionsRequest clone() {
        return (RejectVpcEndpointConnectionsRequest) super.clone();
    }
}
