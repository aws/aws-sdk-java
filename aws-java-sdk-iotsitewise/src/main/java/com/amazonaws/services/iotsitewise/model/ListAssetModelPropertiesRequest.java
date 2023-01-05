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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetModelProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetModelPropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     */
    private String assetModelId;
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
     * Filters the requested list of asset model properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
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
     * The ID of the asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model.
     */

    public void setAssetModelId(String assetModelId) {
        this.assetModelId = assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @return The ID of the asset model.
     */

    public String getAssetModelId() {
        return this.assetModelId;
    }

    /**
     * <p>
     * The ID of the asset model.
     * </p>
     * 
     * @param assetModelId
     *        The ID of the asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetModelPropertiesRequest withAssetModelId(String assetModelId) {
        setAssetModelId(assetModelId);
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

    public ListAssetModelPropertiesRequest withNextToken(String nextToken) {
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

    public ListAssetModelPropertiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Filters the requested list of asset model properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @param filter
     *        Filters the requested list of asset model properties. You can choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>BASE</code>
     * @see ListAssetModelPropertiesFilter
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters the requested list of asset model properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @return Filters the requested list of asset model properties. You can choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>BASE</code>
     * @see ListAssetModelPropertiesFilter
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters the requested list of asset model properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @param filter
     *        Filters the requested list of asset model properties. You can choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>BASE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListAssetModelPropertiesFilter
     */

    public ListAssetModelPropertiesRequest withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Filters the requested list of asset model properties. You can choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>BASE</code>
     * </p>
     * 
     * @param filter
     *        Filters the requested list of asset model properties. You can choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – The list includes all asset model properties for a given asset model ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BASE</code> – The list includes only base asset model properties for a given asset model ID.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>BASE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListAssetModelPropertiesFilter
     */

    public ListAssetModelPropertiesRequest withFilter(ListAssetModelPropertiesFilter filter) {
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
        if (getAssetModelId() != null)
            sb.append("AssetModelId: ").append(getAssetModelId()).append(",");
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

        if (obj instanceof ListAssetModelPropertiesRequest == false)
            return false;
        ListAssetModelPropertiesRequest other = (ListAssetModelPropertiesRequest) obj;
        if (other.getAssetModelId() == null ^ this.getAssetModelId() == null)
            return false;
        if (other.getAssetModelId() != null && other.getAssetModelId().equals(this.getAssetModelId()) == false)
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

        hashCode = prime * hashCode + ((getAssetModelId() == null) ? 0 : getAssetModelId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetModelPropertiesRequest clone() {
        return (ListAssetModelPropertiesRequest) super.clone();
    }

}
