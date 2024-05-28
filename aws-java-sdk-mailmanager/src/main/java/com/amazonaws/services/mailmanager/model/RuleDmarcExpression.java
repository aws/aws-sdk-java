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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A DMARC policy expression. The condition matches if the given DMARC policy matches that of the incoming email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleDmarcExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleDmarcExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The operator to apply to the DMARC policy of the incoming email.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are given,
     * they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to match. For the
     * operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the email's
     * DMARC policy is not equal to any of the given values, then the condition is deemed to match.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The operator to apply to the DMARC policy of the incoming email.
     * </p>
     * 
     * @param operator
     *        The operator to apply to the DMARC policy of the incoming email.
     * @see RuleDmarcOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to apply to the DMARC policy of the incoming email.
     * </p>
     * 
     * @return The operator to apply to the DMARC policy of the incoming email.
     * @see RuleDmarcOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to apply to the DMARC policy of the incoming email.
     * </p>
     * 
     * @param operator
     *        The operator to apply to the DMARC policy of the incoming email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleDmarcOperator
     */

    public RuleDmarcExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to apply to the DMARC policy of the incoming email.
     * </p>
     * 
     * @param operator
     *        The operator to apply to the DMARC policy of the incoming email.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleDmarcOperator
     */

    public RuleDmarcExpression withOperator(RuleDmarcOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are given,
     * they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to match. For the
     * operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the email's
     * DMARC policy is not equal to any of the given values, then the condition is deemed to match.
     * </p>
     * 
     * @return The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are
     *         given, they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to
     *         match. For the operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is,
     *         only if the email's DMARC policy is not equal to any of the given values, then the condition is deemed to
     *         match.
     * @see RuleDmarcPolicy
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are given,
     * they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to match. For the
     * operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the email's
     * DMARC policy is not equal to any of the given values, then the condition is deemed to match.
     * </p>
     * 
     * @param values
     *        The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are
     *        given, they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to
     *        match. For the operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is,
     *        only if the email's DMARC policy is not equal to any of the given values, then the condition is deemed to
     *        match.
     * @see RuleDmarcPolicy
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are given,
     * they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to match. For the
     * operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the email's
     * DMARC policy is not equal to any of the given values, then the condition is deemed to match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are
     *        given, they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to
     *        match. For the operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is,
     *        only if the email's DMARC policy is not equal to any of the given values, then the condition is deemed to
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleDmarcPolicy
     */

    public RuleDmarcExpression withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are given,
     * they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to match. For the
     * operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the email's
     * DMARC policy is not equal to any of the given values, then the condition is deemed to match.
     * </p>
     * 
     * @param values
     *        The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are
     *        given, they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to
     *        match. For the operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is,
     *        only if the email's DMARC policy is not equal to any of the given values, then the condition is deemed to
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleDmarcPolicy
     */

    public RuleDmarcExpression withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are given,
     * they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to match. For the
     * operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the email's
     * DMARC policy is not equal to any of the given values, then the condition is deemed to match.
     * </p>
     * 
     * @param values
     *        The values to use for the given DMARC policy operator. For the operator EQUALS, if multiple values are
     *        given, they are evaluated as an OR. That is, if any of the given values match, the condition is deemed to
     *        match. For the operator NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is,
     *        only if the email's DMARC policy is not equal to any of the given values, then the condition is deemed to
     *        match.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleDmarcPolicy
     */

    public RuleDmarcExpression withValues(RuleDmarcPolicy... values) {
        java.util.ArrayList<String> valuesCopy = new java.util.ArrayList<String>(values.length);
        for (RuleDmarcPolicy value : values) {
            valuesCopy.add(value.toString());
        }
        if (getValues() == null) {
            setValues(valuesCopy);
        } else {
            getValues().addAll(valuesCopy);
        }
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
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleDmarcExpression == false)
            return false;
        RuleDmarcExpression other = (RuleDmarcExpression) obj;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public RuleDmarcExpression clone() {
        try {
            return (RuleDmarcExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleDmarcExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
