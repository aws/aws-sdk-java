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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a list of filters for choosing a subset of dimension values. Each filter consists of the dimension and one
 * of its values that you want to include. When multiple dimensions or values are specified, the dimensions are joined
 * with an AND operation and the values are joined with an OR operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/MetricSetDimensionFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricSetDimensionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimension that you want to filter on.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The list of filters that you are applying.
     * </p>
     */
    private java.util.List<Filter> filterList;

    /**
     * <p>
     * The dimension that you want to filter on.
     * </p>
     * 
     * @param name
     *        The dimension that you want to filter on.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The dimension that you want to filter on.
     * </p>
     * 
     * @return The dimension that you want to filter on.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The dimension that you want to filter on.
     * </p>
     * 
     * @param name
     *        The dimension that you want to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetDimensionFilter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of filters that you are applying.
     * </p>
     * 
     * @return The list of filters that you are applying.
     */

    public java.util.List<Filter> getFilterList() {
        return filterList;
    }

    /**
     * <p>
     * The list of filters that you are applying.
     * </p>
     * 
     * @param filterList
     *        The list of filters that you are applying.
     */

    public void setFilterList(java.util.Collection<Filter> filterList) {
        if (filterList == null) {
            this.filterList = null;
            return;
        }

        this.filterList = new java.util.ArrayList<Filter>(filterList);
    }

    /**
     * <p>
     * The list of filters that you are applying.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterList(java.util.Collection)} or {@link #withFilterList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterList
     *        The list of filters that you are applying.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetDimensionFilter withFilterList(Filter... filterList) {
        if (this.filterList == null) {
            setFilterList(new java.util.ArrayList<Filter>(filterList.length));
        }
        for (Filter ele : filterList) {
            this.filterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of filters that you are applying.
     * </p>
     * 
     * @param filterList
     *        The list of filters that you are applying.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetDimensionFilter withFilterList(java.util.Collection<Filter> filterList) {
        setFilterList(filterList);
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
        if (getFilterList() != null)
            sb.append("FilterList: ").append(getFilterList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricSetDimensionFilter == false)
            return false;
        MetricSetDimensionFilter other = (MetricSetDimensionFilter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFilterList() == null ^ this.getFilterList() == null)
            return false;
        if (other.getFilterList() != null && other.getFilterList().equals(this.getFilterList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFilterList() == null) ? 0 : getFilterList().hashCode());
        return hashCode;
    }

    @Override
    public MetricSetDimensionFilter clone() {
        try {
            return (MetricSetDimensionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.MetricSetDimensionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
