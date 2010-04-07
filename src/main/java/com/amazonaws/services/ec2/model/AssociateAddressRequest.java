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
 * Associates an elastic IP address with an instance. If the IP address
 * is currently assigned to another instance, the IP address is assigned
 * to the new instance.
 * </p>
 * <p>
 * This is an idempotent operation. If you enter it more than once,
 * Amazon EC2 does not return an error.
 * </p>
 */
public class AssociateAddressRequest extends AmazonWebServiceRequest {

    /**
     * The instance to associate with the IP address.
     */
    private String instanceId;

    /**
     * IP address that you are assigning to the instance.
     */
    private String publicIp;

    /**
     * The instance to associate with the IP address.
     *
     * @return The instance to associate with the IP address.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance to associate with the IP address.
     *
     * @param instanceId The instance to associate with the IP address.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance to associate with the IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance to associate with the IP address.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateAddressRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * IP address that you are assigning to the instance.
     *
     * @return IP address that you are assigning to the instance.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * IP address that you are assigning to the instance.
     *
     * @param publicIp IP address that you are assigning to the instance.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * IP address that you are assigning to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp IP address that you are assigning to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public AssociateAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    
    
}
    