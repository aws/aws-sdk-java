/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * 
 * </p>
 */
public class CancelSpotInstanceRequestsResult {

    /**
     * 
     */
    private java.util.List<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests;

    /**
     * 
     *
     * @return 
     */
    public java.util.List<CancelledSpotInstanceRequest> getCancelledSpotInstanceRequests() {
        if (cancelledSpotInstanceRequests == null) {
            cancelledSpotInstanceRequests = new java.util.ArrayList<CancelledSpotInstanceRequest>();
        }
        return cancelledSpotInstanceRequests;
    }
    
    /**
     * 
     *
     * @param cancelledSpotInstanceRequests 
     */
    public void setCancelledSpotInstanceRequests(java.util.Collection<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests) {
        java.util.List<CancelledSpotInstanceRequest> cancelledSpotInstanceRequestsCopy = new java.util.ArrayList<CancelledSpotInstanceRequest>();
        if (cancelledSpotInstanceRequests != null) {
            cancelledSpotInstanceRequestsCopy.addAll(cancelledSpotInstanceRequests);
        }
        this.cancelledSpotInstanceRequests = cancelledSpotInstanceRequestsCopy;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelledSpotInstanceRequests 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelSpotInstanceRequestsResult withCancelledSpotInstanceRequests(CancelledSpotInstanceRequest... cancelledSpotInstanceRequests) {
        for (CancelledSpotInstanceRequest value : cancelledSpotInstanceRequests) {
            getCancelledSpotInstanceRequests().add(value);
        }
        return this;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cancelledSpotInstanceRequests 
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelSpotInstanceRequestsResult withCancelledSpotInstanceRequests(java.util.Collection<CancelledSpotInstanceRequest> cancelledSpotInstanceRequests) {
        java.util.List<CancelledSpotInstanceRequest> cancelledSpotInstanceRequestsCopy = new java.util.ArrayList<CancelledSpotInstanceRequest>();
        if (cancelledSpotInstanceRequests != null) {
            cancelledSpotInstanceRequestsCopy.addAll(cancelledSpotInstanceRequests);
        }
        this.cancelledSpotInstanceRequests = cancelledSpotInstanceRequestsCopy;

        return this;
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
        sb.append("CancelledSpotInstanceRequests: " + cancelledSpotInstanceRequests + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    