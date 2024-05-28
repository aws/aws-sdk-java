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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResourceMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageSystemResourceMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The details that your discovery job collected about your storage system resource.
     * </p>
     */
    private java.util.List<ResourceMetrics> metrics;
    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details that your discovery job collected about your storage system resource.
     * </p>
     * 
     * @return The details that your discovery job collected about your storage system resource.
     */

    public java.util.List<ResourceMetrics> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The details that your discovery job collected about your storage system resource.
     * </p>
     * 
     * @param metrics
     *        The details that your discovery job collected about your storage system resource.
     */

    public void setMetrics(java.util.Collection<ResourceMetrics> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<ResourceMetrics>(metrics);
    }

    /**
     * <p>
     * The details that your discovery job collected about your storage system resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The details that your discovery job collected about your storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsResult withMetrics(ResourceMetrics... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<ResourceMetrics>(metrics.length));
        }
        for (ResourceMetrics ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details that your discovery job collected about your storage system resource.
     * </p>
     * 
     * @param metrics
     *        The details that your discovery job collected about your storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsResult withMetrics(java.util.Collection<ResourceMetrics> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @return The opaque string that indicates the position to begin the next list of results in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        The opaque string that indicates the position to begin the next list of results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourceMetricsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStorageSystemResourceMetricsResult == false)
            return false;
        DescribeStorageSystemResourceMetricsResult other = (DescribeStorageSystemResourceMetricsResult) obj;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageSystemResourceMetricsResult clone() {
        try {
            return (DescribeStorageSystemResourceMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
