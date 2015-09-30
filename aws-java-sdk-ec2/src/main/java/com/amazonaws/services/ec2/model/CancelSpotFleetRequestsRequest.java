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
import com.amazonaws.services.ec2.model.transform.CancelSpotFleetRequestsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelSpotFleetRequests(CancelSpotFleetRequestsRequest) CancelSpotFleetRequests operation}.
 * <p>
 * Cancels the specified Spot fleet requests.
 * </p>
 * <p>
 * After you cancel a Spot fleet request, the Spot fleet launches no new
 * Spot instances. You must specify whether the Spot fleet should also
 * terminate its Spot instances. If you terminate the instances, the Spot
 * fleet request enters the <code>cancelled_terminating</code> state.
 * Otherwise, the Spot fleet request enters the
 * <code>cancelled_running</code> state and the instances continue to run
 * until they are interrupted or you terminate them manually.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelSpotFleetRequests(CancelSpotFleetRequestsRequest)
 */
public class CancelSpotFleetRequestsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<CancelSpotFleetRequestsRequest> {

    /**
     * The IDs of the Spot fleet requests.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> spotFleetRequestIds;

    /**
     * Indicates whether to terminate instances for a Spot fleet request if
     * it is canceled successfully.
     */
    private Boolean terminateInstances;

    /**
     * The IDs of the Spot fleet requests.
     *
     * @return The IDs of the Spot fleet requests.
     */
    public java.util.List<String> getSpotFleetRequestIds() {
        if (spotFleetRequestIds == null) {
              spotFleetRequestIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              spotFleetRequestIds.setAutoConstruct(true);
        }
        return spotFleetRequestIds;
    }
    
    /**
     * The IDs of the Spot fleet requests.
     *
     * @param spotFleetRequestIds The IDs of the Spot fleet requests.
     */
    public void setSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        if (spotFleetRequestIds == null) {
            this.spotFleetRequestIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> spotFleetRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotFleetRequestIds.size());
        spotFleetRequestIdsCopy.addAll(spotFleetRequestIds);
        this.spotFleetRequestIds = spotFleetRequestIdsCopy;
    }
    
    /**
     * The IDs of the Spot fleet requests.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSpotFleetRequestIds(java.util.Collection)} or
     * {@link #withSpotFleetRequestIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestIds The IDs of the Spot fleet requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsRequest withSpotFleetRequestIds(String... spotFleetRequestIds) {
        if (getSpotFleetRequestIds() == null) setSpotFleetRequestIds(new java.util.ArrayList<String>(spotFleetRequestIds.length));
        for (String value : spotFleetRequestIds) {
            getSpotFleetRequestIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Spot fleet requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestIds The IDs of the Spot fleet requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsRequest withSpotFleetRequestIds(java.util.Collection<String> spotFleetRequestIds) {
        if (spotFleetRequestIds == null) {
            this.spotFleetRequestIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> spotFleetRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotFleetRequestIds.size());
            spotFleetRequestIdsCopy.addAll(spotFleetRequestIds);
            this.spotFleetRequestIds = spotFleetRequestIdsCopy;
        }

        return this;
    }

    /**
     * Indicates whether to terminate instances for a Spot fleet request if
     * it is canceled successfully.
     *
     * @return Indicates whether to terminate instances for a Spot fleet request if
     *         it is canceled successfully.
     */
    public Boolean isTerminateInstances() {
        return terminateInstances;
    }
    
    /**
     * Indicates whether to terminate instances for a Spot fleet request if
     * it is canceled successfully.
     *
     * @param terminateInstances Indicates whether to terminate instances for a Spot fleet request if
     *         it is canceled successfully.
     */
    public void setTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
    }
    
    /**
     * Indicates whether to terminate instances for a Spot fleet request if
     * it is canceled successfully.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param terminateInstances Indicates whether to terminate instances for a Spot fleet request if
     *         it is canceled successfully.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CancelSpotFleetRequestsRequest withTerminateInstances(Boolean terminateInstances) {
        this.terminateInstances = terminateInstances;
        return this;
    }

    /**
     * Indicates whether to terminate instances for a Spot fleet request if
     * it is canceled successfully.
     *
     * @return Indicates whether to terminate instances for a Spot fleet request if
     *         it is canceled successfully.
     */
    public Boolean getTerminateInstances() {
        return terminateInstances;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<CancelSpotFleetRequestsRequest> getDryRunRequest() {
        Request<CancelSpotFleetRequestsRequest> request = new CancelSpotFleetRequestsRequestMarshaller().marshall(this);
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
        if (getSpotFleetRequestIds() != null) sb.append("SpotFleetRequestIds: " + getSpotFleetRequestIds() + ",");
        if (isTerminateInstances() != null) sb.append("TerminateInstances: " + isTerminateInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestIds() == null) ? 0 : getSpotFleetRequestIds().hashCode()); 
        hashCode = prime * hashCode + ((isTerminateInstances() == null) ? 0 : isTerminateInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelSpotFleetRequestsRequest == false) return false;
        CancelSpotFleetRequestsRequest other = (CancelSpotFleetRequestsRequest)obj;
        
        if (other.getSpotFleetRequestIds() == null ^ this.getSpotFleetRequestIds() == null) return false;
        if (other.getSpotFleetRequestIds() != null && other.getSpotFleetRequestIds().equals(this.getSpotFleetRequestIds()) == false) return false; 
        if (other.isTerminateInstances() == null ^ this.isTerminateInstances() == null) return false;
        if (other.isTerminateInstances() != null && other.isTerminateInstances().equals(this.isTerminateInstances()) == false) return false; 
        return true;
    }
    
    @Override
    public CancelSpotFleetRequestsRequest clone() {
        
            return (CancelSpotFleetRequestsRequest) super.clone();
    }

}
    