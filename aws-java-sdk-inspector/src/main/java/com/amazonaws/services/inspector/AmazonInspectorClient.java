/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.inspector;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.services.inspector.model.transform.*;

/**
 * Client for accessing Amazon Inspector. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of your AWS resources
 * and to identify potential security issues. For more information, see <a href=
 * "https://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"
 * > Amazon Inspector User Guide</a>.
 * </p>
 */
@ThreadSafe
public class AmazonInspectorClient extends AmazonWebServiceClient implements
        AmazonInspector {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonInspector.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "inspector";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "inspector";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all Amazon Inspector exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonInspectorClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Inspector (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonInspectorClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonInspectorClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Inspector (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonInspectorClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Inspector (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Inspector
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Amazon Inspector (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonInspectorClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.inspector.model.NoSuchEntityException.class,
                        "NoSuchEntityException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.inspector.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.inspector.model.InvalidInputException.class,
                        "InvalidInputException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.inspector.model.InternalException.class,
                "InternalException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.inspector.model.AccessDeniedException.class,
                        "AccessDeniedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.inspector.model.AgentsAlreadyRunningAssessmentException.class,
                        "AgentsAlreadyRunningAssessmentException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.inspector.model.AssessmentRunInProgressException.class,
                        "AssessmentRunInProgressException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.inspector.model.InvalidCrossAccountRoleException.class,
                        "InvalidCrossAccountRoleException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://inspector.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/inspector/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/inspector/request.handler2s"));
    }

    /**
     * <p>
     * Assigns attributes (key and value pair) to the findings specified by the
     * findings' ARNs.
     * </p>
     * 
     * @param addAttributesToFindingsRequest
     * @return Result of the AddAttributesToFindings operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.AddAttributesToFindings
     */
    @Override
    public AddAttributesToFindingsResult addAttributesToFindings(
            AddAttributesToFindingsRequest addAttributesToFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(addAttributesToFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddAttributesToFindingsRequest> request = null;
        Response<AddAttributesToFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddAttributesToFindingsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(addAttributesToFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddAttributesToFindingsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new AddAttributesToFindingsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new assessment target using the resource group ARN generated by
     * <a>CreateResourceGroup</a>. You can create up to 50 assessment targets
     * per AWS account. You can run up to 500 concurrent agents per AWS account.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/inspector/latest/userguide//inspector_applications.html"
     * > Amazon Inspector Assessment Targets</a>.
     * </p>
     * 
     * @param createAssessmentTargetRequest
     * @return Result of the CreateAssessmentTarget operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources
     *         beyond the current AWS account limits. The error code describes
     *         the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.CreateAssessmentTarget
     */
    @Override
    public CreateAssessmentTargetResult createAssessmentTarget(
            CreateAssessmentTargetRequest createAssessmentTargetRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentTargetRequest> request = null;
        Response<CreateAssessmentTargetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentTargetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAssessmentTargetResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateAssessmentTargetResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an assessment template for the assessment target specified by the
     * assessment target ARN.
     * </p>
     * 
     * @param createAssessmentTemplateRequest
     * @return Result of the CreateAssessmentTemplate operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources
     *         beyond the current AWS account limits. The error code describes
     *         the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.CreateAssessmentTemplate
     */
    @Override
    public CreateAssessmentTemplateResult createAssessmentTemplate(
            CreateAssessmentTemplateRequest createAssessmentTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssessmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentTemplateRequest> request = null;
        Response<CreateAssessmentTemplateResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentTemplateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createAssessmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAssessmentTemplateResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateAssessmentTemplateResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a resource group using the specified set of tags (key and value
     * pairs) that are used to select the EC2 instances to be included in an
     * Inspector assessment target. The created resource group is then used to
     * create an Inspector assessment target.
     * </p>
     * 
     * @param createResourceGroupRequest
     * @return Result of the CreateResourceGroup operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources
     *         beyond the current AWS account limits. The error code describes
     *         the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @sample AmazonInspector.CreateResourceGroup
     */
    @Override
    public CreateResourceGroupResult createResourceGroup(
            CreateResourceGroupRequest createResourceGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createResourceGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateResourceGroupRequest> request = null;
        Response<CreateResourceGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateResourceGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createResourceGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateResourceGroupResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateResourceGroupResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment run specified by the assessment run ARN.
     * </p>
     * 
     * @param deleteAssessmentRunRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is
     *         currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.DeleteAssessmentRun
     */
    @Override
    public void deleteAssessmentRun(
            DeleteAssessmentRunRequest deleteAssessmentRunRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentRunRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentRunRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment target specified by the assessment target ARN.
     * </p>
     * 
     * @param deleteAssessmentTargetRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is
     *         currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.DeleteAssessmentTarget
     */
    @Override
    public void deleteAssessmentTarget(
            DeleteAssessmentTargetRequest deleteAssessmentTargetRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentTargetRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentTargetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment template specified by the assessment template ARN.
     * </p>
     * 
     * @param deleteAssessmentTemplateRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AssessmentRunInProgressException
     *         You cannot perform a specified action if an assessment run is
     *         currently in progress.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.DeleteAssessmentTemplate
     */
    @Override
    public void deleteAssessmentTemplate(
            DeleteAssessmentTemplateRequest deleteAssessmentTemplateRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssessmentTemplateRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentTemplateRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentTemplateRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteAssessmentTemplateRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment run(s) specified by the assessment run ARN(s).
     * </p>
     * 
     * @param describeAssessmentRunsRequest
     * @return Result of the DescribeAssessmentRuns operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentRuns
     */
    @Override
    public DescribeAssessmentRunsResult describeAssessmentRuns(
            DescribeAssessmentRunsRequest describeAssessmentRunsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssessmentRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentRunsRequest> request = null;
        Response<DescribeAssessmentRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentRunsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAssessmentRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAssessmentRunsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeAssessmentRunsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment target(s) specified by the assessment target
     * ARN(s).
     * </p>
     * 
     * @param describeAssessmentTargetsRequest
     * @return Result of the DescribeAssessmentTargets operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTargets
     */
    @Override
    public DescribeAssessmentTargetsResult describeAssessmentTargets(
            DescribeAssessmentTargetsRequest describeAssessmentTargetsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssessmentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentTargetsRequest> request = null;
        Response<DescribeAssessmentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentTargetsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAssessmentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAssessmentTargetsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeAssessmentTargetsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment template(s) specified by the assessment
     * template(s) ARN(s).
     * </p>
     * 
     * @param describeAssessmentTemplatesRequest
     * @return Result of the DescribeAssessmentTemplates operation returned by
     *         the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @sample AmazonInspector.DescribeAssessmentTemplates
     */
    @Override
    public DescribeAssessmentTemplatesResult describeAssessmentTemplates(
            DescribeAssessmentTemplatesRequest describeAssessmentTemplatesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssessmentTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentTemplatesRequest> request = null;
        Response<DescribeAssessmentTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentTemplatesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAssessmentTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAssessmentTemplatesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeAssessmentTemplatesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the IAM role that enables Inspector to access your AWS account.
     * </p>
     * 
     * @param describeCrossAccountAccessRoleRequest
     * @return Result of the DescribeCrossAccountAccessRole operation returned
     *         by the service.
     * @throws InternalException
     *         Internal server error.
     * @sample AmazonInspector.DescribeCrossAccountAccessRole
     */
    @Override
    public DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(
            DescribeCrossAccountAccessRoleRequest describeCrossAccountAccessRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(describeCrossAccountAccessRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCrossAccountAccessRoleRequest> request = null;
        Response<DescribeCrossAccountAccessRoleResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCrossAccountAccessRoleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeCrossAccountAccessRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeCrossAccountAccessRoleResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeCrossAccountAccessRoleResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the finding(s) specified by the finding ARN(s).
     * </p>
     * 
     * @param describeFindingsRequest
     * @return Result of the DescribeFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @sample AmazonInspector.DescribeFindings
     */
    @Override
    public DescribeFindingsResult describeFindings(
            DescribeFindingsRequest describeFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFindingsRequest> request = null;
        Response<DescribeFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFindingsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeFindingsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeFindingsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes resource group(s) specified by the resource group ARN(s).
     * </p>
     * 
     * @param describeResourceGroupsRequest
     * @return Result of the DescribeResourceGroups operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @sample AmazonInspector.DescribeResourceGroups
     */
    @Override
    public DescribeResourceGroupsResult describeResourceGroups(
            DescribeResourceGroupsRequest describeResourceGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeResourceGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceGroupsRequest> request = null;
        Response<DescribeResourceGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceGroupsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeResourceGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeResourceGroupsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeResourceGroupsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the rules package(s) specified by the rules package ARN(s).
     * </p>
     * 
     * @param describeRulesPackagesRequest
     * @return Result of the DescribeRulesPackages operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @sample AmazonInspector.DescribeRulesPackages
     */
    @Override
    public DescribeRulesPackagesResult describeRulesPackages(
            DescribeRulesPackagesRequest describeRulesPackagesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRulesPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRulesPackagesRequest> request = null;
        Response<DescribeRulesPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRulesPackagesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeRulesPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeRulesPackagesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeRulesPackagesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Information about the data collected for the specified assessment run.
     * </p>
     * 
     * @param getTelemetryMetadataRequest
     * @return Result of the GetTelemetryMetadata operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.GetTelemetryMetadata
     */
    @Override
    public GetTelemetryMetadataResult getTelemetryMetadata(
            GetTelemetryMetadataRequest getTelemetryMetadataRequest) {
        ExecutionContext executionContext = createExecutionContext(getTelemetryMetadataRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTelemetryMetadataRequest> request = null;
        Response<GetTelemetryMetadataResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTelemetryMetadataRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getTelemetryMetadataRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetTelemetryMetadataResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetTelemetryMetadataResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the agents of the assessment run specified by the assessment run
     * ARN.
     * </p>
     * 
     * @param listAssessmentRunAgentsRequest
     * @return Result of the ListAssessmentRunAgents operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.ListAssessmentRunAgents
     */
    @Override
    public ListAssessmentRunAgentsResult listAssessmentRunAgents(
            ListAssessmentRunAgentsRequest listAssessmentRunAgentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentRunAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentRunAgentsRequest> request = null;
        Response<ListAssessmentRunAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentRunAgentsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAssessmentRunAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAssessmentRunAgentsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListAssessmentRunAgentsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessments run corresponding to assessment template(s)
     * specified by the assessment template(s)' ARN(s).
     * </p>
     * 
     * @param listAssessmentRunsRequest
     * @return Result of the ListAssessmentRuns operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.ListAssessmentRuns
     */
    @Override
    public ListAssessmentRunsResult listAssessmentRuns(
            ListAssessmentRunsRequest listAssessmentRunsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentRunsRequest> request = null;
        Response<ListAssessmentRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentRunsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAssessmentRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAssessmentRunsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListAssessmentRunsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the ARN(s) of the assessment target(s) within this AWS account. For
     * more information about assessment targets, see <a href=
     * "https://docs.aws.amazon.com/inspector/latest/userguide//inspector_applications.html"
     * >Amazon Inspector Assessment Targets</a>.
     * </p>
     * 
     * @param listAssessmentTargetsRequest
     * @return Result of the ListAssessmentTargets operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @sample AmazonInspector.ListAssessmentTargets
     */
    @Override
    public ListAssessmentTargetsResult listAssessmentTargets(
            ListAssessmentTargetsRequest listAssessmentTargetsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentTargetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentTargetsRequest> request = null;
        Response<ListAssessmentTargetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentTargetsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAssessmentTargetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAssessmentTargetsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListAssessmentTargetsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessment template(s) corresponding to the assessment
     * target(s) specified by the assessment targets' ARN(s).
     * </p>
     * 
     * @param listAssessmentTemplatesRequest
     * @return Result of the ListAssessmentTemplates operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.ListAssessmentTemplates
     */
    @Override
    public ListAssessmentTemplatesResult listAssessmentTemplates(
            ListAssessmentTemplatesRequest listAssessmentTemplatesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentTemplatesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentTemplatesRequest> request = null;
        Response<ListAssessmentTemplatesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentTemplatesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAssessmentTemplatesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAssessmentTemplatesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListAssessmentTemplatesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all the event subscriptions for the assessment template specified
     * by the assessment template ARN. For more information, see
     * <a>SubscribeToEvent</a> and <a>UnsubscribeFromEvent</a>.
     * </p>
     * 
     * @param listEventSubscriptionsRequest
     * @return Result of the ListEventSubscriptions operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.ListEventSubscriptions
     */
    @Override
    public ListEventSubscriptionsResult listEventSubscriptions(
            ListEventSubscriptionsRequest listEventSubscriptionsRequest) {
        ExecutionContext executionContext = createExecutionContext(listEventSubscriptionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventSubscriptionsRequest> request = null;
        Response<ListEventSubscriptionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventSubscriptionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listEventSubscriptionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListEventSubscriptionsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListEventSubscriptionsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists findings generated by the assessment run(s) specified by the
     * assessment run ARN(s).
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.ListFindings
     */
    @Override
    public ListFindingsResult listFindings(
            ListFindingsRequest listFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(listFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListFindingsRequest> request = null;
        Response<ListFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListFindingsRequestMarshaller().marshall(super
                        .beforeMarshalling(listFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListFindingsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListFindingsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all available Inspector rules packages.
     * </p>
     * 
     * @param listRulesPackagesRequest
     * @return Result of the ListRulesPackages operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @sample AmazonInspector.ListRulesPackages
     */
    @Override
    public ListRulesPackagesResult listRulesPackages(
            ListRulesPackagesRequest listRulesPackagesRequest) {
        ExecutionContext executionContext = createExecutionContext(listRulesPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRulesPackagesRequest> request = null;
        Response<ListRulesPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRulesPackagesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listRulesPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListRulesPackagesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListRulesPackagesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
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
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.ListTagsForResource
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTagsForResourceResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListTagsForResourceResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Previews the agents installed on the EC2 instances that are part of the
     * specified assessment target.
     * </p>
     * 
     * @param previewAgentsRequest
     * @return Result of the PreviewAgents operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @throws InvalidCrossAccountRoleException
     *         Inspector cannot assume the cross account role it needs to list
     *         your EC2 instances during the assessment run.
     * @sample AmazonInspector.PreviewAgents
     */
    @Override
    public PreviewAgentsResult previewAgents(
            PreviewAgentsRequest previewAgentsRequest) {
        ExecutionContext executionContext = createExecutionContext(previewAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PreviewAgentsRequest> request = null;
        Response<PreviewAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PreviewAgentsRequestMarshaller().marshall(super
                        .beforeMarshalling(previewAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PreviewAgentsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new PreviewAgentsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Registers the IAM role that Inspector uses to list your EC2 instances at
     * the start of the assessment run or when you call the <a>PreviewAgents</a>
     * action.
     * </p>
     * 
     * @param registerCrossAccountAccessRoleRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws InvalidCrossAccountRoleException
     *         Inspector cannot assume the cross account role it needs to list
     *         your EC2 instances during the assessment run.
     * @sample AmazonInspector.RegisterCrossAccountAccessRole
     */
    @Override
    public void registerCrossAccountAccessRole(
            RegisterCrossAccountAccessRoleRequest registerCrossAccountAccessRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(registerCrossAccountAccessRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCrossAccountAccessRoleRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterCrossAccountAccessRoleRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerCrossAccountAccessRoleRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes entire attributes (key and value pairs) from the findings
     * specified by the finding ARNs where an attribute with the specified key
     * exists.
     * </p>
     * 
     * @param removeAttributesFromFindingsRequest
     * @return Result of the RemoveAttributesFromFindings operation returned by
     *         the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.RemoveAttributesFromFindings
     */
    @Override
    public RemoveAttributesFromFindingsResult removeAttributesFromFindings(
            RemoveAttributesFromFindingsRequest removeAttributesFromFindingsRequest) {
        ExecutionContext executionContext = createExecutionContext(removeAttributesFromFindingsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveAttributesFromFindingsRequest> request = null;
        Response<RemoveAttributesFromFindingsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveAttributesFromFindingsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(removeAttributesFromFindingsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RemoveAttributesFromFindingsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RemoveAttributesFromFindingsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets tags (key and value pairs) to the assessment template specified by
     * the assessment template ARN.
     * </p>
     * 
     * @param setTagsForResourceRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.SetTagsForResource
     */
    @Override
    public void setTagsForResource(
            SetTagsForResourceRequest setTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(setTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTagsForResourceRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTagsForResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(setTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the assessment run specified by the assessment template ARN. For
     * this API to function properly, you must not exceed the limit of running
     * up to 500 concurrent agents per AWS account.
     * </p>
     * 
     * @param startAssessmentRunRequest
     * @return Result of the StartAssessmentRun operation returned by the
     *         service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources
     *         beyond the current AWS account limits. The error code describes
     *         the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @throws InvalidCrossAccountRoleException
     *         Inspector cannot assume the cross account role it needs to list
     *         your EC2 instances during the assessment run.
     * @throws AgentsAlreadyRunningAssessmentException
     *         You start an assessment run and one of the instances is already
     *         participating in another assessment run.
     * @sample AmazonInspector.StartAssessmentRun
     */
    @Override
    public StartAssessmentRunResult startAssessmentRun(
            StartAssessmentRunRequest startAssessmentRunRequest) {
        ExecutionContext executionContext = createExecutionContext(startAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartAssessmentRunRequest> request = null;
        Response<StartAssessmentRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartAssessmentRunRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(startAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StartAssessmentRunResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new StartAssessmentRunResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops the assessment run specified by the assessment run ARN.
     * </p>
     * 
     * @param stopAssessmentRunRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.StopAssessmentRun
     */
    @Override
    public void stopAssessmentRun(
            StopAssessmentRunRequest stopAssessmentRunRequest) {
        ExecutionContext executionContext = createExecutionContext(stopAssessmentRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopAssessmentRunRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopAssessmentRunRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(stopAssessmentRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables the process of sending Amazon Simple Notification Service (SNS)
     * notifications about a specified event to a specified topic.
     * </p>
     * 
     * @param subscribeToEventRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources
     *         beyond the current AWS account limits. The error code describes
     *         the limit exceeded.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.SubscribeToEvent
     */
    @Override
    public void subscribeToEvent(SubscribeToEventRequest subscribeToEventRequest) {
        ExecutionContext executionContext = createExecutionContext(subscribeToEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SubscribeToEventRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SubscribeToEventRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(subscribeToEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables the process of sending Amazon Simple Notification Service (SNS)
     * notifications about a specified event to a specified topic.
     * </p>
     * 
     * @param unsubscribeFromEventRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.UnsubscribeFromEvent
     */
    @Override
    public void unsubscribeFromEvent(
            UnsubscribeFromEventRequest unsubscribeFromEventRequest) {
        ExecutionContext executionContext = createExecutionContext(unsubscribeFromEventRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UnsubscribeFromEventRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UnsubscribeFromEventRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(unsubscribeFromEventRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the assessment target specified by the assessment target ARN.
     * </p>
     * 
     * @param updateAssessmentTargetRequest
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value
     *         was supplied for an input parameter.
     * @throws AccessDeniedException
     *         You do not have required permissions to access the requested
     *         resource.
     * @throws NoSuchEntityException
     *         The request was rejected because it referenced an entity that
     *         does not exist. The error code describes the entity.
     * @sample AmazonInspector.UpdateAssessmentTarget
     */
    @Override
    public void updateAssessmentTarget(
            UpdateAssessmentTargetRequest updateAssessmentTargetRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssessmentTargetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentTargetRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentTargetRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateAssessmentTargetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = SdkJsonProtocolFactory
                .createErrorResponseHandler(jsonErrorUnmarshallers, false);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
