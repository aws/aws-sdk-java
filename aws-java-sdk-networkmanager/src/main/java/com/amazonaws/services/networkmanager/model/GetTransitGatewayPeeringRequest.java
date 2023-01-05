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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/GetTransitGatewayPeering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTransitGatewayPeeringRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the peering request.
     * </p>
     */
    private String peeringId;

    /**
     * <p>
     * The ID of the peering request.
     * </p>
     * 
     * @param peeringId
     *        The ID of the peering request.
     */

    public void setPeeringId(String peeringId) {
        this.peeringId = peeringId;
    }

    /**
     * <p>
     * The ID of the peering request.
     * </p>
     * 
     * @return The ID of the peering request.
     */

    public String getPeeringId() {
        return this.peeringId;
    }

    /**
     * <p>
     * The ID of the peering request.
     * </p>
     * 
     * @param peeringId
     *        The ID of the peering request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTransitGatewayPeeringRequest withPeeringId(String peeringId) {
        setPeeringId(peeringId);
        return this;
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
        if (getPeeringId() != null)
            sb.append("PeeringId: ").append(getPeeringId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTransitGatewayPeeringRequest == false)
            return false;
        GetTransitGatewayPeeringRequest other = (GetTransitGatewayPeeringRequest) obj;
        if (other.getPeeringId() == null ^ this.getPeeringId() == null)
            return false;
        if (other.getPeeringId() != null && other.getPeeringId().equals(this.getPeeringId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeeringId() == null) ? 0 : getPeeringId().hashCode());
        return hashCode;
    }

    @Override
    public GetTransitGatewayPeeringRequest clone() {
        return (GetTransitGatewayPeeringRequest) super.clone();
    }

}
