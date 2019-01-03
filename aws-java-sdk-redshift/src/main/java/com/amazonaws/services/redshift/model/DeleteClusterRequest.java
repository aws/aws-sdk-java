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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DeleteCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If
     * <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster snapshot is
     * created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean skipFinalClusterSnapshot;
    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this
     * parameter is provided, <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String finalClusterSnapshotIdentifier;
    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     */
    private Integer finalClusterSnapshotRetentionPeriod;

    /**
     * <p>
     * The identifier of the cluster to be deleted.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to be deleted.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain lowercase characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
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
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the cluster to be deleted.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain lowercase characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
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
     * <li>
     * <p>
     * Must contain lowercase characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param clusterIdentifier
     *        The identifier of the cluster to be deleted.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain lowercase characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If
     * <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster snapshot is
     * created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalClusterSnapshot
     *        Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster.
     *        If <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster
     *        snapshot is created before the cluster is deleted. </p> <note>
     *        <p>
     *        The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i>
     *        is <code>false</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setSkipFinalClusterSnapshot(Boolean skipFinalClusterSnapshot) {
        this.skipFinalClusterSnapshot = skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If
     * <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster snapshot is
     * created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster.
     *         If <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster
     *         snapshot is created before the cluster is deleted. </p> <note>
     *         <p>
     *         The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i>
     *         is <code>false</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getSkipFinalClusterSnapshot() {
        return this.skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If
     * <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster snapshot is
     * created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param skipFinalClusterSnapshot
     *        Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster.
     *        If <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster
     *        snapshot is created before the cluster is deleted. </p> <note>
     *        <p>
     *        The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i>
     *        is <code>false</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterRequest withSkipFinalClusterSnapshot(Boolean skipFinalClusterSnapshot) {
        setSkipFinalClusterSnapshot(skipFinalClusterSnapshot);
        return this;
    }

    /**
     * <p>
     * Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster. If
     * <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster snapshot is
     * created before the cluster is deleted.
     * </p>
     * <note>
     * <p>
     * The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i> is
     * <code>false</code>.
     * </p>
     * </note>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Determines whether a final snapshot of the cluster is created before Amazon Redshift deletes the cluster.
     *         If <code>true</code>, a final cluster snapshot is not created. If <code>false</code>, a final cluster
     *         snapshot is created before the cluster is deleted. </p> <note>
     *         <p>
     *         The <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if <i>SkipFinalClusterSnapshot</i>
     *         is <code>false</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isSkipFinalClusterSnapshot() {
        return this.skipFinalClusterSnapshot;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this
     * parameter is provided, <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalClusterSnapshotIdentifier
     *        The identifier of the final snapshot that is to be created immediately before deleting the cluster. If
     *        this parameter is provided, <i>SkipFinalClusterSnapshot</i> must be <code>false</code>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setFinalClusterSnapshotIdentifier(String finalClusterSnapshotIdentifier) {
        this.finalClusterSnapshotIdentifier = finalClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this
     * parameter is provided, <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the final snapshot that is to be created immediately before deleting the cluster. If
     *         this parameter is provided, <i>SkipFinalClusterSnapshot</i> must be <code>false</code>. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getFinalClusterSnapshotIdentifier() {
        return this.finalClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the final snapshot that is to be created immediately before deleting the cluster. If this
     * parameter is provided, <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param finalClusterSnapshotIdentifier
     *        The identifier of the final snapshot that is to be created immediately before deleting the cluster. If
     *        this parameter is provided, <i>SkipFinalClusterSnapshot</i> must be <code>false</code>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterRequest withFinalClusterSnapshotIdentifier(String finalClusterSnapshotIdentifier) {
        setFinalClusterSnapshotIdentifier(finalClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @param finalClusterSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely.</p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        The default value is -1.
     */

    public void setFinalClusterSnapshotRetentionPeriod(Integer finalClusterSnapshotRetentionPeriod) {
        this.finalClusterSnapshotRetentionPeriod = finalClusterSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @return The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is
     *         retained indefinitely.</p>
     *         <p>
     *         The value must be either -1 or an integer between 1 and 3,653.
     *         </p>
     *         <p>
     *         The default value is -1.
     */

    public Integer getFinalClusterSnapshotRetentionPeriod() {
        return this.finalClusterSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     * indefinitely.
     * </p>
     * <p>
     * The value must be either -1 or an integer between 1 and 3,653.
     * </p>
     * <p>
     * The default value is -1.
     * </p>
     * 
     * @param finalClusterSnapshotRetentionPeriod
     *        The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained
     *        indefinitely.</p>
     *        <p>
     *        The value must be either -1 or an integer between 1 and 3,653.
     *        </p>
     *        <p>
     *        The default value is -1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteClusterRequest withFinalClusterSnapshotRetentionPeriod(Integer finalClusterSnapshotRetentionPeriod) {
        setFinalClusterSnapshotRetentionPeriod(finalClusterSnapshotRetentionPeriod);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getSkipFinalClusterSnapshot() != null)
            sb.append("SkipFinalClusterSnapshot: ").append(getSkipFinalClusterSnapshot()).append(",");
        if (getFinalClusterSnapshotIdentifier() != null)
            sb.append("FinalClusterSnapshotIdentifier: ").append(getFinalClusterSnapshotIdentifier()).append(",");
        if (getFinalClusterSnapshotRetentionPeriod() != null)
            sb.append("FinalClusterSnapshotRetentionPeriod: ").append(getFinalClusterSnapshotRetentionPeriod());
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
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getSkipFinalClusterSnapshot() == null ^ this.getSkipFinalClusterSnapshot() == null)
            return false;
        if (other.getSkipFinalClusterSnapshot() != null && other.getSkipFinalClusterSnapshot().equals(this.getSkipFinalClusterSnapshot()) == false)
            return false;
        if (other.getFinalClusterSnapshotIdentifier() == null ^ this.getFinalClusterSnapshotIdentifier() == null)
            return false;
        if (other.getFinalClusterSnapshotIdentifier() != null
                && other.getFinalClusterSnapshotIdentifier().equals(this.getFinalClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getFinalClusterSnapshotRetentionPeriod() == null ^ this.getFinalClusterSnapshotRetentionPeriod() == null)
            return false;
        if (other.getFinalClusterSnapshotRetentionPeriod() != null
                && other.getFinalClusterSnapshotRetentionPeriod().equals(this.getFinalClusterSnapshotRetentionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSkipFinalClusterSnapshot() == null) ? 0 : getSkipFinalClusterSnapshot().hashCode());
        hashCode = prime * hashCode + ((getFinalClusterSnapshotIdentifier() == null) ? 0 : getFinalClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getFinalClusterSnapshotRetentionPeriod() == null) ? 0 : getFinalClusterSnapshotRetentionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public DeleteClusterRequest clone() {
        return (DeleteClusterRequest) super.clone();
    }

}
