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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Stores information for generating Amplify DataStore queries. Use a <code>Predicate</code> to retrieve a subset of the
 * data in a collection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/Predicate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Predicate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     */
    private java.util.List<Predicate> and;
    /**
     * <p>
     * The field to query.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The value to use when performing the evaluation.
     * </p>
     */
    private String operand;
    /**
     * <p>
     * The operator to use to perform the evaluation.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     */
    private java.util.List<Predicate> or;

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * 
     * @return A list of predicates to combine logically.
     */

    public java.util.List<Predicate> getAnd() {
        return and;
    }

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * 
     * @param and
     *        A list of predicates to combine logically.
     */

    public void setAnd(java.util.Collection<Predicate> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<Predicate>(and);
    }

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnd(java.util.Collection)} or {@link #withAnd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param and
     *        A list of predicates to combine logically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withAnd(Predicate... and) {
        if (this.and == null) {
            setAnd(new java.util.ArrayList<Predicate>(and.length));
        }
        for (Predicate ele : and) {
            this.and.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * 
     * @param and
     *        A list of predicates to combine logically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withAnd(java.util.Collection<Predicate> and) {
        setAnd(and);
        return this;
    }

    /**
     * <p>
     * The field to query.
     * </p>
     * 
     * @param field
     *        The field to query.
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * The field to query.
     * </p>
     * 
     * @return The field to query.
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * The field to query.
     * </p>
     * 
     * @param field
     *        The field to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * The value to use when performing the evaluation.
     * </p>
     * 
     * @param operand
     *        The value to use when performing the evaluation.
     */

    public void setOperand(String operand) {
        this.operand = operand;
    }

    /**
     * <p>
     * The value to use when performing the evaluation.
     * </p>
     * 
     * @return The value to use when performing the evaluation.
     */

    public String getOperand() {
        return this.operand;
    }

    /**
     * <p>
     * The value to use when performing the evaluation.
     * </p>
     * 
     * @param operand
     *        The value to use when performing the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withOperand(String operand) {
        setOperand(operand);
        return this;
    }

    /**
     * <p>
     * The operator to use to perform the evaluation.
     * </p>
     * 
     * @param operator
     *        The operator to use to perform the evaluation.
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to use to perform the evaluation.
     * </p>
     * 
     * @return The operator to use to perform the evaluation.
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to use to perform the evaluation.
     * </p>
     * 
     * @param operator
     *        The operator to use to perform the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * 
     * @return A list of predicates to combine logically.
     */

    public java.util.List<Predicate> getOr() {
        return or;
    }

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * 
     * @param or
     *        A list of predicates to combine logically.
     */

    public void setOr(java.util.Collection<Predicate> or) {
        if (or == null) {
            this.or = null;
            return;
        }

        this.or = new java.util.ArrayList<Predicate>(or);
    }

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOr(java.util.Collection)} or {@link #withOr(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param or
     *        A list of predicates to combine logically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withOr(Predicate... or) {
        if (this.or == null) {
            setOr(new java.util.ArrayList<Predicate>(or.length));
        }
        for (Predicate ele : or) {
            this.or.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of predicates to combine logically.
     * </p>
     * 
     * @param or
     *        A list of predicates to combine logically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Predicate withOr(java.util.Collection<Predicate> or) {
        setOr(or);
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
        if (getAnd() != null)
            sb.append("And: ").append(getAnd()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getOperand() != null)
            sb.append("Operand: ").append(getOperand()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator()).append(",");
        if (getOr() != null)
            sb.append("Or: ").append(getOr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Predicate == false)
            return false;
        Predicate other = (Predicate) obj;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getOperand() == null ^ this.getOperand() == null)
            return false;
        if (other.getOperand() != null && other.getOperand().equals(this.getOperand()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        if (other.getOr() == null ^ this.getOr() == null)
            return false;
        if (other.getOr() != null && other.getOr().equals(this.getOr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getOperand() == null) ? 0 : getOperand().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getOr() == null) ? 0 : getOr().hashCode());
        return hashCode;
    }

    @Override
    public Predicate clone() {
        try {
            return (Predicate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.PredicateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
