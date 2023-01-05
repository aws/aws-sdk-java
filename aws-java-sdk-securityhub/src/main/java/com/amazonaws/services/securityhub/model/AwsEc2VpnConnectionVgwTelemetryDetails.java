/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the VPN tunnel.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VpnConnectionVgwTelemetryDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpnConnectionVgwTelemetryDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of accepted routes.
     * </p>
     */
    private Integer acceptedRouteCount;
    /**
     * <p>
     * The ARN of the VPN tunnel endpoint certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String lastStatusChange;
    /**
     * <p>
     * The Internet-routable IP address of the virtual private gateway's outside interface.
     * </p>
     */
    private String outsideIpAddress;
    /**
     * <p>
     * The status of the VPN tunnel. Valid values are <code>DOWN</code> or <code>UP</code>.
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

    public AwsEc2VpnConnectionVgwTelemetryDetails withAcceptedRouteCount(Integer acceptedRouteCount) {
        setAcceptedRouteCount(acceptedRouteCount);
        return this;
    }

    /**
     * <p>
     * The ARN of the VPN tunnel endpoint certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the VPN tunnel endpoint certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the VPN tunnel endpoint certificate.
     * </p>
     * 
     * @return The ARN of the VPN tunnel endpoint certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the VPN tunnel endpoint certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the VPN tunnel endpoint certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionVgwTelemetryDetails withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastStatusChange
     *        The date and time of the last change in status.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setLastStatusChange(String lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return The date and time of the last change in status.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getLastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * <p>
     * The date and time of the last change in status.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param lastStatusChange
     *        The date and time of the last change in status.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionVgwTelemetryDetails withLastStatusChange(String lastStatusChange) {
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

    public AwsEc2VpnConnectionVgwTelemetryDetails withOutsideIpAddress(String outsideIpAddress) {
        setOutsideIpAddress(outsideIpAddress);
        return this;
    }

    /**
     * <p>
     * The status of the VPN tunnel. Valid values are <code>DOWN</code> or <code>UP</code>.
     * </p>
     * 
     * @param status
     *        The status of the VPN tunnel. Valid values are <code>DOWN</code> or <code>UP</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPN tunnel. Valid values are <code>DOWN</code> or <code>UP</code>.
     * </p>
     * 
     * @return The status of the VPN tunnel. Valid values are <code>DOWN</code> or <code>UP</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the VPN tunnel. Valid values are <code>DOWN</code> or <code>UP</code>.
     * </p>
     * 
     * @param status
     *        The status of the VPN tunnel. Valid values are <code>DOWN</code> or <code>UP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpnConnectionVgwTelemetryDetails withStatus(String status) {
        setStatus(status);
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

    public AwsEc2VpnConnectionVgwTelemetryDetails withStatusMessage(String statusMessage) {
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
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

        if (obj instanceof AwsEc2VpnConnectionVgwTelemetryDetails == false)
            return false;
        AwsEc2VpnConnectionVgwTelemetryDetails other = (AwsEc2VpnConnectionVgwTelemetryDetails) obj;
        if (other.getAcceptedRouteCount() == null ^ this.getAcceptedRouteCount() == null)
            return false;
        if (other.getAcceptedRouteCount() != null && other.getAcceptedRouteCount().equals(this.getAcceptedRouteCount()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
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
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getLastStatusChange() == null) ? 0 : getLastStatusChange().hashCode());
        hashCode = prime * hashCode + ((getOutsideIpAddress() == null) ? 0 : getOutsideIpAddress().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VpnConnectionVgwTelemetryDetails clone() {
        try {
            return (AwsEc2VpnConnectionVgwTelemetryDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VpnConnectionVgwTelemetryDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
