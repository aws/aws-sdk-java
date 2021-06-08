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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter to use to search for tasks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/SearchQuantumTasksFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchQuantumTasksFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the device used for the task.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An operator to use in the filter.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * The values to use for the filter.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the device used for the task.
     * </p>
     * 
     * @param name
     *        The name of the device used for the task.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the device used for the task.
     * </p>
     * 
     * @return The name of the device used for the task.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the device used for the task.
     * </p>
     * 
     * @param name
     *        The name of the device used for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An operator to use in the filter.
     * </p>
     * 
     * @param operator
     *        An operator to use in the filter.
     * @see SearchQuantumTasksFilterOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * An operator to use in the filter.
     * </p>
     * 
     * @return An operator to use in the filter.
     * @see SearchQuantumTasksFilterOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * An operator to use in the filter.
     * </p>
     * 
     * @param operator
     *        An operator to use in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchQuantumTasksFilterOperator
     */

    public SearchQuantumTasksFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * An operator to use in the filter.
     * </p>
     * 
     * @param operator
     *        An operator to use in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SearchQuantumTasksFilterOperator
     */

    public SearchQuantumTasksFilter withOperator(SearchQuantumTasksFilterOperator operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * The values to use for the filter.
     * </p>
     * 
     * @return The values to use for the filter.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The values to use for the filter.
     * </p>
     * 
     * @param values
     *        The values to use for the filter.
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
     * The values to use for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values to use for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksFilter withValues(String... values) {
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
     * The values to use for the filter.
     * </p>
     * 
     * @param values
     *        The values to use for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchQuantumTasksFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof SearchQuantumTasksFilter == false)
            return false;
        SearchQuantumTasksFilter other = (SearchQuantumTasksFilter) obj;
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
    public SearchQuantumTasksFilter clone() {
        try {
            return (SearchQuantumTasksFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.SearchQuantumTasksFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
