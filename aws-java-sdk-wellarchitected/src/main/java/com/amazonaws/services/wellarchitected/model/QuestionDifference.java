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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A question difference return object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/QuestionDifference" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuestionDifference implements Serializable, Cloneable, StructuredPojo {

    private String questionId;

    private String questionTitle;
    /**
     * <p>
     * Indicates the type of change to the question.
     * </p>
     */
    private String differenceStatus;

    /**
     * @param questionId
     */

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * @return
     */

    public String getQuestionId() {
        return this.questionId;
    }

    /**
     * @param questionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuestionDifference withQuestionId(String questionId) {
        setQuestionId(questionId);
        return this;
    }

    /**
     * @param questionTitle
     */

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    /**
     * @return
     */

    public String getQuestionTitle() {
        return this.questionTitle;
    }

    /**
     * @param questionTitle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuestionDifference withQuestionTitle(String questionTitle) {
        setQuestionTitle(questionTitle);
        return this;
    }

    /**
     * <p>
     * Indicates the type of change to the question.
     * </p>
     * 
     * @param differenceStatus
     *        Indicates the type of change to the question.
     * @see DifferenceStatus
     */

    public void setDifferenceStatus(String differenceStatus) {
        this.differenceStatus = differenceStatus;
    }

    /**
     * <p>
     * Indicates the type of change to the question.
     * </p>
     * 
     * @return Indicates the type of change to the question.
     * @see DifferenceStatus
     */

    public String getDifferenceStatus() {
        return this.differenceStatus;
    }

    /**
     * <p>
     * Indicates the type of change to the question.
     * </p>
     * 
     * @param differenceStatus
     *        Indicates the type of change to the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceStatus
     */

    public QuestionDifference withDifferenceStatus(String differenceStatus) {
        setDifferenceStatus(differenceStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the type of change to the question.
     * </p>
     * 
     * @param differenceStatus
     *        Indicates the type of change to the question.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DifferenceStatus
     */

    public QuestionDifference withDifferenceStatus(DifferenceStatus differenceStatus) {
        this.differenceStatus = differenceStatus.toString();
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
        if (getQuestionId() != null)
            sb.append("QuestionId: ").append(getQuestionId()).append(",");
        if (getQuestionTitle() != null)
            sb.append("QuestionTitle: ").append(getQuestionTitle()).append(",");
        if (getDifferenceStatus() != null)
            sb.append("DifferenceStatus: ").append(getDifferenceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuestionDifference == false)
            return false;
        QuestionDifference other = (QuestionDifference) obj;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getQuestionTitle() == null ^ this.getQuestionTitle() == null)
            return false;
        if (other.getQuestionTitle() != null && other.getQuestionTitle().equals(this.getQuestionTitle()) == false)
            return false;
        if (other.getDifferenceStatus() == null ^ this.getDifferenceStatus() == null)
            return false;
        if (other.getDifferenceStatus() != null && other.getDifferenceStatus().equals(this.getDifferenceStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getQuestionTitle() == null) ? 0 : getQuestionTitle().hashCode());
        hashCode = prime * hashCode + ((getDifferenceStatus() == null) ? 0 : getDifferenceStatus().hashCode());
        return hashCode;
    }

    @Override
    public QuestionDifference clone() {
        try {
            return (QuestionDifference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.QuestionDifferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
