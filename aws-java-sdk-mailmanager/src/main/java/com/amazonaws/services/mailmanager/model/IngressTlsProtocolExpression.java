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
 * The structure for a TLS related condition matching on the incoming mail.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/IngressTlsProtocolExpression"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IngressTlsProtocolExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The left hand side argument of a TLS condition expression.
     * </p>
     */
    private IngressTlsProtocolToEvaluate evaluate;
    /**
     * <p>
     * The matching operator for a TLS condition expression.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The right hand side argument of a TLS condition expression.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The left hand side argument of a TLS condition expression.
     * </p>
     * 
     * @param evaluate
     *        The left hand side argument of a TLS condition expression.
     */

    public void setEvaluate(IngressTlsProtocolToEvaluate evaluate) {
        this.evaluate = evaluate;
    }

    /**
     * <p>
     * The left hand side argument of a TLS condition expression.
     * </p>
     * 
     * @return The left hand side argument of a TLS condition expression.
     */

    public IngressTlsProtocolToEvaluate getEvaluate() {
        return this.evaluate;
    }

    /**
     * <p>
     * The left hand side argument of a TLS condition expression.
     * </p>
     * 
     * @param evaluate
     *        The left hand side argument of a TLS condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IngressTlsProtocolExpression withEvaluate(IngressTlsProtocolToEvaluate evaluate) {
        setEvaluate(evaluate);
        return this;
    }

    /**
     * <p>
     * The matching operator for a TLS condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a TLS condition expression.
     * @see IngressTlsProtocolOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The matching operator for a TLS condition expression.
     * </p>
     * 
     * @return The matching operator for a TLS condition expression.
     * @see IngressTlsProtocolOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The matching operator for a TLS condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a TLS condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressTlsProtocolOperator
     */

    public IngressTlsProtocolExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The matching operator for a TLS condition expression.
     * </p>
     * 
     * @param operator
     *        The matching operator for a TLS condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressTlsProtocolOperator
     */

    public IngressTlsProtocolExpression withOperator(IngressTlsProtocolOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The right hand side argument of a TLS condition expression.
     * </p>
     * 
     * @param value
     *        The right hand side argument of a TLS condition expression.
     * @see IngressTlsProtocolAttribute
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The right hand side argument of a TLS condition expression.
     * </p>
     * 
     * @return The right hand side argument of a TLS condition expression.
     * @see IngressTlsProtocolAttribute
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The right hand side argument of a TLS condition expression.
     * </p>
     * 
     * @param value
     *        The right hand side argument of a TLS condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressTlsProtocolAttribute
     */

    public IngressTlsProtocolExpression withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The right hand side argument of a TLS condition expression.
     * </p>
     * 
     * @param value
     *        The right hand side argument of a TLS condition expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngressTlsProtocolAttribute
     */

    public IngressTlsProtocolExpression withValue(IngressTlsProtocolAttribute value) {
        this.value = value.toString();
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IngressTlsProtocolExpression == false)
            return false;
        IngressTlsProtocolExpression other = (IngressTlsProtocolExpression) obj;
        if (other.getEvaluate() == null ^ this.getEvaluate() == null)
            return false;
        if (other.getEvaluate() != null && other.getEvaluate().equals(this.getEvaluate()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluate() == null) ? 0 : getEvaluate().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public IngressTlsProtocolExpression clone() {
        try {
            return (IngressTlsProtocolExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.IngressTlsProtocolExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
