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
import com.amazonaws.services.ec2.model.transform.DeleteCustomerGatewayRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DeleteCustomerGateway.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteCustomerGatewayRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteCustomerGatewayRequest> {

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     */
    private String customerGatewayId;

    /**
     * Default constructor for DeleteCustomerGatewayRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DeleteCustomerGatewayRequest() {
    }

    /**
     * Constructs a new DeleteCustomerGatewayRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     */
    public DeleteCustomerGatewayRequest(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     */

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @return The ID of the customer gateway.
     */

    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * <p>
     * The ID of the customer gateway.
     * </p>
     * 
     * @param customerGatewayId
     *        The ID of the customer gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteCustomerGatewayRequest withCustomerGatewayId(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteCustomerGatewayRequest> getDryRunRequest() {
        Request<DeleteCustomerGatewayRequest> request = new DeleteCustomerGatewayRequestMarshaller().marshall(this);
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
        if (getCustomerGatewayId() != null)
            sb.append("CustomerGatewayId: ").append(getCustomerGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCustomerGatewayRequest == false)
            return false;
        DeleteCustomerGatewayRequest other = (DeleteCustomerGatewayRequest) obj;
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null)
            return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteCustomerGatewayRequest clone() {
        return (DeleteCustomerGatewayRequest) super.clone();
    }
}
