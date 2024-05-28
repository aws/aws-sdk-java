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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The options for customizing a security control parameter that is a list of strings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StringListConfigurationOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StringListConfigurationOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of strings.
     * </p>
     */
    private java.util.List<String> defaultValue;
    /**
     * <p>
     * An RE2 regular expression that Security Hub uses to validate a user-provided list of strings for a control
     * parameter.
     * </p>
     */
    private String re2Expression;
    /**
     * <p>
     * The maximum number of list items that a string list control parameter can accept.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The description of the RE2 regular expression.
     * </p>
     */
    private String expressionDescription;

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of strings.
     * </p>
     * 
     * @return The Security Hub default value for a control parameter that is a list of strings.
     */

    public java.util.List<String> getDefaultValue() {
        return defaultValue;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of strings.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of strings.
     */

    public void setDefaultValue(java.util.Collection<String> defaultValue) {
        if (defaultValue == null) {
            this.defaultValue = null;
            return;
        }

        this.defaultValue = new java.util.ArrayList<String>(defaultValue);
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultValue(java.util.Collection)} or {@link #withDefaultValue(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringListConfigurationOptions withDefaultValue(String... defaultValue) {
        if (this.defaultValue == null) {
            setDefaultValue(new java.util.ArrayList<String>(defaultValue.length));
        }
        for (String ele : defaultValue) {
            this.defaultValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Security Hub default value for a control parameter that is a list of strings.
     * </p>
     * 
     * @param defaultValue
     *        The Security Hub default value for a control parameter that is a list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringListConfigurationOptions withDefaultValue(java.util.Collection<String> defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * An RE2 regular expression that Security Hub uses to validate a user-provided list of strings for a control
     * parameter.
     * </p>
     * 
     * @param re2Expression
     *        An RE2 regular expression that Security Hub uses to validate a user-provided list of strings for a control
     *        parameter.
     */

    public void setRe2Expression(String re2Expression) {
        this.re2Expression = re2Expression;
    }

    /**
     * <p>
     * An RE2 regular expression that Security Hub uses to validate a user-provided list of strings for a control
     * parameter.
     * </p>
     * 
     * @return An RE2 regular expression that Security Hub uses to validate a user-provided list of strings for a
     *         control parameter.
     */

    public String getRe2Expression() {
        return this.re2Expression;
    }

    /**
     * <p>
     * An RE2 regular expression that Security Hub uses to validate a user-provided list of strings for a control
     * parameter.
     * </p>
     * 
     * @param re2Expression
     *        An RE2 regular expression that Security Hub uses to validate a user-provided list of strings for a control
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringListConfigurationOptions withRe2Expression(String re2Expression) {
        setRe2Expression(re2Expression);
        return this;
    }

    /**
     * <p>
     * The maximum number of list items that a string list control parameter can accept.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of list items that a string list control parameter can accept.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of list items that a string list control parameter can accept.
     * </p>
     * 
     * @return The maximum number of list items that a string list control parameter can accept.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of list items that a string list control parameter can accept.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of list items that a string list control parameter can accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringListConfigurationOptions withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The description of the RE2 regular expression.
     * </p>
     * 
     * @param expressionDescription
     *        The description of the RE2 regular expression.
     */

    public void setExpressionDescription(String expressionDescription) {
        this.expressionDescription = expressionDescription;
    }

    /**
     * <p>
     * The description of the RE2 regular expression.
     * </p>
     * 
     * @return The description of the RE2 regular expression.
     */

    public String getExpressionDescription() {
        return this.expressionDescription;
    }

    /**
     * <p>
     * The description of the RE2 regular expression.
     * </p>
     * 
     * @param expressionDescription
     *        The description of the RE2 regular expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StringListConfigurationOptions withExpressionDescription(String expressionDescription) {
        setExpressionDescription(expressionDescription);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getRe2Expression() != null)
            sb.append("Re2Expression: ").append(getRe2Expression()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getExpressionDescription() != null)
            sb.append("ExpressionDescription: ").append(getExpressionDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StringListConfigurationOptions == false)
            return false;
        StringListConfigurationOptions other = (StringListConfigurationOptions) obj;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getRe2Expression() == null ^ this.getRe2Expression() == null)
            return false;
        if (other.getRe2Expression() != null && other.getRe2Expression().equals(this.getRe2Expression()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getExpressionDescription() == null ^ this.getExpressionDescription() == null)
            return false;
        if (other.getExpressionDescription() != null && other.getExpressionDescription().equals(this.getExpressionDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getRe2Expression() == null) ? 0 : getRe2Expression().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getExpressionDescription() == null) ? 0 : getExpressionDescription().hashCode());
        return hashCode;
    }

    @Override
    public StringListConfigurationOptions clone() {
        try {
            return (StringListConfigurationOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StringListConfigurationOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
