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
import com.amazonaws.util.AWSRequestMetrics.Field;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.services.inspector.model.transform.*;

/**
 * Client for accessing Amazon Inspector. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon Inspector</fullname>
 * <p>
 * Amazon Inspector enables you to analyze the behavior of the applications you
 * run in AWS and to identify potential security issues. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/inspector/latest/userguide/inspector_introduction.html"
 * > Amazon Inspector User Guide</a>.
 * </p>
 */
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
        this(new DefaultAWSCredentialsProviderChain(),
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
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
        this(awsCredentials, com.amazonaws.PredefinedClientConfigurations
                .defaultConfig());
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
        this(awsCredentialsProvider,
                com.amazonaws.PredefinedClientConfigurations.defaultConfig());
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
                        com.amazonaws.services.inspector.model.OperationInProgressException.class,
                        "OperationInProgressException"));
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
                        com.amazonaws.services.inspector.model.InvalidCrossAccountRoleException.class,
                        "InvalidCrossAccountRoleException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://inspector.us-east-1.amazonaws.com");
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
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
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
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

            JsonResponseHandler<AddAttributesToFindingsResult> responseHandler = new JsonResponseHandler<AddAttributesToFindingsResult>(
                    new AddAttributesToFindingsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Attaches the rules package specified by the rules package ARN to the
     * assessment specified by the assessment ARN.
     * </p>
     * 
     * @param attachAssessmentAndRulesPackageRequest
     * @return Result of the AttachAssessmentAndRulesPackage operation returned
     *         by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.AttachAssessmentAndRulesPackage
     */
    @Override
    public AttachAssessmentAndRulesPackageResult attachAssessmentAndRulesPackage(
            AttachAssessmentAndRulesPackageRequest attachAssessmentAndRulesPackageRequest) {
        ExecutionContext executionContext = createExecutionContext(attachAssessmentAndRulesPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AttachAssessmentAndRulesPackageRequest> request = null;
        Response<AttachAssessmentAndRulesPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AttachAssessmentAndRulesPackageRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(attachAssessmentAndRulesPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AttachAssessmentAndRulesPackageResult> responseHandler = new JsonResponseHandler<AttachAssessmentAndRulesPackageResult>(
                    new AttachAssessmentAndRulesPackageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a new application using the resource group ARN generated by
     * <a>CreateResourceGroup</a>. You can create up to 50 applications per AWS
     * account. You can run up to 500 concurrent agents per AWS account. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/inspector/latest/userguide//inspector_applications.html"
     * > Inspector Applications.</a>
     * </p>
     * 
     * @param createApplicationRequest
     * @return Result of the CreateApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.CreateApplication
     */
    @Override
    public CreateApplicationResult createApplication(
            CreateApplicationRequest createApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(createApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateApplicationRequest> request = null;
        Response<CreateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateApplicationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateApplicationResult> responseHandler = new JsonResponseHandler<CreateApplicationResult>(
                    new CreateApplicationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an assessment for the application specified by the application
     * ARN. You can create up to 500 assessments per AWS account.
     * </p>
     * 
     * @param createAssessmentRequest
     * @return Result of the CreateAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.CreateAssessment
     */
    @Override
    public CreateAssessmentResult createAssessment(
            CreateAssessmentRequest createAssessmentRequest) {
        ExecutionContext executionContext = createExecutionContext(createAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAssessmentRequest> request = null;
        Response<CreateAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAssessmentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAssessmentResult> responseHandler = new JsonResponseHandler<CreateAssessmentResult>(
                    new CreateAssessmentResultJsonUnmarshaller());
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
     * Inspector application. The created resource group is then used to create
     * an Inspector application.
     * </p>
     * 
     * @param createResourceGroupRequest
     * @return Result of the CreateResourceGroup operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
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

            JsonResponseHandler<CreateResourceGroupResult> responseHandler = new JsonResponseHandler<CreateResourceGroupResult>(
                    new CreateResourceGroupResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the application specified by the application ARN.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws OperationInProgressException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DeleteApplication
     */
    @Override
    public DeleteApplicationResult deleteApplication(
            DeleteApplicationRequest deleteApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteApplicationRequest> request = null;
        Response<DeleteApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteApplicationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteApplicationResult> responseHandler = new JsonResponseHandler<DeleteApplicationResult>(
                    new DeleteApplicationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param deleteAssessmentRequest
     * @return Result of the DeleteAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws OperationInProgressException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DeleteAssessment
     */
    @Override
    public DeleteAssessmentResult deleteAssessment(
            DeleteAssessmentRequest deleteAssessmentRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteAssessmentRequest> request = null;
        Response<DeleteAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteAssessmentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteAssessmentResult> responseHandler = new JsonResponseHandler<DeleteAssessmentResult>(
                    new DeleteAssessmentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the assessment run specified by the run ARN.
     * </p>
     * 
     * @param deleteRunRequest
     * @return Result of the DeleteRun operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DeleteRun
     */
    @Override
    public DeleteRunResult deleteRun(DeleteRunRequest deleteRunRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRunRequest> request = null;
        Response<DeleteRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRunRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteRunResult> responseHandler = new JsonResponseHandler<DeleteRunResult>(
                    new DeleteRunResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the application specified by the application ARN.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeApplication
     */
    @Override
    public DescribeApplicationResult describeApplication(
            DescribeApplicationRequest describeApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(describeApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeApplicationRequest> request = null;
        Response<DescribeApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeApplicationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeApplicationResult> responseHandler = new JsonResponseHandler<DescribeApplicationResult>(
                    new DescribeApplicationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param describeAssessmentRequest
     * @return Result of the DescribeAssessment operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeAssessment
     */
    @Override
    public DescribeAssessmentResult describeAssessment(
            DescribeAssessmentRequest describeAssessmentRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAssessmentRequest> request = null;
        Response<DescribeAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAssessmentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAssessmentResult> responseHandler = new JsonResponseHandler<DescribeAssessmentResult>(
                    new DescribeAssessmentResultJsonUnmarshaller());
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
     * @throws AccessDeniedException
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

            JsonResponseHandler<DescribeCrossAccountAccessRoleResult> responseHandler = new JsonResponseHandler<DescribeCrossAccountAccessRoleResult>(
                    new DescribeCrossAccountAccessRoleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the finding specified by the finding ARN.
     * </p>
     * 
     * @param describeFindingRequest
     * @return Result of the DescribeFinding operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeFinding
     */
    @Override
    public DescribeFindingResult describeFinding(
            DescribeFindingRequest describeFindingRequest) {
        ExecutionContext executionContext = createExecutionContext(describeFindingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFindingRequest> request = null;
        Response<DescribeFindingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFindingRequestMarshaller().marshall(super
                        .beforeMarshalling(describeFindingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeFindingResult> responseHandler = new JsonResponseHandler<DescribeFindingResult>(
                    new DescribeFindingResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the resource group specified by the resource group ARN.
     * </p>
     * 
     * @param describeResourceGroupRequest
     * @return Result of the DescribeResourceGroup operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeResourceGroup
     */
    @Override
    public DescribeResourceGroupResult describeResourceGroup(
            DescribeResourceGroupRequest describeResourceGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(describeResourceGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeResourceGroupRequest> request = null;
        Response<DescribeResourceGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeResourceGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeResourceGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeResourceGroupResult> responseHandler = new JsonResponseHandler<DescribeResourceGroupResult>(
                    new DescribeResourceGroupResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the rules package specified by the rules package ARN.
     * </p>
     * 
     * @param describeRulesPackageRequest
     * @return Result of the DescribeRulesPackage operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeRulesPackage
     */
    @Override
    public DescribeRulesPackageResult describeRulesPackage(
            DescribeRulesPackageRequest describeRulesPackageRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRulesPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRulesPackageRequest> request = null;
        Response<DescribeRulesPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRulesPackageRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeRulesPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeRulesPackageResult> responseHandler = new JsonResponseHandler<DescribeRulesPackageResult>(
                    new DescribeRulesPackageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the assessment run specified by the run ARN.
     * </p>
     * 
     * @param describeRunRequest
     * @return Result of the DescribeRun operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DescribeRun
     */
    @Override
    public DescribeRunResult describeRun(DescribeRunRequest describeRunRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRunRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRunRequest> request = null;
        Response<DescribeRunResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRunRequestMarshaller().marshall(super
                        .beforeMarshalling(describeRunRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeRunResult> responseHandler = new JsonResponseHandler<DescribeRunResult>(
                    new DescribeRunResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Detaches the rules package specified by the rules package ARN from the
     * assessment specified by the assessment ARN.
     * </p>
     * 
     * @param detachAssessmentAndRulesPackageRequest
     * @return Result of the DetachAssessmentAndRulesPackage operation returned
     *         by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.DetachAssessmentAndRulesPackage
     */
    @Override
    public DetachAssessmentAndRulesPackageResult detachAssessmentAndRulesPackage(
            DetachAssessmentAndRulesPackageRequest detachAssessmentAndRulesPackageRequest) {
        ExecutionContext executionContext = createExecutionContext(detachAssessmentAndRulesPackageRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DetachAssessmentAndRulesPackageRequest> request = null;
        Response<DetachAssessmentAndRulesPackageResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DetachAssessmentAndRulesPackageRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(detachAssessmentAndRulesPackageRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DetachAssessmentAndRulesPackageResult> responseHandler = new JsonResponseHandler<DetachAssessmentAndRulesPackageResult>(
                    new DetachAssessmentAndRulesPackageResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the metadata about the telemetry (application behavioral data)
     * for the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param getAssessmentTelemetryRequest
     * @return Result of the GetAssessmentTelemetry operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.GetAssessmentTelemetry
     */
    @Override
    public GetAssessmentTelemetryResult getAssessmentTelemetry(
            GetAssessmentTelemetryRequest getAssessmentTelemetryRequest) {
        ExecutionContext executionContext = createExecutionContext(getAssessmentTelemetryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAssessmentTelemetryRequest> request = null;
        Response<GetAssessmentTelemetryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAssessmentTelemetryRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getAssessmentTelemetryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetAssessmentTelemetryResult> responseHandler = new JsonResponseHandler<GetAssessmentTelemetryResult>(
                    new GetAssessmentTelemetryResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the ARNs of the applications within this AWS account. For more
     * information about applications, see <a href=
     * "https://docs.aws.amazon.com/inspector/latest/userguide//inspector_applications.html"
     * >Inspector Applications</a>.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @sample AmazonInspector.ListApplications
     */
    @Override
    public ListApplicationsResult listApplications(
            ListApplicationsRequest listApplicationsRequest) {
        ExecutionContext executionContext = createExecutionContext(listApplicationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListApplicationsRequest> request = null;
        Response<ListApplicationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListApplicationsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listApplicationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListApplicationsResult> responseHandler = new JsonResponseHandler<ListApplicationsResult>(
                    new ListApplicationsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the agents of the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param listAssessmentAgentsRequest
     * @return Result of the ListAssessmentAgents operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAssessmentAgents
     */
    @Override
    public ListAssessmentAgentsResult listAssessmentAgents(
            ListAssessmentAgentsRequest listAssessmentAgentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentAgentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentAgentsRequest> request = null;
        Response<ListAssessmentAgentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentAgentsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAssessmentAgentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAssessmentAgentsResult> responseHandler = new JsonResponseHandler<ListAssessmentAgentsResult>(
                    new ListAssessmentAgentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessments corresponding to applications specified by the
     * applications' ARNs.
     * </p>
     * 
     * @param listAssessmentsRequest
     * @return Result of the ListAssessments operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAssessments
     */
    @Override
    public ListAssessmentsResult listAssessments(
            ListAssessmentsRequest listAssessmentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAssessmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAssessmentsRequest> request = null;
        Response<ListAssessmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAssessmentsRequestMarshaller().marshall(super
                        .beforeMarshalling(listAssessmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAssessmentsResult> responseHandler = new JsonResponseHandler<ListAssessmentsResult>(
                    new ListAssessmentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessments attached to the rules package specified by the
     * rules package ARN.
     * </p>
     * 
     * @param listAttachedAssessmentsRequest
     * @return Result of the ListAttachedAssessments operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAttachedAssessments
     */
    @Override
    public ListAttachedAssessmentsResult listAttachedAssessments(
            ListAttachedAssessmentsRequest listAttachedAssessmentsRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedAssessmentsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedAssessmentsRequest> request = null;
        Response<ListAttachedAssessmentsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedAssessmentsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAttachedAssessmentsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAttachedAssessmentsResult> responseHandler = new JsonResponseHandler<ListAttachedAssessmentsResult>(
                    new ListAttachedAssessmentsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the rules packages attached to the assessment specified by the
     * assessment ARN.
     * </p>
     * 
     * @param listAttachedRulesPackagesRequest
     * @return Result of the ListAttachedRulesPackages operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListAttachedRulesPackages
     */
    @Override
    public ListAttachedRulesPackagesResult listAttachedRulesPackages(
            ListAttachedRulesPackagesRequest listAttachedRulesPackagesRequest) {
        ExecutionContext executionContext = createExecutionContext(listAttachedRulesPackagesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListAttachedRulesPackagesRequest> request = null;
        Response<ListAttachedRulesPackagesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListAttachedRulesPackagesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listAttachedRulesPackagesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListAttachedRulesPackagesResult> responseHandler = new JsonResponseHandler<ListAttachedRulesPackagesResult>(
                    new ListAttachedRulesPackagesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists findings generated by the assessment run specified by the run ARNs.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
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

            JsonResponseHandler<ListFindingsResult> responseHandler = new JsonResponseHandler<ListFindingsResult>(
                    new ListFindingsResultJsonUnmarshaller());
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
     * @throws InvalidInputException
     * @throws AccessDeniedException
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

            JsonResponseHandler<ListRulesPackagesResult> responseHandler = new JsonResponseHandler<ListRulesPackagesResult>(
                    new ListRulesPackagesResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the assessment runs associated with the assessments specified by
     * the assessment ARNs.
     * </p>
     * 
     * @param listRunsRequest
     * @return Result of the ListRuns operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.ListRuns
     */
    @Override
    public ListRunsResult listRuns(ListRunsRequest listRunsRequest) {
        ExecutionContext executionContext = createExecutionContext(listRunsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRunsRequest> request = null;
        Response<ListRunsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRunsRequestMarshaller().marshall(super
                        .beforeMarshalling(listRunsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListRunsResult> responseHandler = new JsonResponseHandler<ListRunsResult>(
                    new ListRunsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists all tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
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

            JsonResponseHandler<ListTagsForResourceResult> responseHandler = new JsonResponseHandler<ListTagsForResourceResult>(
                    new ListTagsForResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Translates a textual identifier into a user-readable text in a specified
     * locale.
     * </p>
     * 
     * @param localizeTextRequest
     * @return Result of the LocalizeText operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.LocalizeText
     */
    @Override
    public LocalizeTextResult localizeText(
            LocalizeTextRequest localizeTextRequest) {
        ExecutionContext executionContext = createExecutionContext(localizeTextRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LocalizeTextRequest> request = null;
        Response<LocalizeTextResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LocalizeTextRequestMarshaller().marshall(super
                        .beforeMarshalling(localizeTextRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<LocalizeTextResult> responseHandler = new JsonResponseHandler<LocalizeTextResult>(
                    new LocalizeTextResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Previews the agents installed on the EC2 instances that are included in
     * the application created with the specified resource group.
     * </p>
     * 
     * @param previewAgentsForResourceGroupRequest
     * @return Result of the PreviewAgentsForResourceGroup operation returned by
     *         the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @throws InvalidCrossAccountRoleException
     * @sample AmazonInspector.PreviewAgentsForResourceGroup
     */
    @Override
    public PreviewAgentsForResourceGroupResult previewAgentsForResourceGroup(
            PreviewAgentsForResourceGroupRequest previewAgentsForResourceGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(previewAgentsForResourceGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PreviewAgentsForResourceGroupRequest> request = null;
        Response<PreviewAgentsForResourceGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PreviewAgentsForResourceGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(previewAgentsForResourceGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PreviewAgentsForResourceGroupResult> responseHandler = new JsonResponseHandler<PreviewAgentsForResourceGroupResult>(
                    new PreviewAgentsForResourceGroupResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Register the role that Inspector uses to list your EC2 instances during
     * the assessment.
     * </p>
     * 
     * @param registerCrossAccountAccessRoleRequest
     * @return Result of the RegisterCrossAccountAccessRole operation returned
     *         by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws InvalidCrossAccountRoleException
     * @sample AmazonInspector.RegisterCrossAccountAccessRole
     */
    @Override
    public RegisterCrossAccountAccessRoleResult registerCrossAccountAccessRole(
            RegisterCrossAccountAccessRoleRequest registerCrossAccountAccessRoleRequest) {
        ExecutionContext executionContext = createExecutionContext(registerCrossAccountAccessRoleRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterCrossAccountAccessRoleRequest> request = null;
        Response<RegisterCrossAccountAccessRoleResult> response = null;

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

            JsonResponseHandler<RegisterCrossAccountAccessRoleResult> responseHandler = new JsonResponseHandler<RegisterCrossAccountAccessRoleResult>(
                    new RegisterCrossAccountAccessRoleResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the entire attribute (key and value pair) from the findings
     * specified by the finding ARNs where an attribute with the specified key
     * exists.
     * </p>
     * 
     * @param removeAttributesFromFindingsRequest
     * @return Result of the RemoveAttributesFromFindings operation returned by
     *         the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
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

            JsonResponseHandler<RemoveAttributesFromFindingsResult> responseHandler = new JsonResponseHandler<RemoveAttributesFromFindingsResult>(
                    new RemoveAttributesFromFindingsResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts the analysis of the application’s behavior against selected rule
     * packages for the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param runAssessmentRequest
     * @return Result of the RunAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.RunAssessment
     */
    @Override
    public RunAssessmentResult runAssessment(
            RunAssessmentRequest runAssessmentRequest) {
        ExecutionContext executionContext = createExecutionContext(runAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RunAssessmentRequest> request = null;
        Response<RunAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RunAssessmentRequestMarshaller().marshall(super
                        .beforeMarshalling(runAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RunAssessmentResult> responseHandler = new JsonResponseHandler<RunAssessmentResult>(
                    new RunAssessmentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Sets tags (key and value pairs) to the assessment specified by the
     * assessment ARN.
     * </p>
     * 
     * @param setTagsForResourceRequest
     * @return Result of the SetTagsForResource operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.SetTagsForResource
     */
    @Override
    public SetTagsForResourceResult setTagsForResource(
            SetTagsForResourceRequest setTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(setTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTagsForResourceRequest> request = null;
        Response<SetTagsForResourceResult> response = null;

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

            JsonResponseHandler<SetTagsForResourceResult> responseHandler = new JsonResponseHandler<SetTagsForResourceResult>(
                    new SetTagsForResourceResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Starts data collection for the assessment specified by the assessment
     * ARN. For this API to function properly, you must not exceed the limit of
     * running up to 500 concurrent agents per AWS account.
     * </p>
     * 
     * @param startDataCollectionRequest
     * @return Result of the StartDataCollection operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @throws InvalidCrossAccountRoleException
     * @sample AmazonInspector.StartDataCollection
     */
    @Override
    public StartDataCollectionResult startDataCollection(
            StartDataCollectionRequest startDataCollectionRequest) {
        ExecutionContext executionContext = createExecutionContext(startDataCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartDataCollectionRequest> request = null;
        Response<StartDataCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartDataCollectionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(startDataCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StartDataCollectionResult> responseHandler = new JsonResponseHandler<StartDataCollectionResult>(
                    new StartDataCollectionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stop data collection for the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param stopDataCollectionRequest
     * @return Result of the StopDataCollection operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.StopDataCollection
     */
    @Override
    public StopDataCollectionResult stopDataCollection(
            StopDataCollectionRequest stopDataCollectionRequest) {
        ExecutionContext executionContext = createExecutionContext(stopDataCollectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopDataCollectionRequest> request = null;
        Response<StopDataCollectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopDataCollectionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(stopDataCollectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StopDataCollectionResult> responseHandler = new JsonResponseHandler<StopDataCollectionResult>(
                    new StopDataCollectionResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates application specified by the application ARN.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the
     *         service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.UpdateApplication
     */
    @Override
    public UpdateApplicationResult updateApplication(
            UpdateApplicationRequest updateApplicationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateApplicationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateApplicationRequest> request = null;
        Response<UpdateApplicationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateApplicationRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateApplicationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateApplicationResult> responseHandler = new JsonResponseHandler<UpdateApplicationResult>(
                    new UpdateApplicationResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the assessment specified by the assessment ARN.
     * </p>
     * 
     * @param updateAssessmentRequest
     * @return Result of the UpdateAssessment operation returned by the service.
     * @throws InternalException
     * @throws InvalidInputException
     * @throws AccessDeniedException
     * @throws NoSuchEntityException
     * @sample AmazonInspector.UpdateAssessment
     */
    @Override
    public UpdateAssessmentResult updateAssessment(
            UpdateAssessmentRequest updateAssessmentRequest) {
        ExecutionContext executionContext = createExecutionContext(updateAssessmentRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateAssessmentRequest> request = null;
        Response<UpdateAssessmentResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateAssessmentRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateAssessmentRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateAssessmentResult> responseHandler = new JsonResponseHandler<UpdateAssessmentResult>(
                    new UpdateAssessmentResultJsonUnmarshaller());
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

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

        JsonErrorResponseHandlerV2 errorResponseHandler = new JsonErrorResponseHandlerV2(
                jsonErrorUnmarshallers);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
