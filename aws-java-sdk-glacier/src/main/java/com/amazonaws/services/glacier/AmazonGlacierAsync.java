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
package com.amazonaws.services.glacier;

import javax.annotation.Generated;

import com.amazonaws.services.glacier.model.*;

/**
 * Interface for accessing Amazon Glacier asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.glacier.AbstractAmazonGlacierAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Glacier is a storage solution for "cold data."
 * </p>
 * <p>
 * Amazon Glacier is an extremely low-cost storage service that provides secure, durable, and easy-to-use storage for
 * data backup and archival. With Amazon Glacier, customers can store their data cost effectively for months, years, or
 * decades. Amazon Glacier also enables customers to offload the administrative burdens of operating and scaling storage
 * to AWS, so they don't have to worry about capacity planning, hardware provisioning, data replication, hardware
 * failure and recovery, or time-consuming hardware migrations.
 * </p>
 * <p>
 * Amazon Glacier is a great storage choice when low storage cost is paramount and your data is rarely retrieved. If
 * your application requires fast or frequent access to your data, consider using Amazon S3. For more information, see
 * <a href="http://aws.amazon.com/s3/">Amazon Simple Storage Service (Amazon S3)</a>.
 * </p>
 * <p>
 * You can store any kind of data in any format. There is no maximum limit on the total amount of data you can store in
 * Amazon Glacier.
 * </p>
 * <p>
 * If you are a first-time user of Amazon Glacier, we recommend that you begin by reading the following sections in the
 * <i>Amazon Glacier Developer Guide</i>:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/introduction.html">What is Amazon Glacier</a> - This
 * section of the Developer Guide describes the underlying data model, the operations it supports, and the AWS SDKs that
 * you can use to interact with the service.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/amazon-glacier-getting-started.html">Getting Started
 * with Amazon Glacier</a> - The Getting Started section walks you through the process of creating a vault, uploading
 * archives, creating jobs to download archives, retrieving the job output, and deleting archives.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonGlacierAsync extends AmazonGlacier {

    /**
     * <p>
     * This operation aborts a multipart upload identified by the upload ID.
     * </p>
     * <p>
     * After the Abort Multipart Upload request succeeds, you cannot upload any more parts to the multipart upload or
     * complete the multipart upload. Aborting a completed upload fails. However, aborting an already-aborted upload
     * will succeed, for a short time. For more information about uploading a part and completing a multipart upload,
     * see <a>UploadMultipartPart</a> and <a>CompleteMultipartUpload</a>.
     * </p>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html">Abort Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param abortMultipartUploadRequest
     *        Provides options to abort a multipart upload identified by the upload ID.</p>
     *        <p>
     *        For information about the underlying REST API, see <a
     *        href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html">Abort Multipart
     *        Upload</a>. For conceptual information, see <a
     *        href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with
     *        Archives in Amazon Glacier</a>.
     * @return A Java Future containing the result of the AbortMultipartUpload operation returned by the service.
     * @sample AmazonGlacierAsync.AbortMultipartUpload
     */
    java.util.concurrent.Future<AbortMultipartUploadResult> abortMultipartUploadAsync(AbortMultipartUploadRequest abortMultipartUploadRequest);

    /**
     * <p>
     * This operation aborts a multipart upload identified by the upload ID.
     * </p>
     * <p>
     * After the Abort Multipart Upload request succeeds, you cannot upload any more parts to the multipart upload or
     * complete the multipart upload. Aborting a completed upload fails. However, aborting an already-aborted upload
     * will succeed, for a short time. For more information about uploading a part and completing a multipart upload,
     * see <a>UploadMultipartPart</a> and <a>CompleteMultipartUpload</a>.
     * </p>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html">Abort Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param abortMultipartUploadRequest
     *        Provides options to abort a multipart upload identified by the upload ID.</p>
     *        <p>
     *        For information about the underlying REST API, see <a
     *        href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-abort-upload.html">Abort Multipart
     *        Upload</a>. For conceptual information, see <a
     *        href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with
     *        Archives in Amazon Glacier</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AbortMultipartUpload operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.AbortMultipartUpload
     */
    java.util.concurrent.Future<AbortMultipartUploadResult> abortMultipartUploadAsync(AbortMultipartUploadRequest abortMultipartUploadRequest,
            com.amazonaws.handlers.AsyncHandler<AbortMultipartUploadRequest, AbortMultipartUploadResult> asyncHandler);

    /**
     * <p>
     * This operation aborts the vault locking process if the vault lock is not in the <code>Locked</code> state. If the
     * vault lock is in the <code>Locked</code> state when this operation is requested, the operation returns an
     * <code>AccessDeniedException</code> error. Aborting the vault locking process removes the vault lock policy from
     * the specified vault.
     * </p>
     * <p>
     * A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. A vault lock is
     * put into the <code>Locked</code> state by calling <a>CompleteVaultLock</a>. You can get the state of a vault lock
     * by calling <a>GetVaultLock</a>. For more information about the vault locking process, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>. For
     * more information about vault lock policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * <p>
     * This operation is idempotent. You can successfully invoke this operation multiple times, if the vault lock is in
     * the <code>InProgress</code> state or if there is no policy associated with the vault.
     * </p>
     * 
     * @param abortVaultLockRequest
     *        The input values for <code>AbortVaultLock</code>.
     * @return A Java Future containing the result of the AbortVaultLock operation returned by the service.
     * @sample AmazonGlacierAsync.AbortVaultLock
     */
    java.util.concurrent.Future<AbortVaultLockResult> abortVaultLockAsync(AbortVaultLockRequest abortVaultLockRequest);

    /**
     * <p>
     * This operation aborts the vault locking process if the vault lock is not in the <code>Locked</code> state. If the
     * vault lock is in the <code>Locked</code> state when this operation is requested, the operation returns an
     * <code>AccessDeniedException</code> error. Aborting the vault locking process removes the vault lock policy from
     * the specified vault.
     * </p>
     * <p>
     * A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. A vault lock is
     * put into the <code>Locked</code> state by calling <a>CompleteVaultLock</a>. You can get the state of a vault lock
     * by calling <a>GetVaultLock</a>. For more information about the vault locking process, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>. For
     * more information about vault lock policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * <p>
     * This operation is idempotent. You can successfully invoke this operation multiple times, if the vault lock is in
     * the <code>InProgress</code> state or if there is no policy associated with the vault.
     * </p>
     * 
     * @param abortVaultLockRequest
     *        The input values for <code>AbortVaultLock</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AbortVaultLock operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.AbortVaultLock
     */
    java.util.concurrent.Future<AbortVaultLockResult> abortVaultLockAsync(AbortVaultLockRequest abortVaultLockRequest,
            com.amazonaws.handlers.AsyncHandler<AbortVaultLockRequest, AbortVaultLockResult> asyncHandler);

    /**
     * <p>
     * This operation adds the specified tags to a vault. Each tag is composed of a key and a value. Each vault can have
     * up to 10 tags. If your request would cause the tag limit for the vault to be exceeded, the operation throws the
     * <code>LimitExceededException</code> error. If a tag already exists on the vault under a specified key, the
     * existing key value will be overwritten. For more information about tags, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier Resources</a>.
     * </p>
     * 
     * @param addTagsToVaultRequest
     *        The input values for <code>AddTagsToVault</code>.
     * @return A Java Future containing the result of the AddTagsToVault operation returned by the service.
     * @sample AmazonGlacierAsync.AddTagsToVault
     */
    java.util.concurrent.Future<AddTagsToVaultResult> addTagsToVaultAsync(AddTagsToVaultRequest addTagsToVaultRequest);

    /**
     * <p>
     * This operation adds the specified tags to a vault. Each tag is composed of a key and a value. Each vault can have
     * up to 10 tags. If your request would cause the tag limit for the vault to be exceeded, the operation throws the
     * <code>LimitExceededException</code> error. If a tag already exists on the vault under a specified key, the
     * existing key value will be overwritten. For more information about tags, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier Resources</a>.
     * </p>
     * 
     * @param addTagsToVaultRequest
     *        The input values for <code>AddTagsToVault</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTagsToVault operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.AddTagsToVault
     */
    java.util.concurrent.Future<AddTagsToVaultResult> addTagsToVaultAsync(AddTagsToVaultRequest addTagsToVaultRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsToVaultRequest, AddTagsToVaultResult> asyncHandler);

    /**
     * <p>
     * You call this operation to inform Amazon Glacier that all the archive parts have been uploaded and that Amazon
     * Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the
     * vault, Amazon Glacier returns the URI path of the newly created archive resource. Using the URI path, you can
     * then access the archive. After you upload an archive, you should save the archive ID returned to retrieve the
     * archive at a later point. You can also get the vault inventory to obtain a list of archive IDs in a vault. For
     * more information, see <a>InitiateJob</a>.
     * </p>
     * <p>
     * In the request, you must include the computed SHA256 tree hash of the entire archive you have uploaded. For
     * information about computing a SHA256 tree hash, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing Checksums</a>. On
     * the server side, Amazon Glacier also constructs the SHA256 tree hash of the assembled archive. If the values
     * match, Amazon Glacier saves the archive to the vault; otherwise, it returns an error, and the operation fails.
     * The <a>ListParts</a> operation returns a list of parts uploaded for a specific multipart upload. It includes
     * checksum information for each uploaded part that can be used to debug a bad checksum issue.
     * </p>
     * <p>
     * Additionally, Amazon Glacier also checks for any missing content ranges when assembling the archive, if missing
     * content ranges are found, Amazon Glacier returns an error and the operation fails.
     * </p>
     * <p>
     * Complete Multipart Upload is an idempotent operation. After your first successful complete multipart upload, if
     * you call the operation again within a short period, the operation will succeed and return the same archive ID.
     * This is useful in the event you experience a network issue that causes an aborted connection or receive a 500
     * server error, in which case you can repeat your Complete Multipart Upload request and get the same archive ID
     * without creating duplicate archives. Note, however, that after the multipart upload completes, you cannot call
     * the List Parts operation and the multipart upload will not appear in List Multipart Uploads response, even if
     * idempotent complete is possible.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-complete-upload.html">Complete Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param completeMultipartUploadRequest
     *        Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the
     *        archive parts have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts.
     *        After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly
     *        created archive resource.
     * @return A Java Future containing the result of the CompleteMultipartUpload operation returned by the service.
     * @sample AmazonGlacierAsync.CompleteMultipartUpload
     */
    java.util.concurrent.Future<CompleteMultipartUploadResult> completeMultipartUploadAsync(CompleteMultipartUploadRequest completeMultipartUploadRequest);

    /**
     * <p>
     * You call this operation to inform Amazon Glacier that all the archive parts have been uploaded and that Amazon
     * Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the
     * vault, Amazon Glacier returns the URI path of the newly created archive resource. Using the URI path, you can
     * then access the archive. After you upload an archive, you should save the archive ID returned to retrieve the
     * archive at a later point. You can also get the vault inventory to obtain a list of archive IDs in a vault. For
     * more information, see <a>InitiateJob</a>.
     * </p>
     * <p>
     * In the request, you must include the computed SHA256 tree hash of the entire archive you have uploaded. For
     * information about computing a SHA256 tree hash, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing Checksums</a>. On
     * the server side, Amazon Glacier also constructs the SHA256 tree hash of the assembled archive. If the values
     * match, Amazon Glacier saves the archive to the vault; otherwise, it returns an error, and the operation fails.
     * The <a>ListParts</a> operation returns a list of parts uploaded for a specific multipart upload. It includes
     * checksum information for each uploaded part that can be used to debug a bad checksum issue.
     * </p>
     * <p>
     * Additionally, Amazon Glacier also checks for any missing content ranges when assembling the archive, if missing
     * content ranges are found, Amazon Glacier returns an error and the operation fails.
     * </p>
     * <p>
     * Complete Multipart Upload is an idempotent operation. After your first successful complete multipart upload, if
     * you call the operation again within a short period, the operation will succeed and return the same archive ID.
     * This is useful in the event you experience a network issue that causes an aborted connection or receive a 500
     * server error, in which case you can repeat your Complete Multipart Upload request and get the same archive ID
     * without creating duplicate archives. Note, however, that after the multipart upload completes, you cannot call
     * the List Parts operation and the multipart upload will not appear in List Multipart Uploads response, even if
     * idempotent complete is possible.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-complete-upload.html">Complete Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param completeMultipartUploadRequest
     *        Provides options to complete a multipart upload operation. This informs Amazon Glacier that all the
     *        archive parts have been uploaded and Amazon Glacier can now assemble the archive from the uploaded parts.
     *        After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly
     *        created archive resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteMultipartUpload operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.CompleteMultipartUpload
     */
    java.util.concurrent.Future<CompleteMultipartUploadResult> completeMultipartUploadAsync(CompleteMultipartUploadRequest completeMultipartUploadRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteMultipartUploadRequest, CompleteMultipartUploadResult> asyncHandler);

    /**
     * <p>
     * This operation completes the vault locking process by transitioning the vault lock from the
     * <code>InProgress</code> state to the <code>Locked</code> state, which causes the vault lock policy to become
     * unchangeable. A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. You
     * can obtain the state of the vault lock by calling <a>GetVaultLock</a>. For more information about the vault
     * locking process, <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier
     * Vault Lock</a>.
     * </p>
     * <p>
     * This operation is idempotent. This request is always successful if the vault lock is in the <code>Locked</code>
     * state and the provided lock ID matches the lock ID originally used to lock the vault.
     * </p>
     * <p>
     * If an invalid lock ID is passed in the request when the vault lock is in the <code>Locked</code> state, the
     * operation returns an <code>AccessDeniedException</code> error. If an invalid lock ID is passed in the request
     * when the vault lock is in the <code>InProgress</code> state, the operation throws an
     * <code>InvalidParameter</code> error.
     * </p>
     * 
     * @param completeVaultLockRequest
     *        The input values for <code>CompleteVaultLock</code>.
     * @return A Java Future containing the result of the CompleteVaultLock operation returned by the service.
     * @sample AmazonGlacierAsync.CompleteVaultLock
     */
    java.util.concurrent.Future<CompleteVaultLockResult> completeVaultLockAsync(CompleteVaultLockRequest completeVaultLockRequest);

    /**
     * <p>
     * This operation completes the vault locking process by transitioning the vault lock from the
     * <code>InProgress</code> state to the <code>Locked</code> state, which causes the vault lock policy to become
     * unchangeable. A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. You
     * can obtain the state of the vault lock by calling <a>GetVaultLock</a>. For more information about the vault
     * locking process, <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier
     * Vault Lock</a>.
     * </p>
     * <p>
     * This operation is idempotent. This request is always successful if the vault lock is in the <code>Locked</code>
     * state and the provided lock ID matches the lock ID originally used to lock the vault.
     * </p>
     * <p>
     * If an invalid lock ID is passed in the request when the vault lock is in the <code>Locked</code> state, the
     * operation returns an <code>AccessDeniedException</code> error. If an invalid lock ID is passed in the request
     * when the vault lock is in the <code>InProgress</code> state, the operation throws an
     * <code>InvalidParameter</code> error.
     * </p>
     * 
     * @param completeVaultLockRequest
     *        The input values for <code>CompleteVaultLock</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CompleteVaultLock operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.CompleteVaultLock
     */
    java.util.concurrent.Future<CompleteVaultLockResult> completeVaultLockAsync(CompleteVaultLockRequest completeVaultLockRequest,
            com.amazonaws.handlers.AsyncHandler<CompleteVaultLockRequest, CompleteVaultLockResult> asyncHandler);

    /**
     * <p>
     * This operation creates a new vault with the specified name. The name of the vault must be unique within a region
     * for an AWS account. You can create up to 1,000 vaults per account. If you need to create more vaults, contact
     * Amazon Glacier.
     * </p>
     * <p>
     * You must use the following guidelines when naming a vault.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Names can be between 1 and 255 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/creating-vaults.html">Creating a Vault in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-put.html">Create Vault
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param createVaultRequest
     *        Provides options to create a vault.
     * @return A Java Future containing the result of the CreateVault operation returned by the service.
     * @sample AmazonGlacierAsync.CreateVault
     */
    java.util.concurrent.Future<CreateVaultResult> createVaultAsync(CreateVaultRequest createVaultRequest);

    /**
     * <p>
     * This operation creates a new vault with the specified name. The name of the vault must be unique within a region
     * for an AWS account. You can create up to 1,000 vaults per account. If you need to create more vaults, contact
     * Amazon Glacier.
     * </p>
     * <p>
     * You must use the following guidelines when naming a vault.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Names can be between 1 and 255 characters long.
     * </p>
     * </li>
     * <li>
     * <p>
     * Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/creating-vaults.html">Creating a Vault in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-put.html">Create Vault
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param createVaultRequest
     *        Provides options to create a vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVault operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.CreateVault
     */
    java.util.concurrent.Future<CreateVaultResult> createVaultAsync(CreateVaultRequest createVaultRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVaultRequest, CreateVaultResult> asyncHandler);

    /**
     * <p>
     * This operation deletes an archive from a vault. Subsequent requests to initiate a retrieval of this archive will
     * fail. Archive retrievals that are in progress for this archive ID may or may not succeed according to the
     * following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the archive retrieval job is actively preparing the data for download when Amazon Glacier receives the delete
     * archive request, the archival retrieval operation might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the archive retrieval job has successfully prepared the archive for download when Amazon Glacier receives the
     * delete archive request, you will be able to download the output.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent. Attempting to delete an already-deleted archive does not result in an error.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/deleting-an-archive.html">Deleting an Archive in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-delete.html">Delete
     * Archive</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param deleteArchiveRequest
     *        Provides options for deleting an archive from an Amazon Glacier vault.
     * @return A Java Future containing the result of the DeleteArchive operation returned by the service.
     * @sample AmazonGlacierAsync.DeleteArchive
     */
    java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest deleteArchiveRequest);

    /**
     * <p>
     * This operation deletes an archive from a vault. Subsequent requests to initiate a retrieval of this archive will
     * fail. Archive retrievals that are in progress for this archive ID may or may not succeed according to the
     * following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the archive retrieval job is actively preparing the data for download when Amazon Glacier receives the delete
     * archive request, the archival retrieval operation might fail.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the archive retrieval job has successfully prepared the archive for download when Amazon Glacier receives the
     * delete archive request, you will be able to download the output.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent. Attempting to delete an already-deleted archive does not result in an error.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/deleting-an-archive.html">Deleting an Archive in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-delete.html">Delete
     * Archive</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param deleteArchiveRequest
     *        Provides options for deleting an archive from an Amazon Glacier vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteArchive operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.DeleteArchive
     */
    java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest deleteArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteArchiveRequest, DeleteArchiveResult> asyncHandler);

    /**
     * <p>
     * This operation deletes a vault. Amazon Glacier will delete a vault only if there are no archives in the vault as
     * of the last inventory and there have been no writes to the vault since the last inventory. If either of these
     * conditions is not satisfied, the vault deletion fails (that is, the vault is not removed) and Amazon Glacier
     * returns an error. You can use <a>DescribeVault</a> to return the number of archives in a vault, and you can use
     * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html">Initiate a Job (POST
     * jobs)</a> to initiate a new inventory retrieval for a vault. The inventory contains the archive IDs you use to
     * delete archives using <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-delete.html">Delete Archive (DELETE
     * archive)</a>.
     * </p>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/deleting-vaults.html">Deleting a Vault in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-delete.html">Delete Vault
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param deleteVaultRequest
     *        Provides options for deleting a vault from Amazon Glacier.
     * @return A Java Future containing the result of the DeleteVault operation returned by the service.
     * @sample AmazonGlacierAsync.DeleteVault
     */
    java.util.concurrent.Future<DeleteVaultResult> deleteVaultAsync(DeleteVaultRequest deleteVaultRequest);

    /**
     * <p>
     * This operation deletes a vault. Amazon Glacier will delete a vault only if there are no archives in the vault as
     * of the last inventory and there have been no writes to the vault since the last inventory. If either of these
     * conditions is not satisfied, the vault deletion fails (that is, the vault is not removed) and Amazon Glacier
     * returns an error. You can use <a>DescribeVault</a> to return the number of archives in a vault, and you can use
     * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html">Initiate a Job (POST
     * jobs)</a> to initiate a new inventory retrieval for a vault. The inventory contains the archive IDs you use to
     * delete archives using <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-delete.html">Delete Archive (DELETE
     * archive)</a>.
     * </p>
     * <p>
     * This operation is idempotent.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/deleting-vaults.html">Deleting a Vault in Amazon
     * Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-delete.html">Delete Vault
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param deleteVaultRequest
     *        Provides options for deleting a vault from Amazon Glacier.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVault operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.DeleteVault
     */
    java.util.concurrent.Future<DeleteVaultResult> deleteVaultAsync(DeleteVaultRequest deleteVaultRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVaultRequest, DeleteVaultResult> asyncHandler);

    /**
     * <p>
     * This operation deletes the access policy associated with the specified vault. The operation is eventually
     * consistent; that is, it might take some time for Amazon Glacier to completely remove the access policy, and you
     * might still see the effect of the policy for a short time after you send the delete request.
     * </p>
     * <p>
     * This operation is idempotent. You can invoke delete multiple times, even if there is no policy associated with
     * the vault. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param deleteVaultAccessPolicyRequest
     *        DeleteVaultAccessPolicy input.
     * @return A Java Future containing the result of the DeleteVaultAccessPolicy operation returned by the service.
     * @sample AmazonGlacierAsync.DeleteVaultAccessPolicy
     */
    java.util.concurrent.Future<DeleteVaultAccessPolicyResult> deleteVaultAccessPolicyAsync(DeleteVaultAccessPolicyRequest deleteVaultAccessPolicyRequest);

    /**
     * <p>
     * This operation deletes the access policy associated with the specified vault. The operation is eventually
     * consistent; that is, it might take some time for Amazon Glacier to completely remove the access policy, and you
     * might still see the effect of the policy for a short time after you send the delete request.
     * </p>
     * <p>
     * This operation is idempotent. You can invoke delete multiple times, even if there is no policy associated with
     * the vault. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param deleteVaultAccessPolicyRequest
     *        DeleteVaultAccessPolicy input.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVaultAccessPolicy operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.DeleteVaultAccessPolicy
     */
    java.util.concurrent.Future<DeleteVaultAccessPolicyResult> deleteVaultAccessPolicyAsync(DeleteVaultAccessPolicyRequest deleteVaultAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVaultAccessPolicyRequest, DeleteVaultAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * This operation deletes the notification configuration set for a vault. The operation is eventually consistent;
     * that is, it might take some time for Amazon Glacier to completely disable the notifications and you might still
     * receive some notifications for a short time after you send the delete request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-delete.html">Delete Vault
     * Notification Configuration </a> in the Amazon Glacier Developer Guide.
     * </p>
     * 
     * @param deleteVaultNotificationsRequest
     *        Provides options for deleting a vault notification configuration from an Amazon Glacier vault.
     * @return A Java Future containing the result of the DeleteVaultNotifications operation returned by the service.
     * @sample AmazonGlacierAsync.DeleteVaultNotifications
     */
    java.util.concurrent.Future<DeleteVaultNotificationsResult> deleteVaultNotificationsAsync(DeleteVaultNotificationsRequest deleteVaultNotificationsRequest);

    /**
     * <p>
     * This operation deletes the notification configuration set for a vault. The operation is eventually consistent;
     * that is, it might take some time for Amazon Glacier to completely disable the notifications and you might still
     * receive some notifications for a short time after you send the delete request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-delete.html">Delete Vault
     * Notification Configuration </a> in the Amazon Glacier Developer Guide.
     * </p>
     * 
     * @param deleteVaultNotificationsRequest
     *        Provides options for deleting a vault notification configuration from an Amazon Glacier vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVaultNotifications operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.DeleteVaultNotifications
     */
    java.util.concurrent.Future<DeleteVaultNotificationsResult> deleteVaultNotificationsAsync(DeleteVaultNotificationsRequest deleteVaultNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVaultNotificationsRequest, DeleteVaultNotificationsResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about a job you previously initiated, including the job initiation date, the
     * user who initiated the job, the job status code/message and the Amazon SNS topic to notify after Amazon Glacier
     * completes the job. For more information about initiating a job, see <a>InitiateJob</a>.
     * </p>
     * <note>
     * <p>
     * This operation enables you to check the status of your job. However, it is strongly recommended that you set up
     * an Amazon SNS topic and specify it in your initiate job request so that Amazon Glacier can notify the topic after
     * it completes the job.
     * </p>
     * </note>
     * <p>
     * A job ID will not expire for at least 24 hours after Amazon Glacier completes the job.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-describe-job-get.html">Describe Job</a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param describeJobRequest
     *        Provides options for retrieving a job description.
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AmazonGlacierAsync.DescribeJob
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest);

    /**
     * <p>
     * This operation returns information about a job you previously initiated, including the job initiation date, the
     * user who initiated the job, the job status code/message and the Amazon SNS topic to notify after Amazon Glacier
     * completes the job. For more information about initiating a job, see <a>InitiateJob</a>.
     * </p>
     * <note>
     * <p>
     * This operation enables you to check the status of your job. However, it is strongly recommended that you set up
     * an Amazon SNS topic and specify it in your initiate job request so that Amazon Glacier can notify the topic after
     * it completes the job.
     * </p>
     * </note>
     * <p>
     * A job ID will not expire for at least 24 hours after Amazon Glacier completes the job.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-describe-job-get.html">Describe Job</a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param describeJobRequest
     *        Provides options for retrieving a job description.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeJob operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.DescribeJob
     */
    java.util.concurrent.Future<DescribeJobResult> describeJobAsync(DescribeJobRequest describeJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler);

    /**
     * <p>
     * This operation returns information about a vault, including the vault's Amazon Resource Name (ARN), the date the
     * vault was created, the number of archives it contains, and the total size of all the archives in the vault. The
     * number of archives and their total size are as of the last inventory generation. This means that if you add or
     * remove an archive from a vault, and then immediately use Describe Vault, the change in contents will not be
     * immediately reflected. If you want to retrieve the latest inventory of the vault, use <a>InitiateJob</a>. Amazon
     * Glacier generates vault inventories approximately daily. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-inventory.html">Downloading a Vault Inventory in
     * Amazon Glacier</a>.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/retrieving-vault-info.html">Retrieving Vault Metadata
     * in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-get.html">Describe Vault </a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param describeVaultRequest
     *        Provides options for retrieving metadata for a specific vault in Amazon Glacier.
     * @return A Java Future containing the result of the DescribeVault operation returned by the service.
     * @sample AmazonGlacierAsync.DescribeVault
     */
    java.util.concurrent.Future<DescribeVaultResult> describeVaultAsync(DescribeVaultRequest describeVaultRequest);

    /**
     * <p>
     * This operation returns information about a vault, including the vault's Amazon Resource Name (ARN), the date the
     * vault was created, the number of archives it contains, and the total size of all the archives in the vault. The
     * number of archives and their total size are as of the last inventory generation. This means that if you add or
     * remove an archive from a vault, and then immediately use Describe Vault, the change in contents will not be
     * immediately reflected. If you want to retrieve the latest inventory of the vault, use <a>InitiateJob</a>. Amazon
     * Glacier generates vault inventories approximately daily. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-inventory.html">Downloading a Vault Inventory in
     * Amazon Glacier</a>.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/retrieving-vault-info.html">Retrieving Vault Metadata
     * in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-get.html">Describe Vault </a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param describeVaultRequest
     *        Provides options for retrieving metadata for a specific vault in Amazon Glacier.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVault operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.DescribeVault
     */
    java.util.concurrent.Future<DescribeVaultResult> describeVaultAsync(DescribeVaultRequest describeVaultRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVaultRequest, DescribeVaultResult> asyncHandler);

    /**
     * <p>
     * This operation returns the current data retrieval policy for the account and region specified in the GET request.
     * For more information about data retrieval policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html">Amazon Glacier Data
     * Retrieval Policies</a>.
     * </p>
     * 
     * @param getDataRetrievalPolicyRequest
     *        Input for GetDataRetrievalPolicy.
     * @return A Java Future containing the result of the GetDataRetrievalPolicy operation returned by the service.
     * @sample AmazonGlacierAsync.GetDataRetrievalPolicy
     */
    java.util.concurrent.Future<GetDataRetrievalPolicyResult> getDataRetrievalPolicyAsync(GetDataRetrievalPolicyRequest getDataRetrievalPolicyRequest);

    /**
     * <p>
     * This operation returns the current data retrieval policy for the account and region specified in the GET request.
     * For more information about data retrieval policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html">Amazon Glacier Data
     * Retrieval Policies</a>.
     * </p>
     * 
     * @param getDataRetrievalPolicyRequest
     *        Input for GetDataRetrievalPolicy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataRetrievalPolicy operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.GetDataRetrievalPolicy
     */
    java.util.concurrent.Future<GetDataRetrievalPolicyResult> getDataRetrievalPolicyAsync(GetDataRetrievalPolicyRequest getDataRetrievalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataRetrievalPolicyRequest, GetDataRetrievalPolicyResult> asyncHandler);

    /**
     * <p>
     * This operation downloads the output of the job you initiated using <a>InitiateJob</a>. Depending on the job type
     * you specified when you initiated the job, the output will be either the content of an archive or a vault
     * inventory.
     * </p>
     * <p>
     * You can download all the job output or download a portion of the output by specifying a byte range. In the case
     * of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the checksum for the
     * portion of the data. You can compute the checksum on the client and verify that the values match to ensure the
     * portion you downloaded is the correct data.
     * </p>
     * <p>
     * A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. That a byte range. For
     * both archive and inventory retrieval jobs, you should verify the downloaded size against the size returned in the
     * headers from the <b>Get Job Output</b> response.
     * </p>
     * <p>
     * For archive retrieval jobs, you should also verify that the size is what you expected. If you download a portion
     * of the output, the expected size is based on the range of bytes you specified. For example, if you specify a
     * range of <code>bytes=0-1048575</code>, you should verify your download size is 1,048,576 bytes. If you download
     * an entire archive, the expected size is the size of the archive when you uploaded it to Amazon Glacier The
     * expected size is also returned in the headers from the <b>Get Job Output</b> response.
     * </p>
     * <p>
     * In the case of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the
     * checksum for the portion of the data. To ensure the portion you downloaded is the correct data, compute the
     * checksum on the client, verify that the values match, and verify that the size is what you expected.
     * </p>
     * <p>
     * A job ID does not expire for at least 24 hours after Amazon Glacier completes the job. That is, you can download
     * the job output within the 24 hours period after Amazon Glacier completes the job.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-inventory.html">Downloading a Vault
     * Inventory</a>, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/downloading-an-archive.html">Downloading an
     * Archive</a>, and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-job-output-get.html">Get Job
     * Output </a>
     * </p>
     * 
     * @param getJobOutputRequest
     *        Provides options for downloading output of an Amazon Glacier job.
     * @return A Java Future containing the result of the GetJobOutput operation returned by the service.
     * @sample AmazonGlacierAsync.GetJobOutput
     */
    java.util.concurrent.Future<GetJobOutputResult> getJobOutputAsync(GetJobOutputRequest getJobOutputRequest);

    /**
     * <p>
     * This operation downloads the output of the job you initiated using <a>InitiateJob</a>. Depending on the job type
     * you specified when you initiated the job, the output will be either the content of an archive or a vault
     * inventory.
     * </p>
     * <p>
     * You can download all the job output or download a portion of the output by specifying a byte range. In the case
     * of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the checksum for the
     * portion of the data. You can compute the checksum on the client and verify that the values match to ensure the
     * portion you downloaded is the correct data.
     * </p>
     * <p>
     * A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. That a byte range. For
     * both archive and inventory retrieval jobs, you should verify the downloaded size against the size returned in the
     * headers from the <b>Get Job Output</b> response.
     * </p>
     * <p>
     * For archive retrieval jobs, you should also verify that the size is what you expected. If you download a portion
     * of the output, the expected size is based on the range of bytes you specified. For example, if you specify a
     * range of <code>bytes=0-1048575</code>, you should verify your download size is 1,048,576 bytes. If you download
     * an entire archive, the expected size is the size of the archive when you uploaded it to Amazon Glacier The
     * expected size is also returned in the headers from the <b>Get Job Output</b> response.
     * </p>
     * <p>
     * In the case of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the
     * checksum for the portion of the data. To ensure the portion you downloaded is the correct data, compute the
     * checksum on the client, verify that the values match, and verify that the size is what you expected.
     * </p>
     * <p>
     * A job ID does not expire for at least 24 hours after Amazon Glacier completes the job. That is, you can download
     * the job output within the 24 hours period after Amazon Glacier completes the job.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-inventory.html">Downloading a Vault
     * Inventory</a>, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/downloading-an-archive.html">Downloading an
     * Archive</a>, and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-job-output-get.html">Get Job
     * Output </a>
     * </p>
     * 
     * @param getJobOutputRequest
     *        Provides options for downloading output of an Amazon Glacier job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetJobOutput operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.GetJobOutput
     */
    java.util.concurrent.Future<GetJobOutputResult> getJobOutputAsync(GetJobOutputRequest getJobOutputRequest,
            com.amazonaws.handlers.AsyncHandler<GetJobOutputRequest, GetJobOutputResult> asyncHandler);

    /**
     * <p>
     * This operation retrieves the <code>access-policy</code> subresource set on the vault; for more information on
     * setting this subresource, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-SetVaultAccessPolicy.html">Set Vault Access Policy
     * (PUT access-policy)</a>. If there is no access policy set on the vault, the operation returns a
     * <code>404 Not found</code> error. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param getVaultAccessPolicyRequest
     *        Input for GetVaultAccessPolicy.
     * @return A Java Future containing the result of the GetVaultAccessPolicy operation returned by the service.
     * @sample AmazonGlacierAsync.GetVaultAccessPolicy
     */
    java.util.concurrent.Future<GetVaultAccessPolicyResult> getVaultAccessPolicyAsync(GetVaultAccessPolicyRequest getVaultAccessPolicyRequest);

    /**
     * <p>
     * This operation retrieves the <code>access-policy</code> subresource set on the vault; for more information on
     * setting this subresource, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-SetVaultAccessPolicy.html">Set Vault Access Policy
     * (PUT access-policy)</a>. If there is no access policy set on the vault, the operation returns a
     * <code>404 Not found</code> error. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param getVaultAccessPolicyRequest
     *        Input for GetVaultAccessPolicy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVaultAccessPolicy operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.GetVaultAccessPolicy
     */
    java.util.concurrent.Future<GetVaultAccessPolicyResult> getVaultAccessPolicyAsync(GetVaultAccessPolicyRequest getVaultAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetVaultAccessPolicyRequest, GetVaultAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * This operation retrieves the following attributes from the <code>lock-policy</code> subresource set on the
     * specified vault:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The vault lock policy set on the vault.
     * </p>
     * </li>
     * <li>
     * <p>
     * The state of the vault lock, which is either <code>InProgess</code> or <code>Locked</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the lock ID expires. The lock ID is used to complete the vault locking process.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the vault lock was initiated and put into the <code>InProgress</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. A vault lock is
     * put into the <code>Locked</code> state by calling <a>CompleteVaultLock</a>. You can abort the vault locking
     * process by calling <a>AbortVaultLock</a>. For more information about the vault locking process, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>.
     * </p>
     * <p>
     * If there is no vault lock policy set on the vault, the operation returns a <code>404 Not found</code> error. For
     * more information about vault lock policies, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * 
     * @param getVaultLockRequest
     *        The input values for <code>GetVaultLock</code>.
     * @return A Java Future containing the result of the GetVaultLock operation returned by the service.
     * @sample AmazonGlacierAsync.GetVaultLock
     */
    java.util.concurrent.Future<GetVaultLockResult> getVaultLockAsync(GetVaultLockRequest getVaultLockRequest);

    /**
     * <p>
     * This operation retrieves the following attributes from the <code>lock-policy</code> subresource set on the
     * specified vault:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The vault lock policy set on the vault.
     * </p>
     * </li>
     * <li>
     * <p>
     * The state of the vault lock, which is either <code>InProgess</code> or <code>Locked</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the lock ID expires. The lock ID is used to complete the vault locking process.
     * </p>
     * </li>
     * <li>
     * <p>
     * When the vault lock was initiated and put into the <code>InProgress</code> state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A vault lock is put into the <code>InProgress</code> state by calling <a>InitiateVaultLock</a>. A vault lock is
     * put into the <code>Locked</code> state by calling <a>CompleteVaultLock</a>. You can abort the vault locking
     * process by calling <a>AbortVaultLock</a>. For more information about the vault locking process, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>.
     * </p>
     * <p>
     * If there is no vault lock policy set on the vault, the operation returns a <code>404 Not found</code> error. For
     * more information about vault lock policies, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * 
     * @param getVaultLockRequest
     *        The input values for <code>GetVaultLock</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVaultLock operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.GetVaultLock
     */
    java.util.concurrent.Future<GetVaultLockResult> getVaultLockAsync(GetVaultLockRequest getVaultLockRequest,
            com.amazonaws.handlers.AsyncHandler<GetVaultLockRequest, GetVaultLockResult> asyncHandler);

    /**
     * <p>
     * This operation retrieves the <code>notification-configuration</code> subresource of the specified vault.
     * </p>
     * <p>
     * For information about setting a notification configuration on a vault, see <a>SetVaultNotifications</a>. If a
     * notification configuration for a vault is not set, the operation returns a <code>404 Not Found</code> error. For
     * more information about vault notifications, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a>.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-get.html">Get Vault
     * Notification Configuration </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param getVaultNotificationsRequest
     *        Provides options for retrieving the notification configuration set on an Amazon Glacier vault.
     * @return A Java Future containing the result of the GetVaultNotifications operation returned by the service.
     * @sample AmazonGlacierAsync.GetVaultNotifications
     */
    java.util.concurrent.Future<GetVaultNotificationsResult> getVaultNotificationsAsync(GetVaultNotificationsRequest getVaultNotificationsRequest);

    /**
     * <p>
     * This operation retrieves the <code>notification-configuration</code> subresource of the specified vault.
     * </p>
     * <p>
     * For information about setting a notification configuration on a vault, see <a>SetVaultNotifications</a>. If a
     * notification configuration for a vault is not set, the operation returns a <code>404 Not Found</code> error. For
     * more information about vault notifications, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a>.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-get.html">Get Vault
     * Notification Configuration </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param getVaultNotificationsRequest
     *        Provides options for retrieving the notification configuration set on an Amazon Glacier vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetVaultNotifications operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.GetVaultNotifications
     */
    java.util.concurrent.Future<GetVaultNotificationsResult> getVaultNotificationsAsync(GetVaultNotificationsRequest getVaultNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetVaultNotificationsRequest, GetVaultNotificationsResult> asyncHandler);

    /**
     * <p>
     * This operation initiates a job of the specified type, which can be a select, an archival retrieval, or a vault
     * retrieval. For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html">Initiate a Job</a>.
     * </p>
     * 
     * @param initiateJobRequest
     *        Provides options for initiating an Amazon Glacier job.
     * @return A Java Future containing the result of the InitiateJob operation returned by the service.
     * @sample AmazonGlacierAsync.InitiateJob
     */
    java.util.concurrent.Future<InitiateJobResult> initiateJobAsync(InitiateJobRequest initiateJobRequest);

    /**
     * <p>
     * This operation initiates a job of the specified type, which can be a select, an archival retrieval, or a vault
     * retrieval. For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-initiate-job-post.html">Initiate a Job</a>.
     * </p>
     * 
     * @param initiateJobRequest
     *        Provides options for initiating an Amazon Glacier job.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateJob operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.InitiateJob
     */
    java.util.concurrent.Future<InitiateJobResult> initiateJobAsync(InitiateJobRequest initiateJobRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateJobRequest, InitiateJobResult> asyncHandler);

    /**
     * <p>
     * This operation initiates a multipart upload. Amazon Glacier creates a multipart upload resource and returns its
     * ID in the response. The multipart upload ID is used in subsequent requests to upload parts of an archive (see
     * <a>UploadMultipartPart</a>).
     * </p>
     * <p>
     * When you initiate a multipart upload, you specify the part size in number of bytes. The part size must be a
     * megabyte (1024 KB) multiplied by a power of 2-for example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB),
     * 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB.
     * </p>
     * <p>
     * Every part you upload to this resource (see <a>UploadMultipartPart</a>), except the last one, must have the same
     * size. The last one can be the same size or smaller. For example, suppose you want to upload a 16.2 MB file. If
     * you initiate the multipart upload with a part size of 4 MB, you will upload four parts of 4 MB each and one part
     * of 0.2 MB.
     * </p>
     * <note>
     * <p>
     * You don't need to know the size of the archive when you start a multipart upload because Amazon Glacier does not
     * require you to specify the overall archive size.
     * </p>
     * </note>
     * <p>
     * After you complete the multipart upload, Amazon Glacier removes the multipart upload resource referenced by the
     * ID. Amazon Glacier also removes the multipart upload resource if you cancel the multipart upload or it may be
     * removed if there is no activity for a period of 24 hours.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-initiate-upload.html">Initiate Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param initiateMultipartUploadRequest
     *        Provides options for initiating a multipart upload to an Amazon Glacier vault.
     * @return A Java Future containing the result of the InitiateMultipartUpload operation returned by the service.
     * @sample AmazonGlacierAsync.InitiateMultipartUpload
     */
    java.util.concurrent.Future<InitiateMultipartUploadResult> initiateMultipartUploadAsync(InitiateMultipartUploadRequest initiateMultipartUploadRequest);

    /**
     * <p>
     * This operation initiates a multipart upload. Amazon Glacier creates a multipart upload resource and returns its
     * ID in the response. The multipart upload ID is used in subsequent requests to upload parts of an archive (see
     * <a>UploadMultipartPart</a>).
     * </p>
     * <p>
     * When you initiate a multipart upload, you specify the part size in number of bytes. The part size must be a
     * megabyte (1024 KB) multiplied by a power of 2-for example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB),
     * 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB.
     * </p>
     * <p>
     * Every part you upload to this resource (see <a>UploadMultipartPart</a>), except the last one, must have the same
     * size. The last one can be the same size or smaller. For example, suppose you want to upload a 16.2 MB file. If
     * you initiate the multipart upload with a part size of 4 MB, you will upload four parts of 4 MB each and one part
     * of 0.2 MB.
     * </p>
     * <note>
     * <p>
     * You don't need to know the size of the archive when you start a multipart upload because Amazon Glacier does not
     * require you to specify the overall archive size.
     * </p>
     * </note>
     * <p>
     * After you complete the multipart upload, Amazon Glacier removes the multipart upload resource referenced by the
     * ID. Amazon Glacier also removes the multipart upload resource if you cancel the multipart upload or it may be
     * removed if there is no activity for a period of 24 hours.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-initiate-upload.html">Initiate Multipart
     * Upload</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param initiateMultipartUploadRequest
     *        Provides options for initiating a multipart upload to an Amazon Glacier vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateMultipartUpload operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.InitiateMultipartUpload
     */
    java.util.concurrent.Future<InitiateMultipartUploadResult> initiateMultipartUploadAsync(InitiateMultipartUploadRequest initiateMultipartUploadRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateMultipartUploadRequest, InitiateMultipartUploadResult> asyncHandler);

    /**
     * <p>
     * This operation initiates the vault locking process by doing the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Installing a vault lock policy on the specified vault.
     * </p>
     * </li>
     * <li>
     * <p>
     * Setting the lock state of vault lock to <code>InProgress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returning a lock ID, which is used to complete the vault locking process.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can set one vault lock policy for each vault and this policy can be up to 20 KB in size. For more information
     * about vault lock policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * <p>
     * You must complete the vault locking process within 24 hours after the vault lock enters the
     * <code>InProgress</code> state. After the 24 hour window ends, the lock ID expires, the vault automatically exits
     * the <code>InProgress</code> state, and the vault lock policy is removed from the vault. You call
     * <a>CompleteVaultLock</a> to complete the vault locking process by setting the state of the vault lock to
     * <code>Locked</code>.
     * </p>
     * <p>
     * After a vault lock is in the <code>Locked</code> state, you cannot initiate a new vault lock for the vault.
     * </p>
     * <p>
     * You can abort the vault locking process by calling <a>AbortVaultLock</a>. You can get the state of the vault lock
     * by calling <a>GetVaultLock</a>. For more information about the vault locking process, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>.
     * </p>
     * <p>
     * If this operation is called when the vault lock is in the <code>InProgress</code> state, the operation returns an
     * <code>AccessDeniedException</code> error. When the vault lock is in the <code>InProgress</code> state you must
     * call <a>AbortVaultLock</a> before you can initiate a new vault lock policy.
     * </p>
     * 
     * @param initiateVaultLockRequest
     *        The input values for <code>InitiateVaultLock</code>.
     * @return A Java Future containing the result of the InitiateVaultLock operation returned by the service.
     * @sample AmazonGlacierAsync.InitiateVaultLock
     */
    java.util.concurrent.Future<InitiateVaultLockResult> initiateVaultLockAsync(InitiateVaultLockRequest initiateVaultLockRequest);

    /**
     * <p>
     * This operation initiates the vault locking process by doing the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Installing a vault lock policy on the specified vault.
     * </p>
     * </li>
     * <li>
     * <p>
     * Setting the lock state of vault lock to <code>InProgress</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returning a lock ID, which is used to complete the vault locking process.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can set one vault lock policy for each vault and this policy can be up to 20 KB in size. For more information
     * about vault lock policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html">Amazon Glacier Access Control
     * with Vault Lock Policies</a>.
     * </p>
     * <p>
     * You must complete the vault locking process within 24 hours after the vault lock enters the
     * <code>InProgress</code> state. After the 24 hour window ends, the lock ID expires, the vault automatically exits
     * the <code>InProgress</code> state, and the vault lock policy is removed from the vault. You call
     * <a>CompleteVaultLock</a> to complete the vault locking process by setting the state of the vault lock to
     * <code>Locked</code>.
     * </p>
     * <p>
     * After a vault lock is in the <code>Locked</code> state, you cannot initiate a new vault lock for the vault.
     * </p>
     * <p>
     * You can abort the vault locking process by calling <a>AbortVaultLock</a>. You can get the state of the vault lock
     * by calling <a>GetVaultLock</a>. For more information about the vault locking process, <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html">Amazon Glacier Vault Lock</a>.
     * </p>
     * <p>
     * If this operation is called when the vault lock is in the <code>InProgress</code> state, the operation returns an
     * <code>AccessDeniedException</code> error. When the vault lock is in the <code>InProgress</code> state you must
     * call <a>AbortVaultLock</a> before you can initiate a new vault lock policy.
     * </p>
     * 
     * @param initiateVaultLockRequest
     *        The input values for <code>InitiateVaultLock</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InitiateVaultLock operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.InitiateVaultLock
     */
    java.util.concurrent.Future<InitiateVaultLockResult> initiateVaultLockAsync(InitiateVaultLockRequest initiateVaultLockRequest,
            com.amazonaws.handlers.AsyncHandler<InitiateVaultLockRequest, InitiateVaultLockResult> asyncHandler);

    /**
     * <p>
     * This operation lists jobs for a vault, including jobs that are in-progress and jobs that have recently finished.
     * The List Job operation returns a list of these jobs sorted by job initiation time.
     * </p>
     * <note>
     * <p>
     * Amazon Glacier retains recently completed jobs for a period before deleting them; however, it eventually removes
     * completed jobs. The output of completed jobs can be retrieved. Retaining completed jobs for a period of time
     * after they have completed enables you to get a job output in the event you miss the job completion notification
     * or your first attempt to download it fails. For example, suppose you start an archive retrieval job to download
     * an archive. After the job completes, you start to download the archive but encounter a network error. In this
     * scenario, you can retry and download the archive while the job exists.
     * </p>
     * </note>
     * <p>
     * The List Jobs operation supports pagination. You should always check the response <code>Marker</code> field. If
     * there are no more jobs to list, the <code>Marker</code> field is set to <code>null</code>. If there are more jobs
     * to list, the <code>Marker</code> field is set to a non-null value, which you can use to continue the pagination
     * of the list. To return a list of jobs that begins at a specific job, set the marker request parameter to the
     * <code>Marker</code> value for that job that you obtained from a previous List Jobs request.
     * </p>
     * <p>
     * You can set a maximum limit for the number of jobs returned in the response by specifying the <code>limit</code>
     * parameter in the request. The default limit is 50. The number of jobs returned might be fewer than the limit, but
     * the number of returned jobs never exceeds the limit.
     * </p>
     * <p>
     * Additionally, you can filter the jobs list returned by specifying the optional <code>statuscode</code> parameter
     * or <code>completed</code> parameter, or both. Using the <code>statuscode</code> parameter, you can specify to
     * return only jobs that match either the <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>
     * status. Using the <code>completed</code> parameter, you can specify to return only jobs that were completed (
     * <code>true</code>) or jobs that were not completed (<code>false</code>).
     * </p>
     * <p>
     * For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-jobs-get.html">List Jobs</a>.
     * </p>
     * 
     * @param listJobsRequest
     *        Provides options for retrieving a job list for an Amazon Glacier vault.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AmazonGlacierAsync.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest);

    /**
     * <p>
     * This operation lists jobs for a vault, including jobs that are in-progress and jobs that have recently finished.
     * The List Job operation returns a list of these jobs sorted by job initiation time.
     * </p>
     * <note>
     * <p>
     * Amazon Glacier retains recently completed jobs for a period before deleting them; however, it eventually removes
     * completed jobs. The output of completed jobs can be retrieved. Retaining completed jobs for a period of time
     * after they have completed enables you to get a job output in the event you miss the job completion notification
     * or your first attempt to download it fails. For example, suppose you start an archive retrieval job to download
     * an archive. After the job completes, you start to download the archive but encounter a network error. In this
     * scenario, you can retry and download the archive while the job exists.
     * </p>
     * </note>
     * <p>
     * The List Jobs operation supports pagination. You should always check the response <code>Marker</code> field. If
     * there are no more jobs to list, the <code>Marker</code> field is set to <code>null</code>. If there are more jobs
     * to list, the <code>Marker</code> field is set to a non-null value, which you can use to continue the pagination
     * of the list. To return a list of jobs that begins at a specific job, set the marker request parameter to the
     * <code>Marker</code> value for that job that you obtained from a previous List Jobs request.
     * </p>
     * <p>
     * You can set a maximum limit for the number of jobs returned in the response by specifying the <code>limit</code>
     * parameter in the request. The default limit is 50. The number of jobs returned might be fewer than the limit, but
     * the number of returned jobs never exceeds the limit.
     * </p>
     * <p>
     * Additionally, you can filter the jobs list returned by specifying the optional <code>statuscode</code> parameter
     * or <code>completed</code> parameter, or both. Using the <code>statuscode</code> parameter, you can specify to
     * return only jobs that match either the <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>
     * status. Using the <code>completed</code> parameter, you can specify to return only jobs that were completed (
     * <code>true</code>) or jobs that were not completed (<code>false</code>).
     * </p>
     * <p>
     * For more information about using this operation, see the documentation for the underlying REST API <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-jobs-get.html">List Jobs</a>.
     * </p>
     * 
     * @param listJobsRequest
     *        Provides options for retrieving a job list for an Amazon Glacier vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListJobs operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.ListJobs
     */
    java.util.concurrent.Future<ListJobsResult> listJobsAsync(ListJobsRequest listJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler);

    /**
     * <p>
     * This operation lists in-progress multipart uploads for the specified vault. An in-progress multipart upload is a
     * multipart upload that has been initiated by an <a>InitiateMultipartUpload</a> request, but has not yet been
     * completed or aborted. The list returned in the List Multipart Upload response has no guaranteed order.
     * </p>
     * <p>
     * The List Multipart Uploads operation supports pagination. By default, this operation returns up to 50 multipart
     * uploads in the response. You should always check the response for a <code>marker</code> at which to continue the
     * list; if there are no more items the <code>marker</code> is <code>null</code>. To return a list of multipart
     * uploads that begins at a specific upload, set the <code>marker</code> request parameter to the value you obtained
     * from a previous List Multipart Upload request. You can also limit the number of uploads returned in the response
     * by specifying the <code>limit</code> parameter in the request.
     * </p>
     * <p>
     * Note the difference between this operation and listing parts (<a>ListParts</a>). The List Multipart Uploads
     * operation lists all multipart uploads for a vault and does not require a multipart upload ID. The List Parts
     * operation requires a multipart upload ID since parts are associated with a single upload.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-uploads.html">List Multipart Uploads
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listMultipartUploadsRequest
     *        Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.
     * @return A Java Future containing the result of the ListMultipartUploads operation returned by the service.
     * @sample AmazonGlacierAsync.ListMultipartUploads
     */
    java.util.concurrent.Future<ListMultipartUploadsResult> listMultipartUploadsAsync(ListMultipartUploadsRequest listMultipartUploadsRequest);

    /**
     * <p>
     * This operation lists in-progress multipart uploads for the specified vault. An in-progress multipart upload is a
     * multipart upload that has been initiated by an <a>InitiateMultipartUpload</a> request, but has not yet been
     * completed or aborted. The list returned in the List Multipart Upload response has no guaranteed order.
     * </p>
     * <p>
     * The List Multipart Uploads operation supports pagination. By default, this operation returns up to 50 multipart
     * uploads in the response. You should always check the response for a <code>marker</code> at which to continue the
     * list; if there are no more items the <code>marker</code> is <code>null</code>. To return a list of multipart
     * uploads that begins at a specific upload, set the <code>marker</code> request parameter to the value you obtained
     * from a previous List Multipart Upload request. You can also limit the number of uploads returned in the response
     * by specifying the <code>limit</code> parameter in the request.
     * </p>
     * <p>
     * Note the difference between this operation and listing parts (<a>ListParts</a>). The List Multipart Uploads
     * operation lists all multipart uploads for a vault and does not require a multipart upload ID. The List Parts
     * operation requires a multipart upload ID since parts are associated with a single upload.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-uploads.html">List Multipart Uploads
     * </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listMultipartUploadsRequest
     *        Provides options for retrieving list of in-progress multipart uploads for an Amazon Glacier vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMultipartUploads operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.ListMultipartUploads
     */
    java.util.concurrent.Future<ListMultipartUploadsResult> listMultipartUploadsAsync(ListMultipartUploadsRequest listMultipartUploadsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMultipartUploadsRequest, ListMultipartUploadsResult> asyncHandler);

    /**
     * <p>
     * This operation lists the parts of an archive that have been uploaded in a specific multipart upload. You can make
     * this request at any time during an in-progress multipart upload before you complete the upload (see
     * <a>CompleteMultipartUpload</a>. List Parts returns an error for completed uploads. The list returned in the List
     * Parts response is sorted by part range.
     * </p>
     * <p>
     * The List Parts operation supports pagination. By default, this operation returns up to 50 uploaded parts in the
     * response. You should always check the response for a <code>marker</code> at which to continue the list; if there
     * are no more items the <code>marker</code> is <code>null</code>. To return a list of parts that begins at a
     * specific part, set the <code>marker</code> request parameter to the value you obtained from a previous List Parts
     * request. You can also limit the number of parts returned in the response by specifying the <code>limit</code>
     * parameter in the request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-parts.html">List Parts</a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listPartsRequest
     *        Provides options for retrieving a list of parts of an archive that have been uploaded in a specific
     *        multipart upload.
     * @return A Java Future containing the result of the ListParts operation returned by the service.
     * @sample AmazonGlacierAsync.ListParts
     */
    java.util.concurrent.Future<ListPartsResult> listPartsAsync(ListPartsRequest listPartsRequest);

    /**
     * <p>
     * This operation lists the parts of an archive that have been uploaded in a specific multipart upload. You can make
     * this request at any time during an in-progress multipart upload before you complete the upload (see
     * <a>CompleteMultipartUpload</a>. List Parts returns an error for completed uploads. The list returned in the List
     * Parts response is sorted by part range.
     * </p>
     * <p>
     * The List Parts operation supports pagination. By default, this operation returns up to 50 uploaded parts in the
     * response. You should always check the response for a <code>marker</code> at which to continue the list; if there
     * are no more items the <code>marker</code> is <code>null</code>. To return a list of parts that begins at a
     * specific part, set the <code>marker</code> request parameter to the value you obtained from a previous List Parts
     * request. You can also limit the number of parts returned in the response by specifying the <code>limit</code>
     * parameter in the request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and the underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/working-with-archives.html">Working with Archives in
     * Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-multipart-list-parts.html">List Parts</a> in the
     * <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listPartsRequest
     *        Provides options for retrieving a list of parts of an archive that have been uploaded in a specific
     *        multipart upload.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListParts operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.ListParts
     */
    java.util.concurrent.Future<ListPartsResult> listPartsAsync(ListPartsRequest listPartsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPartsRequest, ListPartsResult> asyncHandler);

    /**
     * <p>
     * This operation lists the provisioned capacity units for the specified AWS account.
     * </p>
     * 
     * @param listProvisionedCapacityRequest
     * @return A Java Future containing the result of the ListProvisionedCapacity operation returned by the service.
     * @sample AmazonGlacierAsync.ListProvisionedCapacity
     */
    java.util.concurrent.Future<ListProvisionedCapacityResult> listProvisionedCapacityAsync(ListProvisionedCapacityRequest listProvisionedCapacityRequest);

    /**
     * <p>
     * This operation lists the provisioned capacity units for the specified AWS account.
     * </p>
     * 
     * @param listProvisionedCapacityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProvisionedCapacity operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.ListProvisionedCapacity
     */
    java.util.concurrent.Future<ListProvisionedCapacityResult> listProvisionedCapacityAsync(ListProvisionedCapacityRequest listProvisionedCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<ListProvisionedCapacityRequest, ListProvisionedCapacityResult> asyncHandler);

    /**
     * <p>
     * This operation lists all the tags attached to a vault. The operation returns an empty map if there are no tags.
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier Resources</a>.
     * </p>
     * 
     * @param listTagsForVaultRequest
     *        The input value for <code>ListTagsForVaultInput</code>.
     * @return A Java Future containing the result of the ListTagsForVault operation returned by the service.
     * @sample AmazonGlacierAsync.ListTagsForVault
     */
    java.util.concurrent.Future<ListTagsForVaultResult> listTagsForVaultAsync(ListTagsForVaultRequest listTagsForVaultRequest);

    /**
     * <p>
     * This operation lists all the tags attached to a vault. The operation returns an empty map if there are no tags.
     * For more information about tags, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier Resources</a>.
     * </p>
     * 
     * @param listTagsForVaultRequest
     *        The input value for <code>ListTagsForVaultInput</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForVault operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.ListTagsForVault
     */
    java.util.concurrent.Future<ListTagsForVaultResult> listTagsForVaultAsync(ListTagsForVaultRequest listTagsForVaultRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForVaultRequest, ListTagsForVaultResult> asyncHandler);

    /**
     * <p>
     * This operation lists all vaults owned by the calling user's account. The list returned in the response is
     * ASCII-sorted by vault name.
     * </p>
     * <p>
     * By default, this operation returns up to 10 items. If there are more vaults to list, the response
     * <code>marker</code> field contains the vault Amazon Resource Name (ARN) at which to continue the list with a new
     * List Vaults request; otherwise, the <code>marker</code> field is <code>null</code>. To return a list of vaults
     * that begins at a specific vault, set the <code>marker</code> request parameter to the vault ARN you obtained from
     * a previous List Vaults request. You can also limit the number of vaults returned in the response by specifying
     * the <code>limit</code> parameter in the request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/retrieving-vault-info.html">Retrieving Vault Metadata
     * in Amazon Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vaults-get.html">List
     * Vaults </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listVaultsRequest
     *        Provides options to retrieve the vault list owned by the calling user's account. The list provides
     *        metadata information for each vault.
     * @return A Java Future containing the result of the ListVaults operation returned by the service.
     * @sample AmazonGlacierAsync.ListVaults
     */
    java.util.concurrent.Future<ListVaultsResult> listVaultsAsync(ListVaultsRequest listVaultsRequest);

    /**
     * <p>
     * This operation lists all vaults owned by the calling user's account. The list returned in the response is
     * ASCII-sorted by vault name.
     * </p>
     * <p>
     * By default, this operation returns up to 10 items. If there are more vaults to list, the response
     * <code>marker</code> field contains the vault Amazon Resource Name (ARN) at which to continue the list with a new
     * List Vaults request; otherwise, the <code>marker</code> field is <code>null</code>. To return a list of vaults
     * that begins at a specific vault, set the <code>marker</code> request parameter to the vault ARN you obtained from
     * a previous List Vaults request. You can also limit the number of vaults returned in the response by specifying
     * the <code>limit</code> parameter in the request.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/retrieving-vault-info.html">Retrieving Vault Metadata
     * in Amazon Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vaults-get.html">List
     * Vaults </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param listVaultsRequest
     *        Provides options to retrieve the vault list owned by the calling user's account. The list provides
     *        metadata information for each vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVaults operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.ListVaults
     */
    java.util.concurrent.Future<ListVaultsResult> listVaultsAsync(ListVaultsRequest listVaultsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVaultsRequest, ListVaultsResult> asyncHandler);

    /**
     * <p>
     * This operation purchases a provisioned capacity unit for an AWS account.
     * </p>
     * 
     * @param purchaseProvisionedCapacityRequest
     * @return A Java Future containing the result of the PurchaseProvisionedCapacity operation returned by the service.
     * @sample AmazonGlacierAsync.PurchaseProvisionedCapacity
     */
    java.util.concurrent.Future<PurchaseProvisionedCapacityResult> purchaseProvisionedCapacityAsync(
            PurchaseProvisionedCapacityRequest purchaseProvisionedCapacityRequest);

    /**
     * <p>
     * This operation purchases a provisioned capacity unit for an AWS account.
     * </p>
     * 
     * @param purchaseProvisionedCapacityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PurchaseProvisionedCapacity operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.PurchaseProvisionedCapacity
     */
    java.util.concurrent.Future<PurchaseProvisionedCapacityResult> purchaseProvisionedCapacityAsync(
            PurchaseProvisionedCapacityRequest purchaseProvisionedCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<PurchaseProvisionedCapacityRequest, PurchaseProvisionedCapacityResult> asyncHandler);

    /**
     * <p>
     * This operation removes one or more tags from the set of tags attached to a vault. For more information about
     * tags, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier
     * Resources</a>. This operation is idempotent. The operation will be successful, even if there are no tags attached
     * to the vault.
     * </p>
     * 
     * @param removeTagsFromVaultRequest
     *        The input value for <code>RemoveTagsFromVaultInput</code>.
     * @return A Java Future containing the result of the RemoveTagsFromVault operation returned by the service.
     * @sample AmazonGlacierAsync.RemoveTagsFromVault
     */
    java.util.concurrent.Future<RemoveTagsFromVaultResult> removeTagsFromVaultAsync(RemoveTagsFromVaultRequest removeTagsFromVaultRequest);

    /**
     * <p>
     * This operation removes one or more tags from the set of tags attached to a vault. For more information about
     * tags, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html">Tagging Amazon Glacier
     * Resources</a>. This operation is idempotent. The operation will be successful, even if there are no tags attached
     * to the vault.
     * </p>
     * 
     * @param removeTagsFromVaultRequest
     *        The input value for <code>RemoveTagsFromVaultInput</code>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTagsFromVault operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.RemoveTagsFromVault
     */
    java.util.concurrent.Future<RemoveTagsFromVaultResult> removeTagsFromVaultAsync(RemoveTagsFromVaultRequest removeTagsFromVaultRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromVaultRequest, RemoveTagsFromVaultResult> asyncHandler);

    /**
     * <p>
     * This operation sets and then enacts a data retrieval policy in the region specified in the PUT request. You can
     * set one policy per region for an AWS account. The policy is enacted within a few minutes of a successful PUT
     * operation.
     * </p>
     * <p>
     * The set policy operation does not affect retrieval jobs that were in progress before the policy was enacted. For
     * more information about data retrieval policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html">Amazon Glacier Data
     * Retrieval Policies</a>.
     * </p>
     * 
     * @param setDataRetrievalPolicyRequest
     *        SetDataRetrievalPolicy input.
     * @return A Java Future containing the result of the SetDataRetrievalPolicy operation returned by the service.
     * @sample AmazonGlacierAsync.SetDataRetrievalPolicy
     */
    java.util.concurrent.Future<SetDataRetrievalPolicyResult> setDataRetrievalPolicyAsync(SetDataRetrievalPolicyRequest setDataRetrievalPolicyRequest);

    /**
     * <p>
     * This operation sets and then enacts a data retrieval policy in the region specified in the PUT request. You can
     * set one policy per region for an AWS account. The policy is enacted within a few minutes of a successful PUT
     * operation.
     * </p>
     * <p>
     * The set policy operation does not affect retrieval jobs that were in progress before the policy was enacted. For
     * more information about data retrieval policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html">Amazon Glacier Data
     * Retrieval Policies</a>.
     * </p>
     * 
     * @param setDataRetrievalPolicyRequest
     *        SetDataRetrievalPolicy input.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetDataRetrievalPolicy operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.SetDataRetrievalPolicy
     */
    java.util.concurrent.Future<SetDataRetrievalPolicyResult> setDataRetrievalPolicyAsync(SetDataRetrievalPolicyRequest setDataRetrievalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SetDataRetrievalPolicyRequest, SetDataRetrievalPolicyResult> asyncHandler);

    /**
     * <p>
     * This operation configures an access policy for a vault and will overwrite an existing policy. To configure a
     * vault access policy, send a PUT request to the <code>access-policy</code> subresource of the vault. An access
     * policy is specific to a vault and is also called a vault subresource. You can set one access policy per vault and
     * the policy can be up to 20 KB in size. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param setVaultAccessPolicyRequest
     *        SetVaultAccessPolicy input.
     * @return A Java Future containing the result of the SetVaultAccessPolicy operation returned by the service.
     * @sample AmazonGlacierAsync.SetVaultAccessPolicy
     */
    java.util.concurrent.Future<SetVaultAccessPolicyResult> setVaultAccessPolicyAsync(SetVaultAccessPolicyRequest setVaultAccessPolicyRequest);

    /**
     * <p>
     * This operation configures an access policy for a vault and will overwrite an existing policy. To configure a
     * vault access policy, send a PUT request to the <code>access-policy</code> subresource of the vault. An access
     * policy is specific to a vault and is also called a vault subresource. You can set one access policy per vault and
     * the policy can be up to 20 KB in size. For more information about vault access policies, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html">Amazon Glacier Access Control
     * with Vault Access Policies</a>.
     * </p>
     * 
     * @param setVaultAccessPolicyRequest
     *        SetVaultAccessPolicy input.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetVaultAccessPolicy operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.SetVaultAccessPolicy
     */
    java.util.concurrent.Future<SetVaultAccessPolicyResult> setVaultAccessPolicyAsync(SetVaultAccessPolicyRequest setVaultAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SetVaultAccessPolicyRequest, SetVaultAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * This operation configures notifications that will be sent when specific events happen to a vault. By default, you
     * don't get any notifications.
     * </p>
     * <p>
     * To configure vault notifications, send a PUT request to the <code>notification-configuration</code> subresource
     * of the vault. The request should include a JSON document that provides an Amazon SNS topic and specific events
     * for which you want Amazon Glacier to send notifications to the topic.
     * </p>
     * <p>
     * Amazon SNS topics must grant permission to the vault to be allowed to publish notifications to the topic. You can
     * configure a vault to publish a notification for the following vault events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ArchiveRetrievalCompleted</b> This event occurs when a job that was initiated for an archive retrieval is
     * completed (<a>InitiateJob</a>). The status of the completed job can be "Succeeded" or "Failed". The notification
     * sent to the SNS topic is the same output as returned from <a>DescribeJob</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InventoryRetrievalCompleted</b> This event occurs when a job that was initiated for an inventory retrieval is
     * completed (<a>InitiateJob</a>). The status of the completed job can be "Succeeded" or "Failed". The notification
     * sent to the SNS topic is the same output as returned from <a>DescribeJob</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-put.html">Set Vault
     * Notification Configuration </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param setVaultNotificationsRequest
     *        Provides options to configure notifications that will be sent when specific events happen to a vault.
     * @return A Java Future containing the result of the SetVaultNotifications operation returned by the service.
     * @sample AmazonGlacierAsync.SetVaultNotifications
     */
    java.util.concurrent.Future<SetVaultNotificationsResult> setVaultNotificationsAsync(SetVaultNotificationsRequest setVaultNotificationsRequest);

    /**
     * <p>
     * This operation configures notifications that will be sent when specific events happen to a vault. By default, you
     * don't get any notifications.
     * </p>
     * <p>
     * To configure vault notifications, send a PUT request to the <code>notification-configuration</code> subresource
     * of the vault. The request should include a JSON document that provides an Amazon SNS topic and specific events
     * for which you want Amazon Glacier to send notifications to the topic.
     * </p>
     * <p>
     * Amazon SNS topics must grant permission to the vault to be allowed to publish notifications to the topic. You can
     * configure a vault to publish a notification for the following vault events:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ArchiveRetrievalCompleted</b> This event occurs when a job that was initiated for an archive retrieval is
     * completed (<a>InitiateJob</a>). The status of the completed job can be "Succeeded" or "Failed". The notification
     * sent to the SNS topic is the same output as returned from <a>DescribeJob</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>InventoryRetrievalCompleted</b> This event occurs when a job that was initiated for an inventory retrieval is
     * completed (<a>InitiateJob</a>). The status of the completed job can be "Succeeded" or "Failed". The notification
     * sent to the SNS topic is the same output as returned from <a>DescribeJob</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/configuring-notifications.html">Configuring Vault
     * Notifications in Amazon Glacier</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-vault-notifications-put.html">Set Vault
     * Notification Configuration </a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param setVaultNotificationsRequest
     *        Provides options to configure notifications that will be sent when specific events happen to a vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SetVaultNotifications operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.SetVaultNotifications
     */
    java.util.concurrent.Future<SetVaultNotificationsResult> setVaultNotificationsAsync(SetVaultNotificationsRequest setVaultNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<SetVaultNotificationsRequest, SetVaultNotificationsResult> asyncHandler);

    /**
     * <p>
     * This operation adds an archive to a vault. This is a synchronous operation, and for a successful upload, your
     * data is durably persisted. Amazon Glacier returns the archive ID in the <code>x-amz-archive-id</code> header of
     * the response.
     * </p>
     * <p>
     * You must use the archive ID to access your data in Amazon Glacier. After you upload an archive, you should save
     * the archive ID returned so that you can retrieve or delete the archive later. Besides saving the archive ID, you
     * can also index it and give it a friendly name to allow for better searching. You can also use the optional
     * archive description field to specify how the archive is referred to in an external index of archives, such as you
     * might create in Amazon DynamoDB. You can also get the vault inventory to obtain a list of archive IDs in a vault.
     * For more information, see <a>InitiateJob</a>.
     * </p>
     * <p>
     * You must provide a SHA256 tree hash of the data you are uploading. For information about computing a SHA256 tree
     * hash, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing
     * Checksums</a>.
     * </p>
     * <p>
     * You can optionally specify an archive description of up to 1,024 printable ASCII characters. You can get the
     * archive description when you either retrieve the archive or get the vault inventory. For more information, see
     * <a>InitiateJob</a>. Amazon Glacier does not interpret the description in any way. An archive description does not
     * need to be unique. You cannot use the description to retrieve or sort the archive list.
     * </p>
     * <p>
     * Archives are immutable. After you upload an archive, you cannot edit the archive or its description.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-an-archive.html">Uploading an Archive in
     * Amazon Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html">Upload
     * Archive</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param uploadArchiveRequest
     *        Provides options to add an archive to a vault.
     * @return A Java Future containing the result of the UploadArchive operation returned by the service.
     * @sample AmazonGlacierAsync.UploadArchive
     */
    java.util.concurrent.Future<UploadArchiveResult> uploadArchiveAsync(UploadArchiveRequest uploadArchiveRequest);

    /**
     * <p>
     * This operation adds an archive to a vault. This is a synchronous operation, and for a successful upload, your
     * data is durably persisted. Amazon Glacier returns the archive ID in the <code>x-amz-archive-id</code> header of
     * the response.
     * </p>
     * <p>
     * You must use the archive ID to access your data in Amazon Glacier. After you upload an archive, you should save
     * the archive ID returned so that you can retrieve or delete the archive later. Besides saving the archive ID, you
     * can also index it and give it a friendly name to allow for better searching. You can also use the optional
     * archive description field to specify how the archive is referred to in an external index of archives, such as you
     * might create in Amazon DynamoDB. You can also get the vault inventory to obtain a list of archive IDs in a vault.
     * For more information, see <a>InitiateJob</a>.
     * </p>
     * <p>
     * You must provide a SHA256 tree hash of the data you are uploading. For information about computing a SHA256 tree
     * hash, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing
     * Checksums</a>.
     * </p>
     * <p>
     * You can optionally specify an archive description of up to 1,024 printable ASCII characters. You can get the
     * archive description when you either retrieve the archive or get the vault inventory. For more information, see
     * <a>InitiateJob</a>. Amazon Glacier does not interpret the description in any way. An archive description does not
     * need to be unique. You cannot use the description to retrieve or sort the archive list.
     * </p>
     * <p>
     * Archives are immutable. After you upload an archive, you cannot edit the archive or its description.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-an-archive.html">Uploading an Archive in
     * Amazon Glacier</a> and <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-archive-post.html">Upload
     * Archive</a> in the <i>Amazon Glacier Developer Guide</i>.
     * </p>
     * 
     * @param uploadArchiveRequest
     *        Provides options to add an archive to a vault.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadArchive operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.UploadArchive
     */
    java.util.concurrent.Future<UploadArchiveResult> uploadArchiveAsync(UploadArchiveRequest uploadArchiveRequest,
            com.amazonaws.handlers.AsyncHandler<UploadArchiveRequest, UploadArchiveResult> asyncHandler);

    /**
     * <p>
     * This operation uploads a part of an archive. You can upload archive parts in any order. You can also upload them
     * in parallel. You can upload up to 10,000 parts for a multipart upload.
     * </p>
     * <p>
     * Amazon Glacier rejects your upload part request if any of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SHA256 tree hash does not match</b>To ensure that part data is not corrupted in transmission, you compute a
     * SHA256 tree hash of the part and include it in your request. Upon receiving the part data, Amazon Glacier also
     * computes a SHA256 tree hash. If these hash values don't match, the operation fails. For information about
     * computing a SHA256 tree hash, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing Checksums</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Part size does not match</b>The size of each part except the last must match the size specified in the
     * corresponding <a>InitiateMultipartUpload</a> request. The size of the last part must be the same size as, or
     * smaller than, the specified size.
     * </p>
     * <note>
     * <p>
     * If you upload a part whose size is smaller than the part size you specified in your initiate multipart upload
     * request and that part is not the last part, then the upload part request will succeed. However, the subsequent
     * Complete Multipart Upload request will fail.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b>Range does not align</b>The byte range value in the request does not align with the part size specified in the
     * corresponding initiate request. For example, if you specify a part size of 4194304 bytes (4 MB), then 0 to
     * 4194303 bytes (4 MB - 1) and 4194304 (4 MB) to 8388607 (8 MB - 1) are valid part ranges. However, if you set a
     * range value of 2 MB to 6 MB, the range does not align with the part size and the upload will fail.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent. If you upload the same part multiple times, the data included in the most recent
     * request overwrites the previously uploaded data.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-upload-part.html">Upload Part </a> in the <i>Amazon
     * Glacier Developer Guide</i>.
     * </p>
     * 
     * @param uploadMultipartPartRequest
     *        Provides options to upload a part of an archive in a multipart upload operation.
     * @return A Java Future containing the result of the UploadMultipartPart operation returned by the service.
     * @sample AmazonGlacierAsync.UploadMultipartPart
     */
    java.util.concurrent.Future<UploadMultipartPartResult> uploadMultipartPartAsync(UploadMultipartPartRequest uploadMultipartPartRequest);

    /**
     * <p>
     * This operation uploads a part of an archive. You can upload archive parts in any order. You can also upload them
     * in parallel. You can upload up to 10,000 parts for a multipart upload.
     * </p>
     * <p>
     * Amazon Glacier rejects your upload part request if any of the following conditions is true:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SHA256 tree hash does not match</b>To ensure that part data is not corrupted in transmission, you compute a
     * SHA256 tree hash of the part and include it in your request. Upon receiving the part data, Amazon Glacier also
     * computes a SHA256 tree hash. If these hash values don't match, the operation fails. For information about
     * computing a SHA256 tree hash, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/checksum-calculations.html">Computing Checksums</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Part size does not match</b>The size of each part except the last must match the size specified in the
     * corresponding <a>InitiateMultipartUpload</a> request. The size of the last part must be the same size as, or
     * smaller than, the specified size.
     * </p>
     * <note>
     * <p>
     * If you upload a part whose size is smaller than the part size you specified in your initiate multipart upload
     * request and that part is not the last part, then the upload part request will succeed. However, the subsequent
     * Complete Multipart Upload request will fail.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b>Range does not align</b>The byte range value in the request does not align with the part size specified in the
     * corresponding initiate request. For example, if you specify a part size of 4194304 bytes (4 MB), then 0 to
     * 4194303 bytes (4 MB - 1) and 4194304 (4 MB) to 8388607 (8 MB - 1) are valid part ranges. However, if you set a
     * range value of 2 MB to 6 MB, the range does not align with the part size and the upload will fail.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation is idempotent. If you upload the same part multiple times, the data included in the most recent
     * request overwrites the previously uploaded data.
     * </p>
     * <p>
     * An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access
     * Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform
     * specific actions. For more information, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/using-iam-with-amazon-glacier.html">Access Control
     * Using AWS Identity and Access Management (IAM)</a>.
     * </p>
     * <p>
     * For conceptual information and underlying REST API, see <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/uploading-archive-mpu.html">Uploading Large Archives in
     * Parts (Multipart Upload)</a> and <a
     * href="http://docs.aws.amazon.com/amazonglacier/latest/dev/api-upload-part.html">Upload Part </a> in the <i>Amazon
     * Glacier Developer Guide</i>.
     * </p>
     * 
     * @param uploadMultipartPartRequest
     *        Provides options to upload a part of an archive in a multipart upload operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadMultipartPart operation returned by the service.
     * @sample AmazonGlacierAsyncHandler.UploadMultipartPart
     */
    java.util.concurrent.Future<UploadMultipartPartResult> uploadMultipartPartAsync(UploadMultipartPartRequest uploadMultipartPartRequest,
            com.amazonaws.handlers.AsyncHandler<UploadMultipartPartRequest, UploadMultipartPartResult> asyncHandler);

}
