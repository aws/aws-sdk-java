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
     * @return A Java Future containing the result of the CreateAutoPredictor operation returned by the service.
     * @sample AmazonForecastAsync.CreateAutoPredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateAutoPredictor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoPredictorResult> createAutoPredictorAsync(CreateAutoPredictorRequest createAutoPredictorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAutoPredictor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateAutoPredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateAutoPredictor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoPredictorResult> createAutoPredictorAsync(CreateAutoPredictorRequest createAutoPredictorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAutoPredictorRequest, CreateAutoPredictorResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsync.CreateDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDatasetGroupResult> createDatasetGroupAsync(CreateDatasetGroupRequest createDatasetGroupRequest);

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
     * @return A Java Future containing the result of the CreateExplainability operation returned by the service.
     * @sample AmazonForecastAsync.CreateExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainability" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExplainabilityResult> createExplainabilityAsync(CreateExplainabilityRequest createExplainabilityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExplainability operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainability" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateExplainabilityResult> createExplainabilityAsync(CreateExplainabilityRequest createExplainabilityRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExplainabilityRequest, CreateExplainabilityResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateExplainabilityExport operation returned by the service.
     * @sample AmazonForecastAsync.CreateExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateExplainabilityExportResult> createExplainabilityExportAsync(
            CreateExplainabilityExportRequest createExplainabilityExportRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateExplainabilityExport operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateExplainabilityExportResult> createExplainabilityExportAsync(
            CreateExplainabilityExportRequest createExplainabilityExportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateExplainabilityExportRequest, CreateExplainabilityExportResult> asyncHandler);

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
     * <p>
     * By default, a forecast includes predictions for every item (<code>item_id</code>) in the dataset group that was
     * used to train the predictor. However, you can use the <code>TimeSeriesSelector</code> object to generate a
     * forecast on a subset of time series. Forecast creation is skipped for any time series that you specify that are
     * not in the input dataset. The forecast export file will not contain these time series or their forecasted values.
     * </p>
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
     * Creates a predictor monitor resource for an existing auto predictor. Predictor monitoring allows you to see how
     * your predictor's performance changes over time. For more information, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * </p>
     * 
     * @param createMonitorRequest
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AmazonForecastAsync.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest);

    /**
     * <p>
     * Creates a predictor monitor resource for an existing auto predictor. Predictor monitoring allows you to see how
     * your predictor's performance changes over time. For more information, see <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/predictor-monitoring.html">Predictor Monitoring</a>.
     * </p>
     * 
     * @param createMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMonitor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMonitorResult> createMonitorAsync(CreateMonitorRequest createMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMonitorRequest, CreateMonitorResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreatePredictor operation returned by the service.
     * @sample AmazonForecastAsync.CreatePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreatePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreatePredictorResult> createPredictorAsync(CreatePredictorRequest createPredictorRequest);

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
     * @return A Java Future containing the result of the CreateWhatIfAnalysis operation returned by the service.
     * @sample AmazonForecastAsync.CreateWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWhatIfAnalysisResult> createWhatIfAnalysisAsync(CreateWhatIfAnalysisRequest createWhatIfAnalysisRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWhatIfAnalysis operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWhatIfAnalysisResult> createWhatIfAnalysisAsync(CreateWhatIfAnalysisRequest createWhatIfAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWhatIfAnalysisRequest, CreateWhatIfAnalysisResult> asyncHandler);

    /**
     * <p>
     * A what-if forecast is a forecast that is created from a modified version of the baseline forecast. Each what-if
     * forecast incorporates either a replacement dataset or a set of transformations to the original dataset.
     * </p>
     * 
     * @param createWhatIfForecastRequest
     * @return A Java Future containing the result of the CreateWhatIfForecast operation returned by the service.
     * @sample AmazonForecastAsync.CreateWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecast" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWhatIfForecastResult> createWhatIfForecastAsync(CreateWhatIfForecastRequest createWhatIfForecastRequest);

    /**
     * <p>
     * A what-if forecast is a forecast that is created from a modified version of the baseline forecast. Each what-if
     * forecast incorporates either a replacement dataset or a set of transformations to the original dataset.
     * </p>
     * 
     * @param createWhatIfForecastRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWhatIfForecast operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecast" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateWhatIfForecastResult> createWhatIfForecastAsync(CreateWhatIfForecastRequest createWhatIfForecastRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWhatIfForecastRequest, CreateWhatIfForecastResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateWhatIfForecastExport operation returned by the service.
     * @sample AmazonForecastAsync.CreateWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWhatIfForecastExportResult> createWhatIfForecastExportAsync(
            CreateWhatIfForecastExportRequest createWhatIfForecastExportRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWhatIfForecastExport operation returned by the service.
     * @sample AmazonForecastAsyncHandler.CreateWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/CreateWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateWhatIfForecastExportResult> createWhatIfForecastExportAsync(
            CreateWhatIfForecastExportRequest createWhatIfForecastExportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWhatIfForecastExportRequest, CreateWhatIfForecastExportResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteDataset operation returned by the service.
     * @sample AmazonForecastAsync.DeleteDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetResult> deleteDatasetAsync(DeleteDatasetRequest deleteDatasetRequest);

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
     * @return A Java Future containing the result of the DeleteDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsync.DeleteDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDatasetGroupResult> deleteDatasetGroupAsync(DeleteDatasetGroupRequest deleteDatasetGroupRequest);

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
     * Deletes a dataset import job created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetImportJob.html">CreateDatasetImportJob</a>
     * operation. You can delete only dataset import jobs that have a status of <code>ACTIVE</code> or
     * <code>CREATE_FAILED</code>. To get the status, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetImportJob.html"
     * >DescribeDatasetImportJob</a> operation.
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
     * Deletes a dataset import job created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetImportJob.html">CreateDatasetImportJob</a>
     * operation. You can delete only dataset import jobs that have a status of <code>ACTIVE</code> or
     * <code>CREATE_FAILED</code>. To get the status, use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetImportJob.html"
     * >DescribeDatasetImportJob</a> operation.
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
     * Deletes an Explainability resource.
     * </p>
     * <p>
     * You can delete only predictor that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the
     * status, use the <a>DescribeExplainability</a> operation.
     * </p>
     * 
     * @param deleteExplainabilityRequest
     * @return A Java Future containing the result of the DeleteExplainability operation returned by the service.
     * @sample AmazonForecastAsync.DeleteExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteExplainability" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExplainabilityResult> deleteExplainabilityAsync(DeleteExplainabilityRequest deleteExplainabilityRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExplainability operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteExplainability" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExplainabilityResult> deleteExplainabilityAsync(DeleteExplainabilityRequest deleteExplainabilityRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExplainabilityRequest, DeleteExplainabilityResult> asyncHandler);

    /**
     * <p>
     * Deletes an Explainability export.
     * </p>
     * 
     * @param deleteExplainabilityExportRequest
     * @return A Java Future containing the result of the DeleteExplainabilityExport operation returned by the service.
     * @sample AmazonForecastAsync.DeleteExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExplainabilityExportResult> deleteExplainabilityExportAsync(
            DeleteExplainabilityExportRequest deleteExplainabilityExportRequest);

    /**
     * <p>
     * Deletes an Explainability export.
     * </p>
     * 
     * @param deleteExplainabilityExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteExplainabilityExport operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteExplainabilityExportResult> deleteExplainabilityExportAsync(
            DeleteExplainabilityExportRequest deleteExplainabilityExportRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteExplainabilityExportRequest, DeleteExplainabilityExportResult> asyncHandler);

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
     * Deletes a monitor resource. You can only delete a monitor resource with a status of <code>ACTIVE</code>,
     * <code>ACTIVE_STOPPED</code>, <code>CREATE_FAILED</code>, or <code>CREATE_STOPPED</code>.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AmazonForecastAsync.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest);

    /**
     * <p>
     * Deletes a monitor resource. You can only delete a monitor resource with a status of <code>ACTIVE</code>,
     * <code>ACTIVE_STOPPED</code>, <code>CREATE_FAILED</code>, or <code>CREATE_STOPPED</code>.
     * </p>
     * 
     * @param deleteMonitorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMonitor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMonitorResult> deleteMonitorAsync(DeleteMonitorRequest deleteMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMonitorRequest, DeleteMonitorResult> asyncHandler);

    /**
     * <p>
     * Deletes a predictor created using the <a>DescribePredictor</a> or <a>CreatePredictor</a> operations. You can
     * delete only predictor that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status,
     * use the <a>DescribePredictor</a> operation.
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
     * Deletes a predictor created using the <a>DescribePredictor</a> or <a>CreatePredictor</a> operations. You can
     * delete only predictor that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status,
     * use the <a>DescribePredictor</a> operation.
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
     * Deletes a what-if analysis created using the <a>CreateWhatIfAnalysis</a> operation. You can delete only what-if
     * analyses that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the status, use the
     * <a>DescribeWhatIfAnalysis</a> operation.
     * </p>
     * <p>
     * You can't delete a what-if analysis while any of its forecasts are being exported.
     * </p>
     * 
     * @param deleteWhatIfAnalysisRequest
     * @return A Java Future containing the result of the DeleteWhatIfAnalysis operation returned by the service.
     * @sample AmazonForecastAsync.DeleteWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWhatIfAnalysisResult> deleteWhatIfAnalysisAsync(DeleteWhatIfAnalysisRequest deleteWhatIfAnalysisRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWhatIfAnalysis operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfAnalysis" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWhatIfAnalysisResult> deleteWhatIfAnalysisAsync(DeleteWhatIfAnalysisRequest deleteWhatIfAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWhatIfAnalysisRequest, DeleteWhatIfAnalysisResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteWhatIfForecast operation returned by the service.
     * @sample AmazonForecastAsync.DeleteWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfForecast" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWhatIfForecastResult> deleteWhatIfForecastAsync(DeleteWhatIfForecastRequest deleteWhatIfForecastRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWhatIfForecast operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfForecast" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWhatIfForecastResult> deleteWhatIfForecastAsync(DeleteWhatIfForecastRequest deleteWhatIfForecastRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWhatIfForecastRequest, DeleteWhatIfForecastResult> asyncHandler);

    /**
     * <p>
     * Deletes a what-if forecast export created using the <a>CreateWhatIfForecastExport</a> operation. You can delete
     * only what-if forecast exports that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the
     * status, use the <a>DescribeWhatIfForecastExport</a> operation.
     * </p>
     * 
     * @param deleteWhatIfForecastExportRequest
     * @return A Java Future containing the result of the DeleteWhatIfForecastExport operation returned by the service.
     * @sample AmazonForecastAsync.DeleteWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWhatIfForecastExportResult> deleteWhatIfForecastExportAsync(
            DeleteWhatIfForecastExportRequest deleteWhatIfForecastExportRequest);

    /**
     * <p>
     * Deletes a what-if forecast export created using the <a>CreateWhatIfForecastExport</a> operation. You can delete
     * only what-if forecast exports that have a status of <code>ACTIVE</code> or <code>CREATE_FAILED</code>. To get the
     * status, use the <a>DescribeWhatIfForecastExport</a> operation.
     * </p>
     * 
     * @param deleteWhatIfForecastExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWhatIfForecastExport operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DeleteWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DeleteWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteWhatIfForecastExportResult> deleteWhatIfForecastExportAsync(
            DeleteWhatIfForecastExportRequest deleteWhatIfForecastExportRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWhatIfForecastExportRequest, DeleteWhatIfForecastExportResult> asyncHandler);

    /**
     * <p>
     * Describes a predictor created using the CreateAutoPredictor operation.
     * </p>
     * 
     * @param describeAutoPredictorRequest
     * @return A Java Future containing the result of the DescribeAutoPredictor operation returned by the service.
     * @sample AmazonForecastAsync.DescribeAutoPredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeAutoPredictor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoPredictorResult> describeAutoPredictorAsync(DescribeAutoPredictorRequest describeAutoPredictorRequest);

    /**
     * <p>
     * Describes a predictor created using the CreateAutoPredictor operation.
     * </p>
     * 
     * @param describeAutoPredictorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoPredictor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeAutoPredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeAutoPredictor" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoPredictorResult> describeAutoPredictorAsync(DescribeAutoPredictorRequest describeAutoPredictorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoPredictorRequest, DescribeAutoPredictorResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeDataset operation returned by the service.
     * @sample AmazonForecastAsync.DescribeDataset
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDataset" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetResult> describeDatasetAsync(DescribeDatasetRequest describeDatasetRequest);

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
     * @return A Java Future containing the result of the DescribeDatasetGroup operation returned by the service.
     * @sample AmazonForecastAsync.DescribeDatasetGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetGroupResult> describeDatasetGroupAsync(DescribeDatasetGroupRequest describeDatasetGroupRequest);

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
     * @return A Java Future containing the result of the DescribeDatasetImportJob operation returned by the service.
     * @sample AmazonForecastAsync.DescribeDatasetImportJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeDatasetImportJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDatasetImportJobResult> describeDatasetImportJobAsync(DescribeDatasetImportJobRequest describeDatasetImportJobRequest);

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
     * Describes an Explainability resource created using the <a>CreateExplainability</a> operation.
     * </p>
     * 
     * @param describeExplainabilityRequest
     * @return A Java Future containing the result of the DescribeExplainability operation returned by the service.
     * @sample AmazonForecastAsync.DescribeExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeExplainability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExplainabilityResult> describeExplainabilityAsync(DescribeExplainabilityRequest describeExplainabilityRequest);

    /**
     * <p>
     * Describes an Explainability resource created using the <a>CreateExplainability</a> operation.
     * </p>
     * 
     * @param describeExplainabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExplainability operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeExplainability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeExplainability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExplainabilityResult> describeExplainabilityAsync(DescribeExplainabilityRequest describeExplainabilityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExplainabilityRequest, DescribeExplainabilityResult> asyncHandler);

    /**
     * <p>
     * Describes an Explainability export created using the <a>CreateExplainabilityExport</a> operation.
     * </p>
     * 
     * @param describeExplainabilityExportRequest
     * @return A Java Future containing the result of the DescribeExplainabilityExport operation returned by the
     *         service.
     * @sample AmazonForecastAsync.DescribeExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExplainabilityExportResult> describeExplainabilityExportAsync(
            DescribeExplainabilityExportRequest describeExplainabilityExportRequest);

    /**
     * <p>
     * Describes an Explainability export created using the <a>CreateExplainabilityExport</a> operation.
     * </p>
     * 
     * @param describeExplainabilityExportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeExplainabilityExport operation returned by the
     *         service.
     * @sample AmazonForecastAsyncHandler.DescribeExplainabilityExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeExplainabilityExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeExplainabilityExportResult> describeExplainabilityExportAsync(
            DescribeExplainabilityExportRequest describeExplainabilityExportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeExplainabilityExportRequest, DescribeExplainabilityExportResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeMonitor operation returned by the service.
     * @sample AmazonForecastAsync.DescribeMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeMonitorResult> describeMonitorAsync(DescribeMonitorRequest describeMonitorRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMonitor operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeMonitor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeMonitor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeMonitorResult> describeMonitorAsync(DescribeMonitorRequest describeMonitorRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMonitorRequest, DescribeMonitorResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribePredictor operation returned by the service.
     * @sample AmazonForecastAsync.DescribePredictor
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribePredictor" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribePredictorResult> describePredictorAsync(DescribePredictorRequest describePredictorRequest);

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
     * @return A Java Future containing the result of the DescribeWhatIfAnalysis operation returned by the service.
     * @sample AmazonForecastAsync.DescribeWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWhatIfAnalysisResult> describeWhatIfAnalysisAsync(DescribeWhatIfAnalysisRequest describeWhatIfAnalysisRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWhatIfAnalysis operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeWhatIfAnalysis
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfAnalysis"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWhatIfAnalysisResult> describeWhatIfAnalysisAsync(DescribeWhatIfAnalysisRequest describeWhatIfAnalysisRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWhatIfAnalysisRequest, DescribeWhatIfAnalysisResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeWhatIfForecast operation returned by the service.
     * @sample AmazonForecastAsync.DescribeWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfForecast"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWhatIfForecastResult> describeWhatIfForecastAsync(DescribeWhatIfForecastRequest describeWhatIfForecastRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWhatIfForecast operation returned by the service.
     * @sample AmazonForecastAsyncHandler.DescribeWhatIfForecast
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfForecast"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWhatIfForecastResult> describeWhatIfForecastAsync(DescribeWhatIfForecastRequest describeWhatIfForecastRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWhatIfForecastRequest, DescribeWhatIfForecastResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeWhatIfForecastExport operation returned by the
     *         service.
     * @sample AmazonForecastAsync.DescribeWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWhatIfForecastExportResult> describeWhatIfForecastExportAsync(
            DescribeWhatIfForecastExportRequest describeWhatIfForecastExportRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWhatIfForecastExport operation returned by the
     *         service.
     * @sample AmazonForecastAsyncHandler.DescribeWhatIfForecastExport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeWhatIfForecastExport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeWhatIfForecastExportResult> describeWhatIfForecastExportAsync(
            DescribeWhatIfForecastExportRequest describeWhatIfForecastExportRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWhatIfForecastExportRequest, DescribeWhatIfForecastExportResult> asyncHandler);

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
     * Returns a list of dataset groups created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>
     * operation. For each dataset group, this operation returns a summary of its properties, including its Amazon
     * Resource Name (ARN). You can retrieve the complete set of properties by using the dataset group ARN with the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation.
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
     * Returns a list of dataset groups created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDatasetGroup.html">CreateDatasetGroup</a>
     * operation. For each dataset group, this operation returns a summary of its properties, including its Amazon
     * Resource Name (ARN). You can retrieve the complete set of properties by using the dataset group ARN with the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation.
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
     * @return A Java Future containing the result of the ListDatasetImportJobs operation returned by the service.
     * @sample AmazonForecastAsync.ListDatasetImportJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListDatasetImportJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDatasetImportJobsResult> listDatasetImportJobsAsync(ListDatasetImportJobsRequest listDatasetImportJobsRequest);

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
     * Returns a list of datasets created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html">CreateDataset</a> operation. For
     * each dataset, a summary of its properties, including its Amazon Resource Name (ARN), is returned. To retrieve the
     * complete set of properties, use the ARN with the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html">DescribeDataset</a> operation.
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
     * Returns a list of datasets created using the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_CreateDataset.html">CreateDataset</a> operation. For
     * each dataset, a summary of its properties, including its Amazon Resource Name (ARN), is returned. To retrieve the
     * complete set of properties, use the ARN with the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html">DescribeDataset</a> operation.
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
     * @return A Java Future containing the result of the ListExplainabilities operation returned by the service.
     * @sample AmazonForecastAsync.ListExplainabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExplainabilitiesResult> listExplainabilitiesAsync(ListExplainabilitiesRequest listExplainabilitiesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExplainabilities operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListExplainabilities
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilities" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListExplainabilitiesResult> listExplainabilitiesAsync(ListExplainabilitiesRequest listExplainabilitiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListExplainabilitiesRequest, ListExplainabilitiesResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListExplainabilityExports operation returned by the service.
     * @sample AmazonForecastAsync.ListExplainabilityExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilityExports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExplainabilityExportsResult> listExplainabilityExportsAsync(
            ListExplainabilityExportsRequest listExplainabilityExportsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExplainabilityExports operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListExplainabilityExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListExplainabilityExports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExplainabilityExportsResult> listExplainabilityExportsAsync(
            ListExplainabilityExportsRequest listExplainabilityExportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExplainabilityExportsRequest, ListExplainabilityExportsResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListMonitorEvaluations operation returned by the service.
     * @sample AmazonForecastAsync.ListMonitorEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListMonitorEvaluations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorEvaluationsResult> listMonitorEvaluationsAsync(ListMonitorEvaluationsRequest listMonitorEvaluationsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMonitorEvaluations operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListMonitorEvaluations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListMonitorEvaluations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorEvaluationsResult> listMonitorEvaluationsAsync(ListMonitorEvaluationsRequest listMonitorEvaluationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMonitorEvaluationsRequest, ListMonitorEvaluationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of monitors created with the <a>CreateMonitor</a> operation and <a>CreateAutoPredictor</a>
     * operation. For each monitor resource, this operation returns of a summary of its properties, including its Amazon
     * Resource Name (ARN). You can retrieve a complete set of properties of a monitor resource by specify the monitor's
     * ARN in the <a>DescribeMonitor</a> operation.
     * </p>
     * 
     * @param listMonitorsRequest
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AmazonForecastAsync.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest);

    /**
     * <p>
     * Returns a list of monitors created with the <a>CreateMonitor</a> operation and <a>CreateAutoPredictor</a>
     * operation. For each monitor resource, this operation returns of a summary of its properties, including its Amazon
     * Resource Name (ARN). You can retrieve a complete set of properties of a monitor resource by specify the monitor's
     * ARN in the <a>DescribeMonitor</a> operation.
     * </p>
     * 
     * @param listMonitorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMonitors operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListMonitors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListMonitors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMonitorsResult> listMonitorsAsync(ListMonitorsRequest listMonitorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMonitorsRequest, ListMonitorsResult> asyncHandler);

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
     * Returns a list of predictors created using the <a>CreateAutoPredictor</a> or <a>CreatePredictor</a> operations.
     * For each predictor, this operation returns a summary of its properties, including its Amazon Resource Name (ARN).
     * </p>
     * <p>
     * You can retrieve the complete set of properties by using the ARN with the <a>DescribeAutoPredictor</a> and
     * <a>DescribePredictor</a> operations. You can filter the list using an array of <a>Filter</a> objects.
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
     * Returns a list of predictors created using the <a>CreateAutoPredictor</a> or <a>CreatePredictor</a> operations.
     * For each predictor, this operation returns a summary of its properties, including its Amazon Resource Name (ARN).
     * </p>
     * <p>
     * You can retrieve the complete set of properties by using the ARN with the <a>DescribeAutoPredictor</a> and
     * <a>DescribePredictor</a> operations. You can filter the list using an array of <a>Filter</a> objects.
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
     * Returns a list of what-if analyses created using the <a>CreateWhatIfAnalysis</a> operation. For each what-if
     * analysis, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the what-if analysis ARN with the <a>DescribeWhatIfAnalysis</a>
     * operation.
     * </p>
     * 
     * @param listWhatIfAnalysesRequest
     * @return A Java Future containing the result of the ListWhatIfAnalyses operation returned by the service.
     * @sample AmazonForecastAsync.ListWhatIfAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfAnalyses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWhatIfAnalysesResult> listWhatIfAnalysesAsync(ListWhatIfAnalysesRequest listWhatIfAnalysesRequest);

    /**
     * <p>
     * Returns a list of what-if analyses created using the <a>CreateWhatIfAnalysis</a> operation. For each what-if
     * analysis, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the what-if analysis ARN with the <a>DescribeWhatIfAnalysis</a>
     * operation.
     * </p>
     * 
     * @param listWhatIfAnalysesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWhatIfAnalyses operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListWhatIfAnalyses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfAnalyses" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWhatIfAnalysesResult> listWhatIfAnalysesAsync(ListWhatIfAnalysesRequest listWhatIfAnalysesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWhatIfAnalysesRequest, ListWhatIfAnalysesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of what-if forecast exports created using the <a>CreateWhatIfForecastExport</a> operation. For
     * each what-if forecast export, this operation returns a summary of its properties, including its Amazon Resource
     * Name (ARN). You can retrieve the complete set of properties by using the what-if forecast export ARN with the
     * <a>DescribeWhatIfForecastExport</a> operation.
     * </p>
     * 
     * @param listWhatIfForecastExportsRequest
     * @return A Java Future containing the result of the ListWhatIfForecastExports operation returned by the service.
     * @sample AmazonForecastAsync.ListWhatIfForecastExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecastExports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWhatIfForecastExportsResult> listWhatIfForecastExportsAsync(
            ListWhatIfForecastExportsRequest listWhatIfForecastExportsRequest);

    /**
     * <p>
     * Returns a list of what-if forecast exports created using the <a>CreateWhatIfForecastExport</a> operation. For
     * each what-if forecast export, this operation returns a summary of its properties, including its Amazon Resource
     * Name (ARN). You can retrieve the complete set of properties by using the what-if forecast export ARN with the
     * <a>DescribeWhatIfForecastExport</a> operation.
     * </p>
     * 
     * @param listWhatIfForecastExportsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWhatIfForecastExports operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListWhatIfForecastExports
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecastExports"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListWhatIfForecastExportsResult> listWhatIfForecastExportsAsync(
            ListWhatIfForecastExportsRequest listWhatIfForecastExportsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWhatIfForecastExportsRequest, ListWhatIfForecastExportsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of what-if forecasts created using the <a>CreateWhatIfForecast</a> operation. For each what-if
     * forecast, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the what-if forecast ARN with the <a>DescribeWhatIfForecast</a>
     * operation.
     * </p>
     * 
     * @param listWhatIfForecastsRequest
     * @return A Java Future containing the result of the ListWhatIfForecasts operation returned by the service.
     * @sample AmazonForecastAsync.ListWhatIfForecasts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecasts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWhatIfForecastsResult> listWhatIfForecastsAsync(ListWhatIfForecastsRequest listWhatIfForecastsRequest);

    /**
     * <p>
     * Returns a list of what-if forecasts created using the <a>CreateWhatIfForecast</a> operation. For each what-if
     * forecast, this operation returns a summary of its properties, including its Amazon Resource Name (ARN). You can
     * retrieve the complete set of properties by using the what-if forecast ARN with the <a>DescribeWhatIfForecast</a>
     * operation.
     * </p>
     * 
     * @param listWhatIfForecastsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWhatIfForecasts operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ListWhatIfForecasts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListWhatIfForecasts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListWhatIfForecastsResult> listWhatIfForecastsAsync(ListWhatIfForecastsRequest listWhatIfForecastsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWhatIfForecastsRequest, ListWhatIfForecastsResult> asyncHandler);

    /**
     * <p>
     * Resumes a stopped monitor resource.
     * </p>
     * 
     * @param resumeResourceRequest
     * @return A Java Future containing the result of the ResumeResource operation returned by the service.
     * @sample AmazonForecastAsync.ResumeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ResumeResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResumeResourceResult> resumeResourceAsync(ResumeResourceRequest resumeResourceRequest);

    /**
     * <p>
     * Resumes a stopped monitor resource.
     * </p>
     * 
     * @param resumeResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeResource operation returned by the service.
     * @sample AmazonForecastAsyncHandler.ResumeResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ResumeResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResumeResourceResult> resumeResourceAsync(ResumeResourceRequest resumeResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeResourceRequest, ResumeResourceResult> asyncHandler);

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
     * create a predictor. Use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation to get the status.
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
     * create a predictor. Use the <a
     * href="https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDatasetGroup.html">DescribeDatasetGroup</a>
     * operation to get the status.
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
