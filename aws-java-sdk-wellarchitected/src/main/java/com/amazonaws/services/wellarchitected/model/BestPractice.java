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
 * A best practice, or question choice, that has been identified as a risk in this question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/BestPractice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BestPractice implements Serializable, Cloneable, StructuredPojo {

    private String choiceId;

    private String choiceTitle;

    /**
     * @param choiceId
     */

    public void setChoiceId(String choiceId) {
        this.choiceId = choiceId;
    }

    /**
     * @return
     */

    public String getChoiceId() {
        return this.choiceId;
    }

    /**
     * @param choiceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BestPractice withChoiceId(String choiceId) {
        setChoiceId(choiceId);
        return this;
    }

    /**
     * @param choiceTitle
     */

    public void setChoiceTitle(String choiceTitle) {
        this.choiceTitle = choiceTitle;
    }

    /**
     * @return
     */

    public String getChoiceTitle() {
        return this.choiceTitle;
    }

    /**
     * @param choiceTitle
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BestPractice withChoiceTitle(String choiceTitle) {
        setChoiceTitle(choiceTitle);
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
        if (getChoiceId() != null)
            sb.append("ChoiceId: ").append(getChoiceId()).append(",");
        if (getChoiceTitle() != null)
            sb.append("ChoiceTitle: ").append(getChoiceTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BestPractice == false)
            return false;
        BestPractice other = (BestPractice) obj;
        if (other.getChoiceId() == null ^ this.getChoiceId() == null)
            return false;
        if (other.getChoiceId() != null && other.getChoiceId().equals(this.getChoiceId()) == false)
            return false;
        if (other.getChoiceTitle() == null ^ this.getChoiceTitle() == null)
            return false;
        if (other.getChoiceTitle() != null && other.getChoiceTitle().equals(this.getChoiceTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChoiceId() == null) ? 0 : getChoiceId().hashCode());
        hashCode = prime * hashCode + ((getChoiceTitle() == null) ? 0 : getChoiceTitle().hashCode());
        return hashCode;
    }

    @Override
    public BestPractice clone() {
        try {
            return (BestPractice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.BestPracticeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
