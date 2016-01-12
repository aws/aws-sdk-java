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

import com.amazonaws.services.machinelearning.model.*;

/**
 * Interface for accessing Amazon Machine Learning asynchronously. Each
 * asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * Definition of the public APIs exposed by Amazon Machine Learning
 */
public interface AmazonMachineLearningAsync extends AmazonMachineLearning {

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
     * @return A Java Future containing the result of the CreateBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.CreateBatchPrediction
     */
    java.util.concurrent.Future<CreateBatchPredictionResult> createBatchPredictionAsync(
            CreateBatchPredictionRequest createBatchPredictionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.CreateBatchPrediction
     */
    java.util.concurrent.Future<CreateBatchPredictionResult> createBatchPredictionAsync(
            CreateBatchPredictionRequest createBatchPredictionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBatchPredictionRequest, CreateBatchPredictionResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         CreateDataSourceFromRDS operation returned by the service.
     * @sample AmazonMachineLearningAsync.CreateDataSourceFromRDS
     */
    java.util.concurrent.Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(
            CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateDataSourceFromRDS operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.CreateDataSourceFromRDS
     */
    java.util.concurrent.Future<CreateDataSourceFromRDSResult> createDataSourceFromRDSAsync(
            CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromRDSRequest, CreateDataSourceFromRDSResult> asyncHandler);

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
     * @return A Java Future containing the result of the
     *         CreateDataSourceFromRedshift operation returned by the service.
     * @sample AmazonMachineLearningAsync.CreateDataSourceFromRedshift
     */
    java.util.concurrent.Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(
            CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateDataSourceFromRedshift operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.CreateDataSourceFromRedshift
     */
    java.util.concurrent.Future<CreateDataSourceFromRedshiftResult> createDataSourceFromRedshiftAsync(
            CreateDataSourceFromRedshiftRequest createDataSourceFromRedshiftRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromRedshiftRequest, CreateDataSourceFromRedshiftResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDataSourceFromS3
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.CreateDataSourceFromS3
     */
    java.util.concurrent.Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(
            CreateDataSourceFromS3Request createDataSourceFromS3Request);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataSourceFromS3
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.CreateDataSourceFromS3
     */
    java.util.concurrent.Future<CreateDataSourceFromS3Result> createDataSourceFromS3Async(
            CreateDataSourceFromS3Request createDataSourceFromS3Request,
            com.amazonaws.handlers.AsyncHandler<CreateDataSourceFromS3Request, CreateDataSourceFromS3Result> asyncHandler);

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
     * @return A Java Future containing the result of the CreateEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.CreateEvaluation
     */
    java.util.concurrent.Future<CreateEvaluationResult> createEvaluationAsync(
            CreateEvaluationRequest createEvaluationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.CreateEvaluation
     */
    java.util.concurrent.Future<CreateEvaluationResult> createEvaluationAsync(
            CreateEvaluationRequest createEvaluationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEvaluationRequest, CreateEvaluationResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateMLModel
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.CreateMLModel
     */
    java.util.concurrent.Future<CreateMLModelResult> createMLModelAsync(
            CreateMLModelRequest createMLModelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMLModel
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.CreateMLModel
     */
    java.util.concurrent.Future<CreateMLModelResult> createMLModelAsync(
            CreateMLModelRequest createMLModelRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMLModelRequest, CreateMLModelResult> asyncHandler);

    /**
     * <p>
     * Creates a real-time endpoint for the <code>MLModel</code>. The endpoint
     * contains the URI of the <code>MLModel</code>; that is, the location to
     * send real-time prediction requests for the specified <code>MLModel</code>
     * .
     * </p>
     * 
     * @param createRealtimeEndpointRequest
     * @return A Java Future containing the result of the CreateRealtimeEndpoint
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.CreateRealtimeEndpoint
     */
    java.util.concurrent.Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(
            CreateRealtimeEndpointRequest createRealtimeEndpointRequest);

    /**
     * <p>
     * Creates a real-time endpoint for the <code>MLModel</code>. The endpoint
     * contains the URI of the <code>MLModel</code>; that is, the location to
     * send real-time prediction requests for the specified <code>MLModel</code>
     * .
     * </p>
     * 
     * @param createRealtimeEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRealtimeEndpoint
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.CreateRealtimeEndpoint
     */
    java.util.concurrent.Future<CreateRealtimeEndpointResult> createRealtimeEndpointAsync(
            CreateRealtimeEndpointRequest createRealtimeEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRealtimeEndpointRequest, CreateRealtimeEndpointResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DeleteBatchPrediction
     */
    java.util.concurrent.Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(
            DeleteBatchPredictionRequest deleteBatchPredictionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DeleteBatchPrediction
     */
    java.util.concurrent.Future<DeleteBatchPredictionResult> deleteBatchPredictionAsync(
            DeleteBatchPredictionRequest deleteBatchPredictionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBatchPredictionRequest, DeleteBatchPredictionResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDataSource
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DeleteDataSource
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(
            DeleteDataSourceRequest deleteDataSourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataSource
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DeleteDataSource
     */
    java.util.concurrent.Future<DeleteDataSourceResult> deleteDataSourceAsync(
            DeleteDataSourceRequest deleteDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDataSourceRequest, DeleteDataSourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DeleteEvaluation
     */
    java.util.concurrent.Future<DeleteEvaluationResult> deleteEvaluationAsync(
            DeleteEvaluationRequest deleteEvaluationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DeleteEvaluation
     */
    java.util.concurrent.Future<DeleteEvaluationResult> deleteEvaluationAsync(
            DeleteEvaluationRequest deleteEvaluationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEvaluationRequest, DeleteEvaluationResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteMLModel
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DeleteMLModel
     */
    java.util.concurrent.Future<DeleteMLModelResult> deleteMLModelAsync(
            DeleteMLModelRequest deleteMLModelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMLModel
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DeleteMLModel
     */
    java.util.concurrent.Future<DeleteMLModelResult> deleteMLModelAsync(
            DeleteMLModelRequest deleteMLModelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMLModelRequest, DeleteMLModelResult> asyncHandler);

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code>.
     * </p>
     * 
     * @param deleteRealtimeEndpointRequest
     * @return A Java Future containing the result of the DeleteRealtimeEndpoint
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DeleteRealtimeEndpoint
     */
    java.util.concurrent.Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(
            DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest);

    /**
     * <p>
     * Deletes a real time endpoint of an <code>MLModel</code>.
     * </p>
     * 
     * @param deleteRealtimeEndpointRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRealtimeEndpoint
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DeleteRealtimeEndpoint
     */
    java.util.concurrent.Future<DeleteRealtimeEndpointResult> deleteRealtimeEndpointAsync(
            DeleteRealtimeEndpointRequest deleteRealtimeEndpointRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRealtimeEndpointRequest, DeleteRealtimeEndpointResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match the
     * search criteria in the request.
     * </p>
     * 
     * @param describeBatchPredictionsRequest
     * @return A Java Future containing the result of the
     *         DescribeBatchPredictions operation returned by the service.
     * @sample AmazonMachineLearningAsync.DescribeBatchPredictions
     */
    java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(
            DescribeBatchPredictionsRequest describeBatchPredictionsRequest);

    /**
     * <p>
     * Returns a list of <code>BatchPrediction</code> operations that match the
     * search criteria in the request.
     * </p>
     * 
     * @param describeBatchPredictionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeBatchPredictions operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DescribeBatchPredictions
     */
    java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(
            DescribeBatchPredictionsRequest describeBatchPredictionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeBatchPredictions
     * operation.
     *
     * @see #describeBatchPredictionsAsync(DescribeBatchPredictionsRequest)
     */
    java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync();

    /**
     * Simplified method form for invoking the DescribeBatchPredictions
     * operation with an AsyncHandler.
     *
     * @see #describeBatchPredictionsAsync(DescribeBatchPredictionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeBatchPredictionsResult> describeBatchPredictionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeBatchPredictionsRequest, DescribeBatchPredictionsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search criteria
     * in the request.
     * </p>
     * 
     * @param describeDataSourcesRequest
     * @return A Java Future containing the result of the DescribeDataSources
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DescribeDataSources
     */
    java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(
            DescribeDataSourcesRequest describeDataSourcesRequest);

    /**
     * <p>
     * Returns a list of <code>DataSource</code> that match the search criteria
     * in the request.
     * </p>
     * 
     * @param describeDataSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataSources
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DescribeDataSources
     */
    java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(
            DescribeDataSourcesRequest describeDataSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeDataSources operation.
     *
     * @see #describeDataSourcesAsync(DescribeDataSourcesRequest)
     */
    java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync();

    /**
     * Simplified method form for invoking the DescribeDataSources operation
     * with an AsyncHandler.
     *
     * @see #describeDataSourcesAsync(DescribeDataSourcesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeDataSourcesResult> describeDataSourcesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDataSourcesRequest, DescribeDataSourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the search
     * criteria in the request.
     * </p>
     * 
     * @param describeEvaluationsRequest
     * @return A Java Future containing the result of the DescribeEvaluations
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DescribeEvaluations
     */
    java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(
            DescribeEvaluationsRequest describeEvaluationsRequest);

    /**
     * <p>
     * Returns a list of <code>DescribeEvaluations</code> that match the search
     * criteria in the request.
     * </p>
     * 
     * @param describeEvaluationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvaluations
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DescribeEvaluations
     */
    java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(
            DescribeEvaluationsRequest describeEvaluationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEvaluations operation.
     *
     * @see #describeEvaluationsAsync(DescribeEvaluationsRequest)
     */
    java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync();

    /**
     * Simplified method form for invoking the DescribeEvaluations operation
     * with an AsyncHandler.
     *
     * @see #describeEvaluationsAsync(DescribeEvaluationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEvaluationsResult> describeEvaluationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEvaluationsRequest, DescribeEvaluationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria in
     * the request.
     * </p>
     * 
     * @param describeMLModelsRequest
     * @return A Java Future containing the result of the DescribeMLModels
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.DescribeMLModels
     */
    java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(
            DescribeMLModelsRequest describeMLModelsRequest);

    /**
     * <p>
     * Returns a list of <code>MLModel</code> that match the search criteria in
     * the request.
     * </p>
     * 
     * @param describeMLModelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMLModels
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.DescribeMLModels
     */
    java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(
            DescribeMLModelsRequest describeMLModelsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeMLModels operation.
     *
     * @see #describeMLModelsAsync(DescribeMLModelsRequest)
     */
    java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync();

    /**
     * Simplified method form for invoking the DescribeMLModels operation with
     * an AsyncHandler.
     *
     * @see #describeMLModelsAsync(DescribeMLModelsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeMLModelsResult> describeMLModelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeMLModelsRequest, DescribeMLModelsResult> asyncHandler);

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed metadata,
     * status, and data file information for a <code>Batch Prediction</code>
     * request.
     * </p>
     * 
     * @param getBatchPredictionRequest
     * @return A Java Future containing the result of the GetBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.GetBatchPrediction
     */
    java.util.concurrent.Future<GetBatchPredictionResult> getBatchPredictionAsync(
            GetBatchPredictionRequest getBatchPredictionRequest);

    /**
     * <p>
     * Returns a <code>BatchPrediction</code> that includes detailed metadata,
     * status, and data file information for a <code>Batch Prediction</code>
     * request.
     * </p>
     * 
     * @param getBatchPredictionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.GetBatchPrediction
     */
    java.util.concurrent.Future<GetBatchPredictionResult> getBatchPredictionAsync(
            GetBatchPredictionRequest getBatchPredictionRequest,
            com.amazonaws.handlers.AsyncHandler<GetBatchPredictionRequest, GetBatchPredictionResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDataSource
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.GetDataSource
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(
            GetDataSourceRequest getDataSourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDataSource
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.GetDataSource
     */
    java.util.concurrent.Future<GetDataSourceResult> getDataSourceAsync(
            GetDataSourceRequest getDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDataSourceRequest, GetDataSourceResult> asyncHandler);

    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as the
     * current status of the <code>Evaluation</code>.
     * </p>
     * 
     * @param getEvaluationRequest
     * @return A Java Future containing the result of the GetEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.GetEvaluation
     */
    java.util.concurrent.Future<GetEvaluationResult> getEvaluationAsync(
            GetEvaluationRequest getEvaluationRequest);

    /**
     * <p>
     * Returns an <code>Evaluation</code> that includes metadata as well as the
     * current status of the <code>Evaluation</code>.
     * </p>
     * 
     * @param getEvaluationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.GetEvaluation
     */
    java.util.concurrent.Future<GetEvaluationResult> getEvaluationAsync(
            GetEvaluationRequest getEvaluationRequest,
            com.amazonaws.handlers.AsyncHandler<GetEvaluationRequest, GetEvaluationResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetMLModel operation
     *         returned by the service.
     * @sample AmazonMachineLearningAsync.GetMLModel
     */
    java.util.concurrent.Future<GetMLModelResult> getMLModelAsync(
            GetMLModelRequest getMLModelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMLModel operation
     *         returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.GetMLModel
     */
    java.util.concurrent.Future<GetMLModelResult> getMLModelAsync(
            GetMLModelRequest getMLModelRequest,
            com.amazonaws.handlers.AsyncHandler<GetMLModelRequest, GetMLModelResult> asyncHandler);

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
     * @return A Java Future containing the result of the Predict operation
     *         returned by the service.
     * @sample AmazonMachineLearningAsync.Predict
     */
    java.util.concurrent.Future<PredictResult> predictAsync(
            PredictRequest predictRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Predict operation
     *         returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.Predict
     */
    java.util.concurrent.Future<PredictResult> predictAsync(
            PredictRequest predictRequest,
            com.amazonaws.handlers.AsyncHandler<PredictRequest, PredictResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.UpdateBatchPrediction
     */
    java.util.concurrent.Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(
            UpdateBatchPredictionRequest updateBatchPredictionRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBatchPrediction
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.UpdateBatchPrediction
     */
    java.util.concurrent.Future<UpdateBatchPredictionResult> updateBatchPredictionAsync(
            UpdateBatchPredictionRequest updateBatchPredictionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBatchPredictionRequest, UpdateBatchPredictionResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateDataSource
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.UpdateDataSource
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(
            UpdateDataSourceRequest updateDataSourceRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDataSource
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.UpdateDataSource
     */
    java.util.concurrent.Future<UpdateDataSourceResult> updateDataSourceAsync(
            UpdateDataSourceRequest updateDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDataSourceRequest, UpdateDataSourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.UpdateEvaluation
     */
    java.util.concurrent.Future<UpdateEvaluationResult> updateEvaluationAsync(
            UpdateEvaluationRequest updateEvaluationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEvaluation
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.UpdateEvaluation
     */
    java.util.concurrent.Future<UpdateEvaluationResult> updateEvaluationAsync(
            UpdateEvaluationRequest updateEvaluationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEvaluationRequest, UpdateEvaluationResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateMLModel
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsync.UpdateMLModel
     */
    java.util.concurrent.Future<UpdateMLModelResult> updateMLModelAsync(
            UpdateMLModelRequest updateMLModelRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMLModel
     *         operation returned by the service.
     * @sample AmazonMachineLearningAsyncHandler.UpdateMLModel
     */
    java.util.concurrent.Future<UpdateMLModelResult> updateMLModelAsync(
            UpdateMLModelRequest updateMLModelRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMLModelRequest, UpdateMLModelResult> asyncHandler);

}
