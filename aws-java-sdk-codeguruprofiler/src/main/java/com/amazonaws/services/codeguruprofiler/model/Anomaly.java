/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an anomaly in a specific metric of application profile. The anomaly is detected using analysis of the
 * metric data over a period of time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/Anomaly" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Anomaly implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the instances of the detected anomalies during the requested period.
     * </p>
     */
    private java.util.List<AnomalyInstance> instances;
    /**
     * <p>
     * Details about the metric that the analysis used when it detected the anomaly. The metric includes the name of the
     * frame that was analyzed with the type and thread states used to derive the metric value for that frame.
     * </p>
     */
    private Metric metric;
    /**
     * <p>
     * The reason for which metric was flagged as anomalous.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * A list of the instances of the detected anomalies during the requested period.
     * </p>
     * 
     * @return A list of the instances of the detected anomalies during the requested period.
     */

    public java.util.List<AnomalyInstance> getInstances() {
        return instances;
    }

    /**
     * <p>
     * A list of the instances of the detected anomalies during the requested period.
     * </p>
     * 
     * @param instances
     *        A list of the instances of the detected anomalies during the requested period.
     */

    public void setInstances(java.util.Collection<AnomalyInstance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new java.util.ArrayList<AnomalyInstance>(instances);
    }

    /**
     * <p>
     * A list of the instances of the detected anomalies during the requested period.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstances(java.util.Collection)} or {@link #withInstances(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instances
     *        A list of the instances of the detected anomalies during the requested period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withInstances(AnomalyInstance... instances) {
        if (this.instances == null) {
            setInstances(new java.util.ArrayList<AnomalyInstance>(instances.length));
        }
        for (AnomalyInstance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instances of the detected anomalies during the requested period.
     * </p>
     * 
     * @param instances
     *        A list of the instances of the detected anomalies during the requested period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withInstances(java.util.Collection<AnomalyInstance> instances) {
        setInstances(instances);
        return this;
    }

    /**
     * <p>
     * Details about the metric that the analysis used when it detected the anomaly. The metric includes the name of the
     * frame that was analyzed with the type and thread states used to derive the metric value for that frame.
     * </p>
     * 
     * @param metric
     *        Details about the metric that the analysis used when it detected the anomaly. The metric includes the name
     *        of the frame that was analyzed with the type and thread states used to derive the metric value for that
     *        frame.
     */

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * Details about the metric that the analysis used when it detected the anomaly. The metric includes the name of the
     * frame that was analyzed with the type and thread states used to derive the metric value for that frame.
     * </p>
     * 
     * @return Details about the metric that the analysis used when it detected the anomaly. The metric includes the
     *         name of the frame that was analyzed with the type and thread states used to derive the metric value for
     *         that frame.
     */

    public Metric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * Details about the metric that the analysis used when it detected the anomaly. The metric includes the name of the
     * frame that was analyzed with the type and thread states used to derive the metric value for that frame.
     * </p>
     * 
     * @param metric
     *        Details about the metric that the analysis used when it detected the anomaly. The metric includes the name
     *        of the frame that was analyzed with the type and thread states used to derive the metric value for that
     *        frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withMetric(Metric metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The reason for which metric was flagged as anomalous.
     * </p>
     * 
     * @param reason
     *        The reason for which metric was flagged as anomalous.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for which metric was flagged as anomalous.
     * </p>
     * 
     * @return The reason for which metric was flagged as anomalous.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for which metric was flagged as anomalous.
     * </p>
     * 
     * @param reason
     *        The reason for which metric was flagged as anomalous.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Anomaly withReason(String reason) {
        setReason(reason);
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
        if (getInstances() != null)
            sb.append("Instances: ").append(getInstances()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Anomaly == false)
            return false;
        Anomaly other = (Anomaly) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public Anomaly clone() {
        try {
            return (Anomaly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.AnomalyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
