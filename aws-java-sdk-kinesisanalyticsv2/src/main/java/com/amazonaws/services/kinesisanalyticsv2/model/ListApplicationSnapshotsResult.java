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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationSnapshots"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListApplicationSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of objects containing information about the application snapshots.
     * </p>
     */
    private java.util.List<SnapshotDetails> snapshotSummaries;
    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A collection of objects containing information about the application snapshots.
     * </p>
     * 
     * @return A collection of objects containing information about the application snapshots.
     */

    public java.util.List<SnapshotDetails> getSnapshotSummaries() {
        return snapshotSummaries;
    }

    /**
     * <p>
     * A collection of objects containing information about the application snapshots.
     * </p>
     * 
     * @param snapshotSummaries
     *        A collection of objects containing information about the application snapshots.
     */

    public void setSnapshotSummaries(java.util.Collection<SnapshotDetails> snapshotSummaries) {
        if (snapshotSummaries == null) {
            this.snapshotSummaries = null;
            return;
        }

        this.snapshotSummaries = new java.util.ArrayList<SnapshotDetails>(snapshotSummaries);
    }

    /**
     * <p>
     * A collection of objects containing information about the application snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotSummaries(java.util.Collection)} or {@link #withSnapshotSummaries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param snapshotSummaries
     *        A collection of objects containing information about the application snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationSnapshotsResult withSnapshotSummaries(SnapshotDetails... snapshotSummaries) {
        if (this.snapshotSummaries == null) {
            setSnapshotSummaries(new java.util.ArrayList<SnapshotDetails>(snapshotSummaries.length));
        }
        for (SnapshotDetails ele : snapshotSummaries) {
            this.snapshotSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of objects containing information about the application snapshots.
     * </p>
     * 
     * @param snapshotSummaries
     *        A collection of objects containing information about the application snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationSnapshotsResult withSnapshotSummaries(java.util.Collection<SnapshotDetails> snapshotSummaries) {
        setSnapshotSummaries(snapshotSummaries);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <code>null</code> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @return The token for the next set of results, or <code>null</code> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or <code>null</code> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or <code>null</code> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListApplicationSnapshotsResult withNextToken(String nextToken) {
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
        if (getSnapshotSummaries() != null)
            sb.append("SnapshotSummaries: ").append(getSnapshotSummaries()).append(",");
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

        if (obj instanceof ListApplicationSnapshotsResult == false)
            return false;
        ListApplicationSnapshotsResult other = (ListApplicationSnapshotsResult) obj;
        if (other.getSnapshotSummaries() == null ^ this.getSnapshotSummaries() == null)
            return false;
        if (other.getSnapshotSummaries() != null && other.getSnapshotSummaries().equals(this.getSnapshotSummaries()) == false)
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

        hashCode = prime * hashCode + ((getSnapshotSummaries() == null) ? 0 : getSnapshotSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationSnapshotsResult clone() {
        try {
            return (ListApplicationSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
