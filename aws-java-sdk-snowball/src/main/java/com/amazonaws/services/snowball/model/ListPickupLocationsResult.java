/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ListPickupLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPickupLocationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the address of pickup locations.
     * </p>
     */
    private java.util.List<Address> addresses;
    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of
     * <code>ListPickupLocationsResult</code> objects, you have the option of specifying <code>NextToken</code> as the
     * starting point for your returned list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the address of pickup locations.
     * </p>
     * 
     * @return Information about the address of pickup locations.
     */

    public java.util.List<Address> getAddresses() {
        return addresses;
    }

    /**
     * <p>
     * Information about the address of pickup locations.
     * </p>
     * 
     * @param addresses
     *        Information about the address of pickup locations.
     */

    public void setAddresses(java.util.Collection<Address> addresses) {
        if (addresses == null) {
            this.addresses = null;
            return;
        }

        this.addresses = new java.util.ArrayList<Address>(addresses);
    }

    /**
     * <p>
     * Information about the address of pickup locations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddresses(java.util.Collection)} or {@link #withAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addresses
     *        Information about the address of pickup locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPickupLocationsResult withAddresses(Address... addresses) {
        if (this.addresses == null) {
            setAddresses(new java.util.ArrayList<Address>(addresses.length));
        }
        for (Address ele : addresses) {
            this.addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the address of pickup locations.
     * </p>
     * 
     * @param addresses
     *        Information about the address of pickup locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPickupLocationsResult withAddresses(java.util.Collection<Address> addresses) {
        setAddresses(addresses);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of
     * <code>ListPickupLocationsResult</code> objects, you have the option of specifying <code>NextToken</code> as the
     * starting point for your returned list.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. To identify what object comes "next" in the list of
     *        <code>ListPickupLocationsResult</code> objects, you have the option of specifying <code>NextToken</code>
     *        as the starting point for your returned list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of
     * <code>ListPickupLocationsResult</code> objects, you have the option of specifying <code>NextToken</code> as the
     * starting point for your returned list.
     * </p>
     * 
     * @return HTTP requests are stateless. To identify what object comes "next" in the list of
     *         <code>ListPickupLocationsResult</code> objects, you have the option of specifying <code>NextToken</code>
     *         as the starting point for your returned list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the list of
     * <code>ListPickupLocationsResult</code> objects, you have the option of specifying <code>NextToken</code> as the
     * starting point for your returned list.
     * </p>
     * 
     * @param nextToken
     *        HTTP requests are stateless. To identify what object comes "next" in the list of
     *        <code>ListPickupLocationsResult</code> objects, you have the option of specifying <code>NextToken</code>
     *        as the starting point for your returned list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPickupLocationsResult withNextToken(String nextToken) {
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
        if (getAddresses() != null)
            sb.append("Addresses: ").append(getAddresses()).append(",");
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

        if (obj instanceof ListPickupLocationsResult == false)
            return false;
        ListPickupLocationsResult other = (ListPickupLocationsResult) obj;
        if (other.getAddresses() == null ^ this.getAddresses() == null)
            return false;
        if (other.getAddresses() != null && other.getAddresses().equals(this.getAddresses()) == false)
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

        hashCode = prime * hashCode + ((getAddresses() == null) ? 0 : getAddresses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPickupLocationsResult clone() {
        try {
            return (ListPickupLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
