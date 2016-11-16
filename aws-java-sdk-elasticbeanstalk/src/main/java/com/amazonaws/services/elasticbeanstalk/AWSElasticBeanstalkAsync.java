/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk;

import com.amazonaws.services.elasticbeanstalk.model.*;

/**
 * Interface for accessing Elastic Beanstalk asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.elasticbeanstalk.AbstractAWSElasticBeanstalkAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS Elastic Beanstalk</fullname>
 * <p>
 * AWS Elastic Beanstalk makes it easy for you to create, deploy, and manage scalable, fault-tolerant applications
 * running on the Amazon Web Services cloud.
 * </p>
 * <p>
 * For more information about this product, go to the <a href="http://aws.amazon.com/elasticbeanstalk/">AWS Elastic
 * Beanstalk</a> details page. The location of the latest AWS Elastic Beanstalk WSDL is <a
 * href="http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl"
 * >http://elasticbeanstalk.s3.amazonaws.com/doc/2010-12-01/AWSElasticBeanstalk.wsdl</a>. To install the Software
 * Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line tools that enable you to
 * access the API, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of region-specific endpoints that AWS Elastic Beanstalk supports, go to <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">Regions and Endpoints</a> in
 * the <i>Amazon Web Services Glossary</i>.
 * </p>
 */
public interface AWSElasticBeanstalkAsync extends AWSElasticBeanstalk {

    /**
     * <p>
     * Cancels in-progress environment configuration update or application version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest
     * @return A Java Future containing the result of the AbortEnvironmentUpdate operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.AbortEnvironmentUpdate
     */
    java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest);

    /**
     * <p>
     * Cancels in-progress environment configuration update or application version deployment.
     * </p>
     * 
     * @param abortEnvironmentUpdateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AbortEnvironmentUpdate operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.AbortEnvironmentUpdate
     */
    java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest abortEnvironmentUpdateRequest,
            com.amazonaws.handlers.AsyncHandler<AbortEnvironmentUpdateRequest, AbortEnvironmentUpdateResult> asyncHandler);

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation.
     *
     * @see #abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest)
     */
    java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync();

    /**
     * Simplified method form for invoking the AbortEnvironmentUpdate operation with an AsyncHandler.
     *
     * @see #abortEnvironmentUpdateAsync(AbortEnvironmentUpdateRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<AbortEnvironmentUpdateResult> abortEnvironmentUpdateAsync(
            com.amazonaws.handlers.AsyncHandler<AbortEnvironmentUpdateRequest, AbortEnvironmentUpdateResult> asyncHandler);

    /**
     * <p>
     * Applies a scheduled managed action immediately. A managed action can be applied only if its status is
     * <code>Scheduled</code>. Get the status and action ID of a managed action with
     * <a>DescribeEnvironmentManagedActions</a>.
     * </p>
     * 
     * @param applyEnvironmentManagedActionRequest
     *        Request to execute a scheduled managed action immediately.
     * @return A Java Future containing the result of the ApplyEnvironmentManagedAction operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsync.ApplyEnvironmentManagedAction
     */
    java.util.concurrent.Future<ApplyEnvironmentManagedActionResult> applyEnvironmentManagedActionAsync(
            ApplyEnvironmentManagedActionRequest applyEnvironmentManagedActionRequest);

    /**
     * <p>
     * Applies a scheduled managed action immediately. A managed action can be applied only if its status is
     * <code>Scheduled</code>. Get the status and action ID of a managed action with
     * <a>DescribeEnvironmentManagedActions</a>.
     * </p>
     * 
     * @param applyEnvironmentManagedActionRequest
     *        Request to execute a scheduled managed action immediately.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ApplyEnvironmentManagedAction operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsyncHandler.ApplyEnvironmentManagedAction
     */
    java.util.concurrent.Future<ApplyEnvironmentManagedActionResult> applyEnvironmentManagedActionAsync(
            ApplyEnvironmentManagedActionRequest applyEnvironmentManagedActionRequest,
            com.amazonaws.handlers.AsyncHandler<ApplyEnvironmentManagedActionRequest, ApplyEnvironmentManagedActionResult> asyncHandler);

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest
     *        Results message indicating whether a CNAME is available.
     * @return A Java Future containing the result of the CheckDNSAvailability operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.CheckDNSAvailability
     */
    java.util.concurrent.Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(CheckDNSAvailabilityRequest checkDNSAvailabilityRequest);

    /**
     * <p>
     * Checks if the specified CNAME is available.
     * </p>
     * 
     * @param checkDNSAvailabilityRequest
     *        Results message indicating whether a CNAME is available.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CheckDNSAvailability operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.CheckDNSAvailability
     */
    java.util.concurrent.Future<CheckDNSAvailabilityResult> checkDNSAvailabilityAsync(CheckDNSAvailabilityRequest checkDNSAvailabilityRequest,
            com.amazonaws.handlers.AsyncHandler<CheckDNSAvailabilityRequest, CheckDNSAvailabilityResult> asyncHandler);

    /**
     * <p>
     * Create or update a group of environments that each run a separate component of a single application. Takes a list
     * of version labels that specify application source bundles for each of the environments to create or update. The
     * name of each environment and other required information must be included in the source bundles in an environment
     * manifest named <code>env.yaml</code>. See <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html">Compose
     * Environments</a> for details.
     * </p>
     * 
     * @param composeEnvironmentsRequest
     *        Request to create or update a group of environments.
     * @return A Java Future containing the result of the ComposeEnvironments operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.ComposeEnvironments
     */
    java.util.concurrent.Future<ComposeEnvironmentsResult> composeEnvironmentsAsync(ComposeEnvironmentsRequest composeEnvironmentsRequest);

    /**
     * <p>
     * Create or update a group of environments that each run a separate component of a single application. Takes a list
     * of version labels that specify application source bundles for each of the environments to create or update. The
     * name of each environment and other required information must be included in the source bundles in an environment
     * manifest named <code>env.yaml</code>. See <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-mgmt-compose.html">Compose
     * Environments</a> for details.
     * </p>
     * 
     * @param composeEnvironmentsRequest
     *        Request to create or update a group of environments.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ComposeEnvironments operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.ComposeEnvironments
     */
    java.util.concurrent.Future<ComposeEnvironmentsResult> composeEnvironmentsAsync(ComposeEnvironmentsRequest composeEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ComposeEnvironmentsRequest, ComposeEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Creates an application that has one configuration template named <code>default</code> and no application
     * versions.
     * </p>
     * 
     * @param createApplicationRequest
     *        Request to create an application.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest);

    /**
     * <p>
     * Creates an application that has one configuration template named <code>default</code> and no application
     * versions.
     * </p>
     * 
     * @param createApplicationRequest
     *        Request to create an application.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplication operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.CreateApplication
     */
    java.util.concurrent.Future<CreateApplicationResult> createApplicationAsync(CreateApplicationRequest createApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationRequest, CreateApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates an application version for the specified application.
     * </p>
     * <note>
     * <p>
     * Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that
     * Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an
     * environment from the application version.
     * </p>
     * </note>
     * 
     * @param createApplicationVersionRequest
     * @return A Java Future containing the result of the CreateApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.CreateApplicationVersion
     */
    java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(CreateApplicationVersionRequest createApplicationVersionRequest);

    /**
     * <p>
     * Creates an application version for the specified application.
     * </p>
     * <note>
     * <p>
     * Once you create an application version with a specified Amazon S3 bucket and key location, you cannot change that
     * Amazon S3 location. If you change the Amazon S3 location, you receive an exception when you attempt to launch an
     * environment from the application version.
     * </p>
     * </note>
     * 
     * @param createApplicationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.CreateApplicationVersion
     */
    java.util.concurrent.Future<CreateApplicationVersionResult> createApplicationVersionAsync(CreateApplicationVersionRequest createApplicationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateApplicationVersionRequest, CreateApplicationVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration template. Templates are associated with a specific application and are used to deploy
     * different versions of the application with the same configuration settings.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeConfigurationSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAvailableSolutionStacks</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest
     *        Request to create a configuration template.
     * @return A Java Future containing the result of the CreateConfigurationTemplate operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.CreateConfigurationTemplate
     */
    java.util.concurrent.Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(
            CreateConfigurationTemplateRequest createConfigurationTemplateRequest);

    /**
     * <p>
     * Creates a configuration template. Templates are associated with a specific application and are used to deploy
     * different versions of the application with the same configuration settings.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>DescribeConfigurationSettings</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>ListAvailableSolutionStacks</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createConfigurationTemplateRequest
     *        Request to create a configuration template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationTemplate operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.CreateConfigurationTemplate
     */
    java.util.concurrent.Future<CreateConfigurationTemplateResult> createConfigurationTemplateAsync(
            CreateConfigurationTemplateRequest createConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Launches an environment for the specified application using the specified configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.CreateEnvironment
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Launches an environment for the specified application using the specified configuration.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.CreateEnvironment
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     * 
     * @param createStorageLocationRequest
     * @return A Java Future containing the result of the CreateStorageLocation operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.CreateStorageLocation
     */
    java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(CreateStorageLocationRequest createStorageLocationRequest);

    /**
     * <p>
     * Creates the Amazon S3 storage location for the account.
     * </p>
     * <p>
     * This location is used to store user log files.
     * </p>
     * 
     * @param createStorageLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStorageLocation operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.CreateStorageLocation
     */
    java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(CreateStorageLocationRequest createStorageLocationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStorageLocationRequest, CreateStorageLocationResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateStorageLocation operation.
     *
     * @see #createStorageLocationAsync(CreateStorageLocationRequest)
     */
    java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync();

    /**
     * Simplified method form for invoking the CreateStorageLocation operation with an AsyncHandler.
     *
     * @see #createStorageLocationAsync(CreateStorageLocationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateStorageLocationResult> createStorageLocationAsync(
            com.amazonaws.handlers.AsyncHandler<CreateStorageLocationRequest, CreateStorageLocationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified application along with all associated versions and configurations. The application versions
     * will not be deleted from your Amazon S3 bucket.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application that has a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest
     *        Request to delete an application.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DeleteApplication
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest);

    /**
     * <p>
     * Deletes the specified application along with all associated versions and configurations. The application versions
     * will not be deleted from your Amazon S3 bucket.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application that has a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationRequest
     *        Request to delete an application.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplication operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DeleteApplication
     */
    java.util.concurrent.Future<DeleteApplicationResult> deleteApplicationAsync(DeleteApplicationRequest deleteApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationRequest, DeleteApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application version that is associated with a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationVersionRequest
     *        Request to delete an application version.
     * @return A Java Future containing the result of the DeleteApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DeleteApplicationVersion
     */
    java.util.concurrent.Future<DeleteApplicationVersionResult> deleteApplicationVersionAsync(DeleteApplicationVersionRequest deleteApplicationVersionRequest);

    /**
     * <p>
     * Deletes the specified version from the specified application.
     * </p>
     * <note>
     * <p>
     * You cannot delete an application version that is associated with a running environment.
     * </p>
     * </note>
     * 
     * @param deleteApplicationVersionRequest
     *        Request to delete an application version.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DeleteApplicationVersion
     */
    java.util.concurrent.Future<DeleteApplicationVersionResult> deleteApplicationVersionAsync(DeleteApplicationVersionRequest deleteApplicationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteApplicationVersionRequest, DeleteApplicationVersionResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>
     * <p>
     * When you launch an environment using a configuration template, the environment gets a copy of the template. You
     * can delete or modify the environment's copy of the template without affecting the running environment.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationTemplateRequest
     *        Request to delete a configuration template.
     * @return A Java Future containing the result of the DeleteConfigurationTemplate operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DeleteConfigurationTemplate
     */
    java.util.concurrent.Future<DeleteConfigurationTemplateResult> deleteConfigurationTemplateAsync(
            DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest);

    /**
     * <p>
     * Deletes the specified configuration template.
     * </p>
     * <note>
     * <p>
     * When you launch an environment using a configuration template, the environment gets a copy of the template. You
     * can delete or modify the environment's copy of the template without affecting the running environment.
     * </p>
     * </note>
     * 
     * @param deleteConfigurationTemplateRequest
     *        Request to delete a configuration template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationTemplate operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DeleteConfigurationTemplate
     */
    java.util.concurrent.Future<DeleteConfigurationTemplateResult> deleteConfigurationTemplateAsync(
            DeleteConfigurationTemplateRequest deleteConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationTemplateRequest, DeleteConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a draft configuration set. You can get the
     * draft configuration using <a>DescribeConfigurationSettings</a> while the update is in progress or if the update
     * fails. The <code>DeploymentStatus</code> for the draft configuration indicates whether the deployment is in
     * process or has failed. The draft configuration remains in existence until it is deleted with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest
     *        Request to delete a draft environment configuration.
     * @return A Java Future containing the result of the DeleteEnvironmentConfiguration operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsync.DeleteEnvironmentConfiguration
     */
    java.util.concurrent.Future<DeleteEnvironmentConfigurationResult> deleteEnvironmentConfigurationAsync(
            DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest);

    /**
     * <p>
     * Deletes the draft configuration associated with the running environment.
     * </p>
     * <p>
     * Updating a running environment with any configuration changes creates a draft configuration set. You can get the
     * draft configuration using <a>DescribeConfigurationSettings</a> while the update is in progress or if the update
     * fails. The <code>DeploymentStatus</code> for the draft configuration indicates whether the deployment is in
     * process or has failed. The draft configuration remains in existence until it is deleted with this action.
     * </p>
     * 
     * @param deleteEnvironmentConfigurationRequest
     *        Request to delete a draft environment configuration.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironmentConfiguration operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsyncHandler.DeleteEnvironmentConfiguration
     */
    java.util.concurrent.Future<DeleteEnvironmentConfigurationResult> deleteEnvironmentConfigurationAsync(
            DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentConfigurationRequest, DeleteEnvironmentConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of application versions stored in your AWS Elastic Beanstalk storage bucket.
     * </p>
     * 
     * @param describeApplicationVersionsRequest
     *        Result message containing a list of configuration descriptions.
     * @return A Java Future containing the result of the DescribeApplicationVersions operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DescribeApplicationVersions
     */
    java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            DescribeApplicationVersionsRequest describeApplicationVersionsRequest);

    /**
     * <p>
     * Retrieve a list of application versions stored in your AWS Elastic Beanstalk storage bucket.
     * </p>
     * 
     * @param describeApplicationVersionsRequest
     *        Result message containing a list of configuration descriptions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplicationVersions operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeApplicationVersions
     */
    java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            DescribeApplicationVersionsRequest describeApplicationVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationVersionsRequest, DescribeApplicationVersionsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeApplicationVersions operation.
     *
     * @see #describeApplicationVersionsAsync(DescribeApplicationVersionsRequest)
     */
    java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync();

    /**
     * Simplified method form for invoking the DescribeApplicationVersions operation with an AsyncHandler.
     *
     * @see #describeApplicationVersionsAsync(DescribeApplicationVersionsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeApplicationVersionsResult> describeApplicationVersionsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationVersionsRequest, DescribeApplicationVersionsResult> asyncHandler);

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest
     *        Request to describe one or more applications.
     * @return A Java Future containing the result of the DescribeApplications operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DescribeApplications
     */
    java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(DescribeApplicationsRequest describeApplicationsRequest);

    /**
     * <p>
     * Returns the descriptions of existing applications.
     * </p>
     * 
     * @param describeApplicationsRequest
     *        Request to describe one or more applications.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApplications operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeApplications
     */
    java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(DescribeApplicationsRequest describeApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationsRequest, DescribeApplicationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeApplications operation.
     *
     * @see #describeApplicationsAsync(DescribeApplicationsRequest)
     */
    java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync();

    /**
     * Simplified method form for invoking the DescribeApplications operation with an AsyncHandler.
     *
     * @see #describeApplicationsAsync(DescribeApplicationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeApplicationsResult> describeApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeApplicationsRequest, DescribeApplicationsResult> asyncHandler);

    /**
     * <p>
     * Describes the configuration options that are used in a particular configuration template or environment, or that
     * a specified solution stack defines. The description includes the values the options, their default values, and an
     * indication of the required action on a running environment if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest
     *        Result message containig a list of application version descriptions.
     * @return A Java Future containing the result of the DescribeConfigurationOptions operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsync.DescribeConfigurationOptions
     */
    java.util.concurrent.Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(
            DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest);

    /**
     * <p>
     * Describes the configuration options that are used in a particular configuration template or environment, or that
     * a specified solution stack defines. The description includes the values the options, their default values, and an
     * indication of the required action on a running environment if an option value is changed.
     * </p>
     * 
     * @param describeConfigurationOptionsRequest
     *        Result message containig a list of application version descriptions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationOptions operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeConfigurationOptions
     */
    java.util.concurrent.Future<DescribeConfigurationOptionsResult> describeConfigurationOptionsAsync(
            DescribeConfigurationOptionsRequest describeConfigurationOptionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationOptionsRequest, DescribeConfigurationOptionsResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the settings for the specified configuration set, that is, either a configuration
     * template or the configuration set associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a running environment, it is possible to
     * receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft
     * configuration of an environment that is either in the process of deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteEnvironmentConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest
     *        Result message containing all of the configuration settings for a specified solution stack or
     *        configuration template.
     * @return A Java Future containing the result of the DescribeConfigurationSettings operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsync.DescribeConfigurationSettings
     */
    java.util.concurrent.Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(
            DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest);

    /**
     * <p>
     * Returns a description of the settings for the specified configuration set, that is, either a configuration
     * template or the configuration set associated with a running environment.
     * </p>
     * <p>
     * When describing the settings for the configuration set associated with a running environment, it is possible to
     * receive two sets of setting descriptions. One is the deployed configuration set, and the other is a draft
     * configuration of an environment that is either in the process of deployment or that failed to deploy.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DeleteEnvironmentConfiguration</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeConfigurationSettingsRequest
     *        Result message containing all of the configuration settings for a specified solution stack or
     *        configuration template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeConfigurationSettings operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeConfigurationSettings
     */
    java.util.concurrent.Future<DescribeConfigurationSettingsResult> describeConfigurationSettingsAsync(
            DescribeConfigurationSettingsRequest describeConfigurationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationSettingsRequest, DescribeConfigurationSettingsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the overall health of the specified environment. The <b>DescribeEnvironmentHealth</b>
     * operation is only available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest
     *        See the example below to learn how to create a request body.
     * @return A Java Future containing the result of the DescribeEnvironmentHealth operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DescribeEnvironmentHealth
     */
    java.util.concurrent.Future<DescribeEnvironmentHealthResult> describeEnvironmentHealthAsync(
            DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest);

    /**
     * <p>
     * Returns information about the overall health of the specified environment. The <b>DescribeEnvironmentHealth</b>
     * operation is only available with AWS Elastic Beanstalk Enhanced Health.
     * </p>
     * 
     * @param describeEnvironmentHealthRequest
     *        See the example below to learn how to create a request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironmentHealth operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeEnvironmentHealth
     */
    java.util.concurrent.Future<DescribeEnvironmentHealthResult> describeEnvironmentHealthAsync(
            DescribeEnvironmentHealthRequest describeEnvironmentHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentHealthRequest, DescribeEnvironmentHealthResult> asyncHandler);

    /**
     * <p>
     * Lists an environment's completed and failed managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionHistoryRequest
     *        Request to list completed and failed managed actions.
     * @return A Java Future containing the result of the DescribeEnvironmentManagedActionHistory operation returned by
     *         the service.
     * @sample AWSElasticBeanstalkAsync.DescribeEnvironmentManagedActionHistory
     */
    java.util.concurrent.Future<DescribeEnvironmentManagedActionHistoryResult> describeEnvironmentManagedActionHistoryAsync(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest);

    /**
     * <p>
     * Lists an environment's completed and failed managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionHistoryRequest
     *        Request to list completed and failed managed actions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironmentManagedActionHistory operation returned by
     *         the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeEnvironmentManagedActionHistory
     */
    java.util.concurrent.Future<DescribeEnvironmentManagedActionHistoryResult> describeEnvironmentManagedActionHistoryAsync(
            DescribeEnvironmentManagedActionHistoryRequest describeEnvironmentManagedActionHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentManagedActionHistoryRequest, DescribeEnvironmentManagedActionHistoryResult> asyncHandler);

    /**
     * <p>
     * Lists an environment's upcoming and in-progress managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionsRequest
     *        Request to list an environment's upcoming and in-progress managed actions.
     * @return A Java Future containing the result of the DescribeEnvironmentManagedActions operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsync.DescribeEnvironmentManagedActions
     */
    java.util.concurrent.Future<DescribeEnvironmentManagedActionsResult> describeEnvironmentManagedActionsAsync(
            DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest);

    /**
     * <p>
     * Lists an environment's upcoming and in-progress managed actions.
     * </p>
     * 
     * @param describeEnvironmentManagedActionsRequest
     *        Request to list an environment's upcoming and in-progress managed actions.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironmentManagedActions operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeEnvironmentManagedActions
     */
    java.util.concurrent.Future<DescribeEnvironmentManagedActionsResult> describeEnvironmentManagedActionsAsync(
            DescribeEnvironmentManagedActionsRequest describeEnvironmentManagedActionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentManagedActionsRequest, DescribeEnvironmentManagedActionsResult> asyncHandler);

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest
     *        Request to describe the resources in an environment.
     * @return A Java Future containing the result of the DescribeEnvironmentResources operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsync.DescribeEnvironmentResources
     */
    java.util.concurrent.Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(
            DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest);

    /**
     * <p>
     * Returns AWS resources for this environment.
     * </p>
     * 
     * @param describeEnvironmentResourcesRequest
     *        Request to describe the resources in an environment.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironmentResources operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeEnvironmentResources
     */
    java.util.concurrent.Future<DescribeEnvironmentResourcesResult> describeEnvironmentResourcesAsync(
            DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentResourcesRequest, DescribeEnvironmentResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     *        Request to describe one or more environments.
     * @return A Java Future containing the result of the DescribeEnvironments operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DescribeEnvironments
     */
    java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest describeEnvironmentsRequest);

    /**
     * <p>
     * Returns descriptions for existing environments.
     * </p>
     * 
     * @param describeEnvironmentsRequest
     *        Request to describe one or more environments.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEnvironments operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeEnvironments
     */
    java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(DescribeEnvironmentsRequest describeEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEnvironments operation.
     *
     * @see #describeEnvironmentsAsync(DescribeEnvironmentsRequest)
     */
    java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync();

    /**
     * Simplified method form for invoking the DescribeEnvironments operation with an AsyncHandler.
     *
     * @see #describeEnvironmentsAsync(DescribeEnvironmentsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEnvironmentsResult> describeEnvironmentsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEnvironmentsRequest, DescribeEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6 weeks.
     * </p>
     * <note>
     * <p>
     * This action returns the most recent 1,000 events from the specified <code>NextToken</code>.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest
     *        Request to retrieve a list of events for an environment.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DescribeEvents
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest);

    /**
     * <p>
     * Returns list of event descriptions matching criteria up to the last 6 weeks.
     * </p>
     * <note>
     * <p>
     * This action returns the most recent 1,000 events from the specified <code>NextToken</code>.
     * </p>
     * </note>
     * 
     * @param describeEventsRequest
     *        Request to retrieve a list of events for an environment.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEvents operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeEvents
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(DescribeEventsRequest describeEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeEvents operation.
     *
     * @see #describeEventsAsync(DescribeEventsRequest)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync();

    /**
     * Simplified method form for invoking the DescribeEvents operation with an AsyncHandler.
     *
     * @see #describeEventsAsync(DescribeEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeEventsResult> describeEventsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeEventsRequest, DescribeEventsResult> asyncHandler);

    /**
     * <p>
     * Returns more detailed information about the health of the specified instances (for example, CPU utilization, load
     * average, and causes). The <b>DescribeInstancesHealth</b> operation is only available with AWS Elastic Beanstalk
     * Enhanced Health.
     * </p>
     * 
     * @param describeInstancesHealthRequest
     *        See the example below to learn how to create a request body.
     * @return A Java Future containing the result of the DescribeInstancesHealth operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.DescribeInstancesHealth
     */
    java.util.concurrent.Future<DescribeInstancesHealthResult> describeInstancesHealthAsync(DescribeInstancesHealthRequest describeInstancesHealthRequest);

    /**
     * <p>
     * Returns more detailed information about the health of the specified instances (for example, CPU utilization, load
     * average, and causes). The <b>DescribeInstancesHealth</b> operation is only available with AWS Elastic Beanstalk
     * Enhanced Health.
     * </p>
     * 
     * @param describeInstancesHealthRequest
     *        See the example below to learn how to create a request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstancesHealth operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.DescribeInstancesHealth
     */
    java.util.concurrent.Future<DescribeInstancesHealthResult> describeInstancesHealthAsync(DescribeInstancesHealthRequest describeInstancesHealthRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesHealthRequest, DescribeInstancesHealthResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     * @return A Java Future containing the result of the ListAvailableSolutionStacks operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.ListAvailableSolutionStacks
     */
    java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest);

    /**
     * <p>
     * Returns a list of the available solution stack names.
     * </p>
     * 
     * @param listAvailableSolutionStacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAvailableSolutionStacks operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.ListAvailableSolutionStacks
     */
    java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            ListAvailableSolutionStacksRequest listAvailableSolutionStacksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks operation.
     *
     * @see #listAvailableSolutionStacksAsync(ListAvailableSolutionStacksRequest)
     */
    java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync();

    /**
     * Simplified method form for invoking the ListAvailableSolutionStacks operation with an AsyncHandler.
     *
     * @see #listAvailableSolutionStacksAsync(ListAvailableSolutionStacksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAvailableSolutionStacksResult> listAvailableSolutionStacksAsync(
            com.amazonaws.handlers.AsyncHandler<ListAvailableSolutionStacksRequest, ListAvailableSolutionStacksResult> asyncHandler);

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a
     * specified environment and forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest
     * @return A Java Future containing the result of the RebuildEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.RebuildEnvironment
     */
    java.util.concurrent.Future<RebuildEnvironmentResult> rebuildEnvironmentAsync(RebuildEnvironmentRequest rebuildEnvironmentRequest);

    /**
     * <p>
     * Deletes and recreates all of the AWS resources (for example: the Auto Scaling group, load balancer, etc.) for a
     * specified environment and forces a restart.
     * </p>
     * 
     * @param rebuildEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebuildEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.RebuildEnvironment
     */
    java.util.concurrent.Future<RebuildEnvironmentResult> rebuildEnvironmentAsync(RebuildEnvironmentRequest rebuildEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<RebuildEnvironmentRequest, RebuildEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last lines from the application server log
     * files of every Amazon EC2 instance in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the application server log files for every
     * Amazon EC2 instance into a <code>.zip</code> file. Legacy and .NET containers do not support bundle logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RetrieveEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest
     *        Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket.
     * @return A Java Future containing the result of the RequestEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.RequestEnvironmentInfo
     */
    java.util.concurrent.Future<RequestEnvironmentInfoResult> requestEnvironmentInfoAsync(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest);

    /**
     * <p>
     * Initiates a request to compile the specified type of information of the deployed environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>tail</code> compiles the last lines from the application server log
     * files of every Amazon EC2 instance in your environment.
     * </p>
     * <p>
     * Setting the <code>InfoType</code> to <code>bundle</code> compresses the application server log files for every
     * Amazon EC2 instance into a <code>.zip</code> file. Legacy and .NET containers do not support bundle logs.
     * </p>
     * <p>
     * Use <a>RetrieveEnvironmentInfo</a> to obtain the set of logs.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RetrieveEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestEnvironmentInfoRequest
     *        Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.RequestEnvironmentInfo
     */
    java.util.concurrent.Future<RequestEnvironmentInfoResult> requestEnvironmentInfoAsync(RequestEnvironmentInfoRequest requestEnvironmentInfoRequest,
            com.amazonaws.handlers.AsyncHandler<RequestEnvironmentInfoRequest, RequestEnvironmentInfoResult> asyncHandler);

    /**
     * <p>
     * Causes the environment to restart the application container server running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest
     * @return A Java Future containing the result of the RestartAppServer operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.RestartAppServer
     */
    java.util.concurrent.Future<RestartAppServerResult> restartAppServerAsync(RestartAppServerRequest restartAppServerRequest);

    /**
     * <p>
     * Causes the environment to restart the application container server running on each Amazon EC2 instance.
     * </p>
     * 
     * @param restartAppServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestartAppServer operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.RestartAppServer
     */
    java.util.concurrent.Future<RestartAppServerResult> restartAppServerAsync(RestartAppServerRequest restartAppServerRequest,
            com.amazonaws.handlers.AsyncHandler<RestartAppServerRequest, RestartAppServerResult> asyncHandler);

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a> request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RequestEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest
     *        Request to download logs retrieved with <a>RequestEnvironmentInfo</a>.
     * @return A Java Future containing the result of the RetrieveEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.RetrieveEnvironmentInfo
     */
    java.util.concurrent.Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest);

    /**
     * <p>
     * Retrieves the compiled information from a <a>RequestEnvironmentInfo</a> request.
     * </p>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>RequestEnvironmentInfo</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param retrieveEnvironmentInfoRequest
     *        Request to download logs retrieved with <a>RequestEnvironmentInfo</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RetrieveEnvironmentInfo operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.RetrieveEnvironmentInfo
     */
    java.util.concurrent.Future<RetrieveEnvironmentInfoResult> retrieveEnvironmentInfoAsync(RetrieveEnvironmentInfoRequest retrieveEnvironmentInfoRequest,
            com.amazonaws.handlers.AsyncHandler<RetrieveEnvironmentInfoRequest, RetrieveEnvironmentInfoResult> asyncHandler);

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest
     *        Swaps the CNAMEs of two environments.
     * @return A Java Future containing the result of the SwapEnvironmentCNAMEs operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.SwapEnvironmentCNAMEs
     */
    java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest);

    /**
     * <p>
     * Swaps the CNAMEs of two environments.
     * </p>
     * 
     * @param swapEnvironmentCNAMEsRequest
     *        Swaps the CNAMEs of two environments.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SwapEnvironmentCNAMEs operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.SwapEnvironmentCNAMEs
     */
    java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest swapEnvironmentCNAMEsRequest,
            com.amazonaws.handlers.AsyncHandler<SwapEnvironmentCNAMEsRequest, SwapEnvironmentCNAMEsResult> asyncHandler);

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation.
     *
     * @see #swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest)
     */
    java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync();

    /**
     * Simplified method form for invoking the SwapEnvironmentCNAMEs operation with an AsyncHandler.
     *
     * @see #swapEnvironmentCNAMEsAsync(SwapEnvironmentCNAMEsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<SwapEnvironmentCNAMEsResult> swapEnvironmentCNAMEsAsync(
            com.amazonaws.handlers.AsyncHandler<SwapEnvironmentCNAMEsRequest, SwapEnvironmentCNAMEsResult> asyncHandler);

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest
     *        Request to terminate an environment.
     * @return A Java Future containing the result of the TerminateEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.TerminateEnvironment
     */
    java.util.concurrent.Future<TerminateEnvironmentResult> terminateEnvironmentAsync(TerminateEnvironmentRequest terminateEnvironmentRequest);

    /**
     * <p>
     * Terminates the specified environment.
     * </p>
     * 
     * @param terminateEnvironmentRequest
     *        Request to terminate an environment.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TerminateEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.TerminateEnvironment
     */
    java.util.concurrent.Future<TerminateEnvironmentResult> terminateEnvironmentAsync(TerminateEnvironmentRequest terminateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateEnvironmentRequest, TerminateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * these properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     *        Request to update an application.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest);

    /**
     * <p>
     * Updates the specified application to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * these properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationRequest
     *        Request to update an application.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplication operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.UpdateApplication
     */
    java.util.concurrent.Future<UpdateApplicationResult> updateApplicationAsync(UpdateApplicationRequest updateApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationRequest, UpdateApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates the specified application version to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationVersionRequest
     * @return A Java Future containing the result of the UpdateApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.UpdateApplicationVersion
     */
    java.util.concurrent.Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(UpdateApplicationVersionRequest updateApplicationVersionRequest);

    /**
     * <p>
     * Updates the specified application version to have the specified properties.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>description</code>) is not provided, the value remains unchanged. To clear
     * properties, specify an empty string.
     * </p>
     * </note>
     * 
     * @param updateApplicationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplicationVersion operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.UpdateApplicationVersion
     */
    java.util.concurrent.Future<UpdateApplicationVersionResult> updateApplicationVersionAsync(UpdateApplicationVersionRequest updateApplicationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationVersionRequest, UpdateApplicationVersionResult> asyncHandler);

    /**
     * <p>
     * Updates the specified configuration template to have the specified properties or configuration option values.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>ApplicationName</code>) is not provided, its value remains unchanged. To clear
     * such properties, specify an empty string.
     * </p>
     * </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest
     *        The result message containing the options for the specified solution stack.
     * @return A Java Future containing the result of the UpdateConfigurationTemplate operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.UpdateConfigurationTemplate
     */
    java.util.concurrent.Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(
            UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest);

    /**
     * <p>
     * Updates the specified configuration template to have the specified properties or configuration option values.
     * </p>
     * <note>
     * <p>
     * If a property (for example, <code>ApplicationName</code>) is not provided, its value remains unchanged. To clear
     * such properties, specify an empty string.
     * </p>
     * </note>
     * <p>
     * Related Topics
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>DescribeConfigurationOptions</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param updateConfigurationTemplateRequest
     *        The result message containing the options for the specified solution stack.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationTemplate operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.UpdateConfigurationTemplate
     */
    java.util.concurrent.Future<UpdateConfigurationTemplateResult> updateConfigurationTemplateAsync(
            UpdateConfigurationTemplateRequest updateConfigurationTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationTemplateRequest, UpdateConfigurationTemplateResult> asyncHandler);

    /**
     * <p>
     * Updates the environment description, deploys a new application version, updates the configuration settings to an
     * entirely new configuration template, or updates select configuration option values in the running environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual settings, a draft configuration is
     * created and <a>DescribeConfigurationSettings</a> for this environment returns two setting descriptions with
     * different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest
     *        Request to update an environment.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsync.UpdateEnvironment
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates the environment description, deploys a new application version, updates the configuration settings to an
     * entirely new configuration template, or updates select configuration option values in the running environment.
     * </p>
     * <p>
     * Attempting to update both the release and configuration is not allowed and AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * </p>
     * <p>
     * When updating the configuration settings to a new template or individual settings, a draft configuration is
     * created and <a>DescribeConfigurationSettings</a> for this environment returns two setting descriptions with
     * different <code>DeploymentStatus</code> values.
     * </p>
     * 
     * @param updateEnvironmentRequest
     *        Request to update an environment.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AWSElasticBeanstalkAsyncHandler.UpdateEnvironment
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template or environment, and determines whether
     * those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings associated with the selection of option
     * values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest
     *        A list of validation messages for a specified configuration template.
     * @return A Java Future containing the result of the ValidateConfigurationSettings operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsync.ValidateConfigurationSettings
     */
    java.util.concurrent.Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(
            ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest);

    /**
     * <p>
     * Takes a set of configuration settings and either a configuration template or environment, and determines whether
     * those values are valid.
     * </p>
     * <p>
     * This action returns a list of messages indicating any errors or warnings associated with the selection of option
     * values.
     * </p>
     * 
     * @param validateConfigurationSettingsRequest
     *        A list of validation messages for a specified configuration template.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateConfigurationSettings operation returned by the
     *         service.
     * @sample AWSElasticBeanstalkAsyncHandler.ValidateConfigurationSettings
     */
    java.util.concurrent.Future<ValidateConfigurationSettingsResult> validateConfigurationSettingsAsync(
            ValidateConfigurationSettingsRequest validateConfigurationSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateConfigurationSettingsRequest, ValidateConfigurationSettingsResult> asyncHandler);

}
