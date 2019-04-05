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

import org.w3c.dom.*;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.*;

import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.internal.auth.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;
import com.amazonaws.client.builder.AdvancedConfig;

import com.amazonaws.services.fsx.AmazonFSxClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.services.fsx.model.transform.*;

/**
 * Client for accessing Amazon FSx. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * <p>
 * Amazon FSx is a fully managed service that makes it easy for storage and application administrators to launch and use
 * shared file storage.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonFSxClient extends AmazonWebServiceClient implements AmazonFSx {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonFSx.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "fsx";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLimitExceeded").withModeledClass(
                                    com.amazonaws.services.fsx.model.ServiceLimitExceededException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFound").withModeledClass(
                                    com.amazonaws.services.fsx.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotServiceResourceError").withModeledClass(
                                    com.amazonaws.services.fsx.model.NotServiceResourceErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImportPath").withModeledClass(
                                    com.amazonaws.services.fsx.model.InvalidImportPathException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNetworkSettings").withModeledClass(
                                    com.amazonaws.services.fsx.model.InvalidNetworkSettingsException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingFileSystemConfiguration").withModeledClass(
                                    com.amazonaws.services.fsx.model.MissingFileSystemConfigurationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileSystemNotFound").withModeledClass(
                                    com.amazonaws.services.fsx.model.FileSystemNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupRestoring").withModeledClass(
                                    com.amazonaws.services.fsx.model.BackupRestoringException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleParameterError").withModeledClass(
                                    com.amazonaws.services.fsx.model.IncompatibleParameterErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupInProgress").withModeledClass(
                                    com.amazonaws.services.fsx.model.BackupInProgressException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidExportPath").withModeledClass(
                                    com.amazonaws.services.fsx.model.InvalidExportPathException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDoesNotSupportTagging").withModeledClass(
                                    com.amazonaws.services.fsx.model.ResourceDoesNotSupportTaggingException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupNotFound").withModeledClass(
                                    com.amazonaws.services.fsx.model.BackupNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActiveDirectoryError").withModeledClass(
                                    com.amazonaws.services.fsx.model.ActiveDirectoryErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequest").withModeledClass(
                                    com.amazonaws.services.fsx.model.BadRequestException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.fsx.model.InternalServerErrorException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.fsx.model.AmazonFSxException.class));

    public static AmazonFSxClientBuilder builder() {
        return AmazonFSxClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon FSx using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFSxClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon FSx using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonFSxClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("fsx.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/fsx/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/fsx/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

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
    @Override
    public CreateBackupResult createBackup(CreateBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBackup(request);
    }

    @SdkInternalApi
    final CreateBackupResult executeCreateBackup(CreateBackupRequest createBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(createBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBackupRequest> request = null;
        Response<CreateBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateFileSystemResult createFileSystem(CreateFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFileSystem(request);
    }

    @SdkInternalApi
    final CreateFileSystemResult executeCreateFileSystem(CreateFileSystemRequest createFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(createFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileSystemRequest> request = null;
        Response<CreateFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public CreateFileSystemFromBackupResult createFileSystemFromBackup(CreateFileSystemFromBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFileSystemFromBackup(request);
    }

    @SdkInternalApi
    final CreateFileSystemFromBackupResult executeCreateFileSystemFromBackup(CreateFileSystemFromBackupRequest createFileSystemFromBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(createFileSystemFromBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileSystemFromBackupRequest> request = null;
        Response<CreateFileSystemFromBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileSystemFromBackupRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createFileSystemFromBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFileSystemFromBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFileSystemFromBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateFileSystemFromBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteBackupResult deleteBackup(DeleteBackupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteBackup(request);
    }

    @SdkInternalApi
    final DeleteBackupResult executeDeleteBackup(DeleteBackupRequest deleteBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBackupRequest> request = null;
        Response<DeleteBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DeleteFileSystemResult deleteFileSystem(DeleteFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFileSystem(request);
    }

    @SdkInternalApi
    final DeleteFileSystemResult executeDeleteFileSystem(DeleteFileSystemRequest deleteFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileSystemRequest> request = null;
        Response<DeleteFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeBackupsResult describeBackups(DescribeBackupsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBackups(request);
    }

    @SdkInternalApi
    final DescribeBackupsResult executeDescribeBackups(DescribeBackupsRequest describeBackupsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBackupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBackupsRequest> request = null;
        Response<DescribeBackupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBackupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeBackupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBackups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBackupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeBackupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public DescribeFileSystemsResult describeFileSystems(DescribeFileSystemsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFileSystems(request);
    }

    @SdkInternalApi
    final DescribeFileSystemsResult executeDescribeFileSystems(DescribeFileSystemsRequest describeFileSystemsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFileSystemsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileSystemsRequest> request = null;
        Response<DescribeFileSystemsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileSystemsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFileSystemsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFileSystems");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFileSystemsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFileSystemsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        request = beforeClientExecution(request);
        return executeListTagsForResource(request);
    }

    @SdkInternalApi
    final ListTagsForResourceResult executeListTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListTagsForResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeTagResource(request);
    }

    @SdkInternalApi
    final TagResourceResult executeTagResource(TagResourceRequest tagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(tagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TagResourceRequest> request = null;
        Response<TagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(tagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "TagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<TagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new TagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        request = beforeClientExecution(request);
        return executeUntagResource(request);
    }

    @SdkInternalApi
    final UntagResourceResult executeUntagResource(UntagResourceRequest untagResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(untagResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UntagResourceRequest> request = null;
        Response<UntagResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UntagResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(untagResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UntagResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UntagResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UntagResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

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
    @Override
    public UpdateFileSystemResult updateFileSystem(UpdateFileSystemRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFileSystem(request);
    }

    @SdkInternalApi
    final UpdateFileSystemResult executeUpdateFileSystem(UpdateFileSystemRequest updateFileSystemRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFileSystemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFileSystemRequest> request = null;
        Response<UpdateFileSystemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFileSystemRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFileSystemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFileSystem");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFileSystemResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFileSystemResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {

        return invoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Normal invoke with authentication. Credentials are required and may be overriden at the request level.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI cachedEndpoint, URI uriFromEndpointTrait) {

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext, cachedEndpoint, uriFromEndpointTrait);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext, null, null);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext, URI discoveredEndpoint, URI uriFromEndpointTrait) {

        if (discoveredEndpoint != null) {
            request.setEndpoint(discoveredEndpoint);
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("endpoint-discovery");
        } else if (uriFromEndpointTrait != null) {
            request.setEndpoint(uriFromEndpointTrait);
        } else {
            request.setEndpoint(endpoint);
        }

        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

    @com.amazonaws.annotation.SdkInternalApi
    static com.amazonaws.protocol.json.SdkJsonProtocolFactory getProtocolFactory() {
        return protocolFactory;
    }

}
