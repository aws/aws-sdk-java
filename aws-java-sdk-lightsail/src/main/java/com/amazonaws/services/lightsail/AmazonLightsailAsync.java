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
package com.amazonaws.services.lightsail;

import com.amazonaws.services.lightsail.model.*;

/**
 * Interface for accessing Amazon Lightsail asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lightsail.AbstractAmazonLightsailAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
 * Lightsail includes everything you need to launch your project quickly - a virtual machine, SSD-based storage, data
 * transfer, DNS management, and a static IP - for a low, predictable price. You manage those Lightsail servers through
 * the Lightsail console or by using the API or command-line interface (CLI).
 * </p>
 * <p>
 * For more information about Lightsail concepts and tasks, see the <a
 * href="http://lightsail.aws.amazon.com/ls/docs">Lightsail Dev Guide</a>.
 * </p>
 * <p>
 * To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
 * keys. For details about how to set this up, see the <a href=
 * "http://lightsail.aws.amazon.com/ls/docs/how-to/articles/lightsail-how-to-set-up-access-keys-to-use-sdk-api-cli"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public interface AmazonLightsailAsync extends AmazonLightsail {

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @return A Java Future containing the result of the AllocateStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.AllocateStaticIp
     */
    java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest allocateStaticIpRequest);

    /**
     * <p>
     * Allocates a static IP address.
     * </p>
     * 
     * @param allocateStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AllocateStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AllocateStaticIp
     */
    java.util.concurrent.Future<AllocateStaticIpResult> allocateStaticIpAsync(AllocateStaticIpRequest allocateStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AllocateStaticIpRequest, AllocateStaticIpResult> asyncHandler);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @return A Java Future containing the result of the AttachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.AttachStaticIp
     */
    java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest attachStaticIpRequest);

    /**
     * <p>
     * Attaches a static IP address to a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param attachStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AttachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.AttachStaticIp
     */
    java.util.concurrent.Future<AttachStaticIpResult> attachStaticIpAsync(AttachStaticIpRequest attachStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<AttachStaticIpRequest, AttachStaticIpResult> asyncHandler);

    /**
     * <p>
     * Closes the public ports on a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @return A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.CloseInstancePublicPorts
     */
    java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest);

    /**
     * <p>
     * Closes the public ports on a specific Amazon Lightsail instance.
     * </p>
     * 
     * @param closeInstancePublicPortsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CloseInstancePublicPorts
     */
    java.util.concurrent.Future<CloseInstancePublicPortsResult> closeInstancePublicPortsAsync(CloseInstancePublicPortsRequest closeInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<CloseInstancePublicPortsRequest, CloseInstancePublicPortsResult> asyncHandler);

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * 
     * @param createDomainRequest
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest);

    /**
     * <p>
     * Creates a domain resource for the specified domain (e.g., example.com).
     * </p>
     * 
     * @param createDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDomain
     */
    java.util.concurrent.Future<CreateDomainResult> createDomainAsync(CreateDomainRequest createDomainRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainRequest, CreateDomainResult> asyncHandler);

    /**
     * <p>
     * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX
     * record.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @return A Java Future containing the result of the CreateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.CreateDomainEntry
     */
    java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest createDomainEntryRequest);

    /**
     * <p>
     * Creates one of the following entry records associated with the domain: A record, CNAME record, TXT record, or MX
     * record.
     * </p>
     * 
     * @param createDomainEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateDomainEntry
     */
    java.util.concurrent.Future<CreateDomainEntryResult> createDomainEntryAsync(CreateDomainEntryRequest createDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDomainEntryRequest, CreateDomainEntryResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @return A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstanceSnapshot
     */
    java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest createInstanceSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of a specific virtual private server, or <i>instance</i>. You can use a snapshot to create a
     * new instance that is based on that snapshot.
     * </p>
     * 
     * @param createInstanceSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstanceSnapshot
     */
    java.util.concurrent.Future<CreateInstanceSnapshotResult> createInstanceSnapshotAsync(CreateInstanceSnapshotRequest createInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceSnapshotRequest, CreateInstanceSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param createInstancesRequest
     * @return A Java Future containing the result of the CreateInstances operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstances
     */
    java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest createInstancesRequest);

    /**
     * <p>
     * Creates one or more Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param createInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstances operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstances
     */
    java.util.concurrent.Future<CreateInstancesResult> createInstancesAsync(CreateInstancesRequest createInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesRequest, CreateInstancesResult> asyncHandler);

    /**
     * <p>
     * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
     * configuration.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @return A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.CreateInstancesFromSnapshot
     */
    java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest);

    /**
     * <p>
     * Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
     * configuration.
     * </p>
     * 
     * @param createInstancesFromSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateInstancesFromSnapshot
     */
    java.util.concurrent.Future<CreateInstancesFromSnapshotResult> createInstancesFromSnapshotAsync(
            CreateInstancesFromSnapshotRequest createInstancesFromSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstancesFromSnapshotRequest, CreateInstancesFromSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates sn SSH key pair.
     * </p>
     * 
     * @param createKeyPairRequest
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.CreateKeyPair
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest);

    /**
     * <p>
     * Creates sn SSH key pair.
     * </p>
     * 
     * @param createKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.CreateKeyPair
     */
    java.util.concurrent.Future<CreateKeyPairResult> createKeyPairAsync(CreateKeyPairRequest createKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<CreateKeyPairRequest, CreateKeyPairResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * 
     * @param deleteDomainRequest
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest);

    /**
     * <p>
     * Deletes the specified domain recordset and all of its domain records.
     * </p>
     * 
     * @param deleteDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDomain
     */
    java.util.concurrent.Future<DeleteDomainResult> deleteDomainAsync(DeleteDomainRequest deleteDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainRequest, DeleteDomainResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @return A Java Future containing the result of the DeleteDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteDomainEntry
     */
    java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest deleteDomainEntryRequest);

    /**
     * <p>
     * Deletes a specific domain entry.
     * </p>
     * 
     * @param deleteDomainEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteDomainEntry
     */
    java.util.concurrent.Future<DeleteDomainEntryResult> deleteDomainEntryAsync(DeleteDomainEntryRequest deleteDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDomainEntryRequest, DeleteDomainEntryResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific Amazon Lightsail virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteInstance
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest);

    /**
     * <p>
     * Deletes a specific Amazon Lightsail virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param deleteInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteInstance
     */
    java.util.concurrent.Future<DeleteInstanceResult> deleteInstanceAsync(DeleteInstanceRequest deleteInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceRequest, DeleteInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @return A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteInstanceSnapshot
     */
    java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest);

    /**
     * <p>
     * Deletes a specific snapshot of a virtual private server (or <i>instance</i>).
     * </p>
     * 
     * @param deleteInstanceSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteInstanceSnapshot
     */
    java.util.concurrent.Future<DeleteInstanceSnapshotResult> deleteInstanceSnapshotAsync(DeleteInstanceSnapshotRequest deleteInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceSnapshotRequest, DeleteInstanceSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.DeleteKeyPair
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest);

    /**
     * <p>
     * Deletes a specific SSH key pair.
     * </p>
     * 
     * @param deleteKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DeleteKeyPair
     */
    java.util.concurrent.Future<DeleteKeyPairResult> deleteKeyPairAsync(DeleteKeyPairRequest deleteKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteKeyPairRequest, DeleteKeyPairResult> asyncHandler);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @return A Java Future containing the result of the DetachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.DetachStaticIp
     */
    java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest detachStaticIpRequest);

    /**
     * <p>
     * Detaches a static IP from the Amazon Lightsail instance to which it is attached.
     * </p>
     * 
     * @param detachStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DetachStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DetachStaticIp
     */
    java.util.concurrent.Future<DetachStaticIpResult> detachStaticIpAsync(DetachStaticIpRequest detachStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<DetachStaticIpRequest, DetachStaticIpResult> asyncHandler);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @return A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.DownloadDefaultKeyPair
     */
    java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest);

    /**
     * <p>
     * Downloads the default SSH key pair from the user's account.
     * </p>
     * 
     * @param downloadDefaultKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.DownloadDefaultKeyPair
     */
    java.util.concurrent.Future<DownloadDefaultKeyPairResult> downloadDefaultKeyPairAsync(DownloadDefaultKeyPairRequest downloadDefaultKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<DownloadDefaultKeyPairRequest, DownloadDefaultKeyPairResult> asyncHandler);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @return A Java Future containing the result of the GetActiveNames operation returned by the service.
     * @sample AmazonLightsailAsync.GetActiveNames
     */
    java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest getActiveNamesRequest);

    /**
     * <p>
     * Returns the names of all active (not deleted) resources.
     * </p>
     * 
     * @param getActiveNamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetActiveNames operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetActiveNames
     */
    java.util.concurrent.Future<GetActiveNamesResult> getActiveNamesAsync(GetActiveNamesRequest getActiveNamesRequest,
            com.amazonaws.handlers.AsyncHandler<GetActiveNamesRequest, GetActiveNamesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * virtual private server already running a specific operating system, as well as a preinstalled app or development
     * stack. The software each instance is running depends on the blueprint image you choose.
     * </p>
     * 
     * @param getBlueprintsRequest
     * @return A Java Future containing the result of the GetBlueprints operation returned by the service.
     * @sample AmazonLightsailAsync.GetBlueprints
     */
    java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest getBlueprintsRequest);

    /**
     * <p>
     * Returns the list of available instance images, or <i>blueprints</i>. You can use a blueprint to create a new
     * virtual private server already running a specific operating system, as well as a preinstalled app or development
     * stack. The software each instance is running depends on the blueprint image you choose.
     * </p>
     * 
     * @param getBlueprintsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBlueprints operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBlueprints
     */
    java.util.concurrent.Future<GetBlueprintsResult> getBlueprintsAsync(GetBlueprintsRequest getBlueprintsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBlueprintsRequest, GetBlueprintsResult> asyncHandler);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @return A Java Future containing the result of the GetBundles operation returned by the service.
     * @sample AmazonLightsailAsync.GetBundles
     */
    java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest getBundlesRequest);

    /**
     * <p>
     * Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
     * private server (or <i>instance</i>).
     * </p>
     * 
     * @param getBundlesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBundles operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetBundles
     */
    java.util.concurrent.Future<GetBundlesResult> getBundlesAsync(GetBundlesRequest getBundlesRequest,
            com.amazonaws.handlers.AsyncHandler<GetBundlesRequest, GetBundlesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonLightsailAsync.GetDomain
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest);

    /**
     * <p>
     * Returns information about a specific domain recordset.
     * </p>
     * 
     * @param getDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomain operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDomain
     */
    java.util.concurrent.Future<GetDomainResult> getDomainAsync(GetDomainRequest getDomainRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainRequest, GetDomainResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @return A Java Future containing the result of the GetDomains operation returned by the service.
     * @sample AmazonLightsailAsync.GetDomains
     */
    java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest getDomainsRequest);

    /**
     * <p>
     * Returns a list of all domains in the user's account.
     * </p>
     * 
     * @param getDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDomains operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetDomains
     */
    java.util.concurrent.Future<GetDomainsResult> getDomainsAsync(GetDomainsRequest getDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<GetDomainsRequest, GetDomainsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstance
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest);

    /**
     * <p>
     * Returns information about a specific Amazon Lightsail instance, which is a virtual private server.
     * </p>
     * 
     * @param getInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstance
     */
    java.util.concurrent.Future<GetInstanceResult> getInstanceAsync(GetInstanceRequest getInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceRequest, GetInstanceResult> asyncHandler);

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @return A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceAccessDetails
     */
    java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest);

    /**
     * <p>
     * Returns temporary SSH keys you can use to connect to a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstanceAccessDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceAccessDetails
     */
    java.util.concurrent.Future<GetInstanceAccessDetailsResult> getInstanceAccessDetailsAsync(GetInstanceAccessDetailsRequest getInstanceAccessDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceAccessDetailsRequest, GetInstanceAccessDetailsResult> asyncHandler);

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @return A Java Future containing the result of the GetInstanceMetricData operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceMetricData
     */
    java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest getInstanceMetricDataRequest);

    /**
     * <p>
     * Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.
     * </p>
     * 
     * @param getInstanceMetricDataRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceMetricData operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceMetricData
     */
    java.util.concurrent.Future<GetInstanceMetricDataResult> getInstanceMetricDataAsync(GetInstanceMetricDataRequest getInstanceMetricDataRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceMetricDataRequest, GetInstanceMetricDataResult> asyncHandler);

    /**
     * <p>
     * Returns the port states for a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @return A Java Future containing the result of the GetInstancePortStates operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstancePortStates
     */
    java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest getInstancePortStatesRequest);

    /**
     * <p>
     * Returns the port states for a specific virtual private server, or <i>instance</i>.
     * </p>
     * 
     * @param getInstancePortStatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstancePortStates operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstancePortStates
     */
    java.util.concurrent.Future<GetInstancePortStatesResult> getInstancePortStatesAsync(GetInstancePortStatesRequest getInstancePortStatesRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstancePortStatesRequest, GetInstancePortStatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @return A Java Future containing the result of the GetInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceSnapshot
     */
    java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest getInstanceSnapshotRequest);

    /**
     * <p>
     * Returns information about a specific instance snapshot.
     * </p>
     * 
     * @param getInstanceSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceSnapshot operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceSnapshot
     */
    java.util.concurrent.Future<GetInstanceSnapshotResult> getInstanceSnapshotAsync(GetInstanceSnapshotRequest getInstanceSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotRequest, GetInstanceSnapshotResult> asyncHandler);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @return A Java Future containing the result of the GetInstanceSnapshots operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceSnapshots
     */
    java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest);

    /**
     * <p>
     * Returns all instance snapshots for the user's account.
     * </p>
     * 
     * @param getInstanceSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceSnapshots operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceSnapshots
     */
    java.util.concurrent.Future<GetInstanceSnapshotsResult> getInstanceSnapshotsAsync(GetInstanceSnapshotsRequest getInstanceSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceSnapshotsRequest, GetInstanceSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @return A Java Future containing the result of the GetInstanceState operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstanceState
     */
    java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest getInstanceStateRequest);

    /**
     * <p>
     * Returns the state of a specific instance. Works on one instance at a time.
     * </p>
     * 
     * @param getInstanceStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceState operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstanceState
     */
    java.util.concurrent.Future<GetInstanceStateResult> getInstanceStateAsync(GetInstanceStateRequest getInstanceStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceStateRequest, GetInstanceStateResult> asyncHandler);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @return A Java Future containing the result of the GetInstances operation returned by the service.
     * @sample AmazonLightsailAsync.GetInstances
     */
    java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest getInstancesRequest);

    /**
     * <p>
     * Returns information about all Amazon Lightsail virtual private servers, or <i>instances</i>.
     * </p>
     * 
     * @param getInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstances operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetInstances
     */
    java.util.concurrent.Future<GetInstancesResult> getInstancesAsync(GetInstancesRequest getInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstancesRequest, GetInstancesResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @return A Java Future containing the result of the GetKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.GetKeyPair
     */
    java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest getKeyPairRequest);

    /**
     * <p>
     * Returns information about a specific key pair.
     * </p>
     * 
     * @param getKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetKeyPair
     */
    java.util.concurrent.Future<GetKeyPairResult> getKeyPairAsync(GetKeyPairRequest getKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairRequest, GetKeyPairResult> asyncHandler);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @return A Java Future containing the result of the GetKeyPairs operation returned by the service.
     * @sample AmazonLightsailAsync.GetKeyPairs
     */
    java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest getKeyPairsRequest);

    /**
     * <p>
     * Returns information about all key pairs in the user's account.
     * </p>
     * 
     * @param getKeyPairsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetKeyPairs operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetKeyPairs
     */
    java.util.concurrent.Future<GetKeyPairsResult> getKeyPairsAsync(GetKeyPairsRequest getKeyPairsRequest,
            com.amazonaws.handlers.AsyncHandler<GetKeyPairsRequest, GetKeyPairsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperation
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest);

    /**
     * <p>
     * Returns information about a specific operation. Operations include events such as when you create an instance,
     * allocate a static IP, attach a static IP, and so on.
     * </p>
     * 
     * @param getOperationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperation operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperation
     */
    java.util.concurrent.Future<GetOperationResult> getOperationAsync(GetOperationRequest getOperationRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationRequest, GetOperationResult> asyncHandler);

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @return A Java Future containing the result of the GetOperations operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperations
     */
    java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest getOperationsRequest);

    /**
     * <p>
     * Returns information about all operations.
     * </p>
     * <p>
     * Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
     * subsequent call to <code>GetOperations</code> use the maximum (last) <code>statusChangedAt</code> value from the
     * previous request.
     * </p>
     * 
     * @param getOperationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperations operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperations
     */
    java.util.concurrent.Future<GetOperationsResult> getOperationsAsync(GetOperationsRequest getOperationsRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationsRequest, GetOperationsResult> asyncHandler);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @return A Java Future containing the result of the GetOperationsForResource operation returned by the service.
     * @sample AmazonLightsailAsync.GetOperationsForResource
     */
    java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest getOperationsForResourceRequest);

    /**
     * <p>
     * Gets operations for a specific resource (e.g., an instance or a static IP).
     * </p>
     * 
     * @param getOperationsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOperationsForResource operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetOperationsForResource
     */
    java.util.concurrent.Future<GetOperationsForResourceResult> getOperationsForResourceAsync(GetOperationsForResourceRequest getOperationsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetOperationsForResourceRequest, GetOperationsForResourceResult> asyncHandler);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail.
     * </p>
     * 
     * @param getRegionsRequest
     * @return A Java Future containing the result of the GetRegions operation returned by the service.
     * @sample AmazonLightsailAsync.GetRegions
     */
    java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest getRegionsRequest);

    /**
     * <p>
     * Returns a list of all valid regions for Amazon Lightsail.
     * </p>
     * 
     * @param getRegionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegions operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetRegions
     */
    java.util.concurrent.Future<GetRegionsResult> getRegionsAsync(GetRegionsRequest getRegionsRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegionsRequest, GetRegionsResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @return A Java Future containing the result of the GetStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.GetStaticIp
     */
    java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest getStaticIpRequest);

    /**
     * <p>
     * Returns information about a specific static IP.
     * </p>
     * 
     * @param getStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetStaticIp
     */
    java.util.concurrent.Future<GetStaticIpResult> getStaticIpAsync(GetStaticIpRequest getStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpRequest, GetStaticIpResult> asyncHandler);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @return A Java Future containing the result of the GetStaticIps operation returned by the service.
     * @sample AmazonLightsailAsync.GetStaticIps
     */
    java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest getStaticIpsRequest);

    /**
     * <p>
     * Returns information about all static IPs in the user's account.
     * </p>
     * 
     * @param getStaticIpsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStaticIps operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.GetStaticIps
     */
    java.util.concurrent.Future<GetStaticIpsResult> getStaticIpsAsync(GetStaticIpsRequest getStaticIpsRequest,
            com.amazonaws.handlers.AsyncHandler<GetStaticIpsRequest, GetStaticIpsResult> asyncHandler);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonLightsailAsync.ImportKeyPair
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest);

    /**
     * <p>
     * Imports a public SSH key from a specific key pair.
     * </p>
     * 
     * @param importKeyPairRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportKeyPair operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ImportKeyPair
     */
    java.util.concurrent.Future<ImportKeyPairResult> importKeyPairAsync(ImportKeyPairRequest importKeyPairRequest,
            com.amazonaws.handlers.AsyncHandler<ImportKeyPairRequest, ImportKeyPairResult> asyncHandler);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @return A Java Future containing the result of the IsVpcPeered operation returned by the service.
     * @sample AmazonLightsailAsync.IsVpcPeered
     */
    java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest isVpcPeeredRequest);

    /**
     * <p>
     * Returns a Boolean value indicating whether your Lightsail VPC is peered.
     * </p>
     * 
     * @param isVpcPeeredRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the IsVpcPeered operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.IsVpcPeered
     */
    java.util.concurrent.Future<IsVpcPeeredResult> isVpcPeeredAsync(IsVpcPeeredRequest isVpcPeeredRequest,
            com.amazonaws.handlers.AsyncHandler<IsVpcPeeredRequest, IsVpcPeeredResult> asyncHandler);

    /**
     * <p>
     * Adds public ports to an Amazon Lightsail instance.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @return A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsync.OpenInstancePublicPorts
     */
    java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest openInstancePublicPortsRequest);

    /**
     * <p>
     * Adds public ports to an Amazon Lightsail instance.
     * </p>
     * 
     * @param openInstancePublicPortsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.OpenInstancePublicPorts
     */
    java.util.concurrent.Future<OpenInstancePublicPortsResult> openInstancePublicPortsAsync(OpenInstancePublicPortsRequest openInstancePublicPortsRequest,
            com.amazonaws.handlers.AsyncHandler<OpenInstancePublicPortsRequest, OpenInstancePublicPortsResult> asyncHandler);

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @return A Java Future containing the result of the PeerVpc operation returned by the service.
     * @sample AmazonLightsailAsync.PeerVpc
     */
    java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest peerVpcRequest);

    /**
     * <p>
     * Tries to peer the Lightsail VPC with the user's default VPC.
     * </p>
     * 
     * @param peerVpcRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PeerVpc operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.PeerVpc
     */
    java.util.concurrent.Future<PeerVpcResult> peerVpcAsync(PeerVpcRequest peerVpcRequest,
            com.amazonaws.handlers.AsyncHandler<PeerVpcRequest, PeerVpcResult> asyncHandler);

    /**
     * <p>
     * Restarts a specific instance. When your Amazon Lightsail instance is finished rebooting, Lightsail assigns a new
     * public IP address. To use the same IP address after restarting, create a static IP address and attach it to the
     * instance.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AmazonLightsailAsync.RebootInstance
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest);

    /**
     * <p>
     * Restarts a specific instance. When your Amazon Lightsail instance is finished rebooting, Lightsail assigns a new
     * public IP address. To use the same IP address after restarting, create a static IP address and attach it to the
     * instance.
     * </p>
     * 
     * @param rebootInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RebootInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.RebootInstance
     */
    java.util.concurrent.Future<RebootInstanceResult> rebootInstanceAsync(RebootInstanceRequest rebootInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<RebootInstanceRequest, RebootInstanceResult> asyncHandler);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @return A Java Future containing the result of the ReleaseStaticIp operation returned by the service.
     * @sample AmazonLightsailAsync.ReleaseStaticIp
     */
    java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest releaseStaticIpRequest);

    /**
     * <p>
     * Deletes a specific static IP from your account.
     * </p>
     * 
     * @param releaseStaticIpRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReleaseStaticIp operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.ReleaseStaticIp
     */
    java.util.concurrent.Future<ReleaseStaticIpResult> releaseStaticIpAsync(ReleaseStaticIpRequest releaseStaticIpRequest,
            com.amazonaws.handlers.AsyncHandler<ReleaseStaticIpRequest, ReleaseStaticIpResult> asyncHandler);

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance
     * operation.
     * </p>
     * 
     * @param startInstanceRequest
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AmazonLightsailAsync.StartInstance
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest);

    /**
     * <p>
     * Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the reboot instance
     * operation.
     * </p>
     * 
     * @param startInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StartInstance
     */
    java.util.concurrent.Future<StartInstanceResult> startInstanceAsync(StartInstanceRequest startInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StartInstanceRequest, StartInstanceResult> asyncHandler);

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * 
     * @param stopInstanceRequest
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AmazonLightsailAsync.StopInstance
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest);

    /**
     * <p>
     * Stops a specific Amazon Lightsail instance that is currently running.
     * </p>
     * 
     * @param stopInstanceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopInstance operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.StopInstance
     */
    java.util.concurrent.Future<StopInstanceResult> stopInstanceAsync(StopInstanceRequest stopInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<StopInstanceRequest, StopInstanceResult> asyncHandler);

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @return A Java Future containing the result of the UnpeerVpc operation returned by the service.
     * @sample AmazonLightsailAsync.UnpeerVpc
     */
    java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest unpeerVpcRequest);

    /**
     * <p>
     * Attempts to unpeer the Lightsail VPC from the user's default VPC.
     * </p>
     * 
     * @param unpeerVpcRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnpeerVpc operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UnpeerVpc
     */
    java.util.concurrent.Future<UnpeerVpcResult> unpeerVpcAsync(UnpeerVpcRequest unpeerVpcRequest,
            com.amazonaws.handlers.AsyncHandler<UnpeerVpcRequest, UnpeerVpcResult> asyncHandler);

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @return A Java Future containing the result of the UpdateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsync.UpdateDomainEntry
     */
    java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest updateDomainEntryRequest);

    /**
     * <p>
     * Updates a domain recordset after it is created.
     * </p>
     * 
     * @param updateDomainEntryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDomainEntry operation returned by the service.
     * @sample AmazonLightsailAsyncHandler.UpdateDomainEntry
     */
    java.util.concurrent.Future<UpdateDomainEntryResult> updateDomainEntryAsync(UpdateDomainEntryRequest updateDomainEntryRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDomainEntryRequest, UpdateDomainEntryResult> asyncHandler);

}
