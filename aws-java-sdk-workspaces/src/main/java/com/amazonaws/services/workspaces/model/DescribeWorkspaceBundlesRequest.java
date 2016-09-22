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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>DescribeWorkspaceBundles</a> operation.
 * </p>
 */
public class DescribeWorkspaceBundlesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be combined
     * with any other filter parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bundleIds;
    /**
     * <p>
     * The owner of the bundles to retrieve. This parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * This contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * null- Retrieves the bundles that belong to the account making the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMAZON</code>- Retrieves the bundles that are provided by AWS.
     * </p>
     * </li>
     * </ul>
     */
    private String owner;
    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be combined
     * with any other filter parameter.
     * </p>
     * 
     * @return An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be
     *         combined with any other filter parameter.
     */

    public java.util.List<String> getBundleIds() {
        if (bundleIds == null) {
            bundleIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bundleIds;
    }

    /**
     * <p>
     * An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be combined
     * with any other filter parameter.
     * </p>
     * 
     * @param bundleIds
     *        An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be
     *        combined with any other filter parameter.
     */

    public void setBundleIds(java.util.Collection<String> bundleIds) {
        if (bundleIds == null) {
            this.bundleIds = null;
            return;
        }

        this.bundleIds = new com.amazonaws.internal.SdkInternalList<String>(bundleIds);
    }

    /**
     * <p>
     * An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be combined
     * with any other filter parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundleIds(java.util.Collection)} or {@link #withBundleIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bundleIds
     *        An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be
     *        combined with any other filter parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesRequest withBundleIds(String... bundleIds) {
        if (this.bundleIds == null) {
            setBundleIds(new com.amazonaws.internal.SdkInternalList<String>(bundleIds.length));
        }
        for (String ele : bundleIds) {
            this.bundleIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be combined
     * with any other filter parameter.
     * </p>
     * 
     * @param bundleIds
     *        An array of strings that contains the identifiers of the bundles to retrieve. This parameter cannot be
     *        combined with any other filter parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesRequest withBundleIds(java.util.Collection<String> bundleIds) {
        setBundleIds(bundleIds);
        return this;
    }

    /**
     * <p>
     * The owner of the bundles to retrieve. This parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * This contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * null- Retrieves the bundles that belong to the account making the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMAZON</code>- Retrieves the bundles that are provided by AWS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param owner
     *        The owner of the bundles to retrieve. This parameter cannot be combined with any other filter
     *        parameter.</p>
     *        <p>
     *        This contains one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        null- Retrieves the bundles that belong to the account making the call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AMAZON</code>- Retrieves the bundles that are provided by AWS.
     *        </p>
     *        </li>
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the bundles to retrieve. This parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * This contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * null- Retrieves the bundles that belong to the account making the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMAZON</code>- Retrieves the bundles that are provided by AWS.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The owner of the bundles to retrieve. This parameter cannot be combined with any other filter
     *         parameter.</p>
     *         <p>
     *         This contains one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         null- Retrieves the bundles that belong to the account making the call.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AMAZON</code>- Retrieves the bundles that are provided by AWS.
     *         </p>
     *         </li>
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the bundles to retrieve. This parameter cannot be combined with any other filter parameter.
     * </p>
     * <p>
     * This contains one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * null- Retrieves the bundles that belong to the account making the call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AMAZON</code>- Retrieves the bundles that are provided by AWS.
     * </p>
     * </li>
     * </ul>
     * 
     * @param owner
     *        The owner of the bundles to retrieve. This parameter cannot be combined with any other filter
     *        parameter.</p>
     *        <p>
     *        This contains one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        null- Retrieves the bundles that belong to the account making the call.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AMAZON</code>- Retrieves the bundles that are provided by AWS.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *        call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @return The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *         call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value from a previous call to this operation. Pass null if this is the first
     *        call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getBundleIds() != null)
            sb.append("BundleIds: " + getBundleIds() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkspaceBundlesRequest == false)
            return false;
        DescribeWorkspaceBundlesRequest other = (DescribeWorkspaceBundlesRequest) obj;
        if (other.getBundleIds() == null ^ this.getBundleIds() == null)
            return false;
        if (other.getBundleIds() != null && other.getBundleIds().equals(this.getBundleIds()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
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

        hashCode = prime * hashCode + ((getBundleIds() == null) ? 0 : getBundleIds().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceBundlesRequest clone() {
        return (DescribeWorkspaceBundlesRequest) super.clone();
    }
}
