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
 * A complex type that contains the IP address of a Route 53 health
 * checker and the reason for the health check status.
 * </p>
 */
public class HealthCheckObservation implements Serializable {

    /**
     * The IP address of the Route 53 health checker that performed the
     * health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     */
    private String iPAddress;

    /**
     * A complex type that contains information about the health check status
     * for the current observation.
     */
    private StatusReport statusReport;

    /**
     * The IP address of the Route 53 health checker that performed the
     * health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @return The IP address of the Route 53 health checker that performed the
     *         health check.
     */
    public String getIPAddress() {
        return iPAddress;
    }
    
    /**
     * The IP address of the Route 53 health checker that performed the
     * health check.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param iPAddress The IP address of the Route 53 health checker that performed the
     *         health check.
     */
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }
    
    /**
     * The IP address of the Route 53 health checker that performed the
     * health check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 15<br/>
     * <b>Pattern: </b>^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$<br/>
     *
     * @param iPAddress The IP address of the Route 53 health checker that performed the
     *         health check.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckObservation withIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
        return this;
    }

    /**
     * A complex type that contains information about the health check status
     * for the current observation.
     *
     * @return A complex type that contains information about the health check status
     *         for the current observation.
     */
    public StatusReport getStatusReport() {
        return statusReport;
    }
    
    /**
     * A complex type that contains information about the health check status
     * for the current observation.
     *
     * @param statusReport A complex type that contains information about the health check status
     *         for the current observation.
     */
    public void setStatusReport(StatusReport statusReport) {
        this.statusReport = statusReport;
    }
    
    /**
     * A complex type that contains information about the health check status
     * for the current observation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusReport A complex type that contains information about the health check status
     *         for the current observation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public HealthCheckObservation withStatusReport(StatusReport statusReport) {
        this.statusReport = statusReport;
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
        if (getIPAddress() != null) sb.append("IPAddress: " + getIPAddress() + ",");
        if (getStatusReport() != null) sb.append("StatusReport: " + getStatusReport() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode()); 
        hashCode = prime * hashCode + ((getStatusReport() == null) ? 0 : getStatusReport().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HealthCheckObservation == false) return false;
        HealthCheckObservation other = (HealthCheckObservation)obj;
        
        if (other.getIPAddress() == null ^ this.getIPAddress() == null) return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false) return false; 
        if (other.getStatusReport() == null ^ this.getStatusReport() == null) return false;
        if (other.getStatusReport() != null && other.getStatusReport().equals(this.getStatusReport()) == false) return false; 
        return true;
    }
    
}
    