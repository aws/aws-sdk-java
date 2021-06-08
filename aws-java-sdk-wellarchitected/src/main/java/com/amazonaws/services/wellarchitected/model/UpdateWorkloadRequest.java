/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to update a workload.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/UpdateWorkload" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkloadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String workloadName;

    private String description;

    private String environment;

    private java.util.List<String> accountIds;

    private java.util.List<String> awsRegions;

    private java.util.List<String> nonAwsRegions;

    private java.util.List<String> pillarPriorities;

    private String architecturalDesign;

    private String reviewOwner;
    /**
     * <p>
     * Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is required.
     * </p>
     * <p>
     * If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the workload
     * is restricted until an owner is added.
     * </p>
     */
    private Boolean isReviewOwnerUpdateAcknowledged;

    private String industryType;

    private String industry;

    private String notes;

    private String improvementStatus;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param workloadName
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * @return
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * @param workloadName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param environment
     * @see WorkloadEnvironment
     */

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * @return
     * @see WorkloadEnvironment
     */

    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @param environment
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadEnvironment
     */

    public UpdateWorkloadRequest withEnvironment(String environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * @param environment
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadEnvironment
     */

    public UpdateWorkloadRequest withEnvironment(WorkloadEnvironment environment) {
        this.environment = environment.toString();
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getAccountIds() {
        return accountIds;
    }

    /**
     * @param accountIds
     */

    public void setAccountIds(java.util.Collection<String> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<String>(accountIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withAccountIds(String... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<String>(accountIds.length));
        }
        for (String ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * @param accountIds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withAccountIds(java.util.Collection<String> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getAwsRegions() {
        return awsRegions;
    }

    /**
     * @param awsRegions
     */

    public void setAwsRegions(java.util.Collection<String> awsRegions) {
        if (awsRegions == null) {
            this.awsRegions = null;
            return;
        }

        this.awsRegions = new java.util.ArrayList<String>(awsRegions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAwsRegions(java.util.Collection)} or {@link #withAwsRegions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param awsRegions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withAwsRegions(String... awsRegions) {
        if (this.awsRegions == null) {
            setAwsRegions(new java.util.ArrayList<String>(awsRegions.length));
        }
        for (String ele : awsRegions) {
            this.awsRegions.add(ele);
        }
        return this;
    }

    /**
     * @param awsRegions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withAwsRegions(java.util.Collection<String> awsRegions) {
        setAwsRegions(awsRegions);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getNonAwsRegions() {
        return nonAwsRegions;
    }

    /**
     * @param nonAwsRegions
     */

    public void setNonAwsRegions(java.util.Collection<String> nonAwsRegions) {
        if (nonAwsRegions == null) {
            this.nonAwsRegions = null;
            return;
        }

        this.nonAwsRegions = new java.util.ArrayList<String>(nonAwsRegions);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNonAwsRegions(java.util.Collection)} or {@link #withNonAwsRegions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nonAwsRegions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withNonAwsRegions(String... nonAwsRegions) {
        if (this.nonAwsRegions == null) {
            setNonAwsRegions(new java.util.ArrayList<String>(nonAwsRegions.length));
        }
        for (String ele : nonAwsRegions) {
            this.nonAwsRegions.add(ele);
        }
        return this;
    }

    /**
     * @param nonAwsRegions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withNonAwsRegions(java.util.Collection<String> nonAwsRegions) {
        setNonAwsRegions(nonAwsRegions);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getPillarPriorities() {
        return pillarPriorities;
    }

    /**
     * @param pillarPriorities
     */

    public void setPillarPriorities(java.util.Collection<String> pillarPriorities) {
        if (pillarPriorities == null) {
            this.pillarPriorities = null;
            return;
        }

        this.pillarPriorities = new java.util.ArrayList<String>(pillarPriorities);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPillarPriorities(java.util.Collection)} or {@link #withPillarPriorities(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param pillarPriorities
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withPillarPriorities(String... pillarPriorities) {
        if (this.pillarPriorities == null) {
            setPillarPriorities(new java.util.ArrayList<String>(pillarPriorities.length));
        }
        for (String ele : pillarPriorities) {
            this.pillarPriorities.add(ele);
        }
        return this;
    }

    /**
     * @param pillarPriorities
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withPillarPriorities(java.util.Collection<String> pillarPriorities) {
        setPillarPriorities(pillarPriorities);
        return this;
    }

    /**
     * @param architecturalDesign
     */

    public void setArchitecturalDesign(String architecturalDesign) {
        this.architecturalDesign = architecturalDesign;
    }

    /**
     * @return
     */

    public String getArchitecturalDesign() {
        return this.architecturalDesign;
    }

    /**
     * @param architecturalDesign
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withArchitecturalDesign(String architecturalDesign) {
        setArchitecturalDesign(architecturalDesign);
        return this;
    }

    /**
     * @param reviewOwner
     */

    public void setReviewOwner(String reviewOwner) {
        this.reviewOwner = reviewOwner;
    }

    /**
     * @return
     */

    public String getReviewOwner() {
        return this.reviewOwner;
    }

    /**
     * @param reviewOwner
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withReviewOwner(String reviewOwner) {
        setReviewOwner(reviewOwner);
        return this;
    }

    /**
     * <p>
     * Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is required.
     * </p>
     * <p>
     * If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the workload
     * is restricted until an owner is added.
     * </p>
     * 
     * @param isReviewOwnerUpdateAcknowledged
     *        Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is
     *        required.</p>
     *        <p>
     *        If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the
     *        workload is restricted until an owner is added.
     */

    public void setIsReviewOwnerUpdateAcknowledged(Boolean isReviewOwnerUpdateAcknowledged) {
        this.isReviewOwnerUpdateAcknowledged = isReviewOwnerUpdateAcknowledged;
    }

    /**
     * <p>
     * Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is required.
     * </p>
     * <p>
     * If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the workload
     * is restricted until an owner is added.
     * </p>
     * 
     * @return Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is
     *         required.</p>
     *         <p>
     *         If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the
     *         workload is restricted until an owner is added.
     */

    public Boolean getIsReviewOwnerUpdateAcknowledged() {
        return this.isReviewOwnerUpdateAcknowledged;
    }

    /**
     * <p>
     * Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is required.
     * </p>
     * <p>
     * If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the workload
     * is restricted until an owner is added.
     * </p>
     * 
     * @param isReviewOwnerUpdateAcknowledged
     *        Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is
     *        required.</p>
     *        <p>
     *        If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the
     *        workload is restricted until an owner is added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withIsReviewOwnerUpdateAcknowledged(Boolean isReviewOwnerUpdateAcknowledged) {
        setIsReviewOwnerUpdateAcknowledged(isReviewOwnerUpdateAcknowledged);
        return this;
    }

    /**
     * <p>
     * Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is required.
     * </p>
     * <p>
     * If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the workload
     * is restricted until an owner is added.
     * </p>
     * 
     * @return Flag indicating whether the workload owner has acknowledged that the <i>Review owner</i> field is
     *         required.</p>
     *         <p>
     *         If a <b>Review owner</b> is not added to the workload within 60 days of acknowledgement, access to the
     *         workload is restricted until an owner is added.
     */

    public Boolean isReviewOwnerUpdateAcknowledged() {
        return this.isReviewOwnerUpdateAcknowledged;
    }

    /**
     * @param industryType
     */

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    /**
     * @return
     */

    public String getIndustryType() {
        return this.industryType;
    }

    /**
     * @param industryType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withIndustryType(String industryType) {
        setIndustryType(industryType);
        return this;
    }

    /**
     * @param industry
     */

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * @return
     */

    public String getIndustry() {
        return this.industry;
    }

    /**
     * @param industry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWorkloadRequest withIndustry(String industry) {
        setIndustry(industry);
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

    public UpdateWorkloadRequest withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * @param improvementStatus
     * @see WorkloadImprovementStatus
     */

    public void setImprovementStatus(String improvementStatus) {
        this.improvementStatus = improvementStatus;
    }

    /**
     * @return
     * @see WorkloadImprovementStatus
     */

    public String getImprovementStatus() {
        return this.improvementStatus;
    }

    /**
     * @param improvementStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadImprovementStatus
     */

    public UpdateWorkloadRequest withImprovementStatus(String improvementStatus) {
        setImprovementStatus(improvementStatus);
        return this;
    }

    /**
     * @param improvementStatus
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadImprovementStatus
     */

    public UpdateWorkloadRequest withImprovementStatus(WorkloadImprovementStatus improvementStatus) {
        this.improvementStatus = improvementStatus.toString();
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getAwsRegions() != null)
            sb.append("AwsRegions: ").append(getAwsRegions()).append(",");
        if (getNonAwsRegions() != null)
            sb.append("NonAwsRegions: ").append(getNonAwsRegions()).append(",");
        if (getPillarPriorities() != null)
            sb.append("PillarPriorities: ").append(getPillarPriorities()).append(",");
        if (getArchitecturalDesign() != null)
            sb.append("ArchitecturalDesign: ").append(getArchitecturalDesign()).append(",");
        if (getReviewOwner() != null)
            sb.append("ReviewOwner: ").append(getReviewOwner()).append(",");
        if (getIsReviewOwnerUpdateAcknowledged() != null)
            sb.append("IsReviewOwnerUpdateAcknowledged: ").append(getIsReviewOwnerUpdateAcknowledged()).append(",");
        if (getIndustryType() != null)
            sb.append("IndustryType: ").append(getIndustryType()).append(",");
        if (getIndustry() != null)
            sb.append("Industry: ").append(getIndustry()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getImprovementStatus() != null)
            sb.append("ImprovementStatus: ").append(getImprovementStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWorkloadRequest == false)
            return false;
        UpdateWorkloadRequest other = (UpdateWorkloadRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getAwsRegions() == null ^ this.getAwsRegions() == null)
            return false;
        if (other.getAwsRegions() != null && other.getAwsRegions().equals(this.getAwsRegions()) == false)
            return false;
        if (other.getNonAwsRegions() == null ^ this.getNonAwsRegions() == null)
            return false;
        if (other.getNonAwsRegions() != null && other.getNonAwsRegions().equals(this.getNonAwsRegions()) == false)
            return false;
        if (other.getPillarPriorities() == null ^ this.getPillarPriorities() == null)
            return false;
        if (other.getPillarPriorities() != null && other.getPillarPriorities().equals(this.getPillarPriorities()) == false)
            return false;
        if (other.getArchitecturalDesign() == null ^ this.getArchitecturalDesign() == null)
            return false;
        if (other.getArchitecturalDesign() != null && other.getArchitecturalDesign().equals(this.getArchitecturalDesign()) == false)
            return false;
        if (other.getReviewOwner() == null ^ this.getReviewOwner() == null)
            return false;
        if (other.getReviewOwner() != null && other.getReviewOwner().equals(this.getReviewOwner()) == false)
            return false;
        if (other.getIsReviewOwnerUpdateAcknowledged() == null ^ this.getIsReviewOwnerUpdateAcknowledged() == null)
            return false;
        if (other.getIsReviewOwnerUpdateAcknowledged() != null
                && other.getIsReviewOwnerUpdateAcknowledged().equals(this.getIsReviewOwnerUpdateAcknowledged()) == false)
            return false;
        if (other.getIndustryType() == null ^ this.getIndustryType() == null)
            return false;
        if (other.getIndustryType() != null && other.getIndustryType().equals(this.getIndustryType()) == false)
            return false;
        if (other.getIndustry() == null ^ this.getIndustry() == null)
            return false;
        if (other.getIndustry() != null && other.getIndustry().equals(this.getIndustry()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getImprovementStatus() == null ^ this.getImprovementStatus() == null)
            return false;
        if (other.getImprovementStatus() != null && other.getImprovementStatus().equals(this.getImprovementStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getAwsRegions() == null) ? 0 : getAwsRegions().hashCode());
        hashCode = prime * hashCode + ((getNonAwsRegions() == null) ? 0 : getNonAwsRegions().hashCode());
        hashCode = prime * hashCode + ((getPillarPriorities() == null) ? 0 : getPillarPriorities().hashCode());
        hashCode = prime * hashCode + ((getArchitecturalDesign() == null) ? 0 : getArchitecturalDesign().hashCode());
        hashCode = prime * hashCode + ((getReviewOwner() == null) ? 0 : getReviewOwner().hashCode());
        hashCode = prime * hashCode + ((getIsReviewOwnerUpdateAcknowledged() == null) ? 0 : getIsReviewOwnerUpdateAcknowledged().hashCode());
        hashCode = prime * hashCode + ((getIndustryType() == null) ? 0 : getIndustryType().hashCode());
        hashCode = prime * hashCode + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getImprovementStatus() == null) ? 0 : getImprovementStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWorkloadRequest clone() {
        return (UpdateWorkloadRequest) super.clone();
    }

}
