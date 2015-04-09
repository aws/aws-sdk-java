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

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.machinelearning.model.*;

/**
 * Interface for accessing AmazonMachineLearning asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 * </p>
 */
public interface AmazonMachineLearningAsync extends AmazonMachineLearning {
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
     *           to execute the UpdateEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateEvaluationResult> updateEvaluationAsync(UpdateEvaluationRequest updateEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException;

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
     *           to execute the UpdateEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateEvaluationResult> updateEvaluationAsync(UpdateEvaluationRequest updateEvaluationRequest,
            AsyncHandler<UpdateEvaluationRequest, UpdateEvaluationResult> asyncHandler)
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
     *           execute the CreateMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateMLModelResult> createMLModelAsync(CreateMLModelRequest createMLModelRequest) 
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
     *           execute the CreateMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateMLModelResult> createMLModelAsync(CreateMLModelRequest createMLModelRequest,
            AsyncHandler<CreateMLModelRequest, CreateMLModelResult> asyncHandler)
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
     *           parameters to execute the CreateRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(CreateRealtimeEndpointRequest createRealtimeEndpointRequest) 
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
     *           parameters to execute the CreateRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(CreateRealtimeEndpointRequest createRealtimeEndpointRequest,
            AsyncHandler<CreateRealtimeEndpointRequest, CreateRealtimeEndpointResult> asyncHandler)
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
     *           parameters to execute the CreateDataSourceFromS3 operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromS3 service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(CreateDataSourceFromS3Request createDataSourceFromS3Request) 
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
     *           parameters to execute the CreateDataSourceFromS3 operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromS3 service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(CreateDataSourceFromS3Request createDataSourceFromS3Request,
            AsyncHandler<CreateDataSourceFromS3Request, CreateDataSourceFromS3Result> asyncHandler)
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
     *           execute the DeleteMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteMLModelResult> deleteMLModelAsync(DeleteMLModelRequest deleteMLModelRequest) 
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
     *           execute the DeleteMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteMLModelResult> deleteMLModelAsync(DeleteMLModelRequest deleteMLModelRequest,
            AsyncHandler<DeleteMLModelRequest, DeleteMLModelResult> asyncHandler)
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
     *           execute the Predict operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the Predict
     *         service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PredictResult> predictAsync(PredictRequest predictRequest) 
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
     *           execute the Predict operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the Predict
     *         service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<PredictResult> predictAsync(PredictRequest predictRequest,
            AsyncHandler<PredictRequest, PredictResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match
     * the search criteria in the request.
     * </p>
     *
     * @param describeBatchPredictionsRequest Container for the necessary
     *           parameters to execute the DescribeBatchPredictions operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBatchPredictions service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(DescribeBatchPredictionsRequest describeBatchPredictionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match
     * the search criteria in the request.
     * </p>
     *
     * @param describeBatchPredictionsRequest Container for the necessary
     *           parameters to execute the DescribeBatchPredictions operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBatchPredictions service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(DescribeBatchPredictionsRequest describeBatchPredictionsRequest,
            AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as
     * the current status of the <code>Evaluation</code> .
     * </p>
     *
     * @param getEvaluationRequest Container for the necessary parameters to
     *           execute the GetEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEvaluationResult> getEvaluationAsync(GetEvaluationRequest getEvaluationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as
     * the current status of the <code>Evaluation</code> .
     * </p>
     *
     * @param getEvaluationRequest Container for the necessary parameters to
     *           execute the GetEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetEvaluationResult> getEvaluationAsync(GetEvaluationRequest getEvaluationRequest,
            AsyncHandler<GetEvaluationRequest, GetEvaluationResult> asyncHandler)
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
     *           execute the UpdateMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMLModelResult> updateMLModelAsync(UpdateMLModelRequest updateMLModelRequest) 
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
     *           execute the UpdateMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMLModelResult> updateMLModelAsync(UpdateMLModelRequest updateMLModelRequest,
            AsyncHandler<UpdateMLModelRequest, UpdateMLModelResult> asyncHandler)
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
     *           execute the GetDataSource operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest) 
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
     *           execute the GetDataSource operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDataSourceResult> getDataSourceAsync(GetDataSourceRequest getDataSourceRequest,
            AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search
     * criteria in the request.
     * </p>
     *
     * @param describeDataSourcesRequest Container for the necessary
     *           parameters to execute the DescribeDataSources operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataSources service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDataSourcesResult> describeDataSourcesAsync(DescribeDataSourcesRequest describeDataSourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search
     * criteria in the request.
     * </p>
     *
     * @param describeDataSourcesRequest Container for the necessary
     *           parameters to execute the DescribeDataSources operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeDataSources service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeDataSourcesResult> describeDataSourcesAsync(DescribeDataSourcesRequest describeDataSourcesRequest,
            AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler)
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
     *           to execute the DeleteEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteEvaluationResult> deleteEvaluationAsync(DeleteEvaluationRequest deleteEvaluationRequest) 
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
     *           to execute the DeleteEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteEvaluationResult> deleteEvaluationAsync(DeleteEvaluationRequest deleteEvaluationRequest,
            AsyncHandler<DeleteEvaluationRequest, DeleteEvaluationResult> asyncHandler)
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
     *           parameters to execute the UpdateBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(UpdateBatchPredictionRequest updateBatchPredictionRequest) 
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
     *           parameters to execute the UpdateBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(UpdateBatchPredictionRequest updateBatchPredictionRequest,
            AsyncHandler<UpdateBatchPredictionRequest, UpdateBatchPredictionResult> asyncHandler)
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
     *           parameters to execute the CreateBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateBatchPredictionResult> createBatchPredictionAsync(CreateBatchPredictionRequest createBatchPredictionRequest) 
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
     *           parameters to execute the CreateBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateBatchPredictionResult> createBatchPredictionAsync(CreateBatchPredictionRequest createBatchPredictionRequest,
            AsyncHandler<CreateBatchPredictionRequest, CreateBatchPredictionResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria
     * in the request.
     * </p>
     *
     * @param describeMLModelsRequest Container for the necessary parameters
     *           to execute the DescribeMLModels operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMLModels service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMLModelsResult> describeMLModelsAsync(DescribeMLModelsRequest describeMLModelsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria
     * in the request.
     * </p>
     *
     * @param describeMLModelsRequest Container for the necessary parameters
     *           to execute the DescribeMLModels operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMLModels service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMLModelsResult> describeMLModelsAsync(DescribeMLModelsRequest describeMLModelsRequest,
            AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler)
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
     *           parameters to execute the DeleteBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(DeleteBatchPredictionRequest deleteBatchPredictionRequest) 
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
     *           parameters to execute the DeleteBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(DeleteBatchPredictionRequest deleteBatchPredictionRequest,
            AsyncHandler<DeleteBatchPredictionRequest, DeleteBatchPredictionResult> asyncHandler)
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
     *           to execute the UpdateDataSource operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest) 
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
     *           to execute the UpdateDataSource operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDataSourceResult> updateDataSourceAsync(UpdateDataSourceRequest updateDataSourceRequest,
            AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler)
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
     *           parameters to execute the CreateDataSourceFromRDS operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRDS service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest) 
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
     *           parameters to execute the CreateDataSourceFromRDS operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRDS service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest,
            AsyncHandler<CreateDataSourceFromRDSRequest, CreateDataSourceFromRDSResult> asyncHandler)
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
     *           parameters to execute the CreateDataSourceFromRedshift operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRedshift service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest) 
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
     *           parameters to execute the CreateDataSourceFromRedshift operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateDataSourceFromRedshift service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest,
            AsyncHandler<CreateDataSourceFromRedshiftRequest, CreateDataSourceFromRedshiftResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the
     * search criteria in the request.
     * </p>
     *
     * @param describeEvaluationsRequest Container for the necessary
     *           parameters to execute the DescribeEvaluations operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvaluations service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEvaluationsResult> describeEvaluationsAsync(DescribeEvaluationsRequest describeEvaluationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the
     * search criteria in the request.
     * </p>
     *
     * @param describeEvaluationsRequest Container for the necessary
     *           parameters to execute the DescribeEvaluations operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeEvaluations service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeEvaluationsResult> describeEvaluationsAsync(DescribeEvaluationsRequest describeEvaluationsRequest,
            AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler)
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
     *           execute the GetMLModel operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetMLModelResult> getMLModelAsync(GetMLModelRequest getMLModelRequest) 
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
     *           execute the GetMLModel operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetMLModel service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetMLModelResult> getMLModelAsync(GetMLModelRequest getMLModelRequest,
            AsyncHandler<GetMLModelRequest, GetMLModelResult> asyncHandler)
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
     *           to execute the DeleteDataSource operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest) 
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
     *           to execute the DeleteDataSource operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteDataSource service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteDataSourceResult> deleteDataSourceAsync(DeleteDataSourceRequest deleteDataSourceRequest,
            AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed
     * metadata, status, and data file information for a <code>Batch
     * Prediction</code> request.
     * </p>
     *
     * @param getBatchPredictionRequest Container for the necessary
     *           parameters to execute the GetBatchPrediction operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         GetBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetBatchPredictionResult> getBatchPredictionAsync(GetBatchPredictionRequest getBatchPredictionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed
     * metadata, status, and data file information for a <code>Batch
     * Prediction</code> request.
     * </p>
     *
     * @param getBatchPredictionRequest Container for the necessary
     *           parameters to execute the GetBatchPrediction operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         GetBatchPrediction service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetBatchPredictionResult> getBatchPredictionAsync(GetBatchPredictionRequest getBatchPredictionRequest,
            AsyncHandler<GetBatchPredictionRequest, GetBatchPredictionResult> asyncHandler)
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
     *           to execute the CreateEvaluation operation on AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateEvaluationResult> createEvaluationAsync(CreateEvaluationRequest createEvaluationRequest) 
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
     *           to execute the CreateEvaluation operation on AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateEvaluation service method, as returned by AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateEvaluationResult> createEvaluationAsync(CreateEvaluationRequest createEvaluationRequest,
            AsyncHandler<CreateEvaluationRequest, CreateEvaluationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code> .
     * </p>
     *
     * @param deleteRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the DeleteRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code> .
     * </p>
     *
     * @param deleteRealtimeEndpointRequest Container for the necessary
     *           parameters to execute the DeleteRealtimeEndpoint operation on
     *           AmazonMachineLearning.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteRealtimeEndpoint service method, as returned by
     *         AmazonMachineLearning.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonMachineLearning indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest,
            AsyncHandler<DeleteRealtimeEndpointRequest, DeleteRealtimeEndpointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;
}
        