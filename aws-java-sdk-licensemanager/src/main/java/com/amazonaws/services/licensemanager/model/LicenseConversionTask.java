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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a license type conversion task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/LicenseConversionTask"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LicenseConversionTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the license type conversion task.
     * </p>
     */
    private String licenseConversionTaskId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Information about the license type this conversion task converted from.
     * </p>
     */
    private LicenseConversionContext sourceLicenseContext;
    /**
     * <p>
     * Information about the license type this conversion task converted to.
     * </p>
     */
    private LicenseConversionContext destinationLicenseContext;
    /**
     * <p>
     * The status of the conversion task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message for the conversion task.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The time the conversion task was started at.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time the usage operation value of the resource was changed.
     * </p>
     */
    private java.util.Date licenseConversionTime;
    /**
     * <p>
     * The time the conversion task was completed.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The ID of the license type conversion task.
     * </p>
     * 
     * @param licenseConversionTaskId
     *        The ID of the license type conversion task.
     */

    public void setLicenseConversionTaskId(String licenseConversionTaskId) {
        this.licenseConversionTaskId = licenseConversionTaskId;
    }

    /**
     * <p>
     * The ID of the license type conversion task.
     * </p>
     * 
     * @return The ID of the license type conversion task.
     */

    public String getLicenseConversionTaskId() {
        return this.licenseConversionTaskId;
    }

    /**
     * <p>
     * The ID of the license type conversion task.
     * </p>
     * 
     * @param licenseConversionTaskId
     *        The ID of the license type conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withLicenseConversionTaskId(String licenseConversionTaskId) {
        setLicenseConversionTaskId(licenseConversionTaskId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource associated with the license type conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Information about the license type this conversion task converted from.
     * </p>
     * 
     * @param sourceLicenseContext
     *        Information about the license type this conversion task converted from.
     */

    public void setSourceLicenseContext(LicenseConversionContext sourceLicenseContext) {
        this.sourceLicenseContext = sourceLicenseContext;
    }

    /**
     * <p>
     * Information about the license type this conversion task converted from.
     * </p>
     * 
     * @return Information about the license type this conversion task converted from.
     */

    public LicenseConversionContext getSourceLicenseContext() {
        return this.sourceLicenseContext;
    }

    /**
     * <p>
     * Information about the license type this conversion task converted from.
     * </p>
     * 
     * @param sourceLicenseContext
     *        Information about the license type this conversion task converted from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withSourceLicenseContext(LicenseConversionContext sourceLicenseContext) {
        setSourceLicenseContext(sourceLicenseContext);
        return this;
    }

    /**
     * <p>
     * Information about the license type this conversion task converted to.
     * </p>
     * 
     * @param destinationLicenseContext
     *        Information about the license type this conversion task converted to.
     */

    public void setDestinationLicenseContext(LicenseConversionContext destinationLicenseContext) {
        this.destinationLicenseContext = destinationLicenseContext;
    }

    /**
     * <p>
     * Information about the license type this conversion task converted to.
     * </p>
     * 
     * @return Information about the license type this conversion task converted to.
     */

    public LicenseConversionContext getDestinationLicenseContext() {
        return this.destinationLicenseContext;
    }

    /**
     * <p>
     * Information about the license type this conversion task converted to.
     * </p>
     * 
     * @param destinationLicenseContext
     *        Information about the license type this conversion task converted to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withDestinationLicenseContext(LicenseConversionContext destinationLicenseContext) {
        setDestinationLicenseContext(destinationLicenseContext);
        return this;
    }

    /**
     * <p>
     * The status of the conversion task.
     * </p>
     * 
     * @param status
     *        The status of the conversion task.
     * @see LicenseConversionTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the conversion task.
     * </p>
     * 
     * @return The status of the conversion task.
     * @see LicenseConversionTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the conversion task.
     * </p>
     * 
     * @param status
     *        The status of the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseConversionTaskStatus
     */

    public LicenseConversionTask withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the conversion task.
     * </p>
     * 
     * @param status
     *        The status of the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LicenseConversionTaskStatus
     */

    public LicenseConversionTask withStatus(LicenseConversionTaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message for the conversion task.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the conversion task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message for the conversion task.
     * </p>
     * 
     * @return The status message for the conversion task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message for the conversion task.
     * </p>
     * 
     * @param statusMessage
     *        The status message for the conversion task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The time the conversion task was started at.
     * </p>
     * 
     * @param startTime
     *        The time the conversion task was started at.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time the conversion task was started at.
     * </p>
     * 
     * @return The time the conversion task was started at.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time the conversion task was started at.
     * </p>
     * 
     * @param startTime
     *        The time the conversion task was started at.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time the usage operation value of the resource was changed.
     * </p>
     * 
     * @param licenseConversionTime
     *        The time the usage operation value of the resource was changed.
     */

    public void setLicenseConversionTime(java.util.Date licenseConversionTime) {
        this.licenseConversionTime = licenseConversionTime;
    }

    /**
     * <p>
     * The time the usage operation value of the resource was changed.
     * </p>
     * 
     * @return The time the usage operation value of the resource was changed.
     */

    public java.util.Date getLicenseConversionTime() {
        return this.licenseConversionTime;
    }

    /**
     * <p>
     * The time the usage operation value of the resource was changed.
     * </p>
     * 
     * @param licenseConversionTime
     *        The time the usage operation value of the resource was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withLicenseConversionTime(java.util.Date licenseConversionTime) {
        setLicenseConversionTime(licenseConversionTime);
        return this;
    }

    /**
     * <p>
     * The time the conversion task was completed.
     * </p>
     * 
     * @param endTime
     *        The time the conversion task was completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time the conversion task was completed.
     * </p>
     * 
     * @return The time the conversion task was completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time the conversion task was completed.
     * </p>
     * 
     * @param endTime
     *        The time the conversion task was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LicenseConversionTask withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getLicenseConversionTaskId() != null)
            sb.append("LicenseConversionTaskId: ").append(getLicenseConversionTaskId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getSourceLicenseContext() != null)
            sb.append("SourceLicenseContext: ").append(getSourceLicenseContext()).append(",");
        if (getDestinationLicenseContext() != null)
            sb.append("DestinationLicenseContext: ").append(getDestinationLicenseContext()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getLicenseConversionTime() != null)
            sb.append("LicenseConversionTime: ").append(getLicenseConversionTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LicenseConversionTask == false)
            return false;
        LicenseConversionTask other = (LicenseConversionTask) obj;
        if (other.getLicenseConversionTaskId() == null ^ this.getLicenseConversionTaskId() == null)
            return false;
        if (other.getLicenseConversionTaskId() != null && other.getLicenseConversionTaskId().equals(this.getLicenseConversionTaskId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getSourceLicenseContext() == null ^ this.getSourceLicenseContext() == null)
            return false;
        if (other.getSourceLicenseContext() != null && other.getSourceLicenseContext().equals(this.getSourceLicenseContext()) == false)
            return false;
        if (other.getDestinationLicenseContext() == null ^ this.getDestinationLicenseContext() == null)
            return false;
        if (other.getDestinationLicenseContext() != null && other.getDestinationLicenseContext().equals(this.getDestinationLicenseContext()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getLicenseConversionTime() == null ^ this.getLicenseConversionTime() == null)
            return false;
        if (other.getLicenseConversionTime() != null && other.getLicenseConversionTime().equals(this.getLicenseConversionTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseConversionTaskId() == null) ? 0 : getLicenseConversionTaskId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceLicenseContext() == null) ? 0 : getSourceLicenseContext().hashCode());
        hashCode = prime * hashCode + ((getDestinationLicenseContext() == null) ? 0 : getDestinationLicenseContext().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getLicenseConversionTime() == null) ? 0 : getLicenseConversionTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public LicenseConversionTask clone() {
        try {
            return (LicenseConversionTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.LicenseConversionTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
