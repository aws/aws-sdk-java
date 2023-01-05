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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DetectMetricSetConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectMetricSetConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An anomaly detector ARN.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * A data source.
     * </p>
     */
    private AutoDetectionMetricSource autoDetectionMetricSource;

    /**
     * <p>
     * An anomaly detector ARN.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        An anomaly detector ARN.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * An anomaly detector ARN.
     * </p>
     * 
     * @return An anomaly detector ARN.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * An anomaly detector ARN.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        An anomaly detector ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMetricSetConfigRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * A data source.
     * </p>
     * 
     * @param autoDetectionMetricSource
     *        A data source.
     */

    public void setAutoDetectionMetricSource(AutoDetectionMetricSource autoDetectionMetricSource) {
        this.autoDetectionMetricSource = autoDetectionMetricSource;
    }

    /**
     * <p>
     * A data source.
     * </p>
     * 
     * @return A data source.
     */

    public AutoDetectionMetricSource getAutoDetectionMetricSource() {
        return this.autoDetectionMetricSource;
    }

    /**
     * <p>
     * A data source.
     * </p>
     * 
     * @param autoDetectionMetricSource
     *        A data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectMetricSetConfigRequest withAutoDetectionMetricSource(AutoDetectionMetricSource autoDetectionMetricSource) {
        setAutoDetectionMetricSource(autoDetectionMetricSource);
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
        if (getAutoDetectionMetricSource() != null)
            sb.append("AutoDetectionMetricSource: ").append(getAutoDetectionMetricSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectMetricSetConfigRequest == false)
            return false;
        DetectMetricSetConfigRequest other = (DetectMetricSetConfigRequest) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getAutoDetectionMetricSource() == null ^ this.getAutoDetectionMetricSource() == null)
            return false;
        if (other.getAutoDetectionMetricSource() != null && other.getAutoDetectionMetricSource().equals(this.getAutoDetectionMetricSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getAutoDetectionMetricSource() == null) ? 0 : getAutoDetectionMetricSource().hashCode());
        return hashCode;
    }

    @Override
    public DetectMetricSetConfigRequest clone() {
        return (DetectMetricSetConfigRequest) super.clone();
    }

}
