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
 * The RequestSpotInstancesResult data type.
 * </p>
 */
public class RequestSpotInstancesResult {

    /**
     * Contains a list of Spot Instance requests.
     */
    private java.util.List<SpotInstanceRequest> spotInstanceRequests;

    /**
     * Contains a list of Spot Instance requests.
     *
     * @return Contains a list of Spot Instance requests.
     */
    public java.util.List<SpotInstanceRequest> getSpotInstanceRequests() {
        if (spotInstanceRequests == null) {
            spotInstanceRequests = new java.util.ArrayList<SpotInstanceRequest>();
        }
        return spotInstanceRequests;
    }
    
    /**
     * Contains a list of Spot Instance requests.
     *
     * @param spotInstanceRequests Contains a list of Spot Instance requests.
     */
    public void setSpotInstanceRequests(java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        java.util.List<SpotInstanceRequest> spotInstanceRequestsCopy = new java.util.ArrayList<SpotInstanceRequest>();
        if (spotInstanceRequests != null) {
            spotInstanceRequestsCopy.addAll(spotInstanceRequests);
        }
        this.spotInstanceRequests = spotInstanceRequestsCopy;
    }
    
    /**
     * Contains a list of Spot Instance requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequests Contains a list of Spot Instance requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RequestSpotInstancesResult withSpotInstanceRequests(SpotInstanceRequest... spotInstanceRequests) {
        for (SpotInstanceRequest value : spotInstanceRequests) {
            getSpotInstanceRequests().add(value);
        }
        return this;
    }
    
    /**
     * Contains a list of Spot Instance requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequests Contains a list of Spot Instance requests.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RequestSpotInstancesResult withSpotInstanceRequests(java.util.Collection<SpotInstanceRequest> spotInstanceRequests) {
        java.util.List<SpotInstanceRequest> spotInstanceRequestsCopy = new java.util.ArrayList<SpotInstanceRequest>();
        if (spotInstanceRequests != null) {
            spotInstanceRequestsCopy.addAll(spotInstanceRequests);
        }
        this.spotInstanceRequests = spotInstanceRequestsCopy;

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
        sb.append("SpotInstanceRequests: " + spotInstanceRequests + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    