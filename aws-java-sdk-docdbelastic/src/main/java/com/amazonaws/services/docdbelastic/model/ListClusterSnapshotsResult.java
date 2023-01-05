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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/ListClusterSnapshots" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListClusterSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     */
    private java.util.List<ClusterSnapshotInList> snapshots;

    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     * 
     * @param nextToken
     *        The response will provide a nextToken if there is more data beyond the maxResults.</p>
     *        <p>
     *        If there is no more data in the responce, the nextToken will not be returned.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     * 
     * @return The response will provide a nextToken if there is more data beyond the maxResults.</p>
     *         <p>
     *         If there is no more data in the responce, the nextToken will not be returned.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response will provide a nextToken if there is more data beyond the maxResults.
     * </p>
     * <p>
     * If there is no more data in the responce, the nextToken will not be returned.
     * </p>
     * 
     * @param nextToken
     *        The response will provide a nextToken if there is more data beyond the maxResults.</p>
     *        <p>
     *        If there is no more data in the responce, the nextToken will not be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterSnapshotsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     * 
     * @return A list of Elastic DocumentDB snapshots for a specified cluster.
     */

    public java.util.List<ClusterSnapshotInList> getSnapshots() {
        return snapshots;
    }

    /**
     * <p>
     * A list of Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     * 
     * @param snapshots
     *        A list of Elastic DocumentDB snapshots for a specified cluster.
     */

    public void setSnapshots(java.util.Collection<ClusterSnapshotInList> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new java.util.ArrayList<ClusterSnapshotInList>(snapshots);
    }

    /**
     * <p>
     * A list of Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshots(java.util.Collection)} or {@link #withSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshots
     *        A list of Elastic DocumentDB snapshots for a specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterSnapshotsResult withSnapshots(ClusterSnapshotInList... snapshots) {
        if (this.snapshots == null) {
            setSnapshots(new java.util.ArrayList<ClusterSnapshotInList>(snapshots.length));
        }
        for (ClusterSnapshotInList ele : snapshots) {
            this.snapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Elastic DocumentDB snapshots for a specified cluster.
     * </p>
     * 
     * @param snapshots
     *        A list of Elastic DocumentDB snapshots for a specified cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListClusterSnapshotsResult withSnapshots(java.util.Collection<ClusterSnapshotInList> snapshots) {
        setSnapshots(snapshots);
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
        if (getSnapshots() != null)
            sb.append("Snapshots: ").append(getSnapshots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClusterSnapshotsResult == false)
            return false;
        ListClusterSnapshotsResult other = (ListClusterSnapshotsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        return hashCode;
    }

    @Override
    public ListClusterSnapshotsResult clone() {
        try {
            return (ListClusterSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
