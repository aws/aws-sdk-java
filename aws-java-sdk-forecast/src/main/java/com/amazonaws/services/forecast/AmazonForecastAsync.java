/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;

/**
 * Interface for accessing Amazon Forecast Service asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.forecast.AbstractAmazonForecastAsync} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon Forecast resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonForecastAsync extends AmazonForecast {

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
     * the dataset group to create a predictor. For more information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * <p>
     * To get a list of all your datasets, use the <a>ListDatasets</a> operation.
     * </p>
     * <p>
     * For example Forecast datasets, see the <a href="https://github.com/aws-samples/amazon-forecast-samples">Amazon
     * Forecast Sample GitHub repository</a>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of a dataset must be <code>ACTIVE</code> before you can import training data. Use the
     * <a>DescribeDataset</a> operation to get the status.
     * </p>
     * </note>
     * 
     * @param createDatasetRequest
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonForecastAsync.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest);

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
     * the dataset group to create a predictor. For more information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * <p>
     * To get a list of all your datasets, use the <a>ListDatasets</a> operation.
     * </p>
     * <p>
     * For example Forecast datasets, see the <a href="https://github.com/aws-samples/amazon-forecast-samples">Amazon
     * Forecast Sample GitHub repository</a>.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of a dataset must be <code>ACTIVE</code> before you can import training data. Use the
     * <a>DescribeDataset</a> operation to get the status.
     * </p>
     * </note>
     * 
     * @param createDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDataset operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetResult> createDatasetAsync(CreateDatasetRequest createDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetRequest, CreateDatasetResult> asyncHandler);

    /**
     * <p>
     * Creates a dataset group, which holds a collection of related datasets. You can add datasets to the dataset group
     * when you create the dataset group, or later by using the <a>UpdateDatasetGroup</a> operation.
     * </p>
     * <p>
     * After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For
     * more information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * <p>
     * To get a list of all your datasets groups, use the <a>ListDatasetGroups</a> operation.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of a dataset group must be <code>ACTIVE</code> before you can use the dataset group to
     * create a predictor. To get the status, use the <a>DescribeDatasetGroup</a> operation.
     * </p>
     * </note>
     * 
     * @param createDatasetGroupRequest
     * @return A Java Future containing the result of the CreateDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsync.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest createDatasetGroupRequest);

    /**
     * <p>
     * Creates a dataset group, which holds a collection of related datasets. You can add datasets to the dataset group
     * when you create the dataset group, or later by using the <a>UpdateDatasetGroup</a> operation.
     * </p>
     * <p>
     * After creating a dataset group and adding datasets, you use the dataset group when you create a predictor. For
     * more information, see <a>howitworks-datasets-groups</a>.
     * </p>
     * <p>
     * To get a list of all your datasets groups, use the <a>ListDatasetGroups</a> operation.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of a dataset group must be <code>ACTIVE</code> before you can use the dataset group to
     * create a predictor. To get the status, use the <a>DescribeDatasetGroup</a> operation.
     * </p>
     * </note>
     * 
     * @param createDatasetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest createDatasetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetGroupRequest, CreateDatasetGroupResult> asyncHandler);

    /**
     * <p>
     * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an
     * Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want
     * to import the data to.
     * </p>
     * <p>
     * You must specify a <a>DataSource</a> object that includes an AWS Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the data, as Amazon Forecast makes a copy of your data and processes it in
     * an internal AWS system. For more information, see <a>aws-forecast-iam-roles</a>.
     * </p>
     * <p>
     * The training data must be in CSV format. The delimiter must be a comma (,).
     * </p>
     * <p>
     * You can specify the path to a specific CSV file, the S3 bucket, or to a folder in the S3 bucket. For the latter
     * two cases, Amazon Forecast imports all files up to the limit of 10,000 files.
     * </p>
     * <p>
     * Because dataset imports are not aggregated, your most recent dataset import is the one that is used when training
     * a predictor or generating a forecast. Make sure that your most recent dataset import contains all of the data you
     * want to model off of, and not just the new data collected since the previous import.
     * </p>
     * <p>
     * To get a list of all your dataset import jobs, filtered by specified criteria, use the
     * <a>ListDatasetImportJobs</a> operation.
     * </p>
     * 
     * @param createDatasetImportJobRequest
     * @return A Java Future containing the result of the CreateDatasetImportJob operation returned by the service.
     * @sample AmazonForecastAsync.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest createDatasetImportJobRequest);

    /**
     * <p>
     * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an
     * Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want
     * to import the data to.
     * </p>
     * <p>
     * You must specify a <a>DataSource</a> object that includes an AWS Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the data, as Amazon Forecast makes a copy of your data and processes it in
     * an internal AWS system. For more information, see <a>aws-forecast-iam-roles</a>.
     * </p>
     * <p>
     * The training data must be in CSV format. The delimiter must be a comma (,).
     * </p>
     * <p>
     * You can specify the path to a specific CSV file, the S3 bucket, or to a folder in the S3 bucket. For the latter
     * two cases, Amazon Forecast imports all files up to the limit of 10,000 files.
     * </p>
     * <p>
     * Because dataset imports are not aggregated, your most recent dataset import is the one that is used when training
     * a predictor or generating a forecast. Make sure that your most recent dataset import contains all of the data you
     * want to model off of, and not just the new data collected since the previous import.
     * </p>
     * <p>
     * To get a list of all your dataset import jobs, filtered by specified criteria, use the
     * <a>ListDatasetImportJobs</a> operation.
     * </p>
     * 
     * @param createDatasetImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDatasetImportJob operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetImportJobResult> createDatasetImportJobAsync(CreateDatasetImportJobRequest createDatasetImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDatasetImportJobRequest, CreateDatasetImportJobResult> asyncHandler);

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
     * 
     * @param createForecastRequest
     * @return A Java Future containing the result of the CreateForecast operation returned by the service.
     * @sample AmazonForecastAsync.CreateForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateForecastResult> createForecastAsync(CreateForecastRequest createForecastRequest);

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
     * 
     * @param createForecastRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateForecast operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateForecastResult> createForecastAsync(CreateForecastRequest createForecastRequest,
            com.amazonaws.handlers.AsyncHandler<CreateForecastRequest, CreateForecastResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateForecastExportJob operation returned by the service.
     * @sample AmazonForecastAsync.CreateForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateForecastExportJobResult> createForecastExportJobAsync(CreateForecastExportJobRequest createForecastExportJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateForecastExportJob operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateForecastExportJobResult> createForecastExportJobAsync(CreateForecastExportJobRequest createForecastExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateForecastExportJobRequest, CreateForecastExportJobResult> asyncHandler);

    /**
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
     * @return A Java Future containing the result of the CreatePredictor operation returned by the service.
     * @sample AmazonForecastAsync.CreatePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePredictorResult> createPredictorAsync(CreatePredictorRequest createPredictorRequest);

    /**
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePredictor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreatePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePredictorResult> createPredictorAsync(CreatePredictorRequest createPredictorRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePredictorRequest, CreatePredictorResult> asyncHandler);

    /**
     * <p>
     * Exports backtest forecasts and accuracy metrics generated by the <a>CreatePredictor</a> operation. Two folders
     * containing CSV files are exported to your specified S3 bucket.
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
     * @return A Java Future containing the result of the CreatePredictorBacktestExportJob operation returned by the
     *         service.
     * @sample AmazonForecastAsync.CreatePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePredictorBacktestExportJobResult> createPredictorBacktestExportJobAsync(
            CreatePredictorBacktestExportJobRequest createPredictorBacktestExportJobRequest);

    /**
     * <p>
     * Exports backtest forecasts and accuracy metrics generated by the <a>CreatePredictor</a> operation. Two folders
     * containing CSV files are exported to your specified S3 bucket.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePredictorBacktestExportJob operation returned by the
     *         service.
     * @sample AmazonForecastAsyncHandler.CreatePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePredictorBacktestExportJobResult> createPredictorBacktestExportJobAsync(
            CreatePredictorBacktestExportJobRequest createPredictorBacktestExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePredictorBacktestExportJobRequest, CreatePredictorBacktestExportJobResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon Forecast dataset that was created using the <a>CreateDataset</a> operation. You can only delete
     * datasets that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status use the
     * <a>DescribeDataset</a> operation.
     * </p>
     * <note>
     * <p>
     * Forecast does not automatically update any dataset groups that contain the deleted dataset. In order to update
     * the dataset group, use the operation, omitting the deleted dataset's ARN.
     * </p>
     * </note>
     * 
     * @param deleteDatasetRequest
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonForecastAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes an Amazon Forecast dataset that was created using the <a>CreateDataset</a> operation. You can only delete
     * datasets that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status use the
     * <a>DescribeDataset</a> operation.
     * </p>
     * <note>
     * <p>
     * Forecast does not automatically update any dataset groups that contain the deleted dataset. In order to update
     * the dataset group, use the operation, omitting the deleted dataset's ARN.
     * </p>
     * </note>
     * 
     * @param deleteDatasetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetRequest, DeleteDatasetResult> asyncHandler);

    /**
     * <p>
     * Deletes a dataset group created using the <a>CreateDatasetGroup</a> operation. You can only delete dataset groups
     * that have a status of <code>ACTIVE</code>, <code>CREATE_FAILED</code>, or <code>UPDATE_FAILED</code>. To get the
     * status, use the <a>DescribeDatasetGroup</a> operation.
     * </p>
     * <p>
     * This operation deletes only the dataset group, not the datasets in the group.
     * </p>
     * 
     * @param deleteDatasetGroupRequest
     * @return A Java Future containing the result of the DeleteDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsync.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest deleteDatasetGroupRequest);

    /**
     * <p>
     * Deletes a dataset group created using the <a>CreateDatasetGroup</a> operation. You can only delete dataset groups
     * that have a status of <code>ACTIVE</code>, <code>CREATE_FAILED</code>, or <code>UPDATE_FAILED</code>. To get the
     * status, use the <a>DescribeDatasetGroup</a> operation.
     * </p>
     * <p>
     * This operation deletes only the dataset group, not the datasets in the group.
     * </p>
     * 
     * @param deleteDatasetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest deleteDatasetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetGroupRequest, DeleteDatasetGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a dataset import job created using the <a>CreateDatasetImportJob</a> operation. You can delete only
     * dataset import jobs that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status,
     * use the <a>DescribeDatasetImportJob</a> operation.
     * </p>
     * 
     * @param deleteDatasetImportJobRequest
     * @return A Java Future containing the result of the DeleteDatasetImportJob operation returned by the service.
     * @sample AmazonForecastAsync.DeleteDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetImportJobResult> deleteDatasetImportJobAsync(DeleteDatasetImportJobRequest deleteDatasetImportJobRequest);

    /**
     * <p>
     * Deletes a dataset import job created using the <a>CreateDatasetImportJob</a> operation. You can delete only
     * dataset import jobs that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status,
     * use the <a>DescribeDatasetImportJob</a> operation.
     * </p>
     * 
     * @param deleteDatasetImportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDatasetImportJob operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetImportJobResult> deleteDatasetImportJobAsync(DeleteDatasetImportJobRequest deleteDatasetImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDatasetImportJobRequest, DeleteDatasetImportJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteForecast operation returned by the service.
     * @sample AmazonForecastAsync.DeleteForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteForecastResult> deleteForecastAsync(DeleteForecastRequest deleteForecastRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteForecast operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteForecastResult> deleteForecastAsync(DeleteForecastRequest deleteForecastRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteForecastRequest, DeleteForecastResult> asyncHandler);

    /**
     * <p>
     * Deletes a forecast export job created using the <a>CreateForecastExportJob</a> operation. You can delete only
     * export jobs that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the
     * <a>DescribeForecastExportJob</a> operation.
     * </p>
     * 
     * @param deleteForecastExportJobRequest
     * @return A Java Future containing the result of the DeleteForecastExportJob operation returned by the service.
     * @sample AmazonForecastAsync.DeleteForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteForecastExportJobResult> deleteForecastExportJobAsync(DeleteForecastExportJobRequest deleteForecastExportJobRequest);

    /**
     * <p>
     * Deletes a forecast export job created using the <a>CreateForecastExportJob</a> operation. You can delete only
     * export jobs that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the
     * <a>DescribeForecastExportJob</a> operation.
     * </p>
     * 
     * @param deleteForecastExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteForecastExportJob operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteForecastExportJobResult> deleteForecastExportJobAsync(DeleteForecastExportJobRequest deleteForecastExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteForecastExportJobRequest, DeleteForecastExportJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a predictor created using the <a>CreatePredictor</a> operation. You can delete only predictor that have a
     * status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the <a>DescribePredictor</a>
     * operation.
     * </p>
     * 
     * @param deletePredictorRequest
     * @return A Java Future containing the result of the DeletePredictor operation returned by the service.
     * @sample AmazonForecastAsync.DeletePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeletePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePredictorResult> deletePredictorAsync(DeletePredictorRequest deletePredictorRequest);

    /**
     * <p>
     * Deletes a predictor created using the <a>CreatePredictor</a> operation. You can delete only predictor that have a
     * status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the <a>DescribePredictor</a>
     * operation.
     * </p>
     * 
     * @param deletePredictorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePredictor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeletePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeletePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePredictorResult> deletePredictorAsync(DeletePredictorRequest deletePredictorRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePredictorRequest, DeletePredictorResult> asyncHandler);

    /**
     * <p>
     * Deletes a predictor backtest export job.
     * </p>
     * 
     * @param deletePredictorBacktestExportJobRequest
     * @return A Java Future containing the result of the DeletePredictorBacktestExportJob operation returned by the
     *         service.
     * @sample AmazonForecastAsync.DeletePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeletePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePredictorBacktestExportJobResult> deletePredictorBacktestExportJobAsync(
            DeletePredictorBacktestExportJobRequest deletePredictorBacktestExportJobRequest);

    /**
     * <p>
     * Deletes a predictor backtest export job.
     * </p>
     * 
     * @param deletePredictorBacktestExportJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePredictorBacktestExportJob operation returned by the
     *         service.
     * @sample AmazonForecastAsyncHandler.DeletePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeletePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePredictorBacktestExportJobResult> deletePredictorBacktestExportJobAsync(
            DeletePredictorBacktestExportJobRequest deletePredictorBacktestExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePredictorBacktestExportJobRequest, DeletePredictorBacktestExportJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteResourceTree operation returned by the service.
     * @sample AmazonForecastAsync.DeleteResourceTree
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteResourceTree" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceTreeResult> deleteResourceTreeAsync(DeleteResourceTreeRequest deleteResourceTreeRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceTree operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteResourceTree
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteResourceTree" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceTreeResult> deleteResourceTreeAsync(DeleteResourceTreeRequest deleteResourceTreeRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceTreeRequest, DeleteResourceTreeResult> asyncHandler);

    /**
     * <p>
     * Describes an Amazon Forecast dataset created using the <a>CreateDataset</a> operation.
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
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonForecastAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Describes an Amazon Forecast dataset created using the <a>CreateDataset</a> operation.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetRequest, DescribeDatasetResult> asyncHandler);

    /**
     * <p>
     * Describes a dataset group created using the <a>CreateDatasetGroup</a> operation.
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
     * @return A Java Future containing the result of the DescribeDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsync.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest describeDatasetGroupRequest);

    /**
     * <p>
     * Describes a dataset group created using the <a>CreateDatasetGroup</a> operation.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest describeDatasetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetGroupRequest, DescribeDatasetGroupResult> asyncHandler);

    /**
     * <p>
     * Describes a dataset import job created using the <a>CreateDatasetImportJob</a> operation.
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
     * @return A Java Future containing the result of the DescribeDatasetImportJob operation returned by the service.
     * @sample AmazonForecastAsync.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest describeDatasetImportJobRequest);

    /**
     * <p>
     * Describes a dataset import job created using the <a>CreateDatasetImportJob</a> operation.
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDatasetImportJob operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest describeDatasetImportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDatasetImportJobRequest, DescribeDatasetImportJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeForecast operation returned by the service.
     * @sample AmazonForecastAsync.DescribeForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeForecastResult> describeForecastAsync(DescribeForecastRequest describeForecastRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeForecast operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecast" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeForecastResult> describeForecastAsync(DescribeForecastRequest describeForecastRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeForecastRequest, DescribeForecastResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeForecastExportJob operation returned by the service.
     * @sample AmazonForecastAsync.DescribeForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeForecastExportJobResult> describeForecastExportJobAsync(
            DescribeForecastExportJobRequest describeForecastExportJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeForecastExportJob operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeForecastExportJobResult> describeForecastExportJobAsync(
            DescribeForecastExportJobRequest describeForecastExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeForecastExportJobRequest, DescribeForecastExportJobResult> asyncHandler);

    /**
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
     * @return A Java Future containing the result of the DescribePredictor operation returned by the service.
     * @sample AmazonForecastAsync.DescribePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePredictorResult> describePredictorAsync(DescribePredictorRequest describePredictorRequest);

    /**
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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePredictor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePredictorResult> describePredictorAsync(DescribePredictorRequest describePredictorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePredictorRequest, DescribePredictorResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribePredictorBacktestExportJob operation returned by the
     *         service.
     * @sample AmazonForecastAsync.DescribePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePredictorBacktestExportJobResult> describePredictorBacktestExportJobAsync(
            DescribePredictorBacktestExportJobRequest describePredictorBacktestExportJobRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePredictorBacktestExportJob operation returned by the
     *         service.
     * @sample AmazonForecastAsyncHandler.DescribePredictorBacktestExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictorBacktestExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePredictorBacktestExportJobResult> describePredictorBacktestExportJobAsync(
            DescribePredictorBacktestExportJobRequest describePredictorBacktestExportJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePredictorBacktestExportJobRequest, DescribePredictorBacktestExportJobResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetAccuracyMetrics operation returned by the service.
     * @sample AmazonForecastAsync.GetAccuracyMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/GetAccuracyMetrics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccuracyMetricsResult> getAccuracyMetricsAsync(GetAccuracyMetricsRequest getAccuracyMetricsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccuracyMetrics operation returned by the service.
     * @sample AmazonForecastAsyncHandler.GetAccuracyMetrics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/GetAccuracyMetrics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAccuracyMetricsResult> getAccuracyMetricsAsync(GetAccuracyMetricsRequest getAccuracyMetricsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccuracyMetricsRequest, GetAccuracyMetricsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of dataset groups created using the <a>CreateDatasetGroup</a> operation. For each dataset group,
     * this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve
     * the complete set of properties by using the dataset group ARN with the <a>DescribeDatasetGroup</a> operation.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @return A Java Future containing the result of the ListDatasetGroups operation returned by the service.
     * @sample AmazonForecastAsync.ListDatasetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest listDatasetGroupsRequest);

    /**
     * <p>
     * Returns a list of dataset groups created using the <a>CreateDatasetGroup</a> operation. For each dataset group,
     * this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve
     * the complete set of properties by using the dataset group ARN with the <a>DescribeDatasetGroup</a> operation.
     * </p>
     * 
     * @param listDatasetGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetGroups operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListDatasetGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasetGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetGroupsResult> listDatasetGroupsAsync(ListDatasetGroupsRequest listDatasetGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetGroupsRequest, ListDatasetGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of dataset import jobs created using the <a>CreateDatasetImportJob</a> operation. For each import
     * job, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the ARN with the <a>DescribeDatasetImportJob</a> operation. You
     * can filter the list by providing an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listDatasetImportJobsRequest
     * @return A Java Future containing the result of the ListDatasetImportJobs operation returned by the service.
     * @sample AmazonForecastAsync.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasetImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest listDatasetImportJobsRequest);

    /**
     * <p>
     * Returns a list of dataset import jobs created using the <a>CreateDatasetImportJob</a> operation. For each import
     * job, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the ARN with the <a>DescribeDatasetImportJob</a> operation. You
     * can filter the list by providing an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listDatasetImportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasetImportJobs operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasetImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest listDatasetImportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetImportJobsRequest, ListDatasetImportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of datasets created using the <a>CreateDataset</a> operation. For each dataset, a summary of its
     * properties, including its Amazon Resource Name (ARN), is returned. To retrieve the complete set of properties,
     * use the ARN with the <a>DescribeDataset</a> operation.
     * </p>
     * 
     * @param listDatasetsRequest
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonForecastAsync.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Returns a list of datasets created using the <a>CreateDataset</a> operation. For each dataset, a summary of its
     * properties, including its Amazon Resource Name (ARN), is returned. To retrieve the complete set of properties,
     * use the ARN with the <a>DescribeDataset</a> operation.
     * </p>
     * 
     * @param listDatasetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDatasets operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListDatasets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetsResult> listDatasetsAsync(ListDatasetsRequest listDatasetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDatasetsRequest, ListDatasetsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of forecast export jobs created using the <a>CreateForecastExportJob</a> operation. For each
     * forecast export job, this operation returns a summary of its properties, including its Amazon Resource Name
     * (ARN). To retrieve the complete set of properties, use the ARN with the <a>DescribeForecastExportJob</a>
     * operation. You can filter the list using an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listForecastExportJobsRequest
     * @return A Java Future containing the result of the ListForecastExportJobs operation returned by the service.
     * @sample AmazonForecastAsync.ListForecastExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecastExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListForecastExportJobsResult> listForecastExportJobsAsync(ListForecastExportJobsRequest listForecastExportJobsRequest);

    /**
     * <p>
     * Returns a list of forecast export jobs created using the <a>CreateForecastExportJob</a> operation. For each
     * forecast export job, this operation returns a summary of its properties, including its Amazon Resource Name
     * (ARN). To retrieve the complete set of properties, use the ARN with the <a>DescribeForecastExportJob</a>
     * operation. You can filter the list using an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listForecastExportJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListForecastExportJobs operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListForecastExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecastExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListForecastExportJobsResult> listForecastExportJobsAsync(ListForecastExportJobsRequest listForecastExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListForecastExportJobsRequest, ListForecastExportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of forecasts created using the <a>CreateForecast</a> operation. For each forecast, this operation
     * returns a summary of its properties, including its Amazon Resource Name (ARN). To retrieve the complete set of
     * properties, specify the ARN with the <a>DescribeForecast</a> operation. You can filter the list using an array of
     * <a>Filter</a> objects.
     * </p>
     * 
     * @param listForecastsRequest
     * @return A Java Future containing the result of the ListForecasts operation returned by the service.
     * @sample AmazonForecastAsync.ListForecasts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecasts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListForecastsResult> listForecastsAsync(ListForecastsRequest listForecastsRequest);

    /**
     * <p>
     * Returns a list of forecasts created using the <a>CreateForecast</a> operation. For each forecast, this operation
     * returns a summary of its properties, including its Amazon Resource Name (ARN). To retrieve the complete set of
     * properties, specify the ARN with the <a>DescribeForecast</a> operation. You can filter the list using an array of
     * <a>Filter</a> objects.
     * </p>
     * 
     * @param listForecastsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListForecasts operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListForecasts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecasts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListForecastsResult> listForecastsAsync(ListForecastsRequest listForecastsRequest,
            com.amazonaws.handlers.AsyncHandler<ListForecastsRequest, ListForecastsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListPredictorBacktestExportJobs operation returned by the
     *         service.
     * @sample AmazonForecastAsync.ListPredictorBacktestExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListPredictorBacktestExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPredictorBacktestExportJobsResult> listPredictorBacktestExportJobsAsync(
            ListPredictorBacktestExportJobsRequest listPredictorBacktestExportJobsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPredictorBacktestExportJobs operation returned by the
     *         service.
     * @sample AmazonForecastAsyncHandler.ListPredictorBacktestExportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListPredictorBacktestExportJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPredictorBacktestExportJobsResult> listPredictorBacktestExportJobsAsync(
            ListPredictorBacktestExportJobsRequest listPredictorBacktestExportJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPredictorBacktestExportJobsRequest, ListPredictorBacktestExportJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of predictors created using the <a>CreatePredictor</a> operation. For each predictor, this
     * operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the
     * complete set of properties by using the ARN with the <a>DescribePredictor</a> operation. You can filter the list
     * using an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listPredictorsRequest
     * @return A Java Future containing the result of the ListPredictors operation returned by the service.
     * @sample AmazonForecastAsync.ListPredictors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListPredictors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPredictorsResult> listPredictorsAsync(ListPredictorsRequest listPredictorsRequest);

    /**
     * <p>
     * Returns a list of predictors created using the <a>CreatePredictor</a> operation. For each predictor, this
     * operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can retrieve the
     * complete set of properties by using the ARN with the <a>DescribePredictor</a> operation. You can filter the list
     * using an array of <a>Filter</a> objects.
     * </p>
     * 
     * @param listPredictorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPredictors operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListPredictors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListPredictors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPredictorsResult> listPredictorsAsync(ListPredictorsRequest listPredictorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPredictorsRequest, ListPredictorsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags for an Amazon Forecast resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonForecastAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags for an Amazon Forecast resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

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
     * </ul>
     * 
     * @param stopResourceRequest
     * @return A Java Future containing the result of the StopResource operation returned by the service.
     * @sample AmazonForecastAsync.StopResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/StopResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopResourceResult> stopResourceAsync(StopResourceRequest stopResourceRequest);

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
     * </ul>
     * 
     * @param stopResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopResource operation returned by the service.
     * @sample AmazonForecastAsyncHandler.StopResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/StopResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopResourceResult> stopResourceAsync(StopResourceRequest stopResourceRequest,
            com.amazonaws.handlers.AsyncHandler<StopResourceRequest, StopResourceResult> asyncHandler);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonForecastAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Associates the specified tags to a resource with the specified <code>resourceArn</code>. If existing tags on a
     * resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags
     * associated with that resource are also deleted.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonForecastAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonForecastAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes the specified tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonForecastAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Replaces the datasets in a dataset group with the specified datasets.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before you can use the dataset group to
     * create a predictor. Use the <a>DescribeDatasetGroup</a> operation to get the status.
     * </p>
     * </note>
     * 
     * @param updateDatasetGroupRequest
     * @return A Java Future containing the result of the UpdateDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsync.UpdateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/UpdateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetGroupResult> updateDatasetGroupAsync(UpdateDatasetGroupRequest updateDatasetGroupRequest);

    /**
     * <p>
     * Replaces the datasets in a dataset group with the specified datasets.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before you can use the dataset group to
     * create a predictor. Use the <a>DescribeDatasetGroup</a> operation to get the status.
     * </p>
     * </note>
     * 
     * @param updateDatasetGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsyncHandler.UpdateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/UpdateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDatasetGroupResult> updateDatasetGroupAsync(UpdateDatasetGroupRequest updateDatasetGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDatasetGroupRequest, UpdateDatasetGroupResult> asyncHandler);

}
