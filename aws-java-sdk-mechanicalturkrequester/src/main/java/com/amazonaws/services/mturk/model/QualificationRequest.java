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
 * The QualificationRequest data structure represents a request a Worker has made for a Qualification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/QualificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QualificationRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Qualification request, a unique identifier generated when the request was submitted.
     * </p>
     */
    private String qualificationRequestId;
    /**
     * <p>
     * The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation.
     * </p>
     */
    private String qualificationTypeId;
    /**
     * <p>
     * The ID of the Worker requesting the Qualification.
     * </p>
     */
    private String workerId;
    /**
     * <p>
     * The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker
     * has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the
     * time the Worker requests the Qualification.
     * </p>
     */
    private String test;
    /**
     * <p>
     * The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type
     * has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty.
     * </p>
     */
    private String answer;
    /**
     * <p>
     * The date and time the Qualification request had a status of Submitted. This is either the time the Worker
     * submitted answers for a Qualification test, or the time the Worker requested the Qualification if the
     * Qualification type does not have a test.
     * </p>
     */
    private java.util.Date submitTime;

    /**
     * <p>
     * The ID of the Qualification request, a unique identifier generated when the request was submitted.
     * </p>
     * 
     * @param qualificationRequestId
     *        The ID of the Qualification request, a unique identifier generated when the request was submitted.
     */

    public void setQualificationRequestId(String qualificationRequestId) {
        this.qualificationRequestId = qualificationRequestId;
    }

    /**
     * <p>
     * The ID of the Qualification request, a unique identifier generated when the request was submitted.
     * </p>
     * 
     * @return The ID of the Qualification request, a unique identifier generated when the request was submitted.
     */

    public String getQualificationRequestId() {
        return this.qualificationRequestId;
    }

    /**
     * <p>
     * The ID of the Qualification request, a unique identifier generated when the request was submitted.
     * </p>
     * 
     * @param qualificationRequestId
     *        The ID of the Qualification request, a unique identifier generated when the request was submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequest withQualificationRequestId(String qualificationRequestId) {
        setQualificationRequestId(qualificationRequestId);
        return this;
    }

    /**
     * <p>
     * The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType
     *        operation.
     */

    public void setQualificationTypeId(String qualificationTypeId) {
        this.qualificationTypeId = qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation.
     * </p>
     * 
     * @return The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType
     *         operation.
     */

    public String getQualificationTypeId() {
        return this.qualificationTypeId;
    }

    /**
     * <p>
     * The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation.
     * </p>
     * 
     * @param qualificationTypeId
     *        The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequest withQualificationTypeId(String qualificationTypeId) {
        setQualificationTypeId(qualificationTypeId);
        return this;
    }

    /**
     * <p>
     * The ID of the Worker requesting the Qualification.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker requesting the Qualification.
     */

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * <p>
     * The ID of the Worker requesting the Qualification.
     * </p>
     * 
     * @return The ID of the Worker requesting the Qualification.
     */

    public String getWorkerId() {
        return this.workerId;
    }

    /**
     * <p>
     * The ID of the Worker requesting the Qualification.
     * </p>
     * 
     * @param workerId
     *        The ID of the Worker requesting the Qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequest withWorkerId(String workerId) {
        setWorkerId(workerId);
        return this;
    }

    /**
     * <p>
     * The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker
     * has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the
     * time the Worker requests the Qualification.
     * </p>
     * 
     * @param test
     *        The contents of the Qualification test that was presented to the Worker, if the type has a test and the
     *        Worker has submitted answers. This value is identical to the QuestionForm associated with the
     *        Qualification type at the time the Worker requests the Qualification.
     */

    public void setTest(String test) {
        this.test = test;
    }

    /**
     * <p>
     * The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker
     * has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the
     * time the Worker requests the Qualification.
     * </p>
     * 
     * @return The contents of the Qualification test that was presented to the Worker, if the type has a test and the
     *         Worker has submitted answers. This value is identical to the QuestionForm associated with the
     *         Qualification type at the time the Worker requests the Qualification.
     */

    public String getTest() {
        return this.test;
    }

    /**
     * <p>
     * The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker
     * has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the
     * time the Worker requests the Qualification.
     * </p>
     * 
     * @param test
     *        The contents of the Qualification test that was presented to the Worker, if the type has a test and the
     *        Worker has submitted answers. This value is identical to the QuestionForm associated with the
     *        Qualification type at the time the Worker requests the Qualification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequest withTest(String test) {
        setTest(test);
        return this;
    }

    /**
     * <p>
     * The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type
     * has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty.
     * </p>
     * 
     * @param answer
     *        The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the
     *        type has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer
     *        may be empty.
     */

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * <p>
     * The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type
     * has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty.
     * </p>
     * 
     * @return The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if
     *         the type has a test and the Worker has submitted answers. If the Worker does not provide any answers,
     *         Answer may be empty.
     */

    public String getAnswer() {
        return this.answer;
    }

    /**
     * <p>
     * The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type
     * has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty.
     * </p>
     * 
     * @param answer
     *        The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the
     *        type has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer
     *        may be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequest withAnswer(String answer) {
        setAnswer(answer);
        return this;
    }

    /**
     * <p>
     * The date and time the Qualification request had a status of Submitted. This is either the time the Worker
     * submitted answers for a Qualification test, or the time the Worker requested the Qualification if the
     * Qualification type does not have a test.
     * </p>
     * 
     * @param submitTime
     *        The date and time the Qualification request had a status of Submitted. This is either the time the Worker
     *        submitted answers for a Qualification test, or the time the Worker requested the Qualification if the
     *        Qualification type does not have a test.
     */

    public void setSubmitTime(java.util.Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * <p>
     * The date and time the Qualification request had a status of Submitted. This is either the time the Worker
     * submitted answers for a Qualification test, or the time the Worker requested the Qualification if the
     * Qualification type does not have a test.
     * </p>
     * 
     * @return The date and time the Qualification request had a status of Submitted. This is either the time the Worker
     *         submitted answers for a Qualification test, or the time the Worker requested the Qualification if the
     *         Qualification type does not have a test.
     */

    public java.util.Date getSubmitTime() {
        return this.submitTime;
    }

    /**
     * <p>
     * The date and time the Qualification request had a status of Submitted. This is either the time the Worker
     * submitted answers for a Qualification test, or the time the Worker requested the Qualification if the
     * Qualification type does not have a test.
     * </p>
     * 
     * @param submitTime
     *        The date and time the Qualification request had a status of Submitted. This is either the time the Worker
     *        submitted answers for a Qualification test, or the time the Worker requested the Qualification if the
     *        Qualification type does not have a test.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QualificationRequest withSubmitTime(java.util.Date submitTime) {
        setSubmitTime(submitTime);
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
        if (getQualificationRequestId() != null)
            sb.append("QualificationRequestId: ").append(getQualificationRequestId()).append(",");
        if (getQualificationTypeId() != null)
            sb.append("QualificationTypeId: ").append(getQualificationTypeId()).append(",");
        if (getWorkerId() != null)
            sb.append("WorkerId: ").append(getWorkerId()).append(",");
        if (getTest() != null)
            sb.append("Test: ").append(getTest()).append(",");
        if (getAnswer() != null)
            sb.append("Answer: ").append(getAnswer()).append(",");
        if (getSubmitTime() != null)
            sb.append("SubmitTime: ").append(getSubmitTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QualificationRequest == false)
            return false;
        QualificationRequest other = (QualificationRequest) obj;
        if (other.getQualificationRequestId() == null ^ this.getQualificationRequestId() == null)
            return false;
        if (other.getQualificationRequestId() != null && other.getQualificationRequestId().equals(this.getQualificationRequestId()) == false)
            return false;
        if (other.getQualificationTypeId() == null ^ this.getQualificationTypeId() == null)
            return false;
        if (other.getQualificationTypeId() != null && other.getQualificationTypeId().equals(this.getQualificationTypeId()) == false)
            return false;
        if (other.getWorkerId() == null ^ this.getWorkerId() == null)
            return false;
        if (other.getWorkerId() != null && other.getWorkerId().equals(this.getWorkerId()) == false)
            return false;
        if (other.getTest() == null ^ this.getTest() == null)
            return false;
        if (other.getTest() != null && other.getTest().equals(this.getTest()) == false)
            return false;
        if (other.getAnswer() == null ^ this.getAnswer() == null)
            return false;
        if (other.getAnswer() != null && other.getAnswer().equals(this.getAnswer()) == false)
            return false;
        if (other.getSubmitTime() == null ^ this.getSubmitTime() == null)
            return false;
        if (other.getSubmitTime() != null && other.getSubmitTime().equals(this.getSubmitTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationRequestId() == null) ? 0 : getQualificationRequestId().hashCode());
        hashCode = prime * hashCode + ((getQualificationTypeId() == null) ? 0 : getQualificationTypeId().hashCode());
        hashCode = prime * hashCode + ((getWorkerId() == null) ? 0 : getWorkerId().hashCode());
        hashCode = prime * hashCode + ((getTest() == null) ? 0 : getTest().hashCode());
        hashCode = prime * hashCode + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        hashCode = prime * hashCode + ((getSubmitTime() == null) ? 0 : getSubmitTime().hashCode());
        return hashCode;
    }

    @Override
    public QualificationRequest clone() {
        try {
            return (QualificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.QualificationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
