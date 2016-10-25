/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;

/**
 * 
 */
public class GetReplicationJobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private java.util.List<ReplicationJob> replicationJobList;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<ReplicationJob> getReplicationJobList() {
        return replicationJobList;
    }

    /**
     * @param replicationJobList
     */

    public void setReplicationJobList(java.util.Collection<ReplicationJob> replicationJobList) {
        if (replicationJobList == null) {
            this.replicationJobList = null;
            return;
        }

        this.replicationJobList = new java.util.ArrayList<ReplicationJob>(replicationJobList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationJobList(java.util.Collection)} or {@link #withReplicationJobList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationJobList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationJobsResult withReplicationJobList(ReplicationJob... replicationJobList) {
        if (this.replicationJobList == null) {
            setReplicationJobList(new java.util.ArrayList<ReplicationJob>(replicationJobList.length));
        }
        for (ReplicationJob ele : replicationJobList) {
            this.replicationJobList.add(ele);
        }
        return this;
    }

    /**
     * @param replicationJobList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationJobsResult withReplicationJobList(java.util.Collection<ReplicationJob> replicationJobList) {
        setReplicationJobList(replicationJobList);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationJobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationJobList() != null)
            sb.append("ReplicationJobList: " + getReplicationJobList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReplicationJobsResult == false)
            return false;
        GetReplicationJobsResult other = (GetReplicationJobsResult) obj;
        if (other.getReplicationJobList() == null ^ this.getReplicationJobList() == null)
            return false;
        if (other.getReplicationJobList() != null && other.getReplicationJobList().equals(this.getReplicationJobList()) == false)
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

        hashCode = prime * hashCode + ((getReplicationJobList() == null) ? 0 : getReplicationJobList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetReplicationJobsResult clone() {
        try {
            return (GetReplicationJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
