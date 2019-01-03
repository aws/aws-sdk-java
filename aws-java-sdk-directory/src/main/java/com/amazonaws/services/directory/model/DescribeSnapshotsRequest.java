/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>DescribeSnapshots</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/DescribeSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which to retrieve snapshot information.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     * snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotIds;
    /**
     * <p>
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous call to <a>DescribeSnapshots</a>. Pass null if
     * this is the first call.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of objects to return.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * The identifier of the directory for which to retrieve snapshot information.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to retrieve snapshot information.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to retrieve snapshot information.
     * </p>
     * 
     * @return The identifier of the directory for which to retrieve snapshot information.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to retrieve snapshot information.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to retrieve snapshot information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     * snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     * </p>
     * 
     * @return A list of identifiers of the snapshots to obtain the information for. If this member is null or empty,
     *         all snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     */

    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
            snapshotIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotIds;
    }

    /**
     * <p>
     * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     * snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     * </p>
     * 
     * @param snapshotIds
     *        A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     *        snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     */

    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }

        this.snapshotIds = new com.amazonaws.internal.SdkInternalList<String>(snapshotIds);
    }

    /**
     * <p>
     * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     * snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotIds(java.util.Collection)} or {@link #withSnapshotIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotIds
     *        A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     *        snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (this.snapshotIds == null) {
            setSnapshotIds(new com.amazonaws.internal.SdkInternalList<String>(snapshotIds.length));
        }
        for (String ele : snapshotIds) {
            this.snapshotIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     * snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     * </p>
     * 
     * @param snapshotIds
     *        A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all
     *        snapshots are returned using the <i>Limit</i> and <i>NextToken</i> members.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        setSnapshotIds(snapshotIds);
        return this;
    }

    /**
     * <p>
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous call to <a>DescribeSnapshots</a>. Pass null if
     * this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeSnapshotsResult.NextToken</i> value from a previous call to <a>DescribeSnapshots</a>. Pass
     *        null if this is the first call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous call to <a>DescribeSnapshots</a>. Pass null if
     * this is the first call.
     * </p>
     * 
     * @return The <i>DescribeSnapshotsResult.NextToken</i> value from a previous call to <a>DescribeSnapshots</a>. Pass
     *         null if this is the first call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous call to <a>DescribeSnapshots</a>. Pass null if
     * this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeSnapshotsResult.NextToken</i> value from a previous call to <a>DescribeSnapshots</a>. Pass
     *        null if this is the first call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of objects to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of objects to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of objects to return.
     * </p>
     * 
     * @return The maximum number of objects to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of objects to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of objects to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getSnapshotIds() != null)
            sb.append("SnapshotIds: ").append(getSnapshotIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
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
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null)
            return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsRequest clone() {
        return (DescribeSnapshotsRequest) super.clone();
    }

}
