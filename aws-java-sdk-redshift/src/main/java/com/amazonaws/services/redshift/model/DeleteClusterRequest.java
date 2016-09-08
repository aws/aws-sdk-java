/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * </p>
 */
public class DeleteClusterRequest extends com.amazonaws.AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain lowercase characters.</li>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     * specified if <i>SkipFinalClusterSnapshot</i> is <code>false</code>
     * .</note>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean skipFinalClusterSnapshot;
    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     */
    private String finalClusterSnapshotIdentifier;

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain lowercase characters.</li>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to be deleted. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain lowercase characters.</li>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain lowercase characters.</li>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * 
     * @return The identifier of the cluster to be deleted. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must contain lowercase characters.</li>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </li>
     *         <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain lowercase characters.</li>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to be deleted. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain lowercase characters.</li>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteClusterRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     * specified if <i>SkipFinalClusterSnapshot</i> is <code>false</code>
     * .</note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalClusterSnapshot
     *        Determines whether a final snapshot of the cluster is created
     *        before Amazon Redshift deletes the cluster. If <code>true</code>,
     *        a final cluster snapshot is not created. If <code>false</code>, a
     *        final cluster snapshot is created before the cluster is deleted.
     *        </p> <note>The <i>FinalClusterSnapshotIdentifier</i> parameter
     *        must be specified if <i>SkipFinalClusterSnapshot</i> is
     *        <code>false</code>.</note>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setSkipFinalClusterSnapshot(Boolean skipFinalClusterSnapshot) {
        this.skipFinalClusterSnapshot = skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     * specified if <i>SkipFinalClusterSnapshot</i> is <code>false</code>
     * .</note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final snapshot of the cluster is created
     *         before Amazon Redshift deletes the cluster. If <code>true</code>,
     *         a final cluster snapshot is not created. If <code>false</code>, a
     *         final cluster snapshot is created before the cluster is deleted.
     *         </p> <note>The <i>FinalClusterSnapshotIdentifier</i> parameter
     *         must be specified if <i>SkipFinalClusterSnapshot</i> is
     *         <code>false</code>.</note>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getSkipFinalClusterSnapshot() {
        return this.skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     * specified if <i>SkipFinalClusterSnapshot</i> is <code>false</code>
     * .</note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalClusterSnapshot
     *        Determines whether a final snapshot of the cluster is created
     *        before Amazon Redshift deletes the cluster. If <code>true</code>,
     *        a final cluster snapshot is not created. If <code>false</code>, a
     *        final cluster snapshot is created before the cluster is deleted.
     *        </p> <note>The <i>FinalClusterSnapshotIdentifier</i> parameter
     *        must be specified if <i>SkipFinalClusterSnapshot</i> is
     *        <code>false</code>.</note>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteClusterRequest withSkipFinalClusterSnapshot(
            Boolean skipFinalClusterSnapshot) {
        setSkipFinalClusterSnapshot(skipFinalClusterSnapshot);
        return this;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final cluster
     * snapshot is created before the cluster is deleted.
     * </p>
     * <note>The <i>FinalClusterSnapshotIdentifier</i> parameter must be
     * specified if <i>SkipFinalClusterSnapshot</i> is <code>false</code>
     * .</note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final snapshot of the cluster is created
     *         before Amazon Redshift deletes the cluster. If <code>true</code>,
     *         a final cluster snapshot is not created. If <code>false</code>, a
     *         final cluster snapshot is created before the cluster is deleted.
     *         </p> <note>The <i>FinalClusterSnapshotIdentifier</i> parameter
     *         must be specified if <i>SkipFinalClusterSnapshot</i> is
     *         <code>false</code>.</note>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isSkipFinalClusterSnapshot() {
        return this.skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * 
     * @param finalClusterSnapshotIdentifier
     *        The identifier of the final snapshot that is to be created
     *        immediately before deleting the cluster. If this parameter is
     *        provided, <i>SkipFinalClusterSnapshot</i> must be
     *        <code>false</code>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must be 1 to 255 alphanumeric characters.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     */

    public void setFinalClusterSnapshotIdentifier(
            String finalClusterSnapshotIdentifier) {
        this.finalClusterSnapshotIdentifier = finalClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * 
     * @return The identifier of the final snapshot that is to be created
     *         immediately before deleting the cluster. If this parameter is
     *         provided, <i>SkipFinalClusterSnapshot</i> must be
     *         <code>false</code>. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must be 1 to 255 alphanumeric characters.</li>
     *         <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     */

    public String getFinalClusterSnapshotIdentifier() {
        return this.finalClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must be 1 to 255 alphanumeric characters.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * 
     * @param finalClusterSnapshotIdentifier
     *        The identifier of the final snapshot that is to be created
     *        immediately before deleting the cluster. If this parameter is
     *        provided, <i>SkipFinalClusterSnapshot</i> must be
     *        <code>false</code>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must be 1 to 255 alphanumeric characters.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteClusterRequest withFinalClusterSnapshotIdentifier(
            String finalClusterSnapshotIdentifier) {
        setFinalClusterSnapshotIdentifier(finalClusterSnapshotIdentifier);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSkipFinalClusterSnapshot() != null)
            sb.append("SkipFinalClusterSnapshot: "
                    + getSkipFinalClusterSnapshot() + ",");
        if (getFinalClusterSnapshotIdentifier() != null)
            sb.append("FinalClusterSnapshotIdentifier: "
                    + getFinalClusterSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteClusterRequest == false)
            return false;
        DeleteClusterRequest other = (DeleteClusterRequest) obj;
        if (other.getClusterIdentifier() == null
                ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(
                        this.getClusterIdentifier()) == false)
            return false;
        if (other.getSkipFinalClusterSnapshot() == null
                ^ this.getSkipFinalClusterSnapshot() == null)
            return false;
        if (other.getSkipFinalClusterSnapshot() != null
                && other.getSkipFinalClusterSnapshot().equals(
                        this.getSkipFinalClusterSnapshot()) == false)
            return false;
        if (other.getFinalClusterSnapshotIdentifier() == null
                ^ this.getFinalClusterSnapshotIdentifier() == null)
            return false;
        if (other.getFinalClusterSnapshotIdentifier() != null
                && other.getFinalClusterSnapshotIdentifier().equals(
                        this.getFinalClusterSnapshotIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterIdentifier() == null) ? 0
                        : getClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getSkipFinalClusterSnapshot() == null) ? 0
                        : getSkipFinalClusterSnapshot().hashCode());
        hashCode = prime
                * hashCode
                + ((getFinalClusterSnapshotIdentifier() == null) ? 0
                        : getFinalClusterSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClusterRequest clone() {
        return (DeleteClusterRequest) super.clone();
    }
}
