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
 * Describes the instance status.
 * </p>
 */
public class InstanceStatusDetails implements Serializable {

    /**
     * The type of instance status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     */
    private String name;

    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data
     */
    private String status;

    /**
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     */
    private java.util.Date impairedSince;

    /**
     * The type of instance status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @return The type of instance status.
     *
     * @see StatusName
     */
    public String getName() {
        return name;
    }
    
    /**
     * The type of instance status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name The type of instance status.
     *
     * @see StatusName
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The type of instance status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name The type of instance status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusName
     */
    public InstanceStatusDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The type of instance status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name The type of instance status.
     *
     * @see StatusName
     */
    public void setName(StatusName name) {
        this.name = name.toString();
    }
    
    /**
     * The type of instance status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>reachability
     *
     * @param name The type of instance status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusName
     */
    public InstanceStatusDetails withName(StatusName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data
     *
     * @return The status.
     *
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data
     *
     * @param status The status.
     *
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data
     *
     * @param status The status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public InstanceStatusDetails withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data
     *
     * @param status The status.
     *
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }
    
    /**
     * The status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>passed, failed, insufficient-data
     *
     * @param status The status.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public InstanceStatusDetails withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     *
     * @return The time when a status check failed. For an instance that was launched
     *         and impaired, this is the time when the instance was launched.
     */
    public java.util.Date getImpairedSince() {
        return impairedSince;
    }
    
    /**
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     *
     * @param impairedSince The time when a status check failed. For an instance that was launched
     *         and impaired, this is the time when the instance was launched.
     */
    public void setImpairedSince(java.util.Date impairedSince) {
        this.impairedSince = impairedSince;
    }
    
    /**
     * The time when a status check failed. For an instance that was launched
     * and impaired, this is the time when the instance was launched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param impairedSince The time when a status check failed. For an instance that was launched
     *         and impaired, this is the time when the instance was launched.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceStatusDetails withImpairedSince(java.util.Date impairedSince) {
        this.impairedSince = impairedSince;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getImpairedSince() != null) sb.append("ImpairedSince: " + getImpairedSince() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getImpairedSince() == null) ? 0 : getImpairedSince().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceStatusDetails == false) return false;
        InstanceStatusDetails other = (InstanceStatusDetails)obj;
        
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getImpairedSince() == null ^ this.getImpairedSince() == null) return false;
        if (other.getImpairedSince() != null && other.getImpairedSince().equals(this.getImpairedSince()) == false) return false; 
        return true;
    }
    
}
    