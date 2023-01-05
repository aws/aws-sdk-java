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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information for the filtering of a list of domains returned by <a
 * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains__ListDomains.html">ListDomains</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/FilterCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the field which should be used for filtering the list of domains.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The operator values for filtering domain names. The values can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LE</code>: Less than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code>: Begins with
     * </p>
     * </li>
     * </ul>
     */
    private String operator;
    /**
     * <p>
     * An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * Name of the field which should be used for filtering the list of domains.
     * </p>
     * 
     * @param name
     *        Name of the field which should be used for filtering the list of domains.
     * @see ListDomainsAttributeName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the field which should be used for filtering the list of domains.
     * </p>
     * 
     * @return Name of the field which should be used for filtering the list of domains.
     * @see ListDomainsAttributeName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the field which should be used for filtering the list of domains.
     * </p>
     * 
     * @param name
     *        Name of the field which should be used for filtering the list of domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListDomainsAttributeName
     */

    public FilterCondition withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Name of the field which should be used for filtering the list of domains.
     * </p>
     * 
     * @param name
     *        Name of the field which should be used for filtering the list of domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListDomainsAttributeName
     */

    public FilterCondition withName(ListDomainsAttributeName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The operator values for filtering domain names. The values can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LE</code>: Less than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code>: Begins with
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The operator values for filtering domain names. The values can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LE</code>: Less than, or equal to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GE</code>: Greater than, or equal to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BEGINS_WITH</code>: Begins with
     *        </p>
     *        </li>
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operator values for filtering domain names. The values can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LE</code>: Less than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code>: Begins with
     * </p>
     * </li>
     * </ul>
     * 
     * @return The operator values for filtering domain names. The values can be:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LE</code>: Less than, or equal to
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GE</code>: Greater than, or equal to
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BEGINS_WITH</code>: Begins with
     *         </p>
     *         </li>
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operator values for filtering domain names. The values can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LE</code>: Less than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code>: Begins with
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The operator values for filtering domain names. The values can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LE</code>: Less than, or equal to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GE</code>: Greater than, or equal to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BEGINS_WITH</code>: Begins with
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public FilterCondition withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operator values for filtering domain names. The values can be:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LE</code>: Less than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than, or equal to
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BEGINS_WITH</code>: Begins with
     * </p>
     * </li>
     * </ul>
     * 
     * @param operator
     *        The operator values for filtering domain names. The values can be:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LE</code>: Less than, or equal to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GE</code>: Greater than, or equal to
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BEGINS_WITH</code>: Begins with
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public FilterCondition withOperator(Operator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     * </p>
     * 
     * @return An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     * </p>
     * 
     * @param values
     *        An array of strings presenting values to compare. Only 1 item in the list is currently supported.
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
     * An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCondition withValues(String... values) {
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
     * An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     * </p>
     * 
     * @param values
     *        An array of strings presenting values to compare. Only 1 item in the list is currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterCondition withValues(java.util.Collection<String> values) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof FilterCondition == false)
            return false;
        FilterCondition other = (FilterCondition) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public FilterCondition clone() {
        try {
            return (FilterCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.FilterConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
