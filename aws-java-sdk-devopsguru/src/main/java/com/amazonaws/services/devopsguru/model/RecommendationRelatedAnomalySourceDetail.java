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
 * Contains an array of <code>RecommendationRelatedCloudWatchMetricsSourceDetail</code> objects that contain the name
 * and namespace of an Amazon CloudWatch metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/RecommendationRelatedAnomalySourceDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationRelatedAnomalySourceDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed metrics
     * that displayed anomalous behavior.
     * </p>
     */
    private java.util.List<RecommendationRelatedCloudWatchMetricsSourceDetail> cloudWatchMetrics;

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed metrics
     * that displayed anomalous behavior.
     * </p>
     * 
     * @return An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed
     *         metrics that displayed anomalous behavior.
     */

    public java.util.List<RecommendationRelatedCloudWatchMetricsSourceDetail> getCloudWatchMetrics() {
        return cloudWatchMetrics;
    }

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed metrics
     * that displayed anomalous behavior.
     * </p>
     * 
     * @param cloudWatchMetrics
     *        An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed
     *        metrics that displayed anomalous behavior.
     */

    public void setCloudWatchMetrics(java.util.Collection<RecommendationRelatedCloudWatchMetricsSourceDetail> cloudWatchMetrics) {
        if (cloudWatchMetrics == null) {
            this.cloudWatchMetrics = null;
            return;
        }

        this.cloudWatchMetrics = new java.util.ArrayList<RecommendationRelatedCloudWatchMetricsSourceDetail>(cloudWatchMetrics);
    }

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed metrics
     * that displayed anomalous behavior.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCloudWatchMetrics(java.util.Collection)} or {@link #withCloudWatchMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cloudWatchMetrics
     *        An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed
     *        metrics that displayed anomalous behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedAnomalySourceDetail withCloudWatchMetrics(RecommendationRelatedCloudWatchMetricsSourceDetail... cloudWatchMetrics) {
        if (this.cloudWatchMetrics == null) {
            setCloudWatchMetrics(new java.util.ArrayList<RecommendationRelatedCloudWatchMetricsSourceDetail>(cloudWatchMetrics.length));
        }
        for (RecommendationRelatedCloudWatchMetricsSourceDetail ele : cloudWatchMetrics) {
            this.cloudWatchMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed metrics
     * that displayed anomalous behavior.
     * </p>
     * 
     * @param cloudWatchMetrics
     *        An array of <code>CloudWatchMetricsDetail</code> objects that contains information about the analyzed
     *        metrics that displayed anomalous behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationRelatedAnomalySourceDetail withCloudWatchMetrics(
            java.util.Collection<RecommendationRelatedCloudWatchMetricsSourceDetail> cloudWatchMetrics) {
        setCloudWatchMetrics(cloudWatchMetrics);
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
        if (getCloudWatchMetrics() != null)
            sb.append("CloudWatchMetrics: ").append(getCloudWatchMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationRelatedAnomalySourceDetail == false)
            return false;
        RecommendationRelatedAnomalySourceDetail other = (RecommendationRelatedAnomalySourceDetail) obj;
        if (other.getCloudWatchMetrics() == null ^ this.getCloudWatchMetrics() == null)
            return false;
        if (other.getCloudWatchMetrics() != null && other.getCloudWatchMetrics().equals(this.getCloudWatchMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchMetrics() == null) ? 0 : getCloudWatchMetrics().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationRelatedAnomalySourceDetail clone() {
        try {
            return (RecommendationRelatedAnomalySourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.RecommendationRelatedAnomalySourceDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
