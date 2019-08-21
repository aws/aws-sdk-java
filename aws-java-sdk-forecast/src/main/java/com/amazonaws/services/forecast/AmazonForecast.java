/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.forecast.model.*;

/**
 * Interface for accessing Amazon Forecast Service.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.forecast.AbstractAmazonForecast} instead.
 * </p>
 * <p>
 * <p>
 * Provides APIs for creating and managing Amazon Forecast resources.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonForecast {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "forecast";

    /**
     * <p>
     * Creates an Amazon Forecast dataset. The information about the dataset that you provide helps Forecast understand
     * how to consume the data for model training. This includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i> <code>DataFrequency</code> </i> - How frequently your historical time-series data is collected. Amazon
     * Forecast uses this information when training the model and generating a forecast.
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
     * <i> <code>Schema</code> </i> - A schema specifies the fields of the dataset, including the field name and data
     * type.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating a dataset, you import your training data into the dataset and add the dataset to a dataset group.
     * You then use the dataset group to create a predictor. For more information, see
     * <a>howitworks-datasets-groups</a>.
     * </p>
     * <p>
     * To get a list of all your datasets, use the <a>ListDatasets</a> operation.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of a dataset must be <code>ACTIVE</code> before you can import training data. Use the
     * <a>DescribeDataset</a> operation to get the status.
     * </p>
     * </note>
     * 
     * @param createDatasetRequest
     * @return Result of the CreateDataset operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with that Amazon Resource Name (ARN). Try again with a different ARN.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonForecast.CreateDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDataset" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

    /**
     * <p>
     * Creates an Amazon Forecast dataset group, which holds a collection of related datasets. You can add datasets to
     * the dataset group when you create the dataset group, or you can add datasets later with the
     * <a>UpdateDatasetGroup</a> operation.
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
     * The <code>Status</code> of a dataset group must be <code>ACTIVE</code> before you can create a predictor using
     * the dataset group. Use the <a>DescribeDatasetGroup</a> operation to get the status.
     * </p>
     * </note>
     * 
     * @param createDatasetGroupRequest
     * @return Result of the CreateDatasetGroup operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with that Amazon Resource Name (ARN). Try again with a different ARN.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonForecast.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateDatasetGroupResult createDatasetGroup(CreateDatasetGroupRequest createDatasetGroupRequest);

    /**
     * <p>
     * Imports your training data to an Amazon Forecast dataset. You provide the location of your training data in an
     * Amazon Simple Storage Service (Amazon S3) bucket and the Amazon Resource Name (ARN) of the dataset that you want
     * to import the data to.
     * </p>
     * <p>
     * You must specify a <a>DataSource</a> object that includes an AWS Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the data. For more information, see <a>aws-forecast-iam-roles</a>.
     * </p>
     * <p>
     * Two properties of the training data are optionally specified:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The delimiter that separates the data fields.
     * </p>
     * <p>
     * The default delimiter is a comma (,), which is the only supported delimiter in this release.
     * </p>
     * </li>
     * <li>
     * <p>
     * The format of timestamps.
     * </p>
     * <p>
     * If the format is not specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
     * </p>
     * </li>
     * </ul>
     * <p>
     * When Amazon Forecast uploads your training data, it verifies that the data was collected at the
     * <code>DataFrequency</code> specified when the target dataset was created. For more information, see
     * <a>CreateDataset</a> and <a>howitworks-datasets-groups</a>. Amazon Forecast also verifies the delimiter and
     * timestamp format.
     * </p>
     * <p>
     * You can use the <a>ListDatasetImportJobs</a> operation to get a list of all your dataset import jobs, filtered by
     * specified criteria.
     * </p>
     * <p>
     * To get a list of all your dataset import jobs, filtered by the specified criteria, use the
     * <a>ListDatasetGroups</a> operation.
     * </p>
     * 
     * @param createDatasetImportJobRequest
     * @return Result of the CreateDatasetImportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with that Amazon Resource Name (ARN). Try again with a different ARN.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonForecast.CreateDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateDatasetImportJobResult createDatasetImportJob(CreateDatasetImportJobRequest createDatasetImportJobRequest);

    /**
     * <p>
     * Creates a forecast for each item in the <code>TARGET_TIME_SERIES</code> dataset that was used to train the
     * predictor. This is known as inference. To retrieve the forecast for a single item at low latency, use the
     * operation. To export the complete forecast into your Amazon Simple Storage Service (Amazon S3), use the
     * <a>CreateForecastExportJob</a> operation.
     * </p>
     * <p>
     * The range of the forecast is determined by the <code>ForecastHorizon</code>, specified in the
     * <a>CreatePredictor</a> request, multiplied by the <code>DataFrequency</code>, specified in the
     * <a>CreateDataset</a> request. When you query a forecast, you can request a specific date range within the
     * complete forecast.
     * </p>
     * <p>
     * To get a list of all your forecasts, use the <a>ListForecasts</a> operation.
     * </p>
     * <note>
     * <p>
     * The forecasts generated by Amazon Forecast are in the same timezone as the dataset that was used to create the
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
     * @return Result of the CreateForecast operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with that Amazon Resource Name (ARN). Try again with a different ARN.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonForecast.CreateForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecast" target="_top">AWS API
     *      Documentation</a>
     */
    CreateForecastResult createForecast(CreateForecastRequest createForecastRequest);

    /**
     * <p>
     * Exports a forecast created by the <a>CreateForecast</a> operation to your Amazon Simple Storage Service (Amazon
     * S3) bucket.
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
     * in your Amazon S3 bucket. Use the <a>DescribeForecastExportJob</a> operation to get the status.
     * </p>
     * </note>
     * 
     * @param createForecastExportJobRequest
     * @return Result of the CreateForecastExportJob operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with that Amazon Resource Name (ARN). Try again with a different ARN.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonForecast.CreateForecastExportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateForecastExportJob"
     *      target="_top">AWS API Documentation</a>
     */
    CreateForecastExportJobResult createForecastExportJob(CreateForecastExportJobRequest createForecastExportJobRequest);

    /**
     * <p>
     * Creates an Amazon Forecast predictor.
     * </p>
     * <p>
     * In the request, you provide a dataset group and either specify an algorithm or let Amazon Forecast choose the
     * algorithm for you using AutoML. If you specify an algorithm, you also can override algorithm-specific
     * hyperparameters.
     * </p>
     * <p>
     * Amazon Forecast uses the chosen algorithm to train a model using the latest version of the datasets in the
     * specified dataset group. The result is called a predictor. You then generate a forecast using the
     * <a>CreateForecast</a> operation.
     * </p>
     * <p>
     * After training a model, the <code>CreatePredictor</code> operation also evaluates it. To see the evaluation
     * metrics, use the <a>GetAccuracyMetrics</a> operation. Always review the evaluation metrics before deciding to use
     * the predictor to generate a forecast.
     * </p>
     * <p>
     * Optionally, you can specify a featurization configuration to fill and aggragate the data fields in the
     * <code>TARGET_TIME_SERIES</code> dataset to improve model training. For more information, see
     * <a>FeaturizationConfig</a>.
     * </p>
     * <p>
     * <b>AutoML</b>
     * </p>
     * <p>
     * If you set <code>PerformAutoML</code> to <code>true</code>, Amazon Forecast evaluates each algorithm and chooses
     * the one that minimizes the <code>objective function</code>. The <code>objective function</code> is defined as the
     * mean of the weighted p10, p50, and p90 quantile losses. For more information, see <a>EvaluationResult</a>.
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
     * To get a list of all your predictors, use the <a>ListPredictors</a> operation.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code>, signifying that training has completed,
     * before you can use the predictor to create a forecast. Use the <a>DescribePredictor</a> operation to get the
     * status.
     * </p>
     * </note>
     * 
     * @param createPredictorRequest
     * @return Result of the CreatePredictor operation returned by the service.
     * @throws InvalidInputException
     *         We can't process the request because it includes an invalid value or a value that exceeds the valid
     *         range.
     * @throws ResourceAlreadyExistsException
     *         There is already a resource with that Amazon Resource Name (ARN). Try again with a different ARN.
     * @throws ResourceNotFoundException
     *         We can't find a resource with that Amazon Resource Name (ARN). Check the ARN and try again.
     * @throws ResourceInUseException
     *         The specified resource is in use.
     * @throws LimitExceededException
     *         The limit on the number of requests per second has been exceeded.
     * @sample AmazonForecast.CreatePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    CreatePredictorResult createPredictor(CreatePredictorRequest createPredictorRequest);

    /**
     * <p>
     * Deletes an Amazon Forecast dataset created using the <a>CreateDataset</a> operation. To be deleted, the dataset
     * must have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. Use the <a>DescribeDataset</a> operation
     * to get the status.
     * </p>
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
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

    /**
     * <p>
     * Deletes a dataset group created using the <a>CreateDatasetGroup</a> operation. To be deleted, the dataset group
     * must have a status of <code>ACTIVE</code>, <code>CREATE_FAILED</code>, or <code>UPDATE_FAILED</code>. Use the
     * <a>DescribeDatasetGroup</a> operation to get the status.
     * </p>
     * <p>
     * The operation deletes only the dataset group, not the datasets in the group.
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
    DeleteDatasetGroupResult deleteDatasetGroup(DeleteDatasetGroupRequest deleteDatasetGroupRequest);

    /**
     * <p>
     * Deletes a dataset import job created using the <a>CreateDatasetImportJob</a> operation. To be deleted, the import
     * job must have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. Use the
     * <a>DescribeDatasetImportJob</a> operation to get the status.
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
    DeleteDatasetImportJobResult deleteDatasetImportJob(DeleteDatasetImportJobRequest deleteDatasetImportJobRequest);

    /**
     * <p>
     * Deletes a forecast created using the <a>CreateForecast</a> operation. To be deleted, the forecast must have a
     * status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. Use the <a>DescribeForecast</a> operation to get the
     * status.
     * </p>
     * <p>
     * You can't delete a forecast while it is being exported.
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
    DeleteForecastResult deleteForecast(DeleteForecastRequest deleteForecastRequest);

    /**
     * <p>
     * Deletes a forecast export job created using the <a>CreateForecastExportJob</a> operation. To be deleted, the
     * export job must have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. Use the
     * <a>DescribeForecastExportJob</a> operation to get the status.
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
    DeleteForecastExportJobResult deleteForecastExportJob(DeleteForecastExportJobRequest deleteForecastExportJobRequest);

    /**
     * <p>
     * Deletes a predictor created using the <a>CreatePredictor</a> operation. To be deleted, the predictor must have a
     * status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. Use the <a>DescribePredictor</a> operation to get
     * the status.
     * </p>
     * <p>
     * Any forecasts generated by the predictor will no longer be available.
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
    DeletePredictorResult deletePredictor(DeletePredictorRequest deletePredictorRequest);

    /**
     * <p>
     * Describes an Amazon Forecast dataset created using the <a>CreateDataset</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreateDataset</code> request, this
     * operation includes the following properties:
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
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

    /**
     * <p>
     * Describes a dataset group created using the <a>CreateDatasetGroup</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreateDatasetGroup</code> request, this
     * operation includes the following properties:
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
    DescribeDatasetGroupResult describeDatasetGroup(DescribeDatasetGroupRequest describeDatasetGroupRequest);

    /**
     * <p>
     * Describes a dataset import job created using the <a>CreateDatasetImportJob</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreateDatasetImportJob</code> request,
     * this operation includes the following properties:
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
    DescribeDatasetImportJobResult describeDatasetImportJob(DescribeDatasetImportJobRequest describeDatasetImportJobRequest);

    /**
     * <p>
     * Describes a forecast created using the <a>CreateForecast</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreateForecast</code> request, this
     * operation includes the following properties:
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
    DescribeForecastResult describeForecast(DescribeForecastRequest describeForecastRequest);

    /**
     * <p>
     * Describes a forecast export job created using the <a>CreateForecastExportJob</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreateForecastExportJob</code> request,
     * this operation includes the following properties:
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
    DescribeForecastExportJobResult describeForecastExportJob(DescribeForecastExportJobRequest describeForecastExportJobRequest);

    /**
     * <p>
     * Describes a predictor created using the <a>CreatePredictor</a> operation.
     * </p>
     * <p>
     * In addition to listing the properties provided by the user in the <code>CreatePredictor</code> request, this
     * operation includes the following properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DatasetImportJobArns</code> - The dataset import jobs used to import training data.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AutoMLAlgorithmArns</code> - If AutoML is performed, the algorithms evaluated.
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
    DescribePredictorResult describePredictor(DescribePredictorRequest describePredictorRequest);

    /**
     * <p>
     * Provides metrics on the accuracy of the models that were trained by the <a>CreatePredictor</a> operation. Use
     * metrics to see how well the model performed and to decide whether to use the predictor to generate a forecast.
     * </p>
     * <p>
     * Metrics are generated for each backtest window evaluated. For more information, see <a>EvaluationParameters</a>.
     * </p>
     * <p>
     * The parameters of the <code>filling</code> method determine which items contribute to the metrics. If
     * <code>zero</code> is specified, all items contribute. If <code>nan</code> is specified, only those items that
     * have complete data in the range being evaluated contribute. For more information, see <a>FeaturizationMethod</a>.
     * </p>
     * <p>
     * For an example of how to train a model and review metrics, see <a>getting-started</a>.
     * </p>
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
    GetAccuracyMetricsResult getAccuracyMetrics(GetAccuracyMetricsRequest getAccuracyMetricsRequest);

    /**
     * <p>
     * Returns a list of dataset groups created using the <a>CreateDatasetGroup</a> operation. For each dataset group, a
     * summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete
     * set of properties by using the ARN with the <a>DescribeDatasetGroup</a> operation.
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
    ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest listDatasetGroupsRequest);

    /**
     * <p>
     * Returns a list of dataset import jobs created using the <a>CreateDatasetImportJob</a> operation. For each import
     * job, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the
     * complete set of properties by using the ARN with the <a>DescribeDatasetImportJob</a> operation. You can filter
     * the list by providing an array of <a>Filter</a> objects.
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
    ListDatasetImportJobsResult listDatasetImportJobs(ListDatasetImportJobsRequest listDatasetImportJobsRequest);

    /**
     * <p>
     * Returns a list of datasets created using the <a>CreateDataset</a> operation. For each dataset, a summary of its
     * properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of
     * properties by using the ARN with the <a>DescribeDataset</a> operation.
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
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

    /**
     * <p>
     * Returns a list of forecast export jobs created using the <a>CreateForecastExportJob</a> operation. For each
     * forecast export job, a summary of its properties, including its Amazon Resource Name (ARN), is returned. You can
     * retrieve the complete set of properties by using the ARN with the <a>DescribeForecastExportJob</a> operation. The
     * list can be filtered using an array of <a>Filter</a> objects.
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
    ListForecastExportJobsResult listForecastExportJobs(ListForecastExportJobsRequest listForecastExportJobsRequest);

    /**
     * <p>
     * Returns a list of forecasts created using the <a>CreateForecast</a> operation. For each forecast, a summary of
     * its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of
     * properties by using the ARN with the <a>DescribeForecast</a> operation. The list can be filtered using an array
     * of <a>Filter</a> objects.
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
    ListForecastsResult listForecasts(ListForecastsRequest listForecastsRequest);

    /**
     * <p>
     * Returns a list of predictors created using the <a>CreatePredictor</a> operation. For each predictor, a summary of
     * its properties, including its Amazon Resource Name (ARN), is returned. You can retrieve the complete set of
     * properties by using the ARN with the <a>DescribePredictor</a> operation. The list can be filtered using an array
     * of <a>Filter</a> objects.
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
    ListPredictorsResult listPredictors(ListPredictorsRequest listPredictorsRequest);

    /**
     * <p>
     * Replaces any existing datasets in the dataset group with the specified datasets.
     * </p>
     * <note>
     * <p>
     * The <code>Status</code> of the dataset group must be <code>ACTIVE</code> before creating a predictor using the
     * dataset group. Use the <a>DescribeDatasetGroup</a> operation to get the status.
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
    UpdateDatasetGroupResult updateDatasetGroup(UpdateDatasetGroupRequest updateDatasetGroupRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
