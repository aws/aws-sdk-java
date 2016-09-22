/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the inputs for PutMetricData.
 * </p>
 */
public class PutMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note>
     * <p>
     * You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for other
     * Amazon Web Services products that send metrics to Amazon CloudWatch.
     * </p>
     * </note>
     */
    private String namespace;
    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDatum> metricData;

    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note>
     * <p>
     * You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for other
     * Amazon Web Services products that send metrics to Amazon CloudWatch.
     * </p>
     * </note>
     * 
     * @param namespace
     *        The namespace for the metric data.</p> <note>
     *        <p>
     *        You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for
     *        other Amazon Web Services products that send metrics to Amazon CloudWatch.
     *        </p>
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note>
     * <p>
     * You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for other
     * Amazon Web Services products that send metrics to Amazon CloudWatch.
     * </p>
     * </note>
     * 
     * @return The namespace for the metric data.</p> <note>
     *         <p>
     *         You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved
     *         for other Amazon Web Services products that send metrics to Amazon CloudWatch.
     *         </p>
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace for the metric data.
     * </p>
     * <note>
     * <p>
     * You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for other
     * Amazon Web Services products that send metrics to Amazon CloudWatch.
     * </p>
     * </note>
     * 
     * @param namespace
     *        The namespace for the metric data.</p> <note>
     *        <p>
     *        You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for
     *        other Amazon Web Services products that send metrics to Amazon CloudWatch.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     * 
     * @return A list of data describing the metric.
     */

    public java.util.List<MetricDatum> getMetricData() {
        if (metricData == null) {
            metricData = new com.amazonaws.internal.SdkInternalList<MetricDatum>();
        }
        return metricData;
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     * 
     * @param metricData
     *        A list of data describing the metric.
     */

    public void setMetricData(java.util.Collection<MetricDatum> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new com.amazonaws.internal.SdkInternalList<MetricDatum>(metricData);
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricData(java.util.Collection)} or {@link #withMetricData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricData
     *        A list of data describing the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withMetricData(MetricDatum... metricData) {
        if (this.metricData == null) {
            setMetricData(new com.amazonaws.internal.SdkInternalList<MetricDatum>(metricData.length));
        }
        for (MetricDatum ele : metricData) {
            this.metricData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data describing the metric.
     * </p>
     * 
     * @param metricData
     *        A list of data describing the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutMetricDataRequest withMetricData(java.util.Collection<MetricDatum> metricData) {
        setMetricData(metricData);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getMetricData() != null)
            sb.append("MetricData: " + getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutMetricDataRequest == false)
            return false;
        PutMetricDataRequest other = (PutMetricDataRequest) obj;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
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

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public PutMetricDataRequest clone() {
        return (PutMetricDataRequest) super.clone();
    }
}
