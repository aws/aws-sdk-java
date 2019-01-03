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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes telemetry for a VPN tunnel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VgwTelemetry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VgwTelemetry implements Serializable, Cloneable {

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     */
    private Integer acceptedRouteCount;
    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     */
    private java.util.Date lastStatusChange;
    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside interface.
     * </p>
     */
    private String outsideIpAddress;
    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     */
    private String status;
    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     */
    private String statusMessage;

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     * 
     * @param acceptedRouteCount
     *        The number of accepted routes.
     */

    public void setAcceptedRouteCount(Integer acceptedRouteCount) {
        this.acceptedRouteCount = acceptedRouteCount;
    }

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     * 
     * @return The number of accepted routes.
     */

    public Integer getAcceptedRouteCount() {
        return this.acceptedRouteCount;
    }

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     * 
     * @param acceptedRouteCount
     *        The number of accepted routes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VgwTelemetry withAcceptedRouteCount(Integer acceptedRouteCount) {
        setAcceptedRouteCount(acceptedRouteCount);
        return this;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * 
     * @param lastStatusChange
     *        The date and time of the last change in status.
     */

    public void setLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * 
     * @return The date and time of the last change in status.
     */

    public java.util.Date getLastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * 
     * @param lastStatusChange
     *        The date and time of the last change in status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VgwTelemetry withLastStatusChange(java.util.Date lastStatusChange) {
        setLastStatusChange(lastStatusChange);
        return this;
    }

    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside interface.
     * </p>
     * 
     * @param outsideIpAddress
     *        The Internet-routable IP address of the virtual private gateway's outside interface.
     */

    public void setOutsideIpAddress(String outsideIpAddress) {
        this.outsideIpAddress = outsideIpAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside interface.
     * </p>
     * 
     * @return The Internet-routable IP address of the virtual private gateway's outside interface.
     */

    public String getOutsideIpAddress() {
        return this.outsideIpAddress;
    }

    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside interface.
     * </p>
     * 
     * @param outsideIpAddress
     *        The Internet-routable IP address of the virtual private gateway's outside interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VgwTelemetry withOutsideIpAddress(String outsideIpAddress) {
        setOutsideIpAddress(outsideIpAddress);
        return this;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * 
     * @param status
     *        The status of the VPN tunnel.
     * @see TelemetryStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * 
     * @return The status of the VPN tunnel.
     * @see TelemetryStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * 
     * @param status
     *        The status of the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TelemetryStatus
     */

    public VgwTelemetry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * 
     * @param status
     *        The status of the VPN tunnel.
     * @see TelemetryStatus
     */

    public void setStatus(TelemetryStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the VPN tunnel.
     * </p>
     * 
     * @param status
     *        The status of the VPN tunnel.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TelemetryStatus
     */

    public VgwTelemetry withStatus(TelemetryStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     * 
     * @param statusMessage
     *        If an error occurs, a description of the error.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     * 
     * @return If an error occurs, a description of the error.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * If an error occurs, a description of the error.
     * </p>
     * 
     * @param statusMessage
     *        If an error occurs, a description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VgwTelemetry withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
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
        if (getAcceptedRouteCount() != null)
            sb.append("AcceptedRouteCount: ").append(getAcceptedRouteCount()).append(",");
        if (getLastStatusChange() != null)
            sb.append("LastStatusChange: ").append(getLastStatusChange()).append(",");
        if (getOutsideIpAddress() != null)
            sb.append("OutsideIpAddress: ").append(getOutsideIpAddress()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VgwTelemetry == false)
            return false;
        VgwTelemetry other = (VgwTelemetry) obj;
        if (other.getAcceptedRouteCount() == null ^ this.getAcceptedRouteCount() == null)
            return false;
        if (other.getAcceptedRouteCount() != null && other.getAcceptedRouteCount().equals(this.getAcceptedRouteCount()) == false)
            return false;
        if (other.getLastStatusChange() == null ^ this.getLastStatusChange() == null)
            return false;
        if (other.getLastStatusChange() != null && other.getLastStatusChange().equals(this.getLastStatusChange()) == false)
            return false;
        if (other.getOutsideIpAddress() == null ^ this.getOutsideIpAddress() == null)
            return false;
        if (other.getOutsideIpAddress() != null && other.getOutsideIpAddress().equals(this.getOutsideIpAddress()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptedRouteCount() == null) ? 0 : getAcceptedRouteCount().hashCode());
        hashCode = prime * hashCode + ((getLastStatusChange() == null) ? 0 : getLastStatusChange().hashCode());
        hashCode = prime * hashCode + ((getOutsideIpAddress() == null) ? 0 : getOutsideIpAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public VgwTelemetry clone() {
        try {
            return (VgwTelemetry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
