/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/HealthCheckObservation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckObservation implements Serializable, Cloneable {

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
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
     * The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * @see HealthCheckRegion
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * </p>
     * 
     * @return The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * @see HealthCheckRegion
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckObservation withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * @see HealthCheckRegion
     */

    public void setRegion(HealthCheckRegion region) {
        withRegion(region);
    }

    /**
     * <p>
     * The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * </p>
     * 
     * @param region
     *        The region of the Amazon Route 53 health checker that provided the status in <code>StatusReport</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckObservation withRegion(HealthCheckRegion region) {
        this.region = region.toString();
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
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("Region: ").append(getRegion()).append(",");
        if (getIPAddress() != null)
            sb.append("IPAddress: ").append(getIPAddress()).append(",");
        if (getStatusReport() != null)
            sb.append("StatusReport: ").append(getStatusReport());
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
