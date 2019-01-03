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
     * The user-provided friendly name of the secret.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default AWS KMS CMK (the one named
     * <code>awssecretsmanager</code>) for this account.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies whether automatic rotation is enabled for this secret.
     * </p>
     * <p>
     * To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater
     * than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     * </p>
     */
    private Boolean rotationEnabled;
    /**
     * <p>
     * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the
     * schedule or manually by a call to <code>RotateSecret</code>.
     * </p>
     */
    private String rotationLambdaARN;
    /**
     * <p>
     * A structure that contains the rotation configuration for this secret.
     * </p>
     */
    private RotationRulesType rotationRules;
    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret has never rotated.
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
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     */
    private java.util.Date lastAccessedDate;
    /**
     * <p>
     * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets
     * Manager deletes the secret and all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not
     * accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.
     * </p>
     */
    private java.util.Date deletedDate;
    /**
     * <p>
     * The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     * <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code>
     * that each is attached to. Staging labels are used to keep track of the different versions during the rotation
     * process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such
     * versions are not included in this list.
     * </p>
     * </note>
     */
    private java.util.Map<String, java.util.List<String>> versionIdsToStages;

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
     * The user-provided friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The user-provided friendly name of the secret.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The user-provided friendly name of the secret.
     * </p>
     * 
     * @return The user-provided friendly name of the secret.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The user-provided friendly name of the secret.
     * </p>
     * 
     * @param name
     *        The user-provided friendly name of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @param description
     *        The user-provided description of the secret.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @return The user-provided description of the secret.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The user-provided description of the secret.
     * </p>
     * 
     * @param description
     *        The user-provided description of the secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default AWS KMS CMK (the one named
     * <code>awssecretsmanager</code>) for this account.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the
     *        <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't
     *        provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK
     *        (the one named <code>awssecretsmanager</code>) for this account.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default AWS KMS CMK (the one named
     * <code>awssecretsmanager</code>) for this account.
     * </p>
     * 
     * @return The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the
     *         <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't
     *         provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK
     *         (the one named <code>awssecretsmanager</code>) for this account.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the <code>SecretString</code> or
     * <code>SecretBinary</code> fields in each version of the secret. If you don't provide a key, then Secrets Manager
     * defaults to encrypting the secret fields with the default AWS KMS CMK (the one named
     * <code>awssecretsmanager</code>) for this account.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the
     *        <code>SecretString</code> or <code>SecretBinary</code> fields in each version of the secret. If you don't
     *        provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK
     *        (the one named <code>awssecretsmanager</code>) for this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is enabled for this secret.
     * </p>
     * <p>
     * To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater
     * than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @param rotationEnabled
     *        Specifies whether automatic rotation is enabled for this secret.</p>
     *        <p>
     *        To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value
     *        greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     */

    public void setRotationEnabled(Boolean rotationEnabled) {
        this.rotationEnabled = rotationEnabled;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is enabled for this secret.
     * </p>
     * <p>
     * To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater
     * than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @return Specifies whether automatic rotation is enabled for this secret.</p>
     *         <p>
     *         To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value
     *         greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     */

    public Boolean getRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is enabled for this secret.
     * </p>
     * <p>
     * To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater
     * than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @param rotationEnabled
     *        Specifies whether automatic rotation is enabled for this secret.</p>
     *        <p>
     *        To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value
     *        greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withRotationEnabled(Boolean rotationEnabled) {
        setRotationEnabled(rotationEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic rotation is enabled for this secret.
     * </p>
     * <p>
     * To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value greater
     * than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     * </p>
     * 
     * @return Specifies whether automatic rotation is enabled for this secret.</p>
     *         <p>
     *         To enable rotation, use <a>RotateSecret</a> with <code>AutomaticallyRotateAfterDays</code> set to a value
     *         greater than 0. To disable rotation, use <a>CancelRotateSecret</a>.
     */

    public Boolean isRotationEnabled() {
        return this.rotationEnabled;
    }

    /**
     * <p>
     * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the
     * schedule or manually by a call to <code>RotateSecret</code>.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically
     *        per the schedule or manually by a call to <code>RotateSecret</code>.
     */

    public void setRotationLambdaARN(String rotationLambdaARN) {
        this.rotationLambdaARN = rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the
     * schedule or manually by a call to <code>RotateSecret</code>.
     * </p>
     * 
     * @return The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically
     *         per the schedule or manually by a call to <code>RotateSecret</code>.
     */

    public String getRotationLambdaARN() {
        return this.rotationLambdaARN;
    }

    /**
     * <p>
     * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the
     * schedule or manually by a call to <code>RotateSecret</code>.
     * </p>
     * 
     * @param rotationLambdaARN
     *        The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically
     *        per the schedule or manually by a call to <code>RotateSecret</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withRotationLambdaARN(String rotationLambdaARN) {
        setRotationLambdaARN(rotationLambdaARN);
        return this;
    }

    /**
     * <p>
     * A structure that contains the rotation configuration for this secret.
     * </p>
     * 
     * @param rotationRules
     *        A structure that contains the rotation configuration for this secret.
     */

    public void setRotationRules(RotationRulesType rotationRules) {
        this.rotationRules = rotationRules;
    }

    /**
     * <p>
     * A structure that contains the rotation configuration for this secret.
     * </p>
     * 
     * @return A structure that contains the rotation configuration for this secret.
     */

    public RotationRulesType getRotationRules() {
        return this.rotationRules;
    }

    /**
     * <p>
     * A structure that contains the rotation configuration for this secret.
     * </p>
     * 
     * @param rotationRules
     *        A structure that contains the rotation configuration for this secret.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withRotationRules(RotationRulesType rotationRules) {
        setRotationRules(rotationRules);
        return this;
    }

    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret has never rotated.
     * </p>
     * 
     * @param lastRotatedDate
     *        The most recent date and time that the Secrets Manager rotation process was successfully completed. This
     *        value is null if the secret has never rotated.
     */

    public void setLastRotatedDate(java.util.Date lastRotatedDate) {
        this.lastRotatedDate = lastRotatedDate;
    }

    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret has never rotated.
     * </p>
     * 
     * @return The most recent date and time that the Secrets Manager rotation process was successfully completed. This
     *         value is null if the secret has never rotated.
     */

    public java.util.Date getLastRotatedDate() {
        return this.lastRotatedDate;
    }

    /**
     * <p>
     * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is
     * null if the secret has never rotated.
     * </p>
     * 
     * @param lastRotatedDate
     *        The most recent date and time that the Secrets Manager rotation process was successfully completed. This
     *        value is null if the secret has never rotated.
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
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     * 
     * @param lastAccessedDate
     *        The last date that this secret was accessed. This value is truncated to midnight of the date and therefore
     *        shows only the date, not the time.
     */

    public void setLastAccessedDate(java.util.Date lastAccessedDate) {
        this.lastAccessedDate = lastAccessedDate;
    }

    /**
     * <p>
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     * 
     * @return The last date that this secret was accessed. This value is truncated to midnight of the date and
     *         therefore shows only the date, not the time.
     */

    public java.util.Date getLastAccessedDate() {
        return this.lastAccessedDate;
    }

    /**
     * <p>
     * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows
     * only the date, not the time.
     * </p>
     * 
     * @param lastAccessedDate
     *        The last date that this secret was accessed. This value is truncated to midnight of the date and therefore
     *        shows only the date, not the time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withLastAccessedDate(java.util.Date lastAccessedDate) {
        setLastAccessedDate(lastAccessedDate);
        return this;
    }

    /**
     * <p>
     * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets
     * Manager deletes the secret and all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not
     * accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.
     * </p>
     * 
     * @param deletedDate
     *        This value exists if the secret is scheduled for deletion. Some time after the specified date and time,
     *        Secrets Manager deletes the secret and all of its versions.</p>
     *        <p>
     *        If a secret is scheduled for deletion, then its details, including the encrypted secret information, is
     *        not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.
     */

    public void setDeletedDate(java.util.Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    /**
     * <p>
     * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets
     * Manager deletes the secret and all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not
     * accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.
     * </p>
     * 
     * @return This value exists if the secret is scheduled for deletion. Some time after the specified date and time,
     *         Secrets Manager deletes the secret and all of its versions.</p>
     *         <p>
     *         If a secret is scheduled for deletion, then its details, including the encrypted secret information, is
     *         not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.
     */

    public java.util.Date getDeletedDate() {
        return this.deletedDate;
    }

    /**
     * <p>
     * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets
     * Manager deletes the secret and all of its versions.
     * </p>
     * <p>
     * If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not
     * accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.
     * </p>
     * 
     * @param deletedDate
     *        This value exists if the secret is scheduled for deletion. Some time after the specified date and time,
     *        Secrets Manager deletes the secret and all of its versions.</p>
     *        <p>
     *        If a secret is scheduled for deletion, then its details, including the encrypted secret information, is
     *        not accessible. To cancel a scheduled deletion and restore access, use <a>RestoreSecret</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withDeletedDate(java.util.Date deletedDate) {
        setDeletedDate(deletedDate);
        return this;
    }

    /**
     * <p>
     * The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     * <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     * </p>
     * 
     * @return The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     *         <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     * <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     * </p>
     * 
     * @param tags
     *        The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     *        <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
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
     * The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     * <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     *        <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
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
     * The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     * <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     * </p>
     * 
     * @param tags
     *        The list of user-defined tags that are associated with the secret. To add tags to a secret, use
     *        <a>TagResource</a>. To remove tags, use <a>UntagResource</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code>
     * that each is attached to. Staging labels are used to keep track of the different versions during the rotation
     * process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such
     * versions are not included in this list.
     * </p>
     * </note>
     * 
     * @return A list of all of the currently assigned <code>VersionStage</code> staging labels and the
     *         <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different
     *         versions during the rotation process.</p> <note>
     *         <p>
     *         A version that does not have any staging labels attached is considered deprecated and subject to
     *         deletion. Such versions are not included in this list.
     *         </p>
     */

    public java.util.Map<String, java.util.List<String>> getVersionIdsToStages() {
        return versionIdsToStages;
    }

    /**
     * <p>
     * A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code>
     * that each is attached to. Staging labels are used to keep track of the different versions during the rotation
     * process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such
     * versions are not included in this list.
     * </p>
     * </note>
     * 
     * @param versionIdsToStages
     *        A list of all of the currently assigned <code>VersionStage</code> staging labels and the
     *        <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different
     *        versions during the rotation process.</p> <note>
     *        <p>
     *        A version that does not have any staging labels attached is considered deprecated and subject to deletion.
     *        Such versions are not included in this list.
     *        </p>
     */

    public void setVersionIdsToStages(java.util.Map<String, java.util.List<String>> versionIdsToStages) {
        this.versionIdsToStages = versionIdsToStages;
    }

    /**
     * <p>
     * A list of all of the currently assigned <code>VersionStage</code> staging labels and the <code>VersionId</code>
     * that each is attached to. Staging labels are used to keep track of the different versions during the rotation
     * process.
     * </p>
     * <note>
     * <p>
     * A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such
     * versions are not included in this list.
     * </p>
     * </note>
     * 
     * @param versionIdsToStages
     *        A list of all of the currently assigned <code>VersionStage</code> staging labels and the
     *        <code>VersionId</code> that each is attached to. Staging labels are used to keep track of the different
     *        versions during the rotation process.</p> <note>
     *        <p>
     *        A version that does not have any staging labels attached is considered deprecated and subject to deletion.
     *        Such versions are not included in this list.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSecretResult withVersionIdsToStages(java.util.Map<String, java.util.List<String>> versionIdsToStages) {
        setVersionIdsToStages(versionIdsToStages);
        return this;
    }

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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVersionIdsToStages() != null)
            sb.append("VersionIdsToStages: ").append(getVersionIdsToStages());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionIdsToStages() == null ^ this.getVersionIdsToStages() == null)
            return false;
        if (other.getVersionIdsToStages() != null && other.getVersionIdsToStages().equals(this.getVersionIdsToStages()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionIdsToStages() == null) ? 0 : getVersionIdsToStages().hashCode());
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
