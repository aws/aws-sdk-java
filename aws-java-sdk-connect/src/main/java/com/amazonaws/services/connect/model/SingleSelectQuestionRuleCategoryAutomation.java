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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the automation option based on a rule category for a single select question.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/SingleSelectQuestionRuleCategoryAutomation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SingleSelectQuestionRuleCategoryAutomation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the option is
     * applied when the contact data includes the category. Similarly, if the condition is <code>NOT_PRESENT</code>,
     * then the option is applied when the contact data does not include the category.
     * </p>
     */
    private String condition;
    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     */
    private String optionRefId;

    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     * 
     * @param category
     *        The category name, as defined in Rules.
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     * 
     * @return The category name, as defined in Rules.
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category name, as defined in Rules.
     * </p>
     * 
     * @param category
     *        The category name, as defined in Rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleSelectQuestionRuleCategoryAutomation withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the option is
     * applied when the contact data includes the category. Similarly, if the condition is <code>NOT_PRESENT</code>,
     * then the option is applied when the contact data does not include the category.
     * </p>
     * 
     * @param condition
     *        The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the
     *        option is applied when the contact data includes the category. Similarly, if the condition is
     *        <code>NOT_PRESENT</code>, then the option is applied when the contact data does not include the category.
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the option is
     * applied when the contact data includes the category. Similarly, if the condition is <code>NOT_PRESENT</code>,
     * then the option is applied when the contact data does not include the category.
     * </p>
     * 
     * @return The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the
     *         option is applied when the contact data includes the category. Similarly, if the condition is
     *         <code>NOT_PRESENT</code>, then the option is applied when the contact data does not include the category.
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the option is
     * applied when the contact data includes the category. Similarly, if the condition is <code>NOT_PRESENT</code>,
     * then the option is applied when the contact data does not include the category.
     * </p>
     * 
     * @param condition
     *        The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the
     *        option is applied when the contact data includes the category. Similarly, if the condition is
     *        <code>NOT_PRESENT</code>, then the option is applied when the contact data does not include the category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */

    public SingleSelectQuestionRuleCategoryAutomation withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the option is
     * applied when the contact data includes the category. Similarly, if the condition is <code>NOT_PRESENT</code>,
     * then the option is applied when the contact data does not include the category.
     * </p>
     * 
     * @param condition
     *        The condition to apply for the automation option. If the condition is <code>PRESENT</code>, then the
     *        option is applied when the contact data includes the category. Similarly, if the condition is
     *        <code>NOT_PRESENT</code>, then the option is applied when the contact data does not include the category.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SingleSelectQuestionRuleCategoryAutomationCondition
     */

    public SingleSelectQuestionRuleCategoryAutomation withCondition(SingleSelectQuestionRuleCategoryAutomationCondition condition) {
        this.condition = condition.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     * 
     * @param optionRefId
     *        The identifier of the answer option.
     */

    public void setOptionRefId(String optionRefId) {
        this.optionRefId = optionRefId;
    }

    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     * 
     * @return The identifier of the answer option.
     */

    public String getOptionRefId() {
        return this.optionRefId;
    }

    /**
     * <p>
     * The identifier of the answer option.
     * </p>
     * 
     * @param optionRefId
     *        The identifier of the answer option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SingleSelectQuestionRuleCategoryAutomation withOptionRefId(String optionRefId) {
        setOptionRefId(optionRefId);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getOptionRefId() != null)
            sb.append("OptionRefId: ").append(getOptionRefId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleSelectQuestionRuleCategoryAutomation == false)
            return false;
        SingleSelectQuestionRuleCategoryAutomation other = (SingleSelectQuestionRuleCategoryAutomation) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getOptionRefId() == null ^ this.getOptionRefId() == null)
            return false;
        if (other.getOptionRefId() != null && other.getOptionRefId().equals(this.getOptionRefId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getOptionRefId() == null) ? 0 : getOptionRefId().hashCode());
        return hashCode;
    }

    @Override
    public SingleSelectQuestionRuleCategoryAutomation clone() {
        try {
            return (SingleSelectQuestionRuleCategoryAutomation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.SingleSelectQuestionRuleCategoryAutomationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
