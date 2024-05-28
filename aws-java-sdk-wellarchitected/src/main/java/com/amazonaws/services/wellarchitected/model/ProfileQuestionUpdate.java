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
 * An update to a profile question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ProfileQuestionUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProfileQuestionUpdate implements Serializable, Cloneable, StructuredPojo {

    private String questionId;
    /**
     * <p>
     * The selected choices.
     * </p>
     */
    private java.util.List<String> selectedChoiceIds;

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

    public ProfileQuestionUpdate withQuestionId(String questionId) {
        setQuestionId(questionId);
        return this;
    }

    /**
     * <p>
     * The selected choices.
     * </p>
     * 
     * @return The selected choices.
     */

    public java.util.List<String> getSelectedChoiceIds() {
        return selectedChoiceIds;
    }

    /**
     * <p>
     * The selected choices.
     * </p>
     * 
     * @param selectedChoiceIds
     *        The selected choices.
     */

    public void setSelectedChoiceIds(java.util.Collection<String> selectedChoiceIds) {
        if (selectedChoiceIds == null) {
            this.selectedChoiceIds = null;
            return;
        }

        this.selectedChoiceIds = new java.util.ArrayList<String>(selectedChoiceIds);
    }

    /**
     * <p>
     * The selected choices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedChoiceIds(java.util.Collection)} or {@link #withSelectedChoiceIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param selectedChoiceIds
     *        The selected choices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileQuestionUpdate withSelectedChoiceIds(String... selectedChoiceIds) {
        if (this.selectedChoiceIds == null) {
            setSelectedChoiceIds(new java.util.ArrayList<String>(selectedChoiceIds.length));
        }
        for (String ele : selectedChoiceIds) {
            this.selectedChoiceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The selected choices.
     * </p>
     * 
     * @param selectedChoiceIds
     *        The selected choices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProfileQuestionUpdate withSelectedChoiceIds(java.util.Collection<String> selectedChoiceIds) {
        setSelectedChoiceIds(selectedChoiceIds);
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
        if (getSelectedChoiceIds() != null)
            sb.append("SelectedChoiceIds: ").append(getSelectedChoiceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProfileQuestionUpdate == false)
            return false;
        ProfileQuestionUpdate other = (ProfileQuestionUpdate) obj;
        if (other.getQuestionId() == null ^ this.getQuestionId() == null)
            return false;
        if (other.getQuestionId() != null && other.getQuestionId().equals(this.getQuestionId()) == false)
            return false;
        if (other.getSelectedChoiceIds() == null ^ this.getSelectedChoiceIds() == null)
            return false;
        if (other.getSelectedChoiceIds() != null && other.getSelectedChoiceIds().equals(this.getSelectedChoiceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        hashCode = prime * hashCode + ((getSelectedChoiceIds() == null) ? 0 : getSelectedChoiceIds().hashCode());
        return hashCode;
    }

    @Override
    public ProfileQuestionUpdate clone() {
        try {
            return (ProfileQuestionUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ProfileQuestionUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
