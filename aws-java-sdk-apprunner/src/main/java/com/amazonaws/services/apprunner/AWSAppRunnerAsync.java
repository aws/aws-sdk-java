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
package com.amazonaws.services.apprunner;

import javax.annotation.Generated;

import com.amazonaws.services.apprunner.model.*;

/**
 * Interface for accessing AWS App Runner asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.apprunner.AbstractAWSAppRunnerAsync} instead.
 * </p>
 * <p>
 * <fullname>AWS App Runner</fullname>
 * <p>
 * AWS App Runner is an application service that provides a fast, simple, and cost-effective way to go directly from an
 * existing container image or source code to a running service in the AWS cloud in seconds. You don't need to learn new
 * technologies, decide which compute service to use, or understand how to provision and configure AWS resources.
 * </p>
 * <p>
 * App Runner connects directly to your container registry or source code repository. It provides an automatic delivery
 * pipeline with fully managed operations, high performance, scalability, and security.
 * </p>
 * <p>
 * For more information about App Runner, see the <a href="https://docs.aws.amazon.com/apprunner/latest/dg/">AWS App
 * Runner Developer Guide</a>. For release information, see the <a
 * href="https://docs.aws.amazon.com/apprunner/latest/relnotes/">AWS App Runner Release Notes</a>.
 * </p>
 * <p>
 * To install the Software Development Kits (SDKs), Integrated Development Environment (IDE) Toolkits, and command line
 * tools that you can use to access the API, see <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * For a list of Region-specific endpoints that App Runner supports, see <a
 * href="https://docs.aws.amazon.com/general/latest/gr/apprunner.html">AWS App Runner endpoints and quotas</a> in the
 * <i>AWS General Reference</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSAppRunnerAsync extends AWSAppRunner {

    /**
     * <p>
     * Associate your own domain name with the AWS App Runner subdomain URL of your App Runner service.
     * </p>
     * <p>
     * After you call <code>AssociateCustomDomain</code> and receive a successful response, use the information in the
     * <a>CustomDomain</a> record that's returned to add CNAME records to your Domain Name System (DNS). For each mapped
     * domain name, add a mapping to the target App Runner subdomain and one or more certificate validation records. App
     * Runner then performs DNS validation to verify that you own or control the domain name that you associated. App
     * Runner tracks domain validity in a certificate stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>.
     * </p>
     * 
     * @param associateCustomDomainRequest
     * @return A Java Future containing the result of the AssociateCustomDomain operation returned by the service.
     * @sample AWSAppRunnerAsync.AssociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AssociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCustomDomainResult> associateCustomDomainAsync(AssociateCustomDomainRequest associateCustomDomainRequest);

    /**
     * <p>
     * Associate your own domain name with the AWS App Runner subdomain URL of your App Runner service.
     * </p>
     * <p>
     * After you call <code>AssociateCustomDomain</code> and receive a successful response, use the information in the
     * <a>CustomDomain</a> record that's returned to add CNAME records to your Domain Name System (DNS). For each mapped
     * domain name, add a mapping to the target App Runner subdomain and one or more certificate validation records. App
     * Runner then performs DNS validation to verify that you own or control the domain name that you associated. App
     * Runner tracks domain validity in a certificate stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>.
     * </p>
     * 
     * @param associateCustomDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateCustomDomain operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.AssociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/AssociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateCustomDomainResult> associateCustomDomainAsync(AssociateCustomDomainRequest associateCustomDomainRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateCustomDomainRequest, AssociateCustomDomainResult> asyncHandler);

    /**
     * <p>
     * Create an AWS App Runner automatic scaling configuration resource. App Runner requires this resource when you
     * create App Runner services that require non-default auto scaling settings. You can share an auto scaling
     * configuration across multiple services.
     * </p>
     * <p>
     * Create multiple revisions of a configuration by using the same <code>AutoScalingConfigurationName</code> and
     * different <code>AutoScalingConfigurationRevision</code> values. When you create a service, you can set it to use
     * the latest active revision of an auto scaling configuration or a specific revision.
     * </p>
     * <p>
     * Configure a higher <code>MinSize</code> to increase the spread of your App Runner service over more Availability
     * Zones in the AWS Region. The tradeoff is a higher minimal cost.
     * </p>
     * <p>
     * Configure a lower <code>MaxSize</code> to control your cost. The tradeoff is lower responsiveness during peak
     * demand.
     * </p>
     * 
     * @param createAutoScalingConfigurationRequest
     * @return A Java Future containing the result of the CreateAutoScalingConfiguration operation returned by the
     *         service.
     * @sample AWSAppRunnerAsync.CreateAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoScalingConfigurationResult> createAutoScalingConfigurationAsync(
            CreateAutoScalingConfigurationRequest createAutoScalingConfigurationRequest);

    /**
     * <p>
     * Create an AWS App Runner automatic scaling configuration resource. App Runner requires this resource when you
     * create App Runner services that require non-default auto scaling settings. You can share an auto scaling
     * configuration across multiple services.
     * </p>
     * <p>
     * Create multiple revisions of a configuration by using the same <code>AutoScalingConfigurationName</code> and
     * different <code>AutoScalingConfigurationRevision</code> values. When you create a service, you can set it to use
     * the latest active revision of an auto scaling configuration or a specific revision.
     * </p>
     * <p>
     * Configure a higher <code>MinSize</code> to increase the spread of your App Runner service over more Availability
     * Zones in the AWS Region. The tradeoff is a higher minimal cost.
     * </p>
     * <p>
     * Configure a lower <code>MaxSize</code> to control your cost. The tradeoff is lower responsiveness during peak
     * demand.
     * </p>
     * 
     * @param createAutoScalingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAutoScalingConfiguration operation returned by the
     *         service.
     * @sample AWSAppRunnerAsyncHandler.CreateAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutoScalingConfigurationResult> createAutoScalingConfigurationAsync(
            CreateAutoScalingConfigurationRequest createAutoScalingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAutoScalingConfigurationRequest, CreateAutoScalingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Create an AWS App Runner connection resource. App Runner requires a connection resource when you create App
     * Runner services that access private repositories from certain third-party providers. You can share a connection
     * across multiple services.
     * </p>
     * <p>
     * A connection resource is needed to access GitHub repositories. GitHub requires a user interface approval process
     * through the App Runner console before you can use the connection.
     * </p>
     * 
     * @param createConnectionRequest
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSAppRunnerAsync.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest);

    /**
     * <p>
     * Create an AWS App Runner connection resource. App Runner requires a connection resource when you create App
     * Runner services that access private repositories from certain third-party providers. You can share a connection
     * across multiple services.
     * </p>
     * <p>
     * A connection resource is needed to access GitHub repositories. GitHub requires a user interface approval process
     * through the App Runner console before you can use the connection.
     * </p>
     * 
     * @param createConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConnection operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.CreateConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest createConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler);

    /**
     * <p>
     * Create an AWS App Runner service. After the service is created, the action also automatically starts a
     * deployment.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a href="https://docs.aws.amazon.com/apprunner/latest/api/API_ListOperations.html">ListOperations</a> call to
     * track the operation's progress.
     * </p>
     * 
     * @param createServiceRequest
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSAppRunnerAsync.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Create an AWS App Runner service. After the service is created, the action also automatically starts a
     * deployment.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a href="https://docs.aws.amazon.com/apprunner/latest/api/API_ListOperations.html">ListOperations</a> call to
     * track the operation's progress.
     * </p>
     * 
     * @param createServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/CreateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler);

    /**
     * <p>
     * Delete an AWS App Runner automatic scaling configuration resource. You can delete a specific revision or the
     * latest active revision. You can't delete a configuration that's used by one or more App Runner services.
     * </p>
     * 
     * @param deleteAutoScalingConfigurationRequest
     * @return A Java Future containing the result of the DeleteAutoScalingConfiguration operation returned by the
     *         service.
     * @sample AWSAppRunnerAsync.DeleteAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAutoScalingConfigurationResult> deleteAutoScalingConfigurationAsync(
            DeleteAutoScalingConfigurationRequest deleteAutoScalingConfigurationRequest);

    /**
     * <p>
     * Delete an AWS App Runner automatic scaling configuration resource. You can delete a specific revision or the
     * latest active revision. You can't delete a configuration that's used by one or more App Runner services.
     * </p>
     * 
     * @param deleteAutoScalingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAutoScalingConfiguration operation returned by the
     *         service.
     * @sample AWSAppRunnerAsyncHandler.DeleteAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteAutoScalingConfigurationResult> deleteAutoScalingConfigurationAsync(
            DeleteAutoScalingConfigurationRequest deleteAutoScalingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAutoScalingConfigurationRequest, DeleteAutoScalingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Delete an AWS App Runner connection. You must first ensure that there are no running App Runner services that use
     * this connection. If there are any, the <code>DeleteConnection</code> action fails.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSAppRunnerAsync.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest);

    /**
     * <p>
     * Delete an AWS App Runner connection. You must first ensure that there are no running App Runner services that use
     * this connection. If there are any, the <code>DeleteConnection</code> action fails.
     * </p>
     * 
     * @param deleteConnectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConnection operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.DeleteConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteConnection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest deleteConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler);

    /**
     * <p>
     * Delete an AWS App Runner service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSAppRunnerAsync.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Delete an AWS App Runner service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param deleteServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DeleteService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler);

    /**
     * <p>
     * Return a full description of an AWS App Runner automatic scaling configuration resource.
     * </p>
     * 
     * @param describeAutoScalingConfigurationRequest
     * @return A Java Future containing the result of the DescribeAutoScalingConfiguration operation returned by the
     *         service.
     * @sample AWSAppRunnerAsync.DescribeAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingConfigurationResult> describeAutoScalingConfigurationAsync(
            DescribeAutoScalingConfigurationRequest describeAutoScalingConfigurationRequest);

    /**
     * <p>
     * Return a full description of an AWS App Runner automatic scaling configuration resource.
     * </p>
     * 
     * @param describeAutoScalingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAutoScalingConfiguration operation returned by the
     *         service.
     * @sample AWSAppRunnerAsyncHandler.DescribeAutoScalingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeAutoScalingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAutoScalingConfigurationResult> describeAutoScalingConfigurationAsync(
            DescribeAutoScalingConfigurationRequest describeAutoScalingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAutoScalingConfigurationRequest, DescribeAutoScalingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Return a description of custom domain names that are associated with an AWS App Runner service.
     * </p>
     * 
     * @param describeCustomDomainsRequest
     * @return A Java Future containing the result of the DescribeCustomDomains operation returned by the service.
     * @sample AWSAppRunnerAsync.DescribeCustomDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeCustomDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomDomainsResult> describeCustomDomainsAsync(DescribeCustomDomainsRequest describeCustomDomainsRequest);

    /**
     * <p>
     * Return a description of custom domain names that are associated with an AWS App Runner service.
     * </p>
     * 
     * @param describeCustomDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCustomDomains operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.DescribeCustomDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeCustomDomains"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCustomDomainsResult> describeCustomDomainsAsync(DescribeCustomDomainsRequest describeCustomDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCustomDomainsRequest, DescribeCustomDomainsResult> asyncHandler);

    /**
     * <p>
     * Return a full description of an AWS App Runner service.
     * </p>
     * 
     * @param describeServiceRequest
     * @return A Java Future containing the result of the DescribeService operation returned by the service.
     * @sample AWSAppRunnerAsync.DescribeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceResult> describeServiceAsync(DescribeServiceRequest describeServiceRequest);

    /**
     * <p>
     * Return a full description of an AWS App Runner service.
     * </p>
     * 
     * @param describeServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeService operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.DescribeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DescribeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeServiceResult> describeServiceAsync(DescribeServiceRequest describeServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServiceRequest, DescribeServiceResult> asyncHandler);

    /**
     * <p>
     * Disassociate a custom domain name from an AWS App Runner service.
     * </p>
     * <p>
     * Certificates tracking domain validity are associated with a custom domain and are stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>. These certificates
     * aren't deleted as part of this action. App Runner delays certificate deletion for 30 days after a domain is
     * disassociated from your service.
     * </p>
     * 
     * @param disassociateCustomDomainRequest
     * @return A Java Future containing the result of the DisassociateCustomDomain operation returned by the service.
     * @sample AWSAppRunnerAsync.DisassociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DisassociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCustomDomainResult> disassociateCustomDomainAsync(DisassociateCustomDomainRequest disassociateCustomDomainRequest);

    /**
     * <p>
     * Disassociate a custom domain name from an AWS App Runner service.
     * </p>
     * <p>
     * Certificates tracking domain validity are associated with a custom domain and are stored in <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide">AWS Certificate Manager (ACM)</a>. These certificates
     * aren't deleted as part of this action. App Runner delays certificate deletion for 30 days after a domain is
     * disassociated from your service.
     * </p>
     * 
     * @param disassociateCustomDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateCustomDomain operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.DisassociateCustomDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/DisassociateCustomDomain"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateCustomDomainResult> disassociateCustomDomainAsync(DisassociateCustomDomainRequest disassociateCustomDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateCustomDomainRequest, DisassociateCustomDomainResult> asyncHandler);

    /**
     * <p>
     * Returns a list of AWS App Runner automatic scaling configurations in your AWS account. You can query the
     * revisions for a specific configuration name or the revisions for all configurations in your account. You can
     * optionally query only the latest revision of each requested name.
     * </p>
     * 
     * @param listAutoScalingConfigurationsRequest
     * @return A Java Future containing the result of the ListAutoScalingConfigurations operation returned by the
     *         service.
     * @sample AWSAppRunnerAsync.ListAutoScalingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListAutoScalingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAutoScalingConfigurationsResult> listAutoScalingConfigurationsAsync(
            ListAutoScalingConfigurationsRequest listAutoScalingConfigurationsRequest);

    /**
     * <p>
     * Returns a list of AWS App Runner automatic scaling configurations in your AWS account. You can query the
     * revisions for a specific configuration name or the revisions for all configurations in your account. You can
     * optionally query only the latest revision of each requested name.
     * </p>
     * 
     * @param listAutoScalingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAutoScalingConfigurations operation returned by the
     *         service.
     * @sample AWSAppRunnerAsyncHandler.ListAutoScalingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListAutoScalingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAutoScalingConfigurationsResult> listAutoScalingConfigurationsAsync(
            ListAutoScalingConfigurationsRequest listAutoScalingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAutoScalingConfigurationsRequest, ListAutoScalingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of AWS App Runner connections that are associated with your AWS account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @return A Java Future containing the result of the ListConnections operation returned by the service.
     * @sample AWSAppRunnerAsync.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest listConnectionsRequest);

    /**
     * <p>
     * Returns a list of AWS App Runner connections that are associated with your AWS account.
     * </p>
     * 
     * @param listConnectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConnections operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.ListConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListConnections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest listConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConnectionsRequest, ListConnectionsResult> asyncHandler);

    /**
     * <p>
     * Return a list of operations that occurred on an AWS App Runner service.
     * </p>
     * <p>
     * The resulting list of <a>OperationSummary</a> objects is sorted in reverse chronological order. The first object
     * on the list represents the last started operation.
     * </p>
     * 
     * @param listOperationsRequest
     * @return A Java Future containing the result of the ListOperations operation returned by the service.
     * @sample AWSAppRunnerAsync.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListOperations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest);

    /**
     * <p>
     * Return a list of operations that occurred on an AWS App Runner service.
     * </p>
     * <p>
     * The resulting list of <a>OperationSummary</a> objects is sorted in reverse chronological order. The first object
     * on the list represents the last started operation.
     * </p>
     * 
     * @param listOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOperations operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListOperations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of running AWS App Runner services in your AWS account.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSAppRunnerAsync.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Returns a list of running AWS App Runner services in your AWS account.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListServices" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * <p>
     * List tags that are associated with for an AWS App Runner resource. The response contains a list of tag key-value
     * pairs.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppRunnerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * List tags that are associated with for an AWS App Runner resource. The response contains a list of tag key-value
     * pairs.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Pause an active AWS App Runner service. App Runner reduces compute capacity for the service to zero and loses
     * state (for example, ephemeral storage is removed).
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param pauseServiceRequest
     * @return A Java Future containing the result of the PauseService operation returned by the service.
     * @sample AWSAppRunnerAsync.PauseService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/PauseService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PauseServiceResult> pauseServiceAsync(PauseServiceRequest pauseServiceRequest);

    /**
     * <p>
     * Pause an active AWS App Runner service. App Runner reduces compute capacity for the service to zero and loses
     * state (for example, ephemeral storage is removed).
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param pauseServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PauseService operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.PauseService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/PauseService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PauseServiceResult> pauseServiceAsync(PauseServiceRequest pauseServiceRequest,
            com.amazonaws.handlers.AsyncHandler<PauseServiceRequest, PauseServiceResult> asyncHandler);

    /**
     * <p>
     * Resume an active AWS App Runner service. App Runner provisions compute capacity for the service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param resumeServiceRequest
     * @return A Java Future containing the result of the ResumeService operation returned by the service.
     * @sample AWSAppRunnerAsync.ResumeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ResumeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResumeServiceResult> resumeServiceAsync(ResumeServiceRequest resumeServiceRequest);

    /**
     * <p>
     * Resume an active AWS App Runner service. App Runner provisions compute capacity for the service.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param resumeServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeService operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.ResumeService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/ResumeService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResumeServiceResult> resumeServiceAsync(ResumeServiceRequest resumeServiceRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeServiceRequest, ResumeServiceResult> asyncHandler);

    /**
     * <p>
     * Initiate a manual deployment of the latest commit in a source code repository or the latest image in a source
     * image repository to an AWS App Runner service.
     * </p>
     * <p>
     * For a source code repository, App Runner retrieves the commit and builds a Docker image. For a source image
     * repository, App Runner retrieves the latest Docker image. In both cases, App Runner then deploys the new image to
     * your service and starts a new container instance.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param startDeploymentRequest
     * @return A Java Future containing the result of the StartDeployment operation returned by the service.
     * @sample AWSAppRunnerAsync.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest startDeploymentRequest);

    /**
     * <p>
     * Initiate a manual deployment of the latest commit in a source code repository or the latest image in a source
     * image repository to an AWS App Runner service.
     * </p>
     * <p>
     * For a source code repository, App Runner retrieves the commit and builds a Docker image. For a source image
     * repository, App Runner retrieves the latest Docker image. In both cases, App Runner then deploys the new image to
     * your service and starts a new container instance.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param startDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartDeployment operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.StartDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/StartDeployment" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartDeploymentResult> startDeploymentAsync(StartDeploymentRequest startDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<StartDeploymentRequest, StartDeploymentResult> asyncHandler);

    /**
     * <p>
     * Add tags to, or update the tag values of, an App Runner resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppRunnerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Add tags to, or update the tag values of, an App Runner resource. A tag is a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove tags from an App Runner resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppRunnerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove tags from an App Runner resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Update an AWS App Runner service. You can update the source configuration and instance configuration of the
     * service. You can also update the ARN of the auto scaling configuration resource that's associated with the
     * service. However, you can't change the name or the encryption configuration of the service. These can be set only
     * when you create the service.
     * </p>
     * <p>
     * To update the tags applied to your service, use the separate actions <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param updateServiceRequest
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AWSAppRunnerAsync.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest);

    /**
     * <p>
     * Update an AWS App Runner service. You can update the source configuration and instance configuration of the
     * service. You can also update the ARN of the auto scaling configuration resource that's associated with the
     * service. However, you can't change the name or the encryption configuration of the service. These can be set only
     * when you create the service.
     * </p>
     * <p>
     * To update the tags applied to your service, use the separate actions <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * This is an asynchronous operation. On a successful call, you can use the returned <code>OperationId</code> and
     * the <a>ListOperations</a> call to track the operation's progress.
     * </p>
     * 
     * @param updateServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AWSAppRunnerAsyncHandler.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/apprunner-2020-05-15/UpdateService" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler);

}
