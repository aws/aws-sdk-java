/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.docdbelastic.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-elastic-2022-11-28/CopyClusterSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     * snapshot. The default is <code>false</code>.
     * </p>
     */
    private Boolean copyTags;
    /**
     * <p>
     * The Amazon Web Services KMS key ID for an encrypted elastic cluster snapshot. The Amazon Web Services KMS key ID
     * is the Amazon Resource Name (ARN), Amazon Web Services KMS key identifier, or the Amazon Web Services KMS key
     * alias for the Amazon Web Services KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted elastic cluster snapshot from your Amazon Web Services account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new Amazon Web ServicesS KMS encryption key. If you don't
     * specify a value for <code>KmsKeyId</code>, then the copy of the elastic cluster snapshot is encrypted with the
     * same <code>AWS</code> KMS key as the source elastic cluster snapshot.
     * </p>
     * <p>
     * To copy an encrypted elastic cluster snapshot to another Amazon Web Services region, set <code>KmsKeyId</code> to
     * the Amazon Web Services KMS key ID that you want to use to encrypt the copy of the elastic cluster snapshot in
     * the destination region. Amazon Web Services KMS encryption keys are specific to the Amazon Web Services region
     * that they are created in, and you can't use encryption keys from one Amazon Web Services region in another Amazon
     * Web Services region.
     * </p>
     * <p>
     * If you copy an unencrypted elastic cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     * an error is returned.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the elastic cluster snapshot.
     * </p>
     */
    private String snapshotArn;
    /**
     * <p>
     * The tags to be assigned to the elastic cluster snapshot.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The identifier of the new elastic cluster snapshot to create from the source cluster snapshot. This parameter is
     * not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>elastic-cluster-snapshot-5</code>
     * </p>
     */
    private String targetSnapshotName;

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     * snapshot. The default is <code>false</code>.
     * </p>
     * 
     * @param copyTags
     *        Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     *        snapshot. The default is <code>false</code>.
     */

    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     * snapshot. The default is <code>false</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     *         snapshot. The default is <code>false</code>.
     */

    public Boolean getCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     * snapshot. The default is <code>false</code>.
     * </p>
     * 
     * @param copyTags
     *        Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     *        snapshot. The default is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withCopyTags(Boolean copyTags) {
        setCopyTags(copyTags);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     * snapshot. The default is <code>false</code>.
     * </p>
     * 
     * @return Set to <code>true</code> to copy all tags from the source cluster snapshot to the target elastic cluster
     *         snapshot. The default is <code>false</code>.
     */

    public Boolean isCopyTags() {
        return this.copyTags;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key ID for an encrypted elastic cluster snapshot. The Amazon Web Services KMS key ID
     * is the Amazon Resource Name (ARN), Amazon Web Services KMS key identifier, or the Amazon Web Services KMS key
     * alias for the Amazon Web Services KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted elastic cluster snapshot from your Amazon Web Services account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new Amazon Web ServicesS KMS encryption key. If you don't
     * specify a value for <code>KmsKeyId</code>, then the copy of the elastic cluster snapshot is encrypted with the
     * same <code>AWS</code> KMS key as the source elastic cluster snapshot.
     * </p>
     * <p>
     * To copy an encrypted elastic cluster snapshot to another Amazon Web Services region, set <code>KmsKeyId</code> to
     * the Amazon Web Services KMS key ID that you want to use to encrypt the copy of the elastic cluster snapshot in
     * the destination region. Amazon Web Services KMS encryption keys are specific to the Amazon Web Services region
     * that they are created in, and you can't use encryption keys from one Amazon Web Services region in another Amazon
     * Web Services region.
     * </p>
     * <p>
     * If you copy an unencrypted elastic cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     * an error is returned.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key ID for an encrypted elastic cluster snapshot. The Amazon Web Services KMS
     *        key ID is the Amazon Resource Name (ARN), Amazon Web Services KMS key identifier, or the Amazon Web
     *        Services KMS key alias for the Amazon Web Services KMS encryption key.</p>
     *        <p>
     *        If you copy an encrypted elastic cluster snapshot from your Amazon Web Services account, you can specify a
     *        value for <code>KmsKeyId</code> to encrypt the copy with a new Amazon Web ServicesS KMS encryption key. If
     *        you don't specify a value for <code>KmsKeyId</code>, then the copy of the elastic cluster snapshot is
     *        encrypted with the same <code>AWS</code> KMS key as the source elastic cluster snapshot.
     *        </p>
     *        <p>
     *        To copy an encrypted elastic cluster snapshot to another Amazon Web Services region, set
     *        <code>KmsKeyId</code> to the Amazon Web Services KMS key ID that you want to use to encrypt the copy of
     *        the elastic cluster snapshot in the destination region. Amazon Web Services KMS encryption keys are
     *        specific to the Amazon Web Services region that they are created in, and you can't use encryption keys
     *        from one Amazon Web Services region in another Amazon Web Services region.
     *        </p>
     *        <p>
     *        If you copy an unencrypted elastic cluster snapshot and specify a value for the <code>KmsKeyId</code>
     *        parameter, an error is returned.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key ID for an encrypted elastic cluster snapshot. The Amazon Web Services KMS key ID
     * is the Amazon Resource Name (ARN), Amazon Web Services KMS key identifier, or the Amazon Web Services KMS key
     * alias for the Amazon Web Services KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted elastic cluster snapshot from your Amazon Web Services account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new Amazon Web ServicesS KMS encryption key. If you don't
     * specify a value for <code>KmsKeyId</code>, then the copy of the elastic cluster snapshot is encrypted with the
     * same <code>AWS</code> KMS key as the source elastic cluster snapshot.
     * </p>
     * <p>
     * To copy an encrypted elastic cluster snapshot to another Amazon Web Services region, set <code>KmsKeyId</code> to
     * the Amazon Web Services KMS key ID that you want to use to encrypt the copy of the elastic cluster snapshot in
     * the destination region. Amazon Web Services KMS encryption keys are specific to the Amazon Web Services region
     * that they are created in, and you can't use encryption keys from one Amazon Web Services region in another Amazon
     * Web Services region.
     * </p>
     * <p>
     * If you copy an unencrypted elastic cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     * an error is returned.
     * </p>
     * 
     * @return The Amazon Web Services KMS key ID for an encrypted elastic cluster snapshot. The Amazon Web Services KMS
     *         key ID is the Amazon Resource Name (ARN), Amazon Web Services KMS key identifier, or the Amazon Web
     *         Services KMS key alias for the Amazon Web Services KMS encryption key.</p>
     *         <p>
     *         If you copy an encrypted elastic cluster snapshot from your Amazon Web Services account, you can specify
     *         a value for <code>KmsKeyId</code> to encrypt the copy with a new Amazon Web ServicesS KMS encryption key.
     *         If you don't specify a value for <code>KmsKeyId</code>, then the copy of the elastic cluster snapshot is
     *         encrypted with the same <code>AWS</code> KMS key as the source elastic cluster snapshot.
     *         </p>
     *         <p>
     *         To copy an encrypted elastic cluster snapshot to another Amazon Web Services region, set
     *         <code>KmsKeyId</code> to the Amazon Web Services KMS key ID that you want to use to encrypt the copy of
     *         the elastic cluster snapshot in the destination region. Amazon Web Services KMS encryption keys are
     *         specific to the Amazon Web Services region that they are created in, and you can't use encryption keys
     *         from one Amazon Web Services region in another Amazon Web Services region.
     *         </p>
     *         <p>
     *         If you copy an unencrypted elastic cluster snapshot and specify a value for the <code>KmsKeyId</code>
     *         parameter, an error is returned.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key ID for an encrypted elastic cluster snapshot. The Amazon Web Services KMS key ID
     * is the Amazon Resource Name (ARN), Amazon Web Services KMS key identifier, or the Amazon Web Services KMS key
     * alias for the Amazon Web Services KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted elastic cluster snapshot from your Amazon Web Services account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new Amazon Web ServicesS KMS encryption key. If you don't
     * specify a value for <code>KmsKeyId</code>, then the copy of the elastic cluster snapshot is encrypted with the
     * same <code>AWS</code> KMS key as the source elastic cluster snapshot.
     * </p>
     * <p>
     * To copy an encrypted elastic cluster snapshot to another Amazon Web Services region, set <code>KmsKeyId</code> to
     * the Amazon Web Services KMS key ID that you want to use to encrypt the copy of the elastic cluster snapshot in
     * the destination region. Amazon Web Services KMS encryption keys are specific to the Amazon Web Services region
     * that they are created in, and you can't use encryption keys from one Amazon Web Services region in another Amazon
     * Web Services region.
     * </p>
     * <p>
     * If you copy an unencrypted elastic cluster snapshot and specify a value for the <code>KmsKeyId</code> parameter,
     * an error is returned.
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key ID for an encrypted elastic cluster snapshot. The Amazon Web Services KMS
     *        key ID is the Amazon Resource Name (ARN), Amazon Web Services KMS key identifier, or the Amazon Web
     *        Services KMS key alias for the Amazon Web Services KMS encryption key.</p>
     *        <p>
     *        If you copy an encrypted elastic cluster snapshot from your Amazon Web Services account, you can specify a
     *        value for <code>KmsKeyId</code> to encrypt the copy with a new Amazon Web ServicesS KMS encryption key. If
     *        you don't specify a value for <code>KmsKeyId</code>, then the copy of the elastic cluster snapshot is
     *        encrypted with the same <code>AWS</code> KMS key as the source elastic cluster snapshot.
     *        </p>
     *        <p>
     *        To copy an encrypted elastic cluster snapshot to another Amazon Web Services region, set
     *        <code>KmsKeyId</code> to the Amazon Web Services KMS key ID that you want to use to encrypt the copy of
     *        the elastic cluster snapshot in the destination region. Amazon Web Services KMS encryption keys are
     *        specific to the Amazon Web Services region that they are created in, and you can't use encryption keys
     *        from one Amazon Web Services region in another Amazon Web Services region.
     *        </p>
     *        <p>
     *        If you copy an unencrypted elastic cluster snapshot and specify a value for the <code>KmsKeyId</code>
     *        parameter, an error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the elastic cluster snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) identifier of the elastic cluster snapshot.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the elastic cluster snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) identifier of the elastic cluster snapshot.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) identifier of the elastic cluster snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) identifier of the elastic cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the elastic cluster snapshot.
     * </p>
     * 
     * @return The tags to be assigned to the elastic cluster snapshot.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the elastic cluster snapshot.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the elastic cluster snapshot.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to be assigned to the elastic cluster snapshot.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the elastic cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CopyClusterSnapshotRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The identifier of the new elastic cluster snapshot to create from the source cluster snapshot. This parameter is
     * not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>elastic-cluster-snapshot-5</code>
     * </p>
     * 
     * @param targetSnapshotName
     *        The identifier of the new elastic cluster snapshot to create from the source cluster snapshot. This
     *        parameter is not case sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>elastic-cluster-snapshot-5</code>
     */

    public void setTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
    }

    /**
     * <p>
     * The identifier of the new elastic cluster snapshot to create from the source cluster snapshot. This parameter is
     * not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>elastic-cluster-snapshot-5</code>
     * </p>
     * 
     * @return The identifier of the new elastic cluster snapshot to create from the source cluster snapshot. This
     *         parameter is not case sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>elastic-cluster-snapshot-5</code>
     */

    public String getTargetSnapshotName() {
        return this.targetSnapshotName;
    }

    /**
     * <p>
     * The identifier of the new elastic cluster snapshot to create from the source cluster snapshot. This parameter is
     * not case sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>elastic-cluster-snapshot-5</code>
     * </p>
     * 
     * @param targetSnapshotName
     *        The identifier of the new elastic cluster snapshot to create from the source cluster snapshot. This
     *        parameter is not case sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>elastic-cluster-snapshot-5</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyClusterSnapshotRequest withTargetSnapshotName(String targetSnapshotName) {
        setTargetSnapshotName(targetSnapshotName);
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
        if (getCopyTags() != null)
            sb.append("CopyTags: ").append(getCopyTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargetSnapshotName() != null)
            sb.append("TargetSnapshotName: ").append(getTargetSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyClusterSnapshotRequest == false)
            return false;
        CopyClusterSnapshotRequest other = (CopyClusterSnapshotRequest) obj;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetSnapshotName() == null ^ this.getTargetSnapshotName() == null)
            return false;
        if (other.getTargetSnapshotName() != null && other.getTargetSnapshotName().equals(this.getTargetSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetSnapshotName() == null) ? 0 : getTargetSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public CopyClusterSnapshotRequest clone() {
        return (CopyClusterSnapshotRequest) super.clone();
    }

}
