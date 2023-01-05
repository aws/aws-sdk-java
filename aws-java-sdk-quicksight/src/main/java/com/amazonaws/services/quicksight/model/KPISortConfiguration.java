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
 * The sort configuration of a KPI visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/KPISortConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KPISortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration of the trend group fields.
     * </p>
     */
    private java.util.List<FieldSortOptions> trendGroupSort;

    /**
     * <p>
     * The sort configuration of the trend group fields.
     * </p>
     * 
     * @return The sort configuration of the trend group fields.
     */

    public java.util.List<FieldSortOptions> getTrendGroupSort() {
        return trendGroupSort;
    }

    /**
     * <p>
     * The sort configuration of the trend group fields.
     * </p>
     * 
     * @param trendGroupSort
     *        The sort configuration of the trend group fields.
     */

    public void setTrendGroupSort(java.util.Collection<FieldSortOptions> trendGroupSort) {
        if (trendGroupSort == null) {
            this.trendGroupSort = null;
            return;
        }

        this.trendGroupSort = new java.util.ArrayList<FieldSortOptions>(trendGroupSort);
    }

    /**
     * <p>
     * The sort configuration of the trend group fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrendGroupSort(java.util.Collection)} or {@link #withTrendGroupSort(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param trendGroupSort
     *        The sort configuration of the trend group fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPISortConfiguration withTrendGroupSort(FieldSortOptions... trendGroupSort) {
        if (this.trendGroupSort == null) {
            setTrendGroupSort(new java.util.ArrayList<FieldSortOptions>(trendGroupSort.length));
        }
        for (FieldSortOptions ele : trendGroupSort) {
            this.trendGroupSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sort configuration of the trend group fields.
     * </p>
     * 
     * @param trendGroupSort
     *        The sort configuration of the trend group fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPISortConfiguration withTrendGroupSort(java.util.Collection<FieldSortOptions> trendGroupSort) {
        setTrendGroupSort(trendGroupSort);
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
        if (getTrendGroupSort() != null)
            sb.append("TrendGroupSort: ").append(getTrendGroupSort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KPISortConfiguration == false)
            return false;
        KPISortConfiguration other = (KPISortConfiguration) obj;
        if (other.getTrendGroupSort() == null ^ this.getTrendGroupSort() == null)
            return false;
        if (other.getTrendGroupSort() != null && other.getTrendGroupSort().equals(this.getTrendGroupSort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrendGroupSort() == null) ? 0 : getTrendGroupSort().hashCode());
        return hashCode;
    }

    @Override
    public KPISortConfiguration clone() {
        try {
            return (KPISortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.KPISortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
