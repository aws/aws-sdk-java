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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/MetricCollectionType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricCollectionType implements Serializable, Cloneable {

    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     */
    private String metric;

    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        One of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the following metrics:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GroupMinSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupMaxSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupInServiceInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupPendingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupStandbyInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTerminatingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTotalInstances</code>
     *         </p>
     *         </li>
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * One of the following metrics:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        One of the following metrics:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricCollectionType withMetric(String metric) {
        setMetric(metric);
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
            sb.append("Metric: ").append(getMetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricCollectionType == false)
            return false;
        MetricCollectionType other = (MetricCollectionType) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        return hashCode;
    }

    @Override
    public MetricCollectionType clone() {
        try {
            return (MetricCollectionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
