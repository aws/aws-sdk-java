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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCustomMetricResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the custom metric to be used in the metric report.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric, e.g.
     * <code>arn:<i>aws-partition</i>:iot:<i>region</i>:<i>accountId</i>:custommetric/<i>metricName</i> </code>
     * </p>
     */
    private String metricArn;

    /**
     * <p>
     * The name of the custom metric to be used in the metric report.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric to be used in the metric report.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the custom metric to be used in the metric report.
     * </p>
     * 
     * @return The name of the custom metric to be used in the metric report.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the custom metric to be used in the metric report.
     * </p>
     * 
     * @param metricName
     *        The name of the custom metric to be used in the metric report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetricResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric, e.g.
     * <code>arn:<i>aws-partition</i>:iot:<i>region</i>:<i>accountId</i>:custommetric/<i>metricName</i> </code>
     * </p>
     * 
     * @param metricArn
     *        The Amazon Resource Number (ARN) of the custom metric, e.g.
     *        <code>arn:<i>aws-partition</i>:iot:<i>region</i>:<i>accountId</i>:custommetric/<i>metricName</i> </code>
     */

    public void setMetricArn(String metricArn) {
        this.metricArn = metricArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric, e.g.
     * <code>arn:<i>aws-partition</i>:iot:<i>region</i>:<i>accountId</i>:custommetric/<i>metricName</i> </code>
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the custom metric, e.g.
     *         <code>arn:<i>aws-partition</i>:iot:<i>region</i>:<i>accountId</i>:custommetric/<i>metricName</i> </code>
     */

    public String getMetricArn() {
        return this.metricArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the custom metric, e.g.
     * <code>arn:<i>aws-partition</i>:iot:<i>region</i>:<i>accountId</i>:custommetric/<i>metricName</i> </code>
     * </p>
     * 
     * @param metricArn
     *        The Amazon Resource Number (ARN) of the custom metric, e.g.
     *        <code>arn:<i>aws-partition</i>:iot:<i>region</i>:<i>accountId</i>:custommetric/<i>metricName</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomMetricResult withMetricArn(String metricArn) {
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

        if (obj instanceof CreateCustomMetricResult == false)
            return false;
        CreateCustomMetricResult other = (CreateCustomMetricResult) obj;
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
    public CreateCustomMetricResult clone() {
        try {
            return (CreateCustomMetricResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
