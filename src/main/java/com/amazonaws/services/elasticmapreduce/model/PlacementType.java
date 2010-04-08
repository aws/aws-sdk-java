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
package com.amazonaws.services.elasticmapreduce.model;

/**
 * <p>
 * </p>
 */
public class PlacementType {

    /**
     * The geographical location of the Amazon EC2 instances.
     */
    private String availabilityZone;

    /**
     * The geographical location of the Amazon EC2 instances.
     *
     * @return The geographical location of the Amazon EC2 instances.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The geographical location of the Amazon EC2 instances.
     *
     * @param availabilityZone The geographical location of the Amazon EC2 instances.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The geographical location of the Amazon EC2 instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The geographical location of the Amazon EC2 instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PlacementType withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    