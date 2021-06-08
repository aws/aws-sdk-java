/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes criteria to restrict a list of results.
 * </p>
 * <p>
 * For operators that apply a single value to the attribute, the filter is evaluated as follows:
 * <code>Attribute Operator Values[1]</code>
 * </p>
 * <p>
 * Some operators, e.g. <code>in</code>, can apply multiple values. In this case, the filter is evaluated as a logical
 * union (OR) of applications of the operator to the attribute with each one of the values:
 * <code>(Attribute Operator Values[1]) OR (Attribute Operator Values[2]) OR ...</code>
 * </p>
 * <p>
 * The valid values for attributes of <code>SearchFilter</code> depend on the API action. For valid values, see the
 * reference page for the API action you're calling that takes a <code>SearchFilter</code> parameter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/SearchFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The result attribute to which the filter values are applied. Valid values vary by API action.
     * </p>
     */
    private String attribute;
    /**
     * <p>
     * The operator to apply to the <code>Attribute</code> with each of the <code>Values</code>. Valid values vary by
     * <code>Attribute</code>.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of values
     * and valid values vary by <code>Attribute</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The result attribute to which the filter values are applied. Valid values vary by API action.
     * </p>
     * 
     * @param attribute
     *        The result attribute to which the filter values are applied. Valid values vary by API action.
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The result attribute to which the filter values are applied. Valid values vary by API action.
     * </p>
     * 
     * @return The result attribute to which the filter values are applied. Valid values vary by API action.
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The result attribute to which the filter values are applied. Valid values vary by API action.
     * </p>
     * 
     * @param attribute
     *        The result attribute to which the filter values are applied. Valid values vary by API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilter withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The operator to apply to the <code>Attribute</code> with each of the <code>Values</code>. Valid values vary by
     * <code>Attribute</code>.
     * </p>
     * 
     * @param operator
     *        The operator to apply to the <code>Attribute</code> with each of the <code>Values</code>. Valid values
     *        vary by <code>Attribute</code>.
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator to apply to the <code>Attribute</code> with each of the <code>Values</code>. Valid values vary by
     * <code>Attribute</code>.
     * </p>
     * 
     * @return The operator to apply to the <code>Attribute</code> with each of the <code>Values</code>. Valid values
     *         vary by <code>Attribute</code>.
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator to apply to the <code>Attribute</code> with each of the <code>Values</code>. Valid values vary by
     * <code>Attribute</code>.
     * </p>
     * 
     * @param operator
     *        The operator to apply to the <code>Attribute</code> with each of the <code>Values</code>. Valid values
     *        vary by <code>Attribute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of values
     * and valid values vary by <code>Attribute</code>.
     * </p>
     * 
     * @return The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of
     *         values and valid values vary by <code>Attribute</code>.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of values
     * and valid values vary by <code>Attribute</code>.
     * </p>
     * 
     * @param values
     *        The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of
     *        values and valid values vary by <code>Attribute</code>.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of values
     * and valid values vary by <code>Attribute</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of
     *        values and valid values vary by <code>Attribute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of values
     * and valid values vary by <code>Attribute</code>.
     * </p>
     * 
     * @param values
     *        The list of values applied to the <code>Attribute</code> and <code>Operator</code> attributes. Number of
     *        values and valid values vary by <code>Attribute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilter withValues(java.util.Collection<String> values) {
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
        if (getAttribute() != null)
            sb.append("Attribute: ").append(getAttribute()).append(",");
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

        if (obj instanceof SearchFilter == false)
            return false;
        SearchFilter other = (SearchFilter) obj;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null && other.getAttribute().equals(this.getAttribute()) == false)
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

        hashCode = prime * hashCode + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public SearchFilter clone() {
        try {
            return (SearchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
