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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The numeric equality type drill down filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CategoryDrillDownFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryDrillDownFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * A list of the string inputs that are the values of the category drill down filter.
     * </p>
     */
    private java.util.List<String> categoryValues;

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @param column
     *        The column that the filter is applied to.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @return The column that the filter is applied to.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @param column
     *        The column that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryDrillDownFilter withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * A list of the string inputs that are the values of the category drill down filter.
     * </p>
     * 
     * @return A list of the string inputs that are the values of the category drill down filter.
     */

    public java.util.List<String> getCategoryValues() {
        return categoryValues;
    }

    /**
     * <p>
     * A list of the string inputs that are the values of the category drill down filter.
     * </p>
     * 
     * @param categoryValues
     *        A list of the string inputs that are the values of the category drill down filter.
     */

    public void setCategoryValues(java.util.Collection<String> categoryValues) {
        if (categoryValues == null) {
            this.categoryValues = null;
            return;
        }

        this.categoryValues = new java.util.ArrayList<String>(categoryValues);
    }

    /**
     * <p>
     * A list of the string inputs that are the values of the category drill down filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoryValues(java.util.Collection)} or {@link #withCategoryValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param categoryValues
     *        A list of the string inputs that are the values of the category drill down filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryDrillDownFilter withCategoryValues(String... categoryValues) {
        if (this.categoryValues == null) {
            setCategoryValues(new java.util.ArrayList<String>(categoryValues.length));
        }
        for (String ele : categoryValues) {
            this.categoryValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the string inputs that are the values of the category drill down filter.
     * </p>
     * 
     * @param categoryValues
     *        A list of the string inputs that are the values of the category drill down filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryDrillDownFilter withCategoryValues(java.util.Collection<String> categoryValues) {
        setCategoryValues(categoryValues);
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
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getCategoryValues() != null)
            sb.append("CategoryValues: ").append(getCategoryValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoryDrillDownFilter == false)
            return false;
        CategoryDrillDownFilter other = (CategoryDrillDownFilter) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getCategoryValues() == null ^ this.getCategoryValues() == null)
            return false;
        if (other.getCategoryValues() != null && other.getCategoryValues().equals(this.getCategoryValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getCategoryValues() == null) ? 0 : getCategoryValues().hashCode());
        return hashCode;
    }

    @Override
    public CategoryDrillDownFilter clone() {
        try {
            return (CategoryDrillDownFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CategoryDrillDownFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
