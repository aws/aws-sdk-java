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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceBundlesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> bundleIds;
    /**
     * <p>
     * The owner of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Specify <code>AMAZON</code> to describe the bundles provided by AWS or null to describe the bundles that belong
     * to your account.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The token for the next set of results. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The identifiers of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * 
     * @return The identifiers of the bundles. You cannot combine this parameter with any other filter.
     */

    public java.util.List<String> getBundleIds() {
        if (bundleIds == null) {
            bundleIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return bundleIds;
    }

    /**
     * <p>
     * The identifiers of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * 
     * @param bundleIds
     *        The identifiers of the bundles. You cannot combine this parameter with any other filter.
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
     * The identifiers of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundleIds(java.util.Collection)} or {@link #withBundleIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bundleIds
     *        The identifiers of the bundles. You cannot combine this parameter with any other filter.
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
     * The identifiers of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * 
     * @param bundleIds
     *        The identifiers of the bundles. You cannot combine this parameter with any other filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesRequest withBundleIds(java.util.Collection<String> bundleIds) {
        setBundleIds(bundleIds);
        return this;
    }

    /**
     * <p>
     * The owner of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Specify <code>AMAZON</code> to describe the bundles provided by AWS or null to describe the bundles that belong
     * to your account.
     * </p>
     * 
     * @param owner
     *        The owner of the bundles. You cannot combine this parameter with any other filter.</p>
     *        <p>
     *        Specify <code>AMAZON</code> to describe the bundles provided by AWS or null to describe the bundles that
     *        belong to your account.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Specify <code>AMAZON</code> to describe the bundles provided by AWS or null to describe the bundles that belong
     * to your account.
     * </p>
     * 
     * @return The owner of the bundles. You cannot combine this parameter with any other filter.</p>
     *         <p>
     *         Specify <code>AMAZON</code> to describe the bundles provided by AWS or null to describe the bundles that
     *         belong to your account.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the bundles. You cannot combine this parameter with any other filter.
     * </p>
     * <p>
     * Specify <code>AMAZON</code> to describe the bundles provided by AWS or null to describe the bundles that belong
     * to your account.
     * </p>
     * 
     * @param owner
     *        The owner of the bundles. You cannot combine this parameter with any other filter.</p>
     *        <p>
     *        Specify <code>AMAZON</code> to describe the bundles provided by AWS or null to describe the bundles that
     *        belong to your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesRequest withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of results. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesRequest withNextToken(String nextToken) {
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
        if (getBundleIds() != null)
            sb.append("BundleIds: ").append(getBundleIds()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
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
