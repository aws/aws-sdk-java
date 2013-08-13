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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest) RestoreFromClusterSnapshot operation}.
 * <p>
 * Creates a new cluster from a snapshot. Amazon Redshift creates the resulting cluster with the same configuration as the original cluster from which
 * the snapshot was created, except that the new cluster is created with the default cluster security and parameter group. After Amazon Redshift creates
 * the cluster you can use the ModifyCluster API to associate a different security group and different parameter group with the restored cluster.
 * </p>
 * <p>
 * If a snapshot is taken of a cluster in VPC, you can restore it only in VPC. In this case, you must provide a cluster subnet group where you want the
 * cluster restored. If snapshot is taken of a cluster outside VPC, then you can restore it only outside VPC.
 * </p>
 * <p>
 * For more information about working with snapshots, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
 * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#restoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest)
 */
public class RestoreFromClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     */
    private String clusterIdentifier;

    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     */
    private String snapshotIdentifier;

    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     */
    private Integer port;

    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     */
    private String availabilityZone;

    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p>Default: <code>true</code>
     */
    private Boolean allowVersionUpgrade;

    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     */
    private String clusterSubnetGroupName;

    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     */
    private Boolean publiclyAccessible;

    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     */
    private String ownerAccount;

    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *
     * @return The identifier of the cluster that will be created from restoring the
     *         snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *
     * @param clusterIdentifier The identifier of the cluster that will be created from restoring the
     *         snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster that will be created from restoring the
     * snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     * must be lowercase.</li> <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * <li>Must be unique for all clusters within an AWS account.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the cluster that will be created from restoring the
     *         snapshot. <p> <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>Alphabetic characters
     *         must be lowercase.</li> <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         <li>Must be unique for all clusters within an AWS account.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }
    
    
    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @return The name of the snapshot from which to create the new cluster. This
     *         parameter isn't case sensitive. <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster. This
     *         parameter isn't case sensitive. <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The name of the snapshot from which to create the new cluster. This
     * parameter isn't case sensitive. <p>Example:
     * <code>my-snapshot-id</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The name of the snapshot from which to create the new cluster. This
     *         parameter isn't case sensitive. <p>Example:
     *         <code>my-snapshot-id</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }
    
    
    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     *
     * @return The port number on which the cluster accepts connections. <p>Default:
     *         The same port as the original cluster. <p>Constraints: Must be between
     *         <code>1115</code> and <code>65535</code>.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     *
     * @param port The port number on which the cluster accepts connections. <p>Default:
     *         The same port as the original cluster. <p>Constraints: Must be between
     *         <code>1115</code> and <code>65535</code>.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the cluster accepts connections. <p>Default:
     * The same port as the original cluster. <p>Constraints: Must be between
     * <code>1115</code> and <code>65535</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the cluster accepts connections. <p>Default:
     *         The same port as the original cluster. <p>Constraints: Must be between
     *         <code>1115</code> and <code>65535</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withPort(Integer port) {
        this.port = port;
        return this;
    }
    
    
    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     *
     * @return The Amazon EC2 Availability Zone in which to restore the cluster.
     *         <p>Default: A random, system-chosen Availability Zone. <p>Example:
     *         <code>us-east-1a</code>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     *
     * @param availabilityZone The Amazon EC2 Availability Zone in which to restore the cluster.
     *         <p>Default: A random, system-chosen Availability Zone. <p>Example:
     *         <code>us-east-1a</code>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone in which to restore the cluster.
     * <p>Default: A random, system-chosen Availability Zone. <p>Example:
     * <code>us-east-1a</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone in which to restore the cluster.
     *         <p>Default: A random, system-chosen Availability Zone. <p>Example:
     *         <code>us-east-1a</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }
    
    
    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p>Default: <code>true</code>
     */
    public Boolean isAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p>Default: <code>true</code>
     *
     * @param allowVersionUpgrade If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p>Default: <code>true</code>
     */
    public void setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
    }
    
    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p>Default: <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allowVersionUpgrade If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p>Default: <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withAllowVersionUpgrade(Boolean allowVersionUpgrade) {
        this.allowVersionUpgrade = allowVersionUpgrade;
        return this;
    }
    
    
    /**
     * If <code>true</code>, upgrades can be applied during the maintenance
     * window to the Amazon Redshift engine that is running on the cluster.
     * <p>Default: <code>true</code>
     *
     * @return If <code>true</code>, upgrades can be applied during the maintenance
     *         window to the Amazon Redshift engine that is running on the cluster.
     *         <p>Default: <code>true</code>
     */
    public Boolean getAllowVersionUpgrade() {
        return allowVersionUpgrade;
    }
    
    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     *
     * @return The name of the subnet group where you want to cluster restored. <p> A
     *         snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     *         must provide subnet group name where you want the cluster restored.
     */
    public String getClusterSubnetGroupName() {
        return clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     *
     * @param clusterSubnetGroupName The name of the subnet group where you want to cluster restored. <p> A
     *         snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     *         must provide subnet group name where you want the cluster restored.
     */
    public void setClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
    }
    
    /**
     * The name of the subnet group where you want to cluster restored. <p> A
     * snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     * must provide subnet group name where you want the cluster restored.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterSubnetGroupName The name of the subnet group where you want to cluster restored. <p> A
     *         snapshot of cluster in VPC can be restored only in VPC. Therefore, you
     *         must provide subnet group name where you want the cluster restored.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withClusterSubnetGroupName(String clusterSubnetGroupName) {
        this.clusterSubnetGroupName = clusterSubnetGroupName;
        return this;
    }
    
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @return If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @param publiclyAccessible If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible If <code>true</code>, the cluster can be accessed from a public
     *         network.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }
    
    
    /**
     * If <code>true</code>, the cluster can be accessed from a public
     * network.
     *
     * @return If <code>true</code>, the cluster can be accessed from a public
     *         network.
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     *
     * @return The AWS customer account used to create or copy the snapshot. Required
     *         if you are restoring a snapshot you do not own, optional if you own
     *         the snapshot.
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }
    
    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     *
     * @param ownerAccount The AWS customer account used to create or copy the snapshot. Required
     *         if you are restoring a snapshot you do not own, optional if you own
     *         the snapshot.
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
    
    /**
     * The AWS customer account used to create or copy the snapshot. Required
     * if you are restoring a snapshot you do not own, optional if you own
     * the snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAccount The AWS customer account used to create or copy the snapshot. Required
     *         if you are restoring a snapshot you do not own, optional if you own
     *         the snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RestoreFromClusterSnapshotRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
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
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (isAllowVersionUpgrade() != null) sb.append("AllowVersionUpgrade: " + isAllowVersionUpgrade() + ",");
        if (getClusterSubnetGroupName() != null) sb.append("ClusterSubnetGroupName: " + getClusterSubnetGroupName() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getOwnerAccount() != null) sb.append("OwnerAccount: " + getOwnerAccount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((isAllowVersionUpgrade() == null) ? 0 : isAllowVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getClusterSubnetGroupName() == null) ? 0 : getClusterSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreFromClusterSnapshotRequest == false) return false;
        RestoreFromClusterSnapshotRequest other = (RestoreFromClusterSnapshotRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.isAllowVersionUpgrade() == null ^ this.isAllowVersionUpgrade() == null) return false;
        if (other.isAllowVersionUpgrade() != null && other.isAllowVersionUpgrade().equals(this.isAllowVersionUpgrade()) == false) return false; 
        if (other.getClusterSubnetGroupName() == null ^ this.getClusterSubnetGroupName() == null) return false;
        if (other.getClusterSubnetGroupName() != null && other.getClusterSubnetGroupName().equals(this.getClusterSubnetGroupName()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null) return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false) return false; 
        return true;
    }
    
}
    