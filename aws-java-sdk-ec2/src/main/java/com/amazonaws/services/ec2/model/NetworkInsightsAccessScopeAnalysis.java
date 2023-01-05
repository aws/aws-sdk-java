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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Network Access Scope analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInsightsAccessScopeAnalysis"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsAccessScopeAnalysis implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     */
    private String networkInsightsAccessScopeAnalysisId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope analysis.
     * </p>
     */
    private String networkInsightsAccessScopeAnalysisArn;
    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     */
    private String networkInsightsAccessScopeId;
    /**
     * <p>
     * The status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The warning message.
     * </p>
     */
    private String warningMessage;
    /**
     * <p>
     * The analysis start date.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * The analysis end date.
     * </p>
     */
    private java.util.Date endDate;
    /**
     * <p>
     * Indicates whether there are findings.
     * </p>
     */
    private String findingsFound;
    /**
     * <p>
     * The number of network interfaces analyzed.
     * </p>
     */
    private Integer analyzedEniCount;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     */

    public void setNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        this.networkInsightsAccessScopeAnalysisId = networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @return The ID of the Network Access Scope analysis.
     */

    public String getNetworkInsightsAccessScopeAnalysisId() {
        return this.networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        setNetworkInsightsAccessScopeAnalysisId(networkInsightsAccessScopeAnalysisId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisArn
     *        The Amazon Resource Name (ARN) of the Network Access Scope analysis.
     */

    public void setNetworkInsightsAccessScopeAnalysisArn(String networkInsightsAccessScopeAnalysisArn) {
        this.networkInsightsAccessScopeAnalysisArn = networkInsightsAccessScopeAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope analysis.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Network Access Scope analysis.
     */

    public String getNetworkInsightsAccessScopeAnalysisArn() {
        return this.networkInsightsAccessScopeAnalysisArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisArn
     *        The Amazon Resource Name (ARN) of the Network Access Scope analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withNetworkInsightsAccessScopeAnalysisArn(String networkInsightsAccessScopeAnalysisArn) {
        setNetworkInsightsAccessScopeAnalysisArn(networkInsightsAccessScopeAnalysisArn);
        return this;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     */

    public void setNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        this.networkInsightsAccessScopeId = networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @return The ID of the Network Access Scope.
     */

    public String getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        setNetworkInsightsAccessScopeId(networkInsightsAccessScopeId);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @see AnalysisStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @return The status.
     * @see AnalysisStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public NetworkInsightsAccessScopeAnalysis withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status.
     * </p>
     * 
     * @param status
     *        The status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnalysisStatus
     */

    public NetworkInsightsAccessScopeAnalysis withStatus(AnalysisStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @return The status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The status message.
     * </p>
     * 
     * @param statusMessage
     *        The status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The warning message.
     * </p>
     * 
     * @param warningMessage
     *        The warning message.
     */

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    /**
     * <p>
     * The warning message.
     * </p>
     * 
     * @return The warning message.
     */

    public String getWarningMessage() {
        return this.warningMessage;
    }

    /**
     * <p>
     * The warning message.
     * </p>
     * 
     * @param warningMessage
     *        The warning message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withWarningMessage(String warningMessage) {
        setWarningMessage(warningMessage);
        return this;
    }

    /**
     * <p>
     * The analysis start date.
     * </p>
     * 
     * @param startDate
     *        The analysis start date.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The analysis start date.
     * </p>
     * 
     * @return The analysis start date.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The analysis start date.
     * </p>
     * 
     * @param startDate
     *        The analysis start date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The analysis end date.
     * </p>
     * 
     * @param endDate
     *        The analysis end date.
     */

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The analysis end date.
     * </p>
     * 
     * @return The analysis end date.
     */

    public java.util.Date getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The analysis end date.
     * </p>
     * 
     * @param endDate
     *        The analysis end date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withEndDate(java.util.Date endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are findings.
     * </p>
     * 
     * @param findingsFound
     *        Indicates whether there are findings.
     * @see FindingsFound
     */

    public void setFindingsFound(String findingsFound) {
        this.findingsFound = findingsFound;
    }

    /**
     * <p>
     * Indicates whether there are findings.
     * </p>
     * 
     * @return Indicates whether there are findings.
     * @see FindingsFound
     */

    public String getFindingsFound() {
        return this.findingsFound;
    }

    /**
     * <p>
     * Indicates whether there are findings.
     * </p>
     * 
     * @param findingsFound
     *        Indicates whether there are findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingsFound
     */

    public NetworkInsightsAccessScopeAnalysis withFindingsFound(String findingsFound) {
        setFindingsFound(findingsFound);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are findings.
     * </p>
     * 
     * @param findingsFound
     *        Indicates whether there are findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FindingsFound
     */

    public NetworkInsightsAccessScopeAnalysis withFindingsFound(FindingsFound findingsFound) {
        this.findingsFound = findingsFound.toString();
        return this;
    }

    /**
     * <p>
     * The number of network interfaces analyzed.
     * </p>
     * 
     * @param analyzedEniCount
     *        The number of network interfaces analyzed.
     */

    public void setAnalyzedEniCount(Integer analyzedEniCount) {
        this.analyzedEniCount = analyzedEniCount;
    }

    /**
     * <p>
     * The number of network interfaces analyzed.
     * </p>
     * 
     * @return The number of network interfaces analyzed.
     */

    public Integer getAnalyzedEniCount() {
        return this.analyzedEniCount;
    }

    /**
     * <p>
     * The number of network interfaces analyzed.
     * </p>
     * 
     * @param analyzedEniCount
     *        The number of network interfaces analyzed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withAnalyzedEniCount(Integer analyzedEniCount) {
        setAnalyzedEniCount(analyzedEniCount);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeAnalysis withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNetworkInsightsAccessScopeAnalysisId() != null)
            sb.append("NetworkInsightsAccessScopeAnalysisId: ").append(getNetworkInsightsAccessScopeAnalysisId()).append(",");
        if (getNetworkInsightsAccessScopeAnalysisArn() != null)
            sb.append("NetworkInsightsAccessScopeAnalysisArn: ").append(getNetworkInsightsAccessScopeAnalysisArn()).append(",");
        if (getNetworkInsightsAccessScopeId() != null)
            sb.append("NetworkInsightsAccessScopeId: ").append(getNetworkInsightsAccessScopeId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getWarningMessage() != null)
            sb.append("WarningMessage: ").append(getWarningMessage()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getFindingsFound() != null)
            sb.append("FindingsFound: ").append(getFindingsFound()).append(",");
        if (getAnalyzedEniCount() != null)
            sb.append("AnalyzedEniCount: ").append(getAnalyzedEniCount()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInsightsAccessScopeAnalysis == false)
            return false;
        NetworkInsightsAccessScopeAnalysis other = (NetworkInsightsAccessScopeAnalysis) obj;
        if (other.getNetworkInsightsAccessScopeAnalysisId() == null ^ this.getNetworkInsightsAccessScopeAnalysisId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalysisId() != null
                && other.getNetworkInsightsAccessScopeAnalysisId().equals(this.getNetworkInsightsAccessScopeAnalysisId()) == false)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalysisArn() == null ^ this.getNetworkInsightsAccessScopeAnalysisArn() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalysisArn() != null
                && other.getNetworkInsightsAccessScopeAnalysisArn().equals(this.getNetworkInsightsAccessScopeAnalysisArn()) == false)
            return false;
        if (other.getNetworkInsightsAccessScopeId() == null ^ this.getNetworkInsightsAccessScopeId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeId() != null && other.getNetworkInsightsAccessScopeId().equals(this.getNetworkInsightsAccessScopeId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getWarningMessage() == null ^ this.getWarningMessage() == null)
            return false;
        if (other.getWarningMessage() != null && other.getWarningMessage().equals(this.getWarningMessage()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getFindingsFound() == null ^ this.getFindingsFound() == null)
            return false;
        if (other.getFindingsFound() != null && other.getFindingsFound().equals(this.getFindingsFound()) == false)
            return false;
        if (other.getAnalyzedEniCount() == null ^ this.getAnalyzedEniCount() == null)
            return false;
        if (other.getAnalyzedEniCount() != null && other.getAnalyzedEniCount().equals(this.getAnalyzedEniCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeAnalysisId() == null) ? 0 : getNetworkInsightsAccessScopeAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeAnalysisArn() == null) ? 0 : getNetworkInsightsAccessScopeAnalysisArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeId() == null) ? 0 : getNetworkInsightsAccessScopeId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getWarningMessage() == null) ? 0 : getWarningMessage().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getFindingsFound() == null) ? 0 : getFindingsFound().hashCode());
        hashCode = prime * hashCode + ((getAnalyzedEniCount() == null) ? 0 : getAnalyzedEniCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInsightsAccessScopeAnalysis clone() {
        try {
            return (NetworkInsightsAccessScopeAnalysis) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
