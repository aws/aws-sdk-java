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
import com.amazonaws.services.ec2.model.transform.DeleteTransitGatewayConnectPeerRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTransitGatewayConnectPeerRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteTransitGatewayConnectPeerRequest> {

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     */
    private String transitGatewayConnectPeerId;

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerId
     *        The ID of the Connect peer.
     */

    public void setTransitGatewayConnectPeerId(String transitGatewayConnectPeerId) {
        this.transitGatewayConnectPeerId = transitGatewayConnectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @return The ID of the Connect peer.
     */

    public String getTransitGatewayConnectPeerId() {
        return this.transitGatewayConnectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerId
     *        The ID of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTransitGatewayConnectPeerRequest withTransitGatewayConnectPeerId(String transitGatewayConnectPeerId) {
        setTransitGatewayConnectPeerId(transitGatewayConnectPeerId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteTransitGatewayConnectPeerRequest> getDryRunRequest() {
        Request<DeleteTransitGatewayConnectPeerRequest> request = new DeleteTransitGatewayConnectPeerRequestMarshaller().marshall(this);
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
        if (getTransitGatewayConnectPeerId() != null)
            sb.append("TransitGatewayConnectPeerId: ").append(getTransitGatewayConnectPeerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTransitGatewayConnectPeerRequest == false)
            return false;
        DeleteTransitGatewayConnectPeerRequest other = (DeleteTransitGatewayConnectPeerRequest) obj;
        if (other.getTransitGatewayConnectPeerId() == null ^ this.getTransitGatewayConnectPeerId() == null)
            return false;
        if (other.getTransitGatewayConnectPeerId() != null && other.getTransitGatewayConnectPeerId().equals(this.getTransitGatewayConnectPeerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayConnectPeerId() == null) ? 0 : getTransitGatewayConnectPeerId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTransitGatewayConnectPeerRequest clone() {
        return (DeleteTransitGatewayConnectPeerRequest) super.clone();
    }
}
