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
 * Formatting configuration for icon set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ConditionalFormattingIconSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConditionalFormattingIconSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The expression that determines the formatting configuration for the icon set.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * Determines the icon set type.
     * </p>
     */
    private String iconSetType;

    /**
     * <p>
     * The expression that determines the formatting configuration for the icon set.
     * </p>
     * 
     * @param expression
     *        The expression that determines the formatting configuration for the icon set.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The expression that determines the formatting configuration for the icon set.
     * </p>
     * 
     * @return The expression that determines the formatting configuration for the icon set.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The expression that determines the formatting configuration for the icon set.
     * </p>
     * 
     * @param expression
     *        The expression that determines the formatting configuration for the icon set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalFormattingIconSet withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * Determines the icon set type.
     * </p>
     * 
     * @param iconSetType
     *        Determines the icon set type.
     * @see ConditionalFormattingIconSetType
     */

    public void setIconSetType(String iconSetType) {
        this.iconSetType = iconSetType;
    }

    /**
     * <p>
     * Determines the icon set type.
     * </p>
     * 
     * @return Determines the icon set type.
     * @see ConditionalFormattingIconSetType
     */

    public String getIconSetType() {
        return this.iconSetType;
    }

    /**
     * <p>
     * Determines the icon set type.
     * </p>
     * 
     * @param iconSetType
     *        Determines the icon set type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalFormattingIconSetType
     */

    public ConditionalFormattingIconSet withIconSetType(String iconSetType) {
        setIconSetType(iconSetType);
        return this;
    }

    /**
     * <p>
     * Determines the icon set type.
     * </p>
     * 
     * @param iconSetType
     *        Determines the icon set type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConditionalFormattingIconSetType
     */

    public ConditionalFormattingIconSet withIconSetType(ConditionalFormattingIconSetType iconSetType) {
        this.iconSetType = iconSetType.toString();
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
        if (getIconSetType() != null)
            sb.append("IconSetType: ").append(getIconSetType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalFormattingIconSet == false)
            return false;
        ConditionalFormattingIconSet other = (ConditionalFormattingIconSet) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getIconSetType() == null ^ this.getIconSetType() == null)
            return false;
        if (other.getIconSetType() != null && other.getIconSetType().equals(this.getIconSetType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getIconSetType() == null) ? 0 : getIconSetType().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalFormattingIconSet clone() {
        try {
            return (ConditionalFormattingIconSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ConditionalFormattingIconSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
