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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * <p>
     * Default: 50
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This parameter is required if you choose
     * <code>ALL</code> for <code>filter</code>.
     * </p>
     */
    private String assetModelId;
    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     * parameter is required if you filter by <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>ALL</code>
     * </p>
     */
    private String filter;

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

    public ListAssetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.</p>
     *         <p>
     *         Default: 50
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This parameter is required if you choose
     * <code>ALL</code> for <code>filter</code>.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model by which to filter the list of assets. This parameter is required if you choose
     *        <code>ALL</code> for <code>filter</code>.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This parameter is required if you choose
     * <code>ALL</code> for <code>filter</code>.
     * </p>
     * 
     * @return The ID of the asset model by which to filter the list of assets. This parameter is required if you choose
     *         <code>ALL</code> for <code>filter</code>.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model by which to filter the list of assets. This parameter is required if you choose
     * <code>ALL</code> for <code>filter</code>.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model by which to filter the list of assets. This parameter is required if you choose
     *        <code>ALL</code> for <code>filter</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsRequest withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
        return this;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     * parameter is required if you filter by <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>ALL</code>
     * </p>
     * 
     * @param filter
     *        The filter for the requested list of assets. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     *        parameter is required if you filter by <code>ALL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>ALL</code>
     * @see ListAssetsFilter
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     * parameter is required if you filter by <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>ALL</code>
     * </p>
     * 
     * @return The filter for the requested list of assets. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     *         parameter is required if you filter by <code>ALL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>ALL</code>
     * @see ListAssetsFilter
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     * parameter is required if you filter by <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>ALL</code>
     * </p>
     * 
     * @param filter
     *        The filter for the requested list of assets. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     *        parameter is required if you filter by <code>ALL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>ALL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListAssetsFilter
     */

    public ListAssetsRequest withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The filter for the requested list of assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     * parameter is required if you filter by <code>ALL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>ALL</code>
     * </p>
     * 
     * @param filter
     *        The filter for the requested list of assets. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all assets for a given asset model ID. The <code>assetModelId</code>
     *        parameter is required if you filter by <code>ALL</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LEVEL</code> – The list includes only top-level assets in the asset hierarchy tree.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>ALL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListAssetsFilter
     */

    public ListAssetsRequest withFilter(ListAssetsFilter filter) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
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

        if (obj instanceof ListAssetsRequest == false)
            return false;
        ListAssetsRequest other = (ListAssetsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetsRequest clone() {
        return (ListAssetsRequest) super.clone();
    }

}
