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
import com.amazonaws.services.ec2.model.transform.DeleteCarrierGatewayRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCarrierGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteCarrierGatewayRequest> {

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     */
    private String carrierGatewayId;

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * 
     * @param carrierGatewayId
     *        The ID of the carrier gateway.
     */

    public void setCarrierGatewayId(String carrierGatewayId) {
        this.carrierGatewayId = carrierGatewayId;
    }

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * 
     * @return The ID of the carrier gateway.
     */

    public String getCarrierGatewayId() {
        return this.carrierGatewayId;
    }

    /**
     * <p>
     * The ID of the carrier gateway.
     * </p>
     * 
     * @param carrierGatewayId
     *        The ID of the carrier gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCarrierGatewayRequest withCarrierGatewayId(String carrierGatewayId) {
        setCarrierGatewayId(carrierGatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteCarrierGatewayRequest> getDryRunRequest() {
        Request<DeleteCarrierGatewayRequest> request = new DeleteCarrierGatewayRequestMarshaller().marshall(this);
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
        if (getCarrierGatewayId() != null)
            sb.append("CarrierGatewayId: ").append(getCarrierGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCarrierGatewayRequest == false)
            return false;
        DeleteCarrierGatewayRequest other = (DeleteCarrierGatewayRequest) obj;
        if (other.getCarrierGatewayId() == null ^ this.getCarrierGatewayId() == null)
            return false;
        if (other.getCarrierGatewayId() != null && other.getCarrierGatewayId().equals(this.getCarrierGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCarrierGatewayId() == null) ? 0 : getCarrierGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCarrierGatewayRequest clone() {
        return (DeleteCarrierGatewayRequest) super.clone();
    }
}
