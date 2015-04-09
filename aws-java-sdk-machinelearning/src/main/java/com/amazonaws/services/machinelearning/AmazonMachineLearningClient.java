/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning;

import java.net.*;
import java.util.*;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.regions.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.json.*;

import com.amazonaws.services.machinelearning.model.*;
import com.amazonaws.services.machinelearning.model.transform.*;

/**
 * Client for accessing AmazonMachineLearning.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 * </p>
 */
public class AmazonMachineLearningClient extends AmazonWebServiceClient implements AmazonMachineLearning {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonMachineLearning.class);

    /**
     * List of exception unmarshallers for all AmazonMachineLearning exceptions.
     */
    protected List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    /**
     * Constructs a new client to invoke service methods on
     * AmazonMachineLearning.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonMachineLearningClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonMachineLearning.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonMachineLearning
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonMachineLearningClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public AmazonMachineLearningClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonMachineLearning
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonMachineLearningClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(adjustClientConfiguration(clientConfiguration));
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public AmazonMachineLearningClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonMachineLearning
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public AmazonMachineLearningClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on
     * AmazonMachineLearning using the specified AWS account credentials
     * provider, client configuration options and request metric collector.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to AmazonMachineLearning
     *                       (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector optional request metric collector
     */
    public AmazonMachineLearningClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }

    private void init() {
        jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshaller>();
        jsonErrorUnmarshallers.add(new PredictorNotMountedExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InvalidInputExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new IdempotentParameterMismatchExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        jsonErrorUnmarshallers.add(new InternalServerExceptionUnmarshaller());
        
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("machinelearning.us-east-1.amazonaws.com");
        
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/machinelearning/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/com/amazonaws/services/machinelearning/request.handler2s"));
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration orig) {
        ClientConfiguration config = orig;
        
        return config;
    }

    /**
     * <p>
     * Updates the <code>EvaluationName</code> of an <code>Evaluation</code>
     * .
     * </p>
     * <p>
     * You can use the GetEvaluation operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateEvaluationRequest Container for the necessary parameters
     *           to execute the UpdateEvaluation service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the UpdateEvaluation service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateEvaluationResult updateEvaluation(UpdateEvaluationRequest updateEvaluationRequest) {
        ExecutionContext executionContext = createExecutionContext(updateEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateEvaluationRequest> request = null;
        Response<UpdateEvaluationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateEvaluationRequestMarshaller().marshall(super.beforeMarshalling(updateEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateEvaluationResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateEvaluationResultJsonUnmarshaller();
            JsonResponseHandler<UpdateEvaluationResult> responseHandler =
                new JsonResponseHandler<UpdateEvaluationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new <code>MLModel</code> using the data files and the
     * recipe as information sources.
     * </p>
     * <p>
     * An <code>MLModel</code> is nearly immutable. Users can only update
     * the <code>MLModelName</code> and the <code>ScoreThreshold</code> in an
     * <code>MLModel</code> without creating a new <code>MLModel</code> .
     * </p>
     * <p>
     * <code>CreateMLModel</code> is an asynchronous operation. In response
     * to <code>CreateMLModel</code> , Amazon Machine Learning (Amazon ML)
     * immediately returns and sets the <code>MLModel</code> status to
     * <code>PENDING</code> . After the <code>MLModel</code> is created and
     * ready for use, Amazon ML sets the status to <code>COMPLETED</code> .
     * </p>
     * <p>
     * You can use the GetMLModel operation to check progress of the
     * <code>MLModel</code> during the creation operation.
     * </p>
     * <p>
     * CreateMLModel requires a <code>DataSource</code> with computed
     * statistics, which can be created by setting
     * <code>ComputeStatistics</code> to <code>true</code> in
     * CreateDataSourceFromRDS, CreateDataSourceFromS3, or
     * CreateDataSourceFromRedshift operations.
     * </p>
     *
     * @param createMLModelRequest Container for the necessary parameters to
     *           execute the CreateMLModel service method on AmazonMachineLearning.
     * 
     * @return The response from the CreateMLModel service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateMLModelResult createMLModel(CreateMLModelRequest createMLModelRequest) {
        ExecutionContext executionContext = createExecutionContext(createMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMLModelRequest> request = null;
        Response<CreateMLModelResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMLModelRequestMarshaller().marshall(super.beforeMarshalling(createMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateMLModelResult, JsonUnmarshallerContext> unmarshaller =
                new CreateMLModelResultJsonUnmarshaller();
            JsonResponseHandler<CreateMLModelResult> responseHandler =
                new JsonResponseHandler<CreateMLModelResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a real-time endpoint for the <code>MLModel</code> . The
     * endpoint contains the URI of the <code>MLModel</code> ; that is, the
     * location to send real-time prediction requests for the specified
     * <code>MLModel</code> .
     * </p>
     *
     * @param createRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the CreateRealtimeEndpoint service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the CreateRealtimeEndpoint service method,
     *         as returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateRealtimeEndpointResult createRealtimeEndpoint(CreateRealtimeEndpointRequest createRealtimeEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(createRealtimeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateRealtimeEndpointRequest> request = null;
        Response<CreateRealtimeEndpointResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateRealtimeEndpointRequestMarshaller().marshall(super.beforeMarshalling(createRealtimeEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateRealtimeEndpointResult, JsonUnmarshallerContext> unmarshaller =
                new CreateRealtimeEndpointResultJsonUnmarshaller();
            JsonResponseHandler<CreateRealtimeEndpointResult> responseHandler =
                new JsonResponseHandler<CreateRealtimeEndpointResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> object. A <code>DataSource</code>
     * references data that can be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromS3</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromS3</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     * <p>
     * The observation data used in a <code>DataSource</code> should be
     * ready to use; that is, it should have a consistent structure, and
     * missing data values should be kept to a minimum. The observation data
     * must reside in one or more CSV files in an Amazon Simple Storage
     * Service (Amazon S3) bucket, along with a schema that describes the
     * data items by name and type. The same schema must be used for all of
     * the data files referenced by the <code>DataSource</code> .
     * </p>
     * <p>
     * After the <code>DataSource</code> has been created, it's ready to use
     * in evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code> , the
     * <code>DataSource</code> requires another item: a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code> . A recipe describes how each input variable will
     * be used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable, or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the
     * <a href="http://docs.aws.amazon.com/machine-learning/latest/dg"> Amazon Machine Learning Developer Guide </a>
     * .
     * </p>
     *
     * @param createDataSourceFromS3Request Container for the necessary
     *           parameters to execute the CreateDataSourceFromS3 service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the CreateDataSourceFromS3 service method,
     *         as returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDataSourceFromS3Result createDataSourceFromS3(CreateDataSourceFromS3Request createDataSourceFromS3Request) {
        ExecutionContext executionContext = createExecutionContext(createDataSourceFromS3Request);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceFromS3Request> request = null;
        Response<CreateDataSourceFromS3Result> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceFromS3RequestMarshaller().marshall(super.beforeMarshalling(createDataSourceFromS3Request));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateDataSourceFromS3Result, JsonUnmarshallerContext> unmarshaller =
                new CreateDataSourceFromS3ResultJsonUnmarshaller();
            JsonResponseHandler<CreateDataSourceFromS3Result> responseHandler =
                new JsonResponseHandler<CreateDataSourceFromS3Result>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Assigns the DELETED status to an <code>MLModel</code> , rendering it
     * unusable.
     * </p>
     * <p>
     * After using the <code>DeleteMLModel</code> operation, you can use the
     * GetMLModel operation to verify that the status of the
     * <code>MLModel</code> changed to DELETED.
     * </p>
     * Caution The result of the DeleteMLModel operation is irreversible.
     *
     * @param deleteMLModelRequest Container for the necessary parameters to
     *           execute the DeleteMLModel service method on AmazonMachineLearning.
     * 
     * @return The response from the DeleteMLModel service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteMLModelResult deleteMLModel(DeleteMLModelRequest deleteMLModelRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteMLModelRequest> request = null;
        Response<DeleteMLModelResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteMLModelRequestMarshaller().marshall(super.beforeMarshalling(deleteMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteMLModelResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteMLModelResultJsonUnmarshaller();
            JsonResponseHandler<DeleteMLModelResult> responseHandler =
                new JsonResponseHandler<DeleteMLModelResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates a prediction for the observation using the specified
     * <code>MLModel</code> .
     * </p>
     * <p>
     * <b>NOTE:</b> Note Not all response parameters will be populated
     * because this is dependent on the type of requested model.
     * </p>
     *
     * @param predictRequest Container for the necessary parameters to
     *           execute the Predict service method on AmazonMachineLearning.
     * 
     * @return The response from the Predict service method, as returned by
     *         AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws PredictorNotMountedException
     * @throws LimitExceededException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PredictResult predict(PredictRequest predictRequest) {
        ExecutionContext executionContext = createExecutionContext(predictRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PredictRequest> request = null;
        Response<PredictResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PredictRequestMarshaller().marshall(super.beforeMarshalling(predictRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<PredictResult, JsonUnmarshallerContext> unmarshaller =
                new PredictResultJsonUnmarshaller();
            JsonResponseHandler<PredictResult> responseHandler =
                new JsonResponseHandler<PredictResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match
     * the search criteria in the request.
     * </p>
     *
     * @param describeBatchPredictionsRequest Container for the necessary
     *           parameters to execute the DescribeBatchPredictions service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DescribeBatchPredictions service method,
     *         as returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeBatchPredictionsResult describeBatchPredictions(DescribeBatchPredictionsRequest describeBatchPredictionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeBatchPredictionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeBatchPredictionsRequest> request = null;
        Response<DescribeBatchPredictionsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeBatchPredictionsRequestMarshaller().marshall(super.beforeMarshalling(describeBatchPredictionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeBatchPredictionsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeBatchPredictionsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeBatchPredictionsResult> responseHandler =
                new JsonResponseHandler<DescribeBatchPredictionsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as
     * the current status of the <code>Evaluation</code> .
     * </p>
     *
     * @param getEvaluationRequest Container for the necessary parameters to
     *           execute the GetEvaluation service method on AmazonMachineLearning.
     * 
     * @return The response from the GetEvaluation service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetEvaluationResult getEvaluation(GetEvaluationRequest getEvaluationRequest) {
        ExecutionContext executionContext = createExecutionContext(getEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetEvaluationRequest> request = null;
        Response<GetEvaluationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetEvaluationRequestMarshaller().marshall(super.beforeMarshalling(getEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetEvaluationResult, JsonUnmarshallerContext> unmarshaller =
                new GetEvaluationResultJsonUnmarshaller();
            JsonResponseHandler<GetEvaluationResult> responseHandler =
                new JsonResponseHandler<GetEvaluationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the <code>MLModelName</code> and the
     * <code>ScoreThreshold</code> of an <code>MLModel</code> .
     * </p>
     * <p>
     * You can use the GetMLModel operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateMLModelRequest Container for the necessary parameters to
     *           execute the UpdateMLModel service method on AmazonMachineLearning.
     * 
     * @return The response from the UpdateMLModel service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateMLModelResult updateMLModel(UpdateMLModelRequest updateMLModelRequest) {
        ExecutionContext executionContext = createExecutionContext(updateMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateMLModelRequest> request = null;
        Response<UpdateMLModelResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateMLModelRequestMarshaller().marshall(super.beforeMarshalling(updateMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateMLModelResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateMLModelResultJsonUnmarshaller();
            JsonResponseHandler<UpdateMLModelResult> responseHandler =
                new JsonResponseHandler<UpdateMLModelResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a <code>DataSource</code> that includes metadata and data
     * file information, as well as the current status of the
     * <code>DataSource</code> .
     * </p>
     * <p>
     * <code>GetDataSource</code> provides results in normal or verbose
     * format. The verbose format adds the schema description and the list of
     * files pointed to by the DataSource to the normal format.
     * </p>
     *
     * @param getDataSourceRequest Container for the necessary parameters to
     *           execute the GetDataSource service method on AmazonMachineLearning.
     * 
     * @return The response from the GetDataSource service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest) {
        ExecutionContext executionContext = createExecutionContext(getDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDataSourceRequest> request = null;
        Response<GetDataSourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDataSourceRequestMarshaller().marshall(super.beforeMarshalling(getDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetDataSourceResult, JsonUnmarshallerContext> unmarshaller =
                new GetDataSourceResultJsonUnmarshaller();
            JsonResponseHandler<GetDataSourceResult> responseHandler =
                new JsonResponseHandler<GetDataSourceResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search
     * criteria in the request.
     * </p>
     *
     * @param describeDataSourcesRequest Container for the necessary
     *           parameters to execute the DescribeDataSources service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DescribeDataSources service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDataSourcesResult describeDataSources(DescribeDataSourcesRequest describeDataSourcesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDataSourcesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDataSourcesRequest> request = null;
        Response<DescribeDataSourcesResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDataSourcesRequestMarshaller().marshall(super.beforeMarshalling(describeDataSourcesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeDataSourcesResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeDataSourcesResultJsonUnmarshaller();
            JsonResponseHandler<DescribeDataSourcesResult> responseHandler =
                new JsonResponseHandler<DescribeDataSourcesResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Assigns the <code>DELETED</code> status to an <code>Evaluation</code>
     * , rendering it unusable.
     * </p>
     * <p>
     * After invoking the <code>DeleteEvaluation</code> operation, you can
     * use the GetEvaluation operation to verify that the status of the
     * <code>Evaluation</code> changed to <code>DELETED</code> .
     * </p>
     * Caution The results of the DeleteEvaluation operation are
     * irreversible.
     *
     * @param deleteEvaluationRequest Container for the necessary parameters
     *           to execute the DeleteEvaluation service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DeleteEvaluation service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteEvaluationResult deleteEvaluation(DeleteEvaluationRequest deleteEvaluationRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEvaluationRequest> request = null;
        Response<DeleteEvaluationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEvaluationRequestMarshaller().marshall(super.beforeMarshalling(deleteEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteEvaluationResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteEvaluationResultJsonUnmarshaller();
            JsonResponseHandler<DeleteEvaluationResult> responseHandler =
                new JsonResponseHandler<DeleteEvaluationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the <code>BatchPredictionName</code> of a
     * <code>BatchPrediction</code> .
     * </p>
     * <p>
     * You can use the GetBatchPrediction operation to view the contents of
     * the updated data element.
     * </p>
     *
     * @param updateBatchPredictionRequest Container for the necessary
     *           parameters to execute the UpdateBatchPrediction service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the UpdateBatchPrediction service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateBatchPredictionResult updateBatchPrediction(UpdateBatchPredictionRequest updateBatchPredictionRequest) {
        ExecutionContext executionContext = createExecutionContext(updateBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateBatchPredictionRequest> request = null;
        Response<UpdateBatchPredictionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateBatchPredictionRequestMarshaller().marshall(super.beforeMarshalling(updateBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateBatchPredictionResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateBatchPredictionResultJsonUnmarshaller();
            JsonResponseHandler<UpdateBatchPredictionResult> responseHandler =
                new JsonResponseHandler<UpdateBatchPredictionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Generates predictions for a group of observations. The observations
     * to process exist in one or more data files referenced by a
     * <code>DataSource</code> . This operation creates a new
     * <code>BatchPrediction</code> , and uses an <code>MLModel</code> and
     * the data files referenced by the <code>DataSource</code> as
     * information sources.
     * </p>
     * <p>
     * <code>CreateBatchPrediction</code> is an asynchronous operation. In
     * response to <code>CreateBatchPrediction</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>BatchPrediction</code> status to <code>PENDING</code> . After
     * the <code>BatchPrediction</code> completes, Amazon ML sets the status
     * to <code>COMPLETED</code> .
     * </p>
     * <p>
     * You can poll for status updates by using the GetBatchPrediction
     * operation and checking the <code>Status</code> parameter of the
     * result. After the <code>COMPLETED</code> status appears, the results
     * are available in the location specified by the <code>OutputUri</code>
     * parameter.
     * </p>
     *
     * @param createBatchPredictionRequest Container for the necessary
     *           parameters to execute the CreateBatchPrediction service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the CreateBatchPrediction service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateBatchPredictionResult createBatchPrediction(CreateBatchPredictionRequest createBatchPredictionRequest) {
        ExecutionContext executionContext = createExecutionContext(createBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateBatchPredictionRequest> request = null;
        Response<CreateBatchPredictionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateBatchPredictionRequestMarshaller().marshall(super.beforeMarshalling(createBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateBatchPredictionResult, JsonUnmarshallerContext> unmarshaller =
                new CreateBatchPredictionResultJsonUnmarshaller();
            JsonResponseHandler<CreateBatchPredictionResult> responseHandler =
                new JsonResponseHandler<CreateBatchPredictionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria
     * in the request.
     * </p>
     *
     * @param describeMLModelsRequest Container for the necessary parameters
     *           to execute the DescribeMLModels service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DescribeMLModels service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMLModelsResult describeMLModels(DescribeMLModelsRequest describeMLModelsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeMLModelsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeMLModelsRequest> request = null;
        Response<DescribeMLModelsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeMLModelsRequestMarshaller().marshall(super.beforeMarshalling(describeMLModelsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeMLModelsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeMLModelsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeMLModelsResult> responseHandler =
                new JsonResponseHandler<DescribeMLModelsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Assigns the DELETED status to a <code>BatchPrediction</code> ,
     * rendering it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteBatchPrediction</code> operation, you can
     * use the GetBatchPrediction operation to verify that the status of the
     * <code>BatchPrediction</code> changed to DELETED.
     * </p>
     * Caution The result of the DeleteBatchPrediction operation is
     * irreversible.
     *
     * @param deleteBatchPredictionRequest Container for the necessary
     *           parameters to execute the DeleteBatchPrediction service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DeleteBatchPrediction service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteBatchPredictionResult deleteBatchPrediction(DeleteBatchPredictionRequest deleteBatchPredictionRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteBatchPredictionRequest> request = null;
        Response<DeleteBatchPredictionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteBatchPredictionRequestMarshaller().marshall(super.beforeMarshalling(deleteBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteBatchPredictionResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteBatchPredictionResultJsonUnmarshaller();
            JsonResponseHandler<DeleteBatchPredictionResult> responseHandler =
                new JsonResponseHandler<DeleteBatchPredictionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Updates the <code>DataSourceName</code> of a <code>DataSource</code>
     * .
     * </p>
     * <p>
     * You can use the GetDataSource operation to view the contents of the
     * updated data element.
     * </p>
     *
     * @param updateDataSourceRequest Container for the necessary parameters
     *           to execute the UpdateDataSource service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the UpdateDataSource service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest) {
        ExecutionContext executionContext = createExecutionContext(updateDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateDataSourceRequest> request = null;
        Response<UpdateDataSourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateDataSourceRequestMarshaller().marshall(super.beforeMarshalling(updateDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<UpdateDataSourceResult, JsonUnmarshallerContext> unmarshaller =
                new UpdateDataSourceResultJsonUnmarshaller();
            JsonResponseHandler<UpdateDataSourceResult> responseHandler =
                new JsonResponseHandler<UpdateDataSourceResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> object from an
     * <a href="http://aws.amazon.com/rds/"> Amazon Relational Database Service </a>
     * (Amazon RDS). A <code>DataSource</code> references data that can be
     * used to perform CreateMLModel, CreateEvaluation, or
     * CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRDS</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromRDS</code> , Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     *
     * @param createDataSourceFromRDSRequest Container for the necessary
     *           parameters to execute the CreateDataSourceFromRDS service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the CreateDataSourceFromRDS service method,
     *         as returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDataSourceFromRDSResult createDataSourceFromRDS(CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest) {
        ExecutionContext executionContext = createExecutionContext(createDataSourceFromRDSRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceFromRDSRequest> request = null;
        Response<CreateDataSourceFromRDSResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceFromRDSRequestMarshaller().marshall(super.beforeMarshalling(createDataSourceFromRDSRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateDataSourceFromRDSResult, JsonUnmarshallerContext> unmarshaller =
                new CreateDataSourceFromRDSResultJsonUnmarshaller();
            JsonResponseHandler<CreateDataSourceFromRDSResult> responseHandler =
                new JsonResponseHandler<CreateDataSourceFromRDSResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a <code>DataSource</code> from
     * <a href="http://aws.amazon.com/redshift/"> Amazon Redshift </a>
     * . A <code>DataSource</code> references data that can be used to
     * perform either CreateMLModel, CreateEvaluation or
     * CreateBatchPrediction operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRedshift</code> is an asynchronous
     * operation. In response to <code>CreateDataSourceFromRedshift</code> ,
     * Amazon Machine Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code> . After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets
     * the <code>Status</code> parameter to <code>COMPLETED</code> .
     * <code>DataSource</code> in <code>COMPLETED</code> or
     * <code>PENDING</code> status can only be used to perform CreateMLModel,
     * CreateEvaluation, or CreateBatchPrediction operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * GetDataSource operation response.
     * </p>
     * <p>
     * The observations should exist in the database hosted on an Amazon
     * Redshift cluster and should be specified by a
     * <code>SelectSqlQuery</code> . Amazon ML executes
     * <a href="http://docs.aws.amazon.com/redshift/latest/dg/t_Unloading_tables.html"> Unload </a>
     * command in Amazon Redshift to transfer the result set of
     * <code>SelectSqlQuery</code> to <code>S3StagingLocation.</code>
     * </p>
     * <p>
     * After the <code>DataSource</code> is created, it's ready for use in
     * evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code> , the
     * <code>DataSource</code> requires another item -- a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code> . A recipe describes how each input variable will
     * be used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the
     * Amazon Machine Learning Developer Guide.
     * </p>
     *
     * @param createDataSourceFromRedshiftRequest Container for the necessary
     *           parameters to execute the CreateDataSourceFromRedshift service method
     *           on AmazonMachineLearning.
     * 
     * @return The response from the CreateDataSourceFromRedshift service
     *         method, as returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDataSourceFromRedshiftResult createDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest) {
        ExecutionContext executionContext = createExecutionContext(createDataSourceFromRedshiftRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDataSourceFromRedshiftRequest> request = null;
        Response<CreateDataSourceFromRedshiftResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDataSourceFromRedshiftRequestMarshaller().marshall(super.beforeMarshalling(createDataSourceFromRedshiftRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateDataSourceFromRedshiftResult, JsonUnmarshallerContext> unmarshaller =
                new CreateDataSourceFromRedshiftResultJsonUnmarshaller();
            JsonResponseHandler<CreateDataSourceFromRedshiftResult> responseHandler =
                new JsonResponseHandler<CreateDataSourceFromRedshiftResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the
     * search criteria in the request.
     * </p>
     *
     * @param describeEvaluationsRequest Container for the necessary
     *           parameters to execute the DescribeEvaluations service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DescribeEvaluations service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEvaluationsResult describeEvaluations(DescribeEvaluationsRequest describeEvaluationsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEvaluationsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEvaluationsRequest> request = null;
        Response<DescribeEvaluationsResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEvaluationsRequestMarshaller().marshall(super.beforeMarshalling(describeEvaluationsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DescribeEvaluationsResult, JsonUnmarshallerContext> unmarshaller =
                new DescribeEvaluationsResultJsonUnmarshaller();
            JsonResponseHandler<DescribeEvaluationsResult> responseHandler =
                new JsonResponseHandler<DescribeEvaluationsResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns an <code>MLModel</code> that includes detailed metadata, and
     * data source information as well as the current status of the
     * <code>MLModel</code> .
     * </p>
     * <p>
     * <code>GetMLModel</code> provides results in normal or verbose format.
     * </p>
     *
     * @param getMLModelRequest Container for the necessary parameters to
     *           execute the GetMLModel service method on AmazonMachineLearning.
     * 
     * @return The response from the GetMLModel service method, as returned
     *         by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetMLModelResult getMLModel(GetMLModelRequest getMLModelRequest) {
        ExecutionContext executionContext = createExecutionContext(getMLModelRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetMLModelRequest> request = null;
        Response<GetMLModelResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetMLModelRequestMarshaller().marshall(super.beforeMarshalling(getMLModelRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetMLModelResult, JsonUnmarshallerContext> unmarshaller =
                new GetMLModelResultJsonUnmarshaller();
            JsonResponseHandler<GetMLModelResult> responseHandler =
                new JsonResponseHandler<GetMLModelResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Assigns the DELETED status to a <code>DataSource</code> , rendering
     * it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteDataSource</code> operation, you can use
     * the GetDataSource operation to verify that the status of the
     * <code>DataSource</code> changed to DELETED.
     * </p>
     * Caution The results of the DeleteDataSource operation are
     * irreversible.
     *
     * @param deleteDataSourceRequest Container for the necessary parameters
     *           to execute the DeleteDataSource service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DeleteDataSource service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDataSourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDataSourceRequest> request = null;
        Response<DeleteDataSourceResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDataSourceRequestMarshaller().marshall(super.beforeMarshalling(deleteDataSourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteDataSourceResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteDataSourceResultJsonUnmarshaller();
            JsonResponseHandler<DeleteDataSourceResult> responseHandler =
                new JsonResponseHandler<DeleteDataSourceResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed
     * metadata, status, and data file information for a <code>Batch
     * Prediction</code> request.
     * </p>
     *
     * @param getBatchPredictionRequest Container for the necessary
     *           parameters to execute the GetBatchPrediction service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the GetBatchPrediction service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetBatchPredictionResult getBatchPrediction(GetBatchPredictionRequest getBatchPredictionRequest) {
        ExecutionContext executionContext = createExecutionContext(getBatchPredictionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetBatchPredictionRequest> request = null;
        Response<GetBatchPredictionResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetBatchPredictionRequestMarshaller().marshall(super.beforeMarshalling(getBatchPredictionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<GetBatchPredictionResult, JsonUnmarshallerContext> unmarshaller =
                new GetBatchPredictionResultJsonUnmarshaller();
            JsonResponseHandler<GetBatchPredictionResult> responseHandler =
                new JsonResponseHandler<GetBatchPredictionResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Creates a new <code>Evaluation</code> of an <code>MLModel</code> . An
     * <code>MLModel</code> is evaluated on a set of observations associated
     * to a <code>DataSource</code> . Like a <code>DataSource</code> for an
     * <code>MLModel</code> , the <code>DataSource</code> for an
     * <code>Evaluation</code> contains values for the Target Variable. The
     * <code>Evaluation</code> compares the predicted result for each
     * observation to the actual outcome and provides a summary so that you
     * know how effective the <code>MLModel</code> functions on the test
     * data. Evaluation generates a relevant performance metric such as
     * BinaryAUC, RegressionRMSE or MulticlassAvgFScore based on the
     * corresponding <code>MLModelType</code> : <code>BINARY</code> ,
     * <code>REGRESSION</code> or <code>MULTICLASS</code> .
     * </p>
     * <p>
     * <code>CreateEvaluation</code> is an asynchronous operation. In
     * response to <code>CreateEvaluation</code> , Amazon Machine Learning
     * (Amazon ML) immediately returns and sets the evaluation status to
     * <code>PENDING</code> . After the <code>Evaluation</code> is created
     * and ready for use, Amazon ML sets the status to <code>COMPLETED</code>
     * .
     * </p>
     * <p>
     * You can use the GetEvaluation operation to check progress of the
     * evaluation during the creation operation.
     * </p>
     *
     * @param createEvaluationRequest Container for the necessary parameters
     *           to execute the CreateEvaluation service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the CreateEvaluation service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws IdempotentParameterMismatchException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateEvaluationResult createEvaluation(CreateEvaluationRequest createEvaluationRequest) {
        ExecutionContext executionContext = createExecutionContext(createEvaluationRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEvaluationRequest> request = null;
        Response<CreateEvaluationResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEvaluationRequestMarshaller().marshall(super.beforeMarshalling(createEvaluationRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<CreateEvaluationResult, JsonUnmarshallerContext> unmarshaller =
                new CreateEvaluationResultJsonUnmarshaller();
            JsonResponseHandler<CreateEvaluationResult> responseHandler =
                new JsonResponseHandler<CreateEvaluationResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code> .
     * </p>
     *
     * @param deleteRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the DeleteRealtimeEndpoint service method on
     *           AmazonMachineLearning.
     * 
     * @return The response from the DeleteRealtimeEndpoint service method,
     *         as returned by AmazonMachineLearning.
     * 
     * @throws ResourceNotFoundException
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteRealtimeEndpointResult deleteRealtimeEndpoint(DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteRealtimeEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteRealtimeEndpointRequest> request = null;
        Response<DeleteRealtimeEndpointResult> response = null;
        
        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteRealtimeEndpointRequestMarshaller().marshall(super.beforeMarshalling(deleteRealtimeEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            Unmarshaller<DeleteRealtimeEndpointResult, JsonUnmarshallerContext> unmarshaller =
                new DeleteRealtimeEndpointResultJsonUnmarshaller();
            JsonResponseHandler<DeleteRealtimeEndpointResult> responseHandler =
                new JsonResponseHandler<DeleteRealtimeEndpointResult>(unmarshaller);

            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();
        } finally {
            
            endClientExecution(awsRequestMetrics, request, response, LOGGING_AWS_REQUEST_METRIC);
        }
    }

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match
     * the search criteria in the request.
     * </p>
     * 
     * @return The response from the DescribeBatchPredictions service method,
     *         as returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeBatchPredictionsResult describeBatchPredictions() throws AmazonServiceException, AmazonClientException {
        return describeBatchPredictions(new DescribeBatchPredictionsRequest());
    }
    
    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search
     * criteria in the request.
     * </p>
     * 
     * @return The response from the DescribeDataSources service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeDataSourcesResult describeDataSources() throws AmazonServiceException, AmazonClientException {
        return describeDataSources(new DescribeDataSourcesRequest());
    }
    
    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria
     * in the request.
     * </p>
     * 
     * @return The response from the DescribeMLModels service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeMLModelsResult describeMLModels() throws AmazonServiceException, AmazonClientException {
        return describeMLModels(new DescribeMLModelsRequest());
    }
    
    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the
     * search criteria in the request.
     * </p>
     * 
     * @return The response from the DescribeEvaluations service method, as
     *         returned by AmazonMachineLearning.
     * 
     * @throws InvalidInputException
     * @throws InternalServerException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeEvaluationsResult describeEvaluations() throws AmazonServiceException, AmazonClientException {
        return describeEvaluations(new DescribeEvaluationsRequest());
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        super.setEndpoint(endpoint, serviceName, regionId);
    }

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(jsonErrorUnmarshallers);
        Response<X> result = client.execute(request, responseHandler,
                errorResponseHandler, executionContext);
        return result;
    }
}
        