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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeMetricSet" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMetricSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     */
    private String metricSetArn;

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @param metricSetArn
     *        The ARN of the dataset.
     */

    public void setMetricSetArn(String metricSetArn) {
        this.metricSetArn = metricSetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @return The ARN of the dataset.
     */

    public String getMetricSetArn() {
        return this.metricSetArn;
    }

    /**
     * <p>
     * The ARN of the dataset.
     * </p>
     * 
     * @param metricSetArn
     *        The ARN of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMetricSetRequest withMetricSetArn(String metricSetArn) {
        setMetricSetArn(metricSetArn);
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
        if (getMetricSetArn() != null)
            sb.append("MetricSetArn: ").append(getMetricSetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMetricSetRequest == false)
            return false;
        DescribeMetricSetRequest other = (DescribeMetricSetRequest) obj;
        if (other.getMetricSetArn() == null ^ this.getMetricSetArn() == null)
            return false;
        if (other.getMetricSetArn() != null && other.getMetricSetArn().equals(this.getMetricSetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricSetArn() == null) ? 0 : getMetricSetArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMetricSetRequest clone() {
        return (DescribeMetricSetRequest) super.clone();
    }

}
