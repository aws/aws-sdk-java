/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#copyDBSnapshot(CopyDBSnapshotRequest) CopyDBSnapshot operation}.
 * <p>
 * Copies the specified DB snapshot. The source DB snapshot must be in
 * the "available" state.
 * </p>
 * <p>
 * If you are copying from a shared manual DB snapshot, the
 * <code>SourceDBSnapshotIdentifier</code> must be the ARN of the shared
 * DB snapshot.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#copyDBSnapshot(CopyDBSnapshotRequest)
 */
public class CopyDBSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The identifier for the source DB snapshot. <p>If you are copying from
     * a shared manual DB snapshot, this must be the ARN of the shared DB
     * snapshot. <p>Constraints: <ul> <li>Must specify a valid system
     * snapshot in the "available" state.</li> <li>If the source snapshot is
     * in the same region as the copy, specify a valid DB snapshot
     * identifier.</li> <li>If the source snapshot is in a different region
     * than the copy, specify a valid DB snapshot ARN. For more information,
     * go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-04-02-00-01</code> <p>Example:
     * <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     */
    private String sourceDBSnapshotIdentifier;

    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     */
    private String targetDBSnapshotIdentifier;

    /**
     * The AWS Key Management Service (AWS KMS) key identifier for an
     * encrypted DB snapshot. The KMS key identifier is the Amazon Resource
     * Name (ARN) or the KMS key alias for the KMS encryption key. <p>If you
     * copy an unencrypted DB snapshot and specify a value for the
     * <code>KmsKeyId</code> parameter, Amazon RDS encrypts the target DB
     * snapshot using the specified KMS encryption key. <p>If you copy an
     * encrypted DB snapshot from your AWS account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * then the copy of the DB snapshot is encrypted with the same KMS key as
     * the source DB snapshot. <p>If you copy an encrypted DB snapshot that
     * is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     */
    private String kmsKeyId;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * True to copy all tags from the source DB snapshot to the target DB
     * snapshot; otherwise false. The default is false.
     */
    private Boolean copyTags;

    /**
     * The identifier for the source DB snapshot. <p>If you are copying from
     * a shared manual DB snapshot, this must be the ARN of the shared DB
     * snapshot. <p>Constraints: <ul> <li>Must specify a valid system
     * snapshot in the "available" state.</li> <li>If the source snapshot is
     * in the same region as the copy, specify a valid DB snapshot
     * identifier.</li> <li>If the source snapshot is in a different region
     * than the copy, specify a valid DB snapshot ARN. For more information,
     * go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-04-02-00-01</code> <p>Example:
     * <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *
     * @return The identifier for the source DB snapshot. <p>If you are copying from
     *         a shared manual DB snapshot, this must be the ARN of the shared DB
     *         snapshot. <p>Constraints: <ul> <li>Must specify a valid system
     *         snapshot in the "available" state.</li> <li>If the source snapshot is
     *         in the same region as the copy, specify a valid DB snapshot
     *         identifier.</li> <li>If the source snapshot is in a different region
     *         than the copy, specify a valid DB snapshot ARN. For more information,
     *         go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     *         Copying a DB Snapshot</a>.</li> </ul> <p>Example:
     *         <code>rds:mydb-2012-04-02-00-01</code> <p>Example:
     *         <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     */
    public String getSourceDBSnapshotIdentifier() {
        return sourceDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the source DB snapshot. <p>If you are copying from
     * a shared manual DB snapshot, this must be the ARN of the shared DB
     * snapshot. <p>Constraints: <ul> <li>Must specify a valid system
     * snapshot in the "available" state.</li> <li>If the source snapshot is
     * in the same region as the copy, specify a valid DB snapshot
     * identifier.</li> <li>If the source snapshot is in a different region
     * than the copy, specify a valid DB snapshot ARN. For more information,
     * go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-04-02-00-01</code> <p>Example:
     * <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *
     * @param sourceDBSnapshotIdentifier The identifier for the source DB snapshot. <p>If you are copying from
     *         a shared manual DB snapshot, this must be the ARN of the shared DB
     *         snapshot. <p>Constraints: <ul> <li>Must specify a valid system
     *         snapshot in the "available" state.</li> <li>If the source snapshot is
     *         in the same region as the copy, specify a valid DB snapshot
     *         identifier.</li> <li>If the source snapshot is in a different region
     *         than the copy, specify a valid DB snapshot ARN. For more information,
     *         go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     *         Copying a DB Snapshot</a>.</li> </ul> <p>Example:
     *         <code>rds:mydb-2012-04-02-00-01</code> <p>Example:
     *         <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     */
    public void setSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the source DB snapshot. <p>If you are copying from
     * a shared manual DB snapshot, this must be the ARN of the shared DB
     * snapshot. <p>Constraints: <ul> <li>Must specify a valid system
     * snapshot in the "available" state.</li> <li>If the source snapshot is
     * in the same region as the copy, specify a valid DB snapshot
     * identifier.</li> <li>If the source snapshot is in a different region
     * than the copy, specify a valid DB snapshot ARN. For more information,
     * go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     * Copying a DB Snapshot</a>.</li> </ul> <p>Example:
     * <code>rds:mydb-2012-04-02-00-01</code> <p>Example:
     * <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBSnapshotIdentifier The identifier for the source DB snapshot. <p>If you are copying from
     *         a shared manual DB snapshot, this must be the ARN of the shared DB
     *         snapshot. <p>Constraints: <ul> <li>Must specify a valid system
     *         snapshot in the "available" state.</li> <li>If the source snapshot is
     *         in the same region as the copy, specify a valid DB snapshot
     *         identifier.</li> <li>If the source snapshot is in a different region
     *         than the copy, specify a valid DB snapshot ARN. For more information,
     *         go to <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html">
     *         Copying a DB Snapshot</a>.</li> </ul> <p>Example:
     *         <code>rds:mydb-2012-04-02-00-01</code> <p>Example:
     *         <code>arn:aws:rds:rr-regn-1:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBSnapshotRequest withSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
        return this;
    }

    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     *
     * @return The identifier for the copied snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     */
    public String getTargetDBSnapshotIdentifier() {
        return targetDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     *
     * @param targetDBSnapshotIdentifier The identifier for the copied snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     */
    public void setTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        this.targetDBSnapshotIdentifier = targetDBSnapshotIdentifier;
    }
    
    /**
     * The identifier for the copied snapshot. <p>Constraints: <ul>
     * <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     * 255 alphanumeric characters or hyphens</li> <li>First character must
     * be a letter</li> <li>Cannot end with a hyphen or contain two
     * consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param targetDBSnapshotIdentifier The identifier for the copied snapshot. <p>Constraints: <ul>
     *         <li>Cannot be null, empty, or blank</li> <li>Must contain from 1 to
     *         255 alphanumeric characters or hyphens</li> <li>First character must
     *         be a letter</li> <li>Cannot end with a hyphen or contain two
     *         consecutive hyphens</li> </ul> <p>Example: <code>my-db-snapshot</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBSnapshotRequest withTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        this.targetDBSnapshotIdentifier = targetDBSnapshotIdentifier;
        return this;
    }

    /**
     * The AWS Key Management Service (AWS KMS) key identifier for an
     * encrypted DB snapshot. The KMS key identifier is the Amazon Resource
     * Name (ARN) or the KMS key alias for the KMS encryption key. <p>If you
     * copy an unencrypted DB snapshot and specify a value for the
     * <code>KmsKeyId</code> parameter, Amazon RDS encrypts the target DB
     * snapshot using the specified KMS encryption key. <p>If you copy an
     * encrypted DB snapshot from your AWS account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * then the copy of the DB snapshot is encrypted with the same KMS key as
     * the source DB snapshot. <p>If you copy an encrypted DB snapshot that
     * is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     *
     * @return The AWS Key Management Service (AWS KMS) key identifier for an
     *         encrypted DB snapshot. The KMS key identifier is the Amazon Resource
     *         Name (ARN) or the KMS key alias for the KMS encryption key. <p>If you
     *         copy an unencrypted DB snapshot and specify a value for the
     *         <code>KmsKeyId</code> parameter, Amazon RDS encrypts the target DB
     *         snapshot using the specified KMS encryption key. <p>If you copy an
     *         encrypted DB snapshot from your AWS account, you can specify a value
     *         for <code>KmsKeyId</code> to encrypt the copy with a new KMS
     *         encryption key. If you don't specify a value for <code>KmsKeyId</code>
     *         then the copy of the DB snapshot is encrypted with the same KMS key as
     *         the source DB snapshot. <p>If you copy an encrypted DB snapshot that
     *         is shared from another AWS account, then you must specify a value for
     *         <code>KmsKeyId</code>.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The AWS Key Management Service (AWS KMS) key identifier for an
     * encrypted DB snapshot. The KMS key identifier is the Amazon Resource
     * Name (ARN) or the KMS key alias for the KMS encryption key. <p>If you
     * copy an unencrypted DB snapshot and specify a value for the
     * <code>KmsKeyId</code> parameter, Amazon RDS encrypts the target DB
     * snapshot using the specified KMS encryption key. <p>If you copy an
     * encrypted DB snapshot from your AWS account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * then the copy of the DB snapshot is encrypted with the same KMS key as
     * the source DB snapshot. <p>If you copy an encrypted DB snapshot that
     * is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     *
     * @param kmsKeyId The AWS Key Management Service (AWS KMS) key identifier for an
     *         encrypted DB snapshot. The KMS key identifier is the Amazon Resource
     *         Name (ARN) or the KMS key alias for the KMS encryption key. <p>If you
     *         copy an unencrypted DB snapshot and specify a value for the
     *         <code>KmsKeyId</code> parameter, Amazon RDS encrypts the target DB
     *         snapshot using the specified KMS encryption key. <p>If you copy an
     *         encrypted DB snapshot from your AWS account, you can specify a value
     *         for <code>KmsKeyId</code> to encrypt the copy with a new KMS
     *         encryption key. If you don't specify a value for <code>KmsKeyId</code>
     *         then the copy of the DB snapshot is encrypted with the same KMS key as
     *         the source DB snapshot. <p>If you copy an encrypted DB snapshot that
     *         is shared from another AWS account, then you must specify a value for
     *         <code>KmsKeyId</code>.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The AWS Key Management Service (AWS KMS) key identifier for an
     * encrypted DB snapshot. The KMS key identifier is the Amazon Resource
     * Name (ARN) or the KMS key alias for the KMS encryption key. <p>If you
     * copy an unencrypted DB snapshot and specify a value for the
     * <code>KmsKeyId</code> parameter, Amazon RDS encrypts the target DB
     * snapshot using the specified KMS encryption key. <p>If you copy an
     * encrypted DB snapshot from your AWS account, you can specify a value
     * for <code>KmsKeyId</code> to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for <code>KmsKeyId</code>
     * then the copy of the DB snapshot is encrypted with the same KMS key as
     * the source DB snapshot. <p>If you copy an encrypted DB snapshot that
     * is shared from another AWS account, then you must specify a value for
     * <code>KmsKeyId</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The AWS Key Management Service (AWS KMS) key identifier for an
     *         encrypted DB snapshot. The KMS key identifier is the Amazon Resource
     *         Name (ARN) or the KMS key alias for the KMS encryption key. <p>If you
     *         copy an unencrypted DB snapshot and specify a value for the
     *         <code>KmsKeyId</code> parameter, Amazon RDS encrypts the target DB
     *         snapshot using the specified KMS encryption key. <p>If you copy an
     *         encrypted DB snapshot from your AWS account, you can specify a value
     *         for <code>KmsKeyId</code> to encrypt the copy with a new KMS
     *         encryption key. If you don't specify a value for <code>KmsKeyId</code>
     *         then the copy of the DB snapshot is encrypted with the same KMS key as
     *         the source DB snapshot. <p>If you copy an encrypted DB snapshot that
     *         is shared from another AWS account, then you must specify a value for
     *         <code>KmsKeyId</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBSnapshotRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * True to copy all tags from the source DB snapshot to the target DB
     * snapshot; otherwise false. The default is false.
     *
     * @return True to copy all tags from the source DB snapshot to the target DB
     *         snapshot; otherwise false. The default is false.
     */
    public Boolean isCopyTags() {
        return copyTags;
    }
    
    /**
     * True to copy all tags from the source DB snapshot to the target DB
     * snapshot; otherwise false. The default is false.
     *
     * @param copyTags True to copy all tags from the source DB snapshot to the target DB
     *         snapshot; otherwise false. The default is false.
     */
    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }
    
    /**
     * True to copy all tags from the source DB snapshot to the target DB
     * snapshot; otherwise false. The default is false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param copyTags True to copy all tags from the source DB snapshot to the target DB
     *         snapshot; otherwise false. The default is false.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CopyDBSnapshotRequest withCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
        return this;
    }

    /**
     * True to copy all tags from the source DB snapshot to the target DB
     * snapshot; otherwise false. The default is false.
     *
     * @return True to copy all tags from the source DB snapshot to the target DB
     *         snapshot; otherwise false. The default is false.
     */
    public Boolean getCopyTags() {
        return copyTags;
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
        if (getSourceDBSnapshotIdentifier() != null) sb.append("SourceDBSnapshotIdentifier: " + getSourceDBSnapshotIdentifier() + ",");
        if (getTargetDBSnapshotIdentifier() != null) sb.append("TargetDBSnapshotIdentifier: " + getTargetDBSnapshotIdentifier() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (isCopyTags() != null) sb.append("CopyTags: " + isCopyTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSourceDBSnapshotIdentifier() == null) ? 0 : getSourceDBSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getTargetDBSnapshotIdentifier() == null) ? 0 : getTargetDBSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((isCopyTags() == null) ? 0 : isCopyTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CopyDBSnapshotRequest == false) return false;
        CopyDBSnapshotRequest other = (CopyDBSnapshotRequest)obj;
        
        if (other.getSourceDBSnapshotIdentifier() == null ^ this.getSourceDBSnapshotIdentifier() == null) return false;
        if (other.getSourceDBSnapshotIdentifier() != null && other.getSourceDBSnapshotIdentifier().equals(this.getSourceDBSnapshotIdentifier()) == false) return false; 
        if (other.getTargetDBSnapshotIdentifier() == null ^ this.getTargetDBSnapshotIdentifier() == null) return false;
        if (other.getTargetDBSnapshotIdentifier() != null && other.getTargetDBSnapshotIdentifier().equals(this.getTargetDBSnapshotIdentifier()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.isCopyTags() == null ^ this.isCopyTags() == null) return false;
        if (other.isCopyTags() != null && other.isCopyTags().equals(this.isCopyTags()) == false) return false; 
        return true;
    }
    
    @Override
    public CopyDBSnapshotRequest clone() {
        
            return (CopyDBSnapshotRequest) super.clone();
    }

}
    