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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ListAssociatedAssets" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociatedAssetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the asset to query.
     * </p>
     */
    private String assetId;
    /**
     * <p>
     * The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAsset.html">DescribeAsset</a> or
     * <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html">
     * DescribeAssetModel</a> operations. This parameter is required if you choose <code>CHILD</code> for
     * <code>traversalDirection</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     */
    private String hierarchyId;
    /**
     * <p>
     * The direction to list associated assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHILD</code> – The list includes all child assets associated to the asset. The <code>hierarchyId</code>
     * parameter is required if you choose <code>CHILD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code> – The list includes the asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>CHILD</code>
     * </p>
     */
    private String traversalDirection;
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
     * <p>
     * Default: 50
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ID of the asset to query.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to query.
     */

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * <p>
     * The ID of the asset to query.
     * </p>
     * 
     * @return The ID of the asset to query.
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     * <p>
     * The ID of the asset to query.
     * </p>
     * 
     * @param assetId
     *        The ID of the asset to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAssetsRequest withAssetId(String assetId) {
        setAssetId(assetId);
        return this;
    }

    /**
     * <p>
     * The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAsset.html">DescribeAsset</a> or
     * <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html">
     * DescribeAssetModel</a> operations. This parameter is required if you choose <code>CHILD</code> for
     * <code>traversalDirection</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param hierarchyId
     *        The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use the
     *        <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAsset.html">DescribeAsset
     *        </a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html">
     *        DescribeAssetModel</a> operations. This parameter is required if you choose <code>CHILD</code> for
     *        <code>traversalDirection</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    /**
     * <p>
     * The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAsset.html">DescribeAsset</a> or
     * <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html">
     * DescribeAssetModel</a> operations. This parameter is required if you choose <code>CHILD</code> for
     * <code>traversalDirection</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @return The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use
     *         the <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAsset.html">
     *         DescribeAsset</a> or <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html"
     *         >DescribeAssetModel</a> operations. This parameter is required if you choose <code>CHILD</code> for
     *         <code>traversalDirection</code>.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *         hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     */

    public String getHierarchyId() {
        return this.hierarchyId;
    }

    /**
     * <p>
     * The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use the <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAsset.html">DescribeAsset</a> or
     * <a href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html">
     * DescribeAssetModel</a> operations. This parameter is required if you choose <code>CHILD</code> for
     * <code>traversalDirection</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset hierarchies</a> in
     * the <i>IoT SiteWise User Guide</i>.
     * </p>
     * 
     * @param hierarchyId
     *        The ID of the hierarchy by which child assets are associated to the asset. To find a hierarchy ID, use the
     *        <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAsset.html">DescribeAsset
     *        </a> or <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_DescribeAssetModel.html">
     *        DescribeAssetModel</a> operations. This parameter is required if you choose <code>CHILD</code> for
     *        <code>traversalDirection</code>.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html">Asset
     *        hierarchies</a> in the <i>IoT SiteWise User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAssetsRequest withHierarchyId(String hierarchyId) {
        setHierarchyId(hierarchyId);
        return this;
    }

    /**
     * <p>
     * The direction to list associated assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHILD</code> – The list includes all child assets associated to the asset. The <code>hierarchyId</code>
     * parameter is required if you choose <code>CHILD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code> – The list includes the asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>CHILD</code>
     * </p>
     * 
     * @param traversalDirection
     *        The direction to list associated assets. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHILD</code> – The list includes all child assets associated to the asset. The
     *        <code>hierarchyId</code> parameter is required if you choose <code>CHILD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARENT</code> – The list includes the asset's parent asset.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>CHILD</code>
     * @see TraversalDirection
     */

    public void setTraversalDirection(String traversalDirection) {
        this.traversalDirection = traversalDirection;
    }

    /**
     * <p>
     * The direction to list associated assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHILD</code> – The list includes all child assets associated to the asset. The <code>hierarchyId</code>
     * parameter is required if you choose <code>CHILD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code> – The list includes the asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>CHILD</code>
     * </p>
     * 
     * @return The direction to list associated assets. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CHILD</code> – The list includes all child assets associated to the asset. The
     *         <code>hierarchyId</code> parameter is required if you choose <code>CHILD</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PARENT</code> – The list includes the asset's parent asset.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>CHILD</code>
     * @see TraversalDirection
     */

    public String getTraversalDirection() {
        return this.traversalDirection;
    }

    /**
     * <p>
     * The direction to list associated assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHILD</code> – The list includes all child assets associated to the asset. The <code>hierarchyId</code>
     * parameter is required if you choose <code>CHILD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code> – The list includes the asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>CHILD</code>
     * </p>
     * 
     * @param traversalDirection
     *        The direction to list associated assets. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHILD</code> – The list includes all child assets associated to the asset. The
     *        <code>hierarchyId</code> parameter is required if you choose <code>CHILD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARENT</code> – The list includes the asset's parent asset.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>CHILD</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TraversalDirection
     */

    public ListAssociatedAssetsRequest withTraversalDirection(String traversalDirection) {
        setTraversalDirection(traversalDirection);
        return this;
    }

    /**
     * <p>
     * The direction to list associated assets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CHILD</code> – The list includes all child assets associated to the asset. The <code>hierarchyId</code>
     * parameter is required if you choose <code>CHILD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARENT</code> – The list includes the asset's parent asset.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>CHILD</code>
     * </p>
     * 
     * @param traversalDirection
     *        The direction to list associated assets. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CHILD</code> – The list includes all child assets associated to the asset. The
     *        <code>hierarchyId</code> parameter is required if you choose <code>CHILD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARENT</code> – The list includes the asset's parent asset.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>CHILD</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TraversalDirection
     */

    public ListAssociatedAssetsRequest withTraversalDirection(TraversalDirection traversalDirection) {
        this.traversalDirection = traversalDirection.toString();
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

    public ListAssociatedAssetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @return The maximum number of results to return for each paginated request.</p>
     *         <p>
     *         Default: 50
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for each paginated request.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for each paginated request.</p>
     *        <p>
     *        Default: 50
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedAssetsRequest withMaxResults(Integer maxResults) {
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
        if (getHierarchyId() != null)
            sb.append("HierarchyId: ").append(getHierarchyId()).append(",");
        if (getTraversalDirection() != null)
            sb.append("TraversalDirection: ").append(getTraversalDirection()).append(",");
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

        if (obj instanceof ListAssociatedAssetsRequest == false)
            return false;
        ListAssociatedAssetsRequest other = (ListAssociatedAssetsRequest) obj;
        if (other.getAssetId() == null ^ this.getAssetId() == null)
            return false;
        if (other.getAssetId() != null && other.getAssetId().equals(this.getAssetId()) == false)
            return false;
        if (other.getHierarchyId() == null ^ this.getHierarchyId() == null)
            return false;
        if (other.getHierarchyId() != null && other.getHierarchyId().equals(this.getHierarchyId()) == false)
            return false;
        if (other.getTraversalDirection() == null ^ this.getTraversalDirection() == null)
            return false;
        if (other.getTraversalDirection() != null && other.getTraversalDirection().equals(this.getTraversalDirection()) == false)
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
        hashCode = prime * hashCode + ((getHierarchyId() == null) ? 0 : getHierarchyId().hashCode());
        hashCode = prime * hashCode + ((getTraversalDirection() == null) ? 0 : getTraversalDirection().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociatedAssetsRequest clone() {
        return (ListAssociatedAssetsRequest) super.clone();
    }

}
