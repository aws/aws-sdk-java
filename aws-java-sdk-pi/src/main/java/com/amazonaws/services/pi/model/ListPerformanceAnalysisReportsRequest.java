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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/ListPerformanceAnalysisReports" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPerformanceAnalysisReportsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics. Valid value is <code>RDS</code>.
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxResults</code>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxResults</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies whether or not to include the list of tags in the response.
     * </p>
     */
    private Boolean listTags;

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics. Valid value is <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     *        <code>RDS</code>.
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics. Valid value is <code>RDS</code>.
     * </p>
     * 
     * @return The Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     *         <code>RDS</code>.
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics. Valid value is <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ListPerformanceAnalysisReportsRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services service for which Performance Insights returns metrics. Valid value is <code>RDS</code>.
     * </p>
     * 
     * @param serviceType
     *        The Amazon Web Services service for which Performance Insights returns metrics. Valid value is
     *        <code>RDS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ListPerformanceAnalysisReportsRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. In the console, the identifier is shown as
     *        <i>ResourceID</i>. When you call <code>DescribeDBInstances</code>, the identifier is returned as
     *        <code>DbiResourceId</code>.</p>
     *        <p>
     *        To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     *        <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @return An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *         Insights gathers metrics from this data source. In the console, the identifier is shown as
     *         <i>ResourceID</i>. When you call <code>DescribeDBInstances</code>, the identifier is returned as
     *         <code>DbiResourceId</code>.</p>
     *         <p>
     *         To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     *         <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance Insights
     * gathers metrics from this data source. In the console, the identifier is shown as <i>ResourceID</i>. When you
     * call <code>DescribeDBInstances</code>, the identifier is returned as <code>DbiResourceId</code>.
     * </p>
     * <p>
     * To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     * <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * </p>
     * 
     * @param identifier
     *        An immutable identifier for a data source that is unique for an Amazon Web Services Region. Performance
     *        Insights gathers metrics from this data source. In the console, the identifier is shown as
     *        <i>ResourceID</i>. When you call <code>DescribeDBInstances</code>, the identifier is returned as
     *        <code>DbiResourceId</code>.</p>
     *        <p>
     *        To use a DB instance as a data source, specify its <code>DbiResourceId</code> value. For example, specify
     *        <code>db-ABCDEFGHIJKLMNOPQRSTU1VW2X</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPerformanceAnalysisReportsRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxResults</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxResults</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxResults</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the token, up to the value specified by <code>MaxResults</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxResults</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxResults</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPerformanceAnalysisReportsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxResults</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the response. If more items exist than the specified
     *        <code>MaxResults</code> value, a pagination token is included in the response so that the remaining
     *        results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxResults</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @return The maximum number of items to return in the response. If more items exist than the specified
     *         <code>MaxResults</code> value, a pagination token is included in the response so that the remaining
     *         results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxResults</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the response. If more items exist than the specified
     *        <code>MaxResults</code> value, a pagination token is included in the response so that the remaining
     *        results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPerformanceAnalysisReportsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include the list of tags in the response.
     * </p>
     * 
     * @param listTags
     *        Specifies whether or not to include the list of tags in the response.
     */

    public void setListTags(Boolean listTags) {
        this.listTags = listTags;
    }

    /**
     * <p>
     * Specifies whether or not to include the list of tags in the response.
     * </p>
     * 
     * @return Specifies whether or not to include the list of tags in the response.
     */

    public Boolean getListTags() {
        return this.listTags;
    }

    /**
     * <p>
     * Specifies whether or not to include the list of tags in the response.
     * </p>
     * 
     * @param listTags
     *        Specifies whether or not to include the list of tags in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPerformanceAnalysisReportsRequest withListTags(Boolean listTags) {
        setListTags(listTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether or not to include the list of tags in the response.
     * </p>
     * 
     * @return Specifies whether or not to include the list of tags in the response.
     */

    public Boolean isListTags() {
        return this.listTags;
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getListTags() != null)
            sb.append("ListTags: ").append(getListTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPerformanceAnalysisReportsRequest == false)
            return false;
        ListPerformanceAnalysisReportsRequest other = (ListPerformanceAnalysisReportsRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getListTags() == null ^ this.getListTags() == null)
            return false;
        if (other.getListTags() != null && other.getListTags().equals(this.getListTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getListTags() == null) ? 0 : getListTags().hashCode());
        return hashCode;
    }

    @Override
    public ListPerformanceAnalysisReportsRequest clone() {
        return (ListPerformanceAnalysisReportsRequest) super.clone();
    }

}
