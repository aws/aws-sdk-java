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
package com.amazonaws.services.migrationhub;

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

import com.amazonaws.services.migrationhub.AWSMigrationHubClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.migrationhub.model.*;
import com.amazonaws.services.migrationhub.model.transform.*;

/**
 * Client for accessing AWS Migration Hub. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * The AWS Migration Hub API methods help to obtain server and application migration status and integrate your
 * resource-specific migration tool by providing a programmatic interface to Migration Hub.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMigrationHubClient extends AmazonWebServiceClient implements AWSMigrationHub {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSMigrationHub.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "mgh";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.AccessDeniedException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.ResourceNotFoundException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("UnauthorizedOperation").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.UnauthorizedOperationException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.InvalidInputException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("PolicyErrorException").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.PolicyErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ServiceUnavailableException").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.ServiceUnavailableException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InternalServerError").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.InternalServerErrorException.class))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("DryRunOperation").withModeledClass(
                                    com.amazonaws.services.migrationhub.model.DryRunOperationException.class))
                    .withBaseServiceExceptionClass(com.amazonaws.services.migrationhub.model.AWSMigrationHubException.class));

    public static AWSMigrationHubClientBuilder builder() {
        return AWSMigrationHubClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Migration Hub using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AWSMigrationHubClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("mgh.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/migrationhub/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/migrationhub/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Associates a created artifact of an AWS cloud resource, the target receiving the migration, with the migration
     * task performed by a migration tool. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools can call the <code>AssociateCreatedArtifact</code> operation to indicate which AWS artifact is
     * associated with a migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
     * about type and region; for example: <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or DMS endpoint, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param associateCreatedArtifactRequest
     * @return Result of the AssociateCreatedArtifact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.AssociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateCreatedArtifactResult associateCreatedArtifact(AssociateCreatedArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateCreatedArtifact(request);
    }

    @SdkInternalApi
    final AssociateCreatedArtifactResult executeAssociateCreatedArtifact(AssociateCreatedArtifactRequest associateCreatedArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(associateCreatedArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateCreatedArtifactRequest> request = null;
        Response<AssociateCreatedArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateCreatedArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateCreatedArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateCreatedArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateCreatedArtifactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateCreatedArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a discovered resource ID from Application Discovery Service (ADS) with a migration task.
     * </p>
     * 
     * @param associateDiscoveredResourceRequest
     * @return Result of the AssociateDiscoveredResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.AssociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/AssociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public AssociateDiscoveredResourceResult associateDiscoveredResource(AssociateDiscoveredResourceRequest request) {
        request = beforeClientExecution(request);
        return executeAssociateDiscoveredResource(request);
    }

    @SdkInternalApi
    final AssociateDiscoveredResourceResult executeAssociateDiscoveredResource(AssociateDiscoveredResourceRequest associateDiscoveredResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(associateDiscoveredResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AssociateDiscoveredResourceRequest> request = null;
        Response<AssociateDiscoveredResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AssociateDiscoveredResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(associateDiscoveredResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "AssociateDiscoveredResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AssociateDiscoveredResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AssociateDiscoveredResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a progress update stream which is an AWS resource used for access control as well as a namespace for
     * migration task names that is implicitly linked to your AWS account. It must uniquely identify the migration tool
     * as it is used for all updates made by the tool; however, it does not need to be unique for each AWS account
     * because it is scoped to the AWS account.
     * </p>
     * 
     * @param createProgressUpdateStreamRequest
     * @return Result of the CreateProgressUpdateStream operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHub.CreateProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/CreateProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateProgressUpdateStreamResult createProgressUpdateStream(CreateProgressUpdateStreamRequest request) {
        request = beforeClientExecution(request);
        return executeCreateProgressUpdateStream(request);
    }

    @SdkInternalApi
    final CreateProgressUpdateStreamResult executeCreateProgressUpdateStream(CreateProgressUpdateStreamRequest createProgressUpdateStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(createProgressUpdateStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateProgressUpdateStreamRequest> request = null;
        Response<CreateProgressUpdateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateProgressUpdateStreamRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createProgressUpdateStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateProgressUpdateStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateProgressUpdateStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateProgressUpdateStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a progress update stream, including all of its tasks, which was previously created as an AWS resource
     * used for access control. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The only parameter needed for <code>DeleteProgressUpdateStream</code> is the stream name (same as a
     * <code>CreateProgressUpdateStream</code> call).
     * </p>
     * </li>
     * <li>
     * <p>
     * The call will return, and a background process will asynchronously delete the stream and all of its resources
     * (tasks, associated resources, resource attributes, created artifacts).
     * </p>
     * </li>
     * <li>
     * <p>
     * If the stream takes time to be deleted, it might still show up on a <code>ListProgressUpdateStreams</code> call.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreateProgressUpdateStream</code>, <code>ImportMigrationTask</code>, <code>NotifyMigrationTaskState</code>,
     * and all Associate[*] APIs realted to the tasks belonging to the stream will throw "InvalidInputException" if the
     * stream of the same name is in the process of being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * Once the stream and all of its resources are deleted, <code>CreateProgressUpdateStream</code> for a stream of the
     * same name will succeed, and that stream will be an entirely new logical resource (without any resources
     * associated with the old stream).
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteProgressUpdateStreamRequest
     * @return Result of the DeleteProgressUpdateStream operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DeleteProgressUpdateStream
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DeleteProgressUpdateStream"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteProgressUpdateStreamResult deleteProgressUpdateStream(DeleteProgressUpdateStreamRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteProgressUpdateStream(request);
    }

    @SdkInternalApi
    final DeleteProgressUpdateStreamResult executeDeleteProgressUpdateStream(DeleteProgressUpdateStreamRequest deleteProgressUpdateStreamRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteProgressUpdateStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteProgressUpdateStreamRequest> request = null;
        Response<DeleteProgressUpdateStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteProgressUpdateStreamRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteProgressUpdateStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteProgressUpdateStream");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteProgressUpdateStreamResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteProgressUpdateStreamResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the migration status of an application.
     * </p>
     * 
     * @param describeApplicationStateRequest
     * @return Result of the DescribeApplicationState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DescribeApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeApplicationStateResult describeApplicationState(DescribeApplicationStateRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeApplicationState(request);
    }

    @SdkInternalApi
    final DescribeApplicationStateResult executeDescribeApplicationState(DescribeApplicationStateRequest describeApplicationStateRequest) {

        ExecutionContext executionContext = createExecutionContext(describeApplicationStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationStateRequest> request = null;
        Response<DescribeApplicationStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationStateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeApplicationStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeApplicationState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeApplicationStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeApplicationStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves a list of all attributes associated with a specific migration task.
     * </p>
     * 
     * @param describeMigrationTaskRequest
     * @return Result of the DescribeMigrationTask operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DescribeMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DescribeMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeMigrationTaskResult describeMigrationTask(DescribeMigrationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMigrationTask(request);
    }

    @SdkInternalApi
    final DescribeMigrationTaskResult executeDescribeMigrationTask(DescribeMigrationTaskRequest describeMigrationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMigrationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMigrationTaskRequest> request = null;
        Response<DescribeMigrationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMigrationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMigrationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMigrationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMigrationTaskResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeMigrationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociates a created artifact of an AWS resource with a migration task performed by a migration tool that was
     * previously associated. This API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A migration user can call the <code>DisassociateCreatedArtifacts</code> operation to disassociate a created AWS
     * Artifact from a migration task.
     * </p>
     * </li>
     * <li>
     * <p>
     * The created artifact name must be provided in ARN (Amazon Resource Name) format which will contain information
     * about type and region; for example: <code>arn:aws:ec2:us-east-1:488216288981:image/ami-6d0ba87b</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Examples of the AWS resource behind the created artifact are, AMI's, EC2 instance, or RDS instance, etc.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateCreatedArtifactRequest
     * @return Result of the DisassociateCreatedArtifact operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DisassociateCreatedArtifact
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateCreatedArtifact"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateCreatedArtifactResult disassociateCreatedArtifact(DisassociateCreatedArtifactRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateCreatedArtifact(request);
    }

    @SdkInternalApi
    final DisassociateCreatedArtifactResult executeDisassociateCreatedArtifact(DisassociateCreatedArtifactRequest disassociateCreatedArtifactRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateCreatedArtifactRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateCreatedArtifactRequest> request = null;
        Response<DisassociateCreatedArtifactResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateCreatedArtifactRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateCreatedArtifactRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateCreatedArtifact");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateCreatedArtifactResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateCreatedArtifactResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disassociate an Application Discovery Service (ADS) discovered resource from a migration task.
     * </p>
     * 
     * @param disassociateDiscoveredResourceRequest
     * @return Result of the DisassociateDiscoveredResource operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.DisassociateDiscoveredResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/DisassociateDiscoveredResource"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DisassociateDiscoveredResourceResult disassociateDiscoveredResource(DisassociateDiscoveredResourceRequest request) {
        request = beforeClientExecution(request);
        return executeDisassociateDiscoveredResource(request);
    }

    @SdkInternalApi
    final DisassociateDiscoveredResourceResult executeDisassociateDiscoveredResource(DisassociateDiscoveredResourceRequest disassociateDiscoveredResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(disassociateDiscoveredResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisassociateDiscoveredResourceRequest> request = null;
        Response<DisassociateDiscoveredResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisassociateDiscoveredResourceRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(disassociateDiscoveredResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DisassociateDiscoveredResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DisassociateDiscoveredResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DisassociateDiscoveredResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers a new migration task which represents a server, database, etc., being migrated to AWS by a migration
     * tool.
     * </p>
     * <p>
     * This API is a prerequisite to calling the <code>NotifyMigrationTaskState</code> API as the migration tool must
     * first register the migration task with Migration Hub.
     * </p>
     * 
     * @param importMigrationTaskRequest
     * @return Result of the ImportMigrationTask operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ImportMigrationTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ImportMigrationTask"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ImportMigrationTaskResult importMigrationTask(ImportMigrationTaskRequest request) {
        request = beforeClientExecution(request);
        return executeImportMigrationTask(request);
    }

    @SdkInternalApi
    final ImportMigrationTaskResult executeImportMigrationTask(ImportMigrationTaskRequest importMigrationTaskRequest) {

        ExecutionContext executionContext = createExecutionContext(importMigrationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ImportMigrationTaskRequest> request = null;
        Response<ImportMigrationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ImportMigrationTaskRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(importMigrationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ImportMigrationTask");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ImportMigrationTaskResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ImportMigrationTaskResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the created artifacts attached to a given migration task in an update stream. This API has the following
     * traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Gets the list of the created artifacts while migration is taking place.
     * </p>
     * </li>
     * <li>
     * <p>
     * Shows the artifacts created by the migration tool that was associated by the
     * <code>AssociateCreatedArtifact</code> API.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists created artifacts in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listCreatedArtifactsRequest
     * @return Result of the ListCreatedArtifacts operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ListCreatedArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListCreatedArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListCreatedArtifactsResult listCreatedArtifacts(ListCreatedArtifactsRequest request) {
        request = beforeClientExecution(request);
        return executeListCreatedArtifacts(request);
    }

    @SdkInternalApi
    final ListCreatedArtifactsResult executeListCreatedArtifacts(ListCreatedArtifactsRequest listCreatedArtifactsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCreatedArtifactsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCreatedArtifactsRequest> request = null;
        Response<ListCreatedArtifactsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCreatedArtifactsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCreatedArtifactsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCreatedArtifacts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCreatedArtifactsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCreatedArtifactsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists discovered resources associated with the given <code>MigrationTask</code>.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return Result of the ListDiscoveredResources operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListDiscoveredResources"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest request) {
        request = beforeClientExecution(request);
        return executeListDiscoveredResources(request);
    }

    @SdkInternalApi
    final ListDiscoveredResourcesResult executeListDiscoveredResources(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest) {

        ExecutionContext executionContext = createExecutionContext(listDiscoveredResourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDiscoveredResourcesRequest> request = null;
        Response<ListDiscoveredResourcesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDiscoveredResourcesRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listDiscoveredResourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDiscoveredResources");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDiscoveredResourcesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListDiscoveredResourcesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all, or filtered by resource name, migration tasks associated with the user account making this call. This
     * API has the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can show a summary list of the most recent migration tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can show a summary list of migration tasks associated with a given discovered resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * Lists migration tasks in a paginated interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listMigrationTasksRequest
     * @return Result of the ListMigrationTasks operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.ListMigrationTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListMigrationTasks"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMigrationTasksResult listMigrationTasks(ListMigrationTasksRequest request) {
        request = beforeClientExecution(request);
        return executeListMigrationTasks(request);
    }

    @SdkInternalApi
    final ListMigrationTasksResult executeListMigrationTasks(ListMigrationTasksRequest listMigrationTasksRequest) {

        ExecutionContext executionContext = createExecutionContext(listMigrationTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMigrationTasksRequest> request = null;
        Response<ListMigrationTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMigrationTasksRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMigrationTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMigrationTasks");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMigrationTasksResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMigrationTasksResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists progress update streams associated with the user account making this call.
     * </p>
     * 
     * @param listProgressUpdateStreamsRequest
     * @return Result of the ListProgressUpdateStreams operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @sample AWSMigrationHub.ListProgressUpdateStreams
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ListProgressUpdateStreams"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListProgressUpdateStreamsResult listProgressUpdateStreams(ListProgressUpdateStreamsRequest request) {
        request = beforeClientExecution(request);
        return executeListProgressUpdateStreams(request);
    }

    @SdkInternalApi
    final ListProgressUpdateStreamsResult executeListProgressUpdateStreams(ListProgressUpdateStreamsRequest listProgressUpdateStreamsRequest) {

        ExecutionContext executionContext = createExecutionContext(listProgressUpdateStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListProgressUpdateStreamsRequest> request = null;
        Response<ListProgressUpdateStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListProgressUpdateStreamsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listProgressUpdateStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListProgressUpdateStreams");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListProgressUpdateStreamsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListProgressUpdateStreamsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets the migration state of an application. For a given application identified by the value passed to
     * <code>ApplicationId</code>, its status is set or updated by passing one of three values to <code>Status</code>:
     * <code>NOT_STARTED | IN_PROGRESS | COMPLETED</code>.
     * </p>
     * 
     * @param notifyApplicationStateRequest
     * @return Result of the NotifyApplicationState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws PolicyErrorException
     *         Exception raised when there are problems accessing ADS (Application Discovery Service); most likely due
     *         to a misconfigured policy or the <code>migrationhub-discovery</code> role is missing or not configured
     *         correctly.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.NotifyApplicationState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyApplicationState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public NotifyApplicationStateResult notifyApplicationState(NotifyApplicationStateRequest request) {
        request = beforeClientExecution(request);
        return executeNotifyApplicationState(request);
    }

    @SdkInternalApi
    final NotifyApplicationStateResult executeNotifyApplicationState(NotifyApplicationStateRequest notifyApplicationStateRequest) {

        ExecutionContext executionContext = createExecutionContext(notifyApplicationStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyApplicationStateRequest> request = null;
        Response<NotifyApplicationStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyApplicationStateRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(notifyApplicationStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "NotifyApplicationState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<NotifyApplicationStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new NotifyApplicationStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Notifies Migration Hub of the current status, progress, or other detail regarding a migration task. This API has
     * the following traits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Migration tools will call the <code>NotifyMigrationTaskState</code> API to share the latest progress and status.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MigrationTaskName</code> is used for addressing updates to the correct target.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProgressUpdateStream</code> is used for access control and to provide a namespace for each migration tool.
     * </p>
     * </li>
     * </ul>
     * 
     * @param notifyMigrationTaskStateRequest
     * @return Result of the NotifyMigrationTaskState operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.NotifyMigrationTaskState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/NotifyMigrationTaskState"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public NotifyMigrationTaskStateResult notifyMigrationTaskState(NotifyMigrationTaskStateRequest request) {
        request = beforeClientExecution(request);
        return executeNotifyMigrationTaskState(request);
    }

    @SdkInternalApi
    final NotifyMigrationTaskStateResult executeNotifyMigrationTaskState(NotifyMigrationTaskStateRequest notifyMigrationTaskStateRequest) {

        ExecutionContext executionContext = createExecutionContext(notifyMigrationTaskStateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<NotifyMigrationTaskStateRequest> request = null;
        Response<NotifyMigrationTaskStateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new NotifyMigrationTaskStateRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(notifyMigrationTaskStateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "NotifyMigrationTaskState");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<NotifyMigrationTaskStateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new NotifyMigrationTaskStateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides identifying details of the resource being migrated so that it can be associated in the Application
     * Discovery Service (ADS)'s repository. This association occurs asynchronously after
     * <code>PutResourceAttributes</code> returns.
     * </p>
     * <important>
     * <ul>
     * <li>
     * <p>
     * Keep in mind that subsequent calls to PutResourceAttributes will override previously stored attributes. For
     * example, if it is first called with a MAC address, but later, it is desired to <i>add</i> an IP address, it will
     * then be required to call it with <i>both</i> the IP and MAC addresses to prevent overiding the MAC address.
     * </p>
     * </li>
     * <li>
     * <p>
     * Note the instructions regarding the special use case of the <a href=
     * "https://docs.aws.amazon.com/migrationhub/latest/ug/API_PutResourceAttributes.html#migrationhub-PutResourceAttributes-request-ResourceAttributeList"
     * > <code>ResourceAttributeList</code> </a> parameter when specifying any "VM" related value.
     * </p>
     * </li>
     * </ul>
     * </important> <note>
     * <p>
     * Because this is an asynchronous call, it will always return 200, whether an association occurs or not. To confirm
     * if an association was found based on the provided details, call <code>ListDiscoveredResources</code>.
     * </p>
     * </note>
     * 
     * @param putResourceAttributesRequest
     * @return Result of the PutResourceAttributes operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServerErrorException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws ServiceUnavailableException
     *         Exception raised when there is an internal, configuration, or dependency error encountered.
     * @throws DryRunOperationException
     *         Exception raised to indicate a successfully authorized action when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws UnauthorizedOperationException
     *         Exception raised to indicate a request was not authorized when the <code>DryRun</code> flag is set to
     *         "true".
     * @throws InvalidInputException
     *         Exception raised when the provided input violates a policy constraint or is entered in the wrong format
     *         or data type.
     * @throws ResourceNotFoundException
     *         Exception raised when the request references a resource (ADS configuration, update stream, migration
     *         task, etc.) that does not exist in ADS (Application Discovery Service) or in Migration Hub's repository.
     * @sample AWSMigrationHub.PutResourceAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/PutResourceAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public PutResourceAttributesResult putResourceAttributes(PutResourceAttributesRequest request) {
        request = beforeClientExecution(request);
        return executePutResourceAttributes(request);
    }

    @SdkInternalApi
    final PutResourceAttributesResult executePutResourceAttributes(PutResourceAttributesRequest putResourceAttributesRequest) {

        ExecutionContext executionContext = createExecutionContext(putResourceAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutResourceAttributesRequest> request = null;
        Response<PutResourceAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutResourceAttributesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(putResourceAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Migration Hub");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "PutResourceAttributes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PutResourceAttributesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new PutResourceAttributesResultJsonUnmarshaller());
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
