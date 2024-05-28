/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetMetricConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMetricConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration status of the AWS account for summary metric aggregation.
     * </p>
     */
    private SummaryMetricConfiguration summaryMetric;

    /**
     * <p>
     * The configuration status of the AWS account for summary metric aggregation.
     * </p>
     * 
     * @param summaryMetric
     *        The configuration status of the AWS account for summary metric aggregation.
     */

    public void setSummaryMetric(SummaryMetricConfiguration summaryMetric) {
        this.summaryMetric = summaryMetric;
    }

    /**
     * <p>
     * The configuration status of the AWS account for summary metric aggregation.
     * </p>
     * 
     * @return The configuration status of the AWS account for summary metric aggregation.
     */

    public SummaryMetricConfiguration getSummaryMetric() {
        return this.summaryMetric;
    }

    /**
     * <p>
     * The configuration status of the AWS account for summary metric aggregation.
     * </p>
     * 
     * @param summaryMetric
     *        The configuration status of the AWS account for summary metric aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMetricConfigurationResult withSummaryMetric(SummaryMetricConfiguration summaryMetric) {
        setSummaryMetric(summaryMetric);
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
        if (getSummaryMetric() != null)
            sb.append("SummaryMetric: ").append(getSummaryMetric());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMetricConfigurationResult == false)
            return false;
        GetMetricConfigurationResult other = (GetMetricConfigurationResult) obj;
        if (other.getSummaryMetric() == null ^ this.getSummaryMetric() == null)
            return false;
        if (other.getSummaryMetric() != null && other.getSummaryMetric().equals(this.getSummaryMetric()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaryMetric() == null) ? 0 : getSummaryMetric().hashCode());
        return hashCode;
    }

    @Override
    public GetMetricConfigurationResult clone() {
        try {
            return (GetMetricConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
