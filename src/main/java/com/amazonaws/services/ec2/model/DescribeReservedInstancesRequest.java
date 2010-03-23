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
 * A request to describe the purchased Reserved Instances for your
 * account.
 * </p>
 */
public class DescribeReservedInstancesRequest extends AmazonWebServiceRequest {
        
    /**
     * The optional list of Reserved Instance IDs to describe.
     */
    private java.util.List<String> reservedInstancesIds;

    /**
     * The optional list of Reserved Instance IDs to describe.
     *
     * @return The optional list of Reserved Instance IDs to describe.
     */
    public java.util.List<String> getReservedInstancesIds() {
        if (reservedInstancesIds == null) {
            reservedInstancesIds = new java.util.ArrayList<String>();
        }
        return reservedInstancesIds;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     */
    public void setReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        java.util.List<String> reservedInstancesIdsCopy = new java.util.ArrayList<String>();
        if (reservedInstancesIds != null) {
            reservedInstancesIdsCopy.addAll(reservedInstancesIds);
        }
        this.reservedInstancesIds = reservedInstancesIdsCopy;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(String... reservedInstancesIds) {
        for (String value : reservedInstancesIds) {
            getReservedInstancesIds().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of Reserved Instance IDs to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesIds The optional list of Reserved Instance IDs to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedInstancesRequest withReservedInstancesIds(java.util.Collection<String> reservedInstancesIds) {
        java.util.List<String> reservedInstancesIdsCopy = new java.util.ArrayList<String>();
        if (reservedInstancesIds != null) {
            reservedInstancesIdsCopy.addAll(reservedInstancesIds);
        }
        this.reservedInstancesIds = reservedInstancesIdsCopy;

        return this;
    }
    
}
    