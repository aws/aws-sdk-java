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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The way to sort the resulting response based on metrics. By default resources are sorted based on
 * <code>AGENTS_ONLINE</code>, <code>DESCENDING</code>. The metric collection is sorted based on the input metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CurrentMetricSortCriteria" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentMetricSortCriteria implements Serializable, Cloneable, StructuredPojo {

    private String sortByMetric;
    /**
     * <p>
     * The way to sort.
     * </p>
     */
    private String sortOrder;

    /**
     * @param sortByMetric
     * @see CurrentMetricName
     */

    public void setSortByMetric(String sortByMetric) {
        this.sortByMetric = sortByMetric;
    }

    /**
     * @return
     * @see CurrentMetricName
     */

    public String getSortByMetric() {
        return this.sortByMetric;
    }

    /**
     * @param sortByMetric
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrentMetricName
     */

    public CurrentMetricSortCriteria withSortByMetric(String sortByMetric) {
        setSortByMetric(sortByMetric);
        return this;
    }

    /**
     * @param sortByMetric
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CurrentMetricName
     */

    public CurrentMetricSortCriteria withSortByMetric(CurrentMetricName sortByMetric) {
        this.sortByMetric = sortByMetric.toString();
        return this;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * 
     * @param sortOrder
     *        The way to sort.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * 
     * @return The way to sort.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * 
     * @param sortOrder
     *        The way to sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public CurrentMetricSortCriteria withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The way to sort.
     * </p>
     * 
     * @param sortOrder
     *        The way to sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public CurrentMetricSortCriteria withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getSortByMetric() != null)
            sb.append("SortByMetric: ").append(getSortByMetric()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CurrentMetricSortCriteria == false)
            return false;
        CurrentMetricSortCriteria other = (CurrentMetricSortCriteria) obj;
        if (other.getSortByMetric() == null ^ this.getSortByMetric() == null)
            return false;
        if (other.getSortByMetric() != null && other.getSortByMetric().equals(this.getSortByMetric()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortByMetric() == null) ? 0 : getSortByMetric().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public CurrentMetricSortCriteria clone() {
        try {
            return (CurrentMetricSortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CurrentMetricSortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
