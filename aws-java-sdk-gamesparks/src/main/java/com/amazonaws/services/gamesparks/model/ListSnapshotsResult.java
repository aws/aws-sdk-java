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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     * <code>GetSnapshot</code> operations.
     * </p>
     */
    private java.util.List<SnapshotSummary> snapshots;

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use this value when making the next call to this operation to continue where the last one finished.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @return The token that indicates the start of the next sequential page of results.</p>
     *         <p>
     *         Use this value when making the next call to this operation to continue where the last one finished.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that indicates the start of the next sequential page of results.
     * </p>
     * <p>
     * Use this value when making the next call to this operation to continue where the last one finished.
     * </p>
     * 
     * @param nextToken
     *        The token that indicates the start of the next sequential page of results.</p>
     *        <p>
     *        Use this value when making the next call to this operation to continue where the last one finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     * <code>GetSnapshot</code> operations.
     * </p>
     * 
     * @return A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code>
     *         and <code>GetSnapshot</code> operations.
     */

    public java.util.List<SnapshotSummary> getSnapshots() {
        return snapshots;
    }

    /**
     * <p>
     * A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     * <code>GetSnapshot</code> operations.
     * </p>
     * 
     * @param snapshots
     *        A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     *        <code>GetSnapshot</code> operations.
     */

    public void setSnapshots(java.util.Collection<SnapshotSummary> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new java.util.ArrayList<SnapshotSummary>(snapshots);
    }

    /**
     * <p>
     * A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     * <code>GetSnapshot</code> operations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshots(java.util.Collection)} or {@link #withSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshots
     *        A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     *        <code>GetSnapshot</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotsResult withSnapshots(SnapshotSummary... snapshots) {
        if (this.snapshots == null) {
            setSnapshots(new java.util.ArrayList<SnapshotSummary>(snapshots.length));
        }
        for (SnapshotSummary ele : snapshots) {
            this.snapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     * <code>GetSnapshot</code> operations.
     * </p>
     * 
     * @param snapshots
     *        A list of snapshot summaries. You can use the returned snapshot IDs in the <code>UpdateSnapshot</code> and
     *        <code>GetSnapshot</code> operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotsResult withSnapshots(java.util.Collection<SnapshotSummary> snapshots) {
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

        if (obj instanceof ListSnapshotsResult == false)
            return false;
        ListSnapshotsResult other = (ListSnapshotsResult) obj;
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
    public ListSnapshotsResult clone() {
        try {
            return (ListSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
