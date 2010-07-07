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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest) DescribeSpotInstanceRequests operation}.
 * <p>
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest)
 */
public class DescribeSpotInstanceRequestsRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the request.
     */
    private java.util.List<String> spotInstanceRequestIds;

    /**
     * The ID of the request.
     *
     * @return The ID of the request.
     */
    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
            spotInstanceRequestIds = new java.util.ArrayList<String>();
        }
        return spotInstanceRequestIds;
    }
    
    /**
     * The ID of the request.
     *
     * @param spotInstanceRequestIds The ID of the request.
     */
    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        java.util.List<String> spotInstanceRequestIdsCopy = new java.util.ArrayList<String>();
        if (spotInstanceRequestIds != null) {
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        }
        this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
    }
    
    /**
     * The ID of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds The ID of the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(String... spotInstanceRequestIds) {
        for (String value : spotInstanceRequestIds) {
            getSpotInstanceRequestIds().add(value);
        }
        return this;
    }
    
    /**
     * The ID of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds The ID of the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        java.util.List<String> spotInstanceRequestIdsCopy = new java.util.ArrayList<String>();
        if (spotInstanceRequestIds != null) {
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        }
        this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;

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
        sb.append("SpotInstanceRequestIds: " + spotInstanceRequestIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    