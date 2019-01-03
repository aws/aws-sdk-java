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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Measurements of how well the <code>MLModel</code> performed on known observations. One of the following metrics is
 * returned, based on the type of the <code>MLModel</code>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * BinaryAUC: The binary <code>MLModel</code> uses the Area Under the Curve (AUC) technique to measure performance.
 * </p>
 * </li>
 * <li>
 * <p>
 * RegressionRMSE: The regression <code>MLModel</code> uses the Root Mean Square Error (RMSE) technique to measure
 * performance. RMSE measures the difference between predicted and actual values for a single variable.
 * </p>
 * </li>
 * <li>
 * <p>
 * MulticlassAvgFScore: The multiclass <code>MLModel</code> uses the F1 score technique to measure performance.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about performance metrics, please see the <a
 * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon Machine Learning Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceMetrics implements Serializable, Cloneable, StructuredPojo {

    private com.amazonaws.internal.SdkInternalMap<String, String> properties;

    /**
     * @return
     */

    public java.util.Map<String, String> getProperties() {
        if (properties == null) {
            properties = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return properties;
    }

    /**
     * @param properties
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(properties);
    }

    /**
     * @param properties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceMetrics withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    public PerformanceMetrics addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PerformanceMetrics clearPropertiesEntries() {
        this.properties = null;
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
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PerformanceMetrics == false)
            return false;
        PerformanceMetrics other = (PerformanceMetrics) obj;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public PerformanceMetrics clone() {
        try {
            return (PerformanceMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.machinelearning.model.transform.PerformanceMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
