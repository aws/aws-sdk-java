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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure contains a list of all available bundles with details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ListBundles" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListBundlesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of bundles.
     * </p>
     */
    private java.util.List<BundleDetails> bundleList;
    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of bundles.
     * </p>
     * 
     * @return A list of bundles.
     */

    public java.util.List<BundleDetails> getBundleList() {
        return bundleList;
    }

    /**
     * <p>
     * A list of bundles.
     * </p>
     * 
     * @param bundleList
     *        A list of bundles.
     */

    public void setBundleList(java.util.Collection<BundleDetails> bundleList) {
        if (bundleList == null) {
            this.bundleList = null;
            return;
        }

        this.bundleList = new java.util.ArrayList<BundleDetails>(bundleList);
    }

    /**
     * <p>
     * A list of bundles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundleList(java.util.Collection)} or {@link #withBundleList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bundleList
     *        A list of bundles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBundlesResult withBundleList(BundleDetails... bundleList) {
        if (this.bundleList == null) {
            setBundleList(new java.util.ArrayList<BundleDetails>(bundleList.length));
        }
        for (BundleDetails ele : bundleList) {
            this.bundleList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of bundles.
     * </p>
     * 
     * @param bundleList
     *        A list of bundles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBundlesResult withBundleList(java.util.Collection<BundleDetails> bundleList) {
        setBundleList(bundleList);
        return this;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @return Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *         request to fetch more entries.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to
     * fetch more entries.
     * </p>
     * 
     * @param nextToken
     *        Pagination token. If non-null pagination token is returned in a result, then pass its value in another
     *        request to fetch more entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListBundlesResult withNextToken(String nextToken) {
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
        if (getBundleList() != null)
            sb.append("BundleList: ").append(getBundleList()).append(",");
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

        if (obj instanceof ListBundlesResult == false)
            return false;
        ListBundlesResult other = (ListBundlesResult) obj;
        if (other.getBundleList() == null ^ this.getBundleList() == null)
            return false;
        if (other.getBundleList() != null && other.getBundleList().equals(this.getBundleList()) == false)
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

        hashCode = prime * hashCode + ((getBundleList() == null) ? 0 : getBundleList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBundlesResult clone() {
        try {
            return (ListBundlesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
