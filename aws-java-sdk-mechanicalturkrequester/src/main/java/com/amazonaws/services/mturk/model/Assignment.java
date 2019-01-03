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
 * The Assignment data structure represents a single assignment of a HIT to a Worker. The assignment tracks the Worker's
 * efforts to complete the HIT, and contains the results for later retrieval.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/Assignment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Assignment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the assignment.
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * The ID of the HIT.
     * </p>
     */
    private String hITId;
    /**
     * <p>
     * The status of the assignment.
     * </p>
     */
    private String assignmentStatus;
    /**
     * <p>
     * If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are
     * considered Approved automatically if they have not already been explicitly approved or rejected by the Requester.
     * This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted
     * from the assignment if the Worker has not yet submitted results.
     * </p>
     */
    private java.util.Date autoApprovalTime;
    /**
     * <p>
     * The date and time the Worker accepted the assignment.
     * </p>
     */
    private java.util.Date acceptTime;
    /**
     * <p>
     * If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is
     * omitted from the assignment if the Worker has not yet submitted results.
     * </p>
     */
    private java.util.Date submitTime;
    /**
     * <p>
     * If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time
     * the Requester approved the results. This value is omitted from the assignment if the Requester has not yet
     * approved the results.
     * </p>
     */
    private java.util.Date approvalTime;
    /**
     * <p>
     * If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and
     * time the Requester rejected the results.
     * </p>
     */
    private java.util.Date rejectionTime;
    /**
     * <p>
     * The date and time of the deadline for the assignment. This value is derived from the deadline specification for
     * the HIT and the date and time the Worker accepted the HIT.
     * </p>
     */
    private java.util.Date deadline;
    /**
     * <p>
     * The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an
     * answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer
     * may be empty.
     * </p>
     */
    private String answer;
    /**
     * <p>
     * The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation,
     * if the Requester approved or rejected the assignment and specified feedback.
     * </p>
     */
    private String requesterFeedback;

    /**
     * <p>
     * A unique identifier for the assignment.
     * </p>
     * 
     * @param assignmentId
     *        A unique identifier for the assignment.
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * A unique identifier for the assignment.
     * </p>
     * 
     * @return A unique identifier for the assignment.
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * A unique identifier for the assignment.
     * </p>
     * 
     * @param assignmentId
     *        A unique identifier for the assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who accepted the HIT.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     * 
     * @return The ID of the Worker who accepted the HIT.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker who accepted the HIT.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker who accepted the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * The ID of the HIT.
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT.
     */

    public void setHITId(String hITId) {
        this.hITId = hITId;
    }

    /**
     * <p>
     * The ID of the HIT.
     * </p>
     * 
     * @return The ID of the HIT.
     */

    public String getHITId() {
        return this.hITId;
    }

    /**
     * <p>
     * The ID of the HIT.
     * </p>
     * 
     * @param hITId
     *        The ID of the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withHITId(String hITId) {
        setHITId(hITId);
        return this;
    }

    /**
     * <p>
     * The status of the assignment.
     * </p>
     * 
     * @param assignmentStatus
     *        The status of the assignment.
     * @see AssignmentStatus
     */

    public void setAssignmentStatus(String assignmentStatus) {
        this.assignmentStatus = assignmentStatus;
    }

    /**
     * <p>
     * The status of the assignment.
     * </p>
     * 
     * @return The status of the assignment.
     * @see AssignmentStatus
     */

    public String getAssignmentStatus() {
        return this.assignmentStatus;
    }

    /**
     * <p>
     * The status of the assignment.
     * </p>
     * 
     * @param assignmentStatus
     *        The status of the assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public Assignment withAssignmentStatus(String assignmentStatus) {
        setAssignmentStatus(assignmentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the assignment.
     * </p>
     * 
     * @param assignmentStatus
     *        The status of the assignment.
     * @see AssignmentStatus
     */

    public void setAssignmentStatus(AssignmentStatus assignmentStatus) {
        withAssignmentStatus(assignmentStatus);
    }

    /**
     * <p>
     * The status of the assignment.
     * </p>
     * 
     * @param assignmentStatus
     *        The status of the assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssignmentStatus
     */

    public Assignment withAssignmentStatus(AssignmentStatus assignmentStatus) {
        this.assignmentStatus = assignmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are
     * considered Approved automatically if they have not already been explicitly approved or rejected by the Requester.
     * This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted
     * from the assignment if the Worker has not yet submitted results.
     * </p>
     * 
     * @param autoApprovalTime
     *        If results have been submitted, AutoApprovalTime is the date and time the results of the assignment
     *        results are considered Approved automatically if they have not already been explicitly approved or
     *        rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester
     *        in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
     */

    public void setAutoApprovalTime(java.util.Date autoApprovalTime) {
        this.autoApprovalTime = autoApprovalTime;
    }

    /**
     * <p>
     * If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are
     * considered Approved automatically if they have not already been explicitly approved or rejected by the Requester.
     * This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted
     * from the assignment if the Worker has not yet submitted results.
     * </p>
     * 
     * @return If results have been submitted, AutoApprovalTime is the date and time the results of the assignment
     *         results are considered Approved automatically if they have not already been explicitly approved or
     *         rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester
     *         in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
     */

    public java.util.Date getAutoApprovalTime() {
        return this.autoApprovalTime;
    }

    /**
     * <p>
     * If results have been submitted, AutoApprovalTime is the date and time the results of the assignment results are
     * considered Approved automatically if they have not already been explicitly approved or rejected by the Requester.
     * This value is derived from the auto-approval delay specified by the Requester in the HIT. This value is omitted
     * from the assignment if the Worker has not yet submitted results.
     * </p>
     * 
     * @param autoApprovalTime
     *        If results have been submitted, AutoApprovalTime is the date and time the results of the assignment
     *        results are considered Approved automatically if they have not already been explicitly approved or
     *        rejected by the Requester. This value is derived from the auto-approval delay specified by the Requester
     *        in the HIT. This value is omitted from the assignment if the Worker has not yet submitted results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withAutoApprovalTime(java.util.Date autoApprovalTime) {
        setAutoApprovalTime(autoApprovalTime);
        return this;
    }

    /**
     * <p>
     * The date and time the Worker accepted the assignment.
     * </p>
     * 
     * @param acceptTime
     *        The date and time the Worker accepted the assignment.
     */

    public void setAcceptTime(java.util.Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    /**
     * <p>
     * The date and time the Worker accepted the assignment.
     * </p>
     * 
     * @return The date and time the Worker accepted the assignment.
     */

    public java.util.Date getAcceptTime() {
        return this.acceptTime;
    }

    /**
     * <p>
     * The date and time the Worker accepted the assignment.
     * </p>
     * 
     * @param acceptTime
     *        The date and time the Worker accepted the assignment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withAcceptTime(java.util.Date acceptTime) {
        setAcceptTime(acceptTime);
        return this;
    }

    /**
     * <p>
     * If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is
     * omitted from the assignment if the Worker has not yet submitted results.
     * </p>
     * 
     * @param submitTime
     *        If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This
     *        value is omitted from the assignment if the Worker has not yet submitted results.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is
     * omitted from the assignment if the Worker has not yet submitted results.
     * </p>
     * 
     * @return If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This
     *         value is omitted from the assignment if the Worker has not yet submitted results.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This value is
     * omitted from the assignment if the Worker has not yet submitted results.
     * </p>
     * 
     * @param submitTime
     *        If the Worker has submitted results, SubmitTime is the date and time the assignment was submitted. This
     *        value is omitted from the assignment if the Worker has not yet submitted results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
        return this;
    }

    /**
     * <p>
     * If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time
     * the Requester approved the results. This value is omitted from the assignment if the Requester has not yet
     * approved the results.
     * </p>
     * 
     * @param approvalTime
     *        If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date
     *        and time the Requester approved the results. This value is omitted from the assignment if the Requester
     *        has not yet approved the results.
     */

    public void setApprovalTime(java.util.Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    /**
     * <p>
     * If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time
     * the Requester approved the results. This value is omitted from the assignment if the Requester has not yet
     * approved the results.
     * </p>
     * 
     * @return If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date
     *         and time the Requester approved the results. This value is omitted from the assignment if the Requester
     *         has not yet approved the results.
     */

    public java.util.Date getApprovalTime() {
        return this.approvalTime;
    }

    /**
     * <p>
     * If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date and time
     * the Requester approved the results. This value is omitted from the assignment if the Requester has not yet
     * approved the results.
     * </p>
     * 
     * @param approvalTime
     *        If the Worker has submitted results and the Requester has approved the results, ApprovalTime is the date
     *        and time the Requester approved the results. This value is omitted from the assignment if the Requester
     *        has not yet approved the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withApprovalTime(java.util.Date approvalTime) {
        setApprovalTime(approvalTime);
        return this;
    }

    /**
     * <p>
     * If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and
     * time the Requester rejected the results.
     * </p>
     * 
     * @param rejectionTime
     *        If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date
     *        and time the Requester rejected the results.
     */

    public void setRejectionTime(java.util.Date rejectionTime) {
        this.rejectionTime = rejectionTime;
    }

    /**
     * <p>
     * If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and
     * time the Requester rejected the results.
     * </p>
     * 
     * @return If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date
     *         and time the Requester rejected the results.
     */

    public java.util.Date getRejectionTime() {
        return this.rejectionTime;
    }

    /**
     * <p>
     * If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date and
     * time the Requester rejected the results.
     * </p>
     * 
     * @param rejectionTime
     *        If the Worker has submitted results and the Requester has rejected the results, RejectionTime is the date
     *        and time the Requester rejected the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withRejectionTime(java.util.Date rejectionTime) {
        setRejectionTime(rejectionTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the deadline for the assignment. This value is derived from the deadline specification for
     * the HIT and the date and time the Worker accepted the HIT.
     * </p>
     * 
     * @param deadline
     *        The date and time of the deadline for the assignment. This value is derived from the deadline
     *        specification for the HIT and the date and time the Worker accepted the HIT.
     */

    public void setDeadline(java.util.Date deadline) {
        this.deadline = deadline;
    }

    /**
     * <p>
     * The date and time of the deadline for the assignment. This value is derived from the deadline specification for
     * the HIT and the date and time the Worker accepted the HIT.
     * </p>
     * 
     * @return The date and time of the deadline for the assignment. This value is derived from the deadline
     *         specification for the HIT and the date and time the Worker accepted the HIT.
     */

    public java.util.Date getDeadline() {
        return this.deadline;
    }

    /**
     * <p>
     * The date and time of the deadline for the assignment. This value is derived from the deadline specification for
     * the HIT and the date and time the Worker accepted the HIT.
     * </p>
     * 
     * @param deadline
     *        The date and time of the deadline for the assignment. This value is derived from the deadline
     *        specification for the HIT and the date and time the Worker accepted the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withDeadline(java.util.Date deadline) {
        setDeadline(deadline);
        return this;
    }

    /**
     * <p>
     * The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an
     * answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer
     * may be empty.
     * </p>
     * 
     * @param answer
     *        The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker
     *        provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers
     *        document, or Answer may be empty.
     */

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * <p>
     * The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an
     * answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer
     * may be empty.
     * </p>
     * 
     * @return The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker
     *         provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers
     *         document, or Answer may be empty.
     */

    public String getAnswer() {
        return this.answer;
    }

    /**
     * <p>
     * The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker provides an
     * answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers document, or Answer
     * may be empty.
     * </p>
     * 
     * @param answer
     *        The Worker's answers submitted for the HIT contained in a QuestionFormAnswers document, if the Worker
     *        provides an answer. If the Worker does not provide any answers, Answer may contain a QuestionFormAnswers
     *        document, or Answer may be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withAnswer(String answer) {
        setAnswer(answer);
        return this;
    }

    /**
     * <p>
     * The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation,
     * if the Requester approved or rejected the assignment and specified feedback.
     * </p>
     * 
     * @param requesterFeedback
     *        The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment
     *        operation, if the Requester approved or rejected the assignment and specified feedback.
     */

    public void setRequesterFeedback(String requesterFeedback) {
        this.requesterFeedback = requesterFeedback;
    }

    /**
     * <p>
     * The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation,
     * if the Requester approved or rejected the assignment and specified feedback.
     * </p>
     * 
     * @return The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment
     *         operation, if the Requester approved or rejected the assignment and specified feedback.
     */

    public String getRequesterFeedback() {
        return this.requesterFeedback;
    }

    /**
     * <p>
     * The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment operation,
     * if the Requester approved or rejected the assignment and specified feedback.
     * </p>
     * 
     * @param requesterFeedback
     *        The feedback string included with the call to the ApproveAssignment operation or the RejectAssignment
     *        operation, if the Requester approved or rejected the assignment and specified feedback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Assignment withRequesterFeedback(String requesterFeedback) {
        setRequesterFeedback(requesterFeedback);
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
        if (getAssignmentId() != null)
            sb.append("AssignmentId: ").append(getAssignmentId()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getHITId() != null)
            sb.append("HITId: ").append(getHITId()).append(",");
        if (getAssignmentStatus() != null)
            sb.append("AssignmentStatus: ").append(getAssignmentStatus()).append(",");
        if (getAutoApprovalTime() != null)
            sb.append("AutoApprovalTime: ").append(getAutoApprovalTime()).append(",");
        if (getAcceptTime() != null)
            sb.append("AcceptTime: ").append(getAcceptTime()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime()).append(",");
        if (getApprovalTime() != null)
            sb.append("ApprovalTime: ").append(getApprovalTime()).append(",");
        if (getRejectionTime() != null)
            sb.append("RejectionTime: ").append(getRejectionTime()).append(",");
        if (getDeadline() != null)
            sb.append("Deadline: ").append(getDeadline()).append(",");
        if (getAnswer() != null)
            sb.append("Answer: ").append(getAnswer()).append(",");
        if (getRequesterFeedback() != null)
            sb.append("RequesterFeedback: ").append(getRequesterFeedback());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Assignment == false)
            return false;
        Assignment other = (Assignment) obj;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getHITId() == null ^ this.getHITId() == null)
            return false;
        if (other.getHITId() != null && other.getHITId().equals(this.getHITId()) == false)
            return false;
        if (other.getAssignmentStatus() == null ^ this.getAssignmentStatus() == null)
            return false;
        if (other.getAssignmentStatus() != null && other.getAssignmentStatus().equals(this.getAssignmentStatus()) == false)
            return false;
        if (other.getAutoApprovalTime() == null ^ this.getAutoApprovalTime() == null)
            return false;
        if (other.getAutoApprovalTime() != null && other.getAutoApprovalTime().equals(this.getAutoApprovalTime()) == false)
            return false;
        if (other.getAcceptTime() == null ^ this.getAcceptTime() == null)
            return false;
        if (other.getAcceptTime() != null && other.getAcceptTime().equals(this.getAcceptTime()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        if (other.getApprovalTime() == null ^ this.getApprovalTime() == null)
            return false;
        if (other.getApprovalTime() != null && other.getApprovalTime().equals(this.getApprovalTime()) == false)
            return false;
        if (other.getRejectionTime() == null ^ this.getRejectionTime() == null)
            return false;
        if (other.getRejectionTime() != null && other.getRejectionTime().equals(this.getRejectionTime()) == false)
            return false;
        if (other.getDeadline() == null ^ this.getDeadline() == null)
            return false;
        if (other.getDeadline() != null && other.getDeadline().equals(this.getDeadline()) == false)
            return false;
        if (other.getAnswer() == null ^ this.getAnswer() == null)
            return false;
        if (other.getAnswer() != null && other.getAnswer().equals(this.getAnswer()) == false)
            return false;
        if (other.getRequesterFeedback() == null ^ this.getRequesterFeedback() == null)
            return false;
        if (other.getRequesterFeedback() != null && other.getRequesterFeedback().equals(this.getRequesterFeedback()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getHITId() == null) ? 0 : getHITId().hashCode());
        hashCode = prime * hashCode + ((getAssignmentStatus() == null) ? 0 : getAssignmentStatus().hashCode());
        hashCode = prime * hashCode + ((getAutoApprovalTime() == null) ? 0 : getAutoApprovalTime().hashCode());
        hashCode = prime * hashCode + ((getAcceptTime() == null) ? 0 : getAcceptTime().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        hashCode = prime * hashCode + ((getApprovalTime() == null) ? 0 : getApprovalTime().hashCode());
        hashCode = prime * hashCode + ((getRejectionTime() == null) ? 0 : getRejectionTime().hashCode());
        hashCode = prime * hashCode + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        hashCode = prime * hashCode + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        hashCode = prime * hashCode + ((getRequesterFeedback() == null) ? 0 : getRequesterFeedback().hashCode());
        return hashCode;
    }

    @Override
    public Assignment clone() {
        try {
            return (Assignment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.AssignmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
