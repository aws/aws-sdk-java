/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker.
 * </p>
 */
public class HealthCheckObservation implements Serializable, Cloneable {

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the failure reason in
     * <code>StatusReport</code>.
     * </p>
     */
    private String iPAddress;
    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the
     * time of the failed health check.
     * </p>
     */
    private StatusReport statusReport;

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * @see HealthCheckRegion
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * </p>
     * 
     * @return The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * @see HealthCheckRegion
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckObservation withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * @see HealthCheckRegion
     */

    public void setRegion(HealthCheckRegion region) {
        this.region = region.toString();
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in StatusReport.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckObservation withRegion(HealthCheckRegion region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the failure reason in
     * <code>StatusReport</code>.
     * </p>
     * 
     * @param iPAddress
     *        The IP address of the Amazon Route 53 health checker that provided the failure reason in
     *        <code>StatusReport</code>.
     */

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the failure reason in
     * <code>StatusReport</code>.
     * </p>
     * 
     * @return The IP address of the Amazon Route 53 health checker that provided the failure reason in
     *         <code>StatusReport</code>.
     */

    public String getIPAddress() {
        return this.iPAddress;
    }

    /**
     * <p>
     * The IP address of the Amazon Route 53 health checker that provided the failure reason in
     * <code>StatusReport</code>.
     * </p>
     * 
     * @param iPAddress
     *        The IP address of the Amazon Route 53 health checker that provided the failure reason in
     *        <code>StatusReport</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckObservation withIPAddress(String iPAddress) {
        setIPAddress(iPAddress);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the
     * time of the failed health check.
     * </p>
     * 
     * @param statusReport
     *        A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and
     *        the time of the failed health check.
     */

    public void setStatusReport(StatusReport statusReport) {
        this.statusReport = statusReport;
    }

    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the
     * time of the failed health check.
     * </p>
     * 
     * @return A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker
     *         and the time of the failed health check.
     */

    public StatusReport getStatusReport() {
        return this.statusReport;
    }

    /**
     * <p>
     * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the
     * time of the failed health check.
     * </p>
     * 
     * @param statusReport
     *        A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and
     *        the time of the failed health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckObservation withStatusReport(StatusReport statusReport) {
        setStatusReport(statusReport);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
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
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getStatusReport() == null ^ this.getStatusReport() == null)
            return false;
        if (other.getStatusReport() != null && other.getStatusReport().equals(this.getStatusReport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode + ((getStatusReport() == null) ? 0 : getStatusReport().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckObservation clone() {
        try {
            return (HealthCheckObservation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
