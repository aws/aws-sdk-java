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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An error that occured when putting the metric data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-metrics-2022-09-30/BatchPutMetricsError"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutMetricsError implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The error code of an error that occured when attempting to put metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: An internal error occured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALIDATION_ERROR</code>: The metric data failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     * </p>
     * </li>
     * </ul>
     */
    private String code;
    /**
     * <p>
     * An index that corresponds to the metric in the request.
     * </p>
     */
    private Integer metricIndex;

    /**
     * <p>
     * The error code of an error that occured when attempting to put metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: An internal error occured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALIDATION_ERROR</code>: The metric data failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The error code of an error that occured when attempting to put metrics.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code>: An internal error occured.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VALIDATION_ERROR</code>: The metric data failed validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     *        </p>
     *        </li>
     * @see PutMetricsErrorCode
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code of an error that occured when attempting to put metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: An internal error occured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALIDATION_ERROR</code>: The metric data failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The error code of an error that occured when attempting to put metrics.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTERNAL_ERROR</code>: An internal error occured.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>VALIDATION_ERROR</code>: The metric data failed validation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     *         </p>
     *         </li>
     * @see PutMetricsErrorCode
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code of an error that occured when attempting to put metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: An internal error occured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALIDATION_ERROR</code>: The metric data failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The error code of an error that occured when attempting to put metrics.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code>: An internal error occured.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VALIDATION_ERROR</code>: The metric data failed validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PutMetricsErrorCode
     */

    public BatchPutMetricsError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error code of an error that occured when attempting to put metrics.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_ERROR</code>: An internal error occured.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VALIDATION_ERROR</code>: The metric data failed validation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     * </p>
     * </li>
     * </ul>
     * 
     * @param code
     *        The error code of an error that occured when attempting to put metrics.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>METRIC_LIMIT_EXCEEDED</code>: The maximum amount of metrics per resource is exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_ERROR</code>: An internal error occured.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>VALIDATION_ERROR</code>: The metric data failed validation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONFLICT_ERROR</code>: Multiple requests attempted to modify the same data simultaneously.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PutMetricsErrorCode
     */

    public BatchPutMetricsError withCode(PutMetricsErrorCode code) {
        this.code = code.toString();
        return this;
    }

    /**
     * <p>
     * An index that corresponds to the metric in the request.
     * </p>
     * 
     * @param metricIndex
     *        An index that corresponds to the metric in the request.
     */

    public void setMetricIndex(Integer metricIndex) {
        this.metricIndex = metricIndex;
    }

    /**
     * <p>
     * An index that corresponds to the metric in the request.
     * </p>
     * 
     * @return An index that corresponds to the metric in the request.
     */

    public Integer getMetricIndex() {
        return this.metricIndex;
    }

    /**
     * <p>
     * An index that corresponds to the metric in the request.
     * </p>
     * 
     * @param metricIndex
     *        An index that corresponds to the metric in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutMetricsError withMetricIndex(Integer metricIndex) {
        setMetricIndex(metricIndex);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMetricIndex() != null)
            sb.append("MetricIndex: ").append(getMetricIndex());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutMetricsError == false)
            return false;
        BatchPutMetricsError other = (BatchPutMetricsError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMetricIndex() == null ^ this.getMetricIndex() == null)
            return false;
        if (other.getMetricIndex() != null && other.getMetricIndex().equals(this.getMetricIndex()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMetricIndex() == null) ? 0 : getMetricIndex().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutMetricsError clone() {
        try {
            return (BatchPutMetricsError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakermetrics.model.transform.BatchPutMetricsErrorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
