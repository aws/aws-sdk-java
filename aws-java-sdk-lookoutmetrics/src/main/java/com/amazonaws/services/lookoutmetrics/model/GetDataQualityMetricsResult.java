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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetDataQualityMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataQualityMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     * </p>
     */
    private java.util.List<AnomalyDetectorDataQualityMetric> anomalyDetectorDataQualityMetricList;

    /**
     * <p>
     * A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     * </p>
     * 
     * @return A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     */

    public java.util.List<AnomalyDetectorDataQualityMetric> getAnomalyDetectorDataQualityMetricList() {
        return anomalyDetectorDataQualityMetricList;
    }

    /**
     * <p>
     * A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     * </p>
     * 
     * @param anomalyDetectorDataQualityMetricList
     *        A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     */

    public void setAnomalyDetectorDataQualityMetricList(java.util.Collection<AnomalyDetectorDataQualityMetric> anomalyDetectorDataQualityMetricList) {
        if (anomalyDetectorDataQualityMetricList == null) {
            this.anomalyDetectorDataQualityMetricList = null;
            return;
        }

        this.anomalyDetectorDataQualityMetricList = new java.util.ArrayList<AnomalyDetectorDataQualityMetric>(anomalyDetectorDataQualityMetricList);
    }

    /**
     * <p>
     * A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalyDetectorDataQualityMetricList(java.util.Collection)} or
     * {@link #withAnomalyDetectorDataQualityMetricList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param anomalyDetectorDataQualityMetricList
     *        A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityMetricsResult withAnomalyDetectorDataQualityMetricList(AnomalyDetectorDataQualityMetric... anomalyDetectorDataQualityMetricList) {
        if (this.anomalyDetectorDataQualityMetricList == null) {
            setAnomalyDetectorDataQualityMetricList(new java.util.ArrayList<AnomalyDetectorDataQualityMetric>(anomalyDetectorDataQualityMetricList.length));
        }
        for (AnomalyDetectorDataQualityMetric ele : anomalyDetectorDataQualityMetricList) {
            this.anomalyDetectorDataQualityMetricList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     * </p>
     * 
     * @param anomalyDetectorDataQualityMetricList
     *        A list of the data quality metrics for the <code>AnomalyDetectorArn</code> that you requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityMetricsResult withAnomalyDetectorDataQualityMetricList(
            java.util.Collection<AnomalyDetectorDataQualityMetric> anomalyDetectorDataQualityMetricList) {
        setAnomalyDetectorDataQualityMetricList(anomalyDetectorDataQualityMetricList);
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
        if (getAnomalyDetectorDataQualityMetricList() != null)
            sb.append("AnomalyDetectorDataQualityMetricList: ").append(getAnomalyDetectorDataQualityMetricList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataQualityMetricsResult == false)
            return false;
        GetDataQualityMetricsResult other = (GetDataQualityMetricsResult) obj;
        if (other.getAnomalyDetectorDataQualityMetricList() == null ^ this.getAnomalyDetectorDataQualityMetricList() == null)
            return false;
        if (other.getAnomalyDetectorDataQualityMetricList() != null
                && other.getAnomalyDetectorDataQualityMetricList().equals(this.getAnomalyDetectorDataQualityMetricList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorDataQualityMetricList() == null) ? 0 : getAnomalyDetectorDataQualityMetricList().hashCode());
        return hashCode;
    }

    @Override
    public GetDataQualityMetricsResult clone() {
        try {
            return (GetDataQualityMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
