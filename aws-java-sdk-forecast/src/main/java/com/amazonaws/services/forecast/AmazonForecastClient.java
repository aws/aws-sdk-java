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
package com.amazonaws.services.forecast;

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

import com.amazonaws.services.forecast.AmazonForecastClientBuilder;

import com.amazonaws.AmazonServiceException;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.services.forecast.model.transform.*;

/**
 * Client for accessing Amazon Forecast Service. All service calls made using this client are blocking, and will not
 * return until the service call completes.
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon Forecast resources.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonForecastClient extends AmazonWebServiceClient implements AmazonForecast {

    /** Provider for AWS credentials. */
    private final AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonForecast.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "forecast";

    /** Client configuration factory providing ClientConfigurations tailored to this client */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    private final AdvancedConfig advancedConfig;

    private static final com.amazonaws.protocol.json.SdkJsonProtocolFactory protocolFactory = new com.amazonaws.protocol.json.SdkJsonProtocolFactory(
            new JsonClientMetadata()
                    .withProtocolVersion("1.1")
                    .withSupportsCbor(false)
                    .withSupportsIon(false)
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidNextTokenException").withExceptionUnmarshaller(
                                    com.amazonaws.services.forecast.model.transform.InvalidNextTokenExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("LimitExceededException").withExceptionUnmarshaller(
                                    com.amazonaws.services.forecast.model.transform.LimitExceededExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceNotFoundException").withExceptionUnmarshaller(
                                    com.amazonaws.services.forecast.model.transform.ResourceNotFoundExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceAlreadyExistsException").withExceptionUnmarshaller(
                                    com.amazonaws.services.forecast.model.transform.ResourceAlreadyExistsExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("ResourceInUseException").withExceptionUnmarshaller(
                                    com.amazonaws.services.forecast.model.transform.ResourceInUseExceptionUnmarshaller.getInstance()))
                    .addErrorMetadata(
                            new JsonErrorShapeMetadata().withErrorCode("InvalidInputException").withExceptionUnmarshaller(
                                    com.amazonaws.services.forecast.model.transform.InvalidInputExceptionUnmarshaller.getInstance()))
                    .withBaseServiceExceptionClass(com.amazonaws.services.forecast.model.AmazonForecastException.class));

    public static AmazonForecastClientBuilder builder() {
        return AmazonForecastClientBuilder.standard();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Forecast Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonForecastClient(AwsSyncClientParams clientParams) {
        this(clientParams, false);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon Forecast Service using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    AmazonForecastClient(AwsSyncClientParams clientParams, boolean endpointDiscoveryEnabled) {
        super(clientParams);
        this.awsCredentialsProvider = clientParams.getCredentialsProvider();
        this.advancedConfig = clientParams.getAdvancedConfig();
        init();
    }

    private void init() {
        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("forecast.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain("/com/amazonaws/services/forecast/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain("/com/amazonaws/services/forecast/request.handler2s"));
        requestHandler2s.addAll(chainFactory.getGlobalHandlers());
    }

    /**
     * <p>
     * Creates an Amazon Forecast predictor.
     * </p>
     * <p>
     * Amazon Forecast creates predictors with AutoPredictor, which involves applying the optimal combination of
     * algorithms to each time series in your datasets. You can use <a>CreateAutoPredictor</a> to create new predictors
     * or upgrade/retrain existing predictors.
     * </p>
     * <p>
     * <b>Creating new predictors</b>
     * </p>
     * <p>
     * The following parameters are required when creating a new predictor:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PredictorName</code> - A unique name for the predictor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DatasetGroupArn</code> - The ARN of the dataset group used to train the predictor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ForecastFrequency</code> - The granularity of your forecasts (hourly, daily, weekly, etc).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ForecastHorizon</code> - The number of time-steps that the model predicts. The forecast horizon is also
     * called the prediction length.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When creating a new predictor, do not specify a value for <code>ReferencePredictorArn</code>.
     * </p>
     * <p>
     * <b>Upgrading and retraining predictors</b>
     * </p>
     * <p>
     * The following parameters are required when retraining or upgrading a predictor:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PredictorName</code> - A unique name for the predictor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReferencePredictorArn</code> - The ARN of the predictor to retrain or upgrade.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When upgrading or retraining a predictor, only specify values for the <code>ReferencePredictorArn</code> and
     * <code>PredictorName</code>.
     * </p>
     * 
     * @param createAutoPredictorRequest
     * @return Result of the CreateAutoPredictor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateAutoPredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateAutoPredictor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateAutoPredictorResult createAutoPredictor(CreateAutoPredictorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateAutoPredictor(request);
    }

    @SdkInternalApi
    final CreateAutoPredictorResult executeCreateAutoPredictor(CreateAutoPredictorRequest createAutoPredictorRequest) {

        ExecutionContext executionContext = createExecutionContext(createAutoPredictorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAutoPredictorRequest> request = null;
        Response<CreateAutoPredictorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAutoPredictorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createAutoPredictorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateAutoPredictor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateAutoPredictorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateAutoPredictorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand
     * how to consume the data for model training. This includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>DataFrequency</code> </i> - How frequently your historical time-series data is collected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>Domain</code> </i> and <i> <code>DatasetType</code> </i> - Each dataset has an associated dataset
     * domain and a type within the domain. Amazon Forecast provides a list of predefined domains and types within each
     * domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your data to include
     * a minimum set of predefined fields.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i> <code>Schema</code> </i> - A schema specifies the fields in the dataset, including the field name and data
     * type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating a dataset, you import your training data into it and add the dataset to a dataset group. You use
     * the dataset group to create a predictor. For more information, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html">Importing datasets</a>.
     * </p>
     * <p>
     * To get a list of all your datasets, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasets.html">ListDatasets</a> operation.
     * </p>
     * <p>
     * For example Forecast datasets, see the <a href="https://github.com/aws-samples/amazon-forecast-samples">Amazon
     * Forecast Sample GitHub repository</a>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of a dataset must be <code>ACTIVE</code> before you can import training data. Use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html">DescribeDataset</a> operation to
     * get the status.
     * </p>
     * </note>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDataset" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Creates a dataset group, which holds a collection of related datasets. You can add datasets to the dataset group
     * when you create the dataset group, or later by using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_UpdateDatasetGroup.html">UpdateDatasetGroup</a>
     * operation.
     * </p>
     * <p>
     * After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html">Dataset groups</a>.
     * </p>
     * <p>
     * To get a list of all your datasets groups, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasetGroups.html">ListDatasetGroups</a> operation.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of a dataset group must be <code>ACTIVE</code> before you can use the dataset group to
     * create a predictor. To get the status, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation.
     * </p>
     * </note>
     * 
     * @param createDatasetGroupRequest
     * @return Result of the CreateDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetGroup" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an
     * Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want
     * to import the data to.
     * </p>
     * <p>
     * You must specify a <a href="https://docs.aws.amazon.com/forecast/latest/dg/API_DataSource.html">DataSource</a>
     * object that includes an AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access
     * the data, as Amazon Forecast makes a copy of your data and processes it in an internal AWS system. For more
     * information, see <a href="https://docs.aws.amazon.com/forecast/latest/dg/aws-forecast-iam-roles.html">Set up
     * permissions</a>.
     * </p>
     * <p>
     * The training data must be in CSV or Parquet format. The delimiter must be a comma (,).
     * </p>
     * <p>
     * You can specify the path to a specific file, the S3 bucket, or to a folder in the S3 bucket. For the latter two
     * cases, Amazon Forecast imports all files up to the limit of 10,000 files.
     * </p>
     * <p>
     * Because dataset imports are not aggregated, your most recent dataset import is the one that is used when training
     * a predictor or generating a forecast. Make sure that your most recent dataset import contains all of the data you
     * want to model off of, and not just the new data collected since the previous import.
     * </p>
     * <p>
     * To get a list of all your dataset import jobs, filtered by specified criteria, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasetImportJobs.html">ListDatasetImportJobs</a>
     * operation.
     * </p>
     * 
     * @param createDatasetImportJobRequest
     * @return Result of the CreateDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetImportJob"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * <note>
     * <p>
     * Explainability is only available for Forecasts and Predictors generated from an AutoPredictor
     * (<a>CreateAutoPredictor</a>)
     * </p>
     * </note>
     * <p>
     * Creates an Amazon Forecast Explainability.
     * </p>
     * <p>
     * Explainability helps you better understand how the attributes in your datasets impact forecast. Amazon Forecast
     * uses a metric called Impact scores to quantify the relative impact of each attribute and determine whether they
     * increase or decrease forecast values.
     * </p>
     * <p>
     * To enable Forecast Explainability, your predictor must include at least one of the following: related time
     * series, item metadata, or additional datasets like Holidays and the Weather Index.
     * </p>
     * <p>
     * CreateExplainability accepts either a Predictor ARN or Forecast ARN. To receive aggregated Impact scores for all
     * time series and time points in your datasets, provide a Predictor ARN. To receive Impact scores for specific time
     * series and time points, provide a Forecast ARN.
     * </p>
     * <p>
     * <b>CreateExplainability with a Predictor ARN</b>
     * </p>
     * <note>
     * <p>
     * You can only have one Explainability resource per predictor. If you already enabled <code>ExplainPredictor</code>
     * in <a>CreateAutoPredictor</a>, that predictor already has an Explainability resource.
     * </p>
     * </note>
     * <p>
     * The following parameters are required when providing a Predictor ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExplainabilityName</code> - A unique name for the Explainability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - The Arn of the predictor.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TimePointGranularity</code> - Must be set to “ALL”.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TimeSeriesGranularity</code> - Must be set to “ALL”.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Do not specify a value for the following parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DataSource</code> - Only valid when TimeSeriesGranularity is “SPECIFIC”.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Schema</code> - Only valid when TimeSeriesGranularity is “SPECIFIC”.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StartDateTime</code> - Only valid when TimePointGranularity is “SPECIFIC”.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EndDateTime</code> - Only valid when TimePointGranularity is “SPECIFIC”.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>CreateExplainability with a Forecast ARN</b>
     * </p>
     * <note>
     * <p>
     * You can specify a maximum of 50 time series and 500 time points.
     * </p>
     * </note>
     * <p>
     * The following parameters are required when providing a Predictor ARN:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ExplainabilityName</code> - A unique name for the Explainability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ResourceArn</code> - The Arn of the forecast.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TimePointGranularity</code> - Either “ALL” or “SPECIFIC”.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TimeSeriesGranularity</code> - Either “ALL” or “SPECIFIC”.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set TimeSeriesGranularity to “SPECIFIC”, you must also provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DataSource</code> - The S3 location of the CSV file specifying your time series.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Schema</code> - The Schema defines the attributes and attribute types listed in the Data Source.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you set TimePointGranularity to “SPECIFIC”, you must also provide the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>StartDateTime</code> - The first timestamp in the range of time points.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EndDateTime</code> - The last timestamp in the range of time points.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createExplainabilityRequest
     * @return Result of the CreateExplainability operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainability" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateExplainabilityResult createExplainability(CreateExplainabilityRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExplainability(request);
    }

    @SdkInternalApi
    final CreateExplainabilityResult executeCreateExplainability(CreateExplainabilityRequest createExplainabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(createExplainabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExplainabilityRequest> request = null;
        Response<CreateExplainabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExplainabilityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createExplainabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExplainability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExplainabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateExplainabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports an Explainability resource created by the <a>CreateExplainability</a> operation. Exported files are
     * exported to an Amazon Simple Storage Service (Amazon S3) bucket.
     * </p>
     * <p>
     * You must specify a <a>DataDestination</a> object that includes an Amazon S3 bucket and an AWS Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see
     * <a>aws-forecast-iam-roles</a>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the export job must be <code>ACTIVE</code> before you can access the export in your
     * Amazon S3 bucket. To get the status, use the <a>DescribeExplainabilityExport</a> operation.
     * </p>
     * </note>
     * 
     * @param createExplainabilityExportRequest
     * @return Result of the CreateExplainabilityExport operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateExplainabilityExportResult createExplainabilityExport(CreateExplainabilityExportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateExplainabilityExport(request);
    }

    @SdkInternalApi
    final CreateExplainabilityExportResult executeCreateExplainabilityExport(CreateExplainabilityExportRequest createExplainabilityExportRequest) {

        ExecutionContext executionContext = createExecutionContext(createExplainabilityExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateExplainabilityExportRequest> request = null;
        Response<CreateExplainabilityExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateExplainabilityExportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createExplainabilityExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateExplainabilityExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateExplainabilityExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateExplainabilityExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a forecast for each item in the <code>TARGET_TIME_SERIES</code> dataset that was used to train the
     * predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the
     * operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3) bucket, use the
     * <a>CreateForecastExportJob</a> operation.
     * </p>
     * <p>
     * The range of the forecast is determined by the <code>ForecastHorizon</code> value, which you specify in the
     * <a>CreatePredictor</a> request. When you query a forecast, you can request a specific date range within the
     * forecast.
     * </p>
     * <p>
     * To get a list of all your forecasts, use the <a>ListForecasts</a> operation.
     * </p>
     * <note>
     * <p>
     * The forecasts generated by Amazon Forecast are in the same time zone as the dataset that was used to create the
     * predictor.
     * </p>
     * </note>
     * <p>
     * For more information, see <a>howitworks-forecast</a>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the forecast.
     * Use the <a>DescribeForecast</a> operation to get the status.
     * </p>
     * </note>
     * <p>
     * By default, a forecast includes predictions for every item (<code>item_id</code>) in the dataset group that was
     * used to train the predictor. However, you can use the <code>TimeSeriesSelector</code> object to generate a
     * forecast on a subset of time series. Forecast creation is skipped for any time series that you specify that are
     * not in the input dataset. The forecast export file will not contain these time series or their forecasted values.
     * </p>
     * 
     * @param createForecastRequest
     * @return Result of the CreateForecast operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecast" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateForecastResult createForecast(CreateForecastRequest request) {
        request = beforeClientExecution(request);
        return executeCreateForecast(request);
    }

    @SdkInternalApi
    final CreateForecastResult executeCreateForecast(CreateForecastRequest createForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(createForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateForecastRequest> request = null;
        Response<CreateForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports a forecast created by the <a>CreateForecast</a> operation to your Amazon Simple Storage Service (Amazon
     * S3) bucket. The forecast file name will match the following conventions:
     * </p>
     * <p>
     * &lt;ForecastExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt;
     * </p>
     * <p>
     * where the &lt;ExportTimestamp&gt; component is in Java SimpleDateFormat (yyyy-MM-ddTHH-mm-ssZ).
     * </p>
     * <p>
     * You must specify a <a>DataDestination</a> object that includes an AWS Identity and Access Management (IAM) role
     * that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see
     * <a>aws-forecast-iam-roles</a>.
     * </p>
     * <p>
     * For more information, see <a>howitworks-forecast</a>.
     * </p>
     * <p>
     * To get a list of all your forecast export jobs, use the <a>ListForecastExportJobs</a> operation.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the forecast
     * in your Amazon S3 bucket. To get the status, use the <a>DescribeForecastExportJob</a> operation.
     * </p>
     * </note>
     * 
     * @param createForecastExportJobRequest
     * @return Result of the CreateForecastExportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateForecastExportJobResult createForecastExportJob(CreateForecastExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreateForecastExportJob(request);
    }

    @SdkInternalApi
    final CreateForecastExportJobResult executeCreateForecastExportJob(CreateForecastExportJobRequest createForecastExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createForecastExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateForecastExportJobRequest> request = null;
        Response<CreateForecastExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateForecastExportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createForecastExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateForecastExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateForecastExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateForecastExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a predictor monitor resource for an existing auto predictor. Predictor monitoring allows you to see how
     * your predictor's performance changes over time. For more information, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * </p>
     * 
     * @param createMonitorRequest
     * @return Result of the CreateMonitor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreateMonitorResult createMonitor(CreateMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeCreateMonitor(request);
    }

    @SdkInternalApi
    final CreateMonitorResult executeCreateMonitor(CreateMonitorRequest createMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(createMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMonitorRequest> request = null;
        Response<CreateMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation creates a legacy predictor that does not include all the predictor functionalities provided by
     * Amazon Forecast. To create a predictor that is compatible with all aspects of Forecast, use
     * <a>CreateAutoPredictor</a>.
     * </p>
     * </note>
     * <p>
     * Creates an Amazon Forecast predictor.
     * </p>
     * <p>
     * In the request, provide a dataset group and either specify an algorithm or let Amazon Forecast choose an
     * algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific
     * hyperparameters.
     * </p>
     * <p>
     * Amazon Forecast uses the algorithm to train a predictor using the latest version of the datasets in the specified
     * dataset group. You can then generate a forecast using the <a>CreateForecast</a> operation.
     * </p>
     * <p>
     * To see the evaluation metrics, use the <a>GetAccuracyMetrics</a> operation.
     * </p>
     * <p>
     * You can specify a featurization configuration to fill and aggregate the data fields in the
     * <code>TARGET_TIME_SERIES</code> dataset to improve model training. For more information, see
     * <a>FeaturizationConfig</a>.
     * </p>
     * <p>
     * For RELATED_TIME_SERIES datasets, <code>CreatePredictor</code> verifies that the <code>DataFrequency</code>
     * specified when the dataset was created matches the <code>ForecastFrequency</code>. TARGET_TIME_SERIES datasets
     * don't have this restriction. Amazon Forecast also verifies the delimiter and timestamp format. For more
     * information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * <p>
     * By default, predictors are trained and evaluated at the 0.1 (P10), 0.5 (P50), and 0.9 (P90) quantiles. You can
     * choose custom forecast types to train and evaluate your predictor by setting the <code>ForecastTypes</code>.
     * </p>
     * <p>
     * <b>AutoML</b>
     * </p>
     * <p>
     * If you want Amazon Forecast to evaluate each algorithm and choose the one that minimizes the
     * <code>objective function</code>, set <code>PerformAutoML</code> to <code>true</code>. The
     * <code>objective function</code> is defined as the mean of the weighted losses over the forecast types. By
     * default, these are the p10, p50, and p90 quantile losses. For more information, see <a>EvaluationResult</a>.
     * </p>
     * <p>
     * When AutoML is enabled, the following properties are disallowed:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AlgorithmArn</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HPOConfig</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PerformHPO</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TrainingParameters</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get a list of all of your predictors, use the <a>ListPredictors</a> operation.
     * </p>
     * <note>
     * <p>
     * Before you can use the predictor to create a forecast, the <code>Status</code> of the predictor must be
     * <code>ACTIVE</code>, signifying that training has completed. To get the status, use the <a>DescribePredictor</a>
     * operation.
     * </p>
     * </note>
     * 
     * @param createPredictorRequest
     * @return Result of the CreatePredictor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreatePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public CreatePredictorResult createPredictor(CreatePredictorRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePredictor(request);
    }

    @SdkInternalApi
    final CreatePredictorResult executeCreatePredictor(CreatePredictorRequest createPredictorRequest) {

        ExecutionContext executionContext = createExecutionContext(createPredictorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePredictorRequest> request = null;
        Response<CreatePredictorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePredictorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createPredictorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePredictor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePredictorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreatePredictorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports backtest forecasts and accuracy metrics generated by the <a>CreateAutoPredictor</a> or
     * <a>CreatePredictor</a> operations. Two folders containing CSV or Parquet files are exported to your specified S3
     * bucket.
     * </p>
     * <p>
     * The export file names will match the following conventions:
     * </p>
     * <p>
     * <code>&lt;ExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt;.csv</code>
     * </p>
     * <p>
     * The &lt;ExportTimestamp&gt; component is in Java SimpleDate format (yyyy-MM-ddTHH-mm-ssZ).
     * </p>
     * <p>
     * You must specify a <a>DataDestination</a> object that includes an Amazon S3 bucket and an AWS Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see
     * <a>aws-forecast-iam-roles</a>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the export job must be <code>ACTIVE</code> before you can access the export in your
     * Amazon S3 bucket. To get the status, use the <a>DescribePredictorBacktestExportJob</a> operation.
     * </p>
     * </note>
     * 
     * @param createPredictorBacktestExportJobRequest
     * @return Result of the CreatePredictorBacktestExportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreatePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreatePredictorBacktestExportJobResult createPredictorBacktestExportJob(CreatePredictorBacktestExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeCreatePredictorBacktestExportJob(request);
    }

    @SdkInternalApi
    final CreatePredictorBacktestExportJobResult executeCreatePredictorBacktestExportJob(
            CreatePredictorBacktestExportJobRequest createPredictorBacktestExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(createPredictorBacktestExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePredictorBacktestExportJobRequest> request = null;
        Response<CreatePredictorBacktestExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePredictorBacktestExportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createPredictorBacktestExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreatePredictorBacktestExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreatePredictorBacktestExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreatePredictorBacktestExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * What-if analysis is a scenario modeling technique where you make a hypothetical change to a time series and
     * compare the forecasts generated by these changes against the baseline, unchanged time series. It is important to
     * remember that the purpose of a what-if analysis is to understand how a forecast can change given different
     * modifications to the baseline time series.
     * </p>
     * <p>
     * For example, imagine you are a clothing retailer who is considering an end of season sale to clear space for new
     * styles. After creating a baseline forecast, you can use a what-if analysis to investigate how different sales
     * tactics might affect your goals. You could create a scenario where everything is given a 25% markdown and another
     * where everything is given a fixed dollar markdown. You can create a scenario where the sale lasts for 1 week and
     * another where the sale lasts for 1 month. Your what-if analysis enables you to compare many different scenarios
     * against each other.
     * </p>
     * <p>
     * Note that a what-if analysis is meant to display what the forecasting model has learned and how it will behave in
     * the scenarios that you are evaluating. Do not blindly use the results of the what-if analysis to make business
     * decisions. For instance, forecasts might not be accurate for novel scenarios where there is no reference
     * available to determine whether a forecast is good.
     * </p>
     * <p>
     * The <a>TimeSeriesSelector</a> object defines the items that you want in the what-if analysis.
     * </p>
     * 
     * @param createWhatIfAnalysisRequest
     * @return Result of the CreateWhatIfAnalysis operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWhatIfAnalysisResult createWhatIfAnalysis(CreateWhatIfAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWhatIfAnalysis(request);
    }

    @SdkInternalApi
    final CreateWhatIfAnalysisResult executeCreateWhatIfAnalysis(CreateWhatIfAnalysisRequest createWhatIfAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(createWhatIfAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWhatIfAnalysisRequest> request = null;
        Response<CreateWhatIfAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWhatIfAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWhatIfAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWhatIfAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWhatIfAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWhatIfAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * A what-if forecast is a forecast that is created from a modified version of the baseline forecast. Each what-if
     * forecast incorporates either a replacement dataset or a set of transformations to the original dataset.
     * </p>
     * 
     * @param createWhatIfForecastRequest
     * @return Result of the CreateWhatIfForecast operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecast" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreateWhatIfForecastResult createWhatIfForecast(CreateWhatIfForecastRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWhatIfForecast(request);
    }

    @SdkInternalApi
    final CreateWhatIfForecastResult executeCreateWhatIfForecast(CreateWhatIfForecastRequest createWhatIfForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(createWhatIfForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWhatIfForecastRequest> request = null;
        Response<CreateWhatIfForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWhatIfForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(createWhatIfForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWhatIfForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWhatIfForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new CreateWhatIfForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Exports a forecast created by the <a>CreateWhatIfForecast</a> operation to your Amazon Simple Storage Service
     * (Amazon S3) bucket. The forecast file name will match the following conventions:
     * </p>
     * <p>
     * <code>≈&lt;ForecastExportJobName&gt;_&lt;ExportTimestamp&gt;_&lt;PartNumber&gt;</code>
     * </p>
     * <p>
     * The &lt;ExportTimestamp&gt; component is in Java SimpleDateFormat (yyyy-MM-ddTHH-mm-ssZ).
     * </p>
     * <p>
     * You must specify a <a>DataDestination</a> object that includes an AWS Identity and Access Management (IAM) role
     * that Amazon Forecast can assume to access the Amazon S3 bucket. For more information, see
     * <a>aws-forecast-iam-roles</a>.
     * </p>
     * <p>
     * For more information, see <a>howitworks-forecast</a>.
     * </p>
     * <p>
     * To get a list of all your what-if forecast export jobs, use the <a>ListWhatIfForecastExports</a> operation.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the forecast
     * in your Amazon S3 bucket. To get the status, use the <a>DescribeWhatIfForecastExport</a> operation.
     * </p>
     * </note>
     * 
     * @param createWhatIfForecastExportRequest
     * @return Result of the CreateWhatIfForecastExport operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with this name. Try again with a different name.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @sample AmazonForecast.CreateWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public CreateWhatIfForecastExportResult createWhatIfForecastExport(CreateWhatIfForecastExportRequest request) {
        request = beforeClientExecution(request);
        return executeCreateWhatIfForecastExport(request);
    }

    @SdkInternalApi
    final CreateWhatIfForecastExportResult executeCreateWhatIfForecastExport(CreateWhatIfForecastExportRequest createWhatIfForecastExportRequest) {

        ExecutionContext executionContext = createExecutionContext(createWhatIfForecastExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateWhatIfForecastExportRequest> request = null;
        Response<CreateWhatIfForecastExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateWhatIfForecastExportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(createWhatIfForecastExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "CreateWhatIfForecastExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<CreateWhatIfForecastExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new CreateWhatIfForecastExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Amazon Forecast dataset that was created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html">CreateDataset</a> operation. You can
     * only delete datasets that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status
     * use the <a href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html">DescribeDataset</a>
     * operation.
     * </p>
     * <note>
     * <p>
     * Forecast does not automatically update any dataset groups that contain the deleted dataset. In order to update
     * the dataset group, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_UpdateDatasetGroup.html">UpdateDatasetGroup</a>
     * operation, omitting the deleted dataset's ARN.
     * </p>
     * </note>
     * 
     * @param deleteDatasetRequest
     * @return Result of the DeleteDataset operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDataset" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Deletes a dataset group created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>
     * operation. You can only delete dataset groups that have a status of <code>ACTIVE</code>,
     * <code>CREATE_FAILED</code>, or <code>UPDATE_FAILED</code>. To get the status, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation.
     * </p>
     * <p>
     * This operation deletes only the dataset group, not the datasets in the group.
     * </p>
     * 
     * @param deleteDatasetGroupRequest
     * @return Result of the DeleteDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDatasetGroup" target="_top">AWS
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Deletes a dataset import job created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetImportJob.html">CreateDatasetImportJob</a>
     * operation. You can delete only dataset import jobs that have a status of <code>ACTIVE</code> or
     * <code>CREATE_FAILED</code>. To get the status, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetImportJob.html"
     * >DescribeDatasetImportJob</a> operation.
     * </p>
     * 
     * @param deleteDatasetImportJobRequest
     * @return Result of the DeleteDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteDatasetImportJobResult deleteDatasetImportJob(DeleteDatasetImportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteDatasetImportJob(request);
    }

    @SdkInternalApi
    final DeleteDatasetImportJobResult executeDeleteDatasetImportJob(DeleteDatasetImportJobRequest deleteDatasetImportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteDatasetImportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDatasetImportJobRequest> request = null;
        Response<DeleteDatasetImportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDatasetImportJobRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteDatasetImportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteDatasetImportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteDatasetImportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteDatasetImportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Explainability resource.
     * </p>
     * <p>
     * You can delete only predictor that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the
     * status, use the <a>DescribeExplainability</a> operation.
     * </p>
     * 
     * @param deleteExplainabilityRequest
     * @return Result of the DeleteExplainability operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteExplainability" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteExplainabilityResult deleteExplainability(DeleteExplainabilityRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteExplainability(request);
    }

    @SdkInternalApi
    final DeleteExplainabilityResult executeDeleteExplainability(DeleteExplainabilityRequest deleteExplainabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteExplainabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExplainabilityRequest> request = null;
        Response<DeleteExplainabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExplainabilityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteExplainabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteExplainability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteExplainabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteExplainabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an Explainability export.
     * </p>
     * 
     * @param deleteExplainabilityExportRequest
     * @return Result of the DeleteExplainabilityExport operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteExplainabilityExportResult deleteExplainabilityExport(DeleteExplainabilityExportRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteExplainabilityExport(request);
    }

    @SdkInternalApi
    final DeleteExplainabilityExportResult executeDeleteExplainabilityExport(DeleteExplainabilityExportRequest deleteExplainabilityExportRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteExplainabilityExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteExplainabilityExportRequest> request = null;
        Response<DeleteExplainabilityExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteExplainabilityExportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteExplainabilityExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteExplainabilityExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteExplainabilityExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteExplainabilityExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a forecast created using the <a>CreateForecast</a> operation. You can delete only forecasts that have a
     * status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the <a>DescribeForecast</a>
     * operation.
     * </p>
     * <p>
     * You can't delete a forecast while it is being exported. After a forecast is deleted, you can no longer query the
     * forecast.
     * </p>
     * 
     * @param deleteForecastRequest
     * @return Result of the DeleteForecast operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteForecast" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteForecastResult deleteForecast(DeleteForecastRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteForecast(request);
    }

    @SdkInternalApi
    final DeleteForecastResult executeDeleteForecast(DeleteForecastRequest deleteForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteForecastRequest> request = null;
        Response<DeleteForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a forecast export job created using the <a>CreateForecastExportJob</a> operation. You can delete only
     * export jobs that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the
     * <a>DescribeForecastExportJob</a> operation.
     * </p>
     * 
     * @param deleteForecastExportJobRequest
     * @return Result of the DeleteForecastExportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteForecastExportJobResult deleteForecastExportJob(DeleteForecastExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteForecastExportJob(request);
    }

    @SdkInternalApi
    final DeleteForecastExportJobResult executeDeleteForecastExportJob(DeleteForecastExportJobRequest deleteForecastExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteForecastExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteForecastExportJobRequest> request = null;
        Response<DeleteForecastExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteForecastExportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteForecastExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteForecastExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteForecastExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteForecastExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a monitor resource. You can only delete a monitor resource with a status of <code>ACTIVE</code>,
     * <code>ACTIVE_STOPPED</code>, <code>CREATE_FAILED</code>, or <code>CREATE_STOPPED</code>.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return Result of the DeleteMonitor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeleteMonitorResult deleteMonitor(DeleteMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteMonitor(request);
    }

    @SdkInternalApi
    final DeleteMonitorResult executeDeleteMonitor(DeleteMonitorRequest deleteMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMonitorRequest> request = null;
        Response<DeleteMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a predictor created using the <a>DescribePredictor</a> or <a>CreatePredictor</a> operations. You can
     * delete only predictor that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status,
     * use the <a>DescribePredictor</a> operation.
     * </p>
     * 
     * @param deletePredictorRequest
     * @return Result of the DeletePredictor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeletePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeletePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DeletePredictorResult deletePredictor(DeletePredictorRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePredictor(request);
    }

    @SdkInternalApi
    final DeletePredictorResult executeDeletePredictor(DeletePredictorRequest deletePredictorRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePredictorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePredictorRequest> request = null;
        Response<DeletePredictorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePredictorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deletePredictorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePredictor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePredictorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeletePredictorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a predictor backtest export job.
     * </p>
     * 
     * @param deletePredictorBacktestExportJobRequest
     * @return Result of the DeletePredictorBacktestExportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeletePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeletePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeletePredictorBacktestExportJobResult deletePredictorBacktestExportJob(DeletePredictorBacktestExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDeletePredictorBacktestExportJob(request);
    }

    @SdkInternalApi
    final DeletePredictorBacktestExportJobResult executeDeletePredictorBacktestExportJob(
            DeletePredictorBacktestExportJobRequest deletePredictorBacktestExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(deletePredictorBacktestExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePredictorBacktestExportJobRequest> request = null;
        Response<DeletePredictorBacktestExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePredictorBacktestExportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deletePredictorBacktestExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeletePredictorBacktestExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeletePredictorBacktestExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeletePredictorBacktestExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an entire resource tree. This operation will delete the parent resource and its child resources.
     * </p>
     * <p>
     * Child resources are resources that were created from another resource. For example, when a forecast is generated
     * from a predictor, the forecast is the child resource and the predictor is the parent resource.
     * </p>
     * <p>
     * Amazon Forecast resources possess the following parent-child resource hierarchies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Dataset</b>: dataset import jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Dataset Group</b>: predictors, predictor backtest export jobs, forecasts, forecast export jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Predictor</b>: predictor backtest export jobs, forecasts, forecast export jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Forecast</b>: forecast export jobs
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * <code>DeleteResourceTree</code> will only delete Amazon Forecast resources, and will not delete datasets or
     * exported files stored in Amazon S3.
     * </p>
     * </note>
     * 
     * @param deleteResourceTreeRequest
     * @return Result of the DeleteResourceTree operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteResourceTree
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteResourceTree" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteResourceTreeResult deleteResourceTree(DeleteResourceTreeRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteResourceTree(request);
    }

    @SdkInternalApi
    final DeleteResourceTreeResult executeDeleteResourceTree(DeleteResourceTreeRequest deleteResourceTreeRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteResourceTreeRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteResourceTreeRequest> request = null;
        Response<DeleteResourceTreeResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteResourceTreeRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteResourceTreeRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteResourceTree");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteResourceTreeResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteResourceTreeResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a what-if analysis created using the <a>CreateWhatIfAnalysis</a> operation. You can delete only what-if
     * analyses that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the
     * <a>DescribeWhatIfAnalysis</a> operation.
     * </p>
     * <p>
     * You can't delete a what-if analysis while any of its forecasts are being exported.
     * </p>
     * 
     * @param deleteWhatIfAnalysisRequest
     * @return Result of the DeleteWhatIfAnalysis operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWhatIfAnalysisResult deleteWhatIfAnalysis(DeleteWhatIfAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWhatIfAnalysis(request);
    }

    @SdkInternalApi
    final DeleteWhatIfAnalysisResult executeDeleteWhatIfAnalysis(DeleteWhatIfAnalysisRequest deleteWhatIfAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWhatIfAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWhatIfAnalysisRequest> request = null;
        Response<DeleteWhatIfAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWhatIfAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWhatIfAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWhatIfAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWhatIfAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWhatIfAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a what-if forecast created using the <a>CreateWhatIfForecast</a> operation. You can delete only what-if
     * forecasts that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the
     * <a>DescribeWhatIfForecast</a> operation.
     * </p>
     * <p>
     * You can't delete a what-if forecast while it is being exported. After a what-if forecast is deleted, you can no
     * longer query the what-if analysis.
     * </p>
     * 
     * @param deleteWhatIfForecastRequest
     * @return Result of the DeleteWhatIfForecast operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfForecast" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DeleteWhatIfForecastResult deleteWhatIfForecast(DeleteWhatIfForecastRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWhatIfForecast(request);
    }

    @SdkInternalApi
    final DeleteWhatIfForecastResult executeDeleteWhatIfForecast(DeleteWhatIfForecastRequest deleteWhatIfForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWhatIfForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWhatIfForecastRequest> request = null;
        Response<DeleteWhatIfForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWhatIfForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(deleteWhatIfForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWhatIfForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWhatIfForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DeleteWhatIfForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a what-if forecast export created using the <a>CreateWhatIfForecastExport</a> operation. You can delete
     * only what-if forecast exports that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the
     * status, use the <a>DescribeWhatIfForecastExport</a> operation.
     * </p>
     * 
     * @param deleteWhatIfForecastExportRequest
     * @return Result of the DeleteWhatIfForecastExport operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.DeleteWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DeleteWhatIfForecastExportResult deleteWhatIfForecastExport(DeleteWhatIfForecastExportRequest request) {
        request = beforeClientExecution(request);
        return executeDeleteWhatIfForecastExport(request);
    }

    @SdkInternalApi
    final DeleteWhatIfForecastExportResult executeDeleteWhatIfForecastExport(DeleteWhatIfForecastExportRequest deleteWhatIfForecastExportRequest) {

        ExecutionContext executionContext = createExecutionContext(deleteWhatIfForecastExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteWhatIfForecastExportRequest> request = null;
        Response<DeleteWhatIfForecastExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteWhatIfForecastExportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(deleteWhatIfForecastExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DeleteWhatIfForecastExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DeleteWhatIfForecastExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DeleteWhatIfForecastExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a predictor created using the CreateAutoPredictor operation.
     * </p>
     * 
     * @param describeAutoPredictorRequest
     * @return Result of the DescribeAutoPredictor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeAutoPredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeAutoPredictor" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public DescribeAutoPredictorResult describeAutoPredictor(DescribeAutoPredictorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeAutoPredictor(request);
    }

    @SdkInternalApi
    final DescribeAutoPredictorResult executeDescribeAutoPredictor(DescribeAutoPredictorRequest describeAutoPredictorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeAutoPredictorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAutoPredictorRequest> request = null;
        Response<DescribeAutoPredictorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAutoPredictorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeAutoPredictorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeAutoPredictor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeAutoPredictorResult>> responseHandler = protocolFactory
                    .createResponseHandler(new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                            new DescribeAutoPredictorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an Amazon Forecast dataset created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html">CreateDataset</a> operation.
     * </p>
     * <p>
     * In addition to listing the parameters specified in the <code>CreateDataset</code> request, this operation
     * includes the following dataset properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeDatasetRequest
     * @return Result of the DescribeDataset operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Describes a dataset group created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>
     * operation.
     * </p>
     * <p>
     * In addition to listing the parameters provided in the <code>CreateDatasetGroup</code> request, this operation
     * includes the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatasetArns</code> - The datasets belonging to the group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeDatasetGroupRequest
     * @return Result of the DescribeDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetGroup" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Describes a dataset import job created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetImportJob.html">CreateDatasetImportJob</a>
     * operation.
     * </p>
     * <p>
     * In addition to listing the parameters provided in the <code>CreateDatasetImportJob</code> request, this operation
     * includes the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DataSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldStatistics</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> - If an error occurred, information about the error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeDatasetImportJobRequest
     * @return Result of the DescribeDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetImportJob"
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Describes an Explainability resource created using the <a>CreateExplainability</a> operation.
     * </p>
     * 
     * @param describeExplainabilityRequest
     * @return Result of the DescribeExplainability operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeExplainability"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeExplainabilityResult describeExplainability(DescribeExplainabilityRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExplainability(request);
    }

    @SdkInternalApi
    final DescribeExplainabilityResult executeDescribeExplainability(DescribeExplainabilityRequest describeExplainabilityRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExplainabilityRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExplainabilityRequest> request = null;
        Response<DescribeExplainabilityResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExplainabilityRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeExplainabilityRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExplainability");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExplainabilityResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeExplainabilityResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes an Explainability export created using the <a>CreateExplainabilityExport</a> operation.
     * </p>
     * 
     * @param describeExplainabilityExportRequest
     * @return Result of the DescribeExplainabilityExport operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeExplainabilityExportResult describeExplainabilityExport(DescribeExplainabilityExportRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeExplainabilityExport(request);
    }

    @SdkInternalApi
    final DescribeExplainabilityExportResult executeDescribeExplainabilityExport(DescribeExplainabilityExportRequest describeExplainabilityExportRequest) {

        ExecutionContext executionContext = createExecutionContext(describeExplainabilityExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeExplainabilityExportRequest> request = null;
        Response<DescribeExplainabilityExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeExplainabilityExportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeExplainabilityExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeExplainabilityExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeExplainabilityExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeExplainabilityExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a forecast created using the <a>CreateForecast</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided in the <code>CreateForecast</code> request, this operation lists
     * the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatasetGroupArn</code> - The dataset group that provided the training data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> - If an error occurred, information about the error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeForecastRequest
     * @return Result of the DescribeForecast operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecast" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeForecastResult describeForecast(DescribeForecastRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeForecast(request);
    }

    @SdkInternalApi
    final DescribeForecastResult executeDescribeForecast(DescribeForecastRequest describeForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(describeForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeForecastRequest> request = null;
        Response<DescribeForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a forecast export job created using the <a>CreateForecastExportJob</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreateForecastExportJob</code> request,
     * this operation lists the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> - If an error occurred, information about the error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeForecastExportJobRequest
     * @return Result of the DescribeForecastExportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeForecastExportJobResult describeForecastExportJob(DescribeForecastExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeForecastExportJob(request);
    }

    @SdkInternalApi
    final DescribeForecastExportJobResult executeDescribeForecastExportJob(DescribeForecastExportJobRequest describeForecastExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describeForecastExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeForecastExportJobRequest> request = null;
        Response<DescribeForecastExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeForecastExportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeForecastExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeForecastExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeForecastExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeForecastExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a monitor resource. In addition to listing the properties provided in the <a>CreateMonitor</a> request,
     * this operation lists the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Baseline</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastEvaluationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastEvaluationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeMonitorRequest
     * @return Result of the DescribeMonitor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribeMonitorResult describeMonitor(DescribeMonitorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeMonitor(request);
    }

    @SdkInternalApi
    final DescribeMonitorResult executeDescribeMonitor(DescribeMonitorRequest describeMonitorRequest) {

        ExecutionContext executionContext = createExecutionContext(describeMonitorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMonitorRequest> request = null;
        Response<DescribeMonitorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMonitorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeMonitorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeMonitor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeMonitorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribeMonitorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <note>
     * <p>
     * This operation is only valid for legacy predictors created with CreatePredictor. If you are not using a legacy
     * predictor, use <a>DescribeAutoPredictor</a>.
     * </p>
     * </note>
     * <p>
     * Describes a predictor created using the <a>CreatePredictor</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided in the <code>CreatePredictor</code> request, this operation lists
     * the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatasetImportJobArns</code> - The dataset import jobs used to import training data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AutoMLAlgorithmArns</code> - If AutoML is performed, the algorithms that were evaluated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> - If an error occurred, information about the error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describePredictorRequest
     * @return Result of the DescribePredictor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public DescribePredictorResult describePredictor(DescribePredictorRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePredictor(request);
    }

    @SdkInternalApi
    final DescribePredictorResult executeDescribePredictor(DescribePredictorRequest describePredictorRequest) {

        ExecutionContext executionContext = createExecutionContext(describePredictorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePredictorRequest> request = null;
        Response<DescribePredictorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePredictorRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describePredictorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePredictor");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePredictorResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new DescribePredictorResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes a predictor backtest export job created using the <a>CreatePredictorBacktestExportJob</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreatePredictorBacktestExportJob</code>
     * request, this operation lists the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> (if an error occurred)
     * </p>
     * </li>
     * </ul>
     * 
     * @param describePredictorBacktestExportJobRequest
     * @return Result of the DescribePredictorBacktestExportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribePredictorBacktestExportJobResult describePredictorBacktestExportJob(DescribePredictorBacktestExportJobRequest request) {
        request = beforeClientExecution(request);
        return executeDescribePredictorBacktestExportJob(request);
    }

    @SdkInternalApi
    final DescribePredictorBacktestExportJobResult executeDescribePredictorBacktestExportJob(
            DescribePredictorBacktestExportJobRequest describePredictorBacktestExportJobRequest) {

        ExecutionContext executionContext = createExecutionContext(describePredictorBacktestExportJobRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePredictorBacktestExportJobRequest> request = null;
        Response<DescribePredictorBacktestExportJobResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePredictorBacktestExportJobRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describePredictorBacktestExportJobRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribePredictorBacktestExportJob");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribePredictorBacktestExportJobResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribePredictorBacktestExportJobResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the what-if analysis created using the <a>CreateWhatIfAnalysis</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided in the <code>CreateWhatIfAnalysis</code> request, this operation
     * lists the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> - If an error occurred, information about the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeWhatIfAnalysisRequest
     * @return Result of the DescribeWhatIfAnalysis operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWhatIfAnalysisResult describeWhatIfAnalysis(DescribeWhatIfAnalysisRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWhatIfAnalysis(request);
    }

    @SdkInternalApi
    final DescribeWhatIfAnalysisResult executeDescribeWhatIfAnalysis(DescribeWhatIfAnalysisRequest describeWhatIfAnalysisRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWhatIfAnalysisRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWhatIfAnalysisRequest> request = null;
        Response<DescribeWhatIfAnalysisResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWhatIfAnalysisRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWhatIfAnalysisRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWhatIfAnalysis");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWhatIfAnalysisResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWhatIfAnalysisResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the what-if forecast created using the <a>CreateWhatIfForecast</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided in the <code>CreateWhatIfForecast</code> request, this operation
     * lists the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> - If an error occurred, information about the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeWhatIfForecastRequest
     * @return Result of the DescribeWhatIfForecast operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfForecast"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWhatIfForecastResult describeWhatIfForecast(DescribeWhatIfForecastRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWhatIfForecast(request);
    }

    @SdkInternalApi
    final DescribeWhatIfForecastResult executeDescribeWhatIfForecast(DescribeWhatIfForecastRequest describeWhatIfForecastRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWhatIfForecastRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWhatIfForecastRequest> request = null;
        Response<DescribeWhatIfForecastResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWhatIfForecastRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(describeWhatIfForecastRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWhatIfForecast");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWhatIfForecastResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWhatIfForecastResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Describes the what-if forecast export created using the <a>CreateWhatIfForecastExport</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided in the <code>CreateWhatIfForecastExport</code> request, this
     * operation lists the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CreationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastModificationTime</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Message</code> - If an error occurred, information about the error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Status</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeWhatIfForecastExportRequest
     * @return Result of the DescribeWhatIfForecastExport operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.DescribeWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public DescribeWhatIfForecastExportResult describeWhatIfForecastExport(DescribeWhatIfForecastExportRequest request) {
        request = beforeClientExecution(request);
        return executeDescribeWhatIfForecastExport(request);
    }

    @SdkInternalApi
    final DescribeWhatIfForecastExportResult executeDescribeWhatIfForecastExport(DescribeWhatIfForecastExportRequest describeWhatIfForecastExportRequest) {

        ExecutionContext executionContext = createExecutionContext(describeWhatIfForecastExportRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeWhatIfForecastExportRequest> request = null;
        Response<DescribeWhatIfForecastExportResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeWhatIfForecastExportRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(describeWhatIfForecastExportRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "DescribeWhatIfForecastExport");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<DescribeWhatIfForecastExportResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new DescribeWhatIfForecastExportResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Provides metrics on the accuracy of the models that were trained by the <a>CreatePredictor</a> operation. Use
     * metrics to see how well the model performed and to decide whether to use the predictor to generate a forecast.
     * For more information, see <a href="https://docs.aws.amazon.com/forecast/latest/dg/metrics.html">Predictor
     * Metrics</a>.
     * </p>
     * <p>
     * This operation generates metrics for each backtest window that was evaluated. The number of backtest windows (
     * <code>NumberOfBacktestWindows</code>) is specified using the <a>EvaluationParameters</a> object, which is
     * optionally included in the <code>CreatePredictor</code> request. If <code>NumberOfBacktestWindows</code> isn't
     * specified, the number defaults to one.
     * </p>
     * <p>
     * The parameters of the <code>filling</code> method determine which items contribute to the metrics. If you want
     * all items to contribute, specify <code>zero</code>. If you want only those items that have complete data in the
     * range being evaluated to contribute, specify <code>nan</code>. For more information, see
     * <a>FeaturizationMethod</a>.
     * </p>
     * <note>
     * <p>
     * Before you can get accuracy metrics, the <code>Status</code> of the predictor must be <code>ACTIVE</code>,
     * signifying that training has completed. To get the status, use the <a>DescribePredictor</a> operation.
     * </p>
     * </note>
     * 
     * @param getAccuracyMetricsRequest
     * @return Result of the GetAccuracyMetrics operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.GetAccuracyMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/GetAccuracyMetrics" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetAccuracyMetricsResult getAccuracyMetrics(GetAccuracyMetricsRequest request) {
        request = beforeClientExecution(request);
        return executeGetAccuracyMetrics(request);
    }

    @SdkInternalApi
    final GetAccuracyMetricsResult executeGetAccuracyMetrics(GetAccuracyMetricsRequest getAccuracyMetricsRequest) {

        ExecutionContext executionContext = createExecutionContext(getAccuracyMetricsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetAccuracyMetricsRequest> request = null;
        Response<GetAccuracyMetricsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetAccuracyMetricsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(getAccuracyMetricsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "GetAccuracyMetrics");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<GetAccuracyMetricsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new GetAccuracyMetricsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of dataset groups created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>
     * operation. For each dataset group, this operation returns a summary of its properties, including its Amazon
     * Resource Name (ARN). You can retrieve the complete set of properties by using the dataset group ARN with the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @return Result of the ListDatasetGroups operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @sample AmazonForecast.ListDatasetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasetGroups" target="_top">AWS API
     *      Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Returns a list of dataset import jobs created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetImportJob.html">CreateDatasetImportJob</a>
     * operation. For each import job, this operation returns a summary of its properties, including its Amazon Resource
     * Name (ARN). You can retrieve the complete set of properties by using the ARN with the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetImportJob.html"
     * >DescribeDatasetImportJob</a> operation. You can filter the list by providing an array of <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_Filter.html">Filter</a> objects.
     * </p>
     * 
     * @param listDatasetImportJobsRequest
     * @return Result of the ListDatasetImportJobs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasetImportJobs" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Returns a list of datasets created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html">CreateDataset</a> operation. For
     * each dataset, a summary of its properties, including its Amazon Resource Name (ARN), is returned. To retrieve the
     * complete set of properties, use the ARN with the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html">DescribeDataset</a> operation.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return Result of the ListDatasets operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @sample AmazonForecast.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasets" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Returns a list of Explainability resources created using the <a>CreateExplainability</a> operation. This
     * operation returns a summary for each Explainability. You can filter the list using an array of <a>Filter</a>
     * objects.
     * </p>
     * <p>
     * To retrieve the complete set of properties for a particular Explainability resource, use the ARN with the
     * <a>DescribeExplainability</a> operation.
     * </p>
     * 
     * @param listExplainabilitiesRequest
     * @return Result of the ListExplainabilities operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListExplainabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilities" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListExplainabilitiesResult listExplainabilities(ListExplainabilitiesRequest request) {
        request = beforeClientExecution(request);
        return executeListExplainabilities(request);
    }

    @SdkInternalApi
    final ListExplainabilitiesResult executeListExplainabilities(ListExplainabilitiesRequest listExplainabilitiesRequest) {

        ExecutionContext executionContext = createExecutionContext(listExplainabilitiesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExplainabilitiesRequest> request = null;
        Response<ListExplainabilitiesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExplainabilitiesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listExplainabilitiesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExplainabilities");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExplainabilitiesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListExplainabilitiesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of Explainability exports created using the <a>CreateExplainabilityExport</a> operation. This
     * operation returns a summary for each Explainability export. You can filter the list using an array of
     * <a>Filter</a> objects.
     * </p>
     * <p>
     * To retrieve the complete set of properties for a particular Explainability export, use the ARN with the
     * <a>DescribeExplainability</a> operation.
     * </p>
     * 
     * @param listExplainabilityExportsRequest
     * @return Result of the ListExplainabilityExports operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListExplainabilityExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilityExports"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListExplainabilityExportsResult listExplainabilityExports(ListExplainabilityExportsRequest request) {
        request = beforeClientExecution(request);
        return executeListExplainabilityExports(request);
    }

    @SdkInternalApi
    final ListExplainabilityExportsResult executeListExplainabilityExports(ListExplainabilityExportsRequest listExplainabilityExportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listExplainabilityExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListExplainabilityExportsRequest> request = null;
        Response<ListExplainabilityExportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListExplainabilityExportsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listExplainabilityExportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListExplainabilityExports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListExplainabilityExportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListExplainabilityExportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of forecast export jobs created using the <a>CreateForecastExportJob</a> operation. For each
     * forecast export job, this operation returns a summary of its properties, including its Amazon Resource Name
     * (ARN). To retrieve the complete set of properties, use the ARN with the <a>DescribeForecastExportJob</a>
     * operation. You can filter the list using an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listForecastExportJobsRequest
     * @return Result of the ListForecastExportJobs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListForecastExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecastExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListForecastExportJobsResult listForecastExportJobs(ListForecastExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListForecastExportJobs(request);
    }

    @SdkInternalApi
    final ListForecastExportJobsResult executeListForecastExportJobs(ListForecastExportJobsRequest listForecastExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listForecastExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListForecastExportJobsRequest> request = null;
        Response<ListForecastExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListForecastExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listForecastExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListForecastExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListForecastExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListForecastExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of forecasts created using the <a>CreateForecast</a> operation. For each forecast, this operation
     * returns a summary of its properties, including its Amazon Resource Name (ARN). To retrieve the complete set of
     * properties, specify the ARN with the <a>DescribeForecast</a> operation. You can filter the list using an array of
     * <a>Filter</a> objects.
     * </p>
     * 
     * @param listForecastsRequest
     * @return Result of the ListForecasts operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListForecasts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecasts" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListForecastsResult listForecasts(ListForecastsRequest request) {
        request = beforeClientExecution(request);
        return executeListForecasts(request);
    }

    @SdkInternalApi
    final ListForecastsResult executeListForecasts(ListForecastsRequest listForecastsRequest) {

        ExecutionContext executionContext = createExecutionContext(listForecastsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListForecastsRequest> request = null;
        Response<ListForecastsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListForecastsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listForecastsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListForecasts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListForecastsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListForecastsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of the monitoring evaluation results and predictor events collected by the monitor resource during
     * different windows of time.
     * </p>
     * <p>
     * For information about monitoring see <a>predictor-monitoring</a>. For more information about retrieving
     * monitoring results see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring-results.html">Viewing Monitoring
     * Results</a>.
     * </p>
     * 
     * @param listMonitorEvaluationsRequest
     * @return Result of the ListMonitorEvaluations operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.ListMonitorEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListMonitorEvaluations"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListMonitorEvaluationsResult listMonitorEvaluations(ListMonitorEvaluationsRequest request) {
        request = beforeClientExecution(request);
        return executeListMonitorEvaluations(request);
    }

    @SdkInternalApi
    final ListMonitorEvaluationsResult executeListMonitorEvaluations(ListMonitorEvaluationsRequest listMonitorEvaluationsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMonitorEvaluationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitorEvaluationsRequest> request = null;
        Response<ListMonitorEvaluationsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitorEvaluationsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMonitorEvaluationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMonitorEvaluations");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMonitorEvaluationsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListMonitorEvaluationsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of monitors created with the <a>CreateMonitor</a> operation and <a>CreateAutoPredictor</a>
     * operation. For each monitor resource, this operation returns of a summary of its properties, including its Amazon
     * Resource Name (ARN). You can retrieve a complete set of properties of a monitor resource by specify the monitor's
     * ARN in the <a>DescribeMonitor</a> operation.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return Result of the ListMonitors operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListMonitorsResult listMonitors(ListMonitorsRequest request) {
        request = beforeClientExecution(request);
        return executeListMonitors(request);
    }

    @SdkInternalApi
    final ListMonitorsResult executeListMonitors(ListMonitorsRequest listMonitorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listMonitorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListMonitorsRequest> request = null;
        Response<ListMonitorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListMonitorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listMonitorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListMonitors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListMonitorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListMonitorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of predictor backtest export jobs created using the <a>CreatePredictorBacktestExportJob</a>
     * operation. This operation returns a summary for each backtest export job. You can filter the list using an array
     * of <a>Filter</a> objects.
     * </p>
     * <p>
     * To retrieve the complete set of properties for a particular backtest export job, use the ARN with the
     * <a>DescribePredictorBacktestExportJob</a> operation.
     * </p>
     * 
     * @param listPredictorBacktestExportJobsRequest
     * @return Result of the ListPredictorBacktestExportJobs operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListPredictorBacktestExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListPredictorBacktestExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListPredictorBacktestExportJobsResult listPredictorBacktestExportJobs(ListPredictorBacktestExportJobsRequest request) {
        request = beforeClientExecution(request);
        return executeListPredictorBacktestExportJobs(request);
    }

    @SdkInternalApi
    final ListPredictorBacktestExportJobsResult executeListPredictorBacktestExportJobs(
            ListPredictorBacktestExportJobsRequest listPredictorBacktestExportJobsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPredictorBacktestExportJobsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPredictorBacktestExportJobsRequest> request = null;
        Response<ListPredictorBacktestExportJobsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPredictorBacktestExportJobsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listPredictorBacktestExportJobsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPredictorBacktestExportJobs");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPredictorBacktestExportJobsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListPredictorBacktestExportJobsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of predictors created using the <a>CreateAutoPredictor</a> or <a>CreatePredictor</a> operations.
     * For each predictor, this operation returns a summary of its properties, including its Amazon Resource Name (ARN).
     * </p>
     * <p>
     * You can retrieve the complete set of properties by using the ARN with the <a>DescribeAutoPredictor</a> and
     * <a>DescribePredictor</a> operations. You can filter the list using an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listPredictorsRequest
     * @return Result of the ListPredictors operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListPredictors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListPredictors" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ListPredictorsResult listPredictors(ListPredictorsRequest request) {
        request = beforeClientExecution(request);
        return executeListPredictors(request);
    }

    @SdkInternalApi
    final ListPredictorsResult executeListPredictors(ListPredictorsRequest listPredictorsRequest) {

        ExecutionContext executionContext = createExecutionContext(listPredictorsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPredictorsRequest> request = null;
        Response<ListPredictorsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPredictorsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listPredictorsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListPredictors");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListPredictorsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListPredictorsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Lists the tags for an Amazon Forecast resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Returns a list of what-if analyses created using the <a>CreateWhatIfAnalysis</a> operation. For each what-if
     * analysis, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the what-if analysis ARN with the <a>DescribeWhatIfAnalysis</a>
     * operation.
     * </p>
     * 
     * @param listWhatIfAnalysesRequest
     * @return Result of the ListWhatIfAnalyses operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListWhatIfAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfAnalyses" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListWhatIfAnalysesResult listWhatIfAnalyses(ListWhatIfAnalysesRequest request) {
        request = beforeClientExecution(request);
        return executeListWhatIfAnalyses(request);
    }

    @SdkInternalApi
    final ListWhatIfAnalysesResult executeListWhatIfAnalyses(ListWhatIfAnalysesRequest listWhatIfAnalysesRequest) {

        ExecutionContext executionContext = createExecutionContext(listWhatIfAnalysesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWhatIfAnalysesRequest> request = null;
        Response<ListWhatIfAnalysesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWhatIfAnalysesRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWhatIfAnalysesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWhatIfAnalyses");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWhatIfAnalysesResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWhatIfAnalysesResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of what-if forecast exports created using the <a>CreateWhatIfForecastExport</a> operation. For
     * each what-if forecast export, this operation returns a summary of its properties, including its Amazon Resource
     * Name (ARN). You can retrieve the complete set of properties by using the what-if forecast export ARN with the
     * <a>DescribeWhatIfForecastExport</a> operation.
     * </p>
     * 
     * @param listWhatIfForecastExportsRequest
     * @return Result of the ListWhatIfForecastExports operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListWhatIfForecastExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecastExports"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public ListWhatIfForecastExportsResult listWhatIfForecastExports(ListWhatIfForecastExportsRequest request) {
        request = beforeClientExecution(request);
        return executeListWhatIfForecastExports(request);
    }

    @SdkInternalApi
    final ListWhatIfForecastExportsResult executeListWhatIfForecastExports(ListWhatIfForecastExportsRequest listWhatIfForecastExportsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWhatIfForecastExportsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWhatIfForecastExportsRequest> request = null;
        Response<ListWhatIfForecastExportsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWhatIfForecastExportsRequestProtocolMarshaller(protocolFactory).marshall(super
                        .beforeMarshalling(listWhatIfForecastExportsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWhatIfForecastExports");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWhatIfForecastExportsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false),
                    new ListWhatIfForecastExportsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a list of what-if forecasts created using the <a>CreateWhatIfForecast</a> operation. For each what-if
     * forecast, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the what-if forecast ARN with the <a>DescribeWhatIfForecast</a>
     * operation.
     * </p>
     * 
     * @param listWhatIfForecastsRequest
     * @return Result of the ListWhatIfForecasts operation returned by the service.
     * @throws InvalidNextTokenException
     *         The token is not valid. Tokens expire after 24 hours.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.ListWhatIfForecasts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecasts" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public ListWhatIfForecastsResult listWhatIfForecasts(ListWhatIfForecastsRequest request) {
        request = beforeClientExecution(request);
        return executeListWhatIfForecasts(request);
    }

    @SdkInternalApi
    final ListWhatIfForecastsResult executeListWhatIfForecasts(ListWhatIfForecastsRequest listWhatIfForecastsRequest) {

        ExecutionContext executionContext = createExecutionContext(listWhatIfForecastsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListWhatIfForecastsRequest> request = null;
        Response<ListWhatIfForecastsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListWhatIfForecastsRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(listWhatIfForecastsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ListWhatIfForecasts");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ListWhatIfForecastsResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ListWhatIfForecastsResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Resumes a stopped monitor resource.
     * </p>
     * 
     * @param resumeResourceRequest
     * @return Result of the ResumeResource operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.ResumeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ResumeResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public ResumeResourceResult resumeResource(ResumeResourceRequest request) {
        request = beforeClientExecution(request);
        return executeResumeResource(request);
    }

    @SdkInternalApi
    final ResumeResourceResult executeResumeResource(ResumeResourceRequest resumeResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(resumeResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ResumeResourceRequest> request = null;
        Response<ResumeResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ResumeResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(resumeResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "ResumeResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<ResumeResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new ResumeResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Stops a resource.
     * </p>
     * <p>
     * The resource undergoes the following states: <code>CREATE_STOPPING</code> and <code>CREATE_STOPPED</code>. You
     * cannot resume a resource once it has been stopped.
     * </p>
     * <p>
     * This operation can be applied to the following resources (and their corresponding child resources):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Dataset Import Job
     * </p>
     * </li>
     * <li>
     * <p>
     * Predictor Job
     * </p>
     * </li>
     * <li>
     * <p>
     * Forecast Job
     * </p>
     * </li>
     * <li>
     * <p>
     * Forecast Export Job
     * </p>
     * </li>
     * <li>
     * <p>
     * Predictor Backtest Export Job
     * </p>
     * </li>
     * <li>
     * <p>
     * Explainability Job
     * </p>
     * </li>
     * <li>
     * <p>
     * Explainability Export Job
     * </p>
     * </li>
     * </ul>
     * 
     * @param stopResourceRequest
     * @return Result of the StopResource operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @sample AmazonForecast.StopResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/StopResource" target="_top">AWS API
     *      Documentation</a>
     */
    @Override
    public StopResourceResult stopResource(StopResourceRequest request) {
        request = beforeClientExecution(request);
        return executeStopResource(request);
    }

    @SdkInternalApi
    final StopResourceResult executeStopResource(StopResourceRequest stopResourceRequest) {

        ExecutionContext executionContext = createExecutionContext(stopResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopResourceRequest> request = null;
        Response<StopResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopResourceRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(stopResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "StopResource");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<StopResourceResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new StopResourceResultJsonUnmarshaller());
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws LimitExceededException
     *         The limit on the number of resources per account has been exceeded.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Deletes the specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @sample AmazonForecast.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/UntagResource" target="_top">AWS API
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
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
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
     * Replaces the datasets in a dataset group with the specified datasets.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before you can use the dataset group to
     * create a predictor. Use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation to get the status.
     * </p>
     * </note>
     * 
     * @param updateDatasetGroupRequest
     * @return Result of the UpdateDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @sample AmazonForecast.UpdateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/UpdateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public UpdateDatasetGroupResult updateDatasetGroup(UpdateDatasetGroupRequest request) {
        request = beforeClientExecution(request);
        return executeUpdateDatasetGroup(request);
    }

    @SdkInternalApi
    final UpdateDatasetGroupResult executeUpdateDatasetGroup(UpdateDatasetGroupRequest updateDatasetGroupRequest) {

        ExecutionContext executionContext = createExecutionContext(updateDatasetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDatasetGroupRequest> request = null;
        Response<UpdateDatasetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDatasetGroupRequestProtocolMarshaller(protocolFactory).marshall(super.beforeMarshalling(updateDatasetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
                request.addHandlerContext(HandlerContextKey.CLIENT_ENDPOINT, endpoint);
                request.addHandlerContext(HandlerContextKey.ENDPOINT_OVERRIDDEN, isEndpointOverridden());
                request.addHandlerContext(HandlerContextKey.SIGNING_REGION, getSigningRegion());
                request.addHandlerContext(HandlerContextKey.SERVICE_ID, "forecast");
                request.addHandlerContext(HandlerContextKey.OPERATION_NAME, "UpdateDatasetGroup");
                request.addHandlerContext(HandlerContextKey.ADVANCED_CONFIG, advancedConfig);

            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            HttpResponseHandler<AmazonWebServiceResponse<UpdateDatasetGroupResult>> responseHandler = protocolFactory.createResponseHandler(
                    new JsonOperationMetadata().withPayloadJson(true).withHasStreamingSuccessResponse(false), new UpdateDatasetGroupResultJsonUnmarshaller());
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
