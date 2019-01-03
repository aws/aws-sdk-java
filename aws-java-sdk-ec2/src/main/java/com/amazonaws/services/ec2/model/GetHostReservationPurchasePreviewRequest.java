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
import com.amazonaws.services.ec2.model.transform.GetHostReservationPurchasePreviewRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHostReservationPurchasePreviewRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetHostReservationPurchasePreviewRequest> {

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIdSet;
    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     */
    private String offeringId;

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts with which the reservation is associated.
     */

    public java.util.List<String> getHostIdSet() {
        if (hostIdSet == null) {
            hostIdSet = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostIdSet;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts with which the reservation is associated.
     */

    public void setHostIdSet(java.util.Collection<String> hostIdSet) {
        if (hostIdSet == null) {
            this.hostIdSet = null;
            return;
        }

        this.hostIdSet = new com.amazonaws.internal.SdkInternalList<String>(hostIdSet);
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIdSet(java.util.Collection)} or {@link #withHostIdSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts with which the reservation is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostReservationPurchasePreviewRequest withHostIdSet(String... hostIdSet) {
        if (this.hostIdSet == null) {
            setHostIdSet(new com.amazonaws.internal.SdkInternalList<String>(hostIdSet.length));
        }
        for (String ele : hostIdSet) {
            this.hostIdSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts with which the reservation is associated.
     * </p>
     * 
     * @param hostIdSet
     *        The IDs of the Dedicated Hosts with which the reservation is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostReservationPurchasePreviewRequest withHostIdSet(java.util.Collection<String> hostIdSet) {
        setHostIdSet(hostIdSet);
        return this;
    }

    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     * 
     * @param offeringId
     *        The offering ID of the reservation.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     * 
     * @return The offering ID of the reservation.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The offering ID of the reservation.
     * </p>
     * 
     * @param offeringId
     *        The offering ID of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostReservationPurchasePreviewRequest withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetHostReservationPurchasePreviewRequest> getDryRunRequest() {
        Request<GetHostReservationPurchasePreviewRequest> request = new GetHostReservationPurchasePreviewRequestMarshaller().marshall(this);
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
        if (getHostIdSet() != null)
            sb.append("HostIdSet: ").append(getHostIdSet()).append(",");
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostReservationPurchasePreviewRequest == false)
            return false;
        GetHostReservationPurchasePreviewRequest other = (GetHostReservationPurchasePreviewRequest) obj;
        if (other.getHostIdSet() == null ^ this.getHostIdSet() == null)
            return false;
        if (other.getHostIdSet() != null && other.getHostIdSet().equals(this.getHostIdSet()) == false)
            return false;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostIdSet() == null) ? 0 : getHostIdSet().hashCode());
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        return hashCode;
    }

    @Override
    public GetHostReservationPurchasePreviewRequest clone() {
        return (GetHostReservationPurchasePreviewRequest) super.clone();
    }
}
