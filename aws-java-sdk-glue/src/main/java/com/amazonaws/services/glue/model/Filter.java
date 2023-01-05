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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a transform that splits a dataset into two, based on a filter condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Filter" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transform node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * The operator used to filter rows by comparing the key value to a specified value.
     * </p>
     */
    private String logicalOperator;
    /**
     * <p>
     * Specifies a filter expression.
     * </p>
     */
    private java.util.List<FilterExpression> filters;

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @return The name of the transform node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the transform node.
     * </p>
     * 
     * @param name
     *        The name of the transform node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @return The data inputs identified by their node names.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data inputs identified by their node names.
     * </p>
     * 
     * @param inputs
     *        The data inputs identified by their node names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * The operator used to filter rows by comparing the key value to a specified value.
     * </p>
     * 
     * @param logicalOperator
     *        The operator used to filter rows by comparing the key value to a specified value.
     * @see FilterLogicalOperator
     */

    public void setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    /**
     * <p>
     * The operator used to filter rows by comparing the key value to a specified value.
     * </p>
     * 
     * @return The operator used to filter rows by comparing the key value to a specified value.
     * @see FilterLogicalOperator
     */

    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    /**
     * <p>
     * The operator used to filter rows by comparing the key value to a specified value.
     * </p>
     * 
     * @param logicalOperator
     *        The operator used to filter rows by comparing the key value to a specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterLogicalOperator
     */

    public Filter withLogicalOperator(String logicalOperator) {
        setLogicalOperator(logicalOperator);
        return this;
    }

    /**
     * <p>
     * The operator used to filter rows by comparing the key value to a specified value.
     * </p>
     * 
     * @param logicalOperator
     *        The operator used to filter rows by comparing the key value to a specified value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterLogicalOperator
     */

    public Filter withLogicalOperator(FilterLogicalOperator logicalOperator) {
        this.logicalOperator = logicalOperator.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a filter expression.
     * </p>
     * 
     * @return Specifies a filter expression.
     */

    public java.util.List<FilterExpression> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Specifies a filter expression.
     * </p>
     * 
     * @param filters
     *        Specifies a filter expression.
     */

    public void setFilters(java.util.Collection<FilterExpression> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<FilterExpression>(filters);
    }

    /**
     * <p>
     * Specifies a filter expression.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Specifies a filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withFilters(FilterExpression... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<FilterExpression>(filters.length));
        }
        for (FilterExpression ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies a filter expression.
     * </p>
     * 
     * @param filters
     *        Specifies a filter expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withFilters(java.util.Collection<FilterExpression> filters) {
        setFilters(filters);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getLogicalOperator() != null)
            sb.append("LogicalOperator: ").append(getLogicalOperator()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
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
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getLogicalOperator() == null ^ this.getLogicalOperator() == null)
            return false;
        if (other.getLogicalOperator() != null && other.getLogicalOperator().equals(this.getLogicalOperator()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getLogicalOperator() == null) ? 0 : getLogicalOperator().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
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
        com.amazonaws.services.glue.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
