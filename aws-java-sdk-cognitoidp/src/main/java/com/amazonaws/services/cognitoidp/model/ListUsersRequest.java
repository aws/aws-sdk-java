/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to list users.
 * </p>
 */
public class ListUsersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     */
    private java.util.List<String> attributesToGet;
    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     */
    private String paginationToken;
    /**
     * <p>
     * The filter for the list users request.
     * </p>
     */
    private String filter;

    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for which you want to list users.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     * 
     * @return The user pool ID for which you want to list users.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for which you want to list users.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for which you want to list users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     * 
     * @return The attributes to get from the request to list users.
     */

    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     * 
     * @param attributesToGet
     *        The attributes to get from the request to list users.
     */

    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        this.attributesToGet = new java.util.ArrayList<String>(attributesToGet);
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributesToGet(java.util.Collection)} or {@link #withAttributesToGet(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attributesToGet
     *        The attributes to get from the request to list users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withAttributesToGet(String... attributesToGet) {
        if (this.attributesToGet == null) {
            setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        }
        for (String ele : attributesToGet) {
            this.attributesToGet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to get from the request to list users.
     * </p>
     * 
     * @param attributesToGet
     *        The attributes to get from the request to list users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        setAttributesToGet(attributesToGet);
        return this;
    }

    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     * 
     * @param limit
     *        The limit of the request to list users.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     * 
     * @return The limit of the request to list users.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The limit of the request to list users.
     * </p>
     * 
     * @param limit
     *        The limit of the request to list users.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     */

    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @return An identifier that was returned from the previous call to this operation, which can be used to return the
     *         next set of items in the list.
     */

    public String getPaginationToken() {
        return this.paginationToken;
    }

    /**
     * <p>
     * An identifier that was returned from the previous call to this operation, which can be used to return the next
     * set of items in the list.
     * </p>
     * 
     * @param paginationToken
     *        An identifier that was returned from the previous call to this operation, which can be used to return the
     *        next set of items in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withPaginationToken(String paginationToken) {
        setPaginationToken(paginationToken);
        return this;
    }

    /**
     * <p>
     * The filter for the list users request.
     * </p>
     * 
     * @param filter
     *        The filter for the list users request.
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter for the list users request.
     * </p>
     * 
     * @return The filter for the list users request.
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter for the list users request.
     * </p>
     * 
     * @param filter
     *        The filter for the list users request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsersRequest withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getAttributesToGet() != null)
            sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsersRequest == false)
            return false;
        ListUsersRequest other = (ListUsersRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null)
            return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null && other.getPaginationToken().equals(this.getPaginationToken()) == false)
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

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListUsersRequest clone() {
        return (ListUsersRequest) super.clone();
    }
}
