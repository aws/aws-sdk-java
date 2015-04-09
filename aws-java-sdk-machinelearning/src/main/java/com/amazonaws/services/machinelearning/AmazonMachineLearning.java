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

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.machinelearning.model.*;

/**
 * Interface for accessing AmazonMachineLearning.
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 * </p>
 */
public interface AmazonMachineLearning {

    /**
     * Overrides the default endpoint for this client ("https://machinelearning.us-east-1.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "machinelearning.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://machinelearning.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "machinelearning.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://machinelearning.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AmazonMachineLearning#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
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
    public UpdateEvaluationResult updateEvaluation(UpdateEvaluationRequest updateEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public CreateMLModelResult createMLModel(CreateMLModelRequest createMLModelRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public CreateRealtimeEndpointResult createRealtimeEndpoint(CreateRealtimeEndpointRequest createRealtimeEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public CreateDataSourceFromS3Result createDataSourceFromS3(CreateDataSourceFromS3Request createDataSourceFromS3Request) 
            throws AmazonServiceException, AmazonClientException;

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
    public DeleteMLModelResult deleteMLModel(DeleteMLModelRequest deleteMLModelRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public PredictResult predict(PredictRequest predictRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DescribeBatchPredictionsResult describeBatchPredictions(DescribeBatchPredictionsRequest describeBatchPredictionsRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public GetEvaluationResult getEvaluation(GetEvaluationRequest getEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public UpdateMLModelResult updateMLModel(UpdateMLModelRequest updateMLModelRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DescribeDataSourcesResult describeDataSources(DescribeDataSourcesRequest describeDataSourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DeleteEvaluationResult deleteEvaluation(DeleteEvaluationRequest deleteEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public UpdateBatchPredictionResult updateBatchPrediction(UpdateBatchPredictionRequest updateBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public CreateBatchPredictionResult createBatchPrediction(CreateBatchPredictionRequest createBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DescribeMLModelsResult describeMLModels(DescribeMLModelsRequest describeMLModelsRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DeleteBatchPredictionResult deleteBatchPrediction(DeleteBatchPredictionRequest deleteBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public CreateDataSourceFromRDSResult createDataSourceFromRDS(CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public CreateDataSourceFromRedshiftResult createDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DescribeEvaluationsResult describeEvaluations(DescribeEvaluationsRequest describeEvaluationsRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public GetMLModelResult getMLModel(GetMLModelRequest getMLModelRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public GetBatchPredictionResult getBatchPrediction(GetBatchPredictionRequest getBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public CreateEvaluationResult createEvaluation(CreateEvaluationRequest createEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DeleteRealtimeEndpointResult deleteRealtimeEndpoint(DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

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
    public DescribeBatchPredictionsResult describeBatchPredictions() throws AmazonServiceException, AmazonClientException;
    
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
    public DescribeDataSourcesResult describeDataSources() throws AmazonServiceException, AmazonClientException;
    
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
    public DescribeMLModelsResult describeMLModels() throws AmazonServiceException, AmazonClientException;
    
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
    public DescribeEvaluationsResult describeEvaluations() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        