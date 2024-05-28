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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A lens review of a question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/LensReview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LensReview implements Serializable, Cloneable, StructuredPojo {

    private String lensAlias;
    /**
     * <p>
     * The ARN for the lens.
     * </p>
     */
    private String lensArn;
    /**
     * <p>
     * The version of the lens.
     * </p>
     */
    private String lensVersion;

    private String lensName;
    /**
     * <p>
     * The status of the lens.
     * </p>
     */
    private String lensStatus;

    private java.util.List<PillarReviewSummary> pillarReviewSummaries;
    /**
     * <p>
     * Jira configuration status of the Lens review.
     * </p>
     */
    private JiraSelectedQuestionConfiguration jiraConfiguration;

    private java.util.Date updatedAt;

    private String notes;

    private java.util.Map<String, Integer> riskCounts;

    private String nextToken;
    /**
     * <p>
     * The profiles associated with the workload.
     * </p>
     */
    private java.util.List<WorkloadProfile> profiles;

    private java.util.Map<String, Integer> prioritizedRiskCounts;

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN for the lens.
     */

    public void setLensArn(String lensArn) {
        this.lensArn = lensArn;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @return The ARN for the lens.
     */

    public String getLensArn() {
        return this.lensArn;
    }

    /**
     * <p>
     * The ARN for the lens.
     * </p>
     * 
     * @param lensArn
     *        The ARN for the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withLensArn(String lensArn) {
        setLensArn(lensArn);
        return this;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     */

    public void setLensVersion(String lensVersion) {
        this.lensVersion = lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @return The version of the lens.
     */

    public String getLensVersion() {
        return this.lensVersion;
    }

    /**
     * <p>
     * The version of the lens.
     * </p>
     * 
     * @param lensVersion
     *        The version of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withLensVersion(String lensVersion) {
        setLensVersion(lensVersion);
        return this;
    }

    /**
     * @param lensName
     */

    public void setLensName(String lensName) {
        this.lensName = lensName;
    }

    /**
     * @return
     */

    public String getLensName() {
        return this.lensName;
    }

    /**
     * @param lensName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withLensName(String lensName) {
        setLensName(lensName);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @see LensStatus
     */

    public void setLensStatus(String lensStatus) {
        this.lensStatus = lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @return The status of the lens.
     * @see LensStatus
     */

    public String getLensStatus() {
        return this.lensStatus;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public LensReview withLensStatus(String lensStatus) {
        setLensStatus(lensStatus);
        return this;
    }

    /**
     * <p>
     * The status of the lens.
     * </p>
     * 
     * @param lensStatus
     *        The status of the lens.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LensStatus
     */

    public LensReview withLensStatus(LensStatus lensStatus) {
        this.lensStatus = lensStatus.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<PillarReviewSummary> getPillarReviewSummaries() {
        return pillarReviewSummaries;
    }

    /**
     * @param pillarReviewSummaries
     */

    public void setPillarReviewSummaries(java.util.Collection<PillarReviewSummary> pillarReviewSummaries) {
        if (pillarReviewSummaries == null) {
            this.pillarReviewSummaries = null;
            return;
        }

        this.pillarReviewSummaries = new java.util.ArrayList<PillarReviewSummary>(pillarReviewSummaries);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPillarReviewSummaries(java.util.Collection)} or
     * {@link #withPillarReviewSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pillarReviewSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withPillarReviewSummaries(PillarReviewSummary... pillarReviewSummaries) {
        if (this.pillarReviewSummaries == null) {
            setPillarReviewSummaries(new java.util.ArrayList<PillarReviewSummary>(pillarReviewSummaries.length));
        }
        for (PillarReviewSummary ele : pillarReviewSummaries) {
            this.pillarReviewSummaries.add(ele);
        }
        return this;
    }

    /**
     * @param pillarReviewSummaries
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withPillarReviewSummaries(java.util.Collection<PillarReviewSummary> pillarReviewSummaries) {
        setPillarReviewSummaries(pillarReviewSummaries);
        return this;
    }

    /**
     * <p>
     * Jira configuration status of the Lens review.
     * </p>
     * 
     * @param jiraConfiguration
     *        Jira configuration status of the Lens review.
     */

    public void setJiraConfiguration(JiraSelectedQuestionConfiguration jiraConfiguration) {
        this.jiraConfiguration = jiraConfiguration;
    }

    /**
     * <p>
     * Jira configuration status of the Lens review.
     * </p>
     * 
     * @return Jira configuration status of the Lens review.
     */

    public JiraSelectedQuestionConfiguration getJiraConfiguration() {
        return this.jiraConfiguration;
    }

    /**
     * <p>
     * Jira configuration status of the Lens review.
     * </p>
     * 
     * @param jiraConfiguration
     *        Jira configuration status of the Lens review.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withJiraConfiguration(JiraSelectedQuestionConfiguration jiraConfiguration) {
        setJiraConfiguration(jiraConfiguration);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @param notes
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * @param notes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, Integer> getRiskCounts() {
        return riskCounts;
    }

    /**
     * @param riskCounts
     */

    public void setRiskCounts(java.util.Map<String, Integer> riskCounts) {
        this.riskCounts = riskCounts;
    }

    /**
     * @param riskCounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withRiskCounts(java.util.Map<String, Integer> riskCounts) {
        setRiskCounts(riskCounts);
        return this;
    }

    /**
     * Add a single RiskCounts entry
     *
     * @see LensReview#withRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LensReview addRiskCountsEntry(String key, Integer value) {
        if (null == this.riskCounts) {
            this.riskCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.riskCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.riskCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RiskCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview clearRiskCountsEntries() {
        this.riskCounts = null;
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The profiles associated with the workload.
     * </p>
     * 
     * @return The profiles associated with the workload.
     */

    public java.util.List<WorkloadProfile> getProfiles() {
        return profiles;
    }

    /**
     * <p>
     * The profiles associated with the workload.
     * </p>
     * 
     * @param profiles
     *        The profiles associated with the workload.
     */

    public void setProfiles(java.util.Collection<WorkloadProfile> profiles) {
        if (profiles == null) {
            this.profiles = null;
            return;
        }

        this.profiles = new java.util.ArrayList<WorkloadProfile>(profiles);
    }

    /**
     * <p>
     * The profiles associated with the workload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProfiles(java.util.Collection)} or {@link #withProfiles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param profiles
     *        The profiles associated with the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withProfiles(WorkloadProfile... profiles) {
        if (this.profiles == null) {
            setProfiles(new java.util.ArrayList<WorkloadProfile>(profiles.length));
        }
        for (WorkloadProfile ele : profiles) {
            this.profiles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The profiles associated with the workload.
     * </p>
     * 
     * @param profiles
     *        The profiles associated with the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withProfiles(java.util.Collection<WorkloadProfile> profiles) {
        setProfiles(profiles);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, Integer> getPrioritizedRiskCounts() {
        return prioritizedRiskCounts;
    }

    /**
     * @param prioritizedRiskCounts
     */

    public void setPrioritizedRiskCounts(java.util.Map<String, Integer> prioritizedRiskCounts) {
        this.prioritizedRiskCounts = prioritizedRiskCounts;
    }

    /**
     * @param prioritizedRiskCounts
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview withPrioritizedRiskCounts(java.util.Map<String, Integer> prioritizedRiskCounts) {
        setPrioritizedRiskCounts(prioritizedRiskCounts);
        return this;
    }

    /**
     * Add a single PrioritizedRiskCounts entry
     *
     * @see LensReview#withPrioritizedRiskCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LensReview addPrioritizedRiskCountsEntry(String key, Integer value) {
        if (null == this.prioritizedRiskCounts) {
            this.prioritizedRiskCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.prioritizedRiskCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.prioritizedRiskCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PrioritizedRiskCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LensReview clearPrioritizedRiskCountsEntries() {
        this.prioritizedRiskCounts = null;
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
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getLensArn() != null)
            sb.append("LensArn: ").append(getLensArn()).append(",");
        if (getLensVersion() != null)
            sb.append("LensVersion: ").append(getLensVersion()).append(",");
        if (getLensName() != null)
            sb.append("LensName: ").append(getLensName()).append(",");
        if (getLensStatus() != null)
            sb.append("LensStatus: ").append(getLensStatus()).append(",");
        if (getPillarReviewSummaries() != null)
            sb.append("PillarReviewSummaries: ").append(getPillarReviewSummaries()).append(",");
        if (getJiraConfiguration() != null)
            sb.append("JiraConfiguration: ").append(getJiraConfiguration()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getRiskCounts() != null)
            sb.append("RiskCounts: ").append(getRiskCounts()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getProfiles() != null)
            sb.append("Profiles: ").append(getProfiles()).append(",");
        if (getPrioritizedRiskCounts() != null)
            sb.append("PrioritizedRiskCounts: ").append(getPrioritizedRiskCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LensReview == false)
            return false;
        LensReview other = (LensReview) obj;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getLensArn() == null ^ this.getLensArn() == null)
            return false;
        if (other.getLensArn() != null && other.getLensArn().equals(this.getLensArn()) == false)
            return false;
        if (other.getLensVersion() == null ^ this.getLensVersion() == null)
            return false;
        if (other.getLensVersion() != null && other.getLensVersion().equals(this.getLensVersion()) == false)
            return false;
        if (other.getLensName() == null ^ this.getLensName() == null)
            return false;
        if (other.getLensName() != null && other.getLensName().equals(this.getLensName()) == false)
            return false;
        if (other.getLensStatus() == null ^ this.getLensStatus() == null)
            return false;
        if (other.getLensStatus() != null && other.getLensStatus().equals(this.getLensStatus()) == false)
            return false;
        if (other.getPillarReviewSummaries() == null ^ this.getPillarReviewSummaries() == null)
            return false;
        if (other.getPillarReviewSummaries() != null && other.getPillarReviewSummaries().equals(this.getPillarReviewSummaries()) == false)
            return false;
        if (other.getJiraConfiguration() == null ^ this.getJiraConfiguration() == null)
            return false;
        if (other.getJiraConfiguration() != null && other.getJiraConfiguration().equals(this.getJiraConfiguration()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getRiskCounts() == null ^ this.getRiskCounts() == null)
            return false;
        if (other.getRiskCounts() != null && other.getRiskCounts().equals(this.getRiskCounts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getProfiles() == null ^ this.getProfiles() == null)
            return false;
        if (other.getProfiles() != null && other.getProfiles().equals(this.getProfiles()) == false)
            return false;
        if (other.getPrioritizedRiskCounts() == null ^ this.getPrioritizedRiskCounts() == null)
            return false;
        if (other.getPrioritizedRiskCounts() != null && other.getPrioritizedRiskCounts().equals(this.getPrioritizedRiskCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getLensArn() == null) ? 0 : getLensArn().hashCode());
        hashCode = prime * hashCode + ((getLensVersion() == null) ? 0 : getLensVersion().hashCode());
        hashCode = prime * hashCode + ((getLensName() == null) ? 0 : getLensName().hashCode());
        hashCode = prime * hashCode + ((getLensStatus() == null) ? 0 : getLensStatus().hashCode());
        hashCode = prime * hashCode + ((getPillarReviewSummaries() == null) ? 0 : getPillarReviewSummaries().hashCode());
        hashCode = prime * hashCode + ((getJiraConfiguration() == null) ? 0 : getJiraConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getRiskCounts() == null) ? 0 : getRiskCounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getProfiles() == null) ? 0 : getProfiles().hashCode());
        hashCode = prime * hashCode + ((getPrioritizedRiskCounts() == null) ? 0 : getPrioritizedRiskCounts().hashCode());
        return hashCode;
    }

    @Override
    public LensReview clone() {
        try {
            return (LensReview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.LensReviewMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
