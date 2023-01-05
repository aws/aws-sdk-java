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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lakeformation.model.*;

/**
 * Interface for accessing AWS Lake Formation.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lakeformation.AbstractAWSLakeFormation} instead.
 * </p>
 * <p>
 * <fullname>Lake Formation</fullname>
 * <p>
 * Defines the public endpoint for the Lake Formation service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLakeFormation {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lakeformation";

    /**
     * <p>
     * Attaches one or more LF-tags to an existing resource.
     * </p>
     * 
     * @param addLFTagsToResourceRequest
     * @return Result of the AddLFTagsToResource operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.AddLFTagsToResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AddLFTagsToResource"
     *      target="_top">AWS API Documentation</a>
     */
    AddLFTagsToResourceResult addLFTagsToResource(AddLFTagsToResourceRequest addLFTagsToResourceRequest);

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
     * @return Result of the AssumeDecoratedRoleWithSAML operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.AssumeDecoratedRoleWithSAML
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/AssumeDecoratedRoleWithSAML"
     *      target="_top">AWS API Documentation</a>
     */
    AssumeDecoratedRoleWithSAMLResult assumeDecoratedRoleWithSAML(AssumeDecoratedRoleWithSAMLRequest assumeDecoratedRoleWithSAMLRequest);

    /**
     * <p>
     * Batch operation to grant permissions to the principal.
     * </p>
     * 
     * @param batchGrantPermissionsRequest
     * @return Result of the BatchGrantPermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.BatchGrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchGrantPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGrantPermissionsResult batchGrantPermissions(BatchGrantPermissionsRequest batchGrantPermissionsRequest);

    /**
     * <p>
     * Batch operation to revoke permissions from the principal.
     * </p>
     * 
     * @param batchRevokePermissionsRequest
     * @return Result of the BatchRevokePermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.BatchRevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/BatchRevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    BatchRevokePermissionsResult batchRevokePermissions(BatchRevokePermissionsRequest batchRevokePermissionsRequest);

    /**
     * <p>
     * Attempts to cancel the specified transaction. Returns an exception if the transaction was previously committed.
     * </p>
     * 
     * @param cancelTransactionRequest
     * @return Result of the CancelTransaction operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws TransactionCommittedException
     *         Contains details about an error where the specified transaction has already been committed and cannot be
     *         used for <code>UpdateTableObjects</code>.
     * @throws TransactionCommitInProgressException
     *         Contains details about an error related to a transaction commit that was in progress.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.CancelTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CancelTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    CancelTransactionResult cancelTransaction(CancelTransactionRequest cancelTransactionRequest);

    /**
     * <p>
     * Attempts to commit the specified transaction. Returns an exception if the transaction was previously aborted.
     * This API action is idempotent if called multiple times for the same transaction.
     * </p>
     * 
     * @param commitTransactionRequest
     * @return Result of the CommitTransaction operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws TransactionCanceledException
     *         Contains details about an error related to a transaction that was cancelled.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.CommitTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CommitTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    CommitTransactionResult commitTransaction(CommitTransactionRequest commitTransactionRequest);

    /**
     * <p>
     * Creates a data cell filter to allow one to grant access to certain columns on certain rows.
     * </p>
     * 
     * @param createDataCellsFilterRequest
     * @return Result of the CreateDataCellsFilter operation returned by the service.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.CreateDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDataCellsFilterResult createDataCellsFilter(CreateDataCellsFilterRequest createDataCellsFilterRequest);

    /**
     * <p>
     * Creates an LF-tag with the specified name and values.
     * </p>
     * 
     * @param createLFTagRequest
     * @return Result of the CreateLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.CreateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/CreateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLFTagResult createLFTag(CreateLFTagRequest createLFTagRequest);

    /**
     * <p>
     * Deletes a data cell filter.
     * </p>
     * 
     * @param deleteDataCellsFilterRequest
     * @return Result of the DeleteDataCellsFilter operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.DeleteDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDataCellsFilterResult deleteDataCellsFilter(DeleteDataCellsFilterRequest deleteDataCellsFilterRequest);

    /**
     * <p>
     * Deletes the specified LF-tag given a key name. If the input parameter tag key was not found, then the operation
     * will throw an exception. When you delete an LF-tag, the <code>LFTagPolicy</code> attached to the LF-tag becomes
     * invalid. If the deleted LF-tag was still assigned to any resource, the tag policy attach to the deleted LF-tag
     * will no longer be applied to the resource.
     * </p>
     * 
     * @param deleteLFTagRequest
     * @return Result of the DeleteLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.DeleteLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLFTagResult deleteLFTag(DeleteLFTagRequest deleteLFTagRequest);

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
     * @return Result of the DeleteObjectsOnCancel operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws TransactionCommittedException
     *         Contains details about an error where the specified transaction has already been committed and cannot be
     *         used for <code>UpdateTableObjects</code>.
     * @throws TransactionCanceledException
     *         Contains details about an error related to a transaction that was cancelled.
     * @throws ResourceNotReadyException
     *         Contains details about an error related to a resource which is not ready for a transaction.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.DeleteObjectsOnCancel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeleteObjectsOnCancel"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteObjectsOnCancelResult deleteObjectsOnCancel(DeleteObjectsOnCancelRequest deleteObjectsOnCancelRequest);

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
     * @return Result of the DeregisterResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.DeregisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DeregisterResource"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterResourceResult deregisterResource(DeregisterResourceRequest deregisterResourceRequest);

    /**
     * <p>
     * Retrieves the current data access role for the given resource registered in Lake Formation.
     * </p>
     * 
     * @param describeResourceRequest
     * @return Result of the DescribeResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.DescribeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeResource" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeResourceResult describeResource(DescribeResourceRequest describeResourceRequest);

    /**
     * <p>
     * Returns the details of a single transaction.
     * </p>
     * 
     * @param describeTransactionRequest
     * @return Result of the DescribeTransaction operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.DescribeTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/DescribeTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeTransactionResult describeTransaction(DescribeTransactionRequest describeTransactionRequest);

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
     * @return Result of the ExtendTransaction operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws TransactionCommittedException
     *         Contains details about an error where the specified transaction has already been committed and cannot be
     *         used for <code>UpdateTableObjects</code>.
     * @throws TransactionCanceledException
     *         Contains details about an error related to a transaction that was cancelled.
     * @throws TransactionCommitInProgressException
     *         Contains details about an error related to a transaction commit that was in progress.
     * @sample AWSLakeFormation.ExtendTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ExtendTransaction"
     *      target="_top">AWS API Documentation</a>
     */
    ExtendTransactionResult extendTransaction(ExtendTransactionRequest extendTransactionRequest);

    /**
     * <p>
     * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake.
     * </p>
     * 
     * @param getDataLakeSettingsRequest
     * @return Result of the GetDataLakeSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.GetDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetDataLakeSettingsResult getDataLakeSettings(GetDataLakeSettingsRequest getDataLakeSettingsRequest);

    /**
     * <p>
     * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3.
     * <code>GetEffectivePermissionsForPath</code> will not return databases and tables if the catalog is encrypted.
     * </p>
     * 
     * @param getEffectivePermissionsForPathRequest
     * @return Result of the GetEffectivePermissionsForPath operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.GetEffectivePermissionsForPath
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetEffectivePermissionsForPath"
     *      target="_top">AWS API Documentation</a>
     */
    GetEffectivePermissionsForPathResult getEffectivePermissionsForPath(GetEffectivePermissionsForPathRequest getEffectivePermissionsForPathRequest);

    /**
     * <p>
     * Returns an LF-tag definition.
     * </p>
     * 
     * @param getLFTagRequest
     * @return Result of the GetLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.GetLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    GetLFTagResult getLFTag(GetLFTagRequest getLFTagRequest);

    /**
     * <p>
     * Returns the state of a query previously submitted. Clients are expected to poll <code>GetQueryState</code> to
     * monitor the current state of the planning before retrieving the work units. A query state is only visible to the
     * principal that made the initial call to <code>StartQueryPlanning</code>.
     * </p>
     * 
     * @param getQueryStateRequest
     * @return Result of the GetQueryState operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.GetQueryState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryState" target="_top">AWS
     *      API Documentation</a>
     */
    GetQueryStateResult getQueryState(GetQueryStateRequest getQueryStateRequest);

    /**
     * <p>
     * Retrieves statistics on the planning and execution of a query.
     * </p>
     * 
     * @param getQueryStatisticsRequest
     * @return Result of the GetQueryStatistics operation returned by the service.
     * @throws StatisticsNotReadyYetException
     *         Contains details about an error related to statistics not being ready.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ExpiredException
     *         Contains details about an error where the query request expired.
     * @throws ThrottledException
     *         Contains details about an error where the query request was throttled.
     * @sample AWSLakeFormation.GetQueryStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetQueryStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetQueryStatisticsResult getQueryStatistics(GetQueryStatisticsRequest getQueryStatisticsRequest);

    /**
     * <p>
     * Returns the LF-tags applied to a resource.
     * </p>
     * 
     * @param getResourceLFTagsRequest
     * @return Result of the GetResourceLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.GetResourceLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetResourceLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceLFTagsResult getResourceLFTags(GetResourceLFTagsRequest getResourceLFTagsRequest);

    /**
     * <p>
     * Returns the set of Amazon S3 objects that make up the specified governed table. A transaction ID or timestamp can
     * be specified for time-travel queries.
     * </p>
     * 
     * @param getTableObjectsRequest
     * @return Result of the GetTableObjects operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws TransactionCommittedException
     *         Contains details about an error where the specified transaction has already been committed and cannot be
     *         used for <code>UpdateTableObjects</code>.
     * @throws TransactionCanceledException
     *         Contains details about an error related to a transaction that was cancelled.
     * @throws ResourceNotReadyException
     *         Contains details about an error related to a resource which is not ready for a transaction.
     * @sample AWSLakeFormation.GetTableObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTableObjects" target="_top">AWS
     *      API Documentation</a>
     */
    GetTableObjectsResult getTableObjects(GetTableObjectsRequest getTableObjectsRequest);

    /**
     * <p>
     * This API is identical to <code>GetTemporaryTableCredentials</code> except that this is used when the target Data
     * Catalog resource is of type Partition. Lake Formation restricts the permission of the vended credentials with the
     * same scope down policy which restricts access to a single Amazon S3 prefix.
     * </p>
     * 
     * @param getTemporaryGluePartitionCredentialsRequest
     * @return Result of the GetTemporaryGluePartitionCredentials operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws PermissionTypeMismatchException
     *         The engine does not support filtering data based on the enforced permissions. For example, if you call
     *         the <code>GetTemporaryGlueTableCredentials</code> operation with <code>SupportedPermissionType</code>
     *         equal to <code>ColumnPermission</code>, but cell-level permissions exist on the table, this exception is
     *         thrown.
     * @sample AWSLakeFormation.GetTemporaryGluePartitionCredentials
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGluePartitionCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    GetTemporaryGluePartitionCredentialsResult getTemporaryGluePartitionCredentials(
            GetTemporaryGluePartitionCredentialsRequest getTemporaryGluePartitionCredentialsRequest);

    /**
     * <p>
     * Allows a caller in a secure environment to assume a role with permission to access Amazon S3. In order to vend
     * such credentials, Lake Formation assumes the role associated with a registered location, for example an Amazon S3
     * bucket, with a scope down policy which restricts the access to a single prefix.
     * </p>
     * 
     * @param getTemporaryGlueTableCredentialsRequest
     * @return Result of the GetTemporaryGlueTableCredentials operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws PermissionTypeMismatchException
     *         The engine does not support filtering data based on the enforced permissions. For example, if you call
     *         the <code>GetTemporaryGlueTableCredentials</code> operation with <code>SupportedPermissionType</code>
     *         equal to <code>ColumnPermission</code>, but cell-level permissions exist on the table, this exception is
     *         thrown.
     * @sample AWSLakeFormation.GetTemporaryGlueTableCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGlueTableCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    GetTemporaryGlueTableCredentialsResult getTemporaryGlueTableCredentials(GetTemporaryGlueTableCredentialsRequest getTemporaryGlueTableCredentialsRequest);

    /**
     * <p>
     * Returns the work units resulting from the query. Work units can be executed in any order and in parallel.
     * </p>
     * 
     * @param getWorkUnitResultsRequest
     * @return Result of the GetWorkUnitResults operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ExpiredException
     *         Contains details about an error where the query request expired.
     * @throws ThrottledException
     *         Contains details about an error where the query request was throttled.
     * @sample AWSLakeFormation.GetWorkUnitResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnitResults"
     *      target="_top">AWS API Documentation</a>
     */
    GetWorkUnitResultsResult getWorkUnitResults(GetWorkUnitResultsRequest getWorkUnitResultsRequest);

    /**
     * <p>
     * Retrieves the work units generated by the <code>StartQueryPlanning</code> operation.
     * </p>
     * 
     * @param getWorkUnitsRequest
     * @return Result of the GetWorkUnits operation returned by the service.
     * @throws WorkUnitsNotReadyYetException
     *         Contains details about an error related to work units not being ready.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ExpiredException
     *         Contains details about an error where the query request expired.
     * @sample AWSLakeFormation.GetWorkUnits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetWorkUnits" target="_top">AWS API
     *      Documentation</a>
     */
    GetWorkUnitsResult getWorkUnits(GetWorkUnitsRequest getWorkUnitsRequest);

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
     * @return Result of the GrantPermissions operation returned by the service.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.GrantPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GrantPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    GrantPermissionsResult grantPermissions(GrantPermissionsRequest grantPermissionsRequest);

    /**
     * <p>
     * Lists all the data cell filters on a table.
     * </p>
     * 
     * @param listDataCellsFilterRequest
     * @return Result of the ListDataCellsFilter operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.ListDataCellsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListDataCellsFilter"
     *      target="_top">AWS API Documentation</a>
     */
    ListDataCellsFilterResult listDataCellsFilter(ListDataCellsFilterRequest listDataCellsFilterRequest);

    /**
     * <p>
     * Lists LF-tags that the requester has permission to view.
     * </p>
     * 
     * @param listLFTagsRequest
     * @return Result of the ListLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.ListLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListLFTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListLFTagsResult listLFTags(ListLFTagsRequest listLFTagsRequest);

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
     * @return Result of the ListPermissions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.ListPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListPermissions" target="_top">AWS
     *      API Documentation</a>
     */
    ListPermissionsResult listPermissions(ListPermissionsRequest listPermissionsRequest);

    /**
     * <p>
     * Lists the resources registered to be managed by the Data Catalog.
     * </p>
     * 
     * @param listResourcesRequest
     * @return Result of the ListResources operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Returns the configuration of all storage optimizers associated with a specified table.
     * </p>
     * 
     * @param listTableStorageOptimizersRequest
     * @return Result of the ListTableStorageOptimizers operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.ListTableStorageOptimizers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTableStorageOptimizers"
     *      target="_top">AWS API Documentation</a>
     */
    ListTableStorageOptimizersResult listTableStorageOptimizers(ListTableStorageOptimizersRequest listTableStorageOptimizersRequest);

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
     * @return Result of the ListTransactions operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.ListTransactions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListTransactions" target="_top">AWS
     *      API Documentation</a>
     */
    ListTransactionsResult listTransactions(ListTransactionsRequest listTransactionsRequest);

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
     * @return Result of the PutDataLakeSettings operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.PutDataLakeSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/PutDataLakeSettings"
     *      target="_top">AWS API Documentation</a>
     */
    PutDataLakeSettingsResult putDataLakeSettings(PutDataLakeSettingsRequest putDataLakeSettingsRequest);

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
     * @return Result of the RegisterResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws AlreadyExistsException
     *         A resource to be created or added already exists.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws ResourceNumberLimitExceededException
     *         A resource numerical limit was exceeded.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.RegisterResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RegisterResource" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterResourceResult registerResource(RegisterResourceRequest registerResourceRequest);

    /**
     * <p>
     * Removes an LF-tag from the resource. Only database, table, or tableWithColumns resource are allowed. To tag
     * columns, use the column inclusion list in <code>tableWithColumns</code> to specify column input.
     * </p>
     * 
     * @param removeLFTagsFromResourceRequest
     * @return Result of the RemoveLFTagsFromResource operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.RemoveLFTagsFromResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RemoveLFTagsFromResource"
     *      target="_top">AWS API Documentation</a>
     */
    RemoveLFTagsFromResourceResult removeLFTagsFromResource(RemoveLFTagsFromResourceRequest removeLFTagsFromResourceRequest);

    /**
     * <p>
     * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data
     * storage such as Amazon S3.
     * </p>
     * 
     * @param revokePermissionsRequest
     * @return Result of the RevokePermissions operation returned by the service.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @sample AWSLakeFormation.RevokePermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/RevokePermissions"
     *      target="_top">AWS API Documentation</a>
     */
    RevokePermissionsResult revokePermissions(RevokePermissionsRequest revokePermissionsRequest);

    /**
     * <p>
     * This operation allows a search on <code>DATABASE</code> resources by <code>TagCondition</code>. This operation is
     * used by admins who want to grant user permissions on certain <code>TagConditions</code>. Before making a grant,
     * the admin can use <code>SearchDatabasesByTags</code> to find all resources where the given
     * <code>TagConditions</code> are valid to verify whether the returned resources can be shared.
     * </p>
     * 
     * @param searchDatabasesByLFTagsRequest
     * @return Result of the SearchDatabasesByLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.SearchDatabasesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchDatabasesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    SearchDatabasesByLFTagsResult searchDatabasesByLFTags(SearchDatabasesByLFTagsRequest searchDatabasesByLFTagsRequest);

    /**
     * <p>
     * This operation allows a search on <code>TABLE</code> resources by <code>LFTag</code>s. This will be used by
     * admins who want to grant user permissions on certain LF-tags. Before making a grant, the admin can use
     * <code>SearchTablesByLFTags</code> to find all resources where the given <code>LFTag</code>s are valid to verify
     * whether the returned resources can be shared.
     * </p>
     * 
     * @param searchTablesByLFTagsRequest
     * @return Result of the SearchTablesByLFTags operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws GlueEncryptionException
     *         An encryption operation failed.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.SearchTablesByLFTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/SearchTablesByLFTags"
     *      target="_top">AWS API Documentation</a>
     */
    SearchTablesByLFTagsResult searchTablesByLFTags(SearchTablesByLFTagsRequest searchTablesByLFTagsRequest);

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
     * @return Result of the StartQueryPlanning operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws ThrottledException
     *         Contains details about an error where the query request was throttled.
     * @sample AWSLakeFormation.StartQueryPlanning
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartQueryPlanning"
     *      target="_top">AWS API Documentation</a>
     */
    StartQueryPlanningResult startQueryPlanning(StartQueryPlanningRequest startQueryPlanningRequest);

    /**
     * <p>
     * Starts a new transaction and returns its transaction ID. Transaction IDs are opaque objects that you can use to
     * identify a transaction.
     * </p>
     * 
     * @param startTransactionRequest
     * @return Result of the StartTransaction operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @sample AWSLakeFormation.StartTransaction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/StartTransaction" target="_top">AWS
     *      API Documentation</a>
     */
    StartTransactionResult startTransaction(StartTransactionRequest startTransactionRequest);

    /**
     * <p>
     * Updates the list of possible values for the specified LF-tag key. If the LF-tag does not exist, the operation
     * throws an EntityNotFoundException. The values in the delete key values will be deleted from list of possible
     * values. If any value in the delete key values is attached to a resource, then API errors out with a 400 Exception
     * - "Update not allowed". Untag the attribute before deleting the LF-tag key's value.
     * </p>
     * 
     * @param updateLFTagRequest
     * @return Result of the UpdateLFTag operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @sample AWSLakeFormation.UpdateLFTag
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateLFTag" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateLFTagResult updateLFTag(UpdateLFTagRequest updateLFTagRequest);

    /**
     * <p>
     * Updates the data access role used for vending access to the given (registered) resource in Lake Formation.
     * </p>
     * 
     * @param updateResourceRequest
     * @return Result of the UpdateResource operation returned by the service.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @sample AWSLakeFormation.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Updates the manifest of Amazon S3 objects that make up the specified governed table.
     * </p>
     * 
     * @param updateTableObjectsRequest
     * @return Result of the UpdateTableObjects operation returned by the service.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws OperationTimeoutException
     *         The operation timed out.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws TransactionCommittedException
     *         Contains details about an error where the specified transaction has already been committed and cannot be
     *         used for <code>UpdateTableObjects</code>.
     * @throws TransactionCanceledException
     *         Contains details about an error related to a transaction that was cancelled.
     * @throws TransactionCommitInProgressException
     *         Contains details about an error related to a transaction commit that was in progress.
     * @throws ResourceNotReadyException
     *         Contains details about an error related to a resource which is not ready for a transaction.
     * @throws ConcurrentModificationException
     *         Two processes are trying to modify a resource simultaneously.
     * @sample AWSLakeFormation.UpdateTableObjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableObjects"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTableObjectsResult updateTableObjects(UpdateTableObjectsRequest updateTableObjectsRequest);

    /**
     * <p>
     * Updates the configuration of the storage optimizers for a table.
     * </p>
     * 
     * @param updateTableStorageOptimizerRequest
     * @return Result of the UpdateTableStorageOptimizer operation returned by the service.
     * @throws EntityNotFoundException
     *         A specified entity does not exist
     * @throws InvalidInputException
     *         The input provided was not valid.
     * @throws AccessDeniedException
     *         Access to a resource was denied.
     * @throws InternalServiceException
     *         An internal service error occurred.
     * @sample AWSLakeFormation.UpdateTableStorageOptimizer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/UpdateTableStorageOptimizer"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateTableStorageOptimizerResult updateTableStorageOptimizer(UpdateTableStorageOptimizerRequest updateTableStorageOptimizerRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
