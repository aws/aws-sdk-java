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
 * An array of <code>DataQualityMetric</code> objects that describes one or more data quality metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/MetricSetDataQualityMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricSetDataQualityMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data quality metric array.
     * </p>
     */
    private String metricSetArn;
    /**
     * <p>
     * The array of data quality metrics contained in the data quality metric set.
     * </p>
     */
    private java.util.List<DataQualityMetric> dataQualityMetricList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data quality metric array.
     * </p>
     * 
     * @param metricSetArn
     *        The Amazon Resource Name (ARN) of the data quality metric array.
     */

    public void setMetricSetArn(String metricSetArn) {
        this.metricSetArn = metricSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data quality metric array.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data quality metric array.
     */

    public String getMetricSetArn() {
        return this.metricSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data quality metric array.
     * </p>
     * 
     * @param metricSetArn
     *        The Amazon Resource Name (ARN) of the data quality metric array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetDataQualityMetric withMetricSetArn(String metricSetArn) {
        setMetricSetArn(metricSetArn);
        return this;
    }

    /**
     * <p>
     * The array of data quality metrics contained in the data quality metric set.
     * </p>
     * 
     * @return The array of data quality metrics contained in the data quality metric set.
     */

    public java.util.List<DataQualityMetric> getDataQualityMetricList() {
        return dataQualityMetricList;
    }

    /**
     * <p>
     * The array of data quality metrics contained in the data quality metric set.
     * </p>
     * 
     * @param dataQualityMetricList
     *        The array of data quality metrics contained in the data quality metric set.
     */

    public void setDataQualityMetricList(java.util.Collection<DataQualityMetric> dataQualityMetricList) {
        if (dataQualityMetricList == null) {
            this.dataQualityMetricList = null;
            return;
        }

        this.dataQualityMetricList = new java.util.ArrayList<DataQualityMetric>(dataQualityMetricList);
    }

    /**
     * <p>
     * The array of data quality metrics contained in the data quality metric set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataQualityMetricList(java.util.Collection)} or
     * {@link #withDataQualityMetricList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataQualityMetricList
     *        The array of data quality metrics contained in the data quality metric set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetDataQualityMetric withDataQualityMetricList(DataQualityMetric... dataQualityMetricList) {
        if (this.dataQualityMetricList == null) {
            setDataQualityMetricList(new java.util.ArrayList<DataQualityMetric>(dataQualityMetricList.length));
        }
        for (DataQualityMetric ele : dataQualityMetricList) {
            this.dataQualityMetricList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of data quality metrics contained in the data quality metric set.
     * </p>
     * 
     * @param dataQualityMetricList
     *        The array of data quality metrics contained in the data quality metric set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricSetDataQualityMetric withDataQualityMetricList(java.util.Collection<DataQualityMetric> dataQualityMetricList) {
        setDataQualityMetricList(dataQualityMetricList);
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
        if (getMetricSetArn() != null)
            sb.append("MetricSetArn: ").append(getMetricSetArn()).append(",");
        if (getDataQualityMetricList() != null)
            sb.append("DataQualityMetricList: ").append(getDataQualityMetricList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricSetDataQualityMetric == false)
            return false;
        MetricSetDataQualityMetric other = (MetricSetDataQualityMetric) obj;
        if (other.getMetricSetArn() == null ^ this.getMetricSetArn() == null)
            return false;
        if (other.getMetricSetArn() != null && other.getMetricSetArn().equals(this.getMetricSetArn()) == false)
            return false;
        if (other.getDataQualityMetricList() == null ^ this.getDataQualityMetricList() == null)
            return false;
        if (other.getDataQualityMetricList() != null && other.getDataQualityMetricList().equals(this.getDataQualityMetricList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricSetArn() == null) ? 0 : getMetricSetArn().hashCode());
        hashCode = prime * hashCode + ((getDataQualityMetricList() == null) ? 0 : getDataQualityMetricList().hashCode());
        return hashCode;
    }

    @Override
    public MetricSetDataQualityMetric clone() {
        try {
            return (MetricSetDataQualityMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.MetricSetDataQualityMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
