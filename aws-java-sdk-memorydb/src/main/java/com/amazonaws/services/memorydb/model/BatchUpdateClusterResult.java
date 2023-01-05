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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/BatchUpdateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateClusterResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of clusters that have been updated.
     * </p>
     */
    private java.util.List<Cluster> processedClusters;
    /**
     * <p>
     * The list of clusters where updates have not been applied.
     * </p>
     */
    private java.util.List<UnprocessedCluster> unprocessedClusters;

    /**
     * <p>
     * The list of clusters that have been updated.
     * </p>
     * 
     * @return The list of clusters that have been updated.
     */

    public java.util.List<Cluster> getProcessedClusters() {
        return processedClusters;
    }

    /**
     * <p>
     * The list of clusters that have been updated.
     * </p>
     * 
     * @param processedClusters
     *        The list of clusters that have been updated.
     */

    public void setProcessedClusters(java.util.Collection<Cluster> processedClusters) {
        if (processedClusters == null) {
            this.processedClusters = null;
            return;
        }

        this.processedClusters = new java.util.ArrayList<Cluster>(processedClusters);
    }

    /**
     * <p>
     * The list of clusters that have been updated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessedClusters(java.util.Collection)} or {@link #withProcessedClusters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param processedClusters
     *        The list of clusters that have been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateClusterResult withProcessedClusters(Cluster... processedClusters) {
        if (this.processedClusters == null) {
            setProcessedClusters(new java.util.ArrayList<Cluster>(processedClusters.length));
        }
        for (Cluster ele : processedClusters) {
            this.processedClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of clusters that have been updated.
     * </p>
     * 
     * @param processedClusters
     *        The list of clusters that have been updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateClusterResult withProcessedClusters(java.util.Collection<Cluster> processedClusters) {
        setProcessedClusters(processedClusters);
        return this;
    }

    /**
     * <p>
     * The list of clusters where updates have not been applied.
     * </p>
     * 
     * @return The list of clusters where updates have not been applied.
     */

    public java.util.List<UnprocessedCluster> getUnprocessedClusters() {
        return unprocessedClusters;
    }

    /**
     * <p>
     * The list of clusters where updates have not been applied.
     * </p>
     * 
     * @param unprocessedClusters
     *        The list of clusters where updates have not been applied.
     */

    public void setUnprocessedClusters(java.util.Collection<UnprocessedCluster> unprocessedClusters) {
        if (unprocessedClusters == null) {
            this.unprocessedClusters = null;
            return;
        }

        this.unprocessedClusters = new java.util.ArrayList<UnprocessedCluster>(unprocessedClusters);
    }

    /**
     * <p>
     * The list of clusters where updates have not been applied.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedClusters(java.util.Collection)} or {@link #withUnprocessedClusters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedClusters
     *        The list of clusters where updates have not been applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateClusterResult withUnprocessedClusters(UnprocessedCluster... unprocessedClusters) {
        if (this.unprocessedClusters == null) {
            setUnprocessedClusters(new java.util.ArrayList<UnprocessedCluster>(unprocessedClusters.length));
        }
        for (UnprocessedCluster ele : unprocessedClusters) {
            this.unprocessedClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of clusters where updates have not been applied.
     * </p>
     * 
     * @param unprocessedClusters
     *        The list of clusters where updates have not been applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateClusterResult withUnprocessedClusters(java.util.Collection<UnprocessedCluster> unprocessedClusters) {
        setUnprocessedClusters(unprocessedClusters);
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
        if (getProcessedClusters() != null)
            sb.append("ProcessedClusters: ").append(getProcessedClusters()).append(",");
        if (getUnprocessedClusters() != null)
            sb.append("UnprocessedClusters: ").append(getUnprocessedClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateClusterResult == false)
            return false;
        BatchUpdateClusterResult other = (BatchUpdateClusterResult) obj;
        if (other.getProcessedClusters() == null ^ this.getProcessedClusters() == null)
            return false;
        if (other.getProcessedClusters() != null && other.getProcessedClusters().equals(this.getProcessedClusters()) == false)
            return false;
        if (other.getUnprocessedClusters() == null ^ this.getUnprocessedClusters() == null)
            return false;
        if (other.getUnprocessedClusters() != null && other.getUnprocessedClusters().equals(this.getUnprocessedClusters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessedClusters() == null) ? 0 : getProcessedClusters().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedClusters() == null) ? 0 : getUnprocessedClusters().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateClusterResult clone() {
        try {
            return (BatchUpdateClusterResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
