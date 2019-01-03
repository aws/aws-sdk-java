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
package com.amazonaws.services.servicediscovery;

import javax.annotation.Generated;

import com.amazonaws.services.servicediscovery.model.*;

/**
 * Interface for accessing ServiceDiscovery asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servicediscovery.AbstractAWSServiceDiscoveryAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces that your microservice applications run
 * in. When an instance of the service becomes available, you can call the AWS Cloud Map API to register the instance
 * with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud Map automatically creates DNS records and an
 * optional health check. Clients that submit public or private DNS queries, or HTTP requests, for the service receive
 * an answer that contains up to eight healthy records.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServiceDiscoveryAsync extends AWSServiceDiscovery {

    /**
     * <p>
     * Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a
     * <code>DiscoverInstances</code> request but can't be discovered using DNS.
     * </p>
     * <p>
     * For the current limit on the number of namespaces that you can create using the same AWS account, see <a
     * href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map Limits</a> in the
     * <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createHttpNamespaceRequest
     * @return A Java Future containing the result of the CreateHttpNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.CreateHttpNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateHttpNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHttpNamespaceResult> createHttpNamespaceAsync(CreateHttpNamespaceRequest createHttpNamespaceRequest);

    /**
     * <p>
     * Creates an HTTP namespace. Service instances that you register using an HTTP namespace can be discovered using a
     * <code>DiscoverInstances</code> request but can't be discovered using DNS.
     * </p>
     * <p>
     * For the current limit on the number of namespaces that you can create using the same AWS account, see <a
     * href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map Limits</a> in the
     * <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createHttpNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHttpNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.CreateHttpNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateHttpNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateHttpNamespaceResult> createHttpNamespaceAsync(CreateHttpNamespaceRequest createHttpNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHttpNamespaceRequest, CreateHttpNamespaceResult> asyncHandler);

    /**
     * <p>
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace
     * defines your service naming scheme. For example, if you name your namespace <code>example.com</code> and name
     * your service <code>backend</code>, the resulting DNS name for the service will be
     * <code>backend.example.com</code>. For the current limit on the number of namespaces that you can create using the
     * same AWS account, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud
     * Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPrivateDnsNamespaceRequest
     * @return A Java Future containing the result of the CreatePrivateDnsNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.CreatePrivateDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePrivateDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrivateDnsNamespaceResult> createPrivateDnsNamespaceAsync(
            CreatePrivateDnsNamespaceRequest createPrivateDnsNamespaceRequest);

    /**
     * <p>
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace
     * defines your service naming scheme. For example, if you name your namespace <code>example.com</code> and name
     * your service <code>backend</code>, the resulting DNS name for the service will be
     * <code>backend.example.com</code>. For the current limit on the number of namespaces that you can create using the
     * same AWS account, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud
     * Map Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPrivateDnsNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePrivateDnsNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.CreatePrivateDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePrivateDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePrivateDnsNamespaceResult> createPrivateDnsNamespaceAsync(
            CreatePrivateDnsNamespaceRequest createPrivateDnsNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePrivateDnsNamespaceRequest, CreatePrivateDnsNamespaceResult> asyncHandler);

    /**
     * <p>
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your
     * service naming scheme. For example, if you name your namespace <code>example.com</code> and name your service
     * <code>backend</code>, the resulting DNS name for the service will be <code>backend.example.com</code>. For the
     * current limit on the number of namespaces that you can create using the same AWS account, see <a
     * href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map Limits</a> in the
     * <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPublicDnsNamespaceRequest
     * @return A Java Future containing the result of the CreatePublicDnsNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.CreatePublicDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePublicDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublicDnsNamespaceResult> createPublicDnsNamespaceAsync(CreatePublicDnsNamespaceRequest createPublicDnsNamespaceRequest);

    /**
     * <p>
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your
     * service naming scheme. For example, if you name your namespace <code>example.com</code> and name your service
     * <code>backend</code>, the resulting DNS name for the service will be <code>backend.example.com</code>. For the
     * current limit on the number of namespaces that you can create using the same AWS account, see <a
     * href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map Limits</a> in the
     * <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createPublicDnsNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePublicDnsNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.CreatePublicDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePublicDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublicDnsNamespaceResult> createPublicDnsNamespaceAsync(CreatePublicDnsNamespaceRequest createPublicDnsNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePublicDnsNamespaceRequest, CreatePublicDnsNamespaceResult> asyncHandler);

    /**
     * <p>
     * Creates a service, which defines the configuration for the following entities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Optionally, a health check
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create the service, you can submit a <a>RegisterInstance</a> request, and AWS Cloud Map uses the values
     * in the configuration to create the specified entities.
     * </p>
     * <p>
     * For the current limit on the number of instances that you can register using the same namespace and using the
     * same service, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map
     * Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Creates a service, which defines the configuration for the following entities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For public and private DNS namespaces, one of the following combinations of DNS records in Amazon Route 53:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A
     * </p>
     * </li>
     * <li>
     * <p>
     * AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * A and AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * SRV
     * </p>
     * </li>
     * <li>
     * <p>
     * CNAME
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Optionally, a health check
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create the service, you can submit a <a>RegisterInstance</a> request, and AWS Cloud Map uses the values
     * in the configuration to create the specified entities.
     * </p>
     * <p>
     * For the current limit on the number of instances that you can register using the same namespace and using the
     * same service, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map
     * Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param createServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateService operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateServiceResult> createServiceAsync(CreateServiceRequest createServiceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateServiceRequest, CreateServiceResult> asyncHandler);

    /**
     * <p>
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request
     * fails.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request
     * fails.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNamespaceResult> deleteNamespaceAsync(DeleteNamespaceRequest deleteNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     * </p>
     * 
     * @param deleteServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteService operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteServiceResult> deleteServiceAsync(DeleteServiceRequest deleteServiceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServiceRequest, DeleteServiceResult> asyncHandler);

    /**
     * <p>
     * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified
     * instance.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return A Java Future containing the result of the DeregisterInstance operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.DeregisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeregisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest deregisterInstanceRequest);

    /**
     * <p>
     * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified
     * instance.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterInstance operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.DeregisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeregisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterInstanceResult> deregisterInstanceAsync(DeregisterInstanceRequest deregisterInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterInstanceRequest, DeregisterInstanceResult> asyncHandler);

    /**
     * <p>
     * Discovers registered instances for a specified namespace and service.
     * </p>
     * 
     * @param discoverInstancesRequest
     * @return A Java Future containing the result of the DiscoverInstances operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.DiscoverInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DiscoverInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DiscoverInstancesResult> discoverInstancesAsync(DiscoverInstancesRequest discoverInstancesRequest);

    /**
     * <p>
     * Discovers registered instances for a specified namespace and service.
     * </p>
     * 
     * @param discoverInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DiscoverInstances operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.DiscoverInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DiscoverInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DiscoverInstancesResult> discoverInstancesAsync(DiscoverInstancesRequest discoverInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DiscoverInstancesRequest, DiscoverInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified instance.
     * </p>
     * 
     * @param getInstanceRequest
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest);

    /**
     * <p>
     * Gets information about a specified instance.
     * </p>
     * 
     * @param getInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstance" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets the current health status (<code>Healthy</code>, <code>Unhealthy</code>, or <code>Unknown</code>) of one or
     * more instances that are associated with a specified service.
     * </p>
     * <note>
     * <p>
     * There is a brief delay between when you register an instance and when the health status for the instance is
     * available.
     * </p>
     * </note>
     * 
     * @param getInstancesHealthStatusRequest
     * @return A Java Future containing the result of the GetInstancesHealthStatus operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.GetInstancesHealthStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstancesHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstancesHealthStatusResult> getInstancesHealthStatusAsync(GetInstancesHealthStatusRequest getInstancesHealthStatusRequest);

    /**
     * <p>
     * Gets the current health status (<code>Healthy</code>, <code>Unhealthy</code>, or <code>Unknown</code>) of one or
     * more instances that are associated with a specified service.
     * </p>
     * <note>
     * <p>
     * There is a brief delay between when you register an instance and when the health status for the instance is
     * available.
     * </p>
     * </note>
     * 
     * @param getInstancesHealthStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstancesHealthStatus operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.GetInstancesHealthStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstancesHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInstancesHealthStatusResult> getInstancesHealthStatusAsync(GetInstancesHealthStatusRequest getInstancesHealthStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstancesHealthStatusRequest, GetInstancesHealthStatusResult> asyncHandler);

    /**
     * <p>
     * Gets information about a namespace.
     * </p>
     * 
     * @param getNamespaceRequest
     * @return A Java Future containing the result of the GetNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(GetNamespaceRequest getNamespaceRequest);

    /**
     * <p>
     * Gets information about a namespace.
     * </p>
     * 
     * @param getNamespaceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNamespace operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetNamespaceResult> getNamespaceAsync(GetNamespaceRequest getNamespaceRequest,
            com.amazonaws.handlers.AsyncHandler<GetNamespaceRequest, GetNamespaceResult> asyncHandler);

    /**
     * <p>
     * Gets information about any operation that returns an operation ID in the response, such as a
     * <code>CreateService</code> request.
     * </p>
     * <note>
     * <p>
     * To get a list of operations that match specified criteria, see <a>ListOperations</a>.
     * </p>
     * </note>
     * 
     * @param getOperationRequest
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Gets information about any operation that returns an operation ID in the response, such as a
     * <code>CreateService</code> request.
     * </p>
     * <note>
     * <p>
     * To get a list of operations that match specified criteria, see <a>ListOperations</a>.
     * </p>
     * </note>
     * 
     * @param getOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetOperation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler);

    /**
     * <p>
     * Gets the settings for a specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Gets the settings for a specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetService operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetServiceResult> getServiceAsync(GetServiceRequest getServiceRequest,
            com.amazonaws.handlers.AsyncHandler<GetServiceRequest, GetServiceResult> asyncHandler);

    /**
     * <p>
     * Lists summary information about the instances that you registered by using a specified service.
     * </p>
     * 
     * @param listInstancesRequest
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Lists summary information about the instances that you registered by using a specified service.
     * </p>
     * 
     * @param listInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstances operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListInstances" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(ListInstancesRequest listInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler);

    /**
     * <p>
     * Lists summary information about the namespaces that were created by the current AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return A Java Future containing the result of the ListNamespaces operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest listNamespacesRequest);

    /**
     * <p>
     * Lists summary information about the namespaces that were created by the current AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListNamespaces operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListNamespacesResult> listNamespacesAsync(ListNamespacesRequest listNamespacesRequest,
            com.amazonaws.handlers.AsyncHandler<ListNamespacesRequest, ListNamespacesResult> asyncHandler);

    /**
     * <p>
     * Lists operations that match the criteria that you specify.
     * </p>
     * 
     * @param listOperationsRequest
     * @return A Java Future containing the result of the ListOperations operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest);

    /**
     * <p>
     * Lists operations that match the criteria that you specify.
     * </p>
     * 
     * @param listOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOperations operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListOperations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOperationsResult> listOperationsAsync(ListOperationsRequest listOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOperationsRequest, ListOperationsResult> asyncHandler);

    /**
     * <p>
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     * </p>
     * 
     * @param listServicesRequest
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest);

    /**
     * <p>
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     * </p>
     * 
     * @param listServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServices operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListServices" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListServicesResult> listServicesAsync(ListServicesRequest listServicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServicesRequest, ListServicesResult> asyncHandler);

    /**
     * <p>
     * Creates or updates one or more records and, optionally, creates a health check based on the settings in a
     * specified service. When you submit a <code>RegisterInstance</code> request, the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each DNS record that you define in the service that is specified by <code>ServiceId</code>, a record is
     * created or updated in the hosted zone that is associated with the corresponding namespace.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, a health check is created based on the settings in the
     * health check configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The health check, if any, is associated with each of the new or updated records.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * One <code>RegisterInstance</code> request must complete before you can submit another request and specify the
     * same service ID and instance ID.
     * </p>
     * </important>
     * <p>
     * For more information, see <a>CreateService</a>.
     * </p>
     * <p>
     * When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If the health check is healthy</b>: returns all the records
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If the health check is unhealthy</b>: returns the applicable value for the last healthy instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you didn't specify a health check configuration</b>: returns all the records
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the current limit on the number of instances that you can register using the same namespace and using the
     * same service, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map
     * Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @return A Java Future containing the result of the RegisterInstance operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.RegisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/RegisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest registerInstanceRequest);

    /**
     * <p>
     * Creates or updates one or more records and, optionally, creates a health check based on the settings in a
     * specified service. When you submit a <code>RegisterInstance</code> request, the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For each DNS record that you define in the service that is specified by <code>ServiceId</code>, a record is
     * created or updated in the hosted zone that is associated with the corresponding namespace.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, a health check is created based on the settings in the
     * health check configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * The health check, if any, is associated with each of the new or updated records.
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * One <code>RegisterInstance</code> request must complete before you can submit another request and specify the
     * same service ID and instance ID.
     * </p>
     * </important>
     * <p>
     * For more information, see <a>CreateService</a>.
     * </p>
     * <p>
     * When AWS Cloud Map receives a DNS query for the specified DNS name, it returns the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If the health check is healthy</b>: returns all the records
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If the health check is unhealthy</b>: returns the applicable value for the last healthy instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you didn't specify a health check configuration</b>: returns all the records
     * </p>
     * </li>
     * </ul>
     * <p>
     * For the current limit on the number of instances that you can register using the same namespace and using the
     * same service, see <a href="http://docs.aws.amazon.com/cloud-map/latest/dg/cloud-map-limits.html">AWS Cloud Map
     * Limits</a> in the <i>AWS Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param registerInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterInstance operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.RegisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/RegisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RegisterInstanceResult> registerInstanceAsync(RegisterInstanceRequest registerInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterInstanceRequest, RegisterInstanceResult> asyncHandler);

    /**
     * <p>
     * Submits a request to change the health status of a custom health check to healthy or unhealthy.
     * </p>
     * <p>
     * You can use <code>UpdateInstanceCustomHealthStatus</code> to change the status only for custom health checks,
     * which you define using <code>HealthCheckCustomConfig</code> when you create a service. You can't use it to change
     * the status for Route 53 health checks, which you define using <code>HealthCheckConfig</code>.
     * </p>
     * <p>
     * For more information, see <a>HealthCheckCustomConfig</a>.
     * </p>
     * 
     * @param updateInstanceCustomHealthStatusRequest
     * @return A Java Future containing the result of the UpdateInstanceCustomHealthStatus operation returned by the
     *         service.
     * @sample AWSServiceDiscoveryAsync.UpdateInstanceCustomHealthStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateInstanceCustomHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceCustomHealthStatusResult> updateInstanceCustomHealthStatusAsync(
            UpdateInstanceCustomHealthStatusRequest updateInstanceCustomHealthStatusRequest);

    /**
     * <p>
     * Submits a request to change the health status of a custom health check to healthy or unhealthy.
     * </p>
     * <p>
     * You can use <code>UpdateInstanceCustomHealthStatus</code> to change the status only for custom health checks,
     * which you define using <code>HealthCheckCustomConfig</code> when you create a service. You can't use it to change
     * the status for Route 53 health checks, which you define using <code>HealthCheckConfig</code>.
     * </p>
     * <p>
     * For more information, see <a>HealthCheckCustomConfig</a>.
     * </p>
     * 
     * @param updateInstanceCustomHealthStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInstanceCustomHealthStatus operation returned by the
     *         service.
     * @sample AWSServiceDiscoveryAsyncHandler.UpdateInstanceCustomHealthStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateInstanceCustomHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateInstanceCustomHealthStatusResult> updateInstanceCustomHealthStatusAsync(
            UpdateInstanceCustomHealthStatusRequest updateInstanceCustomHealthStatusRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInstanceCustomHealthStatusRequest, UpdateInstanceCustomHealthStatusResult> asyncHandler);

    /**
     * <p>
     * Submits a request to perform the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add or delete <code>DnsRecords</code> configurations
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the TTL setting for existing <code>DnsRecords</code> configurations
     * </p>
     * </li>
     * <li>
     * <p>
     * Add, update, or delete <code>HealthCheckConfig</code> for a specified service
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public and private DNS namespaces, you must specify all <code>DnsRecords</code> configurations (and,
     * optionally, <code>HealthCheckConfig</code>) that you want to appear in the updated service. Any current
     * configurations that don't appear in an <code>UpdateService</code> request are deleted.
     * </p>
     * <p>
     * When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the
     * records and health checks that were created by using the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AWSServiceDiscoveryAsync.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest);

    /**
     * <p>
     * Submits a request to perform the following operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Add or delete <code>DnsRecords</code> configurations
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the TTL setting for existing <code>DnsRecords</code> configurations
     * </p>
     * </li>
     * <li>
     * <p>
     * Add, update, or delete <code>HealthCheckConfig</code> for a specified service
     * </p>
     * </li>
     * </ul>
     * <p>
     * For public and private DNS namespaces, you must specify all <code>DnsRecords</code> configurations (and,
     * optionally, <code>HealthCheckConfig</code>) that you want to appear in the updated service. Any current
     * configurations that don't appear in an <code>UpdateService</code> request are deleted.
     * </p>
     * <p>
     * When you update the TTL setting for a service, AWS Cloud Map also updates the corresponding settings in all the
     * records and health checks that were created by using the specified service.
     * </p>
     * 
     * @param updateServiceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateService operation returned by the service.
     * @sample AWSServiceDiscoveryAsyncHandler.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateService" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateServiceResult> updateServiceAsync(UpdateServiceRequest updateServiceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServiceRequest, UpdateServiceResult> asyncHandler);

}
