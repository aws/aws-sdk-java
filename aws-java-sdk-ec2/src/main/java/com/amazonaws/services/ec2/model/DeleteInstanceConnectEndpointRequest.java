/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteInstanceConnectEndpointRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInstanceConnectEndpointRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteInstanceConnectEndpointRequest> {

    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint to delete.
     * </p>
     */
    private String instanceConnectEndpointId;

    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint to delete.
     * </p>
     * 
     * @param instanceConnectEndpointId
     *        The ID of the EC2 Instance Connect Endpoint to delete.
     */

    public void setInstanceConnectEndpointId(String instanceConnectEndpointId) {
        this.instanceConnectEndpointId = instanceConnectEndpointId;
    }

    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint to delete.
     * </p>
     * 
     * @return The ID of the EC2 Instance Connect Endpoint to delete.
     */

    public String getInstanceConnectEndpointId() {
        return this.instanceConnectEndpointId;
    }

    /**
     * <p>
     * The ID of the EC2 Instance Connect Endpoint to delete.
     * </p>
     * 
     * @param instanceConnectEndpointId
     *        The ID of the EC2 Instance Connect Endpoint to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteInstanceConnectEndpointRequest withInstanceConnectEndpointId(String instanceConnectEndpointId) {
        setInstanceConnectEndpointId(instanceConnectEndpointId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteInstanceConnectEndpointRequest> getDryRunRequest() {
        Request<DeleteInstanceConnectEndpointRequest> request = new DeleteInstanceConnectEndpointRequestMarshaller().marshall(this);
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
        if (getInstanceConnectEndpointId() != null)
            sb.append("InstanceConnectEndpointId: ").append(getInstanceConnectEndpointId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstanceConnectEndpointRequest == false)
            return false;
        DeleteInstanceConnectEndpointRequest other = (DeleteInstanceConnectEndpointRequest) obj;
        if (other.getInstanceConnectEndpointId() == null ^ this.getInstanceConnectEndpointId() == null)
            return false;
        if (other.getInstanceConnectEndpointId() != null && other.getInstanceConnectEndpointId().equals(this.getInstanceConnectEndpointId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceConnectEndpointId() == null) ? 0 : getInstanceConnectEndpointId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInstanceConnectEndpointRequest clone() {
        return (DeleteInstanceConnectEndpointRequest) super.clone();
    }
}
