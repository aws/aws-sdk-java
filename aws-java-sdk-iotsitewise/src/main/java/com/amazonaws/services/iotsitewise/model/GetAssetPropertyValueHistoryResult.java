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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GetAssetPropertyValueHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssetPropertyValueHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The asset property's value history.
     * </p>
     */
    private java.util.List<AssetPropertyValue> assetPropertyValueHistory;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The asset property's value history.
     * </p>
     * 
     * @return The asset property's value history.
     */

    public java.util.List<AssetPropertyValue> getAssetPropertyValueHistory() {
        return assetPropertyValueHistory;
    }

    /**
     * <p>
     * The asset property's value history.
     * </p>
     * 
     * @param assetPropertyValueHistory
     *        The asset property's value history.
     */

    public void setAssetPropertyValueHistory(java.util.Collection<AssetPropertyValue> assetPropertyValueHistory) {
        if (assetPropertyValueHistory == null) {
            this.assetPropertyValueHistory = null;
            return;
        }

        this.assetPropertyValueHistory = new java.util.ArrayList<AssetPropertyValue>(assetPropertyValueHistory);
    }

    /**
     * <p>
     * The asset property's value history.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetPropertyValueHistory(java.util.Collection)} or
     * {@link #withAssetPropertyValueHistory(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assetPropertyValueHistory
     *        The asset property's value history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyValueHistoryResult withAssetPropertyValueHistory(AssetPropertyValue... assetPropertyValueHistory) {
        if (this.assetPropertyValueHistory == null) {
            setAssetPropertyValueHistory(new java.util.ArrayList<AssetPropertyValue>(assetPropertyValueHistory.length));
        }
        for (AssetPropertyValue ele : assetPropertyValueHistory) {
            this.assetPropertyValueHistory.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The asset property's value history.
     * </p>
     * 
     * @param assetPropertyValueHistory
     *        The asset property's value history.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAssetPropertyValueHistoryResult withAssetPropertyValueHistory(java.util.Collection<AssetPropertyValue> assetPropertyValueHistory) {
        setAssetPropertyValueHistory(assetPropertyValueHistory);
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

    public GetAssetPropertyValueHistoryResult withNextToken(String nextToken) {
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
        if (getAssetPropertyValueHistory() != null)
            sb.append("AssetPropertyValueHistory: ").append(getAssetPropertyValueHistory()).append(",");
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

        if (obj instanceof GetAssetPropertyValueHistoryResult == false)
            return false;
        GetAssetPropertyValueHistoryResult other = (GetAssetPropertyValueHistoryResult) obj;
        if (other.getAssetPropertyValueHistory() == null ^ this.getAssetPropertyValueHistory() == null)
            return false;
        if (other.getAssetPropertyValueHistory() != null && other.getAssetPropertyValueHistory().equals(this.getAssetPropertyValueHistory()) == false)
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

        hashCode = prime * hashCode + ((getAssetPropertyValueHistory() == null) ? 0 : getAssetPropertyValueHistory().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAssetPropertyValueHistoryResult clone() {
        try {
            return (GetAssetPropertyValueHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
