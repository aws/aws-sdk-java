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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the analyzed metrics that displayed anomalous behavior.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/CloudWatchMetricsDataSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchMetricsDataSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This is a list of Amazon CloudWatch metric values at given timestamp.
     * </p>
     */
    private java.util.List<TimestampMetricValuePair> timestampMetricValuePairList;
    /**
     * <p>
     * This is an enum of the status showing whether the metric value pair list has partial or complete data, or if
     * there was an error.
     * </p>
     */
    private String statusCode;

    /**
     * <p>
     * This is a list of Amazon CloudWatch metric values at given timestamp.
     * </p>
     * 
     * @return This is a list of Amazon CloudWatch metric values at given timestamp.
     */

    public java.util.List<TimestampMetricValuePair> getTimestampMetricValuePairList() {
        return timestampMetricValuePairList;
    }

    /**
     * <p>
     * This is a list of Amazon CloudWatch metric values at given timestamp.
     * </p>
     * 
     * @param timestampMetricValuePairList
     *        This is a list of Amazon CloudWatch metric values at given timestamp.
     */

    public void setTimestampMetricValuePairList(java.util.Collection<TimestampMetricValuePair> timestampMetricValuePairList) {
        if (timestampMetricValuePairList == null) {
            this.timestampMetricValuePairList = null;
            return;
        }

        this.timestampMetricValuePairList = new java.util.ArrayList<TimestampMetricValuePair>(timestampMetricValuePairList);
    }

    /**
     * <p>
     * This is a list of Amazon CloudWatch metric values at given timestamp.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestampMetricValuePairList(java.util.Collection)} or
     * {@link #withTimestampMetricValuePairList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param timestampMetricValuePairList
     *        This is a list of Amazon CloudWatch metric values at given timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDataSummary withTimestampMetricValuePairList(TimestampMetricValuePair... timestampMetricValuePairList) {
        if (this.timestampMetricValuePairList == null) {
            setTimestampMetricValuePairList(new java.util.ArrayList<TimestampMetricValuePair>(timestampMetricValuePairList.length));
        }
        for (TimestampMetricValuePair ele : timestampMetricValuePairList) {
            this.timestampMetricValuePairList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is a list of Amazon CloudWatch metric values at given timestamp.
     * </p>
     * 
     * @param timestampMetricValuePairList
     *        This is a list of Amazon CloudWatch metric values at given timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchMetricsDataSummary withTimestampMetricValuePairList(java.util.Collection<TimestampMetricValuePair> timestampMetricValuePairList) {
        setTimestampMetricValuePairList(timestampMetricValuePairList);
        return this;
    }

    /**
     * <p>
     * This is an enum of the status showing whether the metric value pair list has partial or complete data, or if
     * there was an error.
     * </p>
     * 
     * @param statusCode
     *        This is an enum of the status showing whether the metric value pair list has partial or complete data, or
     *        if there was an error.
     * @see CloudWatchMetricDataStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * This is an enum of the status showing whether the metric value pair list has partial or complete data, or if
     * there was an error.
     * </p>
     * 
     * @return This is an enum of the status showing whether the metric value pair list has partial or complete data, or
     *         if there was an error.
     * @see CloudWatchMetricDataStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * This is an enum of the status showing whether the metric value pair list has partial or complete data, or if
     * there was an error.
     * </p>
     * 
     * @param statusCode
     *        This is an enum of the status showing whether the metric value pair list has partial or complete data, or
     *        if there was an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchMetricDataStatusCode
     */

    public CloudWatchMetricsDataSummary withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * This is an enum of the status showing whether the metric value pair list has partial or complete data, or if
     * there was an error.
     * </p>
     * 
     * @param statusCode
     *        This is an enum of the status showing whether the metric value pair list has partial or complete data, or
     *        if there was an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CloudWatchMetricDataStatusCode
     */

    public CloudWatchMetricsDataSummary withStatusCode(CloudWatchMetricDataStatusCode statusCode) {
        this.statusCode = statusCode.toString();
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
        if (getTimestampMetricValuePairList() != null)
            sb.append("TimestampMetricValuePairList: ").append(getTimestampMetricValuePairList()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchMetricsDataSummary == false)
            return false;
        CloudWatchMetricsDataSummary other = (CloudWatchMetricsDataSummary) obj;
        if (other.getTimestampMetricValuePairList() == null ^ this.getTimestampMetricValuePairList() == null)
            return false;
        if (other.getTimestampMetricValuePairList() != null && other.getTimestampMetricValuePairList().equals(this.getTimestampMetricValuePairList()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestampMetricValuePairList() == null) ? 0 : getTimestampMetricValuePairList().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchMetricsDataSummary clone() {
        try {
            return (CloudWatchMetricsDataSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.CloudWatchMetricsDataSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
