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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisanalyticsv2.model.*;

/**
 * Interface for accessing Kinesis Analytics V2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisanalyticsv2.AbstractAmazonKinesisAnalyticsV2} instead.
 * </p>
 * <p>
 * <p>
 * Documentation for Kinesis Data Analytics API v2
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisAnalyticsV2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kinesisanalytics";

    /**
     * <p>
     * Adds an Amazon CloudWatch log stream to monitor application configuration errors.
     * </p>
     * 
     * @param addApplicationCloudWatchLoggingOptionRequest
     * @return Result of the AddApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationCloudWatchLoggingOptionResult addApplicationCloudWatchLoggingOption(
            AddApplicationCloudWatchLoggingOptionRequest addApplicationCloudWatchLoggingOptionRequest);

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
     * @return Result of the AddApplicationInput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws CodeValidationException
     *         The user-provided application code (query) is not valid. This can be a simple syntax error.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInput"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationInputResult addApplicationInput(AddApplicationInputRequest addApplicationInputRequest);

    /**
     * <p>
     * Adds an <a>InputProcessingConfiguration</a> to an SQL-based Kinesis Data Analytics application. An input
     * processor pre-processes records on the input stream before the application's SQL code executes. Currently, the
     * only input processor available is <a href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
     * </p>
     * 
     * @param addApplicationInputProcessingConfigurationRequest
     * @return Result of the AddApplicationInputProcessingConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationInputProcessingConfigurationResult addApplicationInputProcessingConfiguration(
            AddApplicationInputProcessingConfigurationRequest addApplicationInputProcessingConfigurationRequest);

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
     * @return Result of the AddApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationOutputResult addApplicationOutput(AddApplicationOutputRequest addApplicationOutputRequest);

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
     * @return Result of the AddApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.AddApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/AddApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationReferenceDataSourceResult addApplicationReferenceDataSource(AddApplicationReferenceDataSourceRequest addApplicationReferenceDataSourceRequest);

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
     * @return Result of the CreateApplication operation returned by the service.
     * @throws CodeValidationException
     *         The user-provided application code (query) is not valid. This can be a simple syntax error.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws LimitExceededException
     *         The number of allowed resources has been exceeded.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates a snapshot of the application's state data.
     * </p>
     * 
     * @param createApplicationSnapshotRequest
     * @return Result of the CreateApplicationSnapshot operation returned by the service.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws LimitExceededException
     *         The number of allowed resources has been exceeded.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.CreateApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/CreateApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationSnapshotResult createApplicationSnapshot(CreateApplicationSnapshotRequest createApplicationSnapshotRequest);

    /**
     * <p>
     * Deletes the specified application. Kinesis Data Analytics halts application execution and deletes the
     * application.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes an Amazon CloudWatch log stream from an Amazon Kinesis Data Analytics application.
     * </p>
     * 
     * @param deleteApplicationCloudWatchLoggingOptionRequest
     * @return Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationCloudWatchLoggingOptionResult deleteApplicationCloudWatchLoggingOption(
            DeleteApplicationCloudWatchLoggingOptionRequest deleteApplicationCloudWatchLoggingOptionRequest);

    /**
     * <p>
     * Deletes an <a>InputProcessingConfiguration</a> from an input.
     * </p>
     * 
     * @param deleteApplicationInputProcessingConfigurationRequest
     * @return Result of the DeleteApplicationInputProcessingConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationInputProcessingConfigurationResult deleteApplicationInputProcessingConfiguration(
            DeleteApplicationInputProcessingConfigurationRequest deleteApplicationInputProcessingConfigurationRequest);

    /**
     * <p>
     * Deletes the output destination configuration from your SQL-based Amazon Kinesis Data Analytics application's
     * configuration. Kinesis Data Analytics will no longer write data from the corresponding in-application stream to
     * the external output destination.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @return Result of the DeleteApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationOutputResult deleteApplicationOutput(DeleteApplicationOutputRequest deleteApplicationOutputRequest);

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
     * @return Result of the DeleteApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(
            DeleteApplicationReferenceDataSourceRequest deleteApplicationReferenceDataSourceRequest);

    /**
     * <p>
     * Deletes a snapshot of application state.
     * </p>
     * 
     * @param deleteApplicationSnapshotRequest
     * @return Result of the DeleteApplicationSnapshot operation returned by the service.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @sample AmazonKinesisAnalyticsV2.DeleteApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DeleteApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationSnapshotResult deleteApplicationSnapshot(DeleteApplicationSnapshotRequest deleteApplicationSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Kinesis Data Analytics application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use the <a>ListApplications</a> operation.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationResult describeApplication(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Returns information about a snapshot of application state data.
     * </p>
     * 
     * @param describeApplicationSnapshotRequest
     * @return Result of the DescribeApplicationSnapshot operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AmazonKinesisAnalyticsV2.DescribeApplicationSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DescribeApplicationSnapshot"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationSnapshotResult describeApplicationSnapshot(DescribeApplicationSnapshotRequest describeApplicationSnapshotRequest);

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
     * @return Result of the DiscoverInputSchema operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnableToDetectSchemaException
     *         The data format is not valid. Amazon Kinesis Data Analytics cannot detect the schema for the given
     *         streaming source.
     * @throws ResourceProvisionedThroughputExceededException
     *         Discovery failed to get a record from the streaming source because of the Amazon Kinesis Streams
     *         <code>ProvisionedThroughputExceededException</code>. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetRecords.html">GetRecords</a> in the
     *         Amazon Kinesis Streams API Reference.
     * @throws ServiceUnavailableException
     *         The service cannot complete the request.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.DiscoverInputSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/DiscoverInputSchema"
     *      target="_top">AWS API Documentation</a>
     */
    DiscoverInputSchemaResult discoverInputSchema(DiscoverInputSchemaRequest discoverInputSchemaRequest);

    /**
     * <p>
     * Lists information about the current application snapshots.
     * </p>
     * 
     * @param listApplicationSnapshotsRequest
     * @return Result of the ListApplicationSnapshots operation returned by the service.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws UnsupportedOperationException
     *         The request was rejected because a specified parameter is not supported or a specified resource is not
     *         valid for this operation.
     * @sample AmazonKinesisAnalyticsV2.ListApplicationSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplicationSnapshots"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationSnapshotsResult listApplicationSnapshots(ListApplicationSnapshotsRequest listApplicationSnapshotsRequest);

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
     * @return Result of the ListApplications operation returned by the service.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

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
     * @return Result of the StartApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidApplicationConfigurationException
     *         The user-provided application configuration is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    StartApplicationResult startApplication(StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Stops the application from processing data. You can stop an application only if it is in the running state. You
     * can use the <a>DescribeApplication</a> operation to find the application state.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StopApplication"
     *      target="_top">AWS API Documentation</a>
     */
    StopApplicationResult stopApplication(StopApplicationRequest stopApplicationRequest);

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
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws CodeValidationException
     *         The user-provided application code (query) is not valid. This can be a simple syntax error.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         The application is not available for this operation.
     * @throws InvalidArgumentException
     *         The specified input parameter value is not valid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modifications to an application. This error can be the result
     *         of attempting to modify an application without using the current application ID.
     * @throws InvalidRequestException
     *         The request JSON is not valid for the operation.
     * @sample AmazonKinesisAnalyticsV2.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationResult updateApplication(UpdateApplicationRequest updateApplicationRequest);

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
