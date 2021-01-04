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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon CloudWatch metric that is analyzed by DevOps Guru. It is one of many analyzed metrics
 * that are used to generate insights.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RecommendationRelatedCloudWatchMetricsSourceDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationRelatedCloudWatchMetricsSourceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * 
     * @return The name of the CloudWatch metric.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedCloudWatchMetricsSourceDetail withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
     * </p>
     * 
     * @param namespace
     *        The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
     * </p>
     * 
     * @return The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
     * </p>
     * 
     * @param namespace
     *        The namespace of the CloudWatch metric. A namespace is a container for CloudWatch metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedCloudWatchMetricsSourceDetail withNamespace(String namespace) {
        setNamespace(namespace);
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
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationRelatedCloudWatchMetricsSourceDetail == false)
            return false;
        RecommendationRelatedCloudWatchMetricsSourceDetail other = (RecommendationRelatedCloudWatchMetricsSourceDetail) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationRelatedCloudWatchMetricsSourceDetail clone() {
        try {
            return (RecommendationRelatedCloudWatchMetricsSourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.RecommendationRelatedCloudWatchMetricsSourceDetailMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
