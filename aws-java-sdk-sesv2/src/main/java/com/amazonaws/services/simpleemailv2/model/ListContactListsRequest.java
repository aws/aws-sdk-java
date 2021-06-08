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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListContactLists" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactListsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional contact
     * lists exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional lists.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Use the token
     * provided in the Response to use in the subsequent call to ListContactLists with the same parameters to retrieve
     * the next page of contact lists.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional contact
     * lists exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional lists.
     * </p>
     * 
     * @param pageSize
     *        Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional
     *        contact lists exist beyond the specified limit, the <code>NextToken</code> element is sent in the
     *        response. Use the <code>NextToken</code> value in subsequent requests to retrieve additional lists.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional contact
     * lists exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional lists.
     * </p>
     * 
     * @return Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional
     *         contact lists exist beyond the specified limit, the <code>NextToken</code> element is sent in the
     *         response. Use the <code>NextToken</code> value in subsequent requests to retrieve additional lists.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional contact
     * lists exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional lists.
     * </p>
     * 
     * @param pageSize
     *        Maximum number of contact lists to return at once. Use this parameter to paginate results. If additional
     *        contact lists exist beyond the specified limit, the <code>NextToken</code> element is sent in the
     *        response. Use the <code>NextToken</code> value in subsequent requests to retrieve additional lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactListsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Use the token
     * provided in the Response to use in the subsequent call to ListContactLists with the same parameters to retrieve
     * the next page of contact lists.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contact lists available to be listed. Use the
     *        token provided in the Response to use in the subsequent call to ListContactLists with the same parameters
     *        to retrieve the next page of contact lists.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Use the token
     * provided in the Response to use in the subsequent call to ListContactLists with the same parameters to retrieve
     * the next page of contact lists.
     * </p>
     * 
     * @return A string token indicating that there might be additional contact lists available to be listed. Use the
     *         token provided in the Response to use in the subsequent call to ListContactLists with the same parameters
     *         to retrieve the next page of contact lists.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contact lists available to be listed. Use the token
     * provided in the Response to use in the subsequent call to ListContactLists with the same parameters to retrieve
     * the next page of contact lists.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contact lists available to be listed. Use the
     *        token provided in the Response to use in the subsequent call to ListContactLists with the same parameters
     *        to retrieve the next page of contact lists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactListsRequest withNextToken(String nextToken) {
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
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
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

        if (obj instanceof ListContactListsRequest == false)
            return false;
        ListContactListsRequest other = (ListContactListsRequest) obj;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
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

        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactListsRequest clone() {
        return (ListContactListsRequest) super.clone();
    }

}
