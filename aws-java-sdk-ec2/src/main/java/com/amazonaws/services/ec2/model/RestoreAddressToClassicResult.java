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
 * 
 */
public class RestoreAddressToClassicResult implements Serializable, Cloneable {

    /**
     * The move status for the IP address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     */
    private String status;

    /**
     * The Elastic IP address.
     */
    private String publicIp;

    /**
     * The move status for the IP address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @return The move status for the IP address.
     *
     * @see Status
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The move status for the IP address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status The move status for the IP address.
     *
     * @see Status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The move status for the IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status The move status for the IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Status
     */
    public RestoreAddressToClassicResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The move status for the IP address.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status The move status for the IP address.
     *
     * @see Status
     */
    public void setStatus(Status status) {
        this.status = status.toString();
    }
    
    /**
     * The move status for the IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MoveInProgress, InVpc, InClassic
     *
     * @param status The move status for the IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Status
     */
    public RestoreAddressToClassicResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The Elastic IP address.
     *
     * @return The Elastic IP address.
     */
    public String getPublicIp() {
        return publicIp;
    }
    
    /**
     * The Elastic IP address.
     *
     * @param publicIp The Elastic IP address.
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }
    
    /**
     * The Elastic IP address.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIp The Elastic IP address.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreAddressToClassicResult withPublicIp(String publicIp) {
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getPublicIp() != null) sb.append("PublicIp: " + getPublicIp() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreAddressToClassicResult == false) return false;
        RestoreAddressToClassicResult other = (RestoreAddressToClassicResult)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getPublicIp() == null ^ this.getPublicIp() == null) return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false) return false; 
        return true;
    }
    
    @Override
    public RestoreAddressToClassicResult clone() {
        try {
            return (RestoreAddressToClassicResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    