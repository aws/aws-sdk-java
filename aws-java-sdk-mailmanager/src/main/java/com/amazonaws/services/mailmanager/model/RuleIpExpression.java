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
 * An IP address expression matching certain IP addresses within a given range of IP addresses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/RuleIpExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleIpExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address to evaluate in this condition.
     * </p>
     */
    private RuleIpToEvaluate evaluate;
    /**
     * <p>
     * The operator to evaluate the IP address.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the operator
     * CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP address is contained
     * within any of the given CIDR ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR
     * ranges are given, the condition is deemed to match if the IP address is not contained in any of the given CIDR
     * ranges.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The IP address to evaluate in this condition.
     * </p>
     * 
     * @param evaluate
     *        The IP address to evaluate in this condition.
     */

    public void setEvaluate(RuleIpToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The IP address to evaluate in this condition.
     * </p>
     * 
     * @return The IP address to evaluate in this condition.
     */

    public RuleIpToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The IP address to evaluate in this condition.
     * </p>
     * 
     * @param evaluate
     *        The IP address to evaluate in this condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleIpExpression withEvaluate(RuleIpToEvaluate evaluate) {
        setEvaluate(evaluate);
        return this;
    }

    /**
     * <p>
     * The operator to evaluate the IP address.
     * </p>
     * 
     * @param operator
     *        The operator to evaluate the IP address.
     * @see RuleIpOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to evaluate the IP address.
     * </p>
     * 
     * @return The operator to evaluate the IP address.
     * @see RuleIpOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to evaluate the IP address.
     * </p>
     * 
     * @param operator
     *        The operator to evaluate the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleIpOperator
     */

    public RuleIpExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator to evaluate the IP address.
     * </p>
     * 
     * @param operator
     *        The operator to evaluate the IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleIpOperator
     */

    public RuleIpExpression withOperator(RuleIpOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the operator
     * CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP address is contained
     * within any of the given CIDR ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR
     * ranges are given, the condition is deemed to match if the IP address is not contained in any of the given CIDR
     * ranges.
     * </p>
     * 
     * @return The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the
     *         operator CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP
     *         address is contained within any of the given CIDR ranges, the condition is deemed to match. For
     *         NOT_CIDR_MATCHES, if multiple CIDR ranges are given, the condition is deemed to match if the IP address
     *         is not contained in any of the given CIDR ranges.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the operator
     * CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP address is contained
     * within any of the given CIDR ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR
     * ranges are given, the condition is deemed to match if the IP address is not contained in any of the given CIDR
     * ranges.
     * </p>
     * 
     * @param values
     *        The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the
     *        operator CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP
     *        address is contained within any of the given CIDR ranges, the condition is deemed to match. For
     *        NOT_CIDR_MATCHES, if multiple CIDR ranges are given, the condition is deemed to match if the IP address is
     *        not contained in any of the given CIDR ranges.
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
     * The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the operator
     * CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP address is contained
     * within any of the given CIDR ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR
     * ranges are given, the condition is deemed to match if the IP address is not contained in any of the given CIDR
     * ranges.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the
     *        operator CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP
     *        address is contained within any of the given CIDR ranges, the condition is deemed to match. For
     *        NOT_CIDR_MATCHES, if multiple CIDR ranges are given, the condition is deemed to match if the IP address is
     *        not contained in any of the given CIDR ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleIpExpression withValues(String... values) {
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
     * The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the operator
     * CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP address is contained
     * within any of the given CIDR ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR
     * ranges are given, the condition is deemed to match if the IP address is not contained in any of the given CIDR
     * ranges.
     * </p>
     * 
     * @param values
     *        The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP address. For the
     *        operator CIDR_MATCHES, if multiple values are given, they are evaluated as an OR. That is, if the IP
     *        address is contained within any of the given CIDR ranges, the condition is deemed to match. For
     *        NOT_CIDR_MATCHES, if multiple CIDR ranges are given, the condition is deemed to match if the IP address is
     *        not contained in any of the given CIDR ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleIpExpression withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getEvaluate() != null)
            sb.append("Evaluate: ").append(getEvaluate()).append(",");
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

        if (obj instanceof RuleIpExpression == false)
            return false;
        RuleIpExpression other = (RuleIpExpression) obj;
        if (other.getEvaluate() == null ^ this.getEvaluate() == null)
            return false;
        if (other.getEvaluate() != null && other.getEvaluate().equals(this.getEvaluate()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public RuleIpExpression clone() {
        try {
            return (RuleIpExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RuleIpExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
