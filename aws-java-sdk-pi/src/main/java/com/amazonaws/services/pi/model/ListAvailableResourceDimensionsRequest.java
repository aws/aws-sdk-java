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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListAvailableResourceDimensions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableResourceDimensionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance
     * Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VWZ</code>.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     * </p>
     */
    private java.util.List<String> metrics;
    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @return The Amazon Web Services service for which Performance Insights returns metrics.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ListAvailableResourceDimensionsRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ListAvailableResourceDimensionsRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance
     * Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VWZ</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify
     *        its <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VWZ</code>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance
     * Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VWZ</code>.
     * </p>
     * 
     * @return An immutable identifier for a data source that is unique within an Amazon Web Services Region.
     *         Performance Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data
     *         source, specify its <code>DbiResourceId</code> value. For example, specify
     *         <code>db-ABCDEFGHIJKLMNOPQRSTU1VWZ</code>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance
     * Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify its
     * <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VWZ</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique within an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. To use an Amazon RDS DB instance as a data source, specify
     *        its <code>DbiResourceId</code> value. For example, specify <code>db-ABCDEFGHIJKLMNOPQRSTU1VWZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     * </p>
     * 
     * @return The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     */

    public java.util.List<String> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     * </p>
     * 
     * @param metrics
     *        The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     */

    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new java.util.ArrayList<String>(metrics);
    }

    /**
     * <p>
     * The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsRequest withMetrics(String... metrics) {
        if (this.metrics == null) {
            setMetrics(new java.util.ArrayList<String>(metrics.length));
        }
        for (String ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     * </p>
     * 
     * @param metrics
     *        The types of metrics for which to retrieve dimensions. Valid values include <code>db.load</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the response. If more items exist than the specified
     *        <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining
     *        results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @return The maximum number of items to return in the response. If more items exist than the specified
     *         <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining
     *         results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the response. If more items exist than the specified
     *        <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining
     *        results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableResourceDimensionsRequest withNextToken(String nextToken) {
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListAvailableResourceDimensionsRequest == false)
            return false;
        ListAvailableResourceDimensionsRequest other = (ListAvailableResourceDimensionsRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableResourceDimensionsRequest clone() {
        return (ListAvailableResourceDimensionsRequest) super.clone();
    }

}
