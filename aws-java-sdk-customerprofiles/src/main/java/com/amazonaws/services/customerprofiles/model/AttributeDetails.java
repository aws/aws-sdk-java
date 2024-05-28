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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Mathematical expression and a list of attribute items specified in that expression.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/AttributeDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of attribute items specified in the mathematical expression.
     * </p>
     */
    private java.util.List<AttributeItem> attributes;
    /**
     * <p>
     * Mathematical expression that is performed on attribute items provided in the attribute list. Each element in the
     * expression should follow the structure of \"{ObjectTypeName.AttributeName}\".
     * </p>
     */
    private String expression;

    /**
     * <p>
     * A list of attribute items specified in the mathematical expression.
     * </p>
     * 
     * @return A list of attribute items specified in the mathematical expression.
     */

    public java.util.List<AttributeItem> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of attribute items specified in the mathematical expression.
     * </p>
     * 
     * @param attributes
     *        A list of attribute items specified in the mathematical expression.
     */

    public void setAttributes(java.util.Collection<AttributeItem> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AttributeItem>(attributes);
    }

    /**
     * <p>
     * A list of attribute items specified in the mathematical expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A list of attribute items specified in the mathematical expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeDetails withAttributes(AttributeItem... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<AttributeItem>(attributes.length));
        }
        for (AttributeItem ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of attribute items specified in the mathematical expression.
     * </p>
     * 
     * @param attributes
     *        A list of attribute items specified in the mathematical expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeDetails withAttributes(java.util.Collection<AttributeItem> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * Mathematical expression that is performed on attribute items provided in the attribute list. Each element in the
     * expression should follow the structure of \"{ObjectTypeName.AttributeName}\".
     * </p>
     * 
     * @param expression
     *        Mathematical expression that is performed on attribute items provided in the attribute list. Each element
     *        in the expression should follow the structure of \"{ObjectTypeName.AttributeName}\".
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * Mathematical expression that is performed on attribute items provided in the attribute list. Each element in the
     * expression should follow the structure of \"{ObjectTypeName.AttributeName}\".
     * </p>
     * 
     * @return Mathematical expression that is performed on attribute items provided in the attribute list. Each element
     *         in the expression should follow the structure of \"{ObjectTypeName.AttributeName}\".
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * Mathematical expression that is performed on attribute items provided in the attribute list. Each element in the
     * expression should follow the structure of \"{ObjectTypeName.AttributeName}\".
     * </p>
     * 
     * @param expression
     *        Mathematical expression that is performed on attribute items provided in the attribute list. Each element
     *        in the expression should follow the structure of \"{ObjectTypeName.AttributeName}\".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeDetails withExpression(String expression) {
        setExpression(expression);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeDetails == false)
            return false;
        AttributeDetails other = (AttributeDetails) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        return hashCode;
    }

    @Override
    public AttributeDetails clone() {
        try {
            return (AttributeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.AttributeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
