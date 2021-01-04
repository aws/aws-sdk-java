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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetModels" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetModelsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that summarizes each asset model.
     * </p>
     */
    private java.util.List<AssetModelSummary> assetModelSummaries;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that summarizes each asset model.
     * </p>
     * 
     * @return A list that summarizes each asset model.
     */

    public java.util.List<AssetModelSummary> getAssetModelSummaries() {
        return assetModelSummaries;
    }

    /**
     * <p>
     * A list that summarizes each asset model.
     * </p>
     * 
     * @param assetModelSummaries
     *        A list that summarizes each asset model.
     */

    public void setAssetModelSummaries(java.util.Collection<AssetModelSummary> assetModelSummaries) {
        if (assetModelSummaries == null) {
            this.assetModelSummaries = null;
            return;
        }

        this.assetModelSummaries = new java.util.ArrayList<AssetModelSummary>(assetModelSummaries);
    }

    /**
     * <p>
     * A list that summarizes each asset model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetModelSummaries(java.util.Collection)} or {@link #withAssetModelSummaries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param assetModelSummaries
     *        A list that summarizes each asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetModelsResult withAssetModelSummaries(AssetModelSummary... assetModelSummaries) {
        if (this.assetModelSummaries == null) {
            setAssetModelSummaries(new java.util.ArrayList<AssetModelSummary>(assetModelSummaries.length));
        }
        for (AssetModelSummary ele : assetModelSummaries) {
            this.assetModelSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that summarizes each asset model.
     * </p>
     * 
     * @param assetModelSummaries
     *        A list that summarizes each asset model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetModelsResult withAssetModelSummaries(java.util.Collection<AssetModelSummary> assetModelSummaries) {
        setAssetModelSummaries(assetModelSummaries);
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

    public ListAssetModelsResult withNextToken(String nextToken) {
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
        if (getAssetModelSummaries() != null)
            sb.append("AssetModelSummaries: ").append(getAssetModelSummaries()).append(",");
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

        if (obj instanceof ListAssetModelsResult == false)
            return false;
        ListAssetModelsResult other = (ListAssetModelsResult) obj;
        if (other.getAssetModelSummaries() == null ^ this.getAssetModelSummaries() == null)
            return false;
        if (other.getAssetModelSummaries() != null && other.getAssetModelSummaries().equals(this.getAssetModelSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAssetModelSummaries() == null) ? 0 : getAssetModelSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetModelsResult clone() {
        try {
            return (ListAssetModelsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
