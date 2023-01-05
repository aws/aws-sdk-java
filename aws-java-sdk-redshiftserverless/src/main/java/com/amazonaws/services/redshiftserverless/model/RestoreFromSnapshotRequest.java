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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/RestoreFromSnapshot"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the namespace to restore the snapshot to.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The Amazon Web Services account that owns the snapshot.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon Redshift
     * Serverless to a provisioned cluster. Must not be specified at the same time as <code>snapshotName</code>.
     * </p>
     * <p>
     * The format of the ARN is
     * arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier&gt;/&lt
     * ;snapshot_identifier&gt;.
     * </p>
     */
    private String snapshotArn;
    /**
     * <p>
     * The name of the snapshot to restore from. Must not be specified at the same time as <code>snapshotArn</code>.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The name of the workgroup used to restore the snapshot.
     * </p>
     */
    private String workgroupName;

    /**
     * <p>
     * The name of the namespace to restore the snapshot to.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to restore the snapshot to.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to restore the snapshot to.
     * </p>
     * 
     * @return The name of the namespace to restore the snapshot to.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace to restore the snapshot to.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace to restore the snapshot to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotRequest withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The Amazon Web Services account that owns the snapshot.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @return The Amazon Web Services account that owns the snapshot.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The Amazon Web Services account that owns the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The Amazon Web Services account that owns the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotRequest withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon Redshift
     * Serverless to a provisioned cluster. Must not be specified at the same time as <code>snapshotName</code>.
     * </p>
     * <p>
     * The format of the ARN is
     * arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier&gt;/&lt
     * ;snapshot_identifier&gt;.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon Redshift
     *        Serverless to a provisioned cluster. Must not be specified at the same time as <code>snapshotName</code>
     *        .</p>
     *        <p>
     *        The format of the ARN is
     *        arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier
     *        &gt;/&lt;snapshot_identifier&gt;.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon Redshift
     * Serverless to a provisioned cluster. Must not be specified at the same time as <code>snapshotName</code>.
     * </p>
     * <p>
     * The format of the ARN is
     * arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier&gt;/&lt
     * ;snapshot_identifier&gt;.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon
     *         Redshift Serverless to a provisioned cluster. Must not be specified at the same time as
     *         <code>snapshotName</code>.</p>
     *         <p>
     *         The format of the ARN is
     *         arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier
     *         &gt;/&lt;snapshot_identifier&gt;.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon Redshift
     * Serverless to a provisioned cluster. Must not be specified at the same time as <code>snapshotName</code>.
     * </p>
     * <p>
     * The format of the ARN is
     * arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier&gt;/&lt
     * ;snapshot_identifier&gt;.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) of the snapshot to restore from. Required if restoring from Amazon Redshift
     *        Serverless to a provisioned cluster. Must not be specified at the same time as <code>snapshotName</code>
     *        .</p>
     *        <p>
     *        The format of the ARN is
     *        arn:aws:redshift:&lt;region&gt;:&lt;account_id&gt;:snapshot:&lt;cluster_identifier
     *        &gt;/&lt;snapshot_identifier&gt;.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotRequest withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot to restore from. Must not be specified at the same time as <code>snapshotArn</code>.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to restore from. Must not be specified at the same time as
     *        <code>snapshotArn</code>.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to restore from. Must not be specified at the same time as <code>snapshotArn</code>.
     * </p>
     * 
     * @return The name of the snapshot to restore from. Must not be specified at the same time as
     *         <code>snapshotArn</code>.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot to restore from. Must not be specified at the same time as <code>snapshotArn</code>.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot to restore from. Must not be specified at the same time as
     *        <code>snapshotArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The name of the workgroup used to restore the snapshot.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup used to restore the snapshot.
     */

    public void setWorkgroupName(String workgroupName) {
        this.workgroupName = workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup used to restore the snapshot.
     * </p>
     * 
     * @return The name of the workgroup used to restore the snapshot.
     */

    public String getWorkgroupName() {
        return this.workgroupName;
    }

    /**
     * <p>
     * The name of the workgroup used to restore the snapshot.
     * </p>
     * 
     * @param workgroupName
     *        The name of the workgroup used to restore the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreFromSnapshotRequest withWorkgroupName(String workgroupName) {
        setWorkgroupName(workgroupName);
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
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getWorkgroupName() != null)
            sb.append("WorkgroupName: ").append(getWorkgroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreFromSnapshotRequest == false)
            return false;
        RestoreFromSnapshotRequest other = (RestoreFromSnapshotRequest) obj;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getWorkgroupName() == null ^ this.getWorkgroupName() == null)
            return false;
        if (other.getWorkgroupName() != null && other.getWorkgroupName().equals(this.getWorkgroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getWorkgroupName() == null) ? 0 : getWorkgroupName().hashCode());
        return hashCode;
    }

    @Override
    public RestoreFromSnapshotRequest clone() {
        return (RestoreFromSnapshotRequest) super.clone();
    }

}
