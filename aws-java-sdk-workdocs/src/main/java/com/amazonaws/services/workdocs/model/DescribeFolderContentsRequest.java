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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/DescribeFolderContents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFolderContentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     */
    private String authenticationToken;
    /**
     * <p>
     * The ID of the folder.
     * </p>
     */
    private String folderId;
    /**
     * <p>
     * The sorting criteria.
     * </p>
     */
    private String sort;
    /**
     * <p>
     * The order for the contents of the folder.
     * </p>
     */
    private String order;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The type of items.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The contents to include. Specify "INITIALIZED" to include initialized documents.
     * </p>
     */
    private String include;

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     */

    public void setAuthenticationToken(String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @return Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *         accessing the API using AWS credentials.
     */

    public String getAuthenticationToken() {
        return this.authenticationToken;
    }

    /**
     * <p>
     * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     * accessing the API using AWS credentials.
     * </p>
     * 
     * @param authenticationToken
     *        Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in
     *        accessing the API using AWS credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderContentsRequest withAuthenticationToken(String authenticationToken) {
        setAuthenticationToken(authenticationToken);
        return this;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     */

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @return The ID of the folder.
     */

    public String getFolderId() {
        return this.folderId;
    }

    /**
     * <p>
     * The ID of the folder.
     * </p>
     * 
     * @param folderId
     *        The ID of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderContentsRequest withFolderId(String folderId) {
        setFolderId(folderId);
        return this;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @see ResourceSortType
     */

    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @return The sorting criteria.
     * @see ResourceSortType
     */

    public String getSort() {
        return this.sort;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSortType
     */

    public DescribeFolderContentsRequest withSort(String sort) {
        setSort(sort);
        return this;
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @see ResourceSortType
     */

    public void setSort(ResourceSortType sort) {
        withSort(sort);
    }

    /**
     * <p>
     * The sorting criteria.
     * </p>
     * 
     * @param sort
     *        The sorting criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceSortType
     */

    public DescribeFolderContentsRequest withSort(ResourceSortType sort) {
        this.sort = sort.toString();
        return this;
    }

    /**
     * <p>
     * The order for the contents of the folder.
     * </p>
     * 
     * @param order
     *        The order for the contents of the folder.
     * @see OrderType
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The order for the contents of the folder.
     * </p>
     * 
     * @return The order for the contents of the folder.
     * @see OrderType
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order for the contents of the folder.
     * </p>
     * 
     * @param order
     *        The order for the contents of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderType
     */

    public DescribeFolderContentsRequest withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The order for the contents of the folder.
     * </p>
     * 
     * @param order
     *        The order for the contents of the folder.
     * @see OrderType
     */

    public void setOrder(OrderType order) {
        withOrder(order);
    }

    /**
     * <p>
     * The order for the contents of the folder.
     * </p>
     * 
     * @param order
     *        The order for the contents of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderType
     */

    public DescribeFolderContentsRequest withOrder(OrderType order) {
        this.order = order.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return with this call.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param limit
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderContentsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. This marker was received from a previous call.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @return The marker for the next set of results. This marker was received from a previous call.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The marker for the next set of results. This marker was received from a previous call.
     * </p>
     * 
     * @param marker
     *        The marker for the next set of results. This marker was received from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderContentsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The type of items.
     * </p>
     * 
     * @param type
     *        The type of items.
     * @see FolderContentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of items.
     * </p>
     * 
     * @return The type of items.
     * @see FolderContentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of items.
     * </p>
     * 
     * @param type
     *        The type of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderContentType
     */

    public DescribeFolderContentsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of items.
     * </p>
     * 
     * @param type
     *        The type of items.
     * @see FolderContentType
     */

    public void setType(FolderContentType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of items.
     * </p>
     * 
     * @param type
     *        The type of items.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FolderContentType
     */

    public DescribeFolderContentsRequest withType(FolderContentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The contents to include. Specify "INITIALIZED" to include initialized documents.
     * </p>
     * 
     * @param include
     *        The contents to include. Specify "INITIALIZED" to include initialized documents.
     */

    public void setInclude(String include) {
        this.include = include;
    }

    /**
     * <p>
     * The contents to include. Specify "INITIALIZED" to include initialized documents.
     * </p>
     * 
     * @return The contents to include. Specify "INITIALIZED" to include initialized documents.
     */

    public String getInclude() {
        return this.include;
    }

    /**
     * <p>
     * The contents to include. Specify "INITIALIZED" to include initialized documents.
     * </p>
     * 
     * @param include
     *        The contents to include. Specify "INITIALIZED" to include initialized documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFolderContentsRequest withInclude(String include) {
        setInclude(include);
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
        if (getAuthenticationToken() != null)
            sb.append("AuthenticationToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getFolderId() != null)
            sb.append("FolderId: ").append(getFolderId()).append(",");
        if (getSort() != null)
            sb.append("Sort: ").append(getSort()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getInclude() != null)
            sb.append("Include: ").append(getInclude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFolderContentsRequest == false)
            return false;
        DescribeFolderContentsRequest other = (DescribeFolderContentsRequest) obj;
        if (other.getAuthenticationToken() == null ^ this.getAuthenticationToken() == null)
            return false;
        if (other.getAuthenticationToken() != null && other.getAuthenticationToken().equals(this.getAuthenticationToken()) == false)
            return false;
        if (other.getFolderId() == null ^ this.getFolderId() == null)
            return false;
        if (other.getFolderId() != null && other.getFolderId().equals(this.getFolderId()) == false)
            return false;
        if (other.getSort() == null ^ this.getSort() == null)
            return false;
        if (other.getSort() != null && other.getSort().equals(this.getSort()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getInclude() == null ^ this.getInclude() == null)
            return false;
        if (other.getInclude() != null && other.getInclude().equals(this.getInclude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthenticationToken() == null) ? 0 : getAuthenticationToken().hashCode());
        hashCode = prime * hashCode + ((getFolderId() == null) ? 0 : getFolderId().hashCode());
        hashCode = prime * hashCode + ((getSort() == null) ? 0 : getSort().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getInclude() == null) ? 0 : getInclude().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFolderContentsRequest clone() {
        return (DescribeFolderContentsRequest) super.clone();
    }

}
