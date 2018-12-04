/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DeleteEgressOnlyInternetGatewayRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteEgressOnlyInternetGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteEgressOnlyInternetGatewayRequest> {

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     */
    private String egressOnlyInternetGatewayId;

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        The ID of the egress-only Internet gateway.
     */

    public void setEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        this.egressOnlyInternetGatewayId = egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     * 
     * @return The ID of the egress-only Internet gateway.
     */

    public String getEgressOnlyInternetGatewayId() {
        return this.egressOnlyInternetGatewayId;
    }

    /**
     * <p>
     * The ID of the egress-only Internet gateway.
     * </p>
     * 
     * @param egressOnlyInternetGatewayId
     *        The ID of the egress-only Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteEgressOnlyInternetGatewayRequest withEgressOnlyInternetGatewayId(String egressOnlyInternetGatewayId) {
        setEgressOnlyInternetGatewayId(egressOnlyInternetGatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteEgressOnlyInternetGatewayRequest> getDryRunRequest() {
        Request<DeleteEgressOnlyInternetGatewayRequest> request = new DeleteEgressOnlyInternetGatewayRequestMarshaller().marshall(this);
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
        if (getEgressOnlyInternetGatewayId() != null)
            sb.append("EgressOnlyInternetGatewayId: ").append(getEgressOnlyInternetGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEgressOnlyInternetGatewayRequest == false)
            return false;
        DeleteEgressOnlyInternetGatewayRequest other = (DeleteEgressOnlyInternetGatewayRequest) obj;
        if (other.getEgressOnlyInternetGatewayId() == null ^ this.getEgressOnlyInternetGatewayId() == null)
            return false;
        if (other.getEgressOnlyInternetGatewayId() != null && other.getEgressOnlyInternetGatewayId().equals(this.getEgressOnlyInternetGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEgressOnlyInternetGatewayId() == null) ? 0 : getEgressOnlyInternetGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEgressOnlyInternetGatewayRequest clone() {
        return (DeleteEgressOnlyInternetGatewayRequest) super.clone();
    }
}
