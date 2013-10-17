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
package com.amazonaws.services.route53.model;

import java.io.Serializable;


/**
 * <p>
 * A complex type containing information about the specified health check.
 * </p>
 */
public class GetHealthCheckResult implements Serializable {

    /**
     * A complex type that contains the information about the specified
     * health check.
     */
    private HealthCheck healthCheck;

    /**
     * A complex type that contains the information about the specified
     * health check.
     *
     * @return A complex type that contains the information about the specified
     *         health check.
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }
    
    /**
     * A complex type that contains the information about the specified
     * health check.
     *
     * @param healthCheck A complex type that contains the information about the specified
     *         health check.
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }
    
    /**
     * A complex type that contains the information about the specified
     * health check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheck A complex type that contains the information about the specified
     *         health check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetHealthCheckResult withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
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
        if (getHealthCheck() != null) sb.append("HealthCheck: " + getHealthCheck() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetHealthCheckResult == false) return false;
        GetHealthCheckResult other = (GetHealthCheckResult)obj;
        
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null) return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false) return false; 
        return true;
    }
    
}
    