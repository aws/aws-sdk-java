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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListContacts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListContactsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the contact list.
     * </p>
     */
    private String contactListName;
    /**
     * <p>
     * A filter that can be applied to a list of contacts.
     * </p>
     */
    private ListContactsFilter filter;
    /**
     * <p>
     * The number of contacts that may be returned at once, which is dependent on if there are more or less contacts
     * than the value of the PageSize. Use this parameter to paginate results. If additional contacts exist beyond the
     * specified limit, the <code>NextToken</code> element is sent in the response. Use the <code>NextToken</code> value
     * in subsequent requests to retrieve additional contacts.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Use the token provided
     * in the Response to use in the subsequent call to ListContacts with the same parameters to retrieve the next page
     * of contacts.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     */

    public void setContactListName(String contactListName) {
        this.contactListName = contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @return The name of the contact list.
     */

    public String getContactListName() {
        return this.contactListName;
    }

    /**
     * <p>
     * The name of the contact list.
     * </p>
     * 
     * @param contactListName
     *        The name of the contact list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withContactListName(String contactListName) {
        setContactListName(contactListName);
        return this;
    }

    /**
     * <p>
     * A filter that can be applied to a list of contacts.
     * </p>
     * 
     * @param filter
     *        A filter that can be applied to a list of contacts.
     */

    public void setFilter(ListContactsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A filter that can be applied to a list of contacts.
     * </p>
     * 
     * @return A filter that can be applied to a list of contacts.
     */

    public ListContactsFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A filter that can be applied to a list of contacts.
     * </p>
     * 
     * @param filter
     *        A filter that can be applied to a list of contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withFilter(ListContactsFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The number of contacts that may be returned at once, which is dependent on if there are more or less contacts
     * than the value of the PageSize. Use this parameter to paginate results. If additional contacts exist beyond the
     * specified limit, the <code>NextToken</code> element is sent in the response. Use the <code>NextToken</code> value
     * in subsequent requests to retrieve additional contacts.
     * </p>
     * 
     * @param pageSize
     *        The number of contacts that may be returned at once, which is dependent on if there are more or less
     *        contacts than the value of the PageSize. Use this parameter to paginate results. If additional contacts
     *        exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     *        <code>NextToken</code> value in subsequent requests to retrieve additional contacts.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The number of contacts that may be returned at once, which is dependent on if there are more or less contacts
     * than the value of the PageSize. Use this parameter to paginate results. If additional contacts exist beyond the
     * specified limit, the <code>NextToken</code> element is sent in the response. Use the <code>NextToken</code> value
     * in subsequent requests to retrieve additional contacts.
     * </p>
     * 
     * @return The number of contacts that may be returned at once, which is dependent on if there are more or less
     *         contacts than the value of the PageSize. Use this parameter to paginate results. If additional contacts
     *         exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     *         <code>NextToken</code> value in subsequent requests to retrieve additional contacts.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The number of contacts that may be returned at once, which is dependent on if there are more or less contacts
     * than the value of the PageSize. Use this parameter to paginate results. If additional contacts exist beyond the
     * specified limit, the <code>NextToken</code> element is sent in the response. Use the <code>NextToken</code> value
     * in subsequent requests to retrieve additional contacts.
     * </p>
     * 
     * @param pageSize
     *        The number of contacts that may be returned at once, which is dependent on if there are more or less
     *        contacts than the value of the PageSize. Use this parameter to paginate results. If additional contacts
     *        exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     *        <code>NextToken</code> value in subsequent requests to retrieve additional contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Use the token provided
     * in the Response to use in the subsequent call to ListContacts with the same parameters to retrieve the next page
     * of contacts.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contacts available to be listed. Use the token
     *        provided in the Response to use in the subsequent call to ListContacts with the same parameters to
     *        retrieve the next page of contacts.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Use the token provided
     * in the Response to use in the subsequent call to ListContacts with the same parameters to retrieve the next page
     * of contacts.
     * </p>
     * 
     * @return A string token indicating that there might be additional contacts available to be listed. Use the token
     *         provided in the Response to use in the subsequent call to ListContacts with the same parameters to
     *         retrieve the next page of contacts.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional contacts available to be listed. Use the token provided
     * in the Response to use in the subsequent call to ListContacts with the same parameters to retrieve the next page
     * of contacts.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional contacts available to be listed. Use the token
     *        provided in the Response to use in the subsequent call to ListContacts with the same parameters to
     *        retrieve the next page of contacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListContactsRequest withNextToken(String nextToken) {
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
        if (getContactListName() != null)
            sb.append("ContactListName: ").append(getContactListName()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof ListContactsRequest == false)
            return false;
        ListContactsRequest other = (ListContactsRequest) obj;
        if (other.getContactListName() == null ^ this.getContactListName() == null)
            return false;
        if (other.getContactListName() != null && other.getContactListName().equals(this.getContactListName()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getContactListName() == null) ? 0 : getContactListName().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListContactsRequest clone() {
        return (ListContactsRequest) super.clone();
    }

}
