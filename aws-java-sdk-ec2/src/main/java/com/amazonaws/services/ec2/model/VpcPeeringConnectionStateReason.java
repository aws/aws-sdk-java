/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes the status of a VPC peering connection.
 * </p>
 */
public class VpcPeeringConnectionStateReason implements Serializable {

    /**
     * The status of the VPC peering connection.
     */
    private String code;

    /**
     * A message that provides more information about the status, if
     * applicable.
     */
    private String message;

    /**
     * The status of the VPC peering connection.
     *
     * @return The status of the VPC peering connection.
     */
    public String getCode() {
        return code;
    }
    
    /**
     * The status of the VPC peering connection.
     *
     * @param code The status of the VPC peering connection.
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * The status of the VPC peering connection.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param code The status of the VPC peering connection.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnectionStateReason withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * A message that provides more information about the status, if
     * applicable.
     *
     * @return A message that provides more information about the status, if
     *         applicable.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * A message that provides more information about the status, if
     * applicable.
     *
     * @param message A message that provides more information about the status, if
     *         applicable.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * A message that provides more information about the status, if
     * applicable.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message A message that provides more information about the status, if
     *         applicable.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public VpcPeeringConnectionStateReason withMessage(String message) {
        this.message = message;
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
        if (getCode() != null) sb.append("Code: " + getCode() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode()); 
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VpcPeeringConnectionStateReason == false) return false;
        VpcPeeringConnectionStateReason other = (VpcPeeringConnectionStateReason)obj;
        
        if (other.getCode() == null ^ this.getCode() == null) return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        return true;
    }
    
}
    