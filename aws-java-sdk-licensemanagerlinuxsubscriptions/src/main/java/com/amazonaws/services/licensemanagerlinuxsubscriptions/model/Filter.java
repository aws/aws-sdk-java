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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter object that is used to return more specific results from a describe operation. Filters can be used to match
 * a set of resources by specific criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/Filter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of name to filter by.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An operator for filtering results.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * One or more values for the name to filter by.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The type of name to filter by.
     * </p>
     * 
     * @param name
     *        The type of name to filter by.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The type of name to filter by.
     * </p>
     * 
     * @return The type of name to filter by.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The type of name to filter by.
     * </p>
     * 
     * @param name
     *        The type of name to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An operator for filtering results.
     * </p>
     * 
     * @param operator
     *        An operator for filtering results.
     * @see Operator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * An operator for filtering results.
     * </p>
     * 
     * @return An operator for filtering results.
     * @see Operator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * An operator for filtering results.
     * </p>
     * 
     * @param operator
     *        An operator for filtering results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Filter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * An operator for filtering results.
     * </p>
     * 
     * @param operator
     *        An operator for filtering results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operator
     */

    public Filter withOperator(Operator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * One or more values for the name to filter by.
     * </p>
     * 
     * @return One or more values for the name to filter by.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * One or more values for the name to filter by.
     * </p>
     * 
     * @param values
     *        One or more values for the name to filter by.
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
     * One or more values for the name to filter by.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        One or more values for the name to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
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
     * One or more values for the name to filter by.
     * </p>
     * 
     * @param values
     *        One or more values for the name to filter by.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
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
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanagerlinuxsubscriptions.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
