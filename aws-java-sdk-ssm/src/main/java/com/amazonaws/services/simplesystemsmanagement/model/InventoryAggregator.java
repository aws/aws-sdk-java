/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the inventory type and attribute for the aggregation execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/InventoryAggregator" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InventoryAggregator implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryAggregator> aggregators;
    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     * resources that match and don't match the specified criteria.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InventoryGroup> groups;

    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     * 
     * @param expression
     *        The inventory type and attribute name for aggregation.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     * 
     * @return The inventory type and attribute name for aggregation.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The inventory type and attribute name for aggregation.
     * </p>
     * 
     * @param expression
     *        The inventory type and attribute name for aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryAggregator withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     * 
     * @return Nested aggregators to further refine aggregation for an inventory type.
     */

    public java.util.List<InventoryAggregator> getAggregators() {
        if (aggregators == null) {
            aggregators = new com.amazonaws.internal.SdkInternalList<InventoryAggregator>();
        }
        return aggregators;
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     * 
     * @param aggregators
     *        Nested aggregators to further refine aggregation for an inventory type.
     */

    public void setAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        if (aggregators == null) {
            this.aggregators = null;
            return;
        }

        this.aggregators = new com.amazonaws.internal.SdkInternalList<InventoryAggregator>(aggregators);
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregators(java.util.Collection)} or {@link #withAggregators(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregators
     *        Nested aggregators to further refine aggregation for an inventory type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryAggregator withAggregators(InventoryAggregator... aggregators) {
        if (this.aggregators == null) {
            setAggregators(new com.amazonaws.internal.SdkInternalList<InventoryAggregator>(aggregators.length));
        }
        for (InventoryAggregator ele : aggregators) {
            this.aggregators.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Nested aggregators to further refine aggregation for an inventory type.
     * </p>
     * 
     * @param aggregators
     *        Nested aggregators to further refine aggregation for an inventory type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryAggregator withAggregators(java.util.Collection<InventoryAggregator> aggregators) {
        setAggregators(aggregators);
        return this;
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     * resources that match and don't match the specified criteria.
     * </p>
     * 
     * @return A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     *         resources that match and don't match the specified criteria.
     */

    public java.util.List<InventoryGroup> getGroups() {
        if (groups == null) {
            groups = new com.amazonaws.internal.SdkInternalList<InventoryGroup>();
        }
        return groups;
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     * resources that match and don't match the specified criteria.
     * </p>
     * 
     * @param groups
     *        A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     *        resources that match and don't match the specified criteria.
     */

    public void setGroups(java.util.Collection<InventoryGroup> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }

        this.groups = new com.amazonaws.internal.SdkInternalList<InventoryGroup>(groups);
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     * resources that match and don't match the specified criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroups(java.util.Collection)} or {@link #withGroups(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param groups
     *        A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     *        resources that match and don't match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryAggregator withGroups(InventoryGroup... groups) {
        if (this.groups == null) {
            setGroups(new com.amazonaws.internal.SdkInternalList<InventoryGroup>(groups.length));
        }
        for (InventoryGroup ele : groups) {
            this.groups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     * resources that match and don't match the specified criteria.
     * </p>
     * 
     * @param groups
     *        A user-defined set of one or more filters on which to aggregate inventory data. Groups return a count of
     *        resources that match and don't match the specified criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InventoryAggregator withGroups(java.util.Collection<InventoryGroup> groups) {
        setGroups(groups);
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
        if (getExpression() != null)
            sb.append("Expression: ").append(getExpression()).append(",");
        if (getAggregators() != null)
            sb.append("Aggregators: ").append(getAggregators()).append(",");
        if (getGroups() != null)
            sb.append("Groups: ").append(getGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InventoryAggregator == false)
            return false;
        InventoryAggregator other = (InventoryAggregator) obj;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getAggregators() == null ^ this.getAggregators() == null)
            return false;
        if (other.getAggregators() != null && other.getAggregators().equals(this.getAggregators()) == false)
            return false;
        if (other.getGroups() == null ^ this.getGroups() == null)
            return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getAggregators() == null) ? 0 : getAggregators().hashCode());
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode());
        return hashCode;
    }

    @Override
    public InventoryAggregator clone() {
        try {
            return (InventoryAggregator) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.InventoryAggregatorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
