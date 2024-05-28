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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServerlessCacheSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServerlessCacheSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of serverless cache. If this parameter is specified, only snapshots associated with that specific
     * serverless cache are described. Available for Redis only.
     * </p>
     */
    private String serverlessCacheName;
    /**
     * <p>
     * The identifier of the serverless cache’s snapshot. If this parameter is specified, only this snapshot is
     * described. Available for Redis only.
     * </p>
     */
    private String serverlessCacheSnapshotName;
    /**
     * <p>
     * The type of snapshot that is being described. Available for Redis only.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * max-results. Available for Redis only.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified max-results
     * value, a market is included in the response so that remaining results can be retrieved. Available for Redis
     * only.The default is 50. The Validation Constraints are a maximum of 50.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The identifier of serverless cache. If this parameter is specified, only snapshots associated with that specific
     * serverless cache are described. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier of serverless cache. If this parameter is specified, only snapshots associated with that
     *        specific serverless cache are described. Available for Redis only.
     */

    public void setServerlessCacheName(String serverlessCacheName) {
        this.serverlessCacheName = serverlessCacheName;
    }

    /**
     * <p>
     * The identifier of serverless cache. If this parameter is specified, only snapshots associated with that specific
     * serverless cache are described. Available for Redis only.
     * </p>
     * 
     * @return The identifier of serverless cache. If this parameter is specified, only snapshots associated with that
     *         specific serverless cache are described. Available for Redis only.
     */

    public String getServerlessCacheName() {
        return this.serverlessCacheName;
    }

    /**
     * <p>
     * The identifier of serverless cache. If this parameter is specified, only snapshots associated with that specific
     * serverless cache are described. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheName
     *        The identifier of serverless cache. If this parameter is specified, only snapshots associated with that
     *        specific serverless cache are described. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCacheSnapshotsRequest withServerlessCacheName(String serverlessCacheName) {
        setServerlessCacheName(serverlessCacheName);
        return this;
    }

    /**
     * <p>
     * The identifier of the serverless cache’s snapshot. If this parameter is specified, only this snapshot is
     * described. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The identifier of the serverless cache’s snapshot. If this parameter is specified, only this snapshot is
     *        described. Available for Redis only.
     */

    public void setServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        this.serverlessCacheSnapshotName = serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of the serverless cache’s snapshot. If this parameter is specified, only this snapshot is
     * described. Available for Redis only.
     * </p>
     * 
     * @return The identifier of the serverless cache’s snapshot. If this parameter is specified, only this snapshot is
     *         described. Available for Redis only.
     */

    public String getServerlessCacheSnapshotName() {
        return this.serverlessCacheSnapshotName;
    }

    /**
     * <p>
     * The identifier of the serverless cache’s snapshot. If this parameter is specified, only this snapshot is
     * described. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshotName
     *        The identifier of the serverless cache’s snapshot. If this parameter is specified, only this snapshot is
     *        described. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCacheSnapshotsRequest withServerlessCacheSnapshotName(String serverlessCacheSnapshotName) {
        setServerlessCacheSnapshotName(serverlessCacheSnapshotName);
        return this;
    }

    /**
     * <p>
     * The type of snapshot that is being described. Available for Redis only.
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshot that is being described. Available for Redis only.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of snapshot that is being described. Available for Redis only.
     * </p>
     * 
     * @return The type of snapshot that is being described. Available for Redis only.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of snapshot that is being described. Available for Redis only.
     * </p>
     * 
     * @param snapshotType
     *        The type of snapshot that is being described. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCacheSnapshotsRequest withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * max-results. Available for Redis only.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request to support pagination of results from this operation. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by max-results. Available for Redis only.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * max-results. Available for Redis only.
     * </p>
     * 
     * @return An optional marker returned from a prior request to support pagination of results from this operation. If
     *         this parameter is specified, the response includes only records beyond the marker, up to the value
     *         specified by max-results. Available for Redis only.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional marker returned from a prior request to support pagination of results from this operation. If this
     * parameter is specified, the response includes only records beyond the marker, up to the value specified by
     * max-results. Available for Redis only.
     * </p>
     * 
     * @param nextToken
     *        An optional marker returned from a prior request to support pagination of results from this operation. If
     *        this parameter is specified, the response includes only records beyond the marker, up to the value
     *        specified by max-results. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCacheSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified max-results
     * value, a market is included in the response so that remaining results can be retrieved. Available for Redis
     * only.The default is 50. The Validation Constraints are a maximum of 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        max-results value, a market is included in the response so that remaining results can be retrieved.
     *        Available for Redis only.The default is 50. The Validation Constraints are a maximum of 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified max-results
     * value, a market is included in the response so that remaining results can be retrieved. Available for Redis
     * only.The default is 50. The Validation Constraints are a maximum of 50.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         max-results value, a market is included in the response so that remaining results can be retrieved.
     *         Available for Redis only.The default is 50. The Validation Constraints are a maximum of 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified max-results
     * value, a market is included in the response so that remaining results can be retrieved. Available for Redis
     * only.The default is 50. The Validation Constraints are a maximum of 50.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        max-results value, a market is included in the response so that remaining results can be retrieved.
     *        Available for Redis only.The default is 50. The Validation Constraints are a maximum of 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCacheSnapshotsRequest withMaxResults(Integer maxResults) {
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
        if (getServerlessCacheName() != null)
            sb.append("ServerlessCacheName: ").append(getServerlessCacheName()).append(",");
        if (getServerlessCacheSnapshotName() != null)
            sb.append("ServerlessCacheSnapshotName: ").append(getServerlessCacheSnapshotName()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
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

        if (obj instanceof DescribeServerlessCacheSnapshotsRequest == false)
            return false;
        DescribeServerlessCacheSnapshotsRequest other = (DescribeServerlessCacheSnapshotsRequest) obj;
        if (other.getServerlessCacheName() == null ^ this.getServerlessCacheName() == null)
            return false;
        if (other.getServerlessCacheName() != null && other.getServerlessCacheName().equals(this.getServerlessCacheName()) == false)
            return false;
        if (other.getServerlessCacheSnapshotName() == null ^ this.getServerlessCacheSnapshotName() == null)
            return false;
        if (other.getServerlessCacheSnapshotName() != null && other.getServerlessCacheSnapshotName().equals(this.getServerlessCacheSnapshotName()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
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

        hashCode = prime * hashCode + ((getServerlessCacheName() == null) ? 0 : getServerlessCacheName().hashCode());
        hashCode = prime * hashCode + ((getServerlessCacheSnapshotName() == null) ? 0 : getServerlessCacheSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServerlessCacheSnapshotsRequest clone() {
        return (DescribeServerlessCacheSnapshotsRequest) super.clone();
    }

}
