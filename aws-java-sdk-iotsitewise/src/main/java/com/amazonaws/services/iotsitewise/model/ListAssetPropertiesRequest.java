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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 50.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Filters the requested list of asset properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     */
    private String filter;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetPropertiesRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

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

    public ListAssetPropertiesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request. If not specified, the default value is
     *        50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 50.
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request. If not specified, the default value
     *         is 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request. If not specified, the default value is 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request. If not specified, the default value is
     *        50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetPropertiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the requested list of asset properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @param filter
     *        Filters the requested list of asset properties. You can choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>BASE</code>
     * @see ListAssetPropertiesFilter
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters the requested list of asset properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @return Filters the requested list of asset properties. You can choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>BASE</code>
     * @see ListAssetPropertiesFilter
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters the requested list of asset properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @param filter
     *        Filters the requested list of asset properties. You can choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>BASE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListAssetPropertiesFilter
     */

    public ListAssetPropertiesRequest withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Filters the requested list of asset properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @param filter
     *        Filters the requested list of asset properties. You can choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all asset properties for a given asset model ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASE</code> – The list includes only base asset properties for a given asset model ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>BASE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListAssetPropertiesFilter
     */

    public ListAssetPropertiesRequest withFilter(ListAssetPropertiesFilter filter) {
        this.filter = filter.toString();
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssetPropertiesRequest == false)
            return false;
        ListAssetPropertiesRequest other = (ListAssetPropertiesRequest) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetPropertiesRequest clone() {
        return (ListAssetPropertiesRequest) super.clone();
    }

}
