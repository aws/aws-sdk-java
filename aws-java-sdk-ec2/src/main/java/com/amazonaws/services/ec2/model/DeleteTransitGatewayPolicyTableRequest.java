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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeleteTransitGatewayPolicyTableRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteTransitGatewayPolicyTableRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeleteTransitGatewayPolicyTableRequest> {

    /**
     * <p>
     * The transit gateway policy table to delete.
     * </p>
     */
    private String transitGatewayPolicyTableId;

    /**
     * <p>
     * The transit gateway policy table to delete.
     * </p>
     * 
     * @param transitGatewayPolicyTableId
     *        The transit gateway policy table to delete.
     */

    public void setTransitGatewayPolicyTableId(String transitGatewayPolicyTableId) {
        this.transitGatewayPolicyTableId = transitGatewayPolicyTableId;
    }

    /**
     * <p>
     * The transit gateway policy table to delete.
     * </p>
     * 
     * @return The transit gateway policy table to delete.
     */

    public String getTransitGatewayPolicyTableId() {
        return this.transitGatewayPolicyTableId;
    }

    /**
     * <p>
     * The transit gateway policy table to delete.
     * </p>
     * 
     * @param transitGatewayPolicyTableId
     *        The transit gateway policy table to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTransitGatewayPolicyTableRequest withTransitGatewayPolicyTableId(String transitGatewayPolicyTableId) {
        setTransitGatewayPolicyTableId(transitGatewayPolicyTableId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeleteTransitGatewayPolicyTableRequest> getDryRunRequest() {
        Request<DeleteTransitGatewayPolicyTableRequest> request = new DeleteTransitGatewayPolicyTableRequestMarshaller().marshall(this);
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
        if (getTransitGatewayPolicyTableId() != null)
            sb.append("TransitGatewayPolicyTableId: ").append(getTransitGatewayPolicyTableId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTransitGatewayPolicyTableRequest == false)
            return false;
        DeleteTransitGatewayPolicyTableRequest other = (DeleteTransitGatewayPolicyTableRequest) obj;
        if (other.getTransitGatewayPolicyTableId() == null ^ this.getTransitGatewayPolicyTableId() == null)
            return false;
        if (other.getTransitGatewayPolicyTableId() != null && other.getTransitGatewayPolicyTableId().equals(this.getTransitGatewayPolicyTableId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayPolicyTableId() == null) ? 0 : getTransitGatewayPolicyTableId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTransitGatewayPolicyTableRequest clone() {
        return (DeleteTransitGatewayPolicyTableRequest) super.clone();
    }
}
