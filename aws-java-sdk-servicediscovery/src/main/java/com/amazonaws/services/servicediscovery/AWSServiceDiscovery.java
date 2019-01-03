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
 * AWS Cloud Map lets you configure public DNS, private DNS, or HTTP namespaces that your microservice applications run
 * in. When an instance of the service becomes available, you can call the AWS Cloud Map API to register the instance
 * with AWS Cloud Map. For public or private DNS namespaces, AWS Cloud Map automatically creates DNS records and an
 * optional health check. Clients that submit public or private DNS queries, or HTTP requests, for the service receive
 * an answer that contains up to eight healthy records.
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
     * @return Result of the CreateHttpNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @sample AWSServiceDiscovery.CreateHttpNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateHttpNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    CreateHttpNamespaceResult createHttpNamespace(CreateHttpNamespaceRequest createHttpNamespaceRequest);

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
     * @return Result of the CreatePrivateDnsNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @sample AWSServiceDiscovery.CreatePrivateDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePrivateDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePrivateDnsNamespaceResult createPrivateDnsNamespace(CreatePrivateDnsNamespaceRequest createPrivateDnsNamespaceRequest);

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
     * @return Result of the CreatePublicDnsNamespace operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceAlreadyExistsException
     *         The namespace that you're trying to create already exists.
     * @throws ResourceLimitExceededException
     *         The resource can't be created because you've reached the limit on the number of resources.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @sample AWSServiceDiscovery.CreatePublicDnsNamespace
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreatePublicDnsNamespace"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePublicDnsNamespaceResult createPublicDnsNamespace(CreatePublicDnsNamespaceRequest createPublicDnsNamespaceRequest);

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
     * @return Result of the CreateService operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @throws ResourceInUseException
     *         The specified resource can't be deleted because it contains other resources. For example, you can't
     *         delete a service that contains any instances.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
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
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     * Deletes the Amazon Route 53 DNS records and health check, if any, that AWS Cloud Map created for the specified
     * instance.
     * </p>
     * 
     * @param deregisterInstanceRequest
     * @return Result of the DeregisterInstance operation returned by the service.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
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
     * Discovers registered instances for a specified namespace and service.
     * </p>
     * 
     * @param discoverInstancesRequest
     * @return Result of the DiscoverInstances operation returned by the service.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws NamespaceNotFoundException
     *         No namespace exists with the specified ID.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.DiscoverInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DiscoverInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DiscoverInstancesResult discoverInstances(DiscoverInstancesRequest discoverInstancesRequest);

    /**
     * <p>
     * Gets information about a specified instance.
     * </p>
     * 
     * @param getInstanceRequest
     * @return Result of the GetInstance operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     * <note>
     * <p>
     * There is a brief delay between when you register an instance and when the health status for the instance is
     * available.
     * </p>
     * </note>
     * 
     * @param getInstancesHealthStatusRequest
     * @return Result of the GetInstancesHealthStatus operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     * <code>CreateService</code> request.
     * </p>
     * <note>
     * <p>
     * To get a list of operations that match specified criteria, see <a>ListOperations</a>.
     * </p>
     * </note>
     * 
     * @param getOperationRequest
     * @return Result of the GetOperation operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @sample AWSServiceDiscovery.GetService
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/GetService" target="_top">AWS
     *      API Documentation</a>
     */
    GetServiceResult getService(GetServiceRequest getServiceRequest);

    /**
     * <p>
     * Lists summary information about the instances that you registered by using a specified service.
     * </p>
     * 
     * @param listInstancesRequest
     * @return Result of the ListInstances operation returned by the service.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.ListInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListInstances" target="_top">AWS
     *      API Documentation</a>
     */
    ListInstancesResult listInstances(ListInstancesRequest listInstancesRequest);

    /**
     * <p>
     * Lists summary information about the namespaces that were created by the current AWS account.
     * </p>
     * 
     * @param listNamespacesRequest
     * @return Result of the ListNamespaces operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.ListOperations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListOperations"
     *      target="_top">AWS API Documentation</a>
     */
    ListOperationsResult listOperations(ListOperationsRequest listOperationsRequest);

    /**
     * <p>
     * Lists summary information for all the services that are associated with one or more specified namespaces.
     * </p>
     * 
     * @param listServicesRequest
     * @return Result of the ListServices operation returned by the service.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.ListServices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListServices" target="_top">AWS
     *      API Documentation</a>
     */
    ListServicesResult listServices(ListServicesRequest listServicesRequest);

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
     * @return Result of the RegisterInstance operation returned by the service.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
     * @return Result of the UpdateInstanceCustomHealthStatus operation returned by the service.
     * @throws InstanceNotFoundException
     *         No instance exists with the specified ID, or the instance was recently registered, and information about
     *         the instance hasn't propagated yet.
     * @throws ServiceNotFoundException
     *         No service exists with the specified ID.
     * @throws CustomHealthNotFoundException
     *         The health check for the instance that is specified by <code>ServiceId</code> and <code>InstanceId</code>
     *         is not a custom health check.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
     * @sample AWSServiceDiscovery.UpdateInstanceCustomHealthStatus
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateInstanceCustomHealthStatus"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateInstanceCustomHealthStatusResult updateInstanceCustomHealthStatus(UpdateInstanceCustomHealthStatusRequest updateInstanceCustomHealthStatusRequest);

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
     * @return Result of the UpdateService operation returned by the service.
     * @throws DuplicateRequestException
     *         The operation is already in progress.
     * @throws InvalidInputException
     *         One or more specified values aren't valid. For example, a required value might be missing, a numeric
     *         value might be outside the allowed range, or a string value might exceed length constraints.
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
