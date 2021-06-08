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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCustomMetricRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric. Cannot be updated.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     * 
     * @return The name of the custom metric. Cannot be updated.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the custom metric. Cannot be updated.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric. Cannot be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomMetricRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated.
     * </p>
     * 
     * @param displayName
     *        Field represents a friendly name in the console for the custom metric, it doesn't have to be unique. Don't
     *        use this name as the metric identifier in the device metric report. Can be updated.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated.
     * </p>
     * 
     * @return Field represents a friendly name in the console for the custom metric, it doesn't have to be unique.
     *         Don't use this name as the metric identifier in the device metric report. Can be updated.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * Field represents a friendly name in the console for the custom metric, it doesn't have to be unique. Don't use
     * this name as the metric identifier in the device metric report. Can be updated.
     * </p>
     * 
     * @param displayName
     *        Field represents a friendly name in the console for the custom metric, it doesn't have to be unique. Don't
     *        use this name as the metric identifier in the device metric report. Can be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCustomMetricRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCustomMetricRequest == false)
            return false;
        UpdateCustomMetricRequest other = (UpdateCustomMetricRequest) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCustomMetricRequest clone() {
        return (UpdateCustomMetricRequest) super.clone();
    }

}
