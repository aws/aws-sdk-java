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
 * A profile template question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ProfileTemplateQuestion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileTemplateQuestion implements Serializable, Cloneable, StructuredPojo {

    private String questionId;

    private String questionTitle;

    private String questionDescription;
    /**
     * <p>
     * The question choices.
     * </p>
     */
    private java.util.List<ProfileTemplateChoice> questionChoices;
    /**
     * <p>
     * The minimum number of choices selected.
     * </p>
     */
    private Integer minSelectedChoices;
    /**
     * <p>
     * The maximum number of choices selected.
     * </p>
     */
    private Integer maxSelectedChoices;

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

    public ProfileTemplateQuestion withQuestionId(String questionId) {
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

    public ProfileTemplateQuestion withQuestionTitle(String questionTitle) {
        setQuestionTitle(questionTitle);
        return this;
    }

    /**
     * @param questionDescription
     */

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    /**
     * @return
     */

    public String getQuestionDescription() {
        return this.questionDescription;
    }

    /**
     * @param questionDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplateQuestion withQuestionDescription(String questionDescription) {
        setQuestionDescription(questionDescription);
        return this;
    }

    /**
     * <p>
     * The question choices.
     * </p>
     * 
     * @return The question choices.
     */

    public java.util.List<ProfileTemplateChoice> getQuestionChoices() {
        return questionChoices;
    }

    /**
     * <p>
     * The question choices.
     * </p>
     * 
     * @param questionChoices
     *        The question choices.
     */

    public void setQuestionChoices(java.util.Collection<ProfileTemplateChoice> questionChoices) {
        if (questionChoices == null) {
            this.questionChoices = null;
            return;
        }

        this.questionChoices = new java.util.ArrayList<ProfileTemplateChoice>(questionChoices);
    }

    /**
     * <p>
     * The question choices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQuestionChoices(java.util.Collection)} or {@link #withQuestionChoices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param questionChoices
     *        The question choices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplateQuestion withQuestionChoices(ProfileTemplateChoice... questionChoices) {
        if (this.questionChoices == null) {
            setQuestionChoices(new java.util.ArrayList<ProfileTemplateChoice>(questionChoices.length));
        }
        for (ProfileTemplateChoice ele : questionChoices) {
            this.questionChoices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The question choices.
     * </p>
     * 
     * @param questionChoices
     *        The question choices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplateQuestion withQuestionChoices(java.util.Collection<ProfileTemplateChoice> questionChoices) {
        setQuestionChoices(questionChoices);
        return this;
    }

    /**
     * <p>
     * The minimum number of choices selected.
     * </p>
     * 
     * @param minSelectedChoices
     *        The minimum number of choices selected.
     */

    public void setMinSelectedChoices(Integer minSelectedChoices) {
        this.minSelectedChoices = minSelectedChoices;
    }

    /**
     * <p>
     * The minimum number of choices selected.
     * </p>
     * 
     * @return The minimum number of choices selected.
     */

    public Integer getMinSelectedChoices() {
        return this.minSelectedChoices;
    }

    /**
     * <p>
     * The minimum number of choices selected.
     * </p>
     * 
     * @param minSelectedChoices
     *        The minimum number of choices selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplateQuestion withMinSelectedChoices(Integer minSelectedChoices) {
        setMinSelectedChoices(minSelectedChoices);
        return this;
    }

    /**
     * <p>
     * The maximum number of choices selected.
     * </p>
     * 
     * @param maxSelectedChoices
     *        The maximum number of choices selected.
     */

    public void setMaxSelectedChoices(Integer maxSelectedChoices) {
        this.maxSelectedChoices = maxSelectedChoices;
    }

    /**
     * <p>
     * The maximum number of choices selected.
     * </p>
     * 
     * @return The maximum number of choices selected.
     */

    public Integer getMaxSelectedChoices() {
        return this.maxSelectedChoices;
    }

    /**
     * <p>
     * The maximum number of choices selected.
     * </p>
     * 
     * @param maxSelectedChoices
     *        The maximum number of choices selected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileTemplateQuestion withMaxSelectedChoices(Integer maxSelectedChoices) {
        setMaxSelectedChoices(maxSelectedChoices);
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
        if (getQuestionDescription() != null)
            sb.append("QuestionDescription: ").append(getQuestionDescription()).append(",");
        if (getQuestionChoices() != null)
            sb.append("QuestionChoices: ").append(getQuestionChoices()).append(",");
        if (getMinSelectedChoices() != null)
            sb.append("MinSelectedChoices: ").append(getMinSelectedChoices()).append(",");
        if (getMaxSelectedChoices() != null)
            sb.append("MaxSelectedChoices: ").append(getMaxSelectedChoices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileTemplateQuestion == false)
            return false;
        ProfileTemplateQuestion other = (ProfileTemplateQuestion) obj;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getQuestionTitle() == null ^ this.getQuestionTitle() == null)
            return false;
        if (other.getQuestionTitle() != null && other.getQuestionTitle().equals(this.getQuestionTitle()) == false)
            return false;
        if (other.getQuestionDescription() == null ^ this.getQuestionDescription() == null)
            return false;
        if (other.getQuestionDescription() != null && other.getQuestionDescription().equals(this.getQuestionDescription()) == false)
            return false;
        if (other.getQuestionChoices() == null ^ this.getQuestionChoices() == null)
            return false;
        if (other.getQuestionChoices() != null && other.getQuestionChoices().equals(this.getQuestionChoices()) == false)
            return false;
        if (other.getMinSelectedChoices() == null ^ this.getMinSelectedChoices() == null)
            return false;
        if (other.getMinSelectedChoices() != null && other.getMinSelectedChoices().equals(this.getMinSelectedChoices()) == false)
            return false;
        if (other.getMaxSelectedChoices() == null ^ this.getMaxSelectedChoices() == null)
            return false;
        if (other.getMaxSelectedChoices() != null && other.getMaxSelectedChoices().equals(this.getMaxSelectedChoices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getQuestionTitle() == null) ? 0 : getQuestionTitle().hashCode());
        hashCode = prime * hashCode + ((getQuestionDescription() == null) ? 0 : getQuestionDescription().hashCode());
        hashCode = prime * hashCode + ((getQuestionChoices() == null) ? 0 : getQuestionChoices().hashCode());
        hashCode = prime * hashCode + ((getMinSelectedChoices() == null) ? 0 : getMinSelectedChoices().hashCode());
        hashCode = prime * hashCode + ((getMaxSelectedChoices() == null) ? 0 : getMaxSelectedChoices().hashCode());
        return hashCode;
    }

    @Override
    public ProfileTemplateQuestion clone() {
        try {
            return (ProfileTemplateQuestion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ProfileTemplateQuestionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
