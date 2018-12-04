/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     */
    private String creationToken;
    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     */
    private String performanceMode;
    /**
     * <p>
     * A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service
     * (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The id of the AWS KMS CMK that will be used to protect the encrypted file system. This parameter is only required
     * if you want to use a non-default CMK. If this parameter is not specified, the default CMK for Amazon EFS is used.
     * This id can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name for the key. For example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key. For example, <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An Amazon Resource Name for a key alias. For example,
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if the KmsKeyId is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @param creationToken
     *        String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     */

    public void setCreationToken(String creationToken) {
        this.creationToken = creationToken;
    }

    /**
     * <p>
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @return String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     */

    public String getCreationToken() {
        return this.creationToken;
    }

    /**
     * <p>
     * String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * </p>
     * 
     * @param creationToken
     *        String of up to 64 ASCII characters. Amazon EFS uses this to ensure idempotent creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withCreationToken(String creationToken) {
        setCreationToken(creationToken);
        return this;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public void setPerformanceMode(String performanceMode) {
        this.performanceMode = performanceMode;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @return The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *         mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to
     *         higher levels of aggregate throughput and operations per second with a tradeoff of slightly higher
     *         latencies for most file operations. This can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public String getPerformanceMode() {
        return this.performanceMode;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public CreateFileSystemRequest withPerformanceMode(String performanceMode) {
        setPerformanceMode(performanceMode);
        return this;
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @see PerformanceMode
     */

    public void setPerformanceMode(PerformanceMode performanceMode) {
        withPerformanceMode(performanceMode);
    }

    /**
     * <p>
     * The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance mode
     * for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher levels of
     * aggregate throughput and operations per second with a tradeoff of slightly higher latencies for most file
     * operations. This can't be changed after the file system has been created.
     * </p>
     * 
     * @param performanceMode
     *        The <code>PerformanceMode</code> of the file system. We recommend <code>generalPurpose</code> performance
     *        mode for most file systems. File systems using the <code>maxIO</code> performance mode can scale to higher
     *        levels of aggregate throughput and operations per second with a tradeoff of slightly higher latencies for
     *        most file operations. This can't be changed after the file system has been created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PerformanceMode
     */

    public CreateFileSystemRequest withPerformanceMode(PerformanceMode performanceMode) {
        this.performanceMode = performanceMode.toString();
        return this;
    }

    /**
     * <p>
     * A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service
     * (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @param encrypted
     *        A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *        you have the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     *        Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK
     *        for Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service
     * (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @return A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *         you have the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     *         Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK
     *         for Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service
     * (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @param encrypted
     *        A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *        you have the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
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
     * A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system, you have
     * the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key Management Service
     * (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK for Amazon EFS,
     * <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     * </p>
     * 
     * @return A boolean value that, if true, creates an encrypted file system. When creating an encrypted file system,
     *         you have the option of specifying a <a>CreateFileSystemRequest$KmsKeyId</a> for an existing AWS Key
     *         Management Service (AWS KMS) customer master key (CMK). If you don't specify a CMK, then the default CMK
     *         for Amazon EFS, <code>/aws/elasticfilesystem</code>, is used to protect the encrypted file system.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The id of the AWS KMS CMK that will be used to protect the encrypted file system. This parameter is only required
     * if you want to use a non-default CMK. If this parameter is not specified, the default CMK for Amazon EFS is used.
     * This id can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name for the key. For example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key. For example, <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An Amazon Resource Name for a key alias. For example,
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if the KmsKeyId is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     * 
     * @param kmsKeyId
     *        The id of the AWS KMS CMK that will be used to protect the encrypted file system. This parameter is only
     *        required if you want to use a non-default CMK. If this parameter is not specified, the default CMK for
     *        Amazon EFS is used. This id can be in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID - A unique identifier of the key. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN - An Amazon Resource Name for the key. For example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias - A previously created display name for a key. For example, <code>alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias ARN - An Amazon Resource Name for a key alias. For example,
     *        <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that if the KmsKeyId is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set
     *        to true.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The id of the AWS KMS CMK that will be used to protect the encrypted file system. This parameter is only required
     * if you want to use a non-default CMK. If this parameter is not specified, the default CMK for Amazon EFS is used.
     * This id can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name for the key. For example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key. For example, <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An Amazon Resource Name for a key alias. For example,
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if the KmsKeyId is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     * 
     * @return The id of the AWS KMS CMK that will be used to protect the encrypted file system. This parameter is only
     *         required if you want to use a non-default CMK. If this parameter is not specified, the default CMK for
     *         Amazon EFS is used. This id can be in one of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID - A unique identifier of the key. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN - An Amazon Resource Name for the key. For example,
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias - A previously created display name for a key. For example, <code>alias/projectKey1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key alias ARN - An Amazon Resource Name for a key alias. For example,
     *         <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note that if the KmsKeyId is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be
     *         set to true.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The id of the AWS KMS CMK that will be used to protect the encrypted file system. This parameter is only required
     * if you want to use a non-default CMK. If this parameter is not specified, the default CMK for Amazon EFS is used.
     * This id can be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID - A unique identifier of the key. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN - An Amazon Resource Name for the key. For example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias - A previously created display name for a key. For example, <code>alias/projectKey1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Key alias ARN - An Amazon Resource Name for a key alias. For example,
     * <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note that if the KmsKeyId is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set to
     * true.
     * </p>
     * 
     * @param kmsKeyId
     *        The id of the AWS KMS CMK that will be used to protect the encrypted file system. This parameter is only
     *        required if you want to use a non-default CMK. If this parameter is not specified, the default CMK for
     *        Amazon EFS is used. This id can be in one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID - A unique identifier of the key. For example, <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN - An Amazon Resource Name for the key. For example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias - A previously created display name for a key. For example, <code>alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key alias ARN - An Amazon Resource Name for a key alias. For example,
     *        <code>arn:aws:kms:us-west-2:444455556666:alias/projectKey1</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note that if the KmsKeyId is specified, the <a>CreateFileSystemRequest$Encrypted</a> parameter must be set
     *        to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("KmsKeyId: ").append(getKmsKeyId());
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
        return hashCode;
    }

    @Override
    public CreateFileSystemRequest clone() {
        return (CreateFileSystemRequest) super.clone();
    }

}
