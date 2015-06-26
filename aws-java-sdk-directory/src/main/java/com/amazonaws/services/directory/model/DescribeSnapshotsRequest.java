/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directory.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directory.AWSDirectoryService#describeSnapshots(DescribeSnapshotsRequest) DescribeSnapshots operation}.
 * <p>
 * Obtains information about the directory snapshots that belong to this
 * account.
 * </p>
 * <p>
 * This operation supports pagination with the use of the
 * <i>NextToken</i> request and response parameters. If more results are
 * available, the <i>DescribeSnapshots.NextToken</i> member contains a
 * token that you pass in the next call to DescribeSnapshots to retrieve
 * the next set of items.
 * </p>
 * <p>
 * You can also specify a maximum number of return results with the
 * <i>Limit</i> parameter.
 * </p>
 *
 * @see com.amazonaws.services.directory.AWSDirectoryService#describeSnapshots(DescribeSnapshotsRequest)
 */
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier of the directory to retrieve snapshot information for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     */
    private String directoryId;

    /**
     * A list of identifiers of the snapshots to obtain the information for.
     * If this member is null or empty, all snapshots are returned using the
     * <i>Limit</i> and <i>NextToken</i> members.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIds;

    /**
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous
     * call to <a>DescribeSnapshots</a>. Pass null if this is the first call.
     */
    private String nextToken;

    /**
     * The maximum number of objects to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer limit;

    /**
     * The identifier of the directory to retrieve snapshot information for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory to retrieve snapshot information for.
     */
    public String getDirectoryId() {
        return directoryId;
    }
    
    /**
     * The identifier of the directory to retrieve snapshot information for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to retrieve snapshot information for.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }
    
    /**
     * The identifier of the directory to retrieve snapshot information for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^d-[0-9a-f]{10}$<br/>
     *
     * @param directoryId The identifier of the directory to retrieve snapshot information for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * A list of identifiers of the snapshots to obtain the information for.
     * If this member is null or empty, all snapshots are returned using the
     * <i>Limit</i> and <i>NextToken</i> members.
     *
     * @return A list of identifiers of the snapshots to obtain the information for.
     *         If this member is null or empty, all snapshots are returned using the
     *         <i>Limit</i> and <i>NextToken</i> members.
     */
    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
              snapshotIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              snapshotIds.setAutoConstruct(true);
        }
        return snapshotIds;
    }
    
    /**
     * A list of identifiers of the snapshots to obtain the information for.
     * If this member is null or empty, all snapshots are returned using the
     * <i>Limit</i> and <i>NextToken</i> members.
     *
     * @param snapshotIds A list of identifiers of the snapshots to obtain the information for.
     *         If this member is null or empty, all snapshots are returned using the
     *         <i>Limit</i> and <i>NextToken</i> members.
     */
    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotIds.size());
        snapshotIdsCopy.addAll(snapshotIds);
        this.snapshotIds = snapshotIdsCopy;
    }
    
    /**
     * A list of identifiers of the snapshots to obtain the information for.
     * If this member is null or empty, all snapshots are returned using the
     * <i>Limit</i> and <i>NextToken</i> members.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSnapshotIds(java.util.Collection)} or {@link
     * #withSnapshotIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds A list of identifiers of the snapshots to obtain the information for.
     *         If this member is null or empty, all snapshots are returned using the
     *         <i>Limit</i> and <i>NextToken</i> members.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (getSnapshotIds() == null) setSnapshotIds(new java.util.ArrayList<String>(snapshotIds.length));
        for (String value : snapshotIds) {
            getSnapshotIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of identifiers of the snapshots to obtain the information for.
     * If this member is null or empty, all snapshots are returned using the
     * <i>Limit</i> and <i>NextToken</i> members.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds A list of identifiers of the snapshots to obtain the information for.
     *         If this member is null or empty, all snapshots are returned using the
     *         <i>Limit</i> and <i>NextToken</i> members.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotIds.size());
            snapshotIdsCopy.addAll(snapshotIds);
            this.snapshotIds = snapshotIdsCopy;
        }

        return this;
    }

    /**
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous
     * call to <a>DescribeSnapshots</a>. Pass null if this is the first call.
     *
     * @return The <i>DescribeSnapshotsResult.NextToken</i> value from a previous
     *         call to <a>DescribeSnapshots</a>. Pass null if this is the first call.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous
     * call to <a>DescribeSnapshots</a>. Pass null if this is the first call.
     *
     * @param nextToken The <i>DescribeSnapshotsResult.NextToken</i> value from a previous
     *         call to <a>DescribeSnapshots</a>. Pass null if this is the first call.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <i>DescribeSnapshotsResult.NextToken</i> value from a previous
     * call to <a>DescribeSnapshots</a>. Pass null if this is the first call.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <i>DescribeSnapshotsResult.NextToken</i> value from a previous
     *         call to <a>DescribeSnapshots</a>. Pass null if this is the first call.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of objects to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The maximum number of objects to return.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of objects to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param limit The maximum number of objects to return.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of objects to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param limit The maximum number of objects to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDirectoryId() != null) sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getSnapshotIds() != null) sb.append("SnapshotIds: " + getSnapshotIds() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSnapshotsRequest == false) return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest)obj;
        
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null) return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false) return false; 
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null) return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSnapshotsRequest clone() {
        
            return (DescribeSnapshotsRequest) super.clone();
    }

}
    