/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
public class GetPercentilesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the index to search.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * The query string.
     * </p>
     */
    private String queryString;
    /**
     * <p>
     * The field to aggregate.
     * </p>
     */
    private String aggregationField;
    /**
     * <p>
     * The query version.
     * </p>
     */
    private String queryVersion;
    /**
     * <p>
     * The percentile groups returned.
     * </p>
     */
    private java.util.List<Double> percents;

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

    public GetPercentilesRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * The query string.
     * </p>
     * 
     * @param queryString
     *        The query string.
     */

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * <p>
     * The query string.
     * </p>
     * 
     * @return The query string.
     */

    public String getQueryString() {
        return this.queryString;
    }

    /**
     * <p>
     * The query string.
     * </p>
     * 
     * @param queryString
     *        The query string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPercentilesRequest withQueryString(String queryString) {
        setQueryString(queryString);
        return this;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * 
     * @param aggregationField
     *        The field to aggregate.
     */

    public void setAggregationField(String aggregationField) {
        this.aggregationField = aggregationField;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * 
     * @return The field to aggregate.
     */

    public String getAggregationField() {
        return this.aggregationField;
    }

    /**
     * <p>
     * The field to aggregate.
     * </p>
     * 
     * @param aggregationField
     *        The field to aggregate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPercentilesRequest withAggregationField(String aggregationField) {
        setAggregationField(aggregationField);
        return this;
    }

    /**
     * <p>
     * The query version.
     * </p>
     * 
     * @param queryVersion
     *        The query version.
     */

    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * <p>
     * The query version.
     * </p>
     * 
     * @return The query version.
     */

    public String getQueryVersion() {
        return this.queryVersion;
    }

    /**
     * <p>
     * The query version.
     * </p>
     * 
     * @param queryVersion
     *        The query version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPercentilesRequest withQueryVersion(String queryVersion) {
        setQueryVersion(queryVersion);
        return this;
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     * 
     * @return The percentile groups returned.
     */

    public java.util.List<Double> getPercents() {
        return percents;
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     * 
     * @param percents
     *        The percentile groups returned.
     */

    public void setPercents(java.util.Collection<Double> percents) {
        if (percents == null) {
            this.percents = null;
            return;
        }

        this.percents = new java.util.ArrayList<Double>(percents);
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPercents(java.util.Collection)} or {@link #withPercents(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param percents
     *        The percentile groups returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPercentilesRequest withPercents(Double... percents) {
        if (this.percents == null) {
            setPercents(new java.util.ArrayList<Double>(percents.length));
        }
        for (Double ele : percents) {
            this.percents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The percentile groups returned.
     * </p>
     * 
     * @param percents
     *        The percentile groups returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPercentilesRequest withPercents(java.util.Collection<Double> percents) {
        setPercents(percents);
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
        if (getPercents() != null)
            sb.append("Percents: ").append(getPercents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPercentilesRequest == false)
            return false;
        GetPercentilesRequest other = (GetPercentilesRequest) obj;
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
        if (other.getPercents() == null ^ this.getPercents() == null)
            return false;
        if (other.getPercents() != null && other.getPercents().equals(this.getPercents()) == false)
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
        hashCode = prime * hashCode + ((getPercents() == null) ? 0 : getPercents().hashCode());
        return hashCode;
    }

    @Override
    public GetPercentilesRequest clone() {
        return (GetPercentilesRequest) super.clone();
    }

}
