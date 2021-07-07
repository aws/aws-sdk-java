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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssetRelationships" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetRelationshipsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The type of traversal to use to identify asset relationships. Choose the following option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you specify
     * in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>, and the root
     * asset is the last result.
     * </p>
     * </li>
     * </ul>
     */
    private String traversalType;
    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @return The ID of the asset.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetRelationshipsRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The type of traversal to use to identify asset relationships. Choose the following option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you specify
     * in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>, and the root
     * asset is the last result.
     * </p>
     * </li>
     * </ul>
     * 
     * @param traversalType
     *        The type of traversal to use to identify asset relationships. Choose the following option:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you
     *        specify in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>
     *        , and the root asset is the last result.
     *        </p>
     *        </li>
     * @see TraversalType
     */

    public void setTraversalType(String traversalType) {
        this.traversalType = traversalType;
    }

    /**
     * <p>
     * The type of traversal to use to identify asset relationships. Choose the following option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you specify
     * in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>, and the root
     * asset is the last result.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of traversal to use to identify asset relationships. Choose the following option:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you
     *         specify in <code>assetId</code> is the first result in the list of
     *         <code>assetRelationshipSummaries</code>, and the root asset is the last result.
     *         </p>
     *         </li>
     * @see TraversalType
     */

    public String getTraversalType() {
        return this.traversalType;
    }

    /**
     * <p>
     * The type of traversal to use to identify asset relationships. Choose the following option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you specify
     * in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>, and the root
     * asset is the last result.
     * </p>
     * </li>
     * </ul>
     * 
     * @param traversalType
     *        The type of traversal to use to identify asset relationships. Choose the following option:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you
     *        specify in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>
     *        , and the root asset is the last result.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TraversalType
     */

    public ListAssetRelationshipsRequest withTraversalType(String traversalType) {
        setTraversalType(traversalType);
        return this;
    }

    /**
     * <p>
     * The type of traversal to use to identify asset relationships. Choose the following option:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you specify
     * in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>, and the root
     * asset is the last result.
     * </p>
     * </li>
     * </ul>
     * 
     * @param traversalType
     *        The type of traversal to use to identify asset relationships. Choose the following option:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PATH_TO_ROOT</code> – Identify the asset's parent assets up to the root asset. The asset that you
     *        specify in <code>assetId</code> is the first result in the list of <code>assetRelationshipSummaries</code>
     *        , and the root asset is the last result.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TraversalType
     */

    public ListAssetRelationshipsRequest withTraversalType(TraversalType traversalType) {
        this.traversalType = traversalType.toString();
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetRelationshipsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetRelationshipsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getAssetId() != null)
            sb.append("AssetId: ").append(getAssetId()).append(",");
        if (getTraversalType() != null)
            sb.append("TraversalType: ").append(getTraversalType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssetRelationshipsRequest == false)
            return false;
        ListAssetRelationshipsRequest other = (ListAssetRelationshipsRequest) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getTraversalType() == null ^ this.getTraversalType() == null)
            return false;
        if (other.getTraversalType() != null && other.getTraversalType().equals(this.getTraversalType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetId() == null) ? 0 : getAssetId().hashCode());
        hashCode = prime * hashCode + ((getTraversalType() == null) ? 0 : getTraversalType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetRelationshipsRequest clone() {
        return (ListAssetRelationshipsRequest) super.clone();
    }

}
