/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 */
public class CreateVpcResult implements Serializable {

    /**
     * Information about the VPC.
     */
    private Vpc vpc;

    /**
     * Information about the VPC.
     *
     * @return Information about the VPC.
     */
    public Vpc getVpc() {
        return vpc;
    }
    
    /**
     * Information about the VPC.
     *
     * @param vpc Information about the VPC.
     */
    public void setVpc(Vpc vpc) {
        this.vpc = vpc;
    }
    
    /**
     * Information about the VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpc Information about the VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateVpcResult withVpc(Vpc vpc) {
        this.vpc = vpc;
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
        if (getVpc() != null) sb.append("Vpc: " + getVpc() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateVpcResult == false) return false;
        CreateVpcResult other = (CreateVpcResult)obj;
        
        if (other.getVpc() == null ^ this.getVpc() == null) return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false) return false; 
        return true;
    }
    
}
    