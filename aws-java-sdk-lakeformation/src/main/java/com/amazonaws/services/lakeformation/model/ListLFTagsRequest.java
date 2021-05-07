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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLFTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the requester has
     * permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags that the requester can
     * view. If no resource share type is passed, lists tags in the given catalog ID that the requester has permission
     * to view.
     * </p>
     */
    private String resourceShareType;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @return The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *         metadata store. It contains database definitions, table definitions, and other control information to
     *         manage your AWS Lake Formation environment.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata
     * store. It contains database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     * </p>
     * 
     * @param catalogId
     *        The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent
     *        metadata store. It contains database definitions, table definitions, and other control information to
     *        manage your AWS Lake Formation environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLFTagsRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the requester has
     * permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags that the requester can
     * view. If no resource share type is passed, lists tags in the given catalog ID that the requester has permission
     * to view.
     * </p>
     * 
     * @param resourceShareType
     *        If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the
     *        requester has permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags
     *        that the requester can view. If no resource share type is passed, lists tags in the given catalog ID that
     *        the requester has permission to view.
     * @see ResourceShareType
     */

    public void setResourceShareType(String resourceShareType) {
        this.resourceShareType = resourceShareType;
    }

    /**
     * <p>
     * If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the requester has
     * permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags that the requester can
     * view. If no resource share type is passed, lists tags in the given catalog ID that the requester has permission
     * to view.
     * </p>
     * 
     * @return If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the
     *         requester has permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags
     *         that the requester can view. If no resource share type is passed, lists tags in the given catalog ID that
     *         the requester has permission to view.
     * @see ResourceShareType
     */

    public String getResourceShareType() {
        return this.resourceShareType;
    }

    /**
     * <p>
     * If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the requester has
     * permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags that the requester can
     * view. If no resource share type is passed, lists tags in the given catalog ID that the requester has permission
     * to view.
     * </p>
     * 
     * @param resourceShareType
     *        If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the
     *        requester has permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags
     *        that the requester can view. If no resource share type is passed, lists tags in the given catalog ID that
     *        the requester has permission to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareType
     */

    public ListLFTagsRequest withResourceShareType(String resourceShareType) {
        setResourceShareType(resourceShareType);
        return this;
    }

    /**
     * <p>
     * If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the requester has
     * permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags that the requester can
     * view. If no resource share type is passed, lists tags in the given catalog ID that the requester has permission
     * to view.
     * </p>
     * 
     * @param resourceShareType
     *        If resource share type is <code>ALL</code>, returns both in-account tags and shared tags that the
     *        requester has permission to view. If resource share type is <code>FOREIGN</code>, returns all share tags
     *        that the requester can view. If no resource share type is passed, lists tags in the given catalog ID that
     *        the requester has permission to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareType
     */

    public ListLFTagsRequest withResourceShareType(ResourceShareType resourceShareType) {
        this.resourceShareType = resourceShareType.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLFTagsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve this list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve this list.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListLFTagsRequest withNextToken(String nextToken) {
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getResourceShareType() != null)
            sb.append("ResourceShareType: ").append(getResourceShareType()).append(",");
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

        if (obj instanceof ListLFTagsRequest == false)
            return false;
        ListLFTagsRequest other = (ListLFTagsRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getResourceShareType() == null ^ this.getResourceShareType() == null)
            return false;
        if (other.getResourceShareType() != null && other.getResourceShareType().equals(this.getResourceShareType()) == false)
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

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getResourceShareType() == null) ? 0 : getResourceShareType().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListLFTagsRequest clone() {
        return (ListLFTagsRequest) super.clone();
    }

}
