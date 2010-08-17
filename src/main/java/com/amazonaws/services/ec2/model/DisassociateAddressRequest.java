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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#disassociateAddress(DisassociateAddressRequest) DisassociateAddress operation}.
 * <p>
 * The DisassociateAddress operation disassociates the specified elastic
 * IP address from the instance to which it is assigned. This is an
 * idempotent operation. If you enter it more than once, Amazon EC2 does
 * not return an error.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#disassociateAddress(DisassociateAddressRequest)
 */
public class DisassociateAddressRequest extends AmazonWebServiceRequest {

    /**
     * The elastic IP address that you are disassociating from the instance.
     */
    private String publicIp;

    /**
     * Default constructor for a new DisassociateAddressRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DisassociateAddressRequest() {}
    
    /**
     * Constructs a new DisassociateAddressRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param publicIp The elastic IP address that you are disassociating
     * from the instance.
     */
    public DisassociateAddressRequest(String publicIp) {
        this.publicIp = publicIp;
    }
    
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
        sb.append("PublicIp: " + publicIp + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    