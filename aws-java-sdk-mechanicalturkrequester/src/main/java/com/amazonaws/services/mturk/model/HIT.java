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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The HIT data structure represents a single HIT, including all the information necessary for a Worker to accept and
 * complete the HIT.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/HIT" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HIT implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the HIT.
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * The ID of the HIT type of this HIT
     * </p>
     */
    private String hITTypeId;
    /**
     * <p>
     * The ID of the HIT Group of this HIT.
     * </p>
     */
    private String hITGroupId;
    /**
     * <p>
     * The ID of the HIT Layout of this HIT.
     * </p>
     */
    private String hITLayoutId;
    /**
     * <p>
     * The date and time the HIT was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The title of the HIT.
     * </p>
     */
    private String title;
    /**
     * <p>
     * A general description of the HIT.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm,
     * HTMLQuestion or an ExternalQuestion data structure.
     * </p>
     */
    private String question;
    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the keywords of
     * a HIT are more likely to have the HIT in the search results.
     * </p>
     */
    private String keywords;
    /**
     * <p>
     * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing |
     * Disposed.
     * </p>
     */
    private String hITStatus;
    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     */
    private Integer maxAssignments;

    private String reward;
    /**
     * <p>
     * The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are
     * automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject an
     * assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid.
     * </p>
     */
    private Long autoApprovalDelayInSeconds;
    /**
     * <p>
     * The date and time the HIT expires.
     * </p>
     */
    private java.util.Date expiration;
    /**
     * <p>
     * The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
     * </p>
     */
    private Long assignmentDurationInSeconds;
    /**
     * <p>
     * An arbitrary data field the Requester who created the HIT can use. This field is visible only to the creator of
     * the HIT.
     * </p>
     */
    private String requesterAnnotation;
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
     * Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate |
     * ReviewedInappropriate.
     * </p>
     */
    private String hITReviewStatus;
    /**
     * <p>
     * The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have not
     * yet been submitted, returned, or abandoned.
     * </p>
     */
    private Integer numberOfAssignmentsPending;
    /**
     * <p>
     * The number of assignments for this HIT that are available for Workers to accept.
     * </p>
     */
    private Integer numberOfAssignmentsAvailable;
    /**
     * <p>
     * The number of assignments for this HIT that have been approved or rejected.
     * </p>
     */
    private Integer numberOfAssignmentsCompleted;

    /**
     * <p>
     * A unique identifier for the HIT.
     * </p>
     * 
     * @param hITId
     *        A unique identifier for the HIT.
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * A unique identifier for the HIT.
     * </p>
     * 
     * @return A unique identifier for the HIT.
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * A unique identifier for the HIT.
     * </p>
     * 
     * @param hITId
     *        A unique identifier for the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * The ID of the HIT type of this HIT
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the HIT type of this HIT
     */

    public void setHITTypeId(String hITTypeId) {
        this.hITTypeId = hITTypeId;
    }

    /**
     * <p>
     * The ID of the HIT type of this HIT
     * </p>
     * 
     * @return The ID of the HIT type of this HIT
     */

    public String getHITTypeId() {
        return this.hITTypeId;
    }

    /**
     * <p>
     * The ID of the HIT type of this HIT
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the HIT type of this HIT
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withHITTypeId(String hITTypeId) {
        setHITTypeId(hITTypeId);
        return this;
    }

    /**
     * <p>
     * The ID of the HIT Group of this HIT.
     * </p>
     * 
     * @param hITGroupId
     *        The ID of the HIT Group of this HIT.
     */

    public void setHITGroupId(String hITGroupId) {
        this.hITGroupId = hITGroupId;
    }

    /**
     * <p>
     * The ID of the HIT Group of this HIT.
     * </p>
     * 
     * @return The ID of the HIT Group of this HIT.
     */

    public String getHITGroupId() {
        return this.hITGroupId;
    }

    /**
     * <p>
     * The ID of the HIT Group of this HIT.
     * </p>
     * 
     * @param hITGroupId
     *        The ID of the HIT Group of this HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withHITGroupId(String hITGroupId) {
        setHITGroupId(hITGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the HIT Layout of this HIT.
     * </p>
     * 
     * @param hITLayoutId
     *        The ID of the HIT Layout of this HIT.
     */

    public void setHITLayoutId(String hITLayoutId) {
        this.hITLayoutId = hITLayoutId;
    }

    /**
     * <p>
     * The ID of the HIT Layout of this HIT.
     * </p>
     * 
     * @return The ID of the HIT Layout of this HIT.
     */

    public String getHITLayoutId() {
        return this.hITLayoutId;
    }

    /**
     * <p>
     * The ID of the HIT Layout of this HIT.
     * </p>
     * 
     * @param hITLayoutId
     *        The ID of the HIT Layout of this HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withHITLayoutId(String hITLayoutId) {
        setHITLayoutId(hITLayoutId);
        return this;
    }

    /**
     * <p>
     * The date and time the HIT was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the HIT was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time the HIT was created.
     * </p>
     * 
     * @return The date and time the HIT was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time the HIT was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time the HIT was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The title of the HIT.
     * </p>
     * 
     * @param title
     *        The title of the HIT.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title of the HIT.
     * </p>
     * 
     * @return The title of the HIT.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title of the HIT.
     * </p>
     * 
     * @param title
     *        The title of the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * A general description of the HIT.
     * </p>
     * 
     * @param description
     *        A general description of the HIT.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A general description of the HIT.
     * </p>
     * 
     * @return A general description of the HIT.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A general description of the HIT.
     * </p>
     * 
     * @param description
     *        A general description of the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm,
     * HTMLQuestion or an ExternalQuestion data structure.
     * </p>
     * 
     * @param question
     *        The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm,
     *        HTMLQuestion or an ExternalQuestion data structure.
     */

    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * <p>
     * The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm,
     * HTMLQuestion or an ExternalQuestion data structure.
     * </p>
     * 
     * @return The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm,
     *         HTMLQuestion or an ExternalQuestion data structure.
     */

    public String getQuestion() {
        return this.question;
    }

    /**
     * <p>
     * The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm,
     * HTMLQuestion or an ExternalQuestion data structure.
     * </p>
     * 
     * @param question
     *        The data the Worker completing the HIT uses produce the results. This is either either a QuestionForm,
     *        HTMLQuestion or an ExternalQuestion data structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withQuestion(String question) {
        setQuestion(question);
        return this;
    }

    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the keywords of
     * a HIT are more likely to have the HIT in the search results.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the
     *        keywords of a HIT are more likely to have the HIT in the search results.
     */

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the keywords of
     * a HIT are more likely to have the HIT in the search results.
     * </p>
     * 
     * @return One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the
     *         keywords of a HIT are more likely to have the HIT in the search results.
     */

    public String getKeywords() {
        return this.keywords;
    }

    /**
     * <p>
     * One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the keywords of
     * a HIT are more likely to have the HIT in the search results.
     * </p>
     * 
     * @param keywords
     *        One or more words or phrases that describe the HIT, separated by commas. Search terms similar to the
     *        keywords of a HIT are more likely to have the HIT in the search results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withKeywords(String keywords) {
        setKeywords(keywords);
        return this;
    }

    /**
     * <p>
     * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing |
     * Disposed.
     * </p>
     * 
     * @param hITStatus
     *        The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable |
     *        Reviewing | Disposed.
     * @see HITStatus
     */

    public void setHITStatus(String hITStatus) {
        this.hITStatus = hITStatus;
    }

    /**
     * <p>
     * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing |
     * Disposed.
     * </p>
     * 
     * @return The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable |
     *         Reviewing | Disposed.
     * @see HITStatus
     */

    public String getHITStatus() {
        return this.hITStatus;
    }

    /**
     * <p>
     * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing |
     * Disposed.
     * </p>
     * 
     * @param hITStatus
     *        The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable |
     *        Reviewing | Disposed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HITStatus
     */

    public HIT withHITStatus(String hITStatus) {
        setHITStatus(hITStatus);
        return this;
    }

    /**
     * <p>
     * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing |
     * Disposed.
     * </p>
     * 
     * @param hITStatus
     *        The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable |
     *        Reviewing | Disposed.
     * @see HITStatus
     */

    public void setHITStatus(HITStatus hITStatus) {
        withHITStatus(hITStatus);
    }

    /**
     * <p>
     * The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable | Reviewing |
     * Disposed.
     * </p>
     * 
     * @param hITStatus
     *        The status of the HIT and its assignments. Valid Values are Assignable | Unassignable | Reviewable |
     *        Reviewing | Disposed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HITStatus
     */

    public HIT withHITStatus(HITStatus hITStatus) {
        this.hITStatus = hITStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     * 
     * @param maxAssignments
     *        The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     */

    public void setMaxAssignments(Integer maxAssignments) {
        this.maxAssignments = maxAssignments;
    }

    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     * 
     * @return The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     */

    public Integer getMaxAssignments() {
        return this.maxAssignments;
    }

    /**
     * <p>
     * The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * </p>
     * 
     * @param maxAssignments
     *        The number of times the HIT can be accepted and completed before the HIT becomes unavailable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withMaxAssignments(Integer maxAssignments) {
        setMaxAssignments(maxAssignments);
        return this;
    }

    /**
     * @param reward
     */

    public void setReward(String reward) {
        this.reward = reward;
    }

    /**
     * @return
     */

    public String getReward() {
        return this.reward;
    }

    /**
     * @param reward
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withReward(String reward) {
        setReward(reward);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are
     * automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject an
     * assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid.
     * </p>
     * 
     * @param autoApprovalDelayInSeconds
     *        The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are
     *        automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject
     *        an assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid.
     */

    public void setAutoApprovalDelayInSeconds(Long autoApprovalDelayInSeconds) {
        this.autoApprovalDelayInSeconds = autoApprovalDelayInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are
     * automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject an
     * assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid.
     * </p>
     * 
     * @return The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are
     *         automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject
     *         an assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid.
     */

    public Long getAutoApprovalDelayInSeconds() {
        return this.autoApprovalDelayInSeconds;
    }

    /**
     * <p>
     * The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are
     * automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject an
     * assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid.
     * </p>
     * 
     * @param autoApprovalDelayInSeconds
     *        The amount of time, in seconds, after the Worker submits an assignment for the HIT that the results are
     *        automatically approved by Amazon Mechanical Turk. This is the amount of time the Requester has to reject
     *        an assignment submitted by a Worker before the assignment is auto-approved and the Worker is paid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withAutoApprovalDelayInSeconds(Long autoApprovalDelayInSeconds) {
        setAutoApprovalDelayInSeconds(autoApprovalDelayInSeconds);
        return this;
    }

    /**
     * <p>
     * The date and time the HIT expires.
     * </p>
     * 
     * @param expiration
     *        The date and time the HIT expires.
     */

    public void setExpiration(java.util.Date expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * The date and time the HIT expires.
     * </p>
     * 
     * @return The date and time the HIT expires.
     */

    public java.util.Date getExpiration() {
        return this.expiration;
    }

    /**
     * <p>
     * The date and time the HIT expires.
     * </p>
     * 
     * @param expiration
     *        The date and time the HIT expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withExpiration(java.util.Date expiration) {
        setExpiration(expiration);
        return this;
    }

    /**
     * <p>
     * The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
     * </p>
     * 
     * @param assignmentDurationInSeconds
     *        The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
     */

    public void setAssignmentDurationInSeconds(Long assignmentDurationInSeconds) {
        this.assignmentDurationInSeconds = assignmentDurationInSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
     * </p>
     * 
     * @return The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
     */

    public Long getAssignmentDurationInSeconds() {
        return this.assignmentDurationInSeconds;
    }

    /**
     * <p>
     * The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
     * </p>
     * 
     * @param assignmentDurationInSeconds
     *        The length of time, in seconds, that a Worker has to complete the HIT after accepting it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withAssignmentDurationInSeconds(Long assignmentDurationInSeconds) {
        setAssignmentDurationInSeconds(assignmentDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * An arbitrary data field the Requester who created the HIT can use. This field is visible only to the creator of
     * the HIT.
     * </p>
     * 
     * @param requesterAnnotation
     *        An arbitrary data field the Requester who created the HIT can use. This field is visible only to the
     *        creator of the HIT.
     */

    public void setRequesterAnnotation(String requesterAnnotation) {
        this.requesterAnnotation = requesterAnnotation;
    }

    /**
     * <p>
     * An arbitrary data field the Requester who created the HIT can use. This field is visible only to the creator of
     * the HIT.
     * </p>
     * 
     * @return An arbitrary data field the Requester who created the HIT can use. This field is visible only to the
     *         creator of the HIT.
     */

    public String getRequesterAnnotation() {
        return this.requesterAnnotation;
    }

    /**
     * <p>
     * An arbitrary data field the Requester who created the HIT can use. This field is visible only to the creator of
     * the HIT.
     * </p>
     * 
     * @param requesterAnnotation
     *        An arbitrary data field the Requester who created the HIT can use. This field is visible only to the
     *        creator of the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withRequesterAnnotation(String requesterAnnotation) {
        setRequesterAnnotation(requesterAnnotation);
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

    public HIT withQualificationRequirements(QualificationRequirement... qualificationRequirements) {
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

    public HIT withQualificationRequirements(java.util.Collection<QualificationRequirement> qualificationRequirements) {
        setQualificationRequirements(qualificationRequirements);
        return this;
    }

    /**
     * <p>
     * Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate |
     * ReviewedInappropriate.
     * </p>
     * 
     * @param hITReviewStatus
     *        Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview |
     *        ReviewedAppropriate | ReviewedInappropriate.
     * @see HITReviewStatus
     */

    public void setHITReviewStatus(String hITReviewStatus) {
        this.hITReviewStatus = hITReviewStatus;
    }

    /**
     * <p>
     * Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate |
     * ReviewedInappropriate.
     * </p>
     * 
     * @return Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview |
     *         ReviewedAppropriate | ReviewedInappropriate.
     * @see HITReviewStatus
     */

    public String getHITReviewStatus() {
        return this.hITReviewStatus;
    }

    /**
     * <p>
     * Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate |
     * ReviewedInappropriate.
     * </p>
     * 
     * @param hITReviewStatus
     *        Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview |
     *        ReviewedAppropriate | ReviewedInappropriate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HITReviewStatus
     */

    public HIT withHITReviewStatus(String hITReviewStatus) {
        setHITReviewStatus(hITReviewStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate |
     * ReviewedInappropriate.
     * </p>
     * 
     * @param hITReviewStatus
     *        Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview |
     *        ReviewedAppropriate | ReviewedInappropriate.
     * @see HITReviewStatus
     */

    public void setHITReviewStatus(HITReviewStatus hITReviewStatus) {
        withHITReviewStatus(hITReviewStatus);
    }

    /**
     * <p>
     * Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview | ReviewedAppropriate |
     * ReviewedInappropriate.
     * </p>
     * 
     * @param hITReviewStatus
     *        Indicates the review status of the HIT. Valid Values are NotReviewed | MarkedForReview |
     *        ReviewedAppropriate | ReviewedInappropriate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HITReviewStatus
     */

    public HIT withHITReviewStatus(HITReviewStatus hITReviewStatus) {
        this.hITReviewStatus = hITReviewStatus.toString();
        return this;
    }

    /**
     * <p>
     * The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have not
     * yet been submitted, returned, or abandoned.
     * </p>
     * 
     * @param numberOfAssignmentsPending
     *        The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have
     *        not yet been submitted, returned, or abandoned.
     */

    public void setNumberOfAssignmentsPending(Integer numberOfAssignmentsPending) {
        this.numberOfAssignmentsPending = numberOfAssignmentsPending;
    }

    /**
     * <p>
     * The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have not
     * yet been submitted, returned, or abandoned.
     * </p>
     * 
     * @return The number of assignments for this HIT that are being previewed or have been accepted by Workers, but
     *         have not yet been submitted, returned, or abandoned.
     */

    public Integer getNumberOfAssignmentsPending() {
        return this.numberOfAssignmentsPending;
    }

    /**
     * <p>
     * The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have not
     * yet been submitted, returned, or abandoned.
     * </p>
     * 
     * @param numberOfAssignmentsPending
     *        The number of assignments for this HIT that are being previewed or have been accepted by Workers, but have
     *        not yet been submitted, returned, or abandoned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withNumberOfAssignmentsPending(Integer numberOfAssignmentsPending) {
        setNumberOfAssignmentsPending(numberOfAssignmentsPending);
        return this;
    }

    /**
     * <p>
     * The number of assignments for this HIT that are available for Workers to accept.
     * </p>
     * 
     * @param numberOfAssignmentsAvailable
     *        The number of assignments for this HIT that are available for Workers to accept.
     */

    public void setNumberOfAssignmentsAvailable(Integer numberOfAssignmentsAvailable) {
        this.numberOfAssignmentsAvailable = numberOfAssignmentsAvailable;
    }

    /**
     * <p>
     * The number of assignments for this HIT that are available for Workers to accept.
     * </p>
     * 
     * @return The number of assignments for this HIT that are available for Workers to accept.
     */

    public Integer getNumberOfAssignmentsAvailable() {
        return this.numberOfAssignmentsAvailable;
    }

    /**
     * <p>
     * The number of assignments for this HIT that are available for Workers to accept.
     * </p>
     * 
     * @param numberOfAssignmentsAvailable
     *        The number of assignments for this HIT that are available for Workers to accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withNumberOfAssignmentsAvailable(Integer numberOfAssignmentsAvailable) {
        setNumberOfAssignmentsAvailable(numberOfAssignmentsAvailable);
        return this;
    }

    /**
     * <p>
     * The number of assignments for this HIT that have been approved or rejected.
     * </p>
     * 
     * @param numberOfAssignmentsCompleted
     *        The number of assignments for this HIT that have been approved or rejected.
     */

    public void setNumberOfAssignmentsCompleted(Integer numberOfAssignmentsCompleted) {
        this.numberOfAssignmentsCompleted = numberOfAssignmentsCompleted;
    }

    /**
     * <p>
     * The number of assignments for this HIT that have been approved or rejected.
     * </p>
     * 
     * @return The number of assignments for this HIT that have been approved or rejected.
     */

    public Integer getNumberOfAssignmentsCompleted() {
        return this.numberOfAssignmentsCompleted;
    }

    /**
     * <p>
     * The number of assignments for this HIT that have been approved or rejected.
     * </p>
     * 
     * @param numberOfAssignmentsCompleted
     *        The number of assignments for this HIT that have been approved or rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HIT withNumberOfAssignmentsCompleted(Integer numberOfAssignmentsCompleted) {
        setNumberOfAssignmentsCompleted(numberOfAssignmentsCompleted);
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
        if (getHITId() != null)
            sb.append("HITId: ").append(getHITId()).append(",");
        if (getHITTypeId() != null)
            sb.append("HITTypeId: ").append(getHITTypeId()).append(",");
        if (getHITGroupId() != null)
            sb.append("HITGroupId: ").append(getHITGroupId()).append(",");
        if (getHITLayoutId() != null)
            sb.append("HITLayoutId: ").append(getHITLayoutId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getQuestion() != null)
            sb.append("Question: ").append(getQuestion()).append(",");
        if (getKeywords() != null)
            sb.append("Keywords: ").append(getKeywords()).append(",");
        if (getHITStatus() != null)
            sb.append("HITStatus: ").append(getHITStatus()).append(",");
        if (getMaxAssignments() != null)
            sb.append("MaxAssignments: ").append(getMaxAssignments()).append(",");
        if (getReward() != null)
            sb.append("Reward: ").append(getReward()).append(",");
        if (getAutoApprovalDelayInSeconds() != null)
            sb.append("AutoApprovalDelayInSeconds: ").append(getAutoApprovalDelayInSeconds()).append(",");
        if (getExpiration() != null)
            sb.append("Expiration: ").append(getExpiration()).append(",");
        if (getAssignmentDurationInSeconds() != null)
            sb.append("AssignmentDurationInSeconds: ").append(getAssignmentDurationInSeconds()).append(",");
        if (getRequesterAnnotation() != null)
            sb.append("RequesterAnnotation: ").append(getRequesterAnnotation()).append(",");
        if (getQualificationRequirements() != null)
            sb.append("QualificationRequirements: ").append(getQualificationRequirements()).append(",");
        if (getHITReviewStatus() != null)
            sb.append("HITReviewStatus: ").append(getHITReviewStatus()).append(",");
        if (getNumberOfAssignmentsPending() != null)
            sb.append("NumberOfAssignmentsPending: ").append(getNumberOfAssignmentsPending()).append(",");
        if (getNumberOfAssignmentsAvailable() != null)
            sb.append("NumberOfAssignmentsAvailable: ").append(getNumberOfAssignmentsAvailable()).append(",");
        if (getNumberOfAssignmentsCompleted() != null)
            sb.append("NumberOfAssignmentsCompleted: ").append(getNumberOfAssignmentsCompleted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HIT == false)
            return false;
        HIT other = (HIT) obj;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getHITTypeId() == null ^ this.getHITTypeId() == null)
            return false;
        if (other.getHITTypeId() != null && other.getHITTypeId().equals(this.getHITTypeId()) == false)
            return false;
        if (other.getHITGroupId() == null ^ this.getHITGroupId() == null)
            return false;
        if (other.getHITGroupId() != null && other.getHITGroupId().equals(this.getHITGroupId()) == false)
            return false;
        if (other.getHITLayoutId() == null ^ this.getHITLayoutId() == null)
            return false;
        if (other.getHITLayoutId() != null && other.getHITLayoutId().equals(this.getHITLayoutId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getQuestion() == null ^ this.getQuestion() == null)
            return false;
        if (other.getQuestion() != null && other.getQuestion().equals(this.getQuestion()) == false)
            return false;
        if (other.getKeywords() == null ^ this.getKeywords() == null)
            return false;
        if (other.getKeywords() != null && other.getKeywords().equals(this.getKeywords()) == false)
            return false;
        if (other.getHITStatus() == null ^ this.getHITStatus() == null)
            return false;
        if (other.getHITStatus() != null && other.getHITStatus().equals(this.getHITStatus()) == false)
            return false;
        if (other.getMaxAssignments() == null ^ this.getMaxAssignments() == null)
            return false;
        if (other.getMaxAssignments() != null && other.getMaxAssignments().equals(this.getMaxAssignments()) == false)
            return false;
        if (other.getReward() == null ^ this.getReward() == null)
            return false;
        if (other.getReward() != null && other.getReward().equals(this.getReward()) == false)
            return false;
        if (other.getAutoApprovalDelayInSeconds() == null ^ this.getAutoApprovalDelayInSeconds() == null)
            return false;
        if (other.getAutoApprovalDelayInSeconds() != null && other.getAutoApprovalDelayInSeconds().equals(this.getAutoApprovalDelayInSeconds()) == false)
            return false;
        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getAssignmentDurationInSeconds() == null ^ this.getAssignmentDurationInSeconds() == null)
            return false;
        if (other.getAssignmentDurationInSeconds() != null && other.getAssignmentDurationInSeconds().equals(this.getAssignmentDurationInSeconds()) == false)
            return false;
        if (other.getRequesterAnnotation() == null ^ this.getRequesterAnnotation() == null)
            return false;
        if (other.getRequesterAnnotation() != null && other.getRequesterAnnotation().equals(this.getRequesterAnnotation()) == false)
            return false;
        if (other.getQualificationRequirements() == null ^ this.getQualificationRequirements() == null)
            return false;
        if (other.getQualificationRequirements() != null && other.getQualificationRequirements().equals(this.getQualificationRequirements()) == false)
            return false;
        if (other.getHITReviewStatus() == null ^ this.getHITReviewStatus() == null)
            return false;
        if (other.getHITReviewStatus() != null && other.getHITReviewStatus().equals(this.getHITReviewStatus()) == false)
            return false;
        if (other.getNumberOfAssignmentsPending() == null ^ this.getNumberOfAssignmentsPending() == null)
            return false;
        if (other.getNumberOfAssignmentsPending() != null && other.getNumberOfAssignmentsPending().equals(this.getNumberOfAssignmentsPending()) == false)
            return false;
        if (other.getNumberOfAssignmentsAvailable() == null ^ this.getNumberOfAssignmentsAvailable() == null)
            return false;
        if (other.getNumberOfAssignmentsAvailable() != null && other.getNumberOfAssignmentsAvailable().equals(this.getNumberOfAssignmentsAvailable()) == false)
            return false;
        if (other.getNumberOfAssignmentsCompleted() == null ^ this.getNumberOfAssignmentsCompleted() == null)
            return false;
        if (other.getNumberOfAssignmentsCompleted() != null && other.getNumberOfAssignmentsCompleted().equals(this.getNumberOfAssignmentsCompleted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getHITTypeId() == null) ? 0 : getHITTypeId().hashCode());
        hashCode = prime * hashCode + ((getHITGroupId() == null) ? 0 : getHITGroupId().hashCode());
        hashCode = prime * hashCode + ((getHITLayoutId() == null) ? 0 : getHITLayoutId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        hashCode = prime * hashCode + ((getKeywords() == null) ? 0 : getKeywords().hashCode());
        hashCode = prime * hashCode + ((getHITStatus() == null) ? 0 : getHITStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxAssignments() == null) ? 0 : getMaxAssignments().hashCode());
        hashCode = prime * hashCode + ((getReward() == null) ? 0 : getReward().hashCode());
        hashCode = prime * hashCode + ((getAutoApprovalDelayInSeconds() == null) ? 0 : getAutoApprovalDelayInSeconds().hashCode());
        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getAssignmentDurationInSeconds() == null) ? 0 : getAssignmentDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getRequesterAnnotation() == null) ? 0 : getRequesterAnnotation().hashCode());
        hashCode = prime * hashCode + ((getQualificationRequirements() == null) ? 0 : getQualificationRequirements().hashCode());
        hashCode = prime * hashCode + ((getHITReviewStatus() == null) ? 0 : getHITReviewStatus().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAssignmentsPending() == null) ? 0 : getNumberOfAssignmentsPending().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAssignmentsAvailable() == null) ? 0 : getNumberOfAssignmentsAvailable().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAssignmentsCompleted() == null) ? 0 : getNumberOfAssignmentsCompleted().hashCode());
        return hashCode;
    }

    @Override
    public HIT clone() {
        try {
            return (HIT) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.HITMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
