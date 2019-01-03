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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the audit check.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuditCheckDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     * "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     */
    private String checkRunStatus;
    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     */
    private Boolean checkCompliant;
    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     */
    private Long totalResourcesCount;
    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     */
    private Long nonCompliantResourcesCount;
    /**
     * <p>
     * The code of any error encountered when performing this check during this audit. One of
     * "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The message associated with any error encountered when performing this check during this audit.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     * "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * 
     * @param checkRunStatus
     *        The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *        "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * @see AuditCheckRunStatus
     */

    public void setCheckRunStatus(String checkRunStatus) {
        this.checkRunStatus = checkRunStatus;
    }

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     * "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * 
     * @return The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *         "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * @see AuditCheckRunStatus
     */

    public String getCheckRunStatus() {
        return this.checkRunStatus;
    }

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     * "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * 
     * @param checkRunStatus
     *        The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *        "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditCheckRunStatus
     */

    public AuditCheckDetails withCheckRunStatus(String checkRunStatus) {
        setCheckRunStatus(checkRunStatus);
        return this;
    }

    /**
     * <p>
     * The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     * "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * </p>
     * 
     * @param checkRunStatus
     *        The completion status of this check, one of "IN_PROGRESS", "WAITING_FOR_DATA_COLLECTION", "CANCELED",
     *        "COMPLETED_COMPLIANT", "COMPLETED_NON_COMPLIANT", or "FAILED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditCheckRunStatus
     */

    public AuditCheckDetails withCheckRunStatus(AuditCheckRunStatus checkRunStatus) {
        this.checkRunStatus = checkRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     * 
     * @param checkCompliant
     *        True if the check completed and found all resources compliant.
     */

    public void setCheckCompliant(Boolean checkCompliant) {
        this.checkCompliant = checkCompliant;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     * 
     * @return True if the check completed and found all resources compliant.
     */

    public Boolean getCheckCompliant() {
        return this.checkCompliant;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     * 
     * @param checkCompliant
     *        True if the check completed and found all resources compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditCheckDetails withCheckCompliant(Boolean checkCompliant) {
        setCheckCompliant(checkCompliant);
        return this;
    }

    /**
     * <p>
     * True if the check completed and found all resources compliant.
     * </p>
     * 
     * @return True if the check completed and found all resources compliant.
     */

    public Boolean isCheckCompliant() {
        return this.checkCompliant;
    }

    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     * 
     * @param totalResourcesCount
     *        The number of resources on which the check was performed.
     */

    public void setTotalResourcesCount(Long totalResourcesCount) {
        this.totalResourcesCount = totalResourcesCount;
    }

    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     * 
     * @return The number of resources on which the check was performed.
     */

    public Long getTotalResourcesCount() {
        return this.totalResourcesCount;
    }

    /**
     * <p>
     * The number of resources on which the check was performed.
     * </p>
     * 
     * @param totalResourcesCount
     *        The number of resources on which the check was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditCheckDetails withTotalResourcesCount(Long totalResourcesCount) {
        setTotalResourcesCount(totalResourcesCount);
        return this;
    }

    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     * 
     * @param nonCompliantResourcesCount
     *        The number of resources that the check found non-compliant.
     */

    public void setNonCompliantResourcesCount(Long nonCompliantResourcesCount) {
        this.nonCompliantResourcesCount = nonCompliantResourcesCount;
    }

    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     * 
     * @return The number of resources that the check found non-compliant.
     */

    public Long getNonCompliantResourcesCount() {
        return this.nonCompliantResourcesCount;
    }

    /**
     * <p>
     * The number of resources that the check found non-compliant.
     * </p>
     * 
     * @param nonCompliantResourcesCount
     *        The number of resources that the check found non-compliant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditCheckDetails withNonCompliantResourcesCount(Long nonCompliantResourcesCount) {
        setNonCompliantResourcesCount(nonCompliantResourcesCount);
        return this;
    }

    /**
     * <p>
     * The code of any error encountered when performing this check during this audit. One of
     * "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     * 
     * @param errorCode
     *        The code of any error encountered when performing this check during this audit. One of
     *        "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code of any error encountered when performing this check during this audit. One of
     * "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     * 
     * @return The code of any error encountered when performing this check during this audit. One of
     *         "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code of any error encountered when performing this check during this audit. One of
     * "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * </p>
     * 
     * @param errorCode
     *        The code of any error encountered when performing this check during this audit. One of
     *        "INSUFFICIENT_PERMISSIONS", or "AUDIT_CHECK_DISABLED".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditCheckDetails withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The message associated with any error encountered when performing this check during this audit.
     * </p>
     * 
     * @param message
     *        The message associated with any error encountered when performing this check during this audit.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message associated with any error encountered when performing this check during this audit.
     * </p>
     * 
     * @return The message associated with any error encountered when performing this check during this audit.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message associated with any error encountered when performing this check during this audit.
     * </p>
     * 
     * @param message
     *        The message associated with any error encountered when performing this check during this audit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuditCheckDetails withMessage(String message) {
        setMessage(message);
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
        if (getCheckRunStatus() != null)
            sb.append("CheckRunStatus: ").append(getCheckRunStatus()).append(",");
        if (getCheckCompliant() != null)
            sb.append("CheckCompliant: ").append(getCheckCompliant()).append(",");
        if (getTotalResourcesCount() != null)
            sb.append("TotalResourcesCount: ").append(getTotalResourcesCount()).append(",");
        if (getNonCompliantResourcesCount() != null)
            sb.append("NonCompliantResourcesCount: ").append(getNonCompliantResourcesCount()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuditCheckDetails == false)
            return false;
        AuditCheckDetails other = (AuditCheckDetails) obj;
        if (other.getCheckRunStatus() == null ^ this.getCheckRunStatus() == null)
            return false;
        if (other.getCheckRunStatus() != null && other.getCheckRunStatus().equals(this.getCheckRunStatus()) == false)
            return false;
        if (other.getCheckCompliant() == null ^ this.getCheckCompliant() == null)
            return false;
        if (other.getCheckCompliant() != null && other.getCheckCompliant().equals(this.getCheckCompliant()) == false)
            return false;
        if (other.getTotalResourcesCount() == null ^ this.getTotalResourcesCount() == null)
            return false;
        if (other.getTotalResourcesCount() != null && other.getTotalResourcesCount().equals(this.getTotalResourcesCount()) == false)
            return false;
        if (other.getNonCompliantResourcesCount() == null ^ this.getNonCompliantResourcesCount() == null)
            return false;
        if (other.getNonCompliantResourcesCount() != null && other.getNonCompliantResourcesCount().equals(this.getNonCompliantResourcesCount()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckRunStatus() == null) ? 0 : getCheckRunStatus().hashCode());
        hashCode = prime * hashCode + ((getCheckCompliant() == null) ? 0 : getCheckCompliant().hashCode());
        hashCode = prime * hashCode + ((getTotalResourcesCount() == null) ? 0 : getTotalResourcesCount().hashCode());
        hashCode = prime * hashCode + ((getNonCompliantResourcesCount() == null) ? 0 : getNonCompliantResourcesCount().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public AuditCheckDetails clone() {
        try {
            return (AuditCheckDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AuditCheckDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
