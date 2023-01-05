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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a share request for a custom framework in Audit Manager.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentFrameworkShareRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentFrameworkShareRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique identifier for the shared custom framework.
     * </p>
     */
    private String frameworkId;
    /**
     * <p>
     * The name of the custom framework that the share request is for.
     * </p>
     */
    private String frameworkName;
    /**
     * <p>
     * The description of the shared custom framework.
     * </p>
     */
    private String frameworkDescription;
    /**
     * <p>
     * The status of the share request.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Web Services account of the sender.
     * </p>
     */
    private String sourceAccount;
    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     */
    private String destinationAccount;
    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * The time when the share request expires.
     * </p>
     */
    private java.util.Date expirationTime;
    /**
     * <p>
     * The time when the share request was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Specifies when the share request was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * The number of standard controls that are part of the shared custom framework.
     * </p>
     */
    private Integer standardControlsCount;
    /**
     * <p>
     * The number of custom controls that are part of the shared custom framework.
     * </p>
     */
    private Integer customControlsCount;
    /**
     * <p>
     * The compliance type that the shared custom framework supports, such as CIS or HIPAA.
     * </p>
     */
    private String complianceType;

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     * 
     * @param id
     *        The unique identifier for the share request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     * 
     * @return The unique identifier for the share request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the share request.
     * </p>
     * 
     * @param id
     *        The unique identifier for the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the shared custom framework.
     * </p>
     * 
     * @param frameworkId
     *        The unique identifier for the shared custom framework.
     */

    public void setFrameworkId(String frameworkId) {
        this.frameworkId = frameworkId;
    }

    /**
     * <p>
     * The unique identifier for the shared custom framework.
     * </p>
     * 
     * @return The unique identifier for the shared custom framework.
     */

    public String getFrameworkId() {
        return this.frameworkId;
    }

    /**
     * <p>
     * The unique identifier for the shared custom framework.
     * </p>
     * 
     * @param frameworkId
     *        The unique identifier for the shared custom framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withFrameworkId(String frameworkId) {
        setFrameworkId(frameworkId);
        return this;
    }

    /**
     * <p>
     * The name of the custom framework that the share request is for.
     * </p>
     * 
     * @param frameworkName
     *        The name of the custom framework that the share request is for.
     */

    public void setFrameworkName(String frameworkName) {
        this.frameworkName = frameworkName;
    }

    /**
     * <p>
     * The name of the custom framework that the share request is for.
     * </p>
     * 
     * @return The name of the custom framework that the share request is for.
     */

    public String getFrameworkName() {
        return this.frameworkName;
    }

    /**
     * <p>
     * The name of the custom framework that the share request is for.
     * </p>
     * 
     * @param frameworkName
     *        The name of the custom framework that the share request is for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withFrameworkName(String frameworkName) {
        setFrameworkName(frameworkName);
        return this;
    }

    /**
     * <p>
     * The description of the shared custom framework.
     * </p>
     * 
     * @param frameworkDescription
     *        The description of the shared custom framework.
     */

    public void setFrameworkDescription(String frameworkDescription) {
        this.frameworkDescription = frameworkDescription;
    }

    /**
     * <p>
     * The description of the shared custom framework.
     * </p>
     * 
     * @return The description of the shared custom framework.
     */

    public String getFrameworkDescription() {
        return this.frameworkDescription;
    }

    /**
     * <p>
     * The description of the shared custom framework.
     * </p>
     * 
     * @param frameworkDescription
     *        The description of the shared custom framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withFrameworkDescription(String frameworkDescription) {
        setFrameworkDescription(frameworkDescription);
        return this;
    }

    /**
     * <p>
     * The status of the share request.
     * </p>
     * 
     * @param status
     *        The status of the share request.
     * @see ShareRequestStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the share request.
     * </p>
     * 
     * @return The status of the share request.
     * @see ShareRequestStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the share request.
     * </p>
     * 
     * @param status
     *        The status of the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestStatus
     */

    public AssessmentFrameworkShareRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the share request.
     * </p>
     * 
     * @param status
     *        The status of the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShareRequestStatus
     */

    public AssessmentFrameworkShareRequest withStatus(ShareRequestStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account of the sender.
     * </p>
     * 
     * @param sourceAccount
     *        The Amazon Web Services account of the sender.
     */

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account of the sender.
     * </p>
     * 
     * @return The Amazon Web Services account of the sender.
     */

    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account of the sender.
     * </p>
     * 
     * @param sourceAccount
     *        The Amazon Web Services account of the sender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withSourceAccount(String sourceAccount) {
        setSourceAccount(sourceAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     * 
     * @param destinationAccount
     *        The Amazon Web Services account of the recipient.
     */

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     * 
     * @return The Amazon Web Services account of the recipient.
     */

    public String getDestinationAccount() {
        return this.destinationAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account of the recipient.
     * </p>
     * 
     * @param destinationAccount
     *        The Amazon Web Services account of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withDestinationAccount(String destinationAccount) {
        setDestinationAccount(destinationAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     * 
     * @param destinationRegion
     *        The Amazon Web Services Region of the recipient.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     * 
     * @return The Amazon Web Services Region of the recipient.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the recipient.
     * </p>
     * 
     * @param destinationRegion
     *        The Amazon Web Services Region of the recipient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withDestinationRegion(String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The time when the share request expires.
     * </p>
     * 
     * @param expirationTime
     *        The time when the share request expires.
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The time when the share request expires.
     * </p>
     * 
     * @return The time when the share request expires.
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The time when the share request expires.
     * </p>
     * 
     * @param expirationTime
     *        The time when the share request expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * The time when the share request was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the share request was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the share request was created.
     * </p>
     * 
     * @return The time when the share request was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the share request was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the share request was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Specifies when the share request was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Specifies when the share request was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Specifies when the share request was last updated.
     * </p>
     * 
     * @return Specifies when the share request was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * Specifies when the share request was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        Specifies when the share request was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     * 
     * @param comment
     *        An optional comment from the sender about the share request.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     * 
     * @return An optional comment from the sender about the share request.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * An optional comment from the sender about the share request.
     * </p>
     * 
     * @param comment
     *        An optional comment from the sender about the share request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * The number of standard controls that are part of the shared custom framework.
     * </p>
     * 
     * @param standardControlsCount
     *        The number of standard controls that are part of the shared custom framework.
     */

    public void setStandardControlsCount(Integer standardControlsCount) {
        this.standardControlsCount = standardControlsCount;
    }

    /**
     * <p>
     * The number of standard controls that are part of the shared custom framework.
     * </p>
     * 
     * @return The number of standard controls that are part of the shared custom framework.
     */

    public Integer getStandardControlsCount() {
        return this.standardControlsCount;
    }

    /**
     * <p>
     * The number of standard controls that are part of the shared custom framework.
     * </p>
     * 
     * @param standardControlsCount
     *        The number of standard controls that are part of the shared custom framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withStandardControlsCount(Integer standardControlsCount) {
        setStandardControlsCount(standardControlsCount);
        return this;
    }

    /**
     * <p>
     * The number of custom controls that are part of the shared custom framework.
     * </p>
     * 
     * @param customControlsCount
     *        The number of custom controls that are part of the shared custom framework.
     */

    public void setCustomControlsCount(Integer customControlsCount) {
        this.customControlsCount = customControlsCount;
    }

    /**
     * <p>
     * The number of custom controls that are part of the shared custom framework.
     * </p>
     * 
     * @return The number of custom controls that are part of the shared custom framework.
     */

    public Integer getCustomControlsCount() {
        return this.customControlsCount;
    }

    /**
     * <p>
     * The number of custom controls that are part of the shared custom framework.
     * </p>
     * 
     * @param customControlsCount
     *        The number of custom controls that are part of the shared custom framework.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withCustomControlsCount(Integer customControlsCount) {
        setCustomControlsCount(customControlsCount);
        return this;
    }

    /**
     * <p>
     * The compliance type that the shared custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @param complianceType
     *        The compliance type that the shared custom framework supports, such as CIS or HIPAA.
     */

    public void setComplianceType(String complianceType) {
        this.complianceType = complianceType;
    }

    /**
     * <p>
     * The compliance type that the shared custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @return The compliance type that the shared custom framework supports, such as CIS or HIPAA.
     */

    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * <p>
     * The compliance type that the shared custom framework supports, such as CIS or HIPAA.
     * </p>
     * 
     * @param complianceType
     *        The compliance type that the shared custom framework supports, such as CIS or HIPAA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentFrameworkShareRequest withComplianceType(String complianceType) {
        setComplianceType(complianceType);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getFrameworkId() != null)
            sb.append("FrameworkId: ").append(getFrameworkId()).append(",");
        if (getFrameworkName() != null)
            sb.append("FrameworkName: ").append(getFrameworkName()).append(",");
        if (getFrameworkDescription() != null)
            sb.append("FrameworkDescription: ").append(getFrameworkDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceAccount() != null)
            sb.append("SourceAccount: ").append(getSourceAccount()).append(",");
        if (getDestinationAccount() != null)
            sb.append("DestinationAccount: ").append(getDestinationAccount()).append(",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: ").append(getDestinationRegion()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getStandardControlsCount() != null)
            sb.append("StandardControlsCount: ").append(getStandardControlsCount()).append(",");
        if (getCustomControlsCount() != null)
            sb.append("CustomControlsCount: ").append(getCustomControlsCount()).append(",");
        if (getComplianceType() != null)
            sb.append("ComplianceType: ").append(getComplianceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentFrameworkShareRequest == false)
            return false;
        AssessmentFrameworkShareRequest other = (AssessmentFrameworkShareRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFrameworkId() == null ^ this.getFrameworkId() == null)
            return false;
        if (other.getFrameworkId() != null && other.getFrameworkId().equals(this.getFrameworkId()) == false)
            return false;
        if (other.getFrameworkName() == null ^ this.getFrameworkName() == null)
            return false;
        if (other.getFrameworkName() != null && other.getFrameworkName().equals(this.getFrameworkName()) == false)
            return false;
        if (other.getFrameworkDescription() == null ^ this.getFrameworkDescription() == null)
            return false;
        if (other.getFrameworkDescription() != null && other.getFrameworkDescription().equals(this.getFrameworkDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceAccount() == null ^ this.getSourceAccount() == null)
            return false;
        if (other.getSourceAccount() != null && other.getSourceAccount().equals(this.getSourceAccount()) == false)
            return false;
        if (other.getDestinationAccount() == null ^ this.getDestinationAccount() == null)
            return false;
        if (other.getDestinationAccount() != null && other.getDestinationAccount().equals(this.getDestinationAccount()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getStandardControlsCount() == null ^ this.getStandardControlsCount() == null)
            return false;
        if (other.getStandardControlsCount() != null && other.getStandardControlsCount().equals(this.getStandardControlsCount()) == false)
            return false;
        if (other.getCustomControlsCount() == null ^ this.getCustomControlsCount() == null)
            return false;
        if (other.getCustomControlsCount() != null && other.getCustomControlsCount().equals(this.getCustomControlsCount()) == false)
            return false;
        if (other.getComplianceType() == null ^ this.getComplianceType() == null)
            return false;
        if (other.getComplianceType() != null && other.getComplianceType().equals(this.getComplianceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFrameworkId() == null) ? 0 : getFrameworkId().hashCode());
        hashCode = prime * hashCode + ((getFrameworkName() == null) ? 0 : getFrameworkName().hashCode());
        hashCode = prime * hashCode + ((getFrameworkDescription() == null) ? 0 : getFrameworkDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceAccount() == null) ? 0 : getSourceAccount().hashCode());
        hashCode = prime * hashCode + ((getDestinationAccount() == null) ? 0 : getDestinationAccount().hashCode());
        hashCode = prime * hashCode + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getStandardControlsCount() == null) ? 0 : getStandardControlsCount().hashCode());
        hashCode = prime * hashCode + ((getCustomControlsCount() == null) ? 0 : getCustomControlsCount().hashCode());
        hashCode = prime * hashCode + ((getComplianceType() == null) ? 0 : getComplianceType().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentFrameworkShareRequest clone() {
        try {
            return (AssessmentFrameworkShareRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentFrameworkShareRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
