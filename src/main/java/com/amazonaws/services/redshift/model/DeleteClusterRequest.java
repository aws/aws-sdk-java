/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#deleteCluster(DeleteClusterRequest) DeleteCluster operation}.
 * <p>
 * Deletes a previously provisioned cluster. A successful response from the web service indicates that the request was received correctly. If a final
 * cluster snapshot is requested the status of the cluster will be "final-snapshot" while the snapshot is being taken, then it's "deleting" once Amazon
 * Redshift begins deleting the cluster. Use DescribeClusters to monitor the status of the deletion. The delete operation cannot be canceled or reverted
 * once submitted. For more information about managing clusters, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-clusters.html"> Amazon Redshift Clusters </a> in the <i>Amazon Redshift Management
 * Guide</i> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#deleteCluster(DeleteClusterRequest)
 */
public class DeleteClusterRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the cluster to be deleted. <p>Constraints: <ul>
     * <li>Must contain lowercase characters.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     */
    private String clusterIdentifier;

    /**
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final
     * cluster snapshot is created before the cluster is deleted. <note>The
     * <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     */
    private Boolean skipFinalClusterSnapshot;

    /**
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens.</li> </ul>
     */
    private String finalClusterSnapshotIdentifier;

    /**
     * The identifier of the cluster to be deleted. <p>Constraints: <ul>
     * <li>Must contain lowercase characters.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @return The identifier of the cluster to be deleted. <p>Constraints: <ul>
     *         <li>Must contain lowercase characters.</li> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster to be deleted. <p>Constraints: <ul>
     * <li>Must contain lowercase characters.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     *
     * @param clusterIdentifier The identifier of the cluster to be deleted. <p>Constraints: <ul>
     *         <li>Must contain lowercase characters.</li> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster to be deleted. <p>Constraints: <ul>
     * <li>Must contain lowercase characters.</li> <li>Must contain from 1 to
     * 63 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the cluster to be deleted. <p>Constraints: <ul>
     *         <li>Must contain lowercase characters.</li> <li>Must contain from 1 to
     *         63 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteClusterRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final
     * cluster snapshot is created before the cluster is deleted. <note>The
     * <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     *
     * @return Determines whether a final snapshot of the cluster is created before
     *         Amazon Redshift deletes the cluster. If <code>true</code>, a final
     *         cluster snapshot is not created. If <code>false</code>, a final
     *         cluster snapshot is created before the cluster is deleted. <note>The
     *         <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     *         <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
     */
    public Boolean isSkipFinalClusterSnapshot() {
        return skipFinalClusterSnapshot;
    }
    
    /**
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final
     * cluster snapshot is created before the cluster is deleted. <note>The
     * <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     *
     * @param skipFinalClusterSnapshot Determines whether a final snapshot of the cluster is created before
     *         Amazon Redshift deletes the cluster. If <code>true</code>, a final
     *         cluster snapshot is not created. If <code>false</code>, a final
     *         cluster snapshot is created before the cluster is deleted. <note>The
     *         <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     *         <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
     */
    public void setSkipFinalClusterSnapshot(Boolean skipFinalClusterSnapshot) {
        this.skipFinalClusterSnapshot = skipFinalClusterSnapshot;
    }
    
    /**
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final
     * cluster snapshot is created before the cluster is deleted. <note>The
     * <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param skipFinalClusterSnapshot Determines whether a final snapshot of the cluster is created before
     *         Amazon Redshift deletes the cluster. If <code>true</code>, a final
     *         cluster snapshot is not created. If <code>false</code>, a final
     *         cluster snapshot is created before the cluster is deleted. <note>The
     *         <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     *         <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteClusterRequest withSkipFinalClusterSnapshot(Boolean skipFinalClusterSnapshot) {
        this.skipFinalClusterSnapshot = skipFinalClusterSnapshot;
        return this;
    }

    /**
     * Determines whether a final snapshot of the cluster is created before
     * Amazon Redshift deletes the cluster. If <code>true</code>, a final
     * cluster snapshot is not created. If <code>false</code>, a final
     * cluster snapshot is created before the cluster is deleted. <note>The
     * <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     * <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     * <p>Default: <code>false</code>
     *
     * @return Determines whether a final snapshot of the cluster is created before
     *         Amazon Redshift deletes the cluster. If <code>true</code>, a final
     *         cluster snapshot is not created. If <code>false</code>, a final
     *         cluster snapshot is created before the cluster is deleted. <note>The
     *         <i>FinalClusterSnapshotIdentifier</i> parameter must be specified if
     *         <i>SkipFinalClusterSnapshot</i> is <code>false</code>.</note>
     *         <p>Default: <code>false</code>
     */
    public Boolean getSkipFinalClusterSnapshot() {
        return skipFinalClusterSnapshot;
    }

    /**
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @return The identifier of the final snapshot that is to be created immediately
     *         before deleting the cluster. If this parameter is provided,
     *         <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     *         <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters.</li> <li>First character must be a letter.</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens.</li> </ul>
     */
    public String getFinalClusterSnapshotIdentifier() {
        return finalClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @param finalClusterSnapshotIdentifier The identifier of the final snapshot that is to be created immediately
     *         before deleting the cluster. If this parameter is provided,
     *         <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     *         <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters.</li> <li>First character must be a letter.</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens.</li> </ul>
     */
    public void setFinalClusterSnapshotIdentifier(String finalClusterSnapshotIdentifier) {
        this.finalClusterSnapshotIdentifier = finalClusterSnapshotIdentifier;
    }
    
    /**
     * The identifier of the final snapshot that is to be created immediately
     * before deleting the cluster. If this parameter is provided,
     * <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param finalClusterSnapshotIdentifier The identifier of the final snapshot that is to be created immediately
     *         before deleting the cluster. If this parameter is provided,
     *         <i>SkipFinalClusterSnapshot</i> must be <code>false</code>.
     *         <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric
     *         characters.</li> <li>First character must be a letter.</li> <li>Cannot
     *         end with a hyphen or contain two consecutive hyphens.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteClusterRequest withFinalClusterSnapshotIdentifier(String finalClusterSnapshotIdentifier) {
        this.finalClusterSnapshotIdentifier = finalClusterSnapshotIdentifier;
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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (isSkipFinalClusterSnapshot() != null) sb.append("SkipFinalClusterSnapshot: " + isSkipFinalClusterSnapshot() + ",");
        if (getFinalClusterSnapshotIdentifier() != null) sb.append("FinalClusterSnapshotIdentifier: " + getFinalClusterSnapshotIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((isSkipFinalClusterSnapshot() == null) ? 0 : isSkipFinalClusterSnapshot().hashCode()); 
        hashCode = prime * hashCode + ((getFinalClusterSnapshotIdentifier() == null) ? 0 : getFinalClusterSnapshotIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteClusterRequest == false) return false;
        DeleteClusterRequest other = (DeleteClusterRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.isSkipFinalClusterSnapshot() == null ^ this.isSkipFinalClusterSnapshot() == null) return false;
        if (other.isSkipFinalClusterSnapshot() != null && other.isSkipFinalClusterSnapshot().equals(this.isSkipFinalClusterSnapshot()) == false) return false; 
        if (other.getFinalClusterSnapshotIdentifier() == null ^ this.getFinalClusterSnapshotIdentifier() == null) return false;
        if (other.getFinalClusterSnapshotIdentifier() != null && other.getFinalClusterSnapshotIdentifier().equals(this.getFinalClusterSnapshotIdentifier()) == false) return false; 
        return true;
    }
    
}
    