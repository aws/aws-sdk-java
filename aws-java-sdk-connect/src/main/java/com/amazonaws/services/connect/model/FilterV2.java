/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the filter to apply when retrieving metrics with the <a
 * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_GetMetricDataV2.html">GetMetricDataV2</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/FilterV2" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterV2 implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     * <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>, <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>, <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and a maximum 5 keys.
     * </p>
     */
    private String filterKey;
    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>, you would
     * add queue IDs or ARNs in <code>FilterValues</code>.
     * </p>
     */
    private java.util.List<String> filterValues;

    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     * <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>, <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>, <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and a maximum 5 keys.
     * </p>
     * 
     * @param filterKey
     *        The key to use for filtering data. For example, <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     *        <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>, <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     *        <code>AGENT_HIERARCHY_LEVEL_THREE</code>, <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     *        <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and a maximum 5 keys.
     */

    public void setFilterKey(String filterKey) {
        this.filterKey = filterKey;
    }

    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     * <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>, <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>, <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and a maximum 5 keys.
     * </p>
     * 
     * @return The key to use for filtering data. For example, <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     *         <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>, <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     *         <code>AGENT_HIERARCHY_LEVEL_THREE</code>, <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     *         <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and a maximum 5 keys.
     */

    public String getFilterKey() {
        return this.filterKey;
    }

    /**
     * <p>
     * The key to use for filtering data. For example, <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     * <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>, <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     * <code>AGENT_HIERARCHY_LEVEL_THREE</code>, <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     * <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and a maximum 5 keys.
     * </p>
     * 
     * @param filterKey
     *        The key to use for filtering data. For example, <code>QUEUE</code>, <code>ROUTING_PROFILE, AGENT</code>,
     *        <code>CHANNEL</code>, <code>AGENT_HIERARCHY_LEVEL_ONE</code>, <code>AGENT_HIERARCHY_LEVEL_TWO</code>,
     *        <code>AGENT_HIERARCHY_LEVEL_THREE</code>, <code>AGENT_HIERARCHY_LEVEL_FOUR</code>,
     *        <code>AGENT_HIERARCHY_LEVEL_FIVE</code>. There must be at least 1 key and a maximum 5 keys.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterV2 withFilterKey(String filterKey) {
        setFilterKey(filterKey);
        return this;
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>, you would
     * add queue IDs or ARNs in <code>FilterValues</code>.
     * </p>
     * 
     * @return The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>,
     *         you would add queue IDs or ARNs in <code>FilterValues</code>.
     */

    public java.util.List<String> getFilterValues() {
        return filterValues;
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>, you would
     * add queue IDs or ARNs in <code>FilterValues</code>.
     * </p>
     * 
     * @param filterValues
     *        The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>,
     *        you would add queue IDs or ARNs in <code>FilterValues</code>.
     */

    public void setFilterValues(java.util.Collection<String> filterValues) {
        if (filterValues == null) {
            this.filterValues = null;
            return;
        }

        this.filterValues = new java.util.ArrayList<String>(filterValues);
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>, you would
     * add queue IDs or ARNs in <code>FilterValues</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterValues(java.util.Collection)} or {@link #withFilterValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterValues
     *        The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>,
     *        you would add queue IDs or ARNs in <code>FilterValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterV2 withFilterValues(String... filterValues) {
        if (this.filterValues == null) {
            setFilterValues(new java.util.ArrayList<String>(filterValues.length));
        }
        for (String ele : filterValues) {
            this.filterValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>, you would
     * add queue IDs or ARNs in <code>FilterValues</code>.
     * </p>
     * 
     * @param filterValues
     *        The identifiers to use for filtering data. For example, if you have a filter key of <code>QUEUE</code>,
     *        you would add queue IDs or ARNs in <code>FilterValues</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterV2 withFilterValues(java.util.Collection<String> filterValues) {
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

        if (obj instanceof FilterV2 == false)
            return false;
        FilterV2 other = (FilterV2) obj;
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
    public FilterV2 clone() {
        try {
            return (FilterV2) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.FilterV2Marshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
