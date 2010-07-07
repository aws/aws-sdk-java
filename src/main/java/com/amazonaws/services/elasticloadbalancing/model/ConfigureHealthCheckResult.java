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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Configure Health Check Result
 */
public class ConfigureHealthCheckResult {

    private HealthCheck healthCheck;

    /**
     * Returns the value of the HealthCheck property for this object.
     *
     * @return The value of the HealthCheck property for this object.
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }
    
    /**
     * Sets the value of the HealthCheck property for this object.
     *
     * @param healthCheck The new value for the HealthCheck property for this object.
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }
    
    /**
     * Sets the value of the HealthCheck property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheck The new value for the HealthCheck property for this object.
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
        sb.append("HealthCheck: " + healthCheck + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    