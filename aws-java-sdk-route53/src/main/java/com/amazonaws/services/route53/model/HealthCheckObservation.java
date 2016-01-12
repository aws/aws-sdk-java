/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * A complex type that contains the IP address of a Amazon Route 53 health
 * checker and the reason for the health check status.
 * </p>
 */
public class HealthCheckObservation implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that performed the
     * health check.
     * </p>
     */
    private String iPAddress;
    /**
     * <p>
     * A complex type that contains information about the health check status
     * for the current observation.
     * </p>
     */
    private StatusReport statusReport;

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that performed the
     * health check.
     * </p>
     * 
     * @param iPAddress
     *        The IP address of the Amazon Route 53 health checker that
     *        performed the health check.
     */
    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that performed the
     * health check.
     * </p>
     * 
     * @return The IP address of the Amazon Route 53 health checker that
     *         performed the health check.
     */
    public String getIPAddress() {
        return this.iPAddress;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that performed the
     * health check.
     * </p>
     * 
     * @param iPAddress
     *        The IP address of the Amazon Route 53 health checker that
     *        performed the health check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public HealthCheckObservation withIPAddress(String iPAddress) {
        setIPAddress(iPAddress);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the health check status
     * for the current observation.
     * </p>
     * 
     * @param statusReport
     *        A complex type that contains information about the health check
     *        status for the current observation.
     */
    public void setStatusReport(StatusReport statusReport) {
        this.statusReport = statusReport;
    }

    /**
     * <p>
     * A complex type that contains information about the health check status
     * for the current observation.
     * </p>
     * 
     * @return A complex type that contains information about the health check
     *         status for the current observation.
     */
    public StatusReport getStatusReport() {
        return this.statusReport;
    }

    /**
     * <p>
     * A complex type that contains information about the health check status
     * for the current observation.
     * </p>
     * 
     * @param statusReport
     *        A complex type that contains information about the health check
     *        status for the current observation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public HealthCheckObservation withStatusReport(StatusReport statusReport) {
        setStatusReport(statusReport);
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
        if (getIPAddress() != null)
            sb.append("IPAddress: " + getIPAddress() + ",");
        if (getStatusReport() != null)
            sb.append("StatusReport: " + getStatusReport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckObservation == false)
            return false;
        HealthCheckObservation other = (HealthCheckObservation) obj;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null
                && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getStatusReport() == null ^ this.getStatusReport() == null)
            return false;
        if (other.getStatusReport() != null
                && other.getStatusReport().equals(this.getStatusReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getStatusReport() == null) ? 0 : getStatusReport()
                        .hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckObservation clone() {
        try {
            return (HealthCheckObservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}