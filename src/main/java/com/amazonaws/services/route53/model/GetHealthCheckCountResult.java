/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that contains the count of health checks associated
 * with the current AWS account.
 * </p>
 */
public class GetHealthCheckCountResult implements Serializable {

    /**
     * The number of health checks associated with the current AWS account.
     */
    private Long healthCheckCount;

    /**
     * The number of health checks associated with the current AWS account.
     *
     * @return The number of health checks associated with the current AWS account.
     */
    public Long getHealthCheckCount() {
        return healthCheckCount;
    }
    
    /**
     * The number of health checks associated with the current AWS account.
     *
     * @param healthCheckCount The number of health checks associated with the current AWS account.
     */
    public void setHealthCheckCount(Long healthCheckCount) {
        this.healthCheckCount = healthCheckCount;
    }
    
    /**
     * The number of health checks associated with the current AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckCount The number of health checks associated with the current AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetHealthCheckCountResult withHealthCheckCount(Long healthCheckCount) {
        this.healthCheckCount = healthCheckCount;
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
        if (getHealthCheckCount() != null) sb.append("HealthCheckCount: " + getHealthCheckCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHealthCheckCount() == null) ? 0 : getHealthCheckCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetHealthCheckCountResult == false) return false;
        GetHealthCheckCountResult other = (GetHealthCheckCountResult)obj;
        
        if (other.getHealthCheckCount() == null ^ this.getHealthCheckCount() == null) return false;
        if (other.getHealthCheckCount() != null && other.getHealthCheckCount().equals(this.getHealthCheckCount()) == false) return false; 
        return true;
    }
    
}
    