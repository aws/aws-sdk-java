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
    CreateAutoPredictorResult createAutoPredictor(CreateAutoPredictorRequest createAutoPredictorRequest);

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
    CreateDatasetResult createDataset(CreateDatasetRequest createDatasetRequest);

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
    CreateDatasetGroupResult createDatasetGroup(CreateDatasetGroupRequest createDatasetGroupRequest);

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
    CreateDatasetImportJobResult createDatasetImportJob(CreateDatasetImportJobRequest createDatasetImportJobRequest);

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
    CreateExplainabilityResult createExplainability(CreateExplainabilityRequest createExplainabilityRequest);

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
    CreateExplainabilityExportResult createExplainabilityExport(CreateExplainabilityExportRequest createExplainabilityExportRequest);

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
    CreateForecastResult createForecast(CreateForecastRequest createForecastRequest);

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
    CreateForecastExportJobResult createForecastExportJob(CreateForecastExportJobRequest createForecastExportJobRequest);

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
    CreateMonitorResult createMonitor(CreateMonitorRequest createMonitorRequest);

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
    CreatePredictorResult createPredictor(CreatePredictorRequest createPredictorRequest);

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
    CreatePredictorBacktestExportJobResult createPredictorBacktestExportJob(CreatePredictorBacktestExportJobRequest createPredictorBacktestExportJobRequest);

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
    CreateWhatIfAnalysisResult createWhatIfAnalysis(CreateWhatIfAnalysisRequest createWhatIfAnalysisRequest);

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
    CreateWhatIfForecastResult createWhatIfForecast(CreateWhatIfForecastRequest createWhatIfForecastRequest);

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
    CreateWhatIfForecastExportResult createWhatIfForecastExport(CreateWhatIfForecastExportRequest createWhatIfForecastExportRequest);

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
    DeleteDatasetResult deleteDataset(DeleteDatasetRequest deleteDatasetRequest);

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
    DeleteDatasetGroupResult deleteDatasetGroup(DeleteDatasetGroupRequest deleteDatasetGroupRequest);

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
    DeleteDatasetImportJobResult deleteDatasetImportJob(DeleteDatasetImportJobRequest deleteDatasetImportJobRequest);

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
    DeleteExplainabilityResult deleteExplainability(DeleteExplainabilityRequest deleteExplainabilityRequest);

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
    DeleteExplainabilityExportResult deleteExplainabilityExport(DeleteExplainabilityExportRequest deleteExplainabilityExportRequest);

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
    DeleteForecastResult deleteForecast(DeleteForecastRequest deleteForecastRequest);

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
    DeleteForecastExportJobResult deleteForecastExportJob(DeleteForecastExportJobRequest deleteForecastExportJobRequest);

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
    DeleteMonitorResult deleteMonitor(DeleteMonitorRequest deleteMonitorRequest);

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
    DeletePredictorResult deletePredictor(DeletePredictorRequest deletePredictorRequest);

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
    DeletePredictorBacktestExportJobResult deletePredictorBacktestExportJob(DeletePredictorBacktestExportJobRequest deletePredictorBacktestExportJobRequest);

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
    DeleteResourceTreeResult deleteResourceTree(DeleteResourceTreeRequest deleteResourceTreeRequest);

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
    DeleteWhatIfAnalysisResult deleteWhatIfAnalysis(DeleteWhatIfAnalysisRequest deleteWhatIfAnalysisRequest);

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
    DeleteWhatIfForecastResult deleteWhatIfForecast(DeleteWhatIfForecastRequest deleteWhatIfForecastRequest);

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
    DeleteWhatIfForecastExportResult deleteWhatIfForecastExport(DeleteWhatIfForecastExportRequest deleteWhatIfForecastExportRequest);

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
    DescribeAutoPredictorResult describeAutoPredictor(DescribeAutoPredictorRequest describeAutoPredictorRequest);

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
    DescribeDatasetResult describeDataset(DescribeDatasetRequest describeDatasetRequest);

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
    DescribeDatasetGroupResult describeDatasetGroup(DescribeDatasetGroupRequest describeDatasetGroupRequest);

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
    DescribeDatasetImportJobResult describeDatasetImportJob(DescribeDatasetImportJobRequest describeDatasetImportJobRequest);

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
    DescribeExplainabilityResult describeExplainability(DescribeExplainabilityRequest describeExplainabilityRequest);

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
    DescribeExplainabilityExportResult describeExplainabilityExport(DescribeExplainabilityExportRequest describeExplainabilityExportRequest);

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
    DescribeForecastResult describeForecast(DescribeForecastRequest describeForecastRequest);

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
    DescribeForecastExportJobResult describeForecastExportJob(DescribeForecastExportJobRequest describeForecastExportJobRequest);

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
    DescribeMonitorResult describeMonitor(DescribeMonitorRequest describeMonitorRequest);

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
    DescribePredictorResult describePredictor(DescribePredictorRequest describePredictorRequest);

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
    DescribePredictorBacktestExportJobResult describePredictorBacktestExportJob(
            DescribePredictorBacktestExportJobRequest describePredictorBacktestExportJobRequest);

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
    DescribeWhatIfAnalysisResult describeWhatIfAnalysis(DescribeWhatIfAnalysisRequest describeWhatIfAnalysisRequest);

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
    DescribeWhatIfForecastResult describeWhatIfForecast(DescribeWhatIfForecastRequest describeWhatIfForecastRequest);

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
    DescribeWhatIfForecastExportResult describeWhatIfForecastExport(DescribeWhatIfForecastExportRequest describeWhatIfForecastExportRequest);

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
    GetAccuracyMetricsResult getAccuracyMetrics(GetAccuracyMetricsRequest getAccuracyMetricsRequest);

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
    ListDatasetGroupsResult listDatasetGroups(ListDatasetGroupsRequest listDatasetGroupsRequest);

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
    ListDatasetImportJobsResult listDatasetImportJobs(ListDatasetImportJobsRequest listDatasetImportJobsRequest);

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
    ListDatasetsResult listDatasets(ListDatasetsRequest listDatasetsRequest);

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
    ListExplainabilitiesResult listExplainabilities(ListExplainabilitiesRequest listExplainabilitiesRequest);

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
    ListExplainabilityExportsResult listExplainabilityExports(ListExplainabilityExportsRequest listExplainabilityExportsRequest);

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
    ListForecastExportJobsResult listForecastExportJobs(ListForecastExportJobsRequest listForecastExportJobsRequest);

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
    ListForecastsResult listForecasts(ListForecastsRequest listForecastsRequest);

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
    ListMonitorEvaluationsResult listMonitorEvaluations(ListMonitorEvaluationsRequest listMonitorEvaluationsRequest);

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
    ListMonitorsResult listMonitors(ListMonitorsRequest listMonitorsRequest);

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
    ListPredictorBacktestExportJobsResult listPredictorBacktestExportJobs(ListPredictorBacktestExportJobsRequest listPredictorBacktestExportJobsRequest);

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
    ListPredictorsResult listPredictors(ListPredictorsRequest listPredictorsRequest);

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
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
    ListWhatIfAnalysesResult listWhatIfAnalyses(ListWhatIfAnalysesRequest listWhatIfAnalysesRequest);

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
    ListWhatIfForecastExportsResult listWhatIfForecastExports(ListWhatIfForecastExportsRequest listWhatIfForecastExportsRequest);

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
    ListWhatIfForecastsResult listWhatIfForecasts(ListWhatIfForecastsRequest listWhatIfForecastsRequest);

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
    ResumeResourceResult resumeResource(ResumeResourceRequest resumeResourceRequest);

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
    StopResourceResult stopResource(StopResourceRequest stopResourceRequest);

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
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
