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
 * <p>
 * 
 * </p>
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("SpotInstanceRequestIds: " + spotInstanceRequestIds + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    