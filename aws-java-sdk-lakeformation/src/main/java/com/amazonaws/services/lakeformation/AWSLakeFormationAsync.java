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
package com.amazonaws.services.lakeformation;

import javax.annotation.Generated;

import com.amazonaws.services.lakeformation.model.*;

/**
 * Interface for accessing AWS Lake Formation asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lakeformation.AbstractAWSLakeFormationAsync} instead.
 * </p>
 * <p>
 * <fullname>Lake Formation</fullname>
 * <p>
 * Defines the public endpoint for the Lake Formation service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLakeFormationAsync extends AWSLakeFormation {

    /**
     * <p>
     * Attaches one or more LF-tags to an existing resource.
     * </p>
     * 
     * @param addLFTagsToResourceRequest
     * @return A Java Future containing the result of the AddLFTagsToResource operation returned by the service.
     * @sample AWSLakeFormationAsync.AddLFTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest addLFTagsToResourceRequest);

    /**
     * <p>
     * Attaches one or more LF-tags to an existing resource.
     * </p>
     * 
     * @param addLFTagsToResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddLFTagsToResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.AddLFTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddLFTagsToResourceResult> addLFTagsToResourceAsync(AddLFTagsToResourceRequest addLFTagsToResourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddLFTagsToResourceRequest, AddLFTagsToResourceResult> asyncHandler);

    /**
     * <p>
     * Allows a caller to assume an IAM role decorated as the SAML user specified in the SAML assertion included in the
     * request. This decoration allows Lake Formation to enforce access policies against the SAML users and groups. This
     * API operation requires SAML federation setup in the caller’s account as it can only be called with valid SAML
     * assertions. Lake Formation does not scope down the permission of the assumed role. All permissions attached to
     * the role via the SAML federation setup will be included in the role session.
     * </p>
     * <p>
     * This decorated role is expected to access data in Amazon S3 by getting temporary access from Lake Formation which
     * is authorized via the virtual API <code>GetDataAccess</code>. Therefore, all SAML roles that can be assumed via
     * <code>AssumeDecoratedRoleWithSAML</code> must at a minimum include <code>lakeformation:GetDataAccess</code> in
     * their role policies. A typical IAM policy attached to such a role would look as follows:
     * </p>
     * 
     * @param assumeDecoratedRoleWithSAMLRequest
     * @return A Java Future containing the result of the AssumeDecoratedRoleWithSAML operation returned by the service.
     * @sample AWSLakeFormationAsync.AssumeDecoratedRoleWithSAML
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AssumeDecoratedRoleWithSAML"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeDecoratedRoleWithSAMLResult> assumeDecoratedRoleWithSAMLAsync(
            AssumeDecoratedRoleWithSAMLRequest assumeDecoratedRoleWithSAMLRequest);

    /**
     * <p>
     * Allows a caller to assume an IAM role decorated as the SAML user specified in the SAML assertion included in the
     * request. This decoration allows Lake Formation to enforce access policies against the SAML users and groups. This
     * API operation requires SAML federation setup in the caller’s account as it can only be called with valid SAML
     * assertions. Lake Formation does not scope down the permission of the assumed role. All permissions attached to
     * the role via the SAML federation setup will be included in the role session.
     * </p>
     * <p>
     * This decorated role is expected to access data in Amazon S3 by getting temporary access from Lake Formation which
     * is authorized via the virtual API <code>GetDataAccess</code>. Therefore, all SAML roles that can be assumed via
     * <code>AssumeDecoratedRoleWithSAML</code> must at a minimum include <code>lakeformation:GetDataAccess</code> in
     * their role policies. A typical IAM policy attached to such a role would look as follows:
     * </p>
     * 
     * @param assumeDecoratedRoleWithSAMLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssumeDecoratedRoleWithSAML operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.AssumeDecoratedRoleWithSAML
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AssumeDecoratedRoleWithSAML"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssumeDecoratedRoleWithSAMLResult> assumeDecoratedRoleWithSAMLAsync(
            AssumeDecoratedRoleWithSAMLRequest assumeDecoratedRoleWithSAMLRequest,
            com.amazonaws.handlers.AsyncHandler<AssumeDecoratedRoleWithSAMLRequest, AssumeDecoratedRoleWithSAMLResult> asyncHandler);

    /**
     * <p>
     * Batch operation to grant permissions to the principal.
     * </p>
     * 
     * @param batchGrantPermissionsRequest
     * @return A Java Future containing the result of the BatchGrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.BatchGrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchGrantPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest batchGrantPermissionsRequest);

    /**
     * <p>
     * Batch operation to grant permissions to the principal.
     * </p>
     * 
     * @param batchGrantPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.BatchGrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchGrantPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGrantPermissionsResult> batchGrantPermissionsAsync(BatchGrantPermissionsRequest batchGrantPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGrantPermissionsRequest, BatchGrantPermissionsResult> asyncHandler);

    /**
     * <p>
     * Batch operation to revoke permissions from the principal.
     * </p>
     * 
     * @param batchRevokePermissionsRequest
     * @return A Java Future containing the result of the BatchRevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.BatchRevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest batchRevokePermissionsRequest);

    /**
     * <p>
     * Batch operation to revoke permissions from the principal.
     * </p>
     * 
     * @param batchRevokePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchRevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.BatchRevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchRevokePermissionsResult> batchRevokePermissionsAsync(BatchRevokePermissionsRequest batchRevokePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchRevokePermissionsRequest, BatchRevokePermissionsResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel the specified transaction. Returns an exception if the transaction was previously committed.
     * </p>
     * 
     * @param cancelTransactionRequest
     * @return A Java Future containing the result of the CancelTransaction operation returned by the service.
     * @sample AWSLakeFormationAsync.CancelTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CancelTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelTransactionResult> cancelTransactionAsync(CancelTransactionRequest cancelTransactionRequest);

    /**
     * <p>
     * Attempts to cancel the specified transaction. Returns an exception if the transaction was previously committed.
     * </p>
     * 
     * @param cancelTransactionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelTransaction operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.CancelTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CancelTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelTransactionResult> cancelTransactionAsync(CancelTransactionRequest cancelTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<CancelTransactionRequest, CancelTransactionResult> asyncHandler);

    /**
     * <p>
     * Attempts to commit the specified transaction. Returns an exception if the transaction was previously aborted.
     * This API action is idempotent if called multiple times for the same transaction.
     * </p>
     * 
     * @param commitTransactionRequest
     * @return A Java Future containing the result of the CommitTransaction operation returned by the service.
     * @sample AWSLakeFormationAsync.CommitTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CommitTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest commitTransactionRequest);

    /**
     * <p>
     * Attempts to commit the specified transaction. Returns an exception if the transaction was previously aborted.
     * This API action is idempotent if called multiple times for the same transaction.
     * </p>
     * 
     * @param commitTransactionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CommitTransaction operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.CommitTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CommitTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CommitTransactionResult> commitTransactionAsync(CommitTransactionRequest commitTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<CommitTransactionRequest, CommitTransactionResult> asyncHandler);

    /**
     * <p>
     * Creates a data cell filter to allow one to grant access to certain columns on certain rows.
     * </p>
     * 
     * @param createDataCellsFilterRequest
     * @return A Java Future containing the result of the CreateDataCellsFilter operation returned by the service.
     * @sample AWSLakeFormationAsync.CreateDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataCellsFilterResult> createDataCellsFilterAsync(CreateDataCellsFilterRequest createDataCellsFilterRequest);

    /**
     * <p>
     * Creates a data cell filter to allow one to grant access to certain columns on certain rows.
     * </p>
     * 
     * @param createDataCellsFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataCellsFilter operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.CreateDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDataCellsFilterResult> createDataCellsFilterAsync(CreateDataCellsFilterRequest createDataCellsFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataCellsFilterRequest, CreateDataCellsFilterResult> asyncHandler);

    /**
     * <p>
     * Creates an LF-tag with the specified name and values.
     * </p>
     * 
     * @param createLFTagRequest
     * @return A Java Future containing the result of the CreateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.CreateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest createLFTagRequest);

    /**
     * <p>
     * Creates an LF-tag with the specified name and values.
     * </p>
     * 
     * @param createLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.CreateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLFTagResult> createLFTagAsync(CreateLFTagRequest createLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLFTagRequest, CreateLFTagResult> asyncHandler);

    /**
     * <p>
     * Deletes a data cell filter.
     * </p>
     * 
     * @param deleteDataCellsFilterRequest
     * @return A Java Future containing the result of the DeleteDataCellsFilter operation returned by the service.
     * @sample AWSLakeFormationAsync.DeleteDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataCellsFilterResult> deleteDataCellsFilterAsync(DeleteDataCellsFilterRequest deleteDataCellsFilterRequest);

    /**
     * <p>
     * Deletes a data cell filter.
     * </p>
     * 
     * @param deleteDataCellsFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataCellsFilter operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DeleteDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDataCellsFilterResult> deleteDataCellsFilterAsync(DeleteDataCellsFilterRequest deleteDataCellsFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataCellsFilterRequest, DeleteDataCellsFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified LF-tag given a key name. If the input parameter tag key was not found, then the operation
     * will throw an exception. When you delete an LF-tag, the <code>LFTagPolicy</code> attached to the LF-tag becomes
     * invalid. If the deleted LF-tag was still assigned to any resource, the tag policy attach to the deleted LF-tag
     * will no longer be applied to the resource.
     * </p>
     * 
     * @param deleteLFTagRequest
     * @return A Java Future containing the result of the DeleteLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.DeleteLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest deleteLFTagRequest);

    /**
     * <p>
     * Deletes the specified LF-tag given a key name. If the input parameter tag key was not found, then the operation
     * will throw an exception. When you delete an LF-tag, the <code>LFTagPolicy</code> attached to the LF-tag becomes
     * invalid. If the deleted LF-tag was still assigned to any resource, the tag policy attach to the deleted LF-tag
     * will no longer be applied to the resource.
     * </p>
     * 
     * @param deleteLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DeleteLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLFTagResult> deleteLFTagAsync(DeleteLFTagRequest deleteLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLFTagRequest, DeleteLFTagResult> asyncHandler);

    /**
     * <p>
     * For a specific governed table, provides a list of Amazon S3 objects that will be written during the current
     * transaction and that can be automatically deleted if the transaction is canceled. Without this call, no Amazon S3
     * objects are automatically deleted when a transaction cancels.
     * </p>
     * <p>
     * The Glue ETL library function <code>write_dynamic_frame.from_catalog()</code> includes an option to automatically
     * call <code>DeleteObjectsOnCancel</code> before writes. For more information, see <a href=
     * "https://docs.aws.amazon.com/lake-formation/latest/dg/transactions-data-operations.html#rolling-back-writes"
     * >Rolling Back Amazon S3 Writes</a>.
     * </p>
     * 
     * @param deleteObjectsOnCancelRequest
     * @return A Java Future containing the result of the DeleteObjectsOnCancel operation returned by the service.
     * @sample AWSLakeFormationAsync.DeleteObjectsOnCancel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteObjectsOnCancel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectsOnCancelResult> deleteObjectsOnCancelAsync(DeleteObjectsOnCancelRequest deleteObjectsOnCancelRequest);

    /**
     * <p>
     * For a specific governed table, provides a list of Amazon S3 objects that will be written during the current
     * transaction and that can be automatically deleted if the transaction is canceled. Without this call, no Amazon S3
     * objects are automatically deleted when a transaction cancels.
     * </p>
     * <p>
     * The Glue ETL library function <code>write_dynamic_frame.from_catalog()</code> includes an option to automatically
     * call <code>DeleteObjectsOnCancel</code> before writes. For more information, see <a href=
     * "https://docs.aws.amazon.com/lake-formation/latest/dg/transactions-data-operations.html#rolling-back-writes"
     * >Rolling Back Amazon S3 Writes</a>.
     * </p>
     * 
     * @param deleteObjectsOnCancelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteObjectsOnCancel operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DeleteObjectsOnCancel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteObjectsOnCancel"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectsOnCancelResult> deleteObjectsOnCancelAsync(DeleteObjectsOnCancelRequest deleteObjectsOnCancelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteObjectsOnCancelRequest, DeleteObjectsOnCancelResult> asyncHandler);

    /**
     * <p>
     * Deregisters the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * When you deregister a path, Lake Formation removes the path from the inline policy attached to your
     * service-linked role.
     * </p>
     * 
     * @param deregisterResourceRequest
     * @return A Java Future containing the result of the DeregisterResource operation returned by the service.
     * @sample AWSLakeFormationAsync.DeregisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeregisterResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest deregisterResourceRequest);

    /**
     * <p>
     * Deregisters the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * When you deregister a path, Lake Formation removes the path from the inline policy attached to your
     * service-linked role.
     * </p>
     * 
     * @param deregisterResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DeregisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeregisterResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterResourceResult> deregisterResourceAsync(DeregisterResourceRequest deregisterResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterResourceRequest, DeregisterResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current data access role for the given resource registered in Lake Formation.
     * </p>
     * 
     * @param describeResourceRequest
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AWSLakeFormationAsync.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest);

    /**
     * <p>
     * Retrieves the current data access role for the given resource registered in Lake Formation.
     * </p>
     * 
     * @param describeResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeResourceResult> describeResourceAsync(DescribeResourceRequest describeResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceRequest, DescribeResourceResult> asyncHandler);

    /**
     * <p>
     * Returns the details of a single transaction.
     * </p>
     * 
     * @param describeTransactionRequest
     * @return A Java Future containing the result of the DescribeTransaction operation returned by the service.
     * @sample AWSLakeFormationAsync.DescribeTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTransactionResult> describeTransactionAsync(DescribeTransactionRequest describeTransactionRequest);

    /**
     * <p>
     * Returns the details of a single transaction.
     * </p>
     * 
     * @param describeTransactionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTransaction operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.DescribeTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeTransactionResult> describeTransactionAsync(DescribeTransactionRequest describeTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTransactionRequest, DescribeTransactionResult> asyncHandler);

    /**
     * <p>
     * Indicates to the service that the specified transaction is still active and should not be treated as idle and
     * aborted.
     * </p>
     * <p>
     * Write transactions that remain idle for a long period are automatically aborted unless explicitly extended.
     * </p>
     * 
     * @param extendTransactionRequest
     * @return A Java Future containing the result of the ExtendTransaction operation returned by the service.
     * @sample AWSLakeFormationAsync.ExtendTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ExtendTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExtendTransactionResult> extendTransactionAsync(ExtendTransactionRequest extendTransactionRequest);

    /**
     * <p>
     * Indicates to the service that the specified transaction is still active and should not be treated as idle and
     * aborted.
     * </p>
     * <p>
     * Write transactions that remain idle for a long period are automatically aborted unless explicitly extended.
     * </p>
     * 
     * @param extendTransactionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExtendTransaction operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ExtendTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ExtendTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExtendTransactionResult> extendTransactionAsync(ExtendTransactionRequest extendTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<ExtendTransactionRequest, ExtendTransactionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake.
     * </p>
     * 
     * @param getDataLakeSettingsRequest
     * @return A Java Future containing the result of the GetDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsync.GetDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest getDataLakeSettingsRequest);

    /**
     * <p>
     * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake.
     * </p>
     * 
     * @param getDataLakeSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDataLakeSettingsResult> getDataLakeSettingsAsync(GetDataLakeSettingsRequest getDataLakeSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataLakeSettingsRequest, GetDataLakeSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3.
     * <code>GetEffectivePermissionsForPath</code> will not return databases and tables if the catalog is encrypted.
     * </p>
     * 
     * @param getEffectivePermissionsForPathRequest
     * @return A Java Future containing the result of the GetEffectivePermissionsForPath operation returned by the
     *         service.
     * @sample AWSLakeFormationAsync.GetEffectivePermissionsForPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(
            GetEffectivePermissionsForPathRequest getEffectivePermissionsForPathRequest);

    /**
     * <p>
     * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3.
     * <code>GetEffectivePermissionsForPath</code> will not return databases and tables if the catalog is encrypted.
     * </p>
     * 
     * @param getEffectivePermissionsForPathRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEffectivePermissionsForPath operation returned by the
     *         service.
     * @sample AWSLakeFormationAsyncHandler.GetEffectivePermissionsForPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEffectivePermissionsForPathResult> getEffectivePermissionsForPathAsync(
            GetEffectivePermissionsForPathRequest getEffectivePermissionsForPathRequest,
            com.amazonaws.handlers.AsyncHandler<GetEffectivePermissionsForPathRequest, GetEffectivePermissionsForPathResult> asyncHandler);

    /**
     * <p>
     * Returns an LF-tag definition.
     * </p>
     * 
     * @param getLFTagRequest
     * @return A Java Future containing the result of the GetLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.GetLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest getLFTagRequest);

    /**
     * <p>
     * Returns an LF-tag definition.
     * </p>
     * 
     * @param getLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetLFTagResult> getLFTagAsync(GetLFTagRequest getLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<GetLFTagRequest, GetLFTagResult> asyncHandler);

    /**
     * <p>
     * Returns the state of a query previously submitted. Clients are expected to poll <code>GetQueryState</code> to
     * monitor the current state of the planning before retrieving the work units. A query state is only visible to the
     * principal that made the initial call to <code>StartQueryPlanning</code>.
     * </p>
     * 
     * @param getQueryStateRequest
     * @return A Java Future containing the result of the GetQueryState operation returned by the service.
     * @sample AWSLakeFormationAsync.GetQueryState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryStateResult> getQueryStateAsync(GetQueryStateRequest getQueryStateRequest);

    /**
     * <p>
     * Returns the state of a query previously submitted. Clients are expected to poll <code>GetQueryState</code> to
     * monitor the current state of the planning before retrieving the work units. A query state is only visible to the
     * principal that made the initial call to <code>StartQueryPlanning</code>.
     * </p>
     * 
     * @param getQueryStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryState operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetQueryState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryStateResult> getQueryStateAsync(GetQueryStateRequest getQueryStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryStateRequest, GetQueryStateResult> asyncHandler);

    /**
     * <p>
     * Retrieves statistics on the planning and execution of a query.
     * </p>
     * 
     * @param getQueryStatisticsRequest
     * @return A Java Future containing the result of the GetQueryStatistics operation returned by the service.
     * @sample AWSLakeFormationAsync.GetQueryStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryStatisticsResult> getQueryStatisticsAsync(GetQueryStatisticsRequest getQueryStatisticsRequest);

    /**
     * <p>
     * Retrieves statistics on the planning and execution of a query.
     * </p>
     * 
     * @param getQueryStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryStatistics operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetQueryStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryStatisticsResult> getQueryStatisticsAsync(GetQueryStatisticsRequest getQueryStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryStatisticsRequest, GetQueryStatisticsResult> asyncHandler);

    /**
     * <p>
     * Returns the LF-tags applied to a resource.
     * </p>
     * 
     * @param getResourceLFTagsRequest
     * @return A Java Future containing the result of the GetResourceLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.GetResourceLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest getResourceLFTagsRequest);

    /**
     * <p>
     * Returns the LF-tags applied to a resource.
     * </p>
     * 
     * @param getResourceLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetResourceLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceLFTagsResult> getResourceLFTagsAsync(GetResourceLFTagsRequest getResourceLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceLFTagsRequest, GetResourceLFTagsResult> asyncHandler);

    /**
     * <p>
     * Returns the set of Amazon S3 objects that make up the specified governed table. A transaction ID or timestamp can
     * be specified for time-travel queries.
     * </p>
     * 
     * @param getTableObjectsRequest
     * @return A Java Future containing the result of the GetTableObjects operation returned by the service.
     * @sample AWSLakeFormationAsync.GetTableObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTableObjects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTableObjectsResult> getTableObjectsAsync(GetTableObjectsRequest getTableObjectsRequest);

    /**
     * <p>
     * Returns the set of Amazon S3 objects that make up the specified governed table. A transaction ID or timestamp can
     * be specified for time-travel queries.
     * </p>
     * 
     * @param getTableObjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTableObjects operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetTableObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTableObjects" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetTableObjectsResult> getTableObjectsAsync(GetTableObjectsRequest getTableObjectsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTableObjectsRequest, GetTableObjectsResult> asyncHandler);

    /**
     * <p>
     * This API is identical to <code>GetTemporaryTableCredentials</code> except that this is used when the target Data
     * Catalog resource is of type Partition. Lake Formation restricts the permission of the vended credentials with the
     * same scope down policy which restricts access to a single Amazon S3 prefix.
     * </p>
     * 
     * @param getTemporaryGluePartitionCredentialsRequest
     * @return A Java Future containing the result of the GetTemporaryGluePartitionCredentials operation returned by the
     *         service.
     * @sample AWSLakeFormationAsync.GetTemporaryGluePartitionCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGluePartitionCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemporaryGluePartitionCredentialsResult> getTemporaryGluePartitionCredentialsAsync(
            GetTemporaryGluePartitionCredentialsRequest getTemporaryGluePartitionCredentialsRequest);

    /**
     * <p>
     * This API is identical to <code>GetTemporaryTableCredentials</code> except that this is used when the target Data
     * Catalog resource is of type Partition. Lake Formation restricts the permission of the vended credentials with the
     * same scope down policy which restricts access to a single Amazon S3 prefix.
     * </p>
     * 
     * @param getTemporaryGluePartitionCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemporaryGluePartitionCredentials operation returned by the
     *         service.
     * @sample AWSLakeFormationAsyncHandler.GetTemporaryGluePartitionCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGluePartitionCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemporaryGluePartitionCredentialsResult> getTemporaryGluePartitionCredentialsAsync(
            GetTemporaryGluePartitionCredentialsRequest getTemporaryGluePartitionCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemporaryGluePartitionCredentialsRequest, GetTemporaryGluePartitionCredentialsResult> asyncHandler);

    /**
     * <p>
     * Allows a caller in a secure environment to assume a role with permission to access Amazon S3. In order to vend
     * such credentials, Lake Formation assumes the role associated with a registered location, for example an Amazon S3
     * bucket, with a scope down policy which restricts the access to a single prefix.
     * </p>
     * 
     * @param getTemporaryGlueTableCredentialsRequest
     * @return A Java Future containing the result of the GetTemporaryGlueTableCredentials operation returned by the
     *         service.
     * @sample AWSLakeFormationAsync.GetTemporaryGlueTableCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGlueTableCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemporaryGlueTableCredentialsResult> getTemporaryGlueTableCredentialsAsync(
            GetTemporaryGlueTableCredentialsRequest getTemporaryGlueTableCredentialsRequest);

    /**
     * <p>
     * Allows a caller in a secure environment to assume a role with permission to access Amazon S3. In order to vend
     * such credentials, Lake Formation assumes the role associated with a registered location, for example an Amazon S3
     * bucket, with a scope down policy which restricts the access to a single prefix.
     * </p>
     * 
     * @param getTemporaryGlueTableCredentialsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemporaryGlueTableCredentials operation returned by the
     *         service.
     * @sample AWSLakeFormationAsyncHandler.GetTemporaryGlueTableCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGlueTableCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTemporaryGlueTableCredentialsResult> getTemporaryGlueTableCredentialsAsync(
            GetTemporaryGlueTableCredentialsRequest getTemporaryGlueTableCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemporaryGlueTableCredentialsRequest, GetTemporaryGlueTableCredentialsResult> asyncHandler);

    /**
     * <p>
     * Returns the work units resulting from the query. Work units can be executed in any order and in parallel.
     * </p>
     * 
     * @param getWorkUnitResultsRequest
     * @return A Java Future containing the result of the GetWorkUnitResults operation returned by the service.
     * @sample AWSLakeFormationAsync.GetWorkUnitResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnitResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkUnitResultsResult> getWorkUnitResultsAsync(GetWorkUnitResultsRequest getWorkUnitResultsRequest);

    /**
     * <p>
     * Returns the work units resulting from the query. Work units can be executed in any order and in parallel.
     * </p>
     * 
     * @param getWorkUnitResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkUnitResults operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetWorkUnitResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnitResults"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetWorkUnitResultsResult> getWorkUnitResultsAsync(GetWorkUnitResultsRequest getWorkUnitResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkUnitResultsRequest, GetWorkUnitResultsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the work units generated by the <code>StartQueryPlanning</code> operation.
     * </p>
     * 
     * @param getWorkUnitsRequest
     * @return A Java Future containing the result of the GetWorkUnits operation returned by the service.
     * @sample AWSLakeFormationAsync.GetWorkUnits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkUnitsResult> getWorkUnitsAsync(GetWorkUnitsRequest getWorkUnitsRequest);

    /**
     * <p>
     * Retrieves the work units generated by the <code>StartQueryPlanning</code> operation.
     * </p>
     * 
     * @param getWorkUnitsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkUnits operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GetWorkUnits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnits" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWorkUnitsResult> getWorkUnitsAsync(GetWorkUnitsRequest getWorkUnitsRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkUnitsRequest, GetWorkUnitsResult> asyncHandler);

    /**
     * <p>
     * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param grantPermissionsRequest
     * @return A Java Future containing the result of the GrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.GrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest grantPermissionsRequest);

    /**
     * <p>
     * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param grantPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GrantPermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.GrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GrantPermissionsResult> grantPermissionsAsync(GrantPermissionsRequest grantPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<GrantPermissionsRequest, GrantPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists all the data cell filters on a table.
     * </p>
     * 
     * @param listDataCellsFilterRequest
     * @return A Java Future containing the result of the ListDataCellsFilter operation returned by the service.
     * @sample AWSLakeFormationAsync.ListDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataCellsFilterResult> listDataCellsFilterAsync(ListDataCellsFilterRequest listDataCellsFilterRequest);

    /**
     * <p>
     * Lists all the data cell filters on a table.
     * </p>
     * 
     * @param listDataCellsFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDataCellsFilter operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDataCellsFilterResult> listDataCellsFilterAsync(ListDataCellsFilterRequest listDataCellsFilterRequest,
            com.amazonaws.handlers.AsyncHandler<ListDataCellsFilterRequest, ListDataCellsFilterResult> asyncHandler);

    /**
     * <p>
     * Lists LF-tags that the requester has permission to view.
     * </p>
     * 
     * @param listLFTagsRequest
     * @return A Java Future containing the result of the ListLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.ListLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest listLFTagsRequest);

    /**
     * <p>
     * Lists LF-tags that the requester has permission to view.
     * </p>
     * 
     * @param listLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLFTagsResult> listLFTagsAsync(ListLFTagsRequest listLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLFTagsRequest, ListLFTagsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For
     * example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER.
     * </p>
     * <p>
     * This operation returns only those permissions that have been explicitly granted.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For
     * example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER.
     * </p>
     * <p>
     * This operation returns only those permissions that have been explicitly granted.
     * </p>
     * <p>
     * For information about permissions, see <a
     * href="https://docs-aws.amazon.com/lake-formation/latest/dg/security-data-access.html">Security and Access Control
     * to Metadata and Data</a>.
     * </p>
     * 
     * @param listPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListPermissionsResult> listPermissionsAsync(ListPermissionsRequest listPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPermissionsRequest, ListPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists the resources registered to be managed by the Data Catalog.
     * </p>
     * 
     * @param listResourcesRequest
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSLakeFormationAsync.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Lists the resources registered to be managed by the Data Catalog.
     * </p>
     * 
     * @param listResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns the configuration of all storage optimizers associated with a specified table.
     * </p>
     * 
     * @param listTableStorageOptimizersRequest
     * @return A Java Future containing the result of the ListTableStorageOptimizers operation returned by the service.
     * @sample AWSLakeFormationAsync.ListTableStorageOptimizers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTableStorageOptimizers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTableStorageOptimizersResult> listTableStorageOptimizersAsync(
            ListTableStorageOptimizersRequest listTableStorageOptimizersRequest);

    /**
     * <p>
     * Returns the configuration of all storage optimizers associated with a specified table.
     * </p>
     * 
     * @param listTableStorageOptimizersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTableStorageOptimizers operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListTableStorageOptimizers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTableStorageOptimizers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTableStorageOptimizersResult> listTableStorageOptimizersAsync(
            ListTableStorageOptimizersRequest listTableStorageOptimizersRequest,
            com.amazonaws.handlers.AsyncHandler<ListTableStorageOptimizersRequest, ListTableStorageOptimizersResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about transactions and their status. To prevent the response from growing indefinitely, only
     * uncommitted transactions and those available for time-travel queries are returned.
     * </p>
     * <p>
     * This operation can help you identify uncommitted transactions or to get information about transactions.
     * </p>
     * 
     * @param listTransactionsRequest
     * @return A Java Future containing the result of the ListTransactions operation returned by the service.
     * @sample AWSLakeFormationAsync.ListTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTransactions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest listTransactionsRequest);

    /**
     * <p>
     * Returns metadata about transactions and their status. To prevent the response from growing indefinitely, only
     * uncommitted transactions and those available for time-travel queries are returned.
     * </p>
     * <p>
     * This operation can help you identify uncommitted transactions or to get information about transactions.
     * </p>
     * 
     * @param listTransactionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTransactions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.ListTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTransactions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTransactionsResult> listTransactionsAsync(ListTransactionsRequest listTransactionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTransactionsRequest, ListTransactionsResult> asyncHandler);

    /**
     * <p>
     * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation.
     * For more information on admin privileges, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/lake-formation-permissions.html">Granting Lake
     * Formation Permissions</a>.
     * </p>
     * <p>
     * This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the
     * current list and add the new admin to that list and pass that list in this API.
     * </p>
     * 
     * @param putDataLakeSettingsRequest
     * @return A Java Future containing the result of the PutDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsync.PutDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PutDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest putDataLakeSettingsRequest);

    /**
     * <p>
     * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation.
     * For more information on admin privileges, see <a
     * href="https://docs.aws.amazon.com/lake-formation/latest/dg/lake-formation-permissions.html">Granting Lake
     * Formation Permissions</a>.
     * </p>
     * <p>
     * This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the
     * current list and add the new admin to that list and pass that list in this API.
     * </p>
     * 
     * @param putDataLakeSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutDataLakeSettings operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.PutDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PutDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutDataLakeSettingsResult> putDataLakeSettingsAsync(PutDataLakeSettingsRequest putDataLakeSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<PutDataLakeSettingsRequest, PutDataLakeSettingsResult> asyncHandler);

    /**
     * <p>
     * Registers the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that
     * you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role.
     * When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your
     * behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When
     * you register subsequent paths, Lake Formation adds the path to the existing policy.
     * </p>
     * <p>
     * The following request registers a new location and gives Lake Formation permission to use the service-linked role
     * to access that location.
     * </p>
     * <p>
     * <code>ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true</code>
     * </p>
     * <p>
     * If <code>UseServiceLinkedRole</code> is not set to true, you must provide or set the <code>RoleArn</code>:
     * </p>
     * <p>
     * <code>arn:aws:iam::12345:role/my-data-access-role</code>
     * </p>
     * 
     * @param registerResourceRequest
     * @return A Java Future containing the result of the RegisterResource operation returned by the service.
     * @sample AWSLakeFormationAsync.RegisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest registerResourceRequest);

    /**
     * <p>
     * Registers the resource as managed by the Data Catalog.
     * </p>
     * <p>
     * To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that
     * you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role.
     * When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your
     * behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When
     * you register subsequent paths, Lake Formation adds the path to the existing policy.
     * </p>
     * <p>
     * The following request registers a new location and gives Lake Formation permission to use the service-linked role
     * to access that location.
     * </p>
     * <p>
     * <code>ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true</code>
     * </p>
     * <p>
     * If <code>UseServiceLinkedRole</code> is not set to true, you must provide or set the <code>RoleArn</code>:
     * </p>
     * <p>
     * <code>arn:aws:iam::12345:role/my-data-access-role</code>
     * </p>
     * 
     * @param registerResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.RegisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterResourceResult> registerResourceAsync(RegisterResourceRequest registerResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterResourceRequest, RegisterResourceResult> asyncHandler);

    /**
     * <p>
     * Removes an LF-tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag
     * columns, use the column inclusion list in <code>tableWithColumns</code> to specify column input.
     * </p>
     * 
     * @param removeLFTagsFromResourceRequest
     * @return A Java Future containing the result of the RemoveLFTagsFromResource operation returned by the service.
     * @sample AWSLakeFormationAsync.RemoveLFTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RemoveLFTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest removeLFTagsFromResourceRequest);

    /**
     * <p>
     * Removes an LF-tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag
     * columns, use the column inclusion list in <code>tableWithColumns</code> to specify column input.
     * </p>
     * 
     * @param removeLFTagsFromResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveLFTagsFromResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.RemoveLFTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RemoveLFTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RemoveLFTagsFromResourceResult> removeLFTagsFromResourceAsync(RemoveLFTagsFromResourceRequest removeLFTagsFromResourceRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveLFTagsFromResourceRequest, RemoveLFTagsFromResourceResult> asyncHandler);

    /**
     * <p>
     * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * 
     * @param revokePermissionsRequest
     * @return A Java Future containing the result of the RevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsync.RevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest revokePermissionsRequest);

    /**
     * <p>
     * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * 
     * @param revokePermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RevokePermissions operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.RevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RevokePermissionsResult> revokePermissionsAsync(RevokePermissionsRequest revokePermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<RevokePermissionsRequest, RevokePermissionsResult> asyncHandler);

    /**
     * <p>
     * This operation allows a search on <code>DATABASE</code> resources by <code>TagCondition</code>. This operation is
     * used by admins who want to grant user permissions on certain <code>TagConditions</code>. Before making a grant,
     * the admin can use <code>SearchDatabasesByTags</code> to find all resources where the given
     * <code>TagConditions</code> are valid to verify whether the returned resources can be shared.
     * </p>
     * 
     * @param searchDatabasesByLFTagsRequest
     * @return A Java Future containing the result of the SearchDatabasesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.SearchDatabasesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest searchDatabasesByLFTagsRequest);

    /**
     * <p>
     * This operation allows a search on <code>DATABASE</code> resources by <code>TagCondition</code>. This operation is
     * used by admins who want to grant user permissions on certain <code>TagConditions</code>. Before making a grant,
     * the admin can use <code>SearchDatabasesByTags</code> to find all resources where the given
     * <code>TagConditions</code> are valid to verify whether the returned resources can be shared.
     * </p>
     * 
     * @param searchDatabasesByLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchDatabasesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.SearchDatabasesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchDatabasesByLFTagsResult> searchDatabasesByLFTagsAsync(SearchDatabasesByLFTagsRequest searchDatabasesByLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchDatabasesByLFTagsRequest, SearchDatabasesByLFTagsResult> asyncHandler);

    /**
     * <p>
     * This operation allows a search on <code>TABLE</code> resources by <code>LFTag</code>s. This will be used by
     * admins who want to grant user permissions on certain LF-tags. Before making a grant, the admin can use
     * <code>SearchTablesByLFTags</code> to find all resources where the given <code>LFTag</code>s are valid to verify
     * whether the returned resources can be shared.
     * </p>
     * 
     * @param searchTablesByLFTagsRequest
     * @return A Java Future containing the result of the SearchTablesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsync.SearchTablesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest searchTablesByLFTagsRequest);

    /**
     * <p>
     * This operation allows a search on <code>TABLE</code> resources by <code>LFTag</code>s. This will be used by
     * admins who want to grant user permissions on certain LF-tags. Before making a grant, the admin can use
     * <code>SearchTablesByLFTags</code> to find all resources where the given <code>LFTag</code>s are valid to verify
     * whether the returned resources can be shared.
     * </p>
     * 
     * @param searchTablesByLFTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchTablesByLFTags operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.SearchTablesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SearchTablesByLFTagsResult> searchTablesByLFTagsAsync(SearchTablesByLFTagsRequest searchTablesByLFTagsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchTablesByLFTagsRequest, SearchTablesByLFTagsResult> asyncHandler);

    /**
     * <p>
     * Submits a request to process a query statement.
     * </p>
     * <p>
     * This operation generates work units that can be retrieved with the <code>GetWorkUnits</code> operation as soon as
     * the query state is WORKUNITS_AVAILABLE or FINISHED.
     * </p>
     * 
     * @param startQueryPlanningRequest
     * @return A Java Future containing the result of the StartQueryPlanning operation returned by the service.
     * @sample AWSLakeFormationAsync.StartQueryPlanning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartQueryPlanning"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartQueryPlanningResult> startQueryPlanningAsync(StartQueryPlanningRequest startQueryPlanningRequest);

    /**
     * <p>
     * Submits a request to process a query statement.
     * </p>
     * <p>
     * This operation generates work units that can be retrieved with the <code>GetWorkUnits</code> operation as soon as
     * the query state is WORKUNITS_AVAILABLE or FINISHED.
     * </p>
     * 
     * @param startQueryPlanningRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartQueryPlanning operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.StartQueryPlanning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartQueryPlanning"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartQueryPlanningResult> startQueryPlanningAsync(StartQueryPlanningRequest startQueryPlanningRequest,
            com.amazonaws.handlers.AsyncHandler<StartQueryPlanningRequest, StartQueryPlanningResult> asyncHandler);

    /**
     * <p>
     * Starts a new transaction and returns its transaction ID. Transaction IDs are opaque objects that you can use to
     * identify a transaction.
     * </p>
     * 
     * @param startTransactionRequest
     * @return A Java Future containing the result of the StartTransaction operation returned by the service.
     * @sample AWSLakeFormationAsync.StartTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartTransaction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartTransactionResult> startTransactionAsync(StartTransactionRequest startTransactionRequest);

    /**
     * <p>
     * Starts a new transaction and returns its transaction ID. Transaction IDs are opaque objects that you can use to
     * identify a transaction.
     * </p>
     * 
     * @param startTransactionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartTransaction operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.StartTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartTransaction" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartTransactionResult> startTransactionAsync(StartTransactionRequest startTransactionRequest,
            com.amazonaws.handlers.AsyncHandler<StartTransactionRequest, StartTransactionResult> asyncHandler);

    /**
     * <p>
     * Updates the list of possible values for the specified LF-tag key. If the LF-tag does not exist, the operation
     * throws an EntityNotFoundException. The values in the delete key values will be deleted from list of possible
     * values. If any value in the delete key values is attached to a resource, then API errors out with a 400 Exception
     * - "Update not allowed". Untag the attribute before deleting the LF-tag key's value.
     * </p>
     * 
     * @param updateLFTagRequest
     * @return A Java Future containing the result of the UpdateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsync.UpdateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest updateLFTagRequest);

    /**
     * <p>
     * Updates the list of possible values for the specified LF-tag key. If the LF-tag does not exist, the operation
     * throws an EntityNotFoundException. The values in the delete key values will be deleted from list of possible
     * values. If any value in the delete key values is attached to a resource, then API errors out with a 400 Exception
     * - "Update not allowed". Untag the attribute before deleting the LF-tag key's value.
     * </p>
     * 
     * @param updateLFTagRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateLFTag operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.UpdateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateLFTagResult> updateLFTagAsync(UpdateLFTagRequest updateLFTagRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLFTagRequest, UpdateLFTagResult> asyncHandler);

    /**
     * <p>
     * Updates the data access role used for vending access to the given (registered) resource in Lake Formation.
     * </p>
     * 
     * @param updateResourceRequest
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AWSLakeFormationAsync.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Updates the data access role used for vending access to the given (registered) resource in Lake Formation.
     * </p>
     * 
     * @param updateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the manifest of Amazon S3 objects that make up the specified governed table.
     * </p>
     * 
     * @param updateTableObjectsRequest
     * @return A Java Future containing the result of the UpdateTableObjects operation returned by the service.
     * @sample AWSLakeFormationAsync.UpdateTableObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableObjects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableObjectsResult> updateTableObjectsAsync(UpdateTableObjectsRequest updateTableObjectsRequest);

    /**
     * <p>
     * Updates the manifest of Amazon S3 objects that make up the specified governed table.
     * </p>
     * 
     * @param updateTableObjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTableObjects operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.UpdateTableObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableObjects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableObjectsResult> updateTableObjectsAsync(UpdateTableObjectsRequest updateTableObjectsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTableObjectsRequest, UpdateTableObjectsResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of the storage optimizers for a table.
     * </p>
     * 
     * @param updateTableStorageOptimizerRequest
     * @return A Java Future containing the result of the UpdateTableStorageOptimizer operation returned by the service.
     * @sample AWSLakeFormationAsync.UpdateTableStorageOptimizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableStorageOptimizer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableStorageOptimizerResult> updateTableStorageOptimizerAsync(
            UpdateTableStorageOptimizerRequest updateTableStorageOptimizerRequest);

    /**
     * <p>
     * Updates the configuration of the storage optimizers for a table.
     * </p>
     * 
     * @param updateTableStorageOptimizerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTableStorageOptimizer operation returned by the service.
     * @sample AWSLakeFormationAsyncHandler.UpdateTableStorageOptimizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableStorageOptimizer"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTableStorageOptimizerResult> updateTableStorageOptimizerAsync(
            UpdateTableStorageOptimizerRequest updateTableStorageOptimizerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTableStorageOptimizerRequest, UpdateTableStorageOptimizerResult> asyncHandler);

}
