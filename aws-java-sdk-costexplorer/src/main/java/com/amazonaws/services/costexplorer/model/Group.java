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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * One level of grouped data in the results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/Group" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Group implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     */
    private java.util.List<String> keys;
    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     */
    private java.util.Map<String, MetricValue> metrics;

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     * 
     * @return The keys that are included in this group.
     */

    public java.util.List<String> getKeys() {
        return keys;
    }

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     * 
     * @param keys
     *        The keys that are included in this group.
     */

    public void setKeys(java.util.Collection<String> keys) {
        if (keys == null) {
            this.keys = null;
            return;
        }

        this.keys = new java.util.ArrayList<String>(keys);
    }

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeys(java.util.Collection)} or {@link #withKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param keys
     *        The keys that are included in this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withKeys(String... keys) {
        if (this.keys == null) {
            setKeys(new java.util.ArrayList<String>(keys.length));
        }
        for (String ele : keys) {
            this.keys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The keys that are included in this group.
     * </p>
     * 
     * @param keys
     *        The keys that are included in this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withKeys(java.util.Collection<String> keys) {
        setKeys(keys);
        return this;
    }

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     * 
     * @return The metrics that are included in this group.
     */

    public java.util.Map<String, MetricValue> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     * 
     * @param metrics
     *        The metrics that are included in this group.
     */

    public void setMetrics(java.util.Map<String, MetricValue> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * The metrics that are included in this group.
     * </p>
     * 
     * @param metrics
     *        The metrics that are included in this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group withMetrics(java.util.Map<String, MetricValue> metrics) {
        setMetrics(metrics);
        return this;
    }

    public Group addMetricsEntry(String key, MetricValue value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, MetricValue>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Group clearMetricsEntries() {
        this.metrics = null;
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
        if (getKeys() != null)
            sb.append("Keys: ").append(getKeys()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Group == false)
            return false;
        Group other = (Group) obj;
        if (other.getKeys() == null ^ this.getKeys() == null)
            return false;
        if (other.getKeys() != null && other.getKeys().equals(this.getKeys()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeys() == null) ? 0 : getKeys().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public Group clone() {
        try {
            return (Group) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.GroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
