/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig;

import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;

/**
 * Interface for accessing AppConfig asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.appconfig.AbstractAmazonAppConfigAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS AppConfig</fullname>
 * <p>
 * Use AWS AppConfig, a capability of AWS Systems Manager, to create, manage, and quickly deploy application
 * configurations. AppConfig supports controlled deployments to applications of any size and includes built-in
 * validation checks and monitoring. You can use AppConfig with applications hosted on Amazon EC2 instances, AWS Lambda,
 * containers, mobile applications, or IoT devices.
 * </p>
 * <p>
 * To prevent errors when deploying application configurations, especially for production systems where a simple typo
 * could cause an unexpected outage, AppConfig includes validators. A validator provides a syntactic or semantic check
 * to ensure that the configuration you want to deploy works as intended. To validate your application configuration
 * data, you provide a schema or a Lambda function that runs against the configuration. The configuration deployment or
 * update can only proceed when the configuration data is valid.
 * </p>
 * <p>
 * During a configuration deployment, AppConfig monitors the application to ensure that the deployment is successful. If
 * the system encounters an error, AppConfig rolls back the change to minimize impact for your application users. You
 * can configure a deployment strategy for each application or environment that includes deployment criteria, including
 * velocity, bake time, and alarms to monitor. Similar to error monitoring, if a deployment triggers an alarm, AppConfig
 * automatically rolls back to the previous version.
 * </p>
 * <p>
 * AppConfig supports multiple use cases. Here are some examples.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Application tuning</b>: Use AppConfig to carefully introduce changes to your application that can only be tested
 * with production traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Feature toggle</b>: Use AppConfig to turn on new features that require a timely deployment, such as a product
 * launch or announcement.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>User membership</b>: Use AppConfig to allow premium subscribers to access paid content.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Operational issues</b>: Use AppConfig to reduce stress on your application when a dependency or other external
 * factor impacts the system.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This reference is intended to be used with the <a
 * href="http://docs.aws.amazon.com/systems-manager/latest/userguide/appconfig.html">AWS AppConfig User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonAppConfigAsync extends AmazonAppConfig {

    /**
     * <p>
     * An application in AppConfig is a logical unit of code that provides capabilities for your customers. For example,
     * an application can be a microservice that runs on Amazon EC2 instances, a mobile application installed by your
     * users, a serverless application using Amazon API Gateway and AWS Lambda, or any system you run on behalf of
     * others.
     * </p>
     * 
     * @param createApplicationRequest
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonAppConfigAsync.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * An application in AppConfig is a logical unit of code that provides capabilities for your customers. For example,
     * an application can be a microservice that runs on Amazon EC2 instances, a mobile application installed by your
     * users, a serverless application using Amazon API Gateway and AWS Lambda, or any system you run on behalf of
     * others.
     * </p>
     * 
     * @param createApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.CreateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Information that enables AppConfig to access the configuration source. Valid configuration sources include
     * Systems Manager (SSM) documents and SSM Parameter Store parameters. A configuration profile includes the
     * following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Uri location of the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * The AWS Identity and Access Management (IAM) role that provides access to the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * A validator for the configuration data. Available validators include either a JSON Schema or an AWS Lambda
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationProfileRequest
     * @return A Java Future containing the result of the CreateConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsync.CreateConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationProfileResult> createConfigurationProfileAsync(
            CreateConfigurationProfileRequest createConfigurationProfileRequest);

    /**
     * <p>
     * Information that enables AppConfig to access the configuration source. Valid configuration sources include
     * Systems Manager (SSM) documents and SSM Parameter Store parameters. A configuration profile includes the
     * following information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Uri location of the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * The AWS Identity and Access Management (IAM) role that provides access to the configuration data.
     * </p>
     * </li>
     * <li>
     * <p>
     * A validator for the configuration data. Available validators include either a JSON Schema or an AWS Lambda
     * function.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.CreateConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationProfileResult> createConfigurationProfileAsync(
            CreateConfigurationProfileRequest createConfigurationProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationProfileRequest, CreateConfigurationProfileResult> asyncHandler);

    /**
     * <p>
     * A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A
     * deployment strategy includes: the overall duration required, a percentage of targets to receive the deployment
     * during each interval, an algorithm that defines how percentage grows, and bake time.
     * </p>
     * 
     * @param createDeploymentStrategyRequest
     * @return A Java Future containing the result of the CreateDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsync.CreateDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentStrategyResult> createDeploymentStrategyAsync(CreateDeploymentStrategyRequest createDeploymentStrategyRequest);

    /**
     * <p>
     * A deployment strategy defines important criteria for rolling out your configuration to the designated targets. A
     * deployment strategy includes: the overall duration required, a percentage of targets to receive the deployment
     * during each interval, an algorithm that defines how percentage grows, and bake time.
     * </p>
     * 
     * @param createDeploymentStrategyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.CreateDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentStrategyResult> createDeploymentStrategyAsync(CreateDeploymentStrategyRequest createDeploymentStrategyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentStrategyRequest, CreateDeploymentStrategyResult> asyncHandler);

    /**
     * <p>
     * For each application, you define one or more environments. An environment is a logical deployment group of
     * AppConfig targets, such as applications in a <code>Beta</code> or <code>Production</code> environment. You can
     * also define environments for application subcomponents such as the <code>Web</code>, <code>Mobile</code> and
     * <code>Back-end</code> components for your application. You can configure Amazon CloudWatch alarms for each
     * environment. The system monitors alarms during a configuration deployment. If an alarm is triggered, the system
     * rolls back the configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * For each application, you define one or more environments. An environment is a logical deployment group of
     * AppConfig targets, such as applications in a <code>Beta</code> or <code>Production</code> environment. You can
     * also define environments for application subcomponents such as the <code>Web</code>, <code>Mobile</code> and
     * <code>Back-end</code> components for your application. You can configure Amazon CloudWatch alarms for each
     * environment. The system monitors alarms during a configuration deployment. If an alarm is triggered, the system
     * rolls back the configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Delete an application. Deleting an application does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonAppConfigAsync.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Delete an application. Deleting an application does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.DeleteApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Delete a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteConfigurationProfileRequest
     * @return A Java Future containing the result of the DeleteConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsync.DeleteConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationProfileResult> deleteConfigurationProfileAsync(
            DeleteConfigurationProfileRequest deleteConfigurationProfileRequest);

    /**
     * <p>
     * Delete a configuration profile. Deleting a configuration profile does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteConfigurationProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.DeleteConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationProfileResult> deleteConfigurationProfileAsync(
            DeleteConfigurationProfileRequest deleteConfigurationProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationProfileRequest, DeleteConfigurationProfileResult> asyncHandler);

    /**
     * <p>
     * Delete a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteDeploymentStrategyRequest
     * @return A Java Future containing the result of the DeleteDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsync.DeleteDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeploymentStrategyResult> deleteDeploymentStrategyAsync(DeleteDeploymentStrategyRequest deleteDeploymentStrategyRequest);

    /**
     * <p>
     * Delete a deployment strategy. Deleting a deployment strategy does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteDeploymentStrategyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.DeleteDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeploymentStrategyResult> deleteDeploymentStrategyAsync(DeleteDeploymentStrategyRequest deleteDeploymentStrategyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeploymentStrategyRequest, DeleteDeploymentStrategyResult> asyncHandler);

    /**
     * <p>
     * Delete an environment. Deleting an environment does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Delete an environment. Deleting an environment does not delete a configuration from a host.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/DeleteEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AmazonAppConfigAsync.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest);

    /**
     * <p>
     * Retrieve information about an application.
     * </p>
     * 
     * @param getApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetApplication operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.GetApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetApplication" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetApplicationResult> getApplicationAsync(GetApplicationRequest getApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<GetApplicationRequest, GetApplicationResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about a configuration.
     * </p>
     * 
     * @param getConfigurationRequest
     * @return A Java Future containing the result of the GetConfiguration operation returned by the service.
     * @sample AmazonAppConfigAsync.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest getConfigurationRequest);

    /**
     * <p>
     * Retrieve information about a configuration.
     * </p>
     * 
     * @param getConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguration operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfiguration" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest getConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationRequest, GetConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about a configuration profile.
     * </p>
     * 
     * @param getConfigurationProfileRequest
     * @return A Java Future containing the result of the GetConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsync.GetConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationProfileResult> getConfigurationProfileAsync(GetConfigurationProfileRequest getConfigurationProfileRequest);

    /**
     * <p>
     * Retrieve information about a configuration profile.
     * </p>
     * 
     * @param getConfigurationProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.GetConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationProfileResult> getConfigurationProfileAsync(GetConfigurationProfileRequest getConfigurationProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationProfileRequest, GetConfigurationProfileResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about a configuration deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonAppConfigAsync.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest);

    /**
     * <p>
     * Retrieve information about a configuration deployment.
     * </p>
     * 
     * @param getDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeployment operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.GetDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentResult> getDeploymentAsync(GetDeploymentRequest getDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentRequest, GetDeploymentResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about a deployment strategy. A deployment strategy defines important criteria for rolling
     * out your configuration to the designated targets. A deployment strategy includes: the overall duration required,
     * a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage
     * grows, and bake time.
     * </p>
     * 
     * @param getDeploymentStrategyRequest
     * @return A Java Future containing the result of the GetDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsync.GetDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentStrategyResult> getDeploymentStrategyAsync(GetDeploymentStrategyRequest getDeploymentStrategyRequest);

    /**
     * <p>
     * Retrieve information about a deployment strategy. A deployment strategy defines important criteria for rolling
     * out your configuration to the designated targets. A deployment strategy includes: the overall duration required,
     * a percentage of targets to receive the deployment during each interval, an algorithm that defines how percentage
     * grows, and bake time.
     * </p>
     * 
     * @param getDeploymentStrategyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.GetDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeploymentStrategyResult> getDeploymentStrategyAsync(GetDeploymentStrategyRequest getDeploymentStrategyRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeploymentStrategyRequest, GetDeploymentStrategyResult> asyncHandler);

    /**
     * <p>
     * Retrieve information about an environment. An environment is a logical deployment group of AppConfig
     * applications, such as applications in a <code>Production</code> environment or in an <code>EU_Region</code>
     * environment. Each configuration deployment targets an environment. You can enable one or more Amazon CloudWatch
     * alarms for an environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Retrieve information about an environment. An environment is a logical deployment group of AppConfig
     * applications, such as applications in a <code>Production</code> environment or in an <code>EU_Region</code>
     * environment. Each configuration deployment targets an environment. You can enable one or more Amazon CloudWatch
     * alarms for an environment. If an alarm is triggered during a deployment, AppConfig roles back the configuration.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/GetEnvironment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * List all applications in your AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonAppConfigAsync.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest);

    /**
     * <p>
     * List all applications in your AWS account.
     * </p>
     * 
     * @param listApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApplications operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.ListApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListApplications" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListApplicationsResult> listApplicationsAsync(ListApplicationsRequest listApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListApplicationsRequest, ListApplicationsResult> asyncHandler);

    /**
     * <p>
     * Lists the configuration profiles for an application.
     * </p>
     * 
     * @param listConfigurationProfilesRequest
     * @return A Java Future containing the result of the ListConfigurationProfiles operation returned by the service.
     * @sample AmazonAppConfigAsync.ListConfigurationProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListConfigurationProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationProfilesResult> listConfigurationProfilesAsync(
            ListConfigurationProfilesRequest listConfigurationProfilesRequest);

    /**
     * <p>
     * Lists the configuration profiles for an application.
     * </p>
     * 
     * @param listConfigurationProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationProfiles operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.ListConfigurationProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListConfigurationProfiles"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationProfilesResult> listConfigurationProfilesAsync(
            ListConfigurationProfilesRequest listConfigurationProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationProfilesRequest, ListConfigurationProfilesResult> asyncHandler);

    /**
     * <p>
     * List deployment strategies.
     * </p>
     * 
     * @param listDeploymentStrategiesRequest
     * @return A Java Future containing the result of the ListDeploymentStrategies operation returned by the service.
     * @sample AmazonAppConfigAsync.ListDeploymentStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeploymentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentStrategiesResult> listDeploymentStrategiesAsync(ListDeploymentStrategiesRequest listDeploymentStrategiesRequest);

    /**
     * <p>
     * List deployment strategies.
     * </p>
     * 
     * @param listDeploymentStrategiesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentStrategies operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.ListDeploymentStrategies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeploymentStrategies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentStrategiesResult> listDeploymentStrategiesAsync(ListDeploymentStrategiesRequest listDeploymentStrategiesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentStrategiesRequest, ListDeploymentStrategiesResult> asyncHandler);

    /**
     * <p>
     * Lists the deployments for an environment.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AmazonAppConfigAsync.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest);

    /**
     * <p>
     * Lists the deployments for an environment.
     * </p>
     * 
     * @param listDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeployments operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.ListDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListDeployments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentsResult> listDeploymentsAsync(ListDeploymentsRequest listDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResult> asyncHandler);

    /**
     * <p>
     * List the environments for an application.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonAppConfigAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * List the environments for an application.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListEnvironments" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of key-value tags assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppConfigAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the list of key-value tags assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a deployment.
     * </p>
     * 
     * @param startDeploymentRequest
     * @return A Java Future containing the result of the StartDeployment operation returned by the service.
     * @sample AmazonAppConfigAsync.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest startDeploymentRequest);

    /**
     * <p>
     * Starts a deployment.
     * </p>
     * 
     * @param startDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDeployment operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest startDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<StartDeploymentRequest, StartDeploymentResult> asyncHandler);

    /**
     * <p>
     * Stops a deployment. This API action works only on deployments that have a status of <code>DEPLOYING</code>. This
     * action moves the deployment to a status of <code>ROLLED_BACK</code>.
     * </p>
     * 
     * @param stopDeploymentRequest
     * @return A Java Future containing the result of the StopDeployment operation returned by the service.
     * @sample AmazonAppConfigAsync.StopDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StopDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest stopDeploymentRequest);

    /**
     * <p>
     * Stops a deployment. This API action works only on deployments that have a status of <code>DEPLOYING</code>. This
     * action moves the deployment to a status of <code>ROLLED_BACK</code>.
     * </p>
     * 
     * @param stopDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopDeployment operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.StopDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StopDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopDeploymentResult> stopDeploymentAsync(StopDeploymentRequest stopDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<StopDeploymentRequest, StopDeploymentResult> asyncHandler);

    /**
     * <p>
     * Metadata to assign to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppConfigAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Metadata to assign to an AppConfig resource. Tags help organize and categorize your AppConfig resources. Each tag
     * consists of a key and an optional value, both of which you define. You can specify a maximum of 50 tags for a
     * resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes a tag key and value from an AppConfig resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppConfigAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Deletes a tag key and value from an AppConfig resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonAppConfigAsync.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates an application.
     * </p>
     * 
     * @param updateApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.UpdateApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateApplication" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates a configuration profile.
     * </p>
     * 
     * @param updateConfigurationProfileRequest
     * @return A Java Future containing the result of the UpdateConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsync.UpdateConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationProfileResult> updateConfigurationProfileAsync(
            UpdateConfigurationProfileRequest updateConfigurationProfileRequest);

    /**
     * <p>
     * Updates a configuration profile.
     * </p>
     * 
     * @param updateConfigurationProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationProfile operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.UpdateConfigurationProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateConfigurationProfile"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationProfileResult> updateConfigurationProfileAsync(
            UpdateConfigurationProfileRequest updateConfigurationProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationProfileRequest, UpdateConfigurationProfileResult> asyncHandler);

    /**
     * <p>
     * Updates a deployment strategy.
     * </p>
     * 
     * @param updateDeploymentStrategyRequest
     * @return A Java Future containing the result of the UpdateDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsync.UpdateDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeploymentStrategyResult> updateDeploymentStrategyAsync(UpdateDeploymentStrategyRequest updateDeploymentStrategyRequest);

    /**
     * <p>
     * Updates a deployment strategy.
     * </p>
     * 
     * @param updateDeploymentStrategyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDeploymentStrategy operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.UpdateDeploymentStrategy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateDeploymentStrategy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeploymentStrategyResult> updateDeploymentStrategyAsync(UpdateDeploymentStrategyRequest updateDeploymentStrategyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeploymentStrategyRequest, UpdateDeploymentStrategyResult> asyncHandler);

    /**
     * <p>
     * Updates an environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsync.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates an environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Uses the validators in a configuration profile to validate a configuration.
     * </p>
     * 
     * @param validateConfigurationRequest
     * @return A Java Future containing the result of the ValidateConfiguration operation returned by the service.
     * @sample AmazonAppConfigAsync.ValidateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ValidateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateConfigurationResult> validateConfigurationAsync(ValidateConfigurationRequest validateConfigurationRequest);

    /**
     * <p>
     * Uses the validators in a configuration profile to validate a configuration.
     * </p>
     * 
     * @param validateConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateConfiguration operation returned by the service.
     * @sample AmazonAppConfigAsyncHandler.ValidateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/ValidateConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateConfigurationResult> validateConfigurationAsync(ValidateConfigurationRequest validateConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateConfigurationRequest, ValidateConfigurationResult> asyncHandler);

}
