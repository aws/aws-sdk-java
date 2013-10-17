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
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest) AuthorizeSnapshotAccess operation}.
 * <p>
 * Authorizes the specified AWS customer account to restore the specified snapshot.
 * </p>
 * <p>
 * For more information about working with snapshots, go to <a href="http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-snapshots.html">
 * Amazon Redshift Snapshots </a> in the <i>Amazon Redshift Management Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#authorizeSnapshotAccess(AuthorizeSnapshotAccessRequest)
 */
public class AuthorizeSnapshotAccessRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the snapshot the account is authorized to restore.
     */
    private String snapshotIdentifier;

    /**
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     */
    private String snapshotClusterIdentifier;

    /**
     * The identifier of the AWS customer account authorized to restore the
     * specified snapshot.
     */
    private String accountWithRestoreAccess;

    /**
     * The identifier of the snapshot the account is authorized to restore.
     *
     * @return The identifier of the snapshot the account is authorized to restore.
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The identifier of the snapshot the account is authorized to restore.
     *
     * @param snapshotIdentifier The identifier of the snapshot the account is authorized to restore.
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The identifier of the snapshot the account is authorized to restore.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The identifier of the snapshot the account is authorized to restore.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeSnapshotAccessRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     *
     * @return The identifier of the cluster the snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name.
     */
    public String getSnapshotClusterIdentifier() {
        return snapshotClusterIdentifier;
    }
    
    /**
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     *
     * @param snapshotClusterIdentifier The identifier of the cluster the snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name.
     */
    public void setSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
    }
    
    /**
     * The identifier of the cluster the snapshot was created from. This
     * parameter is required if your IAM user has a policy containing a
     * snapshot resource element that specifies anything other than * for the
     * cluster name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotClusterIdentifier The identifier of the cluster the snapshot was created from. This
     *         parameter is required if your IAM user has a policy containing a
     *         snapshot resource element that specifies anything other than * for the
     *         cluster name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeSnapshotAccessRequest withSnapshotClusterIdentifier(String snapshotClusterIdentifier) {
        this.snapshotClusterIdentifier = snapshotClusterIdentifier;
        return this;
    }

    /**
     * The identifier of the AWS customer account authorized to restore the
     * specified snapshot.
     *
     * @return The identifier of the AWS customer account authorized to restore the
     *         specified snapshot.
     */
    public String getAccountWithRestoreAccess() {
        return accountWithRestoreAccess;
    }
    
    /**
     * The identifier of the AWS customer account authorized to restore the
     * specified snapshot.
     *
     * @param accountWithRestoreAccess The identifier of the AWS customer account authorized to restore the
     *         specified snapshot.
     */
    public void setAccountWithRestoreAccess(String accountWithRestoreAccess) {
        this.accountWithRestoreAccess = accountWithRestoreAccess;
    }
    
    /**
     * The identifier of the AWS customer account authorized to restore the
     * specified snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountWithRestoreAccess The identifier of the AWS customer account authorized to restore the
     *         specified snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AuthorizeSnapshotAccessRequest withAccountWithRestoreAccess(String accountWithRestoreAccess) {
        this.accountWithRestoreAccess = accountWithRestoreAccess;
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
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotClusterIdentifier() != null) sb.append("SnapshotClusterIdentifier: " + getSnapshotClusterIdentifier() + ",");
        if (getAccountWithRestoreAccess() != null) sb.append("AccountWithRestoreAccess: " + getAccountWithRestoreAccess() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotClusterIdentifier() == null) ? 0 : getSnapshotClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getAccountWithRestoreAccess() == null) ? 0 : getAccountWithRestoreAccess().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AuthorizeSnapshotAccessRequest == false) return false;
        AuthorizeSnapshotAccessRequest other = (AuthorizeSnapshotAccessRequest)obj;
        
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getSnapshotClusterIdentifier() == null ^ this.getSnapshotClusterIdentifier() == null) return false;
        if (other.getSnapshotClusterIdentifier() != null && other.getSnapshotClusterIdentifier().equals(this.getSnapshotClusterIdentifier()) == false) return false; 
        if (other.getAccountWithRestoreAccess() == null ^ this.getAccountWithRestoreAccess() == null) return false;
        if (other.getAccountWithRestoreAccess() != null && other.getAccountWithRestoreAccess().equals(this.getAccountWithRestoreAccess()) == false) return false; 
        return true;
    }
    
}
    