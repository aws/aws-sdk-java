/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.personalize;

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

import com.amazonaws.services.personalize.AmazonPersonalizeClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.services.personalize.model.transform.*;

/**
 * Client for accessing Amazon Personalize. All service calls made using this client are blocking, and will not return
 * until the service call completes.
 * <p>
 * <p>
 * Amazon Personalize is a machine learning service that makes it easy to add individualized recommendations to
 * customers.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonPersonalizeClient extends AmazonWebServiceClient implements AmazonPersonalize {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonPersonalize.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "personalize";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalize.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalize.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalize.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalize.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalize.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.personalize.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.personalize.model.AmazonPersonalizeException.class));

    public static AmazonPersonalizeClientBuilder builder() {
        return AmazonPersonalizeClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Personalize using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPersonalizeClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Personalize using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonPersonalizeClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("personalize.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/personalize/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/personalize/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates a batch inference job. The operation can handle up to 50 million records and the input file must be in
     * JSON format. For more information, see <a>recommendations-batch</a>.
     * </p>
     * 
     * @param createBatchInferenceJobRequest
     * @return Result of the CreateBatchInferenceJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.CreateBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateBatchInferenceJobResult createBatchInferenceJob(CreateBatchInferenceJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateBatchInferenceJob(request);
    }

    @SdkInternalApi
    final CreateBatchInferenceJobResult executeCreateBatchInferenceJob(CreateBatchInferenceJobRequest createBatchInferenceJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createBatchInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBatchInferenceJobRequest> request = null;
        Response<CreateBatchInferenceJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBatchInferenceJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createBatchInferenceJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateBatchInferenceJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateBatchInferenceJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateBatchInferenceJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a campaign by deploying a solution version. When a client calls the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * and <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetPersonalizedRanking.html">
     * GetPersonalizedRanking</a> APIs, a campaign is specified in the request.
     * </p>
     * <p>
     * <b>Minimum Provisioned TPS and Auto-Scaling</b>
     * </p>
     * <p>
     * A transaction is a single <code>GetRecommendations</code> or <code>GetPersonalizedRanking</code> call.
     * Transactions per second (TPS) is the throughput and unit of billing for Amazon Personalize. The minimum
     * provisioned TPS (<code>minProvisionedTPS</code>) specifies the baseline throughput provisioned by Amazon
     * Personalize, and thus, the minimum billing charge. If your TPS increases beyond <code>minProvisionedTPS</code>,
     * Amazon Personalize auto-scales the provisioned capacity up and down, but never below
     * <code>minProvisionedTPS</code>, to maintain a 70% utilization. There's a short time delay while the capacity is
     * increased that might cause loss of transactions. It's recommended to start with a low
     * <code>minProvisionedTPS</code>, track your usage using Amazon CloudWatch metrics, and then increase the
     * <code>minProvisionedTPS</code> as necessary.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the campaign status, call <a>DescribeCampaign</a>.
     * </p>
     * <note>
     * <p>
     * Wait until the <code>status</code> of the campaign is <code>ACTIVE</code> before asking the campaign for
     * recommendations.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListCampaigns</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateCampaign</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteCampaign</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createCampaignRequest
     * @return Result of the CreateCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.CreateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateCampaignResult createCampaign(CreateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeCreateCampaign(request);
    }

    @SdkInternalApi
    final CreateCampaignResult executeCreateCampaign(CreateCampaignRequest createCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(createCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateCampaignRequest> request = null;
        Response<CreateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty dataset and adds it to the specified dataset group. Use <a>CreateDatasetImportJob</a> to import
     * your training data to a dataset.
     * </p>
     * <p>
     * There are three types of datasets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each dataset type has an associated schema with required field types. Only the <code>Interactions</code> dataset
     * is required in order to train a model (also referred to as creating a solution).
     * </p>
     * <p>
     * A dataset can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset, call <a>DescribeDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListDatasets</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDataset</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateDatasetResult createDataset(CreateDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDataset(request);
    }

    @SdkInternalApi
    final CreateDatasetResult executeCreateDataset(CreateDatasetRequest createDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetRequest> request = null;
        Response<CreateDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an empty dataset group. A dataset group contains related datasets that supply data for training a model.
     * A dataset group can contain at most three datasets, one for each type of dataset:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Interactions
     * </p>
     * </li>
     * <li>
     * <p>
     * Items
     * </p>
     * </li>
     * <li>
     * <p>
     * Users
     * </p>
     * </li>
     * </ul>
     * <p>
     * To train a model (create a solution), a dataset group that contains an <code>Interactions</code> dataset is
     * required. Call <a>CreateDataset</a> to add a dataset to the group.
     * </p>
     * <p>
     * A dataset group can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the dataset group, call <a>DescribeDatasetGroup</a>. If the status shows as CREATE FAILED,
     * the response includes a <code>failureReason</code> key, which describes why the creation failed.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the dataset group is <code>ACTIVE</code> before adding a dataset
     * to the group.
     * </p>
     * </note>
     * <p>
     * You can specify an AWS Key Management Service (KMS) key to encrypt the datasets in the group. If you specify a
     * KMS key, you must also include an AWS Identity and Access Management (IAM) role that has permission to access the
     * key.
     * </p>
     * <p class="title">
     * <b>APIs that require a dataset group ARN in the request</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>CreateDataset</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * </ul>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetGroups</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetGroup</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteDatasetGroup</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetGroupRequest
     * @return Result of the CreateDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonPersonalize.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateDatasetGroupResult createDatasetGroup(CreateDatasetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatasetGroup(request);
    }

    @SdkInternalApi
    final CreateDatasetGroupResult executeCreateDatasetGroup(CreateDatasetGroupRequest createDatasetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetGroupRequest> request = null;
        Response<CreateDatasetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatasetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateDatasetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a job that imports training data from your data source (an Amazon S3 bucket) to an Amazon Personalize
     * dataset. To allow Amazon Personalize to import the training data, you must specify an AWS Identity and Access
     * Management (IAM) role that has permission to read from the data source.
     * </p>
     * <important>
     * <p>
     * The dataset import job replaces any previous data in the dataset.
     * </p>
     * </important>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A dataset import job can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the import job, call <a>DescribeDatasetImportJob</a>, providing the Amazon Resource Name
     * (ARN) of the dataset import job. The dataset import is complete when the status shows as ACTIVE. If the status
     * shows as CREATE FAILED, the response includes a <code>failureReason</code> key, which describes why the job
     * failed.
     * </p>
     * <note>
     * <p>
     * Importing takes time. You must wait until the status shows as ACTIVE before training a model using the dataset.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListDatasetImportJobs</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeDatasetImportJob</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createDatasetImportJobRequest
     * @return Result of the CreateDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateDatasetImportJobResult createDatasetImportJob(CreateDatasetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateDatasetImportJob(request);
    }

    @SdkInternalApi
    final CreateDatasetImportJobResult executeCreateDatasetImportJob(CreateDatasetImportJobRequest createDatasetImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createDatasetImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDatasetImportJobRequest> request = null;
        Response<CreateDatasetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDatasetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createDatasetImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateDatasetImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateDatasetImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateDatasetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an event tracker that you use when sending event data to the specified dataset group using the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_UBS_PutEvents.html">PutEvents</a> API.
     * </p>
     * <p>
     * When Amazon Personalize creates an event tracker, it also creates an <i>event-interactions</i> dataset in the
     * dataset group associated with the event tracker. The event-interactions dataset stores the event data from the
     * <code>PutEvents</code> call. The contents of this dataset are not available to the user.
     * </p>
     * <note>
     * <p>
     * Only one event tracker can be associated with a dataset group. You will get an error if you call
     * <code>CreateEventTracker</code> using the same dataset group as an existing event tracker.
     * </p>
     * </note>
     * <p>
     * When you send event data you include your tracking ID. The tracking ID identifies the customer and authorizes the
     * customer to send the data.
     * </p>
     * <p>
     * The event tracker can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the event tracker, call <a>DescribeEventTracker</a>.
     * </p>
     * <note>
     * <p>
     * The event tracker must be in the ACTIVE state before using the tracking ID.
     * </p>
     * </note>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListEventTrackers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeEventTracker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteEventTracker</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createEventTrackerRequest
     * @return Result of the CreateEventTracker operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.CreateEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateEventTrackerResult createEventTracker(CreateEventTrackerRequest request) {
        request = beforeClientExecution(request);
        return executeCreateEventTracker(request);
    }

    @SdkInternalApi
    final CreateEventTrackerResult executeCreateEventTracker(CreateEventTrackerRequest createEventTrackerRequest) {

        ExecutionContext executionContext = createExecutionContext(createEventTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEventTrackerRequest> request = null;
        Response<CreateEventTrackerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEventTrackerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createEventTrackerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateEventTracker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateEventTrackerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateEventTrackerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Personalize schema from the specified schema string. The schema you create must be in Avro JSON
     * format.
     * </p>
     * <p>
     * Amazon Personalize recognizes three schema variants. Each schema is associated with a dataset type and has a set
     * of required field and keywords. You specify a schema when you call <a>CreateDataset</a>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSchemas</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSchema</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSchema</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSchemaRequest
     * @return Result of the CreateSchema operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonPersonalize.CreateSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSchemaResult createSchema(CreateSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSchema(request);
    }

    @SdkInternalApi
    final CreateSchemaResult executeCreateSchema(CreateSchemaRequest createSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(createSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSchemaRequest> request = null;
        Response<CreateSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the configuration for training a model. A trained model is known as a solution. After the configuration
     * is created, you train the model (create a solution) by calling the <a>CreateSolutionVersion</a> operation. Every
     * time you call <code>CreateSolutionVersion</code>, a new version of the solution is created.
     * </p>
     * <p>
     * After creating a solution version, you check its accuracy by calling <a>GetSolutionMetrics</a>. When you are
     * satisfied with the version, you deploy it using <a>CreateCampaign</a>. The campaign provides recommendations to a
     * client through the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * API.
     * </p>
     * <p>
     * To train a model, Amazon Personalize requires training data and a recipe. The training data comes from the
     * dataset group that you provide in the request. A recipe specifies the training algorithm and a feature
     * transformation. You can specify one of the predefined recipes provided by Amazon Personalize. Alternatively, you
     * can specify <code>performAutoML</code> and Amazon Personalize will analyze your data and select the optimum
     * USER_PERSONALIZATION recipe for you.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the solution, call <a>DescribeSolution</a>. Wait until the status shows as ACTIVE before
     * calling <code>CreateSolutionVersion</code>.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolutionVersion</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionRequest
     * @return Result of the CreateSolution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceAlreadyExistsException
     *         The specified resource already exists.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.CreateSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateSolutionResult createSolution(CreateSolutionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSolution(request);
    }

    @SdkInternalApi
    final CreateSolutionResult executeCreateSolution(CreateSolutionRequest createSolutionRequest) {

        ExecutionContext executionContext = createExecutionContext(createSolutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSolutionRequest> request = null;
        Response<CreateSolutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSolutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSolutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSolution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSolutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateSolutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Trains or retrains an active solution. A solution is created using the <a>CreateSolution</a> operation and must
     * be in the ACTIVE state before calling <code>CreateSolutionVersion</code>. A new version of the solution is
     * created every time you call this operation.
     * </p>
     * <p>
     * <b>Status</b>
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the status of the version, call <a>DescribeSolutionVersion</a>. Wait until the status shows as ACTIVE
     * before calling <code>CreateCampaign</code>.
     * </p>
     * <p>
     * If the status shows as CREATE FAILED, the response includes a <code>failureReason</code> key, which describes why
     * the job failed.
     * </p>
     * <p class="title">
     * <b>Related APIs</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutionVersions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolutionVersion</a>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * <a>ListSolutions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>CreateSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeSolution</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DeleteSolution</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSolutionVersionRequest
     * @return Result of the CreateSolutionVersion operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.CreateSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateSolutionVersionResult createSolutionVersion(CreateSolutionVersionRequest request) {
        request = beforeClientExecution(request);
        return executeCreateSolutionVersion(request);
    }

    @SdkInternalApi
    final CreateSolutionVersionResult executeCreateSolutionVersion(CreateSolutionVersionRequest createSolutionVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(createSolutionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSolutionVersionRequest> request = null;
        Response<CreateSolutionVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSolutionVersionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createSolutionVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateSolutionVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateSolutionVersionResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new CreateSolutionVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes a campaign by deleting the solution deployment. The solution that the campaign is based on is not deleted
     * and can be redeployed when needed. A deleted campaign can no longer be specified in a <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * request. For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param deleteCampaignRequest
     * @return Result of the DeleteCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteCampaignResult deleteCampaign(DeleteCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteCampaign(request);
    }

    @SdkInternalApi
    final DeleteCampaignResult executeDeleteCampaign(DeleteCampaignRequest deleteCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteCampaignRequest> request = null;
        Response<DeleteCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dataset. You can't delete a dataset if an associated <code>DatasetImportJob</code> or
     * <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on datasets, see
     * <a>CreateDataset</a>.
     * </p>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteDatasetResult deleteDataset(DeleteDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDataset(request);
    }

    @SdkInternalApi
    final DeleteDatasetResult executeDeleteDataset(DeleteDatasetRequest deleteDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetRequest> request = null;
        Response<DeleteDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a dataset group. Before you delete a dataset group, you must delete the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * All associated event trackers.
     * </p>
     * </li>
     * <li>
     * <p>
     * All associated solutions.
     * </p>
     * </li>
     * <li>
     * <p>
     * All datasets in the dataset group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteDatasetGroupRequest
     * @return Result of the DeleteDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteDatasetGroupResult deleteDatasetGroup(DeleteDatasetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatasetGroup(request);
    }

    @SdkInternalApi
    final DeleteDatasetGroupResult executeDeleteDatasetGroup(DeleteDatasetGroupRequest deleteDatasetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetGroupRequest> request = null;
        Response<DeleteDatasetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatasetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteDatasetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the event tracker. Does not delete the event-interactions dataset from the associated dataset group. For
     * more information on event trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param deleteEventTrackerRequest
     * @return Result of the DeleteEventTracker operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteEventTracker" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteEventTrackerResult deleteEventTracker(DeleteEventTrackerRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteEventTracker(request);
    }

    @SdkInternalApi
    final DeleteEventTrackerResult executeDeleteEventTracker(DeleteEventTrackerRequest deleteEventTrackerRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteEventTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEventTrackerRequest> request = null;
        Response<DeleteEventTrackerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEventTrackerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteEventTrackerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteEventTracker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteEventTrackerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteEventTrackerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a schema. Before deleting a schema, you must delete all datasets referencing the schema. For more
     * information on schemas, see <a>CreateSchema</a>.
     * </p>
     * 
     * @param deleteSchemaRequest
     * @return Result of the DeleteSchema operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSchemaResult deleteSchema(DeleteSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSchema(request);
    }

    @SdkInternalApi
    final DeleteSchemaResult executeDeleteSchema(DeleteSchemaRequest deleteSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSchemaRequest> request = null;
        Response<DeleteSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes all versions of a solution and the <code>Solution</code> object itself. Before deleting a solution, you
     * must delete all campaigns based on the solution. To determine what campaigns are using the solution, call
     * <a>ListCampaigns</a> and supply the Amazon Resource Name (ARN) of the solution. You can't delete a solution if an
     * associated <code>SolutionVersion</code> is in the CREATE PENDING or IN PROGRESS state. For more information on
     * solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param deleteSolutionRequest
     * @return Result of the DeleteSolution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.DeleteSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DeleteSolution" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteSolutionResult deleteSolution(DeleteSolutionRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteSolution(request);
    }

    @SdkInternalApi
    final DeleteSolutionResult executeDeleteSolution(DeleteSolutionRequest deleteSolutionRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteSolutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSolutionRequest> request = null;
        Response<DeleteSolutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSolutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteSolutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteSolution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteSolutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteSolutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the given algorithm.
     * </p>
     * 
     * @param describeAlgorithmRequest
     * @return Result of the DescribeAlgorithm operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeAlgorithm
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeAlgorithm" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAlgorithmResult describeAlgorithm(DescribeAlgorithmRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAlgorithm(request);
    }

    @SdkInternalApi
    final DescribeAlgorithmResult executeDescribeAlgorithm(DescribeAlgorithmRequest describeAlgorithmRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAlgorithmRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAlgorithmRequest> request = null;
        Response<DescribeAlgorithmResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAlgorithmRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAlgorithmRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAlgorithm");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAlgorithmResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeAlgorithmResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the properties of a batch inference job including name, Amazon Resource Name (ARN), status, input and output
     * configurations, and the ARN of the solution version used to generate the recommendations.
     * </p>
     * 
     * @param describeBatchInferenceJobRequest
     * @return Result of the DescribeBatchInferenceJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeBatchInferenceJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeBatchInferenceJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeBatchInferenceJobResult describeBatchInferenceJob(DescribeBatchInferenceJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeBatchInferenceJob(request);
    }

    @SdkInternalApi
    final DescribeBatchInferenceJobResult executeDescribeBatchInferenceJob(DescribeBatchInferenceJobRequest describeBatchInferenceJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeBatchInferenceJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBatchInferenceJobRequest> request = null;
        Response<DescribeBatchInferenceJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBatchInferenceJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeBatchInferenceJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeBatchInferenceJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeBatchInferenceJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeBatchInferenceJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the given campaign, including its status.
     * </p>
     * <p>
     * A campaign can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the <code>status</code> is <code>CREATE FAILED</code>, the response includes the <code>failureReason</code>
     * key, which describes why.
     * </p>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param describeCampaignRequest
     * @return Result of the DescribeCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeCampaign" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeCampaignResult describeCampaign(DescribeCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeCampaign(request);
    }

    @SdkInternalApi
    final DescribeCampaignResult executeDescribeCampaign(DescribeCampaignRequest describeCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(describeCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeCampaignRequest> request = null;
        Response<DescribeCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeCampaignResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the given dataset. For more information on datasets, see <a>CreateDataset</a>.
     * </p>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDataset" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeDatasetResult describeDataset(DescribeDatasetRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDataset(request);
    }

    @SdkInternalApi
    final DescribeDatasetResult executeDescribeDataset(DescribeDatasetRequest describeDatasetRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatasetRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetRequest> request = null;
        Response<DescribeDatasetResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatasetRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDataset");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatasetResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatasetResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the given dataset group. For more information on dataset groups, see <a>CreateDatasetGroup</a>.
     * </p>
     * 
     * @param describeDatasetGroupRequest
     * @return Result of the DescribeDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetGroup"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDatasetGroupResult describeDatasetGroup(DescribeDatasetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDatasetGroup(request);
    }

    @SdkInternalApi
    final DescribeDatasetGroupResult executeDescribeDatasetGroup(DescribeDatasetGroupRequest describeDatasetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatasetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetGroupRequest> request = null;
        Response<DescribeDatasetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeDatasetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDatasetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatasetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeDatasetGroupResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the dataset import job created by <a>CreateDatasetImportJob</a>, including the import job status.
     * </p>
     * 
     * @param describeDatasetImportJobRequest
     * @return Result of the DescribeDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeDatasetImportJobResult describeDatasetImportJob(DescribeDatasetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeDatasetImportJob(request);
    }

    @SdkInternalApi
    final DescribeDatasetImportJobResult executeDescribeDatasetImportJob(DescribeDatasetImportJobRequest describeDatasetImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeDatasetImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDatasetImportJobRequest> request = null;
        Response<DescribeDatasetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDatasetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeDatasetImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeDatasetImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeDatasetImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeDatasetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an event tracker. The response includes the <code>trackingId</code> and <code>status</code> of the
     * event tracker. For more information on event trackers, see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param describeEventTrackerRequest
     * @return Result of the DescribeEventTracker operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeEventTracker
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeEventTracker"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeEventTrackerResult describeEventTracker(DescribeEventTrackerRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeEventTracker(request);
    }

    @SdkInternalApi
    final DescribeEventTrackerResult executeDescribeEventTracker(DescribeEventTrackerRequest describeEventTrackerRequest) {

        ExecutionContext executionContext = createExecutionContext(describeEventTrackerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventTrackerRequest> request = null;
        Response<DescribeEventTrackerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventTrackerRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeEventTrackerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeEventTracker");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeEventTrackerResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeEventTrackerResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the given feature transformation.
     * </p>
     * 
     * @param describeFeatureTransformationRequest
     * @return Result of the DescribeFeatureTransformation operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeFeatureTransformation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeFeatureTransformation"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeFeatureTransformationResult describeFeatureTransformation(DescribeFeatureTransformationRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeFeatureTransformation(request);
    }

    @SdkInternalApi
    final DescribeFeatureTransformationResult executeDescribeFeatureTransformation(DescribeFeatureTransformationRequest describeFeatureTransformationRequest) {

        ExecutionContext executionContext = createExecutionContext(describeFeatureTransformationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeFeatureTransformationRequest> request = null;
        Response<DescribeFeatureTransformationResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeFeatureTransformationRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeFeatureTransformationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeFeatureTransformation");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeFeatureTransformationResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeFeatureTransformationResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a recipe.
     * </p>
     * <p>
     * A recipe contains three items:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An algorithm that trains a model.
     * </p>
     * </li>
     * <li>
     * <p>
     * Hyperparameters that govern the training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Feature transformation information for modifying the input data before training.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon Personalize provides a set of predefined recipes. You specify a recipe when you create a solution with the
     * <a>CreateSolution</a> API. <code>CreateSolution</code> trains a model by using the algorithm in the specified
     * recipe and a training dataset. The solution, when deployed as a campaign, can provide recommendations using the
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
     * API.
     * </p>
     * 
     * @param describeRecipeRequest
     * @return Result of the DescribeRecipe operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeRecipe
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecipe" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeRecipeResult describeRecipe(DescribeRecipeRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeRecipe(request);
    }

    @SdkInternalApi
    final DescribeRecipeResult executeDescribeRecipe(DescribeRecipeRequest describeRecipeRequest) {

        ExecutionContext executionContext = createExecutionContext(describeRecipeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRecipeRequest> request = null;
        Response<DescribeRecipeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRecipeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeRecipeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeRecipe");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeRecipeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeRecipeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a schema. For more information on schemas, see <a>CreateSchema</a>.
     * </p>
     * 
     * @param describeSchemaRequest
     * @return Result of the DescribeSchema operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSchema" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeSchemaResult describeSchema(DescribeSchemaRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSchema(request);
    }

    @SdkInternalApi
    final DescribeSchemaResult executeDescribeSchema(DescribeSchemaRequest describeSchemaRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSchemaRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchemaRequest> request = null;
        Response<DescribeSchemaResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchemaRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSchemaRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSchema");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSchemaResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSchemaResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a solution. For more information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionRequest
     * @return Result of the DescribeSolution operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeSolution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolution" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeSolutionResult describeSolution(DescribeSolutionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSolution(request);
    }

    @SdkInternalApi
    final DescribeSolutionResult executeDescribeSolution(DescribeSolutionRequest describeSolutionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSolutionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSolutionRequest> request = null;
        Response<DescribeSolutionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSolutionRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeSolutionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSolution");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSolutionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeSolutionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a specific version of a solution. For more information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param describeSolutionVersionRequest
     * @return Result of the DescribeSolutionVersion operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @sample AmazonPersonalize.DescribeSolutionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeSolutionVersion"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeSolutionVersionResult describeSolutionVersion(DescribeSolutionVersionRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeSolutionVersion(request);
    }

    @SdkInternalApi
    final DescribeSolutionVersionResult executeDescribeSolutionVersion(DescribeSolutionVersionRequest describeSolutionVersionRequest) {

        ExecutionContext executionContext = createExecutionContext(describeSolutionVersionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSolutionVersionRequest> request = null;
        Response<DescribeSolutionVersionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSolutionVersionRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeSolutionVersionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeSolutionVersion");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeSolutionVersionResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeSolutionVersionResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the metrics for the specified solution version.
     * </p>
     * 
     * @param getSolutionMetricsRequest
     * @return Result of the GetSolutionMetrics operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.GetSolutionMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/GetSolutionMetrics" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetSolutionMetricsResult getSolutionMetrics(GetSolutionMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeGetSolutionMetrics(request);
    }

    @SdkInternalApi
    final GetSolutionMetricsResult executeGetSolutionMetrics(GetSolutionMetricsRequest getSolutionMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(getSolutionMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSolutionMetricsRequest> request = null;
        Response<GetSolutionMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSolutionMetricsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getSolutionMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetSolutionMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetSolutionMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetSolutionMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets a list of the batch inference jobs that have been performed off of a solution version.
     * </p>
     * 
     * @param listBatchInferenceJobsRequest
     * @return Result of the ListBatchInferenceJobs operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListBatchInferenceJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListBatchInferenceJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListBatchInferenceJobsResult listBatchInferenceJobs(ListBatchInferenceJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListBatchInferenceJobs(request);
    }

    @SdkInternalApi
    final ListBatchInferenceJobsResult executeListBatchInferenceJobs(ListBatchInferenceJobsRequest listBatchInferenceJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listBatchInferenceJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListBatchInferenceJobsRequest> request = null;
        Response<ListBatchInferenceJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListBatchInferenceJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listBatchInferenceJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListBatchInferenceJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListBatchInferenceJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListBatchInferenceJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of campaigns that use the given solution. When a solution is not specified, all the campaigns
     * associated with the account are listed. The response provides the properties for each campaign, including the
     * Amazon Resource Name (ARN). For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param listCampaignsRequest
     * @return Result of the ListCampaigns operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListCampaigns
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListCampaigns" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListCampaignsResult listCampaigns(ListCampaignsRequest request) {
        request = beforeClientExecution(request);
        return executeListCampaigns(request);
    }

    @SdkInternalApi
    final ListCampaignsResult executeListCampaigns(ListCampaignsRequest listCampaignsRequest) {

        ExecutionContext executionContext = createExecutionContext(listCampaignsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListCampaignsRequest> request = null;
        Response<ListCampaignsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListCampaignsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listCampaignsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListCampaigns");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListCampaignsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListCampaignsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of dataset groups. The response provides the properties for each dataset group, including the
     * Amazon Resource Name (ARN). For more information on dataset groups, see <a>CreateDatasetGroup</a>.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @return Result of the ListDatasetGroups operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListDatasetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetGroups" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasetGroups(request);
    }

    @SdkInternalApi
    final ListDatasetGroupsResult executeListDatasetGroups(ListDatasetGroupsRequest listDatasetGroupsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetGroupsRequest> request = null;
        Response<ListDatasetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetGroupsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasetGroups");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetGroupsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetGroupsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of dataset import jobs that use the given dataset. When a dataset is not specified, all the
     * dataset import jobs associated with the account are listed. The response provides the properties for each dataset
     * import job, including the Amazon Resource Name (ARN). For more information on dataset import jobs, see
     * <a>CreateDatasetImportJob</a>. For more information on datasets, see <a>CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetImportJobsRequest
     * @return Result of the ListDatasetImportJobs operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasetImportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListDatasetImportJobsResult listDatasetImportJobs(ListDatasetImportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasetImportJobs(request);
    }

    @SdkInternalApi
    final ListDatasetImportJobsResult executeListDatasetImportJobs(ListDatasetImportJobsRequest listDatasetImportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetImportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetImportJobsRequest> request = null;
        Response<ListDatasetImportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetImportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetImportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasetImportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetImportJobsResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new ListDatasetImportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of datasets contained in the given dataset group. The response provides the properties for each
     * dataset, including the Amazon Resource Name (ARN). For more information on datasets, see <a>CreateDataset</a>.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListDatasetsResult listDatasets(ListDatasetsRequest request) {
        request = beforeClientExecution(request);
        return executeListDatasets(request);
    }

    @SdkInternalApi
    final ListDatasetsResult executeListDatasets(ListDatasetsRequest listDatasetsRequest) {

        ExecutionContext executionContext = createExecutionContext(listDatasetsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListDatasetsRequest> request = null;
        Response<ListDatasetsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListDatasetsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listDatasetsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListDatasets");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListDatasetsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListDatasetsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of event trackers associated with the account. The response provides the properties for each
     * event tracker, including the Amazon Resource Name (ARN) and tracking ID. For more information on event trackers,
     * see <a>CreateEventTracker</a>.
     * </p>
     * 
     * @param listEventTrackersRequest
     * @return Result of the ListEventTrackers operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListEventTrackers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListEventTrackers" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListEventTrackersResult listEventTrackers(ListEventTrackersRequest request) {
        request = beforeClientExecution(request);
        return executeListEventTrackers(request);
    }

    @SdkInternalApi
    final ListEventTrackersResult executeListEventTrackers(ListEventTrackersRequest listEventTrackersRequest) {

        ExecutionContext executionContext = createExecutionContext(listEventTrackersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListEventTrackersRequest> request = null;
        Response<ListEventTrackersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListEventTrackersRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listEventTrackersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListEventTrackers");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListEventTrackersResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListEventTrackersResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of available recipes. The response provides the properties for each recipe, including the recipe's
     * Amazon Resource Name (ARN).
     * </p>
     * 
     * @param listRecipesRequest
     * @return Result of the ListRecipes operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListRecipes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecipes" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListRecipesResult listRecipes(ListRecipesRequest request) {
        request = beforeClientExecution(request);
        return executeListRecipes(request);
    }

    @SdkInternalApi
    final ListRecipesResult executeListRecipes(ListRecipesRequest listRecipesRequest) {

        ExecutionContext executionContext = createExecutionContext(listRecipesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListRecipesRequest> request = null;
        Response<ListRecipesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListRecipesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listRecipesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListRecipes");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListRecipesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListRecipesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns the list of schemas associated with the account. The response provides the properties for each schema,
     * including the Amazon Resource Name (ARN). For more information on schemas, see <a>CreateSchema</a>.
     * </p>
     * 
     * @param listSchemasRequest
     * @return Result of the ListSchemas operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListSchemas
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSchemas" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSchemasResult listSchemas(ListSchemasRequest request) {
        request = beforeClientExecution(request);
        return executeListSchemas(request);
    }

    @SdkInternalApi
    final ListSchemasResult executeListSchemas(ListSchemasRequest listSchemasRequest) {

        ExecutionContext executionContext = createExecutionContext(listSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSchemasRequest> request = null;
        Response<ListSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSchemasRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSchemas");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSchemasResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSchemasResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of solution versions for the given solution. When a solution is not specified, all the solution
     * versions associated with the account are listed. The response provides the properties for each solution version,
     * including the Amazon Resource Name (ARN). For more information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionVersionsRequest
     * @return Result of the ListSolutionVersions operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListSolutionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListSolutionVersionsResult listSolutionVersions(ListSolutionVersionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSolutionVersions(request);
    }

    @SdkInternalApi
    final ListSolutionVersionsResult executeListSolutionVersions(ListSolutionVersionsRequest listSolutionVersionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSolutionVersionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolutionVersionsRequest> request = null;
        Response<ListSolutionVersionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolutionVersionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSolutionVersionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSolutionVersions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSolutionVersionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSolutionVersionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of solutions that use the given dataset group. When a dataset group is not specified, all the
     * solutions associated with the account are listed. The response provides the properties for each solution,
     * including the Amazon Resource Name (ARN). For more information on solutions, see <a>CreateSolution</a>.
     * </p>
     * 
     * @param listSolutionsRequest
     * @return Result of the ListSolutions operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws InvalidNextTokenException
     *         The token is not valid.
     * @sample AmazonPersonalize.ListSolutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListSolutions" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListSolutionsResult listSolutions(ListSolutionsRequest request) {
        request = beforeClientExecution(request);
        return executeListSolutions(request);
    }

    @SdkInternalApi
    final ListSolutionsResult executeListSolutions(ListSolutionsRequest listSolutionsRequest) {

        ExecutionContext executionContext = createExecutionContext(listSolutionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListSolutionsRequest> request = null;
        Response<ListSolutionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListSolutionsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listSolutionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListSolutions");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListSolutionsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListSolutionsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a campaign by either deploying a new solution or changing the value of the campaign's
     * <code>minProvisionedTPS</code> parameter.
     * </p>
     * <p>
     * To update a campaign, the campaign status must be ACTIVE or CREATE FAILED. Check the campaign status using the
     * <a>DescribeCampaign</a> API.
     * </p>
     * <note>
     * <p>
     * You must wait until the <code>status</code> of the updated campaign is <code>ACTIVE</code> before asking the
     * campaign for recommendations.
     * </p>
     * </note>
     * <p>
     * For more information on campaigns, see <a>CreateCampaign</a>.
     * </p>
     * 
     * @param updateCampaignRequest
     * @return Result of the UpdateCampaign operation returned by the service.
     * @throws InvalidInputException
     *         Provide a valid value for the field or parameter.
     * @throws ResourceNotFoundException
     *         Could not find the specified resource.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonPersonalize.UpdateCampaign
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/UpdateCampaign" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public UpdateCampaignResult updateCampaign(UpdateCampaignRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateCampaign(request);
    }

    @SdkInternalApi
    final UpdateCampaignResult executeUpdateCampaign(UpdateCampaignRequest updateCampaignRequest) {

        ExecutionContext executionContext = createExecutionContext(updateCampaignRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateCampaignRequest> request = null;
        Response<UpdateCampaignResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateCampaignRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateCampaignRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "Personalize");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateCampaign");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateCampaignResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateCampaignResultJsonUnmarshaller());
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
