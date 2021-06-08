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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each asset.
     * </p>
     */
    private java.util.List<AssetSummary> assetSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each asset.
     * </p>
     * 
     * @return A list that summarizes each asset.
     */

    public java.util.List<AssetSummary> getAssetSummaries() {
        return assetSummaries;
    }

    /**
     * <p>
     * A list that summarizes each asset.
     * </p>
     * 
     * @param assetSummaries
     *        A list that summarizes each asset.
     */

    public void setAssetSummaries(java.util.Collection<AssetSummary> assetSummaries) {
        if (assetSummaries == null) {
            this.assetSummaries = null;
            return;
        }

        this.assetSummaries = new java.util.ArrayList<AssetSummary>(assetSummaries);
    }

    /**
     * <p>
     * A list that summarizes each asset.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetSummaries(java.util.Collection)} or {@link #withAssetSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param assetSummaries
     *        A list that summarizes each asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsResult withAssetSummaries(AssetSummary... assetSummaries) {
        if (this.assetSummaries == null) {
            setAssetSummaries(new java.util.ArrayList<AssetSummary>(assetSummaries.length));
        }
        for (AssetSummary ele : assetSummaries) {
            this.assetSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each asset.
     * </p>
     * 
     * @param assetSummaries
     *        A list that summarizes each asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsResult withAssetSummaries(java.util.Collection<AssetSummary> assetSummaries) {
        setAssetSummaries(assetSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsResult withNextToken(String nextToken) {
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
        if (getAssetSummaries() != null)
            sb.append("AssetSummaries: ").append(getAssetSummaries()).append(",");
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

        if (obj instanceof ListAssetsResult == false)
            return false;
        ListAssetsResult other = (ListAssetsResult) obj;
        if (other.getAssetSummaries() == null ^ this.getAssetSummaries() == null)
            return false;
        if (other.getAssetSummaries() != null && other.getAssetSummaries().equals(this.getAssetSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAssetSummaries() == null) ? 0 : getAssetSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetsResult clone() {
        try {
            return (ListAssetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
