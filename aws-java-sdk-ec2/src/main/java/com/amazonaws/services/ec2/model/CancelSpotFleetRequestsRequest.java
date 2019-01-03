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
import com.amazonaws.services.ec2.model.transform.CancelSpotFleetRequestsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for CancelSpotFleetRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelSpotFleetRequestsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<CancelSpotFleetRequestsRequest> {

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> spotFleetRequestIds;
    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     * </p>
     */
    private Boolean terminateInstances;

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * 
     * @return The IDs of the Spot Fleet requests.
     */

    public java.util.List<String> getSpotFleetRequestIds() {
        if (spotFleetRequestIds == null) {
            spotFleetRequestIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return spotFleetRequestIds;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * 
     * @param spotFleetRequestIds
     *        The IDs of the Spot Fleet requests.
     */

    public void setSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        if (spotFleetRequestIds == null) {
            this.spotFleetRequestIds = null;
            return;
        }

        this.spotFleetRequestIds = new com.amazonaws.internal.SdkInternalList<String>(spotFleetRequestIds);
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotFleetRequestIds(java.util.Collection)} or {@link #withSpotFleetRequestIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param spotFleetRequestIds
     *        The IDs of the Spot Fleet requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsRequest withSpotFleetRequestIds(String... spotFleetRequestIds) {
        if (this.spotFleetRequestIds == null) {
            setSpotFleetRequestIds(new com.amazonaws.internal.SdkInternalList<String>(spotFleetRequestIds.length));
        }
        for (String ele : spotFleetRequestIds) {
            this.spotFleetRequestIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the Spot Fleet requests.
     * </p>
     * 
     * @param spotFleetRequestIds
     *        The IDs of the Spot Fleet requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsRequest withSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        setSpotFleetRequestIds(spotFleetRequestIds);
        return this;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     * </p>
     * 
     * @param terminateInstances
     *        Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     */

    public void setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     * </p>
     * 
     * @return Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     */

    public Boolean getTerminateInstances() {
        return this.terminateInstances;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     * </p>
     * 
     * @param terminateInstances
     *        Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelSpotFleetRequestsRequest withTerminateInstances(Boolean terminateInstances) {
        setTerminateInstances(terminateInstances);
        return this;
    }

    /**
     * <p>
     * Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     * </p>
     * 
     * @return Indicates whether to terminate instances for a Spot Fleet request if it is canceled successfully.
     */

    public Boolean isTerminateInstances() {
        return this.terminateInstances;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<CancelSpotFleetRequestsRequest> getDryRunRequest() {
        Request<CancelSpotFleetRequestsRequest> request = new CancelSpotFleetRequestsRequestMarshaller().marshall(this);
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
        if (getSpotFleetRequestIds() != null)
            sb.append("SpotFleetRequestIds: ").append(getSpotFleetRequestIds()).append(",");
        if (getTerminateInstances() != null)
            sb.append("TerminateInstances: ").append(getTerminateInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelSpotFleetRequestsRequest == false)
            return false;
        CancelSpotFleetRequestsRequest other = (CancelSpotFleetRequestsRequest) obj;
        if (other.getSpotFleetRequestIds() == null ^ this.getSpotFleetRequestIds() == null)
            return false;
        if (other.getSpotFleetRequestIds() != null && other.getSpotFleetRequestIds().equals(this.getSpotFleetRequestIds()) == false)
            return false;
        if (other.getTerminateInstances() == null ^ this.getTerminateInstances() == null)
            return false;
        if (other.getTerminateInstances() != null && other.getTerminateInstances().equals(this.getTerminateInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSpotFleetRequestIds() == null) ? 0 : getSpotFleetRequestIds().hashCode());
        hashCode = prime * hashCode + ((getTerminateInstances() == null) ? 0 : getTerminateInstances().hashCode());
        return hashCode;
    }

    @Override
    public CancelSpotFleetRequestsRequest clone() {
        return (CancelSpotFleetRequestsRequest) super.clone();
    }
}
