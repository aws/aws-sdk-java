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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/CreateFileSystem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     */
    private String creationToken;
    /**
     * <p>
     * The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for most file
     * systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of aggregate
     * throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The
     * performance mode can't be changed after the file system has been created.
     * </p>
     */
    private String performanceMode;
    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service (AWS
     * KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required if you
     * want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is used. This ID
     * can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The throughput mode for the file system to be created. There are two throughput modes to choose from for your
     * file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput
     * mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     * throughput mode change.
     * </p>
     */
    private String throughputMode;
    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The limit
     * on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information,
     * see <a href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     */
    private Double provisionedThroughputInMibps;
    /**
     * <p>
     * A value that specifies to create one or more tags associated with the file system. Each tag is a user-defined
     * key-value pair. Name your file system on creation by including a <code>"Key":"Name","Value":"{value}"</code>
     * key-value pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @param creationToken
     *        A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     */

    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @return A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     */

    public String getCreationToken() {
        return this.creationToken;
    }

    /**
     * <p>
     * A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @param creationToken
     *        A string of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withCreationToken(String creationToken) {
        setCreationToken(creationToken);
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for most file
     * systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of aggregate
     * throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The
     * performance mode can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for
     *        most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels
     *        of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most
     *        file operations. The performance mode can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for most file
     * systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of aggregate
     * throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The
     * performance mode can't be changed after the file system has been created.
     * </p>
     * 
     * @return The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for
     *         most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels
     *         of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most
     *         file operations. The performance mode can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public String getPerformanceMode() {
        return this.performanceMode;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for most file
     * systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of aggregate
     * throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The
     * performance mode can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for
     *        most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels
     *        of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most
     *        file operations. The performance mode can't be changed after the file system has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public CreateFileSystemRequest withPerformanceMode(String performanceMode) {
        setPerformanceMode(performanceMode);
        return this;
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for most file
     * systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of aggregate
     * throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The
     * performance mode can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for
     *        most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels
     *        of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most
     *        file operations. The performance mode can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public void setPerformanceMode(PerformanceMode performanceMode) {
        withPerformanceMode(performanceMode);
    }

    /**
     * <p>
     * The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for most file
     * systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of aggregate
     * throughput and operations per second with a tradeoff of slightly higher latencies for most file operations. The
     * performance mode can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The performance mode of the file system. We recommend <code>generalPurpose</code> performance mode for
     *        most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels
     *        of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most
     *        file operations. The performance mode can't be changed after the file system has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public CreateFileSystemRequest withPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service (AWS
     * KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @param encrypted
     *        A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *        you have the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     *        Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK
     *        for Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service (AWS
     * KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @return A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *         you have the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     *         Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK
     *         for Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service (AWS
     * KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @param encrypted
     *        A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *        you have the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     *        Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK
     *        for Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service (AWS
     * KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @return A Boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *         you have the option of specifying <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     *         Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK
     *         for Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required if you
     * want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is used. This ID
     * can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required
     *        if you want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is
     *        used. This ID can be in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID - A unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN - An Amazon Resource Name (ARN) for the key, for example
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias ARN - An ARN for a key alias, for example
     *        <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>KmsKeyId</code> is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set
     *        to true.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required if you
     * want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is used. This ID
     * can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     * 
     * @return The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only
     *         required if you want to use a nondefault CMK. If this parameter is not specified, the default CMK for
     *         Amazon EFS is used. This ID can be in one of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID - A unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN - An Amazon Resource Name (ARN) for the key, for example
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias ARN - An ARN for a key alias, for example
     *         <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>KmsKeyId</code> is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set
     *         to true.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required if you
     * want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is used. This ID
     * can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name (ARN) for the key, for example
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An ARN for a key alias, for example
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>KmsKeyId</code> is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS KMS CMK to be used to protect the encrypted file system. This parameter is only required
     *        if you want to use a nondefault CMK. If this parameter is not specified, the default CMK for Amazon EFS is
     *        used. This ID can be in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID - A unique identifier of the key, for example <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN - An Amazon Resource Name (ARN) for the key, for example
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias - A previously created display name for a key, for example <code>alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias ARN - An ARN for a key alias, for example
     *        <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>KmsKeyId</code> is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set
     *        to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two throughput modes to choose from for your
     * file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput
     * mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     * throughput mode change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for the file system to be created. There are two throughput modes to choose from for
     *        your file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned
     *        Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the
     *        last decrease or throughput mode change.
     * @see ThroughputMode
     */

    public void setThroughputMode(String throughputMode) {
        this.throughputMode = throughputMode;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two throughput modes to choose from for your
     * file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput
     * mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     * throughput mode change.
     * </p>
     * 
     * @return The throughput mode for the file system to be created. There are two throughput modes to choose from for
     *         your file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned
     *         Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the
     *         last decrease or throughput mode change.
     * @see ThroughputMode
     */

    public String getThroughputMode() {
        return this.throughputMode;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two throughput modes to choose from for your
     * file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput
     * mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     * throughput mode change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for the file system to be created. There are two throughput modes to choose from for
     *        your file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned
     *        Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the
     *        last decrease or throughput mode change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public CreateFileSystemRequest withThroughputMode(String throughputMode) {
        setThroughputMode(throughputMode);
        return this;
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two throughput modes to choose from for your
     * file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput
     * mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     * throughput mode change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for the file system to be created. There are two throughput modes to choose from for
     *        your file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned
     *        Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the
     *        last decrease or throughput mode change.
     * @see ThroughputMode
     */

    public void setThroughputMode(ThroughputMode throughputMode) {
        withThroughputMode(throughputMode);
    }

    /**
     * <p>
     * The throughput mode for the file system to be created. There are two throughput modes to choose from for your
     * file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned Throughput
     * mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or
     * throughput mode change.
     * </p>
     * 
     * @param throughputMode
     *        The throughput mode for the file system to be created. There are two throughput modes to choose from for
     *        your file system: bursting and provisioned. You can decrease your file system's throughput in Provisioned
     *        Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the
     *        last decrease or throughput mode change.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThroughputMode
     */

    public CreateFileSystemRequest withThroughputMode(ThroughputMode throughputMode) {
        this.throughputMode = throughputMode.toString();
        return this;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The limit
     * on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information,
     * see <a href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The
     *        limit on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more
     *        information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS
     *        Limits That You Can Increase</a> in the <i>Amazon EFS User Guide.</i>
     */

    public void setProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        this.provisionedThroughputInMibps = provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The limit
     * on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information,
     * see <a href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     * 
     * @return The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The
     *         limit on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more
     *         information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS
     *         Limits That You Can Increase</a> in the <i>Amazon EFS User Guide.</i>
     */

    public Double getProvisionedThroughputInMibps() {
        return this.provisionedThroughputInMibps;
    }

    /**
     * <p>
     * The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The limit
     * on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information,
     * see <a href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS Limits That You Can
     * Increase</a> in the <i>Amazon EFS User Guide.</i>
     * </p>
     * 
     * @param provisionedThroughputInMibps
     *        The throughput, measured in MiB/s, that you want to provision for a file system that you're creating. The
     *        limit on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more
     *        information, see <a href="https://docs.aws.amazon.com/efs/latest/ug/limits.html#soft-limits">Amazon EFS
     *        Limits That You Can Increase</a> in the <i>Amazon EFS User Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withProvisionedThroughputInMibps(Double provisionedThroughputInMibps) {
        setProvisionedThroughputInMibps(provisionedThroughputInMibps);
        return this;
    }

    /**
     * <p>
     * A value that specifies to create one or more tags associated with the file system. Each tag is a user-defined
     * key-value pair. Name your file system on creation by including a <code>"Key":"Name","Value":"{value}"</code>
     * key-value pair.
     * </p>
     * 
     * @return A value that specifies to create one or more tags associated with the file system. Each tag is a
     *         user-defined key-value pair. Name your file system on creation by including a
     *         <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A value that specifies to create one or more tags associated with the file system. Each tag is a user-defined
     * key-value pair. Name your file system on creation by including a <code>"Key":"Name","Value":"{value}"</code>
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A value that specifies to create one or more tags associated with the file system. Each tag is a
     *        user-defined key-value pair. Name your file system on creation by including a
     *        <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A value that specifies to create one or more tags associated with the file system. Each tag is a user-defined
     * key-value pair. Name your file system on creation by including a <code>"Key":"Name","Value":"{value}"</code>
     * key-value pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A value that specifies to create one or more tags associated with the file system. Each tag is a
     *        user-defined key-value pair. Name your file system on creation by including a
     *        <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A value that specifies to create one or more tags associated with the file system. Each tag is a user-defined
     * key-value pair. Name your file system on creation by including a <code>"Key":"Name","Value":"{value}"</code>
     * key-value pair.
     * </p>
     * 
     * @param tags
     *        A value that specifies to create one or more tags associated with the file system. Each tag is a
     *        user-defined key-value pair. Name your file system on creation by including a
     *        <code>"Key":"Name","Value":"{value}"</code> key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCreationToken() != null)
            sb.append("CreationToken: ").append(getCreationToken()).append(",");
        if (getPerformanceMode() != null)
            sb.append("PerformanceMode: ").append(getPerformanceMode()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getThroughputMode() != null)
            sb.append("ThroughputMode: ").append(getThroughputMode()).append(",");
        if (getProvisionedThroughputInMibps() != null)
            sb.append("ProvisionedThroughputInMibps: ").append(getProvisionedThroughputInMibps()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemRequest == false)
            return false;
        CreateFileSystemRequest other = (CreateFileSystemRequest) obj;
        if (other.getCreationToken() == null ^ this.getCreationToken() == null)
            return false;
        if (other.getCreationToken() != null && other.getCreationToken().equals(this.getCreationToken()) == false)
            return false;
        if (other.getPerformanceMode() == null ^ this.getPerformanceMode() == null)
            return false;
        if (other.getPerformanceMode() != null && other.getPerformanceMode().equals(this.getPerformanceMode()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getThroughputMode() == null ^ this.getThroughputMode() == null)
            return false;
        if (other.getThroughputMode() != null && other.getThroughputMode().equals(this.getThroughputMode()) == false)
            return false;
        if (other.getProvisionedThroughputInMibps() == null ^ this.getProvisionedThroughputInMibps() == null)
            return false;
        if (other.getProvisionedThroughputInMibps() != null && other.getProvisionedThroughputInMibps().equals(this.getProvisionedThroughputInMibps()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationToken() == null) ? 0 : getCreationToken().hashCode());
        hashCode = prime * hashCode + ((getPerformanceMode() == null) ? 0 : getPerformanceMode().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getThroughputMode() == null) ? 0 : getThroughputMode().hashCode());
        hashCode = prime * hashCode + ((getProvisionedThroughputInMibps() == null) ? 0 : getProvisionedThroughputInMibps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemRequest clone() {
        return (CreateFileSystemRequest) super.clone();
    }

}
