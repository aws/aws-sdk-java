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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action that captures a CloudWatch metric.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudwatchMetricAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     */
    private String metricNamespace;
    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     */
    private String metricValue;
    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     * </p>
     */
    private String metricUnit;
    /**
     * <p>
     * An optional <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     */
    private String metricTimestamp;

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the CloudWatch metric.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     * 
     * @return The IAM role that allows access to the CloudWatch metric.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role that allows access to the CloudWatch metric.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that allows access to the CloudWatch metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchMetricAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     * 
     * @param metricNamespace
     *        The CloudWatch metric namespace name.
     */

    public void setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
    }

    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     * 
     * @return The CloudWatch metric namespace name.
     */

    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * <p>
     * The CloudWatch metric namespace name.
     * </p>
     * 
     * @param metricNamespace
     *        The CloudWatch metric namespace name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchMetricAction withMetricNamespace(String metricNamespace) {
        setMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     * 
     * @param metricName
     *        The CloudWatch metric name.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     * 
     * @return The CloudWatch metric name.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The CloudWatch metric name.
     * </p>
     * 
     * @param metricName
     *        The CloudWatch metric name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchMetricAction withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     * 
     * @param metricValue
     *        The CloudWatch metric value.
     */

    public void setMetricValue(String metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     * 
     * @return The CloudWatch metric value.
     */

    public String getMetricValue() {
        return this.metricValue;
    }

    /**
     * <p>
     * The CloudWatch metric value.
     * </p>
     * 
     * @param metricValue
     *        The CloudWatch metric value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchMetricAction withMetricValue(String metricValue) {
        setMetricValue(metricValue);
        return this;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     * </p>
     * 
     * @param metricUnit
     *        The <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     *        >metric unit</a> supported by CloudWatch.
     */

    public void setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     * </p>
     * 
     * @return The <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     *         >metric unit</a> supported by CloudWatch.
     */

    public String getMetricUnit() {
        return this.metricUnit;
    }

    /**
     * <p>
     * The <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit">metric
     * unit</a> supported by CloudWatch.
     * </p>
     * 
     * @param metricUnit
     *        The <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#Unit"
     *        >metric unit</a> supported by CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchMetricAction withMetricUnit(String metricUnit) {
        setMetricUnit(metricUnit);
        return this;
    }

    /**
     * <p>
     * An optional <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     * 
     * @param metricTimestamp
     *        An optional <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     *        >Unix timestamp</a>.
     */

    public void setMetricTimestamp(String metricTimestamp) {
        this.metricTimestamp = metricTimestamp;
    }

    /**
     * <p>
     * An optional <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     * 
     * @return An optional <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     *         >Unix timestamp</a>.
     */

    public String getMetricTimestamp() {
        return this.metricTimestamp;
    }

    /**
     * <p>
     * An optional <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     * >Unix timestamp</a>.
     * </p>
     * 
     * @param metricTimestamp
     *        An optional <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/cloudwatch_concepts.html#about_timestamp"
     *        >Unix timestamp</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudwatchMetricAction withMetricTimestamp(String metricTimestamp) {
        setMetricTimestamp(metricTimestamp);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getMetricNamespace() != null)
            sb.append("MetricNamespace: ").append(getMetricNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getMetricValue() != null)
            sb.append("MetricValue: ").append(getMetricValue()).append(",");
        if (getMetricUnit() != null)
            sb.append("MetricUnit: ").append(getMetricUnit()).append(",");
        if (getMetricTimestamp() != null)
            sb.append("MetricTimestamp: ").append(getMetricTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudwatchMetricAction == false)
            return false;
        CloudwatchMetricAction other = (CloudwatchMetricAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getMetricNamespace() == null ^ this.getMetricNamespace() == null)
            return false;
        if (other.getMetricNamespace() != null && other.getMetricNamespace().equals(this.getMetricNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        if (other.getMetricUnit() == null ^ this.getMetricUnit() == null)
            return false;
        if (other.getMetricUnit() != null && other.getMetricUnit().equals(this.getMetricUnit()) == false)
            return false;
        if (other.getMetricTimestamp() == null ^ this.getMetricTimestamp() == null)
            return false;
        if (other.getMetricTimestamp() != null && other.getMetricTimestamp().equals(this.getMetricTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getMetricNamespace() == null) ? 0 : getMetricNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        hashCode = prime * hashCode + ((getMetricUnit() == null) ? 0 : getMetricUnit().hashCode());
        hashCode = prime * hashCode + ((getMetricTimestamp() == null) ? 0 : getMetricTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public CloudwatchMetricAction clone() {
        try {
            return (CloudwatchMetricAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.CloudwatchMetricActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
