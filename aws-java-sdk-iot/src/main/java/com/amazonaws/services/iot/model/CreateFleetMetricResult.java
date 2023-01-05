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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetMetricResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new fleet metric.
     * </p>
     */
    private String metricArn;

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     * 
     * @param metricName
     *        The name of the fleet metric to create.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     * 
     * @return The name of the fleet metric to create.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the fleet metric to create.
     * </p>
     * 
     * @param metricName
     *        The name of the fleet metric to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new fleet metric.
     * </p>
     * 
     * @param metricArn
     *        The Amazon Resource Name (ARN) of the new fleet metric.
     */

    public void setMetricArn(String metricArn) {
        this.metricArn = metricArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new fleet metric.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new fleet metric.
     */

    public String getMetricArn() {
        return this.metricArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new fleet metric.
     * </p>
     * 
     * @param metricArn
     *        The Amazon Resource Name (ARN) of the new fleet metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetMetricResult withMetricArn(String metricArn) {
        setMetricArn(metricArn);
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
        if (getMetricArn() != null)
            sb.append("MetricArn: ").append(getMetricArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetMetricResult == false)
            return false;
        CreateFleetMetricResult other = (CreateFleetMetricResult) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricArn() == null ^ this.getMetricArn() == null)
            return false;
        if (other.getMetricArn() != null && other.getMetricArn().equals(this.getMetricArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricArn() == null) ? 0 : getMetricArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetMetricResult clone() {
        try {
            return (CreateFleetMetricResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
