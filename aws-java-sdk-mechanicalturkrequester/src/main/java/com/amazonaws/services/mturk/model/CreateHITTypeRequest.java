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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/CreateHITType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateHITTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The number of seconds after an assignment for the HIT has been submitted, after which the assignment is
     * considered Approved automatically unless the Requester explicitly rejects it.
     * </p>
     */
    private Long autoApprovalDelayInSeconds;
    /**
     * <p>
     * The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not
     * complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is
     * still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find
     * and accept.
     * </p>
     */
    private Long assignmentDurationInSeconds;
    /**
     * <p>
     * The amount of money the Requester will pay a Worker for successfully completing the HIT.
     * </p>
     */
    private String reward;
    /**
     * <p>
     * The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the
     * Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned.
     * </p>
     */
    private String title;
    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find
     * HITs.
     * </p>
     */
    private String keywords;
    /**
     * <p>
     * A general description of the HIT. A description includes detailed information about the kind of task the HIT
     * contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search
     * results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate
     * the HIT before accepting it.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and
     * ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT.
     * Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     * <code>QualificationRequirement</code> structure.
     * </p>
     */
    private java.util.List<QualificationRequirement> qualificationRequirements;

    /**
     * <p>
     * The number of seconds after an assignment for the HIT has been submitted, after which the assignment is
     * considered Approved automatically unless the Requester explicitly rejects it.
     * </p>
     * 
     * @param autoApprovalDelayInSeconds
     *        The number of seconds after an assignment for the HIT has been submitted, after which the assignment is
     *        considered Approved automatically unless the Requester explicitly rejects it.
     */

    public void setAutoApprovalDelayInSeconds(Long autoApprovalDelayInSeconds) {
        this.autoApprovalDelayInSeconds = autoApprovalDelayInSeconds;
    }

    /**
     * <p>
     * The number of seconds after an assignment for the HIT has been submitted, after which the assignment is
     * considered Approved automatically unless the Requester explicitly rejects it.
     * </p>
     * 
     * @return The number of seconds after an assignment for the HIT has been submitted, after which the assignment is
     *         considered Approved automatically unless the Requester explicitly rejects it.
     */

    public Long getAutoApprovalDelayInSeconds() {
        return this.autoApprovalDelayInSeconds;
    }

    /**
     * <p>
     * The number of seconds after an assignment for the HIT has been submitted, after which the assignment is
     * considered Approved automatically unless the Requester explicitly rejects it.
     * </p>
     * 
     * @param autoApprovalDelayInSeconds
     *        The number of seconds after an assignment for the HIT has been submitted, after which the assignment is
     *        considered Approved automatically unless the Requester explicitly rejects it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withAutoApprovalDelayInSeconds(Long autoApprovalDelayInSeconds) {
        setAutoApprovalDelayInSeconds(autoApprovalDelayInSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not
     * complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is
     * still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find
     * and accept.
     * </p>
     * 
     * @param assignmentDurationInSeconds
     *        The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does
     *        not complete the assignment within the specified duration, the assignment is considered abandoned. If the
     *        HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for other
     *        users to find and accept.
     */

    public void setAssignmentDurationInSeconds(Long assignmentDurationInSeconds) {
        this.assignmentDurationInSeconds = assignmentDurationInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not
     * complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is
     * still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find
     * and accept.
     * </p>
     * 
     * @return The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker
     *         does not complete the assignment within the specified duration, the assignment is considered abandoned.
     *         If the HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for
     *         other users to find and accept.
     */

    public Long getAssignmentDurationInSeconds() {
        return this.assignmentDurationInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does not
     * complete the assignment within the specified duration, the assignment is considered abandoned. If the HIT is
     * still active (that is, its lifetime has not elapsed), the assignment becomes available for other users to find
     * and accept.
     * </p>
     * 
     * @param assignmentDurationInSeconds
     *        The amount of time, in seconds, that a Worker has to complete the HIT after accepting it. If a Worker does
     *        not complete the assignment within the specified duration, the assignment is considered abandoned. If the
     *        HIT is still active (that is, its lifetime has not elapsed), the assignment becomes available for other
     *        users to find and accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withAssignmentDurationInSeconds(Long assignmentDurationInSeconds) {
        setAssignmentDurationInSeconds(assignmentDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The amount of money the Requester will pay a Worker for successfully completing the HIT.
     * </p>
     * 
     * @param reward
     *        The amount of money the Requester will pay a Worker for successfully completing the HIT.
     */

    public void setReward(String reward) {
        this.reward = reward;
    }

    /**
     * <p>
     * The amount of money the Requester will pay a Worker for successfully completing the HIT.
     * </p>
     * 
     * @return The amount of money the Requester will pay a Worker for successfully completing the HIT.
     */

    public String getReward() {
        return this.reward;
    }

    /**
     * <p>
     * The amount of money the Requester will pay a Worker for successfully completing the HIT.
     * </p>
     * 
     * @param reward
     *        The amount of money the Requester will pay a Worker for successfully completing the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withReward(String reward) {
        setReward(reward);
        return this;
    }

    /**
     * <p>
     * The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the
     * Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned.
     * </p>
     * 
     * @param title
     *        The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On
     *        the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is
     *        mentioned.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the
     * Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned.
     * </p>
     * 
     * @return The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On
     *         the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is
     *         mentioned.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On the
     * Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is mentioned.
     * </p>
     * 
     * @param title
     *        The title of the HIT. A title should be short and descriptive about the kind of task the HIT contains. On
     *        the Amazon Mechanical Turk web site, the HIT title appears in search results, and everywhere the HIT is
     *        mentioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find
     * HITs.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe the HIT, separated by commas. These words are used in searches
     *        to find HITs.
     */

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find
     * HITs.
     * </p>
     * 
     * @return One or more words or phrases that describe the HIT, separated by commas. These words are used in searches
     *         to find HITs.
     */

    public String getKeywords() {
        return this.keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. These words are used in searches to find
     * HITs.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe the HIT, separated by commas. These words are used in searches
     *        to find HITs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withKeywords(String keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * A general description of the HIT. A description includes detailed information about the kind of task the HIT
     * contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search
     * results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate
     * the HIT before accepting it.
     * </p>
     * 
     * @param description
     *        A general description of the HIT. A description includes detailed information about the kind of task the
     *        HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of
     *        search results, and in the HIT and assignment screens. A good description gives the user enough
     *        information to evaluate the HIT before accepting it.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A general description of the HIT. A description includes detailed information about the kind of task the HIT
     * contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search
     * results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate
     * the HIT before accepting it.
     * </p>
     * 
     * @return A general description of the HIT. A description includes detailed information about the kind of task the
     *         HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of
     *         search results, and in the HIT and assignment screens. A good description gives the user enough
     *         information to evaluate the HIT before accepting it.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A general description of the HIT. A description includes detailed information about the kind of task the HIT
     * contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of search
     * results, and in the HIT and assignment screens. A good description gives the user enough information to evaluate
     * the HIT before accepting it.
     * </p>
     * 
     * @param description
     *        A general description of the HIT. A description includes detailed information about the kind of task the
     *        HIT contains. On the Amazon Mechanical Turk web site, the HIT description appears in the expanded view of
     *        search results, and in the HIT and assignment screens. A good description gives the user enough
     *        information to evaluate the HIT before accepting it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and
     * ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT.
     * Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     * <code>QualificationRequirement</code> structure.
     * </p>
     * 
     * @return Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between
     *         zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the
     *         HIT. Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     *         <code>QualificationRequirement</code> structure.
     */

    public java.util.List<QualificationRequirement> getQualificationRequirements() {
        return qualificationRequirements;
    }

    /**
     * <p>
     * Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and
     * ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT.
     * Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     * <code>QualificationRequirement</code> structure.
     * </p>
     * 
     * @param qualificationRequirements
     *        Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between
     *        zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the
     *        HIT. Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     *        <code>QualificationRequirement</code> structure.
     */

    public void setQualificationRequirements(java.util.Collection<QualificationRequirement> qualificationRequirements) {
        if (qualificationRequirements == null) {
            this.qualificationRequirements = null;
            return;
        }

        this.qualificationRequirements = new java.util.ArrayList<QualificationRequirement>(qualificationRequirements);
    }

    /**
     * <p>
     * Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and
     * ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT.
     * Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     * <code>QualificationRequirement</code> structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQualificationRequirements(java.util.Collection)} or
     * {@link #withQualificationRequirements(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param qualificationRequirements
     *        Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between
     *        zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the
     *        HIT. Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     *        <code>QualificationRequirement</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withQualificationRequirements(QualificationRequirement... qualificationRequirements) {
        if (this.qualificationRequirements == null) {
            setQualificationRequirements(new java.util.ArrayList<QualificationRequirement>(qualificationRequirements.length));
        }
        for (QualificationRequirement ele : qualificationRequirements) {
            this.qualificationRequirements.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between zero and
     * ten Qualification requirements. All requirements must be met in order for a Worker to accept the HIT.
     * Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     * <code>QualificationRequirement</code> structure.
     * </p>
     * 
     * @param qualificationRequirements
     *        Conditions that a Worker's Qualifications must meet in order to accept the HIT. A HIT can have between
     *        zero and ten Qualification requirements. All requirements must be met in order for a Worker to accept the
     *        HIT. Additionally, other actions can be restricted using the <code>ActionsGuarded</code> field on each
     *        <code>QualificationRequirement</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateHITTypeRequest withQualificationRequirements(java.util.Collection<QualificationRequirement> qualificationRequirements) {
        setQualificationRequirements(qualificationRequirements);
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
        if (getAutoApprovalDelayInSeconds() != null)
            sb.append("AutoApprovalDelayInSeconds: ").append(getAutoApprovalDelayInSeconds()).append(",");
        if (getAssignmentDurationInSeconds() != null)
            sb.append("AssignmentDurationInSeconds: ").append(getAssignmentDurationInSeconds()).append(",");
        if (getReward() != null)
            sb.append("Reward: ").append(getReward()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getQualificationRequirements() != null)
            sb.append("QualificationRequirements: ").append(getQualificationRequirements());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHITTypeRequest == false)
            return false;
        CreateHITTypeRequest other = (CreateHITTypeRequest) obj;
        if (other.getAutoApprovalDelayInSeconds() == null ^ this.getAutoApprovalDelayInSeconds() == null)
            return false;
        if (other.getAutoApprovalDelayInSeconds() != null && other.getAutoApprovalDelayInSeconds().equals(this.getAutoApprovalDelayInSeconds()) == false)
            return false;
        if (other.getAssignmentDurationInSeconds() == null ^ this.getAssignmentDurationInSeconds() == null)
            return false;
        if (other.getAssignmentDurationInSeconds() != null && other.getAssignmentDurationInSeconds().equals(this.getAssignmentDurationInSeconds()) == false)
            return false;
        if (other.getReward() == null ^ this.getReward() == null)
            return false;
        if (other.getReward() != null && other.getReward().equals(this.getReward()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getQualificationRequirements() == null ^ this.getQualificationRequirements() == null)
            return false;
        if (other.getQualificationRequirements() != null && other.getQualificationRequirements().equals(this.getQualificationRequirements()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoApprovalDelayInSeconds() == null) ? 0 : getAutoApprovalDelayInSeconds().hashCode());
        hashCode = prime * hashCode + ((getAssignmentDurationInSeconds() == null) ? 0 : getAssignmentDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getReward() == null) ? 0 : getReward().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getQualificationRequirements() == null) ? 0 : getQualificationRequirements().hashCode());
        return hashCode;
    }

    @Override
    public CreateHITTypeRequest clone() {
        return (CreateHITTypeRequest) super.clone();
    }

}
