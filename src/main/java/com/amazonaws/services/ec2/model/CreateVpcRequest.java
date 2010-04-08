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
public class CreateVpcRequest extends AmazonWebServiceRequest {

    /**
     * A valid CIDR block.
     */
    private String cidrBlock;

    /**
     * A valid CIDR block.
     *
     * @return A valid CIDR block.
     */
    public String getCidrBlock() {
        return cidrBlock;
    }
    
    /**
     * A valid CIDR block.
     *
     * @param cidrBlock A valid CIDR block.
     */
    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    /**
     * A valid CIDR block.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cidrBlock A valid CIDR block.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateVpcRequest withCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("CidrBlock: " + cidrBlock + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    