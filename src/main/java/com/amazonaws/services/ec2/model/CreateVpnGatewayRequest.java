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
 * Create Vpn Gateway Request
 */
public class CreateVpnGatewayRequest extends AmazonWebServiceRequest {

    private String type;

    private String availabilityZone;

    /**
     * Returns the value of the Type property for this object.
     *
     * @return The value of the Type property for this object.
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     *
     * @param type The new value for the Type property for this object.
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVpnGatewayRequest withType(String type) {
        this.type = type;
        return this;
    }
    
    
    /**
     * Returns the value of the AvailabilityZone property for this object.
     *
     * @return The value of the AvailabilityZone property for this object.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * Sets the value of the AvailabilityZone property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The new value for the AvailabilityZone property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVpnGatewayRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
}
    