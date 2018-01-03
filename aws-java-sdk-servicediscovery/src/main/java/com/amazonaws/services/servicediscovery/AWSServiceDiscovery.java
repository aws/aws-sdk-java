/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.servicediscovery.model.*;

/**
 * Interface for accessing ServiceDiscovery.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.servicediscovery.AbstractAWSServiceDiscovery} instead.
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
public interface AWSServiceDiscovery {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "servicediscovery";

    /**
     * <p>
     * Creates a private namespace based on DNS, which will be visible only inside a specified Amazon VPC. The namespace
     * defines your service naming scheme. For example, if you name your namespace <code>example.com</code> and name
     * your service <code>backend</code>, the resulting DNS name for the service will be
     * <code>backend.example.com</code>. You can associate more than one service with the same namespace.
     * </p>
     * 
     * @param createPrivateDnsNamespaceRequest
     * @return Result of the CreatePrivateDnsNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         This request tried to create an object that already exists.
     * @sample AWSServiceDiscovery.CreatePrivateDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePrivateDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePrivateDnsNamespaceResult createPrivateDnsNamespace(CreatePrivateDnsNamespaceRequest createPrivateDnsNamespaceRequest);

    /**
     * <p>
     * Creates a public namespace based on DNS, which will be visible on the internet. The namespace defines your
     * service naming scheme. For example, if you name your namespace <code>example.com</code> and name your service
     * <code>backend</code>, the resulting DNS name for the service will be <code>backend.example.com</code>. You can
     * associate more than one service with the same namespace.
     * </p>
     * 
     * @param createPublicDnsNamespaceRequest
     * @return Result of the CreatePublicDnsNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         This request tried to create an object that already exists.
     * @sample AWSServiceDiscovery.CreatePublicDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePublicDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePublicDnsNamespaceResult createPublicDnsNamespace(CreatePublicDnsNamespaceRequest createPublicDnsNamespaceRequest);

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
     * @return Result of the CreateService operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @throws ServiceAlreadyExistsException
     *         The service can't be created because a service with the same name already exists.
     * @sample AWSServiceDiscovery.CreateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateService" target="_top">AWS
     *      API Documentation</a>
     */
    CreateServiceResult createService(CreateServiceRequest createServiceRequest);

    /**
     * <p>
     * Deletes a namespace from the current account. If the namespace still contains one or more services, the request
     * fails.
     * </p>
     * 
     * @param deleteNamespaceRequest
     * @return Result of the DeleteNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @throws DuplicateRequestException
     *         This request tried to create an object that already exists.
     * @sample AWSServiceDiscovery.DeleteNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteNamespaceResult deleteNamespace(DeleteNamespaceRequest deleteNamespaceRequest);

    /**
     * <p>
     * Deletes a specified service. If the service still contains one or more registered instances, the request fails.
     * </p>
     * 
     * @param deleteServiceRequest
     * @return Result of the DeleteService operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @sample AWSServiceDiscovery.DeleteService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeleteService" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteServiceResult deleteService(DeleteServiceRequest deleteServiceRequest);

    /**
     * <p>
     * Deletes the resource record sets and the health check, if any, that Amazon Route 53 created for the specified
     * instance.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return Result of the DeregisterInstance operation returned by the service.
     * @throws DuplicateRequestException
     *         This request tried to create an object that already exists.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.DeregisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DeregisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterInstanceResult deregisterInstance(DeregisterInstanceRequest deregisterInstanceRequest);

    /**
     * <p>
     * Gets information about a specified instance.
     * </p>
     * 
     * @param getInstanceRequest
     * @return Result of the GetInstance operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.GetInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstance" target="_top">AWS
     *      API Documentation</a>
     */
    GetInstanceResult getInstance(GetInstanceRequest getInstanceRequest);

    /**
     * <p>
     * Gets the current health status (<code>Healthy</code>, <code>Unhealthy</code>, or <code>Unknown</code>) of one or
     * more instances that are associated with a specified service.
     * </p>
     * 
     * @param getInstancesHealthStatusRequest
     * @return Result of the GetInstancesHealthStatus operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.GetInstancesHealthStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetInstancesHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetInstancesHealthStatusResult getInstancesHealthStatus(GetInstancesHealthStatusRequest getInstancesHealthStatusRequest);

    /**
     * <p>
     * Gets information about a namespace.
     * </p>
     * 
     * @param getNamespaceRequest
     * @return Result of the GetNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @sample AWSServiceDiscovery.GetNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetNamespace" target="_top">AWS
     *      API Documentation</a>
     */
    GetNamespaceResult getNamespace(GetNamespaceRequest getNamespaceRequest);

    /**
     * <p>
     * Gets information about any operation that returns an operation ID in the response, such as a
     * <code>CreateService</code> request. To get a list of operations that match specified criteria, see
     * <a>ListOperations</a>.
     * </p>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws OperationNotFoundException
     *         No operation exists with the specified ID.
     * @sample AWSServiceDiscovery.GetOperation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetOperation" target="_top">AWS
     *      API Documentation</a>
     */
    GetOperationResult getOperation(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Gets the settings for a specified service.
     * </p>
     * 
     * @param getServiceRequest
     * @return Result of the GetService operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    GetServiceResult getService(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Gets summary information about the instances that you created by using a specified service.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @sample AWSServiceDiscovery.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Gets information about the namespaces that were created by the current AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return Result of the ListNamespaces operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @sample AWSServiceDiscovery.ListNamespaces
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListNamespaces"
     *      target="_top">AWS API Documentation</a>
     */
    ListNamespacesResult listNamespaces(ListNamespacesRequest listNamespacesRequest);

    /**
     * <p>
     * Lists operations that match the criteria that you specify.
     * </p>
     * 
     * @param listOperationsRequest
     * @return Result of the ListOperations operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @sample AWSServiceDiscovery.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListOperations"
     *      target="_top">AWS API Documentation</a>
     */
    ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest);

    /**
     * <p>
     * Gets settings for all the services that are associated with one or more specified namespaces.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @sample AWSServiceDiscovery.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListServices" target="_top">AWS
     *      API Documentation</a>
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

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
     * @return Result of the RegisterInstance operation returned by the service.
     * @throws DuplicateRequestException
     *         This request tried to create an object that already exists.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.RegisterInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/RegisterInstance"
     *      target="_top">AWS API Documentation</a>
     */
    RegisterInstanceResult registerInstance(RegisterInstanceRequest registerInstanceRequest);

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
     * @return Result of the UpdateService operation returned by the service.
     * @throws DuplicateRequestException
     *         This request tried to create an object that already exists.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, when you're creating a namespace, the value of
     *         <code>Name</code> might not be a valid DNS name.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.UpdateService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateService" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateServiceResult updateService(UpdateServiceRequest updateServiceRequest);

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
