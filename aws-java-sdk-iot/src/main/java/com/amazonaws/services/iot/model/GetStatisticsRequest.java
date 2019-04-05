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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the index to search. The default value is <code>AWS_Things</code>.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your
     * AWS account.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The aggregation field name. Currently not supported.
     * </p>
     */
    private String aggregationField;
    /**
     * <p>
     * The version of the query used to search.
     * </p>
     */
    private String queryVersion;

    /**
     * <p>
     * The name of the index to search. The default value is <code>AWS_Things</code>.
     * </p>
     * 
     * @param indexName
     *        The name of the index to search. The default value is <code>AWS_Things</code>.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the index to search. The default value is <code>AWS_Things</code>.
     * </p>
     * 
     * @return The name of the index to search. The default value is <code>AWS_Things</code>.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the index to search. The default value is <code>AWS_Things</code>.
     * </p>
     * 
     * @param indexName
     *        The name of the index to search. The default value is <code>AWS_Things</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatisticsRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your
     * AWS account.
     * </p>
     * 
     * @param queryString
     *        The query used to search. You can specify "*" for the query string to get the count of all indexed things
     *        in your AWS account.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your
     * AWS account.
     * </p>
     * 
     * @return The query used to search. You can specify "*" for the query string to get the count of all indexed things
     *         in your AWS account.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your
     * AWS account.
     * </p>
     * 
     * @param queryString
     *        The query used to search. You can specify "*" for the query string to get the count of all indexed things
     *        in your AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatisticsRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The aggregation field name. Currently not supported.
     * </p>
     * 
     * @param aggregationField
     *        The aggregation field name. Currently not supported.
     */

    public void setAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
    }

    /**
     * <p>
     * The aggregation field name. Currently not supported.
     * </p>
     * 
     * @return The aggregation field name. Currently not supported.
     */

    public String getAggregationField() {
        return this.aggregationField;
    }

    /**
     * <p>
     * The aggregation field name. Currently not supported.
     * </p>
     * 
     * @param aggregationField
     *        The aggregation field name. Currently not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatisticsRequest withAggregationField(String aggregationField) {
        setAggregationField(aggregationField);
        return this;
    }

    /**
     * <p>
     * The version of the query used to search.
     * </p>
     * 
     * @param queryVersion
     *        The version of the query used to search.
     */

    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The version of the query used to search.
     * </p>
     * 
     * @return The version of the query used to search.
     */

    public String getQueryVersion() {
        return this.queryVersion;
    }

    /**
     * <p>
     * The version of the query used to search.
     * </p>
     * 
     * @param queryVersion
     *        The version of the query used to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStatisticsRequest withQueryVersion(String queryVersion) {
        setQueryVersion(queryVersion);
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
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getQueryString() != null)
            sb.append("QueryString: ").append(getQueryString()).append(",");
        if (getAggregationField() != null)
            sb.append("AggregationField: ").append(getAggregationField()).append(",");
        if (getQueryVersion() != null)
            sb.append("QueryVersion: ").append(getQueryVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStatisticsRequest == false)
            return false;
        GetStatisticsRequest other = (GetStatisticsRequest) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getQueryString() == null ^ this.getQueryString() == null)
            return false;
        if (other.getQueryString() != null && other.getQueryString().equals(this.getQueryString()) == false)
            return false;
        if (other.getAggregationField() == null ^ this.getAggregationField() == null)
            return false;
        if (other.getAggregationField() != null && other.getAggregationField().equals(this.getAggregationField()) == false)
            return false;
        if (other.getQueryVersion() == null ^ this.getQueryVersion() == null)
            return false;
        if (other.getQueryVersion() != null && other.getQueryVersion().equals(this.getQueryVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getQueryString() == null) ? 0 : getQueryString().hashCode());
        hashCode = prime * hashCode + ((getAggregationField() == null) ? 0 : getAggregationField().hashCode());
        hashCode = prime * hashCode + ((getQueryVersion() == null) ? 0 : getQueryVersion().hashCode());
        return hashCode;
    }

    @Override
    public GetStatisticsRequest clone() {
        return (GetStatisticsRequest) super.clone();
    }

}
