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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#copyClusterSnapshot(CopyClusterSnapshotRequest) CopyClusterSnapshot operation}.
 * <p>
 * Copies the specified automated cluster snapshot to a new manual cluster snapshot. The source must be an automated snapshot and it must be in the
 * available state.
 * </p>
 * <p>
 * When you delete a cluster, Amazon Redshift deletes any automated snapshots of the cluster. Also, when the retention period of the snapshot expires,
 * Amazon Redshift automatically deletes it. If you want to keep an automated snapshot for a longer period, you can make a manual copy of the snapshot.
 * Manual snapshots are retained until you delete them.
 * </p>
 * <p>
 * For more information about working with snapshots, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
 * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#copyClusterSnapshot(CopyClusterSnapshotRequest)
 */
public class CopyClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier for the source snapshot. <p>Constraints: <ul> <li>Must
     * be the identifier for a valid automated snapshot whose state is
     * "available".</li> </ul>
     */
    private String sourceSnapshotIdentifier;

    /**
     * The identifier of the cluster the source snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: <ul> <li>Must be the identifier for a
     * valid cluster.</li> </ul>
     */
    private String sourceSnapshotClusterIdentifier;

    /**
     * The identifier given to the new manual snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> <li>Must be unique for the AWS account that
     * is making the request.</li> </ul>
     */
    private String targetSnapshotIdentifier;

    /**
     * The identifier for the source snapshot. <p>Constraints: <ul> <li>Must
     * be the identifier for a valid automated snapshot whose state is
     * "available".</li> </ul>
     *
     * @return The identifier for the source snapshot. <p>Constraints: <ul> <li>Must
     *         be the identifier for a valid automated snapshot whose state is
     *         "available".</li> </ul>
     */
    public String getSourceSnapshotIdentifier() {
        return sourceSnapshotIdentifier;
    }
    
    /**
     * The identifier for the source snapshot. <p>Constraints: <ul> <li>Must
     * be the identifier for a valid automated snapshot whose state is
     * "available".</li> </ul>
     *
     * @param sourceSnapshotIdentifier The identifier for the source snapshot. <p>Constraints: <ul> <li>Must
     *         be the identifier for a valid automated snapshot whose state is
     *         "available".</li> </ul>
     */
    public void setSourceSnapshotIdentifier(String sourceSnapshotIdentifier) {
        this.sourceSnapshotIdentifier = sourceSnapshotIdentifier;
    }
    
    /**
     * The identifier for the source snapshot. <p>Constraints: <ul> <li>Must
     * be the identifier for a valid automated snapshot whose state is
     * "available".</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSnapshotIdentifier The identifier for the source snapshot. <p>Constraints: <ul> <li>Must
     *         be the identifier for a valid automated snapshot whose state is
     *         "available".</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyClusterSnapshotRequest withSourceSnapshotIdentifier(String sourceSnapshotIdentifier) {
        this.sourceSnapshotIdentifier = sourceSnapshotIdentifier;
        return this;
    }

    /**
     * The identifier of the cluster the source snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: <ul> <li>Must be the identifier for a
     * valid cluster.</li> </ul>
     *
     * @return The identifier of the cluster the source snapshot was created from.
     *         This parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name. <p>Constraints: <ul> <li>Must be the identifier for a
     *         valid cluster.</li> </ul>
     */
    public String getSourceSnapshotClusterIdentifier() {
        return sourceSnapshotClusterIdentifier;
    }
    
    /**
     * The identifier of the cluster the source snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: <ul> <li>Must be the identifier for a
     * valid cluster.</li> </ul>
     *
     * @param sourceSnapshotClusterIdentifier The identifier of the cluster the source snapshot was created from.
     *         This parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name. <p>Constraints: <ul> <li>Must be the identifier for a
     *         valid cluster.</li> </ul>
     */
    public void setSourceSnapshotClusterIdentifier(String sourceSnapshotClusterIdentifier) {
        this.sourceSnapshotClusterIdentifier = sourceSnapshotClusterIdentifier;
    }
    
    /**
     * The identifier of the cluster the source snapshot was created from.
     * This parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name. <p>Constraints: <ul> <li>Must be the identifier for a
     * valid cluster.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceSnapshotClusterIdentifier The identifier of the cluster the source snapshot was created from.
     *         This parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name. <p>Constraints: <ul> <li>Must be the identifier for a
     *         valid cluster.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyClusterSnapshotRequest withSourceSnapshotClusterIdentifier(String sourceSnapshotClusterIdentifier) {
        this.sourceSnapshotClusterIdentifier = sourceSnapshotClusterIdentifier;
        return this;
    }

    /**
     * The identifier given to the new manual snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> <li>Must be unique for the AWS account that
     * is making the request.</li> </ul>
     *
     * @return The identifier given to the new manual snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> <li>Must be unique for the AWS account that
     *         is making the request.</li> </ul>
     */
    public String getTargetSnapshotIdentifier() {
        return targetSnapshotIdentifier;
    }
    
    /**
     * The identifier given to the new manual snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> <li>Must be unique for the AWS account that
     * is making the request.</li> </ul>
     *
     * @param targetSnapshotIdentifier The identifier given to the new manual snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> <li>Must be unique for the AWS account that
     *         is making the request.</li> </ul>
     */
    public void setTargetSnapshotIdentifier(String targetSnapshotIdentifier) {
        this.targetSnapshotIdentifier = targetSnapshotIdentifier;
    }
    
    /**
     * The identifier given to the new manual snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens.</li> <li>First character must
     * be a letter.</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens.</li> <li>Must be unique for the AWS account that
     * is making the request.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetSnapshotIdentifier The identifier given to the new manual snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank.</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens.</li> <li>First character must
     *         be a letter.</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens.</li> <li>Must be unique for the AWS account that
     *         is making the request.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CopyClusterSnapshotRequest withTargetSnapshotIdentifier(String targetSnapshotIdentifier) {
        this.targetSnapshotIdentifier = targetSnapshotIdentifier;
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
        if (getSourceSnapshotIdentifier() != null) sb.append("SourceSnapshotIdentifier: " + getSourceSnapshotIdentifier() + ",");
        if (getSourceSnapshotClusterIdentifier() != null) sb.append("SourceSnapshotClusterIdentifier: " + getSourceSnapshotClusterIdentifier() + ",");
        if (getTargetSnapshotIdentifier() != null) sb.append("TargetSnapshotIdentifier: " + getTargetSnapshotIdentifier() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceSnapshotIdentifier() == null) ? 0 : getSourceSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSourceSnapshotClusterIdentifier() == null) ? 0 : getSourceSnapshotClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetSnapshotIdentifier() == null) ? 0 : getTargetSnapshotIdentifier().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopyClusterSnapshotRequest == false) return false;
        CopyClusterSnapshotRequest other = (CopyClusterSnapshotRequest)obj;
        
        if (other.getSourceSnapshotIdentifier() == null ^ this.getSourceSnapshotIdentifier() == null) return false;
        if (other.getSourceSnapshotIdentifier() != null && other.getSourceSnapshotIdentifier().equals(this.getSourceSnapshotIdentifier()) == false) return false; 
        if (other.getSourceSnapshotClusterIdentifier() == null ^ this.getSourceSnapshotClusterIdentifier() == null) return false;
        if (other.getSourceSnapshotClusterIdentifier() != null && other.getSourceSnapshotClusterIdentifier().equals(this.getSourceSnapshotClusterIdentifier()) == false) return false; 
        if (other.getTargetSnapshotIdentifier() == null ^ this.getTargetSnapshotIdentifier() == null) return false;
        if (other.getTargetSnapshotIdentifier() != null && other.getTargetSnapshotIdentifier().equals(this.getTargetSnapshotIdentifier()) == false) return false; 
        return true;
    }
    
}
    