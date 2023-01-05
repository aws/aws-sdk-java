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
 * The configuration of the alert filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/AlertFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlertFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of measures that you want to get alerts for.
     * </p>
     */
    private java.util.List<String> metricList;
    /**
     * <p>
     * The list of DimensionFilter objects that are used for dimension-based filtering.
     * </p>
     */
    private java.util.List<DimensionFilter> dimensionFilterList;

    /**
     * <p>
     * The list of measures that you want to get alerts for.
     * </p>
     * 
     * @return The list of measures that you want to get alerts for.
     */

    public java.util.List<String> getMetricList() {
        return metricList;
    }

    /**
     * <p>
     * The list of measures that you want to get alerts for.
     * </p>
     * 
     * @param metricList
     *        The list of measures that you want to get alerts for.
     */

    public void setMetricList(java.util.Collection<String> metricList) {
        if (metricList == null) {
            this.metricList = null;
            return;
        }

        this.metricList = new java.util.ArrayList<String>(metricList);
    }

    /**
     * <p>
     * The list of measures that you want to get alerts for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricList(java.util.Collection)} or {@link #withMetricList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricList
     *        The list of measures that you want to get alerts for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertFilters withMetricList(String... metricList) {
        if (this.metricList == null) {
            setMetricList(new java.util.ArrayList<String>(metricList.length));
        }
        for (String ele : metricList) {
            this.metricList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of measures that you want to get alerts for.
     * </p>
     * 
     * @param metricList
     *        The list of measures that you want to get alerts for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertFilters withMetricList(java.util.Collection<String> metricList) {
        setMetricList(metricList);
        return this;
    }

    /**
     * <p>
     * The list of DimensionFilter objects that are used for dimension-based filtering.
     * </p>
     * 
     * @return The list of DimensionFilter objects that are used for dimension-based filtering.
     */

    public java.util.List<DimensionFilter> getDimensionFilterList() {
        return dimensionFilterList;
    }

    /**
     * <p>
     * The list of DimensionFilter objects that are used for dimension-based filtering.
     * </p>
     * 
     * @param dimensionFilterList
     *        The list of DimensionFilter objects that are used for dimension-based filtering.
     */

    public void setDimensionFilterList(java.util.Collection<DimensionFilter> dimensionFilterList) {
        if (dimensionFilterList == null) {
            this.dimensionFilterList = null;
            return;
        }

        this.dimensionFilterList = new java.util.ArrayList<DimensionFilter>(dimensionFilterList);
    }

    /**
     * <p>
     * The list of DimensionFilter objects that are used for dimension-based filtering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionFilterList(java.util.Collection)} or {@link #withDimensionFilterList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param dimensionFilterList
     *        The list of DimensionFilter objects that are used for dimension-based filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertFilters withDimensionFilterList(DimensionFilter... dimensionFilterList) {
        if (this.dimensionFilterList == null) {
            setDimensionFilterList(new java.util.ArrayList<DimensionFilter>(dimensionFilterList.length));
        }
        for (DimensionFilter ele : dimensionFilterList) {
            this.dimensionFilterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of DimensionFilter objects that are used for dimension-based filtering.
     * </p>
     * 
     * @param dimensionFilterList
     *        The list of DimensionFilter objects that are used for dimension-based filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlertFilters withDimensionFilterList(java.util.Collection<DimensionFilter> dimensionFilterList) {
        setDimensionFilterList(dimensionFilterList);
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
        if (getMetricList() != null)
            sb.append("MetricList: ").append(getMetricList()).append(",");
        if (getDimensionFilterList() != null)
            sb.append("DimensionFilterList: ").append(getDimensionFilterList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlertFilters == false)
            return false;
        AlertFilters other = (AlertFilters) obj;
        if (other.getMetricList() == null ^ this.getMetricList() == null)
            return false;
        if (other.getMetricList() != null && other.getMetricList().equals(this.getMetricList()) == false)
            return false;
        if (other.getDimensionFilterList() == null ^ this.getDimensionFilterList() == null)
            return false;
        if (other.getDimensionFilterList() != null && other.getDimensionFilterList().equals(this.getDimensionFilterList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricList() == null) ? 0 : getMetricList().hashCode());
        hashCode = prime * hashCode + ((getDimensionFilterList() == null) ? 0 : getDimensionFilterList().hashCode());
        return hashCode;
    }

    @Override
    public AlertFilters clone() {
        try {
            return (AlertFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.AlertFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
