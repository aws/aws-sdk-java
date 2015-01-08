/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteCustomerGatewayRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#deleteCustomerGateway(DeleteCustomerGatewayRequest) DeleteCustomerGateway operation}.
 * <p>
 * Deletes the specified customer gateway. You must delete the VPN
 * connection before you can delete the customer gateway.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#deleteCustomerGateway(DeleteCustomerGatewayRequest)
 */
public class DeleteCustomerGatewayRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DeleteCustomerGatewayRequest> {

    /**
     * The ID of the customer gateway.
     */
    private String customerGatewayId;

    /**
     * Default constructor for a new DeleteCustomerGatewayRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteCustomerGatewayRequest() {}
    
    /**
     * Constructs a new DeleteCustomerGatewayRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param customerGatewayId The ID of the customer gateway.
     */
    public DeleteCustomerGatewayRequest(String customerGatewayId) {
        setCustomerGatewayId(customerGatewayId);
    }

    /**
     * The ID of the customer gateway.
     *
     * @return The ID of the customer gateway.
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway.
     *
     * @param customerGatewayId The ID of the customer gateway.
     */
    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }
    
    /**
     * The ID of the customer gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayId The ID of the customer gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteCustomerGatewayRequest withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DeleteCustomerGatewayRequest> getDryRunRequest() {
        Request<DeleteCustomerGatewayRequest> request = new DeleteCustomerGatewayRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCustomerGatewayId() != null) sb.append("CustomerGatewayId: " + getCustomerGatewayId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCustomerGatewayId() == null) ? 0 : getCustomerGatewayId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteCustomerGatewayRequest == false) return false;
        DeleteCustomerGatewayRequest other = (DeleteCustomerGatewayRequest)obj;
        
        if (other.getCustomerGatewayId() == null ^ this.getCustomerGatewayId() == null) return false;
        if (other.getCustomerGatewayId() != null && other.getCustomerGatewayId().equals(this.getCustomerGatewayId()) == false) return false; 
        return true;
    }
    
}
    