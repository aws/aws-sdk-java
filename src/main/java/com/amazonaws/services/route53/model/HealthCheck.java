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
 * A complex type that contains identifying information about the health check.
 * </p>
 */
public class HealthCheck implements Serializable {

    /**
     * The ID of the specified health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String id;

    /**
     * A unique string that identifies the request to create the health
     * check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String callerReference;

    /**
     * A complex type that contains the health check configuration.
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * The ID of the specified health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The ID of the specified health check.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the specified health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param id The ID of the specified health check.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the specified health check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param id The ID of the specified health check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A unique string that identifies the request to create the health
     * check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return A unique string that identifies the request to create the health
     *         check.
     */
    public String getCallerReference() {
        return callerReference;
    }
    
    /**
     * A unique string that identifies the request to create the health
     * check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param callerReference A unique string that identifies the request to create the health
     *         check.
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }
    
    /**
     * A unique string that identifies the request to create the health
     * check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param callerReference A unique string that identifies the request to create the health
     *         check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withCallerReference(String callerReference) {
        this.callerReference = callerReference;
        return this;
    }

    /**
     * A complex type that contains the health check configuration.
     *
     * @return A complex type that contains the health check configuration.
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return healthCheckConfig;
    }
    
    /**
     * A complex type that contains the health check configuration.
     *
     * @param healthCheckConfig A complex type that contains the health check configuration.
     */
    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }
    
    /**
     * A complex type that contains the health check configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckConfig A complex type that contains the health check configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HealthCheck withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getCallerReference() != null) sb.append("CallerReference: " + getCallerReference() + ",");
        if (getHealthCheckConfig() != null) sb.append("HealthCheckConfig: " + getHealthCheckConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getCallerReference() == null) ? 0 : getCallerReference().hashCode()); 
        hashCode = prime * hashCode + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HealthCheck == false) return false;
        HealthCheck other = (HealthCheck)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getCallerReference() == null ^ this.getCallerReference() == null) return false;
        if (other.getCallerReference() != null && other.getCallerReference().equals(this.getCallerReference()) == false) return false; 
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null) return false;
        if (other.getHealthCheckConfig() != null && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false) return false; 
        return true;
    }
    
}
    