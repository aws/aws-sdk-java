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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFleetMetricRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet metric to delete.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The expected version of the fleet metric to delete.
     * </p>
     */
    private Long expectedVersion;

    /**
     * <p>
     * The name of the fleet metric to delete.
     * </p>
     * 
     * @param metricName
     *        The name of the fleet metric to delete.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to delete.
     * </p>
     * 
     * @return The name of the fleet metric to delete.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to delete.
     * </p>
     * 
     * @param metricName
     *        The name of the fleet metric to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetMetricRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The expected version of the fleet metric to delete.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the fleet metric to delete.
     */

    public void setExpectedVersion(Long expectedVersion) {
        this.expectedVersion = expectedVersion;
    }

    /**
     * <p>
     * The expected version of the fleet metric to delete.
     * </p>
     * 
     * @return The expected version of the fleet metric to delete.
     */

    public Long getExpectedVersion() {
        return this.expectedVersion;
    }

    /**
     * <p>
     * The expected version of the fleet metric to delete.
     * </p>
     * 
     * @param expectedVersion
     *        The expected version of the fleet metric to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteFleetMetricRequest withExpectedVersion(Long expectedVersion) {
        setExpectedVersion(expectedVersion);
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
        if (getExpectedVersion() != null)
            sb.append("ExpectedVersion: ").append(getExpectedVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteFleetMetricRequest == false)
            return false;
        DeleteFleetMetricRequest other = (DeleteFleetMetricRequest) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getExpectedVersion() == null ^ this.getExpectedVersion() == null)
            return false;
        if (other.getExpectedVersion() != null && other.getExpectedVersion().equals(this.getExpectedVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getExpectedVersion() == null) ? 0 : getExpectedVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteFleetMetricRequest clone() {
        return (DeleteFleetMetricRequest) super.clone();
    }

}
