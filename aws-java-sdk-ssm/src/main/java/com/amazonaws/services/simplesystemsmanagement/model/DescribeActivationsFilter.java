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
 * Filter for the DescribeActivation API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeActivationsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActivationsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String filterKey;
    /**
     * <p>
     * The filter values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> filterValues;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param filterKey
     *        The name of the filter.
     * @see DescribeActivationsFilterKeys
     */

    public void setFilterKey(String filterKey) {
        this.filterKey = filterKey;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     * @see DescribeActivationsFilterKeys
     */

    public String getFilterKey() {
        return this.filterKey;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param filterKey
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribeActivationsFilterKeys
     */

    public DescribeActivationsFilter withFilterKey(String filterKey) {
        setFilterKey(filterKey);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param filterKey
     *        The name of the filter.
     * @see DescribeActivationsFilterKeys
     */

    public void setFilterKey(DescribeActivationsFilterKeys filterKey) {
        withFilterKey(filterKey);
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param filterKey
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DescribeActivationsFilterKeys
     */

    public DescribeActivationsFilter withFilterKey(DescribeActivationsFilterKeys filterKey) {
        this.filterKey = filterKey.toString();
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * 
     * @return The filter values.
     */

    public java.util.List<String> getFilterValues() {
        if (filterValues == null) {
            filterValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return filterValues;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * 
     * @param filterValues
     *        The filter values.
     */

    public void setFilterValues(java.util.Collection<String> filterValues) {
        if (filterValues == null) {
            this.filterValues = null;
            return;
        }

        this.filterValues = new com.amazonaws.internal.SdkInternalList<String>(filterValues);
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterValues(java.util.Collection)} or {@link #withFilterValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterValues
     *        The filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivationsFilter withFilterValues(String... filterValues) {
        if (this.filterValues == null) {
            setFilterValues(new com.amazonaws.internal.SdkInternalList<String>(filterValues.length));
        }
        for (String ele : filterValues) {
            this.filterValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter values.
     * </p>
     * 
     * @param filterValues
     *        The filter values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActivationsFilter withFilterValues(java.util.Collection<String> filterValues) {
        setFilterValues(filterValues);
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
        if (getFilterKey() != null)
            sb.append("FilterKey: ").append(getFilterKey()).append(",");
        if (getFilterValues() != null)
            sb.append("FilterValues: ").append(getFilterValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActivationsFilter == false)
            return false;
        DescribeActivationsFilter other = (DescribeActivationsFilter) obj;
        if (other.getFilterKey() == null ^ this.getFilterKey() == null)
            return false;
        if (other.getFilterKey() != null && other.getFilterKey().equals(this.getFilterKey()) == false)
            return false;
        if (other.getFilterValues() == null ^ this.getFilterValues() == null)
            return false;
        if (other.getFilterValues() != null && other.getFilterValues().equals(this.getFilterValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterKey() == null) ? 0 : getFilterKey().hashCode());
        hashCode = prime * hashCode + ((getFilterValues() == null) ? 0 : getFilterValues().hashCode());
        return hashCode;
    }

    @Override
    public DescribeActivationsFilter clone() {
        try {
            return (DescribeActivationsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simplesystemsmanagement.model.transform.DescribeActivationsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
