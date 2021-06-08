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
 * Details about the metric that the analysis used when it detected the anomaly. The metric what is analyzed to create
 * recommendations. It includes the name of the frame that was analyzed and the type and thread states used to derive
 * the metric value for that frame.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/Metric" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Metric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the method that appears as a frame in any stack in a profile.
     * </p>
     */
    private String frameName;
    /**
     * <p>
     * The list of application runtime thread states that is used to calculate the metric value for the frame.
     * </p>
     */
    private java.util.List<String> threadStates;
    /**
     * <p>
     * A type that specifies how a metric for a frame is analyzed. The supported value
     * <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is calculated
     * across the occurences of all frames in a profile.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the method that appears as a frame in any stack in a profile.
     * </p>
     * 
     * @param frameName
     *        The name of the method that appears as a frame in any stack in a profile.
     */

    public void setFrameName(String frameName) {
        this.frameName = frameName;
    }

    /**
     * <p>
     * The name of the method that appears as a frame in any stack in a profile.
     * </p>
     * 
     * @return The name of the method that appears as a frame in any stack in a profile.
     */

    public String getFrameName() {
        return this.frameName;
    }

    /**
     * <p>
     * The name of the method that appears as a frame in any stack in a profile.
     * </p>
     * 
     * @param frameName
     *        The name of the method that appears as a frame in any stack in a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withFrameName(String frameName) {
        setFrameName(frameName);
        return this;
    }

    /**
     * <p>
     * The list of application runtime thread states that is used to calculate the metric value for the frame.
     * </p>
     * 
     * @return The list of application runtime thread states that is used to calculate the metric value for the frame.
     */

    public java.util.List<String> getThreadStates() {
        return threadStates;
    }

    /**
     * <p>
     * The list of application runtime thread states that is used to calculate the metric value for the frame.
     * </p>
     * 
     * @param threadStates
     *        The list of application runtime thread states that is used to calculate the metric value for the frame.
     */

    public void setThreadStates(java.util.Collection<String> threadStates) {
        if (threadStates == null) {
            this.threadStates = null;
            return;
        }

        this.threadStates = new java.util.ArrayList<String>(threadStates);
    }

    /**
     * <p>
     * The list of application runtime thread states that is used to calculate the metric value for the frame.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThreadStates(java.util.Collection)} or {@link #withThreadStates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param threadStates
     *        The list of application runtime thread states that is used to calculate the metric value for the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withThreadStates(String... threadStates) {
        if (this.threadStates == null) {
            setThreadStates(new java.util.ArrayList<String>(threadStates.length));
        }
        for (String ele : threadStates) {
            this.threadStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of application runtime thread states that is used to calculate the metric value for the frame.
     * </p>
     * 
     * @param threadStates
     *        The list of application runtime thread states that is used to calculate the metric value for the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Metric withThreadStates(java.util.Collection<String> threadStates) {
        setThreadStates(threadStates);
        return this;
    }

    /**
     * <p>
     * A type that specifies how a metric for a frame is analyzed. The supported value
     * <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is calculated
     * across the occurences of all frames in a profile.
     * </p>
     * 
     * @param type
     *        A type that specifies how a metric for a frame is analyzed. The supported value
     *        <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is
     *        calculated across the occurences of all frames in a profile.
     * @see MetricType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * A type that specifies how a metric for a frame is analyzed. The supported value
     * <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is calculated
     * across the occurences of all frames in a profile.
     * </p>
     * 
     * @return A type that specifies how a metric for a frame is analyzed. The supported value
     *         <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is
     *         calculated across the occurences of all frames in a profile.
     * @see MetricType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * A type that specifies how a metric for a frame is analyzed. The supported value
     * <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is calculated
     * across the occurences of all frames in a profile.
     * </p>
     * 
     * @param type
     *        A type that specifies how a metric for a frame is analyzed. The supported value
     *        <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is
     *        calculated across the occurences of all frames in a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public Metric withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * A type that specifies how a metric for a frame is analyzed. The supported value
     * <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is calculated
     * across the occurences of all frames in a profile.
     * </p>
     * 
     * @param type
     *        A type that specifies how a metric for a frame is analyzed. The supported value
     *        <code>AggregatedRelativeTotalTime</code> is an aggregation of the metric value for one frame that is
     *        calculated across the occurences of all frames in a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricType
     */

    public Metric withType(MetricType type) {
        this.type = type.toString();
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
        if (getFrameName() != null)
            sb.append("FrameName: ").append(getFrameName()).append(",");
        if (getThreadStates() != null)
            sb.append("ThreadStates: ").append(getThreadStates()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Metric == false)
            return false;
        Metric other = (Metric) obj;
        if (other.getFrameName() == null ^ this.getFrameName() == null)
            return false;
        if (other.getFrameName() != null && other.getFrameName().equals(this.getFrameName()) == false)
            return false;
        if (other.getThreadStates() == null ^ this.getThreadStates() == null)
            return false;
        if (other.getThreadStates() != null && other.getThreadStates().equals(this.getThreadStates()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrameName() == null) ? 0 : getFrameName().hashCode());
        hashCode = prime * hashCode + ((getThreadStates() == null) ? 0 : getThreadStates().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Metric clone() {
        try {
            return (Metric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.MetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
