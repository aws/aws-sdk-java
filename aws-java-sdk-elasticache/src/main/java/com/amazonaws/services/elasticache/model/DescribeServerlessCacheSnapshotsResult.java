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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeServerlessCacheSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServerlessCacheSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

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
     * The serverless caches snapshots associated with a given description request. Available for Redis only.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServerlessCacheSnapshot> serverlessCacheSnapshots;

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

    public DescribeServerlessCacheSnapshotsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The serverless caches snapshots associated with a given description request. Available for Redis only.
     * </p>
     * 
     * @return The serverless caches snapshots associated with a given description request. Available for Redis only.
     */

    public java.util.List<ServerlessCacheSnapshot> getServerlessCacheSnapshots() {
        if (serverlessCacheSnapshots == null) {
            serverlessCacheSnapshots = new com.amazonaws.internal.SdkInternalList<ServerlessCacheSnapshot>();
        }
        return serverlessCacheSnapshots;
    }

    /**
     * <p>
     * The serverless caches snapshots associated with a given description request. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshots
     *        The serverless caches snapshots associated with a given description request. Available for Redis only.
     */

    public void setServerlessCacheSnapshots(java.util.Collection<ServerlessCacheSnapshot> serverlessCacheSnapshots) {
        if (serverlessCacheSnapshots == null) {
            this.serverlessCacheSnapshots = null;
            return;
        }

        this.serverlessCacheSnapshots = new com.amazonaws.internal.SdkInternalList<ServerlessCacheSnapshot>(serverlessCacheSnapshots);
    }

    /**
     * <p>
     * The serverless caches snapshots associated with a given description request. Available for Redis only.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerlessCacheSnapshots(java.util.Collection)} or
     * {@link #withServerlessCacheSnapshots(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param serverlessCacheSnapshots
     *        The serverless caches snapshots associated with a given description request. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCacheSnapshotsResult withServerlessCacheSnapshots(ServerlessCacheSnapshot... serverlessCacheSnapshots) {
        if (this.serverlessCacheSnapshots == null) {
            setServerlessCacheSnapshots(new com.amazonaws.internal.SdkInternalList<ServerlessCacheSnapshot>(serverlessCacheSnapshots.length));
        }
        for (ServerlessCacheSnapshot ele : serverlessCacheSnapshots) {
            this.serverlessCacheSnapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The serverless caches snapshots associated with a given description request. Available for Redis only.
     * </p>
     * 
     * @param serverlessCacheSnapshots
     *        The serverless caches snapshots associated with a given description request. Available for Redis only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServerlessCacheSnapshotsResult withServerlessCacheSnapshots(java.util.Collection<ServerlessCacheSnapshot> serverlessCacheSnapshots) {
        setServerlessCacheSnapshots(serverlessCacheSnapshots);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getServerlessCacheSnapshots() != null)
            sb.append("ServerlessCacheSnapshots: ").append(getServerlessCacheSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServerlessCacheSnapshotsResult == false)
            return false;
        DescribeServerlessCacheSnapshotsResult other = (DescribeServerlessCacheSnapshotsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getServerlessCacheSnapshots() == null ^ this.getServerlessCacheSnapshots() == null)
            return false;
        if (other.getServerlessCacheSnapshots() != null && other.getServerlessCacheSnapshots().equals(this.getServerlessCacheSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getServerlessCacheSnapshots() == null) ? 0 : getServerlessCacheSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServerlessCacheSnapshotsResult clone() {
        try {
            return (DescribeServerlessCacheSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
