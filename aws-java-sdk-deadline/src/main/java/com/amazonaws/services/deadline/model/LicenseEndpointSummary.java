/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details for a license endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/LicenseEndpointSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseEndpointSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The license endpoint ID.
     * </p>
     */
    private String licenseEndpointId;
    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The license endpoint ID.
     * </p>
     * 
     * @param licenseEndpointId
     *        The license endpoint ID.
     */

    public void setLicenseEndpointId(String licenseEndpointId) {
        this.licenseEndpointId = licenseEndpointId;
    }

    /**
     * <p>
     * The license endpoint ID.
     * </p>
     * 
     * @return The license endpoint ID.
     */

    public String getLicenseEndpointId() {
        return this.licenseEndpointId;
    }

    /**
     * <p>
     * The license endpoint ID.
     * </p>
     * 
     * @param licenseEndpointId
     *        The license endpoint ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseEndpointSummary withLicenseEndpointId(String licenseEndpointId) {
        setLicenseEndpointId(licenseEndpointId);
        return this;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @param status
     *        The status of the license endpoint.
     * @see LicenseEndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @return The status of the license endpoint.
     * @see LicenseEndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @param status
     *        The status of the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEndpointStatus
     */

    public LicenseEndpointSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the license endpoint.
     * </p>
     * 
     * @param status
     *        The status of the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseEndpointStatus
     */

    public LicenseEndpointSummary withStatus(LicenseEndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the license endpoint.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     * 
     * @return The status message of the license endpoint.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message of the license endpoint.
     * </p>
     * 
     * @param statusMessage
     *        The status message of the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseEndpointSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     * 
     * @param vpcId
     *        The VCP(virtual private cloud) ID associated with the license endpoint.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     * 
     * @return The VCP(virtual private cloud) ID associated with the license endpoint.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     * </p>
     * 
     * @param vpcId
     *        The VCP(virtual private cloud) ID associated with the license endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseEndpointSummary withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getLicenseEndpointId() != null)
            sb.append("LicenseEndpointId: ").append(getLicenseEndpointId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseEndpointSummary == false)
            return false;
        LicenseEndpointSummary other = (LicenseEndpointSummary) obj;
        if (other.getLicenseEndpointId() == null ^ this.getLicenseEndpointId() == null)
            return false;
        if (other.getLicenseEndpointId() != null && other.getLicenseEndpointId().equals(this.getLicenseEndpointId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseEndpointId() == null) ? 0 : getLicenseEndpointId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public LicenseEndpointSummary clone() {
        try {
            return (LicenseEndpointSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.LicenseEndpointSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
