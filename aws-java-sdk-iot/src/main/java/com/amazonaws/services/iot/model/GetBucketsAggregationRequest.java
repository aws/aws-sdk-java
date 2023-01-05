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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketsAggregationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the index to search.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The search query string.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The aggregation field.
     * </p>
     */
    private String aggregationField;
    /**
     * <p>
     * The version of the query.
     * </p>
     */
    private String queryVersion;
    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type to perform.
     * </p>
     */
    private BucketsAggregationType bucketsAggregationType;

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * 
     * @param indexName
     *        The name of the index to search.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * 
     * @return The name of the index to search.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the index to search.
     * </p>
     * 
     * @param indexName
     *        The name of the index to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * 
     * @param queryString
     *        The search query string.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * 
     * @return The search query string.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The search query string.
     * </p>
     * 
     * @param queryString
     *        The search query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The aggregation field.
     * </p>
     * 
     * @param aggregationField
     *        The aggregation field.
     */

    public void setAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
    }

    /**
     * <p>
     * The aggregation field.
     * </p>
     * 
     * @return The aggregation field.
     */

    public String getAggregationField() {
        return this.aggregationField;
    }

    /**
     * <p>
     * The aggregation field.
     * </p>
     * 
     * @param aggregationField
     *        The aggregation field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationRequest withAggregationField(String aggregationField) {
        setAggregationField(aggregationField);
        return this;
    }

    /**
     * <p>
     * The version of the query.
     * </p>
     * 
     * @param queryVersion
     *        The version of the query.
     */

    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The version of the query.
     * </p>
     * 
     * @return The version of the query.
     */

    public String getQueryVersion() {
        return this.queryVersion;
    }

    /**
     * <p>
     * The version of the query.
     * </p>
     * 
     * @param queryVersion
     *        The version of the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationRequest withQueryVersion(String queryVersion) {
        setQueryVersion(queryVersion);
        return this;
    }

    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type to perform.
     * </p>
     * 
     * @param bucketsAggregationType
     *        The basic control of the response shape and the bucket aggregation type to perform.
     */

    public void setBucketsAggregationType(BucketsAggregationType bucketsAggregationType) {
        this.bucketsAggregationType = bucketsAggregationType;
    }

    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type to perform.
     * </p>
     * 
     * @return The basic control of the response shape and the bucket aggregation type to perform.
     */

    public BucketsAggregationType getBucketsAggregationType() {
        return this.bucketsAggregationType;
    }

    /**
     * <p>
     * The basic control of the response shape and the bucket aggregation type to perform.
     * </p>
     * 
     * @param bucketsAggregationType
     *        The basic control of the response shape and the bucket aggregation type to perform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsAggregationRequest withBucketsAggregationType(BucketsAggregationType bucketsAggregationType) {
        setBucketsAggregationType(bucketsAggregationType);
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
            sb.append("QueryVersion: ").append(getQueryVersion()).append(",");
        if (getBucketsAggregationType() != null)
            sb.append("BucketsAggregationType: ").append(getBucketsAggregationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketsAggregationRequest == false)
            return false;
        GetBucketsAggregationRequest other = (GetBucketsAggregationRequest) obj;
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
        if (other.getBucketsAggregationType() == null ^ this.getBucketsAggregationType() == null)
            return false;
        if (other.getBucketsAggregationType() != null && other.getBucketsAggregationType().equals(this.getBucketsAggregationType()) == false)
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
        hashCode = prime * hashCode + ((getBucketsAggregationType() == null) ? 0 : getBucketsAggregationType().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketsAggregationRequest clone() {
        return (GetBucketsAggregationRequest) super.clone();
    }

}
