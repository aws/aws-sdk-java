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
import com.amazonaws.services.ec2.model.transform.DisassociateClientVpnTargetNetworkRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateClientVpnTargetNetworkRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DisassociateClientVpnTargetNetworkRequest> {

    /**
     * <p>
     * The ID of the Client VPN endpoint from which to disassociate the target network.
     * </p>
     */
    private String clientVpnEndpointId;
    /**
     * <p>
     * The ID of the target network association.
     * </p>
     */
    private String associationId;

    /**
     * <p>
     * The ID of the Client VPN endpoint from which to disassociate the target network.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint from which to disassociate the target network.
     */

    public void setClientVpnEndpointId(String clientVpnEndpointId) {
        this.clientVpnEndpointId = clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint from which to disassociate the target network.
     * </p>
     * 
     * @return The ID of the Client VPN endpoint from which to disassociate the target network.
     */

    public String getClientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * <p>
     * The ID of the Client VPN endpoint from which to disassociate the target network.
     * </p>
     * 
     * @param clientVpnEndpointId
     *        The ID of the Client VPN endpoint from which to disassociate the target network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateClientVpnTargetNetworkRequest withClientVpnEndpointId(String clientVpnEndpointId) {
        setClientVpnEndpointId(clientVpnEndpointId);
        return this;
    }

    /**
     * <p>
     * The ID of the target network association.
     * </p>
     * 
     * @param associationId
     *        The ID of the target network association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the target network association.
     * </p>
     * 
     * @return The ID of the target network association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the target network association.
     * </p>
     * 
     * @param associationId
     *        The ID of the target network association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateClientVpnTargetNetworkRequest withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DisassociateClientVpnTargetNetworkRequest> getDryRunRequest() {
        Request<DisassociateClientVpnTargetNetworkRequest> request = new DisassociateClientVpnTargetNetworkRequestMarshaller().marshall(this);
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
        if (getClientVpnEndpointId() != null)
            sb.append("ClientVpnEndpointId: ").append(getClientVpnEndpointId()).append(",");
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateClientVpnTargetNetworkRequest == false)
            return false;
        DisassociateClientVpnTargetNetworkRequest other = (DisassociateClientVpnTargetNetworkRequest) obj;
        if (other.getClientVpnEndpointId() == null ^ this.getClientVpnEndpointId() == null)
            return false;
        if (other.getClientVpnEndpointId() != null && other.getClientVpnEndpointId().equals(this.getClientVpnEndpointId()) == false)
            return false;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientVpnEndpointId() == null) ? 0 : getClientVpnEndpointId().hashCode());
        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateClientVpnTargetNetworkRequest clone() {
        return (DisassociateClientVpnTargetNetworkRequest) super.clone();
    }
}
