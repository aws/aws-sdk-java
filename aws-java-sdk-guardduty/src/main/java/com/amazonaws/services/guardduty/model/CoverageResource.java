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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the resource of the GuardDuty account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The unique ID of the GuardDuty detector associated with the resource.
     * </p>
     */
    private String detectorId;
    /**
     * <p>
     * The unique ID of the Amazon Web Services account.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Information about the resource for which the coverage statistics are retrieved.
     * </p>
     */
    private CoverageResourceDetails resourceDetails;
    /**
     * <p>
     * Represents the status of the EKS cluster coverage.
     * </p>
     */
    private String coverageStatus;
    /**
     * <p>
     * Represents the reason why a coverage status was <code>UNHEALTHY</code> for the EKS cluster.
     * </p>
     */
    private String issue;
    /**
     * <p>
     * The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The unique ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The unique ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The unique ID of the resource.
     * </p>
     * 
     * @return The unique ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The unique ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The unique ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResource withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The unique ID of the GuardDuty detector associated with the resource.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the GuardDuty detector associated with the resource.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The unique ID of the GuardDuty detector associated with the resource.
     * </p>
     * 
     * @return The unique ID of the GuardDuty detector associated with the resource.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * <p>
     * The unique ID of the GuardDuty detector associated with the resource.
     * </p>
     * 
     * @param detectorId
     *        The unique ID of the GuardDuty detector associated with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResource withDetectorId(String detectorId) {
        setDetectorId(detectorId);
        return this;
    }

    /**
     * <p>
     * The unique ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The unique ID of the Amazon Web Services account.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique ID of the Amazon Web Services account.
     * </p>
     * 
     * @return The unique ID of the Amazon Web Services account.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique ID of the Amazon Web Services account.
     * </p>
     * 
     * @param accountId
     *        The unique ID of the Amazon Web Services account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResource withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Information about the resource for which the coverage statistics are retrieved.
     * </p>
     * 
     * @param resourceDetails
     *        Information about the resource for which the coverage statistics are retrieved.
     */

    public void setResourceDetails(CoverageResourceDetails resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    /**
     * <p>
     * Information about the resource for which the coverage statistics are retrieved.
     * </p>
     * 
     * @return Information about the resource for which the coverage statistics are retrieved.
     */

    public CoverageResourceDetails getResourceDetails() {
        return this.resourceDetails;
    }

    /**
     * <p>
     * Information about the resource for which the coverage statistics are retrieved.
     * </p>
     * 
     * @param resourceDetails
     *        Information about the resource for which the coverage statistics are retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResource withResourceDetails(CoverageResourceDetails resourceDetails) {
        setResourceDetails(resourceDetails);
        return this;
    }

    /**
     * <p>
     * Represents the status of the EKS cluster coverage.
     * </p>
     * 
     * @param coverageStatus
     *        Represents the status of the EKS cluster coverage.
     * @see CoverageStatus
     */

    public void setCoverageStatus(String coverageStatus) {
        this.coverageStatus = coverageStatus;
    }

    /**
     * <p>
     * Represents the status of the EKS cluster coverage.
     * </p>
     * 
     * @return Represents the status of the EKS cluster coverage.
     * @see CoverageStatus
     */

    public String getCoverageStatus() {
        return this.coverageStatus;
    }

    /**
     * <p>
     * Represents the status of the EKS cluster coverage.
     * </p>
     * 
     * @param coverageStatus
     *        Represents the status of the EKS cluster coverage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageStatus
     */

    public CoverageResource withCoverageStatus(String coverageStatus) {
        setCoverageStatus(coverageStatus);
        return this;
    }

    /**
     * <p>
     * Represents the status of the EKS cluster coverage.
     * </p>
     * 
     * @param coverageStatus
     *        Represents the status of the EKS cluster coverage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageStatus
     */

    public CoverageResource withCoverageStatus(CoverageStatus coverageStatus) {
        this.coverageStatus = coverageStatus.toString();
        return this;
    }

    /**
     * <p>
     * Represents the reason why a coverage status was <code>UNHEALTHY</code> for the EKS cluster.
     * </p>
     * 
     * @param issue
     *        Represents the reason why a coverage status was <code>UNHEALTHY</code> for the EKS cluster.
     */

    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * <p>
     * Represents the reason why a coverage status was <code>UNHEALTHY</code> for the EKS cluster.
     * </p>
     * 
     * @return Represents the reason why a coverage status was <code>UNHEALTHY</code> for the EKS cluster.
     */

    public String getIssue() {
        return this.issue;
    }

    /**
     * <p>
     * Represents the reason why a coverage status was <code>UNHEALTHY</code> for the EKS cluster.
     * </p>
     * 
     * @param issue
     *        Represents the reason why a coverage status was <code>UNHEALTHY</code> for the EKS cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResource withIssue(String issue) {
        setIssue(issue);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
     * </p>
     * 
     * @return The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp at which the coverage details for the resource were last updated. This is in UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageResource withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getResourceDetails() != null)
            sb.append("ResourceDetails: ").append(getResourceDetails()).append(",");
        if (getCoverageStatus() != null)
            sb.append("CoverageStatus: ").append(getCoverageStatus()).append(",");
        if (getIssue() != null)
            sb.append("Issue: ").append(getIssue()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageResource == false)
            return false;
        CoverageResource other = (CoverageResource) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getResourceDetails() == null ^ this.getResourceDetails() == null)
            return false;
        if (other.getResourceDetails() != null && other.getResourceDetails().equals(this.getResourceDetails()) == false)
            return false;
        if (other.getCoverageStatus() == null ^ this.getCoverageStatus() == null)
            return false;
        if (other.getCoverageStatus() != null && other.getCoverageStatus().equals(this.getCoverageStatus()) == false)
            return false;
        if (other.getIssue() == null ^ this.getIssue() == null)
            return false;
        if (other.getIssue() != null && other.getIssue().equals(this.getIssue()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getResourceDetails() == null) ? 0 : getResourceDetails().hashCode());
        hashCode = prime * hashCode + ((getCoverageStatus() == null) ? 0 : getCoverageStatus().hashCode());
        hashCode = prime * hashCode + ((getIssue() == null) ? 0 : getIssue().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public CoverageResource clone() {
        try {
            return (CoverageResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
