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
package com.amazonaws.services.backup;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;

/**
 * Interface for accessing AWS Backup asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.backup.AbstractAWSBackupAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Backup</fullname>
 * <p>
 * AWS Backup is a unified backup service designed to protect AWS services and their associated data. AWS Backup
 * simplifies the creation, migration, restoration, and deletion of backups, while also providing reporting and
 * auditing.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSBackupAsync extends AWSBackup {

    /**
     * <p>
     * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery
     * points of resources.
     * </p>
     * <p>
     * If you call <code>CreateBackupPlan</code> with a plan that already exists, the existing <code>backupPlanId</code>
     * is returned.
     * </p>
     * 
     * @param createBackupPlanRequest
     * @return A Java Future containing the result of the CreateBackupPlan operation returned by the service.
     * @sample AWSBackupAsync.CreateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupPlanResult> createBackupPlanAsync(CreateBackupPlanRequest createBackupPlanRequest);

    /**
     * <p>
     * Backup plans are documents that contain information that AWS Backup uses to schedule tasks that create recovery
     * points of resources.
     * </p>
     * <p>
     * If you call <code>CreateBackupPlan</code> with a plan that already exists, the existing <code>backupPlanId</code>
     * is returned.
     * </p>
     * 
     * @param createBackupPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackupPlan operation returned by the service.
     * @sample AWSBackupAsyncHandler.CreateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupPlanResult> createBackupPlanAsync(CreateBackupPlanRequest createBackupPlanRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupPlanRequest, CreateBackupPlanResult> asyncHandler);

    /**
     * <p>
     * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included
     * by specifying patterns for a <code>ListOfTags</code> and selected <code>Resources</code>.
     * </p>
     * <p>
     * For example, consider the following patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Resources: "arn:aws:ec2:region:account-id:volume/volume-id"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"department"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"finance"</code>
     * </p>
     * <p>
     * <code>ConditionType:"StringEquals"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"importance"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"critical"</code>
     * </p>
     * <p>
     * <code>ConditionType:"StringEquals"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as
     * <code>"department=finance"</code>, <code>"importance=critical"</code>, in addition to an EBS volume with the
     * specified volume Id.
     * </p>
     * <p>
     * Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't
     * be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put
     * together using the OR operator. In other words, all patterns that match are selected for backup.
     * </p>
     * 
     * @param createBackupSelectionRequest
     * @return A Java Future containing the result of the CreateBackupSelection operation returned by the service.
     * @sample AWSBackupAsync.CreateBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupSelectionResult> createBackupSelectionAsync(CreateBackupSelectionRequest createBackupSelectionRequest);

    /**
     * <p>
     * Creates a JSON document that specifies a set of resources to assign to a backup plan. Resources can be included
     * by specifying patterns for a <code>ListOfTags</code> and selected <code>Resources</code>.
     * </p>
     * <p>
     * For example, consider the following patterns:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Resources: "arn:aws:ec2:region:account-id:volume/volume-id"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"department"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"finance"</code>
     * </p>
     * <p>
     * <code>ConditionType:"StringEquals"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConditionKey:"importance"</code>
     * </p>
     * <p>
     * <code>ConditionValue:"critical"</code>
     * </p>
     * <p>
     * <code>ConditionType:"StringEquals"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Using these patterns would back up all Amazon Elastic Block Store (Amazon EBS) volumes that are tagged as
     * <code>"department=finance"</code>, <code>"importance=critical"</code>, in addition to an EBS volume with the
     * specified volume Id.
     * </p>
     * <p>
     * Resources and conditions are additive in that all resources that match the pattern are selected. This shouldn't
     * be confused with a logical AND, where all conditions must match. The matching patterns are logically 'put
     * together using the OR operator. In other words, all patterns that match are selected for backup.
     * </p>
     * 
     * @param createBackupSelectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackupSelection operation returned by the service.
     * @sample AWSBackupAsyncHandler.CreateBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupSelectionResult> createBackupSelectionAsync(CreateBackupSelectionRequest createBackupSelectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupSelectionRequest, CreateBackupSelectionResult> asyncHandler);

    /**
     * <p>
     * Creates a logical container where backups are stored. A <code>CreateBackupVault</code> request includes a name,
     * optionally one or more resource tags, an encryption key, and a request ID.
     * </p>
     * <note>
     * <p>
     * Sensitive data, such as passport numbers, should not be included the name of a backup vault.
     * </p>
     * </note>
     * 
     * @param createBackupVaultRequest
     * @return A Java Future containing the result of the CreateBackupVault operation returned by the service.
     * @sample AWSBackupAsync.CreateBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupVaultResult> createBackupVaultAsync(CreateBackupVaultRequest createBackupVaultRequest);

    /**
     * <p>
     * Creates a logical container where backups are stored. A <code>CreateBackupVault</code> request includes a name,
     * optionally one or more resource tags, an encryption key, and a request ID.
     * </p>
     * <note>
     * <p>
     * Sensitive data, such as passport numbers, should not be included the name of a backup vault.
     * </p>
     * </note>
     * 
     * @param createBackupVaultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBackupVault operation returned by the service.
     * @sample AWSBackupAsyncHandler.CreateBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBackupVaultResult> createBackupVaultAsync(CreateBackupVaultRequest createBackupVaultRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBackupVaultRequest, CreateBackupVaultResult> asyncHandler);

    /**
     * <p>
     * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been
     * deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will
     * still exist.
     * </p>
     * 
     * @param deleteBackupPlanRequest
     * @return A Java Future containing the result of the DeleteBackupPlan operation returned by the service.
     * @sample AWSBackupAsync.DeleteBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupPlanResult> deleteBackupPlanAsync(DeleteBackupPlanRequest deleteBackupPlanRequest);

    /**
     * <p>
     * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been
     * deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will
     * still exist.
     * </p>
     * 
     * @param deleteBackupPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackupPlan operation returned by the service.
     * @sample AWSBackupAsyncHandler.DeleteBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupPlanResult> deleteBackupPlanAsync(DeleteBackupPlanRequest deleteBackupPlanRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupPlanRequest, DeleteBackupPlanResult> asyncHandler);

    /**
     * <p>
     * Deletes the resource selection associated with a backup plan that is specified by the <code>SelectionId</code>.
     * </p>
     * 
     * @param deleteBackupSelectionRequest
     * @return A Java Future containing the result of the DeleteBackupSelection operation returned by the service.
     * @sample AWSBackupAsync.DeleteBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupSelectionResult> deleteBackupSelectionAsync(DeleteBackupSelectionRequest deleteBackupSelectionRequest);

    /**
     * <p>
     * Deletes the resource selection associated with a backup plan that is specified by the <code>SelectionId</code>.
     * </p>
     * 
     * @param deleteBackupSelectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackupSelection operation returned by the service.
     * @sample AWSBackupAsyncHandler.DeleteBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupSelectionResult> deleteBackupSelectionAsync(DeleteBackupSelectionRequest deleteBackupSelectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupSelectionRequest, DeleteBackupSelectionResult> asyncHandler);

    /**
     * <p>
     * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
     * </p>
     * 
     * @param deleteBackupVaultRequest
     * @return A Java Future containing the result of the DeleteBackupVault operation returned by the service.
     * @sample AWSBackupAsync.DeleteBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupVaultResult> deleteBackupVaultAsync(DeleteBackupVaultRequest deleteBackupVaultRequest);

    /**
     * <p>
     * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
     * </p>
     * 
     * @param deleteBackupVaultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackupVault operation returned by the service.
     * @sample AWSBackupAsyncHandler.DeleteBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupVaultResult> deleteBackupVaultAsync(DeleteBackupVaultRequest deleteBackupVaultRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultRequest, DeleteBackupVaultResult> asyncHandler);

    /**
     * <p>
     * Deletes the policy document that manages permissions on a backup vault.
     * </p>
     * 
     * @param deleteBackupVaultAccessPolicyRequest
     * @return A Java Future containing the result of the DeleteBackupVaultAccessPolicy operation returned by the
     *         service.
     * @sample AWSBackupAsync.DeleteBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupVaultAccessPolicyResult> deleteBackupVaultAccessPolicyAsync(
            DeleteBackupVaultAccessPolicyRequest deleteBackupVaultAccessPolicyRequest);

    /**
     * <p>
     * Deletes the policy document that manages permissions on a backup vault.
     * </p>
     * 
     * @param deleteBackupVaultAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackupVaultAccessPolicy operation returned by the
     *         service.
     * @sample AWSBackupAsyncHandler.DeleteBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupVaultAccessPolicyResult> deleteBackupVaultAccessPolicyAsync(
            DeleteBackupVaultAccessPolicyRequest deleteBackupVaultAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultAccessPolicyRequest, DeleteBackupVaultAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes event notifications for the specified backup vault.
     * </p>
     * 
     * @param deleteBackupVaultNotificationsRequest
     * @return A Java Future containing the result of the DeleteBackupVaultNotifications operation returned by the
     *         service.
     * @sample AWSBackupAsync.DeleteBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupVaultNotificationsResult> deleteBackupVaultNotificationsAsync(
            DeleteBackupVaultNotificationsRequest deleteBackupVaultNotificationsRequest);

    /**
     * <p>
     * Deletes event notifications for the specified backup vault.
     * </p>
     * 
     * @param deleteBackupVaultNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBackupVaultNotifications operation returned by the
     *         service.
     * @sample AWSBackupAsyncHandler.DeleteBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteBackupVaultNotificationsResult> deleteBackupVaultNotificationsAsync(
            DeleteBackupVaultNotificationsRequest deleteBackupVaultNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBackupVaultNotificationsRequest, DeleteBackupVaultNotificationsResult> asyncHandler);

    /**
     * <p>
     * Deletes the recovery point specified by a recovery point ID.
     * </p>
     * 
     * @param deleteRecoveryPointRequest
     * @return A Java Future containing the result of the DeleteRecoveryPoint operation returned by the service.
     * @sample AWSBackupAsync.DeleteRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteRecoveryPoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryPointResult> deleteRecoveryPointAsync(DeleteRecoveryPointRequest deleteRecoveryPointRequest);

    /**
     * <p>
     * Deletes the recovery point specified by a recovery point ID.
     * </p>
     * 
     * @param deleteRecoveryPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRecoveryPoint operation returned by the service.
     * @sample AWSBackupAsyncHandler.DeleteRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteRecoveryPoint" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRecoveryPointResult> deleteRecoveryPointAsync(DeleteRecoveryPointRequest deleteRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRecoveryPointRequest, DeleteRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * Returns metadata associated with creating a backup of a resource.
     * </p>
     * 
     * @param describeBackupJobRequest
     * @return A Java Future containing the result of the DescribeBackupJob operation returned by the service.
     * @sample AWSBackupAsync.DescribeBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupJobResult> describeBackupJobAsync(DescribeBackupJobRequest describeBackupJobRequest);

    /**
     * <p>
     * Returns metadata associated with creating a backup of a resource.
     * </p>
     * 
     * @param describeBackupJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackupJob operation returned by the service.
     * @sample AWSBackupAsyncHandler.DescribeBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupJobResult> describeBackupJobAsync(DescribeBackupJobRequest describeBackupJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupJobRequest, DescribeBackupJobResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about a backup vault specified by its name.
     * </p>
     * 
     * @param describeBackupVaultRequest
     * @return A Java Future containing the result of the DescribeBackupVault operation returned by the service.
     * @sample AWSBackupAsync.DescribeBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupVaultResult> describeBackupVaultAsync(DescribeBackupVaultRequest describeBackupVaultRequest);

    /**
     * <p>
     * Returns metadata about a backup vault specified by its name.
     * </p>
     * 
     * @param describeBackupVaultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBackupVault operation returned by the service.
     * @sample AWSBackupAsyncHandler.DescribeBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBackupVaultResult> describeBackupVaultAsync(DescribeBackupVaultRequest describeBackupVaultRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBackupVaultRequest, DescribeBackupVaultResult> asyncHandler);

    /**
     * <p>
     * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name
     * (ARN), and the AWS service type of the saved resource.
     * </p>
     * 
     * @param describeProtectedResourceRequest
     * @return A Java Future containing the result of the DescribeProtectedResource operation returned by the service.
     * @sample AWSBackupAsync.DescribeProtectedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeProtectedResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectedResourceResult> describeProtectedResourceAsync(
            DescribeProtectedResourceRequest describeProtectedResourceRequest);

    /**
     * <p>
     * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name
     * (ARN), and the AWS service type of the saved resource.
     * </p>
     * 
     * @param describeProtectedResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProtectedResource operation returned by the service.
     * @sample AWSBackupAsyncHandler.DescribeProtectedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeProtectedResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectedResourceResult> describeProtectedResourceAsync(
            DescribeProtectedResourceRequest describeProtectedResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProtectedResourceRequest, DescribeProtectedResourceResult> asyncHandler);

    /**
     * <p>
     * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
     * </p>
     * 
     * @param describeRecoveryPointRequest
     * @return A Java Future containing the result of the DescribeRecoveryPoint operation returned by the service.
     * @sample AWSBackupAsync.DescribeRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRecoveryPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecoveryPointResult> describeRecoveryPointAsync(DescribeRecoveryPointRequest describeRecoveryPointRequest);

    /**
     * <p>
     * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
     * </p>
     * 
     * @param describeRecoveryPointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecoveryPoint operation returned by the service.
     * @sample AWSBackupAsyncHandler.DescribeRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRecoveryPoint" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecoveryPointResult> describeRecoveryPointAsync(DescribeRecoveryPointRequest describeRecoveryPointRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecoveryPointRequest, DescribeRecoveryPointResult> asyncHandler);

    /**
     * <p>
     * Returns metadata associated with a restore job that is specified by a job ID.
     * </p>
     * 
     * @param describeRestoreJobRequest
     * @return A Java Future containing the result of the DescribeRestoreJob operation returned by the service.
     * @sample AWSBackupAsync.DescribeRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRestoreJobResult> describeRestoreJobAsync(DescribeRestoreJobRequest describeRestoreJobRequest);

    /**
     * <p>
     * Returns metadata associated with a restore job that is specified by a job ID.
     * </p>
     * 
     * @param describeRestoreJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRestoreJob operation returned by the service.
     * @sample AWSBackupAsyncHandler.DescribeRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRestoreJobResult> describeRestoreJobAsync(DescribeRestoreJobRequest describeRestoreJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRestoreJobRequest, DescribeRestoreJobResult> asyncHandler);

    /**
     * <p>
     * Returns the backup plan that is specified by the plan ID as a backup template.
     * </p>
     * 
     * @param exportBackupPlanTemplateRequest
     * @return A Java Future containing the result of the ExportBackupPlanTemplate operation returned by the service.
     * @sample AWSBackupAsync.ExportBackupPlanTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ExportBackupPlanTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportBackupPlanTemplateResult> exportBackupPlanTemplateAsync(ExportBackupPlanTemplateRequest exportBackupPlanTemplateRequest);

    /**
     * <p>
     * Returns the backup plan that is specified by the plan ID as a backup template.
     * </p>
     * 
     * @param exportBackupPlanTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportBackupPlanTemplate operation returned by the service.
     * @sample AWSBackupAsyncHandler.ExportBackupPlanTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ExportBackupPlanTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ExportBackupPlanTemplateResult> exportBackupPlanTemplateAsync(ExportBackupPlanTemplateRequest exportBackupPlanTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<ExportBackupPlanTemplateRequest, ExportBackupPlanTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns the body of a backup plan in JSON format, in addition to plan metadata.
     * </p>
     * 
     * @param getBackupPlanRequest
     * @return A Java Future containing the result of the GetBackupPlan operation returned by the service.
     * @sample AWSBackupAsync.GetBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBackupPlanResult> getBackupPlanAsync(GetBackupPlanRequest getBackupPlanRequest);

    /**
     * <p>
     * Returns the body of a backup plan in JSON format, in addition to plan metadata.
     * </p>
     * 
     * @param getBackupPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackupPlan operation returned by the service.
     * @sample AWSBackupAsyncHandler.GetBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBackupPlanResult> getBackupPlanAsync(GetBackupPlanRequest getBackupPlanRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackupPlanRequest, GetBackupPlanResult> asyncHandler);

    /**
     * <p>
     * Returns a valid JSON document specifying a backup plan or an error.
     * </p>
     * 
     * @param getBackupPlanFromJSONRequest
     * @return A Java Future containing the result of the GetBackupPlanFromJSON operation returned by the service.
     * @sample AWSBackupAsync.GetBackupPlanFromJSON
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromJSON" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupPlanFromJSONResult> getBackupPlanFromJSONAsync(GetBackupPlanFromJSONRequest getBackupPlanFromJSONRequest);

    /**
     * <p>
     * Returns a valid JSON document specifying a backup plan or an error.
     * </p>
     * 
     * @param getBackupPlanFromJSONRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackupPlanFromJSON operation returned by the service.
     * @sample AWSBackupAsyncHandler.GetBackupPlanFromJSON
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromJSON" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupPlanFromJSONResult> getBackupPlanFromJSONAsync(GetBackupPlanFromJSONRequest getBackupPlanFromJSONRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackupPlanFromJSONRequest, GetBackupPlanFromJSONResult> asyncHandler);

    /**
     * <p>
     * Returns the template specified by its <code>templateId</code> as a backup plan.
     * </p>
     * 
     * @param getBackupPlanFromTemplateRequest
     * @return A Java Future containing the result of the GetBackupPlanFromTemplate operation returned by the service.
     * @sample AWSBackupAsync.GetBackupPlanFromTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupPlanFromTemplateResult> getBackupPlanFromTemplateAsync(
            GetBackupPlanFromTemplateRequest getBackupPlanFromTemplateRequest);

    /**
     * <p>
     * Returns the template specified by its <code>templateId</code> as a backup plan.
     * </p>
     * 
     * @param getBackupPlanFromTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackupPlanFromTemplate operation returned by the service.
     * @sample AWSBackupAsyncHandler.GetBackupPlanFromTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupPlanFromTemplateResult> getBackupPlanFromTemplateAsync(
            GetBackupPlanFromTemplateRequest getBackupPlanFromTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackupPlanFromTemplateRequest, GetBackupPlanFromTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated
     * with a backup plan.
     * </p>
     * 
     * @param getBackupSelectionRequest
     * @return A Java Future containing the result of the GetBackupSelection operation returned by the service.
     * @sample AWSBackupAsync.GetBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupSelection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBackupSelectionResult> getBackupSelectionAsync(GetBackupSelectionRequest getBackupSelectionRequest);

    /**
     * <p>
     * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated
     * with a backup plan.
     * </p>
     * 
     * @param getBackupSelectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackupSelection operation returned by the service.
     * @sample AWSBackupAsyncHandler.GetBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupSelection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBackupSelectionResult> getBackupSelectionAsync(GetBackupSelectionRequest getBackupSelectionRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackupSelectionRequest, GetBackupSelectionResult> asyncHandler);

    /**
     * <p>
     * Returns the access policy document that is associated with the named backup vault.
     * </p>
     * 
     * @param getBackupVaultAccessPolicyRequest
     * @return A Java Future containing the result of the GetBackupVaultAccessPolicy operation returned by the service.
     * @sample AWSBackupAsync.GetBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupVaultAccessPolicyResult> getBackupVaultAccessPolicyAsync(
            GetBackupVaultAccessPolicyRequest getBackupVaultAccessPolicyRequest);

    /**
     * <p>
     * Returns the access policy document that is associated with the named backup vault.
     * </p>
     * 
     * @param getBackupVaultAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackupVaultAccessPolicy operation returned by the service.
     * @sample AWSBackupAsyncHandler.GetBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupVaultAccessPolicyResult> getBackupVaultAccessPolicyAsync(
            GetBackupVaultAccessPolicyRequest getBackupVaultAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackupVaultAccessPolicyRequest, GetBackupVaultAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns event notifications for the specified backup vault.
     * </p>
     * 
     * @param getBackupVaultNotificationsRequest
     * @return A Java Future containing the result of the GetBackupVaultNotifications operation returned by the service.
     * @sample AWSBackupAsync.GetBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupVaultNotificationsResult> getBackupVaultNotificationsAsync(
            GetBackupVaultNotificationsRequest getBackupVaultNotificationsRequest);

    /**
     * <p>
     * Returns event notifications for the specified backup vault.
     * </p>
     * 
     * @param getBackupVaultNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBackupVaultNotifications operation returned by the service.
     * @sample AWSBackupAsyncHandler.GetBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetBackupVaultNotificationsResult> getBackupVaultNotificationsAsync(
            GetBackupVaultNotificationsRequest getBackupVaultNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBackupVaultNotificationsRequest, GetBackupVaultNotificationsResult> asyncHandler);

    /**
     * <p>
     * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was
     * created with. The second set lists the metadata key-value pairs that are required to restore the recovery point.
     * </p>
     * <p>
     * These sets can be the same, or the restore metadata set can contain different values if the target service to be
     * restored has changed since the recovery point was created and now requires additional or different information in
     * order to be restored.
     * </p>
     * 
     * @param getRecoveryPointRestoreMetadataRequest
     * @return A Java Future containing the result of the GetRecoveryPointRestoreMetadata operation returned by the
     *         service.
     * @sample AWSBackupAsync.GetRecoveryPointRestoreMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRecoveryPointRestoreMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryPointRestoreMetadataResult> getRecoveryPointRestoreMetadataAsync(
            GetRecoveryPointRestoreMetadataRequest getRecoveryPointRestoreMetadataRequest);

    /**
     * <p>
     * Returns two sets of metadata key-value pairs. The first set lists the metadata that the recovery point was
     * created with. The second set lists the metadata key-value pairs that are required to restore the recovery point.
     * </p>
     * <p>
     * These sets can be the same, or the restore metadata set can contain different values if the target service to be
     * restored has changed since the recovery point was created and now requires additional or different information in
     * order to be restored.
     * </p>
     * 
     * @param getRecoveryPointRestoreMetadataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRecoveryPointRestoreMetadata operation returned by the
     *         service.
     * @sample AWSBackupAsyncHandler.GetRecoveryPointRestoreMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRecoveryPointRestoreMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRecoveryPointRestoreMetadataResult> getRecoveryPointRestoreMetadataAsync(
            GetRecoveryPointRestoreMetadataRequest getRecoveryPointRestoreMetadataRequest,
            com.amazonaws.handlers.AsyncHandler<GetRecoveryPointRestoreMetadataRequest, GetRecoveryPointRestoreMetadataResult> asyncHandler);

    /**
     * <p>
     * Returns the AWS resource types supported by AWS Backup.
     * </p>
     * 
     * @param getSupportedResourceTypesRequest
     * @return A Java Future containing the result of the GetSupportedResourceTypes operation returned by the service.
     * @sample AWSBackupAsync.GetSupportedResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetSupportedResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSupportedResourceTypesResult> getSupportedResourceTypesAsync(
            GetSupportedResourceTypesRequest getSupportedResourceTypesRequest);

    /**
     * <p>
     * Returns the AWS resource types supported by AWS Backup.
     * </p>
     * 
     * @param getSupportedResourceTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSupportedResourceTypes operation returned by the service.
     * @sample AWSBackupAsyncHandler.GetSupportedResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetSupportedResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSupportedResourceTypesResult> getSupportedResourceTypesAsync(
            GetSupportedResourceTypesRequest getSupportedResourceTypesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSupportedResourceTypesRequest, GetSupportedResourceTypesResult> asyncHandler);

    /**
     * <p>
     * Returns metadata about your backup jobs.
     * </p>
     * 
     * @param listBackupJobsRequest
     * @return A Java Future containing the result of the ListBackupJobs operation returned by the service.
     * @sample AWSBackupAsync.ListBackupJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupJobsResult> listBackupJobsAsync(ListBackupJobsRequest listBackupJobsRequest);

    /**
     * <p>
     * Returns metadata about your backup jobs.
     * </p>
     * 
     * @param listBackupJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackupJobs operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListBackupJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupJobsResult> listBackupJobsAsync(ListBackupJobsRequest listBackupJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackupJobsRequest, ListBackupJobsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and
     * deletion dates.
     * </p>
     * 
     * @param listBackupPlanTemplatesRequest
     * @return A Java Future containing the result of the ListBackupPlanTemplates operation returned by the service.
     * @sample AWSBackupAsync.ListBackupPlanTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackupPlanTemplatesResult> listBackupPlanTemplatesAsync(ListBackupPlanTemplatesRequest listBackupPlanTemplatesRequest);

    /**
     * <p>
     * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and
     * deletion dates.
     * </p>
     * 
     * @param listBackupPlanTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackupPlanTemplates operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListBackupPlanTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackupPlanTemplatesResult> listBackupPlanTemplatesAsync(ListBackupPlanTemplatesRequest listBackupPlanTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackupPlanTemplatesRequest, ListBackupPlanTemplatesResult> asyncHandler);

    /**
     * <p>
     * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation
     * and deletion dates, plan names, and version IDs.
     * </p>
     * 
     * @param listBackupPlanVersionsRequest
     * @return A Java Future containing the result of the ListBackupPlanVersions operation returned by the service.
     * @sample AWSBackupAsync.ListBackupPlanVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackupPlanVersionsResult> listBackupPlanVersionsAsync(ListBackupPlanVersionsRequest listBackupPlanVersionsRequest);

    /**
     * <p>
     * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation
     * and deletion dates, plan names, and version IDs.
     * </p>
     * 
     * @param listBackupPlanVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackupPlanVersions operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListBackupPlanVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanVersions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackupPlanVersionsResult> listBackupPlanVersionsAsync(ListBackupPlanVersionsRequest listBackupPlanVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackupPlanVersionsRequest, ListBackupPlanVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and
     * deletion dates, version IDs, plan names, and creator request IDs.
     * </p>
     * 
     * @param listBackupPlansRequest
     * @return A Java Future containing the result of the ListBackupPlans operation returned by the service.
     * @sample AWSBackupAsync.ListBackupPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlans" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupPlansResult> listBackupPlansAsync(ListBackupPlansRequest listBackupPlansRequest);

    /**
     * <p>
     * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and
     * deletion dates, version IDs, plan names, and creator request IDs.
     * </p>
     * 
     * @param listBackupPlansRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackupPlans operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListBackupPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlans" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupPlansResult> listBackupPlansAsync(ListBackupPlansRequest listBackupPlansRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackupPlansRequest, ListBackupPlansResult> asyncHandler);

    /**
     * <p>
     * Returns an array containing metadata of the resources associated with the target backup plan.
     * </p>
     * 
     * @param listBackupSelectionsRequest
     * @return A Java Future containing the result of the ListBackupSelections operation returned by the service.
     * @sample AWSBackupAsync.ListBackupSelections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupSelections" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackupSelectionsResult> listBackupSelectionsAsync(ListBackupSelectionsRequest listBackupSelectionsRequest);

    /**
     * <p>
     * Returns an array containing metadata of the resources associated with the target backup plan.
     * </p>
     * 
     * @param listBackupSelectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackupSelections operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListBackupSelections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupSelections" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListBackupSelectionsResult> listBackupSelectionsAsync(ListBackupSelectionsRequest listBackupSelectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackupSelectionsRequest, ListBackupSelectionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of recovery point storage containers along with information about them.
     * </p>
     * 
     * @param listBackupVaultsRequest
     * @return A Java Future containing the result of the ListBackupVaults operation returned by the service.
     * @sample AWSBackupAsync.ListBackupVaults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupVaults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupVaultsResult> listBackupVaultsAsync(ListBackupVaultsRequest listBackupVaultsRequest);

    /**
     * <p>
     * Returns a list of recovery point storage containers along with information about them.
     * </p>
     * 
     * @param listBackupVaultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBackupVaults operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListBackupVaults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupVaults" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBackupVaultsResult> listBackupVaultsAsync(ListBackupVaultsRequest listBackupVaultsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBackupVaultsRequest, ListBackupVaultsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an
     * Amazon Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * 
     * @param listProtectedResourcesRequest
     * @return A Java Future containing the result of the ListProtectedResources operation returned by the service.
     * @sample AWSBackupAsync.ListProtectedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListProtectedResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProtectedResourcesResult> listProtectedResourcesAsync(ListProtectedResourcesRequest listProtectedResourcesRequest);

    /**
     * <p>
     * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an
     * Amazon Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * 
     * @param listProtectedResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProtectedResources operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListProtectedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListProtectedResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProtectedResourcesResult> listProtectedResourcesAsync(ListProtectedResourcesRequest listProtectedResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListProtectedResourcesRequest, ListProtectedResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about the recovery points stored in a backup vault.
     * </p>
     * 
     * @param listRecoveryPointsByBackupVaultRequest
     * @return A Java Future containing the result of the ListRecoveryPointsByBackupVault operation returned by the
     *         service.
     * @sample AWSBackupAsync.ListRecoveryPointsByBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByBackupVault"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryPointsByBackupVaultResult> listRecoveryPointsByBackupVaultAsync(
            ListRecoveryPointsByBackupVaultRequest listRecoveryPointsByBackupVaultRequest);

    /**
     * <p>
     * Returns detailed information about the recovery points stored in a backup vault.
     * </p>
     * 
     * @param listRecoveryPointsByBackupVaultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecoveryPointsByBackupVault operation returned by the
     *         service.
     * @sample AWSBackupAsyncHandler.ListRecoveryPointsByBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByBackupVault"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryPointsByBackupVaultResult> listRecoveryPointsByBackupVaultAsync(
            ListRecoveryPointsByBackupVaultRequest listRecoveryPointsByBackupVaultRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsByBackupVaultRequest, ListRecoveryPointsByBackupVaultResult> asyncHandler);

    /**
     * <p>
     * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param listRecoveryPointsByResourceRequest
     * @return A Java Future containing the result of the ListRecoveryPointsByResource operation returned by the
     *         service.
     * @sample AWSBackupAsync.ListRecoveryPointsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryPointsByResourceResult> listRecoveryPointsByResourceAsync(
            ListRecoveryPointsByResourceRequest listRecoveryPointsByResourceRequest);

    /**
     * <p>
     * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param listRecoveryPointsByResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecoveryPointsByResource operation returned by the
     *         service.
     * @sample AWSBackupAsyncHandler.ListRecoveryPointsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecoveryPointsByResourceResult> listRecoveryPointsByResourceAsync(
            ListRecoveryPointsByResourceRequest listRecoveryPointsByResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecoveryPointsByResourceRequest, ListRecoveryPointsByResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the
     * recovery process.
     * </p>
     * 
     * @param listRestoreJobsRequest
     * @return A Java Future containing the result of the ListRestoreJobs operation returned by the service.
     * @sample AWSBackupAsync.ListRestoreJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRestoreJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRestoreJobsResult> listRestoreJobsAsync(ListRestoreJobsRequest listRestoreJobsRequest);

    /**
     * <p>
     * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the
     * recovery process.
     * </p>
     * 
     * @param listRestoreJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRestoreJobs operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListRestoreJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRestoreJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRestoreJobsResult> listRestoreJobsAsync(ListRestoreJobsRequest listRestoreJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRestoreJobsRequest, ListRestoreJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
     * </p>
     * 
     * @param listTagsRequest
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSBackupAsync.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
     * </p>
     * 
     * @param listTagsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation returned by the service.
     * @sample AWSBackupAsyncHandler.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

    /**
     * <p>
     * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a
     * backup vault name and an access policy document in JSON format.
     * </p>
     * 
     * @param putBackupVaultAccessPolicyRequest
     * @return A Java Future containing the result of the PutBackupVaultAccessPolicy operation returned by the service.
     * @sample AWSBackupAsync.PutBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBackupVaultAccessPolicyResult> putBackupVaultAccessPolicyAsync(
            PutBackupVaultAccessPolicyRequest putBackupVaultAccessPolicyRequest);

    /**
     * <p>
     * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a
     * backup vault name and an access policy document in JSON format.
     * </p>
     * 
     * @param putBackupVaultAccessPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBackupVaultAccessPolicy operation returned by the service.
     * @sample AWSBackupAsyncHandler.PutBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBackupVaultAccessPolicyResult> putBackupVaultAccessPolicyAsync(
            PutBackupVaultAccessPolicyRequest putBackupVaultAccessPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutBackupVaultAccessPolicyRequest, PutBackupVaultAccessPolicyResult> asyncHandler);

    /**
     * <p>
     * Turns on notifications on a backup vault for the specified topic and events.
     * </p>
     * 
     * @param putBackupVaultNotificationsRequest
     * @return A Java Future containing the result of the PutBackupVaultNotifications operation returned by the service.
     * @sample AWSBackupAsync.PutBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBackupVaultNotificationsResult> putBackupVaultNotificationsAsync(
            PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest);

    /**
     * <p>
     * Turns on notifications on a backup vault for the specified topic and events.
     * </p>
     * 
     * @param putBackupVaultNotificationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutBackupVaultNotifications operation returned by the service.
     * @sample AWSBackupAsyncHandler.PutBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutBackupVaultNotificationsResult> putBackupVaultNotificationsAsync(
            PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest,
            com.amazonaws.handlers.AsyncHandler<PutBackupVaultNotificationsRequest, PutBackupVaultNotificationsResult> asyncHandler);

    /**
     * <p>
     * Starts a job to create a one-time backup of the specified resource.
     * </p>
     * 
     * @param startBackupJobRequest
     * @return A Java Future containing the result of the StartBackupJob operation returned by the service.
     * @sample AWSBackupAsync.StartBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartBackupJobResult> startBackupJobAsync(StartBackupJobRequest startBackupJobRequest);

    /**
     * <p>
     * Starts a job to create a one-time backup of the specified resource.
     * </p>
     * 
     * @param startBackupJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartBackupJob operation returned by the service.
     * @sample AWSBackupAsyncHandler.StartBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartBackupJobResult> startBackupJobAsync(StartBackupJobRequest startBackupJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartBackupJobRequest, StartBackupJobResult> asyncHandler);

    /**
     * <p>
     * Recovers the saved resource identified by an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If
     * the ARN of a recovery point is supplied, then that recovery point is restored.
     * </p>
     * 
     * @param startRestoreJobRequest
     * @return A Java Future containing the result of the StartRestoreJob operation returned by the service.
     * @sample AWSBackupAsync.StartRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartRestoreJobResult> startRestoreJobAsync(StartRestoreJobRequest startRestoreJobRequest);

    /**
     * <p>
     * Recovers the saved resource identified by an Amazon Resource Name (ARN).
     * </p>
     * <p>
     * If the resource ARN is included in the request, then the last complete backup of that resource is recovered. If
     * the ARN of a recovery point is supplied, then that recovery point is restored.
     * </p>
     * 
     * @param startRestoreJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartRestoreJob operation returned by the service.
     * @sample AWSBackupAsyncHandler.StartRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartRestoreJobResult> startRestoreJobAsync(StartRestoreJobRequest startRestoreJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartRestoreJobRequest, StartRestoreJobResult> asyncHandler);

    /**
     * <p>
     * Attempts to cancel a job to create a one-time backup of a resource.
     * </p>
     * 
     * @param stopBackupJobRequest
     * @return A Java Future containing the result of the StopBackupJob operation returned by the service.
     * @sample AWSBackupAsync.StopBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StopBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopBackupJobResult> stopBackupJobAsync(StopBackupJobRequest stopBackupJobRequest);

    /**
     * <p>
     * Attempts to cancel a job to create a one-time backup of a resource.
     * </p>
     * 
     * @param stopBackupJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopBackupJob operation returned by the service.
     * @sample AWSBackupAsyncHandler.StopBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StopBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopBackupJobResult> stopBackupJobAsync(StopBackupJobRequest stopBackupJobRequest,
            com.amazonaws.handlers.AsyncHandler<StopBackupJobRequest, StopBackupJobResult> asyncHandler);

    /**
     * <p>
     * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBackupAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSBackupAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN)
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBackupAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN)
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSBackupAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Replaces the body of a saved backup plan identified by its <code>backupPlanId</code> with the input document in
     * JSON format. The new version is uniquely identified by a <code>VersionId</code>.
     * </p>
     * 
     * @param updateBackupPlanRequest
     * @return A Java Future containing the result of the UpdateBackupPlan operation returned by the service.
     * @sample AWSBackupAsync.UpdateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackupPlanResult> updateBackupPlanAsync(UpdateBackupPlanRequest updateBackupPlanRequest);

    /**
     * <p>
     * Replaces the body of a saved backup plan identified by its <code>backupPlanId</code> with the input document in
     * JSON format. The new version is uniquely identified by a <code>VersionId</code>.
     * </p>
     * 
     * @param updateBackupPlanRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBackupPlan operation returned by the service.
     * @sample AWSBackupAsyncHandler.UpdateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBackupPlanResult> updateBackupPlanAsync(UpdateBackupPlanRequest updateBackupPlanRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBackupPlanRequest, UpdateBackupPlanResult> asyncHandler);

    /**
     * <p>
     * Sets the transition lifecycle of a recovery point.
     * </p>
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param updateRecoveryPointLifecycleRequest
     * @return A Java Future containing the result of the UpdateRecoveryPointLifecycle operation returned by the
     *         service.
     * @sample AWSBackupAsync.UpdateRecoveryPointLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRecoveryPointLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecoveryPointLifecycleResult> updateRecoveryPointLifecycleAsync(
            UpdateRecoveryPointLifecycleRequest updateRecoveryPointLifecycleRequest);

    /**
     * <p>
     * Sets the transition lifecycle of a recovery point.
     * </p>
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param updateRecoveryPointLifecycleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRecoveryPointLifecycle operation returned by the
     *         service.
     * @sample AWSBackupAsyncHandler.UpdateRecoveryPointLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRecoveryPointLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRecoveryPointLifecycleResult> updateRecoveryPointLifecycleAsync(
            UpdateRecoveryPointLifecycleRequest updateRecoveryPointLifecycleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRecoveryPointLifecycleRequest, UpdateRecoveryPointLifecycleResult> asyncHandler);

}
