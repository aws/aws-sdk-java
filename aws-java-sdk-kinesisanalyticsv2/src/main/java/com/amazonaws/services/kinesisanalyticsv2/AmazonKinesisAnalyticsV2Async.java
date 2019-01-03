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
package com.amazonaws.services.kinesisanalyticsv2;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;

/**
 * Interface for accessing Kinesis Analytics V2 asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisanalyticsv2.AbstractAmazonKinesisAnalyticsV2Async} instead.
 * </p>
 * <p>
 * <p>
 * Documentation for Kinesis Data Analytics API v2
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisAnalyticsV2Async extends AmazonKinesisAnalyticsV2 {

    /**
     * <p>
     * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * 
     * @param addApplicationCloudWatchLoggingOptionRequest
     * @return A Java Future containing the result of the AddApplicationCloudWatchLoggingOption operation returned by
     *         the service.
     * @sample AmazonKinesisAnalyticsV2Async.AddApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationCloudWatchLoggingOptionResult> addApplicationCloudWatchLoggingOptionAsync(
            AddApplicationCloudWatchLoggingOptionRequest addApplicationCloudWatchLoggingOptionRequest);

    /**
     * <p>
     * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * 
     * @param addApplicationCloudWatchLoggingOptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddApplicationCloudWatchLoggingOption operation returned by
     *         the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.AddApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationCloudWatchLoggingOptionResult> addApplicationCloudWatchLoggingOptionAsync(
            AddApplicationCloudWatchLoggingOptionRequest addApplicationCloudWatchLoggingOptionRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationCloudWatchLoggingOptionRequest, AddApplicationCloudWatchLoggingOptionResult> asyncHandler);

    /**
     * <p>
     * Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * You can add a streaming source when you create an application, or you can use this operation to add a streaming
     * source after you create an application. For more information, see <a>CreateApplication</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * 
     * @param addApplicationInputRequest
     * @return A Java Future containing the result of the AddApplicationInput operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.AddApplicationInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(AddApplicationInputRequest addApplicationInputRequest);

    /**
     * <p>
     * Adds a streaming source to your SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * You can add a streaming source when you create an application, or you can use this operation to add a streaming
     * source after you create an application. For more information, see <a>CreateApplication</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * 
     * @param addApplicationInputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddApplicationInput operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.AddApplicationInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationInputResult> addApplicationInputAsync(AddApplicationInputRequest addApplicationInputRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationInputRequest, AddApplicationInputResult> asyncHandler);

    /**
     * <p>
     * Adds an <a>InputProcessingConfiguration</a> to an SQL-based Kinesis Data Analytics application. An input
     * processor pre-processes records on the input stream before the application's SQL code executes. Currently, the
     * only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
     * </p>
     * 
     * @param addApplicationInputProcessingConfigurationRequest
     * @return A Java Future containing the result of the AddApplicationInputProcessingConfiguration operation returned
     *         by the service.
     * @sample AmazonKinesisAnalyticsV2Async.AddApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationInputProcessingConfigurationResult> addApplicationInputProcessingConfigurationAsync(
            AddApplicationInputProcessingConfigurationRequest addApplicationInputProcessingConfigurationRequest);

    /**
     * <p>
     * Adds an <a>InputProcessingConfiguration</a> to an SQL-based Kinesis Data Analytics application. An input
     * processor pre-processes records on the input stream before the application's SQL code executes. Currently, the
     * only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
     * </p>
     * 
     * @param addApplicationInputProcessingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddApplicationInputProcessingConfiguration operation returned
     *         by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.AddApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationInputProcessingConfigurationResult> addApplicationInputProcessingConfigurationAsync(
            AddApplicationInputProcessingConfigurationRequest addApplicationInputProcessingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationInputProcessingConfigurationRequest, AddApplicationInputProcessingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an
     * external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda
     * function), you add the relevant configuration to your application using this operation. You can configure one or
     * more outputs for your application. Each output configuration maps an in-application stream and an external
     * destination.
     * </p>
     * <p>
     * You can use one of the output configurations to deliver data from your in-application error stream to an external
     * destination so that you can analyze the errors.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * 
     * @param addApplicationOutputRequest
     * @return A Java Future containing the result of the AddApplicationOutput operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.AddApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(AddApplicationOutputRequest addApplicationOutputRequest);

    /**
     * <p>
     * Adds an external destination to your SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * If you want Kinesis Data Analytics to deliver data from an in-application stream within your application to an
     * external destination (such as an Kinesis data stream, a Kinesis Data Firehose delivery stream, or an AWS Lambda
     * function), you add the relevant configuration to your application using this operation. You can configure one or
     * more outputs for your application. Each output configuration maps an in-application stream and an external
     * destination.
     * </p>
     * <p>
     * You can use one of the output configurations to deliver data from your in-application error stream to an external
     * destination so that you can analyze the errors.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * 
     * @param addApplicationOutputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddApplicationOutput operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.AddApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationOutputResult> addApplicationOutputAsync(AddApplicationOutputRequest addApplicationOutputRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationOutputRequest, AddApplicationOutputResult> asyncHandler);

    /**
     * <p>
     * Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
     * within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
     * in-application table to create, and the necessary mapping information that describes how data in an Amazon S3
     * object maps to columns in the resulting in-application table.
     * </p>
     * 
     * @param addApplicationReferenceDataSourceRequest
     * @return A Java Future containing the result of the AddApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample AmazonKinesisAnalyticsV2Async.AddApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            AddApplicationReferenceDataSourceRequest addApplicationReferenceDataSourceRequest);

    /**
     * <p>
     * Adds a reference data source to an existing SQL-based Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
     * within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
     * in-application table to create, and the necessary mapping information that describes how data in an Amazon S3
     * object maps to columns in the resulting in-application table.
     * </p>
     * 
     * @param addApplicationReferenceDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.AddApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AddApplicationReferenceDataSourceResult> addApplicationReferenceDataSourceAsync(
            AddApplicationReferenceDataSourceRequest addApplicationReferenceDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<AddApplicationReferenceDataSourceRequest, AddApplicationReferenceDataSourceResult> asyncHandler);

    /**
     * <p>
     * Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics
     * application, see <a href="https://docs.aws.amazon.com/kinesisanalytics/latest/Java/creating-app.html">Creating an
     * Application</a>.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta release. Using SQL parameters (such as
     * <a>SqlApplicationConfiguration</a>) will result in an error.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an Amazon Kinesis Data Analytics application. For information about creating a Kinesis Data Analytics
     * application, see <a href="https://docs.aws.amazon.com/kinesisanalytics/latest/Java/creating-app.html">Creating an
     * Application</a>.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta release. Using SQL parameters (such as
     * <a>SqlApplicationConfiguration</a>) will result in an error.
     * </p>
     * </note>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of the application's state data.
     * </p>
     * 
     * @param createApplicationSnapshotRequest
     * @return A Java Future containing the result of the CreateApplicationSnapshot operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.CreateApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationSnapshotResult> createApplicationSnapshotAsync(
            CreateApplicationSnapshotRequest createApplicationSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of the application's state data.
     * </p>
     * 
     * @param createApplicationSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplicationSnapshot operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.CreateApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationSnapshotResult> createApplicationSnapshotAsync(
            CreateApplicationSnapshotRequest createApplicationSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationSnapshotRequest, CreateApplicationSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the
     * application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the
     * application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application.
     * </p>
     * 
     * @param deleteApplicationCloudWatchLoggingOptionRequest
     * @return A Java Future containing the result of the DeleteApplicationCloudWatchLoggingOption operation returned by
     *         the service.
     * @sample AmazonKinesisAnalyticsV2Async.DeleteApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationCloudWatchLoggingOptionResult> deleteApplicationCloudWatchLoggingOptionAsync(
            DeleteApplicationCloudWatchLoggingOptionRequest deleteApplicationCloudWatchLoggingOptionRequest);

    /**
     * <p>
     * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application.
     * </p>
     * 
     * @param deleteApplicationCloudWatchLoggingOptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationCloudWatchLoggingOption operation returned by
     *         the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DeleteApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationCloudWatchLoggingOptionResult> deleteApplicationCloudWatchLoggingOptionAsync(
            DeleteApplicationCloudWatchLoggingOptionRequest deleteApplicationCloudWatchLoggingOptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationCloudWatchLoggingOptionRequest, DeleteApplicationCloudWatchLoggingOptionResult> asyncHandler);

    /**
     * <p>
     * Deletes an <a>InputProcessingConfiguration</a> from an input.
     * </p>
     * 
     * @param deleteApplicationInputProcessingConfigurationRequest
     * @return A Java Future containing the result of the DeleteApplicationInputProcessingConfiguration operation
     *         returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.DeleteApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationInputProcessingConfigurationResult> deleteApplicationInputProcessingConfigurationAsync(
            DeleteApplicationInputProcessingConfigurationRequest deleteApplicationInputProcessingConfigurationRequest);

    /**
     * <p>
     * Deletes an <a>InputProcessingConfiguration</a> from an input.
     * </p>
     * 
     * @param deleteApplicationInputProcessingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationInputProcessingConfiguration operation
     *         returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DeleteApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationInputProcessingConfigurationResult> deleteApplicationInputProcessingConfigurationAsync(
            DeleteApplicationInputProcessingConfigurationRequest deleteApplicationInputProcessingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationInputProcessingConfigurationRequest, DeleteApplicationInputProcessingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's
     * configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to
     * the external output destination.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @return A Java Future containing the result of the DeleteApplicationOutput operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.DeleteApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(DeleteApplicationOutputRequest deleteApplicationOutputRequest);

    /**
     * <p>
     * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's
     * configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to
     * the external output destination.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationOutput operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DeleteApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationOutputResult> deleteApplicationOutputAsync(DeleteApplicationOutputRequest deleteApplicationOutputRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationOutputRequest, DeleteApplicationOutputResult> asyncHandler);

    /**
     * <p>
     * Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics
     * application's configuration.
     * </p>
     * <p>
     * If the application is running, Kinesis Data Analytics immediately removes the in-application table that you
     * created using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * 
     * @param deleteApplicationReferenceDataSourceRequest
     * @return A Java Future containing the result of the DeleteApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample AmazonKinesisAnalyticsV2Async.DeleteApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            DeleteApplicationReferenceDataSourceRequest deleteApplicationReferenceDataSourceRequest);

    /**
     * <p>
     * Deletes a reference data source configuration from the specified SQL-based Amazon Kinesis Data Analytics
     * application's configuration.
     * </p>
     * <p>
     * If the application is running, Kinesis Data Analytics immediately removes the in-application table that you
     * created using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * 
     * @param deleteApplicationReferenceDataSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationReferenceDataSource operation returned by the
     *         service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DeleteApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationReferenceDataSourceResult> deleteApplicationReferenceDataSourceAsync(
            DeleteApplicationReferenceDataSourceRequest deleteApplicationReferenceDataSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationReferenceDataSourceRequest, DeleteApplicationReferenceDataSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a snapshot of application state.
     * </p>
     * 
     * @param deleteApplicationSnapshotRequest
     * @return A Java Future containing the result of the DeleteApplicationSnapshot operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.DeleteApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationSnapshotResult> deleteApplicationSnapshotAsync(
            DeleteApplicationSnapshotRequest deleteApplicationSnapshotRequest);

    /**
     * <p>
     * Deletes a snapshot of application state.
     * </p>
     * 
     * @param deleteApplicationSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationSnapshot operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DeleteApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationSnapshotResult> deleteApplicationSnapshotAsync(
            DeleteApplicationSnapshotRequest deleteApplicationSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationSnapshotRequest, DeleteApplicationSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use the <a>ListApplications</a> operation.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use the <a>ListApplications</a> operation.
     * </p>
     * 
     * @param describeApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationResult> describeApplicationAsync(DescribeApplicationRequest describeApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationRequest, DescribeApplicationResult> asyncHandler);

    /**
     * <p>
     * Returns information about a snapshot of application state data.
     * </p>
     * 
     * @param describeApplicationSnapshotRequest
     * @return A Java Future containing the result of the DescribeApplicationSnapshot operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.DescribeApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationSnapshotResult> describeApplicationSnapshotAsync(
            DescribeApplicationSnapshotRequest describeApplicationSnapshotRequest);

    /**
     * <p>
     * Returns information about a snapshot of application state data.
     * </p>
     * 
     * @param describeApplicationSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicationSnapshot operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DescribeApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeApplicationSnapshotResult> describeApplicationSnapshotAsync(
            DescribeApplicationSnapshotRequest describeApplicationSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationSnapshotRequest, DescribeApplicationSnapshotResult> asyncHandler);

    /**
     * <p>
     * Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the
     * specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In
     * the response, the operation returns the inferred schema and also the sample records that the operation used to
     * infer the schema.
     * </p>
     * <p>
     * You can use the inferred schema when configuring a streaming source for your application. When you create an
     * application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show
     * it in the console user interface.
     * </p>
     * 
     * @param discoverInputSchemaRequest
     * @return A Java Future containing the result of the DiscoverInputSchema operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.DiscoverInputSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DiscoverInputSchema"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(DiscoverInputSchemaRequest discoverInputSchemaRequest);

    /**
     * <p>
     * Infers a schema for an SQL-based Amazon Kinesis Data Analytics application by evaluating sample records on the
     * specified streaming source (Kinesis data stream or Kinesis Data Firehose delivery stream) or Amazon S3 object. In
     * the response, the operation returns the inferred schema and also the sample records that the operation used to
     * infer the schema.
     * </p>
     * <p>
     * You can use the inferred schema when configuring a streaming source for your application. When you create an
     * application using the Kinesis Data Analytics console, the console uses this operation to infer a schema and show
     * it in the console user interface.
     * </p>
     * 
     * @param discoverInputSchemaRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DiscoverInputSchema operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.DiscoverInputSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DiscoverInputSchema"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DiscoverInputSchemaResult> discoverInputSchemaAsync(DiscoverInputSchemaRequest discoverInputSchemaRequest,
            com.amazonaws.handlers.AsyncHandler<DiscoverInputSchemaRequest, DiscoverInputSchemaResult> asyncHandler);

    /**
     * <p>
     * Lists information about the current application snapshots.
     * </p>
     * 
     * @param listApplicationSnapshotsRequest
     * @return A Java Future containing the result of the ListApplicationSnapshots operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.ListApplicationSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationSnapshotsResult> listApplicationSnapshotsAsync(ListApplicationSnapshotsRequest listApplicationSnapshotsRequest);

    /**
     * <p>
     * Lists information about the current application snapshots.
     * </p>
     * 
     * @param listApplicationSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplicationSnapshots operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.ListApplicationSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationSnapshotsResult> listApplicationSnapshotsAsync(ListApplicationSnapshotsRequest listApplicationSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationSnapshotsRequest, ListApplicationSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response
     * includes the application name, Amazon Resource Name (ARN), and status.
     * </p>
     * <p>
     * If you want detailed information about a specific application, use <a>DescribeApplication</a>.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Returns a list of Amazon Kinesis Data Analytics applications in your account. For each application, the response
     * includes the application name, Amazon Resource Name (ARN), and status.
     * </p>
     * <p>
     * If you want detailed information about a specific application, use <a>DescribeApplication</a>.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must
     * exclusively call this operation to start your application.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta. Using SQL parameters (such as
     * <a>RunConfiguration$SqlRunConfigurations</a>) will result in an error.
     * </p>
     * </note>
     * 
     * @param startApplicationRequest
     * @return A Java Future containing the result of the StartApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Starts the specified Amazon Kinesis Data Analytics application. After creating an application, you must
     * exclusively call this operation to start your application.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta. Using SQL parameters (such as
     * <a>RunConfiguration$SqlRunConfigurations</a>) will result in an error.
     * </p>
     * </note>
     * 
     * @param startApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartApplicationResult> startApplicationAsync(StartApplicationRequest startApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StartApplicationRequest, StartApplicationResult> asyncHandler);

    /**
     * <p>
     * Stops the application from processing data. You can stop an application only if it is in the running state. You
     * can use the <a>DescribeApplication</a> operation to find the application state.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return A Java Future containing the result of the StopApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StopApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest stopApplicationRequest);

    /**
     * <p>
     * Stops the application from processing data. You can stop an application only if it is in the running state. You
     * can use the <a>DescribeApplication</a> operation to find the application state.
     * </p>
     * 
     * @param stopApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StopApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopApplicationResult> stopApplicationAsync(StopApplicationRequest stopApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<StopApplicationRequest, StopApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application
     * code, input configuration, and output configuration.
     * </p>
     * <p>
     * Kinesis Data Analytics updates the <code>ApplicationVersionId</code> each time you update your application.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta. Using SQL parameters (such as <a>SqlApplicationConfigurationUpdate</a>)
     * will result in an error.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2Async.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an existing Amazon Kinesis Data Analytics application. Using this operation, you can update application
     * code, input configuration, and output configuration.
     * </p>
     * <p>
     * Kinesis Data Analytics updates the <code>ApplicationVersionId</code> each time you update your application.
     * </p>
     * <note>
     * <p>
     * SQL is not enabled for this private beta. Using SQL parameters (such as <a>SqlApplicationConfigurationUpdate</a>)
     * will result in an error.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonKinesisAnalyticsV2AsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

}
