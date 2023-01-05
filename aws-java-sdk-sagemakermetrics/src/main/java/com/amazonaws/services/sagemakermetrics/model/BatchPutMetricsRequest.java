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
package com.amazonaws.services.sagemakermetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-metrics-2022-09-30/BatchPutMetrics" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Trial Component to associate with the metrics.
     * </p>
     */
    private String trialComponentName;
    /**
     * <p>
     * A list of raw metric values to put.
     * </p>
     */
    private java.util.List<RawMetricData> metricData;

    /**
     * <p>
     * The name of the Trial Component to associate with the metrics.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the Trial Component to associate with the metrics.
     */

    public void setTrialComponentName(String trialComponentName) {
        this.trialComponentName = trialComponentName;
    }

    /**
     * <p>
     * The name of the Trial Component to associate with the metrics.
     * </p>
     * 
     * @return The name of the Trial Component to associate with the metrics.
     */

    public String getTrialComponentName() {
        return this.trialComponentName;
    }

    /**
     * <p>
     * The name of the Trial Component to associate with the metrics.
     * </p>
     * 
     * @param trialComponentName
     *        The name of the Trial Component to associate with the metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMetricsRequest withTrialComponentName(String trialComponentName) {
        setTrialComponentName(trialComponentName);
        return this;
    }

    /**
     * <p>
     * A list of raw metric values to put.
     * </p>
     * 
     * @return A list of raw metric values to put.
     */

    public java.util.List<RawMetricData> getMetricData() {
        return metricData;
    }

    /**
     * <p>
     * A list of raw metric values to put.
     * </p>
     * 
     * @param metricData
     *        A list of raw metric values to put.
     */

    public void setMetricData(java.util.Collection<RawMetricData> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new java.util.ArrayList<RawMetricData>(metricData);
    }

    /**
     * <p>
     * A list of raw metric values to put.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricData(java.util.Collection)} or {@link #withMetricData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricData
     *        A list of raw metric values to put.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMetricsRequest withMetricData(RawMetricData... metricData) {
        if (this.metricData == null) {
            setMetricData(new java.util.ArrayList<RawMetricData>(metricData.length));
        }
        for (RawMetricData ele : metricData) {
            this.metricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of raw metric values to put.
     * </p>
     * 
     * @param metricData
     *        A list of raw metric values to put.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMetricsRequest withMetricData(java.util.Collection<RawMetricData> metricData) {
        setMetricData(metricData);
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
        if (getTrialComponentName() != null)
            sb.append("TrialComponentName: ").append(getTrialComponentName()).append(",");
        if (getMetricData() != null)
            sb.append("MetricData: ").append(getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutMetricsRequest == false)
            return false;
        BatchPutMetricsRequest other = (BatchPutMetricsRequest) obj;
        if (other.getTrialComponentName() == null ^ this.getTrialComponentName() == null)
            return false;
        if (other.getTrialComponentName() != null && other.getTrialComponentName().equals(this.getTrialComponentName()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialComponentName() == null) ? 0 : getTrialComponentName().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutMetricsRequest clone() {
        return (BatchPutMetricsRequest) super.clone();
    }

}
