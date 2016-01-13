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
package com.amazonaws.services.machinelearning;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.machinelearning.model.*;

/**
 * Interface for accessing Amazon Machine Learning.
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 */
public interface AmazonMachineLearning {

    /**
     * Overrides the default endpoint for this client
     * ("https://machinelearning.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "machinelearning.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://machinelearning.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "machinelearning.us-east-1.amazonaws.com") or a
     *        full URL, including the protocol (ex:
     *        "https://machinelearning.us-east-1.amazonaws.com") of the region
     *        specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonMachineLearning#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
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
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Generates predictions for a group of observations. The observations to
     * process exist in one or more data files referenced by a
     * <code>DataSource</code>. This operation creates a new
     * <code>BatchPrediction</code>, and uses an <code>MLModel</code> and the
     * data files referenced by the <code>DataSource</code> as information
     * sources.
     * </p>
     * <p>
     * <code>CreateBatchPrediction</code> is an asynchronous operation. In
     * response to <code>CreateBatchPrediction</code>, Amazon Machine Learning
     * (Amazon ML) immediately returns and sets the <code>BatchPrediction</code>
     * status to <code>PENDING</code>. After the <code>BatchPrediction</code>
     * completes, Amazon ML sets the status to <code>COMPLETED</code>.
     * </p>
     * <p>
     * You can poll for status updates by using the <a>GetBatchPrediction</a>
     * operation and checking the <code>Status</code> parameter of the result.
     * After the <code>COMPLETED</code> status appears, the results are
     * available in the location specified by the <code>OutputUri</code>
     * parameter.
     * </p>
     * 
     * @param createBatchPredictionRequest
     * @return Result of the CreateBatchPrediction operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This
     *         can result from retrying a request using a parameter that was not
     *         present in the original request.
     * @sample AmazonMachineLearning.CreateBatchPrediction
     */
    CreateBatchPredictionResult createBatchPrediction(
            CreateBatchPredictionRequest createBatchPredictionRequest);

    /**
     * <p>
     * Creates a <code>DataSource</code> object from an <a
     * href="http://aws.amazon.com/rds/"> Amazon Relational Database Service</a>
     * (Amazon RDS). A <code>DataSource</code> references data that can be used
     * to perform <a>CreateMLModel</a>, <a>CreateEvaluation</a>, or
     * <a>CreateBatchPrediction</a> operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRDS</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromRDS</code>, Amazon Machine Learning
     * (Amazon ML) immediately returns and sets the <code>DataSource</code>
     * status to <code>PENDING</code>. After the <code>DataSource</code> is
     * created and ready for use, Amazon ML sets the <code>Status</code>
     * parameter to <code>COMPLETED</code>. <code>DataSource</code> in
     * <code>COMPLETED</code> or <code>PENDING</code> status can only be used to
     * perform <a>CreateMLModel</a>, <a>CreateEvaluation</a>, or
     * <a>CreateBatchPrediction</a> operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * <a>GetDataSource</a> operation response.
     * </p>
     * 
     * @param createDataSourceFromRDSRequest
     * @return Result of the CreateDataSourceFromRDS operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This
     *         can result from retrying a request using a parameter that was not
     *         present in the original request.
     * @sample AmazonMachineLearning.CreateDataSourceFromRDS
     */
    CreateDataSourceFromRDSResult createDataSourceFromRDS(
            CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest);

    /**
     * <p>
     * Creates a <code>DataSource</code> from <a
     * href="http://aws.amazon.com/redshift/">Amazon Redshift</a>. A
     * <code>DataSource</code> references data that can be used to perform
     * either <a>CreateMLModel</a>, <a>CreateEvaluation</a> or
     * <a>CreateBatchPrediction</a> operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromRedshift</code> is an asynchronous operation.
     * In response to <code>CreateDataSourceFromRedshift</code>, Amazon Machine
     * Learning (Amazon ML) immediately returns and sets the
     * <code>DataSource</code> status to <code>PENDING</code>. After the
     * <code>DataSource</code> is created and ready for use, Amazon ML sets the
     * <code>Status</code> parameter to <code>COMPLETED</code>.
     * <code>DataSource</code> in <code>COMPLETED</code> or <code>PENDING</code>
     * status can only be used to perform <a>CreateMLModel</a>,
     * <a>CreateEvaluation</a>, or <a>CreateBatchPrediction</a> operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * <a>GetDataSource</a> operation response.
     * </p>
     * <p>
     * The observations should exist in the database hosted on an Amazon
     * Redshift cluster and should be specified by a <code>SelectSqlQuery</code>
     * . Amazon ML executes <a href=
     * "http://docs.aws.amazon.com/redshift/latest/dg/t_Unloading_tables.html">
     * Unload</a> command in Amazon Redshift to transfer the result set of
     * <code>SelectSqlQuery</code> to <code>S3StagingLocation.</code>
     * </p>
     * <p>
     * After the <code>DataSource</code> is created, it's ready for use in
     * evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code>, the
     * <code>DataSource</code> requires another item -- a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code>. A recipe describes how each input variable will be
     * used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the Amazon
     * Machine Learning Developer Guide.
     * </p>
     * 
     * @param createDataSourceFromRedshiftRequest
     * @return Result of the CreateDataSourceFromRedshift operation returned by
     *         the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This
     *         can result from retrying a request using a parameter that was not
     *         present in the original request.
     * @sample AmazonMachineLearning.CreateDataSourceFromRedshift
     */
    CreateDataSourceFromRedshiftResult createDataSourceFromRedshift(
            CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest);

    /**
     * <p>
     * Creates a <code>DataSource</code> object. A <code>DataSource</code>
     * references data that can be used to perform <a>CreateMLModel</a>,
     * <a>CreateEvaluation</a>, or <a>CreateBatchPrediction</a> operations.
     * </p>
     * <p>
     * <code>CreateDataSourceFromS3</code> is an asynchronous operation. In
     * response to <code>CreateDataSourceFromS3</code>, Amazon Machine Learning
     * (Amazon ML) immediately returns and sets the <code>DataSource</code>
     * status to <code>PENDING</code>. After the <code>DataSource</code> is
     * created and ready for use, Amazon ML sets the <code>Status</code>
     * parameter to <code>COMPLETED</code>. <code>DataSource</code> in
     * <code>COMPLETED</code> or <code>PENDING</code> status can only be used to
     * perform <a>CreateMLModel</a>, <a>CreateEvaluation</a> or
     * <a>CreateBatchPrediction</a> operations.
     * </p>
     * <p>
     * If Amazon ML cannot accept the input source, it sets the
     * <code>Status</code> parameter to <code>FAILED</code> and includes an
     * error message in the <code>Message</code> attribute of the
     * <a>GetDataSource</a> operation response.
     * </p>
     * <p>
     * The observation data used in a <code>DataSource</code> should be ready to
     * use; that is, it should have a consistent structure, and missing data
     * values should be kept to a minimum. The observation data must reside in
     * one or more CSV files in an Amazon Simple Storage Service (Amazon S3)
     * bucket, along with a schema that describes the data items by name and
     * type. The same schema must be used for all of the data files referenced
     * by the <code>DataSource</code>.
     * </p>
     * <p>
     * After the <code>DataSource</code> has been created, it's ready to use in
     * evaluations and batch predictions. If you plan to use the
     * <code>DataSource</code> to train an <code>MLModel</code>, the
     * <code>DataSource</code> requires another item: a recipe. A recipe
     * describes the observation variables that participate in training an
     * <code>MLModel</code>. A recipe describes how each input variable will be
     * used in training. Will the variable be included or excluded from
     * training? Will the variable be manipulated, for example, combined with
     * another variable, or split apart into word combinations? The recipe
     * provides answers to these questions. For more information, see the <a
     * href="http://docs.aws.amazon.com/machine-learning/latest/dg">Amazon
     * Machine Learning Developer Guide</a>.
     * </p>
     * 
     * @param createDataSourceFromS3Request
     * @return Result of the CreateDataSourceFromS3 operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This
     *         can result from retrying a request using a parameter that was not
     *         present in the original request.
     * @sample AmazonMachineLearning.CreateDataSourceFromS3
     */
    CreateDataSourceFromS3Result createDataSourceFromS3(
            CreateDataSourceFromS3Request createDataSourceFromS3Request);

    /**
     * <p>
     * Creates a new <code>Evaluation</code> of an <code>MLModel</code>. An
     * <code>MLModel</code> is evaluated on a set of observations associated to
     * a <code>DataSource</code>. Like a <code>DataSource</code> for an
     * <code>MLModel</code>, the <code>DataSource</code> for an
     * <code>Evaluation</code> contains values for the Target Variable. The
     * <code>Evaluation</code> compares the predicted result for each
     * observation to the actual outcome and provides a summary so that you know
     * how effective the <code>MLModel</code> functions on the test data.
     * Evaluation generates a relevant performance metric such as BinaryAUC,
     * RegressionRMSE or MulticlassAvgFScore based on the corresponding
     * <code>MLModelType</code>: <code>BINARY</code>, <code>REGRESSION</code> or
     * <code>MULTICLASS</code>.
     * </p>
     * <p>
     * <code>CreateEvaluation</code> is an asynchronous operation. In response
     * to <code>CreateEvaluation</code>, Amazon Machine Learning (Amazon ML)
     * immediately returns and sets the evaluation status to
     * <code>PENDING</code>. After the <code>Evaluation</code> is created and
     * ready for use, Amazon ML sets the status to <code>COMPLETED</code>.
     * </p>
     * <p>
     * You can use the <a>GetEvaluation</a> operation to check progress of the
     * evaluation during the creation operation.
     * </p>
     * 
     * @param createEvaluationRequest
     * @return Result of the CreateEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This
     *         can result from retrying a request using a parameter that was not
     *         present in the original request.
     * @sample AmazonMachineLearning.CreateEvaluation
     */
    CreateEvaluationResult createEvaluation(
            CreateEvaluationRequest createEvaluationRequest);

    /**
     * <p>
     * Creates a new <code>MLModel</code> using the data files and the recipe as
     * information sources.
     * </p>
     * <p>
     * An <code>MLModel</code> is nearly immutable. Users can only update the
     * <code>MLModelName</code> and the <code>ScoreThreshold</code> in an
     * <code>MLModel</code> without creating a new <code>MLModel</code>.
     * </p>
     * <p>
     * <code>CreateMLModel</code> is an asynchronous operation. In response to
     * <code>CreateMLModel</code>, Amazon Machine Learning (Amazon ML)
     * immediately returns and sets the <code>MLModel</code> status to
     * <code>PENDING</code>. After the <code>MLModel</code> is created and ready
     * for use, Amazon ML sets the status to <code>COMPLETED</code>.
     * </p>
     * <p>
     * You can use the <a>GetMLModel</a> operation to check progress of the
     * <code>MLModel</code> during the creation operation.
     * </p>
     * <p>
     * <a>CreateMLModel</a> requires a <code>DataSource</code> with computed
     * statistics, which can be created by setting
     * <code>ComputeStatistics</code> to <code>true</code> in
     * <a>CreateDataSourceFromRDS</a>, <a>CreateDataSourceFromS3</a>, or
     * <a>CreateDataSourceFromRedshift</a> operations.
     * </p>
     * 
     * @param createMLModelRequest
     * @return Result of the CreateMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws IdempotentParameterMismatchException
     *         A second request to use or change an object was not allowed. This
     *         can result from retrying a request using a parameter that was not
     *         present in the original request.
     * @sample AmazonMachineLearning.CreateMLModel
     */
    CreateMLModelResult createMLModel(CreateMLModelRequest createMLModelRequest);

    /**
     * <p>
     * Creates a real-time endpoint for the <code>MLModel</code>. The endpoint
     * contains the URI of the <code>MLModel</code>; that is, the location to
     * send real-time prediction requests for the specified <code>MLModel</code>
     * .
     * </p>
     * 
     * @param createRealtimeEndpointRequest
     * @return Result of the CreateRealtimeEndpoint operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.CreateRealtimeEndpoint
     */
    CreateRealtimeEndpointResult createRealtimeEndpoint(
            CreateRealtimeEndpointRequest createRealtimeEndpointRequest);

    /**
     * <p>
     * Assigns the DELETED status to a <code>BatchPrediction</code>, rendering
     * it unusable.
     * </p>
     * <p>
     * After using the <code>DeleteBatchPrediction</code> operation, you can use
     * the <a>GetBatchPrediction</a> operation to verify that the status of the
     * <code>BatchPrediction</code> changed to DELETED.
     * </p>
     * <p>
     * <b>Caution:</b> The result of the <code>DeleteBatchPrediction</code>
     * operation is irreversible.
     * </p>
     * 
     * @param deleteBatchPredictionRequest
     * @return Result of the DeleteBatchPrediction operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteBatchPrediction
     */
    DeleteBatchPredictionResult deleteBatchPrediction(
            DeleteBatchPredictionRequest deleteBatchPredictionRequest);

    /**
     * <p>
     * Assigns the DELETED status to a <code>DataSource</code>, rendering it
     * unusable.
     * </p>
     * <p>
     * After using the <code>DeleteDataSource</code> operation, you can use the
     * <a>GetDataSource</a> operation to verify that the status of the
     * <code>DataSource</code> changed to DELETED.
     * </p>
     * <p>
     * <b>Caution:</b> The results of the <code>DeleteDataSource</code>
     * operation are irreversible.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteDataSource
     */
    DeleteDataSourceResult deleteDataSource(
            DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Assigns the <code>DELETED</code> status to an <code>Evaluation</code>,
     * rendering it unusable.
     * </p>
     * <p>
     * After invoking the <code>DeleteEvaluation</code> operation, you can use
     * the <a>GetEvaluation</a> operation to verify that the status of the
     * <code>Evaluation</code> changed to <code>DELETED</code>.
     * </p>
     * <p>
     * <b>Caution:</b> The results of the <code>DeleteEvaluation</code>
     * operation are irreversible.
     * </p>
     * 
     * @param deleteEvaluationRequest
     * @return Result of the DeleteEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteEvaluation
     */
    DeleteEvaluationResult deleteEvaluation(
            DeleteEvaluationRequest deleteEvaluationRequest);

    /**
     * <p>
     * Assigns the DELETED status to an <code>MLModel</code>, rendering it
     * unusable.
     * </p>
     * <p>
     * After using the <code>DeleteMLModel</code> operation, you can use the
     * <a>GetMLModel</a> operation to verify that the status of the
     * <code>MLModel</code> changed to DELETED.
     * </p>
     * <p>
     * <b>Caution:</b> The result of the <code>DeleteMLModel</code> operation is
     * irreversible.
     * </p>
     * 
     * @param deleteMLModelRequest
     * @return Result of the DeleteMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteMLModel
     */
    DeleteMLModelResult deleteMLModel(DeleteMLModelRequest deleteMLModelRequest);

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code>.
     * </p>
     * 
     * @param deleteRealtimeEndpointRequest
     * @return Result of the DeleteRealtimeEndpoint operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DeleteRealtimeEndpoint
     */
    DeleteRealtimeEndpointResult deleteRealtimeEndpoint(
            DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest);

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match the
     * search criteria in the request.
     * </p>
     * 
     * @param describeBatchPredictionsRequest
     * @return Result of the DescribeBatchPredictions operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeBatchPredictions
     */
    DescribeBatchPredictionsResult describeBatchPredictions(
            DescribeBatchPredictionsRequest describeBatchPredictionsRequest);

    /**
     * Simplified method form for invoking the DescribeBatchPredictions
     * operation.
     *
     * @see #describeBatchPredictions(DescribeBatchPredictionsRequest)
     */
    DescribeBatchPredictionsResult describeBatchPredictions();

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search criteria
     * in the request.
     * </p>
     * 
     * @param describeDataSourcesRequest
     * @return Result of the DescribeDataSources operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeDataSources
     */
    DescribeDataSourcesResult describeDataSources(
            DescribeDataSourcesRequest describeDataSourcesRequest);

    /**
     * Simplified method form for invoking the DescribeDataSources operation.
     *
     * @see #describeDataSources(DescribeDataSourcesRequest)
     */
    DescribeDataSourcesResult describeDataSources();

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the search
     * criteria in the request.
     * </p>
     * 
     * @param describeEvaluationsRequest
     * @return Result of the DescribeEvaluations operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeEvaluations
     */
    DescribeEvaluationsResult describeEvaluations(
            DescribeEvaluationsRequest describeEvaluationsRequest);

    /**
     * Simplified method form for invoking the DescribeEvaluations operation.
     *
     * @see #describeEvaluations(DescribeEvaluationsRequest)
     */
    DescribeEvaluationsResult describeEvaluations();

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria in
     * the request.
     * </p>
     * 
     * @param describeMLModelsRequest
     * @return Result of the DescribeMLModels operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.DescribeMLModels
     */
    DescribeMLModelsResult describeMLModels(
            DescribeMLModelsRequest describeMLModelsRequest);

    /**
     * Simplified method form for invoking the DescribeMLModels operation.
     *
     * @see #describeMLModels(DescribeMLModelsRequest)
     */
    DescribeMLModelsResult describeMLModels();

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed metadata,
     * status, and data file information for a <code>Batch Prediction</code>
     * request.
     * </p>
     * 
     * @param getBatchPredictionRequest
     * @return Result of the GetBatchPrediction operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetBatchPrediction
     */
    GetBatchPredictionResult getBatchPrediction(
            GetBatchPredictionRequest getBatchPredictionRequest);

    /**
     * <p>
     * Returns a <code>DataSource</code> that includes metadata and data file
     * information, as well as the current status of the <code>DataSource</code>
     * .
     * </p>
     * <p>
     * <code>GetDataSource</code> provides results in normal or verbose format.
     * The verbose format adds the schema description and the list of files
     * pointed to by the DataSource to the normal format.
     * </p>
     * 
     * @param getDataSourceRequest
     * @return Result of the GetDataSource operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetDataSource
     */
    GetDataSourceResult getDataSource(GetDataSourceRequest getDataSourceRequest);

    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as the
     * current status of the <code>Evaluation</code>.
     * </p>
     * 
     * @param getEvaluationRequest
     * @return Result of the GetEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetEvaluation
     */
    GetEvaluationResult getEvaluation(GetEvaluationRequest getEvaluationRequest);

    /**
     * <p>
     * Returns an <code>MLModel</code> that includes detailed metadata, and data
     * source information as well as the current status of the
     * <code>MLModel</code>.
     * </p>
     * <p>
     * <code>GetMLModel</code> provides results in normal or verbose format.
     * </p>
     * 
     * @param getMLModelRequest
     * @return Result of the GetMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.GetMLModel
     */
    GetMLModelResult getMLModel(GetMLModelRequest getMLModelRequest);

    /**
     * <p>
     * Generates a prediction for the observation using the specified
     * <code>ML Model</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * Not all response parameters will be populated. Whether a response
     * parameter is populated depends on the type of model requested.
     * </p>
     * </note>
     * 
     * @param predictRequest
     * @return Result of the Predict operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws LimitExceededException
     *         The subscriber exceeded the maximum number of operations. This
     *         exception can occur when listing objects such as
     *         <code>DataSource</code>.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @throws PredictorNotMountedException
     *         The exception is thrown when a predict request is made to an
     *         unmounted <code>MLModel</code>.
     * @sample AmazonMachineLearning.Predict
     */
    PredictResult predict(PredictRequest predictRequest);

    /**
     * <p>
     * Updates the <code>BatchPredictionName</code> of a
     * <code>BatchPrediction</code>.
     * </p>
     * <p>
     * You can use the <a>GetBatchPrediction</a> operation to view the contents
     * of the updated data element.
     * </p>
     * 
     * @param updateBatchPredictionRequest
     * @return Result of the UpdateBatchPrediction operation returned by the
     *         service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateBatchPrediction
     */
    UpdateBatchPredictionResult updateBatchPrediction(
            UpdateBatchPredictionRequest updateBatchPredictionRequest);

    /**
     * <p>
     * Updates the <code>DataSourceName</code> of a <code>DataSource</code>.
     * </p>
     * <p>
     * You can use the <a>GetDataSource</a> operation to view the contents of
     * the updated data element.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateDataSource
     */
    UpdateDataSourceResult updateDataSource(
            UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates the <code>EvaluationName</code> of an <code>Evaluation</code>.
     * </p>
     * <p>
     * You can use the <a>GetEvaluation</a> operation to view the contents of
     * the updated data element.
     * </p>
     * 
     * @param updateEvaluationRequest
     * @return Result of the UpdateEvaluation operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateEvaluation
     */
    UpdateEvaluationResult updateEvaluation(
            UpdateEvaluationRequest updateEvaluationRequest);

    /**
     * <p>
     * Updates the <code>MLModelName</code> and the <code>ScoreThreshold</code>
     * of an <code>MLModel</code>.
     * </p>
     * <p>
     * You can use the <a>GetMLModel</a> operation to view the contents of the
     * updated data element.
     * </p>
     * 
     * @param updateMLModelRequest
     * @return Result of the UpdateMLModel operation returned by the service.
     * @throws InvalidInputException
     *         An error on the client occurred. Typically, the cause is an
     *         invalid input value.
     * @throws ResourceNotFoundException
     *         A specified resource cannot be located.
     * @throws InternalServerException
     *         An error on the server occurred when trying to process a request.
     * @sample AmazonMachineLearning.UpdateMLModel
     */
    UpdateMLModelResult updateMLModel(UpdateMLModelRequest updateMLModelRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
