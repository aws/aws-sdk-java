/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/DescribeSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this named snapshot is described.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * If set to system, the output shows snapshots that were automatically created by MemoryDB. If set to user the
     * output shows snapshots that were manually created. If omitted, the output shows both automatically and manually
     * created snapshots.
     * </p>
     */
    private String source;
    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A Boolean value which if true, the shard configuration is included in the snapshot description.
     * </p>
     */
    private Boolean showDetail;

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     * 
     * @param clusterName
     *        A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that
     *        specific cluster are described.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     * 
     * @return A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that
     *         specific cluster are described.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     * 
     * @param clusterName
     *        A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that
     *        specific cluster are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this named snapshot is described.
     * </p>
     * 
     * @param snapshotName
     *        A user-supplied name of the snapshot. If this parameter is specified, only this named snapshot is
     *        described.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this named snapshot is described.
     * </p>
     * 
     * @return A user-supplied name of the snapshot. If this parameter is specified, only this named snapshot is
     *         described.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this named snapshot is described.
     * </p>
     * 
     * @param snapshotName
     *        A user-supplied name of the snapshot. If this parameter is specified, only this named snapshot is
     *        described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * If set to system, the output shows snapshots that were automatically created by MemoryDB. If set to user the
     * output shows snapshots that were manually created. If omitted, the output shows both automatically and manually
     * created snapshots.
     * </p>
     * 
     * @param source
     *        If set to system, the output shows snapshots that were automatically created by MemoryDB. If set to user
     *        the output shows snapshots that were manually created. If omitted, the output shows both automatically and
     *        manually created snapshots.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * If set to system, the output shows snapshots that were automatically created by MemoryDB. If set to user the
     * output shows snapshots that were manually created. If omitted, the output shows both automatically and manually
     * created snapshots.
     * </p>
     * 
     * @return If set to system, the output shows snapshots that were automatically created by MemoryDB. If set to user
     *         the output shows snapshots that were manually created. If omitted, the output shows both automatically
     *         and manually created snapshots.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * If set to system, the output shows snapshots that were automatically created by MemoryDB. If set to user the
     * output shows snapshots that were manually created. If omitted, the output shows both automatically and manually
     * created snapshots.
     * </p>
     * 
     * @param source
     *        If set to system, the output shows snapshots that were automatically created by MemoryDB. If set to user
     *        the output shows snapshots that were manually created. If omitted, the output shows both automatically and
     *        manually created snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @return An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *         nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *         token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *         other arguments unchanged.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is
     * returned, there are more results available. The value of nextToken is a unique pagination token for each page.
     * Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged.
     * </p>
     * 
     * @param nextToken
     *        An optional argument to pass in case the total number of records exceeds the value of MaxResults. If
     *        nextToken is returned, there are more results available. The value of nextToken is a unique pagination
     *        token for each page. Make the call again using the returned token to retrieve the next page. Keep all
     *        other arguments unchanged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified MaxResults
     * value, a token is included in the response so that the remaining results can be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        MaxResults value, a token is included in the response so that the remaining results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A Boolean value which if true, the shard configuration is included in the snapshot description.
     * </p>
     * 
     * @param showDetail
     *        A Boolean value which if true, the shard configuration is included in the snapshot description.
     */

    public void setShowDetail(Boolean showDetail) {
        this.showDetail = showDetail;
    }

    /**
     * <p>
     * A Boolean value which if true, the shard configuration is included in the snapshot description.
     * </p>
     * 
     * @return A Boolean value which if true, the shard configuration is included in the snapshot description.
     */

    public Boolean getShowDetail() {
        return this.showDetail;
    }

    /**
     * <p>
     * A Boolean value which if true, the shard configuration is included in the snapshot description.
     * </p>
     * 
     * @param showDetail
     *        A Boolean value which if true, the shard configuration is included in the snapshot description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withShowDetail(Boolean showDetail) {
        setShowDetail(showDetail);
        return this;
    }

    /**
     * <p>
     * A Boolean value which if true, the shard configuration is included in the snapshot description.
     * </p>
     * 
     * @return A Boolean value which if true, the shard configuration is included in the snapshot description.
     */

    public Boolean isShowDetail() {
        return this.showDetail;
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getShowDetail() != null)
            sb.append("ShowDetail: ").append(getShowDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotsRequest == false)
            return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getShowDetail() == null ^ this.getShowDetail() == null)
            return false;
        if (other.getShowDetail() != null && other.getShowDetail().equals(this.getShowDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getShowDetail() == null) ? 0 : getShowDetail().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsRequest clone() {
        return (DescribeSnapshotsRequest) super.clone();
    }

}
