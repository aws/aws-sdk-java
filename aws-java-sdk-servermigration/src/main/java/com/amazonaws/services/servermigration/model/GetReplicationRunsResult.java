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
public class GetReplicationRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ReplicationJob replicationJob;

    private java.util.List<ReplicationRun> replicationRunList;

    private String nextToken;

    /**
     * @param replicationJob
     */

    public void setReplicationJob(ReplicationJob replicationJob) {
        this.replicationJob = replicationJob;
    }

    /**
     * @return
     */

    public ReplicationJob getReplicationJob() {
        return this.replicationJob;
    }

    /**
     * @param replicationJob
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationRunsResult withReplicationJob(ReplicationJob replicationJob) {
        setReplicationJob(replicationJob);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<ReplicationRun> getReplicationRunList() {
        return replicationRunList;
    }

    /**
     * @param replicationRunList
     */

    public void setReplicationRunList(java.util.Collection<ReplicationRun> replicationRunList) {
        if (replicationRunList == null) {
            this.replicationRunList = null;
            return;
        }

        this.replicationRunList = new java.util.ArrayList<ReplicationRun>(replicationRunList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationRunList(java.util.Collection)} or {@link #withReplicationRunList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationRunList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationRunsResult withReplicationRunList(ReplicationRun... replicationRunList) {
        if (this.replicationRunList == null) {
            setReplicationRunList(new java.util.ArrayList<ReplicationRun>(replicationRunList.length));
        }
        for (ReplicationRun ele : replicationRunList) {
            this.replicationRunList.add(ele);
        }
        return this;
    }

    /**
     * @param replicationRunList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReplicationRunsResult withReplicationRunList(java.util.Collection<ReplicationRun> replicationRunList) {
        setReplicationRunList(replicationRunList);
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

    public GetReplicationRunsResult withNextToken(String nextToken) {
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
        if (getReplicationJob() != null)
            sb.append("ReplicationJob: " + getReplicationJob() + ",");
        if (getReplicationRunList() != null)
            sb.append("ReplicationRunList: " + getReplicationRunList() + ",");
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

        if (obj instanceof GetReplicationRunsResult == false)
            return false;
        GetReplicationRunsResult other = (GetReplicationRunsResult) obj;
        if (other.getReplicationJob() == null ^ this.getReplicationJob() == null)
            return false;
        if (other.getReplicationJob() != null && other.getReplicationJob().equals(this.getReplicationJob()) == false)
            return false;
        if (other.getReplicationRunList() == null ^ this.getReplicationRunList() == null)
            return false;
        if (other.getReplicationRunList() != null && other.getReplicationRunList().equals(this.getReplicationRunList()) == false)
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

        hashCode = prime * hashCode + ((getReplicationJob() == null) ? 0 : getReplicationJob().hashCode());
        hashCode = prime * hashCode + ((getReplicationRunList() == null) ? 0 : getReplicationRunList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetReplicationRunsResult clone() {
        try {
            return (GetReplicationRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
