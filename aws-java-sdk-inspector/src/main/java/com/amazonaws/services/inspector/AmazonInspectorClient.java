/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.inspector;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.auth.presign.PresignerParams;
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

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.services.inspector.model.transform.*;

/**
 * Client for accessing Amazon Inspector. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of your AWS resources and to identify potential security issues.
 * For more information, see <a
 * href="http://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"> Amazon Inspector User
 * Guide</a>.
 * </p>
 */
@ThreadSafe
public class AmazonInspectorClient extends AmazonWebServiceClient implements AmazonInspector {
    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonInspector.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "inspector";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final SdkJsonProtocolFactory protocolFactory = new SdkJsonProtocolFactory(new JsonClientMetadata()
            .withProtocolVersion("1.1")
            .withSupportsCbor(false)
            .withSupportsIon(false)
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("AssessmentRunInProgressException").withModeledClass(
                            com.amazonaws.services.inspector.model.AssessmentRunInProgressException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withModeledClass(
                            com.amazonaws.services.inspector.model.LimitExceededException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("AccessDeniedException").withModeledClass(
                            com.amazonaws.services.inspector.model.AccessDeniedException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withModeledClass(
                            com.amazonaws.services.inspector.model.InvalidInputException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("NoSuchEntityException").withModeledClass(
                            com.amazonaws.services.inspector.model.NoSuchEntityException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("AgentsAlreadyRunningAssessmentException").withModeledClass(
                            com.amazonaws.services.inspector.model.AgentsAlreadyRunningAssessmentException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InvalidCrossAccountRoleException").withModeledClass(
                            com.amazonaws.services.inspector.model.InvalidCrossAccountRoleException.class))
            .addErrorMetadata(
                    new JsonErrorShapeMetadata().withErrorCode("InternalException").withModeledClass(
                            com.amazonaws.services.inspector.model.InternalException.class))
            .withBaseServiceExceptionClass(com.amazonaws.services.inspector.model.AmazonInspectorException.class));

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonInspectorClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance(), configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonInspectorClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account
     * credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     */
    public AmazonInspectorClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AmazonInspectorClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     */
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * provider and client configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     */
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified AWS account credentials
     * provider, client configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon Inspector (ex: proxy
     *        settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonInspectorClient(AwsSyncClientParams clientParams) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://inspector.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/inspector/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/inspector/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Assigns attributes (key and value pairs) to the findings that are specified by the ARNs of the findings.
     * </p>
     * 
     * @param addAttributesToFindingsRequest
     * @return Result of the AddAttributesToFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.AddAttributesToFindings
     */
    @Override
    public AddAttributesToFindingsResult addAttributesToFindings(AddAttributesToFindingsRequest addAttributesToFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(addAttributesToFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddAttributesToFindingsRequest> request = null;
        Response<AddAttributesToFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddAttributesToFindingsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(addAttributesToFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<AddAttributesToFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new AddAttributesToFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new assessment target using the ARN of the resource group that is generated by
     * <a>CreateResourceGroup</a>. You can create up to 50 assessment targets per AWS account. You can run up to 500
     * concurrent agents per AWS account. For more information, see <a
     * href="http://docs.aws.amazon.com/inspector/latest/userguide/inspector_applications.html"> Amazon Inspector
     * Assessment Targets</a>.
     * </p>
     * 
     * @param createAssessmentTargetRequest
     * @return Result of the CreateAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.CreateAssessmentTarget
     */
    @Override
    public CreateAssessmentTargetResult createAssessmentTarget(CreateAssessmentTargetRequest createAssessmentTargetRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentTargetRequest> request = null;
        Response<CreateAssessmentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentTargetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssessmentTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssessmentTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an assessment template for the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * 
     * @param createAssessmentTemplateRequest
     * @return Result of the CreateAssessmentTemplate operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.CreateAssessmentTemplate
     */
    @Override
    public CreateAssessmentTemplateResult createAssessmentTemplate(CreateAssessmentTemplateRequest createAssessmentTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssessmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentTemplateRequest> request = null;
        Response<CreateAssessmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentTemplateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAssessmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAssessmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateAssessmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resource group using the specified set of tags (key and value pairs) that are used to select the EC2
     * instances to be included in an Amazon Inspector assessment target. The created resource group is then used to
     * create an Amazon Inspector assessment target. For more information, see <a>CreateAssessmentTarget</a>.
     * </p>
     * 
     * @param createResourceGroupRequest
     * @return Result of the CreateResourceGroup operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.CreateResourceGroup
     */
    @Override
    public CreateResourceGroupResult createResourceGroup(CreateResourceGroupRequest createResourceGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createResourceGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceGroupRequest> request = null;
        Response<CreateResourceGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceGroupRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(createResourceGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateResourceGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateResourceGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment run that is specified by the ARN of the assessment run.
     * </p>
     * 
     * @param deleteAssessmentRunRequest
     * @return Result of the DeleteAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.DeleteAssessmentRun
     */
    @Override
    public DeleteAssessmentRunResult deleteAssessmentRun(DeleteAssessmentRunRequest deleteAssessmentRunRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentRunRequest> request = null;
        Response<DeleteAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentRunRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * 
     * @param deleteAssessmentTargetRequest
     * @return Result of the DeleteAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.DeleteAssessmentTarget
     */
    @Override
    public DeleteAssessmentTargetResult deleteAssessmentTarget(DeleteAssessmentTargetRequest deleteAssessmentTargetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentTargetRequest> request = null;
        Response<DeleteAssessmentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentTargetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssessmentTargetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment template that is specified by the ARN of the assessment template.
     * </p>
     * 
     * @param deleteAssessmentTemplateRequest
     * @return Result of the DeleteAssessmentTemplate operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.DeleteAssessmentTemplate
     */
    @Override
    public DeleteAssessmentTemplateResult deleteAssessmentTemplate(DeleteAssessmentTemplateRequest deleteAssessmentTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssessmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentTemplateRequest> request = null;
        Response<DeleteAssessmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentTemplateRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteAssessmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteAssessmentTemplateResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteAssessmentTemplateResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param describeAssessmentRunsRequest
     * @return Result of the DescribeAssessmentRuns operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentRuns
     */
    @Override
    public DescribeAssessmentRunsResult describeAssessmentRuns(DescribeAssessmentRunsRequest describeAssessmentRunsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssessmentRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentRunsRequest> request = null;
        Response<DescribeAssessmentRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentRunsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssessmentRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssessmentRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssessmentRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment targets that are specified by the ARNs of the assessment targets.
     * </p>
     * 
     * @param describeAssessmentTargetsRequest
     * @return Result of the DescribeAssessmentTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTargets
     */
    @Override
    public DescribeAssessmentTargetsResult describeAssessmentTargets(DescribeAssessmentTargetsRequest describeAssessmentTargetsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssessmentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentTargetsRequest> request = null;
        Response<DescribeAssessmentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentTargetsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAssessmentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssessmentTargetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssessmentTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment templates that are specified by the ARNs of the assessment templates.
     * </p>
     * 
     * @param describeAssessmentTemplatesRequest
     * @return Result of the DescribeAssessmentTemplates operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTemplates
     */
    @Override
    public DescribeAssessmentTemplatesResult describeAssessmentTemplates(DescribeAssessmentTemplatesRequest describeAssessmentTemplatesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssessmentTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentTemplatesRequest> request = null;
        Response<DescribeAssessmentTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentTemplatesRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeAssessmentTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAssessmentTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeAssessmentTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the IAM role that enables Amazon Inspector to access your AWS account.
     * </p>
     * 
     * @param describeCrossAccountAccessRoleRequest
     * @return Result of the DescribeCrossAccountAccessRole operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonInspector.DescribeCrossAccountAccessRole
     */
    @Override
    public DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(DescribeCrossAccountAccessRoleRequest describeCrossAccountAccessRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCrossAccountAccessRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCrossAccountAccessRoleRequest> request = null;
        Response<DescribeCrossAccountAccessRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCrossAccountAccessRoleRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeCrossAccountAccessRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCrossAccountAccessRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeCrossAccountAccessRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the findings that are specified by the ARNs of the findings.
     * </p>
     * 
     * @param describeFindingsRequest
     * @return Result of the DescribeFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeFindings
     */
    @Override
    public DescribeFindingsResult describeFindings(DescribeFindingsRequest describeFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFindingsRequest> request = null;
        Response<DescribeFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFindingsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the resource groups that are specified by the ARNs of the resource groups.
     * </p>
     * 
     * @param describeResourceGroupsRequest
     * @return Result of the DescribeResourceGroups operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeResourceGroups
     */
    @Override
    public DescribeResourceGroupsResult describeResourceGroups(DescribeResourceGroupsRequest describeResourceGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeResourceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceGroupsRequest> request = null;
        Response<DescribeResourceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceGroupsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeResourceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeResourceGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeResourceGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the rules packages that are specified by the ARNs of the rules packages.
     * </p>
     * 
     * @param describeRulesPackagesRequest
     * @return Result of the DescribeRulesPackages operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @sample AmazonInspector.DescribeRulesPackages
     */
    @Override
    public DescribeRulesPackagesResult describeRulesPackages(DescribeRulesPackagesRequest describeRulesPackagesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRulesPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRulesPackagesRequest> request = null;
        Response<DescribeRulesPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRulesPackagesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRulesPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRulesPackagesResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeRulesPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Information about the data that is collected for the specified assessment run.
     * </p>
     * 
     * @param getTelemetryMetadataRequest
     * @return Result of the GetTelemetryMetadata operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.GetTelemetryMetadata
     */
    @Override
    public GetTelemetryMetadataResult getTelemetryMetadata(GetTelemetryMetadataRequest getTelemetryMetadataRequest) {
        ExecutionContext executionContext = createExecutionContext(getTelemetryMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTelemetryMetadataRequest> request = null;
        Response<GetTelemetryMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTelemetryMetadataRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(getTelemetryMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetTelemetryMetadataResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetTelemetryMetadataResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the agents of the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param listAssessmentRunAgentsRequest
     * @return Result of the ListAssessmentRunAgents operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentRunAgents
     */
    @Override
    public ListAssessmentRunAgentsResult listAssessmentRunAgents(ListAssessmentRunAgentsRequest listAssessmentRunAgentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentRunAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentRunAgentsRequest> request = null;
        Response<ListAssessmentRunAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentRunAgentsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentRunAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentRunAgentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssessmentRunAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessment runs that correspond to the assessment templates that are specified by the ARNs of the
     * assessment templates.
     * </p>
     * 
     * @param listAssessmentRunsRequest
     * @return Result of the ListAssessmentRuns operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentRuns
     */
    @Override
    public ListAssessmentRunsResult listAssessmentRuns(ListAssessmentRunsRequest listAssessmentRunsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentRunsRequest> request = null;
        Response<ListAssessmentRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentRunsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentRunsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListAssessmentRunsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the ARNs of the assessment targets within this AWS account. For more information about assessment targets,
     * see <a href="http://docs.aws.amazon.com/inspector/latest/userguide/inspector_applications.html">Amazon Inspector
     * Assessment Targets</a>.
     * </p>
     * 
     * @param listAssessmentTargetsRequest
     * @return Result of the ListAssessmentTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.ListAssessmentTargets
     */
    @Override
    public ListAssessmentTargetsResult listAssessmentTargets(ListAssessmentTargetsRequest listAssessmentTargetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentTargetsRequest> request = null;
        Response<ListAssessmentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentTargetsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentTargetsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListAssessmentTargetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessment templates that correspond to the assessment targets that are specified by the ARNs of the
     * assessment targets.
     * </p>
     * 
     * @param listAssessmentTemplatesRequest
     * @return Result of the ListAssessmentTemplates operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListAssessmentTemplates
     */
    @Override
    public ListAssessmentTemplatesResult listAssessmentTemplates(ListAssessmentTemplatesRequest listAssessmentTemplatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentTemplatesRequest> request = null;
        Response<ListAssessmentTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentTemplatesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listAssessmentTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListAssessmentTemplatesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListAssessmentTemplatesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the event subscriptions for the assessment template that is specified by the ARN of the assessment
     * template. For more information, see <a>SubscribeToEvent</a> and <a>UnsubscribeFromEvent</a>.
     * </p>
     * 
     * @param listEventSubscriptionsRequest
     * @return Result of the ListEventSubscriptions operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListEventSubscriptions
     */
    @Override
    public ListEventSubscriptionsResult listEventSubscriptions(ListEventSubscriptionsRequest listEventSubscriptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventSubscriptionsRequest> request = null;
        Response<ListEventSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventSubscriptionsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventSubscriptionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListEventSubscriptionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists findings that are generated by the assessment runs that are specified by the ARNs of the assessment runs.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListFindings
     */
    @Override
    public ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(listFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsRequest> request = null;
        Response<ListFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available Amazon Inspector rules packages.
     * </p>
     * 
     * @param listRulesPackagesRequest
     * @return Result of the ListRulesPackages operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @sample AmazonInspector.ListRulesPackages
     */
    @Override
    public ListRulesPackagesResult listRulesPackages(ListRulesPackagesRequest listRulesPackagesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRulesPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesPackagesRequest> request = null;
        Response<ListRulesPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesPackagesRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRulesPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRulesPackagesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRulesPackagesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with an assessment template.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.ListTagsForResource
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
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
     * Previews the agents installed on the EC2 instances that are part of the specified assessment target.
     * </p>
     * 
     * @param previewAgentsRequest
     * @return Result of the PreviewAgents operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @sample AmazonInspector.PreviewAgents
     */
    @Override
    public PreviewAgentsResult previewAgents(PreviewAgentsRequest previewAgentsRequest) {
        ExecutionContext executionContext = createExecutionContext(previewAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PreviewAgentsRequest> request = null;
        Response<PreviewAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PreviewAgentsRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(previewAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<PreviewAgentsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new PreviewAgentsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the IAM role that Amazon Inspector uses to list your EC2 instances at the start of the assessment run
     * or when you call the <a>PreviewAgents</a> action.
     * </p>
     * 
     * @param registerCrossAccountAccessRoleRequest
     * @return Result of the RegisterCrossAccountAccessRole operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @sample AmazonInspector.RegisterCrossAccountAccessRole
     */
    @Override
    public RegisterCrossAccountAccessRoleResult registerCrossAccountAccessRole(RegisterCrossAccountAccessRoleRequest registerCrossAccountAccessRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(registerCrossAccountAccessRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCrossAccountAccessRoleRequest> request = null;
        Response<RegisterCrossAccountAccessRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterCrossAccountAccessRoleRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(registerCrossAccountAccessRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RegisterCrossAccountAccessRoleResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RegisterCrossAccountAccessRoleResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes entire attributes (key and value pairs) from the findings that are specified by the ARNs of the findings
     * where an attribute with the specified key exists.
     * </p>
     * 
     * @param removeAttributesFromFindingsRequest
     * @return Result of the RemoveAttributesFromFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.RemoveAttributesFromFindings
     */
    @Override
    public RemoveAttributesFromFindingsResult removeAttributesFromFindings(RemoveAttributesFromFindingsRequest removeAttributesFromFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(removeAttributesFromFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAttributesFromFindingsRequest> request = null;
        Response<RemoveAttributesFromFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAttributesFromFindingsRequestMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(removeAttributesFromFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<RemoveAttributesFromFindingsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new RemoveAttributesFromFindingsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets tags (key and value pairs) to the assessment template that is specified by the ARN of the assessment
     * template.
     * </p>
     * 
     * @param setTagsForResourceRequest
     * @return Result of the SetTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.SetTagsForResource
     */
    @Override
    public SetTagsForResourceResult setTagsForResource(SetTagsForResourceRequest setTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(setTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTagsForResourceRequest> request = null;
        Response<SetTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTagsForResourceRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(setTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SetTagsForResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SetTagsForResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the assessment run specified by the ARN of the assessment template. For this API to function properly, you
     * must not exceed the limit of running up to 500 concurrent agents per AWS account.
     * </p>
     * 
     * @param startAssessmentRunRequest
     * @return Result of the StartAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @throws InvalidCrossAccountRoleException
     *         Amazon Inspector cannot assume the cross-account role that it needs to list your EC2 instances during the
     *         assessment run.
     * @throws AgentsAlreadyRunningAssessmentException
     *         You started an assessment run, but one of the instances is already participating in another assessment
     *         run.
     * @sample AmazonInspector.StartAssessmentRun
     */
    @Override
    public StartAssessmentRunResult startAssessmentRun(StartAssessmentRunRequest startAssessmentRunRequest) {
        ExecutionContext executionContext = createExecutionContext(startAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAssessmentRunRequest> request = null;
        Response<StartAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAssessmentRunRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(startAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StartAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StartAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the assessment run that is specified by the ARN of the assessment run.
     * </p>
     * 
     * @param stopAssessmentRunRequest
     * @return Result of the StopAssessmentRun operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.StopAssessmentRun
     */
    @Override
    public StopAssessmentRunResult stopAssessmentRun(StopAssessmentRunRequest stopAssessmentRunRequest) {
        ExecutionContext executionContext = createExecutionContext(stopAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAssessmentRunRequest> request = null;
        Response<StopAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAssessmentRunRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopAssessmentRunResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopAssessmentRunResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
     * a specified SNS topic.
     * </p>
     * 
     * @param subscribeToEventRequest
     * @return Result of the SubscribeToEvent operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.SubscribeToEvent
     */
    @Override
    public SubscribeToEventResult subscribeToEvent(SubscribeToEventRequest subscribeToEventRequest) {
        ExecutionContext executionContext = createExecutionContext(subscribeToEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeToEventRequest> request = null;
        Response<SubscribeToEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeToEventRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(subscribeToEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<SubscribeToEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new SubscribeToEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the process of sending Amazon Simple Notification Service (SNS) notifications about a specified event to
     * a specified SNS topic.
     * </p>
     * 
     * @param unsubscribeFromEventRequest
     * @return Result of the UnsubscribeFromEvent operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.UnsubscribeFromEvent
     */
    @Override
    public UnsubscribeFromEventResult unsubscribeFromEvent(UnsubscribeFromEventRequest unsubscribeFromEventRequest) {
        ExecutionContext executionContext = createExecutionContext(unsubscribeFromEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeFromEventRequest> request = null;
        Response<UnsubscribeFromEventResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeFromEventRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(unsubscribeFromEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UnsubscribeFromEventResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UnsubscribeFromEventResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the assessment target that is specified by the ARN of the assessment target.
     * </p>
     * 
     * @param updateAssessmentTargetRequest
     * @return Result of the UpdateAssessmentTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that does not exist. The error code describes
     *         the entity.
     * @sample AmazonInspector.UpdateAssessmentTarget
     */
    @Override
    public UpdateAssessmentTargetResult updateAssessmentTarget(UpdateAssessmentTargetRequest updateAssessmentTargetRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentTargetRequest> request = null;
        Response<UpdateAssessmentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentTargetRequestMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateAssessmentTargetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new UpdateAssessmentTargetResultJsonUnmarshaller());
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

        executionContext.setCredentialsProvider(CredentialUtils.getCredentialsProvider(request.getOriginalRequest(), awsCredentialsProvider));

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke with no authentication. Credentials are not required and any credentials set on the client or request will
     * be ignored for this operation.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> anonymousInvoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler, ExecutionContext executionContext) {

        return doInvoke(request, responseHandler, executionContext);
    }

    /**
     * Invoke the request using the http client. Assumes credentials (or lack thereof) have been configured in the
     * ExecutionContext beforehand.
     **/
    private <X, Y extends AmazonWebServiceRequest> Response<X> doInvoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        HttpResponseHandler<AmazonServiceException> errorResponseHandler = protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata());

        return client.execute(request, responseHandler, errorResponseHandler, executionContext);
    }

}
