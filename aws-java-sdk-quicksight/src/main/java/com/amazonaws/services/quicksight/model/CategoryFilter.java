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
 * A <code>CategoryFilter</code> filters text values.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text filters</a> in
 * the <i>Amazon QuickSight User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CategoryFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     */
    private String filterId;
    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The configuration for a <code>CategoryFilter</code>.
     * </p>
     */
    private CategoryFilterConfiguration configuration;

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @param filterId
     *        An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     */

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @return An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     */

    public String getFilterId() {
        return this.filterId;
    }

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @param filterId
     *        An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryFilter withFilterId(String filterId) {
        setFilterId(filterId);
        return this;
    }

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

    public CategoryFilter withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The configuration for a <code>CategoryFilter</code>.
     * </p>
     * 
     * @param configuration
     *        The configuration for a <code>CategoryFilter</code>.
     */

    public void setConfiguration(CategoryFilterConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration for a <code>CategoryFilter</code>.
     * </p>
     * 
     * @return The configuration for a <code>CategoryFilter</code>.
     */

    public CategoryFilterConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration for a <code>CategoryFilter</code>.
     * </p>
     * 
     * @param configuration
     *        The configuration for a <code>CategoryFilter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryFilter withConfiguration(CategoryFilterConfiguration configuration) {
        setConfiguration(configuration);
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
        if (getFilterId() != null)
            sb.append("FilterId: ").append(getFilterId()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoryFilter == false)
            return false;
        CategoryFilter other = (CategoryFilter) obj;
        if (other.getFilterId() == null ^ this.getFilterId() == null)
            return false;
        if (other.getFilterId() != null && other.getFilterId().equals(this.getFilterId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterId() == null) ? 0 : getFilterId().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CategoryFilter clone() {
        try {
            return (CategoryFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CategoryFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
