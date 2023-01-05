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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ListSnapshotsInRecycleBinRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSnapshotsInRecycleBinRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ListSnapshotsInRecycleBinRequest> {

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle Bin.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotIds;

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotsInRecycleBinRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotsInRecycleBinRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle Bin.
     * </p>
     * 
     * @return The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the
     *         Recycle Bin.
     */

    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
            snapshotIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotIds;
    }

    /**
     * <p>
     * The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle Bin.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle
     *        Bin.
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
     * The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle Bin.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotIds(java.util.Collection)} or {@link #withSnapshotIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle
     *        Bin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotsInRecycleBinRequest withSnapshotIds(String... snapshotIds) {
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
     * The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle Bin.
     * </p>
     * 
     * @param snapshotIds
     *        The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle
     *        Bin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSnapshotsInRecycleBinRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        setSnapshotIds(snapshotIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ListSnapshotsInRecycleBinRequest> getDryRunRequest() {
        Request<ListSnapshotsInRecycleBinRequest> request = new ListSnapshotsInRecycleBinRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSnapshotIds() != null)
            sb.append("SnapshotIds: ").append(getSnapshotIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSnapshotsInRecycleBinRequest == false)
            return false;
        ListSnapshotsInRecycleBinRequest other = (ListSnapshotsInRecycleBinRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null)
            return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode());
        return hashCode;
    }

    @Override
    public ListSnapshotsInRecycleBinRequest clone() {
        return (ListSnapshotsInRecycleBinRequest) super.clone();
    }
}
