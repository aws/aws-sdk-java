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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest) CancelSpotInstanceRequests operation}.
 * <p>
 * Cancels one or more Spot Instance requests.
 * </p>
 * <p>
 * Spot Instances are instances that Amazon EC2 starts on your behalf
 * when the maximum price that you specify exceeds the current Spot
 * Price. Amazon EC2 periodically sets the Spot Price based on available
 * Spot Instance capacity and current spot instance requests.
 * </p>
 * <p>
 * For conceptual information about Spot Instances, refer to the Amazon
 * Elastic Compute Cloud Developer Guide or Amazon Elastic Compute Cloud
 * User Guide .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelSpotInstanceRequests(CancelSpotInstanceRequestsRequest)
 */
public class CancelSpotInstanceRequestsRequest extends AmazonWebServiceRequest {

    /**
     * Specifies the ID of the Spot Instance request.
     */
    private java.util.List<String> spotInstanceRequestIds;

    /**
     * Specifies the ID of the Spot Instance request.
     *
     * @return Specifies the ID of the Spot Instance request.
     */
    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
            spotInstanceRequestIds = new java.util.ArrayList<String>();
        }
        return spotInstanceRequestIds;
    }
    
    /**
     * Specifies the ID of the Spot Instance request.
     *
     * @param spotInstanceRequestIds Specifies the ID of the Spot Instance request.
     */
    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        java.util.List<String> spotInstanceRequestIdsCopy = new java.util.ArrayList<String>();
        if (spotInstanceRequestIds != null) {
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        }
        this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
    }
    
    /**
     * Specifies the ID of the Spot Instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds Specifies the ID of the Spot Instance request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(String... spotInstanceRequestIds) {
        for (String value : spotInstanceRequestIds) {
            getSpotInstanceRequestIds().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the ID of the Spot Instance request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds Specifies the ID of the Spot Instance request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CancelSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
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
    