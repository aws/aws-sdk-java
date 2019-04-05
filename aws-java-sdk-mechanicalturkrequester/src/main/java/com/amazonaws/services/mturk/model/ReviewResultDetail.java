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
 * This data structure is returned multiple times for each result specified in the Review Policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/ReviewResultDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewResultDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier of the Review action result.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit
     * results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit
     * results about the Assignment itself.
     * </p>
     */
    private String subjectId;
    /**
     * <p>
     * The type of the object from the SubjectId field.
     * </p>
     */
    private String subjectType;
    /**
     * <p>
     * Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment
     * this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result
     * describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is
     * absent, then the result describes the Worker's performance on the HIT.
     * </p>
     */
    private String questionId;
    /**
     * <p>
     * Key identifies the particular piece of reviewed information.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The values of Key provided by the review policies you have selected.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A unique identifier of the Review action result.
     * </p>
     * 
     * @param actionId
     *        A unique identifier of the Review action result.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * A unique identifier of the Review action result.
     * </p>
     * 
     * @return A unique identifier of the Review action result.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * A unique identifier of the Review action result.
     * </p>
     * 
     * @param actionId
     *        A unique identifier of the Review action result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewResultDetail withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit
     * results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit
     * results about the Assignment itself.
     * </p>
     * 
     * @param subjectId
     *        The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will
     *        often emit results about both the HIT itself and its Assignments, while Assignment-level review policies
     *        generally only emit results about the Assignment itself.
     */

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <p>
     * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit
     * results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit
     * results about the Assignment itself.
     * </p>
     * 
     * @return The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will
     *         often emit results about both the HIT itself and its Assignments, while Assignment-level review policies
     *         generally only emit results about the Assignment itself.
     */

    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * <p>
     * The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will often emit
     * results about both the HIT itself and its Assignments, while Assignment-level review policies generally only emit
     * results about the Assignment itself.
     * </p>
     * 
     * @param subjectId
     *        The HITID or AssignmentId about which this result was taken. Note that HIT-level Review Policies will
     *        often emit results about both the HIT itself and its Assignments, while Assignment-level review policies
     *        generally only emit results about the Assignment itself.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewResultDetail withSubjectId(String subjectId) {
        setSubjectId(subjectId);
        return this;
    }

    /**
     * <p>
     * The type of the object from the SubjectId field.
     * </p>
     * 
     * @param subjectType
     *        The type of the object from the SubjectId field.
     */

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    /**
     * <p>
     * The type of the object from the SubjectId field.
     * </p>
     * 
     * @return The type of the object from the SubjectId field.
     */

    public String getSubjectType() {
        return this.subjectType;
    }

    /**
     * <p>
     * The type of the object from the SubjectId field.
     * </p>
     * 
     * @param subjectType
     *        The type of the object from the SubjectId field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewResultDetail withSubjectType(String subjectType) {
        setSubjectType(subjectType);
        return this;
    }

    /**
     * <p>
     * Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment
     * this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result
     * describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is
     * absent, then the result describes the Worker's performance on the HIT.
     * </p>
     * 
     * @param questionId
     *        Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or
     *        Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then
     *        the result describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment
     *        and QuestionId is absent, then the result describes the Worker's performance on the HIT.
     */

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * <p>
     * Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment
     * this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result
     * describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is
     * absent, then the result describes the Worker's performance on the HIT.
     * </p>
     * 
     * @return Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or
     *         Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent,
     *         then the result describes results of the HIT, including the HIT agreement score. If ObjectType is
     *         Assignment and QuestionId is absent, then the result describes the Worker's performance on the HIT.
     */

    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * <p>
     * Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or Assignment
     * this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then the result
     * describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment and QuestionId is
     * absent, then the result describes the Worker's performance on the HIT.
     * </p>
     * 
     * @param questionId
     *        Specifies the QuestionId the result is describing. Depending on whether the TargetType is a HIT or
     *        Assignment this results could specify multiple values. If TargetType is HIT and QuestionId is absent, then
     *        the result describes results of the HIT, including the HIT agreement score. If ObjectType is Assignment
     *        and QuestionId is absent, then the result describes the Worker's performance on the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewResultDetail withQuestionId(String questionId) {
        setQuestionId(questionId);
        return this;
    }

    /**
     * <p>
     * Key identifies the particular piece of reviewed information.
     * </p>
     * 
     * @param key
     *        Key identifies the particular piece of reviewed information.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Key identifies the particular piece of reviewed information.
     * </p>
     * 
     * @return Key identifies the particular piece of reviewed information.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * Key identifies the particular piece of reviewed information.
     * </p>
     * 
     * @param key
     *        Key identifies the particular piece of reviewed information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewResultDetail withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The values of Key provided by the review policies you have selected.
     * </p>
     * 
     * @param value
     *        The values of Key provided by the review policies you have selected.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The values of Key provided by the review policies you have selected.
     * </p>
     * 
     * @return The values of Key provided by the review policies you have selected.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The values of Key provided by the review policies you have selected.
     * </p>
     * 
     * @param value
     *        The values of Key provided by the review policies you have selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewResultDetail withValue(String value) {
        setValue(value);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getSubjectId() != null)
            sb.append("SubjectId: ").append(getSubjectId()).append(",");
        if (getSubjectType() != null)
            sb.append("SubjectType: ").append(getSubjectType()).append(",");
        if (getQuestionId() != null)
            sb.append("QuestionId: ").append(getQuestionId()).append(",");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewResultDetail == false)
            return false;
        ReviewResultDetail other = (ReviewResultDetail) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getSubjectId() == null ^ this.getSubjectId() == null)
            return false;
        if (other.getSubjectId() != null && other.getSubjectId().equals(this.getSubjectId()) == false)
            return false;
        if (other.getSubjectType() == null ^ this.getSubjectType() == null)
            return false;
        if (other.getSubjectType() != null && other.getSubjectType().equals(this.getSubjectType()) == false)
            return false;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        hashCode = prime * hashCode + ((getSubjectType() == null) ? 0 : getSubjectType().hashCode());
        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ReviewResultDetail clone() {
        try {
            return (ReviewResultDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.ReviewResultDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
