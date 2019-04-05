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
package com.amazonaws.services.fsx;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.fsx.model.*;

/**
 * Interface for accessing Amazon FSx.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fsx.AbstractAmazonFSx} instead.
 * </p>
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
 * shared file storage.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonFSx {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "fsx";

    /**
     * <p>
     * Creates a backup of an existing Amazon FSx for Windows File Server file system. Creating regular backups for your
     * file system is a best practice that complements the replication that Amazon FSx for Windows File Server performs
     * for your file system. It also enables you to restore from user modification of data.
     * </p>
     * <p>
     * If a backup with the specified client request token exists, and the parameters match, this operation returns the
     * description of the existing backup. If a backup specified client request token exists, and the parameters don't
     * match, this operation returns <code>IncompatibleParameterError</code>. If a backup with the specified client
     * request token doesn't exist, <code>CreateBackup</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx backup with an assigned ID, and an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the backup.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateBackup</code> operation without the risk of
     * creating an extra backup. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a backup was created. If you use the same client request token and the initial call created a backup, the
     * operation returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateFileSystem</code> operation returns while the backup's lifecycle state is still
     * <code>CREATING</code>. You can check the file system creation status by calling the <a>DescribeBackups</a>
     * operation, which returns the backup state along with other information.
     * </p>
     * <note>
     * <p/>
     * </note>
     * 
     * @param createBackupRequest
     *        The request object for the <code>CreateBackup</code> operation.
     * @return Result of the CreateBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws BackupInProgressException
     *         Another backup is already under way. Wait for completion before initiating additional backups of this
     *         file system.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CreateBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateBackup" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBackupResult createBackup(CreateBackupRequest createBackupRequest);

    /**
     * <p>
     * Creates a new, empty Amazon FSx file system.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match,
     * <code>CreateFileSystem</code> returns the description of the existing file system. If a file system specified
     * client request token exists and the parameters don't match, this call returns
     * <code>IncompatibleParameterError</code>. If a file system with the specified client request token doesn't exist,
     * <code>CreateFileSystem</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon FSx file system with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation requires a client request token in the request that Amazon FSx uses to ensure idempotent creation.
     * This means that calling the operation multiple times with the same client request token has no effect. By using
     * the idempotent operation, you can retry a <code>CreateFileSystem</code> operation without the risk of creating an
     * extra file system. This approach can be useful when an initial call fails in a way that makes it unclear whether
     * a file system was created. Examples are if a transport level timeout occurred, or your connection was reset. If
     * you use the same client request token and the initial call created a file system, the client receives success as
     * long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest
     *        The request object for the <code>CreateFileSystem</code> operation.
     * @return Result of the CreateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidImportPathException
     *         The path provided for data repository import isn't valid.
     * @throws InvalidExportPathException
     *         The path provided for data repository export isn't valid.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid. <code>InvalidVpcId</code> means that
     *         the ID passed for the virtual private cloud (VPC) is invalid. <code>InvalidSubnetIds</code> returns the
     *         list of IDs for subnets that are either invalid or not part of the VPC specified.
     *         <code>InvalidSecurityGroupIds</code> returns the list of IDs for security groups that are either invalid
     *         or not part of the VPC specified.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         File system configuration is required for this operation.
     * @sample AmazonFSx.CreateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFileSystemResult createFileSystem(CreateFileSystemRequest createFileSystemRequest);

    /**
     * <p>
     * Creates a new Amazon FSx file system from an existing Amazon FSx for Windows File Server backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match, this call returns the
     * description of the existing file system. If a client request token specified by the file system exists and the
     * parameters don't match, this call returns <code>IncompatibleParameterError</code>. If a file system with the
     * specified client request token doesn't exist, this operation does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new Amazon FSx file system from backup with an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the file system.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Parameters like Active Directory, default share name, automatic backup, and backup settings default to the
     * parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileSystemFromBackup</code> call without the risk
     * of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it
     * unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call created a file system, the client
     * receives success as long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a>DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemFromBackupRequest
     *        The request object for the <code>CreateFileSystemFromBackup</code> operation.
     * @return Result of the CreateFileSystemFromBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid. <code>InvalidVpcId</code> means that
     *         the ID passed for the virtual private cloud (VPC) is invalid. <code>InvalidSubnetIds</code> returns the
     *         list of IDs for subnets that are either invalid or not part of the VPC specified.
     *         <code>InvalidSecurityGroupIds</code> returns the list of IDs for security groups that are either invalid
     *         or not part of the VPC specified.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         File system configuration is required for this operation.
     * @sample AmazonFSx.CreateFileSystemFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemFromBackup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFileSystemFromBackupResult createFileSystemFromBackup(CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest);

    /**
     * <p>
     * Deletes an Amazon FSx for Windows File Server backup, deleting its contents. After deletion, the backup no longer
     * exists, and its data is gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup will not show up in later
     * <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest
     *        The request object for <code>DeleteBackup</code> operation.
     * @return Result of the DeleteBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws BackupInProgressException
     *         Another backup is already under way. Wait for completion before initiating additional backups of this
     *         file system.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws BackupRestoringException
     *         You can't delete a backup while it's being used to restore a file system.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteBackup" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBackupResult deleteBackup(DeleteBackupRequest deleteBackupRequest);

    /**
     * <p>
     * Deletes a file system, deleting its contents. After deletion, the file system no longer exists, and its data is
     * gone. Any existing automatic backups will also be deleted.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon
     * deletion. This final backup is not subject to the file system's retention policy, and must be manually deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> action returns while the file system has the <code>DELETING</code> status. You
     * can check the file system deletion status by calling the <a>DescribeFileSystems</a> action, which returns a list
     * of file systems in your account. If you pass the file system ID for a deleted file system, the
     * <a>DescribeFileSystems</a> returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <important>
     * <p>
     * The data in a deleted file system is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileSystemRequest
     *        The request object for <code>DeleteFileSystem</code> operation.
     * @return Result of the DeleteFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting AWS Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Windows File Server backups, if a <code>BackupIds</code> value
     * is provided for that backup. Otherwise, it returns all backups owned by your AWS account in the AWS Region of the
     * endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the <code>MaxResults</code> parameter to limit the number
     * of backups in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in the
     * response. In this case, send a later request with the <code>NextToken</code> request parameter set to the value
     * of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your backups. <code>DescribeBackups</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of backups returned in the response of one <code>DescribeBackups</code> call and the order of backups
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest
     *        The request object for <code>DescribeBackups</code> operation.
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeBackups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBackupsResult describeBackups(DescribeBackupsRequest describeBackupsRequest);

    /**
     * <p>
     * Returns the description of specific Amazon FSx file systems, if a <code>FileSystemIds</code> value is provided
     * for that file system. Otherwise, it returns descriptions of all file systems owned by your AWS account in the AWS
     * Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxResults</code> parameter to
     * limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your file system descriptions.
     * <code>DescribeFileSystems</code> is called first without a <code>NextToken</code>value. Then the action continues
     * to be called with the <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value
     * until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of file systems returned in the response of one <code>DescribeFileSystems</code> call and the order of
     * file systems returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileSystemsRequest
     *        The request object for <code>DescribeFileSystems</code> operation.
     * @return Result of the DescribeFileSystems operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileSystems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest describeFileSystemsRequest);

    /**
     * <p>
     * Lists tags for an Amazon FSx file systems and backups in the case of Amazon FSx for Windows File Server.
     * </p>
     * <p>
     * When retrieving all tags, you can optionally specify the <code>MaxResults</code> parameter to limit the number of
     * tags in a response. If more tags remain, Amazon FSx returns a <code>NextToken</code> value in the response. In
     * this case, send a later request with the <code>NextToken</code> request parameter set to the value of
     * <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This action is used in an iterative process to retrieve a list of your tags. <code>ListTagsForResource</code> is
     * called first without a <code>NextToken</code>value. Then the action continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this action, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> file system descriptions while still including
     * a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of tags returned in the response of one <code>ListTagsForResource</code> call and the order of tags
     * returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTagsForResourceRequest
     *        The request object for <code>ListTagsForResource</code> operation.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Tags an Amazon FSx resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request object for the <code>TagResource</code> operation.
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * This action removes a tag from an Amazon FSx resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request object for <code>UntagResource</code> action.
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ResourceNotFoundException
     *         The resource specified by the Amazon Resource Name (ARN) can't be found.
     * @throws NotServiceResourceErrorException
     *         The resource specified for the tagging operation is not a resource type owned by Amazon FSx. Use the API
     *         of the relevant service to perform the operation.
     * @throws ResourceDoesNotSupportTaggingException
     *         The resource specified does not support tagging.
     * @sample AmazonFSx.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a file system configuration.
     * </p>
     * 
     * @param updateFileSystemRequest
     *        The request object for the <code>UpdateFileSystem</code> operation.
     * @return Result of the UpdateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws MissingFileSystemConfigurationException
     *         File system configuration is required for this operation.
     * @sample AmazonFSx.UpdateFileSystem
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystem" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest updateFileSystemRequest);

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
