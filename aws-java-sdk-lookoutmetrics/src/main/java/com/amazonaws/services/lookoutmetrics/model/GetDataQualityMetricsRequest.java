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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/GetDataQualityMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataQualityMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific data quality metric set.
     * </p>
     */
    private String metricSetArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The Amazon Resource Name (ARN) of the anomaly detector that you want to investigate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityMetricsRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific data quality metric set.
     * </p>
     * 
     * @param metricSetArn
     *        The Amazon Resource Name (ARN) of a specific data quality metric set.
     */

    public void setMetricSetArn(String metricSetArn) {
        this.metricSetArn = metricSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific data quality metric set.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a specific data quality metric set.
     */

    public String getMetricSetArn() {
        return this.metricSetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a specific data quality metric set.
     * </p>
     * 
     * @param metricSetArn
     *        The Amazon Resource Name (ARN) of a specific data quality metric set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataQualityMetricsRequest withMetricSetArn(String metricSetArn) {
        setMetricSetArn(metricSetArn);
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
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getMetricSetArn() != null)
            sb.append("MetricSetArn: ").append(getMetricSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataQualityMetricsRequest == false)
            return false;
        GetDataQualityMetricsRequest other = (GetDataQualityMetricsRequest) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getMetricSetArn() == null ^ this.getMetricSetArn() == null)
            return false;
        if (other.getMetricSetArn() != null && other.getMetricSetArn().equals(this.getMetricSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getMetricSetArn() == null) ? 0 : getMetricSetArn().hashCode());
        return hashCode;
    }

    @Override
    public GetDataQualityMetricsRequest clone() {
        return (GetDataQualityMetricsRequest) super.clone();
    }

}
