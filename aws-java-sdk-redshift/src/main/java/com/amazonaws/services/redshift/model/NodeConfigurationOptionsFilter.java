/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A set of elements to filter the returned node configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/NodeConfigurationOptionsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeConfigurationOptionsFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     * evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     */
    private String operator;
    /**
     * <p>
     * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range
     * from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * 
     * @param name
     *        The name of the element to filter.
     * @see NodeConfigurationOptionsFilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * 
     * @return The name of the element to filter.
     * @see NodeConfigurationOptionsFilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * 
     * @param name
     *        The name of the element to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeConfigurationOptionsFilterName
     */

    public NodeConfigurationOptionsFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the element to filter.
     * </p>
     * 
     * @param name
     *        The name of the element to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeConfigurationOptionsFilterName
     */

    public NodeConfigurationOptionsFilter withName(NodeConfigurationOptionsFilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     * evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * 
     * @param operator
     *        The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     *        evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a
     *        list of values for 'in'.
     * @see OperatorType
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     * evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * 
     * @return The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     *         evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a
     *         list of values for 'in'.
     * @see OperatorType
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     * evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * 
     * @param operator
     *        The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     *        evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a
     *        list of values for 'in'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatorType
     */

    public NodeConfigurationOptionsFilter withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     * evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of
     * values for 'in'.
     * </p>
     * 
     * @param operator
     *        The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to
     *        evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a
     *        list of values for 'in'.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatorType
     */

    public NodeConfigurationOptionsFilter withOperator(OperatorType operator) {
        this.operator = operator.toString();
        return this;
    }

    /**
     * <p>
     * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range
     * from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     * 
     * @return List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can
     *         range from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to
     *         100. For example, filter NumberOfNodes (name) GT (operator) 3 (values).
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range
     * from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     * 
     * @param values
     *        List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can
     *        range from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to
     *        100. For example, filter NumberOfNodes (name) GT (operator) 3 (values).
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
     * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range
     * from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can
     *        range from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to
     *        100. For example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfigurationOptionsFilter withValues(String... values) {
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
     * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range
     * from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For
     * example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * </p>
     * 
     * @param values
     *        List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can
     *        range from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to
     *        100. For example, filter NumberOfNodes (name) GT (operator) 3 (values).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeConfigurationOptionsFilter withValues(java.util.Collection<String> values) {
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

        if (obj instanceof NodeConfigurationOptionsFilter == false)
            return false;
        NodeConfigurationOptionsFilter other = (NodeConfigurationOptionsFilter) obj;
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
    public NodeConfigurationOptionsFilter clone() {
        try {
            return (NodeConfigurationOptionsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
