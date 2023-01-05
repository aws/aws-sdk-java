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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/DescribeSecret" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSecretResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The name of the secret.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the secret.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the secret is
     * encrypted with the Amazon Web Services managed key <code>aws/secretsmanager</code>, this field is omitted.
     * Secrets created using the console use an KMS key ID.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies whether automatic rotation is turned on for this secret.
     * </p>
     * <p>
     * To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     * </p>
     */
    private Boolean rotationEnabled;
    /**
     * <p>
     * The ARN of the Lambda function that Secrets Manager invokes to rotate the secret.
     * </p>
     */
    private String rotationLambdaARN;
    /**
     * <p>
     * The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned on, but
     * it is now turned off, this field shows the previous rotation schedule and rotation function. If the secret never
     * had rotation turned on, this field is omitted.
     * </p>
     */
    private RotationRulesType rotationRules;
    /**
     * <p>
     * The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for rotation,
     * Secrets Manager returns null.
     * </p>
     */
    private java.util.Date lastRotatedDate;
    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     */
    private java.util.Date lastChangedDate;
    /**
     * <p>
     * The date that the secret was last accessed in the Region. This field is omitted if the secret has never been
     * retrieved in the Region.
     * </p>
     */
    private java.util.Date lastAccessedDate;
    /**
     * <p>
     * The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is omitted. When
     * you delete a secret, Secrets Manager requires a recovery window of at least 7 days before deleting the secret.
     * Some time after the deleted date, Secrets Manager deletes the secret, including all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not accessible.
     * To cancel a scheduled deletion and restore access to the secret, use <a>RestoreSecret</a>.
     * </p>
     */
    private java.util.Date deletedDate;

    private java.util.Date nextRotationDate;
    /**
     * <p>
     * The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use
     * <a>UntagResource</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A list of the versions of the secret that have staging labels attached. Versions that don't have staging labels
     * are considered deprecated and Secrets Manager can delete them.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three staging
     * labels for rotation are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWSCURRENT</code>, which indicates the current version of the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPENDING</code>, which indicates the version of the secret that contains new secret information that will
     * become the next current version when rotation finishes.
     * </p>
     * <p>
     * During rotation, Secrets Manager creates an <code>AWSPENDING</code> version ID before creating the new secret
     * version. To check if a secret version exists, call <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPREVIOUS</code>, which indicates the previous current version of the secret. You can use this as the
     * <i>last known good</i> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotation and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> versionIdsToStages;
    /**
     * <p>
     * The ID of the service that created this secret. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets managed by
     * other Amazon Web Services services</a>.
     * </p>
     */
    private String owningService;
    /**
     * <p>
     * The date the secret was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in
     * <code>ReplicationStatus</code>.
     * </p>
     */
    private String primaryRegion;
    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ReplicationStatusType> replicationStatus;

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @return The ARN of the secret.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The ARN of the secret.
     * </p>
     * 
     * @param aRN
     *        The ARN of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @param name
     *        The name of the secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @return The name of the secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the secret.
     * </p>
     * 
     * @param name
     *        The name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the secret.
     * </p>
     * 
     * @param description
     *        The description of the secret.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the secret.
     * </p>
     * 
     * @return The description of the secret.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the secret.
     * </p>
     * 
     * @param description
     *        The description of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the secret is
     * encrypted with the Amazon Web Services managed key <code>aws/secretsmanager</code>, this field is omitted.
     * Secrets created using the console use an KMS key ID.
     * </p>
     * 
     * @param kmsKeyId
     *        The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the
     *        secret is encrypted with the Amazon Web Services managed key <code>aws/secretsmanager</code>, this field
     *        is omitted. Secrets created using the console use an KMS key ID.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the secret is
     * encrypted with the Amazon Web Services managed key <code>aws/secretsmanager</code>, this field is omitted.
     * Secrets created using the console use an KMS key ID.
     * </p>
     * 
     * @return The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the
     *         secret is encrypted with the Amazon Web Services managed key <code>aws/secretsmanager</code>, this field
     *         is omitted. Secrets created using the console use an KMS key ID.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the secret is
     * encrypted with the Amazon Web Services managed key <code>aws/secretsmanager</code>, this field is omitted.
     * Secrets created using the console use an KMS key ID.
     * </p>
     * 
     * @param kmsKeyId
     *        The key ID or alias ARN of the KMS key that Secrets Manager uses to encrypt the secret value. If the
     *        secret is encrypted with the Amazon Web Services managed key <code>aws/secretsmanager</code>, this field
     *        is omitted. Secrets created using the console use an KMS key ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is turned on for this secret.
     * </p>
     * <p>
     * To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @param rotationEnabled
     *        Specifies whether automatic rotation is turned on for this secret.</p>
     *        <p>
     *        To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     */

    public void setRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is turned on for this secret.
     * </p>
     * <p>
     * To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @return Specifies whether automatic rotation is turned on for this secret.</p>
     *         <p>
     *         To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     */

    public Boolean getRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is turned on for this secret.
     * </p>
     * <p>
     * To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @param rotationEnabled
     *        Specifies whether automatic rotation is turned on for this secret.</p>
     *        <p>
     *        To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withRotationEnabled(Boolean rotationEnabled) {
        setRotationEnabled(rotationEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is turned on for this secret.
     * </p>
     * <p>
     * To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @return Specifies whether automatic rotation is turned on for this secret.</p>
     *         <p>
     *         To turn on rotation, use <a>RotateSecret</a>. To turn off rotation, use <a>CancelRotateSecret</a>.
     */

    public Boolean isRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * The ARN of the Lambda function that Secrets Manager invokes to rotate the secret.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of the Lambda function that Secrets Manager invokes to rotate the secret.
     */

    public void setRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function that Secrets Manager invokes to rotate the secret.
     * </p>
     * 
     * @return The ARN of the Lambda function that Secrets Manager invokes to rotate the secret.
     */

    public String getRotationLambdaARN() {
        return this.rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of the Lambda function that Secrets Manager invokes to rotate the secret.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of the Lambda function that Secrets Manager invokes to rotate the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withRotationLambdaARN(String rotationLambdaARN) {
        setRotationLambdaARN(rotationLambdaARN);
        return this;
    }

    /**
     * <p>
     * The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned on, but
     * it is now turned off, this field shows the previous rotation schedule and rotation function. If the secret never
     * had rotation turned on, this field is omitted.
     * </p>
     * 
     * @param rotationRules
     *        The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned
     *        on, but it is now turned off, this field shows the previous rotation schedule and rotation function. If
     *        the secret never had rotation turned on, this field is omitted.
     */

    public void setRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
    }

    /**
     * <p>
     * The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned on, but
     * it is now turned off, this field shows the previous rotation schedule and rotation function. If the secret never
     * had rotation turned on, this field is omitted.
     * </p>
     * 
     * @return The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned
     *         on, but it is now turned off, this field shows the previous rotation schedule and rotation function. If
     *         the secret never had rotation turned on, this field is omitted.
     */

    public RotationRulesType getRotationRules() {
        return this.rotationRules;
    }

    /**
     * <p>
     * The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned on, but
     * it is now turned off, this field shows the previous rotation schedule and rotation function. If the secret never
     * had rotation turned on, this field is omitted.
     * </p>
     * 
     * @param rotationRules
     *        The rotation schedule and Lambda function for this secret. If the secret previously had rotation turned
     *        on, but it is now turned off, this field shows the previous rotation schedule and rotation function. If
     *        the secret never had rotation turned on, this field is omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withRotationRules(RotationRulesType rotationRules) {
        setRotationRules(rotationRules);
        return this;
    }

    /**
     * <p>
     * The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for rotation,
     * Secrets Manager returns null.
     * </p>
     * 
     * @param lastRotatedDate
     *        The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for
     *        rotation, Secrets Manager returns null.
     */

    public void setLastRotatedDate(java.util.Date lastRotatedDate) {
        this.lastRotatedDate = lastRotatedDate;
    }

    /**
     * <p>
     * The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for rotation,
     * Secrets Manager returns null.
     * </p>
     * 
     * @return The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for
     *         rotation, Secrets Manager returns null.
     */

    public java.util.Date getLastRotatedDate() {
        return this.lastRotatedDate;
    }

    /**
     * <p>
     * The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for rotation,
     * Secrets Manager returns null.
     * </p>
     * 
     * @param lastRotatedDate
     *        The last date and time that Secrets Manager rotated the secret. If the secret isn't configured for
     *        rotation, Secrets Manager returns null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withLastRotatedDate(java.util.Date lastRotatedDate) {
        setLastRotatedDate(lastRotatedDate);
        return this;
    }

    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     * 
     * @param lastChangedDate
     *        The last date and time that this secret was modified in any way.
     */

    public void setLastChangedDate(java.util.Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     * 
     * @return The last date and time that this secret was modified in any way.
     */

    public java.util.Date getLastChangedDate() {
        return this.lastChangedDate;
    }

    /**
     * <p>
     * The last date and time that this secret was modified in any way.
     * </p>
     * 
     * @param lastChangedDate
     *        The last date and time that this secret was modified in any way.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withLastChangedDate(java.util.Date lastChangedDate) {
        setLastChangedDate(lastChangedDate);
        return this;
    }

    /**
     * <p>
     * The date that the secret was last accessed in the Region. This field is omitted if the secret has never been
     * retrieved in the Region.
     * </p>
     * 
     * @param lastAccessedDate
     *        The date that the secret was last accessed in the Region. This field is omitted if the secret has never
     *        been retrieved in the Region.
     */

    public void setLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
    }

    /**
     * <p>
     * The date that the secret was last accessed in the Region. This field is omitted if the secret has never been
     * retrieved in the Region.
     * </p>
     * 
     * @return The date that the secret was last accessed in the Region. This field is omitted if the secret has never
     *         been retrieved in the Region.
     */

    public java.util.Date getLastAccessedDate() {
        return this.lastAccessedDate;
    }

    /**
     * <p>
     * The date that the secret was last accessed in the Region. This field is omitted if the secret has never been
     * retrieved in the Region.
     * </p>
     * 
     * @param lastAccessedDate
     *        The date that the secret was last accessed in the Region. This field is omitted if the secret has never
     *        been retrieved in the Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withLastAccessedDate(java.util.Date lastAccessedDate) {
        setLastAccessedDate(lastAccessedDate);
        return this;
    }

    /**
     * <p>
     * The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is omitted. When
     * you delete a secret, Secrets Manager requires a recovery window of at least 7 days before deleting the secret.
     * Some time after the deleted date, Secrets Manager deletes the secret, including all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not accessible.
     * To cancel a scheduled deletion and restore access to the secret, use <a>RestoreSecret</a>.
     * </p>
     * 
     * @param deletedDate
     *        The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is omitted.
     *        When you delete a secret, Secrets Manager requires a recovery window of at least 7 days before deleting
     *        the secret. Some time after the deleted date, Secrets Manager deletes the secret, including all of its
     *        versions.</p>
     *        <p>
     *        If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not
     *        accessible. To cancel a scheduled deletion and restore access to the secret, use <a>RestoreSecret</a>.
     */

    public void setDeletedDate(java.util.Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    /**
     * <p>
     * The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is omitted. When
     * you delete a secret, Secrets Manager requires a recovery window of at least 7 days before deleting the secret.
     * Some time after the deleted date, Secrets Manager deletes the secret, including all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not accessible.
     * To cancel a scheduled deletion and restore access to the secret, use <a>RestoreSecret</a>.
     * </p>
     * 
     * @return The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is
     *         omitted. When you delete a secret, Secrets Manager requires a recovery window of at least 7 days before
     *         deleting the secret. Some time after the deleted date, Secrets Manager deletes the secret, including all
     *         of its versions.</p>
     *         <p>
     *         If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not
     *         accessible. To cancel a scheduled deletion and restore access to the secret, use <a>RestoreSecret</a>.
     */

    public java.util.Date getDeletedDate() {
        return this.deletedDate;
    }

    /**
     * <p>
     * The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is omitted. When
     * you delete a secret, Secrets Manager requires a recovery window of at least 7 days before deleting the secret.
     * Some time after the deleted date, Secrets Manager deletes the secret, including all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not accessible.
     * To cancel a scheduled deletion and restore access to the secret, use <a>RestoreSecret</a>.
     * </p>
     * 
     * @param deletedDate
     *        The date the secret is scheduled for deletion. If it is not scheduled for deletion, this field is omitted.
     *        When you delete a secret, Secrets Manager requires a recovery window of at least 7 days before deleting
     *        the secret. Some time after the deleted date, Secrets Manager deletes the secret, including all of its
     *        versions.</p>
     *        <p>
     *        If a secret is scheduled for deletion, then its details, including the encrypted secret value, is not
     *        accessible. To cancel a scheduled deletion and restore access to the secret, use <a>RestoreSecret</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withDeletedDate(java.util.Date deletedDate) {
        setDeletedDate(deletedDate);
        return this;
    }

    /**
     * @param nextRotationDate
     */

    public void setNextRotationDate(java.util.Date nextRotationDate) {
        this.nextRotationDate = nextRotationDate;
    }

    /**
     * @return
     */

    public java.util.Date getNextRotationDate() {
        return this.nextRotationDate;
    }

    /**
     * @param nextRotationDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withNextRotationDate(java.util.Date nextRotationDate) {
        setNextRotationDate(nextRotationDate);
        return this;
    }

    /**
     * <p>
     * The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use
     * <a>UntagResource</a>.
     * </p>
     * 
     * @return The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags,
     *         use <a>UntagResource</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use
     * <a>UntagResource</a>.
     * </p>
     * 
     * @param tags
     *        The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags,
     *        use <a>UntagResource</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use
     * <a>UntagResource</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags,
     *        use <a>UntagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags, use
     * <a>UntagResource</a>.
     * </p>
     * 
     * @param tags
     *        The list of tags attached to the secret. To add tags to a secret, use <a>TagResource</a>. To remove tags,
     *        use <a>UntagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of the versions of the secret that have staging labels attached. Versions that don't have staging labels
     * are considered deprecated and Secrets Manager can delete them.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three staging
     * labels for rotation are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWSCURRENT</code>, which indicates the current version of the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPENDING</code>, which indicates the version of the secret that contains new secret information that will
     * become the next current version when rotation finishes.
     * </p>
     * <p>
     * During rotation, Secrets Manager creates an <code>AWSPENDING</code> version ID before creating the new secret
     * version. To check if a secret version exists, call <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPREVIOUS</code>, which indicates the previous current version of the secret. You can use this as the
     * <i>last known good</i> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotation and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     * 
     * @return A list of the versions of the secret that have staging labels attached. Versions that don't have staging
     *         labels are considered deprecated and Secrets Manager can delete them.</p>
     *         <p>
     *         Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three
     *         staging labels for rotation are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWSCURRENT</code>, which indicates the current version of the secret.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWSPENDING</code>, which indicates the version of the secret that contains new secret information
     *         that will become the next current version when rotation finishes.
     *         </p>
     *         <p>
     *         During rotation, Secrets Manager creates an <code>AWSPENDING</code> version ID before creating the new
     *         secret version. To check if a secret version exists, call <a>GetSecretValue</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWSPREVIOUS</code>, which indicates the previous current version of the secret. You can use this as
     *         the <i>last known good</i> version.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about rotation and staging labels, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     *         works</a>.
     */

    public java.util.Map<String, java.util.List<String>> getVersionIdsToStages() {
        return versionIdsToStages;
    }

    /**
     * <p>
     * A list of the versions of the secret that have staging labels attached. Versions that don't have staging labels
     * are considered deprecated and Secrets Manager can delete them.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three staging
     * labels for rotation are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWSCURRENT</code>, which indicates the current version of the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPENDING</code>, which indicates the version of the secret that contains new secret information that will
     * become the next current version when rotation finishes.
     * </p>
     * <p>
     * During rotation, Secrets Manager creates an <code>AWSPENDING</code> version ID before creating the new secret
     * version. To check if a secret version exists, call <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPREVIOUS</code>, which indicates the previous current version of the secret. You can use this as the
     * <i>last known good</i> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotation and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     * 
     * @param versionIdsToStages
     *        A list of the versions of the secret that have staging labels attached. Versions that don't have staging
     *        labels are considered deprecated and Secrets Manager can delete them.</p>
     *        <p>
     *        Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three
     *        staging labels for rotation are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWSCURRENT</code>, which indicates the current version of the secret.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWSPENDING</code>, which indicates the version of the secret that contains new secret information
     *        that will become the next current version when rotation finishes.
     *        </p>
     *        <p>
     *        During rotation, Secrets Manager creates an <code>AWSPENDING</code> version ID before creating the new
     *        secret version. To check if a secret version exists, call <a>GetSecretValue</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWSPREVIOUS</code>, which indicates the previous current version of the secret. You can use this as
     *        the <i>last known good</i> version.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about rotation and staging labels, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     *        works</a>.
     */

    public void setVersionIdsToStages(java.util.Map<String, java.util.List<String>> versionIdsToStages) {
        this.versionIdsToStages = versionIdsToStages;
    }

    /**
     * <p>
     * A list of the versions of the secret that have staging labels attached. Versions that don't have staging labels
     * are considered deprecated and Secrets Manager can delete them.
     * </p>
     * <p>
     * Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three staging
     * labels for rotation are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWSCURRENT</code>, which indicates the current version of the secret.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPENDING</code>, which indicates the version of the secret that contains new secret information that will
     * become the next current version when rotation finishes.
     * </p>
     * <p>
     * During rotation, Secrets Manager creates an <code>AWSPENDING</code> version ID before creating the new secret
     * version. To check if a secret version exists, call <a>GetSecretValue</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWSPREVIOUS</code>, which indicates the previous current version of the secret. You can use this as the
     * <i>last known good</i> version.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about rotation and staging labels, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     * works</a>.
     * </p>
     * 
     * @param versionIdsToStages
     *        A list of the versions of the secret that have staging labels attached. Versions that don't have staging
     *        labels are considered deprecated and Secrets Manager can delete them.</p>
     *        <p>
     *        Secrets Manager uses staging labels to indicate the status of a secret version during rotation. The three
     *        staging labels for rotation are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWSCURRENT</code>, which indicates the current version of the secret.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWSPENDING</code>, which indicates the version of the secret that contains new secret information
     *        that will become the next current version when rotation finishes.
     *        </p>
     *        <p>
     *        During rotation, Secrets Manager creates an <code>AWSPENDING</code> version ID before creating the new
     *        secret version. To check if a secret version exists, call <a>GetSecretValue</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWSPREVIOUS</code>, which indicates the previous current version of the secret. You can use this as
     *        the <i>last known good</i> version.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about rotation and staging labels, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/rotate-secrets_how.html">How rotation
     *        works</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withVersionIdsToStages(java.util.Map<String, java.util.List<String>> versionIdsToStages) {
        setVersionIdsToStages(versionIdsToStages);
        return this;
    }

    /**
     * Add a single VersionIdsToStages entry
     *
     * @see DescribeSecretResult#withVersionIdsToStages
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult addVersionIdsToStagesEntry(String key, java.util.List<String> value) {
        if (null == this.versionIdsToStages) {
            this.versionIdsToStages = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.versionIdsToStages.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.versionIdsToStages.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into VersionIdsToStages.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult clearVersionIdsToStagesEntries() {
        this.versionIdsToStages = null;
        return this;
    }

    /**
     * <p>
     * The ID of the service that created this secret. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets managed by
     * other Amazon Web Services services</a>.
     * </p>
     * 
     * @param owningService
     *        The ID of the service that created this secret. For more information, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *        managed by other Amazon Web Services services</a>.
     */

    public void setOwningService(String owningService) {
        this.owningService = owningService;
    }

    /**
     * <p>
     * The ID of the service that created this secret. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets managed by
     * other Amazon Web Services services</a>.
     * </p>
     * 
     * @return The ID of the service that created this secret. For more information, see <a
     *         href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *         managed by other Amazon Web Services services</a>.
     */

    public String getOwningService() {
        return this.owningService;
    }

    /**
     * <p>
     * The ID of the service that created this secret. For more information, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets managed by
     * other Amazon Web Services services</a>.
     * </p>
     * 
     * @param owningService
     *        The ID of the service that created this secret. For more information, see <a
     *        href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/service-linked-secrets.html">Secrets
     *        managed by other Amazon Web Services services</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withOwningService(String owningService) {
        setOwningService(owningService);
        return this;
    }

    /**
     * <p>
     * The date the secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date the secret was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date the secret was created.
     * </p>
     * 
     * @return The date the secret was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date the secret was created.
     * </p>
     * 
     * @param createdDate
     *        The date the secret was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in
     * <code>ReplicationStatus</code>.
     * </p>
     * 
     * @param primaryRegion
     *        The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in
     *        <code>ReplicationStatus</code>.
     */

    public void setPrimaryRegion(String primaryRegion) {
        this.primaryRegion = primaryRegion;
    }

    /**
     * <p>
     * The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in
     * <code>ReplicationStatus</code>.
     * </p>
     * 
     * @return The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in
     *         <code>ReplicationStatus</code>.
     */

    public String getPrimaryRegion() {
        return this.primaryRegion;
    }

    /**
     * <p>
     * The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in
     * <code>ReplicationStatus</code>.
     * </p>
     * 
     * @param primaryRegion
     *        The Region the secret is in. If a secret is replicated to other Regions, the replicas are listed in
     *        <code>ReplicationStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withPrimaryRegion(String primaryRegion) {
        setPrimaryRegion(primaryRegion);
        return this;
    }

    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of the replicas of this secret and their status: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Failed</code>, which indicates that the replica was not created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>InSync</code>, which indicates that the replica was created.
     *         </p>
     *         </li>
     */

    public java.util.List<ReplicationStatusType> getReplicationStatus() {
        return replicationStatus;
    }

    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationStatus
     *        A list of the replicas of this secret and their status: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code>, which indicates that the replica was not created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InSync</code>, which indicates that the replica was created.
     *        </p>
     *        </li>
     */

    public void setReplicationStatus(java.util.Collection<ReplicationStatusType> replicationStatus) {
        if (replicationStatus == null) {
            this.replicationStatus = null;
            return;
        }

        this.replicationStatus = new java.util.ArrayList<ReplicationStatusType>(replicationStatus);
    }

    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationStatus(java.util.Collection)} or {@link #withReplicationStatus(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param replicationStatus
     *        A list of the replicas of this secret and their status: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code>, which indicates that the replica was not created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InSync</code>, which indicates that the replica was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withReplicationStatus(ReplicationStatusType... replicationStatus) {
        if (this.replicationStatus == null) {
            setReplicationStatus(new java.util.ArrayList<ReplicationStatusType>(replicationStatus.length));
        }
        for (ReplicationStatusType ele : replicationStatus) {
            this.replicationStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the replicas of this secret and their status:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Failed</code>, which indicates that the replica was not created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>InSync</code>, which indicates that the replica was created.
     * </p>
     * </li>
     * </ul>
     * 
     * @param replicationStatus
     *        A list of the replicas of this secret and their status: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Failed</code>, which indicates that the replica was not created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InProgress</code>, which indicates that Secrets Manager is in the process of creating the replica.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>InSync</code>, which indicates that the replica was created.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withReplicationStatus(java.util.Collection<ReplicationStatusType> replicationStatus) {
        setReplicationStatus(replicationStatus);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getRotationEnabled() != null)
            sb.append("RotationEnabled: ").append(getRotationEnabled()).append(",");
        if (getRotationLambdaARN() != null)
            sb.append("RotationLambdaARN: ").append(getRotationLambdaARN()).append(",");
        if (getRotationRules() != null)
            sb.append("RotationRules: ").append(getRotationRules()).append(",");
        if (getLastRotatedDate() != null)
            sb.append("LastRotatedDate: ").append(getLastRotatedDate()).append(",");
        if (getLastChangedDate() != null)
            sb.append("LastChangedDate: ").append(getLastChangedDate()).append(",");
        if (getLastAccessedDate() != null)
            sb.append("LastAccessedDate: ").append(getLastAccessedDate()).append(",");
        if (getDeletedDate() != null)
            sb.append("DeletedDate: ").append(getDeletedDate()).append(",");
        if (getNextRotationDate() != null)
            sb.append("NextRotationDate: ").append(getNextRotationDate()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersionIdsToStages() != null)
            sb.append("VersionIdsToStages: ").append(getVersionIdsToStages()).append(",");
        if (getOwningService() != null)
            sb.append("OwningService: ").append(getOwningService()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getPrimaryRegion() != null)
            sb.append("PrimaryRegion: ").append(getPrimaryRegion()).append(",");
        if (getReplicationStatus() != null)
            sb.append("ReplicationStatus: ").append(getReplicationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSecretResult == false)
            return false;
        DescribeSecretResult other = (DescribeSecretResult) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getRotationEnabled() == null ^ this.getRotationEnabled() == null)
            return false;
        if (other.getRotationEnabled() != null && other.getRotationEnabled().equals(this.getRotationEnabled()) == false)
            return false;
        if (other.getRotationLambdaARN() == null ^ this.getRotationLambdaARN() == null)
            return false;
        if (other.getRotationLambdaARN() != null && other.getRotationLambdaARN().equals(this.getRotationLambdaARN()) == false)
            return false;
        if (other.getRotationRules() == null ^ this.getRotationRules() == null)
            return false;
        if (other.getRotationRules() != null && other.getRotationRules().equals(this.getRotationRules()) == false)
            return false;
        if (other.getLastRotatedDate() == null ^ this.getLastRotatedDate() == null)
            return false;
        if (other.getLastRotatedDate() != null && other.getLastRotatedDate().equals(this.getLastRotatedDate()) == false)
            return false;
        if (other.getLastChangedDate() == null ^ this.getLastChangedDate() == null)
            return false;
        if (other.getLastChangedDate() != null && other.getLastChangedDate().equals(this.getLastChangedDate()) == false)
            return false;
        if (other.getLastAccessedDate() == null ^ this.getLastAccessedDate() == null)
            return false;
        if (other.getLastAccessedDate() != null && other.getLastAccessedDate().equals(this.getLastAccessedDate()) == false)
            return false;
        if (other.getDeletedDate() == null ^ this.getDeletedDate() == null)
            return false;
        if (other.getDeletedDate() != null && other.getDeletedDate().equals(this.getDeletedDate()) == false)
            return false;
        if (other.getNextRotationDate() == null ^ this.getNextRotationDate() == null)
            return false;
        if (other.getNextRotationDate() != null && other.getNextRotationDate().equals(this.getNextRotationDate()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionIdsToStages() == null ^ this.getVersionIdsToStages() == null)
            return false;
        if (other.getVersionIdsToStages() != null && other.getVersionIdsToStages().equals(this.getVersionIdsToStages()) == false)
            return false;
        if (other.getOwningService() == null ^ this.getOwningService() == null)
            return false;
        if (other.getOwningService() != null && other.getOwningService().equals(this.getOwningService()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getPrimaryRegion() == null ^ this.getPrimaryRegion() == null)
            return false;
        if (other.getPrimaryRegion() != null && other.getPrimaryRegion().equals(this.getPrimaryRegion()) == false)
            return false;
        if (other.getReplicationStatus() == null ^ this.getReplicationStatus() == null)
            return false;
        if (other.getReplicationStatus() != null && other.getReplicationStatus().equals(this.getReplicationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getRotationEnabled() == null) ? 0 : getRotationEnabled().hashCode());
        hashCode = prime * hashCode + ((getRotationLambdaARN() == null) ? 0 : getRotationLambdaARN().hashCode());
        hashCode = prime * hashCode + ((getRotationRules() == null) ? 0 : getRotationRules().hashCode());
        hashCode = prime * hashCode + ((getLastRotatedDate() == null) ? 0 : getLastRotatedDate().hashCode());
        hashCode = prime * hashCode + ((getLastChangedDate() == null) ? 0 : getLastChangedDate().hashCode());
        hashCode = prime * hashCode + ((getLastAccessedDate() == null) ? 0 : getLastAccessedDate().hashCode());
        hashCode = prime * hashCode + ((getDeletedDate() == null) ? 0 : getDeletedDate().hashCode());
        hashCode = prime * hashCode + ((getNextRotationDate() == null) ? 0 : getNextRotationDate().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionIdsToStages() == null) ? 0 : getVersionIdsToStages().hashCode());
        hashCode = prime * hashCode + ((getOwningService() == null) ? 0 : getOwningService().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getPrimaryRegion() == null) ? 0 : getPrimaryRegion().hashCode());
        hashCode = prime * hashCode + ((getReplicationStatus() == null) ? 0 : getReplicationStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSecretResult clone() {
        try {
            return (DescribeSecretResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
