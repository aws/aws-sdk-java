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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/GetFileUploadURL" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFileUploadURLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the assignment that contains the question with a FileUploadAnswer.
     * </p>
     */
    private String assignmentId;
    /**
     * <p>
     * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
     * </p>
     */
    private String questionIdentifier;

    /**
     * <p>
     * The ID of the assignment that contains the question with a FileUploadAnswer.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment that contains the question with a FileUploadAnswer.
     */

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment that contains the question with a FileUploadAnswer.
     * </p>
     * 
     * @return The ID of the assignment that contains the question with a FileUploadAnswer.
     */

    public String getAssignmentId() {
        return this.assignmentId;
    }

    /**
     * <p>
     * The ID of the assignment that contains the question with a FileUploadAnswer.
     * </p>
     * 
     * @param assignmentId
     *        The ID of the assignment that contains the question with a FileUploadAnswer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileUploadURLRequest withAssignmentId(String assignmentId) {
        setAssignmentId(assignmentId);
        return this;
    }

    /**
     * <p>
     * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
     * </p>
     * 
     * @param questionIdentifier
     *        The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
     */

    public void setQuestionIdentifier(String questionIdentifier) {
        this.questionIdentifier = questionIdentifier;
    }

    /**
     * <p>
     * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
     * </p>
     * 
     * @return The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
     */

    public String getQuestionIdentifier() {
        return this.questionIdentifier;
    }

    /**
     * <p>
     * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
     * </p>
     * 
     * @param questionIdentifier
     *        The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFileUploadURLRequest withQuestionIdentifier(String questionIdentifier) {
        setQuestionIdentifier(questionIdentifier);
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
        if (getQuestionIdentifier() != null)
            sb.append("QuestionIdentifier: ").append(getQuestionIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFileUploadURLRequest == false)
            return false;
        GetFileUploadURLRequest other = (GetFileUploadURLRequest) obj;
        if (other.getAssignmentId() == null ^ this.getAssignmentId() == null)
            return false;
        if (other.getAssignmentId() != null && other.getAssignmentId().equals(this.getAssignmentId()) == false)
            return false;
        if (other.getQuestionIdentifier() == null ^ this.getQuestionIdentifier() == null)
            return false;
        if (other.getQuestionIdentifier() != null && other.getQuestionIdentifier().equals(this.getQuestionIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignmentId() == null) ? 0 : getAssignmentId().hashCode());
        hashCode = prime * hashCode + ((getQuestionIdentifier() == null) ? 0 : getQuestionIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetFileUploadURLRequest clone() {
        return (GetFileUploadURLRequest) super.clone();
    }

}
