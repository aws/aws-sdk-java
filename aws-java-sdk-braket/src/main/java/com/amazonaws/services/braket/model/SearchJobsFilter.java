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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter used to search for Amazon Braket jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchJobsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchJobsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name to use for the jobs filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An operator to use for the jobs filter.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The values to use for the jobs filter.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name to use for the jobs filter.
     * </p>
     * 
     * @param name
     *        The name to use for the jobs filter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to use for the jobs filter.
     * </p>
     * 
     * @return The name to use for the jobs filter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to use for the jobs filter.
     * </p>
     * 
     * @param name
     *        The name to use for the jobs filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An operator to use for the jobs filter.
     * </p>
     * 
     * @param operator
     *        An operator to use for the jobs filter.
     * @see SearchJobsFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * An operator to use for the jobs filter.
     * </p>
     * 
     * @return An operator to use for the jobs filter.
     * @see SearchJobsFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * An operator to use for the jobs filter.
     * </p>
     * 
     * @param operator
     *        An operator to use for the jobs filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchJobsFilterOperator
     */

    public SearchJobsFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * An operator to use for the jobs filter.
     * </p>
     * 
     * @param operator
     *        An operator to use for the jobs filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchJobsFilterOperator
     */

    public SearchJobsFilter withOperator(SearchJobsFilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The values to use for the jobs filter.
     * </p>
     * 
     * @return The values to use for the jobs filter.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values to use for the jobs filter.
     * </p>
     * 
     * @param values
     *        The values to use for the jobs filter.
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
     * The values to use for the jobs filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values to use for the jobs filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsFilter withValues(String... values) {
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
     * The values to use for the jobs filter.
     * </p>
     * 
     * @param values
     *        The values to use for the jobs filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchJobsFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof SearchJobsFilter == false)
            return false;
        SearchJobsFilter other = (SearchJobsFilter) obj;
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
    public SearchJobsFilter clone() {
        try {
            return (SearchJobsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.SearchJobsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
