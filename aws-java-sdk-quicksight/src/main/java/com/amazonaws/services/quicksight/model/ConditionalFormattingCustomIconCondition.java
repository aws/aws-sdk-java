/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the custom condition for an icon set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ConditionalFormattingCustomIconCondition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalFormattingCustomIconCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expression that determines the condition of the icon set.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * Custom icon options for an icon set.
     * </p>
     */
    private ConditionalFormattingCustomIconOptions iconOptions;
    /**
     * <p>
     * Determines the color of the icon.
     * </p>
     */
    private String color;
    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     */
    private ConditionalFormattingIconDisplayConfiguration displayConfiguration;

    /**
     * <p>
     * The expression that determines the condition of the icon set.
     * </p>
     * 
     * @param expression
     *        The expression that determines the condition of the icon set.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression that determines the condition of the icon set.
     * </p>
     * 
     * @return The expression that determines the condition of the icon set.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression that determines the condition of the icon set.
     * </p>
     * 
     * @param expression
     *        The expression that determines the condition of the icon set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingCustomIconCondition withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * Custom icon options for an icon set.
     * </p>
     * 
     * @param iconOptions
     *        Custom icon options for an icon set.
     */

    public void setIconOptions(ConditionalFormattingCustomIconOptions iconOptions) {
        this.iconOptions = iconOptions;
    }

    /**
     * <p>
     * Custom icon options for an icon set.
     * </p>
     * 
     * @return Custom icon options for an icon set.
     */

    public ConditionalFormattingCustomIconOptions getIconOptions() {
        return this.iconOptions;
    }

    /**
     * <p>
     * Custom icon options for an icon set.
     * </p>
     * 
     * @param iconOptions
     *        Custom icon options for an icon set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingCustomIconCondition withIconOptions(ConditionalFormattingCustomIconOptions iconOptions) {
        setIconOptions(iconOptions);
        return this;
    }

    /**
     * <p>
     * Determines the color of the icon.
     * </p>
     * 
     * @param color
     *        Determines the color of the icon.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * Determines the color of the icon.
     * </p>
     * 
     * @return Determines the color of the icon.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * Determines the color of the icon.
     * </p>
     * 
     * @param color
     *        Determines the color of the icon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingCustomIconCondition withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     * 
     * @param displayConfiguration
     *        Determines the icon display configuration.
     */

    public void setDisplayConfiguration(ConditionalFormattingIconDisplayConfiguration displayConfiguration) {
        this.displayConfiguration = displayConfiguration;
    }

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     * 
     * @return Determines the icon display configuration.
     */

    public ConditionalFormattingIconDisplayConfiguration getDisplayConfiguration() {
        return this.displayConfiguration;
    }

    /**
     * <p>
     * Determines the icon display configuration.
     * </p>
     * 
     * @param displayConfiguration
     *        Determines the icon display configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingCustomIconCondition withDisplayConfiguration(ConditionalFormattingIconDisplayConfiguration displayConfiguration) {
        setDisplayConfiguration(displayConfiguration);
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
        if (getExpression() != null)
            sb.append("Expression: ").append("***Sensitive Data Redacted***").append(",");
        if (getIconOptions() != null)
            sb.append("IconOptions: ").append(getIconOptions()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getDisplayConfiguration() != null)
            sb.append("DisplayConfiguration: ").append(getDisplayConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalFormattingCustomIconCondition == false)
            return false;
        ConditionalFormattingCustomIconCondition other = (ConditionalFormattingCustomIconCondition) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getIconOptions() == null ^ this.getIconOptions() == null)
            return false;
        if (other.getIconOptions() != null && other.getIconOptions().equals(this.getIconOptions()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getDisplayConfiguration() == null ^ this.getDisplayConfiguration() == null)
            return false;
        if (other.getDisplayConfiguration() != null && other.getDisplayConfiguration().equals(this.getDisplayConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getIconOptions() == null) ? 0 : getIconOptions().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getDisplayConfiguration() == null) ? 0 : getDisplayConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalFormattingCustomIconCondition clone() {
        try {
            return (ConditionalFormattingCustomIconCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ConditionalFormattingCustomIconConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
