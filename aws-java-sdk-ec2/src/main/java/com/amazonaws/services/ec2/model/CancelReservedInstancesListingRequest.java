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
import com.amazonaws.services.ec2.model.transform.CancelReservedInstancesListingRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CancelReservedInstancesListing.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelReservedInstancesListingRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CancelReservedInstancesListingRequest> {

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     */
    private String reservedInstancesListingId;

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     * 
     * @param reservedInstancesListingId
     *        The ID of the Reserved Instance listing.
     */

    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     * 
     * @return The ID of the Reserved Instance listing.
     */

    public String getReservedInstancesListingId() {
        return this.reservedInstancesListingId;
    }

    /**
     * <p>
     * The ID of the Reserved Instance listing.
     * </p>
     * 
     * @param reservedInstancesListingId
     *        The ID of the Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelReservedInstancesListingRequest withReservedInstancesListingId(String reservedInstancesListingId) {
        setReservedInstancesListingId(reservedInstancesListingId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelReservedInstancesListingRequest> getDryRunRequest() {
        Request<CancelReservedInstancesListingRequest> request = new CancelReservedInstancesListingRequestMarshaller().marshall(this);
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
        if (getReservedInstancesListingId() != null)
            sb.append("ReservedInstancesListingId: ").append(getReservedInstancesListingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelReservedInstancesListingRequest == false)
            return false;
        CancelReservedInstancesListingRequest other = (CancelReservedInstancesListingRequest) obj;
        if (other.getReservedInstancesListingId() == null ^ this.getReservedInstancesListingId() == null)
            return false;
        if (other.getReservedInstancesListingId() != null && other.getReservedInstancesListingId().equals(this.getReservedInstancesListingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId().hashCode());
        return hashCode;
    }

    @Override
    public CancelReservedInstancesListingRequest clone() {
        return (CancelReservedInstancesListingRequest) super.clone();
    }
}
