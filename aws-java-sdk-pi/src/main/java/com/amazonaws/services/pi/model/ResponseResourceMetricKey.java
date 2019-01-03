/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object describing a Performance Insights metric and one or more dimensions for that metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ResponseResourceMetricKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResponseResourceMetricKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String metric;
    /**
     * <p>
     * The valid dimensions for the metric.
     * </p>
     */
    private java.util.Map<String, String> dimensions;

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        The name of a Performance Insights metric to be measured.</p>
     *        <p>
     *        Valid values for <code>Metric</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of a Performance Insights metric to be measured.</p>
     *         <p>
     *         Valid values for <code>Metric</code> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *         engine.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *         </p>
     *         </li>
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        The name of a Performance Insights metric to be measured.</p>
     *        <p>
     *        Valid values for <code>Metric</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseResourceMetricKey withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The valid dimensions for the metric.
     * </p>
     * 
     * @return The valid dimensions for the metric.
     */

    public java.util.Map<String, String> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The valid dimensions for the metric.
     * </p>
     * 
     * @param dimensions
     *        The valid dimensions for the metric.
     */

    public void setDimensions(java.util.Map<String, String> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The valid dimensions for the metric.
     * </p>
     * 
     * @param dimensions
     *        The valid dimensions for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseResourceMetricKey withDimensions(java.util.Map<String, String> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    public ResponseResourceMetricKey addDimensionsEntry(String key, String value) {
        if (null == this.dimensions) {
            this.dimensions = new java.util.HashMap<String, String>();
        }
        if (this.dimensions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.dimensions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Dimensions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResponseResourceMetricKey clearDimensionsEntries() {
        this.dimensions = null;
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResponseResourceMetricKey == false)
            return false;
        ResponseResourceMetricKey other = (ResponseResourceMetricKey) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public ResponseResourceMetricKey clone() {
        try {
            return (ResponseResourceMetricKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.ResponseResourceMetricKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
