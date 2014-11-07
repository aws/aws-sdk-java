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
 * A complex type that contains information about the most recent failure
 * for the specified health check.
 * </p>
 */
public class GetHealthCheckLastFailureReasonResult implements Serializable {

    /**
     * A list that contains one <code>HealthCheckObservation</code> element
     * for each Route 53 health checker.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheckObservation> healthCheckObservations;

    /**
     * A list that contains one <code>HealthCheckObservation</code> element
     * for each Route 53 health checker.
     *
     * @return A list that contains one <code>HealthCheckObservation</code> element
     *         for each Route 53 health checker.
     */
    public java.util.List<HealthCheckObservation> getHealthCheckObservations() {
        if (healthCheckObservations == null) {
              healthCheckObservations = new com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheckObservation>();
              healthCheckObservations.setAutoConstruct(true);
        }
        return healthCheckObservations;
    }
    
    /**
     * A list that contains one <code>HealthCheckObservation</code> element
     * for each Route 53 health checker.
     *
     * @param healthCheckObservations A list that contains one <code>HealthCheckObservation</code> element
     *         for each Route 53 health checker.
     */
    public void setHealthCheckObservations(java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        if (healthCheckObservations == null) {
            this.healthCheckObservations = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheckObservation> healthCheckObservationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheckObservation>(healthCheckObservations.size());
        healthCheckObservationsCopy.addAll(healthCheckObservations);
        this.healthCheckObservations = healthCheckObservationsCopy;
    }
    
    /**
     * A list that contains one <code>HealthCheckObservation</code> element
     * for each Route 53 health checker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckObservations A list that contains one <code>HealthCheckObservation</code> element
     *         for each Route 53 health checker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetHealthCheckLastFailureReasonResult withHealthCheckObservations(HealthCheckObservation... healthCheckObservations) {
        if (getHealthCheckObservations() == null) setHealthCheckObservations(new java.util.ArrayList<HealthCheckObservation>(healthCheckObservations.length));
        for (HealthCheckObservation value : healthCheckObservations) {
            getHealthCheckObservations().add(value);
        }
        return this;
    }
    
    /**
     * A list that contains one <code>HealthCheckObservation</code> element
     * for each Route 53 health checker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheckObservations A list that contains one <code>HealthCheckObservation</code> element
     *         for each Route 53 health checker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetHealthCheckLastFailureReasonResult withHealthCheckObservations(java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        if (healthCheckObservations == null) {
            this.healthCheckObservations = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheckObservation> healthCheckObservationsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HealthCheckObservation>(healthCheckObservations.size());
            healthCheckObservationsCopy.addAll(healthCheckObservations);
            this.healthCheckObservations = healthCheckObservationsCopy;
        }

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
        if (getHealthCheckObservations() != null) sb.append("HealthCheckObservations: " + getHealthCheckObservations() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHealthCheckObservations() == null) ? 0 : getHealthCheckObservations().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetHealthCheckLastFailureReasonResult == false) return false;
        GetHealthCheckLastFailureReasonResult other = (GetHealthCheckLastFailureReasonResult)obj;
        
        if (other.getHealthCheckObservations() == null ^ this.getHealthCheckObservations() == null) return false;
        if (other.getHealthCheckObservations() != null && other.getHealthCheckObservations().equals(this.getHealthCheckObservations()) == false) return false; 
        return true;
    }
    
}
    