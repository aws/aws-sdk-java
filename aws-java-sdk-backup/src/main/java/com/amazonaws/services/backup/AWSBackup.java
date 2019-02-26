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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.backup.model.*;

/**
 * Interface for accessing AWS Backup.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.backup.AbstractAWSBackup} instead.
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
public interface AWSBackup {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "backup";

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
     * @return Result of the CreateBackupPlan operation returned by the service.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.CreateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBackupPlanResult createBackupPlan(CreateBackupPlanRequest createBackupPlanRequest);

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
     * @return Result of the CreateBackupSelection operation returned by the service.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.CreateBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    CreateBackupSelectionResult createBackupSelection(CreateBackupSelectionRequest createBackupSelectionRequest);

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
     * @return Result of the CreateBackupVault operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws AlreadyExistsException
     *         The required resource already exists.
     * @sample AWSBackup.CreateBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBackupVaultResult createBackupVault(CreateBackupVaultRequest createBackupVaultRequest);

    /**
     * <p>
     * Deletes a backup plan. A backup plan can only be deleted after all associated selections of resources have been
     * deleted. Deleting a backup plan deletes the current version of a backup plan. Previous versions, if any, will
     * still exist.
     * </p>
     * 
     * @param deleteBackupPlanRequest
     * @return Result of the DeleteBackupPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DeleteBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupPlanResult deleteBackupPlan(DeleteBackupPlanRequest deleteBackupPlanRequest);

    /**
     * <p>
     * Deletes the resource selection associated with a backup plan that is specified by the <code>SelectionId</code>.
     * </p>
     * 
     * @param deleteBackupSelectionRequest
     * @return Result of the DeleteBackupSelection operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DeleteBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupSelection" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteBackupSelectionResult deleteBackupSelection(DeleteBackupSelectionRequest deleteBackupSelectionRequest);

    /**
     * <p>
     * Deletes the backup vault identified by its name. A vault can be deleted only if it is empty.
     * </p>
     * 
     * @param deleteBackupVaultRequest
     * @return Result of the DeleteBackupVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DeleteBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupVaultResult deleteBackupVault(DeleteBackupVaultRequest deleteBackupVaultRequest);

    /**
     * <p>
     * Deletes the policy document that manages permissions on a backup vault.
     * </p>
     * 
     * @param deleteBackupVaultAccessPolicyRequest
     * @return Result of the DeleteBackupVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DeleteBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBackupVaultAccessPolicyResult deleteBackupVaultAccessPolicy(DeleteBackupVaultAccessPolicyRequest deleteBackupVaultAccessPolicyRequest);

    /**
     * <p>
     * Deletes event notifications for the specified backup vault.
     * </p>
     * 
     * @param deleteBackupVaultNotificationsRequest
     * @return Result of the DeleteBackupVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DeleteBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteBackupVaultNotificationsResult deleteBackupVaultNotifications(DeleteBackupVaultNotificationsRequest deleteBackupVaultNotificationsRequest);

    /**
     * <p>
     * Deletes the recovery point specified by a recovery point ID.
     * </p>
     * 
     * @param deleteRecoveryPointRequest
     * @return Result of the DeleteRecoveryPoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.DeleteRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DeleteRecoveryPoint" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRecoveryPointResult deleteRecoveryPoint(DeleteRecoveryPointRequest deleteRecoveryPointRequest);

    /**
     * <p>
     * Returns metadata associated with creating a backup of a resource.
     * </p>
     * 
     * @param describeBackupJobRequest
     * @return Result of the DescribeBackupJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws DependencyFailureException
     *         A dependent AWS service or resource returned an error to the AWS Backup service, and the action cannot be
     *         completed.
     * @sample AWSBackup.DescribeBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBackupJobResult describeBackupJob(DescribeBackupJobRequest describeBackupJobRequest);

    /**
     * <p>
     * Returns metadata about a backup vault specified by its name.
     * </p>
     * 
     * @param describeBackupVaultRequest
     * @return Result of the DescribeBackupVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupVault" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBackupVaultResult describeBackupVault(DescribeBackupVaultRequest describeBackupVaultRequest);

    /**
     * <p>
     * Returns information about a saved resource, including the last time it was backed-up, its Amazon Resource Name
     * (ARN), and the AWS service type of the saved resource.
     * </p>
     * 
     * @param describeProtectedResourceRequest
     * @return Result of the DescribeProtectedResource operation returned by the service.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.DescribeProtectedResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeProtectedResource"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProtectedResourceResult describeProtectedResource(DescribeProtectedResourceRequest describeProtectedResourceRequest);

    /**
     * <p>
     * Returns metadata associated with a recovery point, including ID, status, encryption, and lifecycle.
     * </p>
     * 
     * @param describeRecoveryPointRequest
     * @return Result of the DescribeRecoveryPoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.DescribeRecoveryPoint
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRecoveryPoint" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeRecoveryPointResult describeRecoveryPoint(DescribeRecoveryPointRequest describeRecoveryPointRequest);

    /**
     * <p>
     * Returns metadata associated with a restore job that is specified by a job ID.
     * </p>
     * 
     * @param describeRestoreJobRequest
     * @return Result of the DescribeRestoreJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws DependencyFailureException
     *         A dependent AWS service or resource returned an error to the AWS Backup service, and the action cannot be
     *         completed.
     * @sample AWSBackup.DescribeRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeRestoreJobResult describeRestoreJob(DescribeRestoreJobRequest describeRestoreJobRequest);

    /**
     * <p>
     * Returns the backup plan that is specified by the plan ID as a backup template.
     * </p>
     * 
     * @param exportBackupPlanTemplateRequest
     * @return Result of the ExportBackupPlanTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.ExportBackupPlanTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ExportBackupPlanTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    ExportBackupPlanTemplateResult exportBackupPlanTemplate(ExportBackupPlanTemplateRequest exportBackupPlanTemplateRequest);

    /**
     * <p>
     * Returns the body of a backup plan in JSON format, in addition to plan metadata.
     * </p>
     * 
     * @param getBackupPlanRequest
     * @return Result of the GetBackupPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    GetBackupPlanResult getBackupPlan(GetBackupPlanRequest getBackupPlanRequest);

    /**
     * <p>
     * Returns a valid JSON document specifying a backup plan or an error.
     * </p>
     * 
     * @param getBackupPlanFromJSONRequest
     * @return Result of the GetBackupPlanFromJSON operation returned by the service.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @sample AWSBackup.GetBackupPlanFromJSON
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromJSON" target="_top">AWS
     *      API Documentation</a>
     */
    GetBackupPlanFromJSONResult getBackupPlanFromJSON(GetBackupPlanFromJSONRequest getBackupPlanFromJSONRequest);

    /**
     * <p>
     * Returns the template specified by its <code>templateId</code> as a backup plan.
     * </p>
     * 
     * @param getBackupPlanFromTemplateRequest
     * @return Result of the GetBackupPlanFromTemplate operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.GetBackupPlanFromTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupPlanFromTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetBackupPlanFromTemplateResult getBackupPlanFromTemplate(GetBackupPlanFromTemplateRequest getBackupPlanFromTemplateRequest);

    /**
     * <p>
     * Returns selection metadata and a document in JSON format that specifies a list of resources that are associated
     * with a backup plan.
     * </p>
     * 
     * @param getBackupSelectionRequest
     * @return Result of the GetBackupSelection operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupSelection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupSelection" target="_top">AWS API
     *      Documentation</a>
     */
    GetBackupSelectionResult getBackupSelection(GetBackupSelectionRequest getBackupSelectionRequest);

    /**
     * <p>
     * Returns the access policy document that is associated with the named backup vault.
     * </p>
     * 
     * @param getBackupVaultAccessPolicyRequest
     * @return Result of the GetBackupVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetBackupVaultAccessPolicyResult getBackupVaultAccessPolicy(GetBackupVaultAccessPolicyRequest getBackupVaultAccessPolicyRequest);

    /**
     * <p>
     * Returns event notifications for the specified backup vault.
     * </p>
     * 
     * @param getBackupVaultNotificationsRequest
     * @return Result of the GetBackupVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    GetBackupVaultNotificationsResult getBackupVaultNotifications(GetBackupVaultNotificationsRequest getBackupVaultNotificationsRequest);

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
     * @return Result of the GetRecoveryPointRestoreMetadata operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetRecoveryPointRestoreMetadata
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetRecoveryPointRestoreMetadata"
     *      target="_top">AWS API Documentation</a>
     */
    GetRecoveryPointRestoreMetadataResult getRecoveryPointRestoreMetadata(GetRecoveryPointRestoreMetadataRequest getRecoveryPointRestoreMetadataRequest);

    /**
     * <p>
     * Returns the AWS resource types supported by AWS Backup.
     * </p>
     * 
     * @param getSupportedResourceTypesRequest
     * @return Result of the GetSupportedResourceTypes operation returned by the service.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.GetSupportedResourceTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/GetSupportedResourceTypes"
     *      target="_top">AWS API Documentation</a>
     */
    GetSupportedResourceTypesResult getSupportedResourceTypes(GetSupportedResourceTypesRequest getSupportedResourceTypesRequest);

    /**
     * <p>
     * Returns metadata about your backup jobs.
     * </p>
     * 
     * @param listBackupJobsRequest
     * @return Result of the ListBackupJobs operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListBackupJobsResult listBackupJobs(ListBackupJobsRequest listBackupJobsRequest);

    /**
     * <p>
     * Returns metadata of your saved backup plan templates, including the template ID, name, and the creation and
     * deletion dates.
     * </p>
     * 
     * @param listBackupPlanTemplatesRequest
     * @return Result of the ListBackupPlanTemplates operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @sample AWSBackup.ListBackupPlanTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanTemplates" target="_top">AWS
     *      API Documentation</a>
     */
    ListBackupPlanTemplatesResult listBackupPlanTemplates(ListBackupPlanTemplatesRequest listBackupPlanTemplatesRequest);

    /**
     * <p>
     * Returns version metadata of your backup plans, including Amazon Resource Names (ARNs), backup plan IDs, creation
     * and deletion dates, plan names, and version IDs.
     * </p>
     * 
     * @param listBackupPlanVersionsRequest
     * @return Result of the ListBackupPlanVersions operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupPlanVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlanVersions" target="_top">AWS
     *      API Documentation</a>
     */
    ListBackupPlanVersionsResult listBackupPlanVersions(ListBackupPlanVersionsRequest listBackupPlanVersionsRequest);

    /**
     * <p>
     * Returns metadata of your saved backup plans, including Amazon Resource Names (ARNs), plan IDs, creation and
     * deletion dates, version IDs, plan names, and creator request IDs.
     * </p>
     * 
     * @param listBackupPlansRequest
     * @return Result of the ListBackupPlans operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupPlans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupPlans" target="_top">AWS API
     *      Documentation</a>
     */
    ListBackupPlansResult listBackupPlans(ListBackupPlansRequest listBackupPlansRequest);

    /**
     * <p>
     * Returns an array containing metadata of the resources associated with the target backup plan.
     * </p>
     * 
     * @param listBackupSelectionsRequest
     * @return Result of the ListBackupSelections operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupSelections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupSelections" target="_top">AWS
     *      API Documentation</a>
     */
    ListBackupSelectionsResult listBackupSelections(ListBackupSelectionsRequest listBackupSelectionsRequest);

    /**
     * <p>
     * Returns a list of recovery point storage containers along with information about them.
     * </p>
     * 
     * @param listBackupVaultsRequest
     * @return Result of the ListBackupVaults operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListBackupVaults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListBackupVaults" target="_top">AWS API
     *      Documentation</a>
     */
    ListBackupVaultsResult listBackupVaults(ListBackupVaultsRequest listBackupVaultsRequest);

    /**
     * <p>
     * Returns an array of resources successfully backed up by AWS Backup, including the time the resource was saved, an
     * Amazon Resource Name (ARN) of the resource, and a resource type.
     * </p>
     * 
     * @param listProtectedResourcesRequest
     * @return Result of the ListProtectedResources operation returned by the service.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListProtectedResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListProtectedResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListProtectedResourcesResult listProtectedResources(ListProtectedResourcesRequest listProtectedResourcesRequest);

    /**
     * <p>
     * Returns detailed information about the recovery points stored in a backup vault.
     * </p>
     * 
     * @param listRecoveryPointsByBackupVaultRequest
     * @return Result of the ListRecoveryPointsByBackupVault operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListRecoveryPointsByBackupVault
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByBackupVault"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecoveryPointsByBackupVaultResult listRecoveryPointsByBackupVault(ListRecoveryPointsByBackupVaultRequest listRecoveryPointsByBackupVaultRequest);

    /**
     * <p>
     * Returns detailed information about recovery points of the type specified by a resource Amazon Resource Name
     * (ARN).
     * </p>
     * 
     * @param listRecoveryPointsByResourceRequest
     * @return Result of the ListRecoveryPointsByResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListRecoveryPointsByResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRecoveryPointsByResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecoveryPointsByResourceResult listRecoveryPointsByResource(ListRecoveryPointsByResourceRequest listRecoveryPointsByResourceRequest);

    /**
     * <p>
     * Returns a list of jobs that AWS Backup initiated to restore a saved resource, including metadata about the
     * recovery process.
     * </p>
     * 
     * @param listRestoreJobsRequest
     * @return Result of the ListRestoreJobs operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListRestoreJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListRestoreJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListRestoreJobsResult listRestoreJobs(ListRestoreJobsRequest listRestoreJobsRequest);

    /**
     * <p>
     * Returns a list of key-value pairs assigned to a target recovery point, backup plan, or backup vault.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Sets a resource-based policy that is used to manage access permissions on the target backup vault. Requires a
     * backup vault name and an access policy document in JSON format.
     * </p>
     * 
     * @param putBackupVaultAccessPolicyRequest
     * @return Result of the PutBackupVaultAccessPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.PutBackupVaultAccessPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultAccessPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutBackupVaultAccessPolicyResult putBackupVaultAccessPolicy(PutBackupVaultAccessPolicyRequest putBackupVaultAccessPolicyRequest);

    /**
     * <p>
     * Turns on notifications on a backup vault for the specified topic and events.
     * </p>
     * 
     * @param putBackupVaultNotificationsRequest
     * @return Result of the PutBackupVaultNotifications operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.PutBackupVaultNotifications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/PutBackupVaultNotifications"
     *      target="_top">AWS API Documentation</a>
     */
    PutBackupVaultNotificationsResult putBackupVaultNotifications(PutBackupVaultNotificationsRequest putBackupVaultNotificationsRequest);

    /**
     * <p>
     * Starts a job to create a one-time backup of the specified resource.
     * </p>
     * 
     * @param startBackupJobRequest
     * @return Result of the StartBackupJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @sample AWSBackup.StartBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartBackupJobResult startBackupJob(StartBackupJobRequest startBackupJobRequest);

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
     * @return Result of the StartRestoreJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.StartRestoreJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartRestoreJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartRestoreJobResult startRestoreJob(StartRestoreJobRequest startRestoreJobRequest);

    /**
     * <p>
     * Attempts to cancel a job to create a one-time backup of a resource.
     * </p>
     * 
     * @param stopBackupJobRequest
     * @return Result of the StopBackupJob operation returned by the service.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws InvalidRequestException
     *         Indicates that something is wrong with the input to the request. For example, a parameter is of the wrong
     *         type.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.StopBackupJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StopBackupJob" target="_top">AWS API
     *      Documentation</a>
     */
    StopBackupJobResult stopBackupJob(StopBackupJobRequest stopBackupJobRequest);

    /**
     * <p>
     * Assigns a set of key-value pairs to a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN).
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @throws LimitExceededException
     *         A limit in the request has been exceeded; for example, a maximum number of items allowed in a request.
     * @sample AWSBackup.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a set of key-value pairs from a recovery point, backup plan, or backup vault identified by an Amazon
     * Resource Name (ARN)
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Replaces the body of a saved backup plan identified by its <code>backupPlanId</code> with the input document in
     * JSON format. The new version is uniquely identified by a <code>VersionId</code>.
     * </p>
     * 
     * @param updateBackupPlanRequest
     * @return Result of the UpdateBackupPlan operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.UpdateBackupPlan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateBackupPlan" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBackupPlanResult updateBackupPlan(UpdateBackupPlanRequest updateBackupPlanRequest);

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
     * @return Result of the UpdateRecoveryPointLifecycle operation returned by the service.
     * @throws ResourceNotFoundException
     *         A resource that is required for the action doesn't exist.
     * @throws InvalidParameterValueException
     *         Indicates that something is wrong with a parameter's value. For example, the value is out of range.
     * @throws MissingParameterValueException
     *         Indicates that a required parameter is missing.
     * @throws ServiceUnavailableException
     *         The request failed due to a temporary failure of the server.
     * @sample AWSBackup.UpdateRecoveryPointLifecycle
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateRecoveryPointLifecycle"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRecoveryPointLifecycleResult updateRecoveryPointLifecycle(UpdateRecoveryPointLifecycleRequest updateRecoveryPointLifecycleRequest);

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
