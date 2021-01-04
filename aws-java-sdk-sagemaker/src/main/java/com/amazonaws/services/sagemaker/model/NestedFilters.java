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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of nested <a>Filter</a> objects. A resource must satisfy the conditions of all filters to be included in the
 * results returned from the <a>Search</a> API.
 * </p>
 * <p>
 * For example, to filter on a training job's <code>InputDataConfig</code> property with a specific channel name and
 * <code>S3Uri</code> prefix, define the following filters:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>'{Name:"InputDataConfig.ChannelName", "Operator":"Equals", "Value":"train"}',</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>'{Name:"InputDataConfig.DataSource.S3DataSource.S3Uri", "Operator":"Contains", "Value":"mybucket/catdata"}'</code>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/NestedFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NestedFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the property to use in the nested filters. The value must match a listed property name, such as
     * <code>InputDataConfig</code>.
     * </p>
     */
    private String nestedPropertyName;
    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code> value.
     * For example, a <code>NestedFilters</code> call might include a filter on the <code>PropertyName</code> parameter
     * of the <code>InputDataConfig</code> property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * The name of the property to use in the nested filters. The value must match a listed property name, such as
     * <code>InputDataConfig</code>.
     * </p>
     * 
     * @param nestedPropertyName
     *        The name of the property to use in the nested filters. The value must match a listed property name, such
     *        as <code>InputDataConfig</code>.
     */

    public void setNestedPropertyName(String nestedPropertyName) {
        this.nestedPropertyName = nestedPropertyName;
    }

    /**
     * <p>
     * The name of the property to use in the nested filters. The value must match a listed property name, such as
     * <code>InputDataConfig</code>.
     * </p>
     * 
     * @return The name of the property to use in the nested filters. The value must match a listed property name, such
     *         as <code>InputDataConfig</code>.
     */

    public String getNestedPropertyName() {
        return this.nestedPropertyName;
    }

    /**
     * <p>
     * The name of the property to use in the nested filters. The value must match a listed property name, such as
     * <code>InputDataConfig</code>.
     * </p>
     * 
     * @param nestedPropertyName
     *        The name of the property to use in the nested filters. The value must match a listed property name, such
     *        as <code>InputDataConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NestedFilters withNestedPropertyName(String nestedPropertyName) {
        setNestedPropertyName(nestedPropertyName);
        return this;
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code> value.
     * For example, a <code>NestedFilters</code> call might include a filter on the <code>PropertyName</code> parameter
     * of the <code>InputDataConfig</code> property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     * 
     * @return A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code>
     *         value. For example, a <code>NestedFilters</code> call might include a filter on the
     *         <code>PropertyName</code> parameter of the <code>InputDataConfig</code> property:
     *         <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code> value.
     * For example, a <code>NestedFilters</code> call might include a filter on the <code>PropertyName</code> parameter
     * of the <code>InputDataConfig</code> property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     * 
     * @param filters
     *        A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code>
     *        value. For example, a <code>NestedFilters</code> call might include a filter on the
     *        <code>PropertyName</code> parameter of the <code>InputDataConfig</code> property:
     *        <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code> value.
     * For example, a <code>NestedFilters</code> call might include a filter on the <code>PropertyName</code> parameter
     * of the <code>InputDataConfig</code> property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code>
     *        value. For example, a <code>NestedFilters</code> call might include a filter on the
     *        <code>PropertyName</code> parameter of the <code>InputDataConfig</code> property:
     *        <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NestedFilters withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code> value.
     * For example, a <code>NestedFilters</code> call might include a filter on the <code>PropertyName</code> parameter
     * of the <code>InputDataConfig</code> property: <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * </p>
     * 
     * @param filters
     *        A list of filters. Each filter acts on a property. Filters must contain at least one <code>Filters</code>
     *        value. For example, a <code>NestedFilters</code> call might include a filter on the
     *        <code>PropertyName</code> parameter of the <code>InputDataConfig</code> property:
     *        <code>InputDataConfig.DataSource.S3DataSource.S3Uri</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NestedFilters withFilters(java.util.Collection<Filter> filters) {
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
        if (getNestedPropertyName() != null)
            sb.append("NestedPropertyName: ").append(getNestedPropertyName()).append(",");
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

        if (obj instanceof NestedFilters == false)
            return false;
        NestedFilters other = (NestedFilters) obj;
        if (other.getNestedPropertyName() == null ^ this.getNestedPropertyName() == null)
            return false;
        if (other.getNestedPropertyName() != null && other.getNestedPropertyName().equals(this.getNestedPropertyName()) == false)
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

        hashCode = prime * hashCode + ((getNestedPropertyName() == null) ? 0 : getNestedPropertyName().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public NestedFilters clone() {
        try {
            return (NestedFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.NestedFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
