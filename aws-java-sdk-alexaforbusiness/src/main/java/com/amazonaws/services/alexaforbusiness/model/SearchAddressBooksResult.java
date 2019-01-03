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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/SearchAddressBooks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchAddressBooksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The address books that meet the specified set of filter criteria, in sort order.
     * </p>
     */
    private java.util.List<AddressBookData> addressBooks;
    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of address books returned.
     * </p>
     */
    private Integer totalCount;

    /**
     * <p>
     * The address books that meet the specified set of filter criteria, in sort order.
     * </p>
     * 
     * @return The address books that meet the specified set of filter criteria, in sort order.
     */

    public java.util.List<AddressBookData> getAddressBooks() {
        return addressBooks;
    }

    /**
     * <p>
     * The address books that meet the specified set of filter criteria, in sort order.
     * </p>
     * 
     * @param addressBooks
     *        The address books that meet the specified set of filter criteria, in sort order.
     */

    public void setAddressBooks(java.util.Collection<AddressBookData> addressBooks) {
        if (addressBooks == null) {
            this.addressBooks = null;
            return;
        }

        this.addressBooks = new java.util.ArrayList<AddressBookData>(addressBooks);
    }

    /**
     * <p>
     * The address books that meet the specified set of filter criteria, in sort order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddressBooks(java.util.Collection)} or {@link #withAddressBooks(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addressBooks
     *        The address books that meet the specified set of filter criteria, in sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksResult withAddressBooks(AddressBookData... addressBooks) {
        if (this.addressBooks == null) {
            setAddressBooks(new java.util.ArrayList<AddressBookData>(addressBooks.length));
        }
        for (AddressBookData ele : addressBooks) {
            this.addressBooks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The address books that meet the specified set of filter criteria, in sort order.
     * </p>
     * 
     * @param addressBooks
     *        The address books that meet the specified set of filter criteria, in sort order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksResult withAddressBooks(java.util.Collection<AddressBookData> addressBooks) {
        setAddressBooks(addressBooks);
        return this;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @return The token returned to indicate that there is more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned to indicate that there is more data available.
     * </p>
     * 
     * @param nextToken
     *        The token returned to indicate that there is more data available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of address books returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of address books returned.
     */

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * <p>
     * The total number of address books returned.
     * </p>
     * 
     * @return The total number of address books returned.
     */

    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * <p>
     * The total number of address books returned.
     * </p>
     * 
     * @param totalCount
     *        The total number of address books returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchAddressBooksResult withTotalCount(Integer totalCount) {
        setTotalCount(totalCount);
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
        if (getAddressBooks() != null)
            sb.append("AddressBooks: ").append(getAddressBooks()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTotalCount() != null)
            sb.append("TotalCount: ").append(getTotalCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAddressBooksResult == false)
            return false;
        SearchAddressBooksResult other = (SearchAddressBooksResult) obj;
        if (other.getAddressBooks() == null ^ this.getAddressBooks() == null)
            return false;
        if (other.getAddressBooks() != null && other.getAddressBooks().equals(this.getAddressBooks()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTotalCount() == null ^ this.getTotalCount() == null)
            return false;
        if (other.getTotalCount() != null && other.getTotalCount().equals(this.getTotalCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressBooks() == null) ? 0 : getAddressBooks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTotalCount() == null) ? 0 : getTotalCount().hashCode());
        return hashCode;
    }

    @Override
    public SearchAddressBooksResult clone() {
        try {
            return (SearchAddressBooksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
