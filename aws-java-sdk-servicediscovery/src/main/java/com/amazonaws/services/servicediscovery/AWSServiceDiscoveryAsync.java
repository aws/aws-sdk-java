/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon Route 53 autonaming lets you configure public or private namespaces that your microservice applications run
 * in. When instances of the service become available, you can call the autonaming API to register the instance, and
 * Amazon Route 53 automatically creates up to five DNS records and an optional health check. Clients that submit DNS
 * queries for the service receive an answer that contains up to eight healthy records.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSServiceDiscoveryAsync extends AWSServiceDiscovery {

    /**
     * <p>
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace
     * defines your service naming scheme. For example, if you name your namespace <code>example.com</code> and name
     * your service <code>backend</code>, the resulting DNS name for the service will be
     * <code>backend.example.com</code>. You can associate more than one service with the same namespace.
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
     * <code>backend.example.com</code>. You can associate more than one service with the same namespace.
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
     * <code>backend</code>, the resulting DNS name for the service will be <code>backend.example.com</code>. You can
     * associate more than one service with the same namespace.
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
     * <code>backend</code>, the resulting DNS name for the service will be <code>backend.example.com</code>. You can
     * associate more than one service with the same namespace.
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
     * Creates a service, which defines a template for the following entities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One to five resource record sets
     * </p>
     * </li>
     * <li>
     * <p>
     * Optionally, a health check
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create the service, you can submit a <a>RegisterInstance</a> request, and Amazon Route 53 uses the
     * values in the template to create the specified entities.
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
     * Creates a service, which defines a template for the following entities:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One to five resource record sets
     * </p>
     * </li>
     * <li>
     * <p>
     * Optionally, a health check
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you create the service, you can submit a <a>RegisterInstance</a> request, and Amazon Route 53 uses the
     * values in the template to create the specified entities.
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
     * Deletes the resource record sets and the health check, if any, that Amazon Route 53 created for the specified
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
     * Deletes the resource record sets and the health check, if any, that Amazon Route 53 created for the specified
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
     * <code>CreateService</code> request. To get a list of operations that match specified criteria, see
     * <a>ListOperations</a>.
     * </p>
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
     * <code>CreateService</code> request. To get a list of operations that match specified criteria, see
     * <a>ListOperations</a>.
     * </p>
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
     * Gets summary information about the instances that you created by using a specified service.
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
     * Gets summary information about the instances that you created by using a specified service.
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
     * Gets information about the namespaces that were created by the current AWS account.
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
     * Gets information about the namespaces that were created by the current AWS account.
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
     * Gets settings for all the services that are associated with one or more specified namespaces.
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
     * Gets settings for all the services that are associated with one or more specified namespaces.
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
     * Creates one or more resource record sets and optionally a health check based on the settings in a specified
     * service. When you submit a <code>RegisterInstance</code> request, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a resource record set for each resource record set template in the service
     * </p>
     * </li>
     * <li>
     * <p>
     * Creates a health check based on the settings in the health check template in the service, if any
     * </p>
     * </li>
     * <li>
     * <p>
     * Associates the health check, if any, with each of the resource record sets
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * One <code>RegisterInstance</code> request must complete before you can submit another request and specify the
     * same service and instance ID.
     * </p>
     * </important>
     * <p>
     * For more information, see <a>CreateService</a>.
     * </p>
     * <p>
     * When Amazon Route 53 receives a DNS query for the specified DNS name, it returns the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If the health check is healthy</b>: returns all the resource record sets
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If the health check is unhealthy</b>: returns the IP address of the last healthy instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you didn't specify a health check template</b>: returns all the resource record sets
     * </p>
     * </li>
     * </ul>
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
     * Creates one or more resource record sets and optionally a health check based on the settings in a specified
     * service. When you submit a <code>RegisterInstance</code> request, Amazon Route 53 does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a resource record set for each resource record set template in the service
     * </p>
     * </li>
     * <li>
     * <p>
     * Creates a health check based on the settings in the health check template in the service, if any
     * </p>
     * </li>
     * <li>
     * <p>
     * Associates the health check, if any, with each of the resource record sets
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * One <code>RegisterInstance</code> request must complete before you can submit another request and specify the
     * same service and instance ID.
     * </p>
     * </important>
     * <p>
     * For more information, see <a>CreateService</a>.
     * </p>
     * <p>
     * When Amazon Route 53 receives a DNS query for the specified DNS name, it returns the applicable value:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>If the health check is healthy</b>: returns all the resource record sets
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If the health check is unhealthy</b>: returns the IP address of the last healthy instance
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>If you didn't specify a health check template</b>: returns all the resource record sets
     * </p>
     * </li>
     * </ul>
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
     * Updates the TTL setting for a specified service. You must specify all the resource record set templates (and,
     * optionally, a health check template) that you want to appear in the updated service. Any current resource record
     * set templates (or health check template) that don't appear in an <code>UpdateService</code> request are deleted.
     * </p>
     * <p>
     * When you update the TTL setting for a service, Amazon Route 53 also updates the corresponding settings in all the
     * resource record sets and health checks that were created by using the specified service.
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
     * Updates the TTL setting for a specified service. You must specify all the resource record set templates (and,
     * optionally, a health check template) that you want to appear in the updated service. Any current resource record
     * set templates (or health check template) that don't appear in an <code>UpdateService</code> request are deleted.
     * </p>
     * <p>
     * When you update the TTL setting for a service, Amazon Route 53 also updates the corresponding settings in all the
     * resource record sets and health checks that were created by using the specified service.
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
