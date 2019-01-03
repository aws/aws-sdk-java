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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/DescribeWorkspaceBundles"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkspaceBundlesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the bundles.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<WorkspaceBundle> bundles;
    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if there are no more results available. This token
     * is valid for one day and must be used within that time frame.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the bundles.
     * </p>
     * 
     * @return Information about the bundles.
     */

    public java.util.List<WorkspaceBundle> getBundles() {
        if (bundles == null) {
            bundles = new com.amazonaws.internal.SdkInternalList<WorkspaceBundle>();
        }
        return bundles;
    }

    /**
     * <p>
     * Information about the bundles.
     * </p>
     * 
     * @param bundles
     *        Information about the bundles.
     */

    public void setBundles(java.util.Collection<WorkspaceBundle> bundles) {
        if (bundles == null) {
            this.bundles = null;
            return;
        }

        this.bundles = new com.amazonaws.internal.SdkInternalList<WorkspaceBundle>(bundles);
    }

    /**
     * <p>
     * Information about the bundles.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBundles(java.util.Collection)} or {@link #withBundles(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param bundles
     *        Information about the bundles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesResult withBundles(WorkspaceBundle... bundles) {
        if (this.bundles == null) {
            setBundles(new com.amazonaws.internal.SdkInternalList<WorkspaceBundle>(bundles.length));
        }
        for (WorkspaceBundle ele : bundles) {
            this.bundles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the bundles.
     * </p>
     * 
     * @param bundles
     *        Information about the bundles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesResult withBundles(java.util.Collection<WorkspaceBundle> bundles) {
        setBundles(bundles);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if there are no more results available. This token
     * is valid for one day and must be used within that time frame.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if there are no more results available. This
     *        token is valid for one day and must be used within that time frame.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if there are no more results available. This token
     * is valid for one day and must be used within that time frame.
     * </p>
     * 
     * @return The token to use to retrieve the next set of results, or null if there are no more results available.
     *         This token is valid for one day and must be used within that time frame.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next set of results, or null if there are no more results available. This token
     * is valid for one day and must be used within that time frame.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next set of results, or null if there are no more results available. This
     *        token is valid for one day and must be used within that time frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkspaceBundlesResult withNextToken(String nextToken) {
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
        if (getBundles() != null)
            sb.append("Bundles: ").append(getBundles()).append(",");
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

        if (obj instanceof DescribeWorkspaceBundlesResult == false)
            return false;
        DescribeWorkspaceBundlesResult other = (DescribeWorkspaceBundlesResult) obj;
        if (other.getBundles() == null ^ this.getBundles() == null)
            return false;
        if (other.getBundles() != null && other.getBundles().equals(this.getBundles()) == false)
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

        hashCode = prime * hashCode + ((getBundles() == null) ? 0 : getBundles().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkspaceBundlesResult clone() {
        try {
            return (DescribeWorkspaceBundlesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
