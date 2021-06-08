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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When creating or updating a cost category, you can define the <code>CostCategoryRule</code> rule type as
 * <code>INHERITED_VALUE</code>. This rule type adds the flexibility of defining a rule that dynamically inherits the
 * cost category value from the dimension value defined by <code>CostCategoryInheritedValueDimension</code>. For
 * example, if you wanted to dynamically group costs based on the value of a specific tag key, you would first choose an
 * inherited value rule type, then choose the tag dimension and specify the tag key to use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategoryInheritedValueDimension"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategoryInheritedValueDimension implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of dimension for which to group costs.
     * </p>
     * <p>
     * If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If you
     * specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * </p>
     */
    private String dimensionName;
    /**
     * <p>
     * The key to extract cost category values.
     * </p>
     */
    private String dimensionKey;

    /**
     * <p>
     * The name of dimension for which to group costs.
     * </p>
     * <p>
     * If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If you
     * specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * </p>
     * 
     * @param dimensionName
     *        The name of dimension for which to group costs.</p>
     *        <p>
     *        If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If
     *        you specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * @see CostCategoryInheritedValueDimensionName
     */

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * The name of dimension for which to group costs.
     * </p>
     * <p>
     * If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If you
     * specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * </p>
     * 
     * @return The name of dimension for which to group costs.</p>
     *         <p>
     *         If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name.
     *         If you specify <code>TAG</code>, the cost category value will be based on the value of the specified tag
     *         key.
     * @see CostCategoryInheritedValueDimensionName
     */

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * <p>
     * The name of dimension for which to group costs.
     * </p>
     * <p>
     * If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If you
     * specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * </p>
     * 
     * @param dimensionName
     *        The name of dimension for which to group costs.</p>
     *        <p>
     *        If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If
     *        you specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryInheritedValueDimensionName
     */

    public CostCategoryInheritedValueDimension withDimensionName(String dimensionName) {
        setDimensionName(dimensionName);
        return this;
    }

    /**
     * <p>
     * The name of dimension for which to group costs.
     * </p>
     * <p>
     * If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If you
     * specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * </p>
     * 
     * @param dimensionName
     *        The name of dimension for which to group costs.</p>
     *        <p>
     *        If you specify <code>LINKED_ACCOUNT_NAME</code>, the cost category value will be based on account name. If
     *        you specify <code>TAG</code>, the cost category value will be based on the value of the specified tag key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CostCategoryInheritedValueDimensionName
     */

    public CostCategoryInheritedValueDimension withDimensionName(CostCategoryInheritedValueDimensionName dimensionName) {
        this.dimensionName = dimensionName.toString();
        return this;
    }

    /**
     * <p>
     * The key to extract cost category values.
     * </p>
     * 
     * @param dimensionKey
     *        The key to extract cost category values.
     */

    public void setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
    }

    /**
     * <p>
     * The key to extract cost category values.
     * </p>
     * 
     * @return The key to extract cost category values.
     */

    public String getDimensionKey() {
        return this.dimensionKey;
    }

    /**
     * <p>
     * The key to extract cost category values.
     * </p>
     * 
     * @param dimensionKey
     *        The key to extract cost category values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryInheritedValueDimension withDimensionKey(String dimensionKey) {
        setDimensionKey(dimensionKey);
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
        if (getDimensionName() != null)
            sb.append("DimensionName: ").append(getDimensionName()).append(",");
        if (getDimensionKey() != null)
            sb.append("DimensionKey: ").append(getDimensionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryInheritedValueDimension == false)
            return false;
        CostCategoryInheritedValueDimension other = (CostCategoryInheritedValueDimension) obj;
        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getDimensionKey() == null ^ this.getDimensionKey() == null)
            return false;
        if (other.getDimensionKey() != null && other.getDimensionKey().equals(this.getDimensionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode + ((getDimensionKey() == null) ? 0 : getDimensionKey().hashCode());
        return hashCode;
    }

    @Override
    public CostCategoryInheritedValueDimension clone() {
        try {
            return (CostCategoryInheritedValueDimension) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategoryInheritedValueDimensionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
