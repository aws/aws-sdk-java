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
                            new JsonErrorShapeMetadata().withErrorCode("InvalidImportPath").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidImportPathExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNetworkSettings").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidNetworkSettingsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleRegionForMultiAZ").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.IncompatibleRegionForMultiAZExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileSystemNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.FileSystemNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataRepositoryAssociationNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.DataRepositoryAssociationNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceDoesNotSupportTagging").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ResourceDoesNotSupportTaggingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataRepositoryTaskNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.DataRepositoryTaskNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SourceBackupUnavailable").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.SourceBackupUnavailableExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnsupportedOperation").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.UnsupportedOperationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("StorageVirtualMachineNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.StorageVirtualMachineNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupRestoring").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupRestoringExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupInProgress").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupInProgressExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidExportPath").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidExportPathExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidRegion").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidRegionExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingVolumeConfiguration").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.MissingVolumeConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidSourceKmsKey").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidSourceKmsKeyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataRepositoryTaskExecuting").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.DataRepositoryTaskExecutingExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingFileCacheConfiguration").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.MissingFileCacheConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("FileCacheNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.FileCacheNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDestinationKmsKey").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidDestinationKmsKeyExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("VolumeNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.VolumeNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceLimitExceeded").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ServiceLimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("NotServiceResourceError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.NotServiceResourceErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("MissingFileSystemConfiguration").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.MissingFileSystemConfigurationExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BackupBeingCopied").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BackupBeingCopiedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("IncompatibleParameterError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.IncompatibleParameterErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DataRepositoryTaskEnded").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.DataRepositoryTaskEndedExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidDataRepositoryType").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidDataRepositoryTypeExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("SnapshotNotFound").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.SnapshotNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidPerUnitStorageThroughput").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InvalidPerUnitStorageThroughputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ActiveDirectoryError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.ActiveDirectoryErrorExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("BadRequest").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.BadRequestExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withExceptionUnmarshaller(
                                    com.amazonaws.services.fsx.model.transform.InternalServerErrorExceptionUnmarshaller.getInstance()))
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
     * Use this action to associate one or more Domain Name Server (DNS) aliases with an existing Amazon FSx for Windows
     * File Server file system. A file system can have a maximum of 50 DNS aliases associated with it at any one time.
     * If you try to associate a DNS alias that is already associated with the file system, FSx takes no action on that
     * alias in the request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS Aliases</a>
     * and <a href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/walkthrough05-file-system-custom-CNAME.html">
     * Walkthrough 5: Using DNS aliases to access your file system</a>, including additional steps you must take to be
     * able to access your file system using a DNS alias.
     * </p>
     * <p>
     * The system response shows the DNS aliases that Amazon FSx is attempting to associate with the file system. Use
     * the API operation to monitor the status of the aliases Amazon FSx is associating with the file system.
     * </p>
     * 
     * @param associateFileSystemAliasesRequest
     *        The request object specifying one or more DNS alias names to associate with an Amazon FSx for Windows File
     *        Server file system.
     * @return Result of the AssociateFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.AssociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/AssociateFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public AssociateFileSystemAliasesResult associateFileSystemAliases(AssociateFileSystemAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateFileSystemAliases(request);
    }

    @SdkInternalApi
    final AssociateFileSystemAliasesResult executeAssociateFileSystemAliases(AssociateFileSystemAliasesRequest associateFileSystemAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(associateFileSystemAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateFileSystemAliasesRequest> request = null;
        Response<AssociateFileSystemAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateFileSystemAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateFileSystemAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateFileSystemAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateFileSystemAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateFileSystemAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Cancels an existing Amazon FSx for Lustre data repository task if that task is in either the <code>PENDING</code>
     * or <code>EXECUTING</code> state. When you cancel a task, Amazon FSx does the following.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any files that FSx has already exported are not reverted.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx continues to export any files that are "in-flight" when the cancel operation is received.
     * </p>
     * </li>
     * <li>
     * <p>
     * FSx does not export any files that have not yet been exported.
     * </p>
     * </li>
     * </ul>
     * 
     * @param cancelDataRepositoryTaskRequest
     *        Cancels a data repository task.
     * @return Result of the CancelDataRepositoryTask operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws DataRepositoryTaskNotFoundException
     *         The data repository task or tasks you specified could not be found.
     * @throws DataRepositoryTaskEndedException
     *         The data repository task could not be canceled because the task has already ended.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CancelDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CancelDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CancelDataRepositoryTaskResult cancelDataRepositoryTask(CancelDataRepositoryTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCancelDataRepositoryTask(request);
    }

    @SdkInternalApi
    final CancelDataRepositoryTaskResult executeCancelDataRepositoryTask(CancelDataRepositoryTaskRequest cancelDataRepositoryTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(cancelDataRepositoryTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CancelDataRepositoryTaskRequest> request = null;
        Response<CancelDataRepositoryTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CancelDataRepositoryTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(cancelDataRepositoryTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CancelDataRepositoryTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CancelDataRepositoryTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CancelDataRepositoryTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Copies an existing backup within the same Amazon Web Services account to another Amazon Web Services Region
     * (cross-Region copy) or within the same Amazon Web Services Region (in-Region copy). You can have up to five
     * backup copy requests in progress to a single destination Region per account.
     * </p>
     * <p>
     * You can use cross-Region backup copies for cross-Region disaster recovery. You can periodically take backups and
     * copy them to another Region so that in the event of a disaster in the primary Region, you can restore from backup
     * and recover availability quickly in the other Region. You can make cross-Region copies only within your Amazon
     * Web Services partition. A partition is a grouping of Regions. Amazon Web Services currently has three partitions:
     * <code>aws</code> (Standard Regions), <code>aws-cn</code> (China Regions), and <code>aws-us-gov</code> (Amazon Web
     * Services GovCloud [US] Regions).
     * </p>
     * <p>
     * You can also use backup copies to clone your file dataset to another Region or within the same Region.
     * </p>
     * <p>
     * You can use the <code>SourceRegion</code> parameter to specify the Amazon Web Services Region from which the
     * backup will be copied. For example, if you make the call from the <code>us-west-1</code> Region and want to copy
     * a backup from the <code>us-east-2</code> Region, you specify <code>us-east-2</code> in the
     * <code>SourceRegion</code> parameter to make a cross-Region copy. If you don't specify a Region, the backup copy
     * is created in the same Region where the request is sent from (in-Region copy).
     * </p>
     * <p>
     * For more information about creating backup copies, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html#copy-backups"> Copying backups</a>
     * in the <i>Amazon FSx for Windows User Guide</i>, <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html#copy-backups">Copying backups</a>
     * in the <i>Amazon FSx for Lustre User Guide</i>, and <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/using-backups.html#copy-backups">Copying backups</a> in
     * the <i>Amazon FSx for OpenZFS User Guide</i>.
     * </p>
     * 
     * @param copyBackupRequest
     * @return Result of the CopyBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws InvalidSourceKmsKeyException
     *         The Key Management Service (KMS) key of the source backup is not valid.
     * @throws InvalidDestinationKmsKeyException
     *         The Key Management Service (KMS) key of the destination backup is not valid.
     * @throws InvalidRegionException
     *         The Region provided for <code>SourceRegion</code> is not valid or is in a different Amazon Web Services
     *         partition.
     * @throws SourceBackupUnavailableException
     *         The request was rejected because the lifecycle status of the source backup isn't <code>AVAILABLE</code>.
     * @throws IncompatibleRegionForMultiAZException
     *         Amazon FSx doesn't support Multi-AZ Windows File Server copy backup in the destination Region, so the
     *         copied backup can't be restored.
     * @sample AmazonFSx.CopyBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CopyBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CopyBackupResult copyBackup(CopyBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCopyBackup(request);
    }

    @SdkInternalApi
    final CopyBackupResult executeCopyBackup(CopyBackupRequest copyBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(copyBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CopyBackupRequest> request = null;
        Response<CopyBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CopyBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(copyBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CopyBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CopyBackupResult>> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata()
                    .withPayloadJson(true).withHasStreamingSuccessResponse(false), new CopyBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a backup of an existing Amazon FSx for Windows File Server file system, Amazon FSx for Lustre file
     * system, Amazon FSx for NetApp ONTAP volume, or Amazon FSx for OpenZFS file system. We recommend creating regular
     * backups so that you can restore a file system or volume from a backup if an issue arises with the original file
     * system or volume.
     * </p>
     * <p>
     * For Amazon FSx for Lustre file systems, you can create a backup only for file systems that have the following
     * configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A Persistent deployment type
     * </p>
     * </li>
     * <li>
     * <p>
     * Are <i>not</i> linked to a data repository
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about backups, see the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For Amazon FSx for Lustre, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/using-backups-fsx.html">Working with FSx for Lustre
     * backups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for Windows, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/using-backups.html">Working with FSx for Windows
     * backups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for NetApp ONTAP, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/using-backups.html">Working with FSx for NetApp ONTAP
     * backups</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Amazon FSx for OpenZFS, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/using-backups.html">Working with FSx for OpenZFS
     * backups</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If a backup with the specified client request token exists and the parameters match, this operation returns the
     * description of the existing backup. If a backup with the specified client request token exists and the parameters
     * don't match, this operation returns <code>IncompatibleParameterError</code>. If a backup with the specified
     * client request token doesn't exist, <code>CreateBackup</code> does the following:
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
     * The <code>CreateBackup</code> operation returns while the backup's lifecycle state is still <code>CREATING</code>
     * . You can check the backup creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeBackups.html">DescribeBackups</a>
     * operation, which returns the backup state along with other information.
     * </p>
     * 
     * @param createBackupRequest
     *        The request object for the <code>CreateBackup</code> operation.
     * @return Result of the CreateBackup operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @throws BackupInProgressException
     *         Another backup is already under way. Wait for completion before initiating additional backups of this
     *         file system.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates an Amazon FSx for Lustre data repository association (DRA). A data repository association is a link
     * between a directory on the file system and an Amazon S3 bucket or prefix. You can have a maximum of 8 data
     * repository associations on a file system. Data repository associations are supported only for file systems with
     * the <code>Persistent_2</code> deployment type.
     * </p>
     * <p>
     * Each data repository association must have a unique Amazon FSx file system directory and a unique S3 bucket or
     * prefix associated with it. You can configure a data repository association for automatic import only, for
     * automatic export only, or for both. To learn more about linking a data repository to your file system, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html">Linking your file
     * system to an S3 bucket</a>.
     * </p>
     * <note>
     * <p>
     * <code>CreateDataRepositoryAssociation</code> isn't supported on Amazon File Cache resources. To create a DRA on
     * Amazon File Cache, use the <code>CreateFileCache</code> operation.
     * </p>
     * </note>
     * 
     * @param createDataRepositoryAssociationRequest
     * @return Result of the CreateDataRepositoryAssociation operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CreateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDataRepositoryAssociationResult createDataRepositoryAssociation(CreateDataRepositoryAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataRepositoryAssociation(request);
    }

    @SdkInternalApi
    final CreateDataRepositoryAssociationResult executeCreateDataRepositoryAssociation(
            CreateDataRepositoryAssociationRequest createDataRepositoryAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataRepositoryAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataRepositoryAssociationRequest> request = null;
        Response<CreateDataRepositoryAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataRepositoryAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataRepositoryAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataRepositoryAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataRepositoryAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataRepositoryAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon FSx for Lustre data repository task. You use data repository tasks to perform bulk operations
     * between your Amazon FSx file system and its linked data repositories. An example of a data repository task is
     * exporting any data and metadata changes, including POSIX metadata, to files, directories, and symbolic links
     * (symlinks) from your FSx file system to a linked data repository. A <code>CreateDataRepositoryTask</code>
     * operation will fail if a data repository is not linked to the FSx file system. To learn more about data
     * repository tasks, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/data-repository-tasks.html">Data Repository Tasks</a>.
     * To learn more about linking a data repository to your file system, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/LustreGuide/create-dra-linked-data-repo.html">Linking your file
     * system to an S3 bucket</a>.
     * </p>
     * 
     * @param createDataRepositoryTaskRequest
     * @return Result of the CreateDataRepositoryTask operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws DataRepositoryTaskExecutingException
     *         An existing data repository task is currently executing on the file system. Wait until the existing task
     *         has completed, then create the new task.
     * @sample AmazonFSx.CreateDataRepositoryTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateDataRepositoryTask" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDataRepositoryTaskResult createDataRepositoryTask(CreateDataRepositoryTaskRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataRepositoryTask(request);
    }

    @SdkInternalApi
    final CreateDataRepositoryTaskResult executeCreateDataRepositoryTask(CreateDataRepositoryTaskRequest createDataRepositoryTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(createDataRepositoryTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataRepositoryTaskRequest> request = null;
        Response<CreateDataRepositoryTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataRepositoryTaskRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createDataRepositoryTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataRepositoryTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDataRepositoryTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDataRepositoryTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon File Cache resource.
     * </p>
     * <p>
     * You can use this operation with a client request token in the request that Amazon File Cache uses to ensure
     * idempotent creation. If a cache with the specified client request token exists and the parameters match,
     * <code>CreateFileCache</code> returns the description of the existing cache. If a cache with the specified client
     * request token exists and the parameters don't match, this call returns <code>IncompatibleParameterError</code>.
     * If a file cache with the specified client request token doesn't exist, <code>CreateFileCache</code> does the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new, empty Amazon File Cache resourcewith an assigned ID, and an initial lifecycle state of
     * <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the cache in JSON format.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateFileCache</code> call returns while the cache's lifecycle state is still <code>CREATING</code>.
     * You can check the cache creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileCaches.html">DescribeFileCaches</a>
     * operation, which returns the cache state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileCacheRequest
     * @return Result of the CreateFileCache operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileCacheConfigurationException
     *         A cache configuration is required for this operation.
     * @sample AmazonFSx.CreateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateFileCacheResult createFileCache(CreateFileCacheRequest request) {
        request = beforeClientExecution(request);
        return executeCreateFileCache(request);
    }

    @SdkInternalApi
    final CreateFileCacheResult executeCreateFileCache(CreateFileCacheRequest createFileCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(createFileCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateFileCacheRequest> request = null;
        Response<CreateFileCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateFileCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createFileCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateFileCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateFileCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateFileCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new, empty Amazon FSx file system. You can create the following supported Amazon FSx file systems using
     * the <code>CreateFileSystem</code> API operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon FSx for Lustre
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for NetApp ONTAP
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for OpenZFS
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon FSx for Windows File Server
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
     * <p>
     * If a file system with the specified client request token exists and the parameters match,
     * <code>CreateFileSystem</code> returns the description of the existing file system. If a file system with the
     * specified client request token exists and the parameters don't match, this call returns
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
     * Returns the description of the file system in JSON format.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>CreateFileSystem</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileSystems.html">DescribeFileSystems</a>
     * operation, which returns the file system state along with other information.
     * </p>
     * </note>
     * 
     * @param createFileSystemRequest
     *        The request object used to create a new Amazon FSx file system.
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
     *         One or more network settings specified in the request are invalid.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates a new Amazon FSx for Lustre, Amazon FSx for Windows File Server, or Amazon FSx for OpenZFS file system
     * from an existing Amazon FSx backup.
     * </p>
     * <p>
     * If a file system with the specified client request token exists and the parameters match, this operation returns
     * the description of the file system. If a file system with the specified client request token exists but the
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
     * Parameters like the Active Directory, default share name, automatic backup, and backup settings default to the
     * parameters of the file system that was backed up, unless overridden. You can explicitly supply other settings.
     * </p>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateFileSystemFromBackup</code> call without the risk
     * of creating an extra file system. This approach can be useful when an initial call fails in a way that makes it
     * unclear whether a file system was created. Examples are if a transport level timeout occurred, or your connection
     * was reset. If you use the same client request token and the initial call created a file system, the client
     * receives a success message as long as the parameters are the same.
     * </p>
     * <note>
     * <p>
     * The <code>CreateFileSystemFromBackup</code> call returns while the file system's lifecycle state is still
     * <code>CREATING</code>. You can check the file-system creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileSystems.html"> DescribeFileSystems</a>
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
     *         One or more network settings specified in the request are invalid.
     * @throws InvalidPerUnitStorageThroughputException
     *         An invalid value for <code>PerUnitStorageThroughput</code> was provided. Please create your file system
     *         again, using a valid value.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Creates a snapshot of an existing Amazon FSx for OpenZFS volume. With snapshots, you can easily undo file changes
     * and compare file versions by restoring the volume to a previous version.
     * </p>
     * <p>
     * If a snapshot with the specified client request token exists, and the parameters match, this operation returns
     * the description of the existing snapshot. If a snapshot with the specified client request token exists, and the
     * parameters don't match, this operation returns <code>IncompatibleParameterError</code>. If a snapshot with the
     * specified client request token doesn't exist, <code>CreateSnapshot</code> does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a new OpenZFS snapshot with an assigned ID, and an initial lifecycle state of <code>CREATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Returns the description of the snapshot.
     * </p>
     * </li>
     * </ul>
     * <p>
     * By using the idempotent operation, you can retry a <code>CreateSnapshot</code> operation without the risk of
     * creating an extra snapshot. This approach can be useful when an initial call fails in a way that makes it unclear
     * whether a snapshot was created. If you use the same client request token and the initial call created a snapshot,
     * the operation returns a successful result because all the parameters are the same.
     * </p>
     * <p>
     * The <code>CreateSnapshot</code> operation returns while the snapshot's lifecycle state is still
     * <code>CREATING</code>. You can check the snapshot creation status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeSnapshots.html">DescribeSnapshots</a>
     * operation, which returns the snapshot state along with other information.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSnapshotResult createSnapshot(CreateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSnapshot(request);
    }

    @SdkInternalApi
    final CreateSnapshotResult executeCreateSnapshot(CreateSnapshotRequest createSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a storage virtual machine (SVM) for an Amazon FSx for ONTAP file system.
     * </p>
     * 
     * @param createStorageVirtualMachineRequest
     * @return Result of the CreateStorageVirtualMachine operation returned by the service.
     * @throws ActiveDirectoryErrorException
     *         An Active Directory error.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @sample AmazonFSx.CreateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateStorageVirtualMachineResult createStorageVirtualMachine(CreateStorageVirtualMachineRequest request) {
        request = beforeClientExecution(request);
        return executeCreateStorageVirtualMachine(request);
    }

    @SdkInternalApi
    final CreateStorageVirtualMachineResult executeCreateStorageVirtualMachine(CreateStorageVirtualMachineRequest createStorageVirtualMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(createStorageVirtualMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateStorageVirtualMachineRequest> request = null;
        Response<CreateStorageVirtualMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateStorageVirtualMachineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createStorageVirtualMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateStorageVirtualMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateStorageVirtualMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateStorageVirtualMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an FSx for ONTAP or Amazon FSx for OpenZFS storage volume.
     * </p>
     * 
     * @param createVolumeRequest
     * @return Result of the CreateVolume operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingVolumeConfigurationException
     *         A volume configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @sample AmazonFSx.CreateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVolumeResult createVolume(CreateVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVolume(request);
    }

    @SdkInternalApi
    final CreateVolumeResult executeCreateVolume(CreateVolumeRequest createVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(createVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVolumeRequest> request = null;
        Response<CreateVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new Amazon FSx for NetApp ONTAP volume from an existing Amazon FSx volume backup.
     * </p>
     * 
     * @param createVolumeFromBackupRequest
     * @return Result of the CreateVolumeFromBackup operation returned by the service.
     * @throws BackupNotFoundException
     *         No Amazon FSx backups were found based upon the supplied parameters.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingVolumeConfigurationException
     *         A volume configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @sample AmazonFSx.CreateVolumeFromBackup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolumeFromBackup" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateVolumeFromBackupResult createVolumeFromBackup(CreateVolumeFromBackupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateVolumeFromBackup(request);
    }

    @SdkInternalApi
    final CreateVolumeFromBackupResult executeCreateVolumeFromBackup(CreateVolumeFromBackupRequest createVolumeFromBackupRequest) {

        ExecutionContext executionContext = createExecutionContext(createVolumeFromBackupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateVolumeFromBackupRequest> request = null;
        Response<CreateVolumeFromBackupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateVolumeFromBackupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createVolumeFromBackupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateVolumeFromBackup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateVolumeFromBackupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateVolumeFromBackupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon FSx backup. After deletion, the backup no longer exists, and its data is gone.
     * </p>
     * <p>
     * The <code>DeleteBackup</code> call returns instantly. The backup won't show up in later
     * <code>DescribeBackups</code> calls.
     * </p>
     * <important>
     * <p>
     * The data in a deleted backup is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteBackupRequest
     *        The request object for the <code>DeleteBackup</code> operation.
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
     * @throws BackupBeingCopiedException
     *         You can't delete a backup while it's being copied.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes a data repository association on an Amazon FSx for Lustre file system. Deleting the data repository
     * association unlinks the file system from the Amazon S3 bucket. When deleting a data repository association, you
     * have the option of deleting the data in the file system that corresponds to the data repository association. Data
     * repository associations are supported only for file systems with the <code>Persistent_2</code> deployment type.
     * </p>
     * 
     * @param deleteDataRepositoryAssociationRequest
     * @return Result of the DeleteDataRepositoryAssociation operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws DataRepositoryAssociationNotFoundException
     *         No data repository associations were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDataRepositoryAssociationResult deleteDataRepositoryAssociation(DeleteDataRepositoryAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataRepositoryAssociation(request);
    }

    @SdkInternalApi
    final DeleteDataRepositoryAssociationResult executeDeleteDataRepositoryAssociation(
            DeleteDataRepositoryAssociationRequest deleteDataRepositoryAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDataRepositoryAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataRepositoryAssociationRequest> request = null;
        Response<DeleteDataRepositoryAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataRepositoryAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteDataRepositoryAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataRepositoryAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDataRepositoryAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDataRepositoryAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon File Cache resource. After deletion, the cache no longer exists, and its data is gone.
     * </p>
     * <p>
     * The <code>DeleteFileCache</code> operation returns while the cache has the <code>DELETING</code> status. You can
     * check the cache deletion status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileCaches.html">DescribeFileCaches</a>
     * operation, which returns a list of caches in your account. If you pass the cache ID for a deleted cache, the
     * <code>DescribeFileCaches</code> operation returns a <code>FileCacheNotFound</code> error.
     * </p>
     * <important>
     * <p>
     * The data in a deleted cache is also deleted and can't be recovered by any means.
     * </p>
     * </important>
     * 
     * @param deleteFileCacheRequest
     * @return Result of the DeleteFileCache operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws FileCacheNotFoundException
     *         No caches were found based upon supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DeleteFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteFileCacheResult deleteFileCache(DeleteFileCacheRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteFileCache(request);
    }

    @SdkInternalApi
    final DeleteFileCacheResult executeDeleteFileCache(DeleteFileCacheRequest deleteFileCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteFileCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteFileCacheRequest> request = null;
        Response<DeleteFileCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteFileCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteFileCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteFileCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteFileCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteFileCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a file system. After deletion, the file system no longer exists, and its data is gone. Any existing
     * automatic backups and snapshots are also deleted.
     * </p>
     * <p>
     * To delete an Amazon FSx for NetApp ONTAP file system, first delete all the volumes and storage virtual machines
     * (SVMs) on the file system. Then provide a <code>FileSystemId</code> value to the <code>DeleFileSystem</code>
     * operation.
     * </p>
     * <p>
     * By default, when you delete an Amazon FSx for Windows File Server file system, a final backup is created upon
     * deletion. This final backup isn't subject to the file system's retention policy, and must be manually deleted.
     * </p>
     * <p>
     * The <code>DeleteFileSystem</code> operation returns while the file system has the <code>DELETING</code> status.
     * You can check the file system deletion status by calling the <a
     * href="https://docs.aws.amazon.com/fsx/latest/APIReference/API_DescribeFileSystems.html">DescribeFileSystems</a>
     * operation, which returns a list of file systems in your account. If you pass the file system ID for a deleted
     * file system, the <code>DescribeFileSystems</code> operation returns a <code>FileSystemNotFound</code> error.
     * </p>
     * <note>
     * <p>
     * If a data repository task is in a <code>PENDING</code> or <code>EXECUTING</code> state, deleting an Amazon FSx
     * for Lustre file system will fail with an HTTP status code 400 (Bad Request).
     * </p>
     * </note> <important>
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
     *         contacting Amazon Web Services Support.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Deletes an Amazon FSx for OpenZFS snapshot. After deletion, the snapshot no longer exists, and its data is gone.
     * Deleting a snapshot doesn't affect snapshots stored in a file system backup.
     * </p>
     * <p>
     * The <code>DeleteSnapshot</code> operation returns instantly. The snapshot appears with the lifecycle status of
     * <code>DELETING</code> until the deletion is complete.
     * </p>
     * 
     * @param deleteSnapshotRequest
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws SnapshotNotFoundException
     *         No Amazon FSx snapshots were found based on the supplied parameters.
     * @sample AmazonFSx.DeleteSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSnapshotResult deleteSnapshot(DeleteSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSnapshot(request);
    }

    @SdkInternalApi
    final DeleteSnapshotResult executeDeleteSnapshot(DeleteSnapshotRequest deleteSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an existing Amazon FSx for ONTAP storage virtual machine (SVM). Prior to deleting an SVM, you must delete
     * all non-root volumes in the SVM, otherwise the operation will fail.
     * </p>
     * 
     * @param deleteStorageVirtualMachineRequest
     * @return Result of the DeleteStorageVirtualMachine operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @sample AmazonFSx.DeleteStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteStorageVirtualMachineResult deleteStorageVirtualMachine(DeleteStorageVirtualMachineRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteStorageVirtualMachine(request);
    }

    @SdkInternalApi
    final DeleteStorageVirtualMachineResult executeDeleteStorageVirtualMachine(DeleteStorageVirtualMachineRequest deleteStorageVirtualMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteStorageVirtualMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteStorageVirtualMachineRequest> request = null;
        Response<DeleteStorageVirtualMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteStorageVirtualMachineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteStorageVirtualMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteStorageVirtualMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteStorageVirtualMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteStorageVirtualMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param deleteVolumeRequest
     * @return Result of the DeleteVolume operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.DeleteVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DeleteVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteVolumeResult deleteVolume(DeleteVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteVolume(request);
    }

    @SdkInternalApi
    final DeleteVolumeResult executeDeleteVolume(DeleteVolumeRequest deleteVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteVolumeRequest> request = null;
        Response<DeleteVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteVolumeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of a specific Amazon FSx backup, if a <code>BackupIds</code> value is provided for that
     * backup. Otherwise, it returns all backups owned by your Amazon Web Services account in the Amazon Web Services
     * Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all backups, you can optionally specify the <code>MaxResults</code> parameter to limit the number
     * of backups in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in the
     * response. In this case, send a later request with the <code>NextToken</code> request parameter set to the value
     * of the <code>NextToken</code> value from the last response.
     * </p>
     * <p>
     * This operation is used in an iterative process to retrieve a list of your backups. <code>DescribeBackups</code>
     * is called first without a <code>NextToken</code> value. Then the operation continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code> value.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The operation might return fewer than the <code>MaxResults</code> value of backup descriptions while still
     * including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of the backups returned in the response of one <code>DescribeBackups</code> call and the order of the
     * backups returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeBackupsRequest
     *        The request object for the <code>DescribeBackups</code> operation.
     * @return Result of the DescribeBackups operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository associations, if
     * one or more <code>AssociationIds</code> values are provided in the request, or if filters are used in the
     * request. Data repository associations are supported only for Amazon FSx for Lustre file systems with the
     * <code>Persistent_2</code> deployment type and for Amazon File Cache resources.
     * </p>
     * <p>
     * You can use filters to narrow the response to include just data repository associations for specific file systems
     * (use the <code>file-system-id</code> filter with the ID of the file system) or caches (use the
     * <code>file-cache-id</code> filter with the ID of the cache), or data repository associations for a specific
     * repository type (use the <code>data-repository-type</code> filter with a value of <code>S3</code> or
     * <code>NFS</code>). If you don't use filters, the response returns all data repository associations owned by your
     * Amazon Web Services account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all data repository associations, you can paginate the response by using the optional
     * <code>MaxResults</code> parameter to limit the number of data repository associations returned in a response. If
     * more data repository associations remain, a <code>NextToken</code> value is returned in the response. In this
     * case, send a later request with the <code>NextToken</code> request parameter set to the value of
     * <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryAssociationsRequest
     * @return Result of the DescribeDataRepositoryAssociations operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws DataRepositoryAssociationNotFoundException
     *         No data repository associations were found based upon the supplied parameters.
     * @throws InvalidDataRepositoryTypeException
     *         You have filtered the response to a data repository type that is not supported.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeDataRepositoryAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDataRepositoryAssociationsResult describeDataRepositoryAssociations(DescribeDataRepositoryAssociationsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataRepositoryAssociations(request);
    }

    @SdkInternalApi
    final DescribeDataRepositoryAssociationsResult executeDescribeDataRepositoryAssociations(
            DescribeDataRepositoryAssociationsRequest describeDataRepositoryAssociationsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataRepositoryAssociationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataRepositoryAssociationsRequest> request = null;
        Response<DescribeDataRepositoryAssociationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataRepositoryAssociationsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDataRepositoryAssociationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataRepositoryAssociations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataRepositoryAssociationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDataRepositoryAssociationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of specific Amazon FSx for Lustre or Amazon File Cache data repository tasks, if one or
     * more <code>TaskIds</code> values are provided in the request, or if filters are used in the request. You can use
     * filters to narrow the response to include just tasks for specific file systems or caches, or tasks in a specific
     * lifecycle state. Otherwise, it returns all data repository tasks owned by your Amazon Web Services account in the
     * Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all tasks, you can paginate the response by using the optional <code>MaxResults</code> parameter
     * to limit the number of tasks returned in a response. If more tasks remain, a <code>NextToken</code> value is
     * returned in the response. In this case, send a later request with the <code>NextToken</code> request parameter
     * set to the value of <code>NextToken</code> from the last response.
     * </p>
     * 
     * @param describeDataRepositoryTasksRequest
     * @return Result of the DescribeDataRepositoryTasks operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws DataRepositoryTaskNotFoundException
     *         The data repository task or tasks you specified could not be found.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeDataRepositoryTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeDataRepositoryTasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDataRepositoryTasksResult describeDataRepositoryTasks(DescribeDataRepositoryTasksRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataRepositoryTasks(request);
    }

    @SdkInternalApi
    final DescribeDataRepositoryTasksResult executeDescribeDataRepositoryTasks(DescribeDataRepositoryTasksRequest describeDataRepositoryTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDataRepositoryTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataRepositoryTasksRequest> request = null;
        Response<DescribeDataRepositoryTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataRepositoryTasksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDataRepositoryTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataRepositoryTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDataRepositoryTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDataRepositoryTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of a specific Amazon File Cache resource, if a <code>FileCacheIds</code> value is
     * provided for that cache. Otherwise, it returns descriptions of all caches owned by your Amazon Web Services
     * account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all cache descriptions, you can optionally specify the <code>MaxResults</code> parameter to limit
     * the number of descriptions in a response. If more cache descriptions remain, the operation returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This operation is used in an iterative process to retrieve a list of your cache descriptions.
     * <code>DescribeFileCaches</code> is called first without a <code>NextToken</code>value. Then the operation
     * continues to be called with the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The implementation might return fewer than <code>MaxResults</code> cache descriptions while still including a
     * <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of caches returned in the response of one <code>DescribeFileCaches</code> call and the order of caches
     * returned across the responses of a multicall iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeFileCachesRequest
     * @return Result of the DescribeFileCaches operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileCacheNotFoundException
     *         No caches were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileCaches
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileCaches" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeFileCachesResult describeFileCaches(DescribeFileCachesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFileCaches(request);
    }

    @SdkInternalApi
    final DescribeFileCachesResult executeDescribeFileCaches(DescribeFileCachesRequest describeFileCachesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFileCachesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileCachesRequest> request = null;
        Response<DescribeFileCachesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileCachesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFileCachesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFileCaches");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFileCachesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFileCachesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the DNS aliases that are associated with the specified Amazon FSx for Windows File Server file system. A
     * history of all DNS aliases that have been associated with and disassociated from the file system is available in
     * the list of <a>AdministrativeAction</a> provided in the <a>DescribeFileSystems</a> operation response.
     * </p>
     * 
     * @param describeFileSystemAliasesRequest
     *        The request object for <code>DescribeFileSystemAliases</code> operation.
     * @return Result of the DescribeFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DescribeFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeFileSystemAliasesResult describeFileSystemAliases(DescribeFileSystemAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFileSystemAliases(request);
    }

    @SdkInternalApi
    final DescribeFileSystemAliasesResult executeDescribeFileSystemAliases(DescribeFileSystemAliasesRequest describeFileSystemAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFileSystemAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFileSystemAliasesRequest> request = null;
        Response<DescribeFileSystemAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFileSystemAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFileSystemAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFileSystemAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFileSystemAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFileSystemAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the description of specific Amazon FSx file systems, if a <code>FileSystemIds</code> value is provided
     * for that file system. Otherwise, it returns descriptions of all file systems owned by your Amazon Web Services
     * account in the Amazon Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all file system descriptions, you can optionally specify the <code>MaxResults</code> parameter to
     * limit the number of descriptions in a response. If more file system descriptions remain, Amazon FSx returns a
     * <code>NextToken</code> value in the response. In this case, send a later request with the <code>NextToken</code>
     * request parameter set to the value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * This operation is used in an iterative process to retrieve a list of your file system descriptions.
     * <code>DescribeFileSystems</code> is called first without a <code>NextToken</code>value. Then the operation
     * continues to be called with the <code>NextToken</code> parameter set to the value of the last
     * <code>NextToken</code> value until a response has no <code>NextToken</code>.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Returns the description of specific Amazon FSx for OpenZFS snapshots, if a <code>SnapshotIds</code> value is
     * provided. Otherwise, this operation returns all snapshots owned by your Amazon Web Services account in the Amazon
     * Web Services Region of the endpoint that you're calling.
     * </p>
     * <p>
     * When retrieving all snapshots, you can optionally specify the <code>MaxResults</code> parameter to limit the
     * number of snapshots in a response. If more backups remain, Amazon FSx returns a <code>NextToken</code> value in
     * the response. In this case, send a later request with the <code>NextToken</code> request parameter set to the
     * value of <code>NextToken</code> from the last response.
     * </p>
     * <p>
     * Use this operation in an iterative process to retrieve a list of your snapshots. <code>DescribeSnapshots</code>
     * is called first without a <code>NextToken</code> value. Then the operation continues to be called with the
     * <code>NextToken</code> parameter set to the value of the last <code>NextToken</code> value until a response has
     * no <code>NextToken</code> value.
     * </p>
     * <p>
     * When using this operation, keep the following in mind:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The operation might return fewer than the <code>MaxResults</code> value of snapshot descriptions while still
     * including a <code>NextToken</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order of snapshots returned in the response of one <code>DescribeSnapshots</code> call and the order of
     * backups returned across the responses of a multi-call iteration is unspecified.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeSnapshotsRequest
     * @return Result of the DescribeSnapshots operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws SnapshotNotFoundException
     *         No Amazon FSx snapshots were found based on the supplied parameters.
     * @sample AmazonFSx.DescribeSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSnapshotsResult describeSnapshots(DescribeSnapshotsRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSnapshots(request);
    }

    @SdkInternalApi
    final DescribeSnapshotsResult executeDescribeSnapshots(DescribeSnapshotsRequest describeSnapshotsRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSnapshots");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSnapshotsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSnapshotsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP storage virtual machines (SVMs).
     * </p>
     * 
     * @param describeStorageVirtualMachinesRequest
     * @return Result of the DescribeStorageVirtualMachines operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @sample AmazonFSx.DescribeStorageVirtualMachines
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeStorageVirtualMachines"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeStorageVirtualMachinesResult describeStorageVirtualMachines(DescribeStorageVirtualMachinesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeStorageVirtualMachines(request);
    }

    @SdkInternalApi
    final DescribeStorageVirtualMachinesResult executeDescribeStorageVirtualMachines(DescribeStorageVirtualMachinesRequest describeStorageVirtualMachinesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeStorageVirtualMachinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStorageVirtualMachinesRequest> request = null;
        Response<DescribeStorageVirtualMachinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStorageVirtualMachinesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeStorageVirtualMachinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeStorageVirtualMachines");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeStorageVirtualMachinesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeStorageVirtualMachinesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes one or more Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volumes.
     * </p>
     * 
     * @param describeVolumesRequest
     * @return Result of the DescribeVolumes operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.DescribeVolumes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeVolumes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeVolumesResult describeVolumes(DescribeVolumesRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeVolumes(request);
    }

    @SdkInternalApi
    final DescribeVolumesResult executeDescribeVolumes(DescribeVolumesRequest describeVolumesRequest) {

        ExecutionContext executionContext = createExecutionContext(describeVolumesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeVolumesRequest> request = null;
        Response<DescribeVolumesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeVolumesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeVolumesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeVolumes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeVolumesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeVolumesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this action to disassociate, or remove, one or more Domain Name Service (DNS) aliases from an Amazon FSx for
     * Windows File Server file system. If you attempt to disassociate a DNS alias that is not associated with the file
     * system, Amazon FSx responds with a 400 Bad Request. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html">Working with DNS
     * Aliases</a>.
     * </p>
     * <p>
     * The system generated response showing the DNS aliases that Amazon FSx is attempting to disassociate from the file
     * system. Use the API operation to monitor the status of the aliases Amazon FSx is disassociating with the file
     * system.
     * </p>
     * 
     * @param disassociateFileSystemAliasesRequest
     *        The request object of DNS aliases to disassociate from an Amazon FSx for Windows File Server file system.
     * @return Result of the DisassociateFileSystemAliases operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.DisassociateFileSystemAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DisassociateFileSystemAliases"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateFileSystemAliasesResult disassociateFileSystemAliases(DisassociateFileSystemAliasesRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateFileSystemAliases(request);
    }

    @SdkInternalApi
    final DisassociateFileSystemAliasesResult executeDisassociateFileSystemAliases(DisassociateFileSystemAliasesRequest disassociateFileSystemAliasesRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateFileSystemAliasesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateFileSystemAliasesRequest> request = null;
        Response<DisassociateFileSystemAliasesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateFileSystemAliasesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateFileSystemAliasesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateFileSystemAliases");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateFileSystemAliasesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateFileSystemAliasesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists tags for Amazon FSx resources.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Releases the file system lock from an Amazon FSx for OpenZFS file system.
     * </p>
     * 
     * @param releaseFileSystemNfsV3LocksRequest
     * @return Result of the ReleaseFileSystemNfsV3Locks operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.ReleaseFileSystemNfsV3Locks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ReleaseFileSystemNfsV3Locks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ReleaseFileSystemNfsV3LocksResult releaseFileSystemNfsV3Locks(ReleaseFileSystemNfsV3LocksRequest request) {
        request = beforeClientExecution(request);
        return executeReleaseFileSystemNfsV3Locks(request);
    }

    @SdkInternalApi
    final ReleaseFileSystemNfsV3LocksResult executeReleaseFileSystemNfsV3Locks(ReleaseFileSystemNfsV3LocksRequest releaseFileSystemNfsV3LocksRequest) {

        ExecutionContext executionContext = createExecutionContext(releaseFileSystemNfsV3LocksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReleaseFileSystemNfsV3LocksRequest> request = null;
        Response<ReleaseFileSystemNfsV3LocksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReleaseFileSystemNfsV3LocksRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(releaseFileSystemNfsV3LocksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ReleaseFileSystemNfsV3Locks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ReleaseFileSystemNfsV3LocksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ReleaseFileSystemNfsV3LocksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an Amazon FSx for OpenZFS volume to the state saved by the specified snapshot.
     * </p>
     * 
     * @param restoreVolumeFromSnapshotRequest
     * @return Result of the RestoreVolumeFromSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.RestoreVolumeFromSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/RestoreVolumeFromSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public RestoreVolumeFromSnapshotResult restoreVolumeFromSnapshot(RestoreVolumeFromSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeRestoreVolumeFromSnapshot(request);
    }

    @SdkInternalApi
    final RestoreVolumeFromSnapshotResult executeRestoreVolumeFromSnapshot(RestoreVolumeFromSnapshotRequest restoreVolumeFromSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(restoreVolumeFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreVolumeFromSnapshotRequest> request = null;
        Response<RestoreVolumeFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreVolumeFromSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(restoreVolumeFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "RestoreVolumeFromSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RestoreVolumeFromSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RestoreVolumeFromSnapshotResultJsonUnmarshaller());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * Updates the configuration of an existing data repository association on an Amazon FSx for Lustre file system.
     * Data repository associations are supported only for file systems with the <code>Persistent_2</code> deployment
     * type.
     * </p>
     * 
     * @param updateDataRepositoryAssociationRequest
     * @return Result of the UpdateDataRepositoryAssociation operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws DataRepositoryAssociationNotFoundException
     *         No data repository associations were found based upon the supplied parameters.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.UpdateDataRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateDataRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateDataRepositoryAssociationResult updateDataRepositoryAssociation(UpdateDataRepositoryAssociationRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDataRepositoryAssociation(request);
    }

    @SdkInternalApi
    final UpdateDataRepositoryAssociationResult executeUpdateDataRepositoryAssociation(
            UpdateDataRepositoryAssociationRequest updateDataRepositoryAssociationRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDataRepositoryAssociationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataRepositoryAssociationRequest> request = null;
        Response<UpdateDataRepositoryAssociationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataRepositoryAssociationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateDataRepositoryAssociationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDataRepositoryAssociation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDataRepositoryAssociationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateDataRepositoryAssociationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an existing Amazon File Cache resource. You can update multiple properties in a
     * single request.
     * </p>
     * 
     * @param updateFileCacheRequest
     * @return Result of the UpdateFileCache operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws FileCacheNotFoundException
     *         No caches were found based upon supplied parameters.
     * @throws MissingFileCacheConfigurationException
     *         A cache configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
     * @sample AmazonFSx.UpdateFileCache
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileCache" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateFileCacheResult updateFileCache(UpdateFileCacheRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateFileCache(request);
    }

    @SdkInternalApi
    final UpdateFileCacheResult executeUpdateFileCache(UpdateFileCacheRequest updateFileCacheRequest) {

        ExecutionContext executionContext = createExecutionContext(updateFileCacheRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateFileCacheRequest> request = null;
        Response<UpdateFileCacheResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateFileCacheRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateFileCacheRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateFileCache");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateFileCacheResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateFileCacheResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Use this operation to update the configuration of an existing Amazon FSx file system. You can update multiple
     * properties in a single request.
     * </p>
     * <p>
     * For Amazon FSx for Windows File Server file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AuditLogConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SelfManagedActiveDirectoryConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ThroughputCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Amazon FSx for Lustre file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AutoImportPolicy</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataCompressionType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LustreRootSquashConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For Amazon FSx for NetApp ONTAP file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DiskIopsConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FsxAdminPassword</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StorageCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ThroughputCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the Amazon FSx for OpenZFS file systems, you can update the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AutomaticBackupRetentionDays</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CopyTagsToBackups</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CopyTagsToVolumes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DailyAutomaticBackupStartTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ThroughputCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WeeklyMaintenanceStartTime</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateFileSystemRequest
     *        The request object for the <code>UpdateFileSystem</code> operation.
     * @return Result of the UpdateFileSystem operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InvalidNetworkSettingsException
     *         One or more network settings specified in the request are invalid.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws FileSystemNotFoundException
     *         No Amazon FSx file systems were found based upon supplied parameters.
     * @throws MissingFileSystemConfigurationException
     *         A file system configuration is required for this operation.
     * @throws ServiceLimitExceededException
     *         An error indicating that a particular service limit was exceeded. You can increase some service limits by
     *         contacting Amazon Web Services Support.
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
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
     * <p>
     * Updates the name of an Amazon FSx for OpenZFS snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return Result of the UpdateSnapshot operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws SnapshotNotFoundException
     *         No Amazon FSx snapshots were found based on the supplied parameters.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @sample AmazonFSx.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateSnapshotResult updateSnapshot(UpdateSnapshotRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateSnapshot(request);
    }

    @SdkInternalApi
    final UpdateSnapshotResult executeUpdateSnapshot(UpdateSnapshotRequest updateSnapshotRequest) {

        ExecutionContext executionContext = createExecutionContext(updateSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateSnapshotRequest> request = null;
        Response<UpdateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateSnapshotRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateSnapshot");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateSnapshotResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateSnapshotResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates an Amazon FSx for ONTAP storage virtual machine (SVM).
     * </p>
     * 
     * @param updateStorageVirtualMachineRequest
     * @return Result of the UpdateStorageVirtualMachine operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws StorageVirtualMachineNotFoundException
     *         No FSx for ONTAP SVMs were found based upon the supplied parameters.
     * @throws UnsupportedOperationException
     *         The requested operation is not supported for this resource or API.
     * @sample AmazonFSx.UpdateStorageVirtualMachine
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateStorageVirtualMachine"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public UpdateStorageVirtualMachineResult updateStorageVirtualMachine(UpdateStorageVirtualMachineRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateStorageVirtualMachine(request);
    }

    @SdkInternalApi
    final UpdateStorageVirtualMachineResult executeUpdateStorageVirtualMachine(UpdateStorageVirtualMachineRequest updateStorageVirtualMachineRequest) {

        ExecutionContext executionContext = createExecutionContext(updateStorageVirtualMachineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateStorageVirtualMachineRequest> request = null;
        Response<UpdateStorageVirtualMachineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateStorageVirtualMachineRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(updateStorageVirtualMachineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateStorageVirtualMachine");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateStorageVirtualMachineResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateStorageVirtualMachineResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the configuration of an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param updateVolumeRequest
     * @return Result of the UpdateVolume operation returned by the service.
     * @throws BadRequestException
     *         A generic error indicating a failure with a client request.
     * @throws IncompatibleParameterErrorException
     *         The error returned when a second request is received with the same client request token but different
     *         parameters settings. A client request token should always uniquely identify a single request.
     * @throws InternalServerErrorException
     *         A generic error indicating a server-side failure.
     * @throws MissingVolumeConfigurationException
     *         A volume configuration is required for this operation.
     * @throws VolumeNotFoundException
     *         No Amazon FSx volumes were found based upon the supplied parameters.
     * @sample AmazonFSx.UpdateVolume
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateVolume" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateVolumeResult updateVolume(UpdateVolumeRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateVolume(request);
    }

    @SdkInternalApi
    final UpdateVolumeResult executeUpdateVolume(UpdateVolumeRequest updateVolumeRequest) {

        ExecutionContext executionContext = createExecutionContext(updateVolumeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateVolumeRequest> request = null;
        Response<UpdateVolumeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateVolumeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateVolumeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "FSx");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateVolume");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateVolumeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateVolumeResultJsonUnmarshaller());
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

    @Override
    public void shutdown() {
        super.shutdown();
    }

}
