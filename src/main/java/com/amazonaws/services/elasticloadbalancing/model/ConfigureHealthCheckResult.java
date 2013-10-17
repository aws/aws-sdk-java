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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * The output for the ConfigureHealthCheck action.
 * </p>
 */
public class ConfigureHealthCheckResult implements Serializable {

    /**
     * The updated healthcheck for the instances.
     */
    private HealthCheck healthCheck;

    /**
     * The updated healthcheck for the instances.
     *
     * @return The updated healthcheck for the instances.
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }
    
    /**
     * The updated healthcheck for the instances.
     *
     * @param healthCheck The updated healthcheck for the instances.
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }
    
    /**
     * The updated healthcheck for the instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheck The updated healthcheck for the instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigureHealthCheckResult withHealthCheck(HealthCheck healthCheck) {
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

        if (obj instanceof ConfigureHealthCheckResult == false) return false;
        ConfigureHealthCheckResult other = (ConfigureHealthCheckResult)obj;
        
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null) return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false) return false; 
        return true;
    }
    
}
    