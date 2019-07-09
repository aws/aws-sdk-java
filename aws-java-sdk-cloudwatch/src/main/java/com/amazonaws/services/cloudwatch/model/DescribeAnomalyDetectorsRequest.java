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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/DescribeAnomalyDetectors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnomalyDetectorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in one operation. The maximum value you can specify is 10.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified namespace.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric name. If
     * there are multiple metrics with this name in different namespaces that have anomaly detection models, they're all
     * returned.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions.
     * If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're
     * all returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @return Use the token returned by the previous operation to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use the token returned by the previous operation to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Use the token returned by the previous operation to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The maximum value you can specify is 10.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. The maximum value you can specify is 10.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The maximum value you can specify is 10.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in one operation. The maximum value you can specify is 10.</p>
     *         <p>
     *         To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in one operation. The maximum value you can specify is 10.
     * </p>
     * <p>
     * To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in one operation. The maximum value you can specify is 10.</p>
     *        <p>
     *        To retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified namespace.
     * </p>
     * 
     * @param namespace
     *        Limits the results to only the anomaly detection models that are associated with the specified namespace.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified namespace.
     * </p>
     * 
     * @return Limits the results to only the anomaly detection models that are associated with the specified namespace.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified namespace.
     * </p>
     * 
     * @param namespace
     *        Limits the results to only the anomaly detection models that are associated with the specified namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsRequest withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric name. If
     * there are multiple metrics with this name in different namespaces that have anomaly detection models, they're all
     * returned.
     * </p>
     * 
     * @param metricName
     *        Limits the results to only the anomaly detection models that are associated with the specified metric
     *        name. If there are multiple metrics with this name in different namespaces that have anomaly detection
     *        models, they're all returned.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric name. If
     * there are multiple metrics with this name in different namespaces that have anomaly detection models, they're all
     * returned.
     * </p>
     * 
     * @return Limits the results to only the anomaly detection models that are associated with the specified metric
     *         name. If there are multiple metrics with this name in different namespaces that have anomaly detection
     *         models, they're all returned.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric name. If
     * there are multiple metrics with this name in different namespaces that have anomaly detection models, they're all
     * returned.
     * </p>
     * 
     * @param metricName
     *        Limits the results to only the anomaly detection models that are associated with the specified metric
     *        name. If there are multiple metrics with this name in different namespaces that have anomaly detection
     *        models, they're all returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions.
     * If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're
     * all returned.
     * </p>
     * 
     * @return Limits the results to only the anomaly detection models that are associated with the specified metric
     *         dimensions. If there are multiple metrics that have these dimensions and have anomaly detection models
     *         associated, they're all returned.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions.
     * If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're
     * all returned.
     * </p>
     * 
     * @param dimensions
     *        Limits the results to only the anomaly detection models that are associated with the specified metric
     *        dimensions. If there are multiple metrics that have these dimensions and have anomaly detection models
     *        associated, they're all returned.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions);
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions.
     * If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're
     * all returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        Limits the results to only the anomaly detection models that are associated with the specified metric
     *        dimensions. If there are multiple metrics that have these dimensions and have anomaly detection models
     *        associated, they're all returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsRequest withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Limits the results to only the anomaly detection models that are associated with the specified metric dimensions.
     * If there are multiple metrics that have these dimensions and have anomaly detection models associated, they're
     * all returned.
     * </p>
     * 
     * @param dimensions
     *        Limits the results to only the anomaly detection models that are associated with the specified metric
     *        dimensions. If there are multiple metrics that have these dimensions and have anomaly detection models
     *        associated, they're all returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorsRequest withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAnomalyDetectorsRequest == false)
            return false;
        DescribeAnomalyDetectorsRequest other = (DescribeAnomalyDetectorsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnomalyDetectorsRequest clone() {
        return (DescribeAnomalyDetectorsRequest) super.clone();
    }

}
