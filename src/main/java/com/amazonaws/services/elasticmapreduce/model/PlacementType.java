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
 * Specifies the Amazon EC2 location for the job flow.
 * </p>
 */
public class PlacementType {

    /**
     * The Amazon EC2 Availability Zone for the job flow.
     */
    private String availabilityZone;

    /**
     * The Amazon EC2 Availability Zone for the job flow.
     *
     * @return The Amazon EC2 Availability Zone for the job flow.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone for the job flow.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone for the job flow.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone for the job flow.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone for the job flow.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PlacementType withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
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
        sb.append("AvailabilityZone: " + availabilityZone + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    