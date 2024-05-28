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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusterSnapshots" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClusterSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * The maximum number of elastic cluster snapshot results to receive in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A pagination token provided by a previous request. If this parameter is specified, the response includes only
     * records beyond this token, up to the value specified by <code>max-results</code>.
     * </p>
     * <p>
     * If there is no more data in the responce, the <code>nextToken</code> will not be returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     */
    private String snapshotType;

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @param clusterArn
     *        The ARN identifier of the elastic cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @return The ARN identifier of the elastic cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The ARN identifier of the elastic cluster.
     * </p>
     * 
     * @param clusterArn
     *        The ARN identifier of the elastic cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterSnapshotsRequest withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of elastic cluster snapshot results to receive in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of elastic cluster snapshot results to receive in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of elastic cluster snapshot results to receive in the response.
     * </p>
     * 
     * @return The maximum number of elastic cluster snapshot results to receive in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of elastic cluster snapshot results to receive in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of elastic cluster snapshot results to receive in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterSnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A pagination token provided by a previous request. If this parameter is specified, the response includes only
     * records beyond this token, up to the value specified by <code>max-results</code>.
     * </p>
     * <p>
     * If there is no more data in the responce, the <code>nextToken</code> will not be returned.
     * </p>
     * 
     * @param nextToken
     *        A pagination token provided by a previous request. If this parameter is specified, the response includes
     *        only records beyond this token, up to the value specified by <code>max-results</code>.</p>
     *        <p>
     *        If there is no more data in the responce, the <code>nextToken</code> will not be returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token provided by a previous request. If this parameter is specified, the response includes only
     * records beyond this token, up to the value specified by <code>max-results</code>.
     * </p>
     * <p>
     * If there is no more data in the responce, the <code>nextToken</code> will not be returned.
     * </p>
     * 
     * @return A pagination token provided by a previous request. If this parameter is specified, the response includes
     *         only records beyond this token, up to the value specified by <code>max-results</code>.</p>
     *         <p>
     *         If there is no more data in the responce, the <code>nextToken</code> will not be returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token provided by a previous request. If this parameter is specified, the response includes only
     * records beyond this token, up to the value specified by <code>max-results</code>.
     * </p>
     * <p>
     * If there is no more data in the responce, the <code>nextToken</code> will not be returned.
     * </p>
     * 
     * @param nextToken
     *        A pagination token provided by a previous request. If this parameter is specified, the response includes
     *        only records beyond this token, up to the value specified by <code>max-results</code>.</p>
     *        <p>
     *        If there is no more data in the responce, the <code>nextToken</code> will not be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotType
     *        The type of cluster snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for
     *        your Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of cluster snapshots to be returned. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created
     *         for your Amazon Web Services account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web
     *         Services account.
     *         </p>
     *         </li>
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of cluster snapshots to be returned. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for your
     * Amazon Web Services account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web Services
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotType
     *        The type of cluster snapshots to be returned. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>automated</code> - Return all cluster snapshots that Amazon DocumentDB has automatically created for
     *        your Amazon Web Services account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>manual</code> - Return all cluster snapshots that you have manually created for your Amazon Web
     *        Services account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterSnapshotsRequest withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClusterSnapshotsRequest == false)
            return false;
        ListClusterSnapshotsRequest other = (ListClusterSnapshotsRequest) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        return hashCode;
    }

    @Override
    public ListClusterSnapshotsRequest clone() {
        return (ListClusterSnapshotsRequest) super.clone();
    }

}
