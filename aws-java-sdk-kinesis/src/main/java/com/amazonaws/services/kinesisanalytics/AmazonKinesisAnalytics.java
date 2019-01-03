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
package com.amazonaws.services.kinesisanalytics;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kinesisanalytics.model.*;

/**
 * Interface for accessing Kinesis Analytics.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kinesisanalytics.AbstractAmazonKinesisAnalytics} instead.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonKinesisAnalytics {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kinesisanalytics";

    /**
     * Overrides the default endpoint for this client ("https://kinesisanalytics.us-east-1.amazonaws.com"). Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "kinesisanalytics.us-east-1.amazonaws.com") or a full URL, including
     * the protocol (ex: "https://kinesisanalytics.us-east-1.amazonaws.com"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "kinesisanalytics.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://kinesisanalytics.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonKinesisAnalytics#setEndpoint(String)}, sets the regional endpoint for this
     * client's service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Adds a CloudWatch log stream to monitor application configuration errors. For more information about using
     * CloudWatch log streams with Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * 
     * @param addApplicationCloudWatchLoggingOptionRequest
     * @return Result of the AddApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationCloudWatchLoggingOption"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationCloudWatchLoggingOptionResult addApplicationCloudWatchLoggingOption(
            AddApplicationCloudWatchLoggingOptionRequest addApplicationCloudWatchLoggingOptionRequest);

    /**
     * <p>
     * Adds a streaming source to your Amazon Kinesis application. For conceptual information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>.
     * </p>
     * <p>
     * You can add a streaming source either when you create an application or you can use this operation to add a
     * streaming source after you create an application. For more information, see <a>CreateApplication</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:AddApplicationInput</code> action.
     * </p>
     * 
     * @param addApplicationInputRequest
     * @return Result of the AddApplicationInput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws CodeValidationException
     *         User-provided application code (query) is invalid. This can be a simple syntax error.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationInput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationInput"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationInputResult addApplicationInput(AddApplicationInputRequest addApplicationInputRequest);

    /**
     * <p>
     * Adds an <a>InputProcessingConfiguration</a> to an application. An input processor preprocesses records on the
     * input stream before the application's SQL code executes. Currently, the only input processor available is <a
     * href="https://aws.amazon.com/documentation/lambda/">AWS Lambda</a>.
     * </p>
     * 
     * @param addApplicationInputProcessingConfigurationRequest
     * @return Result of the AddApplicationInputProcessingConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationInputProcessingConfigurationResult addApplicationInputProcessingConfiguration(
            AddApplicationInputProcessingConfigurationRequest addApplicationInputProcessingConfigurationRequest);

    /**
     * <p>
     * Adds an external destination to your Amazon Kinesis Analytics application.
     * </p>
     * <p>
     * If you want Amazon Kinesis Analytics to deliver data from an in-application stream within your application to an
     * external destination (such as an Amazon Kinesis stream, an Amazon Kinesis Firehose delivery stream, or an AWS
     * Lambda function), you add the relevant configuration to your application using this operation. You can configure
     * one or more outputs for your application. Each output configuration maps an in-application stream and an external
     * destination.
     * </p>
     * <p>
     * You can use one of the output configurations to deliver data from your in-application error stream to an external
     * destination so that you can analyze the errors. For more information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-output.html">Understanding Application
     * Output (Destination)</a>.
     * </p>
     * <p>
     * Any configuration update, including adding a streaming source using this operation, results in a new version of
     * the application. You can use the <a>DescribeApplication</a> operation to find the current application version.
     * </p>
     * <p>
     * For the limits on the number of application inputs and outputs you can configure, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationOutputRequest
     * @return Result of the AddApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationOutputResult addApplicationOutput(AddApplicationOutputRequest addApplicationOutputRequest);

    /**
     * <p>
     * Adds a reference data source to an existing application.
     * </p>
     * <p>
     * Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an in-application table
     * within your application. In the request, you provide the source (S3 bucket name and object key name), name of the
     * in-application table to create, and the necessary mapping information that describes how data in Amazon S3 object
     * maps to columns in the resulting in-application table.
     * </p>
     * <p>
     * For conceptual information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>. For the limits on data sources you can add to your application, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html">Limits</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:AddApplicationOutput</code> action.
     * </p>
     * 
     * @param addApplicationReferenceDataSourceRequest
     * @return Result of the AddApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.AddApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/AddApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    AddApplicationReferenceDataSourceResult addApplicationReferenceDataSource(AddApplicationReferenceDataSourceRequest addApplicationReferenceDataSourceRequest);

    /**
     * <p>
     * Creates an Amazon Kinesis Analytics application. You can configure each application with one streaming source as
     * input, application code to process the input, and up to three destinations where you want Amazon Kinesis
     * Analytics to write the output data from your application. For an overview, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works.html">How it Works</a>.
     * </p>
     * <p>
     * In the input configuration, you map the streaming source to an in-application stream, which you can think of as a
     * constantly updating table. In the mapping, you must provide a schema for the in-application stream and map each
     * data column in the in-application stream to a data element in the streaming source.
     * </p>
     * <p>
     * Your application code is one or more SQL statements that read input data, transform it, and generate output. Your
     * application code can create one or more SQL artifacts like SQL streams or pumps.
     * </p>
     * <p>
     * In the output configuration, you can configure the application to write data from in-application streams created
     * in your applications to up to three destinations.
     * </p>
     * <p>
     * To read data from your source stream or write data to destination streams, Amazon Kinesis Analytics needs your
     * permissions. You grant these permissions by creating IAM roles. This operation requires permissions to perform
     * the <code>kinesisanalytics:CreateApplication</code> action.
     * </p>
     * <p>
     * For introductory exercises to create an Amazon Kinesis Analytics application, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/getting-started.html">Getting Started</a>.
     * </p>
     * 
     * @param createApplicationRequest
     *        TBD
     * @return Result of the CreateApplication operation returned by the service.
     * @throws CodeValidationException
     *         User-provided application code (query) is invalid. This can be a simple syntax error.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws LimitExceededException
     *         Exceeded the number of applications allowed.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @sample AmazonKinesisAnalytics.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/CreateApplication"
     *      target="_top">AWS API Documentation</a>
     */
    CreateApplicationResult createApplication(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Deletes the specified application. Amazon Kinesis Analytics halts application execution and deletes the
     * application, including any application artifacts (such as in-application streams, reference table, and
     * application code).
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DeleteApplication</code> action.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return Result of the DeleteApplication operation returned by the service.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationResult deleteApplication(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes a CloudWatch log stream from an application. For more information about using CloudWatch log streams with
     * Amazon Kinesis Analytics applications, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/cloudwatch-logs.html">Working with Amazon CloudWatch
     * Logs</a>.
     * </p>
     * 
     * @param deleteApplicationCloudWatchLoggingOptionRequest
     * @return Result of the DeleteApplicationCloudWatchLoggingOption operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationCloudWatchLoggingOption
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationCloudWatchLoggingOption"
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
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationInputProcessingConfiguration
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationInputProcessingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationInputProcessingConfigurationResult deleteApplicationInputProcessingConfiguration(
            DeleteApplicationInputProcessingConfigurationRequest deleteApplicationInputProcessingConfigurationRequest);

    /**
     * <p>
     * Deletes output destination configuration from your application configuration. Amazon Kinesis Analytics will no
     * longer write data from the corresponding in-application stream to the external output destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DeleteApplicationOutput</code> action.
     * </p>
     * 
     * @param deleteApplicationOutputRequest
     * @return Result of the DeleteApplicationOutput operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationOutput
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationOutput"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationOutputResult deleteApplicationOutput(DeleteApplicationOutputRequest deleteApplicationOutputRequest);

    /**
     * <p>
     * Deletes a reference data source configuration from the specified application configuration.
     * </p>
     * <p>
     * If the application is running, Amazon Kinesis Analytics immediately removes the in-application table that you
     * created using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the
     * <code>kinesisanalytics.DeleteApplicationReferenceDataSource</code> action.
     * </p>
     * 
     * @param deleteApplicationReferenceDataSourceRequest
     * @return Result of the DeleteApplicationReferenceDataSource operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DeleteApplicationReferenceDataSource
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DeleteApplicationReferenceDataSource"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteApplicationReferenceDataSourceResult deleteApplicationReferenceDataSource(
            DeleteApplicationReferenceDataSourceRequest deleteApplicationReferenceDataSourceRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Kinesis Analytics application.
     * </p>
     * <p>
     * If you want to retrieve a list of all applications in your account, use the <a>ListApplications</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DescribeApplication</code> action. You
     * can use <code>DescribeApplication</code> to get the current application versionId, which you need to call other
     * operations such as <code>Update</code>.
     * </p>
     * 
     * @param describeApplicationRequest
     * @return Result of the DescribeApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.DescribeApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DescribeApplication"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeApplicationResult describeApplication(DescribeApplicationRequest describeApplicationRequest);

    /**
     * <p>
     * Infers a schema by evaluating sample records on the specified streaming source (Amazon Kinesis stream or Amazon
     * Kinesis Firehose delivery stream) or S3 object. In the response, the operation returns the inferred schema and
     * also the sample records that the operation used to infer the schema.
     * </p>
     * <p>
     * You can use the inferred schema when configuring a streaming source for your application. For conceptual
     * information, see <a
     * href="http://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html">Configuring Application
     * Input</a>. Note that when you create an application using the Amazon Kinesis Analytics console, the console uses
     * this operation to infer a schema and show it in the console user interface.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:DiscoverInputSchema</code> action.
     * </p>
     * 
     * @param discoverInputSchemaRequest
     * @return Result of the DiscoverInputSchema operation returned by the service.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws UnableToDetectSchemaException
     *         Data format is not valid. Amazon Kinesis Analytics is not able to detect schema for the given streaming
     *         source.
     * @throws ResourceProvisionedThroughputExceededException
     *         Discovery failed to get a record from the streaming source because of the Amazon Kinesis Streams
     *         ProvisionedThroughputExceededException. For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetRecords.html">GetRecords</a> in the
     *         Amazon Kinesis Streams API Reference.
     * @throws ServiceUnavailableException
     *         The service is unavailable. Back off and retry the operation.
     * @sample AmazonKinesisAnalytics.DiscoverInputSchema
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/DiscoverInputSchema"
     *      target="_top">AWS API Documentation</a>
     */
    DiscoverInputSchemaResult discoverInputSchema(DiscoverInputSchemaRequest discoverInputSchemaRequest);

    /**
     * <p>
     * Returns a list of Amazon Kinesis Analytics applications in your account. For each application, the response
     * includes the application name, Amazon Resource Name (ARN), and status. If the response returns the
     * <code>HasMoreApplications</code> value as true, you can send another request by adding the
     * <code>ExclusiveStartApplicationName</code> in the request body, and set the value of this to the last application
     * name from the previous response.
     * </p>
     * <p>
     * If you want detailed information about a specific application, use <a>DescribeApplication</a>.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:ListApplications</code> action.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return Result of the ListApplications operation returned by the service.
     * @sample AmazonKinesisAnalytics.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/ListApplications"
     *      target="_top">AWS API Documentation</a>
     */
    ListApplicationsResult listApplications(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * Starts the specified Amazon Kinesis Analytics application. After creating an application, you must exclusively
     * call this operation to start your application.
     * </p>
     * <p>
     * After the application starts, it begins consuming the input data, processes it, and writes the output to the
     * configured destination.
     * </p>
     * <p>
     * The application status must be <code>READY</code> for you to start an application. You can get the application
     * status in the console or using the <a>DescribeApplication</a> operation.
     * </p>
     * <p>
     * After you start the application, you can stop the application from processing the input by calling the
     * <a>StopApplication</a> operation.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:StartApplication</code> action.
     * </p>
     * 
     * @param startApplicationRequest
     * @return Result of the StartApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws InvalidApplicationConfigurationException
     *         User-provided application configuration is not valid.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.StartApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/StartApplication"
     *      target="_top">AWS API Documentation</a>
     */
    StartApplicationResult startApplication(StartApplicationRequest startApplicationRequest);

    /**
     * <p>
     * Stops the application from processing input data. You can stop an application only if it is in the running state.
     * You can use the <a>DescribeApplication</a> operation to find the application state. After the application is
     * stopped, Amazon Kinesis Analytics stops reading data from the input, the application stops processing data, and
     * there is no output written to the destination.
     * </p>
     * <p>
     * This operation requires permissions to perform the <code>kinesisanalytics:StopApplication</code> action.
     * </p>
     * 
     * @param stopApplicationRequest
     * @return Result of the StopApplication operation returned by the service.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.StopApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/StopApplication"
     *      target="_top">AWS API Documentation</a>
     */
    StopApplicationResult stopApplication(StopApplicationRequest stopApplicationRequest);

    /**
     * <p>
     * Updates an existing Amazon Kinesis Analytics application. Using this API, you can update application code, input
     * configuration, and output configuration.
     * </p>
     * <p>
     * Note that Amazon Kinesis Analytics updates the <code>CurrentApplicationVersionId</code> each time you update your
     * application.
     * </p>
     * <p>
     * This operation requires permission for the <code>kinesisanalytics:UpdateApplication</code> action.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return Result of the UpdateApplication operation returned by the service.
     * @throws CodeValidationException
     *         User-provided application code (query) is invalid. This can be a simple syntax error.
     * @throws ResourceNotFoundException
     *         Specified application can't be found.
     * @throws ResourceInUseException
     *         Application is not available for this operation.
     * @throws InvalidArgumentException
     *         Specified input parameter value is invalid.
     * @throws ConcurrentModificationException
     *         Exception thrown as a result of concurrent modification to an application. For example, two individuals
     *         attempting to edit the same application at the same time.
     * @throws UnsupportedOperationException
     * @sample AmazonKinesisAnalytics.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/UpdateApplication"
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
