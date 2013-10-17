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
 * Part of a request to launch Amazon EC2 instances, specifying which license pool to use if a license should be attached to the new Amazon EC2
 * instance.
 * </p>
 */
public class InstanceLicenseSpecification implements Serializable {

    /**
     * The license pool from which to take a license when starting Amazon EC2
     * instances in the associated <code>RunInstances</code> request.
     */
    private String pool;

    /**
     * The license pool from which to take a license when starting Amazon EC2
     * instances in the associated <code>RunInstances</code> request.
     *
     * @return The license pool from which to take a license when starting Amazon EC2
     *         instances in the associated <code>RunInstances</code> request.
     */
    public String getPool() {
        return pool;
    }
    
    /**
     * The license pool from which to take a license when starting Amazon EC2
     * instances in the associated <code>RunInstances</code> request.
     *
     * @param pool The license pool from which to take a license when starting Amazon EC2
     *         instances in the associated <code>RunInstances</code> request.
     */
    public void setPool(String pool) {
        this.pool = pool;
    }
    
    /**
     * The license pool from which to take a license when starting Amazon EC2
     * instances in the associated <code>RunInstances</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pool The license pool from which to take a license when starting Amazon EC2
     *         instances in the associated <code>RunInstances</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceLicenseSpecification withPool(String pool) {
        this.pool = pool;
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
        if (getPool() != null) sb.append("Pool: " + getPool() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPool() == null) ? 0 : getPool().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceLicenseSpecification == false) return false;
        InstanceLicenseSpecification other = (InstanceLicenseSpecification)obj;
        
        if (other.getPool() == null ^ this.getPool() == null) return false;
        if (other.getPool() != null && other.getPool().equals(this.getPool()) == false) return false; 
        return true;
    }
    
}
    