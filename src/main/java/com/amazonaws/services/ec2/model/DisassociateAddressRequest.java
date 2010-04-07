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
 * A request to disassociate an elastic IP address from the instance to
 * which it is assigned.
 * </p>
 * <p>
 * This is an idempotent operation. If you enter it more than once,
 * Amazon EC2 will not return an error.
 * </p>
 */
public class DisassociateAddressRequest extends AmazonWebServiceRequest {

    /**
     * The elastic IP address that you are disassociating from the instance.
     */
    private String publicIp;

    /**
     * The elastic IP address that you are disassociating from the instance.
     *
     * @return The elastic IP address that you are disassociating from the instance.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The elastic IP address that you are disassociating from the instance.
     *
     * @param publicIp The elastic IP address that you are disassociating from the instance.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The elastic IP address that you are disassociating from the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The elastic IP address that you are disassociating from the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DisassociateAddressRequest withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    
    
}
    