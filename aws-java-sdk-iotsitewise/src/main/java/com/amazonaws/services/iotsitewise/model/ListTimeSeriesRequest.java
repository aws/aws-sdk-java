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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListTimeSeries" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTimeSeriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The ID of the asset in which the asset property was created.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The alias prefix of the time series.
     * </p>
     */
    private String aliasPrefix;
    /**
     * <p>
     * The type of the time series. The time series type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATED</code> – The time series is associated with an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     * </p>
     * </li>
     * </ul>
     */
    private String timeSeriesType;

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The ID of the asset in which the asset property was created.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset in which the asset property was created.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset in which the asset property was created.
     * </p>
     * 
     * @return The ID of the asset in which the asset property was created.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset in which the asset property was created.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset in which the asset property was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The alias prefix of the time series.
     * </p>
     * 
     * @param aliasPrefix
     *        The alias prefix of the time series.
     */

    public void setAliasPrefix(String aliasPrefix) {
        this.aliasPrefix = aliasPrefix;
    }

    /**
     * <p>
     * The alias prefix of the time series.
     * </p>
     * 
     * @return The alias prefix of the time series.
     */

    public String getAliasPrefix() {
        return this.aliasPrefix;
    }

    /**
     * <p>
     * The alias prefix of the time series.
     * </p>
     * 
     * @param aliasPrefix
     *        The alias prefix of the time series.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesRequest withAliasPrefix(String aliasPrefix) {
        setAliasPrefix(aliasPrefix);
        return this;
    }

    /**
     * <p>
     * The type of the time series. The time series type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATED</code> – The time series is associated with an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param timeSeriesType
     *        The type of the time series. The time series type can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATED</code> – The time series is associated with an asset property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     *        </p>
     *        </li>
     * @see ListTimeSeriesType
     */

    public void setTimeSeriesType(String timeSeriesType) {
        this.timeSeriesType = timeSeriesType;
    }

    /**
     * <p>
     * The type of the time series. The time series type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATED</code> – The time series is associated with an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the time series. The time series type can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASSOCIATED</code> – The time series is associated with an asset property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     *         </p>
     *         </li>
     * @see ListTimeSeriesType
     */

    public String getTimeSeriesType() {
        return this.timeSeriesType;
    }

    /**
     * <p>
     * The type of the time series. The time series type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATED</code> – The time series is associated with an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param timeSeriesType
     *        The type of the time series. The time series type can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATED</code> – The time series is associated with an asset property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListTimeSeriesType
     */

    public ListTimeSeriesRequest withTimeSeriesType(String timeSeriesType) {
        setTimeSeriesType(timeSeriesType);
        return this;
    }

    /**
     * <p>
     * The type of the time series. The time series type can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASSOCIATED</code> – The time series is associated with an asset property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param timeSeriesType
     *        The type of the time series. The time series type can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASSOCIATED</code> – The time series is associated with an asset property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISASSOCIATED</code> – The time series isn't associated with any asset property.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListTimeSeriesType
     */

    public ListTimeSeriesRequest withTimeSeriesType(ListTimeSeriesType timeSeriesType) {
        this.timeSeriesType = timeSeriesType.toString();
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getAliasPrefix() != null)
            sb.append("AliasPrefix: ").append(getAliasPrefix()).append(",");
        if (getTimeSeriesType() != null)
            sb.append("TimeSeriesType: ").append(getTimeSeriesType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTimeSeriesRequest == false)
            return false;
        ListTimeSeriesRequest other = (ListTimeSeriesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getAliasPrefix() == null ^ this.getAliasPrefix() == null)
            return false;
        if (other.getAliasPrefix() != null && other.getAliasPrefix().equals(this.getAliasPrefix()) == false)
            return false;
        if (other.getTimeSeriesType() == null ^ this.getTimeSeriesType() == null)
            return false;
        if (other.getTimeSeriesType() != null && other.getTimeSeriesType().equals(this.getTimeSeriesType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getAliasPrefix() == null) ? 0 : getAliasPrefix().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesType() == null) ? 0 : getTimeSeriesType().hashCode());
        return hashCode;
    }

    @Override
    public ListTimeSeriesRequest clone() {
        return (ListTimeSeriesRequest) super.clone();
    }

}
